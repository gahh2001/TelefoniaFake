package br.com.telefoniaFake.DTO;

public class TelefoniaPadraoRemoveResultDTO {

	private String campaignId;
	private Integer totalRemovedLeads;
	private String error;

	public TelefoniaPadraoRemoveResultDTO( String campaignId,
			Integer totalRemovedLeads, String error ) {
		this.campaignId = campaignId;
		this.totalRemovedLeads = totalRemovedLeads;
		this.error = error;
	}

	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId( String campaignId ) {
		this.campaignId = campaignId;
	}

	public Integer getTotalRemovedLeads() {
		return totalRemovedLeads;
	}

	public void setTotalRemovedLeads( Integer totalRemovedLeads ) {
		this.totalRemovedLeads = totalRemovedLeads;
	}

	public String getError() {
		return error;
	}

	public void setError( String error ) {
		this.error = error;
	}
}