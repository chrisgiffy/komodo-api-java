package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ZListUnspentOutputModel {
	private String id;
	private String error;
	private List<Result> result;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
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
		@SerializedName("outindex")
		private int outIndex;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("rawconfirmations")
		private int rawConfirmations;
		@SerializedName("spendable")
		private boolean spendable;
		@SerializedName("amount")
		private double amount;
		@SerializedName("memo")
		private String memo;
		@SerializedName("change")
		private boolean change;
		
		public boolean getSpendable() {
			return spendable;
		}
		public void setSpendable(boolean spendable) {
			this.spendable = spendable;
		}
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getMemo() {
			return memo;
		}
		public void setMemo(String memo) {
			this.memo = memo;
		}
		public int getOutIndex() {
			return outIndex;
		}
		public void setOutIndex(int outIndex) {
			this.outIndex = outIndex;
		}
		public int getRawConfirmations() {
			return rawConfirmations;
		}
		public void setRawConfirmations(int rawConfirmations) {
			this.rawConfirmations = rawConfirmations;
		}
		public int getConfirmations() {
			return confirmations;
		}
		public void setConfirmations(int confirmations) {
			this.confirmations = confirmations;
		}
		public boolean getChange() {
			return change;
		}
		public void setChange(boolean change) {
			this.change = change;
		}
	}

}
