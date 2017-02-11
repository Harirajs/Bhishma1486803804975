package com.altimetrik.cps.CardProcessing.api;

import com.altimetrik.cps.CardProcessing.model.*;

import com.altimetrik.cps.CardProcessing.api.service.CarddetailsApiService;

import com.altimetrik.cps.CardProcessing.exception.NotFoundException;

import com.altimetrik.cps.CardProcessing.model.Carddetails;

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
@RequestMapping(value = "/carddetails", produces = {APPLICATION_JSON_VALUE})
public class CarddetailsApi {

   @Autowired
   private CarddetailsApiService service;
  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Carddetails>> findAllCarddetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Carddetails>>(service.findAllCarddetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Carddetails> updateCarddetails(@RequestBody Carddetails carddetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Carddetails>(service.updateCarddetails(carddetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Carddetails> addCarddetails(@RequestBody Carddetails carddetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Carddetails>(service.addCarddetails(carddetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Carddetails> findByIdCarddetails(@PathVariable("id") String id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Carddetails>(service.findByIdCarddetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteCarddetails(@PathVariable("id") String id
)
      throws NotFoundException {
        
       	  service.deleteCarddetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}
