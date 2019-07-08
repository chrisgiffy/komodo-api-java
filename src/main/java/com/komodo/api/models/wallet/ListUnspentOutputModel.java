package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ListUnspentOutputModel {
	
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
		@SerializedName("vout")
		private int vout;
		@SerializedName("generated")
		private boolean generated;
		@SerializedName("address")
		private String address;
		@SerializedName("scriptPubKey")
		private String scriptPubKey;
		@SerializedName("amount")
		private double amount;
		@SerializedName("interest")
		private double interest;
		@SerializedName("rawconfirmations")
		private int rawConfirmations;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("spendable")
		private boolean spendable;
		
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public int getVout() {
			return vout;
		}
		public void setVout(int vout) {
			this.vout = vout;
		}
		public boolean getGenerated() {
			return generated;
		}
		public void setGenerated(boolean generated) {
			this.generated = generated;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getScriptPubKey() {
			return scriptPubKey;
		}
		public void setScriptPubKey(String scriptPubKey) {
			this.scriptPubKey = scriptPubKey;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public double getInterest() {
			return interest;
		}
		public void setInterest(double interest) {
			this.interest = interest;
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
		public boolean getSpendable() {
			return spendable;
		}
		public void setSpendable(boolean spendable) {
			this.spendable = spendable;
		}
	}

}
