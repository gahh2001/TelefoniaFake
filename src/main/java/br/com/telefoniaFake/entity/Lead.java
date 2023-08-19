package br.com.telefoniaFake.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Lead extends PanacheEntity {

	private Integer leadId;
	private String phones;
	private Long contactDate;

	public Lead() {
	}

	public Lead( Integer leadId, String phones, Long contactDate ) {
		this.leadId = leadId;
		this.phones = phones;
		this.contactDate = contactDate;
	}

	public Integer getLeadId() {
		return leadId;
	}
	public void setLeadId( Integer leadId ) {
		this.leadId = leadId;
	}
	public String getPhones() {
		return phones;
	}
	public void setPhones( String phones ) {
		this.phones = phones;
	}
	public Long getContactDate() {
		return contactDate;
	}
	public void setContactDate( Long contactDate ) {
		this.contactDate = contactDate;
	}
	

}
