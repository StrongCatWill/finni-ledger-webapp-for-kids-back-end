package com.ledger.vo.res.test;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class TestVO {

    @ApiModelProperty(value = "멤버 이름")
    private String name;
}
