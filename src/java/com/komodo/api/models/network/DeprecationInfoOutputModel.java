package com.komodo.api.models.network;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class DeprecationInfoOutputModel {
	
	private String error;
	private String id;
	private Result result;
	
	public static class Result{
		@SerializedName("version")
		private String version;
		
		@SerializedName("subversion")
		private String subVersion;
		
		@SerializedName("deprecationheight")
		private String deprecationHeight;
		
		public String getDeprecationHeight() {
			return deprecationHeight;
		}
		public void setDeprecationHeight(String deprecationHeight) {
			this.deprecationHeight = deprecationHeight;
		}
		public String getSubVersion() {
			return subVersion;
		}
		public void setSubVersion(String subVersion) {
			this.subVersion = subVersion;
		}
		public String getVersion() {
			return version;
		}
		public void setVersion(String version) {
			this.version = version;
		}
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

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
