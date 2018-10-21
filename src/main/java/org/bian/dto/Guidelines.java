package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Guidelines
 */
public class Guidelines   {
  private String regulatoryAssessmentReference = null;

  private String regulatoryTestReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulatoryAuthorityJurisdiction = null;

  private String regulatoryGuidelineReference = null;

  private String regulatoryGuidelineType = null;

  private Object regulatoryGuidelineRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return regulatoryAssessmentReference
  **/

  public String getRegulatoryAssessmentReference() {
    return regulatoryAssessmentReference;
  }

  public void setRegulatoryAssessmentReference(String regulatoryAssessmentReference) {
    this.regulatoryAssessmentReference = regulatoryAssessmentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return regulatoryTestReference
  **/

  public String getRegulatoryTestReference() {
    return regulatoryTestReference;
  }

  public void setRegulatoryTestReference(String regulatoryTestReference) {
    this.regulatoryTestReference = regulatoryTestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return regulatoryAuthorityReference
  **/

  public String getRegulatoryAuthorityReference() {
    return regulatoryAuthorityReference;
  }

  public void setRegulatoryAuthorityReference(String regulatoryAuthorityReference) {
    this.regulatoryAuthorityReference = regulatoryAuthorityReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Name     
   * @return regulatoryAuthorityJurisdiction
  **/

  public String getRegulatoryAuthorityJurisdiction() {
    return regulatoryAuthorityJurisdiction;
  }

  public void setRegulatoryAuthorityJurisdiction(String regulatoryAuthorityJurisdiction) {
    this.regulatoryAuthorityJurisdiction = regulatoryAuthorityJurisdiction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return regulatoryGuidelineReference
  **/

  public String getRegulatoryGuidelineReference() {
    return regulatoryGuidelineReference;
  }

  public void setRegulatoryGuidelineReference(String regulatoryGuidelineReference) {
    this.regulatoryGuidelineReference = regulatoryGuidelineReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference:  BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator     
   * @return regulatoryGuidelineType
  **/

  public String getRegulatoryGuidelineType() {
    return regulatoryGuidelineType;
  }

  public void setRegulatoryGuidelineType(String regulatoryGuidelineType) {
    this.regulatoryGuidelineType = regulatoryGuidelineType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return regulatoryGuidelineRecord
  **/

  public Object getRegulatoryGuidelineRecord() {
    return regulatoryGuidelineRecord;
  }

  public void setRegulatoryGuidelineRecord(Object regulatoryGuidelineRecord) {
    this.regulatoryGuidelineRecord = regulatoryGuidelineRecord;
  }


}

