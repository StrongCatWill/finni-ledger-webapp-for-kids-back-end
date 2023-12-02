package com.ledger.service;

import com.ledger.repository.MemberRepository;
import jakarta.persistence.EntityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinServiceTest {

    @Autowired
    MemberRepository memberRepository;
    @Autowired
    FinRepository finRepository;
    @Autowired
    EntityManager entityManager;

    @Test
    public void 용돈정보입력() throws Exception {
        //given


        //when

        //then

    }

    @Test
    public void 용돈기입주기_확인() throws Exception {
        //given


        //when

        //then

    }

}