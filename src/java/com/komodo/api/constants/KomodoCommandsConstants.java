package com.komodo.api.constants;

public class KomodoCommandsConstants {
	//ADDRESS BLOCK
	public static final String GET_ADDRESS_BALANCE = "getaddressbalance";
	public static final String GET_ADDRESS_DELTAS = "getaddressdeltas";
	public static final String GET_ADDRESS_MEMPOOL = "getaddressmempool";
	public static final String GET_ADDRESS_TXIDS = "getaddresstxids";
	public static final String GET_ADDRESS_UTXOS = "getaddressutxos";
	public static final String GET_SNAPSHOT = "getsnapshot";

	//BLOCKCHAIN BLOCK
	public static final String COINSUPPLY = "coinsupply";
	public static final String GET_BEST_BLOCK_HASH = "getbestblockhash";
	public static final String GET_BLOCK = "getblock";
	public static final String GET_BLOCKCHAIN_INFO = "getblockchaininfo";
	public static final String GET_BLOCK_COUNT = "getblockcount";
	public static final String GET_BLOCK_HASH = "getblockhash";
	public static final String GET_BLOCK_HASHES = "getblockhashes";
	public static final String GET_BLOCK_HEADER = "getblockheader";
	public static final String GET_CHAIN_TIPS = "getchaintips";
	public static final String GET_CHAIN_TX_STATS = "getchaintxstats";
	public static final String GET_DIFFICULTY = "getdifficulty";
	public static final String GET_LAST_SEG_ID_STAKES = "getlastsegidstakes";
	public static final String GET_MEMPOOL_INFO = "getmempoolinfo";
	public static final String GET_RAW_MEM_POOL = "getrawmempool";
	public static final String GET_SPENT_INFO = "getspentinfo";
	public static final String GET_TX_OUT = "gettxout";
	public static final String GET_TX_OUT_PROOF = "gettxoutproof";
	public static final String GET_TX_OUT_SETINFO = "gettxoutsetinfo";
	public static final String KV_SEARCH = "kvsearch";
	public static final String KV_UPDATE = "kvupdate";
	public static final String MINER_IDS = "minerids";
	public static final String NOTARIES = "notaries";
	public static final String VERIFY_CHAIN = "verifychain";
	public static final String VERIFY_TXOUT_PROOF = "verifytxoutproof";

	//CONTROL BLOCK
	public static final String GET_INFO = "getinfo";
	public static final String HELP = "help";
	public static final String STOP = "stop";

	//DISCLOSURE BLOCK
	public static final String Z_VALIDATE_PAYMENT_DISCLOSURE = "z_validatepaymentdisclosure";
	public static final String Z_GET_PAYMENT_DISCLOSURE = "z_getpaymentdisclosure";

	//GENERATE BLOCK
	public static final String GENERATE = "generate";
	public static final String GET_GENERATE = "getgenerate";
	public static final String SET_GENERATE = "setgenerate";

	//RAW_TRANSACTIONS BLOCK
	public static final String DECODE_RAW_TRANSACTION = "decoderawtransction";
	public static final String DECODE_SCRIPT = "decodescript";
	public static final String FUND_RAW_TRANSACTION = "fundrawtransaction";
	public static final String GET_RAW_TRANSACTION = "getrawtransaction";
	public static final String SEND_RAW_TRANSASCTION = "sendrawtransaction";
	public static final String SIGN_RAW_TRANSACTION = "signrawtransaction";
	public static final String CREATE_RAW_TRANSACTION = "createrawtransaction";

	//MINING BLOCK
	public static final String GET_BLOCK_SUBSIDY = "getblocksubsidy";
	public static final String GET_BLOCK_TEMPLATE = "getblocktemplate";
	public static final String GET_LOCAL_SOLPS = "getlocalsolps";
	public static final String GET_MINING_INFO = "getmininginfo";
	public static final String GET_NETWORK_HASH_PS = "getnetworkhashps";
	public static final String GET_NETWORK_SOLPS = "getnetworksolps";
	public static final String PRIORITISE_TRANSACTION = "prioritisetransaction";
	public static final String SUBMIT_BLOCK = "submitblock";

	//JUMBLR_BLOCK
	public static final String JUMBLR_DEPOSIT = "jumblr_deposit";
	public static final String JUMBLR_PAUSE = "jumblr_pause";
	public static final String JUMBLR_RESUME = "jumblr_resume";
	public static final String JUMBLR_SECRET = "jumblr_secret";
	
	//UTIL BLOCK
	public static final String CREATE_MULTI_SIG = "createmultisig";
	public static final String DECODE_CC_OPERET = "decodeccopret";
	public static final String ESTIMATE_FEE = "estimatefee";
	public static final String ESTIMATE_PRIORITY = "estimatepriority";
	public static final String INVALIDATE_BLOCK = "invalidateblock";
	public static final String RECONSIDER_BLOCK = "reconsiderblock";
	public static final String TX_NOTORIZED_CONFIRMED = "txnotarizedconfirmed";
	public static final String VALIDATE_ADDRESS = "validateaddress";
	public static final String VERIFY_MESSAGE = "verifymessage";
	public static final String Z_VALIDATE_ADDRESS = "z_validateaddress";
	
