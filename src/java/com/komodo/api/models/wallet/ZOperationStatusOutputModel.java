package com.komodo.api.models.wallet;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ZOperationStatusOutputModel {
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
		@SerializedName("error")
		private Error error;
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
		public Error getError() {
			return error;
		}
		public void setError(Error error) {
			this.error = error;
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
	
	public static class Error{
		@SerializedName("code")
		private String code;

		@SerializedName("message")
		private String message;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
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
