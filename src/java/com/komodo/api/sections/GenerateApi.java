package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class GenerateApi {

	public OutputModel generate(Configurations config, int numBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GENERATE, ""+numBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	public OutputModel getGenerate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_GENERATE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	public OutputModel setGenerate(Configurations config, boolean generate) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_GENERATE, ""+generate);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel setGenerate(Configurations config, boolean generate, int genProcLimit) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_GENERATE, generate+","+genProcLimit);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
