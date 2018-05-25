package com.huxiaohui.elastic.controller;

import com.google.common.collect.Lists;
import com.huxiaohui.elastic.dao.AccountDao;
import com.huxiaohui.elastic.model.Account;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

/**
 * @author huxiaohui
 * @date 2018/5/25 上午10:33
 */
@RestController
@RequestMapping("api/account/es")
public class Accounts {
    @Autowired
    private Client client;

    @Autowired
    private AccountDao accountDao;

    @RequestMapping("query")
    public List<Account> findBy(){
        List<Account> accounts = Lists.newArrayList();
        String queryString = "Putnam";
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString).field("address");
        Iterable<Account> a = accountDao.search(builder);
        Iterator<Account> accountIterator = a.iterator();
        while (accountIterator.hasNext()){
            accounts.add(accountIterator.next());
        }
        return accounts;
    }
}
