package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FrontlineFloodPolicyMapping implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String floodType;

   private java.lang.Boolean floodPolicy;

   public FrontlineFloodPolicyMapping()
   {
   }

   public java.lang.String getFloodType()
   {
      return this.floodType;
   }

   public void setFloodType(java.lang.String floodType)
   {
      this.floodType = floodType;
   }

   public java.lang.Boolean getFloodPolicy()
   {
      return this.floodPolicy;
   }

   public void setFloodPolicy(java.lang.Boolean floodPolicy)
   {
      this.floodPolicy = floodPolicy;
   }

   public FrontlineFloodPolicyMapping(java.lang.String floodType,
         java.lang.Boolean floodPolicy)
   {
      this.floodType = floodType;
      this.floodPolicy = floodPolicy;
   }

}
