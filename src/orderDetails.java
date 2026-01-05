/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class orderDetails {
    private String Date,SrNumber,Design,Quality,sarees,parcels,Agent_name,form_no,payment_days,rate,sareesParcels;
    public orderDetails(String Date,String SrNumber,String Design,String Quality,String sarees,String parcels,String Agent_name,String form_no,String payment_days,String rate,String sareesParcels){
        this.Date=Date;
        this.SrNumber=SrNumber;
        this.Design=Design;
        this.Quality=Quality;
        this.sarees=sarees;
        this.parcels=parcels;
        this.Agent_name=Agent_name;
        this.form_no=form_no;
        this.payment_days=payment_days;
        this.rate=rate;
        this.sareesParcels=sareesParcels;
        
        
    }
    public String getDate(){
        return Date;
    }
    public String getSrNo(){
        return SrNumber;
    }
    public String getDesign(){
        return Design;
    }
    public String getQuality(){
        return Quality;
    }
    public String getSarees(){
        return sarees;
    }
    public String getParcels(){
        return parcels;
    }
   public String getAgent(){
        return Agent_name;
    }
    public String getform(){
        return form_no;
    }
     public String getPayment(){
        return payment_days;
    }
      public String getRate(){
        return rate;
    }
      
   public String getSareesParcels(){
        return sareesParcels;
    }
 
    
}
