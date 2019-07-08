package com.komodo.api.sections;

import java.util.List;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.models.util.BooleanOutputModel;
import com.komodo.api.models.util.CreateMultiSigOutputModel;
import com.komodo.api.models.util.DecodeCCOpretOutputModel;
import com.komodo.api.models.util.ValidateAddressOutputModel;
import com.komodo.api.models.util.ZValidateAddressOutputModel;
import com.komodo.api.utils.KomodoUtil;

/**
 * The following RPC calls interact with the komodod software, and are made available through the komodo-cli software.
 * @author Giffy Chris
 *
 */
public class UtilApi {
	
/**
 * createmultisig nrequired [ "key", ... ]
 * The createmultisig method creates a multi-signature address with n signature(s) of m key(s) required. 
 * The method returns a json object with the address and redeemScript.
 * @param config
 * @param numberRequired
 * @param keys
 * @return CreateMultiSigOutputModel
 */
	public CreateMultiSigOutputModel createMultiSig(Configurations config, int numberRequired, List<String> keys) {
		StringBuilder params = new StringBuilder();
		params.append(numberRequired);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.OPEN_BRACKET);
		for(int i = 0; i < keys.size(); i++) {
			if(i > 0) {
				params.append(StringConstants.COMMA);
			}
			params.append(StringConstants.DOUBLE_QUOTE);
			params.append(keys.get(i));
			params.append(StringConstants.DOUBLE_QUOTE);
		}
		params.append(StringConstants.CLOSE_BRACKET);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.CREATE_MULTI_SIG, params.toString());
		CreateMultiSigOutputModel outputModel = new Gson().fromJson(output, CreateMultiSigOutputModel.class);
		return outputModel;
	}

	/**
	 * decodeccopret scriptPubKey
	 * The decodeccopret method decodes the OP RETURN data from a CC transaction to output the EVALCODE and function id of the method that produced the transaction.
	 * Finding the OP RETURN Data From a CC Transaction
	 * The OP RETURN data from a CC transaction can be found by following these steps:
	 * Decode a transaction produced by a CC module using the method getrawtransaction's verbose option.
	 * Look for the vout key; it is an array of jsons
	 * Find the json that contains the scriptPubkey, and which has the type:nulldata key pair
	 * Copy the hex value from that scriptPubkey json
	 * This is the hex-string that is expected as the argument for the above method.
	 * You can verify that the transaction was produced by a CC module by checking if one of the vout json's scriptPubkey json has the type:cryptocondition key pair
	 * @param config
	 * @param scriptPubKey
	 * @return DecodeCCOpretOutputModel
	 */
	public DecodeCCOpretOutputModel decodeCcOpert(Configurations config, String scriptPubKey) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.DECODE_CC_OPERET, StringConstants.DOUBLE_QUOTE+scriptPubKey+StringConstants.DOUBLE_QUOTE);
		DecodeCCOpretOutputModel outputModel = new Gson().fromJson(output, DecodeCCOpretOutputModel.class);
		return outputModel;
	}

	/**
	 * estimatefee nblocks
	 * The estimatefee method estimates the approximate fee per kilobyte. The method is needed for a transaction to begin confirmation within nblocks blocks.
	 * The value -1.0 is returned if not enough transactions and blocks have been observed to make an estimate
	 * @param config
	 * @param nBlocks
	 * @return OutputModel
	 */
	public OutputModel estimateFee(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_FEE, StringConstants.BLANK+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * estimatepriority nblocks
	 * The estimatepriority method estimates the approximate priority of a zero-fee transaction, when it needs to begin confirmation within nblocks blocks.
	 * The value -1.0 is returned if not enough transactions and blocks have been observed to make an estimate.
	 * @param config
	 * @param nBlocks
	 * @return OutputModel
	 */
	public OutputModel estimatePriority(Configurations config, int nBlocks) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.ESTIMATE_PRIORITY, StringConstants.BLANK+nBlocks);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * invalidateblock "hash"
	 * The invalidateblock method permanently marks a block as invalid, as if it violated a consensus rule.
	 * @param config
	 * @param hash
	 * @return OutputModel
	 */
	public OutputModel invalidateBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.INVALIDATE_BLOCK, StringConstants.DOUBLE_QUOTE+hash+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * reconsiderblock "hash"
	 * The reconsiderblock method removes invalidity status of a block and its descendants, reconsidering them for activation. 
	 * This can be used to undo the effects of the invalidateblock method
	 * @param config
	 * @param hash
	 * @return OutputModel
	 */
	public OutputModel reconsiderBlock(Configurations config, String hash) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.RECONSIDER_BLOCK, StringConstants.DOUBLE_QUOTE+hash+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * txnotarizedconfirmed txid
	 * The txnotarizedconfirmed method returns information about a transaction's state of confirmation.
	 * If the transaction is on a chain that has Komodo's dPoW security service, the method returns true if the transaction is notarized.
	 * If the chain does not have dPoW, the method returned true if the confirmation number is greater than 60.
	 * @param config
	 * @param txId
	 * @return BooleanOutputModel
	 */
	public BooleanOutputModel txNotarizedConfirmed(Configurations config, String txId) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.TX_NOTORIZED_CONFIRMED, StringConstants.DOUBLE_QUOTE+txId+StringConstants.DOUBLE_QUOTE);
		BooleanOutputModel outputModel = new Gson().fromJson(output, BooleanOutputModel.class);
		return outputModel;
	}

	/**
	 * validateaddress "komodoaddress"
	 * The validateaddress method returns information about the given address.
	 * @param config
	 * @param address
	 * @return ValidateAddressOutputModel
	 */
	public ValidateAddressOutputModel validateAddress(Configurations config, String address) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VALIDATE_ADDRESS, StringConstants.DOUBLE_QUOTE+address+StringConstants.DOUBLE_QUOTE);
		ValidateAddressOutputModel outputModel = new Gson().fromJson(output, ValidateAddressOutputModel.class);
		return outputModel;
	}

	/**
	 * verifymessage "address" "signature" "message"
	 * The verifymessage method verifies a signed message.
	 * @param config
	 * @param address
	 * @param signature
	 * @param message
	 * @return BooleanOutputModel
	 */
	public OutputModel verifyMessage(Configurations config, String address, String signature, String message) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(address);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(signature);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(message);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.VERIFY_MESSAGE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}

	/**
	 * z_validateaddress "zaddr"
	 * The z_validateaddress method returns information about the given z address
	 * @param config
	 * @param zAddress
	 * @return
	 */
	public ZValidateAddressOutputModel zValidateAddress(Configurations config, String zAddress) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_VALIDATE_ADDRESS, StringConstants.DOUBLE_QUOTE+zAddress+StringConstants.DOUBLE_QUOTE);
		ZValidateAddressOutputModel outputModel = new Gson().fromJson(output, ZValidateAddressOutputModel.class);
		return outputModel;
	}
	
}
