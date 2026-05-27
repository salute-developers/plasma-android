package com.sdds.playground.integrationtest.testtags

/**
 * Тэги для Tooltip
 */
@Suppress(
    "UndocumentedPublicProperty",
    "UndocumentedPublicClass",
)
internal object TooltipTags {
    const val ROOT = "tooltip_scenario_root"
    const val FIRST_OPEN_BUTTON = "tooltip_first_open_button"
    const val FIRST_TOOLTIP = "tooltip_first_content"
    const val FIRST_CLOSE_BUTTON = "tooltip_first_close_button"
    const val SECOND_OPEN_BUTTON = "tooltip_second_open_button"
    const val SECOND_TOOLTIP = "tooltip_second_content"
    const val CHECK_FIRST_OPENED = "tooltip_check_first_opened"
    const val CHECK_FIRST_CLOSED_BY_BUTTON = "tooltip_check_first_closed_by_button"
    const val CHECK_SECOND_OPENED = "tooltip_check_second_opened"
    const val CHECK_SECOND_CLOSED_BY_OUTSIDE = "tooltip_check_second_closed_by_outside"
    const val RESET = "tooltip_reset"
}
