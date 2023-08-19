package br.com.telefoniaFake.DTO;

public class LoginResultDTO {
	
	private String api_key;
	private String error;
	private Integer id;
	private String name;

	public LoginResultDTO( String api_key, String error, Integer id, String name ) {
		this.api_key = api_key;
		this.error = error;
		this.id = id;
		this.name = name;
	}

	public String getApi_key() {
		return api_key;
	}

	public void setApi_key( String api_key ) {
		this.api_key = api_key;
	}

	public String getError() {
		return error;
	}

	public void setError( String error ) {
		this.error = error;
	}

	public Integer getId() {
		return id;
	}

	public void setId( Integer id ) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName( String name ) {
		this.name = name;
	}
}
