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
    AiHeaderEmbeddedIconButtonGroupS("AiHeaderEmbeddedIconButtonGroup.S"),
    AiHeaderEmbeddedIconButtonGroupM("AiHeaderEmbeddedIconButtonGroup.M"),
    AiHeaderEmbeddedIconButtonGroupL("AiHeaderEmbeddedIconButtonGroup.L"),
    AiHeaderEmbeddedIconButtonGroupXl("AiHeaderEmbeddedIconButtonGroup.Xl"),
    EmbeddedIconButtonGroupXs("EmbeddedIconButtonGroup.Xs"),
    EmbeddedIconButtonGroupXsWide("EmbeddedIconButtonGroup.Xs.Wide"),
    EmbeddedIconButtonGroupXsDense("EmbeddedIconButtonGroup.Xs.Dense"),
    EmbeddedIconButtonGroupXsNoGap("EmbeddedIconButtonGroup.Xs.NoGap"),
    EmbeddedIconButtonGroupS("EmbeddedIconButtonGroup.S"),
    EmbeddedIconButtonGroupSWide("EmbeddedIconButtonGroup.S.Wide"),
    EmbeddedIconButtonGroupSDense("EmbeddedIconButtonGroup.S.Dense"),
    EmbeddedIconButtonGroupSNoGap("EmbeddedIconButtonGroup.S.NoGap"),
    EmbeddedIconButtonGroupM("EmbeddedIconButtonGroup.M"),
    EmbeddedIconButtonGroupMWide("EmbeddedIconButtonGroup.M.Wide"),
    EmbeddedIconButtonGroupMDense("EmbeddedIconButtonGroup.M.Dense"),
    EmbeddedIconButtonGroupMNoGap("EmbeddedIconButtonGroup.M.NoGap"),
    EmbeddedIconButtonGroupL("EmbeddedIconButtonGroup.L"),
    EmbeddedIconButtonGroupLWide("EmbeddedIconButtonGroup.L.Wide"),
    EmbeddedIconButtonGroupLDense("EmbeddedIconButtonGroup.L.Dense"),
    EmbeddedIconButtonGroupLNoGap("EmbeddedIconButtonGroup.L.NoGap"),
    AiAnswerIconButtonGroupXs("AiAnswerIconButtonGroup.Xs"),
    AiAnswerIconButtonGroupS("AiAnswerIconButtonGroup.S"),
    AiAnswerIconButtonGroupM("AiAnswerIconButtonGroup.M"),
    AiAnswerIconButtonGroupL("AiAnswerIconButtonGroup.L"),
    AiAnswerBasicButtonGroupXs("AiAnswerBasicButtonGroup.Xs"),
    AiAnswerBasicButtonGroupS("AiAnswerBasicButtonGroup.S"),
    AiAnswerBasicButtonGroupM("AiAnswerBasicButtonGroup.M"),
    AiAnswerBasicButtonGroupL("AiAnswerBasicButtonGroup.L"),
    ;

    /**
     * Typed API для подбора стиля basic-button-group
     */
    public object BasicButtonGroup

    /**
     * Typed API для подбора стиля icon-button-group
     */
    public object IconButtonGroup

    /**
     * Typed API для подбора стиля ai-header-embedded-icon-button-group
     */
    public object AiHeaderEmbeddedIconButtonGroup

    /**
     * Typed API для подбора стиля embedded-icon-button-group
     */
    public object EmbeddedIconButtonGroup

    /**
     * Typed API для подбора стиля ai-answer-icon-button-group
     */
    public object AiAnswerIconButtonGroup

    /**
     * Typed API для подбора стиля ai-answer-basic-button-group
     */
    public object AiAnswerBasicButtonGroup
}

/**
 * Возможные значения свойства size для basic-button-group
 */
