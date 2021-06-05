/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class DataColl {
    private String OrderDate,BillNumber,Days,Amount,RecievedDate,RecievedAmount,ExcessDays,GRNumber,GRDate,GRAmount,DateDecided;
    public DataColl(String OrderDate,String BillNumber,String Days,String Amount,String RecievedDate,String RecievedAmount,String ExcessDays,String GRNumber,String GRDate,String GRAmount,String DateDecided){
        
        //this.PartyName=PartyName;
        this.OrderDate=OrderDate;
        this.BillNumber=BillNumber;
        this.Days=Days;
        this.Amount=Amount;
        this.RecievedDate=RecievedDate;
        this.RecievedAmount=RecievedAmount;
        this.ExcessDays=ExcessDays;
        this.GRNumber=GRNumber;
        this.GRDate=GRDate;
        this.GRAmount=GRAmount;
        this.DateDecided=DateDecided;   
    }
    /*public String getPartyName(){
        return PartyName;
    }*/
    
    public String getOrderDate(){
        return OrderDate;
    }
    public String getBillNumber(){
        return BillNumber;
    }
    public String getDays(){
        return Days;
    }
    public String getAmount(){
        return Amount;
    }
    public String getRecdDate(){
        return RecievedDate;
    }
    public String getRecdAmt(){
        return RecievedAmount;
    }
    public String xsDays(){
        return ExcessDays;
    }
    public String getGRNumber(){
        return GRNumber;
    }
    public String getGRDate(){
        return GRDate;
    }
    public String getGRAmount(){
        return GRAmount;
    }
    public String getDateDecided(){
        return DateDecided;
    }
    
}
