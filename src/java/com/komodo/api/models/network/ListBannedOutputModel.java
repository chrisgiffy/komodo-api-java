package com.komodo.api.models.network;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ListBannedOutputModel {
	
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
		
		@SerializedName("address")
		private String address;
		
		@SerializedName("banned_until")
		private long bannedUntil;
		
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public long getBannedUntil() {
			return bannedUntil;
		}
		public void setBannedUntil(long bannedUntil) {
			this.bannedUntil = bannedUntil;
		}
		
	}

}
