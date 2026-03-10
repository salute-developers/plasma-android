package com.sdds.uikit.fixtures.samples.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSliderBinding

@DocSample
fun Slider_Simple(context: Context): View {
    val binding = SamplesSliderBinding.inflate(LayoutInflater.from(context))
    return binding.sliderSimple
}
