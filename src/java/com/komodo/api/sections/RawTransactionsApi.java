package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.rawtransactions.DecodeRawTxOutputModel;
import com.komodo.api.models.rawtransactions.DecodeScriptOutputModel;
import com.komodo.api.models.rawtransactions.FundRawTxOutputModel;
import com.komodo.api.models.rawtransactions.RawTransactionOutputModel;
import com.komodo.api.models.rawtransactions.SignRawTxOutputModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class RawTransactionsApi {
	
	/**
	 * createrawtransaction '[{ "txid": "id_string", "vout": number }, ... ]' '{ "address": amount, ... }'
	 * The createrawtransaction method creates a transaction, spending the given inputs and sending to the given addresses. 
	 * The method returns a hex-encoded raw transaction.
	 * This is a raw transaction, and therefore the inputs are not signed and the transaction is not stored in the wallet nor transmitted to the network.
	 * @param config
	 * @param txId
	 * @param vout
	 * @param address
	 * @param value
	 * @return OutputModel
	 */
	public OutputModel createRawTransaction(Configurations config, String txId, int vout, String address, double value) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACKET);
		params.append(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.TXID);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.VOUT);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(vout);
		params.append(StringConstants.CLOSE_BRACE);
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(value);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_RAW_TRANSACTION, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * decoderawtransaction "hexstring"
	 * The decoderawtransaction method returns a json object representing the serialized, hex-encoded transaction
	 * @param config
	 * @param hex
	 * @return DecodeRawTxOutputModel
	 */
	public DecodeRawTxOutputModel decodeRawTransaction(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hex+StringConstants.DOUBLE_QUOTE);
		DecodeRawTxOutputModel outputModel = new Gson().fromJson(output, DecodeRawTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * decodescript "hex"
	 * The decodescript method decodes a hex-encoded script
	 * @param config
	 * @param hex
	 * @return DecodeScriptOutputModel
	 */
	public DecodeScriptOutputModel decodeScript(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_SCRIPT, StringConstants.DOUBLE_QUOTE+hex+StringConstants.DOUBLE_QUOTE);
		DecodeScriptOutputModel outputModel = new Gson().fromJson(output, DecodeScriptOutputModel.class);
		return outputModel;
	}
	
	/**
	 * fundrawtransaction "hexstring"
	 * The fundrawtransaction method adds inputs to a transaction until it has enough in value to meet its out value. 
	 * This will not modify existing inputs, and will add one change output to the outputs.
	 * Inputs which were signed may need to be resigned after completion since in/outputs have been added. 
	 * To sign the inputs added, use signrawtransaction.
	 * @param config
	 * @param hexString
	 * @return FundRawTxOutputModel
	 */
	public FundRawTxOutputModel fundRawTransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.FUND_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hexString+StringConstants.DOUBLE_QUOTE);
		FundRawTxOutputModel outputModel = new Gson().fromJson(output, FundRawTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getrawtransaction "transaction_id" ( verbose )
	 * The getrawtransaction method returns the raw transaction data.
	 * If verbose=0, the method returns a string that is serialized, hex-encoded data for transaction_id. 
	 * If verbose is non-zero, the method returns an object with information about transaction_id.
	 * This method relies on the txindex runtime parameter, which is enabled by default on all KMD-based chains. 
	 * Disabling txindex will cause this method to malfunction.
	 * @param config
	 * @param txId
	 * @return OutputModel
	 */
	public OutputModel getRawTransaction(Configurations config, String txId) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getrawtransaction "transaction_id" ( verbose )
	 * The getrawtransaction method returns the raw transaction data.
	 * If verbose=0, the method returns a string that is serialized, hex-encoded data for transaction_id. 
	 * If verbose is non-zero, the method returns an object with information about transaction_id.
	 * This method relies on the txindex runtime parameter, which is enabled by default on all KMD-based chains. 
	 * Disabling txindex will cause this method to malfunction.
	 * @param config
	 * @param txId
	 * @param verbose
	 * @return RawTransactionOutputModel
	 */
	public RawTransactionOutputModel getRawTransaction(Configurations config, String txId, int verbose) {
		if(verbose <= 0) {
			throw new IllegalArgumentException("verbose should be greater than 0");
		}
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_TRANSACTION, 
				StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+verbose);
		RawTransactionOutputModel outputModel = new Gson().fromJson(output, RawTransactionOutputModel.class);
		return outputModel;
	}
	
	/**
	 * sendrawtransaction "hexstring" ( allowhighfees )
	 * The sendrawtransction method submits raw transaction (serialized, hex-encoded) to local nodes and the network.
	 * @param config
	 * @param hexString
	 * @param allowHighFees
	 * @return OutputModel
	 */
	public OutputModel sendRawtransction(Configurations config, String hexString, boolean allowHighFees) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_RAW_TRANSASCTION, StringConstants.DOUBLE_QUOTE+hexString+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+allowHighFees);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * signrawtransaction "hexstring" ( [{ "txid": "id", "vout": n, "scriptPubKey": "hex", "redeemScript": "hex" }, ... ][ "privatekey1", ... ] sighashtype )
	 * The signrawtransaction method signs inputs for a raw transaction (serialized, hex-encoded). 
	 * The second optional argument (may be null) is an array of previous transaction outputs that this transaction depends on, 
	 * but may not yet be in the block chain. 
	 * The third optional argument (may be null) is an array of base58-encoded private keys that, 
	 * if given, will be the only keys used to sign the transaction.
	 * @param config
	 * @param hexString
	 * @return SignRawTxOutputModel
	 */
	public SignRawTxOutputModel signRawtransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SIGN_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hexString+StringConstants.DOUBLE_QUOTE);
		SignRawTxOutputModel outputModel = new Gson().fromJson(output, SignRawTxOutputModel.class);
		return outputModel;
	}
}
