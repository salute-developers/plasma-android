// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.serv.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.resourceImageSource
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.serv.styles.avatar.Avatar
import com.sdds.serv.styles.avatar.L
import com.sdds.serv.styles.avatar.M
import com.sdds.serv.styles.avatar.S
import com.sdds.serv.styles.checkbox.CheckBox
import com.sdds.serv.styles.checkbox.Default
import com.sdds.serv.styles.checkbox.M
import com.sdds.serv.styles.checkbox.S
import com.sdds.serv.styles.iconbutton.Clear
import com.sdds.serv.styles.iconbutton.IconButton
import com.sdds.serv.styles.iconbutton.L
import com.sdds.serv.styles.iconbutton.M
import com.sdds.serv.styles.iconbutton.S
import com.sdds.serv.styles.iconbutton.Xs
import com.sdds.serv.styles.radiobox.M
import com.sdds.serv.styles.radiobox.RadioBox
import com.sdds.serv.styles.radiobox.S
import com.sdds.serv.styles.switcher.L
import com.sdds.serv.styles.switcher.M
import com.sdds.serv.styles.switcher.S
import com.sdds.serv.styles.switcher.Switch
import com.sdds.serv.theme.SddsServTheme
import kotlin.Suppress
import kotlin.jvm.JvmInline
import kotlin.jvm.JvmName

/**
 * Базовый интерфейс для всех оберток этого стиля
 */
public interface WrapperCell : BuilderWrapper<CellStyle, CellStyleBuilder>

/**
 * Обертка для вариации L
 */
@JvmInline
public value class WrapperCellL(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации M
 */
@JvmInline
public value class WrapperCellM(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации S
 */
@JvmInline
public value class WrapperCellS(
    public override val builder: CellStyleBuilder,
) : WrapperCell

/**
 * Обертка для вариации Xs
 */
@JvmInline
public value class WrapperCellXs(
    public override val builder: CellStyleBuilder,
) : WrapperCell

private val CellStyleBuilder.invariantProps: CellStyleBuilder
    @Composable
    get() = this
        .colors {
            titleColor(SolidColor(SddsServTheme.colors.textDefaultPrimary).asStatefulValue())
            labelColor(SolidColor(SddsServTheme.colors.textDefaultSecondary).asStatefulValue())
            subtitleColor(SolidColor(SddsServTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureTextColor(SolidColor(SddsServTheme.colors.textDefaultSecondary).asStatefulValue())
            disclosureIconColor(SolidColor(SddsServTheme.colors.textDefaultSecondary).asStatefulValue())
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyMNormal)
        .titleStyle(SddsServTheme.typography.bodyLNormal)
        .subtitleStyle(SddsServTheme.typography.bodyMNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyMNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodySNormal)
        .titleStyle(SddsServTheme.typography.bodyMNormal)
        .subtitleStyle(SddsServTheme.typography.bodySNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodySNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.Clear.style())
        .checkBoxStyle(CheckBox.M.Default.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .titleStyle(SddsServTheme.typography.bodySNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.builder(this)
        .invariantProps
        .labelStyle(SddsServTheme.typography.bodyXsNormal)
        .titleStyle(SddsServTheme.typography.bodyXsNormal)
        .subtitleStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureTextStyle(SddsServTheme.typography.bodyXsNormal)
        .disclosureIcon(resourceImageSource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.Xs.Clear.style())
        .checkBoxStyle(CheckBox.S.Default.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .wrap(::WrapperCellXs)
