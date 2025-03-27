package com.sdds.playground.sandbox.core.vs

import android.os.Build
import android.os.Bundle
import android.view.ContextThemeWrapper
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.FrameLayout.LayoutParams
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.annotation.StyleRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.databinding.FragmentComponentScaffoldBinding
import com.sdds.playground.sandbox.viewTheme
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Divider
import com.sdds.uikit.FrameLayout
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Базовый фрагмент для отображения компонента
 * @author Малышев Александр on 31.07.2024
 */
internal abstract class ComponentFragment<State : UiState, Component : View> :
    Fragment(), PropertiesAdapter.InteractionListener {

    private var _binding: FragmentComponentScaffoldBinding? = null
    private val propertiesAdapter: PropertiesAdapter = PropertiesAdapter()
    private var currentProperty: Property<*>? = null
    private var verticalScrollView: ScrollView? = null
    private var horizontalScrollView: HorizontalScrollView? = null
    private var currentVariant = ""
    protected var componentRef: Component? = null
    private val componentContainer
        get() = _binding?.root?.findViewById<FrameLayout>(R.id.component_container_id)

    protected open val defaultLayoutParams: LayoutParams =
        LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

    private val contextThemeWrapper: ContextThemeWrapper
        get() {
            val style = runCatching {
                componentViewModel.getStyleProvider().styleRes(currentVariant)
            }.getOrElse { 0 }
            return ContextThemeWrapper(componentContainer?.context, style)
        }

    private fun getComponentLayout(): View =
        getComponent(contextThemeWrapper)
            .also { componentRef = it }

    protected val componentKey: ComponentKey by lazy {
        val key = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable(COMPONENT_KEY_ARG, ComponentKey::class.java)
        } else {
            arguments?.getParcelable(COMPONENT_KEY_ARG)
        }
        key ?: throw IllegalArgumentException("ComponentKey has to be provided")
    }
    abstract val componentViewModel: ComponentViewModel<State>

    protected open val scrollMode
        get() = ScrollMode.NONE

    abstract fun getComponent(contextWrapper: ContextThemeWrapper): Component

    open fun shouldRecreateComponentOnStateUpdate(state: State): Boolean = false

    abstract fun onComponentUpdate(component: Component?, state: State)

    protected inline fun <reified T> getState(default: () -> T): T {
        return (
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                arguments?.getParcelable(DESTINATION_MESSAGE_ARG, T::class.java)
            } else {
                arguments?.getParcelable(DESTINATION_MESSAGE_ARG)
            }
            ) ?: default()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentComponentScaffoldBinding.inflate(inflater, container, false)
        dispatchComponentStyleChanged()
        _binding?.apply {
            propertiesRecyclerView.itemAnimator = null
            propertiesRecyclerView.adapter = propertiesAdapter
            propertiesRecyclerView.addItemDecoration(
                Divider.recyclerViewDecoration(
                    requireContext(),
                    RecyclerView.VERTICAL,
                ),
            )
            propertiesAdapter.setInteractionListener(this@ComponentFragment)
            header.propertyValueReset.setOnClickListener { componentViewModel.resetToDefault() }
        }
        requireActivity().supportFragmentManager.setFragmentResultListener(
            EditorFragment.CONFIRM_RESULT_KEY,
            viewLifecycleOwner,
        ) { requestKey, bundle ->
            if (requestKey != EditorFragment.CONFIRM_RESULT_KEY) return@setFragmentResultListener
            val editedProperty = currentProperty ?: return@setFragmentResultListener
            val newValue = bundle.getString(EditorFragment.CONFIRM_VALUE).orEmpty()
            componentViewModel.updateProperty(editedProperty.name, newValue)
        }
        return _binding?.root
    }

    private fun createComponentContainer(@StyleRes themeRes: Int): FrameLayout =
        FrameLayout(ContextThemeWrapper(requireContext(), themeRes))
            .apply {
                id = R.id.component_container_id
                isFocusable = false
                clipChildren = false
                setOnClickListener { view?.findFocus()?.clearFocus() }
            }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        componentViewModel.properties
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { propertiesAdapter.updateProperties(it) }
            .launchIn(viewLifecycleOwner.lifecycleScope)
        componentViewModel.theme
            .onEach {
                dispatchThemeChanged(it)
                dispatchComponentStyleChanged()
                onComponentUpdate(componentRef, componentViewModel.uiState.value)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
        componentViewModel.uiState
            .onEach {
                var dispatchStyleChanged = false
                if (currentVariant != it.variant) {
                    currentVariant = it.variant
                    dispatchStyleChanged = true
                }
                if (shouldRecreateComponentOnStateUpdate(it)) dispatchStyleChanged = true
                if (dispatchStyleChanged) dispatchComponentStyleChanged()
                onComponentUpdate(componentRef, it)
            }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    private fun dispatchThemeChanged(theme: Theme) {
        _binding?.apply {
            componentContainer?.removeAllViews()
            componentCanvas.removeAllViews()
            componentCanvas.addView(
                createComponentContainer(viewTheme(theme).themeRes),
                LayoutParams(MATCH_PARENT, MATCH_PARENT),
            )
        }
    }

    private fun dispatchComponentStyleChanged(layoutParams: LayoutParams = defaultLayoutParams) {
        componentContainer?.apply {
            removeAllViews()
            layoutParams.gravity = Gravity.CENTER
            val wrappedComponent = getComponentLayout()
                .let {
                    when (scrollMode) {
                        ScrollMode.VERTICAL -> it.verticalScrollable()
                        ScrollMode.HORIZONTAL -> it.horizontalScrollable()
                        ScrollMode.NONE -> it
                    }
                }
            addView(wrappedComponent, layoutParams)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        propertiesAdapter.setInteractionListener(null)
        currentProperty = null
        verticalScrollView = null
        horizontalScrollView = null
        _binding?.propertiesRecyclerView?.adapter = null
        _binding = null
        componentRef = null
    }

    override fun onSelect(property: Property<*>) {
        currentProperty = property
        when (property) {
            is Property.BooleanProperty -> componentViewModel.updateProperty(
                property.name,
                !property.value,
            )

            is Property.SingleChoiceProperty -> EditorFragment.choiceEditor(
                propertyName = property.name,
                currentValue = property.value,
                choices = property.variants,
            ).show(childFragmentManager, "SingleChoicePropertyEditor")

            is Property.IntProperty -> EditorFragment.textEditor(
                propertyName = property.name,
                currentValue = property.value.toString(),
            ).show(childFragmentManager, "IntPropertyEditor")

            is Property.StringProperty -> EditorFragment.textEditor(
                propertyName = property.name,
                currentValue = property.value,
            ).show(childFragmentManager, "StringPropertyEditor")
        }
    }

    private fun getVerticalScrollView(): ScrollView =
        verticalScrollView ?: ScrollView(requireContext())
            .apply {
                isVerticalScrollBarEnabled = false
                clipChildren = false
            }
            .also { verticalScrollView = it }

    private fun getHorizontalScrollView(): HorizontalScrollView =
        horizontalScrollView ?: HorizontalScrollView(requireContext())
            .apply {
                isHorizontalScrollBarEnabled = false
                clipChildren = false
            }
            .also { horizontalScrollView = it }

    private fun View.horizontalScrollable(): HorizontalScrollView {
        return getHorizontalScrollView().apply {
            removeAllViews()
            val params = this@horizontalScrollable.layoutParams ?: LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            addView(
                this@horizontalScrollable,
                params,
            )
        }
    }

    private fun View.verticalScrollable(): ScrollView {
        return getVerticalScrollView().apply {
            removeAllViews()
            val params = this@verticalScrollable.layoutParams ?: LayoutParams(
                LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT,
            )
            addView(
                this@verticalScrollable,
                params,
            )
        }
    }

    protected enum class ScrollMode {
        VERTICAL,
        HORIZONTAL,
        NONE,
    }

    companion object {
        const val DESTINATION_MESSAGE_ARG = "DestinationMessage"
        const val COMPONENT_KEY_ARG = "componentKey"
    }
}
