package com.altimetrik.cps.CardProcessing.api;

import com.altimetrik.cps.CardProcessing.model.*;

import com.altimetrik.cps.CardProcessing.api.service.TrasactiondetailsApiService;

import com.altimetrik.cps.CardProcessing.exception.NotFoundException;

import com.altimetrik.cps.CardProcessing.model.Trasactiondetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/trasactiondetails", produces = {APPLICATION_JSON_VALUE})
public class TrasactiondetailsApi {

   @Autowired
   private TrasactiondetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Trasactiondetails>> findAllTrasactiondetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Trasactiondetails>>(service.findAllTrasactiondetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Trasactiondetails> updateTrasactiondetails(@RequestBody Trasactiondetails trasactiondetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trasactiondetails>(service.updateTrasactiondetails(trasactiondetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Trasactiondetails> addTrasactiondetails(@RequestBody Trasactiondetails trasactiondetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trasactiondetails>(service.addTrasactiondetails(trasactiondetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Trasactiondetails> findByIdTrasactiondetails(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Trasactiondetails>(service.findByIdTrasactiondetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteTrasactiondetails(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteTrasactiondetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
