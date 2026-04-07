package com.sdds.uikit.fixtures.samples.cell

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCellLayoutBinding

@DocSample
fun CellLayout_Simple(context: Context): View {
    val binding = SamplesCellLayoutBinding.inflate(LayoutInflater.from(context))
    return binding.cellSimple
}
