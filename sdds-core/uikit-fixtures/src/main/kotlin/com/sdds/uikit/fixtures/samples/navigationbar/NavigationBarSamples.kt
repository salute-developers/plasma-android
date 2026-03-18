package com.sdds.uikit.fixtures.samples.navigationbar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesNavigationbarBinding

@DocSample
fun NavigationBar_Simple(context: Context): View {
    val binding = SamplesNavigationbarBinding.inflate(LayoutInflater.from(context))
    return binding.navigationBarSimple
}
