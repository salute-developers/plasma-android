package com.sdds.uikit.fixtures.samples.autocompelete

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesAutocompleteBinding

@DocSample
fun Autocomplete_Simple(context: Context): View {
    val binding = SamplesAutocompleteBinding.inflate(LayoutInflater.from(context))
    return binding.autocompleteSimple
}
