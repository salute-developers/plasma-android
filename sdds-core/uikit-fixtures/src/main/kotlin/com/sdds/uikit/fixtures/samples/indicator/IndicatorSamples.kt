package com.sdds.uikit.fixtures.samples.indicator

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesIndicatorBinding

@DocSample
fun Indicator_Simple(context: Context): View {
    val binding = SamplesIndicatorBinding.inflate(LayoutInflater.from(context))
    return binding.indicatorSimple
}
