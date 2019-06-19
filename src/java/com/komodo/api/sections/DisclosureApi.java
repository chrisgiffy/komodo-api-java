package com.komodo.api.sections;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class DisclosureApi {
	public String zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(sjIndex);
		params.append(",");
		params.append(outputIndex);
		String output = KomodoUtil.fireKomodo(config, StringConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		return output;
	}
	
	public String zGetPaymentDisclosure(Configurations config, String txId, int sjIndex, int outputIndex, String message) {
		StringBuilder params = new StringBuilder("\"");
		params.append(txId);
		params.append("\",");
		params.append(sjIndex);
		params.append(",");
		params.append(outputIndex);
		params.append(",\"");
		params.append(message);
		params.append("\"");
		String output = KomodoUtil.fireKomodo(config, StringConstants.Z_GET_PAYMENT_DISCLOSURE, params.toString());
		return output;
	}
	
	public String zValidatePaymentDisclosure(Configurations config, String paymentDisclosure) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.Z_VALIDATE_PAYMENT_DISCLOSURE, "\""+paymentDisclosure+"\"");
		return output;
	}
}
