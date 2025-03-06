// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdds.stylessalute.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.Cell
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.CheckBox
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.RadioBox
import com.sdds.compose.uikit.Switch
import com.sdds.compose.uikit.cellBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdds.stylessalute.styles.avatar.L
import com.sdds.stylessalute.styles.avatar.M
import com.sdds.stylessalute.styles.avatar.S
import com.sdds.stylessalute.styles.button.icon.Clear
import com.sdds.stylessalute.styles.button.icon.L
import com.sdds.stylessalute.styles.button.icon.M
import com.sdds.stylessalute.styles.button.icon.S
import com.sdds.stylessalute.styles.button.icon.Xs
import com.sdds.stylessalute.styles.checkbox.M
import com.sdds.stylessalute.styles.checkbox.S
import com.sdds.stylessalute.styles.radiobox.M
import com.sdds.stylessalute.styles.radiobox.S
import com.sdds.stylessalute.styles.switcher.L
import com.sdds.stylessalute.styles.switcher.M
import com.sdds.stylessalute.styles.switcher.S
import com.sdds.stylessalute.theme.StylesSaluteTheme
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
            labelColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                StylesSaluteTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                StylesSaluteTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodyMNormal)
        .titleStyle(StylesSaluteTheme.typography.bodyLNormal)
        .subtitleStyle(StylesSaluteTheme.typography.bodyMNormal)
        .disclosureTextStyle(StylesSaluteTheme.typography.bodyMNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.Clear.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodySNormal)
        .titleStyle(StylesSaluteTheme.typography.bodyMNormal)
        .subtitleStyle(StylesSaluteTheme.typography.bodySNormal)
        .disclosureTextStyle(StylesSaluteTheme.typography.bodySNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(8.0.dp)
            contentPaddingEnd(8.0.dp)
        }
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.Clear.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .titleStyle(StylesSaluteTheme.typography.bodySNormal)
        .subtitleStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureTextStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.Clear.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .titleStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .subtitleStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureTextStyle(StylesSaluteTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(6.0.dp)
            contentPaddingEnd(6.0.dp)
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.Xs.Clear.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellXs)
