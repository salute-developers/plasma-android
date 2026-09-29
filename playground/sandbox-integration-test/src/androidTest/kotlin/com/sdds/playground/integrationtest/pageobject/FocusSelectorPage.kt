package com.sdds.playground.integrationtest.pageobject

import android.content.res.Configuration
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.PixelMap
import androidx.compose.ui.graphics.toPixelMap
import androidx.compose.ui.input.key.Key
import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.assertTextContains
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.captureToImage
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onLast
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performKeyInput
import androidx.compose.ui.test.pressKey
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.sdds.playground.integrationtest.sandbox.AppActivity
import com.sdds.playground.integrationtest.testtags.FocusSelectorScaleTags
import com.sdds.playground.integrationtest.testtags.FocusSelectorTags
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.lightSddsServColors
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor

@OptIn(ExperimentalTestApi::class)
internal class FocusSelectorPage(
    private val composeTestRule: AndroidComposeTestRule<ActivityScenarioRule<AppActivity>, AppActivity>,
) {
    private var unfocusedComponentScreenshot: ImageBitmap? = null
    private var unfocusedComponentBounds: Rect? = null
    private var focusSelectorComponentTag: String? = null

    fun selectButtonTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun selectButtonGroupTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun selectChipTab() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_TAB).performClick()
        composeTestRule.waitForIdle()
    }

    fun clickShowAll() = apply {
        composeTestRule.onNodeWithText("ShowAll").performClick()
        composeTestRule.waitForIdle()
    }

    fun selectChipGroupTab() = apply {
        selectOverflowTab("ChipGroup")
    }

    fun selectTextFieldTab() = apply {
        selectOverflowTab("TextField")
    }

    fun selectRadioBoxGroupTab() = apply {
        selectOverflowTab("RadioBoxGroup")
    }

    fun selectCodeInputTab() = apply {
        selectOverflowTab("CodeInput")
    }

    fun selectTabsTab() = apply {
        selectOverflowTab("Tabs")
    }

    fun pressTab() = apply {
        composeTestRule.onRoot().performKeyInput {
            pressKey(Key.Tab)
        }
        composeTestRule.waitForIdle()
    }

    fun pressTab(times: Int) = apply {
        repeat(times) {
            pressTab()
        }
    }

    fun clearFocus() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CLEAR_FOCUS).performClick()
        composeTestRule.waitForIdle()
    }

    fun checkButtonTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_TAB_CONTENT).assertExists()
    }

    fun checkButtonGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkChipTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_TAB_CONTENT).assertExists()
    }

    fun checkChipGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkTextFieldTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_TAB_CONTENT).assertExists()
    }

    fun checkRadioBoxGroupTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_TAB_CONTENT).assertExists()
    }

    fun checkCodeInputTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_TAB_CONTENT).assertExists()
    }

    fun checkTabsTabContentVisible() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_TAB_CONTENT).assertExists()
    }

    fun checkButtonFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_FOCUS_STATE)
            .assertTextEquals("Кнопка в фокусе")
    }

    fun checkButtonFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_FOCUS_STATE)
            .assertTextEquals("Кнопка не в фокусе")
    }

    fun rememberButtonWithoutFocusVisualState() = rememberUnfocusedVisualState(FocusSelectorTags.FOCUSABLE_BUTTON)

    fun rememberButtonGroupWithoutFocusVisualState() =
        rememberUnfocusedVisualState(FocusSelectorTags.buttonGroupItem(0))

    fun rememberChipWithoutFocusVisualState() = rememberUnfocusedVisualState(FocusSelectorTags.FOCUSABLE_CHIP)

    fun rememberChipGroupWithoutFocusVisualState() =
        rememberUnfocusedVisualState(FocusSelectorTags.chipGroupItem(0))

    fun rememberTextFieldWithoutFocusVisualState() =
        rememberUnfocusedVisualState(FocusSelectorTags.FOCUSABLE_TEXT_FIELD)

    fun rememberRadioBoxWithoutFocusVisualState() =
        rememberUnfocusedVisualState(FocusSelectorTags.radioBoxGroupItem(0))

    fun rememberTabsWithoutFocusVisualState() = rememberUnfocusedVisualState(FocusSelectorTags.tabsItem(0))

    fun checkFocusSelectorVisible() = apply {
        composeTestRule.waitForIdle()
        val before = checkNotNull(unfocusedComponentScreenshot) {
            "Capture the component visual state before requesting focus"
        }.toPixelMap()
        val beforeBounds = checkNotNull(unfocusedComponentBounds) {
            "Component bounds were not captured before requesting focus"
        }
        val componentTag = checkNotNull(focusSelectorComponentTag) {
            "Component tag was not captured before requesting focus"
        }
        val afterBounds = composeTestRule
            .onNodeWithTag(componentTag)
            .fetchSemanticsNode()
            .boundsInRoot
        val after = composeTestRule.onRoot().captureToImage().toPixelMap()
        val density = composeTestRule.activity.resources.displayMetrics.density
        val outerPaddingPx = ceil(FOCUS_SELECTOR_OUTER_PADDING_DP * density).toInt()
        val innerEdgeWidthPx = ceil(FOCUS_SELECTOR_INNER_EDGE_WIDTH_DP * density).toInt()
        val accentColor = expectedAccentColor()
        val beforeAccent = countAccentPixelsInBorderRing(
            pixels = before,
            bounds = beforeBounds,
            accentColor = accentColor,
            outerPaddingPx = outerPaddingPx,
            innerEdgeWidthPx = innerEdgeWidthPx,
        )
        val afterAccent = countAccentPixelsInBorderRing(
            pixels = after,
            bounds = afterBounds,
            accentColor = accentColor,
            outerPaddingPx = outerPaddingPx,
            innerEdgeWidthPx = innerEdgeWidthPx,
        )
        val addedAccentPixels = afterAccent.matching - beforeAccent.matching

        if (afterAccent.matching < MIN_FOCUS_SELECTOR_ACCENT_PIXELS ||
            addedAccentPixels < MIN_ADDED_FOCUS_SELECTOR_ACCENT_PIXELS
        ) {
            throw AssertionError(
                "Focus was received, but the expected accent-colored FocusSelector border was not found. " +
                    "Accent pixels in the border area: before=${beforeAccent.matching}/${beforeAccent.inspected}, " +
                    "after=${afterAccent.matching}/${afterAccent.inspected}, added=$addedAccentPixels; " +
                    "component bounds: before=$beforeBounds, after=$afterBounds",
            )
        }
    }

    fun checkButtonGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа кнопок в фокусе")
    }

    fun checkButtonGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.BUTTON_GROUP_FOCUS_STATE)
            .assertTextEquals("Кнопки не в фокусе")
    }

    fun checkChipFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_FOCUS_STATE)
            .assertTextEquals("Чип в фокусе")
    }

    fun checkChipGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа чипов в фокусе")
    }

    fun checkChipGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CHIP_GROUP_FOCUS_STATE)
            .assertTextEquals("Чипы не в фокусе")
    }

    fun checkTextFieldFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE)
            .assertTextEquals("Текстовое поле в фокусе")
    }

    fun checkTextFieldFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TEXT_FIELD_FOCUS_STATE)
            .assertTextEquals("Текстовое поле не в фокусе")
    }

    fun checkRadioBoxGroupFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_FOCUS_STATE)
            .assertTextEquals("Группа радиокнопок в фокусе")
    }

    fun checkRadioBoxGroupFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.RADIO_BOX_GROUP_FOCUS_STATE)
            .assertTextEquals("Радиокнопки не в фокусе")
    }

    fun checkCodeInputFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_FOCUS_STATE)
            .assertTextEquals("CodeInput в фокусе")
    }

    fun checkCodeInputFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.CODE_INPUT_FOCUS_STATE)
            .assertTextEquals("CodeInput не в фокусе")
    }

    fun checkTabsFocusStateFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_FOCUS_STATE)
            .assertTextEquals("Tabs в фокусе")
    }

    fun checkTabsFocusStateNotFocused() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.TABS_FOCUS_STATE)
            .assertTextEquals("Tabs не в фокусе")
    }

    fun checkButtonFocusRequestPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(1))
            .assertTextContains("PASS", substring = true)
    }

    fun checkButtonGroupFocusRequestPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(2))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(3))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(4))
            .assertTextContains("PASS", substring = true)
    }

    fun checkButtonAndChipClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(5))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(6))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(7))
            .assertTextContains("PASS", substring = true)
    }

    fun checkRadioBoxGroupFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(8))
            .assertTextContains("PASS", substring = true)
    }

    fun checkCodeInputFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(9))
            .assertTextContains("PASS", substring = true)
    }

    fun checkRadioBoxAndCodeInputClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(10))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTabsFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(11))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTabsClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(12))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorScaleTags.check(1))
            .assertTextContains("PASS", substring = true)
    }

    fun checkChipGroupClearFocusPassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(2))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorScaleTags.check(3))
            .assertTextContains("PASS", substring = true)
    }

    fun checkTextFieldClearFocusScalePassed() = apply {
        composeTestRule.onNodeWithTag(FocusSelectorTags.check(4))
            .assertTextContains("PASS", substring = true)
    }

    private fun selectOverflowTab(title: String) {
        composeTestRule.onAllNodesWithText(title).onLast().performClick()
        composeTestRule.waitForIdle()
    }

    private fun rememberUnfocusedVisualState(componentTag: String) = apply {
        composeTestRule.waitForIdle()
        focusSelectorComponentTag = componentTag
        unfocusedComponentBounds = composeTestRule
            .onNodeWithTag(componentTag)
            .fetchSemanticsNode()
            .boundsInRoot
        unfocusedComponentScreenshot = composeTestRule.onRoot().captureToImage()
    }

    private fun expectedAccentColor(): Color {
        val nightMode = composeTestRule.activity.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
        return if (nightMode == Configuration.UI_MODE_NIGHT_YES) {
            darkSddsServColors().surfaceDefaultAccent
        } else {
            lightSddsServColors().surfaceDefaultAccent
        }
    }

    private fun countAccentPixelsInBorderRing(
        pixels: PixelMap,
        bounds: Rect,
        accentColor: Color,
        outerPaddingPx: Int,
        innerEdgeWidthPx: Int,
    ): AccentPixelCount {
        val componentLeft = floor(bounds.left).toInt()
        val componentTop = floor(bounds.top).toInt()
        val componentRight = ceil(bounds.right).toInt()
        val componentBottom = ceil(bounds.bottom).toInt()
        val outerLeft = (componentLeft - outerPaddingPx).coerceIn(0, pixels.width)
        val outerTop = (componentTop - outerPaddingPx).coerceIn(0, pixels.height)
        val outerRight = (componentRight + outerPaddingPx).coerceIn(0, pixels.width)
        val outerBottom = (componentBottom + outerPaddingPx).coerceIn(0, pixels.height)
        if (outerLeft >= outerRight || outerTop >= outerBottom) return AccentPixelCount()

        val coreLeft = (componentLeft + innerEdgeWidthPx).coerceIn(outerLeft, outerRight)
        val coreTop = (componentTop + innerEdgeWidthPx).coerceIn(outerTop, outerBottom)
        val coreRight = (componentRight - innerEdgeWidthPx).coerceIn(outerLeft, outerRight)
        val coreBottom = (componentBottom - innerEdgeWidthPx).coerceIn(outerTop, outerBottom)
        val hasComponentCore = coreLeft < coreRight && coreTop < coreBottom
        var matching = 0
        var inspected = 0

        for (y in outerTop until outerBottom) {
            for (x in outerLeft until outerRight) {
                val insideComponentCore = hasComponentCore &&
                    x >= coreLeft && x < coreRight && y >= coreTop && y < coreBottom
                if (insideComponentCore) continue
                inspected++
                if (pixels[x, y].matchesAccent(accentColor)) matching++
            }
        }
        return AccentPixelCount(matching = matching, inspected = inspected)
    }

    private fun Color.matchesAccent(accentColor: Color): Boolean =
        abs(red - accentColor.red) <= ACCENT_COLOR_TOLERANCE &&
            abs(green - accentColor.green) <= ACCENT_COLOR_TOLERANCE &&
            abs(blue - accentColor.blue) <= ACCENT_COLOR_TOLERANCE &&
            alpha >= MIN_VISIBLE_ALPHA

    private data class AccentPixelCount(
        val matching: Int = 0,
        val inspected: Int = 0,
    )

    private companion object {
        const val FOCUS_SELECTOR_OUTER_PADDING_DP = 4f
        const val FOCUS_SELECTOR_INNER_EDGE_WIDTH_DP = 2f
        const val ACCENT_COLOR_TOLERANCE = 0.1f
        const val MIN_VISIBLE_ALPHA = 0.9f
        const val MIN_FOCUS_SELECTOR_ACCENT_PIXELS = 20
        const val MIN_ADDED_FOCUS_SELECTOR_ACCENT_PIXELS = 12
    }
}
