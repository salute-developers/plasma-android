// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.plasma.homeds.styles.dropdownloadingstate

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.DropdownLoadingStateStyle
import com.sdds.compose.uikit.DropdownLoadingStateStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.plasma.homeds.styles.basicbutton.BasicButton
import com.sdds.plasma.homeds.styles.basicbutton.Clear
import com.sdds.plasma.homeds.styles.basicbutton.M
import com.sdds.plasma.homeds.styles.spinner.Default
import com.sdds.plasma.homeds.styles.spinner.Spinner
import com.sdds.plasma.homeds.styles.spinner.Xs
import com.sdds.plasma.homeds.theme.PlasmaHomeDsTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperDropdownLoadingState :
    BuilderWrapper<DropdownLoadingStateStyle, DropdownLoadingStateStyleBuilder>

/**
 * Обертка для вариации Default
 */
@JvmInline
public value class WrapperDropdownLoadingStateDefault(
    public override val builder: DropdownLoadingStateStyleBuilder,
) : WrapperDropdownLoadingState

public val DropdownLoadingState.Default: WrapperDropdownLoadingStateDefault
    @Composable
    @JvmName("WrapperDropdownLoadingStateDefault")
    get() = DropdownLoadingStateStyle.builder(this)
        .labelStyle(PlasmaHomeDsTheme.typography.bodyMNormal)
        .buttonStyle(BasicButton.M.Clear.style())
        .spinnerStyle(Spinner.Xs.Default.style())
        .colors {
            labelColor(SolidColor(PlasmaHomeDsTheme.colors.textDefaultPrimary).asStatefulValue())
        }
        .dimensions {
            gap(6.0.dp)
            paddingTop(12.0.dp)
            paddingBottom(12.0.dp)
        }
        .wrap(::WrapperDropdownLoadingStateDefault)
