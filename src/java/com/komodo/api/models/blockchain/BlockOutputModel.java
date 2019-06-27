package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BlockOutputModel {

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
		@SerializedName("size")
		private int size;
		@SerializedName("height")
		private int height;
		@SerializedName("version")
		private int version;
		@SerializedName("merkleroot")
		private String merkleRoot;
		@SerializedName("segid")
		private int segId;
		@SerializedName("finalsaplingroot")
		private String finalSaplingRoot;
		@SerializedName("tx")
		private List<String> tx;
		@SerializedName("time")
		private long time;
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
		@SerializedName("anchor")
		private String anchor;
		@SerializedName("blocktype")
		private String blockType;
		@SerializedName("valuePools")
		private List<ValuePools> valuePools;
		@SerializedName("previousblockhash")
		private String previousBlockHash;
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
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
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
		public int getSegId() {
			return segId;
		}
		public void setSegId(int segId) {
			this.segId = segId;
		}
		public String getFinalSaplingRoot() {
			return finalSaplingRoot;
		}
		public void setFinalSaplingRoot(String finalSaplingRoot) {
			this.finalSaplingRoot = finalSaplingRoot;
		}
		public List<String> getTx() {
			return tx;
		}
		public void setTx(List<String> tx) {
			this.tx = tx;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
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
		public String getAnchor() {
			return anchor;
		}
		public void setAnchor(String anchor) {
			this.anchor = anchor;
		}
		public String getBlockType() {
			return blockType;
		}
		public void setBlockType(String blockType) {
			this.blockType = blockType;
		}
		public List<ValuePools> getValuePools() {
			return valuePools;
		}
		public void setValuePools(List<ValuePools> valuePools) {
			this.valuePools = valuePools;
		}
		public String getPreviousBlockHash() {
			return previousBlockHash;
		}
		public void setPreviousBlockHash(String previousBlockHash) {
			this.previousBlockHash = previousBlockHash;
		}
	}

	public static class ValuePools{
		@SerializedName("id")
		private String id;
		@SerializedName("monitored")
		private boolean monitored;
		@SerializedName("chainValue")
		private double chainValue;
		@SerializedName("chainValueZat")
		private double chainValueZat;
		@SerializedName("valueDelta")
		private double valueDelta;
		@SerializedName("valueDeltaZat")
		private double valueDeltaZat;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public boolean getMonitored() {
			return monitored;
		}
		public void setMonitored(boolean monitored) {
			this.monitored = monitored;
		}
		public double getChainValue() {
			return chainValue;
		}
		public void setChainValue(double chainValue) {
			this.chainValue = chainValue;
		}
		public double getChainValueZat() {
			return chainValueZat;
		}
		public void setChainValueZat(double chainValueZat) {
			this.chainValueZat = chainValueZat;
		}
		public double getValueDelta() {
			return valueDelta;
		}
		public void setValueDelta(double valueDelta) {
			this.valueDelta = valueDelta;
		}
		public double getValueDeltaZat() {
			return valueDeltaZat;
		}
		public void setValueDeltaZat(double valueDeltaZat) {
			this.valueDeltaZat = valueDeltaZat;
		}
	}

}
