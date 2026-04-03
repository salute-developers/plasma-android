package com.sdds.uikit.fixtures.samples.checkbox.group

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCheckboxGroupBinding

@DocSample
fun CheckBoxGroup_Simple(context: Context): View {
    val binding = SamplesCheckboxGroupBinding.inflate(LayoutInflater.from(context))
    return binding.checkboxGroupSimple
}
