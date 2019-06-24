package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class JumblrApi {
	
	public OutputModel jumblrDeposit(Configurations config, String depositAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_DEPOSIT, "\""+depositAddress+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel jumblrPause(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_PAUSE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel jumblrResume(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_RESUME, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel jumblrSecret(Configurations config, String secretAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_DEPOSIT, "\""+secretAddress+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

}
