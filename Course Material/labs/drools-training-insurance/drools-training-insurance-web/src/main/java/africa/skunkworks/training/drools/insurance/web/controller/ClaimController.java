package africa.skunkworks.training.drools.insurance.web.controller;

import africa.skunkworks.training.drools.insurance.domain.dto.ClaimDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.rule.ClaimRuleManager;
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
@RequestMapping("/claim")
@Tag(name = "Claim Controller", description = "Claim Controller")
public class ClaimController {

    private final ClaimRuleManager claimRuleManager;

    @Autowired
    public ClaimController(ClaimRuleManager claimRuleManager) {
        this.claimRuleManager = claimRuleManager;
    }

    @GetMapping("/all")
    @Operation(summary = "Fires All Claims Rules", description = "Fires All Claims Rules", tags = {"Claim"})
    public ResponseEntity<Response<List<ClaimDto>>> fireClaimRules(){
        Response<List<ClaimDto>> response = claimRuleManager.fireClaimRules();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
