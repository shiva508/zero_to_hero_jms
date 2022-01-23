package com.pool.model;

public class Email {
	private String to;
	private String body;

	public Email() {

	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Email [to=" + to + ", body=" + body + "]";
	}

}
