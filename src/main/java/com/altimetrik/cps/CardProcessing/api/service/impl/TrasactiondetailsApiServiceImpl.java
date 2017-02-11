package com.altimetrik.cps.CardProcessing.api.service.impl;

import com.altimetrik.cps.CardProcessing.api.service.*;
import com.altimetrik.cps.CardProcessing.model.*;
import org.springframework.stereotype.Service;
import com.altimetrik.cps.CardProcessing.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import com.altimetrik.cps.CardProcessing.model.Trasactiondetails;

import java.util.List;
import com.altimetrik.cps.CardProcessing.exception.NotFoundException;

@Service
public class TrasactiondetailsApiServiceImpl implements TrasactiondetailsApiService {
  	  @Autowired
  	  private TrasactiondetailsRepository trasactiondetailsRepository ;
  	  
  
  
      @Override
      public List<Trasactiondetails> findAllTrasactiondetails()
      throws NotFoundException {
      
        
  		
  		
  			return trasactiondetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Trasactiondetails updateTrasactiondetails(Trasactiondetails trasactiondetails)
      throws NotFoundException {
      
         
        	return trasactiondetailsRepository.save(trasactiondetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Trasactiondetails addTrasactiondetails(Trasactiondetails trasactiondetails)
      throws NotFoundException {
      
         
        	return trasactiondetailsRepository.save(trasactiondetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Trasactiondetails findByIdTrasactiondetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return trasactiondetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteTrasactiondetails(String id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  trasactiondetailsRepository.delete(id);
  		
  		
  		
  }
  
}
