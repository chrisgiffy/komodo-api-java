package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.network.AddedNodeInfoOutputModel;
import com.komodo.api.models.network.DeprecationInfoOutputModel;
import com.komodo.api.models.network.ListBannedOutputModel;
import com.komodo.api.models.network.NetTotalsOutputModel;
import com.komodo.api.models.network.NetworInfoOutputModel;
import com.komodo.api.models.network.PeerInfoOutputModel;
import com.komodo.api.utils.KomodoUtil;

public class NetworkApi {
	
	/**
	 * addnode "node" "add|remove|onetry"
	 * The addnode method attempts to add or remove a node from the addnode list, 
	 * or to make a single attempt to connect to a node
	 * @param config
	 * @param node
	 * @param command
	 * @return
	 */
	public OutputModel addNode(Configurations config, String node, String command) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(node);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(command);
		params.append(StringConstants.DOUBLE_QUOTE);
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DISCONNECT_NODE, StringConstants.DOUBLE_QUOTE+node+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public AddedNodeInfoOutputModel getAddedNodeInfo(Configurations config, boolean dns) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDED_NODE_INFO, StringConstants.BLANK+dns);
		AddedNodeInfoOutputModel outputModel = new Gson().fromJson(output, AddedNodeInfoOutputModel.class);
		return outputModel;
	}
	
	public AddedNodeInfoOutputModel getAddedNodeInfo(Configurations config, boolean dns, String node) {
		StringBuilder params = new StringBuilder();
		params.append(dns);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(node);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDED_NODE_INFO, params.toString());
		AddedNodeInfoOutputModel outputModel = new Gson().fromJson(output, AddedNodeInfoOutputModel.class);
		return outputModel;
	}
	
	public OutputModel getConnectionCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CONNECTION_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public DeprecationInfoOutputModel getDeprecationInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DEPRECATION_INFO, null);
		DeprecationInfoOutputModel outputModel = new Gson().fromJson(output, DeprecationInfoOutputModel.class);
		return outputModel;
	}
	
	public NetTotalsOutputModel getNetTotals(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NET_TOTALS, null);
		NetTotalsOutputModel outputModel = new Gson().fromJson(output, NetTotalsOutputModel.class);
		return outputModel;
	}
	
	public NetworInfoOutputModel getNetworkInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_INFO, null);
		NetworInfoOutputModel outputModel = new Gson().fromJson(output, NetworInfoOutputModel.class);
		return outputModel;
	}
	
	public PeerInfoOutputModel getPeerInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_PEER_INFO, null);
		PeerInfoOutputModel outputModel = new Gson().fromJson(output, PeerInfoOutputModel.class);
		return outputModel;
	}
	
	public ListBannedOutputModel listBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_BANNED, null);
		ListBannedOutputModel outputModel = new Gson().fromJson(output, ListBannedOutputModel.class);
		return outputModel;
	}
	
	public OutputModel ping(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PING, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel setBan(Configurations config, String ip, String command) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(ip);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(command);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_BAN, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel setBan(Configurations config, String ip, String command, int banTime) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(ip);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(command);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(banTime);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_BAN, params.toString());
		System.out.println(output);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
