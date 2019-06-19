package com.komodo.api.sections;

import java.util.Date;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class BlockChainApi {

	public String coinSupply(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.COINSUPPLY, "\""+height+"\"");
		return output;
	}
	
	public String coinSupply(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.COINSUPPLY, null);
		return output;
	}

	public String getBestBlockHash(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BEST_BLOCK_HASH, null);
		return output;
	}
	
	public String getBlock(Configurations config, int height, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(height);
		params.append("\",");
		params.append(verbose);
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK, params.toString());
		return output;
	}
	
	public String getBlock(Configurations config, String hash, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(hash);
		params.append("\",");
		params.append(verbose);
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK, params.toString());
		return output;
	}
	
	public String getBlockchainInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCKCHAIN_INFO, null);
		return output;
	}
	
	public String getBlockCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_COUNT, null);
		return output;
	}
	
	public String getBlockHash(Configurations config, int index) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BEST_BLOCK_HASH, ""+index);
		return output;
	}
	
	public String getBlockHashes(Configurations config, int high, int low, boolean noOrphans, boolean logicalTimes) {
		StringBuilder params = new StringBuilder(high);
		params.append(",");
		params.append(low);
		params.append(",{\"noOrphans\":");
		params.append(noOrphans);
		params.append(",\"logicalTimes\":");
		params.append(logicalTimes);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_HASHES, params.toString());
		return output;
	}
	
	public String getBlockHeader(Configurations config, String hash, boolean verbose) {
		StringBuilder params = new StringBuilder("\"");
		params.append(hash);
		params.append("\",");
		params.append(verbose);
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_BLOCK_HEADER, params.toString());
		return output;
	}
	
	public String getChainTips(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_CHAIN_TIPS, null);
		return output;
	}
	
	public String getChainTxStats(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_CHAIN_TX_STATS, null);
		return output;
	}
	
	public String getChainTxStats(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_CHAIN_TX_STATS, ""+nBlocks);
		return output;
	}
	
	public String getChainTxStats(Configurations config, int nBlocks, String blockHash) {
		StringBuilder params = new StringBuilder("{");
		params.append(nBlocks);
		params.append(",\"");
		params.append(blockHash);
		params.append("\"}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_CHAIN_TX_STATS, params.toString());
		return output;
	}
	
	public String getDifficulty(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_DIFFICULTY, null);
		return output;
	}
	
	public String getLastSegIdStakes(Configurations config, int depth) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_LAST_SEG_ID_STAKES, ""+depth);
		return output;
	}
	
	public String getMemPoolInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_MEMPOOL_INFO, null);
		return output;
	}
	
	public String getRawMemPool(Configurations config, boolean verbose) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_RAW_MEM_POOL, ""+verbose);
		return output;
	}
	
	public String getSpentInfo(Configurations config, String txId, int index) {
		StringBuilder params = new StringBuilder("{\"txid\": \"");
		params.append(txId);
		params.append("\", \"index\": ");
		params.append(index);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_SPENT_INFO, params.toString());
		return output;
	}
	
	public String getTxOut(Configurations config, String txId, int vout) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(vout);
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_TX_OUT, params.toString());
		return output;
	}
	
	public String getTxOut(Configurations config, String txId, int vout, boolean includeMemPool) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(vout);
		params.append(",");
		params.append(includeMemPool);
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_TX_OUT, params.toString());
		return output;
	}
	
	public String getTxOutProof(Configurations config, String txId) {
		StringBuilder params = new StringBuilder("[\"");
		params.append(txId);
		params.append("\"]");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_TX_OUT_PROOF, params.toString());
		return output;
	}
	
	public String getTxOutProof(Configurations config, String txId, String blockHash) {
		StringBuilder params = new StringBuilder("[\"");
		params.append(txId);
		params.append("\"],\"");
		params.append(blockHash);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_TX_OUT_PROOF, params.toString());
		return output;
	}
	
	public String getTxOutSetInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_TX_OUT_SETINFO, null);
		return output;
	}
	
	public String kvSearch(Configurations config, String key) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.KV_SEARCH, "\""+key+"\"");
		return output;
	}
	
	public String kvUpdate(Configurations config, String key, String value, int days) {
		StringBuilder params = new StringBuilder("\"");
		params.append(key);
		params.append("\",\"");
		params.append(value);
		params.append("\",");
		params.append(days);
		String output = KomodoUtil.fireKomodo(config, StringConstants.KV_UPDATE, params.toString());
		return output;
	}
	
	public String kvUpdate(Configurations config, String key, String value, int days, String passPhrase) {
		StringBuilder params = new StringBuilder("\"");
		params.append(key);
		params.append("\",\"");
		params.append(value);
		params.append("\",");
		params.append(days);
		params.append(",\"");
		params.append(passPhrase);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.KV_UPDATE, params.toString());
		return output;
	}
	
	public String minerIds(Configurations config, int heights) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.MINER_IDS, ""+heights);
		return output;
	}
	
	public String notaries(Configurations config, int height, Date timeStamp ) {
		StringBuilder params = new StringBuilder(height);
		params.append(",");
		params.append(timeStamp.getTime());
		String output = KomodoUtil.fireKomodo(config, StringConstants.NOTARIES, params.toString());
		return output;
	}
	
	public String notaries(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.NOTARIES, ""+height);
		return output;
	}
	
	public String verifyChain(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.VERIFY_CHAIN, null);
		return output;
	}
	
	public String verifyTxOutProof(Configurations config, String proofString) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.VERIFY_TXOUT_PROOF, "\""+proofString+"\"");
		return output;
	}

}
