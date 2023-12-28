package com.ledger.vo.res;

import lombok.*;

@Getter @Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ResPageDataVO<T> {

    private Integer totalCount;
    private String status;
    private T data;

    public ResPageDataVO(Integer totalCount, String status, T data) {
        this.totalCount = totalCount;
        this.status = status;
        this.data = data;
    }
}
