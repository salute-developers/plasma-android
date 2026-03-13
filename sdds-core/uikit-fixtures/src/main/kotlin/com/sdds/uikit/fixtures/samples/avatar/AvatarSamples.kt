package com.sdds.uikit.fixtures.samples.avatar

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesAvatarBinding

@DocSample
fun Avatar_Simple(context: Context): View {
    val binding = SamplesAvatarBinding.inflate(LayoutInflater.from(context))
    return binding.avatarSimple
}
