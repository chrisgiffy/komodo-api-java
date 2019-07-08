package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.network.AddedNodeInfoOutputModel;
import com.komodo.api.models.network.DeprecationInfoOutputModel;
import com.komodo.api.models.network.ListBannedOutputModel;
import com.komodo.api.models.network.NetTotalsOutputModel;
import com.komodo.api.models.network.NetworInfoOutputModel;
import com.komodo.api.models.network.PeerInfoOutputModel;
import com.komodo.api.sections.NetworkApi;

public class NetworkTest {
	
	@Test
	public void testDisconnectNode() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.disconnectNode(config, "10.4.96.127:8250");
		assertNotNull(output);
	}
	
	@Test
	public void testClearBanned() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.clearBanned(config);
		assertNotNull(output);
	}
	
	/*
	 * @Test public void testAddNode() { Configurations config = new
	 * Configurations(); config.setId("curlTest"); config.setIp("127.0.0.1");
	 * config.setPort("8251"); config.setUsername("user1922998069");
	 * config.setPassword(
	 * "pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
	 * 
	 * NetworkApi network = new NetworkApi(); OutputModel output =
	 * network.addNode(config, "10.4.96.127:8250", "onetry"); assertNotNull(output);
	 * }
	 */
	
	@Test
	public void testGetAddedNodeInfoFalse() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		AddedNodeInfoOutputModel output = network.getAddedNodeInfo(config, false);
		assertNotNull(output);
		assertNull(output.getError());
		assertTrue(output.getResult().size() > 0);
		assertNotNull(output.getResult().get(0).getAddednode());
	}
	
	@Test
	public void testGetAddedNodeInfoTrue() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		AddedNodeInfoOutputModel output = network.getAddedNodeInfo(config, true);
		assertNotNull(output);
		assertNull(output.getError());
		assertTrue(output.getResult().size() > 0);
		assertNotNull(output.getResult().get(0).getAddednode());
	}
	
	@Test
	public void testGetAddedNodeInfoFalseWithIp() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		AddedNodeInfoOutputModel output = network.getAddedNodeInfo(config, false, "10.4.96.127:8250");
		assertNotNull(output);
		assertNull(output.getError());
		assertTrue(output.getResult().size() > 0);
		assertNotNull(output.getResult().get(0).getAddednode());
	}
	
	@Test
	public void testGetAddedNodeInfoTrueWithIp() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		AddedNodeInfoOutputModel output = network.getAddedNodeInfo(config, true, "10.4.96.127:8250");
		assertNotNull(output);
		assertNull(output.getError());
		assertTrue(output.getResult().size() > 0);
		assertNotNull(output.getResult().get(0).getAddednode());
	}
	
	@Test
	public void testConnectionCount() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.getConnectionCount(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertEquals("0", output.getResult());
	}
	
	@Test
	public void testDeprecationInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		DeprecationInfoOutputModel output = network.getDeprecationInfo(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getSubVersion());
	}
	
	@Test
	public void testNetTotals() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		NetTotalsOutputModel output = network.getNetTotals(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getTimeMillis());
	}
	
	@Test
	public void testGetNetworkInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		NetworInfoOutputModel output = network.getNetworkInfo(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getLocalServices());
	}
	
	@Test
	public void testGetPeerInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		PeerInfoOutputModel output = network.getPeerInfo(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getSubVersion());
	}
	
	@Test
	public void testListBanned() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		ListBannedOutputModel output = network.listBanned(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().size());
		assertNotNull(output.getResult().get(0).getAddress());
	}
	
	@Test
	public void testPing() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.ping(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNull(output.getResult());
	}
	
	@Test
	public void testSetBan() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.setBan(config, "192.168.0.1", "add");
		assertNotNull(output);
		assertNull(output.getError());
		assertNull(output.getResult());
		
		OutputModel output2 = network.setBan(config, "192.168.0.1", "remove");
		assertNotNull(output2);
		assertNull(output2.getError());
		assertNull(output2.getResult());
	}
	
	@Test
	public void testSetBanWithBanTime() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		NetworkApi network = new NetworkApi();
		OutputModel output = network.setBan(config, "192.168.0.6", "add", 86400);
		assertNotNull(output);
		assertNull(output.getError());
		assertNull(output.getResult());
	}

}
