package com.komodo.api.models.rawtransactions;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DecodeRawTxOutputModel {

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
		@SerializedName("txid")
		private String txId;
		@SerializedName("size")
		private int size;
		@SerializedName("version")
		private int version;
		@SerializedName("locktime")
		private int lockTime;
		@SerializedName("vin")
		private List<VIn> vIn;
		@SerializedName("vout")
		private List<VOut> vOut;
		@SerializedName("vjoinsplit")
		private List<String> vJoinSplit;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public int getLockTime() {
			return lockTime;
		}
		public void setLockTime(int lockTime) {
			this.lockTime = lockTime;
		}
		public List<VIn> getvIn() {
			return vIn;
		}
		public void setvIn(List<VIn> vIn) {
			this.vIn = vIn;
		}
		public List<VOut> getvOut() {
			return vOut;
		}
		public void setvOut(List<VOut> vOut) {
			this.vOut = vOut;
		}
		public List<String> getvJoinSplit() {
			return vJoinSplit;
		}
		public void setvJoinSplit(List<String> vJoinSplit) {
			this.vJoinSplit = vJoinSplit;
		}
	}

	public static class VOut{
		@SerializedName("value")
		private double value;
		@SerializedName("valueSat")
		private long valueSat;
		@SerializedName("n")
		private int n;
		@SerializedName("scriptPubKey")
		private ScriptPubKey scriptPubKey;
		public double getValue() {
			return value;
		}
		public void setValue(double value) {
			this.value = value;
		}
		public long getValueSat() {
			return valueSat;
		}
		public void setValueSat(long valueSat) {
			this.valueSat = valueSat;
		}
		public int getN() {
			return n;
		}
		public void setN(int n) {
			this.n = n;
		}
		public ScriptPubKey getScriptPubKey() {
			return scriptPubKey;
		}
		public void setScriptPubKey(ScriptPubKey scriptPubKey) {
			this.scriptPubKey = scriptPubKey;
		}
	}

	private static class ScriptPubKey{
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

	private static class VIn{
		@SerializedName("txid")
		private String txId;
		@SerializedName("vout")
		private int vOut;
		@SerializedName("scriptSig")
		private ScriptSig scriptSig;
		@SerializedName("sequence")
		private long sequence;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public int getvOut() {
			return vOut;
		}
		public void setvOut(int vOut) {
			this.vOut = vOut;
		}
		public ScriptSig getScriptSig() {
			return scriptSig;
		}
		public void setScriptSig(ScriptSig scriptSig) {
			this.scriptSig = scriptSig;
		}
		public long getSequence() {
			return sequence;
		}
		public void setSequence(long sequence) {
			this.sequence = sequence;
		}
	}

	private static class ScriptSig{
		@SerializedName("asm")
		private String asm;
		@SerializedName("hex")
		private String hex;
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
	}

}
