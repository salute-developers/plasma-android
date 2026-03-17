package com.sdds.uikit.fixtures.samples.button.group

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesButtonGroupBinding

@DocSample
fun IconButtonGroup_Simple(context: Context): View {
    val binding = SamplesButtonGroupBinding.inflate(LayoutInflater.from(context))
    return binding.iconButtonGroupSimple
}
