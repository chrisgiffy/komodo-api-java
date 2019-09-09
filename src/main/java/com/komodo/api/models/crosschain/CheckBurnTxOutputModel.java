package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class CheckBurnTxOutputModel {
	
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
		
		@SerializedName("sourceSymbol")
		private String sourceSymbol;
		@SerializedName("targetSymbol")
		private String targetSymbol;
		@SerializedName("targetCCid")
		private int targetCCid;
		@SerializedName("tokenid")
		private String tokenid;
		@SerializedName("TxOutProof")
		private String txOutProof;
		
		public String getSourceSymbol() {
			return sourceSymbol;
		}
		public void setSourceSymbol(String sourceSymbol) {
			this.sourceSymbol = sourceSymbol;
		}
		public String getTargetSymbol() {
			return targetSymbol;
		}
		public void setTargetSymbol(String targetSymbol) {
			this.targetSymbol = targetSymbol;
		}
		public int getTargetCCid() {
			return targetCCid;
		}
		public void setTargetCCid(int targetCCid) {
			this.targetCCid = targetCCid;
		}
		public String getTokenid() {
			return tokenid;
		}
		public void setTokenid(String tokenid) {
			this.tokenid = tokenid;
		}
		public String getTxOutProof() {
			return txOutProof;
		}
		public void setTxOutProof(String txOutProof) {
			this.txOutProof = txOutProof;
		}

	}

}
