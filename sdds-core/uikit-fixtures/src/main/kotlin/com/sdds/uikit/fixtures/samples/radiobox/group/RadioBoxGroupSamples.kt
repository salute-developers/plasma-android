package com.sdds.uikit.fixtures.samples.radiobox.group

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesRadioboxGroupBinding

@DocSample
fun RadioBoxGroup_Simple(context: Context): View {
    val binding = SamplesRadioboxGroupBinding.inflate(LayoutInflater.from(context))
    return binding.radioBoxGroupSimple
}
