package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class RawTransactionsApi {
	public OutputModel createRawTransaction(Configurations config, String txId, int vout, String address, int value) {
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
	
	public OutputModel decodeRawTransaction(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hex+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel decodeScript(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_SCRIPT, StringConstants.DOUBLE_QUOTE+hex+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel fundRawTransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.FUND_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hexString+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getRawTransaction(Configurations config, String txId, int verbose) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+verbose);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel sendrawtransction(Configurations config, String hexString, boolean allowHighFees) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_RAW_TRANSASCTION, StringConstants.DOUBLE_QUOTE+hexString+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+allowHighFees);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel signrawtransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SIGN_RAW_TRANSACTION, StringConstants.DOUBLE_QUOTE+hexString+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
