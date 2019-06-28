package com.komodo.api.models.blockchain;

import com.google.gson.annotations.SerializedName;

public class KvSearchOutputModel {
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
		@SerializedName("coin")
		private String coin;
		@SerializedName("currentheight")
		private int currentHeight;
		@SerializedName("key")
		private String key;
		@SerializedName("keylen")
		private int keyLen;
		@SerializedName("owner")
		private String owner;
		@SerializedName("height")
		private int height;
		@SerializedName("expiration")
		private int expiration;
		@SerializedName("flags")
		private int flags;
		@SerializedName("value")
		private String value;
		@SerializedName("valuesize")
		private int valueSize;
		public String getCoin() {
			return coin;
		}
		public void setCoin(String coin) {
			this.coin = coin;
		}
		public int getCurrentHeight() {
			return currentHeight;
		}
		public void setCurrentHeight(int currentHeight) {
			this.currentHeight = currentHeight;
		}
		public String getKey() {
			return key;
		}
		public void setKey(String key) {
			this.key = key;
		}
		public int getKeyLen() {
			return keyLen;
		}
		public void setKeyLen(int keyLen) {
			this.keyLen = keyLen;
		}
		public String getOwner() {
			return owner;
		}
		public void setOwner(String owner) {
			this.owner = owner;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getExpiration() {
			return expiration;
		}
		public void setExpiration(int expiration) {
			this.expiration = expiration;
		}
		public int getFlags() {
			return flags;
		}
		public void setFlags(int flags) {
			this.flags = flags;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
		public int getValueSize() {
			return valueSize;
		}
		public void setValueSize(int valueSize) {
			this.valueSize = valueSize;
		}
	}

}
