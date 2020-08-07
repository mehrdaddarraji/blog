package com.mehrdaddarraji.techblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehrdaddarraji.techblog.entity.Post;
import com.mehrdaddarraji.techblog.repository.PostRepository;

@SpringBootApplication
public class TechBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechBlogApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/posts")
	public class PostController {
		@Autowired
		private PostRepository postRepository;
		
		@GetMapping
		public Iterable<Post> getPosts() {
			return this.postRepository.findAll();
		}
	}

}
