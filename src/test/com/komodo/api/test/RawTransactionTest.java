package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.rawtransactions.DecodeRawTxOutputModel;
import com.komodo.api.models.rawtransactions.DecodeScriptOutputModel;
import com.komodo.api.models.rawtransactions.FundRawTxOutputModel;
import com.komodo.api.models.rawtransactions.RawTransactionOutputModel;
import com.komodo.api.models.rawtransactions.SignRawTxOutputModel;
import com.komodo.api.sections.RawTransactionsApi;

public class RawTransactionTest {
	
	@Test
	public void testCreateRawTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		OutputModel output = rawTransaction.createRawTransaction(config, "9f44dc664882198b14e9a8c466d466efcdd070ccb6f57be8e2884aa11e7b2a30", 0, "RUJPJX49M4FxmVrRJ6w5XWLtUeRHhfJzTw", 2.01);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testDecodeRawTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		DecodeRawTxOutputModel output = rawTransaction.decodeRawTransaction(config, "0400008085202f8901302a7b1ea14a88e2e87bf5b6cc70d0cdef66d466c4a8e9148b19824866dc449f0000000000ffffffff014004fb0b000000001976a91456def632e67aa11c25ac16a0ee52893c2e5a2b6a88ac000000009b0000000000000000000000000000");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getTxId());
	}
	
	@Test
	public void testDecodeScript() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		DecodeScriptOutputModel output = rawTransaction.decodeScript(config, "0400008085202f8901302a7b1ea14a88e2e87bf5b6cc70d0cdef66d466c4a8e9148b19824866dc449f0000000000ffffffff014004fb0b000000001976a91456def632e67aa11c25ac16a0ee52893c2e5a2b6a88ac000000009b0000000000000000000000000000");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAsm());
		
	}
	
	@Test
	public void testFundRawTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		FundRawTxOutputModel output = rawTransaction.fundRawTransaction(config, "0400008085202f8901302a7b1ea14a88e2e87bf5b6cc70d0cdef66d466c4a8e9148b19824866dc449f0000000000ffffffff014004fb0b000000001976a91456def632e67aa11c25ac16a0ee52893c2e5a2b6a88ac000000009b0000000000000000000000000000");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getHex());
		
	}
	
	@Test
	public void testGetRawTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		OutputModel output = rawTransaction.getRawTransaction(config, "9f44dc664882198b14e9a8c466d466efcdd070ccb6f57be8e2884aa11e7b2a30");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		
	}
	
	@Test
	public void testGetRawTransactionVerbose() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		RawTransactionOutputModel output = rawTransaction.getRawTransaction(config, "9f44dc664882198b14e9a8c466d466efcdd070ccb6f57be8e2884aa11e7b2a30", 1);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getHex());
		
	}
	
	@Test
	public void testSendRawTransactionVerbose() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		OutputModel output = rawTransaction.sendRawtransction(config, "0400008085202f8901302a7b1ea14a88e2e87bf5b6cc70d0cdef66d466c4a8e9148b19824866dc449f0000000000ffffffff014004fb0b000000001976a91456def632e67aa11c25ac16a0ee52893c2e5a2b6a88ac000000009b0000000000000000000000000000", false);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		
	}
	
	@Test
	public void testSignRawTransactionVerbose() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		RawTransactionsApi rawTransaction = new RawTransactionsApi();
		SignRawTxOutputModel output = rawTransaction.signRawtransaction(config, "0400008085202f8901302a7b1ea14a88e2e87bf5b6cc70d0cdef66d466c4a8e9148b19824866dc449f0000000000ffffffff014004fb0b000000001976a91456def632e67aa11c25ac16a0ee52893c2e5a2b6a88ac000000009b0000000000000000000000000000");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getHex());
	}

}
