package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class SSRoofGeometry implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String roofShape;

   private java.lang.String roofPercent;

   public SSRoofGeometry()
   {
   }

   public java.lang.String getRoofShape()
   {
      return this.roofShape;
   }

   public void setRoofShape(java.lang.String roofShape)
   {
      this.roofShape = roofShape;
   }

   public java.lang.String getRoofPercent()
   {
      return this.roofPercent;
   }

   public void setRoofPercent(java.lang.String roofPercent)
   {
      this.roofPercent = roofPercent;
   }

   public SSRoofGeometry(java.lang.String roofShape, java.lang.String roofPercent)
   {
      this.roofShape = roofShape;
      this.roofPercent = roofPercent;
   }

}