package com.komodo.api.models;

import java.util.List;

public class TransactionOutputModel {
	private double amount;
	  private double fee;
	  private int rawconfirmations;
	  private int confirmations;
	  private String blockhash;
	  private int blockindex;
	  private long blocktime;
	  private int expiryheight;
	  private String txid;
	  private long time;
	  private long timereceived;
	  private List<Details> details;
	  private String hex;
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public int getRawconfirmations() {
		return rawconfirmations;
	}
	public void setRawconfirmations(int rawconfirmations) {
		this.rawconfirmations = rawconfirmations;
	}
	public int getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(int confirmations) {
		this.confirmations = confirmations;
	}
	public String getBlockhash() {
		return blockhash;
	}
	public void setBlockhash(String blockhash) {
		this.blockhash = blockhash;
	}
	public int getBlockindex() {
		return blockindex;
	}
	public void setBlockindex(int blockindex) {
		this.blockindex = blockindex;
	}
	public long getBlocktime() {
		return blocktime;
	}
	public void setBlocktime(long blocktime) {
		this.blocktime = blocktime;
	}
	public int getExpiryheight() {
		return expiryheight;
	}
	public void setExpiryheight(int expiryheight) {
		this.expiryheight = expiryheight;
	}
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public long getTimereceived() {
		return timereceived;
	}
	public void setTimereceived(long timereceived) {
		this.timereceived = timereceived;
	}
	public List<Details> getDetails() {
		return details;
	}
	public void setDetails(List<Details> details) {
		this.details = details;
	}
	public String getHex() {
		return hex;
	}
	public void setHex(String hex) {
		this.hex = hex;
	}
	  
}
