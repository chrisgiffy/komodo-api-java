package com.komodo.api.models.wallet;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ZShieldCoinbaseOutputModel {
	
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
		@SerializedName("remainingUTXOs")
		private int remainingUTXOs;
		@SerializedName("remainingValue")
		private double remainingValue;
		@SerializedName("shieldingUTXOs")
		private int shieldingUTXOs;
		@SerializedName("shieldingValue")
		private double shieldingValue;
		@SerializedName("opid")
		private String opId;
		public int getRemainingUTXOs() {
			return remainingUTXOs;
		}
		public void setRemainingUTXOs(int remainingUTXOs) {
			this.remainingUTXOs = remainingUTXOs;
		}
		public double getRemainingValue() {
			return remainingValue;
		}
		public void setRemainingValue(double remainingValue) {
			this.remainingValue = remainingValue;
		}
		public int getShieldingUTXOs() {
			return shieldingUTXOs;
		}
		public void setShieldingUTXOs(int shieldingUTXOs) {
			this.shieldingUTXOs = shieldingUTXOs;
		}
		public double getShieldingValue() {
			return shieldingValue;
		}
		public void setShieldingValue(double shieldingValue) {
			this.shieldingValue = shieldingValue;
		}
		public String getOpId() {
			return opId;
		}
		public void setOpId(String opId) {
			this.opId = opId;
		}
	}

}
