package com.huxiaohui.elastic.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author huxiaohui
 * @date 2018/5/24 上午11:17
 */
@Data
public class Boo implements Serializable {
    private String propertyName;
    private String propertyValue;
}
