package africa.skunkworks.training.drools.insurance.web.controller;

import africa.skunkworks.training.drools.insurance.domain.dto.PolicyDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.rule.PolicyRuleManager;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/policy")
@Tag(name = "Policy Controller", description = "Policy Controller")
public class PolicyController {

    private final PolicyRuleManager policyRuleManager;

    @Autowired
    public PolicyController(PolicyRuleManager policyRuleManager) {
        this.policyRuleManager = policyRuleManager;
    }

    @GetMapping("/all")
    @Operation(summary = "Fires All Policy Rules", description = "Fires All Policy Rules", tags = {"Policy"})
    public ResponseEntity<Response<List<PolicyDto>>> fireAllRulePolicies(){
        Response<List<PolicyDto>> response =  policyRuleManager.fireAllRulePolicies();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
