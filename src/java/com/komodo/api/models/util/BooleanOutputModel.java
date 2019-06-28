package com.komodo.api.models.util;

public class BooleanOutputModel {
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
		private boolean result;

		public boolean getResult() {
			return result;
		}

		public void setResult(boolean result) {
			this.result = result;
		}
		
	}
}
