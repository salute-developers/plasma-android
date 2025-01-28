package com.sdds.playground.sandbox.activities.vs

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.databinding.MainActivityBinding

/**
 * Активити демо-приложения на View-System
 */
class SandboxActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)
        setUpFullscreen(binding.appBarMain.root)
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navigationSet, drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        intent.extras?.let { extra ->
            val destinationId = extra.getInt(DESTINATION_ID_ARG, R.id.nav_basic_button)
            val bundle = extra.getBundle(ComponentFragment.DESTINATION_MESSAGE_ARG)
            navController.navigate(destinationId, bundle)
        }
        findViewById<TextView>(R.id.bHome).setOnClickListener {
            toMainScreen()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    private fun setUpFullscreen(root: View) {
        ViewCompat.setOnApplyWindowInsetsListener(root) { v, insets ->
            v.updatePadding(top = insets.getInsets(WindowInsetsCompat.Type.statusBars()).top)
            insets
        }
    }

    private fun toMainScreen() {
        val intent = Intent(this, MainSandboxActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }

    companion object {
        /**
         * Идентификатор начального экрана
         */
        const val DESTINATION_ID_ARG = "DESTINATION_ID_ARG"
        private val navigationSet = setOf(
            R.id.nav_basic_button,
            R.id.nav_badge,
            R.id.nav_icon_button,
            R.id.nav_icon_badge,
            R.id.nav_link_button,
            R.id.nav_cell,
            R.id.nav_checkbox,
            R.id.nav_checkbox_group,
            R.id.nav_chip,
            R.id.nav_chip_group,
            R.id.nav_radiobox,
            R.id.nav_radiobox_group,
            R.id.nav_progressbar,
            R.id.nav_segment,
            R.id.nav_segment_item,
            R.id.nav_switch,
            R.id.nav_avatar,
            R.id.nav_avatargroup,
            R.id.nav_textfield,
            R.id.nav_textarea,
        )
    }
}
