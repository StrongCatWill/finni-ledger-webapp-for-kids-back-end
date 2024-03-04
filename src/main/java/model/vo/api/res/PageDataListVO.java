package model.vo.api.res;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PageDataListVO<T> {

    private Integer totalCount;
    private String status;
    private List<T> data;

    public PageDataListVO(Integer totalCount, String status, List<T> data) {
        this.totalCount = totalCount;
        this.status = status;
        this.data = data;
    }
}
