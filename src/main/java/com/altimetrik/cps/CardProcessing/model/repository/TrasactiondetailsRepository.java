package com.altimetrik.cps.CardProcessing.model.repository;

import com.altimetrik.cps.CardProcessing.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface TrasactiondetailsRepository extends JpaRepository<Trasactiondetails, String>{

}



