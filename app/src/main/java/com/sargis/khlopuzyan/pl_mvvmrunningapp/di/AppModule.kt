package com.sargis.khlopuzyan.pl_mvvmrunningapp.di

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import androidx.room.Room
import com.sargis.khlopuzyan.pl_mvvmrunningapp.db.RunningDatabase
import com.sargis.khlopuzyan.pl_mvvmrunningapp.other.Constants.KEY_FIRST_TIME_TOGGLE
import com.sargis.khlopuzyan.pl_mvvmrunningapp.other.Constants.KEY_NAME
import com.sargis.khlopuzyan.pl_mvvmrunningapp.other.Constants.KEY_WEIGHT
import com.sargis.khlopuzyan.pl_mvvmrunningapp.other.Constants.RUNNING_DATABASE_NAME
import com.sargis.khlopuzyan.pl_mvvmrunningapp.other.Constants.SHARED_PREFERENCES_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRunningDatabase(
        @ApplicationContext app: Context
    ) = Room.databaseBuilder(
        app,
        RunningDatabase::class.java,
        RUNNING_DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideRunDao(db: RunningDatabase) = db.getRunDao()

    @Provides
    @Singleton
    fun provideSharedPref(
        @ApplicationContext app: Context
    ) = app.getSharedPreferences(SHARED_PREFERENCES_NAME, MODE_PRIVATE)

    @Provides
    @Singleton
    fun provideName(sharedPref: SharedPreferences) = sharedPref.getString(KEY_NAME, "") ?: ""

    @Provides
    @Singleton
    fun provideWeight(sharedPref: SharedPreferences) = sharedPref.getFloat(KEY_WEIGHT, 80f)

    @Provides
    @Singleton
    fun provideFirstTimeToggle(sharedPref: SharedPreferences) =
        sharedPref.getBoolean(KEY_FIRST_TIME_TOGGLE, true)

}