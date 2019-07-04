package com.komodo.api.models.generate;

/**
 * 
 * @author Giffy Chris
 *
 */
public class GetGenerateOutputModel {

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
		private boolean staking;
		private boolean generate;
		private int numThreads;
		public boolean getStaking() {
			return staking;
		}
		public void setStaking(boolean staking) {
			this.staking = staking;
		}
		public boolean getGenerate() {
			return generate;
		}
		public void setGenerate(boolean generate) {
			this.generate = generate;
		}
		public int getNumThreads() {
			return numThreads;
		}
		public void setNumThreads(int numThreads) {
			this.numThreads = numThreads;
		}
	}
}
