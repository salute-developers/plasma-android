package com.sdds.uikit.fixtures.samples.draver

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesDrawerBinding
import com.sdds.uikit.fixtures.databinding.SamplesDrawerLayoutBinding

@DocSample(needScreenshot = false)
fun DrawerLayout_Simple(context: Context): View {
    val binding = SamplesDrawerLayoutBinding.inflate(LayoutInflater.from(context))
    return binding.drawerLayoutSimple
}

@DocSample(needScreenshot = false)
fun DrawerLayout_WithDrawer(context: Context): View {
    val binding = SamplesDrawerBinding.inflate(LayoutInflater.from(context))
    return binding.drawerLayoutWithDrawer
}
