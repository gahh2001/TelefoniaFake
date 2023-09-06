package br.com.telefoniaFake.DTO;

import java.util.List;

public class CampaingResultDTO {
	
	private String campaignId;
	private Integer totalIntegratedLeads;
	private String error;
	private List< Integer > errorLeads;

	public CampaingResultDTO( String campaingId, Integer totalIntegratedLeads,
			String error, List< Integer > leadsNaoIntegrados ) {
		this.campaignId = campaingId;
		this.totalIntegratedLeads = totalIntegratedLeads;
		this.error = error;
		this.errorLeads = leadsNaoIntegrados;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId( String campaingId ) {
		this.campaignId = campaingId;
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

	public List< Integer > getErrorLeads() {
		return errorLeads;
	}

	public void setErrorLeads( List< Integer > leadsNaoIntegrados ) {
		this.errorLeads = leadsNaoIntegrados;
	}
}