package com.komodo.api.models.blockchain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class TxOutSetInfoOutputModel {
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
		
		@SerializedName("height")
		private int height;
		
		@SerializedName("bestblock")
		private String bestBlock;
		
		@SerializedName("transactions")
		private int transactions;
		
		@SerializedName("txouts")
		private int txOuts;
		
		@SerializedName("bytes_serialized")
		private int bytesSerialized;
		
		@SerializedName("hash_serialized")
		private String hashSerialized;
		
		@SerializedName("total_amount")
		private double totalAmount;
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getBestBlock() {
			return bestBlock;
		}
		public void setBestBlock(String bestBlock) {
			this.bestBlock = bestBlock;
		}
		public int getTransactions() {
			return transactions;
		}
		public void setTransactions(int transactions) {
			this.transactions = transactions;
		}
		public int getTxOuts() {
			return txOuts;
		}
		public void setTxOuts(int txOuts) {
			this.txOuts = txOuts;
		}
		public double getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
	}

}
