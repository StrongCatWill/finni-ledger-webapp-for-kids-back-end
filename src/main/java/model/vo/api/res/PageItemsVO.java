package model.vo.api.res;

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

    private Integer totalCount;
    private String status;
    private List<T> items = new ArrayList<>();

    public PageItemsVO(Integer totalCount, String status, List<T> items) {
        this.totalCount = totalCount;
        this.status = status;
        this.items = items;
    }
}
