package com.sdds.playground.integrationtest.testtags

/**
 * Теги для сценария Focus Scale Selector
 */
@Suppress(
    "UndocumentedPublicProperty",
    "UndocumentedPublicClass",
)
internal object FocusSelectorScaleTags {
    const val ROOT = "focus_scale_scenario_root"
    const val CHIP_GROUP_TAB = "focus_scale_chip_group"
    const val TEXT_FIELD_TAB = "focus_scale_text_field"

    internal fun check(index: Int): String = "focus_scale_check_$index"
}