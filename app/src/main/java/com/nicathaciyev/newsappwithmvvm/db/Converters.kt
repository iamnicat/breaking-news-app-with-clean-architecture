package com.nicathaciyev.newsappwithmvvm.db

import androidx.room.TypeConverter
import com.nicathaciyev.newsappwithmvvm.models.Source

class Converters {


    @TypeConverter
    fun fromSource(source: Source): String = source.name

    @TypeConverter
    fun toSource(name: String): Source = Source(name, name)

}