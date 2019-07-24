package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

public class CreateNotaryApprovalTxOutputModel {
	
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
		
		@SerializedName("NotaryTxHex")
		private String notaryTxHex;

		public String getNotaryTxHex() {
			return notaryTxHex;
		}

		public void setNotaryTxHex(String notaryTxHex) {
			this.notaryTxHex = notaryTxHex;
		}



	}

}
