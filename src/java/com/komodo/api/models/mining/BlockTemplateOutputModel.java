package com.komodo.api.models.mining;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BlockTemplateOutputModel {
	private Result result;

	public static class Result {
		
		@SerializedName("capabilities")
		private List<String> capabilities;
		
		@SerializedName("version")
		private int version;
		
		@SerializedName("previousblockhash")
		private String previousBlockHash;
		
		@SerializedName("transactions")
		private List<Transaction> transactions;
		
		@SerializedName("coinbasetxn")
		private CoinBaseTransaction coinBaseTxn;
		
		@SerializedName("longpollid")
		private String longPollId;
		
		@SerializedName("target")
		private String target;
		
		@SerializedName("mintime")
		private long minTime;
		
		@SerializedName("mutable")
		List<String> mutable;
		
		@SerializedName("noncerange")
		private String nonCeRange;
		
		@SerializedName("sigoplimit")
		private int sigOpLimit;
		
		@SerializedName("sizelimit")
		private long sizeLimit;
		
		@SerializedName("curtime")
		private long curTime;
		
		@SerializedName("bits")
		private String bits;
		
		@SerializedName("height")
		private long height;
		
		public List<String> getCapabilities() {
			return capabilities;
		}
		public void setCapabilities(List<String> capabilities) {
			this.capabilities = capabilities;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getPreviousBlockHash() {
			return previousBlockHash;
		}
		public void setPreviousBlockHash(String previousBlockHash) {
			this.previousBlockHash = previousBlockHash;
		}
		public List<Transaction> getTransactions() {
			return transactions;
		}
		public void setTransactions(List<Transaction> transactions) {
			this.transactions = transactions;
		}
		public CoinBaseTransaction getCoinBaseTxn() {
			return coinBaseTxn;
		}
		public void setCoinBaseTxn(CoinBaseTransaction coinBaseTxn) {
			this.coinBaseTxn = coinBaseTxn;
		}
		public String getLongPollId() {
			return longPollId;
		}
		public void setLongPollId(String longPollId) {
			this.longPollId = longPollId;
		}
		public String getTarget() {
			return target;
		}
		public void setTarget(String target) {
			this.target = target;
		}
		public long getMinTime() {
			return minTime;
		}
		public void setMinTime(long minTime) {
			this.minTime = minTime;
		}
		public List<String> getMutable() {
			return mutable;
		}
		public void setMutable(List<String> mutable) {
			this.mutable = mutable;
		}
		public String getNonCeRange() {
			return nonCeRange;
		}
		public void setNonCeRange(String nonCeRange) {
			this.nonCeRange = nonCeRange;
		}
		public int getSigOpLimit() {
			return sigOpLimit;
		}
		public void setSigOpLimit(int sigOpLimit) {
			this.sigOpLimit = sigOpLimit;
		}
		public long getSizeLimit() {
			return sizeLimit;
		}
		public void setSizeLimit(long sizeLimit) {
			this.sizeLimit = sizeLimit;
		}
		public long getCurTime() {
			return curTime;
		}
		public void setCurTime(long curTime) {
			this.curTime = curTime;
		}
		public String getBits() {
			return bits;
		}
		public void setBits(String bits) {
			this.bits = bits;
		}
		public long getHeight() {
			return height;
		}
		public void setHeight(long height) {
			this.height = height;
		}
		

	}
	public static class Transaction{
		
		@SerializedName("data")
		private String data;
		
		@SerializedName("hash")
		private String hash;
		
		@SerializedName("depends")
		List<String> depends;
		
		@SerializedName("fee")
		private double fee;
		
		@SerializedName("sigops")
		private int sigOps;
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
		public List<String> getDepends() {
			return depends;
		}
		public void setDepends(List<String> depends) {
			this.depends = depends;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		public int getSigOps() {
			return sigOps;
		}
		public void setSigOps(int sigOps) {
			this.sigOps = sigOps;
		}
	}
	public static class CoinBaseTransaction {
		@SerializedName("data")
		private String data;
		
		@SerializedName("hash")
		private String hash;
		
		@SerializedName("depends")
		private List<String> depends;
		
		@SerializedName("fee")
		private double fee;
		
		@SerializedName("sigops")
		private int sigOps;
		
		@SerializedName("coinbasevalue")
		private long coinBaseValue;
		
		@SerializedName("required")
		private boolean required;
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
		public List<String> getDepends() {
			return depends;
		}
		public void setDepends(List<String> depends) {
			this.depends = depends;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		public int getSigOps() {
			return sigOps;
		}
		public void setSigOps(int sigOps) {
			this.sigOps = sigOps;
		}
		public long getCoinBaseValue() {
			return coinBaseValue;
		}
		public void setCoinBaseValue(long coinBaseValue) {
			this.coinBaseValue = coinBaseValue;
		}
		public boolean isRequired() {
			return required;
		}
		public void setRequired(boolean required) {
			this.required = required;
		}
	}

	private String error;
	private String id;
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
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
}
