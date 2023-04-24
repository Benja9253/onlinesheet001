package com.agsl.onlinesheet.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 返回结果
 *
 * @author August
 * @date 2020-12-16 16:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonResult {

    /**
     * 错误码
     */
    private int code;

    /**
     * 回送信息
     */
    private String msg;

    /**
     * 回送数据
     */
    private Object data;

}
