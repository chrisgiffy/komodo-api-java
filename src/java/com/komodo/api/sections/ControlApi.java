package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class ControlApi {

	public String getInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_INFO, null);
		return output;
	}
	
	public String help(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.HELP, null);
		return output;
	}

	public String help(Configurations config, String command) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.HELP, "\""+command+"\"");
		return output;
	}
	
	public String stop(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.STOP, null);
		return output;
	}
}
