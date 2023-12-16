package com.dicoding.newsapp.ui.list

import androidx.lifecycle.ViewModel
import com.dicoding.newsapp.data.NewsRepository

class NewsViewModel : ViewModel {
    private val newsRepository: NewsRepository

    constructor(newsRepository: NewsRepository) : super() {
        this.newsRepository = newsRepository
    }

    fun getHeadlineNews() = newsRepository.getHeadlineNews()

    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
}