package com.sdds.uikit.fixtures.samples.avatar.group

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesAvatarGroupBinding

@DocSample
fun AvatarGroup_Simple(context: Context): View {
    val binding = SamplesAvatarGroupBinding.inflate(LayoutInflater.from(context))
    return binding.avatarGroupSimple
}
