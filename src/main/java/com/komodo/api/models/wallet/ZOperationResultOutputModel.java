package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ZOperationResultOutputModel {
	
	@SerializedName("error")
	private String error;
	@SerializedName("id")
	private String id;
	@SerializedName("result")
	private List<Result> result;
	
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

	public List<Result> getResult() {
		return result;
	}

	public void setResult(List<Result> result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("id")
		private String id;
		@SerializedName("status")
		private String status;
		@SerializedName("creation_time")
		private long creationTime;
		@SerializedName("result")
		private InnerResult result;
		@SerializedName("execution_secs")
		private long executionSecs;
		@SerializedName("method")
		private String method;
		@SerializedName("params")
		private Params params;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public long getCreationTime() {
			return creationTime;
		}
		public void setCreationTime(long creationTime) {
			this.creationTime = creationTime;
		}
		public InnerResult getResult() {
			return result;
		}
		public void setResult(InnerResult result) {
			this.result = result;
		}
		public long getExecutionSecs() {
			return executionSecs;
		}
		public void setExecutionSecs(long executionSecs) {
			this.executionSecs = executionSecs;
		}
		public String getMethod() {
			return method;
		}
		public void setMethod(String method) {
			this.method = method;
		}
		public Params getParams() {
			return params;
		}
		public void setParams(Params params) {
			this.params = params;
		}
	}
	
	public static class InnerResult{
		@SerializedName("txid")
		private String txId;

		public String getTxId() {
			return txId;
		}

		public void setTxId(String txId) {
			this.txId = txId;
		}
	}
	
	public static class Params{
		@SerializedName("fromaddress")
		private String fromAddress;
		@SerializedName("amounts")
		private List<Amounts> amounts;
		@SerializedName("minconf")
		private int minConf;
		@SerializedName("fee")
		private double fee;
		public String getFromAddress() {
			return fromAddress;
		}
		public void setFromAddress(String fromAddress) {
			this.fromAddress = fromAddress;
		}
		public List<Amounts> getAmounts() {
			return amounts;
		}
		public void setAmounts(List<Amounts> amounts) {
			this.amounts = amounts;
		}
		public int getMinConf() {
			return minConf;
		}
		public void setMinConf(int minConf) {
			this.minConf = minConf;
		}
		public double getFee() {
			return fee;
		}
		public void setFee(double fee) {
			this.fee = fee;
		}
	}
	
	public static class Amounts{
		@SerializedName("address")
		private String address;
		@SerializedName("amount")
		private double amount;
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
	}

}
