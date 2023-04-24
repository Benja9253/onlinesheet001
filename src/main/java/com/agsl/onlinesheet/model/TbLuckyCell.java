package com.agsl.onlinesheet.model;

import lombok.Data;

/**
 * 单元格
 *
 * @author liuyong
 * @date 2023年 03月22日 16:25:19
 */
@Data
public class TbLuckyCell {
    //文件表唯一标识
    private String index;

    //单元格体
    private String jsonBody;

    //用户唯一标识
    private String userInfo;
}
