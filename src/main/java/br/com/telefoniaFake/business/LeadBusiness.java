package br.com.telefoniaFake.business;

import java.util.List;

import br.com.telefoniaFake.DTO.CampaingDTO;
import br.com.telefoniaFake.DTO.CampaingResultDTO;
import br.com.telefoniaFake.DTO.LeadDTO;
import br.com.telefoniaFake.DTO.LimpezaCampanhaTelefoniaDTO;
import br.com.telefoniaFake.DTO.RemocaoTelefoniaDTO;
import br.com.telefoniaFake.DTO.TelefoniaPadraoRemoveResultDTO;
import br.com.telefoniaFake.entity.Lead;
import br.com.telefoniaFake.repository.LeadRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class LeadBusiness {

	@Inject
	private LeadRepository leadRepository;
	
	public CampaingResultDTO extractLeads( CampaingDTO campaing ) {
		String error = null;
		if (campaing == null) {
			error = "Empty Body";
		}
		Integer totalPersisted = 0;
		if (  campaing != null) {
			List<LeadDTO> leads = campaing.getLeads();
			for (LeadDTO lead: leads) {
				Lead persisted = this.leadRepository.create(lead, campaing.getCampaignId());
				if (persisted != null) {
					totalPersisted++;
				}
			}
		}
		return new CampaingResultDTO(campaing.getCampaignId(), totalPersisted, error);
	}

	public TelefoniaPadraoRemoveResultDTO removeMailing( RemocaoTelefoniaDTO leadsToRemove ) {
		Integer totalRemoved = 0;
		for ( Integer leadId : leadsToRemove.getLeads() ) {
			this.leadRepository.remove( leadId, leadsToRemove.getCampaignId() );
			totalRemoved++;
		}
		return new TelefoniaPadraoRemoveResultDTO( leadsToRemove.getCampaignId(), totalRemoved, "" );
	}

	public TelefoniaPadraoRemoveResultDTO cleanCampign( LimpezaCampanhaTelefoniaDTO campaign ) {
		Long totalRemoved = 0L;
		totalRemoved = this.leadRepository.cleanCampaign( campaign.getCampaignId() );
		return new TelefoniaPadraoRemoveResultDTO( campaign.getCampaignId(), totalRemoved.intValue(), "");
	}
}
