package org.acme.quickstart;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;


@Path("/hello")
public class GreetingResource {

    
    /* 
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello world";
    }
    */

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public CompletionStage<String> hello() {
        return CompletableFuture.supplyAsync(() -> {
            return "hellO";
        });
    }
}
