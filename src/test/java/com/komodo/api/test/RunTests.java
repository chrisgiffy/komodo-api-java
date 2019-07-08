package com.komodo.api.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({  
        GenerateTest.class, 
        WalletTest.class,
        ControlTest.class,
        UtilTest.class,
        JumblrTest.class,
        NetworkTest.class,
        MiningTest.class,
        RawTransactionTest.class,
        BlockChainTest.class,
        AddressTest.class})
public class RunTests {

}
