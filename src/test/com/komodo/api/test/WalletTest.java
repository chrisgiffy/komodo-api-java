package com.komodo.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.wallet.TransactionOutputModel;
import com.komodo.api.models.wallet.WalletInfoOutputModel;
import com.komodo.api.sections.WalletApi;

public class WalletTest {
	
	@Test
	public void testGetBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getBalance(config);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
	}
	
	@Test
	public void testGetBalanceWithMinConf() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getBalance(config, 10);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
	}
	
	@Test
	public void testGetBalanceWithIncludeWatchOnlyTrueAndMinConf() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getBalance(config, 10, true);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
	}
	
	@Test
	public void testGetBalanceWithIncludeWatchOnlyFalseAndMinConf() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getBalance(config, 10, false);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
	}
	
	@Test
	public void testGetNewAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getNewAddress(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
		assertNotEquals("", output.getResult());
	}
	
	@Test
	public void testGetRawChangeAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getRawChangeAddress(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
		assertNotEquals("", output.getResult());
	}
	
	@Test
	public void testGetReceivedByAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getReceivedByAddress(config, "RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testGetReceivedByAddressMinConf() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getReceivedByAddress(config, "RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73", 10);
		assertNotNull(output);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
		assertNull(output.getError());
	}
	
	@Test
	public void testGetTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		TransactionOutputModel txOutModel = walletApi.getTransaction(config, "78a763b74d622b2c8b6d0e8eeb515d4bc1f7461af212b42e5aeb1651879cb5be", true);
		assertNotNull(txOutModel);
		txOutModel.getAmount();
		txOutModel.getBlockhash();
		txOutModel.getBlockindex();
		txOutModel.getConfirmations();
		txOutModel.getTxid();
	}
	
	@Test
	public void testUnconfirmedBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getUnconfirmedBalance(config);
		assertNotNull(output);
		assertDoesNotThrow(() -> Double.parseDouble(output.getResult()));
		assertNull(output.getError());
	}
	
	@Test
	public void testWalletInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		WalletInfoOutputModel output = walletApi.getWalletInfo(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}

}
