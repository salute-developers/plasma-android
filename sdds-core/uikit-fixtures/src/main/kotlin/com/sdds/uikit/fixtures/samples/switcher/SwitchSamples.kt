package com.sdds.uikit.fixtures.samples.switcher

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSwitchBinding

@DocSample
fun Switch_Simple(context: Context): View {
    val binding = SamplesSwitchBinding.inflate(LayoutInflater.from(context))
    return binding.switchSimple
}
