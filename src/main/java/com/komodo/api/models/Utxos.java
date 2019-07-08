package com.komodo.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class Utxos {
	@SerializedName("satoshis")
	private double satoshis;
	@SerializedName("txid")
	private String txId;
	@SerializedName("address")
	private String address;
	@SerializedName("outputIndex")
	private int outputIndex;
	@SerializedName("outputIndex")
	private String script;
	@SerializedName("height")
	private int height;
	
	public double getSatoshis() {
		return satoshis;
	}
	public void setSatoshis(double satoshis) {
		this.satoshis = satoshis;
	}
	public String getTxId() {
		return txId;
	}
	public void setTxId(String txId) {
		this.txId = txId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getOutputIndex() {
		return outputIndex;
	}
	public void setOutputIndex(int outputIndex) {
		this.outputIndex = outputIndex;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
