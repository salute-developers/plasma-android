package com.sdds.uikit.fixtures.samples.button

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.Button
import com.sdds.uikit.fixtures.databinding.SamplesButtonBinding

@DocSample
fun LinkButton_Simple(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.linkButtonSimple
}

@DocSample
fun LinkButton_LabelValue_Packed(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.linkButtonLabelValuePacked.also { button ->
        codeSnippet {
            button.text = "Label"
            button.value = "Value"
            button.spacing = Button.Spacing.Packed
        }
    }
}

@DocSample
fun LinkButton_LabelValue_SpaceBetween(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.linkButtonLabelValueSpaceBetween.also { button ->
        codeSnippet {
            button.spacing = Button.Spacing.SpaceBetween
        }
    }
}

@DocSample
fun LinkButton_isLoading(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.linkButtonSimple.also { button ->
        codeSnippet {
            button.isLoading = true
        }
    }
}
