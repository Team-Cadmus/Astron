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
public class PdfListTable {
     int sarees,parcels,srNumber;
     String design;

     public PdfListTable(int SrNumber, String Design,int sarees, int parcels) {
          this.srNumber = SrNumber;
          this.design = Design;
          this.sarees = sarees;
          this.parcels = parcels;
     }

     public int getSarees() {
          return sarees;
     }
     public int getParcels() {
          return parcels;
     }
     public int getSrNumber() {
          return srNumber;
     }
     public String getDesign() {
          return design;
     }

     public void setSarees(int sarees) {
          this.sarees = sarees;
     }

     public void setParcels(int parcels) {
          this.parcels = parcels;
     }

     public void setSrNumber(int srNumber) {
          this.srNumber = srNumber;
     }

     public void setDesign(String design) {
          this.design = design;
     }
     
}
