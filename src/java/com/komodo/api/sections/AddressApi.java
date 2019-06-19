package com.komodo.api.sections;

import java.util.List;

import com.komodo.api.constants.StringConstants;
import com.komodo.api.models.Configurations;
import com.komodo.api.utils.KomodoUtil;

public class AddressApi {

	public String getAddressBalance(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder("{\"addresses\": [\"");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("\"]}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_BALANCE, params.toString());
		return output;
	}

	public String getAddressDeltas(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder("{\"addresses\": [");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("]");
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_DELTAS, params.toString());
		return output;
	}

	public String getAddressDeltas(Configurations config, List<String> addresses, int start, int end, boolean chainInfo) {
		StringBuilder params = new StringBuilder("{\"addresses\": [");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("]");
		params.append(",\"start\":");
		params.append(start);
		params.append(",\"end\":");
		params.append(end);
		params.append(",\"chainInfo\":");
		params.append(chainInfo);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_DELTAS, params.toString());
		return output;
	}

	public String getAddressMemPool(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder("{\"addresses\": [\"");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("\"]}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_MEMPOOL, params.toString());
		return output;
	}

	public String getAddressTxIds(Configurations config, List<String> addresses, int start, int end) {
		StringBuilder params = new StringBuilder("{\"addresses\": [");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("]");
		params.append(",\"start\":");
		params.append(start);
		params.append(",\"end\":");
		params.append(end);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_TXIDS, params.toString());
		return output;
	}

	public String getAddressTxIds(Configurations config, List<String> addresses) {
		StringBuilder params = new StringBuilder("{\"addresses\": [");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("]");
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_TXIDS, params.toString());
		return output;
	}

	public String getAddressUtxos(Configurations config, List<String> addresses, boolean chainInfo) {
		StringBuilder params = new StringBuilder("{\"addresses\": [");
		for(String add : addresses) {
			if(addresses.indexOf(add) != 0) {
				params.append(",");
			}
			params.append("\""+add+"\"");
		}
		params.append("]");
		params.append(",\"chainInfo\":");
		params.append(chainInfo);
		params.append("}");
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_ADDRESS_UTXOS, params.toString());
		return output;
	}

	public String getSnapshot(Configurations config, int top) {
		String output = KomodoUtil.fireKomodo(config, StringConstants.GET_SNAPSHOT, "\""+top+"\"");
		return output;
	}
}
