package com.sdds.uikit.fixtures.samples.notification.content

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import com.sdds.docs.DocSample
import com.sdds.uikit.fixtures.databinding.SamplesNotificationContentBinding

@DocSample
fun NotificationContent_Simple(context: Context): View {
    val binding = SamplesNotificationContentBinding.inflate(LayoutInflater.from(context))
    return binding.notificationContentSimple
}
