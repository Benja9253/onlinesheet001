package com.agsl.onlinesheet.mapper;

import lombok.Data;

/**
 * 接口入参
 *
 * @author liuyong
 * @date 2023年 03月22日 18:30:27
 */
@Data
public class LuckyDto {
    private String gridKey;//工作簿唯一标识
    private String index;//工作表唯一标识
    private String userInfo;//用户的企业编码或区域编码
}
