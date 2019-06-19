package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class RawTransactionsApi {
	public String createRawTransaction(Configurations config, String txId, int vout, String address, int value) {
		StringBuilder params = new StringBuilder("[{\"txid\":\"");
		params.append(txId);
		params.append("\",\"vout\":");
		params.append(vout);
		params.append("}],{\"");
		params.append(address);
		params.append("\":");
		params.append(value);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.CREATE_RAW_TRANSACTION, params.toString());
		return output;
	}
	
	public String decodeRawTransaction(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.DECODE_RAW_TRANSACTION, "\""+hex+"\"");
		return output;
	}
	
	public String decodeScript(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.DECODE_SCRIPT, "\""+hex+"\"");
		return output;
	}
	
	public String fundRawTransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.FUND_RAW_TRANSACTION, "\""+hexString+"\"");
		return output;
	}
	
	public String getRawTransaction(Configurations config, String txId, int verbose) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_RAW_TRANSACTION, "\""+txId+"\","+verbose);
		return output;
	}
	
	public String sendrawtransction(Configurations config, String hexString, boolean allowHighFees) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SEND_RAW_TRANSASCTION, "\""+hexString+"\","+allowHighFees);
		return output;
	}
	
	public String signrawtransaction(Configurations config, String hexString) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SIGN_RAW_TRANSACTION, "\""+hexString+"\"");
		return output;
	}
}
