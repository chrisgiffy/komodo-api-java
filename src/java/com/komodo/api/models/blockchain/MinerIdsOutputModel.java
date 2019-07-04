package com.komodo.api.models.blockchain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class MinerIdsOutputModel {
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
		private List<Mined> mined;

		public List<Mined> getMined() {
			return mined;
		}

		public void setMined(List<Mined> mined) {
			this.mined = mined;
		}
	}

	public static class Mined{
		@SerializedName("notaryid")
		private int notaryId;
		@SerializedName("KMDaddress")
		private String kmdAddress;
		@SerializedName("pubkey")
		private String pubKey;
		@SerializedName("blocks")
		private int blocks;
		public int getNotaryId() {
			return notaryId;
		}
		public void setNotaryId(int notaryId) {
			this.notaryId = notaryId;
		}
		public String getKmdAddress() {
			return kmdAddress;
		}
		public void setKmdAddress(String kmdAddress) {
			this.kmdAddress = kmdAddress;
		}
		public String getPubKey() {
			return pubKey;
		}
		public void setPubKey(String pubKey) {
			this.pubKey = pubKey;
		}
		public int getBlocks() {
			return blocks;
		}
		public void setBlocks(int blocks) {
			this.blocks = blocks;
		}
	}

}
