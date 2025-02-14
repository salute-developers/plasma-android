package com.sdds.serv

import android.view.View
import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.component
import org.hamcrest.Matcher

/**
 *
 * @author Малышев Александр on 13.02.2025
 */
fun themedComponent(
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    factory: ComponentScope.() -> View,
) {
    component(
        R.style.Serv_Sdds_MaterialComponents_DayNight,
        R.attr.serv_backgroundDefaultPrimary,
        viewMatcherFactory,
        action,
        factory,
    )
}
