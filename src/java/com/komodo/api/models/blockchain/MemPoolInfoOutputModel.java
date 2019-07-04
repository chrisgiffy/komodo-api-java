package com.komodo.api.models.blockchain;

/**
 * 
 * @author Giffy Chris
 *
 */
public class MemPoolInfoOutputModel {
	
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
		private int size;
		private int bytes;
		private int usage;
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getBytes() {
			return bytes;
		}
		public void setBytes(int bytes) {
			this.bytes = bytes;
		}
		public int getUsage() {
			return usage;
		}
		public void setUsage(int usage) {
			this.usage = usage;
		}
	}

}
