package com.sdds.uikit.fixtures.samples.codeinput

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCodeinputBinding

@DocSample
fun CodeInput_Simple(context: Context): View {
    val binding = SamplesCodeinputBinding.inflate(LayoutInflater.from(context))
    return binding.codeInputSimple
}
