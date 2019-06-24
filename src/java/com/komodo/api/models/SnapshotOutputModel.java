package com.komodo.api.models;

import java.util.List;

public class SnapshotOutputModel {
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
		private long startTime;
		private List<Address> addresses;
		private double total;
		private long utxos;
		private int totalAddresses;
		private int ignoredAddresses;
		private int startHeight;
		private int endingHeight;
		private long endTime;
		
		public long getStartTime() {
			return startTime;
		}
		public void setStartTime(long startTime) {
			this.startTime = startTime;
		}
		public List<Address> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<Address> addresses) {
			this.addresses = addresses;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
		public long getUtxos() {
			return utxos;
		}
		public void setUtxos(long utxos) {
			this.utxos = utxos;
		}
		public int getTotalAddresses() {
			return totalAddresses;
		}
		public void setTotalAddresses(int totalAddresses) {
			this.totalAddresses = totalAddresses;
		}
		public int getIgnoredAddresses() {
			return ignoredAddresses;
		}
		public void setIgnoredAddresses(int ignoredAddresses) {
			this.ignoredAddresses = ignoredAddresses;
		}
		public int getStartHeight() {
			return startHeight;
		}
		public void setStartHeight(int startHeight) {
			this.startHeight = startHeight;
		}
		public int getEndingHeight() {
			return endingHeight;
		}
		public void setEndingHeight(int endingHeight) {
			this.endingHeight = endingHeight;
		}
		public long getEndTime() {
			return endTime;
		}
		public void setEndTime(long endTime) {
			this.endTime = endTime;
		}
		
	}

}
