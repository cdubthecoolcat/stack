package me.tylerbwong.stack.data.network.service

import me.tylerbwong.stack.data.model.ORDER_PARAM
import me.tylerbwong.stack.data.model.Order
import me.tylerbwong.stack.data.model.Response
import me.tylerbwong.stack.data.model.SORT_PARAM
import me.tylerbwong.stack.data.model.Tag
import me.tylerbwong.stack.data.network.ServiceProvider
import retrofit2.http.GET
import retrofit2.http.Query

interface TagService {

    @GET("tags")
    suspend fun getPopularTags(
        @Query(SORT_PARAM) sort: String = TAGS_SORT,
        @Query(ORDER_PARAM) @Order order: String = DEFAULT_ORDER,
        @Query(PAGE_SIZE_PARAM) pageSize: Int = TAGS_PAGE_SIZE,
        @Query(PAGE_PARAM) page: Int = DEFAULT_PAGE,
        @Query(FILTER_PARAM) filter: String = TAGS_FILTER,
        @Query(KEY_PARAM) key: String = ServiceProvider.DEFAULT_KEY
    ): Response<Tag>

    companion object {
        private const val TAGS_SORT = "popular"
        private const val TAGS_PAGE_SIZE = 50
        private const val TAGS_FILTER = "!0XrIP(5mCa0R7ys-I*Wa36*Jm"
    }
}
