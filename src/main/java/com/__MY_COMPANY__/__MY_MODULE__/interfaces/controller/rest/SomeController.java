package com.__MY_COMPANY__.__MY_MODULE__.interfaces.controller.rest;


import com.__MY_COMPANY__.__MY_MODULE__.exception.SomeException;
import com.__MY_COMPANY__.__MY_MODULE__.interfaces.facade.SomeServiceFacade;
import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@RestController
public class SomeController {

    private static final Logger LOG = LoggerFactory.getLogger(SomeController.class);

    @Autowired
    SomeServiceFacade someServiceFacade;

    @RequestMapping(value = "apipathhere", method = { POST })
    public void multiCctResultsProcessing(@RequestBody JsonNode results)
            throws SomeException {
        LOG.error("Ohhhhhhh");
        someServiceFacade.someServiceMethod(null);
    }
}
