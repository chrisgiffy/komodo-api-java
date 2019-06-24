package com.komodo.api.models;

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
		private int walletVersion;
		private double balance;
		private double unconfirmedBalance;
		private double immatureBalance;
		private int txCount;
		private long keyPoolOldest;
		private int keypoolSize;
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
