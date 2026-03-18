package com.sdds.uikit.fixtures.samples.file

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesFileBinding

@DocSample
fun File_Simple(context: Context): View {
    val binding = SamplesFileBinding.inflate(LayoutInflater.from(context))
    return binding.fileSimple
}
