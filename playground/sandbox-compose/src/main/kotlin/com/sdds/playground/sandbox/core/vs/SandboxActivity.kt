package com.sdds.playground.sandbox.core.vs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.customview.widget.Openable
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavOptions
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.fragment.fragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.databinding.LayoutMainHeaderBinding
import com.sdds.playground.sandbox.databinding.MainActivityBinding
import com.sdds.playground.sandbox.viewTheme
import com.sdds.uikit.NavigationDrawer
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Активити демо-приложения на View-System
 */
class SandboxActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: MainActivityBinding


    private val componentListViewModel: ComponentListViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpFullscreen(binding.root)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        intent.extras?.let { extra ->
            val destinationId = extra.getInt(DESTINATION_ID_ARG, R.id.nav_basic_button)
            val bundle = extra.getBundle(ComponentFragment.DESTINATION_MESSAGE_ARG)
            navController.navigate(destinationId, bundle)
        }
        initViews()

        componentListViewModel.componentItems
            .flowWithLifecycle(lifecycle)
            .filter { it.isNotEmpty() }
            .onEach { updateNavigation(it, navController) }
            .launchIn(lifecycleScope)
    }

    private fun initViews() = binding.apply {
        mainContent.bHome.setOnClickListener {
            toMainScreen()
        }
    }

    private fun updateNavigation(menuItems: List<MenuItem>, navController: NavController) {
        if (binding.navView == null) {
            createComponentListNavigation(menuItems, navController)
        } else {
            createSideMenuNavigation(menuItems, navController)
        }
    }

    private fun createSideMenuNavigation(menuItems: List<MenuItem>, navController: NavController) {

        val startDestination = menuItems.first()
        val graph = navController.createGraph(startDestination = startDestination.id) {
            menuItems.forEach {
                val builder = it.destination.builder
                this.builder(it)
            }
        }
        navController.setGraph(graph, startDestination.componentKeyBundle)
    }

    private fun createComponentListNavigation(menuItems: List<MenuItem>, navController: NavController) {
        navController.graph = navController.createGraph(startDestination = R.id.nav_components_list) {
            fragment<ComponentListFragment>(R.id.nav_components_list)
            menuItems.forEach {
                val builder = it.destination.builder
                this.builder(it)
            }
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
    }
}

fun Fragment.findMainNavController(): NavController {
    return requireActivity().findNavController(R.id.nav_host_fragment_content_main)
}
