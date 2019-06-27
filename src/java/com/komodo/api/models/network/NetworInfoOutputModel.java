package com.komodo.api.models.network;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class NetworInfoOutputModel {
	
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
		
		@SerializedName("subversion")
		private String subVersion;
		
		@SerializedName("protocolversion")
		private int protocolVersion;
		
		@SerializedName("localservices")
		private String localServices;
		
		@SerializedName("timeoffset")
		private int timeOffset;
		
		@SerializedName("connections")
		private int connections;
		
		@SerializedName("networks")
		private List<Network> networks;
		
		@SerializedName("relayfee")
		private double relayFee;
		
		@SerializedName("localaddresses")
		private List<String> localAddresses;
		
		@SerializedName("warnings")
		private String warnings;
		
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getSubVersion() {
			return subVersion;
		}
		public void setSubVersion(String subVersion) {
			this.subVersion = subVersion;
		}
		public int getProtocolVersion() {
			return protocolVersion;
		}
		public void setProtocolVersion(int protocolVersion) {
			this.protocolVersion = protocolVersion;
		}
		public String getLocalServices() {
			return localServices;
		}
		public void setLocalServices(String localServices) {
			this.localServices = localServices;
		}
		public int getTimeOffset() {
			return timeOffset;
		}
		public void setTimeOffset(int timeOffset) {
			this.timeOffset = timeOffset;
		}
		public int getConnections() {
			return connections;
		}
		public void setConnections(int connections) {
			this.connections = connections;
		}
		public List<Network> getNetworks() {
			return networks;
		}
		public void setNetworks(List<Network> networks) {
			this.networks = networks;
		}
		public double getRelayFee() {
			return relayFee;
		}
		public void setRelayFee(double relayFee) {
			this.relayFee = relayFee;
		}
		public List<String> getLocalAddresses() {
			return localAddresses;
		}
		public void setLocalAddresses(List<String> localAddresses) {
			this.localAddresses = localAddresses;
		}
		public String getWarnings() {
			return warnings;
		}
		public void setWarnings(String warnings) {
			this.warnings = warnings;
		}
	}
	
	public static class Network{
		@SerializedName("name")
		private String name;
		
		@SerializedName("limited")
		private boolean limited;
		
		@SerializedName("reachable")
		private boolean reachable;
		
		@SerializedName("proxy")
		private String proxy;
		
		@SerializedName("proxy_randomize_credentials")
		private boolean proxyRandomizeCredentials;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public boolean getLimited() {
			return limited;
		}
		public void setLimited(boolean limited) {
			this.limited = limited;
		}
		public boolean getReachable() {
			return reachable;
		}
		public void setReachable(boolean reachable) {
			this.reachable = reachable;
		}
		public String getProxy() {
			return proxy;
		}
		public void setProxy(String proxy) {
			this.proxy = proxy;
		}
		public boolean getProxyRandomizeCredentials() {
			return proxyRandomizeCredentials;
		}
		public void setProxyRandomizeCredentials(boolean proxyRandomizeCredentials) {
			this.proxyRandomizeCredentials = proxyRandomizeCredentials;
		}
	}

}
