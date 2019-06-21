package com.komodo.api.constants;

public class StringConstants {
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

	//MINING GET BLOCK TEMPLATE MODES
	public static final String TEMPLATE = "template";
	public static final String PROPOSAL = "proposal";
	public static final String DISABLED_CB = "disabledcb";

	//MINING GET BLOCK TEMPLATE CAPABILITIES
	public static final String LONG_POLL = "longpoll";
	public static final String COIN_BASE_TXN = "coinbasetxn";
	public static final String COIN_BASE_VALUE = "coinbasevalue";
	public static final String SERVERLIST = "serverlist";
	public static final String WORK_ID = "workid";
	
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

	//ADDRESS PARAMS
	public static final String ADDRESSES = "addresses";
	public static final String START = "start";
	public static final String END = "end";
	public static final String CHAININFO = "chainInfo";
	public static final String TOP = "top";
	
	


}
