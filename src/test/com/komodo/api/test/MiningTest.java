package com.komodo.api.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.mining.BlockTemplateOutputModel;
import com.komodo.api.models.mining.MiningInfoOutputModel;
import com.komodo.api.models.mining.MiningSubsidyOutputModel;
import com.komodo.api.sections.MiningApi;

public class MiningTest {
	
	@Test
	public void testGetBlockSubsidy() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		MiningSubsidyOutputModel output = mining.getBlockSubsidy(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getMiner());
	}
	
	@Test
	public void testGetBlockSubsidyHeight() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		MiningSubsidyOutputModel output = mining.getBlockSubsidy(config, 100);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getMiner());
	}
	
	@Test
	public void testGetBlockTemplate() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		BlockTemplateOutputModel output = mining.getBlockTemplate(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getHash());
		assertNotNull(output.getResult().getCoinBaseTxn());
		assertNotNull(output.getResult().getCoinBaseTxn().getHash());
		
	}
	
	@Test
	public void testGetBlockTemplateMode() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		BlockTemplateOutputModel output = mining.getBlockTemplate(config, "disablecb");
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getHash());
		assertNotNull(output.getResult().getCoinBaseTxn());
		assertNotNull(output.getResult().getCoinBaseTxn().getHash());
		
	}
	
	@Test
	public void testGetBlockTemplateCapabilities() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		List<String> capabilities = new ArrayList<String>();
		capabilities.add("workid");
		BlockTemplateOutputModel output = mining.getBlockTemplate(config, capabilities);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getHash());
		assertNotNull(output.getResult().getCoinBaseTxn());
		assertNotNull(output.getResult().getCoinBaseTxn().getHash());
		
	}
	
	@Test
	public void testGetBlockTemplateCapabilitiesMode() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		List<String> capabilities = new ArrayList<String>();
		capabilities.add("workid");
		BlockTemplateOutputModel output = mining.getBlockTemplate(config, "disablecb", capabilities);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertTrue(0 < output.getResult().getTransactions().size());
		assertNotNull(output.getResult().getTransactions().get(0).getHash());
		assertNotNull(output.getResult().getCoinBaseTxn());
		assertNotNull(output.getResult().getCoinBaseTxn().getHash());
		
	}
	
	@Test
	public void testGetLocalSolps() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		OutputModel output = mining.getLocalSolps(config);
		assertNotNull(output);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testMiningInfo() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		MiningInfoOutputModel output = mining.getMiningInfo(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
		assertNotNull(output.getResult().getChain());
	}
	
	@Test
	public void testNetworkSolps() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		OutputModel output = mining.getNetworkSolps(config);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testNetworkSolpsParams() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		OutputModel output = mining.getNetworkSolps(config, 100, 12);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testPrioritySetTransaction() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		OutputModel output = mining.prioritiseTransaction(config, "683e5be0024d1e960804e776cafb18e6e656667aef02d5abbbfc918b5beec622", 10, 0.000010);
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	@Test
	public void testSubmitBlock() {
		Configurations config = new Configurations();
		config.setId("curlTest");
		config.setIp("127.0.0.1");
		config.setPort("8251");
		config.setUsername("user1922998069");
		config.setPassword("pass8a6303a92fa07fc1792f5edf1b263a480d2c5677ad1107dc9e24c40215b2ea8e2e");
		
		MiningApi mining = new MiningApi();
		OutputModel output = mining.submitBlock(config, "0400000029865a4962f43d6f95fdf9ccc89f82377a23d1fdc41eaf943c7881a5ca55c5018973d81f5ce7ab99f027b15c86ca88ec5e4b6f35ad4018bfc2058568bbe7f526000000000000000000000000000000000000000000000000000000000000000097954a5b9e830c1d1600ac305580abea34bda62eb503b02fc4b7872428cfa60bf5824a9b78fc0000fd400500c80d4a8c84cec781a5740d8d3fb18587a850b6380f073cd861c4ce7c4290460c533e0d4dd3b89fe0f0052ccdf9d450a1dfcd7263a39422000378da3eeb621078af689447a5ed0a7265a857463a36d72cdd35910d14de9816a25d631aeb0249ede829aca77f9cce1a2e4a84b75e4bd515845043d52f718638fb41e92d8b18bfe1f49e1c0d23223a285b2850e8469dfbb9782b20c8bebf2a61d7b7d8eea310c7c8d5bfa612bf94fd05562ec8876eacafa0c334a651ef70c941459161b60c20511087d63223878052d4fd1a92298789d7c57609fe3a247489674592e8e34a1728b28e2c2b3165f01d5fefa22e6384f7fe4e566de1741e264f057a0feb1b35d51694647ba52afd71c3bd375b924da95e2b413dbea256a2de9ccddcab88bd2e69cc3acc8a778b4d1db78b41df9fea6d69b071f570f628ad47537d081740a4f2c4fa6666dbb862a6d02ff07b5ae0a9fa24b003fa0355dbde0425d6c14452f0d357f2cfd97960c343ba73789a2d7ba580ea8834ef656a9e79c49fc0f61aa9452a644c8bc06afe31dce2a7ca5d6995adc8ce1f77165a075399e1d006e2bb57c09ffd6e21fcff440645faef599264a3b8c005cf60683371ba1af8847d1992c64e512f13d9d2d364969759233a27c65e1f2f1113cdb665e3e8f7baa2c398c4a2ee85a6ad1bdb095962fafaa01c3d85bc820653544b89b6e75a584d8d04bc77e5284a9ebbcd46c1a6732b841e46c876976805d932a90ac215bcc37801900d49cfb87fe5c809b30ebd8ece38669153c1f1a2438253a56a6507d556cc16b2990f0bd290fea59462d25eebdbfcb78eb403c8080e0c68e8e2ef8f67145121bce83b94dc8f9d0a742752323c5a4b42409ffcc37053c58596deff7981a20e3f412c07c839a341fdc177d5e28f7909696f90c90efff14048f440e7ea3181378f66d35b0697dc02c60154778f438cdd3dba5dc4c2763319498bbb3b8fae17508b073d07d83f5f1dc71bf2dc205f06245872620dfa341dbcdf9c574598c121120e91dd687dfd08451369ab29a11dc73f69d0722992a1c70cf1498ec9b9143fcb0abfd7b1e39189125e8567cb2cc3d71fcdb541a0776a5a665161f98385633153fc9702f079269a1dac0d2c708f5d94e346159858cfd50624ff5a0505358739b5f41adbe739bf75852eebb06eeccd79e030019a5227cd9a19e77b6821ba0794fe09cb074f40ce0b92c081c31cda2d4711d53889fc6f0579839fa74309768ef0a796fa1fa660e150d3ea5c0a369e1297d11177fc284524d6d5e40eb7ee4b400f6dfd6a10402904394e1694de300ddd565622e7ca7ed62970ff5add0b36a513b5d90d2194cf414ecc97e5dcc88698e06405dea09f49503c81cc61518f8aee882da6eeae09b4127a7fcc0c0829fca8fda3502ebf13ece0a90a8dfd05d8e514452247f79472c20683e2b1fde5ec14a2453bf00f9f1cd5a088d229a7fdfdfdc24f176fb9a8a409af70d894998957394d30a46668d71cd16907aa800ee9d96c2b9fc7fb5a7944a9b8d4f76609fc186e3c0a4d80fb9c8c236f76eb00bc24dd9abddef7d653740ece7141ac6175f7e9cab1cb0216e85adde43907b60c0581336b50ccd7682f28f00f7efd663df4d31701141657da989d236d16052c4b59fc46fb41657a26d7074fbc9dee602f7d03b86179e4c12bc0df253f815319dff12353a478d95febd5f902e363734e6e5ef4bf1865eb70750b9238be3382a51ded182569d112f37870d43465615ca9174d41f7f3b9eb780a28c7dba674075bbe04538ad669eef7716d1b7b252d49da3b00993f0c829860a1efafdcdc865d46f2f8aec9893b5bc607db33272e5b9f7cf134595e1ad5e8f34b1b7f93ca181c513afc4d8a531c36929e95cfbb4d268a9d94f80201000000010000000000000000000000000000000000000000000000000000000000000000ffffffff0603860f0e0101ffffffff0188b6e1110000000023210383d0b37f59f4ee5e3e98a47e461c861d49d0d90c80e9e16f7e63686a2dc071f3ac67954a5b01000000010b1561554a46ec535c4972a3a16652b270ee4af847ec3bbfcf6ba663ebcfefcb1a00000049483045022100b9cd7c1c56d69d9b05d695f9ac86c1233427ec26860774a0eb4e6052fe11ca8502207eca5a4eda1ccf92ccdb501ab7d61cf084d0f4431f059e27ee13ce11f9aa159b01ffffffff0188130000000000002321020e46e79a2a8d12b9b5d12c7a91adb4e454edfae43c0a0cb805427d2ac7613fd9ac00000000");
		assertNull(output.getError());
		assertNotNull(output.getResult());
	}
	
	

}
