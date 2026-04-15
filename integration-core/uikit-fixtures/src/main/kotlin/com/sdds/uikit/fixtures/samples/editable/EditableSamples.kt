package com.sdds.uikit.fixtures.samples.editable

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.docs.codeSnippet
import com.sdds.uikit.Editable
import com.sdds.uikit.fixtures.databinding.SamplesEditableBinding

@DocSample
fun Editable_MultiLine_Icon_Absolute(context: Context): View {
    val binding = SamplesEditableBinding.inflate(LayoutInflater.from(context))
    return binding.editableSimple.also { editable ->
        codeSnippet {
            editable.setText("Value \n Some description")
            editable.iconPlacement = Editable.ICON_PLACEMENT_ABSOLUTE
            editable.gravity = Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL
        }
    }
}

@DocSample
fun Editable_SingleLine_Icon_Relative(context: Context): View {
    val binding = SamplesEditableBinding.inflate(LayoutInflater.from(context))
    return binding.editableSingleLineIconRelative.also { editable ->
        codeSnippet {
            editable.setText("Value")
            editable.setSingleLine()
            editable.iconPlacement = Editable.ICON_PLACEMENT_RELATIVE
        }
    }
}
