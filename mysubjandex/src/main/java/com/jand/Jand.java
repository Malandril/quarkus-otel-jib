package com.jand;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/jand")
public class Jand {
    @GET
    public String jand() {
        return "JANDEX!!";
    }
}
