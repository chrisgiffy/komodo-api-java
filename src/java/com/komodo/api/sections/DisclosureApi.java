package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;
/**
 * EXPERIMENTAL FEATURE: Payment disclosure is currently DISABLED. This call always fails.
 * @author Giffy Chris
 *
 */
public class DisclosureApi {
	
	/**
	 * EXPERIMENTAL FEATURE: Payment disclosure is currently DISABLED. This call always fails.
	 * The z_getpaymentdisclosure method generates a payment disclosure for a given joinsplit output.
	 * @param config
	 * @param txId
	 * @param sjIndex
	 * @param outputIndex
	 * @return
	 */
	public OutputModel zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(sjIndex);
		params.append(StringConstants.COMMA);
		params.append(outputIndex);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * EXPERIMENTAL FEATURE: Payment disclosure is currently DISABLED. This call always fails.
	 * The z_getpaymentdisclosure method generates a payment disclosure for a given joinsplit output.
	 * @param config
	 * @param txId
	 * @param sjIndex
	 * @param outputIndex
	 * @param message
	 * @return
	 */
	public OutputModel zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex, String message) {
		StringBuilder params = new StringBuilder(StringConstants.DOUBLE_QUOTE);
		params.append(txId);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(StringConstants.COMMA);
		params.append(sjIndex);
		params.append(StringConstants.COMMA);
		params.append(outputIndex);
		params.append(StringConstants.COMMA);
		params.append(StringConstants.DOUBLE_QUOTE);
		params.append(message);
		params.append(StringConstants.DOUBLE_QUOTE);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	/**
	 * EXPERIMENTAL FEATURE: Payment disclosure is currently DISABLED. This call always fails.
	 * The z_validatepaymentdisclosure method validates a payment disclosure.
	 * @param config
	 * @param paymentDisclosure
	 * @return
	 */
	public OutputModel zValidatePaymentDisclosure(Configurations config, String paymentDisclosure) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_VALIDATE_PAYMENT_DISCLOSURE, StringConstants.DOUBLE_QUOTE+paymentDisclosure+StringConstants.DOUBLE_QUOTE);
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
