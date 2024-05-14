package com.mobteam.taxapp.features.search_view_ext

import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.widget.SearchView
import androidx.core.view.MenuProvider
import com.mobteam.taxapp.R

class SearchMenuProvider(
    private val onMenuItemClicked: () -> Unit,
    private val onTextQueryChanged: SearchView.OnQueryTextListener
) : MenuProvider {
    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
        menuInflater.inflate(R.menu.search_menu, menu)

        val menuItem = menu.findItem(R.id.action_search)
        with(menuItem.actionView as SearchView) {
            requestFocusFromTouch()
            queryHint = resources.getString(R.string.search_hint)
            setOnQueryTextListener(onTextQueryChanged)
        }
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            R.id.action_search -> {
                onMenuItemClicked()
                true
            }

            else -> false
        }
    }
}
