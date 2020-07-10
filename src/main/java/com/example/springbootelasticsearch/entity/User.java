package com.example.springbootelasticsearch.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/10 9:52
 * description:
 */
@Data
@Document(indexName = "user")
public class User {
    @Id
    private String uId;

    private String name;

    private Integer age;

    private String address;
}
