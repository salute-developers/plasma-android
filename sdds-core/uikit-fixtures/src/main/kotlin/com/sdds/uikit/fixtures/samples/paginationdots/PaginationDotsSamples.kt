package com.sdds.uikit.fixtures.samples.paginationdots

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesPaginationDotsBinding

@DocSample
fun PaginationDots_Simple(context: Context): View {
    val binding = SamplesPaginationDotsBinding.inflate(LayoutInflater.from(context))
    return binding.paginationDotsSimple
}

@DocSample
fun PaginationDots_Vertical(context: Context): View {
    val binding = SamplesPaginationDotsBinding.inflate(LayoutInflater.from(context))
    return binding.paginationDotsVertical
}
