package com.agsl.onlinesheet.controller;

import com.agsl.onlinesheet.mapper.LuckyFileMapper;
import com.agsl.onlinesheet.model.TbLuckyFile;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author liuyong
 * @date 2023年 03月22日 16:38:09
 */
@SpringBootTest
public class SampleTest {

    @Autowired
    private LuckyFileMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<TbLuckyFile> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }

}
