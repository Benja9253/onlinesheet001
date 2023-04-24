package com.agsl.onlinesheet.mapper;

import com.agsl.onlinesheet.model.TbLuckyData;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * 单元格mapper
 *
 * @author liuyong
 * @date 2023年 03月22日 16:36:59
 */
public interface LuckyCellMapper extends BaseMapper<TbLuckyData> {
    int saveOrUpdate(@Param("param") TbLuckyData tbLuckyCell);
}
