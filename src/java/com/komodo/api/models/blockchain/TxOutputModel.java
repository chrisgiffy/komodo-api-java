package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class TxOutputModel {
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
		@SerializedName("bestblock")
		private String bestBlock;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("rawconfirmations")
		private int rawconfirmations;
		@SerializedName("value")
		private double value;
		@SerializedName("scriptPubKey")
		private ScriptPubKey scriptPubKey;
		@SerializedName("version")
		private int version;
		@SerializedName("coinbase")
		private boolean coinBase;
		public String getBestBlock() {
			return bestBlock;
		}
		public void setBestBlock(String bestBlock) {
			this.bestBlock = bestBlock;
		}
		public int getConfirmations() {
			return confirmations;
		}
		public void setConfirmations(int confirmations) {
			this.confirmations = confirmations;
		}
		public int getRawconfirmations() {
			return rawconfirmations;
		}
		public void setRawconfirmations(int rawconfirmations) {
			this.rawconfirmations = rawconfirmations;
		}
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public ScriptPubKey getScriptPubKey() {
			return scriptPubKey;
		}
		public void setScriptPubKey(ScriptPubKey scriptPubKey) {
			this.scriptPubKey = scriptPubKey;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public boolean getCoinBase() {
			return coinBase;
		}
		public void setCoinBase(boolean coinBase) {
			this.coinBase = coinBase;
		}
	}

	public static class ScriptPubKey{
		@SerializedName("asm")
		private String asm;
		@SerializedName("hex")
		private String hex;
		@SerializedName("reqSigs")
		private int reqSigs;
		@SerializedName("type")
		private String type;
		@SerializedName("addresses")
		private List<String> addresses;
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
		public int getReqSigs() {
			return reqSigs;
		}
		public void setReqSigs(int reqSigs) {
			this.reqSigs = reqSigs;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public List<String> getAddresses() {
			return addresses;
		}
		public void setAddresses(List<String> addresses) {
			this.addresses = addresses;
		}
	}
}
