package com.komodo.api.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.sections.AddressApi;

public class AddressTest {

	@Test
	
	public void testGetAddressBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi addressApi = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		String output = addressApi.getAddressBalance(config, addresses);
		System.out.println(output);
		assertEquals("", output);
	}
}
