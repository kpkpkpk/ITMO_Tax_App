package com.mobteam.taxapp.features.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.commit
import androidx.transition.Visibility
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentAuthBinding
import com.mobteam.taxapp.features.courses.feed.ui.CoursesFragment


class AuthFragment : Fragment(R.layout.fragment_auth) {

    private val binding by viewBinding(FragmentAuthBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.linkTextView.setOnClickListener {
            if (binding.linkTextView.text.toString() == getString(R.string.register_text)) {
                binding.authTitle.text = getString(R.string.register)
                binding.nameTil.isVisible = true
                binding.joinButton.setText(R.string.register_text)
                binding.linkTextView.setText(R.string.join_underlined_text)
                binding.accountTextView.setText(R.string.do_you_have_account_text)
            } else {
                binding.authTitle.text = getString(R.string.enter)
                binding.nameTil.isVisible = false
                binding.joinButton.setText(R.string.join_text)
                binding.linkTextView.setText(R.string.register_underlined_text)
                binding.accountTextView.setText(R.string.dont_you_have_account_text)
            }
        }

        binding.joinButton.setOnClickListener {
            IsUserAuth.flow.tryEmit(true)
            requireActivity().supportFragmentManager.commit {
                replace(R.id.container, CoursesFragment.newInstance())
            }
        }
    }

    companion object {
        fun newInstance(): AuthFragment {
            return AuthFragment()
        }
    }

}
