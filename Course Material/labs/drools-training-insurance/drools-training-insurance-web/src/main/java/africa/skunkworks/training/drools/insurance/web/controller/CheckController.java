package africa.skunkworks.training.drools.insurance.web.controller;

import africa.skunkworks.training.drools.insurance.domain.enums.ResponseCodeEnum;
import africa.skunkworks.training.drools.insurance.domain.web.response.Response;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/check")
@Tag(name = "Check Controller", description = "Check Controller")
public class CheckController {

    private final static String STATUS = "Drools Training Insurance is Up And Running";

    @GetMapping("/status")
    @Operation(summary = "Checks Application Status", description = "Checks Application Status", tags = {"Status"})
    public ResponseEntity<Response<String>> check(){
        Response<String> response = new Response<>(Boolean.TRUE, ResponseCodeEnum.SUCCESS.getValue(),STATUS);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
