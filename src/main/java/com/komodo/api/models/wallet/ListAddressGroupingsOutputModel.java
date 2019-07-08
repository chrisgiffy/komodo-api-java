package com.komodo.api.models.wallet;

import java.util.List;

/**
 * 
 * @author Giffy Chris
 *
 */
public class ListAddressGroupingsOutputModel {
	
	private String error;
	private String id;
	private List<List<Object>> result;
	
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
	public List<List<Object>> getResult() {
		return result;
	}
	public void setResult(List<List<Object>> result) {
		this.result = result;
	}
	

}
