package com.komodo.api.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.control.GetInfoModel;
import com.komodo.api.sections.ControlApi;

public class ControlTest {
	
	@Test
	public void getInfoTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		ControlApi control = new ControlApi();
		GetInfoModel output = control.getInfo(config);
		assertEquals(null, output.getError());
		assertNotEquals(null, output.getResult().getKmdNotarizedHeight());
	}
	
	@Test
	public void helpTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		ControlApi control = new ControlApi();
		OutputModel output = control.help(config);
		assertEquals(null, output.getError());
		assertNotEquals(null, output.getResult());
		assertNotEquals("", output.getResult());
	}
	
	@Test
	public void helpTestParameter() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		ControlApi control = new ControlApi();
		OutputModel output = control.help(config, "getnewaddress");
		assertEquals(null, output.getError());
		assertNotEquals(null, output.getResult());
		assertNotEquals("", output.getResult());
	}
	
	/*
	 * @Test public void stopTest() { Configurations config = new Configurations();
	 * config.setId("curlTest"); config.setIp("127.0.0.1"); config.setPort("8251");
	 * config.setUsername("user1922998069"); config.setPassword(
	 * "pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
	 * 
	 * ControlApi control = new ControlApi(); OutputModel output =
	 * control.stop(config); System.out.println(output.getResult());
	 * assertEquals(null, output.getError()); assertNotEquals(null,
	 * output.getResult()); assertNotEquals("", output.getResult()); }
	 */

}
