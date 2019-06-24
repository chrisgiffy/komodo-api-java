package com.komodo.api.sections;

import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class WalletApi {
	public OutputModel addMultiSigAddress(Configurations config, int nRequired, List<String> keysObject) {
		StringBuilder params = new StringBuilder("");
		params.append(nRequired);
		params.append(",[");
		for(int i = 0; i < keysObject.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(keysObject.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ADD_MULTI_SIG_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel addMultiSigAddress(Configurations config, int nRequired, List<String> keysObject, String address) {
		StringBuilder params = new StringBuilder("");
		params.append(nRequired);
		params.append(",[");
		for(int i = 0; i < keysObject.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(keysObject.get(i));
			params.append("\"");
		}
		params.append("],\"");
		params.append(address);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ADD_MULTI_SIG_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel backupWallet(Configurations config, String destination) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.BACKUP_WALLET, "\""+destination+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel dumpPrivKey(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DUMP_PRIV_KEY, "\""+address+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel dumpWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DUMP_WALLET, "\""+fileName+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel encryptWallet(Configurations config, String passPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ENCRYPT_WALLET, "\""+passPhrase+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getAccount(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ACCOUNT, "\""+address+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getAccountAddress(Configurations config, String account) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ACCOUNT_ADDRESS, "\""+account+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getAddressesByAccount(Configurations config, String account) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_ADDRESSES_BY_ACCOUNT, "\""+account+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBalance(Configurations config, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, "\"\","+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getBalance(Configurations config, int minConf, boolean includeWatchOnly) {
		StringBuilder params = new StringBuilder("\"\",");
		params.append(minConf);
		params.append(",");
		params.append(includeWatchOnly);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_BALANCE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNewAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NEW_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getNewAddress(Configurations config, String account) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NEW_ADDRESS, "\""+account+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getRawChangeAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RAW_CHANGE_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getReceivedByAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RECEIVED_BY_ADDRESS, "\""+address+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getReceivedByAddress(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_RECEIVED_BY_ADDRESS, "\""+address+"\","+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getTransaction(Configurations config, String txId, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_TRANSACTION, "\""+txId+"\","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getUnconfirmedBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_UNCONFIRMED_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel getWalletInfo(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_INFO, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel importAddress(Configurations config, String address, boolean rescan) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_ADDRESS, "\""+address+"\","+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel importAddress(Configurations config, String address, boolean rescan, String label) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_ADDRESS, "\""+address+"\",\""+label+"\","+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel importPrivKey(Configurations config, String address, boolean rescan) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_PRIV_KEY, "\""+address+"\","+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel importPrivKey(Configurations config, String address, boolean rescan, String label) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_PRIV_KEY, "\""+address+"\",\""+label+"\","+rescan);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel importWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.IMPORT_WALLET, "\""+fileName+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel keyPoolRefill(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KEY_POOL_REFILL, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel keyPoolRefill(Configurations config, int newSize) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.KEY_POOL_REFILL, ""+newSize);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listAddressGroupings(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_ADDRESS_GROUPINGS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listLockUnspent(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_LOCK_UNSPENT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listReceivedByAddress(Configurations config, int minConf, boolean includeEmpty, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_RECEIVED_BY_ADDRESS, ""+minConf+","+includeEmpty+","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listInCeBlock(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listInCeBlock(Configurations config, String blockHash, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, "\""+blockHash+"\","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listInCeBlock(Configurations config, int targetConfirmations, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, targetConfirmations+","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listInCeBlock(Configurations config, String blockHash, int targetConfirmations, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_IN_CE_BLOCK, "\""+blockHash+"\","+targetConfirmations+","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listTransactions(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_TRANSACTIONS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listTransactions(Configurations config, int count, int from, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_TRANSACTIONS, "\"*\","+count+","+from+","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel listUnspent(Configurations config, int minConf, int maxConf, List<String> addresses) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(",");
		params.append(maxConf);
		params.append(",[");
		for(int i = 0; i < addresses.size(); i++) {
			if( i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(addresses.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel lockUnspent(Configurations config, boolean unlock, String txId, int vout) {
		StringBuilder params = new StringBuilder();
		params.append(unlock);
		params.append(",");
		params.append("[{\"txid\":\"");
		params.append(txId);
		params.append("\",\"vout\":");
		params.append(vout);
		params.append("]}");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.LOCK_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel resentWalletTransaction(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.RESEND_WALLET_TRANSACTION, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment) {
		StringBuilder params =  new StringBuilder("\"");
		params.append(account);
		params.append("\",{");
		int i = 0;
		for(String address : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(address);
			params.append("\":");
			params.append(addressAmountMap.get(address));
			i++;
		}
		params.append("},");
		params.append(minConf);
		params.append(",\"");
		params.append(comment);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment, List<String> addresses) {
		StringBuilder params =  new StringBuilder("\"");
		params.append(account);
		params.append("\",{");
		int i = 0;
		for(String address : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(address);
			params.append("\":");
			params.append(addressAmountMap.get(address));
			i++;
		}
		params.append("},");
		params.append(minConf);
		params.append(",\"");
		params.append(comment);
		params.append("\",[");
		for(int j = 0; j < addresses.size(); j++) {
			if(j > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(addresses.get(j));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel sendMany(Configurations config, String account, Map<String, Double> addressAmountMap, int minConf, String comment, String address) {
		StringBuilder params =  new StringBuilder("\"");
		params.append(account);
		params.append("\",{");
		int i = 0;
		for(String addressMap : addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(addressMap);
			params.append("\":");
			params.append(addressAmountMap.get(addressMap));
			i++;
		}
		params.append("},");
		params.append(minConf);
		params.append(",\"");
		params.append(comment);
		params.append("\",\"");
		params.append(address);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel sendToAddress(Configurations config, String address, double amount, String comment, String commentTo, boolean subtractFeeFromAmount) {
		StringBuilder params = new StringBuilder("\"");
		params.append(address);
		params.append("\",");
		params.append(amount);
		params.append(",\"");
		params.append(comment);
		params.append("\",\"");
		params.append(commentTo);
		params.append("\",");
		params.append(subtractFeeFromAmount);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SEND_TO_ADDRESS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel setPubKey(Configurations config, String pubKey) {
		StringBuilder params = new StringBuilder("\"");
		params.append(pubKey);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_PUB_KEY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel setTxFee(Configurations config, double amount) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SET_TX_FEE, ""+amount);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel signMessage(Configurations config, String address, String message) {
		StringBuilder params = new StringBuilder("\"");
		params.append(address);
		params.append("\",\"");
		params.append(message);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SIGN_MESSAGE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel walletLock(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_LOCK, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel walletPassPhrase(Configurations config, String passPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE, "\""+passPhrase+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel walletPassPhrase(Configurations config, String passPhrase, int timeout) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE, "\""+passPhrase+"\","+timeout);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel walletPassPhraseChange(Configurations config, String oldPassPhrase, String newPassPhrase) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.WALLET_PASS_PHRASE_CHANGE, "\""+oldPassPhrase+"\",\""+newPassPhrase+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zExportKey(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_KEY, "\""+zAddress+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zExportViewingKey(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_VIEWING_KEY, "\""+zAddress+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zExportWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_EXPORT_WALLET, "\""+fileName+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zgetBalance(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_BALANCE, "\""+address+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zExportWallet(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_BALANCE, "\""+address+"\","+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetNewAddress(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_NEW_ADDRESS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetOperationResult(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_RESULT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetOperationResult(Configurations config, List<String> operationIds) {
		StringBuilder params = new StringBuilder("[");
		for(int i = 0; i < operationIds.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(operationIds.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_RESULT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetOperationStatus(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_STATUS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetOperationStatus(Configurations config, List<String> operationIds) {
		StringBuilder params = new StringBuilder("[");
		for(int i = 0; i < operationIds.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(operationIds.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_OPERATION_STATUS, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetTotalBalance(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetTotalBalance(Configurations config, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, ""+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetTotalBalance(Configurations config, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, ""+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zGetTotalBalance(Configurations config, int minConf, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_TOTAL_BALANCE, minConf+","+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zImportKey(Configurations config, String zPrivateKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_KEY, "\""+zPrivateKey+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zImportKey(Configurations config, String zPrivateKey, String rescan, int startHeight) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_KEY, "\""+zPrivateKey+"\",\""+rescan+"\","+startHeight);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zImportViewingKey(Configurations config, String viewingKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_VIEWING_KEY, "\""+viewingKey+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zImportViewingKey(Configurations config, String viewingKey, String rescan, int startHeight) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_VIEWING_KEY, "\""+viewingKey+"\",\""+rescan+"\","+startHeight);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zImportWallet(Configurations config, String fileName) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_IMPORT_WALLET, "\""+fileName+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListAddresses(Configurations config, boolean includeWatchOnly) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_ADDRESSES, ""+includeWatchOnly);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListOperationIds(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_OPERATION_IDS, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListOperationIds(Configurations config, String status) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_OPERATION_IDS, "\""+status+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListReceivedByAddress(Configurations config, String address, int minConf) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_RECEIVED_BY_ADDRESS, "\""+address+"\","+minConf);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListUnspent(Configurations config) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, null);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListUnspent(Configurations config, int minConf, int maxConf, boolean includeWatchOnly, List<String> addresses) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(",");
		params.append(maxConf);
		params.append(",");
		params.append(includeWatchOnly);
		params.append(",[");
		for(int i = 0; i < addresses.size(); i++) {
			if(i > 0) {
				params.append(",");
			}
			params.append("\"");
			params.append(addresses.get(i));
			params.append("\"");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	public OutputModel zListUnspent(Configurations config, int minConf, int maxConf, boolean includeWatchOnly, String address) {
		StringBuilder params = new StringBuilder();
		params.append(minConf);
		params.append(",");
		params.append(maxConf);
		params.append(",");
		params.append(includeWatchOnly);
		params.append(",\"");
		params.append(address);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_LIST_UNSPENT, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zSendMany(Configurations config, String fromAddress, Map<String, Double> addressAmountMap) {
		StringBuilder params = new StringBuilder("\"");
		params.append(fromAddress);
		params.append("\",[");
		int i = 0;
		for(String address: addressAmountMap.keySet()) {
			if(i > 0) {
				params.append(",");
			}
			params.append("{\"address\":\"");
			params.append(address);
			params.append("\", \"amount\":");
			params.append(addressAmountMap.get(address));
			params.append("}");
		}
		params.append("]");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_SEND_MANY, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zShieldCoinBase(Configurations config, String fromAddress, String toAddress, double fee, int limit) {
		StringBuilder params = new StringBuilder("\"");
		params.append(fromAddress);
		params.append("\",\"");
		params.append(toAddress);
		params.append("\",");
		params.append(fee);
		params.append(",");
		params.append(limit);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_SHIELD_COIN_BASE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zcBenchmark(Configurations config, String benchmarkType) {
		StringBuilder params = new StringBuilder("\"");
		params.append(benchmarkType);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ZC_BENCHMARK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zcBenchmark(Configurations config, String benchmarkType, int sampleCount) {
		StringBuilder params = new StringBuilder("\"");
		params.append(benchmarkType);
		params.append("\",");
		params.append(sampleCount);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ZC_BENCHMARK, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

}
