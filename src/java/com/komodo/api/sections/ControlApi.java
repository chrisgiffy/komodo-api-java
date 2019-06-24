package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class ControlApi {

	public OutputModel getInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel help(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.HELP, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel help(Configurations config, String command) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.HELP, StringConstants.DOUBLE_QUOTE+command+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel stop(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.STOP, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
