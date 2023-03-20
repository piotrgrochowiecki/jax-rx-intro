package com.dxc.piotrgrochowiecki.jaxrxintro;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello-world")
public class HelloResource {

    @Path("/guest/{guest}/salute")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response salute(SalutationRequest request, @PathParam("guest") String guest) {
        SalutationResponse response = new SalutationResponse();

        response.getSalutationResponse("Hello, " + request.getSalutation() + " " + guest);
        Response responseWrapper = Response.ok(response).build();

        return responseWrapper;

    }
}