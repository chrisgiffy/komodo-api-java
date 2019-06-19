package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class GenerateApi {

	public String generate(Configurations config, int numBlocks) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GENERATE, ""+numBlocks);
		return output;
	}
	public String getGenerate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_GENERATE, null);
		return output;
	}
	public String setGenerate(Configurations config, boolean generate) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SET_GENERATE, ""+generate);
		return output;
	}
	
	public String setGenerate(Configurations config, boolean generate, int genProcLimit) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.SET_GENERATE, generate+","+genProcLimit);
		return output;
	}
}
