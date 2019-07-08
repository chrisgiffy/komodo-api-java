![Komodo_Logo](logo.png?raw=true)
# [Komodo RPC API Library](https://github.com/chrisgiffy/komodo-api-java/blob/master/jar/komodo-api.jar)

#### RPC API-Library for Komodo-based asset chains, for Java Developers.
===============================================================================
### Description:
- #### Komodo-RPC library helps you integrate your Java Apps with Komodo asset-chains without having to setup/implement required RPC functions. Include this Jar and call Komodo-API RPCs as easily as calling a local function. Komodo-RPC library acts as a wrapper between your Python app and the Komodo-daemon running on a server.
#####
### Installation:
#### Download pre-built-distribution:
- [komodo-api](https://github.com/chrisgiffy/komodo-api-java/blob/master/jar/komodo-api.jar)

### Usage:
```java
import com.komodo.api.sections
import com.komodo.api.models.Configurations;
public class Example {
    public static void main(String[] args) {
      Configurations config = new Configurations();
      config.setId("id");
      config.setIp("ip");
      config.setPort("rpc-port);
      config.setUsername("username");
      config.setPassword("password");

      AddressApi address = new AddressApi();
      GetAddressBalanceOutputModel output = address.getAddressBalance(config, addresses);
      //The Result returned will be an onject depending on the function you are calling.
   }
}
 
```
 - #### Create an object of **Configurations** class with following parameters to connect and authenticate to your komodo server.
 |   Argument   |                                   Description                                   |
|:------------:|:-------------------------------------------------------------------------------: |
|   ip         | IP address of the node where the Komodo-daemon is running;                       |
|   port       |            Port number where the Komodo-daemon is listening for RPCs             |
| username     |                         Username for RPC authentication                          |
| password     |                         Password for RPC authentication                          |
|  id          |                     ID for RPC requests                                          |

 
#####
- #### API commands are segregated into different modules:
|          Module         |                                                                                                                                                                               Description                                                                                                                                                                               |
|:-----------------------:|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
|      AddressApi     |  Includes all address-related commands.                                                                                                                                                                  |
|    BlockChainApi   | Includes all blockchain-related commands.                                                                                                                                                                                                  |
|      ControlApi     | Includes all Control commands.                                                                                                                                                                              |
|    DisclosureApi    | Includes all disclosure-related commands.                                                                                           |
|     GenerateApi     | Includes all Generation commands.                                                                                                                                                                 |
|      JumblrApi      | Includes all Jumblr commands.                                                                                                                                                           |
|      MiningApi      | Includes all mining-related commands.                                                                                                                                                                                               |
|      NetworkApi     | Includes all network-related commands.                                                                                                                                                                                                      |
| RawTransactionsApi | Includes all raw_transactions commands.  |
|       UtilApi      | Includes all utility-related commands.                                                                                                                                                                     |
|      WalletApi      | Includes all wallet-related commands.                                                                                                                                                                                                                      |
#####
