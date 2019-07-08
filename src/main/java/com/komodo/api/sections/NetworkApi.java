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

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class NetworkApi {
	
	/**
	 * addnode "node" "add|remove|onetry"
	 * The addnode method attempts to add or remove a node from the addnode list, 
	 * or to make a single attempt to connect to a node
	 * @param config
	 * @param node
	 * @param command
	 * @return OutputModel
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
	
	/**
	 * clearbanned
	 * The clearbanned method clears all banned IPs.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel clearBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CLEAR_BANNED, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * disconnectnode "node"
	 * The disconnectnode method instructs the daemon to immediately disconnect from the specified node.
	 * Use getpeerinfo to determine the result
	 * @param config
	 * @param node
	 * @return OutputModel
	 */
	public OutputModel disconnectNode(Configurations config, String node) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DISCONNECT_NODE, StringConstants.DOUBLE_QUOTE+node+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getaddednodeinfo dns ( "node" )
	 * The getaddednodeinfo method returns information about the given added node, or all added nodes.
	 * If dns is set to false, only a list of added nodes is returned. Otherwise, connection information is also provided.
	 * @param config
	 * @param dns
	 * @return AddedNodeInfoOutputModel
	 */
	public AddedNodeInfoOutputModel getAddedNodeInfo(Configurations config, boolean dns) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDED_NODE_INFO, StringConstants.BLANK+dns);
		AddedNodeInfoOutputModel outputModel = new Gson().fromJson(output, AddedNodeInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getaddednodeinfo dns ( "node" )
	 * The getaddednodeinfo method returns information about the given added node, or all added nodes.
	 * If dns is set to false, only a list of added nodes is returned. Otherwise, connection information is also provided.
	 * @param config
	 * @param dns
	 * @param node
	 * @return AddedNodeInfoOutputModel
	 */
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
	
	/**
	 * getconnectioncount
	 * The getconnectioncount method returns the number of connections to other nodes
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getConnectionCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CONNECTION_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getdeprecationinfo
	 * The getdeprecationinfo method returns an object containing current version and deprecation block height.
	 * @param config
	 * @return DeprecationInfoOutputModel
	 */
	public DeprecationInfoOutputModel getDeprecationInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DEPRECATION_INFO, null);
		DeprecationInfoOutputModel outputModel = new Gson().fromJson(output, DeprecationInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getnettotals
	 * The getnettotals method returns information about network traffic, including bytes in, bytes out, and current time
	 * @param config
	 * @return NetTotalsOutputModel
	 */
	public NetTotalsOutputModel getNetTotals(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NET_TOTALS, null);
		NetTotalsOutputModel outputModel = new Gson().fromJson(output, NetTotalsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getnetworkinfo
	 * The getnetworkinfo method returns an object containing various state info regarding p2p networking
	 * @param config
	 * @return NetworInfoOutputModel
	 */
	public NetworInfoOutputModel getNetworkInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_INFO, null);
		NetworInfoOutputModel outputModel = new Gson().fromJson(output, NetworInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getpeerinfo
	 * The getpeerinfo method returns data about each connected network node as a json array of objects
	 * @param config
	 * @return NetworInfoOutputModel
	 */
	public PeerInfoOutputModel getPeerInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_PEER_INFO, null);
		PeerInfoOutputModel outputModel = new Gson().fromJson(output, PeerInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * listbanned
	 * The listbanned method lists all banned IP addresses and subnets
	 * @param config
	 * @return ListBannedOutputModel
	 */
	public ListBannedOutputModel listBanned(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_BANNED, null);
		ListBannedOutputModel outputModel = new Gson().fromJson(output, ListBannedOutputModel.class);
		return outputModel;
	}
	
	/**
	 * ping
	 * The ping method requests that a ping be sent to all other nodes, to measure ping time.
	 * Results provided in getpeerinfo, pingtime and pingwait fields are decimal seconds.
	 * The ping command is handled in queue with all other commands, so it measures processing backlog, not just network ping.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel ping(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PING, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * setban "ip(/netmask)" "add|remove" (bantime) (absolute)
	 * The setban method attempts to add or remove an IP address (and subnet, if indicated) from the banned list.
	 * @param config
	 * @param ip
	 * @param command
	 * @return OutputModel
	 */
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
	
	/**
	 * setban "ip(/netmask)" "add|remove" (bantime) (absolute)
	 * The setban method attempts to add or remove an IP address (and subnet, if indicated) from the banned list.
	 * @param config
	 * @param ip
	 * @param command
	 * @param banTime
	 * @return OutputModel
	 */
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
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
