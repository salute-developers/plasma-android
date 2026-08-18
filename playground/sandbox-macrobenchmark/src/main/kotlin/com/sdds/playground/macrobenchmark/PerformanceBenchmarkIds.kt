package com.sdds.playground.macrobenchmark

internal object PerformanceBenchmarkIds {
    const val TARGET_PACKAGE = "com.sdds.playground.integrationtest"
    const val TARGET_ACTIVITY = "$TARGET_PACKAGE.sandbox.AppActivity"
    const val EXTRA_SCENARIO_ID = "scenario_id"

    object Scenarios {
        const val COMPONENTS_FEED = "perf-components-feed"
        const val MASS_STATE_UPDATE = "perf-mass-state-update"
        const val MODAL_CYCLE = "perf-modal-cycle"
        const val POPOVER_100_TRIGGERS = "perf-popover-100-triggers"
        const val BOTTOM_SHEET_WHEEL = "perf-bottom-sheet-wheel"
    }

    object Ui {
        const val COMPONENTS_FEED = "perf_components_feed"
        const val MASS_UPDATE_BUTTON = "perf_mass_update_button"
        const val MODAL_OPEN_BUTTON = "perf_modal_open_button"
        const val MODAL_CONTENT = "perf_modal_content"
        const val MODAL_CLOSE_BUTTON = "perf_modal_close_button"
        const val POPOVER_TRIGGER_PREFIX = "perf_popover_trigger"
        const val POPOVER_CONTENT = "perf_popover_content"
        const val BOTTOM_SHEET_OPEN_BUTTON = "perf_bottom_sheet_open_button"
        const val BOTTOM_SHEET_CONTENT = "perf_bottom_sheet_content"
        const val BOTTOM_SHEET_WHEEL = "perf_bottom_sheet_wheel"
        const val BOTTOM_SHEET_CLOSE_BUTTON = "perf_bottom_sheet_close_button"
    }
}
