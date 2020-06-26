package com.lcrodrigues.archive.ui.home

import android.os.Bundle
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
            }
        })
    }

    private fun setButtons() {
        binding.nextQuestionButton.setOnClickListener {
            questionViewModel.getQuestion()
        }
    }
}