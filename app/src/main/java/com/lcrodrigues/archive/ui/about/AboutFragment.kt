package com.lcrodrigues.archive.ui.about

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.lcrodrigues.archive.R
import com.lcrodrigues.archive.databinding.FragmentAboutBinding

class AboutFragment : Fragment() {

    private lateinit var aboutViewModel: AboutViewModel
    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false)
        binding.lifecycleOwner = viewLifecycleOwner

        aboutViewModel = ViewModelProviders.of(this).get(AboutViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setSocialNetworkButtons()
    }

    private fun setSocialNetworkButtons() {
        var uri: Uri
        var intent: Intent

        binding.twitterLink.setOnClickListener {
            uri = Uri.parse(requireContext().getString(R.string.twitter_link))
            intent = Intent(Intent.ACTION_VIEW, uri)
            requireActivity().startActivity(intent)
        }

        binding.instagramLink.setOnClickListener {
            uri = Uri.parse(requireContext().getString(R.string.instagram_link))
            intent = Intent(Intent.ACTION_VIEW, uri)
            requireActivity().startActivity(intent)
        }

        binding.facebookLink.setOnClickListener {
            uri = Uri.parse(requireContext().getString(R.string.facebook_link))
            intent = Intent(Intent.ACTION_VIEW, uri)
            requireActivity().startActivity(intent)
        }
    }
}