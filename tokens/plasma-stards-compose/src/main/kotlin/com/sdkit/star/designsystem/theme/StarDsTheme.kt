// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdkit.star.designsystem.theme

import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
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
import com.sdds.compose.uikit.LocalSwitchStyle
import com.sdds.compose.uikit.LocalTextFieldStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.internal.focusselector.FocusSelectorMode
import com.sdds.compose.uikit.internal.focusselector.LocalFocusSelectorMode
import com.sdds.compose.uikit.style.style
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.AvatarGroup
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.button.basic.BasicButton
import com.sdkit.star.designsystem.styles.button.basic.M
import com.sdkit.star.designsystem.styles.button.icon.IconButton
import com.sdkit.star.designsystem.styles.button.icon.M
import com.sdkit.star.designsystem.styles.cell.Cell
import com.sdkit.star.designsystem.styles.cell.M
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkboxgroup.CheckBoxGroup
import com.sdkit.star.designsystem.styles.checkboxgroup.M
import com.sdkit.star.designsystem.styles.chip.Chip
import com.sdkit.star.designsystem.styles.chip.Default
import com.sdkit.star.designsystem.styles.chip.M
import com.sdkit.star.designsystem.styles.progressbar.Default
import com.sdkit.star.designsystem.styles.progressbar.ProgressBar
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radioboxgroup.M
import com.sdkit.star.designsystem.styles.radioboxgroup.RadioBoxGroup
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.Switch
import com.sdkit.star.designsystem.styles.textfield.Default
import com.sdkit.star.designsystem.styles.textfield.M
import com.sdkit.star.designsystem.styles.textfield.OuterLabel
import com.sdkit.star.designsystem.styles.textfield.TextField
import kotlin.Unit

/**
 * Аттрибуты темы StarDsTheme
 */
public object StarDsTheme {
    /**
     * Аттрибуты цвета
     */
    public val colors: StarDsColors
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsColors.current

    /**
     * Аттрибуты градиентов
     */
    public val gradients: StarDsGradients
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsGradients.current

    /**
     * Аттрибуты форм
     */
    public val shapes: StarDsShapes
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsShapes.current

    /**
     * Аттрибуты теней
     */
    public val shadows: StarDsShadows
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsShadows.current

    /**
     * Аттрибуты отступов
     */
    public val spacing: StarDsSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsSpacing.current

    /**
     * Аттрибуты типографики
     */
    public val typography: StarDsTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalStarDsTypography.current
}

/**
 * Базовая тема StarDs
 */
@Composable
public fun StarDsTheme(
    colors: StarDsColors = StarDsTheme.colors,
    gradients: StarDsGradients = StarDsTheme.gradients,
    shapes: StarDsShapes = defaultStarDsShapes(),
    shadows: StarDsShadows = defaultStarDsShadows(),
    typography: StarDsTypography = dynamicStarDsTypography(),
    spacing: StarDsSpacing = defaultStarDsSpacing(),
    content: @Composable () -> Unit,
) {
    val rememberColors = remember { colors.copy() }.apply { updateColorsFrom(colors) }

    val textSelectionColors = remember {
        TextSelectionColors(
            handleColor = rememberColors.textDefaultAccent,
            backgroundColor = rememberColors.textDefaultAccent.copy(0.3f),
        )
    }

    CompositionLocalProvider(
        LocalStarDsColors provides rememberColors,
        LocalStarDsGradients provides gradients,
        LocalStarDsTypography provides typography,
        LocalStarDsShapes provides shapes,
        LocalStarDsShadows provides shadows,
        LocalStarDsSpacing provides spacing,
        LocalTextSelectionColors provides textSelectionColors,
        LocalFocusSelectorMode provides FocusSelectorMode.Scale(),
        LocalSwitchStyle provides Switch.M.style(),
        LocalButtonStyle provides BasicButton.M.style(),
        LocalIconButtonStyle provides IconButton.M.style(),
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
        content = {
            ProvideTextStyle(
                value = typography.bodyMNormal.copy(color = rememberColors.textDefaultPrimary),
                content = content,
            )
        },
    )
}
