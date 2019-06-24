package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.ListDeltasOutputModel;
import com.komodo.api.models.ListResultOutModel;
import com.komodo.api.models.DeltasOutputWithStartEnd;
import com.komodo.api.models.AddressMempoolOutModel;
import com.komodo.api.models.AddressUtxosChainInfoOutModel;
import com.komodo.api.models.AddressUtxosOutModel;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.GetAddressBalanceOutputModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.SnapshotOutputModel;
import com.komodo.api.utils.KomodoUtil;

public class AddressApi {

	/**
	 * getaddressbalance '{ "addresses" : [ "address" , ... ] }'
	 * The getaddressbalance method returns the confirmed balance for an address, or addresses. 
	 * It requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @return GetAddressBalanceOutputModel
	 */
	public GetAddressBalanceOutputModel getAddressBalance(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_BALANCE, params.toString());
		GetAddressBalanceOutputModel outputModel = new Gson().fromJson(output, GetAddressBalanceOutputModel.class);
		return outputModel;
	}

	/**
	 * getaddressdeltas '{ "addresses" : [ "address" , ... ] }'
	 * getaddressdeltas '{ "addresses" : [ "address" , ... ] , "start": start, "end": end, "chainInfo": boolean }'
	 * The getaddressdeltas method returns all confirmed balance changes of an address. 
	 * The user can optionally limit the response to a given interval of blocks. 
	 * The method requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @return ListDeltasOutputModel
	 */
	public ListDeltasOutputModel getAddressDeltas(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_DELTAS, params.toString());
		ListDeltasOutputModel outputModel = new Gson().fromJson(output, ListDeltasOutputModel.class);
		return outputModel;
	}

	/**
	 * getaddressdeltas '{ "addresses" : [ "address" , ... ] }'
	 * getaddressdeltas '{ "addresses" : [ "address" , ... ] , "start": start, "end": end, "chainInfo": boolean }'
	 * The getaddressdeltas method returns all confirmed balance changes of an address. 
	 * The user can optionally limit the response to a given interval of blocks. 
	 * The method requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @param start
	 * @param end
	 * @param chainInfo
	 * @return DeltasOutputWithStartEnd
	 */
	public DeltasOutputWithStartEnd getAddressDeltas(Configurations config, List<String> addresses, int start, int end, boolean chainInfo) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.START);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(start);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.END);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(end);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CHAIN_INFO);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(chainInfo);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_DELTAS, params.toString());
		DeltasOutputWithStartEnd outputModel = new Gson().fromJson(output, DeltasOutputWithStartEnd.class);
		return outputModel;
	}

	/**
	 * getaddressmempool '{ "addresses" : [ "address" , ... ] }'
	 * The getaddressmempool method returns all mempool deltas for an address, or addresses. 
	 * It requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @return AddressMempoolOutModel
	 */
	public AddressMempoolOutModel getAddressMemPool(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_MEMPOOL, params.toString());
		AddressMempoolOutModel outputModel = new Gson().fromJson(output, AddressMempoolOutModel.class);
		return outputModel;
	}

	/**
	 * getaddresstxids '{ "addresses" : [ "address" , ... ] }'
	 * The getaddresstxids method returns the txids for an address, or addresses. 
	 * It requires addressindex to be enabled.
	 * @param config
	 * @param addresses
	 * @param start
	 * @param end
	 * @return ListResultOutModel
	 */
	public ListResultOutModel getAddressTxIds(Configurations config, List<String> addresses, int start, int end) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.START);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(start);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.END);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(end);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_TXIDS, params.toString());
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}

	/**
	 * getaddresstxids '{ "addresses" : [ "address" , ... ] }'
	 * The getaddresstxids method returns the txids for an address, or addresses. 
	 * It requires addressindex to be enabled.
	 * @param config
	 * @param addresses
	 * @return ListResultOutModel
	 */
	public ListResultOutModel getAddressTxIds(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_TXIDS, params.toString());
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}

	/**
	 * getaddressutxos '{ "addresses" : [ "address" , ... ], "chaininfo" }'
	 * The getaddressutxos method returns all unspent outputs for an address. 
	 * It requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @return AddressUtxosOutModel
	 */
	public AddressUtxosOutModel getAddressUtxosChainInfoFalse(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CHAIN_INFO);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(false);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_UTXOS, params.toString());
		AddressUtxosOutModel outputModel = new Gson().fromJson(output, AddressUtxosOutModel.class);
		return outputModel;
	}
	
	/**
	 * getaddressutxos '{ "addresses" : [ "address" , ... ], "chaininfo" }'
	 * The getaddressutxos method returns all unspent outputs for an address. 
	 * It requires addressindex to be enabled
	 * @param config
	 * @param addresses
	 * @return AddressUtxosChainInfoOutModel
	 */
	public AddressUtxosChainInfoOutModel getAddressUtxosChainInfoTrue(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.ADDRESSES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(add);
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CHAIN_INFO);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(true);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESS_UTXOS, params.toString());
		AddressUtxosChainInfoOutModel outputModel = new Gson().fromJson(output, AddressUtxosChainInfoOutModel.class);
		return outputModel;
	}

	/**
	 * The getsnapshot method returns a snapshot of addresses and their amounts at the asset chain's current height.
	 * The method requires addressindex to be enabled
	 * @param config
	 * @param top
	 * @return SnapshotOutputModel
	 */
	public SnapshotOutputModel getSnapshot(Configurations config, int top) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_SNAPSHOT, StringConstants.DOUBLE_QUOTE+top+StringConstants.DOUBLE_QUOTE);
		SnapshotOutputModel outputModel = new Gson().fromJson(output, SnapshotOutputModel.class);
		return outputModel;
	}
}
