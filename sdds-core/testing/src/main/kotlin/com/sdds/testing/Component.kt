package com.sdds.testing

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import com.github.takahirom.roborazzi.captureRoboImage
import org.hamcrest.Matcher
import org.robolectric.Robolectric

/**
 * Создание компонента и скриншота
 */
fun component(
    theme: Int,
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    factory: (Context) -> View,
) {
    val controller = Robolectric.buildActivity(Activity::class.java)
    val activity = controller.get()
    activity.setTheme(theme)
    controller.setup()
    val view = factory(activity)
    val lp = view.layoutParams ?: ViewGroup.LayoutParams(
        ViewGroup.LayoutParams.WRAP_CONTENT,
        ViewGroup.LayoutParams.WRAP_CONTENT,
    )
    activity.setContentView(view, lp)
    val matcher: Matcher<View> = viewMatcherFactory?.invoke(view) ?: ViewMatchers.withId(view.id)
    onView(matcher)
        .captureRoboImage()
}
