package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class NotariesOutputModel {
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
		@SerializedName("notaries")
		private List<Notaries> notaries;
		@SerializedName("numnotaries")
		private int numNotaries;
		@SerializedName("height")
		private int height;
		@SerializedName("timestamp")
		private long timeStamp;
		public List<Notaries> getNotaries() {
			return notaries;
		}
		public void setNotaries(List<Notaries> notaries) {
			this.notaries = notaries;
		}
		public int getNumNotaries() {
			return numNotaries;
		}
		public void setNumNotaries(int numNotaries) {
			this.numNotaries = numNotaries;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public long getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}

	}

	public static class Notaries{
		@SerializedName("pubkey")
		private String pubKey;
		@SerializedName("BTCaddress")
		private String btcAddress;
		@SerializedName("KMDaddress")
		private String kmdAddress;
		public String getPubKey() {
			return pubKey;
		}
		public void setPubKey(String pubKey) {
			this.pubKey = pubKey;
		}
		public String getBtcAddress() {
			return btcAddress;
		}
		public void setBtcAddress(String btcAddress) {
			this.btcAddress = btcAddress;
		}
		public String getKmdAddress() {
			return kmdAddress;
		}
		public void setKmdAddress(String kmdAddress) {
			this.kmdAddress = kmdAddress;
		}
	}

}
