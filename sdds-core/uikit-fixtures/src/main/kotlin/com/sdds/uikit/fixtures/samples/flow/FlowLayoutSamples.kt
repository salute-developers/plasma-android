package com.sdds.uikit.fixtures.samples.flow

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesFlowLayoutBinding

@DocSample
fun FlowLayout_Simple(context: Context): View {
    val binding = SamplesFlowLayoutBinding.inflate(LayoutInflater.from(context))
    return binding.flowlayoutSimple
}
