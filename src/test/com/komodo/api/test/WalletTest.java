package com.komodo.api.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.ArrayList;
import java.util.List;

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
	public void testGetNewAddressAccount() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		WalletApi walletApi = new WalletApi();
		OutputModel output = walletApi.getNewAddress(config, "");
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
		OutputModel output = walletApi.sendToAddress(config, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs", 0.00010, "", "", true);
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
		System.out.println(output.getResult());
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
		System.out.println(output.getResult());
		assertNull(output.getError());
	}

}
