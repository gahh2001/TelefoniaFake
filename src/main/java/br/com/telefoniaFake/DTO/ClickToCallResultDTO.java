package br.com.telefoniaFake.DTO;

public class ClickToCallResultDTO {

	private String status;
	private String callid;
	private String error;
	
	public ClickToCallResultDTO( String status, String callid, String error ) {
		this.status = status;
		this.callid = callid;
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public String getCallid() {
		return callid;
	}

	public String getError() {
		return error;
	}
}