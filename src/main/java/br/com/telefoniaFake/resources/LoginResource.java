package br.com.telefoniaFake.resources;

import br.com.telefoniaFake.DTO.LoginDTO;
import br.com.telefoniaFake.DTO.LoginResultDTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/discador/login")
public class LoginResource {

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public LoginResultDTO login(LoginDTO login) {
		return new LoginResultDTO("CHAVEMUITOBOACONFIA", "", 1, "Teste da Silva");
	}
}