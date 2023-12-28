package com.ledger.constant;

public enum EnYesOrNo {
    Y,
    N;

    public String getCode(){
        return this.name();
    }

    public static EnYesOrNo search(String code) {
        for( EnYesOrNo type : EnYesOrNo.values() ){
            if ( type.getCode().equals(code) ){
                return type;
            }
        }
        return null;
    }
}
