package com.sdds.uikit.fixtures.samples.button

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.Button
import com.sdds.uikit.fixtures.databinding.SamplesButtonBinding

@DocSample
fun BasicButton_Simple(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.buttonSimple
}

@DocSample
fun BasicButton_LabelValue_Packed(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.buttonLabelValuePacked.also { button ->
        codeSnippet {
            button.text = "Label 2"
            button.value = "Value"
            button.spacing = Button.Spacing.Packed
        }
    }
}

@DocSample
fun BasicButton_LabelValue_SpaceBetween(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.buttonLabelValueSpaceBetween.also { button ->
        codeSnippet {
            button.spacing = Button.Spacing.SpaceBetween
        }
    }
}

@DocSample
fun BasicButton_isLoading(context: Context): View {
    val binding = SamplesButtonBinding.inflate(LayoutInflater.from(context))
    return binding.buttonSimple.also { button ->
        codeSnippet {
            button.isLoading = true
        }
    }
}
