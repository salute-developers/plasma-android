package com.sdds.uikit.fixtures.samples.radiobox

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesRadioboxBinding

@DocSample
fun RadioBox_Simple(context: Context): View {
    val binding = SamplesRadioboxBinding.inflate(LayoutInflater.from(context))
    return binding.radioBoxSimple
}
