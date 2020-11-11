package com.nicathaciyev.newsappwithmvvm.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nicathaciyev.newsappwithmvvm.ui.Article
import retrofit2.http.DELETE

@Dao
interface ArticleDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(article: Article): Long

    @Query("SELECT * FROM articles")
    suspend fun getAllArticles(): LiveData<Article>

    @DELETE
    suspend fun deleteArticle(article: Article)


}