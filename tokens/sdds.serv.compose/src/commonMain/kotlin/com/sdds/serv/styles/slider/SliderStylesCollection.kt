// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.slider

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.SliderStyle
import com.sdds.compose.uikit.SliderStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента Slider
 */
public enum class SliderStyles(
    public val key: String,
) {
    SliderHorizontalLabelInnerLDefault("SliderHorizontalLabelInner.L.Default"),
    SliderHorizontalLabelInnerLAccent("SliderHorizontalLabelInner.L.Accent"),
    SliderHorizontalLabelInnerLGradient("SliderHorizontalLabelInner.L.Gradient"),
    SliderHorizontalLabelInnerLLimitLabelCenterDefault("SliderHorizontalLabelInner.L.LimitLabelCenter.Default"),
    SliderHorizontalLabelInnerLLimitLabelCenterAccent("SliderHorizontalLabelInner.L.LimitLabelCenter.Accent"),
    SliderHorizontalLabelInnerLLimitLabelCenterGradient("SliderHorizontalLabelInner.L.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelInnerLLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelInnerLLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelInnerLLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelInnerLThumbSDefault("SliderHorizontalLabelInner.L.ThumbS.Default"),
    SliderHorizontalLabelInnerLThumbSAccent("SliderHorizontalLabelInner.L.ThumbS.Accent"),
    SliderHorizontalLabelInnerLThumbSGradient("SliderHorizontalLabelInner.L.ThumbS.Gradient"),
    SliderHorizontalLabelInnerMDefault("SliderHorizontalLabelInner.M.Default"),
    SliderHorizontalLabelInnerMAccent("SliderHorizontalLabelInner.M.Accent"),
    SliderHorizontalLabelInnerMGradient("SliderHorizontalLabelInner.M.Gradient"),
    SliderHorizontalLabelInnerMLimitLabelCenterDefault("SliderHorizontalLabelInner.M.LimitLabelCenter.Default"),
    SliderHorizontalLabelInnerMLimitLabelCenterAccent("SliderHorizontalLabelInner.M.LimitLabelCenter.Accent"),
    SliderHorizontalLabelInnerMLimitLabelCenterGradient("SliderHorizontalLabelInner.M.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelInnerMLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelInnerMLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelInnerMLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelInnerMThumbSDefault("SliderHorizontalLabelInner.M.ThumbS.Default"),
    SliderHorizontalLabelInnerMThumbSAccent("SliderHorizontalLabelInner.M.ThumbS.Accent"),
    SliderHorizontalLabelInnerMThumbSGradient("SliderHorizontalLabelInner.M.ThumbS.Gradient"),
    SliderHorizontalLabelInnerSDefault("SliderHorizontalLabelInner.S.Default"),
    SliderHorizontalLabelInnerSAccent("SliderHorizontalLabelInner.S.Accent"),
    SliderHorizontalLabelInnerSGradient("SliderHorizontalLabelInner.S.Gradient"),
    SliderHorizontalLabelInnerSLimitLabelCenterDefault("SliderHorizontalLabelInner.S.LimitLabelCenter.Default"),
    SliderHorizontalLabelInnerSLimitLabelCenterAccent("SliderHorizontalLabelInner.S.LimitLabelCenter.Accent"),
    SliderHorizontalLabelInnerSLimitLabelCenterGradient("SliderHorizontalLabelInner.S.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelInnerSLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelInnerSLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelInnerSLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelInnerSThumbSDefault("SliderHorizontalLabelInner.S.ThumbS.Default"),
    SliderHorizontalLabelInnerSThumbSAccent("SliderHorizontalLabelInner.S.ThumbS.Accent"),
    SliderHorizontalLabelInnerSThumbSGradient("SliderHorizontalLabelInner.S.ThumbS.Gradient"),
    SliderHorizontalLabelOuterLDefault("SliderHorizontalLabelOuter.L.Default"),
    SliderHorizontalLabelOuterLAccent("SliderHorizontalLabelOuter.L.Accent"),
    SliderHorizontalLabelOuterLGradient("SliderHorizontalLabelOuter.L.Gradient"),
    SliderHorizontalLabelOuterLLimitLabelCenterDefault("SliderHorizontalLabelOuter.L.LimitLabelCenter.Default"),
    SliderHorizontalLabelOuterLLimitLabelCenterAccent("SliderHorizontalLabelOuter.L.LimitLabelCenter.Accent"),
    SliderHorizontalLabelOuterLLimitLabelCenterGradient("SliderHorizontalLabelOuter.L.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelOuterLLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelOuterLLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelOuterLLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelOuterLThumbSDefault("SliderHorizontalLabelOuter.L.ThumbS.Default"),
    SliderHorizontalLabelOuterLThumbSAccent("SliderHorizontalLabelOuter.L.ThumbS.Accent"),
    SliderHorizontalLabelOuterLThumbSGradient("SliderHorizontalLabelOuter.L.ThumbS.Gradient"),
    SliderHorizontalLabelOuterMDefault("SliderHorizontalLabelOuter.M.Default"),
    SliderHorizontalLabelOuterMAccent("SliderHorizontalLabelOuter.M.Accent"),
    SliderHorizontalLabelOuterMGradient("SliderHorizontalLabelOuter.M.Gradient"),
    SliderHorizontalLabelOuterMLimitLabelCenterDefault("SliderHorizontalLabelOuter.M.LimitLabelCenter.Default"),
    SliderHorizontalLabelOuterMLimitLabelCenterAccent("SliderHorizontalLabelOuter.M.LimitLabelCenter.Accent"),
    SliderHorizontalLabelOuterMLimitLabelCenterGradient("SliderHorizontalLabelOuter.M.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelOuterMLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelOuterMLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelOuterMLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelOuterMThumbSDefault("SliderHorizontalLabelOuter.M.ThumbS.Default"),
    SliderHorizontalLabelOuterMThumbSAccent("SliderHorizontalLabelOuter.M.ThumbS.Accent"),
    SliderHorizontalLabelOuterMThumbSGradient("SliderHorizontalLabelOuter.M.ThumbS.Gradient"),
    SliderHorizontalLabelOuterSDefault("SliderHorizontalLabelOuter.S.Default"),
    SliderHorizontalLabelOuterSAccent("SliderHorizontalLabelOuter.S.Accent"),
    SliderHorizontalLabelOuterSGradient("SliderHorizontalLabelOuter.S.Gradient"),
    SliderHorizontalLabelOuterSLimitLabelCenterDefault("SliderHorizontalLabelOuter.S.LimitLabelCenter.Default"),
    SliderHorizontalLabelOuterSLimitLabelCenterAccent("SliderHorizontalLabelOuter.S.LimitLabelCenter.Accent"),
    SliderHorizontalLabelOuterSLimitLabelCenterGradient("SliderHorizontalLabelOuter.S.LimitLabelCenter.Gradient"),
    SliderHorizontalLabelOuterSLimitLabelCenterThumbSDefault(
        "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Default",
    ),
    SliderHorizontalLabelOuterSLimitLabelCenterThumbSAccent(
        "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Accent",
    ),
    SliderHorizontalLabelOuterSLimitLabelCenterThumbSGradient(
        "SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Gradient",
    ),
    SliderHorizontalLabelOuterSThumbSDefault("SliderHorizontalLabelOuter.S.ThumbS.Default"),
    SliderHorizontalLabelOuterSThumbSAccent("SliderHorizontalLabelOuter.S.ThumbS.Accent"),
    SliderHorizontalLabelOuterSThumbSGradient("SliderHorizontalLabelOuter.S.ThumbS.Gradient"),
    SliderVerticalLabelInnerLDefault("SliderVerticalLabelInner.L.Default"),
    SliderVerticalLabelInnerLAccent("SliderVerticalLabelInner.L.Accent"),
    SliderVerticalLabelInnerLGradient("SliderVerticalLabelInner.L.Gradient"),
    SliderVerticalLabelInnerLLabelEndDefault("SliderVerticalLabelInner.L.LabelEnd.Default"),
    SliderVerticalLabelInnerLLabelEndAccent("SliderVerticalLabelInner.L.LabelEnd.Accent"),
    SliderVerticalLabelInnerLLabelEndGradient("SliderVerticalLabelInner.L.LabelEnd.Gradient"),
    SliderVerticalLabelInnerLLabelEndThumbSDefault("SliderVerticalLabelInner.L.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelInnerLLabelEndThumbSAccent("SliderVerticalLabelInner.L.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelInnerLLabelEndThumbSGradient("SliderVerticalLabelInner.L.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelInnerLThumbSDefault("SliderVerticalLabelInner.L.ThumbS.Default"),
    SliderVerticalLabelInnerLThumbSAccent("SliderVerticalLabelInner.L.ThumbS.Accent"),
    SliderVerticalLabelInnerLThumbSGradient("SliderVerticalLabelInner.L.ThumbS.Gradient"),
    SliderVerticalLabelInnerMDefault("SliderVerticalLabelInner.M.Default"),
    SliderVerticalLabelInnerMAccent("SliderVerticalLabelInner.M.Accent"),
    SliderVerticalLabelInnerMGradient("SliderVerticalLabelInner.M.Gradient"),
    SliderVerticalLabelInnerMLabelEndDefault("SliderVerticalLabelInner.M.LabelEnd.Default"),
    SliderVerticalLabelInnerMLabelEndAccent("SliderVerticalLabelInner.M.LabelEnd.Accent"),
    SliderVerticalLabelInnerMLabelEndGradient("SliderVerticalLabelInner.M.LabelEnd.Gradient"),
    SliderVerticalLabelInnerMLabelEndThumbSDefault("SliderVerticalLabelInner.M.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelInnerMLabelEndThumbSAccent("SliderVerticalLabelInner.M.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelInnerMLabelEndThumbSGradient("SliderVerticalLabelInner.M.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelInnerMThumbSDefault("SliderVerticalLabelInner.M.ThumbS.Default"),
    SliderVerticalLabelInnerMThumbSAccent("SliderVerticalLabelInner.M.ThumbS.Accent"),
    SliderVerticalLabelInnerMThumbSGradient("SliderVerticalLabelInner.M.ThumbS.Gradient"),
    SliderVerticalLabelInnerSDefault("SliderVerticalLabelInner.S.Default"),
    SliderVerticalLabelInnerSAccent("SliderVerticalLabelInner.S.Accent"),
    SliderVerticalLabelInnerSGradient("SliderVerticalLabelInner.S.Gradient"),
    SliderVerticalLabelInnerSLabelEndDefault("SliderVerticalLabelInner.S.LabelEnd.Default"),
    SliderVerticalLabelInnerSLabelEndAccent("SliderVerticalLabelInner.S.LabelEnd.Accent"),
    SliderVerticalLabelInnerSLabelEndGradient("SliderVerticalLabelInner.S.LabelEnd.Gradient"),
    SliderVerticalLabelInnerSLabelEndThumbSDefault("SliderVerticalLabelInner.S.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelInnerSLabelEndThumbSAccent("SliderVerticalLabelInner.S.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelInnerSLabelEndThumbSGradient("SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelInnerSThumbSDefault("SliderVerticalLabelInner.S.ThumbS.Default"),
    SliderVerticalLabelInnerSThumbSAccent("SliderVerticalLabelInner.S.ThumbS.Accent"),
    SliderVerticalLabelInnerSThumbSGradient("SliderVerticalLabelInner.S.ThumbS.Gradient"),
    SliderVerticalLabelOuterLDefault("SliderVerticalLabelOuter.L.Default"),
    SliderVerticalLabelOuterLAccent("SliderVerticalLabelOuter.L.Accent"),
    SliderVerticalLabelOuterLGradient("SliderVerticalLabelOuter.L.Gradient"),
    SliderVerticalLabelOuterLAlignmentEndDefault("SliderVerticalLabelOuter.L.AlignmentEnd.Default"),
    SliderVerticalLabelOuterLAlignmentEndAccent("SliderVerticalLabelOuter.L.AlignmentEnd.Accent"),
    SliderVerticalLabelOuterLAlignmentEndGradient("SliderVerticalLabelOuter.L.AlignmentEnd.Gradient"),
    SliderVerticalLabelOuterLAlignmentEndLabelEndDefault("SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Default"),
    SliderVerticalLabelOuterLAlignmentEndLabelEndAccent("SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Accent"),
    SliderVerticalLabelOuterLAlignmentEndLabelEndGradient("SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Gradient"),
    SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSDefault(
        "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Default",
    ),
    SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSAccent(
        "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Accent",
    ),
    SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSGradient(
        "SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Gradient",
    ),
    SliderVerticalLabelOuterLAlignmentEndThumbSDefault("SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Default"),
    SliderVerticalLabelOuterLAlignmentEndThumbSAccent("SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterLAlignmentEndThumbSGradient("SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterLLabelEndDefault("SliderVerticalLabelOuter.L.LabelEnd.Default"),
    SliderVerticalLabelOuterLLabelEndAccent("SliderVerticalLabelOuter.L.LabelEnd.Accent"),
    SliderVerticalLabelOuterLLabelEndGradient("SliderVerticalLabelOuter.L.LabelEnd.Gradient"),
    SliderVerticalLabelOuterLLabelEndThumbSDefault("SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelOuterLLabelEndThumbSAccent("SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterLLabelEndThumbSGradient("SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterLThumbSDefault("SliderVerticalLabelOuter.L.ThumbS.Default"),
    SliderVerticalLabelOuterLThumbSAccent("SliderVerticalLabelOuter.L.ThumbS.Accent"),
    SliderVerticalLabelOuterLThumbSGradient("SliderVerticalLabelOuter.L.ThumbS.Gradient"),
    SliderVerticalLabelOuterMDefault("SliderVerticalLabelOuter.M.Default"),
    SliderVerticalLabelOuterMAccent("SliderVerticalLabelOuter.M.Accent"),
    SliderVerticalLabelOuterMGradient("SliderVerticalLabelOuter.M.Gradient"),
    SliderVerticalLabelOuterMAlignmentEndDefault("SliderVerticalLabelOuter.M.AlignmentEnd.Default"),
    SliderVerticalLabelOuterMAlignmentEndAccent("SliderVerticalLabelOuter.M.AlignmentEnd.Accent"),
    SliderVerticalLabelOuterMAlignmentEndGradient("SliderVerticalLabelOuter.M.AlignmentEnd.Gradient"),
    SliderVerticalLabelOuterMAlignmentEndLabelEndDefault("SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Default"),
    SliderVerticalLabelOuterMAlignmentEndLabelEndAccent("SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Accent"),
    SliderVerticalLabelOuterMAlignmentEndLabelEndGradient("SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Gradient"),
    SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSDefault(
        "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Default",
    ),
    SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSAccent(
        "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Accent",
    ),
    SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSGradient(
        "SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Gradient",
    ),
    SliderVerticalLabelOuterMAlignmentEndThumbSDefault("SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Default"),
    SliderVerticalLabelOuterMAlignmentEndThumbSAccent("SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterMAlignmentEndThumbSGradient("SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterMLabelEndDefault("SliderVerticalLabelOuter.M.LabelEnd.Default"),
    SliderVerticalLabelOuterMLabelEndAccent("SliderVerticalLabelOuter.M.LabelEnd.Accent"),
    SliderVerticalLabelOuterMLabelEndGradient("SliderVerticalLabelOuter.M.LabelEnd.Gradient"),
    SliderVerticalLabelOuterMLabelEndThumbSDefault("SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelOuterMLabelEndThumbSAccent("SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterMLabelEndThumbSGradient("SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterMThumbSDefault("SliderVerticalLabelOuter.M.ThumbS.Default"),
    SliderVerticalLabelOuterMThumbSAccent("SliderVerticalLabelOuter.M.ThumbS.Accent"),
    SliderVerticalLabelOuterMThumbSGradient("SliderVerticalLabelOuter.M.ThumbS.Gradient"),
    SliderVerticalLabelOuterSDefault("SliderVerticalLabelOuter.S.Default"),
    SliderVerticalLabelOuterSAccent("SliderVerticalLabelOuter.S.Accent"),
    SliderVerticalLabelOuterSGradient("SliderVerticalLabelOuter.S.Gradient"),
    SliderVerticalLabelOuterSAlignmentEndDefault("SliderVerticalLabelOuter.S.AlignmentEnd.Default"),
    SliderVerticalLabelOuterSAlignmentEndAccent("SliderVerticalLabelOuter.S.AlignmentEnd.Accent"),
    SliderVerticalLabelOuterSAlignmentEndGradient("SliderVerticalLabelOuter.S.AlignmentEnd.Gradient"),
    SliderVerticalLabelOuterSAlignmentEndLabelEndDefault("SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Default"),
    SliderVerticalLabelOuterSAlignmentEndLabelEndAccent("SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Accent"),
    SliderVerticalLabelOuterSAlignmentEndLabelEndGradient("SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Gradient"),
    SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSDefault(
        "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Default",
    ),
    SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSAccent(
        "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Accent",
    ),
    SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSGradient(
        "SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Gradient",
    ),
    SliderVerticalLabelOuterSAlignmentEndThumbSDefault("SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Default"),
    SliderVerticalLabelOuterSAlignmentEndThumbSAccent("SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterSAlignmentEndThumbSGradient("SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterSLabelEndDefault("SliderVerticalLabelOuter.S.LabelEnd.Default"),
    SliderVerticalLabelOuterSLabelEndAccent("SliderVerticalLabelOuter.S.LabelEnd.Accent"),
    SliderVerticalLabelOuterSLabelEndGradient("SliderVerticalLabelOuter.S.LabelEnd.Gradient"),
    SliderVerticalLabelOuterSLabelEndThumbSDefault("SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default"),
    SliderVerticalLabelOuterSLabelEndThumbSAccent("SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Accent"),
    SliderVerticalLabelOuterSLabelEndThumbSGradient("SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Gradient"),
    SliderVerticalLabelOuterSThumbSDefault("SliderVerticalLabelOuter.S.ThumbS.Default"),
    SliderVerticalLabelOuterSThumbSAccent("SliderVerticalLabelOuter.S.ThumbS.Accent"),
    SliderVerticalLabelOuterSThumbSGradient("SliderVerticalLabelOuter.S.ThumbS.Gradient"),
    ;

    /**
     * Typed API для подбора стиля slider-horizontal-label-inner
     */
    public object HorizontalLabelInner

    /**
     * Typed API для подбора стиля slider-horizontal-label-outer
     */
    public object HorizontalLabelOuter

    /**
     * Typed API для подбора стиля slider-vertical-label-inner
     */
    public object VerticalLabelInner

    /**
     * Typed API для подбора стиля slider-vertical-label-outer
     */
    public object VerticalLabelOuter
}

/**
 * Возможные значения свойства size для slider-horizontal-label-inner
 */
public enum class SliderHorizontalLabelInnerSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства limit-label-alignment для slider-horizontal-label-inner
 */
public enum class SliderHorizontalLabelInnerLimitLabelAlignment {
    End,
    Center,
}

/**
 * Возможные значения свойства thumb-size для slider-horizontal-label-inner
 */
public enum class SliderHorizontalLabelInnerThumbSize {
    Default,
    S,
}

/**
 * Возможные значения свойства view для slider-horizontal-label-inner
 */
public enum class SliderHorizontalLabelInnerView {
    Default,
    Accent,
    Gradient,
}

/**
 * Возможные значения свойства size для slider-horizontal-label-outer
 */
public enum class SliderHorizontalLabelOuterSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства limit-label-alignment для slider-horizontal-label-outer
 */
public enum class SliderHorizontalLabelOuterLimitLabelAlignment {
    End,
    Center,
}

/**
 * Возможные значения свойства thumb-size для slider-horizontal-label-outer
 */
public enum class SliderHorizontalLabelOuterThumbSize {
    Default,
    S,
}

/**
 * Возможные значения свойства view для slider-horizontal-label-outer
 */
public enum class SliderHorizontalLabelOuterView {
    Default,
    Accent,
    Gradient,
}

/**
 * Возможные значения свойства size для slider-vertical-label-inner
 */
public enum class SliderVerticalLabelInnerSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства label-alignment для slider-vertical-label-inner
 */
public enum class SliderVerticalLabelInnerLabelAlignment {
    Start,
    End,
}

/**
 * Возможные значения свойства thumb-size для slider-vertical-label-inner
 */
public enum class SliderVerticalLabelInnerThumbSize {
    Default,
    S,
}

/**
 * Возможные значения свойства view для slider-vertical-label-inner
 */
public enum class SliderVerticalLabelInnerView {
    Default,
    Accent,
    Gradient,
}

/**
 * Возможные значения свойства size для slider-vertical-label-outer
 */
public enum class SliderVerticalLabelOuterSize {
    L,
    M,
    S,
}

/**
 * Возможные значения свойства alignment для slider-vertical-label-outer
 */
public enum class SliderVerticalLabelOuterAlignment {
    Start,
    End,
}

/**
 * Возможные значения свойства label-alignment для slider-vertical-label-outer
 */
public enum class SliderVerticalLabelOuterLabelAlignment {
    Start,
    End,
}

/**
 * Возможные значения свойства thumb-size для slider-vertical-label-outer
 */
public enum class SliderVerticalLabelOuterThumbSize {
    Default,
    S,
}

/**
 * Возможные значения свойства view для slider-vertical-label-outer
 */
public enum class SliderVerticalLabelOuterView {
    Default,
    Accent,
    Gradient,
}

/**
 * Возвращает [SliderStyle] для [SliderStyles]
 */
@Composable
public fun SliderStyles.style(modify: @Composable SliderStyleBuilder.() -> Unit = {}): SliderStyle {
    val builder = when (this) {
        SliderStyles.SliderHorizontalLabelInnerLDefault -> SliderHorizontalLabelInner.L.Default
        SliderStyles.SliderHorizontalLabelInnerLAccent -> SliderHorizontalLabelInner.L.Accent
        SliderStyles.SliderHorizontalLabelInnerLGradient -> SliderHorizontalLabelInner.L.Gradient
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterDefault ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterAccent ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterGradient ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelInner.L.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelInnerLThumbSDefault ->
            SliderHorizontalLabelInner.L.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerLThumbSAccent ->
            SliderHorizontalLabelInner.L.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerLThumbSGradient ->
            SliderHorizontalLabelInner.L.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelInnerMDefault -> SliderHorizontalLabelInner.M.Default
        SliderStyles.SliderHorizontalLabelInnerMAccent -> SliderHorizontalLabelInner.M.Accent
        SliderStyles.SliderHorizontalLabelInnerMGradient -> SliderHorizontalLabelInner.M.Gradient
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterDefault ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterAccent ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterGradient ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelInner.M.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelInnerMThumbSDefault ->
            SliderHorizontalLabelInner.M.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerMThumbSAccent ->
            SliderHorizontalLabelInner.M.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerMThumbSGradient ->
            SliderHorizontalLabelInner.M.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelInnerSDefault -> SliderHorizontalLabelInner.S.Default
        SliderStyles.SliderHorizontalLabelInnerSAccent -> SliderHorizontalLabelInner.S.Accent
        SliderStyles.SliderHorizontalLabelInnerSGradient -> SliderHorizontalLabelInner.S.Gradient
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterDefault ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterAccent ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterGradient ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelInner.S.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelInnerSThumbSDefault ->
            SliderHorizontalLabelInner.S.ThumbS.Default
        SliderStyles.SliderHorizontalLabelInnerSThumbSAccent ->
            SliderHorizontalLabelInner.S.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelInnerSThumbSGradient ->
            SliderHorizontalLabelInner.S.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterLDefault -> SliderHorizontalLabelOuter.L.Default
        SliderStyles.SliderHorizontalLabelOuterLAccent -> SliderHorizontalLabelOuter.L.Accent
        SliderStyles.SliderHorizontalLabelOuterLGradient -> SliderHorizontalLabelOuter.L.Gradient
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterDefault ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterAccent ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterGradient ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelOuter.L.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterLThumbSDefault ->
            SliderHorizontalLabelOuter.L.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterLThumbSAccent ->
            SliderHorizontalLabelOuter.L.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterLThumbSGradient ->
            SliderHorizontalLabelOuter.L.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterMDefault -> SliderHorizontalLabelOuter.M.Default
        SliderStyles.SliderHorizontalLabelOuterMAccent -> SliderHorizontalLabelOuter.M.Accent
        SliderStyles.SliderHorizontalLabelOuterMGradient -> SliderHorizontalLabelOuter.M.Gradient
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterDefault ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterAccent ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterGradient ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelOuter.M.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterMThumbSDefault ->
            SliderHorizontalLabelOuter.M.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterMThumbSAccent ->
            SliderHorizontalLabelOuter.M.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterMThumbSGradient ->
            SliderHorizontalLabelOuter.M.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterSDefault -> SliderHorizontalLabelOuter.S.Default
        SliderStyles.SliderHorizontalLabelOuterSAccent -> SliderHorizontalLabelOuter.S.Accent
        SliderStyles.SliderHorizontalLabelOuterSGradient -> SliderHorizontalLabelOuter.S.Gradient
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterDefault ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.Default
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterAccent ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.Accent
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterGradient ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.Gradient
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSDefault ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSAccent ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSGradient ->
            SliderHorizontalLabelOuter.S.LimitLabelCenter.ThumbS.Gradient
        SliderStyles.SliderHorizontalLabelOuterSThumbSDefault ->
            SliderHorizontalLabelOuter.S.ThumbS.Default
        SliderStyles.SliderHorizontalLabelOuterSThumbSAccent ->
            SliderHorizontalLabelOuter.S.ThumbS.Accent
        SliderStyles.SliderHorizontalLabelOuterSThumbSGradient ->
            SliderHorizontalLabelOuter.S.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerLDefault -> SliderVerticalLabelInner.L.Default
        SliderStyles.SliderVerticalLabelInnerLAccent -> SliderVerticalLabelInner.L.Accent
        SliderStyles.SliderVerticalLabelInnerLGradient -> SliderVerticalLabelInner.L.Gradient
        SliderStyles.SliderVerticalLabelInnerLLabelEndDefault ->
            SliderVerticalLabelInner.L.LabelEnd.Default
        SliderStyles.SliderVerticalLabelInnerLLabelEndAccent ->
            SliderVerticalLabelInner.L.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelInnerLLabelEndGradient ->
            SliderVerticalLabelInner.L.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSDefault ->
            SliderVerticalLabelInner.L.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSAccent ->
            SliderVerticalLabelInner.L.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSGradient ->
            SliderVerticalLabelInner.L.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerLThumbSDefault ->
            SliderVerticalLabelInner.L.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerLThumbSAccent ->
            SliderVerticalLabelInner.L.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerLThumbSGradient ->
            SliderVerticalLabelInner.L.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerMDefault -> SliderVerticalLabelInner.M.Default
        SliderStyles.SliderVerticalLabelInnerMAccent -> SliderVerticalLabelInner.M.Accent
        SliderStyles.SliderVerticalLabelInnerMGradient -> SliderVerticalLabelInner.M.Gradient
        SliderStyles.SliderVerticalLabelInnerMLabelEndDefault ->
            SliderVerticalLabelInner.M.LabelEnd.Default
        SliderStyles.SliderVerticalLabelInnerMLabelEndAccent ->
            SliderVerticalLabelInner.M.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelInnerMLabelEndGradient ->
            SliderVerticalLabelInner.M.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSDefault ->
            SliderVerticalLabelInner.M.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSAccent ->
            SliderVerticalLabelInner.M.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSGradient ->
            SliderVerticalLabelInner.M.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerMThumbSDefault ->
            SliderVerticalLabelInner.M.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerMThumbSAccent ->
            SliderVerticalLabelInner.M.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerMThumbSGradient ->
            SliderVerticalLabelInner.M.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerSDefault -> SliderVerticalLabelInner.S.Default
        SliderStyles.SliderVerticalLabelInnerSAccent -> SliderVerticalLabelInner.S.Accent
        SliderStyles.SliderVerticalLabelInnerSGradient -> SliderVerticalLabelInner.S.Gradient
        SliderStyles.SliderVerticalLabelInnerSLabelEndDefault ->
            SliderVerticalLabelInner.S.LabelEnd.Default
        SliderStyles.SliderVerticalLabelInnerSLabelEndAccent ->
            SliderVerticalLabelInner.S.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelInnerSLabelEndGradient ->
            SliderVerticalLabelInner.S.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSDefault ->
            SliderVerticalLabelInner.S.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSAccent ->
            SliderVerticalLabelInner.S.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSGradient ->
            SliderVerticalLabelInner.S.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelInnerSThumbSDefault ->
            SliderVerticalLabelInner.S.ThumbS.Default
        SliderStyles.SliderVerticalLabelInnerSThumbSAccent ->
            SliderVerticalLabelInner.S.ThumbS.Accent
        SliderStyles.SliderVerticalLabelInnerSThumbSGradient ->
            SliderVerticalLabelInner.S.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterLDefault -> SliderVerticalLabelOuter.L.Default
        SliderStyles.SliderVerticalLabelOuterLAccent -> SliderVerticalLabelOuter.L.Accent
        SliderStyles.SliderVerticalLabelOuterLGradient -> SliderVerticalLabelOuter.L.Gradient
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndDefault ->
            SliderVerticalLabelOuter.L.AlignmentEnd.Default
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndAccent ->
            SliderVerticalLabelOuter.L.AlignmentEnd.Accent
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndGradient ->
            SliderVerticalLabelOuter.L.AlignmentEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndDefault ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndAccent ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndGradient ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.L.AlignmentEnd.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSDefault ->
            SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSAccent ->
            SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSGradient ->
            SliderVerticalLabelOuter.L.AlignmentEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterLLabelEndDefault ->
            SliderVerticalLabelOuter.L.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterLLabelEndAccent ->
            SliderVerticalLabelOuter.L.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterLLabelEndGradient ->
            SliderVerticalLabelOuter.L.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.L.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterLThumbSDefault ->
            SliderVerticalLabelOuter.L.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterLThumbSAccent ->
            SliderVerticalLabelOuter.L.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterLThumbSGradient ->
            SliderVerticalLabelOuter.L.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterMDefault -> SliderVerticalLabelOuter.M.Default
        SliderStyles.SliderVerticalLabelOuterMAccent -> SliderVerticalLabelOuter.M.Accent
        SliderStyles.SliderVerticalLabelOuterMGradient -> SliderVerticalLabelOuter.M.Gradient
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndDefault ->
            SliderVerticalLabelOuter.M.AlignmentEnd.Default
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndAccent ->
            SliderVerticalLabelOuter.M.AlignmentEnd.Accent
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndGradient ->
            SliderVerticalLabelOuter.M.AlignmentEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndDefault ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndAccent ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndGradient ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.M.AlignmentEnd.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSDefault ->
            SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSAccent ->
            SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSGradient ->
            SliderVerticalLabelOuter.M.AlignmentEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterMLabelEndDefault ->
            SliderVerticalLabelOuter.M.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterMLabelEndAccent ->
            SliderVerticalLabelOuter.M.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterMLabelEndGradient ->
            SliderVerticalLabelOuter.M.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.M.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterMThumbSDefault ->
            SliderVerticalLabelOuter.M.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterMThumbSAccent ->
            SliderVerticalLabelOuter.M.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterMThumbSGradient ->
            SliderVerticalLabelOuter.M.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterSDefault -> SliderVerticalLabelOuter.S.Default
        SliderStyles.SliderVerticalLabelOuterSAccent -> SliderVerticalLabelOuter.S.Accent
        SliderStyles.SliderVerticalLabelOuterSGradient -> SliderVerticalLabelOuter.S.Gradient
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndDefault ->
            SliderVerticalLabelOuter.S.AlignmentEnd.Default
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndAccent ->
            SliderVerticalLabelOuter.S.AlignmentEnd.Accent
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndGradient ->
            SliderVerticalLabelOuter.S.AlignmentEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndDefault ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndAccent ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndGradient ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.S.AlignmentEnd.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSDefault ->
            SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSAccent ->
            SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSGradient ->
            SliderVerticalLabelOuter.S.AlignmentEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterSLabelEndDefault ->
            SliderVerticalLabelOuter.S.LabelEnd.Default
        SliderStyles.SliderVerticalLabelOuterSLabelEndAccent ->
            SliderVerticalLabelOuter.S.LabelEnd.Accent
        SliderStyles.SliderVerticalLabelOuterSLabelEndGradient ->
            SliderVerticalLabelOuter.S.LabelEnd.Gradient
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSDefault ->
            SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSAccent ->
            SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSGradient ->
            SliderVerticalLabelOuter.S.LabelEnd.ThumbS.Gradient
        SliderStyles.SliderVerticalLabelOuterSThumbSDefault ->
            SliderVerticalLabelOuter.S.ThumbS.Default
        SliderStyles.SliderVerticalLabelOuterSThumbSAccent ->
            SliderVerticalLabelOuter.S.ThumbS.Accent
        SliderStyles.SliderVerticalLabelOuterSThumbSGradient ->
            SliderVerticalLabelOuter.S.ThumbS.Gradient
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [SliderStyles] для slider-horizontal-label-inner
 */
public fun SliderStyles.HorizontalLabelInner.resolve(
    size: SliderHorizontalLabelInnerSize = SliderHorizontalLabelInnerSize.L,
    limitLabelAlignment: SliderHorizontalLabelInnerLimitLabelAlignment =
        SliderHorizontalLabelInnerLimitLabelAlignment.End,
    thumbSize: SliderHorizontalLabelInnerThumbSize = SliderHorizontalLabelInnerThumbSize.Default,
    view: SliderHorizontalLabelInnerView = SliderHorizontalLabelInnerView.Default,
): SliderStyles = when {
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelInnerThumbSize.S && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterDefault
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterAccent
    size == SliderHorizontalLabelInnerSize.L && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerLLimitLabelCenterGradient
    size == SliderHorizontalLabelInnerSize.L && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerLThumbSDefault
    size == SliderHorizontalLabelInnerSize.L && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerLThumbSAccent
    size == SliderHorizontalLabelInnerSize.L && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerLThumbSGradient
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterDefault
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterAccent
    size == SliderHorizontalLabelInnerSize.M && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerMLimitLabelCenterGradient
    size == SliderHorizontalLabelInnerSize.M && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerMThumbSDefault
    size == SliderHorizontalLabelInnerSize.M && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerMThumbSAccent
    size == SliderHorizontalLabelInnerSize.M && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerMThumbSGradient
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterDefault
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterAccent
    size == SliderHorizontalLabelInnerSize.S && limitLabelAlignment ==
        SliderHorizontalLabelInnerLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerSLimitLabelCenterGradient
    size == SliderHorizontalLabelInnerSize.S && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerSThumbSDefault
    size == SliderHorizontalLabelInnerSize.S && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerSThumbSAccent
    size == SliderHorizontalLabelInnerSize.S && thumbSize == SliderHorizontalLabelInnerThumbSize.S &&
        view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerSThumbSGradient
    size == SliderHorizontalLabelInnerSize.L && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerLDefault
    size == SliderHorizontalLabelInnerSize.L && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerLAccent
    size == SliderHorizontalLabelInnerSize.L && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerLGradient
    size == SliderHorizontalLabelInnerSize.M && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerMDefault
    size == SliderHorizontalLabelInnerSize.M && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerMAccent
    size == SliderHorizontalLabelInnerSize.M && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerMGradient
    size == SliderHorizontalLabelInnerSize.S && view == SliderHorizontalLabelInnerView.Default ->
        SliderStyles.SliderHorizontalLabelInnerSDefault
    size == SliderHorizontalLabelInnerSize.S && view == SliderHorizontalLabelInnerView.Accent ->
        SliderStyles.SliderHorizontalLabelInnerSAccent
    size == SliderHorizontalLabelInnerSize.S && view == SliderHorizontalLabelInnerView.Gradient ->
        SliderStyles.SliderHorizontalLabelInnerSGradient
    else -> error("Unsupported slider-horizontal-label-inner style combination")
}

/**
 * Возвращает [SliderStyle] для slider-horizontal-label-inner
 */
@Composable
public fun SliderStyles.HorizontalLabelInner.style(
    size: SliderHorizontalLabelInnerSize = SliderHorizontalLabelInnerSize.L,
    limitLabelAlignment: SliderHorizontalLabelInnerLimitLabelAlignment =
        SliderHorizontalLabelInnerLimitLabelAlignment.End,
    thumbSize: SliderHorizontalLabelInnerThumbSize = SliderHorizontalLabelInnerThumbSize.Default,
    view: SliderHorizontalLabelInnerView = SliderHorizontalLabelInnerView.Default,
    modify: @Composable SliderStyleBuilder.() -> Unit = {},
): SliderStyle = resolve(size, limitLabelAlignment, thumbSize, view).style(modify)

/**
 * Возвращает экземпляр [SliderStyles] для slider-horizontal-label-outer
 */
public fun SliderStyles.HorizontalLabelOuter.resolve(
    size: SliderHorizontalLabelOuterSize = SliderHorizontalLabelOuterSize.L,
    limitLabelAlignment: SliderHorizontalLabelOuterLimitLabelAlignment =
        SliderHorizontalLabelOuterLimitLabelAlignment.End,
    thumbSize: SliderHorizontalLabelOuterThumbSize = SliderHorizontalLabelOuterThumbSize.Default,
    view: SliderHorizontalLabelOuterView = SliderHorizontalLabelOuterView.Default,
): SliderStyles = when {
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSDefault
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSAccent
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && thumbSize ==
        SliderHorizontalLabelOuterThumbSize.S && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterThumbSGradient
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterDefault
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterAccent
    size == SliderHorizontalLabelOuterSize.L && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterLLimitLabelCenterGradient
    size == SliderHorizontalLabelOuterSize.L && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterLThumbSDefault
    size == SliderHorizontalLabelOuterSize.L && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterLThumbSAccent
    size == SliderHorizontalLabelOuterSize.L && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterLThumbSGradient
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterDefault
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterAccent
    size == SliderHorizontalLabelOuterSize.M && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterMLimitLabelCenterGradient
    size == SliderHorizontalLabelOuterSize.M && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterMThumbSDefault
    size == SliderHorizontalLabelOuterSize.M && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterMThumbSAccent
    size == SliderHorizontalLabelOuterSize.M && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterMThumbSGradient
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterDefault
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterAccent
    size == SliderHorizontalLabelOuterSize.S && limitLabelAlignment ==
        SliderHorizontalLabelOuterLimitLabelAlignment.Center && view ==
        SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterSLimitLabelCenterGradient
    size == SliderHorizontalLabelOuterSize.S && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterSThumbSDefault
    size == SliderHorizontalLabelOuterSize.S && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterSThumbSAccent
    size == SliderHorizontalLabelOuterSize.S && thumbSize == SliderHorizontalLabelOuterThumbSize.S &&
        view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterSThumbSGradient
    size == SliderHorizontalLabelOuterSize.L && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterLDefault
    size == SliderHorizontalLabelOuterSize.L && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterLAccent
    size == SliderHorizontalLabelOuterSize.L && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterLGradient
    size == SliderHorizontalLabelOuterSize.M && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterMDefault
    size == SliderHorizontalLabelOuterSize.M && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterMAccent
    size == SliderHorizontalLabelOuterSize.M && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterMGradient
    size == SliderHorizontalLabelOuterSize.S && view == SliderHorizontalLabelOuterView.Default ->
        SliderStyles.SliderHorizontalLabelOuterSDefault
    size == SliderHorizontalLabelOuterSize.S && view == SliderHorizontalLabelOuterView.Accent ->
        SliderStyles.SliderHorizontalLabelOuterSAccent
    size == SliderHorizontalLabelOuterSize.S && view == SliderHorizontalLabelOuterView.Gradient ->
        SliderStyles.SliderHorizontalLabelOuterSGradient
    else -> error("Unsupported slider-horizontal-label-outer style combination")
}

/**
 * Возвращает [SliderStyle] для slider-horizontal-label-outer
 */
@Composable
public fun SliderStyles.HorizontalLabelOuter.style(
    size: SliderHorizontalLabelOuterSize = SliderHorizontalLabelOuterSize.L,
    limitLabelAlignment: SliderHorizontalLabelOuterLimitLabelAlignment =
        SliderHorizontalLabelOuterLimitLabelAlignment.End,
    thumbSize: SliderHorizontalLabelOuterThumbSize = SliderHorizontalLabelOuterThumbSize.Default,
    view: SliderHorizontalLabelOuterView = SliderHorizontalLabelOuterView.Default,
    modify: @Composable SliderStyleBuilder.() -> Unit = {},
): SliderStyle = resolve(size, limitLabelAlignment, thumbSize, view).style(modify)

/**
 * Возвращает экземпляр [SliderStyles] для slider-vertical-label-inner
 */
public fun SliderStyles.VerticalLabelInner.resolve(
    size: SliderVerticalLabelInnerSize = SliderVerticalLabelInnerSize.L,
    labelAlignment: SliderVerticalLabelInnerLabelAlignment =
        SliderVerticalLabelInnerLabelAlignment.Start,
    thumbSize: SliderVerticalLabelInnerThumbSize = SliderVerticalLabelInnerThumbSize.Default,
    view: SliderVerticalLabelInnerView = SliderVerticalLabelInnerView.Default,
): SliderStyles = when {
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSDefault
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSAccent
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndThumbSGradient
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSDefault
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSAccent
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndThumbSGradient
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSDefault
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSAccent
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && thumbSize ==
        SliderVerticalLabelInnerThumbSize.S && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndThumbSGradient
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndDefault
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndAccent
    size == SliderVerticalLabelInnerSize.L && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerLLabelEndGradient
    size == SliderVerticalLabelInnerSize.L && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerLThumbSDefault
    size == SliderVerticalLabelInnerSize.L && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerLThumbSAccent
    size == SliderVerticalLabelInnerSize.L && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerLThumbSGradient
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndDefault
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndAccent
    size == SliderVerticalLabelInnerSize.M && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerMLabelEndGradient
    size == SliderVerticalLabelInnerSize.M && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerMThumbSDefault
    size == SliderVerticalLabelInnerSize.M && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerMThumbSAccent
    size == SliderVerticalLabelInnerSize.M && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerMThumbSGradient
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndDefault
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndAccent
    size == SliderVerticalLabelInnerSize.S && labelAlignment ==
        SliderVerticalLabelInnerLabelAlignment.End && view ==
        SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerSLabelEndGradient
    size == SliderVerticalLabelInnerSize.S && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerSThumbSDefault
    size == SliderVerticalLabelInnerSize.S && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerSThumbSAccent
    size == SliderVerticalLabelInnerSize.S && thumbSize == SliderVerticalLabelInnerThumbSize.S &&
        view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerSThumbSGradient
    size == SliderVerticalLabelInnerSize.L && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerLDefault
    size == SliderVerticalLabelInnerSize.L && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerLAccent
    size == SliderVerticalLabelInnerSize.L && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerLGradient
    size == SliderVerticalLabelInnerSize.M && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerMDefault
    size == SliderVerticalLabelInnerSize.M && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerMAccent
    size == SliderVerticalLabelInnerSize.M && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerMGradient
    size == SliderVerticalLabelInnerSize.S && view == SliderVerticalLabelInnerView.Default ->
        SliderStyles.SliderVerticalLabelInnerSDefault
    size == SliderVerticalLabelInnerSize.S && view == SliderVerticalLabelInnerView.Accent ->
        SliderStyles.SliderVerticalLabelInnerSAccent
    size == SliderVerticalLabelInnerSize.S && view == SliderVerticalLabelInnerView.Gradient ->
        SliderStyles.SliderVerticalLabelInnerSGradient
    else -> error("Unsupported slider-vertical-label-inner style combination")
}

/**
 * Возвращает [SliderStyle] для slider-vertical-label-inner
 */
@Composable
public fun SliderStyles.VerticalLabelInner.style(
    size: SliderVerticalLabelInnerSize = SliderVerticalLabelInnerSize.L,
    labelAlignment: SliderVerticalLabelInnerLabelAlignment =
        SliderVerticalLabelInnerLabelAlignment.Start,
    thumbSize: SliderVerticalLabelInnerThumbSize = SliderVerticalLabelInnerThumbSize.Default,
    view: SliderVerticalLabelInnerView = SliderVerticalLabelInnerView.Default,
    modify: @Composable SliderStyleBuilder.() -> Unit = {},
): SliderStyle = resolve(size, labelAlignment, thumbSize, view).style(modify)

/**
 * Возвращает экземпляр [SliderStyles] для slider-vertical-label-outer
 */
public fun SliderStyles.VerticalLabelOuter.resolve(
    size: SliderVerticalLabelOuterSize = SliderVerticalLabelOuterSize.L,
    alignment: SliderVerticalLabelOuterAlignment = SliderVerticalLabelOuterAlignment.Start,
    labelAlignment: SliderVerticalLabelOuterLabelAlignment =
        SliderVerticalLabelOuterLabelAlignment.Start,
    thumbSize: SliderVerticalLabelOuterThumbSize = SliderVerticalLabelOuterThumbSize.Default,
    view: SliderVerticalLabelOuterView = SliderVerticalLabelOuterView.Default,
): SliderStyles = when {
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndDefault
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndAccent
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndLabelEndGradient
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSDefault
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSAccent
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndThumbSGradient
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndDefault
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndAccent
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndLabelEndGradient
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSDefault
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSAccent
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndThumbSGradient
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndDefault
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndAccent
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        labelAlignment == SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndLabelEndGradient
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSDefault
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSAccent
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        thumbSize == SliderVerticalLabelOuterThumbSize.S && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndThumbSGradient
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSDefault
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSAccent
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && thumbSize ==
        SliderVerticalLabelOuterThumbSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndThumbSGradient
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndDefault
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndAccent
    size == SliderVerticalLabelOuterSize.L && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLAlignmentEndGradient
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndDefault
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndAccent
    size == SliderVerticalLabelOuterSize.L && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLLabelEndGradient
    size == SliderVerticalLabelOuterSize.L && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLThumbSDefault
    size == SliderVerticalLabelOuterSize.L && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLThumbSAccent
    size == SliderVerticalLabelOuterSize.L && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLThumbSGradient
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndDefault
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndAccent
    size == SliderVerticalLabelOuterSize.M && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMAlignmentEndGradient
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndDefault
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndAccent
    size == SliderVerticalLabelOuterSize.M && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMLabelEndGradient
    size == SliderVerticalLabelOuterSize.M && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMThumbSDefault
    size == SliderVerticalLabelOuterSize.M && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMThumbSAccent
    size == SliderVerticalLabelOuterSize.M && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMThumbSGradient
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndDefault
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndAccent
    size == SliderVerticalLabelOuterSize.S && alignment == SliderVerticalLabelOuterAlignment.End &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSAlignmentEndGradient
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndDefault
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndAccent
    size == SliderVerticalLabelOuterSize.S && labelAlignment ==
        SliderVerticalLabelOuterLabelAlignment.End && view ==
        SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSLabelEndGradient
    size == SliderVerticalLabelOuterSize.S && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSThumbSDefault
    size == SliderVerticalLabelOuterSize.S && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSThumbSAccent
    size == SliderVerticalLabelOuterSize.S && thumbSize == SliderVerticalLabelOuterThumbSize.S &&
        view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSThumbSGradient
    size == SliderVerticalLabelOuterSize.L && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterLDefault
    size == SliderVerticalLabelOuterSize.L && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterLAccent
    size == SliderVerticalLabelOuterSize.L && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterLGradient
    size == SliderVerticalLabelOuterSize.M && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterMDefault
    size == SliderVerticalLabelOuterSize.M && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterMAccent
    size == SliderVerticalLabelOuterSize.M && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterMGradient
    size == SliderVerticalLabelOuterSize.S && view == SliderVerticalLabelOuterView.Default ->
        SliderStyles.SliderVerticalLabelOuterSDefault
    size == SliderVerticalLabelOuterSize.S && view == SliderVerticalLabelOuterView.Accent ->
        SliderStyles.SliderVerticalLabelOuterSAccent
    size == SliderVerticalLabelOuterSize.S && view == SliderVerticalLabelOuterView.Gradient ->
        SliderStyles.SliderVerticalLabelOuterSGradient
    else -> error("Unsupported slider-vertical-label-outer style combination")
}

/**
 * Возвращает [SliderStyle] для slider-vertical-label-outer
 */
@Composable
public fun SliderStyles.VerticalLabelOuter.style(
    size: SliderVerticalLabelOuterSize = SliderVerticalLabelOuterSize.L,
    alignment: SliderVerticalLabelOuterAlignment = SliderVerticalLabelOuterAlignment.Start,
    labelAlignment: SliderVerticalLabelOuterLabelAlignment =
        SliderVerticalLabelOuterLabelAlignment.Start,
    thumbSize: SliderVerticalLabelOuterThumbSize = SliderVerticalLabelOuterThumbSize.Default,
    view: SliderVerticalLabelOuterView = SliderVerticalLabelOuterView.Default,
    modify: @Composable SliderStyleBuilder.() -> Unit = {},
): SliderStyle = resolve(size, alignment, labelAlignment, thumbSize, view).style(modify)
