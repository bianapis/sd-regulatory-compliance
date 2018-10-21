/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Assess;

@BianRestController
public class RegulatoryComplianceApiController {

	@Autowired
	RegulatoryComplianceApiService service;
	
	@Assess.Evaluate
	public BianResponse<Assessment> evaluate(@RequestBody BianRequest<RegulatoryCompliancesRecordAndEvaluateRequest> bianRequest) {
		return BianResponse.forSuccess(service.evaluate(bianRequest.getData()));
	}
	
	@Assess.Record
	public BianResponse<RegulatoryCompliancesRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RegulatoryCompliancesRecordAndEvaluateRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.RequestPost
	public BianResponse<Advice> requestPost(@RequestBody BianRequest<AdviceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Assess.RequestPut
	public BianResponse<Advice> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AdviceBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Assess.Retrieve
	public BianResponse<AssessmentWithAssociations> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Assess.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
}
