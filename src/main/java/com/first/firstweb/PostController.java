package com.first.firstweb;

import java.text.ParseException;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    @GetMapping("/hello")
    public String Hello(){
        return "Hello world";

    }
    @GetMapping("/addPost")
        public Post addingPost(String title, String content) {

            return jsonActions.addPost(title+" : "+content);
        }
        

            
          
    

}
