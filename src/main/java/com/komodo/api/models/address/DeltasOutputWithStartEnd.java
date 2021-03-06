package com.komodo.api.models.address;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.komodo.api.models.Delta;

/**
 * 
 * @author Giffy Chris
 *
 */
public class DeltasOutputWithStartEnd {
	private String error;
	private String id;
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
		@SerializedName("deltas")
		private List<Delta> deltas;
		@SerializedName("start")
		private HashHeightModel start;
		@SerializedName("end")
		private HashHeightModel end;
		public List<Delta> getDeltas() {
			return deltas;
		}
		public void setDeltas(List<Delta> deltas) {
			this.deltas = deltas;
		}
		public HashHeightModel getStart() {
			return start;
		}
		public void setStart(HashHeightModel start) {
			this.start = start;
		}
		public HashHeightModel getEnd() {
			return end;
		}
		public void setEnd(HashHeightModel end) {
			this.end = end;
		}
	}
	
	public static class HashHeightModel {
		@SerializedName("hash")
		private String hash;
		@SerializedName("height")
		private int height;
		
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public String getHash() {
			return hash;
		}
		public void setHash(String hash) {
			this.hash = hash;
		}

	}
}
