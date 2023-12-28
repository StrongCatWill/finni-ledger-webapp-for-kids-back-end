package com.ledger.service.api;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ledger.vo.res.PageItemListVO;
import com.ledger.vo.res.PageItemsVO;
import com.ledger.vo.res.ResPageDataVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiBaseService {

    protected Logger log = LoggerFactory.getLogger(this.getClass());

    public <T> PageItemsVO<T> getItemsObject(String stringify, Class<T> target) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(stringify, new TypeReference<PageItemsVO<T>>() {});
    }

    public <T>ResPageDataVO<T> getDataObjects(String stringify, Class<T> target) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(stringify, new TypeReference<ResPageDataVO<T>>() {});
    }

    public <T> PageItemListVO<T> getDataListObject(String stringify, Class<T> target) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(stringify, new TypeReference<PageItemListVO<T>>() {});
    }

    public <T> T getObject(String stringify, TypeReference<T> typeReference) throws JsonProcessingException{
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(stringify, typeReference);
    }
}
