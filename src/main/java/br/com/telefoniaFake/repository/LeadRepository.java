package br.com.telefoniaFake.repository;

import br.com.telefoniaFake.DTO.LeadDTO;
import br.com.telefoniaFake.entity.Lead;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LeadRepository implements PanacheRepository<Lead> {
	
	@Transactional
	public Lead create(LeadDTO leadDTO) {
		Lead lead = new Lead(leadDTO.getLeadId(), leadDTO.getPhones().toString(), leadDTO.getContactDate());
		persist(lead);
		return lead;
	}
}
