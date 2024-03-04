package com.ledger.restcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ledger.vo.api.data.sub.MemberForm;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {

    @GetMapping(value = "/callTest")
    @ApiOperation(value="테스트", notes = "테스트중입니다.")
    public ResponseEntity<List<MemberForm>> Call(@RequestParam("name") String name) throws JsonProcessingException{
        List<MemberForm> data = new ArrayList<>();
        return ResponseEntity.ok(data);
    }

}
