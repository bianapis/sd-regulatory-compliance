package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * Tests
 */
public class Tests   {
  private String regulatoryAssessmentReference = null;

  private String regulatoryTestReference = null;

  private String regulatoryAuthorityReference = null;

  private String regulatoryAuthorityJurisdiction = null;

  private String regulationReference = null;

  private String regulationDefinition = null;

  private String regulationComplianceReportingRequirements = null;

  private String regulationAccountability = null;

  private String regulationPenalties = null;


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
   * @return regulationReference
  **/

  public String getRegulationReference() {
    return regulationReference;
  }

  public void setRegulationReference(String regulationReference) {
    this.regulationReference = regulationReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return regulationDefinition
  **/

  public String getRegulationDefinition() {
    return regulationDefinition;
  }

  public void setRegulationDefinition(String regulationDefinition) {
    this.regulationDefinition = regulationDefinition;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration     
   * @return regulationComplianceReportingRequirements
  **/

  public String getRegulationComplianceReportingRequirements() {
    return regulationComplianceReportingRequirements;
  }

  public void setRegulationComplianceReportingRequirements(String regulationComplianceReportingRequirements) {
    this.regulationComplianceReportingRequirements = regulationComplianceReportingRequirements;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Name     
   * @return regulationAccountability
  **/

  public String getRegulationAccountability() {
    return regulationAccountability;
  }

  public void setRegulationAccountability(String regulationAccountability) {
    this.regulationAccountability = regulationAccountability;
  }


  /**
   * `status: Not Mapped` core-data-type-reference:  BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator     
   * @return regulationPenalties
  **/

  public String getRegulationPenalties() {
    return regulationPenalties;
  }

  public void setRegulationPenalties(String regulationPenalties) {
    this.regulationPenalties = regulationPenalties;
  }


}

