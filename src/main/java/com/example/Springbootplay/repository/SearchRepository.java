package com.example.Springbootplay.repository;

import com.example.Springbootplay.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
