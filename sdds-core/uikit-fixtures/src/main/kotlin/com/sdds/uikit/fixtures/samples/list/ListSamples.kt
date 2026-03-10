package com.sdds.uikit.fixtures.samples.list

import android.content.Context
import android.view.LayoutInflater
import com.sdds.docs.DocSample
import com.sdds.uikit.ListView
import com.sdds.uikit.fixtures.databinding.SamplesListBinding

@DocSample
fun List_Simple(context: Context): ListView {
    val binding = SamplesListBinding.inflate(LayoutInflater.from(context))
    return binding.listSimple
}
