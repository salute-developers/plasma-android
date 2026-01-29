package com.sdds.uikit.fixtures.samples.button

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.fixtures.databinding.SamplesButtonBinding

@DocSample
fun IconButton_Simple(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.iconButtonSimple
}

@DocSample
fun IconButton_isLoading(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.iconButtonSimple.also { button ->
        codeSnippet {
            button.isLoading = true
        }
    }
}
