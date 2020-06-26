package com.lcrodrigues.archive.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.lcrodrigues.archive.R

class QuestionFragment : Fragment() {

    private lateinit var questionViewModel: QuestionViewModel


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        questionViewModel =
                ViewModelProviders.of(this).get(QuestionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_question, container, false)

        return root
    }
}