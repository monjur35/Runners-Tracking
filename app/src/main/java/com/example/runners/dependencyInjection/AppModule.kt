package com.example.runners.dependencyInjection

import android.content.Context
import androidx.room.Room
import com.example.runners.db.RunDatabase
import com.example.runners.utils.Constatnts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRunDatabase(@ApplicationContext appContext: Context)= Room.databaseBuilder(
        appContext, RunDatabase::class.java, Constatnts.RUNNING_DATABASE_NAME
    ).build()


    @Singleton
    @Provides
    fun provideRunDAo(db: RunDatabase)=db.getRunDao()
}