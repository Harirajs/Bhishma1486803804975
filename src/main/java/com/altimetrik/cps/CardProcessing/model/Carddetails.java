package com.altimetrik.cps.CardProcessing.model;

import java.util.Date;


import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;




@Entity
public class Carddetails  {
  
  
   
  
  @Id
   private String id = null;
  
   
   private String cardnumber = null;
  
   
   private Integer cvvCvc = null;
  
   
   private String type = null;
  
   
   private Date validfrom = null;
  
   
   private Date validto = null;

  
  /**
   * {"primaryKey":true}
   **/
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getCardnumber() {
    return cardnumber;
  }
  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }

  
  /**
   * {}
   **/
  public Integer getCvvCvc() {
    return cvvCvc;
  }
  public void setCvvCvc(Integer cvvCvc) {
    this.cvvCvc = cvvCvc;
  }

  
  /**
   * {}
   **/
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * {}
   **/
  public Date getValidfrom() {
    return validfrom;
  }
  public void setValidfrom(Date validfrom) {
    this.validfrom = validfrom;
  }

  
  /**
   * {}
   **/
  public Date getValidto() {
    return validto;
  }
  public void setValidto(Date validto) {
    this.validto = validto;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carddetails carddetails = (Carddetails) o;
    return Objects.equals(id, carddetails.id) &&
        Objects.equals(cardnumber, carddetails.cardnumber) &&
        Objects.equals(cvvCvc, carddetails.cvvCvc) &&
        Objects.equals(type, carddetails.type) &&
        Objects.equals(validfrom, carddetails.validfrom) &&
        Objects.equals(validto, carddetails.validto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardnumber, cvvCvc, type, validfrom, validto);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carddetails {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  cardnumber: ").append(cardnumber).append("\n");
    sb.append("  cvvCvc: ").append(cvvCvc).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  validfrom: ").append(validfrom).append("\n");
    sb.append("  validto: ").append(validto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

