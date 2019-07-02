package com.komodo.api.models.wallet;

import com.google.gson.annotations.SerializedName;

public class SetPubKeyOutputModel {
	
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
		@SerializedName("address")
		private String address;
		@SerializedName("ismine")
		private boolean isMine;
		@SerializedName("pubkey")
		private String pubKey;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public boolean isMine() {
			return isMine;
		}
		public void setMine(boolean isMine) {
			this.isMine = isMine;
		}
		public String getPubKey() {
			return pubKey;
		}
		public void setPubKey(String pubKey) {
			this.pubKey = pubKey;
		}
	}

}
