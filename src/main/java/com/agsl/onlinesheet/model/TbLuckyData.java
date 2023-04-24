package com.agsl.onlinesheet.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 单元格
 *
 * @author liuyong
 * @date 2023年 03月22日 16:25:19
 */
@Data
public class TbLuckyData {
    //文件表唯一标识
    private String sheetId;

    //单元格体
    private String jsonBody;

    //用户唯一标识
    private String userInfo;

    //数据起始行号
    private int rowStart;

    //数据总行数
    private int rowCount;

    //创建时间
    private LocalDateTime createTime;
}
