package com.komodo.api.sections;

import java.util.List;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class UtilApi {

	public String createMultiSig(Configurations config, int numberRequired, List<String> keys) {
		StringBuilder params = new StringBuilder(numberRequired);
		params.append(",[");
		for(int i = 0; i < keys.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(keys.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, StringConstants.CREATE_MULTI_SIG, params.toString());
		return output;
	}
	
	public String createMultiSig(Configurations config, int numberRequired, List<String> keys, String key) {
		StringBuilder params = new StringBuilder(numberRequired);
		params.append(",[");
		for(int i = 0; i < keys.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(keys.get(i));
			params.append("\"");
		}
		params.append("]");
		params.append(",\"");
		params.append(key);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.CREATE_MULTI_SIG, params.toString());
		return output;
	}

	public String decodeCcOpert(Configurations config, String scriptPubKey) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.DECODE_CC_OPERET, "\""+scriptPubKey+"\"");
		return output;
	}

	public String estimateFee(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.ESTIMATE_FEE, ""+nBlocks);
		return output;
	}

	public String estimatePriority(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.ESTIMATE_PRIORITY, ""+nBlocks);
		return output;
	}

	public String invalidateBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.INVALIDATE_BLOCK, "\""+hash+"\"");
		return output;
	}

	public String reconsiderBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.RECONSIDER_BLOCK, "\""+hash+"\"");
		return output;
	}

	public String txNotarizedConfirmed(Configurations config, String txId) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.TX_NOTORIZED_CONFIRMED, "\""+txId+"\"");
		return output;
	}

	public String validateAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.VALIDATE_ADDRESS, "\""+address+"\"");
		return output;
	}

	public String verifyMessage(Configurations config, String address, String signature, String message) {
		StringBuilder params = new StringBuilder("\"");
		params.append(address);
		params.append("\",\"");
		params.append(signature);
		params.append("\",\"");
		params.append(message);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.VERIFY_MESSAGE, params.toString());
		return output;
	}

	public String zValidateAddress(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.Z_VALIDATE_ADDRESS, "\""+zAddress+"\"");
		return output;
	}
	
}
