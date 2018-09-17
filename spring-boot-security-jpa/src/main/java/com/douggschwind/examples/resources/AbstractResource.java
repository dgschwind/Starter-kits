package com.douggschwind.examples.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

public abstract class AbstractResource {

    protected final ResponseEntity<URI> generateCreatedResponse(String uriOfNewlyCreatedResource) {
        return ResponseEntity.created(URI.create(uriOfNewlyCreatedResource)).build();
    }

}
