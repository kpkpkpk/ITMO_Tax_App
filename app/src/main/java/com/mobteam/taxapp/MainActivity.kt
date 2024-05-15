package com.mobteam.taxapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.databinding.ActivityMainBinding
import com.mobteam.taxapp.features.auth.AuthFragment
import com.mobteam.taxapp.features.notes.ui.NotesFragment
import com.mobteam.taxapp.features.profile.ProfileFragment
import com.mobteam.taxapp.features.terms.ui.TermsFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onResume() {
        super.onResume()
        supportFragmentManager.commit {
            replace(binding.container.id, AuthFragment.newInstance())
        }
    }
}
