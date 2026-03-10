package com.sdds.compose.sandbox.internal

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
import com.sdds.compose.sandbox.SubTheme
import com.sdds.compose.sandbox.styles.card.CardSolid
import com.sdds.compose.sandbox.styles.card.L
import com.sdds.compose.sandbox.styles.iconbutton.Clear
import com.sdds.compose.sandbox.styles.iconbutton.IconButton
import com.sdds.compose.sandbox.styles.iconbutton.Pilled
import com.sdds.compose.sandbox.styles.iconbutton.Xs
import com.sdds.compose.sandbox.styles.switcher.M
import com.sdds.compose.sandbox.styles.switcher.Switch
import com.sdds.compose.sandbox.styles.switcher.ToggleS
import com.sdds.compose.sandbox.styles.textfield.InnerLabel
import com.sdds.compose.sandbox.styles.textfield.S
import com.sdds.compose.sandbox.styles.textfield.TextField
import com.sdds.compose.sandbox.theme.SddsSandboxTheme
import com.sdds.compose.sandbox.theme.darkSddsSandboxColors
import com.sdds.compose.sandbox.theme.darkSddsSandboxGradients
import com.sdds.compose.sandbox.theme.lightSddsSandboxColors
import com.sdds.compose.sandbox.theme.lightSddsSandboxGradients
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.style.style
import androidx.compose.ui.graphics.Color as ComposeColor

/**
 * Тема демо-приложения
 */
@Composable
@Suppress("LongMethod")
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

    content()
    SddsSandboxTheme(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = {
            CompositionLocalProvider(
                LocalFocusSelectorMode provides FocusSelectorMode.Border(
                    borderStroke = BorderStroke(1.dp, colorScheme.surfaceDefaultAccent),
                    strokePadding = 2.dp,
                ),
                LocalSandboxStyle provides SandboxStyle.create(
                    drawerBackgroundColor = colorScheme.surfaceDefaultSolidSecondary,
                    sheetBackgroundColor = colorScheme.surfaceDefaultSolidCard,
                    sheetShape = SddsSandboxTheme.shapes.roundS.copy(
                        CornerSize(0.dp),
                        CornerSize(0.dp),
                    ),
                    componentBackgroundColor = ComposeColor.Transparent.asStatefulValue(
                        setOf(SubTheme.INVERSE) to colorScheme.backgroundInversePrimary,
                        setOf(SubTheme.ON_DARK) to ComposeColor.Black,
                        setOf(SubTheme.ON_LIGHT) to ComposeColor.White,
                    ),
                    componentBackgroundShape = SddsSandboxTheme.shapes.roundM,
                ),
                LocalNavigationViewStyle provides NavigationViewStyle.create(
                    itemTextStyle = SddsSandboxTheme.typography.bodyMBold,
                    itemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = if (darkTheme) {
                            colorScheme.textInversePrimary
                        } else {
                            colorScheme.textDefaultPrimary
                        },
                    ),
                    itemBackground = ComposeColor.Transparent.asInteractive(
                        focused = if (darkTheme) {
                            colorScheme.surfaceDefaultSolidDefault
                        } else {
                            colorScheme.surfaceDefaultTransparentSecondary
                        },
                    ),
                    itemCard = CardSolid.L.builder
                        .colors {
                            backgroundColor(colorScheme.surfaceDefaultSolidCard)
                        }
                        .style(),
                    headerTextColor = colorScheme.textDefaultPrimary,
                    headerTextStyle = SddsSandboxTheme.typography.bodyMBold,
                ),
                LocalPropertiesListStyle provides defaultPropertiesListStyle(darkTheme),
                LocalPropertyEditorStyle provides PropertyEditorStyle.create(
                    headerHeight = 74.dp,
                    shape = SddsSandboxTheme.shapes.roundM,
                    labelTextStyle = SddsSandboxTheme.typography.bodyMBold,
                    labelTextColor = colorScheme.textDefaultPrimary,
                    editorItemBackground = ComposeColor.Transparent.asInteractive(
                        focused = colorScheme.surfaceDefaultSolidDefault,
                        selected = colorScheme.surfaceDefaultSolidSecondary,
                    ),
                    editorItemShape = SddsSandboxTheme.shapes.roundXs,
                    editorItemPadding = 6.dp,
                    editorItemHeight = 24.dp,
                    textEditorStyle = TextField.S.InnerLabel.builder
                        .labelStyle(SddsSandboxTheme.typography.bodyXsNormal)
                        .valueStyle(SddsSandboxTheme.typography.bodyLNormal)
                        .dimensions {
                            boxPaddingStart(6.dp)
                        }
                        .colors {
                            labelColor(colorScheme.textDefaultSecondary)
                            valueColor(colorScheme.textDefaultPrimary)
                            backgroundColor(ComposeColor.Transparent)
                            dividerColor(ComposeColor.Transparent)
                        }.style(),
                    backgroundColor = colorScheme.surfaceDefaultSolidCard,
                    editorItemTextStyle = SddsSandboxTheme.typography.bodyMNormal,
                    editorItemTextColor = colorScheme.textDefaultPrimary.asInteractive(
                        focused = colorScheme.textInversePrimary,
                    ),
                    choiceEditorTextColor = colorScheme.textDefaultSecondary,
                    spacing = 14.dp,
                ),
                content = content,
            )
        },
    )
}

