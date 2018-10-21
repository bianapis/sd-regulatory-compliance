/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class RegulatoryComplianceApiServiceImpl implements RegulatoryComplianceApiService {

	public Assessment evaluate(RegulatoryCompliancesRecordAndEvaluateRequest request){
		return JsonReader.read("evaluate-Assessment.json",new TypeReference<Assessment>(){});
	}
	
	public RegulatoryCompliancesRecordResponse record(String crReferenceId, RegulatoryCompliancesRecordAndEvaluateRequest request){
		return JsonReader.read("record-RegulatoryCompliancesRecordResponse.json",new TypeReference<RegulatoryCompliancesRecordResponse>(){});
	}
	
	public Advice requestPost(AdviceBase request){
		return JsonReader.read("requestPost-Advice.json",new TypeReference<Advice>(){});
	}
	
	public Advice requestPut(String crReferenceId, AdviceBase request){
		return JsonReader.read("requestPut-Advice.json",new TypeReference<Advice>(){});
	}
	
	public AssessmentWithAssociations retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AssessmentWithAssociations.json",new TypeReference<AssessmentWithAssociations>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
}
