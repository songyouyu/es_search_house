package com.imooc.base;

import lombok.Data;

/**
 * Datatables响应结构
 * @author youyusong
 * @date 2018/9/8
 */
@Data
public class ApiDataTableResponse extends ApiResponse{

    /**
     * 要求回显字段
     */
    private int draw;

    /**
     * 总数
     */
    private long recordsTotal;

    /**
     * 分页使用
     */
    private long recordsFiltered;

    public ApiDataTableResponse(ApiResponse.Status status) {
        this(status.getCode(), status.getStandardMessage(), null);
    }

    public ApiDataTableResponse(int code, String message, Object data) {
        super(code, message, data);
    }
}
