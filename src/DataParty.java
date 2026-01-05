/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class DataParty {
    private String PartyName,Agent,Outstanding;
    public DataParty(String PartyName,String Outstanding,String Agent){
       this.PartyName=PartyName;
       this.Agent=Agent;
       this.Outstanding=Outstanding;
       


    }
    public String getname(){
        return PartyName;
    }
    public String getagent(){
        return Agent;
    }
    public String getoutstanding(){
        return Outstanding;
    }
    
}
