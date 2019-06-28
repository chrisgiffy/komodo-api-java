package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ChainTipsOutputModel {

	private String error;
	private String id;
	private List<Result> result;

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

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("height")
		private int height;
		@SerializedName("hash")
		private String hash;
		@SerializedName("branchlen")
		private int branchLen;
		@SerializedName("status")
		private String status;
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
		public int getBranchLen() {
			return branchLen;
		}
		public void setBranchLen(int branchLen) {
			this.branchLen = branchLen;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
	}

}
