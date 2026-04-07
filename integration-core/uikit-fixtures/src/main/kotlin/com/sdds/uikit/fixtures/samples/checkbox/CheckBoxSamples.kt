package com.sdds.uikit.fixtures.samples.checkbox

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCheckboxBinding

@DocSample
fun CheckBox_Simple(context: Context): View {
    val binding = SamplesCheckboxBinding.inflate(LayoutInflater.from(context))
    return binding.checkboxSimple
}
