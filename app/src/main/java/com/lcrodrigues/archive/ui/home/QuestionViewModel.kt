package com.lcrodrigues.archive.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lcrodrigues.archive.MemoryObject
import com.lcrodrigues.archive.Question

class QuestionViewModel : ViewModel() {
    init {
        MemoryObject.createQuestionsList()
    }

    var currentQuestion: MutableLiveData<Question> = MutableLiveData()

    fun getQuestion() {
        val question = MemoryObject.getQuestion()
        currentQuestion.postValue(question)
    }
}