package com.komodo.api.models.crosschain;

import java.util.List;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Giffy Chris
 *
 */
public class GetImportsOutputModel {
	
	private String id;
	private String error;
	private Result result;
	
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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result{
		@SerializedName("imports")
		private List<Import> imports;
		@SerializedName("TotalImported")
		private double totalImported;
		@SerializedName("time")
		private long time;
		public List<Import> getImports() {
			return imports;
		}
		public void setImports(List<Import> imports) {
			this.imports = imports;
		}
		public double getTotalImported() {
			return totalImported;
		}
		public void setTotalImported(double totalImported) {
			this.totalImported = totalImported;
		}
		public long getTime() {
			return time;
		}
		public void setTime(long time) {
			this.time = time;
		}
	}
	
	public static class Import{
		@SerializedName("txid")
		private String txId;
		@SerializedName("amount")
		private double amount;
		@SerializedName("export")
		private Export export;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public Export getExport() {
			return export;
		}
		public void setExport(Export export) {
			this.export = export;
		}
		
	}
	
	public static class Export{
		@SerializedName("txid")
		private String txId;
		@SerializedName("amount")
		private double amount;
		@SerializedName("source")
		private String source;
		public String getTxId() {
			return txId;
		}
		public void setTxId(String txId) {
			this.txId = txId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
	}

}
