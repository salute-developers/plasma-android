package com.sdds.uikit.fixtures.samples.loader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesLoaderBinding

@DocSample
fun Loader_Simple(context: Context): View {
    val binding = SamplesLoaderBinding.inflate(LayoutInflater.from(context))
    return binding.loaderSimple
}
