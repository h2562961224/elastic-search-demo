package com.huxiaohui.elastic.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.List;

/**
 * @author huxiaohui
 * @date 2018/5/24 上午10:44
 */
@Document(indexName = "spu",type = "spu")
@Data
public class Foo  implements Serializable {
    @Id
    private Long id;
    private String name;
    private String description;
    private Long frontTypeId;
    private Long backTypeId;
    private Double price;
    private List<Boo> properties;
}
