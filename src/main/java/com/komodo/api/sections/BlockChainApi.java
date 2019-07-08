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

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class BlockChainApi {

	/**
	 * coinsupply height
	 * The coinsupply method returns the coin supply information for the indicated block height. 
	 * If no height is given, the method defaults to the blockchain's current height.
	 * @param config
	 * @param height
	 * @return CoinSupplyOutputModel
	 */
	public CoinSupplyOutputModel coinSupply(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, StringConstants.DOUBLE_QUOTE+height+StringConstants.DOUBLE_QUOTE);
		CoinSupplyOutputModel outputModel = new Gson().fromJson(output, CoinSupplyOutputModel.class);
		return outputModel;
	}
	
	/**
	 * coinsupply
	 * The coinsupply method returns the coin supply information for the indicated block height. 
	 * If no height is given, the method defaults to the blockchain's current height.
	 * @param config
	 * @return CoinSupplyOutputModel
	 */
	public CoinSupplyOutputModel coinSupply(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.COINSUPPLY, null);
		CoinSupplyOutputModel outputModel = new Gson().fromJson(output, CoinSupplyOutputModel.class);
		return outputModel;
	}

	/**
	 * getbestblockhash
	 * The getbestblockhash method returns the hash of the best (tip) block in the longest block chain.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getBestBlockHash(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BEST_BLOCK_HASH, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getblock hash|height ( verbose )
	 * The getblock method returns the block's relevant state information.
	 * The default value is true, and it will return a json object with information about the indicated block
	 * @param config
	 * @param height
	 * @return BlockOutputModel
	 */
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
	
	/**
	 * getblock hash|height ( verbose )
	 * The getblock method returns the block's relevant state information.
	 * If verbose is false, the command returns a string that is serialized hex-encoded data for the indicated block.
	 * @param config
	 * @param height
	 * @return OutputModel
	 */
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
	
	/**
	 * getblock hash|height ( verbose )
	 * The getblock method returns the block's relevant state information.
	 * The default value is true, and it will return a json object with information about the indicated block
	 * @param config
	 * @param hash
	 * @return BlockOutputModel
	 */
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
	
	/**
	 * getblock hash|height ( verbose )
	 * The getblock method returns the block's relevant state information.
	 * If verbose is false, the command returns a string that is serialized hex-encoded data for the indicated block.
	 * @param config
	 * @param hash
	 * @return OutputModel
	 */
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
	
	/**
	 * getblockchaininfo
	 * The getblockchaininfo method returns a json object containing state information about blockchain processing.
	 * @param config
	 * @return BlockChainInfoOutputModel
	 */
	public BlockChainInfoOutputModel getBlockchainInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCKCHAIN_INFO, null);
		BlockChainInfoOutputModel outputModel = new Gson().fromJson(output, BlockChainInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getblockcount
	 * The getblockcount method returns the number of blocks in the best valid block chain.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getBlockCount(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_COUNT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getblockhash index
	 * The getblockhash method returns the hash of the indicated block index, 
	 * according to the best blockchain at the time provided
	 * @param config
	 * @param index
	 * @return OutputModel
	 */
	public OutputModel getBlockHash(Configurations config, int index) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BLOCK_HASH, StringConstants.BLANK+index);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getblockhashes high low '{"noOrphans": bool, "logicalTimes": bool}'
	 * The getblockhashes method returns an array of hashes of blocks within the timestamp range provided.
	 * The method requires timestampindex to be enabled.
	 * Locgical Time true implies that the method will only include logical timestamps with hashes
	 * @param config
	 * @param high
	 * @param low
	 * @param noOrphans
	 * @return BlockHashesOutputModel
	 */
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
	
	/**
	 * getblockhashes high low '{"noOrphans": bool, "logicalTimes": bool}'
	 * The getblockhashes method returns an array of hashes of blocks within the timestamp range provided.
	 * The method requires timestampindex to be enabled
	 * @param config
	 * @param high
	 * @param low
	 * @param noOrphans
	 * @return ListResultOutModel
	 */
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
	
	/**
	 * getblockheader "hash" ( verbose )
	 * The getblockheader method returns information about the indicated block.
	 * The verbose input is optional. 
	 * If verbose is false, the method returns a string that is serialized, hex-encoded data for the indicated blockheader. 
	 * If verbose is true, the method returns a json object with information about the indicated blockheader
	 * @param config
	 * @param hash
	 * @return OutputModel
	 */
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
	
	/**
	 * getblockheader "hash" ( verbose )
	 * The getblockheader method returns information about the indicated block.
	 * The verbose input is optional. 
	 * If verbose is false, the method returns a string that is serialized, hex-encoded data for the indicated blockheader. 
	 * If verbose is true, the method returns a json object with information about the indicated blockheader 
	 * @param config
	 * @param hash
	 * @return BlockHeaderOutputModel
	 */
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
	
	/**
	 * The getchaintips method returns information about all known tips in the block tree, 
	 * including the main chain and any orphaned branches
	 * @param config
	 * @return ChainTipsOutputModel
	 */
	public ChainTipsOutputModel getChainTips(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TIPS, null);
		ChainTipsOutputModel outputModel = new Gson().fromJson(output, ChainTipsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getchaintxstats nblocks blockhash
	 * The method getchaintxstats returns statistics about the total number and rate of transactions in the chain
	 * @param config
	 * @return ChainTxStatsOutputModel
	 */
	public ChainTxStatsOutputModel getChainTxStats(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, null);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getchaintxstats nblocks blockhash
	 * The method getchaintxstats returns statistics about the total number and rate of transactions in the chain
	 * @param config
	 * @param nBlocks
	 * @return ChainTxStatsOutputModel
	 */
	public ChainTxStatsOutputModel getChainTxStats(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, StringConstants.BLANK+nBlocks);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getchaintxstats nblocks blockhash
	 * The method getchaintxstats returns statistics about the total number and rate of transactions in the chain
	 * @param config
	 * @param blockHash
	 * @return ChainTxStatsOutputModel
	 */
	public ChainTxStatsOutputModel getChainTxStats(Configurations config, String blockHash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_CHAIN_TX_STATS, 
				StringConstants.DOUBLE_QUOTE+blockHash+StringConstants.DOUBLE_QUOTE);
		ChainTxStatsOutputModel outputModel = new Gson().fromJson(output, ChainTxStatsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getchaintxstats nblocks blockhash
	 * The method getchaintxstats returns statistics about the total number and rate of transactions in the chain
	 * @param config
	 * @param nBlocks
	 * @param blockHash
	 * @return ChainTxStatsOutputModel
	 */
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
	
	/**
	 * getdifficulty
	 * The getdifficulty method returns the proof-of-work difficulty as a multiple of the minimum difficulty
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getDifficulty(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_DIFFICULTY, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getlastsegidstakes depth
	 * The getlastsegidstakes method returns an object containing the number of blocks staked by each segid in the last X number of blocks,
	 * where the value of X is equal to the indicated depth
	 * @param config
	 * @param depth
	 * @return LastSegIdStakesOutputModel
	 */
	public LastSegIdStakesOutputModel getLastSegIdStakes(Configurations config, int depth) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_LAST_SEG_ID_STAKES, StringConstants.BLANK+depth);
		LastSegIdStakesOutputModel outputModel = new Gson().fromJson(output, LastSegIdStakesOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getmempoolinfo
	 * The getmempoolinfo method returns details on the active state of the transaction memory pool
	 * @param config
	 * @return MemPoolInfoOutputModel
	 */
	public MemPoolInfoOutputModel getMemPoolInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_MEMPOOL_INFO, null);
		MemPoolInfoOutputModel outputModel = new Gson().fromJson(output, MemPoolInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getrawmempool ( verbose )
	 * The getrawmempool method returns all transaction ids in the memory pool as a json array of transaction ids.
	 * The verbose input is optional and is false by default. When it is true, 
	 * the method instead returns a json object with various related data.
	 * @param config
	 * @return RawMemPoolOutputModel
	 */
	public RawMemPoolOutputModel getRawMemPoolVerboseTrue(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, StringConstants.BLANK+true);
		RawMemPoolOutputModel outputModel = new Gson().fromJson(output, RawMemPoolOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getrawmempool ( verbose )
	 * The getrawmempool method returns all transaction ids in the memory pool as a json array of transaction ids.
	 * The verbose input is optional and is false by default. When it is true, 
	 * the method instead returns a json object with various related data.
	 * @param config
	 * @return ListResultOutModel
	 */
	public ListResultOutModel getRawMemPoolVerboseFalse(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_MEM_POOL, StringConstants.BLANK+false);
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}
	
	/**
	 * getspentinfo '{"txid": "txid_string", "index"}'
	 * The getspentinfo method returns the transaction id and index where the given output is spent.
	 * The method requires spentindex to be enabled
	 * @param config
	 * @param txId
	 * @param index
	 * @return SpentInfoOutputModel
	 */
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
	
	/**
	 * gettxout "txid_string" vout_number ( includemempool_bool )
	 * The gettxout method returns details about an unspent transaction output.
	 * @param config
	 * @param txId
	 * @param vout
	 * @param includeMemPool
	 * @return TxOutputModel
	 */ 
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
	
	/**
	 * gettxoutproof '["transaction_id", ... ]' ( "blockhash_string" )
	 * The gettxoutproof method returns a hex-encoded proof showing that the indicated transaction was included in a block.
	 * The gettxoutproof method relies on the txindex runtime parameter. 
	 * This parameter is enabled by default on all KMD-based blockchains, and should never be disabled
	 * @param config
	 * @param txId
	 * @return OutputModel
	 */
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
	
	/**
	 *  gettxoutproof '["transaction_id", ... ]' ( "blockhash_string" )
	 * The gettxoutproof method returns a hex-encoded proof showing that the indicated transaction was included in a block.
	 * The gettxoutproof method relies on the txindex runtime parameter. 
	 * This parameter is enabled by default on all KMD-based blockchains, and should never be disabled
	 * @param config
	 * @param txId
	 * @param blockHash
	 * @return OutputModel
	 */
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
	
	/**
	 * gettxoutsetinfo
	 * The gettxoutsetinfo method returns statistics about the unspent transaction output set.
	 * @param config
	 * @return TxOutSetInfoOutputModel
	 */
	public TxOutSetInfoOutputModel getTxOutSetInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TX_OUT_SETINFO, null);
		TxOutSetInfoOutputModel outputModel = new Gson().fromJson(output, TxOutSetInfoOutputModel.class);
		return outputModel;
	}
	
	/**
	 * kvsearch "key_string"
	 * The kvsearch method searches for a key stored via the kvupdate command.
	 * This feature is only available for asset chains.
	 * @param config
	 * @param key
	 * @return KvSearchOutputModel
	 */
	public KvSearchOutputModel kvSearch(Configurations config, String key) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KV_SEARCH, StringConstants.DOUBLE_QUOTE+key+StringConstants.DOUBLE_QUOTE);
		KvSearchOutputModel outputModel = new Gson().fromJson(output, KvSearchOutputModel.class);
		return outputModel;
	}
	
	/**
	 * kvupdate "key_string" "value_string" days "passphrase_string"
	 * The kvupdate method stores a key/value pair via OP_RETURN.
	 * This feature is available only for asset chains. The maximum value memory size is 8kB.
	 * @param config
	 * @param key
	 * @param value
	 * @param days
	 * @return KvUpdateOutputModel
	 */
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
	
	/**
	 * kvupdate "key_string" "value_string" days "passphrase_string"
	 * The kvupdate method stores a key/value pair via OP_RETURN.
	 * This feature is available only for asset chains. The maximum value memory size is 8kB.
	 * @param config
	 * @param key
	 * @param value
	 * @param days
	 * @param passPhrase
	 * @return KvUpdateOutputModel
	 */
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
	
	/**
	 * minerids height
	 * The minerids method returns information about the notary nodes and external miners at a specific block height. 
	 * The response will calculate results according to the 2000 blocks proceeding the indicated "height" block
	 * @param config
	 * @param heights
	 * @return MinerIdsOutputModel
	 */
	public MinerIdsOutputModel minerIds(Configurations config, int heights) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MINER_IDS, StringConstants.DOUBLE_QUOTE+heights+StringConstants.DOUBLE_QUOTE);
		MinerIdsOutputModel outputModel = new Gson().fromJson(output, MinerIdsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * notaries height timestamp
	 * The notaries method returns the public key, BTC address, and KMD address for each Komodo notary node.
	 * @param config
	 * @param height
	 * @param timeStamp
	 * @return NotariesOutputModel
	 */
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
	
	/**
	 * notaries timestamp
	 * The notaries method returns the public key, BTC address, and KMD address for each Komodo notary node.
	 * @param config
	 * @param timeStamp
	 * @return NotariesOutputModel
	 */
	public NotariesOutputModel notaries(Configurations config, long timeStamp ) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(timeStamp);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, params.toString());
		NotariesOutputModel outputModel = new Gson().fromJson(output, NotariesOutputModel.class);
		return outputModel;
	}
	
	/**
	 * notaries height
	 * The notaries method returns the public key, BTC address, and KMD address for each Komodo notary node.
	 * @param config
	 * @param height
	 * @return NotariesOutputModel
	 */
	public NotariesOutputModel notaries(Configurations config, int height) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.NOTARIES, StringConstants.DOUBLE_QUOTE+height+StringConstants.DOUBLE_QUOTE);
		NotariesOutputModel outputModel = new Gson().fromJson(output, NotariesOutputModel.class);
		return outputModel;
	}
	
	/**
	 * verifychain ( checklevel numblocks )
	 * The verifychain method verifies the coin daemon's blockchain database.
	 * Depending on the state of your blockchain database and daemon, this call can take a prolonged period of time to complete.
	 * @param config
	 * @return boolean
	 */
	public boolean verifyChain(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_CHAIN, null);
		boolean outputModel = Boolean.parseBoolean(new Gson().fromJson(output, OutputModel.class).getResult());
		return outputModel;
	}
	
	/**
	 * verifytxoutproof "proof_string"
	 * The verifytxoutproof method verifies that a proof points to a transaction in a block. 
	 * It returns the transaction to which the proof is committed,
	 * or it will throw an rpc error if the block is not in the current best chain
	 * @param config
	 * @param proofString
	 * @return ListResultOutModel
	 */
	public ListResultOutModel verifyTxOutProof(Configurations config, String proofString) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_TXOUT_PROOF, StringConstants.DOUBLE_QUOTE+proofString+StringConstants.DOUBLE_QUOTE);
		ListResultOutModel outputModel = new Gson().fromJson(output, ListResultOutModel.class);
		return outputModel;
	}

}
