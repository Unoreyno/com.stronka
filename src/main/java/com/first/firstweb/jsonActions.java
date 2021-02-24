package com.first.firstweb;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonActions {

    public static Post addPost(String title, String content) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objMap = new ObjectMapper();
        Post[] oldPosts = objMap.readValue(new File("src/main/resources/static/data.json"), Post[].class);

        for(Post o : oldPosts){
            System.out.println("POOOOOOOST");
            System.out.println(o.id);
            System.out.println(o.title);
            System.out.println(o.content);
            System.out.println("POOOOOOOST");
          }

        Post post = new Post(1,title,content);
        return post;
    }
    
}
