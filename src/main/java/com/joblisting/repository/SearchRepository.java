package com.joblisting.repository;

import java.util.List;

import com.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}