package com.example.Springbootplay.controller;

import com.example.Springbootplay.model.Post;
import com.example.Springbootplay.repository.PostRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import springfox.documentation.annotations.ApiIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import springfox.documentation.annotations.ApiIgnore;

//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


import java.io.IOException;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {


    @Autowired
    PostRepository postRepository;

    @GetMapping("/allPosts")
    @CrossOrigin
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    @PostMapping("/addPost")
    @CrossOrigin
    public void addPost(@RequestBody Post post) {
        postRepository.save(post);
    }


}
