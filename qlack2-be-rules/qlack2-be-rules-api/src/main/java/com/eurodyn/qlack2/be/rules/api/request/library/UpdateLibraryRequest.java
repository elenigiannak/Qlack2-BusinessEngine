package com.eurodyn.qlack2.be.rules.api.request.library;

import java.util.ArrayList;
import java.util.List;

import com.eurodyn.qlack2.be.rules.api.request.library.version.UpdateLibraryVersionRequest;
import com.eurodyn.qlack2.fuse.idm.api.signing.QSignedRequest;

public class UpdateLibraryRequest extends QSignedRequest {

	private String id;

	private String name;
	private String description;
	private boolean active;

	private List<String> categoryIds = new ArrayList<>();

	private UpdateLibraryVersionRequest versionRequest;

	// -- Accessors

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<String> getCategoryIds() {
		return categoryIds;
	}

	public void setCategoryIds(List<String> categoryIds) {
		this.categoryIds = categoryIds;
	}

	public UpdateLibraryVersionRequest getVersionRequest() {
		return versionRequest;
	}

	public void setVersionRequest(UpdateLibraryVersionRequest versionRequest) {
		this.versionRequest = versionRequest;
	}

}
