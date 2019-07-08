package com.komodo.api.models.control;


import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class GetInfoModel {
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
		@SerializedName("version")
		private int version;
		@SerializedName("protocolversion")
		private int protocolVersion;
		@SerializedName("KMDversion")
		private String kmdVersion;
		@SerializedName("notarized")
		private int notarized;
		@SerializedName("prevMoMheight")
		private int prevMoMheight;
		@SerializedName("notarizedhash")
		private String notarizedHash;
		@SerializedName("notarizedtxid")
		private String notarizedTxid;
		@SerializedName("notarizedtxid_height")
		private String notarizedTxidHeight;
		@SerializedName("KMDnotarized_height")
		private int kmdNotarizedHeight;
		@SerializedName("notarized_confirms")
		private int notarizedConfirms;
		@SerializedName("walletversion")
		private int walletVersion;
		@SerializedName("balance")
		private double balance;
		@SerializedName("blocks")
		private int blocks;
		@SerializedName("")
		private int longestChain;
		@SerializedName("timeoffset")
		private int timeOffset;
		@SerializedName("")
		private int tipTime;
		@SerializedName("connections")
		private int connections;
		@SerializedName("proxy")
		private String proxy;
		@SerializedName("difficulty")
		private double difficulty;
		@SerializedName("testnet")
		private boolean testNet;
		@SerializedName("keypoololdest")
		private int keypoolOldest;
		@SerializedName("keypoolsize")
		private int keypoolSize;
		@SerializedName("relayfee")
		private double relayFee;
		@SerializedName("paytxfee")
		private int payTxFee;
		@SerializedName("errors")
		private String errors;
		@SerializedName("name")
		private String name;
		@SerializedName("p2pport")
		private int p2pPort;
		@SerializedName("rpcport")
		private int rpcPort;
		@SerializedName("magic")
		private int magic;
		@SerializedName("premine")
		private int premine;
		
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public int getProtocolVersion() {
			return protocolVersion;
		}
		public void setProtocolVersion(int protocolVersion) {
			this.protocolVersion = protocolVersion;
		}
		public String getKmdVersion() {
			return kmdVersion;
		}
		public void setKmdVersion(String kmdVersion) {
			this.kmdVersion = kmdVersion;
		}
		public int getNotarized() {
			return notarized;
		}
		public void setNotarized(int notarized) {
			this.notarized = notarized;
		}
		public int getPrevMoMheight() {
			return prevMoMheight;
		}
		public void setPrevMoMheight(int prevMoMheight) {
			this.prevMoMheight = prevMoMheight;
		}
		public String getNotarizedHash() {
			return notarizedHash;
		}
		public void setNotarizedHash(String notarizedHash) {
			this.notarizedHash = notarizedHash;
		}
		public String getNotarizedTxid() {
			return notarizedTxid;
		}
		public void setNotarizedTxid(String notarizedTxid) {
			this.notarizedTxid = notarizedTxid;
		}
		public String getNotarizedTxidHeight() {
			return notarizedTxidHeight;
		}
		public void setNotarizedTxidHeight(String notarizedTxidHeight) {
			this.notarizedTxidHeight = notarizedTxidHeight;
		}
		public int getKmdNotarizedHeight() {
			return kmdNotarizedHeight;
		}
		public void setKmdNotarizedHeight(int kmdNotarizedHeight) {
			this.kmdNotarizedHeight = kmdNotarizedHeight;
		}
		public int getNotarizedConfirms() {
			return notarizedConfirms;
		}
		public void setNotarizedConfirms(int notarizedConfirms) {
			this.notarizedConfirms = notarizedConfirms;
		}
		public int getWalletVersion() {
			return walletVersion;
		}
		public void setWalletVersion(int walletVersion) {
			this.walletVersion = walletVersion;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public int getBlocks() {
			return blocks;
		}
		public void setBlocks(int blocks) {
			this.blocks = blocks;
		}
		public int getLongestChain() {
			return longestChain;
		}
		public void setLongestChain(int longestChain) {
			this.longestChain = longestChain;
		}
		public int getTimeOffset() {
			return timeOffset;
		}
		public void setTimeOffset(int timeOffset) {
			this.timeOffset = timeOffset;
		}
		public int getTipTime() {
			return tipTime;
		}
		public void setTipTime(int tipTime) {
			this.tipTime = tipTime;
		}
		public int getConnections() {
			return connections;
		}
		public void setConnections(int connections) {
			this.connections = connections;
		}
		public String getProxy() {
			return proxy;
		}
		public void setProxy(String proxy) {
			this.proxy = proxy;
		}
		public double getDifficulty() {
			return difficulty;
		}
		public void setDifficulty(double difficulty) {
			this.difficulty = difficulty;
		}
		public boolean isTestNet() {
			return testNet;
		}
		public void setTestNet(boolean testNet) {
			this.testNet = testNet;
		}
		public int getKeypoolOldest() {
			return keypoolOldest;
		}
		public void setKeypoolOldest(int keypoolOldest) {
			this.keypoolOldest = keypoolOldest;
		}
		public int getKeypoolSize() {
			return keypoolSize;
		}
		public void setKeypoolSize(int keypoolSize) {
			this.keypoolSize = keypoolSize;
		}
		public double getRelayFee() {
			return relayFee;
		}
		public void setRelayFee(double relayFee) {
			this.relayFee = relayFee;
		}
		public int getPayTxFee() {
			return payTxFee;
		}
		public void setPayTxFee(int payTxFee) {
			this.payTxFee = payTxFee;
		}
		public String getErrors() {
			return errors;
		}
		public void setErrors(String errors) {
			this.errors = errors;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getP2pPort() {
			return p2pPort;
		}
		public void setP2pPort(int p2pPort) {
			this.p2pPort = p2pPort;
		}
		public int getRpcPort() {
			return rpcPort;
		}
		public void setRpcPort(int rpcPort) {
			this.rpcPort = rpcPort;
		}
		public int getMagic() {
			return magic;
		}
		public void setMagic(int magic) {
			this.magic = magic;
		}
		public int getPremine() {
			return premine;
		}
		public void setPremine(int premine) {
			this.premine = premine;
		}
	    
		
	}

}
