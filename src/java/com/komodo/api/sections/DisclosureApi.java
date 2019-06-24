package com.komodo.api.sections;

import com.google.gson.Gson;
import com.komodo.api.constants.KomodoCommandsConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.models.OutputModel;
import com.komodo.api.utils.KomodoUtil;

public class DisclosureApi {
	public OutputModel zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(sjIndex);
		params.append(",");
		params.append(outputIndex);
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex, String message) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(sjIndex);
		params.append(",");
		params.append(outputIndex);
		params.append(",\"");
		params.append(message);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
	
	public OutputModel zValidatePaymentDisclosure(Configurations config, String paymentDisclosure) {
		String output = KomodoUtil.fireKomodo(config, KomodoCommandsConstants.Z_VALIDATE_PAYMENT_DISCLOSURE, "\""+paymentDisclosure+"\"");
		OutputModel outputModel = new Gson().fromJson(output, OutputModel.class);
		return outputModel;
	}
}
