package com.sdds.serv

import android.app.Application
import android.content.pm.ActivityInfo
import android.graphics.Bitmap
import android.view.View
import androidx.activity.ComponentActivity
import androidx.compose.ui.graphics.PixelMap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.graphics.toPixelMap
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.core.app.ApplicationProvider
import com.github.takahirom.roborazzi.RoborazziOptions
import com.github.takahirom.roborazzi.fetchImage
import org.junit.Rule
import org.junit.rules.TestWatcher
import org.junit.runner.Description
import org.robolectric.Shadows.shadowOf
import kotlin.math.roundToInt

abstract class MotionTestBase {
    @get:Rule(order = 0)
    val activityRule = object : TestWatcher() {
        override fun starting(description: Description?) {
            val application = ApplicationProvider.getApplicationContext<Application>()
            shadowOf(application.packageManager).addOrUpdateActivity(
                ActivityInfo().apply {
                    name = ComponentActivity::class.java.name
                    packageName = application.packageName
                },
            )
        }
    }

    @get:Rule(order = 1)
    val compose = createAndroidComposeRule<ComponentActivity>()

    protected fun pixels(tag: String): PixelMap {
        val bounds = compose.onNodeWithTag(tag).fetchSemanticsNode().boundsInWindow
        val view = compose.activity.findViewById<View>(android.R.id.content)
        val location = IntArray(2)
        compose.runOnIdle { view.getLocationInWindow(location) }
        val bitmap = requireNotNull(view.fetchImage(RoborazziOptions.RecordOptions()))
        return Bitmap.createBitmap(
            bitmap,
            bounds.left.roundToInt() - location[0],
            bounds.top.roundToInt() - location[1],
            bounds.width.roundToInt(),
            bounds.height.roundToInt(),
        ).asImageBitmap().toPixelMap()
    }

    protected fun advanceTransition() {
        compose.mainClock.advanceTimeByFrame()
        compose.waitForIdle()
        compose.mainClock.advanceTimeByFrame()
        compose.mainClock.advanceTimeBy(400)
    }
}
