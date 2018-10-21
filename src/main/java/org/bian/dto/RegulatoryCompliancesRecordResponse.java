package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RegulatoryCompliancesRecordResponse
 */
public class RegulatoryCompliancesRecordResponse   {
  private Object regulatoryAssessmentResult = null;

  private String recordingRecordReference = null;

  private String recordingRecordStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference:  BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator     
   * @return regulatoryAssessmentResult
  **/

  public Object getRegulatoryAssessmentResult() {
    return regulatoryAssessmentResult;
  }

  public void setRegulatoryAssessmentResult(Object regulatoryAssessmentResult) {
    this.regulatoryAssessmentResult = regulatoryAssessmentResult;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return recordingRecordReference
  **/

  public String getRecordingRecordReference() {
    return recordingRecordReference;
  }

  public void setRecordingRecordReference(String recordingRecordReference) {
    this.recordingRecordReference = recordingRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference:  BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator     
   * @return recordingRecordStatus
  **/

  public String getRecordingRecordStatus() {
    return recordingRecordStatus;
  }

  public void setRecordingRecordStatus(String recordingRecordStatus) {
    this.recordingRecordStatus = recordingRecordStatus;
  }


}

