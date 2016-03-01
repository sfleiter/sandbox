package hello.jaxrs;

import org.springframework.stereotype.Component;

@Component
// @Path("/hello")
public class Endpoint {
// @GET
    public String message() {
        return "Hello";
    }
}