package com.komodo.api.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.util.BooleanOutputModel;
import com.komodo.api.models.util.CreateMultiSigOutputModel;
import com.komodo.api.models.util.DecodeCCOpretOutputModel;
import com.komodo.api.models.util.ValidateAddressOutputModel;
import com.komodo.api.models.util.ZValidateAddressOutputModel;
import com.komodo.api.sections.UtilApi;

public class UtilTest {
	
	@Test
	public void createMultiSigTest() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		List<String> keys = new ArrayList<String>();
		keys.add("RQ4ga6LDpkhUyndr8PNuKTmXmJioVvjpQT");
		keys.add("RDMeqkk7DUqs1k1o9TMnMiFEbQedGYhJpy");
		CreateMultiSigOutputModel output = util.createMultiSig(config, 2, keys);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAddress());
	}
	
	@Test
	public void decodeCCOpret() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		DecodeCCOpretOutputModel output = util.decodeCcOpert(config, "6a2412782103d31479e789014a96ba6dd60d50210045aa8292fe693f293d44615929f04cf57a");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testEstimateFee() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		OutputModel output = util.estimateFee(config, 6);
		assertNotNull(output);
		assertNull(output.getError());
	}
	
	@Test
	public void testEstimatePriority() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		OutputModel output = util.estimatePriority(config, 6);
		assertNotNull(output);
		assertNull(output.getError());
	}
	
	@Test
	public void testInvalidateBlock() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		OutputModel output = util.invalidateBlock(config, "683e5be0024d1e960804e776cafb18e6e656667aef02d5abbbfc918b5beec622");
		assertNotNull(output);
		assertNull(output.getError());
		assertNull(output.getResult());
	}
	
	@Test
	public void testReconsiderBlock() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		OutputModel output = util.reconsiderBlock(config, "683e5be0024d1e960804e776cafb18e6e656667aef02d5abbbfc918b5beec622");
		assertNotNull(output);
		assertNull(output.getError());
		assertNull(output.getResult());
	}
	
	@Test
	public void testTxNotarizedConfirmed() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		BooleanOutputModel output = util.txNotarizedConfirmed(config, "683e5be0024d1e960804e776cafb18e6e656667aef02d5abbbfc918b5beec622");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testValidateAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		ValidateAddressOutputModel output = util.validateAddress(config, "RQ4ga6LDpkhUyndr8PNuKTmXmJioVvjpQT");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getAddress());
	}
	
	@Test
	public void testVerifyMessage() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		OutputModel output = util.verifyMessage(config, "RBtNBJjWKVKPFG4To5Yce9TWWmc2AenzfZ", "H1y0mn/wRv56r1bcfkbQtzjG6XeWSelAsyayBuCwEL9XGXs7ieU55dryt/cFWM9gnRFI7gS01AByuSqRs+o/AZs=", "my message");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testZValidateAddress() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		UtilApi util = new UtilApi();
		ZValidateAddressOutputModel output = util.zValidateAddress(config, "RQ4ga6LDpkhUyndr8PNuKTmXmJioVvjpQT");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	

}
