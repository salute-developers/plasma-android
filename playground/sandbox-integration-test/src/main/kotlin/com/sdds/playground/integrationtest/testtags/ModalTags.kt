package com.sdds.playground.integrationtest.testtags

/**
 * Тэги для Modal
 */
@Suppress(
    "UndocumentedPublicProperty",
    "UndocumentedPublicClass",
)
internal object ModalTags {
    const val ROOT = "modal_scenario_root"

    const val FIRST_OPEN_BUTTON = "modal_first_open_button"
    const val FIRST_MODAL = "modal_first_content"
    const val FIRST_CLOSE_BUTTON = "modal_first_close_button"
    const val FIRST_SCROLL_CONTAINER = "modal_first_scroll_container"
    const val FIRST_SCROLL_TARGET = "modal_first_scroll_target"

    const val SECOND_OPEN_BUTTON = "modal_second_open_button"
    const val SECOND_MODAL = "modal_second_content"
    const val SECOND_CLOSE_BUTTON = "modal_second_close_button"
    const val SECOND_SCROLL_CONTAINER = "modal_second_scroll_container"
    const val SECOND_SCROLL_TARGET = "modal_second_scroll_target"

    const val CHECK_FIRST_OPENED = "modal_check_first_opened"
    const val CHECK_FIRST_CLOSED = "modal_check_first_closed"
    const val CHECK_FIRST_SCROLLED = "modal_check_first_scrolled"
    const val CHECK_SECOND_OPENED = "modal_check_second_opened"
    const val CHECK_SECOND_CLOSED = "modal_check_second_closed"
    const val CHECK_SECOND_SCROLLED = "modal_check_second_scrolled"
    const val RESET = "modal_reset"
}
