package com.sdds.playground.sandbox.activities.vs

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import androidx.core.view.updatePadding
import androidx.customview.widget.Openable
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavOptions
import androidx.navigation.createGraph
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.MenuItem
import com.sdds.playground.sandbox.core.vs.ThemeSwitcher
import com.sdds.playground.sandbox.core.vs.getMenuItems
import com.sdds.playground.sandbox.databinding.LayoutMainHeaderBinding
import com.sdds.playground.sandbox.databinding.MainActivityBinding
import com.sdds.playground.sandbox.viewTheme
import com.sdds.uikit.NavigationDrawer
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Активити демо-приложения на View-System
 */
class SandboxActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: MainActivityBinding
    private val themeManager: ThemeManager = ThemeManager
    private var lastSelectedKey: ComponentKey? = null
    private var _navHeaderBinding: LayoutMainHeaderBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpFullscreen(binding.root)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        themeManager.currentTheme
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach {
                updateNavigation(it, navController)
                updateThemePicker(it)
            }
            .launchIn(lifecycleScope)

        intent.extras?.let { extra ->
            val destinationId = extra.getInt(DESTINATION_ID_ARG, R.id.nav_basic_button)
            val bundle = extra.getBundle(ComponentFragment.DESTINATION_MESSAGE_ARG)
            navController.navigate(destinationId, bundle)
        }
        initViews()
    }

    override fun onDestroy() {
        super.onDestroy()
        _navHeaderBinding = null
    }

    private fun initViews() = binding.apply {
        navView?.apply {
            _navHeaderBinding = LayoutMainHeaderBinding.bind(inflateHeader(R.layout.layout_main_header))
                .also {
                    it.headerContent.isFocusable = allViewThemes.size > 1
                    it.headerContent.minimumWidth = minimumWidth
                    it.headerContent.setOnClickListener { showThemePicker() }
                }
        }
        mainContent.bHome.setOnClickListener {
            toMainScreen()
        }
    }

    private fun updateNavigation(theme: Theme, navController: NavController) {
        val menuItems = viewTheme(theme).components.getMenuItems()
        val startDestination = menuItems.first()
        val graph = navController.createGraph(startDestination = startDestination.id) {
            menuItems.forEach {
                val builder = it.destination.builder
                this.builder(it)
            }
        }
        navController.setGraph(graph, startDestination.componentKeyBundle)
        appBarConfiguration = AppBarConfiguration(menuItems.map { it.id }.toSet())
        val navView: NavigationDrawer = binding.navView ?: return
        navView.populateMenu(menuItems, navController)
    }

    private fun NavigationDrawer.populateMenu(items: List<MenuItem>, navController: NavController) {
        val itemsMap = items.associateBy { it.id }
        setNavigationItemSelectedListener {
            val item = itemsMap[it.id] ?: return@setNavigationItemSelectedListener false
            val handled = onNavDestinationSelected(item, navController)

            if (handled) {
                lastSelectedKey = item.componentKey
                val parent = parent
                if (parent is Openable) {
                    parent.close()
                }
            }
            handled
        }
        setItems(
            items.map { menuItem ->
                NavigationDrawer.Item.Builder()
                    .setId(menuItem.id)
                    .setTitle(menuItem.title)
                    .build()
            },
        )
        val currentItem = items.find { it.componentKey == lastSelectedKey } ?: items.first()
        if (currentItem.id != navController.graph.startDestinationId) {
            onNavDestinationSelected(currentItem, navController)
        }
        setSelected(currentItem.id)
    }

    @Suppress("RestrictedApi")
    private fun onNavDestinationSelected(menuItem: MenuItem, navController: NavController): Boolean {
        val builder = NavOptions.Builder()
            .setLaunchSingleTop(true)
            .setRestoreState(true)
            .let { optionsBuilder ->
                navController.currentBackStackEntry?.destination?.route?.let { prev ->
                    optionsBuilder.setPopUpTo(prev, true)
                } ?: optionsBuilder
            }
        val options = builder.build()
        val destinationId = navController.graph.findNode(menuItem.route)?.id ?: return false
        return try {
            navController.navigate(destinationId, menuItem.componentKeyBundle, options)
            navController.currentDestination?.hierarchy?.any { it.id == destinationId } == true
        } catch (e: IllegalArgumentException) {
            false
        }
    }

    private fun showThemePicker() {
        val themes = allViewThemes
        if (themes.size <= 1) return
        val anchorView = _navHeaderBinding?.headerContent ?: return
        ThemeSwitcher(this).show(anchorView)
    }

    private fun updateThemePicker(currentTheme: Theme) {
        _navHeaderBinding?.apply {
            headerTitle.text = currentTheme.name
            headerLabel.isVisible = false
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
