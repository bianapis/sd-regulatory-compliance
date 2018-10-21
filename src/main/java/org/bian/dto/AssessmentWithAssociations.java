package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.Advice;
import org.bian.dto.Guidelines;
import org.bian.dto.Tests;

import javax.validation.Valid;
  
/**
 * AssessmentWithAssociations
 */
public class AssessmentWithAssociations   {
  private String regulatoryAssessmentReference = null;

  private String businessUnitReference = null;

  private String productServiceReference = null;

  private String customerReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulationReference = null;

  private Object regulatoryAssessmentTaskRecord = null;

  private String regulatoryAssessmentResult = null;

  private String documentReference = null;

  private Tests tests = null;

  private Guidelines guidelines = null;

  private Advice advices = null;


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
   * @return businessUnitReference
  **/

  public String getBusinessUnitReference() {
    return businessUnitReference;
  }

  public void setBusinessUnitReference(String businessUnitReference) {
    this.businessUnitReference = businessUnitReference;
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
   * @return regulationReference
  **/

  public String getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(String regulationReference) {
    this.regulationReference = regulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary       
   * @return regulatoryAssessmentTaskRecord
  **/

  public Object getRegulatoryAssessmentTaskRecord() {
    return regulatoryAssessmentTaskRecord;
  }

  public void setRegulatoryAssessmentTaskRecord(Object regulatoryAssessmentTaskRecord) {
    this.regulatoryAssessmentTaskRecord = regulatoryAssessmentTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference:  BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator     
   * @return regulatoryAssessmentResult
  **/

  public String getRegulatoryAssessmentResult() {
    return regulatoryAssessmentResult;
  }

  public void setRegulatoryAssessmentResult(String regulatoryAssessmentResult) {
    this.regulatoryAssessmentResult = regulatoryAssessmentResult;
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


  /**
   * Get tests
   * @return tests
  **/

  public Tests getTests() {
    return tests;
  }

  public void setTests(Tests tests) {
    this.tests = tests;
  }


  /**
   * Get guidelines
   * @return guidelines
  **/

  public Guidelines getGuidelines() {
    return guidelines;
  }

  public void setGuidelines(Guidelines guidelines) {
    this.guidelines = guidelines;
  }


  /**
   * Get advices
   * @return advices
  **/

  public Advice getAdvices() {
    return advices;
  }

  public void setAdvices(Advice advices) {
    this.advices = advices;
  }


}