public enum class BasicButtonGroupSize {
    Xxs,
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства gap для basic-button-group
 */
public enum class BasicButtonGroupGap {
    Wide,
    Dense,
    None,
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
    Default,
    Pilled,
    Segmented,
}

/**
 * Возможные значения свойства size для ai-header-embedded-icon-button-group
 */
public enum class AiHeaderEmbeddedIconButtonGroupSize {
    S,
    M,
    L,
    Xl,
}

/**
 * Возможные значения свойства size для embedded-icon-button-group
 */
public enum class EmbeddedIconButtonGroupSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства gap для embedded-icon-button-group
 */
public enum class EmbeddedIconButtonGroupGap {
    Wide,
    Dense,
    None,
}

/**
 * Возможные значения свойства size для ai-answer-icon-button-group
 */
public enum class AiAnswerIconButtonGroupSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства size для ai-answer-basic-button-group
 */
public enum class AiAnswerBasicButtonGroupSize {
    Xs,
    S,
    M,
    L,
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
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupS -> AiHeaderEmbeddedIconButtonGroup.S
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupM -> AiHeaderEmbeddedIconButtonGroup.M
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupL -> AiHeaderEmbeddedIconButtonGroup.L
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupXl -> AiHeaderEmbeddedIconButtonGroup.Xl
        ButtonGroupStyles.EmbeddedIconButtonGroupXs -> EmbeddedIconButtonGroup.Xs
        ButtonGroupStyles.EmbeddedIconButtonGroupXsWide -> EmbeddedIconButtonGroup.Xs.Wide
        ButtonGroupStyles.EmbeddedIconButtonGroupXsDense -> EmbeddedIconButtonGroup.Xs.Dense
        ButtonGroupStyles.EmbeddedIconButtonGroupXsNoGap -> EmbeddedIconButtonGroup.Xs.NoGap
        ButtonGroupStyles.EmbeddedIconButtonGroupS -> EmbeddedIconButtonGroup.S
        ButtonGroupStyles.EmbeddedIconButtonGroupSWide -> EmbeddedIconButtonGroup.S.Wide
        ButtonGroupStyles.EmbeddedIconButtonGroupSDense -> EmbeddedIconButtonGroup.S.Dense
        ButtonGroupStyles.EmbeddedIconButtonGroupSNoGap -> EmbeddedIconButtonGroup.S.NoGap
        ButtonGroupStyles.EmbeddedIconButtonGroupM -> EmbeddedIconButtonGroup.M
        ButtonGroupStyles.EmbeddedIconButtonGroupMWide -> EmbeddedIconButtonGroup.M.Wide
        ButtonGroupStyles.EmbeddedIconButtonGroupMDense -> EmbeddedIconButtonGroup.M.Dense
        ButtonGroupStyles.EmbeddedIconButtonGroupMNoGap -> EmbeddedIconButtonGroup.M.NoGap
        ButtonGroupStyles.EmbeddedIconButtonGroupL -> EmbeddedIconButtonGroup.L
        ButtonGroupStyles.EmbeddedIconButtonGroupLWide -> EmbeddedIconButtonGroup.L.Wide
        ButtonGroupStyles.EmbeddedIconButtonGroupLDense -> EmbeddedIconButtonGroup.L.Dense
        ButtonGroupStyles.EmbeddedIconButtonGroupLNoGap -> EmbeddedIconButtonGroup.L.NoGap
        ButtonGroupStyles.AiAnswerIconButtonGroupXs -> AiAnswerIconButtonGroup.Xs
        ButtonGroupStyles.AiAnswerIconButtonGroupS -> AiAnswerIconButtonGroup.S
        ButtonGroupStyles.AiAnswerIconButtonGroupM -> AiAnswerIconButtonGroup.M
        ButtonGroupStyles.AiAnswerIconButtonGroupL -> AiAnswerIconButtonGroup.L
        ButtonGroupStyles.AiAnswerBasicButtonGroupXs -> AiAnswerBasicButtonGroup.Xs
        ButtonGroupStyles.AiAnswerBasicButtonGroupS -> AiAnswerBasicButtonGroup.S
        ButtonGroupStyles.AiAnswerBasicButtonGroupM -> AiAnswerBasicButtonGroup.M
        ButtonGroupStyles.AiAnswerBasicButtonGroupL -> AiAnswerBasicButtonGroup.L
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [ButtonGroupStyles] для basic-button-group
 */
public fun ButtonGroupStyles.BasicButtonGroup.resolve(
    size: BasicButtonGroupSize = BasicButtonGroupSize.Xxs,
    gap: BasicButtonGroupGap = BasicButtonGroupGap.Wide,
    shape: BasicButtonGroupShape = BasicButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXxsWideDefault
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXxsWideSegmented
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXxsDenseDefault
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXxsDenseSegmented
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupXxsNoGapDefault
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupXxsNoGapSegmented
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
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupLWideDefault
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Wide && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLWideSegmented
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupLDenseDefault
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Dense && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLDenseSegmented
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Default -> ButtonGroupStyles.BasicButtonGroupLNoGapDefault
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.None && shape ==
        BasicButtonGroupShape.Segmented -> ButtonGroupStyles.BasicButtonGroupLNoGapSegmented
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupXxsWide
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupXxsDense
    size == BasicButtonGroupSize.Xxs && gap == BasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupXxsNoGap
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
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Wide ->
        ButtonGroupStyles.BasicButtonGroupLWide
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.Dense ->
        ButtonGroupStyles.BasicButtonGroupLDense
    size == BasicButtonGroupSize.L && gap == BasicButtonGroupGap.None ->
        ButtonGroupStyles.BasicButtonGroupLNoGap
    size == BasicButtonGroupSize.Xxs -> ButtonGroupStyles.BasicButtonGroupXxs
    size == BasicButtonGroupSize.Xs -> ButtonGroupStyles.BasicButtonGroupXs
    size == BasicButtonGroupSize.S -> ButtonGroupStyles.BasicButtonGroupS
    size == BasicButtonGroupSize.M -> ButtonGroupStyles.BasicButtonGroupM
    size == BasicButtonGroupSize.L -> ButtonGroupStyles.BasicButtonGroupL
    else -> error("Unsupported basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для basic-button-group
 */
@Composable
public fun ButtonGroupStyles.BasicButtonGroup.style(
    size: BasicButtonGroupSize = BasicButtonGroupSize.Xxs,
    gap: BasicButtonGroupGap = BasicButtonGroupGap.Wide,
    shape: BasicButtonGroupShape = BasicButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для icon-button-group
 */
public fun ButtonGroupStyles.IconButtonGroup.resolve(
    size: IconButtonGroupSize = IconButtonGroupSize.Xs,
    gap: IconButtonGroupGap = IconButtonGroupGap.Wide,
    shape: IconButtonGroupShape = IconButtonGroupShape.Default,
): ButtonGroupStyles = when {
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupXsWideDefault
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsWidePilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsWideSegmented
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupXsDenseDefault
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsDensePilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsDenseSegmented
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupXsNoGapDefault
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupXsNoGapPilled
    size == IconButtonGroupSize.Xs && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupXsNoGapSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSWideDefault
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSWidePilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSWideSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSDenseDefault
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSDensePilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSDenseSegmented
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupSNoGapDefault
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupSNoGapPilled
    size == IconButtonGroupSize.S && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupSNoGapSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMWideDefault
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMWidePilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMWideSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMDenseDefault
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMDensePilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMDenseSegmented
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupMNoGapDefault
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupMNoGapPilled
    size == IconButtonGroupSize.M && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupMNoGapSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLWideDefault
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLWidePilled
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Wide && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupLWideSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLDenseDefault
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Pilled -> ButtonGroupStyles.IconButtonGroupLDensePilled
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.Dense && shape ==
        IconButtonGroupShape.Segmented -> ButtonGroupStyles.IconButtonGroupLDenseSegmented
    size == IconButtonGroupSize.L && gap == IconButtonGroupGap.None && shape ==
        IconButtonGroupShape.Default -> ButtonGroupStyles.IconButtonGroupLNoGapDefault
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
    shape: IconButtonGroupShape = IconButtonGroupShape.Default,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap, shape).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для ai-header-embedded-icon-button-group
 */
public fun ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroup.resolve(
    size: AiHeaderEmbeddedIconButtonGroupSize =
        AiHeaderEmbeddedIconButtonGroupSize.M,
): ButtonGroupStyles = when {
    size == AiHeaderEmbeddedIconButtonGroupSize.S ->
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupS
    size == AiHeaderEmbeddedIconButtonGroupSize.M ->
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupM
    size == AiHeaderEmbeddedIconButtonGroupSize.L ->
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupL
    size == AiHeaderEmbeddedIconButtonGroupSize.Xl ->
        ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroupXl
    else -> error("Unsupported ai-header-embedded-icon-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для ai-header-embedded-icon-button-group
 */
@Composable
public fun ButtonGroupStyles.AiHeaderEmbeddedIconButtonGroup.style(
    size: AiHeaderEmbeddedIconButtonGroupSize =
        AiHeaderEmbeddedIconButtonGroupSize.M,
    modify: @Composable
    ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для embedded-icon-button-group
 */
public fun ButtonGroupStyles.EmbeddedIconButtonGroup.resolve(
    size: EmbeddedIconButtonGroupSize =
        EmbeddedIconButtonGroupSize.M,
    gap: EmbeddedIconButtonGroupGap =
        EmbeddedIconButtonGroupGap.Wide,
): ButtonGroupStyles = when {
    size == EmbeddedIconButtonGroupSize.Xs && gap == EmbeddedIconButtonGroupGap.Wide ->
        ButtonGroupStyles.EmbeddedIconButtonGroupXsWide
    size == EmbeddedIconButtonGroupSize.Xs && gap == EmbeddedIconButtonGroupGap.Dense ->
        ButtonGroupStyles.EmbeddedIconButtonGroupXsDense
    size == EmbeddedIconButtonGroupSize.Xs && gap == EmbeddedIconButtonGroupGap.None ->
        ButtonGroupStyles.EmbeddedIconButtonGroupXsNoGap
    size == EmbeddedIconButtonGroupSize.S && gap == EmbeddedIconButtonGroupGap.Wide ->
        ButtonGroupStyles.EmbeddedIconButtonGroupSWide
    size == EmbeddedIconButtonGroupSize.S && gap == EmbeddedIconButtonGroupGap.Dense ->
        ButtonGroupStyles.EmbeddedIconButtonGroupSDense
    size == EmbeddedIconButtonGroupSize.S && gap == EmbeddedIconButtonGroupGap.None ->
        ButtonGroupStyles.EmbeddedIconButtonGroupSNoGap
    size == EmbeddedIconButtonGroupSize.M && gap == EmbeddedIconButtonGroupGap.Wide ->
        ButtonGroupStyles.EmbeddedIconButtonGroupMWide
    size == EmbeddedIconButtonGroupSize.M && gap == EmbeddedIconButtonGroupGap.Dense ->
        ButtonGroupStyles.EmbeddedIconButtonGroupMDense
    size == EmbeddedIconButtonGroupSize.M && gap == EmbeddedIconButtonGroupGap.None ->
        ButtonGroupStyles.EmbeddedIconButtonGroupMNoGap
    size == EmbeddedIconButtonGroupSize.L && gap == EmbeddedIconButtonGroupGap.Wide ->
        ButtonGroupStyles.EmbeddedIconButtonGroupLWide
    size == EmbeddedIconButtonGroupSize.L && gap == EmbeddedIconButtonGroupGap.Dense ->
        ButtonGroupStyles.EmbeddedIconButtonGroupLDense
    size == EmbeddedIconButtonGroupSize.L && gap == EmbeddedIconButtonGroupGap.None ->
        ButtonGroupStyles.EmbeddedIconButtonGroupLNoGap
    size == EmbeddedIconButtonGroupSize.Xs -> ButtonGroupStyles.EmbeddedIconButtonGroupXs
    size == EmbeddedIconButtonGroupSize.S -> ButtonGroupStyles.EmbeddedIconButtonGroupS
    size == EmbeddedIconButtonGroupSize.M -> ButtonGroupStyles.EmbeddedIconButtonGroupM
    size == EmbeddedIconButtonGroupSize.L -> ButtonGroupStyles.EmbeddedIconButtonGroupL
    else -> error("Unsupported embedded-icon-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для embedded-icon-button-group
 */
@Composable
public fun ButtonGroupStyles.EmbeddedIconButtonGroup.style(
    size: EmbeddedIconButtonGroupSize = EmbeddedIconButtonGroupSize.M,
    gap: EmbeddedIconButtonGroupGap = EmbeddedIconButtonGroupGap.Wide,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size, gap).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для ai-answer-icon-button-group
 */
public fun ButtonGroupStyles.AiAnswerIconButtonGroup.resolve(
    size: AiAnswerIconButtonGroupSize =
        AiAnswerIconButtonGroupSize.M,
): ButtonGroupStyles = when {
    size == AiAnswerIconButtonGroupSize.Xs -> ButtonGroupStyles.AiAnswerIconButtonGroupXs
    size == AiAnswerIconButtonGroupSize.S -> ButtonGroupStyles.AiAnswerIconButtonGroupS
    size == AiAnswerIconButtonGroupSize.M -> ButtonGroupStyles.AiAnswerIconButtonGroupM
    size == AiAnswerIconButtonGroupSize.L -> ButtonGroupStyles.AiAnswerIconButtonGroupL
    else -> error("Unsupported ai-answer-icon-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для ai-answer-icon-button-group
 */
@Composable
public fun ButtonGroupStyles.AiAnswerIconButtonGroup.style(
    size: AiAnswerIconButtonGroupSize =
        AiAnswerIconButtonGroupSize.M,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit = {},
): ButtonGroupStyle = resolve(size).style(modify)

/**
 * Возвращает экземпляр [ButtonGroupStyles] для ai-answer-basic-button-group
 */
public fun ButtonGroupStyles.AiAnswerBasicButtonGroup.resolve(
    size: AiAnswerBasicButtonGroupSize =
        AiAnswerBasicButtonGroupSize.M,
): ButtonGroupStyles = when {
    size == AiAnswerBasicButtonGroupSize.Xs -> ButtonGroupStyles.AiAnswerBasicButtonGroupXs
    size == AiAnswerBasicButtonGroupSize.S -> ButtonGroupStyles.AiAnswerBasicButtonGroupS
    size == AiAnswerBasicButtonGroupSize.M -> ButtonGroupStyles.AiAnswerBasicButtonGroupM
    size == AiAnswerBasicButtonGroupSize.L -> ButtonGroupStyles.AiAnswerBasicButtonGroupL
    else -> error("Unsupported ai-answer-basic-button-group style combination")
}

/**
 * Возвращает [ButtonGroupStyle] для ai-answer-basic-button-group
 */
@Composable
public fun ButtonGroupStyles.AiAnswerBasicButtonGroup.style(
    size: AiAnswerBasicButtonGroupSize =
        AiAnswerBasicButtonGroupSize.M,
    modify: @Composable ButtonGroupStyleBuilder.() -> Unit =
        {},
): ButtonGroupStyle = resolve(size).style(modify)
