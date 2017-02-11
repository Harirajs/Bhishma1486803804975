package com.altimetrik.cps.CardProcessing.api.service;

import com.altimetrik.cps.CardProcessing.model.Trasactiondetails;

import com.altimetrik.cps.CardProcessing.exception.NotFoundException;
import java.util.List;
public interface TrasactiondetailsApiService {
  
      List<Trasactiondetails> findAllTrasactiondetails()
      throws NotFoundException;
  
      Trasactiondetails updateTrasactiondetails(Trasactiondetails trasactiondetails)
      throws NotFoundException;
  
      Trasactiondetails addTrasactiondetails(Trasactiondetails trasactiondetails)
      throws NotFoundException;
  
      Trasactiondetails findByIdTrasactiondetails(String id)
      throws NotFoundException;
  
      void deleteTrasactiondetails(String id)
      throws NotFoundException;
  
}
