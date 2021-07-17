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
class PdfListTable {
     int sarees,parcels,SrNumber;
     String Design;

     public PdfListTable( int SrNumber, String Design,int sarees, int parcels) {
          this.SrNumber = SrNumber;
          this.Design = Design;
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
          return SrNumber;
     }
     public String getDesign() {
          return Design;
     }
}
