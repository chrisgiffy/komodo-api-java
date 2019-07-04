package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.control.GetInfoModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class ControlApi {

	/**
	 * getinfo
	 * The getinfo method returns an object containing various state info
	 * @param config
	 * @return GetInfoModel
	 */
	public GetInfoModel getInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_INFO, null);
		GetInfoModel getInfo = new Gson().fromJson(output, GetInfoModel.class);
		return getInfo;
	}
	
	/**
	 * help ( "command" )
	 * The help method lists all commands, or all information for a specified command.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel help(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.HELP, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * help ( "command" )
	 * The help method lists all commands, or all information for a specified command.
	 * @param config
	 * @param command
	 * @return OutputModel
	 */
	public OutputModel help(Configurations config, String command) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.HELP, StringConstants.DOUBLE_QUOTE+command+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * stop
	 * The stop method instructs the coin daemon to shut down.
	 * The amount of time it takes to shut down the chain will vary depending on the chain's current state.
	 * Forcefully stopping the chain should be avoided, as it may cause a corruption in the local database. 
	 * In the event of a corrupted database, the user will need to resync.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel stop(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.STOP, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
