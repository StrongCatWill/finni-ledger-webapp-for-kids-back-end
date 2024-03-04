package model.vo.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class CurrentSessionVO {
    private Long memberId;
    private String memberEmail;
    private String memberName;
    private String authCd;
    private String authName;

}
