package br.com.telefoniaFake.DTO;

public class CampaingResultDTO {
	
	private String campaingId;
	private Integer totalIntegratedLeads;
	private String error;

	public CampaingResultDTO( String campaingId, Integer totalIntegratedLeads,
			String error ) {
		this.campaingId = campaingId;
		this.totalIntegratedLeads = totalIntegratedLeads;
		this.error = error;
	}

	public String getCampaingId() {
		return campaingId;
	}

	public void setCampaingId( String campaingId ) {
		this.campaingId = campaingId;
	}

	public Integer getTotalIntegratedLeads() {
		return totalIntegratedLeads;
	}

	public void setTotalIntegratedLeads( Integer totalIntegratedLeads ) {
		this.totalIntegratedLeads = totalIntegratedLeads;
	}

	public String getError() {
		return error;
	}

	public void setError( String error ) {
		this.error = error;
	}
}
