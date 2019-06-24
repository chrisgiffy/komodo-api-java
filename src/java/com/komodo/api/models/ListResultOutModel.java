package com.komodo.api.models;

import java.util.List;

public class ListResultOutModel {
	private List<String> result;
	private String error;
	private String id;
	public List<String> getResult() {
		return result;
	}
	public void setResult(List<String> result) {
		this.result = result;
	}
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
}
