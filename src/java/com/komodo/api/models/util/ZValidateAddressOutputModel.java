package com.komodo.api.models.util;

import com.google.gson.annotations.SerializedName;

public class ZValidateAddressOutputModel {
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
		@SerializedName("isvalid")
		private boolean isValid;
		@SerializedName("address")
		private String address;
		@SerializedName("payingkey")
		private String payingKey;
		@SerializedName("transmissionkey")
		private String transmissionKey;
		@SerializedName("ismine")
		private boolean isMine;
		
		public boolean getIsValid() {
			return isValid;
		}
		public void setIsValid(boolean isValid) {
			this.isValid = isValid;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		public boolean getIsMine() {
			return isMine;
		}
		public void setIsMine(boolean isMine) {
			this.isMine = isMine;
		}
		public String getPayingKey() {
			return payingKey;
		}
		public void setPayingKey(String payingKey) {
			this.payingKey = payingKey;
		}
		public String getTransmissionKey() {
			return transmissionKey;
		}
		public void setTransmissionKey(String transmissionKey) {
			this.transmissionKey = transmissionKey;
		}
		
		
		
	}

}
