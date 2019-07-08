package com.komodo.api.models.rawtransactions;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class RawTransactionOutputModel {
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
		@SerializedName("hex") 
		private String hex;
		@SerializedName("txid")
		private String txId;
		@SerializedName("overwintered")
		private boolean overWintered;
		@SerializedName("version")
		private int version;
		@SerializedName("versiongroupid")
		private String versionGroupId;
		@SerializedName("locktime")
		private long lockTime;
		@SerializedName("expiryheight")
		private long expiryHeight;
		@SerializedName("vin")
		private List<VIn> vIn;
		@SerializedName("vout")
		private List<VOut> vOut;
		@SerializedName("vjoinsplit")
		private List<String> vJoinSplit;
		@SerializedName("valueBalance")
		private double valueBalance;
		@SerializedName("vShieldedSpend")
		private List<String> vShieldedSpend;
		@SerializedName("vShieldedOutput")
		private List<String> vShieldedOutput;
		@SerializedName( "blockhash")
		private String blockHash;
		@SerializedName("height")
		private long height;
		@SerializedName("confirmations")
		private int confirmations;
		@SerializedName("rawconfirmations")
		private int rawConfirmations;
		@SerializedName("time")
		private long time;
		@SerializedName("blocktime")
		private long blockTime;
		public String getHex() {
			return hex;
		}
		public void setHex(String hex) {
			this.hex = hex;
		}
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public boolean getOverWintered() {
			return overWintered;
		}
		public void setOverWintered(boolean overWintered) {
			this.overWintered = overWintered;
		}
		public int getVersion() {
			return version;
		}
		public void setVersion(int version) {
			this.version = version;
		}
		public String getVersionGroupId() {
			return versionGroupId;
		}
		public void setVersionGroupId(String versionGroupId) {
			this.versionGroupId = versionGroupId;
		}
		public long getLockTime() {
			return lockTime;
		}
		public void setLockTime(long lockTime) {
			this.lockTime = lockTime;
		}
		public long getExpiryHeight() {
			return expiryHeight;
		}
		public void setExpiryHeight(long expiryHeight) {
			this.expiryHeight = expiryHeight;
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
		public double getValueBalance() {
			return valueBalance;
		}
		public void setValueBalance(double valueBalance) {
			this.valueBalance = valueBalance;
		}
		public List<String> getvShieldedSpend() {
			return vShieldedSpend;
		}
		public void setvShieldedSpend(List<String> vShieldedSpend) {
			this.vShieldedSpend = vShieldedSpend;
		}
		public List<String> getvShieldedOutput() {
			return vShieldedOutput;
		}
		public void setvShieldedOutput(List<String> vShieldedOutput) {
			this.vShieldedOutput = vShieldedOutput;
		}
		public String getBlockHash() {
			return blockHash;
		}
		public void setBlockHash(String blockHash) {
			this.blockHash = blockHash;
		}
		public long getHeight() {
			return height;
		}
		public void setHeight(long height) {
			this.height = height;
		}
		public int getConfirmations() {
			return confirmations;
		}
		public void setConfirmations(int confirmations) {
			this.confirmations = confirmations;
		}
		public int getRawConfirmations() {
			return rawConfirmations;
		}
		public void setRawConfirmations(int rawConfirmations) {
			this.rawConfirmations = rawConfirmations;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
		public long getBlockTime() {
			return blockTime;
		}
		public void setBlockTime(long blockTime) {
			this.blockTime = blockTime;
		}
	}

	public static class VIn{
		@SerializedName("txid")
		private String txId;
		@SerializedName("vout")
		private int vOut;
		@SerializedName("address")
		private String address;
		@SerializedName("scriptSig")
		private ScriptSig scriptSig;
		@SerializedName("value")
		private double value;
		@SerializedName("valueSat")
		private long valueSat;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public ScriptSig getScriptSig() {
			return scriptSig;
		}
		public void setScriptSig(ScriptSig scriptSig) {
			this.scriptSig = scriptSig;
		}
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
		public long getSequence() {
			return sequence;
		}
		public void setSequence(long sequence) {
			this.sequence = sequence;
		}
	}

	public static class VOut{
		@SerializedName("value")
		private double value;
		@SerializedName("interest")
		private double interest;
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
		public double getInterest() {
			return interest;
		}
		public void setInterest(double interest) {
			this.interest = interest;
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

	public static class ScriptSig{
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
