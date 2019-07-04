package com.komodo.api.models.address;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
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
		
		@SerializedName("start_time")
		private long startTime;
		
		@SerializedName("addresses")
		private List<Address> addresses;
		
		@SerializedName("average")
		private int average;
		
		@SerializedName("total")
		private double total;
		
		@SerializedName("utxos")
		private long utxos;
		
		@SerializedName("total_addresses")
		private int totalAddresses;
		
		@SerializedName("ignored_addresses")
		private int ignoredAddresses;
		
		@SerializedName("start_Height")
		private int startHeight;
		
		@SerializedName("ending_height")
		private int endingHeight;
		
		@SerializedName("end_time")
		private long endTime;
		
		@SerializedName("error")
		private String error;
		
		public int getAverage() {
			return average;
		}
		public void setAverage(int average) {
			this.average = average;
		}
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
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
	
	public static class Address {
		@SerializedName("addr")
		private String addr;
		@SerializedName("amount")
		private String amount;
		@SerializedName("segid")
		private int segId;
		
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public String getAmount() {
			return amount;
		}
		public void setAmount(String amount) {
			this.amount = amount;
		}
		public int getSegId() {
			return segId;
		}
		public void setSegId(int segId) {
			this.segId = segId;
		}

	}

}
