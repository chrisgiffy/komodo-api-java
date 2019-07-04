package com.komodo.api.models.rawtransactions;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class FundRawTxOutputModel {

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
		@SerializedName("hex")
		private String hex;
		@SerializedName("changepos")
		private int changePos;
		@SerializedName("fee")
		private double fee;
		public String getHex() {
			return hex;
		}
		public void setHex(String hex) {
			this.hex = hex;
		}
		public int getChangePos() {
			return changePos;
		}
		public void setChangePos(int changePos) {
			this.changePos = changePos;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
	}
}
