package br.com.telefoniaFake.DTO;

import java.util.List;

public class CampaingDTO {

	private String campaignId;
	private String apiKey;
	private List<LeadDTO> leads;

	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId( String campaingId ) {
		this.campaignId = campaingId;
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
