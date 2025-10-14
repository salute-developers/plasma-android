package com.sdds.playground.sandbox.core.vs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.updatePadding
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.flowWithLifecycle
import androidx.lifecycle.lifecycleScope
import com.sdds.playground.sandbox.R
import com.sdds.playground.sandbox.databinding.FragmentComponentPropsBinding
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

internal class PropertiesFragment : Fragment(), PropertiesAdapter.InteractionListener {

    private val propertiesAdapter: PropertiesAdapter = PropertiesAdapter()
    private var _binding: FragmentComponentPropsBinding? = null
    private val _componentViewModel: ComponentViewModel<*> by viewModels({ requireParentFragment() })

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return FragmentComponentPropsBinding.inflate(inflater, container, false)
            .apply {
                propertiesRecyclerView.itemAnimator = null
                propertiesRecyclerView.adapter = propertiesAdapter
                propertiesRecyclerView.addItemDecoration(
                    VerticalSpaceBetweenDecorator(resources.getDimensionPixelSize(R.dimen.sandbox_properties_spacing)),
                )
                propertiesAdapter.setInteractionListener(this@PropertiesFragment)
                header.propertyValueReset.setOnClickListener { _componentViewModel.resetToDefault() }
                header.headerTitle.text = _componentViewModel.componentKey.value
                header.headerLabel.text = _componentViewModel.componentKey.group.displayName
            }
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _componentViewModel.properties
            .flowWithLifecycle(lifecycle, Lifecycle.State.RESUMED)
            .onEach { propertiesAdapter.updateProperties(it) }
            .launchIn(viewLifecycleOwner.lifecycleScope)

        ViewCompat.setOnApplyWindowInsetsListener(view) { v, insets ->
            v.updatePadding(
                bottom = insets.getInsets(WindowInsetsCompat.Type.systemBars()).bottom,
            )
            insets
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        propertiesAdapter.setInteractionListener(null)
        _binding?.propertiesRecyclerView?.adapter = null
        _binding = null
    }

    override fun onSelect(property: Property<*>) {
        if (property is Property.BooleanProperty) {
            _componentViewModel.updateProperty(
                property.name,
                !property.value,
            )
            return
        }
        _componentViewModel.sendEditPropertyRequest(property)
    }
}
