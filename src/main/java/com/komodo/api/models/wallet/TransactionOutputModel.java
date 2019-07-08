package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class TransactionOutputModel {
	@SerializedName("amount")
	private double amount;
	@SerializedName("fee")
	private double fee;
	@SerializedName("rawconfirmations")
	private int rawconfirmations;
	@SerializedName("confirmations")
	private int confirmations;
	@SerializedName("blockhash")
	private String blockhash;
	@SerializedName("blockindex")
	private int blockindex;
	@SerializedName("blocktime")
	private long blocktime;
	@SerializedName("expiryheight")
	private int expiryheight;
	@SerializedName("txid")
	private String txid;
	@SerializedName("time")
	private long time;
	@SerializedName("timereceived")
	private long timereceived;
	@SerializedName("details")
	private List<Details> details;
	@SerializedName("hex")
	private String hex;

	public static class Details {
		@SerializedName("account")
		private String account;
		@SerializedName("address")
		private String address;
		@SerializedName("category")
		private String category;
		@SerializedName("amount")
		private double amount;
		@SerializedName("vout")
		private int vout;
		@SerializedName("fee")
		private double fee;
		@SerializedName("size")
		private int size;
		public String getAccount() {
			return account;
		}
		public void setAccount(String account) {
			this.account = account;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public int getVout() {
			return vout;
		}
		public void setVout(int vout) {
			this.vout = vout;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}

	}

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
