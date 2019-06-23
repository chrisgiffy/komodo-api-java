package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class NetworkApi {
	public String addNode(Configurations config, String node, String command) {
		StringBuilder params = new StringBuilder("\"");
		params.append(node);
		params.append("\",\"");
		params.append(command);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.ADD_NODE, params.toString());
		return output;
	}
	
	public String clearBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.CLEAR_BANNED, null);
		return output;
	}
	
	public String disconnectNode(Configurations config, String node) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.DISCONNECT_NODE, "\""+node+"\"");
		return output;
	}
	
	public String getAddedNodeInfo(Configurations config, boolean dns) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDED_NODE_INFO, ""+dns);
		return output;
	}
	
	public String getAddedNodeInfo(Configurations config, boolean dns, String node) {
		StringBuilder params = new StringBuilder("");
		params.append(dns);
		params.append(",\"");
		params.append(node);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDED_NODE_INFO, params.toString());
		return output;
	}
	
	public String getConnectionCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_CONNECTION_COUNT, null);
		return output;
	}
	
	public String getDeprecationInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_DEPRECATION_INFO, null);
		return output;
	}
	
	public String getNetTotals(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NET_TOTALS, null);
		return output;
	}
	
	public String getNetworkInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_INFO, null);
		return output;
	}
	
	public String getPeerInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_PEER_INFO, null);
		return output;
	}
	
	public String listBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.LIST_BANNED, null);
		return output;
	}
	
	public String ping(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.PING, null);
		return output;
	}
	
	public String setBan(Configurations config, String ip, String command) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.SET_BAN, params.toString());
		return output;
	}
	public String setBan(Configurations config, String ip, String command, int banTime) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\",");
		params.append(banTime);
		String output = KomodoUtil.fireKomodo(config, StringConstants.SET_BAN, params.toString());
		return output;
	}
	
	public String setBan(Configurations config, String ip, String command, int banTime, boolean absolute) {
		StringBuilder params = new StringBuilder("\"");
		params.append(ip);
		params.append("\",\"");
		params.append(command);
		params.append("\",");
		params.append(banTime);
		params.append(",");
		params.append(absolute);
		String output = KomodoUtil.fireKomodo(config, StringConstants.SET_BAN, params.toString());
		return output;
	}
}
