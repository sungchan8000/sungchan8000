package com.pcc.sungchan8000.IntelliJ.chapter7;

import org.junit.Test;
import org.junit.After;
import org.springframework.beans.factory.annotation.Autowired;



import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class ProductioinServiceTest {

    @Autowired
    ProductRepository productRepository;




    @Test
    public void 기본디버깅(){
        Long id = productService.register(1000L,"책");


        assertThat(id,is(1L));

    }




}
