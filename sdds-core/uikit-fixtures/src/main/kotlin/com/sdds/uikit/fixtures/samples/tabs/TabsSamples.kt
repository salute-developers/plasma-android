package com.sdds.uikit.fixtures.samples.tabs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesTabsBinding

@DocSample
fun Tabs_Simple(context: Context): View {
    val binding = SamplesTabsBinding.inflate(LayoutInflater.from(context))
    return binding.tabsSimple
}
