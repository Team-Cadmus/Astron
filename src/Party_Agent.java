/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saree.application.gui;

/**
 *
 * @author Hii
 */
public class Party_Agent {
    private String sr_no,party_name,agent_name,outstanding_amount;
    public Party_Agent(String party_name, String agent_name, String outstanding_amount) {
        this.party_name = party_name;
        this.agent_name = agent_name;
        this.outstanding_amount = outstanding_amount;
    }
    /*
    public String getSr_no() {
        return sr_no;
    }
    */
    public String getParty_name() {
        return party_name;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public String getOutstanding_amount() {
        return outstanding_amount;
    }    
}
