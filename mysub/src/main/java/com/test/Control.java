package com.test;

import io.opentelemetry.api.trace.Span;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/control")
public class Control {

    @GET
    public String waow() {

        return "WAOW " + Span.current().getSpanContext().getTraceId();
    }
}
