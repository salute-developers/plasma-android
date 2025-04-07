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
import androidx.drawerlayout.widget.DrawerLayout
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
import androidx.navigation.ui.setupActionBarWithNavController
import com.sdds.playground.sandbox.MainSandboxActivity
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.ThemeManager
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.core.vs.ComponentFragment
import com.sdds.playground.sandbox.core.vs.EditorFragment
import com.sdds.playground.sandbox.core.vs.MenuItem
import com.sdds.playground.sandbox.core.vs.choiceEditor
import com.sdds.playground.sandbox.core.vs.getMenuItems
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)
        setUpFullscreen(binding.appBarMain.root)
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        themeManager.currentTheme
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { updateNavigation(it, navController) }
            .launchIn(lifecycleScope)

        intent.extras?.let { extra ->
            val destinationId = extra.getInt(DESTINATION_ID_ARG, R.id.nav_basic_button)
            val bundle = extra.getBundle(ComponentFragment.DESTINATION_MESSAGE_ARG)
            navController.navigate(destinationId, bundle)
        }
        binding.appBarMain.bHome.setOnClickListener {
            toMainScreen()
        }
        setupThemePicker()
    }

    private fun updateNavigation(theme: Theme, navController: NavController) {
        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationDrawer = binding.navView
        val menuItems = viewTheme(theme).components.getMenuItems()
        val startDestination = menuItems.first()
        val graph = navController.createGraph(startDestination = startDestination.id) {
            menuItems.forEach {
                val builder = it.destination.builder
                this.builder(it)
            }
        }
        navController.setGraph(graph, startDestination.componentKeyBundle)
        navView.populateMenu(menuItems, navController)
        appBarConfiguration = AppBarConfiguration(menuItems.map { it.id }.toSet(), drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
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

    private fun setupThemePicker() {
        val themes = allViewThemes
        binding.appBarMain.bSettings.apply {
            isVisible = themes.size > 1
            if (isVisible) {
                setOnClickListener {
                    EditorFragment.choiceEditor(
                        propertyName = "Theme",
                        currentValue = viewTheme(themeManager.currentTheme.value).theme.name,
                        choices = allViewThemes.map(Theme::name),
                        confirmKey = THEME_PICKER_RESULT_KEY,
                    ).show(supportFragmentManager, "ThemePicker")
                }
                supportFragmentManager.setFragmentResultListener(
                    THEME_PICKER_RESULT_KEY,
                    this@SandboxActivity,
                ) { requestKey, bundle ->
                    if (requestKey != THEME_PICKER_RESULT_KEY) return@setFragmentResultListener
                    val newValue = bundle.getString(EditorFragment.CONFIRM_VALUE).orEmpty()
                    themeManager.updateTheme(Theme.valueOf(newValue))
                }
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
        private const val THEME_PICKER_RESULT_KEY = "THEME_PICKER_RESULT_KEY"
    }
}
