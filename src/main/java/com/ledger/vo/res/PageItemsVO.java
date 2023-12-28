
package com.ledger.vo.res;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class PageItemsVO<T> {

    private Integer page;
    private Integer totalPages;
    private Integer pageSize;
    private Integer totalCount;
    private String status;
    private List<T> items = new ArrayList<>();

    public PageItemsVO(Integer page, Integer totalPages, Integer pageSize, Integer totalCount, String status, List<T> items) {
        this.page = page;
        this.totalPages = totalPages;
        this.pageSize = pageSize;
        this.totalCount = totalCount;
        this.status = status;
        this.items = items;
    }
}
