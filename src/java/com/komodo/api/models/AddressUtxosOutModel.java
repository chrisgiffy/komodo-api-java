package com.komodo.api.models;

import java.util.List;

public class AddressUtxosOutModel {
	private String error;
	private String id;
	private List<Utxos> result;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Utxos> getResult() {
		return result;
	}

	public void setResult(List<Utxos> result) {
		this.result = result;
	}
}
