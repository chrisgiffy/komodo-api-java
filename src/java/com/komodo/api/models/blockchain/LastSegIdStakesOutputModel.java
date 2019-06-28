package com.komodo.api.models.blockchain;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class LastSegIdStakesOutputModel {
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
		@SerializedName("NotSet")
		private int notSet;
		@SerializedName("PoW")
		private int pow;
		@SerializedName("PoSPerc")
		private int poSPerc;
		@SerializedName("SegIds")
		private Map<String, Integer> segIds;
		public int getNotSet() {
			return notSet;
		}
		public void setNotSet(int notSet) {
			this.notSet = notSet;
		}
		public int getPow() {
			return pow;
		}
		public void setPow(int pow) {
			this.pow = pow;
		}
		public int getPoSPerc() {
			return poSPerc;
		}
		public void setPoSPerc(int poSPerc) {
			this.poSPerc = poSPerc;
		}
		public Map<String, Integer> getSegIds() {
			return segIds;
		}
		public void setSegIds(Map<String, Integer> segIds) {
			this.segIds = segIds;
		}
	}

}
