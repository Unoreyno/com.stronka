package com.first.firstweb;

import java.io.IOException;
// import java.text.ParseException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";
    }

    @GetMapping("/addPost")
    public Post addingPost(String title, String content) throws JsonParseException, JsonMappingException, IOException {

        return jsonActions.addPost(content,title);
    }
        

            
          
    

}
