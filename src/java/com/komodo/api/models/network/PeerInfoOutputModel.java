package com.komodo.api.models.network;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class PeerInfoOutputModel {
	
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

	public static class Result{
		@SerializedName("id")
		private int id;
		
		@SerializedName("addr")
		private String addr;
		
		@SerializedName("addrlocal")
		private String addrLocal;
		
		@SerializedName("services")
		private String services;
		
		@SerializedName("lastsend")
		private long lastSend;
		
		@SerializedName("lastrecv")
		private long lastRecv;
		
		@SerializedName("bytessent")
		private long byTesSent;
		
		@SerializedName("bytesrecv")
		private long bytesRecv;
		
		@SerializedName("conntime")
		private long connTime;
		
		@SerializedName("timeoffset")
		private int timeOffset;
		
		@SerializedName("pingtime")
		private double pingTime;
		
		@SerializedName("version")
		private long version;
		
		@SerializedName("subver")
		private String subVersion;
		
		@SerializedName("inbound")
		private boolean inbound;
		
		@SerializedName("startingheight")
		private long startingHeight;
		
		@SerializedName("banscore")
		private int banScore;
		
		@SerializedName("synced_headers")
		private long syncedHeaders;
		
		@SerializedName("synced_blocks")
		private long syncedBlocks;
		
		@SerializedName("whitelisted")
		private boolean whiteListed;
		
		@SerializedName("inflight")
		private List<String> inFlight;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public String getAddrLocal() {
			return addrLocal;
		}
		public void setAddrLocal(String addrLocal) {
			this.addrLocal = addrLocal;
		}
		public String getServices() {
			return services;
		}
		public void setServices(String services) {
			this.services = services;
		}
		public long getLastSend() {
			return lastSend;
		}
		public void setLastSend(long lastSend) {
			this.lastSend = lastSend;
		}
		public long getLastRecv() {
			return lastRecv;
		}
		public void setLastRecv(long lastRecv) {
			this.lastRecv = lastRecv;
		}
		public long getByTesSent() {
			return byTesSent;
		}
		public void setByTesSent(long byTesSent) {
			this.byTesSent = byTesSent;
		}
		public long getBytesRecv() {
			return bytesRecv;
		}
		public void setBytesRecv(long bytesRecv) {
			this.bytesRecv = bytesRecv;
		}
		public long getConnTime() {
			return connTime;
		}
		public void setConnTime(long connTime) {
			this.connTime = connTime;
		}
		public int getTimeOffset() {
			return timeOffset;
		}
		public void setTimeOffset(int timeOffset) {
			this.timeOffset = timeOffset;
		}
		public double getPingTime() {
			return pingTime;
		}
		public void setPingTime(double pingTime) {
			this.pingTime = pingTime;
		}
		public long getVersion() {
			return version;
		}
		public void setVersion(long version) {
			this.version = version;
		}
		public String getSubVersion() {
			return subVersion;
		}
		public void setSubVersion(String subVersion) {
			this.subVersion = subVersion;
		}
		public boolean getInbound() {
			return inbound;
		}
		public void setInbound(boolean inbound) {
			this.inbound = inbound;
		}
		public long getStartingHeight() {
			return startingHeight;
		}
		public void setStartingHeight(long startingHeight) {
			this.startingHeight = startingHeight;
		}
		public int getBanScore() {
			return banScore;
		}
		public void setBanScore(int banScore) {
			this.banScore = banScore;
		}
		public long getSyncedHeaders() {
			return syncedHeaders;
		}
		public void setSyncedHeaders(long syncedHeaders) {
			this.syncedHeaders = syncedHeaders;
		}
		public long getSyncedBlocks() {
			return syncedBlocks;
		}
		public void setSyncedBlocks(long syncedBlocks) {
			this.syncedBlocks = syncedBlocks;
		}
		public boolean getWhiteListed() {
			return whiteListed;
		}
		public void setWhiteListed(boolean whiteListed) {
			this.whiteListed = whiteListed;
		}
		public List<String> getInFlight() {
			return inFlight;
		}
		public void setInFlight(List<String> inFlight) {
			this.inFlight = inFlight;
		}
	}

}
