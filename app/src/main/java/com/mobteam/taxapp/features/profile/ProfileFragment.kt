package com.mobteam.taxapp.features.profile


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.R
import com.mobteam.taxapp.databinding.FragmentProfileBinding
import com.mobteam.taxapp.features.auth.AuthFragment
import com.mobteam.taxapp.features.notes.ui.NotesFragment

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    private val binding by viewBinding(FragmentProfileBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.exitButton.setOnClickListener {
            requireActivity().supportFragmentManager.commit {
                replace(R.id.container, AuthFragment.newInstance())
                addToBackStack(null)
            }
        }
    }

    companion object {
        fun newInstance() : ProfileFragment {
            return ProfileFragment()
        }
    }
}
