package com.komodo.api.models.address;

import java.util.List;

import com.komodo.api.models.Delta;

public class ListDeltasOutputModel {
	private String error;
	private String id;
	private List<Delta> result;
	
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

	public List<Delta> getResult() {
		return result;
	}

	public void setResult(List<Delta> result) {
		this.result = result;
	}
}
