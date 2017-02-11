package com.altimetrik.cps.CardProcessing.api.service;

import com.altimetrik.cps.CardProcessing.model.Carddetails;

import com.altimetrik.cps.CardProcessing.exception.NotFoundException;
import java.util.List;
public interface CarddetailsApiService {
  
      List<Carddetails> findAllCarddetails()
      throws NotFoundException;
  
      Carddetails updateCarddetails(Carddetails carddetails)
      throws NotFoundException;
  
      Carddetails addCarddetails(Carddetails carddetails)
      throws NotFoundException;
  
      Carddetails findByIdCarddetails(String id)
      throws NotFoundException;
  
      void deleteCarddetails(String id)
      throws NotFoundException;
  
}
