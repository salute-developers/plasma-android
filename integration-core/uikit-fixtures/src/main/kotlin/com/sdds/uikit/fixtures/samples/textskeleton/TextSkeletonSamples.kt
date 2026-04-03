package com.sdds.uikit.fixtures.samples.textskeleton

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesTextSkeletonBinding

@DocSample(needScreenshot = false)
fun TextSkeleton_Simple(context: Context): View {
    val binding = SamplesTextSkeletonBinding.inflate(LayoutInflater.from(context))
    return binding.textSkeletonSimple
}
