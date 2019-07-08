package com.komodo.api.models;

/**
 * 
 * @author Giffy Chris
 *
 */
public class StringResultOutputModel {
		private String error;
		private Result result;
		private String id;
		public String getError() {
			return error;
		}
		public void setError(String error) {
			this.error = error;
		}
		public Result getResult() {
			return result;
		}
		public void setResult(Result result) {
			this.result = result;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		
		public static class Result{
			private String result;
			private int error;

			public int getError() {
				return error;
			}

			public void setError(int error) {
				this.error = error;
			}

			public String getResult() {
				return result;
			}

			public void setResult(String result) {
				this.result = result;
			}
			
		}
	}
