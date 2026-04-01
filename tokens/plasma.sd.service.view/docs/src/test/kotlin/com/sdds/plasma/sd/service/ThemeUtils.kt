package com.sdds.plasma.sd.service

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
        com.sdds.plasma.sd.service.docs.R.style.Plasma_SdService_Doc_Theme,
        R.attr.plasma_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        skipDefaultCaptureRoboImage,
        factory,
    )
}
