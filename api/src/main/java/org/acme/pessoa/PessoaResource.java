package org.acme.pessoa;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.acme.pessoa.dto.PessoaDTO;

@Path("/pessoa")
@RequestScoped
public class PessoaResource {

    @Inject
    PessoaService pessoaService;

    @POST
    @Path("/criar")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createPessoa(PessoaDTO pessoa) {
        try {
            this.pessoaService.criar(pessoa);
        } catch (Exception e) {
            return Response.serverError().status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
        return Response.ok().status(Response.Status.OK).build();
    }

}
