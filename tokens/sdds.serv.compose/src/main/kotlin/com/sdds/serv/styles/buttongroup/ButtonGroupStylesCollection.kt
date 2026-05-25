// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.buttongroup

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
    BasicButtonGroupXxs("BasicButtonGroup.Xxs"),
    BasicButtonGroupXxsWide("BasicButtonGroup.Xxs.Wide"),
    BasicButtonGroupXxsWideDefault("BasicButtonGroup.Xxs.Wide.Default"),
    BasicButtonGroupXxsWideSegmented("BasicButtonGroup.Xxs.Wide.Segmented"),
    BasicButtonGroupXxsDense("BasicButtonGroup.Xxs.Dense"),
    BasicButtonGroupXxsDenseDefault("BasicButtonGroup.Xxs.Dense.Default"),
    BasicButtonGroupXxsDenseSegmented("BasicButtonGroup.Xxs.Dense.Segmented"),
    BasicButtonGroupXxsNoGap("BasicButtonGroup.Xxs.NoGap"),
    BasicButtonGroupXxsNoGapDefault("BasicButtonGroup.Xxs.NoGap.Default"),
    BasicButtonGroupXxsNoGapSegmented("BasicButtonGroup.Xxs.NoGap.Segmented"),
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
    IconButtonGroupXs("IconButtonGroup.Xs"),
    IconButtonGroupXsWide("IconButtonGroup.Xs.Wide"),
    IconButtonGroupXsWideDefault("IconButtonGroup.Xs.Wide.Default"),
    IconButtonGroupXsWidePilled("IconButtonGroup.Xs.Wide.Pilled"),
    IconButtonGroupXsWideSegmented("IconButtonGroup.Xs.Wide.Segmented"),
    IconButtonGroupXsDense("IconButtonGroup.Xs.Dense"),
    IconButtonGroupXsDenseDefault("IconButtonGroup.Xs.Dense.Default"),
    IconButtonGroupXsDensePilled("IconButtonGroup.Xs.Dense.Pilled"),
    IconButtonGroupXsDenseSegmented("IconButtonGroup.Xs.Dense.Segmented"),
    IconButtonGroupXsNoGap("IconButtonGroup.Xs.NoGap"),
    IconButtonGroupXsNoGapDefault("IconButtonGroup.Xs.NoGap.Default"),
    IconButtonGroupXsNoGapPilled("IconButtonGroup.Xs.NoGap.Pilled"),
    IconButtonGroupXsNoGapSegmented("IconButtonGroup.Xs.NoGap.Segmented"),
    IconButtonGroupS("IconButtonGroup.S"),
    IconButtonGroupSWide("IconButtonGroup.S.Wide"),
    IconButtonGroupSWideDefault("IconButtonGroup.S.Wide.Default"),
    IconButtonGroupSWidePilled("IconButtonGroup.S.Wide.Pilled"),
    IconButtonGroupSWideSegmented("IconButtonGroup.S.Wide.Segmented"),
    IconButtonGroupSDense("IconButtonGroup.S.Dense"),
    IconButtonGroupSDenseDefault("IconButtonGroup.S.Dense.Default"),
    IconButtonGroupSDensePilled("IconButtonGroup.S.Dense.Pilled"),
    IconButtonGroupSDenseSegmented("IconButtonGroup.S.Dense.Segmented"),
    IconButtonGroupSNoGap("IconButtonGroup.S.NoGap"),
    IconButtonGroupSNoGapDefault("IconButtonGroup.S.NoGap.Default"),
    IconButtonGroupSNoGapPilled("IconButtonGroup.S.NoGap.Pilled"),
    IconButtonGroupSNoGapSegmented("IconButtonGroup.S.NoGap.Segmented"),
    IconButtonGroupM("IconButtonGroup.M"),
    IconButtonGroupMWide("IconButtonGroup.M.Wide"),
    IconButtonGroupMWideDefault("IconButtonGroup.M.Wide.Default"),
    IconButtonGroupMWidePilled("IconButtonGroup.M.Wide.Pilled"),
    IconButtonGroupMWideSegmented("IconButtonGroup.M.Wide.Segmented"),
    IconButtonGroupMDense("IconButtonGroup.M.Dense"),
    IconButtonGroupMDenseDefault("IconButtonGroup.M.Dense.Default"),
    IconButtonGroupMDensePilled("IconButtonGroup.M.Dense.Pilled"),
    IconButtonGroupMDenseSegmented("IconButtonGroup.M.Dense.Segmented"),
    IconButtonGroupMNoGap("IconButtonGroup.M.NoGap"),
    IconButtonGroupMNoGapDefault("IconButtonGroup.M.NoGap.Default"),
    IconButtonGroupMNoGapPilled("IconButtonGroup.M.NoGap.Pilled"),
    IconButtonGroupMNoGapSegmented("IconButtonGroup.M.NoGap.Segmented"),
    IconButtonGroupL("IconButtonGroup.L"),
    IconButtonGroupLWide("IconButtonGroup.L.Wide"),
    IconButtonGroupLWideDefault("IconButtonGroup.L.Wide.Default"),
    IconButtonGroupLWidePilled("IconButtonGroup.L.Wide.Pilled"),
    IconButtonGroupLWideSegmented("IconButtonGroup.L.Wide.Segmented"),
    IconButtonGroupLDense("IconButtonGroup.L.Dense"),
    IconButtonGroupLDenseDefault("IconButtonGroup.L.Dense.Default"),
    IconButtonGroupLDensePilled("IconButtonGroup.L.Dense.Pilled"),
    IconButtonGroupLDenseSegmented("IconButtonGroup.L.Dense.Segmented"),
    IconButtonGroupLNoGap("IconButtonGroup.L.NoGap"),
    IconButtonGroupLNoGapDefault("IconButtonGroup.L.NoGap.Default"),
    IconButtonGroupLNoGapPilled("IconButtonGroup.L.NoGap.Pilled"),
    IconButtonGroupLNoGapSegmented("IconButtonGroup.L.NoGap.Segmented"),
    ;

    /**
     * Typed API для подбора стиля basic-button-group
     */
    public object BasicButtonGroup

    /**
     * Typed API для подбора стиля icon-button-group
     */
    public object IconButtonGroup
}

