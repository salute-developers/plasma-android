package com.sdkit.star.designsystem

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
        R.style.Sdkit_AppTheme,
        R.attr.sdkit_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        factory,
    )
}
