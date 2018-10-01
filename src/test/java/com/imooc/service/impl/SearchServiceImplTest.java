package com.imooc.service.impl;

import com.imooc.service.ISearchService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author youyusong
 * @date 2018/9/24
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class SearchServiceImplTest {

    @Autowired
    private ISearchService searchService;

    @Test
    public void index() {
        boolean success = searchService.index(15L);
        Assert.assertTrue(success);
    }
}