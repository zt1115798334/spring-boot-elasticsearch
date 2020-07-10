package com.example.springbootelasticsearch.service;

import com.example.springbootelasticsearch.entity.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/10 10:38
 * description:
 */
 public interface UserService {
    
     long count(); 
   

    
     User save(User user);
   

    
     void delete(User user); 
   

    
     Iterable<User> getAll(); 
   

    
     List<User> getByName(String name);
      
   

    
     Page<User> pageQuery(Integer pageNo, Integer pageSize, String kw);
       
   
}
