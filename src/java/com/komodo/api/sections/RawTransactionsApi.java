package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class RawTransactionsApi {
	public OutputModel createRawTransaction(Configurations config, String txId, int vout, String address, int value) {
		StringBuilder params = new StringBuilder("[{\"txid\":\"");
		params.append(txId);
		params.append("\",\"vout\":");
		params.append(vout);
		params.append("}],{\"");
		params.append(address);
		params.append("\":");
		params.append(value);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_RAW_TRANSACTION, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel decodeRawTransaction(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_RAW_TRANSACTION, "\""+hex+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel decodeScript(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_SCRIPT, "\""+hex+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel fundRawTransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.FUND_RAW_TRANSACTION, "\""+hexString+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getRawTransaction(Configurations config, String txId, int verbose) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_TRANSACTION, "\""+txId+"\","+verbose);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel sendrawtransction(Configurations config, String hexString, boolean allowHighFees) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_RAW_TRANSASCTION, "\""+hexString+"\","+allowHighFees);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel signrawtransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SIGN_RAW_TRANSACTION, "\""+hexString+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
