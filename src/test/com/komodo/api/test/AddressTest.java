package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.ListResultOutModel;
import com.komodo.api.models.address.AddressMempoolOutModel;
import com.komodo.api.models.address.AddressUtxosChainInfoOutModel;
import com.komodo.api.models.address.AddressUtxosOutModel;
import com.komodo.api.models.address.DeltasOutputWithStartEnd;
import com.komodo.api.models.address.GetAddressBalanceOutputModel;
import com.komodo.api.models.address.ListDeltasOutputModel;
import com.komodo.api.models.address.SnapshotOutputModel;
import com.komodo.api.sections.AddressApi;

public class AddressTest {
	
	@Test
	public void testGetAddressBalance() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		GetAddressBalanceOutputModel output = address.getAddressBalance(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().getReceived());
	}
	
	@Test
	public void testGetAddressDeltas() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		ListDeltasOutputModel output = address.getAddressDeltas(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
	}
	
	@Test
	public void testGetAddressDeltasStartEnd() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		DeltasOutputWithStartEnd output = address.getAddressDeltas(config, addresses, 0,199, false);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getDeltas().get(0).getAddress());
	}
	
	@Test
	public void testAddressMemPool() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		AddressMempoolOutModel output = address.getAddressMemPool(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
	}
	
	@Test
	public void testGetAddressTxIds() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		ListResultOutModel output = address.getAddressTxIds(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0));
	}
	
	@Test
	public void testGetAddressTxIdsStartEnd() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		ListResultOutModel output = address.getAddressTxIds(config, addresses, 1, 99);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0));
	}
	
	@Test
	public void testGetAddressUtxosChainInfoFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		AddressUtxosOutModel output = address.getAddressUtxosChainInfoFalse(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0));
		assertNotNull(output.getResult().get(0).getAddress());
	}
	
	@Test
	public void testGetAddressUtxosChainInfoTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		List<String> addresses = new ArrayList<String>();
		addresses.add("RX8JcC2RPw57i2u4cHFbLttSsnBC4so9XA");
		addresses.add("RWTY5bvzbeohdsYm7zb55D3dmgnHjb4crr");
		addresses.add("RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		addresses.add("RL4wdy6HDE9s9LwRxH7prrmR9dUXTNZk73");
		AddressUtxosChainInfoOutModel output = address.getAddressUtxosChainInfoTrue(config, addresses);
		assertNull(output.getError());
		assertNotNull(output);
		assertNotNull(output.getResult().getUtxos());
		assertNotNull(output.getResult().getUtxos().get(0).getAddress());
	}
	
	@Test
	public void testSnapShotTop() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		SnapshotOutputModel output = address.getSnapshot(config, 5);
		assertNull(output.getError());
		assertNotNull(output);
	}
	
	@Test
	public void testSnapShot() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		AddressApi address = new AddressApi();
		SnapshotOutputModel output = address.getSnapshot(config);
		assertNull(output.getError());
		assertNotNull(output);
	}

}
