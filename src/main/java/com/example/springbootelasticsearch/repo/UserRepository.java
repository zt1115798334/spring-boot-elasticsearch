package com.example.springbootelasticsearch.repo;

import com.example.springbootelasticsearch.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/10 10:34
 * description:
 */
@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

}
