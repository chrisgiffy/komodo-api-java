package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class MoMomDataOutputModel {
	
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
		
		@SerializedName("coin")
		private String coin;
		
		@SerializedName("kmdheight")
		private String height;
		
		@SerializedName("ccid")
		private int ccid;
		
		@SerializedName("MoMs")
		private String moMs;
		
		@SerializedName("notarizationHash")
		private String notarizationHash;
		
		@SerializedName("MoMoM")
		private String moMoM;

		public String getCoin() {
			return coin;
		}

		public void setCoin(String coin) {
			this.coin = coin;
		}

		public String getHeight() {
			return height;
		}

		public void setHeight(String height) {
			this.height = height;
		}

		public int getCcid() {
			return ccid;
		}

		public void setCcid(int ccid) {
			this.ccid = ccid;
		}

		public String getMoMs() {
			return moMs;
		}

		public void setMoMs(String moMs) {
			this.moMs = moMs;
		}

		public String getNotarizationHash() {
			return notarizationHash;
		}

		public void setNotarizationHash(String notarizationHash) {
			this.notarizationHash = notarizationHash;
		}

		public String getMoMoM() {
			return moMoM;
		}

		public void setMoMoM(String moMoM) {
			this.moMoM = moMoM;
		}




	}

}
