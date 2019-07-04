package com.komodo.api.models.blockchain;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class BlockHeaderOutputModel {
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
		@SerializedName("hash")
		private String hash;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("rawconfirmations")
		private int rawConfirmations;
		@SerializedName("height")
		private int height;
		@SerializedName("version")
		private int version;
		@SerializedName("merkleroot")
		private String merkleRoot;
		@SerializedName("finalsaplingroot")
		private String finalSaplingRoot;
		@SerializedName("time")
		private long Time;
		@SerializedName("nonce")
		private String nonce;
		@SerializedName("solution")
		private String solution;
		@SerializedName("bits")
		private String bits;
		@SerializedName("difficulty")
		private double difficulty;
		@SerializedName("chainwork")
		private String chainWork;
		@SerializedName("segid")
		private int segId;
		@SerializedName("previousblockhash")
		private String previousBlockHash;
		@SerializedName("nextblockhash")
		private String nextBlockHash;
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}
		public int getConfirmations() {
			return confirmations;
		}
		public void setConfirmations(int confirmations) {
			this.confirmations = confirmations;
		}
		public int getRawConfirmations() {
			return rawConfirmations;
		}
		public void setRawConfirmations(int rawConfirmations) {
			this.rawConfirmations = rawConfirmations;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getMerkleRoot() {
			return merkleRoot;
		}
		public void setMerkleRoot(String merkleRoot) {
			this.merkleRoot = merkleRoot;
		}
		public String getFinalSaplingRoot() {
			return finalSaplingRoot;
		}
		public void setFinalSaplingRoot(String finalSaplingRoot) {
			this.finalSaplingRoot = finalSaplingRoot;
		}
		public long getTime() {
			return Time;
		}
		public void setTime(long time) {
			Time = time;
		}
		public String getNonce() {
			return nonce;
		}
		public void setNonce(String nonce) {
			this.nonce = nonce;
		}
		public String getSolution() {
			return solution;
		}
		public void setSolution(String solution) {
			this.solution = solution;
		}
		public String getBits() {
			return bits;
		}
		public void setBits(String bits) {
			this.bits = bits;
		}
		public double getDifficulty() {
			return difficulty;
		}
		public void setDifficulty(double difficulty) {
			this.difficulty = difficulty;
		}
		public String getChainWork() {
			return chainWork;
		}
		public void setChainWork(String chainWork) {
			this.chainWork = chainWork;
		}
		public int getSegId() {
			return segId;
		}
		public void setSegId(int segId) {
			this.segId = segId;
		}
		public String getPreviousBlockHash() {
			return previousBlockHash;
		}
		public void setPreviousBlockHash(String previousBlockHash) {
			this.previousBlockHash = previousBlockHash;
		}
		public String getNextBlockHash() {
			return nextBlockHash;
		}
		public void setNextBlockHash(String nextBlockHash) {
			this.nextBlockHash = nextBlockHash;
		}
	}

}
