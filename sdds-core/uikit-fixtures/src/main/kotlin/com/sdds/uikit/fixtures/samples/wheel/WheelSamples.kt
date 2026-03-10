package com.sdds.uikit.fixtures.samples.wheel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesWheelBinding

@DocSample
fun Wheel_Simple(context: Context): View {
    val binding = SamplesWheelBinding.inflate(LayoutInflater.from(context))
    return binding.wheelSimple
}
