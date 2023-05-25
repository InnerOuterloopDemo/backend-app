package org.backend;

import org.jboss.logging.Logger;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/backend")
public class BackendResource {

    private static final Logger LOG = Logger.getLogger(BackendResource.class);

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        LOG.info("Backend Called!");
        return "Doing great!!";
    }
}
