package com.tuwaiq.photogallery.flickr.models

import com.google.gson.annotations.SerializedName

data class GalleryItem(
    val id:String = "",
    val title:String = "",
    @SerializedName("url_s")
    val url:String = ""
)
