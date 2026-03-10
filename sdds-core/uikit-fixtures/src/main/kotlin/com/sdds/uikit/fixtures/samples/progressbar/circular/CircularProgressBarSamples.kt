package com.sdds.uikit.fixtures.samples.progressbar.circular

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCircullarProgressbarBinding

@DocSample
fun CircularProgressBar_Simple(context: Context): View {
    val binding = SamplesCircullarProgressbarBinding.inflate(LayoutInflater.from(context))
    return binding.circularProgressbarSimple
}
