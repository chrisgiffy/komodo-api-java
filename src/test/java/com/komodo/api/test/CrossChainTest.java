package com.komodo.api.test;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.sections.CrossChainApi;

public class CrossChainTest {
	
	@Test
	public void testMigrateCreateBurnTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		CrossChainApi api = new CrossChainApi();
		api.migrateCreateBurnTransaction(config, "GIFFYCOIN", "RWKFbVY8tEWWAaZLyRGjujHZ13xTPGUa2e", 10.0);
	}

}
