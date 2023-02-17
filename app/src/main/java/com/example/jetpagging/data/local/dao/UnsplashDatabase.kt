package com.example.jetpagging.data.remote.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.jetpagging.data.local.dao.UnsplashRemoteKeysDao
import com.example.jetpagging.model.UnsplashImage
import com.example.jetpagging.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImageDao(): UnsplashImageDao
    abstract fun unsplashRemoteKeysDao(): UnsplashRemoteKeysDao

}