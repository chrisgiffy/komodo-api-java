package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.StringResultOutputModel;
import com.komodo.api.utils.KomodoUtil;

public class JumblrApi {
	
	/**
	 * jumblr_deposit "depositaddress"
	 * The jubmlr_deposit method indicates the address from which Jumblr should withdraw funds. 
	 * There should be at least 10.024 KMD in this address. 
	 * Jumblr will withdraw funds in increments of 10, 100, or 7770 KMD.
	 * While shielded z_address technology is available on all KMD-based asset chains, 
	 * the Jumblr engine and methods are only available on the KMD mainnet.
	 * @param config
	 * @param depositAddress
	 * @return StringResultOutputModel
	 */
	public StringResultOutputModel jumblrDeposit(Configurations config, String depositAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_DEPOSIT, StringConstants.DOUBLE_QUOTE+depositAddress+StringConstants.DOUBLE_QUOTE);
		StringResultOutputModel outputModel = new Gson().fromJson(output, StringResultOutputModel.class);
		return outputModel;
	}
	
	/**
	 * jumblr_pause
	 * The jumblr_pause method instructs Jumblr to temporarily pause the privacy-shielding process.
	 * @param config
	 * @return StringResultOutputModel
	 */
	public StringResultOutputModel jumblrPause(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_PAUSE, null);
		StringResultOutputModel outputModel = new Gson().fromJson(output, StringResultOutputModel.class);
		return outputModel;
	}
	
	/**
	 * jumblr_resume
	 * The jumblr_resume method instructs Jumblr to resume the privacy-shielding process.
	 * @param config
	 * @return StringResultOutputModel
	 */
	public StringResultOutputModel jumblrResume(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_RESUME, null);
		StringResultOutputModel outputModel = new Gson().fromJson(output, StringResultOutputModel.class);
		return outputModel;
	}
	
	/**
	 * jumblr_secret "secretaddress"
	 * The jumblr_secret method indicates to Jumblr the final t destination address. 
	 * This should be a separate t address that has no connection to the wallet.dat file of your jumblr_deposit address. 
	 * Ideally, you should only access the final jumblr_secret address via a separate node, 
	 * and with other layers of privacy (VPN, Tor, etc.)
	 * @param config
	 * @param secretAddress
	 * @return
	 */
	public StringResultOutputModel jumblrSecret(Configurations config, String secretAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.JUMBLR_DEPOSIT, StringConstants.DOUBLE_QUOTE+secretAddress+StringConstants.DOUBLE_QUOTE);
		StringResultOutputModel outputModel = new Gson().fromJson(output, StringResultOutputModel.class);
		return outputModel;
	}

}
