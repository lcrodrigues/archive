package com.lcrodrigues.archive.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.lcrodrigues.archive.R
import com.lcrodrigues.archive.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {

    private lateinit var questionViewModel: QuestionViewModel
    private lateinit var binding: FragmentQuestionBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_question, container, false)
        questionViewModel =
            ViewModelProviders.of(this).get(QuestionViewModel::class.java)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        questionViewModel.getQuestion()
        setObservers()
        setButtons()
    }

    private fun setObservers() {
        questionViewModel.currentQuestion.observe(viewLifecycleOwner, Observer { question ->
            if (question != null) {
                binding.questionObject = question
            } else {
                binding.questionScreen.visibility = View.GONE
                binding.demoScreen.visibility = View.VISIBLE
            }
        })
    }

    private fun setButtons() {
        binding.nextQuestionButton.setOnClickListener {
            resetQuestion()
            questionViewModel.getQuestion()
        }

        binding.selectAnswerButton.setOnClickListener {
            binding.answerExplanation.visibility = View.VISIBLE
            val response = getOptionLetter()
            binding.answerExplanation.text = questionViewModel.getAnswerAndExplanation(response ?: "")
            closeQuestion()
        }
    }

    private fun getOptionLetter(): String? {
        return when {
            binding.firstOption.isChecked -> "A"
            binding.secondOption.isChecked -> "B"
            binding.thirdOption.isChecked -> "C"
            binding.fourthOption.isChecked -> "D"
            binding.fifthOption.isChecked -> "E"
            else -> null
        }
    }

    private fun closeQuestion() {
        binding.firstOption.isClickable = false
        binding.secondOption.isClickable = false
        binding.thirdOption.isClickable = false
        binding.fourthOption.isClickable = false
        binding.fifthOption.isClickable = false
        binding.selectAnswerButton.isClickable = false
    }

    private fun resetQuestion() {
        binding.answerExplanation.visibility = View.GONE

        binding.firstOption.isChecked = false
        binding.secondOption.isChecked = false
        binding.thirdOption.isChecked = false
        binding.fourthOption.isChecked = false
        binding.fifthOption.isChecked = false

        binding.firstOption.isClickable = true
        binding.secondOption.isClickable = true
        binding.thirdOption.isClickable = true
        binding.fourthOption.isClickable = true
        binding.fifthOption.isClickable = true

        binding.selectAnswerButton.isClickable = true
    }
}