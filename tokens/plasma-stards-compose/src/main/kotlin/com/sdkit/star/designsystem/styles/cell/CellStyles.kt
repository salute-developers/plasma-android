// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
)

package com.sdkit.star.designsystem.styles.cell

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import com.sdds.compose.uikit.CellStyle
import com.sdds.compose.uikit.CellStyleBuilder
import com.sdds.compose.uikit.cellBuilder
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.style.BuilderWrapper
import com.sdds.compose.uikit.style.style
import com.sdds.compose.uikit.style.wrap
import com.sdkit.star.designsystem.compose.R
import com.sdkit.star.designsystem.styles.avatar.Avatar
import com.sdkit.star.designsystem.styles.avatar.L
import com.sdkit.star.designsystem.styles.avatar.M
import com.sdkit.star.designsystem.styles.avatar.S
import com.sdkit.star.designsystem.styles.button.icon.IconButton
import com.sdkit.star.designsystem.styles.button.icon.L
import com.sdkit.star.designsystem.styles.button.icon.M
import com.sdkit.star.designsystem.styles.button.icon.S
import com.sdkit.star.designsystem.styles.button.icon.Xs
import com.sdkit.star.designsystem.styles.checkbox.CheckBox
import com.sdkit.star.designsystem.styles.checkbox.M
import com.sdkit.star.designsystem.styles.checkbox.S
import com.sdkit.star.designsystem.styles.radiobox.M
import com.sdkit.star.designsystem.styles.radiobox.RadioBox
import com.sdkit.star.designsystem.styles.radiobox.S
import com.sdkit.star.designsystem.styles.switcher.L
import com.sdkit.star.designsystem.styles.switcher.M
import com.sdkit.star.designsystem.styles.switcher.S
import com.sdkit.star.designsystem.styles.switcher.Switch
import com.sdkit.star.designsystem.theme.StarDsTheme
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
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            titleColor(
                StarDsTheme.colors.textDefaultPrimary.asInteractive(),
            )
            subtitleColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureTextColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
            disclosureIconColor(
                StarDsTheme.colors.textDefaultSecondary.asInteractive(),
            )
        }

public val Cell.L: WrapperCellL
    @Composable
    @JvmName("WrapperCellL")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyMNormal)
        .titleStyle(StarDsTheme.typography.bodyLNormal)
        .subtitleStyle(StarDsTheme.typography.bodyMNormal)
        .disclosureTextStyle(StarDsTheme.typography.bodyMNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_start_l))
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_end_l))
        }
        .avatarStyle(Avatar.L.style())
        .iconButtonStyle(IconButton.L.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.L.style())
        .wrap(::WrapperCellL)

public val Cell.M: WrapperCellM
    @Composable
    @JvmName("WrapperCellM")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodySNormal)
        .titleStyle(StarDsTheme.typography.bodyMNormal)
        .subtitleStyle(StarDsTheme.typography.bodySNormal)
        .disclosureTextStyle(StarDsTheme.typography.bodySNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_24))
        .dimensions {
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_start_m))
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_end_m))
        }
        .avatarStyle(Avatar.M.style())
        .iconButtonStyle(IconButton.M.style())
        .checkBoxStyle(CheckBox.M.style())
        .radioBoxStyle(RadioBox.M.style())
        .switchStyle(Switch.M.style())
        .wrap(::WrapperCellM)

public val Cell.S: WrapperCellS
    @Composable
    @JvmName("WrapperCellS")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .titleStyle(StarDsTheme.typography.bodySNormal)
        .subtitleStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureTextStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_start_s))
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_end_s))
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.S.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellS)

public val Cell.Xs: WrapperCellXs
    @Composable
    @JvmName("WrapperCellXs")
    get() = CellStyle.cellBuilder(this)
        .invariantProps
        .labelStyle(StarDsTheme.typography.bodyXsNormal)
        .titleStyle(StarDsTheme.typography.bodyXsNormal)
        .subtitleStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureTextStyle(StarDsTheme.typography.bodyXsNormal)
        .disclosureIcon(painterResource(com.sdds.icons.R.drawable.ic_disclosure_right_outline_16))
        .dimensions {
            contentPaddingStart(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_start_xs))
            contentPaddingEnd(dimensionResource(R.dimen.sdkit_cmp_cell_content_padding_end_xs))
        }
        .avatarStyle(Avatar.S.style())
        .iconButtonStyle(IconButton.Xs.style())
        .checkBoxStyle(CheckBox.S.style())
        .radioBoxStyle(RadioBox.S.style())
        .switchStyle(Switch.S.style())
        .wrap(::WrapperCellXs)
