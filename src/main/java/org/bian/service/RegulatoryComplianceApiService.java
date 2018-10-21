/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface RegulatoryComplianceApiService {

	Assessment evaluate(RegulatoryCompliancesRecordAndEvaluateRequest request);
	
	RegulatoryCompliancesRecordResponse record(String crReferenceId, RegulatoryCompliancesRecordAndEvaluateRequest request);
	
	Advice requestPost(AdviceBase request);
	
	Advice requestPut(String crReferenceId, AdviceBase request);
	
	AssessmentWithAssociations retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
}
