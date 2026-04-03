package com.sdds.uikit.fixtures.samples.chip.group

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesChipGroupBinding

@DocSample
fun ChipGroup_Simple(context: Context): View {
    val binding = SamplesChipGroupBinding.inflate(LayoutInflater.from(context))
    return binding.chipGroupSimple
}
