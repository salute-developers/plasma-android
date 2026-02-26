package com.sdds.plasma.homeds.sandbox

import android.os.Bundle
import com.sdds.compose.sandbox.ui.SandboxActivity
import com.sdds.compose.uikit.fixtures.stories.registerCoreStories

class AppActivity : SandboxActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        registerCoreStories()
        super.onCreate(savedInstanceState)
    }
}