package com.huxiaohui.elastic.dao;

import com.huxiaohui.elastic.model.Account;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author huxiaohui
 * @date 2018/5/25 上午10:33
 */
public interface AccountDao extends ElasticsearchRepository<Account,Long> {
}
