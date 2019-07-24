package com.komodo.api.models.crosschain;

import com.google.gson.annotations.SerializedName;

public class CalcMomOutputModel {
	
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
		
		@SerializedName("height")
		private String height;
		
		@SerializedName("MoMdepth")
		private int moMDepth;
		
		@SerializedName("MoM")
		private String moM;

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

		public int getMoMDepth() {
			return moMDepth;
		}

		public void setMoMDepth(int moMDepth) {
			this.moMDepth = moMDepth;
		}

		public String getMoM() {
			return moM;
		}

		public void setMoM(String moM) {
			this.moM = moM;
		}



	}

}
