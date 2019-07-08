package com.komodo.api.models.network;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class NetTotalsOutputModel {
	
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
		@SerializedName("totalbytesrecv")
		private int totalByTesRecv;
		
		@SerializedName("totalbytessent")
		private int totalByTesSent;
		
		@SerializedName("timemillis")
		private long timeMillis;

		public int getTotalByTesRecv() {
			return totalByTesRecv;
		}

		public void setTotalByTesRecv(int totalByTesRecv) {
			this.totalByTesRecv = totalByTesRecv;
		}

		public int getTotalByTesSent() {
			return totalByTesSent;
		}

		public void setTotalByTesSent(int totalByTesSent) {
			this.totalByTesSent = totalByTesSent;
		}

		public long getTimeMillis() {
			return timeMillis;
		}

		public void setTimeMillis(long timeMillis) {
			this.timeMillis = timeMillis;
		}
	}
	

}
