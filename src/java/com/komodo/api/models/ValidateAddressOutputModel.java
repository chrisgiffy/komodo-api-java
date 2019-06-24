package com.komodo.api.models;

public class ValidateAddressOutputModel {
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
		private boolean isValid;
		private String address;
		private String scriptPubKey;
		private int segId;
		private boolean isMine;
		private boolean  isWatchonly;
		private boolean isScript;
		private String pubKey;
		private boolean isCompressed;
		private String account; 
		
		public boolean getIsValid() {
			return isValid;
		}
		public void setIsValid(boolean isValid) {
			this.isValid = isValid;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getScriptPubKey() {
			return scriptPubKey;
		}
		public void setScriptPubKey(String scriptPubKey) {
			this.scriptPubKey = scriptPubKey;
		}
		public int getSegId() {
			return segId;
		}
		public void setSegId(int segId) {
			this.segId = segId;
		}
		public boolean getIsMine() {
			return isMine;
		}
		public void setIsMine(boolean isMine) {
			this.isMine = isMine;
		}
		public boolean getIsWatchonly() {
			return isWatchonly;
		}
		public void setIsWatchonly(boolean isWatchonly) {
			this.isWatchonly = isWatchonly;
		}
		public boolean getIsScript() {
			return isScript;
		}
		public void setIsScript(boolean isScript) {
			this.isScript = isScript;
		}
		public String getPubKey() {
			return pubKey;
		}
		public void setPubKey(String pubKey) {
			this.pubKey = pubKey;
		}
		public boolean getIsCompressed() {
			return isCompressed;
		}
		public void setIsCompressed(boolean isCompressed) {
			this.isCompressed = isCompressed;
		}
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account;
		}
		
	}

}
