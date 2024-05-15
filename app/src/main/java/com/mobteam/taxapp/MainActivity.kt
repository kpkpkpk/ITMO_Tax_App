package com.mobteam.taxapp

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.databinding.ActivityMainBinding
import com.mobteam.taxapp.features.auth.AuthFragment
import com.mobteam.taxapp.features.courses.feed.ui.CoursesFragment
import com.mobteam.taxapp.features.notes.ui.NotesFragment
import com.mobteam.taxapp.features.profile.ProfileFragment
import com.mobteam.taxapp.features.terms.ui.TermsFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onResume() {
        super.onResume()
        setBottomNavigationListener()
        supportFragmentManager.commit {
            replace(binding.container.id, AuthFragment.newInstance())
            addToBackStack(null)
        }
    }

    private fun setBottomNavigationListener() {
        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.action_profile -> navigateTo(ProfileFragment.newInstance())
                R.id.action_courses -> navigateTo(CoursesFragment.newInstance())
                R.id.action_terms -> navigateTo(TermsFragment.newInstance())
                R.id.action_notes -> navigateTo(NotesFragment.newInstance())
            }
            true
        }
    }

    private fun navigateTo(fragment : Fragment) {
        supportFragmentManager.commit {
            replace(binding.container.id, fragment)
            addToBackStack(null)
        }
    }

}
