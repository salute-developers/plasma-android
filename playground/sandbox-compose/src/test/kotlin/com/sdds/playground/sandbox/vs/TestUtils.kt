package com.sdds.playground.sandbox.vs

import android.content.Intent
import android.os.Parcelable
import androidx.core.os.bundleOf
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import com.sdds.playground.sandbox.activities.vs.SandboxActivity
import com.sdds.playground.sandbox.core.vs.ComponentFragment.Companion.DESTINATION_MESSAGE_ARG

fun launchScreen(
    destinationId: Int,
    state: Parcelable,

) {
    val intent = Intent(ApplicationProvider.getApplicationContext(), SandboxActivity::class.java)
    intent.putExtra(SandboxActivity.DESTINATION_ID_ARG, destinationId)
    intent.putExtra(DESTINATION_MESSAGE_ARG, bundleOf(DESTINATION_MESSAGE_ARG to state))
    ActivityScenario.launch<SandboxActivity>(intent)
}
