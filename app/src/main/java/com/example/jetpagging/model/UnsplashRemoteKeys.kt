package com.example.jetpagging.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.jetpagging.utils.Constants.UNSPLASH_IMAGE_TABLE
import com.example.jetpagging.utils.Constants.UNSPLASH_REMOTE_KEYS_TABLE
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = UNSPLASH_REMOTE_KEYS_TABLE)
data class UnsplashRemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id: String,
    val prevPage:Int?,
    val nextPage:Int?
)
