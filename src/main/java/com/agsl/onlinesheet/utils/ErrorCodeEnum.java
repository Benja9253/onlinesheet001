package com.agsl.onlinesheet.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 错误码 常量类
 *
 * @author August
 * @date 2020-12-17 8:35
 */
@Getter
@AllArgsConstructor
public enum ErrorCodeEnum {

    /**
     * 请求成功
     */
    SUCCESS(HttpStatus.OK.value(), HttpStatus.OK.value(), "请求成功"),

    /**
     * 错误的请求
     */
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.value(), "错误的请求"),

    /**
     * 认证失败、认证凭证无效
     */
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED.value(), HttpStatus.UNAUTHORIZED.value(), "认证失败"),

    /**
     * 访问被拒绝
     */
    FORBIDDEN(HttpStatus.FORBIDDEN.value(), HttpStatus.FORBIDDEN.value(), "访问被拒绝"),

    /**
     * 请求失败
     */
    FAIL(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.value(), "服务器异常");

    /**
     * 错误码
     */
    private final Integer code;

    /**
     * HTTP状态码
     */
    private final Integer httpStatus;

    /**
     * 错误信息
     */
    private final String msg;

}
