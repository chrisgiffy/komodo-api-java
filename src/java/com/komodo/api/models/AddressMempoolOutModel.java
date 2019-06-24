package com.komodo.api.models;

import java.util.List;

public class AddressMempoolOutModel {
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
		private String address;
		private String txId;
		private int index;
		private double satoshis;
		private long timeStamp;
		private String prevTxId;
		private int prevOut;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public int getIndex() {
			return index;
		}
		public void setIndex(int index) {
			this.index = index;
		}
		public double getSatoshis() {
			return satoshis;
		}
		public void setSatoshis(double satoshis) {
			this.satoshis = satoshis;
		}
		public long getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getPrevTxId() {
			return prevTxId;
		}
		public void setPrevTxId(String prevTxId) {
			this.prevTxId = prevTxId;
		}
		public int getPrevOut() {
			return prevOut;
		}
		public void setPrevOut(int prevOut) {
			this.prevOut = prevOut;
		}
	}

}