package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.ListResultOutModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.blockchain.BlockChainInfoOutputModel;
import com.komodo.api.models.blockchain.BlockHashesOutputModel;
import com.komodo.api.models.blockchain.BlockHeaderOutputModel;
import com.komodo.api.models.blockchain.BlockOutputModel;
import com.komodo.api.models.blockchain.ChainTipsOutputModel;
import com.komodo.api.models.blockchain.ChainTxStatsOutputModel;
import com.komodo.api.models.blockchain.CoinSupplyOutputModel;
import com.komodo.api.models.blockchain.KvSearchOutputModel;
import com.komodo.api.models.blockchain.KvUpdateOutputModel;
import com.komodo.api.models.blockchain.LastSegIdStakesOutputModel;
import com.komodo.api.models.blockchain.MemPoolInfoOutputModel;
import com.komodo.api.models.blockchain.MinerIdsOutputModel;
import com.komodo.api.models.blockchain.NotariesOutputModel;
import com.komodo.api.models.blockchain.RawMemPoolOutputModel;
import com.komodo.api.models.blockchain.SpentInfoOutputModel;
import com.komodo.api.models.blockchain.TxOutSetInfoOutputModel;
import com.komodo.api.models.blockchain.TxOutputModel;
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
	
	public BlockChainInfoOutputModel getBlockchainInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCKCHAIN_INFO, null);
		BlockChainInfoOutputModel outputModel = new Gson().fromJson(output, BlockChainInfoOutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHash(Configurations config, int index) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASH, StringConstants.BLANK+index);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public BlockHashesOutputModel getBlockHashesLogicTimeTrue(Configurations config, long high, long low, boolean noOrphans) {
		StringBuilder params = new StringBuilder();
		params.append(high);
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
		params.append(true);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASHES, params.toString());
		BlockHashesOutputModel outputModel = new Gson().fromJson(output, BlockHashesOutputModel.class);
		return outputModel;
	}
	
	public ListResultOutModel getBlockHashesLogicTimeFalse(Configurations config, long high, long low, boolean noOrphans) {
		StringBuilder params = new StringBuilder();
		params.append(high);
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
		params.append(false);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASHES, params.toString());
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}
	
	public OutputModel getBlockHeaderVerboseFalse(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(false);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HEADER, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public BlockHeaderOutputModel getBlockHeaderVerboseTrue(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(true);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HEADER, params.toString());
		BlockHeaderOutputModel outputModel = new Gson().fromJson(output, BlockHeaderOutputModel.class);
		return outputModel;
	}
	
	public ChainTipsOutputModel getChainTips(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TIPS, null);
		ChainTipsOutputModel outputModel = new Gson().fromJson(output, ChainTipsOutputModel.class);
		return outputModel;
	}
	
	public ChainTxStatsOutputModel getChainTxStats(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, null);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	public ChainTxStatsOutputModel getChainTxStats(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, StringConstants.BLANK+nBlocks);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	public ChainTxStatsOutputModel getChainTxStats(Configurations config, String blockHash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, 
				StringConstants.DOUBLE_QUOTE+blockHash+StringConstants.DOUBLE_QUOTE);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	public ChainTxStatsOutputModel getChainTxStats(Configurations config, int nBlocks, String blockHash) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACE);
		params.append(nBlocks);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(blockHash);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, params.toString());
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	public OutputModel getDifficulty(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DIFFICULTY, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public LastSegIdStakesOutputModel getLastSegIdStakes(Configurations config, int depth) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LAST_SEG_ID_STAKES, StringConstants.BLANK+depth);
		LastSegIdStakesOutputModel outputModel = new Gson().fromJson(output, LastSegIdStakesOutputModel.class);
		return outputModel;
	}
	
	public MemPoolInfoOutputModel getMemPoolInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MEMPOOL_INFO, null);
		MemPoolInfoOutputModel outputModel = new Gson().fromJson(output, MemPoolInfoOutputModel.class);
		return outputModel;
	}
	
	public RawMemPoolOutputModel getRawMemPoolVerboseTrue(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, StringConstants.BLANK+true);
		RawMemPoolOutputModel outputModel = new Gson().fromJson(output, RawMemPoolOutputModel.class);
		return outputModel;
	}
	
	public ListResultOutModel getRawMemPoolVerboseFalse(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, StringConstants.BLANK+false);
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}
	
	public SpentInfoOutputModel getSpentInfo(Configurations config, String txId, int index) {
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
		SpentInfoOutputModel outputModel = new Gson().fromJson(output, SpentInfoOutputModel.class);
		return outputModel;
	}
	
	public TxOutputModel getTxOut(Configurations config, String txId, int vout, boolean includeMemPool) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(vout);
		params.append(StringConstants.COMMA);
		params.append(includeMemPool);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT, params.toString());
		TxOutputModel outputModel = new Gson().fromJson(output, TxOutputModel.class);
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
	
	public TxOutSetInfoOutputModel getTxOutSetInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_SETINFO, null);
		TxOutSetInfoOutputModel outputModel = new Gson().fromJson(output, TxOutSetInfoOutputModel.class);
		return outputModel;
	}
	
	public KvSearchOutputModel kvSearch(Configurations config, String key) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_SEARCH, StringConstants.DOUBLE_QUOTE+key+StringConstants.DOUBLE_QUOTE);
		KvSearchOutputModel outputModel = new Gson().fromJson(output, KvSearchOutputModel.class);
		return outputModel;
	}
	
	public KvUpdateOutputModel kvUpdate(Configurations config, String key, String value, int days) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(key);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(value);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(days);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		KvUpdateOutputModel outputModel = new Gson().fromJson(output, KvUpdateOutputModel.class);
		return outputModel;
	}
	
	public KvUpdateOutputModel kvUpdate(Configurations config, String key, String value, int days, String passPhrase) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(key);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(value);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(days);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(passPhrase);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_UPDATE, params.toString());
		KvUpdateOutputModel outputModel = new Gson().fromJson(output, KvUpdateOutputModel.class);
		return outputModel;
	}
	
	public MinerIdsOutputModel minerIds(Configurations config, int heights) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MINER_IDS, StringConstants.DOUBLE_QUOTE+heights+StringConstants.DOUBLE_QUOTE);
		MinerIdsOutputModel outputModel = new Gson().fromJson(output, MinerIdsOutputModel.class);
		return outputModel;
	}
	
	public NotariesOutputModel notaries(Configurations config, int height, long timeStamp ) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(timeStamp);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, params.toString());
		NotariesOutputModel outputModel = new Gson().fromJson(output, NotariesOutputModel.class);
		return outputModel;
	}
	
	public NotariesOutputModel notaries(Configurations config, long timeStamp ) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(timeStamp);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, params.toString());
		NotariesOutputModel outputModel = new Gson().fromJson(output, NotariesOutputModel.class);
		return outputModel;
	}
	
	public NotariesOutputModel notaries(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, StringConstants.DOUBLE_QUOTE+height+StringConstants.DOUBLE_QUOTE);
		NotariesOutputModel outputModel = new Gson().fromJson(output, NotariesOutputModel.class);
		return outputModel;
	}
	
	public boolean verifyChain(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_CHAIN, null);
		boolean outputModel = Boolean.parseBoolean(new Gson().fromJson(output, OutputModel.class).getResult());
		return outputModel;
	}
	
	public ListResultOutModel verifyTxOutProof(Configurations config, String proofString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_TXOUT_PROOF, StringConstants.DOUBLE_QUOTE+proofString+StringConstants.DOUBLE_QUOTE);
		System.out.println(output);
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}

}
