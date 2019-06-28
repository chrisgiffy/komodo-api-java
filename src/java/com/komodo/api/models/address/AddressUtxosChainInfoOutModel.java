package com.komodo.api.models.address;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.komodo.api.models.Utxos;

public class AddressUtxosChainInfoOutModel {
	private String error;
	private String id;
	private Result result;

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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("utxos")
		private List<Utxos> utxos;
		@SerializedName("hash")
		private String hash;
		@SerializedName("hash")
		private int height;
		
		public List<Utxos> getUtxos() {
			return utxos;
		}
		public void setUtxos(List<Utxos> utxos) {
			this.utxos = utxos;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		
	}
}
