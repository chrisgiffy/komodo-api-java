package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.StringResultOutputModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.sections.JumblrApi;

public class JumblrTest {
	
	@Test
	public void testJumblrDeposit() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		JumblrApi jumblr = new JumblrApi();
		StringResultOutputModel jumblrOutput = jumblr.jumblrDeposit(config, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		assertNull(jumblrOutput.getError());
		assertNotNull(jumblrOutput.getResult());
		assertEquals(-4, jumblrOutput.getResult().getError());
	}
	
	@Test
	public void testJumblrPause() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		JumblrApi jumblr = new JumblrApi();
		StringResultOutputModel output = jumblr.jumblrPause(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertEquals("paused", output.getResult().getResult());
	}
	
	@Test
	public void testJumblrResume() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		JumblrApi jumblr = new JumblrApi();
		StringResultOutputModel output = jumblr.jumblrResume(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertEquals("resumed", output.getResult().getResult());
	}
	
	@Test
	public void testJumblrSecret() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		JumblrApi jumblr = new JumblrApi();
		StringResultOutputModel output = jumblr.jumblrSecret(config, "RFL6GTsXxeFCoE4bWUvxAkcVJzgdYcMYXs");
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertEquals(-4, output.getResult().getError());
	}

}
