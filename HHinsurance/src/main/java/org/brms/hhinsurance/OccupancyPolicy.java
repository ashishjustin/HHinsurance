package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OccupancyPolicy implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String occupancyType;
   private java.lang.String alarmType;
   private java.lang.String securedGatedCommunity;

   public OccupancyPolicy()
   {
   }

   public java.lang.String getOccupancyType()
   {
      return this.occupancyType;
   }

   public void setOccupancyType(java.lang.String occupancyType)
   {
      this.occupancyType = occupancyType;
   }

   public java.lang.String getAlarmType()
   {
      return this.alarmType;
   }

   public void setAlarmType(java.lang.String alarmType)
   {
      this.alarmType = alarmType;
   }

   public java.lang.String getSecuredGatedCommunity()
   {
      return this.securedGatedCommunity;
   }

   public void setSecuredGatedCommunity(java.lang.String securedGatedCommunity)
   {
      this.securedGatedCommunity = securedGatedCommunity;
   }

   public OccupancyPolicy(java.lang.String occupancyType,
         java.lang.String alarmType, java.lang.String securedGatedCommunity)
   {
      this.occupancyType = occupancyType;
      this.alarmType = alarmType;
      this.securedGatedCommunity = securedGatedCommunity;
   }

}