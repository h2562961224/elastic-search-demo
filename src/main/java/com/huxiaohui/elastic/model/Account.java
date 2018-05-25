package com.huxiaohui.elastic.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author huxiaohui
 * @date 2018/5/25 上午10:26
 */
@Data
@Document(indexName = "bank",type = "account")
public class Account {

    @Id
    private int account_number;
    private int balance;
    private String firstname;
    private String lastname;
    private int age;
    private String gender;
    private String address;
    private String employer;
    private String email;
    private String city;
    private String state;


}
