package com.komodo.api.models.util;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class DecodeCCOpretOutputModel {
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
		@SerializedName("result")
		private String result;
		@SerializedName("OpRets")
		private List<OpRets> opRets;
		public String getResult() {
			return result;
		}
		public void setResult(String result) {
			this.result = result;
		}
		public List<OpRets> getOpRets() {
			return opRets;
		}
		public void setOpRets(List<OpRets> opRets) {
			this.opRets = opRets;
		}
	}

	public static class OpRets {
		@SerializedName("eval_code")
		private String evalCode;
		@SerializedName("function")
		private String function;
		public String getEvalCode() {
			return evalCode;
		}
		public void setEvalCode(String evalCode) {
			this.evalCode = evalCode;
		}
		public String getFunction() {
			return function;
		}
		public void setFunction(String function) {
			this.function = function;
		}

	}

}