internal const val FIELD_FOCUS_SELECTOR_MODE_SWITCH = true

@Composable
private fun defaultPropertiesListStyle(
    darkTheme: Boolean,
): PropertiesListStyle =
    PropertiesListStyle.create(
        shape = SddsSandboxTheme.shapes.roundM,
        borderWidth = 1.dp,
        borderColor = SddsSandboxTheme.colors.surfaceDefaultSolidTertiary,
        backgroundColor = SddsSandboxTheme.colors.surfaceDefaultSolidCard,
        headerBackgroundColor = SddsSandboxTheme.colors.surfaceDefaultSolidSecondary,
        headerHeight = 74.dp,
        headerPaddings = PaddingValues(16.dp),
        headerTextStyle = SddsSandboxTheme.typography.bodyMBold,
        headerTextColor = SddsSandboxTheme.colors.textDefaultPrimary,
        headerDescriptionTextColor = SddsSandboxTheme.colors.textDefaultSecondary,
        propertyLabelTextStyle = SddsSandboxTheme.typography.bodyMNormal,
        propertyValueTextColor = SddsSandboxTheme.colors.textDefaultPrimary.asInteractive(
            focused = if (darkTheme) {
                SddsSandboxTheme.colors.textInversePrimary
            } else {
                SddsSandboxTheme.colors.textDefaultPrimary
            },
        ),
        propertyValueTextStyle = SddsSandboxTheme.typography.bodyMNormal,
        propertyLabelTextColor = SddsSandboxTheme.colors.textDefaultSecondary.asInteractive(
            focused = if (darkTheme) {
                SddsSandboxTheme.colors.textInverseSecondary
            } else {
                SddsSandboxTheme.colors.textDefaultSecondary
            },
        ),
        propertyBackgroundColor = ComposeColor.Transparent.asInteractive(
            focused = if (darkTheme) {
                SddsSandboxTheme.colors.surfaceDefaultSolidDefault
            } else {
                SddsSandboxTheme.colors.surfaceDefaultTransparentSecondary
            },
        ),
        propertyPaddings = 6.dp,
        spaceBetweenProperties = 14.dp,
        propertySwitchStyle = Switch.M.ToggleS.style(),
        propertyItemShape = SddsSandboxTheme.shapes.roundXs,
        propertyHeight = 24.dp,
        dividerWidth = 1.dp,
        dividerColor = SddsSandboxTheme.colors.surfaceDefaultSolidSecondary,
        resetButtonStyle = IconButton.Xs.Pilled.Clear.style(),
    )

private val DarkColors = darkSddsSandboxColors()
private val LightColors = lightSddsSandboxColors()
private val DarkGradients = darkSddsSandboxGradients()
private val LightGradients = lightSddsSandboxGradients()
