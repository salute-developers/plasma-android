package com.sdds.uikit.fixtures.testcases

import android.widget.FrameLayout
import com.sdds.uikit.Autocomplete
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.R
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.autocomplete.AutocompleteUiState
import com.sdds.uikit.fixtures.stories.autocomplete.autocomplete
import com.sdds.uikit.fixtures.stories.popover.PopoverPlacementMode
import com.sdds.uikit.fixtures.stories.popover.PopoverTriggerAlignment
import com.sdds.uikit.fixtures.stories.popover.toGravity

/**
 * Тест-кейсы для компонента [com.sdds.uikit.Autocomplete]
 */
@Suppress("UndocumentedPublicFunction")
abstract class AutocompleteTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2427
     */
    abstract fun testAutocompleteTightXlShowLoadingCenter()

    /**
     * PLASMA-T2428
     */
    abstract fun testAutocompleteTightLEmptyStateStartCenter()

    /**
     * PLASMA-T2429
     */
    abstract fun testAutocompleteTightMStartBottom()

    /**
     * PLASMA-T2430
     */
    abstract fun testAutocompleteTightSCenterTop()

    /**
     * PLASMA-T2431
     */
    abstract fun testAutocompleteTightXsCenter()

    /**
     * PLASMA-T2432
     */
    abstract fun testAutocompleteTightXlCenterBottom()

    /**
     * PLASMA-T2433
     */
    abstract fun testAutocompleteNormalXlEndTop()

    /**
     * PLASMA-T2434
     */
    abstract fun testAutocompleteNormalXlEndCenter()

    /**
     * PLASMA-T2435
     */
    abstract fun testAutocompleteNormalEndBottom()

    private fun ComponentScope.baseAutocomplete(
        style: Int,
        state: AutocompleteUiState,
    ): Autocomplete = autocomplete(
        context = context,
        style = style,
        state = state,
    ).apply {
        layoutParams = FrameLayout.LayoutParams(
            FrameLayout.LayoutParams.WRAP_CONTENT,
            FrameLayout.LayoutParams.WRAP_CONTENT,
        ).apply {
            gravity = state.fieldAlignment.toGravity()
        }
    }

    fun ComponentScope.autocompleteShowLoadingCenter(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = true,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteEmptyStateStartCenter(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = true,
                    fieldAlignment = PopoverTriggerAlignment.START_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteStartBottom(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.START_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.LOOSE,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteCenterTop(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.CENTER_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
                contentDescription = "dropDown"
            }
        }

    fun ComponentScope.autocompleteCenter(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteCenterBottom(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.CENTER_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteEndTop(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.END_TOP,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteEndCenter(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.END_CENTER,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }

    fun ComponentScope.autocompleteEndBottom(style: Int): Autocomplete =
        fillSize {
            baseAutocomplete(
                style = style,
                state = AutocompleteUiState(
                    variant = "",
                    appearance = "",
                    showLoading = false,
                    withEmptyState = false,
                    fieldAlignment = PopoverTriggerAlignment.END_BOTTOM,
                    dropdownPlacementMode = PopoverPlacementMode.STRICT,
                ),
            ).apply {
                id = R.id.autocomplete
            }
        }
}
