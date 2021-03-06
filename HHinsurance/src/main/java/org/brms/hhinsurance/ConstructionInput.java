package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ConstructionInput implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String structureType;
   private java.lang.Integer stories;
   private java.lang.String material;

   public ConstructionInput()
   {
   }

   public java.lang.String getStructureType()
   {
      return this.structureType;
   }

   public void setStructureType(java.lang.String structureType)
   {
      this.structureType = structureType;
   }

   public java.lang.Integer getStories()
   {
      return this.stories;
   }

   public void setStories(java.lang.Integer stories)
   {
      this.stories = stories;
   }

   public java.lang.String getMaterial()
   {
      return this.material;
   }

   public void setMaterial(java.lang.String material)
   {
      this.material = material;
   }

   public ConstructionInput(java.lang.String structureType,
         java.lang.Integer stories, java.lang.String material)
   {
      this.structureType = structureType;
      this.stories = stories;
      this.material = material;
   }

}