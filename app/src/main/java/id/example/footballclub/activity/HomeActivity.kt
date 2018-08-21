package id.example.footballclub.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import id.example.footballclub.R
import id.example.footballclub.R.id.favorites
import id.example.footballclub.R.id.teams
import id.example.footballclub.fragment.FavoriteTeamFragment
import id.example.footballclub.fragment.TeamFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        bottom_navigation.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                teams -> {
                    loadTeamFragment(savedInstanceState)
                }
                favorites -> {
                    loadFavoriteTeamFragment(savedInstanceState)
                }
            }

            true
        }

        bottom_navigation.selectedItemId = teams
    }

    private fun loadFavoriteTeamFragment(savedInstanceState: Bundle?) {
        if(savedInstanceState == null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, FavoriteTeamFragment(), FavoriteTeamFragment::class.java.simpleName)
                    .commit()
        }

    }

    private fun loadTeamFragment(savedInstanceState: Bundle?) {
        if(savedInstanceState == null){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.main_container, TeamFragment(), TeamFragment::class.java.simpleName)
                    .commit()
        }
    }
}
