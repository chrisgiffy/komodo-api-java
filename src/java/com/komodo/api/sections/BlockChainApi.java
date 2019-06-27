package com.komodo.api.sections;

import java.util.Date;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.blockchain.BlockOutputModel;
import com.komodo.api.models.blockchain.CoinSupplyOutputModel;
import com.komodo.api.utils.KomodoUtil;

public class BlockChainApi {

	public CoinSupplyOutputModel coinSupply(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, StringConstants.DOUBLE_QUOTE+height+StringConstants.DOUBLE_QUOTE);
		CoinSupplyOutputModel outputModel = new Gson().fromJson(output, CoinSupplyOutputModel.class);
		return outputModel;
	}
	
	public CoinSupplyOutputModel coinSupply(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, null);
		CoinSupplyOutputModel outputModel = new Gson().fromJson(output, CoinSupplyOutputModel.class);
		return outputModel;
	}

	public OutputModel getBestBlockHash(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BEST_BLOCK_HASH, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public BlockOutputModel getBlockVerboseTrue(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(true);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK, params.toString());
		BlockOutputModel outputModel = new Gson().fromJson(output, BlockOutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockVerboseFalse(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(false);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public BlockOutputModel getBlockVerboseTrue(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(true);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK, params.toString());
		BlockOutputModel outputModel = new Gson().fromJson(output, BlockOutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockVerboseFalse(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(false);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockchainInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCKCHAIN_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHash(Configurations config, int index) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASH, StringConstants.BLANK+index);
		System.out.println(output);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHashes(Configurations config, int high, int low, boolean noOrphans, boolean logicalTimes) {
		StringBuilder params = new StringBuilder(high);
		params.append(StringConstants.COMMA);
		params.append(low);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.NO_ORPHANS);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(noOrphans);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.LOGICAL_TIMES);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(logicalTimes);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASHES, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHeader(Configurations config, String hash, boolean verbose) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(verbose);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HEADER, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getChainTips(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TIPS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getChainTxStats(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getChainTxStats(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, StringConstants.BLANK+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getChainTxStats(Configurations config, int nBlocks, String blockHash) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(nBlocks);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(blockHash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getDifficulty(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DIFFICULTY, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getLastSegIdStakes(Configurations config, int depth) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LAST_SEG_ID_STAKES, StringConstants.BLANK+depth);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getMemPoolInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MEMPOOL_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getRawMemPool(Configurations config, boolean verbose) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, StringConstants.BLANK+verbose);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getSpentInfo(Configurations config, String txId, int index) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.TXID);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.INDEX);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(index);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_SPENT_INFO, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOut(Configurations config, String txId, int vout) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(vout);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOut(Configurations config, String txId, int vout, boolean includeMemPool) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(vout);
		params.append(StringConstants.COMMA);
		params.append(includeMemPool);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOutProof(Configurations config, String txId) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACKET);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_PROOF, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOutProof(Configurations config, String txId, String blockHash) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACKET);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(blockHash);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_PROOF, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOutSetInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_SETINFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel kvSearch(Configurations config, String key) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_SEARCH, StringConstants.DOUBLE_QUOTE+key+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel kvUpdate(Configurations config, String key, String value, int days) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(key);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(value);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(days);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel kvUpdate(Configurations config, String key, String value, int days, String passPhrase) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(key);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(value);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(days);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(passPhrase);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel minerIds(Configurations config, int heights) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MINER_IDS, StringConstants.BLANK+heights);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel notaries(Configurations config, int height, Date timeStamp ) {
		StringBuilder params = new StringBuilder(height);
		params.append(StringConstants.COMMA);
		params.append(timeStamp.getTime());
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel notaries(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, StringConstants.BLANK+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel verifyChain(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_CHAIN, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel verifyTxOutProof(Configurations config, String proofString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_TXOUT_PROOF, StringConstants.DOUBLE_QUOTE+proofString+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

}
