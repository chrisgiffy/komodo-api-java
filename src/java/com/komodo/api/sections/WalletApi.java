package com.komodo.api.sections;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.wallet.TransactionOutputModel;
import com.komodo.api.models.wallet.WalletInfoOutputModel;
import com.komodo.api.utils.KomodoUtil;
/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software
 * @author Giffy Chris
 *
 */
public class WalletApi {
	
	/**
	 * addmultisigaddress nrequired [ "key", ... ]
	 * The addmultisigaddress method adds a multi-signature address to the wallet, 
	 * where nrequired indicates the number of keys (out of the total provided) required to execute a transaction.
	 * The keys function as signatures, allowing multiple parties or entities to manage an account. 
	 * Each key in the array can be an address or a hex-encoded public key.
	 * @param config
	 * @param nRequired
	 * @param keysObject
	 * @return OutputModel
	 */
	public OutputModel addMultiSigAddress(Configurations config, int nRequired, List<String> keysObject) {
		StringBuilder params = new StringBuilder();
		params.append(nRequired);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < keysObject.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(keysObject.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ADD_MULTI_SIG_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * addmultisigaddress nrequired [ "key", ... ]
	 * The addmultisigaddress method adds a multi-signature address to the wallet, 
	 * where nrequired indicates the number of keys (out of the total provided) required to execute a transaction.
	 * The keys function as signatures, allowing multiple parties or entities to manage an account. 
	 * Each key in the array can be an address or a hex-encoded public key.
	 * @param config
	 * @param nRequired
	 * @param keysObject
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel addMultiSigAddress(Configurations config, int nRequired, List<String> keysObject, String address) {
		StringBuilder params = new StringBuilder();
		params.append(nRequired);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < keysObject.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(keysObject.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ADD_MULTI_SIG_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * backupwallet "destination"
	 * The backupwallet method safely copies the wallet.dat file to the indicated destination. 
	 * The destination input accepts only alphanumeric characters.
	 * This method requires that the coin daemon have the exportdir runtime parameter enabled.
	 * @param config
	 * @param destination
	 * @return OutputModel
	 */ 
	public OutputModel backupWallet(Configurations config, String destination) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.BACKUP_WALLET, StringConstants.DOUBLE_QUOTE+destination+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * dumpprivkey "address"
	 * The dumpprivkey method reveals the private key corresponding to the indicated address.
	 * @param config
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel dumpPrivKey(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DUMP_PRIV_KEY, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * dumpwallet "filename"
	 * The dumpwallet method dumps all transparent-address wallet keys into a file, using a human-readable format.
	 * Overwriting an existing file is not permitted. 
	 * The destination parameter accepts only alphanumeric characters.
	 * This method requires that the coin daemon have the exportdir runtime parameter enabled.
	 * @param config
	 * @param fileName
	 * @return OutputModel
	 */
	public OutputModel dumpWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DUMP_WALLET, StringConstants.DOUBLE_QUOTE+fileName+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * encryptwallet "passphrase"
	 * Using the encryptwallet method will shutdown the Komodo daemon (komodod).
	 * This feature is available only on chains where -ac_public is enabled. Chains that feature private transactions cannot use this feature.
	 * The encryptwallet method encrypts the wallet with the indicated passphrase.
	 * @param config
	 * @param passPhrase
	 * @return OutputModel
	 */
	public OutputModel encryptWallet(Configurations config, String passPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ENCRYPT_WALLET, StringConstants.DOUBLE_QUOTE+passPhrase+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getaccount "address"
	 * The getaccount method returns the account associated with the given address
	 * @param config
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel getAccount(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ACCOUNT, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getbalance ( "account" minconf includeWatchonly )
	 * The getbalance method returns the server's total available balance.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getbalance ( "account" minconf includeWatchonly )
	 * The getbalance method returns the server's total available balance.
	 * @param config
	 * @param minConf
	 * @return OutputModel
	 */
	public OutputModel getBalance(Configurations config, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, StringConstants.DOUBLE_QUOTE+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getbalance ( "account" minconf includeWatchonly )
	 * The getbalance method returns the server's total available balance.
	 * @param config
	 * @param minConf
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel getBalance(Configurations config, int minConf, boolean includeWatchOnly) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(includeWatchOnly);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getnewaddress ( "account" )
	 * The getnewaddress method returns a new address for receiving payments.
	 * @param config
	 * @return OutputModel
	 */ 
	public OutputModel getNewAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NEW_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getrawchangeaddress
	 * The getrawchangeaddress returns a new address that can be used to receive change.
	 * This is for use with raw transactions, NOT normal use.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getRawChangeAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_CHANGE_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getreceivedbyaddress "address" ( minconf )
	 * The getreceivedbyaddress method returns the total amount received by the given address in transactions with at least minconf confirmations
	 * @param config
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel getReceivedByAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RECEIVED_BY_ADDRESS, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getreceivedbyaddress "address" ( minconf )
	 * The getreceivedbyaddress method returns the total amount received by the given address in transactions with at least minconf confirmations
	 * @param config
	 * @param address
	 * @param minConf
	 * @return OutputModel
	 */
	public OutputModel getReceivedByAddress(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RECEIVED_BY_ADDRESS, StringConstants.DOUBLE_QUOTE+address+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * gettransaction "txid" ( includeWatchonly )
	 * The gettransaction method queries detailed information about transaction txid. This command applies only to txid's that are in the user's local wallet
	 * @param config
	 * @param txId
	 * @param includeWatchOnly
	 * @return TransactionOutputModel
	 */
	public TransactionOutputModel getTransaction(Configurations config, String txId, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TRANSACTION, 
				StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+includeWatchOnly);
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(output, JsonObject.class);
		TransactionOutputModel txModel = new Gson().fromJson(((JsonObject)jsonObject.get(StringConstants.RESULT)), TransactionOutputModel.class);
		return txModel;
	}

	/**
	 * getunconfirmedbalance
	 * The getunconfirmedbalance method returns the server's total unconfirmed balance
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel getUnconfirmedBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_UNCONFIRMED_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * getwalletinfo
	 * The getwalletinfo method returns an object containing various information about the wallet state.
	 * @param config
	 * @return WalletInfoOutputModel
	 */
	public WalletInfoOutputModel getWalletInfo(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_INFO, null);
		WalletInfoOutputModel outputModel = new Gson().fromJson(output, WalletInfoOutputModel.class);
		return outputModel;
	}

	/**
	 * importaddress "address" ( "label" rescan )
	 * The importaddress method adds an address or script (in hex) that can be watched as if it were in your wallet, 
	 * although it cannot be used to spend.
	 * This call can take an increased amount of time to complete if rescan is true.
	 * @param config
	 * @param address
	 * @param rescan (default true)
	 * @return OutputModel
	 */
	public OutputModel importAddress(Configurations config, String address, boolean rescan) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_ADDRESS, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * importaddress "address" ( "label" rescan )
	 * The importaddress method adds an address or script (in hex) that can be watched as if it were in your wallet, 
	 * although it cannot be used to spend.
	 * This call can take an increased amount of time to complete if rescan is true.
	 * @param config
	 * @param address
	 * @param rescan (default true)
	 * @param label (default "")
	 * @return OutputModel
	 */
	public OutputModel importAddress(Configurations config, String address, boolean rescan, String label) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_ADDRESS, StringConstants.DOUBLE_QUOTE+address+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+StringConstants.DOUBLE_QUOTE+label+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * importkey "komodoprivkey" ( "label" rescan )
	 * The importprivkey method adds a private key to your wallet.
	 * This call can take minutes to complete if rescan is true.
	 * @param config
	 * @param address
	 * @param rescan
	 * @return OutputModel
	 */
	public OutputModel importPrivKey(Configurations config, String address, boolean rescan) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_PRIV_KEY, StringConstants.DOUBLE_QUOTE+address+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * importkey "komodoprivkey" ( "label" rescan )
	 * The importprivkey method adds a private key to your wallet.
	 * This call can take minutes to complete if rescan is true.
	 * @param config
	 * @param address
	 * @param rescan
	 * @param label (default "")
	 * @return OutputModel
	 */
	public OutputModel importPrivKey(Configurations config, String address, boolean rescan, String label) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_PRIV_KEY, StringConstants.DOUBLE_QUOTE+address+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+StringConstants.DOUBLE_QUOTE+label+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * importwallet "filename"
	 * The importwallet method imports transparent-address keys from a wallet-dump file 
	 * @param config
	 * @param fileName
	 * @return OutputModel
	 */
	public OutputModel importWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_WALLET, StringConstants.DOUBLE_QUOTE+fileName+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * keypoolrefill ( newsize )
	 * The keypoolrefill method refills the keypool
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel keyPoolRefill(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KEY_POOL_REFILL, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * keypoolrefill ( newsize )
	 * The keypoolrefill method refills the keypool
	 * @param config
	 * @param newSize
	 * @return OutputModel
	 */
	public OutputModel keyPoolRefill(Configurations config, int newSize) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KEY_POOL_REFILL, StringConstants.BLANK+newSize);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listaddressgroupings
	 * The listaddressgroupings method lists groups of addresses which have had their common ownership made public 
	 * by common use as inputs or as the resulting change in past transactions.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel listAddressGroupings(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_ADDRESS_GROUPINGS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listlockunspent
	 * The listlockunspent method returns a list of temporarily non-spendable outputs.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel listLockUnspent(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_LOCK_UNSPENT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listreceivedbyaddress ( minconf includeempty includeWatchonly)
	 * The listreceivedbyaddress method lists balances by receiving address
	 * @param config
	 * @param minConf
	 * @param includeEmpty
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel listReceivedByAddress(Configurations config, int minConf, boolean includeEmpty, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_RECEIVED_BY_ADDRESS, minConf+StringConstants.COMMA+includeEmpty+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listsinceblock ( "blockhash" target-confirmations includeWatchonly )
	 * The listsinceblock method queries all transactions in blocks since block blockhash, 
	 * or all transactions if blockhash is omitted
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel listInCeBlock(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listsinceblock ( "blockhash" target-confirmations includeWatchonly )
	 * The listsinceblock method queries all transactions in blocks since block blockhash, 
	 * or all transactions if blockhash is omitted
	 * @param config
	 * @param blockHash
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel listInCeBlock(Configurations config, String blockHash, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, StringConstants.DOUBLE_QUOTE+blockHash+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listsinceblock ( "blockhash" target-confirmations includeWatchonly )
	 * The listsinceblock method queries all transactions in blocks since block blockhash, 
	 * or all transactions if blockhash is omitted
	 * @param config
	 * @param targetConfirmations
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel listInCeBlock(Configurations config, int targetConfirmations, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, targetConfirmations+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listsinceblock ( "blockhash" target-confirmations includeWatchonly )
	 * The listsinceblock method queries all transactions in blocks since block blockhash, 
	 * or all transactions if blockhash is omitted
	 * @param config
	 * @param blockHash
	 * @param targetConfirmations
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel listInCeBlock(Configurations config, String blockHash, int targetConfirmations, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, StringConstants.DOUBLE_QUOTE+blockHash+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+targetConfirmations+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listtransactions ( "account" count from includeWatchonly )
	 * The listtransactions method returns up to count most recent transactions skipping the first from transactions for account
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel listTransactions(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_TRANSACTIONS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listtransactions ( "account" count from includeWatchonly )
	 * The listtransactions method returns up to count most recent transactions skipping the first from transactions for account
	 * @param config
	 * @param count
	 * @param from
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel listTransactions(Configurations config, int count, int from, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_TRANSACTIONS, 
				StringConstants.DOUBLE_QUOTE+StringConstants.ASTERIX+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+count+
				StringConstants.COMMA+from+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * listunspent ( minconf maxconf ["address", ... ] )
	 * The listunspent method returns an array of unspent transaction outputs, 
	 * with a range between minconf and maxconf (inclusive) confirmations. 
	 * The method can, optionally, filter to only include txouts paid to specified addresses
	 * @param config
	 * @param minConf
	 * @param maxConf
	 * @param addresses
	 * @return OutputModel
	 */
	public OutputModel listUnspent(Configurations config, int minConf, int maxConf, List<String> addresses) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(maxConf);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < addresses.size(); i++) {
			if( i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(addresses.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * lockunspent unlock [{ "txid": "txid", "vout": n }, ... ]
	 * The lockunspent method locks (unlock = false) or unlocks (unlock = true) specified transaction outputs. 
	 * A locked transaction output will not be chosen by automatic coin selection, when spending the relevant coin. 
	 * The locks are stored in memory only; at runtime a node always starts with zero locked outputs, 
	 * and the locked output list is always cleared when a node stops or fails
	 * @param config
	 * @param unlock
	 * @param txId
	 * @param vout
	 * @return OutputModel
	 */
	public OutputModel lockUnspent(Configurations config, boolean unlock, String txId, int vout) {
		StringBuilder params = new StringBuilder();
		params.append(unlock);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		params.append(StringConstants.OPEN_BRACE);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.TXID);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.VOUT);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COLAN);
		params.append(vout);
		params.append(StringConstants.CLOSE_BRACKET);
		params.append(StringConstants.CLOSE_BRACE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LOCK_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * resendwallettransactions
	 * The resendwallettransactions method immediately re-broadcasts unconfirmed wallet transactions to all peers. 
	 * This method is intended only for testing; the wallet code periodically re-broadcasts automatically
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel resentWalletTransaction(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.RESEND_WALLET_TRANSACTION, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * sendmany "account" { "address": amount, ... } ( minconf "comment" [ "address", ... ] )
	 * The sendmany method can send multiple transactions at once. Amounts are double-precision floating point numbers
	 * @param config
	 * @param account
	 * @param addressAmountMap
	 * @param minConf
	 * @param comment
	 * @return OutputModel
	 */
	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment) {
		StringBuilder params =  new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(account);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACE);
		int i = 0;
		for(String address : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(address);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COLAN);
			params.append(addressAmountMap.get(address));
			i++;
		}
		params.append(StringConstants.CLOSE_BRACE);
		params.append(StringConstants.COMMA);
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(comment);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * sendmany "account" { "address": amount, ... } ( minconf "comment" [ "address", ... ] )
	 * The sendmany method can send multiple transactions at once. Amounts are double-precision floating point numbers
	 * @param config
	 * @param account
	 * @param addressAmountMap
	 * @param minConf
	 * @param comment
	 * @param addresses
	 * @return OutputModel
	 */
	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment, List<String> addresses) {
		StringBuilder params =  new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(account);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACE);
		int i = 0;
		for(String address : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(address);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COLAN);
			params.append(addressAmountMap.get(address));
			i++;
		}
		params.append(StringConstants.CLOSE_BRACE);
		params.append(StringConstants.COMMA);
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(comment);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int j = 0; j < addresses.size(); j++) {
			if(j > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(addresses.get(j));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * sendmany "account" { "address": amount, ... } ( minconf "comment" [ "address", ... ] )
	 * The sendmany method can send multiple transactions at once. Amounts are double-precision floating point numbers
	 * @param config
	 * @param account
	 * @param addressAmountMap
	 * @param minConf
	 * @param comment
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment, String address) {
		StringBuilder params =  new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(account);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACE);
		int i = 0;
		for(String addressMap : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(addressMap);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COLAN);
			params.append(addressAmountMap.get(addressMap));
			i++;
		}
		params.append(StringConstants.CLOSE_BRACE);
		params.append(StringConstants.COMMA);
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(comment);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * sendtoaddress "address" amount ( "comment" "comment-to" subtractfeefromamount )
	 * The sendtoaddress method sends an amount to a given address. 
	 * The amount is real and is rounded to the nearest 0.00000001.
	 * @param config
	 * @param address
	 * @param amount
	 * @param comment
	 * @param commentTo
	 * @param subtractFeeFromAmount
	 * @return OutputModel
	 */
	public OutputModel sendToAddress(Configurations config, String address, double amount, String comment, String commentTo, boolean subtractFeeFromAmount) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(amount);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(comment);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(commentTo);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(subtractFeeFromAmount);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_TO_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * setpubkey pubkey
	 * The setpubkey method sets the indicated pubkey. 
	 * This method can be used in place of the pubkey launch parameter, when necessary.
	 * Visit the section pubkey to understand when it is essential to set a pubkey and the consequences of setting it.
	 * This method works only once per daemon start. It can't be used to change the pubkey that has already been set.
	 * @param config
	 * @param pubKey
	 * @return OutputModel
	 */
	public OutputModel setPubKey(Configurations config, String pubKey) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(pubKey);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_PUB_KEY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * settxfee amount
	 * The settxfee method sets the transaction fee per kB
	 * @param config
	 * @param amount
	 * @return OutputModel
	 */ 
	public OutputModel setTxFee(Configurations config, double amount) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_TX_FEE, StringConstants.BLANK+amount);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * signmessage "address" "message"
	 * The signmessage method signs a message via the private key of an address
	 * @param config
	 * @param address
	 * @param message
	 * @return OutputModel
	 */
	public OutputModel signMessage(Configurations config, String address, String message) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(message);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SIGN_MESSAGE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * walletlock
	 * The walletlock method is neither active nor visible in the help method until the encryptwallet passphrase is set.
	 * This feature is available only on chains where -ac_public is enabled. Chains that feature private transactions cannot use this feature.
	 * The walletlock method re-locks a wallet that has a passphrase enabled via encryptwallet.
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel walletLock(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_LOCK, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * walletpassphrase "passphrase" (timeout)
	 * The walletpassphrase method is neither active nor visible in the help method until the encryptwallet passphrase is set.
	 * This feature is available only on chains where -ac_public is enabled. Chains that feature private transactions cannot use this feature.
	 * The walletpassphrase method unlocks the wallet using the passphrase that was set by the encryptwallet method.
	 * The timeout argument can be included to limit the length of time (in seconds) the wallet will remain unlocked
	 * @param config
	 * @param passPhrase
	 * @return OutputModel
	 */
	public OutputModel walletPassPhrase(Configurations config, String passPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE, StringConstants.DOUBLE_QUOTE+passPhrase+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * walletpassphrase "passphrase" (timeout)
	 * The walletpassphrase method is neither active nor visible in the help method until the encryptwallet passphrase is set.
	 * This feature is available only on chains where -ac_public is enabled. Chains that feature private transactions cannot use this feature.
	 * The walletpassphrase method unlocks the wallet using the passphrase that was set by the encryptwallet method.
	 * The timeout argument can be included to limit the length of time (in seconds) the wallet will remain unlocked
	 * @param config
	 * @param passPhrase
	 * @param timeout
	 * @return OutputModel
	 */
	public OutputModel walletPassPhrase(Configurations config, String passPhrase, int timeout) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE, StringConstants.DOUBLE_QUOTE+passPhrase+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+timeout);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * walletpassphrasechange "oldpassphrase" "newpassphrase"
	 * The walletpassphrasechange method is neither active nor visible in the help method until the encryptwallet passphrase is set.
	 * This feature is available only on chains where -ac_public is enabled. Chains that feature private transactions cannot use this feature.
	 * The walletpassphrasechange method changes "oldpassphrase" to "newpassphrase"
	 * @param config
	 * @param oldPassPhrase
	 * @param newPassPhrase
	 * @return OutputModel
	 */
	public OutputModel walletPassPhraseChange(Configurations config, String oldPassPhrase, String newPassPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE_CHANGE, StringConstants.DOUBLE_QUOTE+oldPassPhrase+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+StringConstants.DOUBLE_QUOTE+newPassPhrase+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param zAddress
	 * @return OutputModel
	 */
	public OutputModel zExportKey(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_KEY, StringConstants.DOUBLE_QUOTE+zAddress+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param zAddress
	 * @return OutputModel
	 */
	public OutputModel zExportViewingKey(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_VIEWING_KEY, StringConstants.DOUBLE_QUOTE+zAddress+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param fileName
	 * @return OutputModel
	 */
	public OutputModel zExportWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_WALLET, StringConstants.DOUBLE_QUOTE+fileName+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel zgetBalance(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_BALANCE, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param address
	 * @param minConf
	 * @return OutputModel
	 */
	public OutputModel zExportWallet(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_BALANCE, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zGetNewAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_NEW_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zGetOperationResult(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_RESULT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param operationIds
	 * @return OutputModel
	 */
	public OutputModel zGetOperationResult(Configurations config, List<String> operationIds) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < operationIds.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(operationIds.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_RESULT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zGetOperationStatus(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_STATUS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param operationIds
	 * @return OutputModel
	 */
	public OutputModel zGetOperationStatus(Configurations config, List<String> operationIds) {
		StringBuilder params = new StringBuilder(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < operationIds.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(operationIds.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_STATUS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zGetTotalBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param minConf
	 * @return OutputModel
	 */
	public OutputModel zGetTotalBalance(Configurations config, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, StringConstants.BLANK+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel zGetTotalBalance(Configurations config, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, StringConstants.BLANK+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param minConf
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel zGetTotalBalance(Configurations config, int minConf, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, minConf+StringConstants.COMMA+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param zPrivateKey
	 * @return OutputModel
	 */
	public OutputModel zImportKey(Configurations config, String zPrivateKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_KEY, StringConstants.DOUBLE_QUOTE+zPrivateKey+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param zPrivateKey
	 * @param rescan
	 * @param startHeight
	 * @return OutputModel
	 */
	public OutputModel zImportKey(Configurations config, String zPrivateKey, String rescan, int startHeight) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_KEY, StringConstants.DOUBLE_QUOTE+zPrivateKey+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+StringConstants.DOUBLE_QUOTE+rescan+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+startHeight);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param viewingKey
	 * @return OutputModel
	 */
	public OutputModel zImportViewingKey(Configurations config, String viewingKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_VIEWING_KEY, StringConstants.DOUBLE_QUOTE+viewingKey+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param viewingKey
	 * @param rescan
	 * @param startHeight
	 * @return OutputModel
	 */
	public OutputModel zImportViewingKey(Configurations config, String viewingKey, String rescan, int startHeight) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_VIEWING_KEY, StringConstants.DOUBLE_QUOTE+viewingKey+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+StringConstants.DOUBLE_QUOTE+rescan+StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+startHeight);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param fileName
	 * @return OutputModel
	 */
	public OutputModel zImportWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_WALLET, StringConstants.DOUBLE_QUOTE+fileName+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param includeWatchOnly
	 * @return OutputModel
	 */
	public OutputModel zListAddresses(Configurations config, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_ADDRESSES, StringConstants.BLANK+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zListOperationIds(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_OPERATION_IDS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param status
	 * @return OutputModel
	 */
	public OutputModel zListOperationIds(Configurations config, String status) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_OPERATION_IDS, StringConstants.DOUBLE_QUOTE+status+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param address
	 * @param minConf
	 * @return OutputModel
	 */
	public OutputModel zListReceivedByAddress(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_RECEIVED_BY_ADDRESS, StringConstants.DOUBLE_QUOTE+address+
				StringConstants.DOUBLE_QUOTE+StringConstants.COMMA+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @return OutputModel
	 */
	public OutputModel zListUnspent(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param minConf
	 * @param maxConf
	 * @param includeWatchOnly
	 * @param addresses
	 * @return OutputModel
	 */
	public OutputModel zListUnspent(Configurations config, int minConf, int maxConf, boolean includeWatchOnly, List<String> addresses) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(maxConf);
		params.append(StringConstants.COMMA);
		params.append(includeWatchOnly);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < addresses.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(addresses.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param minConf
	 * @param maxConf
	 * @param includeWatchOnly
	 * @param address
	 * @return OutputModel
	 */
	public OutputModel zListUnspent(Configurations config, int minConf, int maxConf, boolean includeWatchOnly, String address) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(StringConstants.COMMA);
		params.append(maxConf);
		params.append(StringConstants.COMMA);
		params.append(includeWatchOnly);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param fromAddress
	 * @param addressAmountMap
	 * @return OutputModel
	 */
	public OutputModel zSendMany(Configurations config, String fromAddress, Map<String, Double> addressAmountMap) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(fromAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		int i = 0;
		for(String address: addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.OPEN_BRACE);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.ADDRESS);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COLAN);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(address);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COMMA);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.AMOUNT);
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(StringConstants.COLAN);
			params.append(addressAmountMap.get(address));
			params.append(StringConstants.CLOSE_BRACE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param fromAddress
	 * @param toAddress
	 * @param fee
	 * @param limit
	 * @return OutputModel
	 */
	public OutputModel zShieldCoinBase(Configurations config, String fromAddress, String toAddress, double fee, int limit) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(fromAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(toAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(fee);
		params.append(StringConstants.COMMA);
		params.append(limit);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_SHIELD_COIN_BASE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param benchmarkType
	 * @return OutputModel
	 */
	public OutputModel zcBenchmark(Configurations config, String benchmarkType) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(benchmarkType);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ZC_BENCHMARK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * 
	 * @param config
	 * @param benchmarkType
	 * @param sampleCount
	 * @return OutputModel
	 */
	public OutputModel zcBenchmark(Configurations config, String benchmarkType, int sampleCount) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(benchmarkType);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(sampleCount);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ZC_BENCHMARK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

}
