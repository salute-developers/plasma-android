package com.sdds.plasma.sd.service

import android.view.View
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.component
import com.sdds.uikit.fixtures.samples.RoborazziConfigDocsXml.Companion.ProvidedStyleKeys
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

internal fun themedComponentStyleProvided(
    sampleId: String,
    viewMatcherFactory: ((View) -> Matcher<View>)? = null,
    action: ((View) -> Unit)? = null,
    skipDefaultCaptureRoboImage: Boolean = false,
    factory: ComponentScope.() -> View,
) {
    val componentName = sampleId.substringBeforeLast(".").split(".")
    val component = componentName.takeLast(2).joinToString("").lowercase()
    val lastSegment = componentName.last().lowercase()

    val shouldCapture = ProvidedStyleKeys.any { styleKey ->
        val key = styleKey.replace("-", "").lowercase()
        component.contains(key) || key.contains(component) ||
            key.contains(lastSegment) || lastSegment.contains(key)
    }
    println(" componentName: $componentName, ищем в: $ProvidedStyleKeys, совпали: $shouldCapture")

    if (!shouldCapture) {
        println("Пропущены: $sampleId")
        return
    }
    themedComponent(
        viewMatcherFactory = viewMatcherFactory,
        action = action,
        skipDefaultCaptureRoboImage = skipDefaultCaptureRoboImage,
        factory = factory,
    )
}
