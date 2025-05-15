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
import androidx.core.view.OnApplyWindowInsetsListener
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.doOnPreDraw
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.HasDefaultViewModelProviderFactory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.Theme
import com.sdds.playground.sandbox.core.integration.component.ComponentKey
import com.sdds.playground.sandbox.databinding.FragmentComponentScaffoldBinding
import com.sdds.playground.sandbox.viewTheme
import com.sdds.testing.vs.UiState
import com.sdds.uikit.FrameLayout
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Базовый фрагмент для отображения компонента
 * @author Малышев Александр on 31.07.2024
 */
internal abstract class ComponentFragment<State : UiState, Component : View, VM : ComponentViewModel<State>> :
    Fragment(), HasDefaultViewModelProviderFactory {

    private var _sheetBehavior: BottomSheetBehavior<ViewGroup>? = null
    private var _binding: FragmentComponentScaffoldBinding? = null
    private var verticalScrollView: ScrollView? = null
    private var horizontalScrollView: HorizontalScrollView? = null
    private var currentVariant = ""
    protected var componentRef: Component? = null
    private val componentContainer
        get() = _binding?.root?.findViewById<FrameLayout>(R.id.component_container_id)

    private var _propsBottomSheetDelegate: PropertiesBottomSheetDelegate? = null

    protected open val defaultLayoutParams: LayoutParams =
        LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

    protected open val defaultGravity: Int = Gravity.CENTER

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
    protected abstract val viewModelFactory: ViewModelProvider.Factory

    private val _componentViewModel: ComponentViewModel<State> by viewModels(factoryProducer = { viewModelFactory })

    @Suppress("UNCHECKED_CAST")
    protected val componentViewModel: VM get() = _componentViewModel as VM

    override val defaultViewModelProviderFactory: ViewModelProvider.Factory
        get() = viewModelFactory

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
        return _binding?.root
    }

    private fun createComponentContainer(@StyleRes themeRes: Int): FrameLayout =
        FrameLayout(ContextThemeWrapper(requireContext(), themeRes))
            .apply {
                id = R.id.component_container_id
                isFocusable = false
                clipChildren = false
                setOnClickListener {
                    _sheetBehavior?.state = BottomSheetBehavior.STATE_COLLAPSED
                    view?.findFocus()?.clearFocus()
                }
            }

    private fun createProperties() = _binding?.run {
        val behavior = runCatching { BottomSheetBehavior.from<ViewGroup>(componentPropsSheet) }.getOrNull()

        _sheetBehavior = behavior
        if (behavior != null) {
            behavior.peekHeight = resources.getDimensionPixelSize(R.dimen.sandbox_properties_header_height)
            behavior.isFitToContents = false
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
            _propsBottomSheetDelegate = PropertiesBottomSheetDelegate(behavior).also {
                behavior.addBottomSheetCallback(it)
            }
            ViewCompat.setOnApplyWindowInsetsListener(root, _propsBottomSheetDelegate)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createProperties()
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

        componentViewModel.showEditor
            .onEach { showEditor(it) }
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
            _propsBottomSheetDelegate?.run { offsetComponentLayout(currentOffset) }
        }
    }

    private fun dispatchComponentStyleChanged(layoutParams: LayoutParams = defaultLayoutParams) {
        componentContainer?.apply {
            removeAllViews()
            layoutParams.gravity = defaultGravity
            val wrappedComponent = getComponentLayout()
                .let {
                    when (scrollMode) {
                        ScrollMode.VERTICAL -> it.verticalScrollable()
                        ScrollMode.HORIZONTAL -> it.horizontalScrollable()
                        ScrollMode.NONE -> it
                    }
                }
            addView(wrappedComponent, layoutParams)
            wrappedComponent.doOnPreDraw {
                _propsBottomSheetDelegate?.run { offsetComponentLayout(currentOffset) }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        verticalScrollView = null
        horizontalScrollView = null
        _binding = null
        componentRef = null
    }

    private fun showEditor(property: Property<*>) {
        val editor = when (property) {
            is Property.SingleChoiceProperty -> EditorFragment.choiceEditor(
                propertyName = property.name,
                currentValue = property.value,
                choices = property.variants,
            )

            is Property.IntProperty -> EditorFragment.textEditor(
                propertyName = property.name,
                currentValue = property.value.toString(),
            )

            is Property.StringProperty -> EditorFragment.textEditor(
                propertyName = property.name,
                currentValue = property.value,
            )

            else -> return
        }
        childFragmentManager.beginTransaction()
            .setCustomAnimations(
                R.anim.slide_in_right,
                R.anim.slide_out_left,
                R.anim.slide_in_left,
                R.anim.slide_out_right,
            )
            .replace(R.id.component_props_container, editor)
            .addToBackStack(property.name)
            .commit()
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

    private inner class PropertiesBottomSheetDelegate(
        private val behavior: BottomSheetBehavior<ViewGroup>,
    ) : BottomSheetBehavior.BottomSheetCallback(), OnApplyWindowInsetsListener {

        var currentOffset: Float = 0f
        var previousState: Int? = null

        override fun onStateChanged(bottomSheet: View, newState: Int) = Unit

        override fun onSlide(bottomSheet: View, slideOffset: Float) {
            currentOffset = (slideOffset * bottomSheet.height)
            offsetComponentLayout(currentOffset)
        }

        fun offsetComponentLayout(offset: Float) {
            val component = componentRef ?: return
            component.translationY = -offset.coerceAtMost(component.top.toFloat())
        }

        override fun onApplyWindowInsets(v: View, insets: WindowInsetsCompat): WindowInsetsCompat {
            val imeVisible = insets.isVisible(WindowInsetsCompat.Type.ime())
            if (imeVisible) {
                previousState = behavior.state
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            } else if (previousState != null) {
                behavior.state = previousState ?: return insets
                previousState = null
            }
            return insets
        }
    }

    companion object {
        const val DESTINATION_MESSAGE_ARG = "DestinationMessage"
        const val COMPONENT_KEY_ARG = "componentKey"
    }
}
