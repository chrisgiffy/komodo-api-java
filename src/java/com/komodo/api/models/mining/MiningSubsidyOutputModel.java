package com.komodo.api.models.mining;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class MiningSubsidyOutputModel {

	private String error;
	private String id;
	private Result result;
	
	public static class Result{
		
		@SerializedName("miner")
		private double miner;

		public double getMiner() {
			return miner;
		}

		public void setMiner(double miner) {
			this.miner = miner;
		}
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
