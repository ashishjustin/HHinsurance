package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Safety implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String alarm;

   private java.lang.String securedCommunity;

   public Safety()
   {
   }

   public java.lang.String getAlarm()
   {
      return this.alarm;
   }

   public void setAlarm(java.lang.String alarm)
   {
      this.alarm = alarm;
   }

   public java.lang.String getSecuredCommunity()
   {
      return this.securedCommunity;
   }

   public void setSecuredCommunity(java.lang.String securedCommunity)
   {
      this.securedCommunity = securedCommunity;
   }

   public Safety(java.lang.String alarm, java.lang.String securedCommunity)
   {
      this.alarm = alarm;
      this.securedCommunity = securedCommunity;
   }

}