/**
 * Возможные значения свойства size для basic-button-group
 */
public enum class ButtonGroupBasicButtonGroupSize {
    Xxs,
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства gap для basic-button-group
 */
public enum class ButtonGroupBasicButtonGroupGap {
    Wide,
    Dense,
    None,
}

/**
 * Возможные значения свойства shape для basic-button-group
 */
public enum class ButtonGroupBasicButtonGroupShape {
    Default,
    Segmented,
}

/**
 * Возможные значения свойства size для icon-button-group
 */
public enum class ButtonGroupIconButtonGroupSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства gap для icon-button-group
 */
public enum class ButtonGroupIconButtonGroupGap {
    Wide,
    Dense,
    None,
}

/**
 * Возможные значения свойства shape для icon-button-group
 */
public enum class ButtonGroupIconButtonGroupShape {
    Default,
    Pilled,
    Segmented,
}

/**
 * Возвращает [ButtonGroupStyle] для [ButtonGroupStyles]
 */
@Composable
public fun ButtonGroupStyles.style(modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {}): ButtonGroupStyle {
    val builder = when (this) {
        ButtonGroupStyles.BasicButtonGroupXxs -> BasicButtonGroup.Xxs
        ButtonGroupStyles.BasicButtonGroupXxsWide -> BasicButtonGroup.Xxs.Wide
        ButtonGroupStyles.BasicButtonGroupXxsWideDefault -> BasicButtonGroup.Xxs.Wide.Default
        ButtonGroupStyles.BasicButtonGroupXxsWideSegmented -> BasicButtonGroup.Xxs.Wide.Segmented
        ButtonGroupStyles.BasicButtonGroupXxsDense -> BasicButtonGroup.Xxs.Dense
        ButtonGroupStyles.BasicButtonGroupXxsDenseDefault -> BasicButtonGroup.Xxs.Dense.Default
        ButtonGroupStyles.BasicButtonGroupXxsDenseSegmented -> BasicButtonGroup.Xxs.Dense.Segmented
        ButtonGroupStyles.BasicButtonGroupXxsNoGap -> BasicButtonGroup.Xxs.NoGap
        ButtonGroupStyles.BasicButtonGroupXxsNoGapDefault -> BasicButtonGroup.Xxs.NoGap.Default
        ButtonGroupStyles.BasicButtonGroupXxsNoGapSegmented -> BasicButtonGroup.Xxs.NoGap.Segmented
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
        ButtonGroupStyles.IconButtonGroupXs -> IconButtonGroup.Xs
        ButtonGroupStyles.IconButtonGroupXsWide -> IconButtonGroup.Xs.Wide
        ButtonGroupStyles.IconButtonGroupXsWideDefault -> IconButtonGroup.Xs.Wide.Default
        ButtonGroupStyles.IconButtonGroupXsWidePilled -> IconButtonGroup.Xs.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupXsWideSegmented -> IconButtonGroup.Xs.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupXsDense -> IconButtonGroup.Xs.Dense
        ButtonGroupStyles.IconButtonGroupXsDenseDefault -> IconButtonGroup.Xs.Dense.Default
        ButtonGroupStyles.IconButtonGroupXsDensePilled -> IconButtonGroup.Xs.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupXsDenseSegmented -> IconButtonGroup.Xs.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupXsNoGap -> IconButtonGroup.Xs.NoGap
        ButtonGroupStyles.IconButtonGroupXsNoGapDefault -> IconButtonGroup.Xs.NoGap.Default
        ButtonGroupStyles.IconButtonGroupXsNoGapPilled -> IconButtonGroup.Xs.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupXsNoGapSegmented -> IconButtonGroup.Xs.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupS -> IconButtonGroup.S
        ButtonGroupStyles.IconButtonGroupSWide -> IconButtonGroup.S.Wide
        ButtonGroupStyles.IconButtonGroupSWideDefault -> IconButtonGroup.S.Wide.Default
        ButtonGroupStyles.IconButtonGroupSWidePilled -> IconButtonGroup.S.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupSWideSegmented -> IconButtonGroup.S.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupSDense -> IconButtonGroup.S.Dense
        ButtonGroupStyles.IconButtonGroupSDenseDefault -> IconButtonGroup.S.Dense.Default
        ButtonGroupStyles.IconButtonGroupSDensePilled -> IconButtonGroup.S.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupSDenseSegmented -> IconButtonGroup.S.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupSNoGap -> IconButtonGroup.S.NoGap
        ButtonGroupStyles.IconButtonGroupSNoGapDefault -> IconButtonGroup.S.NoGap.Default
        ButtonGroupStyles.IconButtonGroupSNoGapPilled -> IconButtonGroup.S.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupSNoGapSegmented -> IconButtonGroup.S.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupM -> IconButtonGroup.M
        ButtonGroupStyles.IconButtonGroupMWide -> IconButtonGroup.M.Wide
        ButtonGroupStyles.IconButtonGroupMWideDefault -> IconButtonGroup.M.Wide.Default
        ButtonGroupStyles.IconButtonGroupMWidePilled -> IconButtonGroup.M.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupMWideSegmented -> IconButtonGroup.M.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupMDense -> IconButtonGroup.M.Dense
        ButtonGroupStyles.IconButtonGroupMDenseDefault -> IconButtonGroup.M.Dense.Default
        ButtonGroupStyles.IconButtonGroupMDensePilled -> IconButtonGroup.M.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupMDenseSegmented -> IconButtonGroup.M.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupMNoGap -> IconButtonGroup.M.NoGap
        ButtonGroupStyles.IconButtonGroupMNoGapDefault -> IconButtonGroup.M.NoGap.Default
        ButtonGroupStyles.IconButtonGroupMNoGapPilled -> IconButtonGroup.M.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupMNoGapSegmented -> IconButtonGroup.M.NoGap.Segmented
        ButtonGroupStyles.IconButtonGroupL -> IconButtonGroup.L
        ButtonGroupStyles.IconButtonGroupLWide -> IconButtonGroup.L.Wide
        ButtonGroupStyles.IconButtonGroupLWideDefault -> IconButtonGroup.L.Wide.Default
        ButtonGroupStyles.IconButtonGroupLWidePilled -> IconButtonGroup.L.Wide.Pilled
        ButtonGroupStyles.IconButtonGroupLWideSegmented -> IconButtonGroup.L.Wide.Segmented
        ButtonGroupStyles.IconButtonGroupLDense -> IconButtonGroup.L.Dense
        ButtonGroupStyles.IconButtonGroupLDenseDefault -> IconButtonGroup.L.Dense.Default
        ButtonGroupStyles.IconButtonGroupLDensePilled -> IconButtonGroup.L.Dense.Pilled
        ButtonGroupStyles.IconButtonGroupLDenseSegmented -> IconButtonGroup.L.Dense.Segmented
        ButtonGroupStyles.IconButtonGroupLNoGap -> IconButtonGroup.L.NoGap
        ButtonGroupStyles.IconButtonGroupLNoGapDefault -> IconButtonGroup.L.NoGap.Default
        ButtonGroupStyles.IconButtonGroupLNoGapPilled -> IconButtonGroup.L.NoGap.Pilled
        ButtonGroupStyles.IconButtonGroupLNoGapSegmented -> IconButtonGroup.L.NoGap.Segmented
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ButtonGroupStyles] для basic-button-group
 */
public fun ButtonGroupStyles.BasicButtonGroup.resolve(
    size: ButtonGroupBasicButtonGroupSize = ButtonGroupBasicButtonGroupSize.Xxs,
    gap: ButtonGroupBasicButtonGroupGap = ButtonGroupBasicButtonGroupGap.Wide,
    shape: ButtonGroupBasicButtonGroupShape = ButtonGroupBasicButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Wide &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXxsWideDefault
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Wide &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXxsWideSegmented
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXxsDenseDefault
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXxsDenseSegmented
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.None &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXxsNoGapDefault
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.None &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXxsNoGapSegmented
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Wide &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXsWideDefault
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Wide &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXsWideSegmented
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXsDenseDefault
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXsDenseSegmented
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.None &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupXsNoGapDefault
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.None &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupXsNoGapSegmented
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSWideDefault
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupSWideSegmented
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSDenseDefault
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupSDenseSegmented
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupSNoGapDefault
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupSNoGapSegmented
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMWideDefault
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupMWideSegmented
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMDenseDefault
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupMDenseSegmented
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupMNoGapDefault
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupMNoGapSegmented
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLWideDefault
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Wide && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupLWideSegmented
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLDenseDefault
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Dense &&
        shape == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupLDenseSegmented
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Default ->
        ButtonGroupStyles.BasicButtonGroupLNoGapDefault
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.None && shape
        == ButtonGroupBasicButtonGroupShape.Segmented ->
        ButtonGroupStyles.BasicButtonGroupLNoGapSegmented
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupXxsWide
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupXxsDense
    size == ButtonGroupBasicButtonGroupSize.Xxs && gap == ButtonGroupBasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupXxsNoGap
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupXsWide
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupXsDense
    size == ButtonGroupBasicButtonGroupSize.Xs && gap == ButtonGroupBasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupXsNoGap
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupSWide
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupSDense
    size == ButtonGroupBasicButtonGroupSize.S && gap == ButtonGroupBasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupSNoGap
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupMWide
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupMDense
    size == ButtonGroupBasicButtonGroupSize.M && gap == ButtonGroupBasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupMNoGap
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupLWide
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupLDense
    size == ButtonGroupBasicButtonGroupSize.L && gap == ButtonGroupBasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupLNoGap
    size == ButtonGroupBasicButtonGroupSize.Xxs -> ButtonGroupStyles.BasicButtonGroupXxs
    size == ButtonGroupBasicButtonGroupSize.Xs -> ButtonGroupStyles.BasicButtonGroupXs
    size == ButtonGroupBasicButtonGroupSize.S -> ButtonGroupStyles.BasicButtonGroupS
    size == ButtonGroupBasicButtonGroupSize.M -> ButtonGroupStyles.BasicButtonGroupM
    size == ButtonGroupBasicButtonGroupSize.L -> ButtonGroupStyles.BasicButtonGroupL
    else -> error("Unsupported basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.BasicButtonGroup.style(
    size: ButtonGroupBasicButtonGroupSize = ButtonGroupBasicButtonGroupSize.Xxs,
    gap: ButtonGroupBasicButtonGroupGap = ButtonGroupBasicButtonGroupGap.Wide,
    shape: ButtonGroupBasicButtonGroupShape = ButtonGroupBasicButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для icon-button-group
 */
public fun ButtonGroupStyles.IconButtonGroup.resolve(
    size: ButtonGroupIconButtonGroupSize = ButtonGroupIconButtonGroupSize.Xs,
    gap: ButtonGroupIconButtonGroupGap = ButtonGroupIconButtonGroupGap.Wide,
    shape: ButtonGroupIconButtonGroupShape = ButtonGroupIconButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupXsWideDefault
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsWidePilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsWideSegmented
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Default ->
        ButtonGroupStyles.IconButtonGroupXsDenseDefault
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsDensePilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsDenseSegmented
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Default ->
        ButtonGroupStyles.IconButtonGroupXsNoGapDefault
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsNoGapPilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSWideDefault
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSWidePilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSWideSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSDenseDefault
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSDensePilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSDenseSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSNoGapDefault
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSNoGapPilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMWideDefault
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMWidePilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMWideSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMDenseDefault
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMDensePilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMDenseSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMNoGapDefault
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMNoGapPilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLWideDefault
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLWidePilled
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupLWideSegmented
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLDenseDefault
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLDensePilled
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupLDenseSegmented
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLNoGapDefault
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLNoGapPilled
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupLNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupXsWide
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupXsDense
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupXsNoGap
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupSWide
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupSDense
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupSNoGap
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupMWide
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupMDense
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupMNoGap
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupLWide
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupLDense
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupLNoGap
    size == ButtonGroupIconButtonGroupSize.Xs -> ButtonGroupStyles.IconButtonGroupXs
    size == ButtonGroupIconButtonGroupSize.S -> ButtonGroupStyles.IconButtonGroupS
    size == ButtonGroupIconButtonGroupSize.M -> ButtonGroupStyles.IconButtonGroupM
    size == ButtonGroupIconButtonGroupSize.L -> ButtonGroupStyles.IconButtonGroupL
    else -> error("Unsupported icon-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для icon-button-group
 */
@Composable
public fun ButtonGroupStyles.IconButtonGroup.style(
    size: ButtonGroupIconButtonGroupSize = ButtonGroupIconButtonGroupSize.Xs,
    gap: ButtonGroupIconButtonGroupGap = ButtonGroupIconButtonGroupGap.Wide,
    shape: ButtonGroupIconButtonGroupShape = ButtonGroupIconButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)
