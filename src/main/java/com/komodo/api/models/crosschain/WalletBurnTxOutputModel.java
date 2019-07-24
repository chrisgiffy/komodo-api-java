package com.komodo.api.models.crosschain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class WalletBurnTxOutputModel {

	private String error;
	private String id;
	private List<Result> result;

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

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("txid")
		private String txId;
		@SerializedName("burnedAmount")
		private double burnedAmount;
		@SerializedName("targetSymbol")
		private String targetSymbol;
		@SerializedName("targetCCid")
		private String targetCcId;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public double getBurnedAmount() {
			return burnedAmount;
		}
		public void setBurnedAmount(double burnedAmount) {
			this.burnedAmount = burnedAmount;
		}
		public String getTargetSymbol() {
			return targetSymbol;
		}
		public void setTargetSymbol(String targetSymbol) {
			this.targetSymbol = targetSymbol;
		}
		public String getTargetCcId() {
			return targetCcId;
		}
		public void setTargetCcId(String targetCcId) {
			this.targetCcId = targetCcId;
		}
		
	}
}


