package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ListTransactionsOutputModel {
	
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
		@SerializedName("account")
		private String account;
		@SerializedName("address")
		private String address;
		@SerializedName("category")
		private String category;
		@SerializedName("amount")
		private double amount;
		@SerializedName("vout")
		private int vout;
		@SerializedName("rawconfirmations")
		private int rawConfirmations;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("generated")
		private boolean generated;
		@SerializedName("blockhash")
		private String blockHash;
		@SerializedName("blockindex")
		private int blockIndex;
		@SerializedName("blocktime")
		private long blockTime;
		@SerializedName("expiryheight")
		private int expiryHeight;
		@SerializedName("txid")
		private String txId;
		@SerializedName("walletconflicts")
		private List<String> walletConflicts;
		@SerializedName("time")
		private long time;
		@SerializedName("timereceived")
		private long timeReceived;
		@SerializedName("vjoinsplit")
		private List<String> vJoinSplit;
		@SerializedName("size")
		private int size;
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getVout() {
			return vout;
		}
		public void setVout(int vout) {
			this.vout = vout;
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
		public boolean getGenerated() {
			return generated;
		}
		public void setGenerated(boolean generated) {
			this.generated = generated;
		}
		public String getBlockHash() {
			return blockHash;
		}
		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}
		public int getBlockIndex() {
			return blockIndex;
		}
		public void setBlockIndex(int blockIndex) {
			this.blockIndex = blockIndex;
		}
		public long getBlockTime() {
			return blockTime;
		}
		public void setBlockTime(long blockTime) {
			this.blockTime = blockTime;
		}
		public int getExpiryHeight() {
			return expiryHeight;
		}
		public void setExpiryHeight(int expiryHeight) {
			this.expiryHeight = expiryHeight;
		}
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public List<String> getWalletConflicts() {
			return walletConflicts;
		}
		public void setWalletConflicts(List<String> walletConflicts) {
			this.walletConflicts = walletConflicts;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		public long getTimeReceived() {
			return timeReceived;
		}
		public void setTimeReceived(long timeReceived) {
			this.timeReceived = timeReceived;
		}
		public List<String> getvJoinSplit() {
			return vJoinSplit;
		}
		public void setvJoinSplit(List<String> vJoinSplit) {
			this.vJoinSplit = vJoinSplit;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
	}

}
