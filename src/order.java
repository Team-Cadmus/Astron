/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class order {
    private String Date,SrNumber,Design,Quality,sarees,parcels;
    public order(String Date,String SrNumber,String Design,String Quality,String sarees,String parcels){
        this.Date=Date;
        this.SrNumber=SrNumber;
        this.Design=Design;
        this.Quality=Quality;
        this.sarees=sarees;
        this.parcels=parcels;
        
        
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
  
}
