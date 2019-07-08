package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ListReceivedByAddressOutputModel {
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
		@SerializedName("txids")
		private List<String> txIds;
		
		@SerializedName("confirmations")
		private int confirmations;

		@SerializedName("account")
		private String account;
		
		@SerializedName("amount")
		private double amount;
		
		@SerializedName("rawconfirmations")
		private int rawConfirmations;

		public List<String> getTxIds() {
			return txIds;
		}

		public void setTxIds(List<String> txIds) {
			this.txIds = txIds;
		}

		public int getConfirmations() {
			return confirmations;
		}

		public void setConfirmations(int confirmations) {
			this.confirmations = confirmations;
		}

		public String getAccount() {
			return account;
		}

		public void setAccount(String account) {
			this.account = account;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public int getRawConfirmations() {
			return rawConfirmations;
		}

		public void setRawConfirmations(int rawConfirmations) {
			this.rawConfirmations = rawConfirmations;
		}
		
	}
}
