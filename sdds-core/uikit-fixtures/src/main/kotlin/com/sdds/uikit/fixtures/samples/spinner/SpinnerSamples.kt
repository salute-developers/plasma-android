package com.sdds.uikit.fixtures.samples.spinner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSpinnerBinding

@DocSample
fun Spinner_Simple(context: Context): View {
    val binding = SamplesSpinnerBinding.inflate(LayoutInflater.from(context))
    return binding.spinnerSimple
}
