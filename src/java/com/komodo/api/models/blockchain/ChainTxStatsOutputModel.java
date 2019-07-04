package com.komodo.api.models.blockchain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ChainTxStatsOutputModel {

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
		@SerializedName("time")
		private long time;
		@SerializedName("txcount")
		private int txCount;
		@SerializedName("window_final_block_hash")
		private String windowFinalBlockHash;
		@SerializedName("window_block_count")
		private int windowBlockCount;
		@SerializedName("window_tx_count")
		private int windowTxCount;
		@SerializedName("window_interval")
		private int windowInterval;
		@SerializedName("txrate")
		private double txRate;
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		public int getTxCount() {
			return txCount;
		}
		public void setTxCount(int txCount) {
			this.txCount = txCount;
		}
		public String getWindowFinalBlockHash() {
			return windowFinalBlockHash;
		}
		public void setWindowFinalBlockHash(String windowFinalBlockHash) {
			this.windowFinalBlockHash = windowFinalBlockHash;
		}
		public int getWindowBlockCount() {
			return windowBlockCount;
		}
		public void setWindowBlockCount(int windowBlockCount) {
			this.windowBlockCount = windowBlockCount;
		}
		public int getWindowTxCount() {
			return windowTxCount;
		}
		public void setWindowTxCount(int windowTxCount) {
			this.windowTxCount = windowTxCount;
		}
		public int getWindowInterval() {
			return windowInterval;
		}
		public void setWindowInterval(int windowInterval) {
			this.windowInterval = windowInterval;
		}
		public double getTxRate() {
			return txRate;
		}
		public void setTxRate(double txRate) {
			this.txRate = txRate;
		}
	}

}
