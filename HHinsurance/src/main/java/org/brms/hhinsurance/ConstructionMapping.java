package org.brms.hhinsurance;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class ConstructionMapping implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String constructionOption;
   private java.lang.Integer stories;
   private java.lang.String constructionMaterial;
   private java.lang.String structureType;
   private java.lang.String roofShape;

   public ConstructionMapping()
   {
   }

   public java.lang.String getConstructionOption()
   {
      return this.constructionOption;
   }

   public void setConstructionOption(java.lang.String constructionOption)
   {
      this.constructionOption = constructionOption;
   }

   public java.lang.Integer getStories()
   {
      return this.stories;
   }

   public void setStories(java.lang.Integer stories)
   {
      this.stories = stories;
   }

   public java.lang.String getConstructionMaterial()
   {
      return this.constructionMaterial;
   }

   public void setConstructionMaterial(java.lang.String constructionMaterial)
   {
      this.constructionMaterial = constructionMaterial;
   }

   public java.lang.String getStructureType()
   {
      return this.structureType;
   }

   public void setStructureType(java.lang.String structureType)
   {
      this.structureType = structureType;
   }

   public java.lang.String getRoofShape()
   {
      return this.roofShape;
   }

   public void setRoofShape(java.lang.String roofShape)
   {
      this.roofShape = roofShape;
   }

   public ConstructionMapping(java.lang.String constructionOption,
         java.lang.Integer stories, java.lang.String constructionMaterial,
         java.lang.String structureType, java.lang.String roofShape)
   {
      this.constructionOption = constructionOption;
      this.stories = stories;
      this.constructionMaterial = constructionMaterial;
      this.structureType = structureType;
      this.roofShape = roofShape;
   }

}