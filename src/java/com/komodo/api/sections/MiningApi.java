package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class MiningApi {
	public OutputModel getBlockSubsidy(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_SUBSIDY, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBlockSubsidy(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_SUBSIDY, StringConstants.BLANK+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBlockTemplate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBlockTemplate(Configurations config, String mode) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.MODE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(mode);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBlockTemplate(Configurations config, List<String> capabilities) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CAPABILITIES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(capabilities.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBlockTemplate(Configurations config, String mode, List<String> capabilities) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.MODE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(mode);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CAPABILITIES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(capabilities.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getLocalSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LOCAL_SOLPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getMiningInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MINING_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNetworkHashPs(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_HASH_PS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNetworkHashPs(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_HASH_PS, blocks+StringConstants.COMMA+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNetworkSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNetworkSolps(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, blocks+StringConstants.COMMA+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel prioritiseTransaction(Configurations config, String txId, double priorityDelta, double feeDelta) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PRIORITISE_TRANSACTION, StringConstants.DOUBLE_QUOTE+txId+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+priorityDelta+StringConstants.COMMA+feeDelta);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel submitBlock(Configurations config, String hexData ) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SUBMIT_BLOCK, StringConstants.DOUBLE_QUOTE+hexData+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
