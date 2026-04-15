package com.sdds.uikit.fixtures.samples.select

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.dropdown.DropdownEmptyStateView
import com.sdds.uikit.fixtures.databinding.SamplesSelectBinding

@DocSample
fun Select_Trigger_Button(context: Context): View {
    val binding = SamplesSelectBinding.inflate(LayoutInflater.from(context))
    return binding.selectTriggerButton
}

@DocSample
fun Select_EmptyState(context: Context): View {
    val binding = SamplesSelectBinding.inflate(LayoutInflater.from(context))
    return binding.selectTriggerButton.also { select ->
        codeSnippet {
            select.setDropdownEmptyStateView(
                DropdownEmptyStateView(context).apply {
                    setDescription("Список пуст")
                },
            )
        }
    }
}
