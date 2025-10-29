// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.plasma.homeds.styles.buttongroup

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.ButtonGroupStyle
import com.sdds.compose.uikit.ButtonGroupStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента ButtonGroup
 */
public enum class ButtonGroupStyles(
    public val key: String,
) {
    BasicButtonGroupXs("BasicButtonGroup.Xs"),
    BasicButtonGroupXsWide("BasicButtonGroup.Xs.Wide"),
    BasicButtonGroupXsWideDefault("BasicButtonGroup.Xs.Wide.Default"),
    BasicButtonGroupXsWideSegmented("BasicButtonGroup.Xs.Wide.Segmented"),
    BasicButtonGroupXsDense("BasicButtonGroup.Xs.Dense"),
    BasicButtonGroupXsDenseDefault("BasicButtonGroup.Xs.Dense.Default"),
    BasicButtonGroupXsDenseSegmented("BasicButtonGroup.Xs.Dense.Segmented"),
    BasicButtonGroupXsNoGap("BasicButtonGroup.Xs.NoGap"),
    BasicButtonGroupXsNoGapDefault("BasicButtonGroup.Xs.NoGap.Default"),
    BasicButtonGroupXsNoGapSegmented("BasicButtonGroup.Xs.NoGap.Segmented"),
    BasicButtonGroupS("BasicButtonGroup.S"),
    BasicButtonGroupSWide("BasicButtonGroup.S.Wide"),
    BasicButtonGroupSWideDefault("BasicButtonGroup.S.Wide.Default"),
    BasicButtonGroupSWideSegmented("BasicButtonGroup.S.Wide.Segmented"),
    BasicButtonGroupSDense("BasicButtonGroup.S.Dense"),
    BasicButtonGroupSDenseDefault("BasicButtonGroup.S.Dense.Default"),
    BasicButtonGroupSDenseSegmented("BasicButtonGroup.S.Dense.Segmented"),
    BasicButtonGroupSNoGap("BasicButtonGroup.S.NoGap"),
    BasicButtonGroupSNoGapDefault("BasicButtonGroup.S.NoGap.Default"),
    BasicButtonGroupSNoGapSegmented("BasicButtonGroup.S.NoGap.Segmented"),
    BasicButtonGroupM("BasicButtonGroup.M"),
    BasicButtonGroupMWide("BasicButtonGroup.M.Wide"),
    BasicButtonGroupMWideDefault("BasicButtonGroup.M.Wide.Default"),
    BasicButtonGroupMWideSegmented("BasicButtonGroup.M.Wide.Segmented"),
    BasicButtonGroupMDense("BasicButtonGroup.M.Dense"),
    BasicButtonGroupMDenseDefault("BasicButtonGroup.M.Dense.Default"),
    BasicButtonGroupMDenseSegmented("BasicButtonGroup.M.Dense.Segmented"),
    BasicButtonGroupMNoGap("BasicButtonGroup.M.NoGap"),
    BasicButtonGroupMNoGapDefault("BasicButtonGroup.M.NoGap.Default"),
    BasicButtonGroupMNoGapSegmented("BasicButtonGroup.M.NoGap.Segmented"),
    IconButtonGroupXs("IconButtonGroup.Xs"),
    IconButtonGroupXsWide("IconButtonGroup.Xs.Wide"),
    IconButtonGroupXsWidePilled("IconButtonGroup.Xs.Wide.Pilled"),
    IconButtonGroupXsWideSegmented("IconButtonGroup.Xs.Wide.Segmented"),
    IconButtonGroupXsDense("IconButtonGroup.Xs.Dense"),
    IconButtonGroupXsDensePilled("IconButtonGroup.Xs.Dense.Pilled"),
    IconButtonGroupXsDenseSegmented("IconButtonGroup.Xs.Dense.Segmented"),
    IconButtonGroupXsNoGap("IconButtonGroup.Xs.NoGap"),
    IconButtonGroupXsNoGapPilled("IconButtonGroup.Xs.NoGap.Pilled"),
    IconButtonGroupXsNoGapSegmented("IconButtonGroup.Xs.NoGap.Segmented"),
    IconButtonGroupS("IconButtonGroup.S"),
    IconButtonGroupSWide("IconButtonGroup.S.Wide"),
    IconButtonGroupSWidePilled("IconButtonGroup.S.Wide.Pilled"),
    IconButtonGroupSWideSegmented("IconButtonGroup.S.Wide.Segmented"),
    IconButtonGroupSDense("IconButtonGroup.S.Dense"),
    IconButtonGroupSDensePilled("IconButtonGroup.S.Dense.Pilled"),
    IconButtonGroupSDenseSegmented("IconButtonGroup.S.Dense.Segmented"),
    IconButtonGroupSNoGap("IconButtonGroup.S.NoGap"),
    IconButtonGroupSNoGapPilled("IconButtonGroup.S.NoGap.Pilled"),
    IconButtonGroupSNoGapSegmented("IconButtonGroup.S.NoGap.Segmented"),
    IconButtonGroupM("IconButtonGroup.M"),
    IconButtonGroupMWide("IconButtonGroup.M.Wide"),
    IconButtonGroupMWidePilled("IconButtonGroup.M.Wide.Pilled"),
    IconButtonGroupMWideSegmented("IconButtonGroup.M.Wide.Segmented"),
    IconButtonGroupMDense("IconButtonGroup.M.Dense"),
    IconButtonGroupMDensePilled("IconButtonGroup.M.Dense.Pilled"),
    IconButtonGroupMDenseSegmented("IconButtonGroup.M.Dense.Segmented"),
    IconButtonGroupMNoGap("IconButtonGroup.M.NoGap"),
    IconButtonGroupMNoGapPilled("IconButtonGroup.M.NoGap.Pilled"),
    IconButtonGroupMNoGapSegmented("IconButtonGroup.M.NoGap.Segmented"),
    IconButtonGroupL("IconButtonGroup.L"),
    IconButtonGroupLWide("IconButtonGroup.L.Wide"),
    IconButtonGroupLWidePilled("IconButtonGroup.L.Wide.Pilled"),
    IconButtonGroupLWideSegmented("IconButtonGroup.L.Wide.Segmented"),
    IconButtonGroupLDense("IconButtonGroup.L.Dense"),
    IconButtonGroupLDensePilled("IconButtonGroup.L.Dense.Pilled"),
    IconButtonGroupLDenseSegmented("IconButtonGroup.L.Dense.Segmented"),
    IconButtonGroupLNoGap("IconButtonGroup.L.NoGap"),
    IconButtonGroupLNoGapPilled("IconButtonGroup.L.NoGap.Pilled"),
    IconButtonGroupLNoGapSegmented("IconButtonGroup.L.NoGap.Segmented"),
}

