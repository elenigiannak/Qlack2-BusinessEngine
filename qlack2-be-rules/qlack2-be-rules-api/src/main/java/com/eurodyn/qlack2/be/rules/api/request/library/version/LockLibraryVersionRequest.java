package com.eurodyn.qlack2.be.rules.api.request.library.version;

import com.eurodyn.qlack2.fuse.idm.api.signing.QSignedRequest;

public class LockLibraryVersionRequest extends QSignedRequest {
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
