package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BlockChainInfoOutputModel {

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
		@SerializedName("chain")
		private String chain;
		@SerializedName("blocks")
		private int blocks;
		@SerializedName("headers")
		private int headers;
		@SerializedName("bestblockhash")
		private String blockHash;
		@SerializedName("difficulty")
		double difficulty;
		@SerializedName("verificationprogress")
		private int verifivationProgress;
		@SerializedName("chainwork")
		private String chainWork;
		@SerializedName("pruned")
		private boolean pruned;
		@SerializedName("size_on_disk")
		private long sizeOnDisk;
		@SerializedName("commitments")
		private int commitments;
		@SerializedName("valuePools")
		private List<ValuePool> valuePools;
		@SerializedName("softforks")
		private List<SoftFork> softForks;
		@SerializedName("upgrades")
		private Upgrades upgrades;
		@SerializedName("consensus")
		private Consensus consensus;
		public String getChain() {
			return chain;
		}
		public void setChain(String chain) {
			this.chain = chain;
		}
		public int getBlocks() {
			return blocks;
		}
		public void setBlocks(int blocks) {
			this.blocks = blocks;
		}
		public int getHeaders() {
			return headers;
		}
		public void setHeaders(int headers) {
			this.headers = headers;
		}
		public String getBlockHash() {
			return blockHash;
		}
		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}
		public double getDifficulty() {
			return difficulty;
		}
		public void setDifficulty(double difficulty) {
			this.difficulty = difficulty;
		}
		public int getVerifivationProgress() {
			return verifivationProgress;
		}
		public void setVerifivationProgress(int verifivationProgress) {
			this.verifivationProgress = verifivationProgress;
		}
		public String getChainWork() {
			return chainWork;
		}
		public void setChainWork(String chainWork) {
			this.chainWork = chainWork;
		}
		public boolean getPruned() {
			return pruned;
		}
		public void setPruned(boolean pruned) {
			this.pruned = pruned;
		}
		public long getSizeOnDisk() {
			return sizeOnDisk;
		}
		public void setSizeOnDisk(long sizeOnDisk) {
			this.sizeOnDisk = sizeOnDisk;
		}
		public int getCommitments() {
			return commitments;
		}
		public void setCommitments(int commitments) {
			this.commitments = commitments;
		}
		public List<ValuePool> getValuePools() {
			return valuePools;
		}
		public void setValuePools(List<ValuePool> valuePools) {
			this.valuePools = valuePools;
		}
		public List<SoftFork> getSoftForks() {
			return softForks;
		}
		public void setSoftForks(List<SoftFork> softForks) {
			this.softForks = softForks;
		}
		public Upgrades getUpgrades() {
			return upgrades;
		}
		public void setUpgrades(Upgrades upgrades) {
			this.upgrades = upgrades;
		}
		public Consensus getConsensus() {
			return consensus;
		}
		public void setConsensus(Consensus consensus) {
			this.consensus = consensus;
		}

	}

	public static class Consensus{
		@SerializedName("chaintip")
		private String chainTip;
		@SerializedName("nextblock")
		private String nextBlock;
		public String getChainTip() {
			return chainTip;
		}
		public void setChainTip(String chainTip) {
			this.chainTip = chainTip;
		}
		public String getNextBlock() {
			return nextBlock;
		}
		public void setNextBlock(String nextBlock) {
			this.nextBlock = nextBlock;
		}
	}

	public static class ValuePool{
		@SerializedName("id")
		private String id;
		@SerializedName("monitored")
		private boolean monitored;
		@SerializedName("chainValue")
		private double chainValue;
		@SerializedName("chainValueZat")
		private double chainValueZat;
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

	}

	public static class SoftFork{
		@SerializedName( "id")
		private String id;
		@SerializedName("version")
		private int version;
		@SerializedName("enforce")
		private EnforceReject enforce;
		@SerializedName("reject")
		private EnforceReject reject;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public EnforceReject getEnforce() {
			return enforce;
		}
		public void setEnforce(EnforceReject enforce) {
			this.enforce = enforce;
		}
		public EnforceReject getReject() {
			return reject;
		}
		public void setReject(EnforceReject reject) {
			this.reject = reject;
		}
	}

	private static class EnforceReject{
		@SerializedName("status")
		private boolean status;
		@SerializedName("found")
		private int found;
		@SerializedName("required")
		private int required;
		@SerializedName("window")
		private int window;
		public boolean getStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		public int getFound() {
			return found;
		}
		public void setFound(int found) {
			this.found = found;
		}
		public int getRequired() {
			return required;
		}
		public void setRequired(int required) {
			this.required = required;
		}
		public int getWindow() {
			return window;
		}
		public void setWindow(int window) {
			this.window = window;
		}
	}

	public static class Upgrades{
		@SerializedName("name")
		private String name;
		@SerializedName("activationheight")
		private int activationHeight;
		@SerializedName("status")
		private String status;
		@SerializedName("info")
		private String info;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getActivationHeight() {
			return activationHeight;
		}
		public void setActivationHeight(int activationHeight) {
			this.activationHeight = activationHeight;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getInfo() {
			return info;
		}
		public void setInfo(String info) {
			this.info = info;
		}
	}
}
