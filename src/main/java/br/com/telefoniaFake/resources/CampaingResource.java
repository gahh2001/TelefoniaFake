package br.com.telefoniaFake.resources;

import br.com.telefoniaFake.DTO.CampaingDTO;
import br.com.telefoniaFake.DTO.CampaingResultDTO;
import br.com.telefoniaFake.DTO.LimpezaCampanhaTelefoniaDTO;
import br.com.telefoniaFake.DTO.RemocaoTelefoniaDTO;
import br.com.telefoniaFake.DTO.TelefoniaPadraoRemoveResultDTO;
import br.com.telefoniaFake.business.LeadBusiness;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("discador")
public class CampaingResource {

	@Inject
	private LeadBusiness leadBusiness;

	@POST
	@Path( "/acao" )
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public CampaingResultDTO receiveMailing( CampaingDTO campaing ) {
		return this.leadBusiness.extractLeads( campaing );
	}

	@POST
	@Path( "/remove" )
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public TelefoniaPadraoRemoveResultDTO removeMailing( RemocaoTelefoniaDTO leadsToRemove ) {
		return this.leadBusiness.removeMailing( leadsToRemove );
	}

	@POST
	@Path( "/limpar-campanha" )
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public TelefoniaPadraoRemoveResultDTO cleanCampign( LimpezaCampanhaTelefoniaDTO campaign ) {
		return this.leadBusiness.cleanCampign( campaign );
	}

}