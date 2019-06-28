package com.komodo.api.models.blockchain;

import com.google.gson.annotations.SerializedName;

public class CoinSupplyOutputModel {
	
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
		@SerializedName("result")
		private String result;
		@SerializedName( "coin")
		  private String coin;
		@SerializedName("height")
		  private int height;
		@SerializedName("supply")
		  private double supply;
		@SerializedName("zfunds")
		  private double zFunds;
		@SerializedName("sprout")
		  private double sprout;
		@SerializedName("total")
		  private double total;
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public String getCoin() {
			return coin;
		}
		public void setCoin(String coin) {
			this.coin = coin;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public double getSupply() {
			return supply;
		}
		public void setSupply(double supply) {
			this.supply = supply;
		}
		public double getzFunds() {
			return zFunds;
		}
		public void setzFunds(double zFunds) {
			this.zFunds = zFunds;
		}
		public double getSprout() {
			return sprout;
		}
		public void setSprout(double sprout) {
			this.sprout = sprout;
		}
		public double getTotal() {
			return total;
		}
		public void setTotal(double total) {
			this.total = total;
		}
	}

}
