package com.example.gif_api.Modal

import com.google.gson.annotations.SerializedName

data class GifModal(

	@field:SerializedName("next")
	val next: String? = null,

	@field:SerializedName("results")
	val results: List<ResultsItem?>? = null
)

data class Loopedmp4(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("duration")
	val duration: Any? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Mp4(

	@field:SerializedName("duration")
	val duration: Any? = null,

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Tinygif(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Nanogif(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Tinymp4(

	@field:SerializedName("duration")
	val duration: Any? = null,

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Nanowebm(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Mediumgif(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Tinywebm(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Webm(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class ResultsItem(

	@field:SerializedName("created")
	val created: Any? = null,

	@field:SerializedName("flags")
	val flags: List<Any?>? = null,

	@field:SerializedName("media")
	val media: List<MediaItem?>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("url")
	val url: String? = null,

	@field:SerializedName("content_description")
	val contentDescription: String? = null,

	@field:SerializedName("tags")
	val tags: List<Any?>? = null,

	@field:SerializedName("shares")
	val shares: Int? = null,

	@field:SerializedName("bg_color")
	val bgColor: String? = null,

	@field:SerializedName("hascaption")
	val hascaption: Boolean? = null,

	@field:SerializedName("composite")
	val composite: Any? = null,

	@field:SerializedName("content_rating")
	val contentRating: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("source_id")
	val sourceId: String? = null,

	@field:SerializedName("hasaudio")
	val hasaudio: Boolean? = null,

	@field:SerializedName("h1_title")
	val h1Title: String? = null,

	@field:SerializedName("itemurl")
	val itemurl: String? = null
)

data class Gif(

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class Nanomp4(

	@field:SerializedName("duration")
	val duration: Any? = null,

	@field:SerializedName("preview")
	val preview: String? = null,

	@field:SerializedName("size")
	val size: Int? = null,

	@field:SerializedName("dims")
	val dims: List<Int?>? = null,

	@field:SerializedName("url")
	val url: String? = null
)

data class MediaItem(

	@field:SerializedName("mp4")
	val mp4: Mp4? = null,

	@field:SerializedName("tinygif")
	val tinygif: Tinygif? = null,

	@field:SerializedName("nanogif")
	val nanogif: Nanogif? = null,

	@field:SerializedName("tinywebm")
	val tinywebm: Tinywebm? = null,

	@field:SerializedName("gif")
	val gif: Gif? = null,

	@field:SerializedName("mediumgif")
	val mediumgif: Mediumgif? = null,

	@field:SerializedName("tinymp4")
	val tinymp4: Tinymp4? = null,

	@field:SerializedName("nanomp4")
	val nanomp4: Nanomp4? = null,

	@field:SerializedName("nanowebm")
	val nanowebm: Nanowebm? = null,

	@field:SerializedName("loopedmp4")
	val loopedmp4: Loopedmp4? = null,

	@field:SerializedName("webm")
	val webm: Webm? = null
)
