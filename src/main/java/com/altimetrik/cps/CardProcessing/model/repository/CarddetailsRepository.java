package com.altimetrik.cps.CardProcessing.model.repository;

import com.altimetrik.cps.CardProcessing.model.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface CarddetailsRepository extends JpaRepository<Carddetails, String>{

}



