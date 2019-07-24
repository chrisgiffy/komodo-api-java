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

public class CrossChainApi {
	
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
	
	public ImpTxOutputModel migrateCompleteImportTransaction(Configurations config, String importTx) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(importTx);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_COMPLETE_IMPORT_TRANSACTION, params.toString());
		ImpTxOutputModel outputModel = new Gson().fromJson(output, ImpTxOutputModel.class);
		return outputModel;
	}
	
	public CheckBurnTxOutputModel migrateCheckBurnTransactionSource(Configurations config, String burnTxId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(burnTxId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.MIGRATE_CHECK_BURN_TRANSACTION_SOURCE, params.toString());
		CheckBurnTxOutputModel outputModel = new Gson().fromJson(output, CheckBurnTxOutputModel.class);
		return outputModel;
	}
	
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
	
	public OutputModel assetChainProof(Configurations config, String txId) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ASSET_CHAIN_PROOF, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public NotarisationsForBlockOutputModel getNotarisationsForBlock(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_NOTARISATIONS_FOR_BLOCK, params.toString());
		NotarisationsForBlockOutputModel outputModel = new Gson().fromJson(output, NotarisationsForBlockOutputModel.class);
		return outputModel;
	}
	
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
	
	public GetImportsOutputModel getImports(Configurations config, int height) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(height);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_IMPORTS, params.toString());
		GetImportsOutputModel outputModel = new Gson().fromJson(output, GetImportsOutputModel.class);
		return outputModel;
	}
	
	public GetImportsOutputModel getImports(Configurations config, String hash) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(hash);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_IMPORTS, params.toString());
		GetImportsOutputModel outputModel = new Gson().fromJson(output, GetImportsOutputModel.class);
		return outputModel;
	}
	
	public WalletBurnTxOutputModel getWalletBurnTransactions(Configurations config, int count) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(count);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_BURN_TRANSACTIONS, params.toString());
		WalletBurnTxOutputModel outputModel = new Gson().fromJson(output, WalletBurnTxOutputModel.class);
		return outputModel;
	}
	
	public WalletBurnTxOutputModel getWalletBurnTransactions(Configurations config) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.GET_WALLET_BURN_TRANSACTIONS, params.toString());
		WalletBurnTxOutputModel outputModel = new Gson().fromJson(output, WalletBurnTxOutputModel.class);
		return outputModel;
	}

}
