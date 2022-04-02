package id.dipoengoro.androidtrivia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import id.dipoengoro.androidtrivia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        navController = (supportFragmentManager.findFragmentById(R.id.nav_host)
                as NavHostFragment).navController
        NavigationUI.setupActionBarWithNavController(
            this,
            navController,
            AppBarConfiguration(navController.graph)
        )
    }

    override fun onSupportNavigateUp(): Boolean = navController.navigateUp()
}