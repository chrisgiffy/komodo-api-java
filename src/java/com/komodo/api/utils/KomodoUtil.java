package com.komodo.api.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

import com.komodo.api.models.Configurations;

public class KomodoUtil {
	
	public static String fireKomodo(Configurations config, String tx, String params) {

		StringBuilder output = new StringBuilder("");
		try {
			URL url = new URL("http://"+config.getIp()+":"+config.getPort()+"/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			String encoding = Base64.getEncoder().encodeToString((config.getUsername()+":"+config.getPassword()).getBytes());
			conn.setRequestProperty("Authorization", "Basic "+encoding);

			StringBuilder input = new StringBuilder("");
			input.append("{\"jsonrpc\": \"1.0\", \"id\":\""+config.getId()+"\", \"method\": \""+tx+"\", \"params\": [");
			if(params != null && !"".equals(params)) {
				input.append(params);
			}
			input.append("] }");

			OutputStream os = conn.getOutputStream();
			os.write(input.toString().getBytes());
			os.flush();

			if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
				return "Failed : Please enter proper parameters";
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));


			String temp;
			System.out.println("Output from Server .... \n");
			while ((temp = br.readLine()) != null) {
				output.append(temp);
				System.out.println(temp);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return output.toString();
	}
}

