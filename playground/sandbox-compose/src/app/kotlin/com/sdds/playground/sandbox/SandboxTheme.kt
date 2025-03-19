package com.sdds.playground.sandbox

import android.app.Activity
import android.graphics.Color
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarGroup
import com.sdds.compose.uikit.BasicButton
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.CheckBoxGroup
import com.sdds.compose.uikit.Chip
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.LocalAvatarGroupStyle
import com.sdds.compose.uikit.LocalAvatarStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalCellStyle
import com.sdds.compose.uikit.LocalCheckBoxGroupStyle
import com.sdds.compose.uikit.LocalCheckBoxStyle
import com.sdds.compose.uikit.LocalChipStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.LocalProgressBarStyle
import com.sdds.compose.uikit.LocalRadioBoxGroupStyle
import com.sdds.compose.uikit.LocalRadioBoxStyle
import com.sdds.compose.uikit.LocalSegmentItemStyle
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.ProgressBar
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.RadioBoxGroup
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.TextField
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.style.style
import com.sdds.playground.sandbox.core.compose.LocalNavigationViewStyle
import com.sdds.playground.sandbox.core.compose.LocalPropertiesListStyle
import com.sdds.playground.sandbox.core.compose.LocalPropertyEditorStyle
import com.sdds.playground.sandbox.core.compose.LocalSandboxStyle
import com.sdds.playground.sandbox.core.compose.LocalTopBarStyle
import com.sdds.playground.sandbox.core.compose.NavigationViewStyle
import com.sdds.playground.sandbox.core.compose.PropertiesListStyle
import com.sdds.playground.sandbox.core.compose.PropertyEditorStyle
import com.sdds.playground.sandbox.core.compose.SandboxStyle
import com.sdds.playground.sandbox.core.compose.TopBarStyle
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.button.basic.Default
import com.sdds.serv.styles.button.basic.M
import com.sdds.serv.styles.button.icon.Clear
import com.sdds.serv.styles.button.icon.Default
import com.sdds.serv.styles.button.icon.M
import com.sdds.serv.styles.button.icon.Pilled
import com.sdds.serv.styles.button.icon.Xs
import com.sdds.serv.styles.cell.M
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.group.M
import com.sdds.serv.styles.chip.Default
import com.sdds.serv.styles.chip.M
import com.sdds.serv.styles.progress.Default
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.group.M
import com.sdds.serv.styles.segment.item.M
import com.sdds.serv.styles.segment.item.Primary
import com.sdds.serv.styles.segment.item.SegmentItem
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.textfield.Default
import com.sdds.serv.styles.textfield.M
import com.sdds.serv.styles.textfield.OuterLabel
import com.sdds.serv.theme.SddsServTheme
import com.sdds.serv.theme.darkSddsServColors
import com.sdds.serv.theme.darkSddsServGradients
import com.sdds.serv.theme.lightSddsServColors
import com.sdds.serv.theme.lightSddsServGradients
import androidx.compose.ui.graphics.Color.Companion as ComposeUiGraphicsColor

private val DarkColors = darkSddsServColors()
private val LightColors = lightSddsServColors()
private val DarkGradients = darkSddsServGradients()
private val LightGradients = lightSddsServGradients()

internal const val TextFieldFocusSelectorModeSwitch = true

/**
 * Тема демо-приложения
 */
