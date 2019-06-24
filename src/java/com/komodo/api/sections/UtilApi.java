package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class UtilApi {

	public OutputModel createMultiSig(Configurations config, int numberRequired, List<String> keys) {
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_MULTI_SIG, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel createMultiSig(Configurations config, int numberRequired, List<String> keys, String key) {
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_MULTI_SIG, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel decodeCcOpert(Configurations config, String scriptPubKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_CC_OPERET, "\""+scriptPubKey+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel estimateFee(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_FEE, ""+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel estimatePriority(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_PRIORITY, ""+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel invalidateBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.INVALIDATE_BLOCK, "\""+hash+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel reconsiderBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.RECONSIDER_BLOCK, "\""+hash+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel txNotarizedConfirmed(Configurations config, String txId) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.TX_NOTORIZED_CONFIRMED, "\""+txId+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel validateAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VALIDATE_ADDRESS, "\""+address+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel verifyMessage(Configurations config, String address, String signature, String message) {
		StringBuilder params = new StringBuilder("\"");
		params.append(address);
		params.append("\",\"");
		params.append(signature);
		params.append("\",\"");
		params.append(message);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_MESSAGE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zValidateAddress(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_VALIDATE_ADDRESS, "\""+zAddress+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
}
