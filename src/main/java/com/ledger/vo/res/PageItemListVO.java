package com.ledger.vo.res;

import lombok.*;

import java.util.List;

@Getter @Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageItemListVO<T> {

    private Integer totalCount;
    private String status;
    private List<T> data;

    public PageItemListVO(Integer totalCount, String status, List<T> data) {
        this.totalCount = totalCount;
        this.status = status;
        this.data = data;
    }
}
