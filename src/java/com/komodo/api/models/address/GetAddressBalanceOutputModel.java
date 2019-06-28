package com.komodo.api.models.address;

public class GetAddressBalanceOutputModel {
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
			private double balance;
		    private double received;
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			public double getReceived() {
				return received;
			}
			public void setReceived(double received) {
				this.received = received;
			}
		}
}
