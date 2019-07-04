package com.komodo.api.models.util;

/**
 * 
 * @author Giffy Chris
 *
 */
public class CreateMultiSigOutputModel {
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
		private String address;
		private String redeemScript;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getRedeemScript() {
			return redeemScript;
		}
		public void setRedeemScript(String redeemScript) {
			this.redeemScript = redeemScript;
		}
		
	}
}
