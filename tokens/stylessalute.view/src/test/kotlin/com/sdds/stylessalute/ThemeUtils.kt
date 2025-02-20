package com.sdds.stylessalute

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
        R.style.Salute_StylesSalute_MaterialComponents_DayNight,
        R.attr.salute_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        factory,
    )
}
