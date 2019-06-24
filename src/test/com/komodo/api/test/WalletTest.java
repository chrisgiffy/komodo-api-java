package com.komodo.api.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
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
		OutputModel outputModel = walletApi.getBalance(config);
		assertDoesNotThrow(() -> Double.parseDouble(outputModel.getResult()));
		System.out.println(outputModel.getError());
		assertEquals(null, outputModel.getError());
		assertEquals(config.getId(), outputModel.getId());
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
		OutputModel outputModel = walletApi.getBalance(config, 10);
		assertDoesNotThrow(() -> Double.parseDouble(outputModel.getResult()));
		System.out.println(outputModel.getError());
		assertEquals(null, outputModel.getError());
		assertEquals(config.getId(), outputModel.getId());
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
		OutputModel outputModel = walletApi.getBalance(config, 10, true);
		assertDoesNotThrow(() -> Double.parseDouble(outputModel.getResult()));
		System.out.println(outputModel.getError());
		assertEquals(null, outputModel.getError());
		assertEquals(config.getId(), outputModel.getId());
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
		OutputModel outputModel = walletApi.getBalance(config, 10, false);
		assertDoesNotThrow(() -> Double.parseDouble(outputModel.getResult()));
		System.out.println(outputModel.getError());
		assertEquals(null, outputModel.getError());
		assertEquals(config.getId(), outputModel.getId());
	}

}
