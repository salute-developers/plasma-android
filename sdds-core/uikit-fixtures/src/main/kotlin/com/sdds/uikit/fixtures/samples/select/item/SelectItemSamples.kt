package com.sdds.uikit.fixtures.samples.select.item

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSelectItemBinding

@DocSample
fun SelectItem_Simple(context: Context): View {
    val binding = SamplesSelectItemBinding.inflate(LayoutInflater.from(context))
    return binding.selectItemSimple
}
