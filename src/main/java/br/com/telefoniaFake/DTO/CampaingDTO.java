package br.com.telefoniaFake.DTO;

import java.util.List;

public class CampaingDTO {

	private String campaingId;
	private String apiKey;
	private List<LeadDTO> leads;

	public String getCampaingId() {
		return campaingId;
	}
	public void setCampaingId( String campaingId ) {
		this.campaingId = campaingId;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey( String apiKey ) {
		this.apiKey = apiKey;
	}
	public List< LeadDTO > getLeads() {
		return leads;
	}
	public void setLeads( List< LeadDTO > leads ) {
		this.leads = leads;
	}
}
