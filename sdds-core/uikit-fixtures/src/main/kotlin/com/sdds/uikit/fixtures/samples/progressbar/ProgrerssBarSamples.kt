package com.sdds.uikit.fixtures.samples.progressbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesProgressBinding

@DocSample
fun ProgressBar_Simple(context: Context): View {
    val binding = SamplesProgressBinding.inflate(LayoutInflater.from(context))
    return binding.progressbarSimple
}
