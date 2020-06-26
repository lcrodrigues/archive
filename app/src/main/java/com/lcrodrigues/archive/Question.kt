package com.lcrodrigues.archive

data class Question(
    var number: String,
    var description: String,
    var source: String,
    var question: String,
    var answers: List<String>,
    var rightAnswer: String,
    var explanation: String
)