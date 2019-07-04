package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.mining.BlockTemplateOutputModel;
import com.komodo.api.models.mining.MiningInfoOutputModel;
import com.komodo.api.models.mining.MiningSubsidyOutputModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class MiningApi {
	
	/**
	 * getblocksubsidy height_number
	 * The getblocksubsidy method returns the block-subsidy reward. 
	 * The resulting calculation takes into account the mining slow start. 
	 * This method can be used in conjunction with custom mining rewards designed by the developers of a KMD-based asset chain.
	 * @param config
	 * @return MiningSubsidyOutputModel
	 */
	public MiningSubsidyOutputModel getBlockSubsidy(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_SUBSIDY, null);
		MiningSubsidyOutputModel outputModel = new Gson().fromJson(output, MiningSubsidyOutputModel.class);
		return outputModel;
	}

	/**
	 * getblocksubsidy height_number
	 * The getblocksubsidy method returns the block-subsidy reward. 
	 * The resulting calculation takes into account the mining slow start. 
	 * This method can be used in conjunction with custom mining rewards designed by the developers of a KMD-based asset chain.
	 * @param config
	 * @param height
	 * @return MiningSubsidyOutputModel
	 */
	public MiningSubsidyOutputModel getBlockSubsidy(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_SUBSIDY, StringConstants.BLANK+height);
		MiningSubsidyOutputModel outputModel = new Gson().fromJson(output, MiningSubsidyOutputModel.class);
		return outputModel;
	}

	/**
	 * getblocktemplate ( "jsonrequestobject" )
	 * The getblocktemplate method returns data that is necessary to construct a block.
	 * If the request parameters include a mode key, 
	 * it is used to explicitly select between the default 'template' request, a 'proposal' or 'disablecb'.
	 * @param config
	 * @return BlockTemplateOutputModel
	 */
	public BlockTemplateOutputModel getBlockTemplate(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, null);
		BlockTemplateOutputModel outputModel = new Gson().fromJson(output, BlockTemplateOutputModel.class);
		return outputModel;
	}

	/**
	 * getblocktemplate ( "jsonrequestobject" )
	 * The getblocktemplate method returns data that is necessary to construct a block.
	 * If the request parameters include a mode key, 
	 * it is used to explicitly select between the default 'template' request, a 'proposal' or 'disablecb'.
	 * @param config
	 * @param mode
	 * @return BlockTemplateOutputModel
	 */
	public BlockTemplateOutputModel getBlockTemplate(Configurations config, String mode) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.MODE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(mode);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		BlockTemplateOutputModel outputModel = new Gson().fromJson(output, BlockTemplateOutputModel.class);
		return outputModel;
	}

	/**
	 * getblocktemplate ( "jsonrequestobject" )
	 * The getblocktemplate method returns data that is necessary to construct a block.
	 * If the request parameters include a mode key, 
	 * it is used to explicitly select between the default 'template' request, a 'proposal' or 'disablecb'.
	 * @param config
	 * @param capabilities (client side supported features: "longpoll", "coinbasetxn", "coinbasevalue", "proposal", "serverlist", "workid")
	 * @return BlockTemplateOutputModel
	 */
	public BlockTemplateOutputModel getBlockTemplate(Configurations config, List<String> capabilities) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CAPABILITIES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(capabilities.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		BlockTemplateOutputModel outputModel = new Gson().fromJson(output, BlockTemplateOutputModel.class);
		return outputModel;
	}

	/**
	 * getblocktemplate ( "jsonrequestobject" )
	 * The getblocktemplate method returns data that is necessary to construct a block.
	 * If the request parameters include a mode key, 
	 * it is used to explicitly select between the default 'template' request, a 'proposal' or 'disablecb'.
	 * @param config
	 * @param mode
	 * @param capabilities (client side supported features: "longpoll", "coinbasetxn", "coinbasevalue", "proposal", "serverlist", "workid")
	 * @return BlockTemplateOutputModel
	 */
	public BlockTemplateOutputModel getBlockTemplate(Configurations config, String mode, List<String> capabilities) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.MODE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(mode);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CAPABILITIES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < capabilities.size(); i++) {
			if(i < 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(capabilities.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_TEMPLATE, params.toString());
		BlockTemplateOutputModel outputModel = new Gson().fromJson(output, BlockTemplateOutputModel.class);
		return outputModel;
	}

	/**
	 * getlocalsolps
	 * The getlocalsolps method returns the average local solutions per second since this node was started.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getLocalSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LOCAL_SOLPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getmininginfo
	 * The getmininginfo method returns a json object containing mining-related information
	 * @param config
	 * @return MiningInfoOutputModel
	 */
	public MiningInfoOutputModel getMiningInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MINING_INFO, null);
		MiningInfoOutputModel outputModel = new Gson().fromJson(output, MiningInfoOutputModel.class);
		return outputModel;
	}

	/**
	 * getnetworksolps ( blocks height )
	 * The getnetworksolps method returns the estimated network solutions per second based on the last n blocks.
	 * Pass in blocks to override the default number of blocks. 
	 * Use -1 to calculate according to the relevant difficulty averaging window. 
	 * Pass in height to estimate the network speed at the time when a certain block was found
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getNetworkSolps(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getnetworksolps ( blocks height )
	 * The getnetworksolps method returns the estimated network solutions per second based on the last n blocks.
	 * Pass in blocks to override the default number of blocks. 
	 * Use -1 to calculate according to the relevant difficulty averaging window. 
	 * Pass in height to estimate the network speed at the time when a certain block was found
	 * @param config
	 * @param blocks
	 * @param height
	 * @return OutputModel
	 */
	public OutputModel getNetworkSolps(Configurations config, int blocks, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NETWORK_SOLPS, blocks+StringConstants.COMMA+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * prioritisetransaction "transaction_id" priority_delta fee_delta
	 * The prioritisetransaction method instructs the daemon to accept the indicated transaction into mined blocks at a higher (or lower) priority. 
	 * The transaction selection algorithm considers the transaction as it would have a higher priority.
	 * @param config
	 * @param txId
	 * @param priorityDelta
	 * @param feeDelta
	 * @return OutputModel
	 */
	public OutputModel prioritiseTransaction(Configurations config, String txId, double priorityDelta, double feeDelta) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.PRIORITISE_TRANSACTION, StringConstants.DOUBLE_QUOTE+txId+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+priorityDelta+StringConstants.COMMA+feeDelta);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * submitblock "hexdata" ( "jsonparametersobject" )
	 * The submitblock method instructs the daemon to propose a new block to the network.
	 * @param config
	 * @param hexData
	 * @return OutputModel
	 */
	public OutputModel submitBlock(Configurations config, String hexData ) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SUBMIT_BLOCK, StringConstants.DOUBLE_QUOTE+hexData+StringConstants.DOUBLE_QUOTE);
		System.out.println(output);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
