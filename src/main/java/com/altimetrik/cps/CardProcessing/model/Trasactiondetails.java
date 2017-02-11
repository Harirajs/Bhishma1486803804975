package com.altimetrik.cps.CardProcessing.model;



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
public class Trasactiondetails  {
  
  
   
  
  @Id
   private String id = null;
  
   
   private String cardId = null;
  
   
   private Double creditamount = null;
  
   
   private Double debitamout = null;
  
   
   private Boolean status = null;

  
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
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  
  /**
   * {}
   **/
  public Double getCreditamount() {
    return creditamount;
  }
  public void setCreditamount(Double creditamount) {
    this.creditamount = creditamount;
  }

  
  /**
   * {}
   **/
  public Double getDebitamout() {
    return debitamout;
  }
  public void setDebitamout(Double debitamout) {
    this.debitamout = debitamout;
  }

  
  /**
   * {}
   **/
  public Boolean getStatus() {
    return status;
  }
  public void setStatus(Boolean status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trasactiondetails trasactiondetails = (Trasactiondetails) o;
    return Objects.equals(id, trasactiondetails.id) &&
        Objects.equals(cardId, trasactiondetails.cardId) &&
        Objects.equals(creditamount, trasactiondetails.creditamount) &&
        Objects.equals(debitamout, trasactiondetails.debitamout) &&
        Objects.equals(status, trasactiondetails.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardId, creditamount, debitamout, status);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trasactiondetails {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  creditamount: ").append(creditamount).append("\n");
    sb.append("  debitamout: ").append(debitamout).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

