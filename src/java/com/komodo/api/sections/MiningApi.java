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
	
	public String getLocalSolps(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_LOCAL_SOLPS, "\""+hex+"\"");
		return output;
	}
	
	public String getMiningInfo(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_MINING_INFO, "\""+hex+"\"");
		return output;
	}
	
	public String getNetworkHashPs(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_HASH_PS, "\""+hex+"\"");
		return output;
	}
	
	public String getNetworkSolps(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_NETWORK_SOLPS, "\""+hex+"\"");
		return output;
	}
	
	public String prioritiseTransaction(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.PRIORITISE_TRANSACTION, "\""+hex+"\"");
		return output;
	}
	
	public String submitBlock(Configurations config, String hex) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SUBMIT_BLOCK, "\""+hex+"\"");
		return output;
	}
}