/**
 * Возвращает [ButtonGroupStyle] для [ButtonGroupStyles]
 */
@Composable
public fun ButtonGroupStyles.style(
    modifyAction: @Composable ButtonGroupStyleBuilder.() -> Unit =
        {},
): ButtonGroupStyle {
    val builder = when (this) {
        ButtonGroupStyles.BasicButtonGroupXs -> BasicButtonGroup.Xs
        ButtonGroupStyles.BasicButtonGroupXsWide -> BasicButtonGroup.Xs.Wide
        ButtonGroupStyles.BasicButtonGroupXsWideDefault -> BasicButtonGroup.Xs.Wide.Default
        ButtonGroupStyles.BasicButtonGroupXsWideSegmented -> BasicButtonGroup.Xs.Wide.Segmented
        ButtonGroupStyles.BasicButtonGroupXsDense -> BasicButtonGroup.Xs.Dense
        ButtonGroupStyles.BasicButtonGroupXsDenseDefault -> BasicButtonGroup.Xs.Dense.Default
        ButtonGroupStyles.BasicButtonGroupXsDenseSegmented -> BasicButtonGroup.Xs.Dense.Segmented
        ButtonGroupStyles.BasicButtonGroupXsNoGap -> BasicButtonGroup.Xs.NoGap
        ButtonGroupStyles.BasicButtonGroupXsNoGapDefault -> BasicButtonGroup.Xs.NoGap.Default
        ButtonGroupStyles.BasicButtonGroupXsNoGapSegmented -> BasicButtonGroup.Xs.NoGap.Segmented
        ButtonGroupStyles.BasicButtonGroupS -> BasicButtonGroup.S
        ButtonGroupStyles.BasicButtonGroupSWide -> BasicButtonGroup.S.Wide
        ButtonGroupStyles.BasicButtonGroupSWideDefault -> BasicButtonGroup.S.Wide.Default
        ButtonGroupStyles.BasicButtonGroupSWideSegmented -> BasicButtonGroup.S.Wide.Segmented
        ButtonGroupStyles.BasicButtonGroupSDense -> BasicButtonGroup.S.Dense
        ButtonGroupStyles.BasicButtonGroupSDenseDefault -> BasicButtonGroup.S.Dense.Default
        ButtonGroupStyles.BasicButtonGroupSDenseSegmented -> BasicButtonGroup.S.Dense.Segmented
        ButtonGroupStyles.BasicButtonGroupSNoGap -> BasicButtonGroup.S.NoGap
        ButtonGroupStyles.BasicButtonGroupSNoGapDefault -> BasicButtonGroup.S.NoGap.Default
        ButtonGroupStyles.BasicButtonGroupSNoGapSegmented -> BasicButtonGroup.S.NoGap.Segmented
        ButtonGroupStyles.BasicButtonGroupM -> BasicButtonGroup.M
        ButtonGroupStyles.BasicButtonGroupMWide -> BasicButtonGroup.M.Wide
        ButtonGroupStyles.BasicButtonGroupMWideDefault -> BasicButtonGroup.M.Wide.Default
        ButtonGroupStyles.BasicButtonGroupMWideSegmented -> BasicButtonGroup.M.Wide.Segmented
        ButtonGroupStyles.BasicButtonGroupMDense -> BasicButtonGroup.M.Dense
        ButtonGroupStyles.BasicButtonGroupMDenseDefault -> BasicButtonGroup.M.Dense.Default
        ButtonGroupStyles.BasicButtonGroupMDenseSegmented -> BasicButtonGroup.M.Dense.Segmented
        ButtonGroupStyles.BasicButtonGroupMNoGap -> BasicButtonGroup.M.NoGap
        ButtonGroupStyles.BasicButtonGroupMNoGapDefault -> BasicButtonGroup.M.NoGap.Default
        ButtonGroupStyles.BasicButtonGroupMNoGapSegmented -> BasicButtonGroup.M.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupXs -> IconButtonGroup.Xs
        ButtonGroupStyles.IconButtonGroupXsWide -> IconButtonGroup.Xs.Wide
        ButtonGroupStyles.IconButtonGroupXsWidePilled -> IconButtonGroup.Xs.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupXsWideSegmented -> IconButtonGroup.Xs.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupXsDense -> IconButtonGroup.Xs.Dense
        ButtonGroupStyles.IconButtonGroupXsDensePilled -> IconButtonGroup.Xs.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupXsDenseSegmented -> IconButtonGroup.Xs.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupXsNoGap -> IconButtonGroup.Xs.NoGap
        ButtonGroupStyles.IconButtonGroupXsNoGapPilled -> IconButtonGroup.Xs.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupXsNoGapSegmented -> IconButtonGroup.Xs.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupS -> IconButtonGroup.S
        ButtonGroupStyles.IconButtonGroupSWide -> IconButtonGroup.S.Wide
        ButtonGroupStyles.IconButtonGroupSWidePilled -> IconButtonGroup.S.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupSWideSegmented -> IconButtonGroup.S.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupSDense -> IconButtonGroup.S.Dense
        ButtonGroupStyles.IconButtonGroupSDensePilled -> IconButtonGroup.S.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupSDenseSegmented -> IconButtonGroup.S.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupSNoGap -> IconButtonGroup.S.NoGap
        ButtonGroupStyles.IconButtonGroupSNoGapPilled -> IconButtonGroup.S.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupSNoGapSegmented -> IconButtonGroup.S.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupM -> IconButtonGroup.M
        ButtonGroupStyles.IconButtonGroupMWide -> IconButtonGroup.M.Wide
        ButtonGroupStyles.IconButtonGroupMWidePilled -> IconButtonGroup.M.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupMWideSegmented -> IconButtonGroup.M.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupMDense -> IconButtonGroup.M.Dense
        ButtonGroupStyles.IconButtonGroupMDensePilled -> IconButtonGroup.M.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupMDenseSegmented -> IconButtonGroup.M.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupMNoGap -> IconButtonGroup.M.NoGap
        ButtonGroupStyles.IconButtonGroupMNoGapPilled -> IconButtonGroup.M.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupMNoGapSegmented -> IconButtonGroup.M.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupL -> IconButtonGroup.L
        ButtonGroupStyles.IconButtonGroupLWide -> IconButtonGroup.L.Wide
        ButtonGroupStyles.IconButtonGroupLWidePilled -> IconButtonGroup.L.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupLWideSegmented -> IconButtonGroup.L.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupLDense -> IconButtonGroup.L.Dense
        ButtonGroupStyles.IconButtonGroupLDensePilled -> IconButtonGroup.L.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupLDenseSegmented -> IconButtonGroup.L.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupLNoGap -> IconButtonGroup.L.NoGap
        ButtonGroupStyles.IconButtonGroupLNoGapPilled -> IconButtonGroup.L.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupLNoGapSegmented -> IconButtonGroup.L.NoGap.Segmented
    }
    return builder.modify(modifyAction).style()
}
