package com.sdds.uikit.fixtures.samples.codefield

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCodefieldBinding

@DocSample
fun CodeField_Simple(context: Context): View {
    val binding = SamplesCodefieldBinding.inflate(LayoutInflater.from(context))
    return binding.codeFieldSimple
}
