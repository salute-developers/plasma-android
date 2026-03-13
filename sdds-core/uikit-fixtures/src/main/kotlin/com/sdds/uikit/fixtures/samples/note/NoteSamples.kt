package com.sdds.uikit.fixtures.samples.note

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesNoteBinding

@DocSample
fun Note_Simple(context: Context): View {
    val binding = SamplesNoteBinding.inflate(LayoutInflater.from(context))
    return binding.noteSimple
}

@DocSample
fun NoteCompact_Simple(context: Context): View {
    val binding = SamplesNoteBinding.inflate(LayoutInflater.from(context))
    return binding.noteCompactSimple
}
