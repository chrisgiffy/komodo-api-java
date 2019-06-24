package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class NetworkApi {
	public OutputModel addNode(Configurations config, String node, String command) {
		StringBuilder params = new StringBuilder("\"");
		params.append(node);
		params.append("\",\"");
		params.append(command);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ADD_NODE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel clearBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CLEAR_BANNED, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel disconnectNode(Configurations config, String node) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DISCONNECT_NODE, "\""+node+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getAddedNodeInfo(Configurations config, boolean dns) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDED_NODE_INFO, ""+dns);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getAddedNodeInfo(Configurations config, boolean dns, String node) {
		StringBuilder params = new StringBuilder("");
		params.append(dns);
		params.append(",\"");
		params.append(node);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDED_NODE_INFO, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getConnectionCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CONNECTION_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getDeprecationInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DEPRECATION_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getNetTotals(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NET_TOTALS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getNetworkInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getPeerInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_PEER_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel listBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_BANNED, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel ping(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PING, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel setBan(Configurations config, String ip, String command) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_BAN, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	public OutputModel setBan(Configurations config, String ip, String command, int banTime) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\",");
		params.append(banTime);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_BAN, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel setBan(Configurations config, String ip, String command, int banTime, boolean absolute) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\",");
		params.append(banTime);
		params.append(",");
		params.append(absolute);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_BAN, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
