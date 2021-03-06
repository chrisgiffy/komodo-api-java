package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class CreateBurntTransOutputModel {
	
	private String id;
	private String error;
	private Result result;
	
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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result{
		
		@SerializedName("payouts")
		private String payouts;
		
		@SerializedName("BurnTxHex")
		private String burnTxHex;

		public String getPayouts() {
			return payouts;
		}

		public void setPayouts(String payouts) {
			this.payouts = payouts;
		}

		public String getBurnTxHex() {
			return burnTxHex;
		}

		public void setBurnTxHex(String burnTxHex) {
			this.burnTxHex = burnTxHex;
		}
	}

}
