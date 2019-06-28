package com.komodo.api.models.rawtransactions;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DecodeScriptOutputModel {
	
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
		@SerializedName("asm")
		private String asm;
		@SerializedName("hex")
		private String hex;
		@SerializedName("type")
		private String type;
		@SerializedName("reqSigs")
		private int reqSigs;
		@SerializedName("addresses")
		private List<String> addresses;
		@SerializedName("p2sh")
		private String p2Sh;
		public String getAsm() {
			return asm;
		}
		public void setAsm(String asm) {
			this.asm = asm;
		}
		public String getHex() {
			return hex;
		}
		public void setHex(String hex) {
			this.hex = hex;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getReqSigs() {
			return reqSigs;
		}
		public void setReqSigs(int reqSigs) {
			this.reqSigs = reqSigs;
		}
		public List<String> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<String> addresses) {
			this.addresses = addresses;
		}
		public String getP2Sh() {
			return p2Sh;
		}
		public void setP2Sh(String p2Sh) {
			this.p2Sh = p2Sh;
		}
	}

}
