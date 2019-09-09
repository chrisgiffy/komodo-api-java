package com.komodo.api.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.ListResultOutModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.wallet.BooleanResultOutputModel;
import com.komodo.api.models.wallet.ListAddressGroupingsOutputModel;
import com.komodo.api.models.wallet.ListInCEBlockOutputModel;
import com.komodo.api.models.wallet.ListLockUnspentOutputModel;
import com.komodo.api.models.wallet.ListReceivedByAddressOutputModel;
import com.komodo.api.models.wallet.ListTransactionsOutputModel;
import com.komodo.api.models.wallet.ListUnspentOutputModel;
import com.komodo.api.models.wallet.SetPubKeyOutputModel;
import com.komodo.api.models.wallet.TransactionOutputModel;
import com.komodo.api.models.wallet.WalletInfoOutputModel;
import com.komodo.api.models.wallet.ZListReceivedByAddressOutputModel;
import com.komodo.api.models.wallet.ZListUnspentOutputModel;
import com.komodo.api.models.wallet.ZOperationResultOutputModel;
import com.komodo.api.models.wallet.ZOperationStatusOutputModel;
import com.komodo.api.models.wallet.ZShieldCoinbaseOutputModel;
import com.komodo.api.models.wallet.ZTotalBalanceOutputModel;
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
	public void testGetBalanceWithAndMinConf() {
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
	
	@Test
	public void testImportAddressRescanTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.importAddress(config, "RJSDZjp7kjBNhHsbECDE1jwYNK7af41pZN", true, "SCRATCH");
		assertNotNull(output);
		assertNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testImportAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.importAddress(config, "RJSDZjp7kjBNhHsbECDE1jwYNK7af41pZN", false, "SCRATCH");
		assertNotNull(output);
		assertNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testImportPrivKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.importPrivKey(config, "UwibHKsYfiM19BXQmcUwAfw331GzGQK8aoPqqYEbyoPrzc2965nE", false, "test");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testImportPrivKeyRescanTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.importPrivKey(config, "UwibHKsYfiM19BXQmcUwAfw331GzGQK8aoPqqYEbyoPrzc2965nE", true, "test");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testKeyPoolRefill() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.keyPoolRefill(config);
		assertNotNull(output);
		assertNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testKeyPoolRefillNewSize() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.keyPoolRefill(config,100);
		assertNotNull(output);
		assertNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testListAddressGroupings() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListAddressGroupingsOutputModel output = walletApi.listAddressGroupings(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertTrue(2 == output.getResult().get(0).size());
		assertNull(output.getError());
	}
	
	@Test
	public void testListLoclUnspent() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListLockUnspentOutputModel output = walletApi.listLockUnspent(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getTxId());
		assertNull(output.getError());
	}
	
	@Test
	public void testListReceivedByAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListReceivedByAddressOutputModel output = walletApi.listReceivedByAddress(config, 1, false, false);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getTxIds().get(0));
		assertNull(output.getError());
	}
	
	@Test
	public void testListInCEBlock() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListInCEBlockOutputModel output = walletApi.listInCeBlock(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getTransactions());
		assertNotNull(output.getResult().getLastBlock());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testListInCEBlockFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListInCEBlockOutputModel output = walletApi.listInCeBlock(config, 
				"05686392a3011a180988246b3b0343bc4eec992c101d2e651c6ee786af1b2fb5", 6, false);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getTransactions());
		assertNotNull(output.getResult().getLastBlock());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testListInCEBlockTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListInCEBlockOutputModel output = walletApi.listInCeBlock(config, 
				"05686392a3011a180988246b3b0343bc4eec992c101d2e651c6ee786af1b2fb5", 6, true);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getTransactions());
		assertNotNull(output.getResult().getLastBlock());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testListTransactions() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListTransactionsOutputModel output = walletApi.listTransactions(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testListTransactionsParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListTransactionsOutputModel output = walletApi.listTransactions(config, 10, 0, true);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testListUnspent() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RJSDZjp7kjBNhHsbECDE1jwYNK7af41pZN");
		ListUnspentOutputModel output = walletApi.listUnspent(config, 1, 9999999, addresses);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testLockUnspent() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		BooleanResultOutputModel output = walletApi.lockUnspent(config, false, "78a763b74d622b2c8b6d0e8eeb515d4bc1f7461af212b42e5aeb1651879cb5be", 0);
		assertNotNull(output);
		assertTrue(output.getResult());
	}
	
	@Test
	public void testResendWalletTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListResultOutModel output = walletApi.resentWalletTransaction(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSendToAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.sendToAddress(config, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs", 100,  "donation", "seans outpost", true);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSetPubKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		SetPubKeyOutputModel output = walletApi.setPubKey(config, "0260801166cebdc9be1e3460ba9e4959fb29feee7725f565ffc296fa4636aa706f");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAddress());
		assertNull(output.getError());
	}
	
	@Test
	public void testSetTxFee() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		BooleanResultOutputModel output = walletApi.setTxFee(config, 0.000100);
		assertNotNull(output);
		assertTrue(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSignMessage() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.signMessage(config, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs", "hello");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testBackupWallet() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.backupWallet(config, "mybackup");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testDumpPrivKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.dumpPrivKey(config, "RTcwYaQPDVN7V9SdfFHARWnoB7vcpSfdvs");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSendMany() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		Map<String,Double> addressAmountMap = new HashMap<String,Double>();
		addressAmountMap.put("RTcwYaQPDVN7V9SdfFHARWnoB7vcpSfdvs", 10.0);
		addressAmountMap.put("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr", 10.0);
		addressAmountMap.put("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA", 10.0);
		OutputModel output = walletApi.sendMany(config, "", addressAmountMap, 1, "test");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSendManyParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		Map<String,Double> addressAmountMap = new HashMap<String,Double>();
		addressAmountMap.put("RTcwYaQPDVN7V9SdfFHARWnoB7vcpSfdvs", 10.0);
		addressAmountMap.put("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr", 10.0);
		addressAmountMap.put("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA", 10.0);
		List<String> addresses = new ArrayList<String>();
		addresses.add("RTcwYaQPDVN7V9SdfFHARWnoB7vcpSfdvs");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		OutputModel output = walletApi.sendMany(config, "", addressAmountMap, 1, "test", addresses);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testSendManyParamsSingleAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		Map<String,Double> addressAmountMap = new HashMap<String,Double>();
		addressAmountMap.put("RTcwYaQPDVN7V9SdfFHARWnoB7vcpSfdvs", 10.0);
		addressAmountMap.put("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr", 10.0);
		addressAmountMap.put("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA", 10.0);
		OutputModel output = walletApi.sendMany(config, "", addressAmountMap, 1, "test", "RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZExportKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zExportKey(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZExportViewingKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zExportViewingKey(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZExportWallet() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zExportWallet(config, "test");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zgetBalance(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetBalanceMinConf() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zgetBalance(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy",1);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetNewAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zGetNewAddress(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetOperationResult() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZOperationResultOutputModel output = walletApi.zGetOperationResult(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetOperationResultParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> operationIds = new ArrayList<String>();
		operationIds.add("opid-47e12224-8477-4cd4-852d-d8c3ddbc6375");
		ZOperationResultOutputModel output = walletApi.zGetOperationResult(config, operationIds);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetOperationStatus() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZOperationStatusOutputModel output = walletApi.zGetOperationStatus(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetOperationStatusParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> operationIds = new ArrayList<String>();
		operationIds.add("opid-47e12224-8477-4cd4-852d-d8c3ddbc6375");
		ZOperationStatusOutputModel output = walletApi.zGetOperationStatus(config, operationIds);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetTotalBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZTotalBalanceOutputModel output = walletApi.zGetTotalBalance(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetTotalBalanceWatchOnlyTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZTotalBalanceOutputModel output = walletApi.zGetTotalBalance(config, 1, true);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZGetTotalBalanceWatchOnlyFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZTotalBalanceOutputModel output = walletApi.zGetTotalBalance(config, 1, false);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZImportKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zImportKey(config, "DONOTUSExxxxxxxxxxxxxxxxBP6ipkmBxmEQbugcCQ16vUaWGFK");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZImportKeyParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zImportKey(config, "DONOTUSExxxxxxxxxxxxxxxxBP6ipkmBxmEQbugcCQ16vUaWGFK", "no", 0);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZImportViewingKey() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zImportViewingKey(config, "ZiVtfYkeyRY3y8Wykm5zjLcnssEkVrkej6j3kQ5B1AE2qp2F3VsKzpoXTzD82hrvMjWB9WxCHbXXrXax2ceyHLWrnQDaMrMja");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZImportViewingKeyParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zImportViewingKey(config, "ZiVtfYkeyRY3y8Wykm5zjLcnssEkVrkej6j3kQ5B1AE2qp2F3VsKzpoXTzD82hrvMjWB9WxCHbXXrXax2ceyHLWrnQDaMrMja", "no", 0);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZImportWallet() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.zImportWallet(config, "test");
		assertNotNull(output);
		assertNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListAddressesFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListResultOutModel output = walletApi.zListAddresses(config, false);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListAddressesTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListResultOutModel output = walletApi.zListAddresses(config, true);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListOperationIds() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListResultOutModel output = walletApi.zListOperationIds(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListOperationIdsParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ListResultOutModel output = walletApi.zListOperationIds(config, "success");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListReceivedByAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZListReceivedByAddressOutputModel output = walletApi.zListReceivedByAddress(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy", 1);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListUnspent() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZListUnspentOutputModel output = walletApi.zListUnspent(config);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZListUnspentParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> addresses =  new ArrayList<String>();
		addresses.add("zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy");
		ZListUnspentOutputModel output = walletApi.zListUnspent(config, 1, 6, true, addresses);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNull(output.getError());
	}
	
	@Test
	public void testZSendMany() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		Map<String,Double> addresses =  new HashMap<String,Double>();
		addresses.put("zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy",0.001);
		OutputModel output = walletApi.zSendMany(config, "zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy", addresses);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testZShieldCoinBase() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		ZShieldCoinbaseOutputModel output = walletApi.zShieldCoinBase(config, "RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA", 
				"zs1m89nkzw3cqc6ds9ujttrrt2q3qnplzf8annd0xl468k4w6sr92xsfkcxwnhg8wumejsmxuwujsy", 0.001, 50);
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testaddMultiSigAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> keysObject = new ArrayList<String>();
		keysObject.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		keysObject.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		OutputModel output = walletApi.addMultiSigAddress(config, 2, keysObject );
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	@Test
	public void testaddMultiSigAddressParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		List<String> keysObject = new ArrayList<String>();
		keysObject.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		keysObject.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		OutputModel output = walletApi.addMultiSigAddress(config, 2, keysObject, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		assertNotNull(output);
		assertNotNull(output.getResult());
		assertNull(output.getError());
	}
	
	
}
