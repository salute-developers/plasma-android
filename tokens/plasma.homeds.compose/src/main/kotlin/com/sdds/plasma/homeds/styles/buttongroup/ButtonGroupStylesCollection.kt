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
    Xs,
    S,
    M,
}

/**
 * Возможные значения свойства gap для basic-button-group
 */
public enum class ButtonGroupBasicButtonGroupGap {
    None,
    Wide,
    Dense,
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
    Pilled,
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
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ButtonGroupStyles] для basic-button-group
 */
public fun ButtonGroupStyles.BasicButtonGroup.resolve(
    size: ButtonGroupBasicButtonGroupSize = ButtonGroupBasicButtonGroupSize.Xs,
    gap: ButtonGroupBasicButtonGroupGap = ButtonGroupBasicButtonGroupGap.None,
    shape: ButtonGroupBasicButtonGroupShape = ButtonGroupBasicButtonGroupShape.Default,
): ButtonGroupStyles = when {
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
    size == ButtonGroupBasicButtonGroupSize.Xs -> ButtonGroupStyles.BasicButtonGroupXs
    size == ButtonGroupBasicButtonGroupSize.S -> ButtonGroupStyles.BasicButtonGroupS
    size == ButtonGroupBasicButtonGroupSize.M -> ButtonGroupStyles.BasicButtonGroupM
    else -> error("Unsupported basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.BasicButtonGroup.style(
    size: ButtonGroupBasicButtonGroupSize = ButtonGroupBasicButtonGroupSize.Xs,
    gap: ButtonGroupBasicButtonGroupGap = ButtonGroupBasicButtonGroupGap.None,
    shape: ButtonGroupBasicButtonGroupShape = ButtonGroupBasicButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для icon-button-group
 */
public fun ButtonGroupStyles.IconButtonGroup.resolve(
    size: ButtonGroupIconButtonGroupSize = ButtonGroupIconButtonGroupSize.Xs,
    gap: ButtonGroupIconButtonGroupGap = ButtonGroupIconButtonGroupGap.Wide,
    shape: ButtonGroupIconButtonGroupShape = ButtonGroupIconButtonGroupShape.Pilled,
): ButtonGroupStyles = when {
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsWidePilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsWideSegmented
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsDensePilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsDenseSegmented
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsNoGapPilled
    size == ButtonGroupIconButtonGroupSize.Xs && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupXsNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSWidePilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSWideSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSDensePilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSDenseSegmented
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSNoGapPilled
    size == ButtonGroupIconButtonGroupSize.S && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupSNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMWidePilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMWideSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMDensePilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMDenseSegmented
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMNoGapPilled
    size == ButtonGroupIconButtonGroupSize.M && gap == ButtonGroupIconButtonGroupGap.None && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupMNoGapSegmented
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLWidePilled
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Wide && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupLWideSegmented
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLDensePilled
    size == ButtonGroupIconButtonGroupSize.L && gap == ButtonGroupIconButtonGroupGap.Dense && shape
        == ButtonGroupIconButtonGroupShape.Segmented ->
        ButtonGroupStyles.IconButtonGroupLDenseSegmented
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
    shape: ButtonGroupIconButtonGroupShape = ButtonGroupIconButtonGroupShape.Pilled,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)
