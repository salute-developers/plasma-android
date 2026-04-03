package com.sdds.uikit.fixtures.samples.toolbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesToolbarBinding

@DocSample
fun ToolBar_Simple(context: Context): View {
    val binding = SamplesToolbarBinding.inflate(LayoutInflater.from(context))
    return binding.toolbarSimple
}
