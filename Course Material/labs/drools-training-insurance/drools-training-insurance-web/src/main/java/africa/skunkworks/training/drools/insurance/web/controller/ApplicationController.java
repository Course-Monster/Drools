package africa.skunkworks.training.drools.insurance.web.controller;

import africa.skunkworks.training.drools.insurance.domain.dto.ApplicationDto;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import africa.skunkworks.training.drools.insurance.manager.rule.ApplicationRuleManager;
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
@RequestMapping("/application")
@Tag(name = "Application Controller", description = "Application Controller")
public class ApplicationController {

    private final ApplicationRuleManager applicationRuleManager;

    @Autowired
    public ApplicationController(ApplicationRuleManager applicationRuleManager) {
        this.applicationRuleManager = applicationRuleManager;
    }

    @GetMapping("/all")
    @Operation(summary = "Fires All Application Rules", description = "Fires All Application Rules", tags = {"Application"})
    public ResponseEntity<Response<List<ApplicationDto>>> fireApplicationRules(){
        Response<List<ApplicationDto>> response = applicationRuleManager.fireApplicationRules();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
