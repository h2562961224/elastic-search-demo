package com.huxiaohui.elastic.controller;
import com.google.common.collect.Lists;

import com.huxiaohui.elastic.dao.FooElasticDao;
import com.huxiaohui.elastic.model.Boo;
import com.huxiaohui.elastic.model.Foo;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.List;

/**
 * @author huxiaohui
 * @date 2018/5/24 上午10:52
 */
@RestController
public class Foos {
    @Autowired
    private Client client;

    @Autowired
    private FooElasticDao fooElasticDao;

    @RequestMapping("/add")
    public void testSaveArticleIndex() {
        List<Boo> boos = Lists.newArrayList();
        Foo foo = new Foo();
        foo.setId(1L);
        foo.setName("111");
        foo.setDescription("222");
            foo.setFrontTypeId(1111L);
        foo.setBackTypeId(2222L);
        foo.setPrice(33333D);
        foo.setProperties(boos);
        Boo boo1 = new Boo();
        boo1.setPropertyName("name");
        boo1.setPropertyValue("huxiaohui");
        Boo boo2 = new Boo();
        boo2.setPropertyName("gender");
        boo2.setPropertyValue("male");
        boos.add(boo1);
        boos.add(boo2);
        fooElasticDao.save(foo);
    }

    @RequestMapping("/query")
    public List<Foo> testSearch() {
        //搜索关键字
        String queryString = "111";
        QueryStringQueryBuilder builder = new QueryStringQueryBuilder(queryString);
        Iterable<Foo> searchResult = fooElasticDao.search(builder);
        Iterator<Foo> iterator = searchResult.iterator();
        List<Foo> foos = Lists.newArrayList();
        while (iterator.hasNext()) {
            foos.add(iterator.next());
        }
        return foos;
    }
}
