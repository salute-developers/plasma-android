package com.sdds.uikit.fixtures.samples.scrollbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesScrollbarBinding

@DocSample(needScreenshot = false)
fun ScrollBar_Simple(context: Context): View {
    val binding = SamplesScrollbarBinding.inflate(LayoutInflater.from(context))
    return binding.scrollBarSimple
}
