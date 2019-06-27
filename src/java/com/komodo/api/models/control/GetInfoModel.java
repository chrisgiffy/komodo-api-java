package com.komodo.api.models.control;

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
		private int version;
	    private int protocolVersion;
	    private String kmdVersion;
	    private int notarized;
	    private int prevMoMheight;
	    private String notarizedHash;
	    private String notarizedTxid;
	    private String notarizedTxidHeight;
	    private int kmdNotarizedHeight;
	    private int notarizedConfirms;
	    private int walletVersion;
	    private double balance;
	    private int blocks;
	    private int longestChain;
	    private int timeOffset;
	    private int tipTime;
	    private int connections;
	    private String proxy;
	    private double difficulty;
	    private boolean testNet;
	    private int keypoolOldest;
	    private int keypoolSsize;
	    private double relayFee;
	    private int payTxFee;
	    private String errors;
	    private String name;
	    private int p2pPort;
	    private int rpcPort;
	    private double magic;
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
		public int getKeypoolSsize() {
			return keypoolSsize;
		}
		public void setKeypoolSsize(int keypoolSsize) {
			this.keypoolSsize = keypoolSsize;
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
		public double getMagic() {
			return magic;
		}
		public void setMagic(double magic) {
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
