package com.sdds.uikit.fixtures.samples.badge

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesBadgeBinding

@DocSample
fun Badge_Simple(context: Context): View {
    val binding = SamplesBadgeBinding.inflate(LayoutInflater.from(context))
    return binding.badgeSimple
}
