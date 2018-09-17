package com.douggschwind.examples.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.URI;

@RequestMapping(value=UsersResource.MY_BASE_URI)
public class UsersResource extends AbstractResource {

    protected static final String MY_BASE_URI = "/users";

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<URI> registerNewUser() {
        return generateCreatedResponse(MY_BASE_URI + "/123");
    }

}
