package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BlockHashesOutputModel {
	
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

	public static class Result {
		@SerializedName("blockhash")
		private String blockHash;
		@SerializedName("logicalts")
		private long logicalTs;
		public String getBlockHash() {
			return blockHash;
		}
		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}
		public long getLogicalTs() {
			return logicalTs;
		}
		public void setLogicalTs(long logicalTs) {
			this.logicalTs = logicalTs;
		}
	}

}
