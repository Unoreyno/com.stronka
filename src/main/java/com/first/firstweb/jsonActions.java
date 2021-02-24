package com.first.firstweb;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class jsonActions {

    public static Post[] addPost(String title, String content) throws JsonParseException, JsonMappingException, IOException {
        
        ObjectMapper objMap = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
        Post[] oldPosts = objMap.readValue(new File("src/main/resources/static/data.json"), Post[].class);


        Post[] newPosts = new Post[oldPosts.length + 1];

        
        int i = 0;
        int maxVal = 0;
        
        for(Post o : oldPosts){
            newPosts[i] = o;
            i++;
            maxVal = Math.max(i, maxVal);
            
            
        }
        int newId = maxVal+1;
        newPosts[oldPosts.length] = new Post(newId,title,content);

        // Post newPost = new Post(1,title,content);
        // newPosts[i] = newPost;

        
        objMap.writeValue(new File("src/main/resources/static/data.json"), newPosts);

        return newPosts;
    }
    // public static Post[] getPost(int id, String title, String content) throws JsonParseException, JsonMappingException, IOException {
        
    // return 
        
        
    // }
     
    
}
