package com.sdds.uikit.fixtures.samples.card

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCardBinding

@DocSample
fun Card_Simple(context: Context): View {
    val binding = SamplesCardBinding.inflate(LayoutInflater.from(context))
    return binding.cardSimple
}
