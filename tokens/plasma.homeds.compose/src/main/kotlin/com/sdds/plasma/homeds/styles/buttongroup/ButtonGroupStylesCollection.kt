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
public enum class BasicButtonGroupSize {
    Xs,
    S,
    M,
}

/**
 * Возможные значения свойства gap для basic-button-group
 */
public enum class BasicButtonGroupGap {
    None,
    Wide,
    Dense,
}

/**
 * Возможные значения свойства shape для basic-button-group
 */
public enum class BasicButtonGroupShape {
    Default,
    Segmented,
}

/**
 * Возможные значения свойства size для icon-button-group
 */
public enum class IconButtonGroupSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства gap для icon-button-group
 */
public enum class IconButtonGroupGap {
    Wide,
    Dense,
    None,
}

/**
 * Возможные значения свойства shape для icon-button-group
 */
public enum class IconButtonGroupShape {
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
    size: BasicButtonGroupSize = BasicButtonGroupSize.Xs,
    gap: BasicButtonGroupGap = BasicButtonGroupGap.None,
    shape: BasicButtonGroupShape = BasicButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXsWideDefault
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsWideSegmented
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXsDenseDefault
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsDenseSegmented
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXsNoGapDefault
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXsNoGapSegmented
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupSWideDefault
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSWideSegmented
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupSDenseDefault
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSDenseSegmented
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupSNoGapDefault
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupSNoGapSegmented
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupMWideDefault
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMWideSegmented
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupMDenseDefault
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMDenseSegmented
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupMNoGapDefault
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupMNoGapSegmented
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupXsWide
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupXsDense
    size == BasicButtonGroupSize.Xs && gap == BasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupXsNoGap
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupSWide
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupSDense
    size == BasicButtonGroupSize.S && gap == BasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupSNoGap
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupMWide
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupMDense
    size == BasicButtonGroupSize.M && gap == BasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupMNoGap
    size == BasicButtonGroupSize.Xs -> ButtonGroupStyles.BasicButtonGroupXs
    size == BasicButtonGroupSize.S -> ButtonGroupStyles.BasicButtonGroupS
    size == BasicButtonGroupSize.M -> ButtonGroupStyles.BasicButtonGroupM
    else -> error("Unsupported basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.BasicButtonGroup.style(
    size: BasicButtonGroupSize = BasicButtonGroupSize.Xs,
    gap: BasicButtonGroupGap = BasicButtonGroupGap.None,
    shape: BasicButtonGroupShape = BasicButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для icon-button-group
 */
public fun ButtonGroupStyles.IconButtonGroup.resolve(
    size: IconButtonGroupSize = IconButtonGroupSize.Xs,
    gap: IconButtonGroupGap = IconButtonGroupGap.Wide,
    shape: IconButtonGroupShape = IconButtonGroupShape.Pilled,
): ButtonGroupStyles = when {
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsWidePilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsWideSegmented
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsDensePilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsDenseSegmented
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsNoGapPilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsNoGapSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSWidePilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSWideSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSDensePilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSDenseSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSNoGapPilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSNoGapSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMWidePilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMWideSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMDensePilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMDenseSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMNoGapPilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMNoGapSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLWidePilled
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupLWideSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLDensePilled
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupLDenseSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLNoGapPilled
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupLNoGapSegmented
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupXsWide
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupXsDense
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupXsNoGap
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupSWide
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupSDense
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupSNoGap
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupMWide
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupMDense
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupMNoGap
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide ->
        ButtonGroupStyles.IconButtonGroupLWide
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense ->
        ButtonGroupStyles.IconButtonGroupLDense
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.None ->
        ButtonGroupStyles.IconButtonGroupLNoGap
    size == IconButtonGroupSize.Xs -> ButtonGroupStyles.IconButtonGroupXs
    size == IconButtonGroupSize.S -> ButtonGroupStyles.IconButtonGroupS
    size == IconButtonGroupSize.M -> ButtonGroupStyles.IconButtonGroupM
    size == IconButtonGroupSize.L -> ButtonGroupStyles.IconButtonGroupL
    else -> error("Unsupported icon-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для icon-button-group
 */
@Composable
public fun ButtonGroupStyles.IconButtonGroup.style(
    size: IconButtonGroupSize = IconButtonGroupSize.Xs,
    gap: IconButtonGroupGap = IconButtonGroupGap.Wide,
    shape: IconButtonGroupShape = IconButtonGroupShape.Pilled,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)
