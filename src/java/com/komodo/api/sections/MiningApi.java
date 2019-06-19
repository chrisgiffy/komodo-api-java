package com.komodo.api.sections;

import java.util.List;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class MiningApi {
	public String getBlockSubsidy(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_SUBSIDY, null);
		return output;
	}
	
	public String getBlockSubsidy(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_SUBSIDY, ""+height);
		return output;
	}
	
	public String getBlockTemplate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_TEMPLATE, null);
		return output;
	}
	
	public String getBlockTemplate(Configurations config, String mode) {
		StringBuilder params = new StringBuilder("{\"mode\":\"");
		params.append(mode);
		params.append("\"}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_TEMPLATE, params.toString());
		return output;
	}
	
	public String getBlockTemplate(Configurations config, List<String> capabilities) {
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
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_TEMPLATE, params.toString());
		return output;
	}
	
	public String getBlockTemplate(Configurations config, String mode, List<String> capabilities) {
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
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_TEMPLATE, params.toString());
		return output;
	}
	
	public String getLocalSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_LOCAL_SOLPS, null);
		return output;
	}
	
	public String getMiningInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_MINING_INFO, null);
		return output;
	}
	
	public String getNetworkHashPs(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_HASH_PS, null);
		return output;
	}
	
	public String getNetworkHashPs(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_HASH_PS, blocks+","+height);
		return output;
	}
	
	public String getNetworkSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_SOLPS, null);
		return output;
	}
	
	public String getNetworkSolps(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_SOLPS, blocks+","+height);
		return output;
	}
	
	public String prioritiseTransaction(Configurations config, String txId, double priorityDelta, double feeDelta) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.PRIORITISE_TRANSACTION, "\""+txId+"\","+priorityDelta+","+feeDelta);
		return output;
	}
	
	public String submitBlock(Configurations config, String hexData ) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SUBMIT_BLOCK, "\""+hexData+"\"");
		return output;
	}
}