	//NETWORK BLOCK
	public static final String ADD_NODE = "addnode";
	public static final String CLEAR_BANNED = "clearbanned";
	public static final String DISCONNECT_NODE = "disconnectnode";
	public static final String GET_ADDED_NODE_INFO = "getaddednodeinfo";
	public static final String GET_CONNECTION_COUNT = "getconnectioncount";
	public static final String GET_DEPRECATION_INFO = "getdeprecationinfo";
	public static final String GET_NET_TOTALS = "getnettotals";
	public static final String GET_NETWORK_INFO = "getnetworkinfo";
	public static final String GET_PEER_INFO = "getpeerinfo";
	public static final String LIST_BANNED = "listbanned";
	public static final String PING = "ping";
	public static final String SET_BAN = "setban";
	
	//WALLET_BLOCK
	public static final String ADD_MULTI_SIG_ADDRESS = "addmultisigaddress";
	public static final String BACKUP_WALLET = "backupwallet";
	public static final String DUMP_PRIV_KEY = "dumpprivkey";
	public static final String DUMP_WALLET = "dumpwallet";
	public static final String ENCRYPT_WALLET = "encryptwallet";
	public static final String GET_ACCOUNT = "getaccount";
	public static final String GET_ACCOUNT_ADDRESS = "getaccountaddress";
	public static final String GET_ADDRESSES_BY_ACCOUNT = "getaddressesbyaccount";
	public static final String GET_BALANCE = "getbalance";
	public static final String GET_NEW_ADDRESS = "getnewaddress";
	public static final String GET_RAW_CHANGE_ADDRESS = "getrawchangeaddress";
	public static final String GET_RECEIVED_BY_ADDRESS = "getreceivedbyaddress";
	public static final String GET_TRANSACTION = "gettransaction";
	public static final String GET_UNCONFIRMED_BALANCE = "getunconfirmedbalance";
	public static final String GET_WALLET_INFO = "getwalletinfo";
	public static final String IMPORT_ADDRESS = "importaddress";
	public static final String IMPORT_PRIV_KEY = "importprivkey";
	public static final String IMPORT_WALLET = "importwallet";
	public static final String KEY_POOL_REFILL = "keypoolrefill";
	public static final String LIST_ADDRESS_GROUPINGS = "listaddressgroupings";
	public static final String LIST_LOCK_UNSPENT = "listlockunspent";
	public static final String LIST_RECEIVED_BY_ADDRESS = "listreceivedbyaddress";
	public static final String LIST_IN_CE_BLOCK = "listsinceblock";
	public static final String LIST_TRANSACTIONS = "listtransactions";
	public static final String LIST_UNSPENT = "listunspent";
	public static final String LOCK_UNSPENT = "lockunspent";
	public static final String RESEND_WALLET_TRANSACTION = "resendwallettransactions";
	public static final String SEND_MANY = "sendmany";
	public static final String SEND_TO_ADDRESS = "sendtoaddress";
	public static final String SET_PUB_KEY = "setpubkey";
	public static final String SET_TX_FEE = "settxfee";
	public static final String SIGN_MESSAGE = "signmessage";
	public static final String WALLET_LOCK = "walletlock";
	public static final String WALLET_PASS_PHRASE = "walletpassphrase";
	public static final String WALLET_PASS_PHRASE_CHANGE = "walletpassphrasechange";
	public static final String Z_EXPORT_KEY = "z_exportkey";
	public static final String Z_EXPORT_VIEWING_KEY = "z_exportviewingkey";
	public static final String Z_EXPORT_WALLET = "z_exportwallet";
	public static final String Z_GET_BALANCE = "z_getbalance";
	public static final String Z_GET_NEW_ADDRESS = "z_getnewaddress";
	public static final String Z_GET_OPERATION_RESULT = "z_getoperationresult";
	public static final String Z_GET_OPERATION_STATUS = "z_getoperationstatus";
	public static final String Z_GET_TOTAL_BALANCE = "z_gettotalbalance";
	public static final String Z_IMPORT_KEY = "z_importkey";
	public static final String Z_IMPORT_VIEWING_KEY = "z_importviewingkey";
	public static final String Z_IMPORT_WALLET = "z_importwallet";
	public static final String Z_LIST_ADDRESSES = "z_listaddresses";
	public static final String Z_LIST_OPERATION_IDS = "z_listoperationids";
	public static final String Z_LIST_RECEIVED_BY_ADDRESS = "z_listreceivedbyaddress";
	public static final String Z_LIST_UNSPENT = "z_listunspent";
	public static final String Z_SEND_MANY = "z_sendmany";
	public static final String Z_SHIELD_COIN_BASE = "z_shieldcoinbase";
	public static final String ZC_BENCHMARK = "zcbenchmark";

	//ADDRESS PARAMS
	public static final String ADDRESSES = "addresses";
	public static final String START = "start";
	public static final String END = "end";
	public static final String CHAININFO = "chainInfo";
	public static final String TOP = "top";

}
