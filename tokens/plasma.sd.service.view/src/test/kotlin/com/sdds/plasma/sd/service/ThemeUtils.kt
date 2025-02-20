package com.sdds.plasma.sd.service

import android.view.View
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.component
import org.hamcrest.Matcher

internal fun themedComponent(
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    factory: ComponentScope.() -> View,
) {
    component(
        R.style.Plasma_SdService_MaterialComponents_DayNight,
        R.attr.plasma_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        factory,
    )
}
