package com.ledger.constant;

import lombok.Getter;

@Getter
public enum FinCategory {
    MEAL("밥"),
    SNACK("카페/간식"),
    GAME("간식"),
    TOY("장난감"),
    CLOTH("옷"),
    ACCESSORY("액세서리"),
    BEAUTY("미용"),
    MOVIE("영화"),
    KARAOKE("노래방"),
    GIFT("선물"),
    ETC("기타 입력");

    private final String name;

    FinCategory(String name){
        this.name = name;
    }

    /*
    * 사용자로부터 동적 입력을 받는 메서드
    * */
    // 동적 입력 필드를 위한 메소드
    public static boolean isDynamicInputAllowed(FinCategory category) {
        return category == ETC;
    }
}
