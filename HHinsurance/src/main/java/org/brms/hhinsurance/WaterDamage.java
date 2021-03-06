package org.brms.hhinsurance;

import java.util.Calendar;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class WaterDamage implements java.io.Serializable
{

   Calendar now = Calendar.getInstance();
   public int year = now.get(Calendar.YEAR);
   static final long serialVersionUID = 1L;

   private java.lang.Integer yearBuilt;
   private java.lang.String carrier;

   public WaterDamage()
   {
   }

   public java.lang.Integer getYearBuilt()
   {
      return this.yearBuilt;
   }

   public void setYearBuilt(java.lang.Integer yearBuilt)
   {
      this.yearBuilt = yearBuilt;
   }

   public java.lang.String getCarrier()
   {
      return this.carrier;
   }

   public void setCarrier(java.lang.String carrier)
   {
      this.carrier = carrier;
   }

   public WaterDamage(java.util.Calendar now, int year,
         java.lang.Integer yearBuilt, java.lang.String carrier)
   {
      this.now = now;
      this.year = year;
      this.yearBuilt = yearBuilt;
      this.carrier = carrier;
   }

}