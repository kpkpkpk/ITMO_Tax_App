package com.mobteam.taxapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import by.kirich1409.viewbindingdelegate.viewBinding
import com.mobteam.taxapp.databinding.ActivityMainBinding
import com.mobteam.taxapp.features.courses.feed.ui.CoursesFragment

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    private val binding by viewBinding(ActivityMainBinding::bind)

    override fun onResume() {
        super.onResume()
        supportFragmentManager.commit {
            replace(binding.container.id, CoursesFragment())
        }
    }
}
