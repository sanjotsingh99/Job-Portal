package com.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{
	
}
