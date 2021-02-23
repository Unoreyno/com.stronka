package com.first.firstweb;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonActions {

    public Post addPost(String title, String content) throws JsonParseException, JsonMappingException, IOException {
        ObjectMapper objMap = new ObjectMapper();
        Post[] oldPosts = objMap.readValue(new File("src/main/resources/static/data.json"), Post[].class);

        // Wyśle pan to na githuba, za szybko pan trochętłumaczy i nie nadążałem z pisaniem kodu

        Post post = new Post(1,title,content);
        return post;
    }
    
}
