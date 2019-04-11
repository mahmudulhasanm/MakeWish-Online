package com.makewishonline.makemoney;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Url;

public class BloggerAPI {

    public static final String key = "AIzaSyAqfCIEgVydvTZ6QBslkJTEuA3yPaa6x1I";
    public static final String url = "https://www.googleapis.com/blogger/v3/blogs/3539625497596062418/posts/";
    public static final String beautyurl = "https://www.googleapis.com/blogger/v3/blogs/4877870602037765246/posts/";

    public static PostService postService = null;

    public static PostService getService()
    {
        if(postService == null)
        {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            postService = retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService {
        @GET
        Call<PostList> getPostList(@Url String url);
    }


}