@Composable
fun SandboxTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColors
        else -> LightColors
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = Color.TRANSPARENT
            window.navigationBarColor = Color.TRANSPARENT
            window.decorView.setBackgroundColor(colorScheme.backgroundDefaultPrimary.toArgb())
            WindowCompat.getInsetsController(window, view).apply {
                isAppearanceLightStatusBars = !darkTheme
                isAppearanceLightNavigationBars = !darkTheme
            }
        }
    }

    SddsServTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = {
            CompositionLocalProvider(
                LocalFocusSelectorMode provides FocusSelectorMode.Border(
                    borderStroke = BorderStroke(1.dp, colorScheme.surfaceDefaultAccent),
                    strokePadding = 2.dp,
                ),
                LocalSegmentItemStyle provides SegmentItem.M.Primary.style(),
                LocalSwitchStyle provides Switch.M.style(),
                LocalButtonStyle provides BasicButton.M.Default.style(),
                LocalIconButtonStyle provides IconButton.M.Default.style(),
                LocalCheckBoxStyle provides CheckBox.M.style(),
                LocalCheckBoxGroupStyle provides CheckBoxGroup.M.style(),
                LocalRadioBoxStyle provides RadioBox.M.style(),
                LocalRadioBoxGroupStyle provides RadioBoxGroup.M.style(),
                LocalProgressBarStyle provides ProgressBar.Default.style(),
                LocalAvatarStyle provides Avatar.M.style(),
                LocalAvatarGroupStyle provides AvatarGroup.S.style(),
                LocalChipStyle provides Chip.M.Default.style(),
                LocalTextFieldStyle provides TextField.M.OuterLabel.Default.style(),
                LocalCellStyle provides Cell.M.style(),
                LocalSandboxStyle provides SandboxStyle.create(
                    drawerBackgroundColor = colorScheme.surfaceDefaultSolidSecondary,
                    sheetBackgroundColor = colorScheme.surfaceDefaultSolidCard,
                    sheetShape = SddsServTheme.shapes.roundS.copy(CornerSize(0.dp), CornerSize(0.dp)),
                ),
                LocalNavigationViewStyle provides NavigationViewStyle.create(
                    itemTextStyle = SddsServTheme.typography.bodyMBold,
                    itemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = if (darkTheme) {
                            colorScheme.textInversePrimary
                        } else {
                            colorScheme.textDefaultPrimary
                        },
                    ),
                    itemBackground = ComposeUiGraphicsColor.Transparent.asInteractive(
                        focused = if (darkTheme) {
                            colorScheme.surfaceDefaultSolidDefault
                        } else {
                            colorScheme.surfaceDefaultTransparentSecondary
                        },
                    ),
                ),
                LocalTopBarStyle provides TopBarStyle.create(
                    titleStyle = SddsServTheme.typography.bodyMBold,
                    titleColor = colorScheme.textDefaultPrimary,
                    backgroundColor = colorScheme.surfaceDefaultSolidPrimary,
                    contentColor = colorScheme.textDefaultPrimary,
                    navigationButtonStyle = IconButton.M.Pilled.Clear.style(),
                    actionButtonStyle = IconButton.M.Pilled.Clear.style(),
                ),
                LocalPropertiesListStyle provides defaultPropertiesListStyle(darkTheme),
                LocalPropertyEditorStyle provides PropertyEditorStyle.create(
                    labelTextStyle = SddsServTheme.typography.headerH3Bold,
                    labelTextColor = colorScheme.textDefaultPrimary,
                    confirmButtonStyle = BasicButton.M.Default.style(),
                ),
                content = content,
            )
        },
    )
}

@Composable
private fun defaultPropertiesListStyle(
    darkTheme: Boolean,
): PropertiesListStyle =
    PropertiesListStyle.create(
        shape = SddsServTheme.shapes.roundM,
        borderWidth = 1.dp,
        borderColor = SddsServTheme.colors.surfaceDefaultSolidTertiary,
        backgroundColor = SddsServTheme.colors.surfaceDefaultSolidCard,
        headerBackgroundColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
        headerHeight = 56.dp,
        headerPaddings = PaddingValues(16.dp),
        headerTextStyle = SddsServTheme.typography.bodyMBold,
        headerTextColor = SddsServTheme.colors.textDefaultSecondary,
        propertyLabelTextStyle = SddsServTheme.typography.bodyMBold,
        propertyLabelTextColor = SddsServTheme.colors.textDefaultPrimary.asInteractive(
            focused = if (darkTheme) {
                SddsServTheme.colors.textInversePrimary
            } else {
                SddsServTheme.colors.textDefaultPrimary
            },
        ),
        propertyValueTextStyle = SddsServTheme.typography.bodyMBold,
        propertyValueTextColor = SddsServTheme.colors.textDefaultSecondary.asInteractive(
            focused = if (darkTheme) {
                SddsServTheme.colors.textInverseSecondary
            } else {
                SddsServTheme.colors.textDefaultSecondary
            },
        ),
        propertyBackgroundColor = ComposeUiGraphicsColor.Transparent.asInteractive(
            focused = if (darkTheme) {
                SddsServTheme.colors.surfaceDefaultSolidDefault
            } else {
                SddsServTheme.colors.surfaceDefaultTransparentSecondary
            },
        ),
        propertyPaddings = PaddingValues(8.dp),
        propertySwitchStyle = Switch.M.style(),
        propertyHeight = 56.dp,
        dividerWidth = 1.dp,
        dividerColor = SddsServTheme.colors.surfaceDefaultSolidSecondary,
        resetButtonStyle = IconButton.Xs.Pilled.Clear.style(),
    )
