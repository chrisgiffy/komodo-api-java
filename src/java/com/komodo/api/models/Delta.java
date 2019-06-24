package com.komodo.api.models;

public class Delta {
	private double satoshis;
    private String txId;
    private int index;
    private int blockIndex;
    private int height;
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
