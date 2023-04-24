package com.agsl.onlinesheet.service;

import com.agsl.onlinesheet.mapper.LuckyCellMapper;
import com.agsl.onlinesheet.model.TbLuckyData;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 在线Excel操作类
 *
 * @author liuyong
 * @date 2023年 03月22日 16:55:21
 */
@Service
public class LuckyCellService extends ServiceImpl<LuckyCellMapper, TbLuckyData> {
    @Autowired
    private LuckyCellMapper cellMapper;

    public boolean saveOrUpdate(TbLuckyData tbLuckyCell) {
        if (cellMapper.saveOrUpdate(tbLuckyCell) >= 1) {
            return true;
        } else {
            return false;
        }
    }

}
