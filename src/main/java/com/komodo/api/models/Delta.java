package com.komodo.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class Delta {
	@SerializedName("satoshis")
	private double satoshis;
	@SerializedName("txid")
    private String txId;
	@SerializedName("index")
    private int index;
	@SerializedName("blockindex")
    private int blockIndex;
	@SerializedName("height")
    private int height;
	@SerializedName("address")
    private String address;
    
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
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public int getBlockIndex() {
		return blockIndex;
	}
	public void setBlockIndex(int blockIndex) {
		this.blockIndex = blockIndex;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
