package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.CreateMultiSigOutputModel;
import com.komodo.api.models.DecodeCCOpretOutputModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.ValidateAddressOutputModel;
import com.komodo.api.models.ZValidateAddressOutputModel;
import com.komodo.api.utils.KomodoUtil;

public class UtilApi {

	public CreateMultiSigOutputModel createMultiSig(Configurations config, int numberRequired, List<String> keys) {
		StringBuilder params = new StringBuilder(numberRequired);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < keys.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(keys.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_MULTI_SIG, params.toString());
		CreateMultiSigOutputModel outputModel = new Gson().fromJson(output, CreateMultiSigOutputModel.class);
		return outputModel;
	}
	
	public CreateMultiSigOutputModel createMultiSig(Configurations config, int numberRequired, List<String> keys, String key) {
		StringBuilder params = new StringBuilder(numberRequired);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < keys.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(keys.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(key);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_MULTI_SIG, params.toString());
		CreateMultiSigOutputModel outputModel = new Gson().fromJson(output, CreateMultiSigOutputModel.class);
		return outputModel;
	}

	public DecodeCCOpretOutputModel decodeCcOpert(Configurations config, String scriptPubKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_CC_OPERET, StringConstants.DOUBLE_QUOTE+scriptPubKey+StringConstants.DOUBLE_QUOTE);
		DecodeCCOpretOutputModel outputModel = new Gson().fromJson(output, DecodeCCOpretOutputModel.class);
		return outputModel;
	}

	public OutputModel estimateFee(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_FEE, StringConstants.BLANK+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel estimatePriority(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_PRIORITY, StringConstants.BLANK+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel invalidateBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.INVALIDATE_BLOCK, StringConstants.DOUBLE_QUOTE+hash+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel reconsiderBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.RECONSIDER_BLOCK, StringConstants.DOUBLE_QUOTE+hash+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel txNotarizedConfirmed(Configurations config, String txId) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.TX_NOTORIZED_CONFIRMED, StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public ValidateAddressOutputModel validateAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VALIDATE_ADDRESS, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		ValidateAddressOutputModel outputModel = new Gson().fromJson(output, ValidateAddressOutputModel.class);
		return outputModel;
	}

	public OutputModel verifyMessage(Configurations config, String address, String signature, String message) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(signature);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(message);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_MESSAGE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public ZValidateAddressOutputModel zValidateAddress(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_VALIDATE_ADDRESS, StringConstants.DOUBLE_QUOTE+zAddress+StringConstants.DOUBLE_QUOTE);
		ZValidateAddressOutputModel outputModel = new Gson().fromJson(output, ZValidateAddressOutputModel.class);
		return outputModel;
	}
	
}
