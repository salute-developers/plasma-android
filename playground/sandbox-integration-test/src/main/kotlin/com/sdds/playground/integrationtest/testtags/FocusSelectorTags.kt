package com.sdds.playground.integrationtest.testtags

/**
 * Теги для сценария Focus Selector
 */
@Suppress(
    "UndocumentedPublicProperty",
    "UndocumentedPublicClass",
)
internal object FocusSelectorTags {
    const val ROOT = "focus_selector_scenario_root"
    const val BUTTON_TAB = "focus_selector_button_tab"
    const val BUTTON_GROUP = "focus_selector_button_group"
    const val BUTTON_GROUP_TAB = "focus_selector_button_group_tab"
    const val CHIP_TAB = "focus_selector_chip_tab"
    const val CHIP_GROUP = "focus_selector_chip_group"
    const val CHIP_GROUP_TAB = "focus_selector_chip_group_tab"
    const val TEXT_FIELD_TAB = "focus_selector_text_field_tab"
    const val RADIO_BOX_GROUP = "focus_selector_radio_box_group"
    const val RADIO_BOX_GROUP_TAB = "focus_selector_radio_box_group_tab"
    const val CODE_INPUT_TAB = "focus_selector_code_input_tab"
    const val BUTTON_TAB_CONTENT = "focus_selector_button_tab_content"
    const val BUTTON_GROUP_TAB_CONTENT = "focus_selector_button_group_tab_content"
    const val CHIP_TAB_CONTENT = "focus_selector_chip_tab_content"
    const val CHIP_GROUP_TAB_CONTENT = "focus_selector_chip_group_tab_content"
    const val TEXT_FIELD_TAB_CONTENT = "focus_selector_text_field_tab_content"
    const val RADIO_BOX_GROUP_TAB_CONTENT = "focus_selector_radio_box_group_tab_content"
    const val CODE_INPUT_TAB_CONTENT = "focus_selector_code_input_tab_content"
    const val FOCUSABLE_BUTTON = "focus_selector_focusable_button"
    const val FOCUSABLE_BUTTON_GROUP = "focus_selector_focusable_button_group"
    const val FOCUSABLE_CHIP = "focus_selector_focusable_chip"
    const val FOCUSABLE_CHIP_GROUP = "focus_selector_focusable_chip_group"
    const val FOCUSABLE_TEXT_FIELD = "focus_selector_focusable_text_field"
    const val FOCUSABLE_RADIO_BOX_GROUP = "focus_selector_focusable_radio_box_group"
    const val FOCUSABLE_CODE_INPUT = "focus_selector_focusable_code_input"
    const val CLEAR_FOCUS = "focus_selector_clear_focus"
    const val BUTTON_FOCUS_STATE = "focus_selector_button_focus_state"
    const val BUTTON_GROUP_FOCUS_STATE = "focus_selector_button_group_focus_state"
    const val CHIP_FOCUS_STATE = "focus_selector_chip_focus_state"
    const val CHIP_GROUP_FOCUS_STATE = "focus_selector_chip_group_focus_state"
    const val TEXT_FIELD_FOCUS_STATE = "focus_selector_text_field_focus_state"
    const val RADIO_BOX_GROUP_FOCUS_STATE = "focus_selector_radio_box_group_focus_state"
    const val CODE_INPUT_FOCUS_STATE = "focus_selector_code_input_focus_state"

    internal fun check(index: Int): String = "focus_selector_check_$index"
    internal fun buttonGroupItem(index: Int) = "focus_selector_button_group_item_$index"
    internal fun chipGroupItem(index: Int) = "focus_selector_chip_group_item_$index"
    internal fun radioBoxGroupItem(index: Int) = "focus_selector_radio_box_group_item_$index"
}
