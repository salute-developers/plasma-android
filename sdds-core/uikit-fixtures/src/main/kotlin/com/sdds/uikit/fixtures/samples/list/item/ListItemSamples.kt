package com.sdds.uikit.fixtures.samples.list.item

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesListItemBinding

@DocSample
fun ListItem_Simple(context: Context): View {
    val binding = SamplesListItemBinding.inflate(LayoutInflater.from(context))
    return binding.listItemSimple
}
