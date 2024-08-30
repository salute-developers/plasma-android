package com.sdds.playground.sandbox.core.view

import android.os.Build
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout.LayoutParams
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.sdds.playground.sandbox.databinding.FragmentComponentScaffoldBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

/**
 * Базовый фрагмент для отображения компонента
 * @author Малышев Александр on 31.07.2024
 */
internal abstract class ComponentFragment : Fragment(), PropertiesAdapter.InteractionListener {

    private var _binding: FragmentComponentScaffoldBinding? = null
    private val propertiesAdapter: PropertiesAdapter = PropertiesAdapter()
    private var currentProperty: Property<*>? = null

    protected open val defaultLayoutParams: LayoutParams =
        LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)

    abstract val componentLayout: View

    abstract val propertiesOwner: PropertiesOwner

    protected inline fun <reified T> getDefaultState(): T? {
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            arguments?.getParcelable(DESTINATION_MESSAGE_ARG, T::class.java)
        } else {
            return arguments?.getParcelable(DESTINATION_MESSAGE_ARG)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        _binding = FragmentComponentScaffoldBinding.inflate(inflater, container, false)
        dispatchComponentStyleChanged()
        _binding?.apply {
            propertiesRecyclerView.itemAnimator = null
            propertiesRecyclerView.adapter = propertiesAdapter
            propertiesRecyclerView.addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            propertiesAdapter.setInteractionListener(this@ComponentFragment)
            header.propertyValueHeader.setOnClickListener { propertiesOwner.resetToDefault() }
        }
        requireActivity().supportFragmentManager.setFragmentResultListener(
            EditorFragment.CONFIRM_RESULT_KEY,
            viewLifecycleOwner,
        ) { requestKey, bundle ->
            if (requestKey != EditorFragment.CONFIRM_RESULT_KEY) return@setFragmentResultListener
            val editedProperty = currentProperty ?: return@setFragmentResultListener
            val newValue = bundle.getString(EditorFragment.CONFIRM_VALUE).orEmpty()
            propertiesOwner.updateProperty(editedProperty.name, newValue)
        }
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        propertiesOwner.properties
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { propertiesAdapter.updateProperties(it) }
            .launchIn(viewLifecycleOwner.lifecycleScope)
    }

    protected fun dispatchComponentStyleChanged(layoutParams: LayoutParams = defaultLayoutParams) {
        _binding?.componentContainer?.apply {
            removeAllViews()
            layoutParams.gravity = Gravity.CENTER
            addView(componentLayout, layoutParams)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        propertiesAdapter.setInteractionListener(null)
        currentProperty = null
        _binding?.propertiesRecyclerView?.adapter = null
        _binding = null
    }

    override fun onSelect(property: Property<*>) {
        currentProperty = property
        when (property) {
            is Property.BooleanProperty -> propertiesOwner.updateProperty(property.name, !property.value)
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

    companion object {
        const val DESTINATION_MESSAGE_ARG = "DestinationMessage"
    }
}
