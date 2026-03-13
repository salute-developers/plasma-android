package com.sdds.uikit.fixtures.samples.carousel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesCarouselBinding

@DocSample
fun Carousel_Simple(context: Context): View {
    val binding = SamplesCarouselBinding.inflate(LayoutInflater.from(context))
    return binding.carouselSimple
}
