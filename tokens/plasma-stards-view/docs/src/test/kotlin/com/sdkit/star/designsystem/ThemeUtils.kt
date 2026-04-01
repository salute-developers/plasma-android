package com.sdkit.star.designsystem

import android.view.View
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.component
import org.hamcrest.Matcher

internal fun themedComponent(
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    skipDefaultCaptureRoboImage: Boolean = false,
    factory: ComponentScope.() -> View,
) {
    component(
        com.sdkit.star.designsystem.docs.R.style.Sdkit_Doc_Theme,
        R.attr.sdkit_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        skipDefaultCaptureRoboImage,
        factory,
    )
}
