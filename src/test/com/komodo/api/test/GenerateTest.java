package com.komodo.api.test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.GetGenerateOutputModel;
import com.komodo.api.models.OutputModel;
import com.komodo.api.sections.GenerateApi;

public class GenerateTest {
	
	@Test
	public void getGenerateTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		GenerateApi generate = new GenerateApi();
		GetGenerateOutputModel output = generate.getGenerate(config);
		assertEquals(null, output.getError());
		assertNotEquals(null, output.getResult());
		assertNotEquals(true, output.getResult().getStaking());
	}
	
	@Test
	public void setGenerateTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		GenerateApi generate = new GenerateApi();
		OutputModel output = generate.setGenerate(config, true);
		assertEquals(null, output.getError());
		assertEquals(null, output.getResult());
	}
	
	@Test
	public void setGenerateProcTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		GenerateApi generate = new GenerateApi();
		OutputModel output = generate.setGenerate(config, true, 4);
		assertEquals(null, output.getError());
		assertEquals(null, output.getResult());
	}

}
