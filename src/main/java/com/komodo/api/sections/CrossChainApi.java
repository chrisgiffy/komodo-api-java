package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.crosschain.CalcMomOutputModel;
import com.komodo.api.models.crosschain.CheckBurnTxOutputModel;
import com.komodo.api.models.crosschain.ConvertToExportOutputModel;
import com.komodo.api.models.crosschain.CreateBurntTransOutputModel;
import com.komodo.api.models.crosschain.CreateNotaryApprovalTxOutputModel;
import com.komodo.api.models.crosschain.GetImportsOutputModel;
import com.komodo.api.models.crosschain.ImpTxOutputModel;
import com.komodo.api.models.crosschain.MoMomDataOutputModel;
import com.komodo.api.models.crosschain.NotarisationsDbOutputModel;
import com.komodo.api.models.crosschain.NotarisationsForBlockOutputModel;
import com.komodo.api.models.crosschain.SelfImportOutputModel;
import com.komodo.api.models.crosschain.WalletBurnTxOutputModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * 
 * @author Giffy Chris
 * The class handles all transactions responsible for cross chain api methods
 *
 */
public class CrossChainApi {
	
	/**
	 * migrate_createburntransaction destChain destAddress amount [tokenid]
	 * The migrate_createburntransaction method creates a transaction burning a specific amount of coins or tokens. 
	 * This method also creates a payouts object which is later used to create an import transaction for the value corresponding to the burned amount. 
	 * This method should be called on the source chain.
	 * 
	 * The method creates a burn transaction and returns it. 
	 * This should be broadcast to the source chain using the sendrawtransaction method. 
	 * After the burn transaction is successfully mined, the user might have to wait for some amount of time for the back notarization to reach the source chain. 
	 * The back notarization contains the MoMoM fingerprints of the mined block that contains the burn transaction.
	 * @param config
	 * @param destChain
	 * @param destAddress
	 * @param amount
	 * @return CreateBurntTransOutputModel
	 */
	public CreateBurntTransOutputModel migrateCreateBurnTransaction(Configurations config, String destChain, String destAddress, double amount) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(destChain);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(destAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(amount);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CREATE_BURN_TRANSACTION, params.toString());
		CreateBurntTransOutputModel outputModel = new Gson().fromJson(output, CreateBurntTransOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_createburntransaction destChain destAddress amount [tokenid]
	 * The migrate_createburntransaction method creates a transaction burning a specific amount of coins or tokens. 
	 * This method also creates a payouts object which is later used to create an import transaction for the value corresponding to the burned amount. 
	 * This method should be called on the source chain.
	 * 
	 * The method creates a burn transaction and returns it. 
	 * This should be broadcast to the source chain using the sendrawtransaction method. 
	 * After the burn transaction is successfully mined, the user might have to wait for some amount of time for the back notarization to reach the source chain. 
	 * The back notarization contains the MoMoM fingerprints of the mined block that contains the burn transaction.
	 * @param config
	 * @param destChain
	 * @param destAddress
	 * @param amount
	 * @param tokenId
	 * @return CreateBurntTransOutputModel
	 */
	public CreateBurntTransOutputModel migrateCreateBurnTransaction(Configurations config, String destChain, String destAddress, double amount, String tokenId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(destChain);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(destAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(amount);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(tokenId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CREATE_BURN_TRANSACTION, params.toString());
		CreateBurntTransOutputModel outputModel = new Gson().fromJson(output, CreateBurntTransOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_converttoexport rawtx dest_symbol
	 * The migrate_converttoexport method allows the user to create a customized burn transaction (as opposed to a fully automated burn transaction). 
	 * This method converts a given transaction to a burn transaction.
	 * 
	 * The method adds proof data to the transaction, extracts the transaction vouts, calculates their value, and burns the value by sending it to an opreturn vout. 
	 * This vout is then added to the created transaction. 
	 * (An opreturn vout cannot be spent at a later date, and therefore funds sent to an opreturn vout are permanently burnt.)
	 * 
	 * The other returned value, payouts, is used in the migrate_createimporttransaction method.
	 * 
	 * The caller of the method bears the responsibility to fund and sign the returned burn transaction using the methods fundrawtransaction and signrawtransaction.
	 * 
	 * The signed burn transaction must be broadcast to the source chain using the sendrawtansaction method.
	 * 
	 * Limitations
	 * The migrate_converttoexport method supports only coins (tokens are not supported)
	 * The burn transaction must be stored in the import transaction's opreturn vout. 
	 * Because an opreturn's data size is limited to 10,001 bytes, we recommend that the user limit the burn transaction's size to 30% of the opreturn object
	 * @param config
	 * @param destChain
	 * @param burnTx
	 * @return ConvertToExportOutputModel
	 */
	public ConvertToExportOutputModel migrateConvertToExport(Configurations config, String destChain, String burnTx) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(destChain);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(burnTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CONVERT_TO_EXPORT, params.toString());
		ConvertToExportOutputModel outputModel = new Gson().fromJson(output, ConvertToExportOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_createimporttransaction burntx payouts [notaryTxid1]...[notaryTxidN]
	 * The migrate_createimporttransaction method performs the initial step in creating an import transaction. 
	 * This method should be called on the source chain.
	 * 
	 * This method returns a created import transaction in hex format. 
	 * This string should be passed to the migrate_completeimporttransaction method on the main KMD chain to be extended with the MoMoM proof object.
	 * 
	 * When using the MoMoM backup solution (described later), the created import transaction is not passed to the migrate_completeimporttransaction method.
	 * 
	 * The user may need to wait for some time before the back notarizations objects are stored in the destination chain
	 * @param config
	 * @param burnTx
	 * @param payouts
	 * @return ImpTxOutputModel
	 */
	public ImpTxOutputModel migrateCreateImportTransaction(Configurations config, String burnTx, String payouts) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(burnTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(payouts);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CREATE_IMPORT_TRANSACTION, params.toString());
		ImpTxOutputModel outputModel = new Gson().fromJson(output, ImpTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_createimporttransaction burntx payouts [notaryTxid1]...[notaryTxidN]
	 * The migrate_createimporttransaction method performs the initial step in creating an import transaction. 
	 * This method should be called on the source chain.
	 * 
	 * This method returns a created import transaction in hex format. 
	 * This string should be passed to the migrate_completeimporttransaction method on the main KMD chain to be extended with the MoMoM proof object.
	 * 
	 * When using the MoMoM backup solution (described later), the created import transaction is not passed to the migrate_completeimporttransaction method.
	 * 
	 * The user may need to wait for some time before the back notarizations objects are stored in the destination chain
	 * @param config
	 * @param burnTx
	 * @param payouts
	 * @param optionalParameters
	 * @return ImpTxOutputModel
	 */
	public ImpTxOutputModel migrateCreateImportTransaction(Configurations config, String burnTx, String payouts, String optionalParameters) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(burnTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(payouts);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(optionalParameters);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CREATE_IMPORT_TRANSACTION, params.toString());
		ImpTxOutputModel outputModel = new Gson().fromJson(output, ImpTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_completeimporttransaction importtx
	 * The migrate_completeimporttransaction method performs the finalizing step in creating an import transaction. 
	 * This method should be called on the KMD (Komodo) chain.
	 * 
	 * This method returns the import transaction in hex format, updated with the MoMoM proof object. 
	 * This object provides confirmation that the burn transaction exists in the source chain.
	 * 
	 * The finalized import transaction should be broadcast on the destination chain through the sendrawtransaction method.
	 * 
	 * Komodo recommends that the user wait until the notarization objects are stored in the destination chain before broadcasting the import transaction. 
	 * Otherwise an error message is returned.
	 * 
	 * In the event that an error is returned, simply wait until the notarization objects are stored in the KMD chain and try again
	 * @param config
	 * @param importTx
	 * @param offset
	 * @return ImpTxOutputModel
	 */
	public ImpTxOutputModel migrateCompleteImportTransaction(Configurations config, String importTx, String offset) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(importTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(offset);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_COMPLETE_IMPORT_TRANSACTION, params.toString());
		ImpTxOutputModel outputModel = new Gson().fromJson(output, ImpTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_completeimporttransaction importtx
	 * The migrate_completeimporttransaction method performs the finalizing step in creating an import transaction. 
	 * This method should be called on the KMD (Komodo) chain.
	 * 
	 * This method returns the import transaction in hex format, updated with the MoMoM proof object. 
	 * This object provides confirmation that the burn transaction exists in the source chain.
	 * 
	 * The finalized import transaction should be broadcast on the destination chain through the sendrawtransaction method.
	 * 
	 * Komodo recommends that the user wait until the notarization objects are stored in the destination chain before broadcasting the import transaction. 
	 * Otherwise an error message is returned.
	 * 
	 * In the event that an error is returned, simply wait until the notarization objects are stored in the KMD chain and try again
	 * @param config
	 * @param importTx
	 * @return ImpTxOutputModel
	 */
	public ImpTxOutputModel migrateCompleteImportTransaction(Configurations config, String importTx) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(importTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_COMPLETE_IMPORT_TRANSACTION, params.toString());
		ImpTxOutputModel outputModel = new Gson().fromJson(output, ImpTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_checkburntransactionsource burntxid
	 * The migrate_checkburntransactionsource method allows a notary operator to check the burn transaction's structure and verify its presence in the source chain
	 * @param config
	 * @param burnTxId
	 * @return CheckBurnTxOutputModel
	 */
	public CheckBurnTxOutputModel migrateCheckBurnTransactionSource(Configurations config, String burnTxId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(burnTxId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CHECK_BURN_TRANSACTION_SOURCE, params.toString());
		CheckBurnTxOutputModel outputModel = new Gson().fromJson(output, CheckBurnTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * migrate_createnotaryapprovaltransaction burntxid txoutproof
	 * A notary operator uses the migrate_createnotaryapprovaltransaction method to create an approval transaction in the destination chain 
	 * with the proof of the burn transaction's existence in the source chain.
	 * 
	 * The returned notary approval transaction should be broadcast to the destination chain using the sendrawtransaction method.
	 * @param config
	 * @param burnTxId
	 * @param txOutProof
	 * @return CreateNotaryApprovalTxOutputModel
	 */
	public CreateNotaryApprovalTxOutputModel migrateCreateNotaryApprovalTransaction(Configurations config, String burnTxId, String txOutProof) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(burnTxId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(txOutProof);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CREATE_NOTARY_APPROVAL_TRANSACTION, params.toString());
		CreateNotaryApprovalTxOutputModel outputModel = new Gson().fromJson(output, CreateNotaryApprovalTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * selfimport destAddress amount
	 * The Self Import API allows a trusted pubkey to create more coins on the same chain.
	 * @param config
	 * @param destAddress
	 * @param amount
	 * @return SelfImportOutputModel
	 */
	public SelfImportOutputModel selfImport(Configurations config, String destAddress, double amount) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(destAddress);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(amount);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SELF_IMPORT, params.toString());
		SelfImportOutputModel outputModel = new Gson().fromJson(output, SelfImportOutputModel.class);
		return outputModel;
	}
	
	/**
	 * calc_MoM height MoMdepth
	 * The calc_MoM method calculates the value of the merkle root of the blocks' merkle roots (MoM), 
	 * starting from the block of the indicated height for the chosen depth.
	 * 
	 * Note
	 * This method should be run on a Smart Chain.
	 * @param config
	 * @param height
	 * @param moMDepth
	 * @return CalcMomOutputModel
	 */
	public CalcMomOutputModel calcMoM(Configurations config, int height, int moMDepth) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(moMDepth);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CALC_MOM, params.toString());
		CalcMomOutputModel outputModel = new Gson().fromJson(output, CalcMomOutputModel.class);
		return outputModel;
	}
	
	/**
	 * MoMoMdata symbol kmdheight ccid
	 * The MoMoMdata method calculates the value of the merkle root of merkle roots of the blocks' merkle roots (MoMoM), 
	 * starting from the block of the indicated height for the data of the indicated chain.
	 * 
	 * Note
	 * Execute this method on the KMD chain.
	 * @param config
	 * @param symbol
	 * @param kmdHeight
	 * @param ccId
	 * @return MoMomDataOutputModel
	 */
	public MoMomDataOutputModel moMomMData(Configurations config, String symbol, int kmdHeight, int ccId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(symbol);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(kmdHeight);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(ccId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MO_MOM_DATA, params.toString());
		MoMomDataOutputModel outputModel = new Gson().fromJson(output, MoMomDataOutputModel.class);
		return outputModel;
	}
	
	/**
	 * assetchainproof txid
	 * The assetchainproof method scans the chain for the back MoM notarization for a transaction corresponding to the given transaction id and returns a proof object with MoM branch. 
	 * Scanning is performed from the height up to the chain tip, with a limit of 1440 blocks.
	 * @param config
	 * @param txId
	 * @return OutputModel
	 */ 
	public OutputModel assetChainProof(Configurations config, String txId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ASSET_CHAIN_PROOF, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * getNotarisationsForBlock height
	 * The getNotarisationsForBlock method returns the notarization transactions within the block of the given block hash.
	 * @param config
	 * @param height
	 * @return NotarisationsForBlockOutputModel
	 */
	public NotarisationsForBlockOutputModel getNotarisationsForBlock(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NOTARISATIONS_FOR_BLOCK, params.toString());
		NotarisationsForBlockOutputModel outputModel = new Gson().fromJson(output, NotarisationsForBlockOutputModel.class);
		return outputModel;
	}
	
	/**
	 * scanNotarisationsDB blockHeight symbol [blocksLimit=1440]
	 * The scanNotarisationsDB method scans the notarization database backwards from the given block height for a notarization of the chain with the given name (symbol).
	 * @param config
	 * @param blockHeight
	 * @param symbol
	 * @param blockLimit
	 * @return NotarisationsDbOutputModel
	 */
	public NotarisationsDbOutputModel scanNotarisationsDB(Configurations config, int blockHeight, String symbol, int blockLimit) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(blockHeight);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(symbol);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(blockLimit);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SCAN_NOTARISATOIONS_DB, params.toString());
		NotarisationsDbOutputModel outputModel = new Gson().fromJson(output, NotarisationsDbOutputModel.class);
		return outputModel;
	}
	
	/**
	 * scanNotarisationsDB blockHeight symbol [blocksLimit=1440]
	 * The scanNotarisationsDB method scans the notarization database backwards from the given block height for a notarization of the chain with the given name (symbol).
	 * @param config
	 * @param blockHeight
	 * @param symbol
	 * @return NotarisationsDbOutputModel
	 */
	public NotarisationsDbOutputModel scanNotarisationsDB(Configurations config, int blockHeight, String symbol) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(blockHeight);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(symbol);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.SCAN_NOTARISATOIONS_DB, params.toString());
		NotarisationsDbOutputModel outputModel = new Gson().fromJson(output, NotarisationsDbOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getimports hash|height
	 * The getimports method lists import transactions in the indicated block of the chain
	 * @param config
	 * @param height
	 * @return GetImportsOutputModel
	 */
	public GetImportsOutputModel getImports(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_IMPORTS, params.toString());
		GetImportsOutputModel outputModel = new Gson().fromJson(output, GetImportsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getimports hash|height
	 * The getimports method lists import transactions in the indicated block of the chain
	 * @param config
	 * @param hash
	 * @return GetImportsOutputModel
	 */
	public GetImportsOutputModel getImports(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_IMPORTS, params.toString());
		GetImportsOutputModel outputModel = new Gson().fromJson(output, GetImportsOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getwalletburntransactions "count"
	 * The getwalletburntransactions method lists all the burn transactions in the current wallet.
	 * @param config
	 * @param count
	 * @return WalletBurnTxOutputModel
	 */
	public WalletBurnTxOutputModel getWalletBurnTransactions(Configurations config, int count) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(count);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_BURN_TRANSACTIONS, params.toString());
		WalletBurnTxOutputModel outputModel = new Gson().fromJson(output, WalletBurnTxOutputModel.class);
		return outputModel;
	}
	
	/**
	 * getwalletburntransactions "count"
	 * The getwalletburntransactions method lists all the burn transactions in the current wallet.
	 * @param config
	 * @return WalletBurnTxOutputModel
	 */
	public WalletBurnTxOutputModel getWalletBurnTransactions(Configurations config) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_BURN_TRANSACTIONS, params.toString());
		WalletBurnTxOutputModel outputModel = new Gson().fromJson(output, WalletBurnTxOutputModel.class);
		return outputModel;
	}

}
