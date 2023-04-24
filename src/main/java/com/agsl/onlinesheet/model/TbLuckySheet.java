package com.agsl.onlinesheet.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 工作表
 *
 * @author liuyong
 * @date 2023年 03月22日 16:25:04
 */
@Data
public class TbLuckySheet {
    //文件表唯一标识
    @TableId
    private String index;

    //文件簿唯一标识
    private String gridKey;

    //文件表体
    private String jsonBody;
}
