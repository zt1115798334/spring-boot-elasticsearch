package com.example.springbootelasticsearch.controller;

import com.example.springbootelasticsearch.entity.User;
import com.example.springbootelasticsearch.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author zhang
 * date: 2020/7/10 10:41
 * description:
 */
@AllArgsConstructor
@RestController
public class UserController {
    private final UserService userService;


    @GetMapping("/testInsert")
    public void testInsert() {
        User user = new User();
        user.setUId("1");
        user.setName("zhangsna");
        user.setAge(101);
        user.setAddress("广东省深圳市");
        userService.save(user);

        user.setUId("2");
        user.setName("lisi");
        user.setAge(32);
        user.setAddress("广东省深圳市");
        userService.save(user);

        user.setUId("3");
        user.setName("wangwu");
        user.setAge(34);
        user.setAddress("广东省深圳市");
        userService.save(user);

    }

    @GetMapping("/testDelete")
    public void testDelete() {
        User user = new User();
        user.setUId("1");
        userService.delete(user);
    }

    @GetMapping("/testGetAll")
    public void testGetAll() {
        Iterable<User> iterable = userService.getAll();
        iterable.forEach(e -> System.out.println(e.toString()));
    }

    @GetMapping("/testGetByName")
    public void testGetByName() {
        List<User> list = userService.getByName("lisi");
        System.out.println(list);
    }

    @GetMapping("/testPage")
    public void testPage() {
        Page<User> page = userService.pageQuery(0, 10, "wangwu");
        System.out.println(page.getTotalPages());
        System.out.println(page.getNumber());
        System.out.println(page.getContent());
    }
}
