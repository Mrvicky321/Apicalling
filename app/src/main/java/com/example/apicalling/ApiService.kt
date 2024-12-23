package com.example.apicalling

import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("todos")
    fun getToDoList(): Observable<List<ToDoModel>>

    @GET("comments")
    fun getComments(): Observable<List<comments>>

    @GET("albums")
    fun getAlbums(): Observable<List<albums>>


    @GET("photos")
    fun getPhotos(): Observable<List<photos>>


    @GET("users")
    fun getUsers(): Observable<List<users>>

    @GET("posts")
    fun getPosts(): Observable<List<posts>>







}