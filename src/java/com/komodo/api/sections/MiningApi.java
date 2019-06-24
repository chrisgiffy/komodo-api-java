package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_SUBSIDY, ""+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockTemplate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockTemplate(Configurations config, String mode) {
		StringBuilder params = new StringBuilder("{\"mode\":\"");
		params.append(mode);
		params.append("\"}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockTemplate(Configurations config, List<String> capabilities) {
		StringBuilder params = new StringBuilder("{\"capabilities\":[");
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(capabilities.get(i));
			params.append("\"");
		}
		params.append("]}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockTemplate(Configurations config, String mode, List<String> capabilities) {
		StringBuilder params = new StringBuilder("{\"mode\":\"");
		params.append(mode);
		params.append("\",");
		params.append("\"capabilities\":[");
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(capabilities.get(i));
			params.append("\"");
		}
		params.append("]}");
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_HASH_PS, blocks+","+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getNetworkSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getNetworkSolps(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, blocks+","+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel prioritiseTransaction(Configurations config, String txId, double priorityDelta, double feeDelta) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PRIORITISE_TRANSACTION, "\""+txId+"\","+priorityDelta+","+feeDelta);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel submitBlock(Configurations config, String hexData ) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SUBMIT_BLOCK, "\""+hexData+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
