package com.sdds.plasma.sd.service

import android.view.View
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.component
import org.hamcrest.Matcher
import org.json.JSONObject
import java.io.File

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

val ProvidedStyleKeys: Set<String> by lazy {
    val moduleDir = System.getProperty("moduleDir") ?: ""
    println("mooduleDir: $moduleDir")
    val jsonFile = File(moduleDir).parentFile?.resolve("config-info-view-system.json")
        ?: return@lazy emptySet()

    if (!jsonFile.exists()) return@lazy emptySet()

    println("jsonFile: ${jsonFile.absolutePath}")
    println("jsonFile.exists(): ${jsonFile.exists()}")

    val json = JSONObject(jsonFile.readText())
    val components = json.getJSONArray("components")

    buildSet {
        for (i in 0 until components.length()) {
            val component = components.getJSONObject(i)
            val key = component.getString("key")
                .replace("-", "")
                .lowercase()
            add(key)
        }
    }
}
