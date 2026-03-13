package com.sdds.uikit.fixtures.samples.textarea

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesTextfieldBinding

@DocSample
fun TextArea_Simple(context: Context): View {
    val binding = SamplesTextfieldBinding.inflate(LayoutInflater.from(context))
    return binding.textAreaSimple
}
