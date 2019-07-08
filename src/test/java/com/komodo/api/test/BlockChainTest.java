package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

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
import com.komodo.api.models.util.BooleanOutputModel;
import com.komodo.api.sections.BlockChainApi;

public class BlockChainTest {
	
	@Test
	public void testCoinSupply() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		CoinSupplyOutputModel output = blockChain.coinSupply(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getResult());
	}
	
	@Test
	public void testCoinSupplyHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		CoinSupplyOutputModel output = blockChain.coinSupply(config,100);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getResult());
	}
	
	@Test
	public void testBestBlockHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBestBlockHash(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockVerboseFalseHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBlockVerboseFalse(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockVerboseTrueHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockOutputModel output = blockChain.getBlockVerboseTrue(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAnchor());
	}
	
	@Test
	public void testGetBlockVerboseFalseHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBlockVerboseFalse(config, "00cda36f2d850ea58bc99b7ad796940abdebbf956143de8c79eb9ecc1a61c263");
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockVerboseTrueHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockOutputModel output = blockChain.getBlockVerboseTrue(config, "00cda36f2d850ea58bc99b7ad796940abdebbf956143de8c79eb9ecc1a61c263");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAnchor());
	}
	
	@Test
	public void testGetBlockCount() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBlockCount(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBlockHash(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetDifficulty() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getDifficulty(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockChainInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockChainInfoOutputModel output = blockChain.getBlockchainInfo(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getBlockHash());
	}
	
	@Test
	public void testGetBlockHashesFalseFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ListResultOutModel output = blockChain.getBlockHashesLogicTimeFalse(config, 1561748430872L, 1531614498, false);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockHashesFalseTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockHashesOutputModel output = blockChain.getBlockHashesLogicTimeTrue(config, 1561748430872L, 1531614498, false);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().get(0).getBlockHash());
	}
	
	@Test
	public void testGetBlockHashesTrueTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockHashesOutputModel output = blockChain.getBlockHashesLogicTimeTrue(config, 1561748430872L, 1531614498, true);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().get(0).getBlockHash());
	}
	
	@Test
	public void testGetBlockHashesTrueFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ListResultOutModel output = blockChain.getBlockHashesLogicTimeFalse(config, 1561748430872L, 1531614498, true);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testGetBlockHeaderTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		BlockHeaderOutputModel output = blockChain.getBlockHeaderVerboseTrue(config, "00cda36f2d850ea58bc99b7ad796940abdebbf956143de8c79eb9ecc1a61c263");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getChainWork());
	}
	
	@Test
	public void testGetBlockHeaderFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getBlockHeaderVerboseFalse(config, "00cda36f2d850ea58bc99b7ad796940abdebbf956143de8c79eb9ecc1a61c263");
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testChainTips() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ChainTipsOutputModel output = blockChain.getChainTips(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().get(0).getHash());
	}
	
	@Test
	public void testChainTxStats() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ChainTxStatsOutputModel output = blockChain.getChainTxStats(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getWindowFinalBlockHash());
	}
	
	@Test
	public void testChainTxStatsWithBlocks() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ChainTxStatsOutputModel output = blockChain.getChainTxStats(config, 1);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getWindowFinalBlockHash());
	}
	
	@Test
	public void testChainTxStatsWithHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ChainTxStatsOutputModel output = blockChain.getChainTxStats(config, "006b6c9ff54e8f0ff74a528f2ca15cc174e334ab5e0b65dba4df998152d598d2");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getWindowFinalBlockHash());
	}
	
	@Test
	public void testChainTxStatsWithBlocksAndHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ChainTxStatsOutputModel output = blockChain.getChainTxStats(config, 1, "006b6c9ff54e8f0ff74a528f2ca15cc174e334ab5e0b65dba4df998152d598d2");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getWindowFinalBlockHash());
	}
	
	@Test
	public void testLastSegIdStakes() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		LastSegIdStakesOutputModel output = blockChain.getLastSegIdStakes(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testMemPoolInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		MemPoolInfoOutputModel output = blockChain.getMemPoolInfo(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getBytes());
	}
	
	@Test
	public void testRawMemPoolFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ListResultOutModel output = blockChain.getRawMemPoolVerboseFalse(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
	}
	
	@Test
	public void testRawMemPoolTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		RawMemPoolOutputModel output = blockChain.getRawMemPoolVerboseTrue(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
	}
	
	@Test
	public void testSpentInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		SpentInfoOutputModel output = blockChain.getSpentInfo(config, "78a763b74d622b2c8b6d0e8eeb515d4bc1f7461af212b42e5aeb1651879cb5be", 0);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getTxId());
	}
	
	@Test
	public void testTxOutMemPoolFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		TxOutputModel output = blockChain.getTxOut(config, "78a763b74d622b2c8b6d0e8eeb515d4bc1f7461af212b42e5aeb1651879cb5be", 1, false);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getBestBlock());
	}
	
	@Test
	public void testTxOutMemPoolTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		TxOutputModel output = blockChain.getTxOut(config, "78a763b74d622b2c8b6d0e8eeb515d4bc1f7461af212b42e5aeb1651879cb5be", 1, true);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getBestBlock());
	}
	
	@Test
	public void testTxOutProof() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getTxOutProof(config, "103eae043a26f935c17bab4926543eaeb1b68642cc90e998065374c989c2bc5d");
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testTxOutProofWithHash() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		OutputModel output = blockChain.getTxOutProof(config, "103eae043a26f935c17bab4926543eaeb1b68642cc90e998065374c989c2bc5d",
				"0249f62d134e6ced532a65dc8bc1e876668c3bafa528dd6901c8089d742052bb");
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testTxOutSetInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		TxOutSetInfoOutputModel output = blockChain.getTxOutSetInfo(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getBestBlock());
		assertTrue(0 < output.getResult().getHeight());
	}
	
	@Test
	public void testKvSearch() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		KvSearchOutputModel output = blockChain.kvSearch(config, "example");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getCoin());
		assertTrue(0 < output.getResult().getHeight());
	}
	
	@Test
	public void testKvUpdate() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		KvUpdateOutputModel output = blockChain.kvUpdate(config, "example", "examplevalue", 2);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getCoin());
		assertTrue(0 < output.getResult().getHeight());
	}
	
	@Test
	public void testKvUpdateWithPassword() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		KvUpdateOutputModel output = blockChain.kvUpdate(config, "example", "examplevalue", 2, "pass");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getCoin());
		assertTrue(0 < output.getResult().getHeight());
	}
	
	@Test
	public void testMinerIds() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		MinerIdsOutputModel output = blockChain.minerIds(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getMined());
		assertTrue(0 < output.getResult().getMined().size());
		assertNotNull(output.getResult().getMined().get(0).getKmdAddress());
	}
	
	@Test
	public void testNotariesHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		NotariesOutputModel output = blockChain.notaries(config, 10);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getNotaries());
		assertTrue(0 < output.getResult().getNotaries().size());
		assertNotNull(output.getResult().getNotaries().get(0).getKmdAddress());
	}
	
	@Test
	public void testNotariesTimeStampHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		NotariesOutputModel output = blockChain.notaries(config, 10, 1536365515);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getNotaries());
		assertTrue(0 < output.getResult().getNotaries().size());
		assertNotNull(output.getResult().getNotaries().get(0).getKmdAddress());
	}
	
	@Test
	public void testNotariesTimeStamp() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		NotariesOutputModel output = blockChain.notaries(config, 1536365515L);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getNotaries());
		assertTrue(0 < output.getResult().getNotaries().size());
		assertNotNull(output.getResult().getNotaries().get(0).getKmdAddress());
	}
	
	@Test
	public void testVerifyChain() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		boolean output = blockChain.verifyChain(config);
		assertTrue(output);
	}
	
	@Test
	public void testVerifyTxOutProof() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		BlockChainApi blockChain = new BlockChainApi();
		ListResultOutModel output = blockChain.verifyTxOutProof(config, "040000007b9bf7bf1587bef9c72cc0b0dea5201c3d8e710a1"
				+ "9fbf3c42a828942f3d042025f494896b1ab83ac850353d081ea05579bf820fd6dac0b7ef5ba25d89db969bdfbc2f4"
				+ "300c01f0b7820d00e3347c8da4ee614674376cbc45359daa54f9b5493ed579cf5cd1dd022001004bad4c9dd261ff1"
				+ "7644a7c2ceaf13a180839974b5d7756fcb23e2f400000fd400500466737c15639e54b43c0ba9c8cca1108da9eb80d3"
				+ "c373ae6822f610db280a5f95a6f4b41e755b45cfe10443d270605570eebac943d1651343f752bdcbb74305d318e519"
				+ "eaa93c0d6149b90ba4d6ef16417b2ed1eab11a587e36785a26e223ae27edadd3317b97bb520267da16a6daf357b80e3"
				+ "f329399ce2bd0f97f5f22d11a5f940e14be71d852360675e0b766f3119e6d14e6f3f89191451b1a662e8b54f6a229f0"
				+ "4a83f0cb80ee00e608832babddf14b2989d56321ad25bfde36e3a08d695795a15ed8f9bb7dde45627a60b17b5c91911"
				+ "4aad73415447b12271e2e9e353a99f6d0ebf9d8340704667db14e55d548bc41413e87ce717bf1f75651ced2f28dca1b"
				+ "e5d7d92d2df94735574db87d166f61e656abebb565dbfb14f17679cc244ff0b15fa66af219c17d6d2d50e5123dbf2cd"
				+ "6d7688f0d7f5b1c0a92b77c760914f53811b5d92c6fff2a1963bb552928601e7a7b4886db0a56dae0102abca2ee50bd"
				+ "8ac3005257cf9d86a4d93fcf76482aac06036d0de5bf3636525163b0d9696f309453487ea66d0117631d95f59283be1"
				+ "e224fb68c301a7e0d84b875bfe6ab624fd05bf063a0afafc03a0895a7dd0e8dc5f842a1b2054c5215de7b6ebeee5c75"
				+ "9d0ff27d2eef43ab6e2e63764620718dc43916ea609d289c107fef823cd281ed3d2a128b5fbad42ae7ab1dff266c3dd3b"
				+ "579225465738340427374ee3cf92f72f75278af94133db5f8abce400044cb785bd96bb5b1971b05fcd70701da4cbb1144"
				+ "90a28d733f2103fbd32b0120a71761a69bcdb3fd6e51dfc16a73d20a00952727498066b3b02934dd9a3100646b6055a5a"
				+ "5168e482049e1fc18891730b3bdf8617dd1cd2f5dfff07a619419e340d4d0611b57f51ab1f2c53e23b3a6d7dfb7956992"
				+ "9b9c1e28ede355bb51fc1647e36991248f53e643eeeb8c976ddba5bd0db020da31bbec41d256eea4025280a2b210c9839"
				+ "8cf41ea0269b5c501e76a8a6727a7dd3272e3c2632b094070cadbf3dccfedcf654b271b6bebbc9495dcd76bd34a075e8c"
				+ "aea1cbfc821885bde5fca32174f73396804687ecbca0cdc5d63e595887eba0d7295043ac5990b5707e434565c49eae172"
				+ "1f60c082b1d3f013d7cb5c5c1623f7ad7be9871c7655397f2e72c2b2b6c37f79fc65690fefbbab96dc481898d4b1a22b1"
				+ "fbdecd60223203f930e2206ffed41e14faac7207b2c18aab8331d1a057813a74753f7e4bf04cb33798f88acfa590be683"
				+ "b800c636dfd11644d9a3c77a45b7e7bdf9361af37e423dd27c24d5ebd45b052a755d7744320257085c3ae5d2e0eb99837"
				+ "8f36c036e6ec4f83f187da82c471efb97e917c1a8662b231efd64675298bb44ad15d7da8caaaa6acfda1a01cffbf5f575"
				+ "1be88e7e961d0571b3f769df615c3532c7677fbe29699bb01d8d04308486e4e673c364d32594caade5398ef730d5f738c"
				+ "485c1e8e260d9663586cc755c24fa1f2b11e6880d614c919dccd5ad5b97610f93742eb91029fc6e181024a7513f23ffbf"
				+ "728d2557bfbb1dfdb8f1d2c37a0d56e7951b96214f743af66e4039ded1e2dcb464f117d6fc451959a63f4cd2b609b9daf"
				+ "9f58b5bed037e1338bd562549b82b03b6b2be929a063f01bbfc3641268d02fe5450a50574f264b0544fe1ee3d00ff38da"
				+ "0640b65c09c9938934ff509f59ad1cd30da5dd11102d6a8b5dcba09a73e65bb6a676391f7243519847641da37381ad285"
				+ "d538b5093e793c39aff1df91907cf2abfef065e212205baf5063341dd92ca2e0b755d4e12cccc37450635d8f48127778a"
				+ "fba2ab48561d2a1f17812c4026d5a2850de0abd75b729b67107fbcf999214bb338b9cdeaf9e832b21f945af069f69efbd"
				+ "53439d52fff81d20e10a0e654e7b8bce3b6db1cdc12ab01000000015f494896b1ab83ac850353d081ea05579bf820fd6d"
				+ "ac0b7ef5ba25d89db969bd0101");
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().get(0));
	}

}
