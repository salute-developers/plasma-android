package com.sdds.uikit.fixtures.samples.overlay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesOverlayBinding

@DocSample(needScreenshot = false)
fun Overlay_Simple(context: Context): View {
    val binding = SamplesOverlayBinding.inflate(LayoutInflater.from(context))
    return binding.overlaySimple
}
