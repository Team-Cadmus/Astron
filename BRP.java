/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
class BRP {
    private String RMS,GR,Mill,Total;
    private String Design;
    public BRP(String Design,String RMS,String GR,String Mill,String Total){
        this.Design=Design;
        this.RMS=RMS;
        this.GR=GR;
        this.Mill=Mill;
        this.Total=Total;
    }
    public String getdesign(){
        return Design;
    }
    public String getrms(){
        return RMS;
    }
    public String getgr(){
        return GR;
    }
    public String getmill(){
        return Mill;
    }
    public String gettotal(){
        return Total;
    }
}
