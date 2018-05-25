package com.huxiaohui.elastic.dao;

import com.huxiaohui.elastic.model.Foo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author huxiaohui
 * @date 2018/5/24 上午10:51
 */
public interface FooElasticDao extends ElasticsearchRepository<Foo,Long> {
}
