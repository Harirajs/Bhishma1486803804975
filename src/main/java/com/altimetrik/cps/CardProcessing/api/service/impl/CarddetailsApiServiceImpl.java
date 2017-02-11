package com.altimetrik.cps.CardProcessing.api.service.impl;

import com.altimetrik.cps.CardProcessing.api.service.*;
import com.altimetrik.cps.CardProcessing.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.cps.CardProcessing.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.cps.CardProcessing.model.Carddetails;

import java.util.List;
import com.altimetrik.cps.CardProcessing.exception.NotFoundException;

@Service
public class CarddetailsApiServiceImpl implements CarddetailsApiService {
  	  @Autowired
  	  private CarddetailsRepository carddetailsRepository ;
  	  
  
  
      @Override
      public List<Carddetails> findAllCarddetails()
      throws NotFoundException {
      
        
  		
  		
  			return carddetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Carddetails updateCarddetails(Carddetails carddetails)
      throws NotFoundException {
      
         
        	return carddetailsRepository.save(carddetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Carddetails addCarddetails(Carddetails carddetails)
      throws NotFoundException {
      
         
        	return carddetailsRepository.save(carddetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Carddetails findByIdCarddetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return carddetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteCarddetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  carddetailsRepository.delete(id);
  		
  		
  		
  }
  
}
