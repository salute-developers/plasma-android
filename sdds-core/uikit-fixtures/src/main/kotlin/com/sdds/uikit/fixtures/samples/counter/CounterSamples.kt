package com.sdds.uikit.fixtures.samples.counter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCounterBinding

@DocSample
fun Counter_Simple(context: Context): View {
    val binding = SamplesCounterBinding.inflate(LayoutInflater.from(context))
    return binding.counterSimple
}
