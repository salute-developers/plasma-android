package com.sdds.uikit.fixtures.samples.rectskeleton

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesRectSkeletonBinding

@DocSample
fun RectSkeleton_Simple(context: Context): View {
    val binding = SamplesRectSkeletonBinding.inflate(LayoutInflater.from(context))
    return binding.rectSkeletonSimple
}
