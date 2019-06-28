package com.komodo.api.models.blockchain;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class RawMemPoolOutputModel {
	private String error;
	private String id;
	private Map<String, Transaction> result;

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

	public Map<String, Transaction> getResult() {
		return result;
	}

	public void setResult(Map<String, Transaction> result) {
		this.result = result;
	}

	public static class Transaction{
		@SerializedName("size")
		private int size;
		@SerializedName("fee")
		private double fee;
		@SerializedName("time")
		private long time;
		@SerializedName("height")
		private int height;
		@SerializedName("startingpriority")
		private double startingPriority;
		@SerializedName("currentpriority")
		private double currentPrioity;
		@SerializedName("depends")
		private List<String> depends;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public double getStartingPriority() {
			return startingPriority;
		}
		public void setStartingPriority(double startingPriority) {
			this.startingPriority = startingPriority;
		}
		public double getCurrentPrioity() {
			return currentPrioity;
		}
		public void setCurrentPrioity(double currentPrioity) {
			this.currentPrioity = currentPrioity;
		}
		public List<String> getDepends() {
			return depends;
		}
		public void setDepends(List<String> depends) {
			this.depends = depends;
		}
	}

}
