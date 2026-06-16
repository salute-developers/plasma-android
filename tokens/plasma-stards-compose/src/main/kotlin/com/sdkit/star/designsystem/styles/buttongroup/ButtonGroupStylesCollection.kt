// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdkit.star.designsystem.styles.buttongroup

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
    BasicButtonGroupL("BasicButtonGroup.L"),
    BasicButtonGroupLWide("BasicButtonGroup.L.Wide"),
    BasicButtonGroupLWideDefault("BasicButtonGroup.L.Wide.Default"),
    BasicButtonGroupLWideSegmented("BasicButtonGroup.L.Wide.Segmented"),
    BasicButtonGroupLDense("BasicButtonGroup.L.Dense"),
    BasicButtonGroupLDenseDefault("BasicButtonGroup.L.Dense.Default"),
    BasicButtonGroupLDenseSegmented("BasicButtonGroup.L.Dense.Segmented"),
    BasicButtonGroupLNoGap("BasicButtonGroup.L.NoGap"),
    BasicButtonGroupLNoGapDefault("BasicButtonGroup.L.NoGap.Default"),
    BasicButtonGroupLNoGapSegmented("BasicButtonGroup.L.NoGap.Segmented"),
    ;

    /**
     * Typed API для подбора стиля basic-button-group
     */
    public companion object
}

/**
 * Возможные значения свойства size для basic-button-group
 */
public enum class ButtonGroupSize {
    L,
    M,
    S,
    Xs,
}

/**
 * Возможные значения свойства gap для basic-button-group
 */
public enum class ButtonGroupGap {
    Wide,
    Dense,
    None,
}

/**
 * Возможные значения свойства shape для basic-button-group
 */
public enum class ButtonGroupShape {
    Default,
    Segmented,
}

/**
 * Возвращает [ButtonGroupStyle] для [ButtonGroupStyles]
 */
@Composable
public fun ButtonGroupStyles.style(modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {}): ButtonGroupStyle {
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
        ButtonGroupStyles.BasicButtonGroupL -> BasicButtonGroup.L
        ButtonGroupStyles.BasicButtonGroupLWide -> BasicButtonGroup.L.Wide
        ButtonGroupStyles.BasicButtonGroupLWideDefault -> BasicButtonGroup.L.Wide.Default
        ButtonGroupStyles.BasicButtonGroupLWideSegmented -> BasicButtonGroup.L.Wide.Segmented
        ButtonGroupStyles.BasicButtonGroupLDense -> BasicButtonGroup.L.Dense
        ButtonGroupStyles.BasicButtonGroupLDenseDefault -> BasicButtonGroup.L.Dense.Default
        ButtonGroupStyles.BasicButtonGroupLDenseSegmented -> BasicButtonGroup.L.Dense.Segmented
        ButtonGroupStyles.BasicButtonGroupLNoGap -> BasicButtonGroup.L.NoGap
        ButtonGroupStyles.BasicButtonGroupLNoGapDefault -> BasicButtonGroup.L.NoGap.Default
        ButtonGroupStyles.BasicButtonGroupLNoGapSegmented -> BasicButtonGroup.L.NoGap.Segmented
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ButtonGroupStyles] для basic-button-group
 */
public fun ButtonGroupStyles.Companion.resolve(
    size: ButtonGroupSize = ButtonGroupSize.L,
    gap: ButtonGroupGap = ButtonGroupGap.Wide,
    shape: ButtonGroupShape = ButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Wide && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXsWideDefault
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Wide && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsWideSegmented
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Dense && shape ==
        ButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXsDenseDefault
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Dense && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsDenseSegmented
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.None && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXsNoGapDefault
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.None && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsNoGapSegmented
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Wide && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSWideDefault
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Wide && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSWideSegmented
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Dense && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSDenseDefault
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Dense && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSDenseSegmented
    size == ButtonGroupSize.S && gap == ButtonGroupGap.None && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSNoGapDefault
    size == ButtonGroupSize.S && gap == ButtonGroupGap.None && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSNoGapSegmented
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Wide && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMWideDefault
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Wide && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMWideSegmented
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Dense && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMDenseDefault
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Dense && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMDenseSegmented
    size == ButtonGroupSize.M && gap == ButtonGroupGap.None && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMNoGapDefault
    size == ButtonGroupSize.M && gap == ButtonGroupGap.None && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMNoGapSegmented
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Wide && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLWideDefault
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Wide && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLWideSegmented
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Dense && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLDenseDefault
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Dense && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLDenseSegmented
    size == ButtonGroupSize.L && gap == ButtonGroupGap.None && shape == ButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLNoGapDefault
    size == ButtonGroupSize.L && gap == ButtonGroupGap.None && shape ==
        ButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLNoGapSegmented
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupXsWide
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupXsDense
    size == ButtonGroupSize.Xs && gap == ButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupXsNoGap
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupSWide
    size == ButtonGroupSize.S && gap == ButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupSDense
    size == ButtonGroupSize.S && gap == ButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupSNoGap
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupMWide
    size == ButtonGroupSize.M && gap == ButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupMDense
    size == ButtonGroupSize.M && gap == ButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupMNoGap
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupLWide
    size == ButtonGroupSize.L && gap == ButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupLDense
    size == ButtonGroupSize.L && gap == ButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupLNoGap
    size == ButtonGroupSize.Xs -> ButtonGroupStyles.BasicButtonGroupXs
    size == ButtonGroupSize.S -> ButtonGroupStyles.BasicButtonGroupS
    size == ButtonGroupSize.M -> ButtonGroupStyles.BasicButtonGroupM
    size == ButtonGroupSize.L -> ButtonGroupStyles.BasicButtonGroupL
    else -> error("Unsupported basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.Companion.style(
    size: ButtonGroupSize = ButtonGroupSize.L,
    gap: ButtonGroupGap = ButtonGroupGap.Wide,
    shape: ButtonGroupShape = ButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)
