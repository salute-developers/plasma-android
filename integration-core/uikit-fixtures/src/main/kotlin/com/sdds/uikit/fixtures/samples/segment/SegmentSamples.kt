package com.sdds.uikit.fixtures.samples.segment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesSegmentBinding

@DocSample
fun Segment_Simple(context: Context): View {
    val binding = SamplesSegmentBinding.inflate(LayoutInflater.from(context))
    return binding.segmentSimple
}
