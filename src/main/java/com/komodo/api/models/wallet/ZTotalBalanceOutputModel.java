package com.komodo.api.models.wallet;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ZTotalBalanceOutputModel {

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
		@SerializedName("transparent")
		private String transparent;
		@SerializedName("interest")
		private String interest;
		@SerializedName("private")
		private String private1;
		@SerializedName("total")
		private String total;
		public String getTransparent() {
			return transparent;
		}
		public void setTransparent(String transparent) {
			this.transparent = transparent;
		}
		public String getInterest() {
			return interest;
		}
		public void setInterest(String interest) {
			this.interest = interest;
		}
		public String getPrivate1() {
			return private1;
		}
		public void setPrivate1(String private1) {
			this.private1 = private1;
		}
		public String getTotal() {
			return total;
		}
		public void setTotal(String total) {
			this.total = total;
		}
	}
}
