package com.sdds.uikit.fixtures.samples.chip

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesChipBinding

@DocSample
fun Chip_Simple(context: Context): View {
    val binding = SamplesChipBinding.inflate(LayoutInflater.from(context))
    return binding.chipSimple
}
