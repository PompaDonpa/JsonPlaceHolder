package com.example.jsonplaceholder

import retrofit2.Response
import retrofit2.http.GET

interface TodoApi {
    @GET("/todos")
    fun getTodos(): Response<List<Todo>>
    
}
