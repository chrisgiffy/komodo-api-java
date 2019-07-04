package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.ListResultOutModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.generate.GetGenerateOutputModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class GenerateApi {

	/**
	 * generate numblocks
	 * This function can only be used in the regtest mode (for testing purposes).
	 * The generate method instructs the coin daemon to immediately mine the indicated number of blocks
	 * @param config
	 * @param numBlocks
	 * @return ListResultOutModel
	 */
	public ListResultOutModel generate(Configurations config, int numBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GENERATE, StringConstants.BLANK+numBlocks);
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}
	
	/**
	 * getgenerate
	 * The getgenerate method returns a boolean value indicating the server's mining status.
	 * The default value is false.
	 * @param config
	 * @return GetGenerateOutputModel
	 */
	public GetGenerateOutputModel getGenerate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_GENERATE, null);
		GetGenerateOutputModel outputModel = new Gson().fromJson(output, GetGenerateOutputModel.class);
		return outputModel;
	}
	
	/**
	 * setgenerate generate ( genproclimit )
	 * The setgenerate method allows the user to set the generate property in the coin daemon to true or false, 
	 * thus turning generation (mining/staking) on or off.
	 * Generation is limited to genproclimit processors. 
	 * Set genproclimit to -1 to use maximum available processors.
	 * @param config
	 * @param generate (set to true to turn on generation; set to off to turn off generation)
	 * @return OutputModel
	 */
	public OutputModel setGenerate(Configurations config, boolean generate) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_GENERATE, StringConstants.BLANK+generate);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * setgenerate generate ( genproclimit )
	 * The setgenerate method allows the user to set the generate property in the coin daemon to true or false, 
	 * thus turning generation (mining/staking) on or off.
	 * Generation is limited to genproclimit processors. 
	 * Set genproclimit to -1 to use maximum available processors.
	 * @param config
	 * @param generate (set to true to turn on generation; set to off to turn off generation)
	 * @param genProcLimit (set the processor limit for when generation is on; use value "-1" for unlimited)
	 * @return OutputModel
	 */
	public OutputModel setGenerate(Configurations config, boolean generate, int genProcLimit) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_GENERATE, generate+StringConstants.COMMA+genProcLimit);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
