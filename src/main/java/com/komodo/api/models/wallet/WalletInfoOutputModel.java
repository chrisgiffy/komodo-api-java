package com.komodo.api.models.wallet;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class WalletInfoOutputModel {
	
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
		@SerializedName("walletversion")
		private int walletVersion;
		@SerializedName("balance")
		private double balance;
		@SerializedName("unconfirmed_balance")
		private double unconfirmedBalance;
		@SerializedName("immature_balance")
		private double immatureBalance;
		@SerializedName("txcount")
		private int txCount;
		@SerializedName("keypoololdest")
		private long keyPoolOldest;
		@SerializedName("keypoolsize")
		private int keypoolSize;
		@SerializedName("paytxfee")
		private double payTxFee;
		public int getWalletVersion() {
			return walletVersion;
		}
		public void setWalletVersion(int walletVersion) {
			this.walletVersion = walletVersion;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getUnconfirmedBalance() {
			return unconfirmedBalance;
		}
		public void setUnconfirmedBalance(double unconfirmedBalance) {
			this.unconfirmedBalance = unconfirmedBalance;
		}
		public double getImmatureBalance() {
			return immatureBalance;
		}
		public void setImmatureBalance(double immatureBalance) {
			this.immatureBalance = immatureBalance;
		}
		public int getTxCount() {
			return txCount;
		}
		public void setTxCount(int txCount) {
			this.txCount = txCount;
		}
		public long getKeyPoolOldest() {
			return keyPoolOldest;
		}
		public void setKeyPoolOldest(long keyPoolOldest) {
			this.keyPoolOldest = keyPoolOldest;
		}
		public int getKeypoolSize() {
			return keypoolSize;
		}
		public void setKeypoolSize(int keypoolSize) {
			this.keypoolSize = keypoolSize;
		}
		public double getPayTxFee() {
			return payTxFee;
		}
		public void setPayTxFee(double payTxFee) {
			this.payTxFee = payTxFee;
		}
	}

}
