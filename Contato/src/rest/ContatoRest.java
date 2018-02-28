package rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import entity.Contato;
import service.ContatoService;

@Path("/contato")
@Produces({ "application/json" })
public class ContatoRest {
	
	@Inject
	ContatoService contatoService;
	
	@GET
	@Path("/{idContato}")
	@Produces("application/json")
	public Contato retornarContato() {
		
		return contatoService.retornarContato();
	}

}
