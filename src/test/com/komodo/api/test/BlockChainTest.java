package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.blockchain.BlockOutputModel;
import com.komodo.api.models.blockchain.CoinSupplyOutputModel;
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
	public void testGetBlockHashes() {
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

}
