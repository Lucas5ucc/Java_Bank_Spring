package org.academiadecodigo.javabank.restController;

import org.academiadecodigo.javabank.controller.CustomerController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class costumerRestController{

    @RequestMapping(
            method = RequestMethod.GET,
            value = "api/list",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public ResponseEntity<List>listCustomers(@RequestParam(value ="list",defaultValue = "customer")List list) {

        CustomerController customerController = new CustomerController();
        return new ResponseEntity<>(customerController.listCustomers ), HttpStatus.OK);
    }
    }


