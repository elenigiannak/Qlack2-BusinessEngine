package com.eurodyn.qlack2.be.explorer.api.request.project;

import com.eurodyn.qlack2.fuse.idm.api.signing.QSignedRequest;

public class GetProjectRequest extends QSignedRequest {
	private String id;

	public GetProjectRequest(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
