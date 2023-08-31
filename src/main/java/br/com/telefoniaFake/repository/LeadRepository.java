package br.com.telefoniaFake.repository;

import br.com.telefoniaFake.DTO.LeadDTO;
import br.com.telefoniaFake.entity.Lead;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LeadRepository implements PanacheRepository<Lead> {
	
	@Transactional
	public Lead create(LeadDTO leadDTO, String campaignId ) {
		Lead lead = new Lead(leadDTO.getLeadId(), campaignId,
				leadDTO.getPhones().toString(), leadDTO.getContactDate());
		persist(lead);
		return lead;
	}

	@Transactional
	public void remove( Integer leadId, String campaignId ) {
		delete( "delete from Lead l where l.leadId = ?1 and l.campaignId = ?2", leadId, campaignId );
	}

	@Transactional
	public Long cleanCampaign( String campaignCode ) {
		Long teste = 0L;
		teste =  delete( "delete from Lead l where l.campaignId = ?1", campaignCode );
		return teste;
	}
}