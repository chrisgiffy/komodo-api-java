package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class SelfImportOutputModel {
	
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
		
		@SerializedName("ImportTxHex")
		private String importTxHex;
		
		@SerializedName("SourceTxHex")
		private String sourceTxHex;

		public String getImportTxHex() {
			return importTxHex;
		}

		public void setImportTxHex(String importTxHex) {
			this.importTxHex = importTxHex;
		}

		public String getSourceTxHex() {
			return sourceTxHex;
		}

		public void setSourceTxHex(String sourceTxHex) {
			this.sourceTxHex = sourceTxHex;
		}


	}

}
