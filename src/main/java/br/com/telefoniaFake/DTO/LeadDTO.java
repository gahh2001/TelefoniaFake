package br.com.telefoniaFake.DTO;

import java.util.List;

public class LeadDTO {

	private Integer leadId;
	private List<String> phones;
	private Long contactDate;

	public Integer getLeadId() {
		return leadId;
	}
	public void setLeadId( Integer leadId ) {
		this.leadId = leadId;
	}
	public List< String > getPhones() {
		return phones;
	}
	public void setPhones( List< String > phones ) {
		this.phones = phones;
	}
	public Long getContactDate() {
		return contactDate;
	}
	public void setContactDate( Long contactDate ) {
		this.contactDate = contactDate;
	}

	
}
