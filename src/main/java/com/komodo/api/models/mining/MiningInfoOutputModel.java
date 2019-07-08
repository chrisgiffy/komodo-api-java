package com.komodo.api.models.mining;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class MiningInfoOutputModel {
	
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
		@SerializedName("blocks")
		private long blocks;
		@SerializedName("currentblocksize")
	    private int currentBlockSize;
		@SerializedName("currentblocktx")
	    private int currentBlockTx;
		@SerializedName("difficulty")
	    private double difficulty;
		@SerializedName("errors")
	    private String errors;
		@SerializedName("genproclimit")
	    private int genProcLimit;
		@SerializedName("localsolps")
	    private int localSolps;
		@SerializedName("networksolps")
	    private long networkSolps;
		@SerializedName("networkhashps")
	    private double networkHashPs;
		@SerializedName("pooledtx")
	    private int pooledTx;
		@SerializedName("testnet")
	    private boolean testNet;
		@SerializedName("chain")
	    private String chain;
		@SerializedName("generate")
	    private boolean generate;
		@SerializedName("numthreads")
	    private int numThreads;
		public long getBlocks() {
			return blocks;
		}
		public void setBlocks(long blocks) {
			this.blocks = blocks;
		}
		public int getCurrentBlockSize() {
			return currentBlockSize;
		}
		public void setCurrentBlockSize(int currentBlockSize) {
			this.currentBlockSize = currentBlockSize;
		}
		public int getCurrentBlockTx() {
			return currentBlockTx;
		}
		public void setCurrentBlockTx(int currentBlockTx) {
			this.currentBlockTx = currentBlockTx;
		}
		public double getDifficulty() {
			return difficulty;
		}
		public void setDifficulty(double difficulty) {
			this.difficulty = difficulty;
		}
		public String getErrors() {
			return errors;
		}
		public void setErrors(String errors) {
			this.errors = errors;
		}
		public int getGenProcLimit() {
			return genProcLimit;
		}
		public void setGenProcLimit(int genProcLimit) {
			this.genProcLimit = genProcLimit;
		}
		public int getLocalSolps() {
			return localSolps;
		}
		public void setLocalSolps(int localSolps) {
			this.localSolps = localSolps;
		}
		public long getNetworkSolps() {
			return networkSolps;
		}
		public void setNetworkSolps(long networkSolps) {
			this.networkSolps = networkSolps;
		}
		public double getNetworkHashPs() {
			return networkHashPs;
		}
		public void setNetworkHashPs(double networkHashPs) {
			this.networkHashPs = networkHashPs;
		}
		public int getPooledTx() {
			return pooledTx;
		}
		public void setPooledTx(int pooledTx) {
			this.pooledTx = pooledTx;
		}
		public boolean getTestNet() {
			return testNet;
		}
		public void setTestNet(boolean testNet) {
			this.testNet = testNet;
		}
		public String getChain() {
			return chain;
		}
		public void setChain(String chain) {
			this.chain = chain;
		}
		public boolean getGenerate() {
			return generate;
		}
		public void setGenerate(boolean generate) {
			this.generate = generate;
		}
		public int getNumThreads() {
			return numThreads;
		}
		public void setNumThreads(int numThreads) {
			this.numThreads = numThreads;
		}
	}

}
