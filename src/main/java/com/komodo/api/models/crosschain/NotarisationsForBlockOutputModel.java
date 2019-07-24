package com.komodo.api.models.crosschain;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class NotarisationsForBlockOutputModel {
	
	private String error;
	private String id;
	private Map<String, List<Result>> result;
	
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

	public Map<String, List<Result>> getResult() {
		return result;
	}

	public void setResult(Map<String, List<Result>> result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("txid")
		private String txId;
		@SerializedName("chain")
		private String chain;
		@SerializedName("height")
		private int height;
		@SerializedName("blockhash")
		private String blockHash;
		@SerializedName("notaries")
		private List<Integer> notaries;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public String getChain() {
			return chain;
		}
		public void setChain(String chain) {
			this.chain = chain;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getBlockHash() {
			return blockHash;
		}
		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}
		public List<Integer> getNotaries() {
			return notaries;
		}
		public void setNotaries(List<Integer> notaries) {
			this.notaries = notaries;
		}
	}

}
