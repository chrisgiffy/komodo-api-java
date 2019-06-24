package com.komodo.api.sections;

import java.util.Date;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class BlockChainApi {

	public OutputModel coinSupply(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, "\""+height+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel coinSupply(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBestBlockHash(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BEST_BLOCK_HASH, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlock(Configurations config, int height, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(height);
		params.append("\",");
		params.append(verbose);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlock(Configurations config, String hash, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(hash);
		params.append("\",");
		params.append(verbose);
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BEST_BLOCK_HASH, ""+index);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHashes(Configurations config, int high, int low, boolean noOrphans, boolean logicalTimes) {
		StringBuilder params = new StringBuilder(high);
		params.append(",");
		params.append(low);
		params.append(",{\"noOrphans\":");
		params.append(noOrphans);
		params.append(",\"logicalTimes\":");
		params.append(logicalTimes);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASHES, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHeader(Configurations config, String hash, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(hash);
		params.append("\",");
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, ""+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getChainTxStats(Configurations config, int nBlocks, String blockHash) {
		StringBuilder params = new StringBuilder("{");
		params.append(nBlocks);
		params.append(",\"");
		params.append(blockHash);
		params.append("\"}");
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LAST_SEG_ID_STAKES, ""+depth);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getMemPoolInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MEMPOOL_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getRawMemPool(Configurations config, boolean verbose) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, ""+verbose);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getSpentInfo(Configurations config, String txId, int index) {
		StringBuilder params = new StringBuilder("{\"txid\": \"");
		params.append(txId);
		params.append("\", \"index\": ");
		params.append(index);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_SPENT_INFO, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOut(Configurations config, String txId, int vout) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(vout);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOut(Configurations config, String txId, int vout, boolean includeMemPool) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(vout);
		params.append(",");
		params.append(includeMemPool);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOutProof(Configurations config, String txId) {
		StringBuilder params = new StringBuilder("[\"");
		params.append(txId);
		params.append("\"]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_PROOF, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getTxOutProof(Configurations config, String txId, String blockHash) {
		StringBuilder params = new StringBuilder("[\"");
		params.append(txId);
		params.append("\"],\"");
		params.append(blockHash);
		params.append("\"");
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
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_SEARCH, "\""+key+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel kvUpdate(Configurations config, String key, String value, int days) {
		StringBuilder params = new StringBuilder("\"");
		params.append(key);
		params.append("\",\"");
		params.append(value);
		params.append("\",");
		params.append(days);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel kvUpdate(Configurations config, String key, String value, int days, String passPhrase) {
		StringBuilder params = new StringBuilder("\"");
		params.append(key);
		params.append("\",\"");
		params.append(value);
		params.append("\",");
		params.append(days);
		params.append(",\"");
		params.append(passPhrase);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel minerIds(Configurations config, int heights) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MINER_IDS, ""+heights);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel notaries(Configurations config, int height, Date timeStamp ) {
		StringBuilder params = new StringBuilder(height);
		params.append(",");
		params.append(timeStamp.getTime());
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel notaries(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, ""+height);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel verifyChain(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_CHAIN, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel verifyTxOutProof(Configurations config, String proofString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_TXOUT_PROOF, "\""+proofString+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

}
