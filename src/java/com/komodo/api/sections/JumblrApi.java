package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class JumblrApi {
	
	public String jumblrDeposit(Configurations config, String depositAddress) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.JUMBLR_DEPOSIT, "\""+depositAddress+"\"");
		return output;
	}
	
	public String jumblrPause(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.JUMBLR_PAUSE, null);
		return output;
	}
	
	public String jumblrResume(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.JUMBLR_RESUME, null);
		return output;
	}
	
	public String jumblrSecret(Configurations config, String secretAddress) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.JUMBLR_DEPOSIT, "\""+secretAddress+"\"");
		return output;
	}

}
