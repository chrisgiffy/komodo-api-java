package com.komodo.api.models.rawtransactions;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class SignRawTxOutputModel {
	
	private String error;
	private String id;
	private Result result;
	
	public static class Result{
		@SerializedName("hex")
		private String hex;
		@SerializedName("complete")
		private String complete;
		
		public String getHex() {
			return hex;
		}
		public void setHex(String hex) {
			this.hex = hex;
		}
		public String getComplete() {
			return complete;
		}
		public void setComplete(String complete) {
			this.complete = complete;
		}
	}

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
	

}
