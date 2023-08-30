package br.com.telefoniaFake.DTO;

import java.util.List;

public class RemocaoTelefoniaDTO {

	private String campaignId;
	private List< Integer > leads;
	private String apiKey;

	public String getCampaignId() {
		return campaignId;
	}
	public void setCampaignId( String campaignId ) {
		this.campaignId = campaignId;
	}
	public List< Integer > getLeads() {
		return leads;
	}
	public void setLeads( List< Integer > leads ) {
		this.leads = leads;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey( String apiKey ) {
		this.apiKey = apiKey;
	}
}