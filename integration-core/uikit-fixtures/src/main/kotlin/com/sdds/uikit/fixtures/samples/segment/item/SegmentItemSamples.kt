package com.sdds.uikit.fixtures.samples.segment.item

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSegmentItemBinding

@DocSample
fun SegmentItem_Simple(context: Context): View {
    val binding = SamplesSegmentItemBinding.inflate(LayoutInflater.from(context))
    return binding.segmentItemSimple
}
