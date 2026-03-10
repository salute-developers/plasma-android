package com.sdds.uikit.fixtures.samples.accordion

import android.content.Context
import android.view.LayoutInflater
import com.sdds.docs.DocSample
import com.sdds.uikit.Accordion
import com.sdds.uikit.fixtures.databinding.SamplesAccordionBinding

@DocSample
fun Accordion_Simple(context: Context): Accordion {
    val binding = SamplesAccordionBinding.inflate(LayoutInflater.from(context))
    return binding.accordionSimple
}
