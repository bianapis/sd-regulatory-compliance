package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Advice
 */
public class Advice   {
  private String regulatoryAssessmentReference = null;

  private String regulatoryAdvisoryTaskReference = null;

  private String businessUnitEmployeeReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulatoryGuidelineRegulationReference = null;

  private Object regulatoryAdvisoryTaskRecord = null;

  private String documentReference = null;


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
   * @return regulatoryAdvisoryTaskReference
  **/

  public String getRegulatoryAdvisoryTaskReference() {
    return regulatoryAdvisoryTaskReference;
  }

  public void setRegulatoryAdvisoryTaskReference(String regulatoryAdvisoryTaskReference) {
    this.regulatoryAdvisoryTaskReference = regulatoryAdvisoryTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return businessUnitEmployeeReference
  **/

  public String getBusinessUnitEmployeeReference() {
    return businessUnitEmployeeReference;
  }

  public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
    this.businessUnitEmployeeReference = businessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return regulatoryGuidelineRegulationReference
  **/

  public String getRegulatoryGuidelineRegulationReference() {
    return regulatoryGuidelineRegulationReference;
  }

  public void setRegulatoryGuidelineRegulationReference(String regulatoryGuidelineRegulationReference) {
    this.regulatoryGuidelineRegulationReference = regulatoryGuidelineRegulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return regulatoryAdvisoryTaskRecord
  **/

  public Object getRegulatoryAdvisoryTaskRecord() {
    return regulatoryAdvisoryTaskRecord;
  }

  public void setRegulatoryAdvisoryTaskRecord(Object regulatoryAdvisoryTaskRecord) {
    this.regulatoryAdvisoryTaskRecord = regulatoryAdvisoryTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


}

