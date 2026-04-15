package com.sdds.uikit.fixtures.samples.textfield

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesTextfieldBinding

@DocSample
fun TextField_Simple(context: Context): View {
    val binding = SamplesTextfieldBinding.inflate(LayoutInflater.from(context))
    return binding.textFieldSimple
}
