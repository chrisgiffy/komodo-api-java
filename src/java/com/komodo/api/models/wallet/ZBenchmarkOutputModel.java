package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ZBenchmarkOutputModel {
	
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
		@SerializedName("runningtime")
		private long runningTime;

		public long getRunningTime() {
			return runningTime;
		}

		public void setRunningTime(long runningTime) {
			this.runningTime = runningTime;
		} 
	}

}
