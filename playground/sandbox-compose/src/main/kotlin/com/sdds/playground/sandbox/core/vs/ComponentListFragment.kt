package com.sdds.playground.sandbox.core.vs

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.core.view.isVisible
import androidx.customview.widget.Openable
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavOptions
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.allViewThemes
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.databinding.FragmentComponentListBinding
import com.sdds.playground.sandbox.databinding.LayoutComponentItemBinding
import com.sdds.playground.sandbox.databinding.LayoutMainHeaderBinding
import com.sdds.playground.sandbox.viewTheme
import com.sdds.uikit.NavigationDrawer
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

internal class ComponentListFragment : Fragment() {

    private val _componentListViewModel: ComponentListViewModel by activityViewModels()
    private var _binding: FragmentComponentListBinding? = null
    private var lastSelectedKey: ComponentKey? = null
    private var _navHeaderBinding: LayoutMainHeaderBinding? = null
    private val navController by lazy { findMainNavController() }
    private val componentsListAdapter by lazy { ComponentListAdapter() }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return FragmentComponentListBinding.inflate(inflater, container, false).also {
            _binding = it
            initView()
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _componentListViewModel.currentTheme
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach {
                componentsListAdapter.updateTheme(requireContext(), it)
                updateThemePicker(it)
            }
            .launchIn(lifecycleScope)

        _componentListViewModel.componentItems
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { updateNavigation(it) }
            .launchIn(lifecycleScope)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        _navHeaderBinding = null
    }

    private fun initView() = _binding?.apply {
        _navHeaderBinding = if (navView != null) {
            LayoutMainHeaderBinding.bind(navView.inflateHeader(R.layout.layout_main_header))
        } else {
            mainHeader
        }
        _navHeaderBinding?.apply {
            val hasMultipleThemes = allViewThemes.size > 1
            root.isFocusable = hasMultipleThemes
            val disclosureIcon = if (hasMultipleThemes) com.sdds.icons.R.drawable.ic_disclosure_down_outline_16 else 0
            headerTitle.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, disclosureIcon, 0)
            root.setOnClickListener { showThemePicker() }
        }

        componentList?.apply {
            adapter = componentsListAdapter
            addItemDecoration(
                VerticalSpaceBetweenDecorator(
                    resources.getDimensionPixelSize(R.dimen.sandbox_component_list_spacing),
                ),
            )
            componentsListAdapter.setInteractionListener { component ->
                onNavDestinationSelected(component, navController, false)
            }
        }
    }

    private fun updateNavigation(menuItems: List<MenuItem>) = _binding?.apply {
        if (navView != null) {
            navView.populateMenu(menuItems, navController)
            navController.addOnDestinationChangedListener { _, destination, _ ->
                navView.setSelected(
                    destination.id,
                )
            }
        } else {
            componentsListAdapter.updateComponents(menuItems)
        }
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
    private fun onNavDestinationSelected(
        menuItem: MenuItem,
        navController: NavController,
        asTopLevel: Boolean = true,
    ): Boolean {
        val builder = NavOptions.Builder()
            .setLaunchSingleTop(true)
            .setRestoreState(true)
            .apply {
                if (!asTopLevel) {
                    setEnterAnim(R.anim.slide_in_right)
                    setExitAnim(R.anim.slide_out_left)
                    setPopEnterAnim(R.anim.slide_in_left)
                    setPopExitAnim(R.anim.slide_out_right)
                }
            }
        navController.currentBackStackEntry?.destination?.id.takeIf { asTopLevel }?.let { prev ->
            builder.setPopUpTo(prev, true)
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
        val anchorView = _navHeaderBinding?.root ?: return
        ThemeSwitcher(requireContext()).show(anchorView)
    }

    private fun updateThemePicker(currentTheme: Theme) {
        _navHeaderBinding?.apply {
            headerTitle.text = currentTheme.name
            headerLabel.isVisible = false
        }
    }
}

private class ComponentListAdapter : RecyclerView.Adapter<ComponentListAdapter.ComponentViewHolder>() {
    private val components = mutableListOf<MenuItem>()
    private var themedContext: ContextThemeWrapper = ContextThemeWrapper()
    private var interactionListener: InteractionListener? = null

    /**
     * Слушатель взаимодействий со списком свойств
     */
    fun interface InteractionListener {

        /**
         * Выбор компонента [item]
         */
        fun onSelect(item: MenuItem)
    }

    fun updateTheme(context: Context, theme: Theme) {
        themedContext = ContextThemeWrapper(context, viewTheme(theme).themeRes)
    }

    fun updateComponents(components: List<MenuItem>) {
        val diffCallback = ComponentsDiffUtilCallback(this.components, components)
        val diffResult = DiffUtil.calculateDiff(diffCallback)
        this.components.clear()
        this.components.addAll(components)
        diffResult.dispatchUpdatesTo(this)
    }

    /**
     * Устанавливает слушатель взаимодействий [interactionListener]
     * @see InteractionListener
     */
    fun setInteractionListener(interactionListener: InteractionListener?) {
        this.interactionListener = interactionListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentViewHolder {
        return ComponentViewHolder(
            LayoutComponentItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            ),
            components[viewType],
        )
    }

    override fun getItemCount(): Int = components.size

    override fun getItemId(position: Int): Long = components[position].id.toLong()

    override fun getItemViewType(position: Int): Int = position

    override fun onBindViewHolder(holder: ComponentViewHolder, position: Int) = Unit

    inner class ComponentViewHolder(
        itemViewBinding: LayoutComponentItemBinding,
        private val component: MenuItem,
    ) : RecyclerView.ViewHolder(itemViewBinding.root) {

        init {
            itemViewBinding.apply {
                componentName.text = component.title
                componentPreview.apply {
                    removeAllViews()
                    val preview = component.preview(themedContext, component.previewStyle)
                    val previewParams = preview.layoutParams
                        ?.let { FrameLayout.LayoutParams(it) }
                        ?: FrameLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
                    addView(preview, previewParams.apply { gravity = Gravity.CENTER })
                }
                root.setOnClickListener { interactionListener?.onSelect(component) }
            }
        }
    }
}

private class ComponentsDiffUtilCallback(
    private val old: List<MenuItem>,
    private val new: List<MenuItem>,
) : DiffUtil.Callback() {
    override fun getOldListSize(): Int = old.size

    override fun getNewListSize(): Int = new.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition].id == new[newItemPosition].id
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return old[oldItemPosition] == new[newItemPosition]
    }
}
