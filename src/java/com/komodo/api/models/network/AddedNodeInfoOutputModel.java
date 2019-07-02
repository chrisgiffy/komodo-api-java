package com.komodo.api.models.network;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class AddedNodeInfoOutputModel {
	
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
		@SerializedName("addednode")
		private String addednode;
		@SerializedName("connected")
		private boolean connected;
		@SerializedName("addresses")
		List<NwAddress> addresses;
		public String getAddednode() {
			return addednode;
		}
		public void setAddednode(String addednode) {
			this.addednode = addednode;
		}
		public boolean getConnected() {
			return connected;
		}
		public void setConnected(boolean connected) {
			this.connected = connected;
		}
		public List<NwAddress> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<NwAddress> addresses) {
			this.addresses = addresses;
		}
	}
	
	public static class NwAddress{
		@SerializedName("address")
		private String address;
		@SerializedName("connected")
		private String connected;
		public String getConnected() {
			return connected;
		}
		public void setConnected(String connected) {
			this.connected = connected;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}

}
