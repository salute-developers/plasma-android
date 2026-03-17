package com.sdds.uikit.fixtures.samples.divider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesDividerBinding

@DocSample
fun Divider_Simple(context: Context): View {
    val binding = SamplesDividerBinding.inflate(LayoutInflater.from(context))
    return binding.dividerSimple
}
