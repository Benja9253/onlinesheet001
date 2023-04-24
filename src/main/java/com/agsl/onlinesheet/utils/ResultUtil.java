package com.agsl.onlinesheet.utils;


/**
 * 返回结果工具类
 *
 * @author August
 * @date 2020-12-17 8:40
 */
public class ResultUtil {

    private ResultUtil() {
    }

    /**
     * 成功返回
     *
     * @param data
     * @return
     */
    public static JsonResult success(Object data) {
        return new JsonResult(ErrorCodeEnum.SUCCESS.getCode(),
                ErrorCodeEnum.SUCCESS.getMsg(), data);
    }

    /**
     * 失败返回
     *
     * @param msg
     * @return
     */
    public static JsonResult fail(String msg) {
        return new JsonResult(ErrorCodeEnum.FAIL.getCode(), msg, null);
    }

    /**
     * 失败返回
     *
     * @param errorCode
     * @param msg
     * @return
     */
    public static JsonResult fail(Integer errorCode, String msg) {
        return new JsonResult(errorCode, msg, null);
    }

}
