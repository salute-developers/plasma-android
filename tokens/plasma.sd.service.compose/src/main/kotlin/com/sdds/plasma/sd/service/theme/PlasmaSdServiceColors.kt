// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import com.sdds.plasma.sd.service.tokens.DarkColorTokens
import com.sdds.plasma.sd.service.tokens.LightColorTokens
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Цвета PlasmaSdService
 */
@Immutable
public class PlasmaSdServiceColors(
    private val colors: Map<String, Color>,
) {
    /**
     * Основной цвет текста
     */
    public var textDefaultPrimary: Color by colors.obtain("textDefaultPrimary")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryBrightness: Color by colors.obtain("textDefaultPrimaryBrightness")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondary: Color by colors.obtain("textDefaultSecondary")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiary: Color by colors.obtain("textDefaultTertiary")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraph: Color by colors.obtain("textDefaultParagraph")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccent: Color by colors.obtain("textDefaultAccent")

    /**
     * Цвет успеха
     */
    public var textDefaultPositive: Color by colors.obtain("textDefaultPositive")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarning: Color by colors.obtain("textDefaultWarning")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegative: Color by colors.obtain("textDefaultNegative")

    /**
     * light text default textAccentMinorHover
     */
    public var textDefaultAccentMinorHover: Color by colors.obtain("textDefaultAccentMinorHover")

    /**
     * light text default textAccentMinorActive
     */
    public var textDefaultAccentMinorActive: Color by colors.obtain("textDefaultAccentMinorActive")

    /**
     * light text default textInfoHover
     */
    public var textDefaultInfoHover: Color by colors.obtain("textDefaultInfoHover")

    /**
     * light text default textInfoActive
     */
    public var textDefaultInfoActive: Color by colors.obtain("textDefaultInfoActive")

    /**
     * light text default textPositiveMinorHover
     */
    public var textDefaultPositiveMinorHover: Color by
        colors.obtain("textDefaultPositiveMinorHover")

    /**
     * light text default textPositiveMinorActive
     */
    public var textDefaultPositiveMinorActive: Color by
        colors.obtain("textDefaultPositiveMinorActive")

    /**
     * light text default textWarningMinorHover
     */
    public var textDefaultWarningMinorHover: Color by colors.obtain("textDefaultWarningMinorHover")

    /**
     * light text default textWarningMinorActive
     */
    public var textDefaultWarningMinorActive: Color by
        colors.obtain("textDefaultWarningMinorActive")

    /**
     * light text default textNegativeMinorHover
     */
    public var textDefaultNegativeMinorHover: Color by
        colors.obtain("textDefaultNegativeMinorHover")

    /**
     * light text default textNegativeMinorActive
     */
    public var textDefaultNegativeMinorActive: Color by
        colors.obtain("textDefaultNegativeMinorActive")

    /**
     * light text default textInfoMinorHover
     */
    public var textDefaultInfoMinorHover: Color by colors.obtain("textDefaultInfoMinorHover")

    /**
     * light text default textInfoMinorActive
     */
    public var textDefaultInfoMinorActive: Color by colors.obtain("textDefaultInfoMinorActive")

    /**
     * light text default textAccentMinor
     */
    public var textDefaultAccentMinor: Color by colors.obtain("textDefaultAccentMinor")

    /**
     * light text default textPositiveMinor
     */
    public var textDefaultPositiveMinor: Color by colors.obtain("textDefaultPositiveMinor")

    /**
     * light text default textWarningMinor
     */
    public var textDefaultWarningMinor: Color by colors.obtain("textDefaultWarningMinor")

    /**
     * light text default textNegativeMinor
     */
    public var textDefaultNegativeMinor: Color by colors.obtain("textDefaultNegativeMinor")

    /**
     * light text default textInfo
     */
    public var textDefaultInfo: Color by colors.obtain("textDefaultInfo")

    /**
     * light text default textInfoMinor
     */
    public var textDefaultInfoMinor: Color by colors.obtain("textDefaultInfoMinor")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryHover: Color by colors.obtain("textDefaultPrimaryHover")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryActive: Color by colors.obtain("textDefaultPrimaryActive")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondaryHover: Color by colors.obtain("textDefaultSecondaryHover")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondaryActive: Color by colors.obtain("textDefaultSecondaryActive")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryHover: Color by colors.obtain("textDefaultTertiaryHover")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryActive: Color by colors.obtain("textDefaultTertiaryActive")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphHover: Color by colors.obtain("textDefaultParagraphHover")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphActive: Color by colors.obtain("textDefaultParagraphActive")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentHover: Color by colors.obtain("textDefaultAccentHover")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentActive: Color by colors.obtain("textDefaultAccentActive")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveHover: Color by colors.obtain("textDefaultPositiveHover")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveActive: Color by colors.obtain("textDefaultPositiveActive")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningHover: Color by colors.obtain("textDefaultWarningHover")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningActive: Color by colors.obtain("textDefaultWarningActive")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeHover: Color by colors.obtain("textDefaultNegativeHover")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeActive: Color by colors.obtain("textDefaultNegativeActive")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimary: Color by colors.obtain("textOnDarkPrimary")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryBrightness: Color by colors.obtain("textOnDarkPrimaryBrightness")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondary: Color by colors.obtain("textOnDarkSecondary")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiary: Color by colors.obtain("textOnDarkTertiary")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraph: Color by colors.obtain("textOnDarkParagraph")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccent: Color by colors.obtain("textOnDarkAccent")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositive: Color by colors.obtain("textOnDarkPositive")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarning: Color by colors.obtain("textOnDarkWarning")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegative: Color by colors.obtain("textOnDarkNegative")

    /**
     * light text onDark textAccentMinor
     */
    public var textOnDarkAccentMinor: Color by colors.obtain("textOnDarkAccentMinor")

    /**
     * light text onDark textAccentMinorHover
     */
    public var textOnDarkAccentMinorHover: Color by colors.obtain("textOnDarkAccentMinorHover")

    /**
     * light text onDark textAccentMinorActive
     */
    public var textOnDarkAccentMinorActive: Color by colors.obtain("textOnDarkAccentMinorActive")

    /**
     * light text onDark textInfoHover
     */
    public var textOnDarkInfoHover: Color by colors.obtain("textOnDarkInfoHover")

    /**
     * light text onDark textInfoActive
     */
    public var textOnDarkInfoActive: Color by colors.obtain("textOnDarkInfoActive")

    /**
     * light text onDark textPositiveMinor
     */
    public var textOnDarkPositiveMinor: Color by colors.obtain("textOnDarkPositiveMinor")

    /**
     * light text onDark textPositiveMinorHover
     */
    public var textOnDarkPositiveMinorHover: Color by colors.obtain("textOnDarkPositiveMinorHover")

    /**
     * light text onDark textPositiveMinorActive
     */
    public var textOnDarkPositiveMinorActive: Color by
        colors.obtain("textOnDarkPositiveMinorActive")

    /**
     * light text onDark textWarningMinor
     */
    public var textOnDarkWarningMinor: Color by colors.obtain("textOnDarkWarningMinor")

    /**
     * light text onDark textWarningMinorHover
     */
    public var textOnDarkWarningMinorHover: Color by colors.obtain("textOnDarkWarningMinorHover")

    /**
     * light text onDark textWarningMinorActive
     */
    public var textOnDarkWarningMinorActive: Color by colors.obtain("textOnDarkWarningMinorActive")

    /**
     * light text onDark textNegativeMinor
     */
    public var textOnDarkNegativeMinor: Color by colors.obtain("textOnDarkNegativeMinor")

    /**
     * light text onDark textNegativeMinorHover
     */
    public var textOnDarkNegativeMinorHover: Color by colors.obtain("textOnDarkNegativeMinorHover")

    /**
     * light text onDark textNegativeMinorActive
     */
    public var textOnDarkNegativeMinorActive: Color by
        colors.obtain("textOnDarkNegativeMinorActive")

    /**
     * light text onDark textInfoMinorHover
     */
    public var textOnDarkInfoMinorHover: Color by colors.obtain("textOnDarkInfoMinorHover")

    /**
     * light text onDark textInfoMinorActive
     */
    public var textOnDarkInfoMinorActive: Color by colors.obtain("textOnDarkInfoMinorActive")

    /**
     * light text onDark textInfoMinor
     */
    public var textOnDarkInfoMinor: Color by colors.obtain("textOnDarkInfoMinor")

    /**
     * light text onDark textInfo
     */
    public var textOnDarkInfo: Color by colors.obtain("textOnDarkInfo")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryHover: Color by colors.obtain("textOnDarkPrimaryHover")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryActive: Color by colors.obtain("textOnDarkPrimaryActive")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondaryHover: Color by colors.obtain("textOnDarkSecondaryHover")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondaryActive: Color by colors.obtain("textOnDarkSecondaryActive")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryHover: Color by colors.obtain("textOnDarkTertiaryHover")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryActive: Color by colors.obtain("textOnDarkTertiaryActive")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphHover: Color by colors.obtain("textOnDarkParagraphHover")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphActive: Color by colors.obtain("textOnDarkParagraphActive")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentHover: Color by colors.obtain("textOnDarkAccentHover")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentActive: Color by colors.obtain("textOnDarkAccentActive")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveHover: Color by colors.obtain("textOnDarkPositiveHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveActive: Color by colors.obtain("textOnDarkPositiveActive")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningHover: Color by colors.obtain("textOnDarkWarningHover")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningActive: Color by colors.obtain("textOnDarkWarningActive")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeHover: Color by colors.obtain("textOnDarkNegativeHover")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeActive: Color by colors.obtain("textOnDarkNegativeActive")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimary: Color by colors.obtain("textOnLightPrimary")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryBrightness: Color by colors.obtain("textOnLightPrimaryBrightness")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondary: Color by colors.obtain("textOnLightSecondary")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiary: Color by colors.obtain("textOnLightTertiary")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraph: Color by colors.obtain("textOnLightParagraph")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccent: Color by colors.obtain("textOnLightAccent")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositive: Color by colors.obtain("textOnLightPositive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarning: Color by colors.obtain("textOnLightWarning")

    /**
     * light text onLight textAccentMinor
     */
    public var textOnLightAccentMinor: Color by colors.obtain("textOnLightAccentMinor")

    /**
     * light text onLight textAccentMinorHover
     */
    public var textOnLightAccentMinorHover: Color by colors.obtain("textOnLightAccentMinorHover")

    /**
     * light text onLight textAccentMinorActive
     */
    public var textOnLightAccentMinorActive: Color by colors.obtain("textOnLightAccentMinorActive")

    /**
     * light text onLight textInfoHover
     */
    public var textOnLightInfoHover: Color by colors.obtain("textOnLightInfoHover")

    /**
     * light text onLight textInfoActive
     */
    public var textOnLightInfoActive: Color by colors.obtain("textOnLightInfoActive")

    /**
     * light text onLight textPositiveMinor
     */
    public var textOnLightPositiveMinor: Color by colors.obtain("textOnLightPositiveMinor")

    /**
     * light text onLight textPositiveMinorHover
     */
    public var textOnLightPositiveMinorHover: Color by
        colors.obtain("textOnLightPositiveMinorHover")

    /**
     * light text onLight textPositiveMinorActive
     */
    public var textOnLightPositiveMinorActive: Color by
        colors.obtain("textOnLightPositiveMinorActive")

    /**
     * light text onLight textWarningMinor
     */
    public var textOnLightWarningMinor: Color by colors.obtain("textOnLightWarningMinor")

    /**
     * light text onLight textWarningMinorHover
     */
    public var textOnLightWarningMinorHover: Color by colors.obtain("textOnLightWarningMinorHover")

    /**
     * light text onLight textWarningMinorActive
     */
    public var textOnLightWarningMinorActive: Color by
        colors.obtain("textOnLightWarningMinorActive")

    /**
     * light text onLight textNegativeMinor
     */
    public var textOnLightNegativeMinor: Color by colors.obtain("textOnLightNegativeMinor")

    /**
     * light text onLight textNegativeMinorHover
     */
    public var textOnLightNegativeMinorHover: Color by
        colors.obtain("textOnLightNegativeMinorHover")

    /**
     * light text onLight textNegativeMinorActive
     */
    public var textOnLightNegativeMinorActive: Color by
        colors.obtain("textOnLightNegativeMinorActive")

    /**
     * light text onLight textInfoMinorHover
     */
    public var textOnLightInfoMinorHover: Color by colors.obtain("textOnLightInfoMinorHover")

    /**
     * light text onLight textInfoMinorActive
     */
    public var textOnLightInfoMinorActive: Color by colors.obtain("textOnLightInfoMinorActive")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegative: Color by colors.obtain("textOnLightNegative")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeHover: Color by colors.obtain("textOnLightNegativeHover")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeActive: Color by colors.obtain("textOnLightNegativeActive")

    /**
     * light text onLight textInfo
     */
    public var textOnLightInfo: Color by colors.obtain("textOnLightInfo")

    /**
     * light text onLight textInfoMinor
     */
    public var textOnLightInfoMinor: Color by colors.obtain("textOnLightInfoMinor")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryHover: Color by colors.obtain("textOnLightPrimaryHover")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryActive: Color by colors.obtain("textOnLightPrimaryActive")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondaryHover: Color by colors.obtain("textOnLightSecondaryHover")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondaryActive: Color by colors.obtain("textOnLightSecondaryActive")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryHover: Color by colors.obtain("textOnLightTertiaryHover")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryActive: Color by colors.obtain("textOnLightTertiaryActive")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphHover: Color by colors.obtain("textOnLightParagraphHover")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphActive: Color by colors.obtain("textOnLightParagraphActive")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentHover: Color by colors.obtain("textOnLightAccentHover")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentActive: Color by colors.obtain("textOnLightAccentActive")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveHover: Color by colors.obtain("textOnLightPositiveHover")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveActive: Color by colors.obtain("textOnLightPositiveActive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningHover: Color by colors.obtain("textOnLightWarningHover")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningActive: Color by colors.obtain("textOnLightWarningActive")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimary: Color by colors.obtain("textInversePrimary")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryBrightness: Color by colors.obtain("textInversePrimaryBrightness")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondary: Color by colors.obtain("textInverseSecondary")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiary: Color by colors.obtain("textInverseTertiary")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraph: Color by colors.obtain("textInverseParagraph")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositive: Color by colors.obtain("textInversePositive")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarning: Color by colors.obtain("textInverseWarning")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegative: Color by colors.obtain("textInverseNegative")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryHover: Color by colors.obtain("textInversePrimaryHover")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryActive: Color by colors.obtain("textInversePrimaryActive")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondaryHover: Color by colors.obtain("textInverseSecondaryHover")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondaryActive: Color by colors.obtain("textInverseSecondaryActive")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryHover: Color by colors.obtain("textInverseTertiaryHover")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryActive: Color by colors.obtain("textInverseTertiaryActive")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraphHover: Color by colors.obtain("textInverseParagraphHover")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraphActive: Color by colors.obtain("textInverseParagraphActive")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentHover: Color by colors.obtain("textInverseAccentHover")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentActive: Color by colors.obtain("textInverseAccentActive")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveHover: Color by colors.obtain("textInversePositiveHover")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveActive: Color by colors.obtain("textInversePositiveActive")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningHover: Color by colors.obtain("textInverseWarningHover")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningActive: Color by colors.obtain("textInverseWarningActive")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeHover: Color by colors.obtain("textInverseNegativeHover")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeActive: Color by colors.obtain("textInverseNegativeActive")

    /**
     * light text inverse textAccentMinor
     */
    public var textInverseAccentMinor: Color by colors.obtain("textInverseAccentMinor")

    /**
     * light text inverse textAccentMinorHover
     */
    public var textInverseAccentMinorHover: Color by colors.obtain("textInverseAccentMinorHover")

    /**
     * light text inverse textAccentMinorActive
     */
    public var textInverseAccentMinorActive: Color by colors.obtain("textInverseAccentMinorActive")

    /**
     * light text inverse textInfoHover
     */
    public var textInverseInfoHover: Color by colors.obtain("textInverseInfoHover")

    /**
     * light text inverse textInfoActive
     */
    public var textInverseInfoActive: Color by colors.obtain("textInverseInfoActive")

    /**
     * light text inverse textPositiveMinorHover
     */
    public var textInversePositiveMinorHover: Color by
        colors.obtain("textInversePositiveMinorHover")

    /**
     * light text inverse textPositiveMinorActive
     */
    public var textInversePositiveMinorActive: Color by
        colors.obtain("textInversePositiveMinorActive")

    /**
     * light text inverse textWarningMinorHover
     */
    public var textInverseWarningMinorHover: Color by colors.obtain("textInverseWarningMinorHover")

    /**
     * light text inverse textWarningMinorActive
     */
    public var textInverseWarningMinorActive: Color by
        colors.obtain("textInverseWarningMinorActive")

    /**
     * light text inverse textNegativeMinorHover
     */
    public var textInverseNegativeMinorHover: Color by
        colors.obtain("textInverseNegativeMinorHover")

    /**
     * light text inverse textNegativeMinorActive
     */
    public var textInverseNegativeMinorActive: Color by
        colors.obtain("textInverseNegativeMinorActive")

    /**
     * light text inverse textInfoMinorHover
     */
    public var textInverseInfoMinorHover: Color by colors.obtain("textInverseInfoMinorHover")

    /**
     * light text inverse textInfoMinorActive
     */
    public var textInverseInfoMinorActive: Color by colors.obtain("textInverseInfoMinorActive")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccent: Color by colors.obtain("textInverseAccent")

    /**
     * light text inverse textInfo
     */
    public var textInverseInfo: Color by colors.obtain("textInverseInfo")

    /**
     * light text inverse textPositiveMinor
     */
    public var textInversePositiveMinor: Color by colors.obtain("textInversePositiveMinor")

    /**
     * light text inverse textWarningMinor
     */
    public var textInverseWarningMinor: Color by colors.obtain("textInverseWarningMinor")

    /**
     * light text inverse textNegativeMinor
     */
    public var textInverseNegativeMinor: Color by colors.obtain("textInverseNegativeMinor")

    /**
     * light text inverse textInfoMinor
     */
    public var textInverseInfoMinor: Color by colors.obtain("textInverseInfoMinor")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefault: Color by colors.obtain("surfaceDefaultSolidDefault")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimary: Color by colors.obtain("surfaceDefaultSolidPrimary")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryBrightness: Color by
        colors.obtain("surfaceDefaultSolidPrimaryBrightness")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondary: Color by colors.obtain("surfaceDefaultSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiary: Color by colors.obtain("surfaceDefaultSolidTertiary")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCard: Color by colors.obtain("surfaceDefaultSolidCard")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardBrightness: Color by
        colors.obtain("surfaceDefaultSolidCardBrightness")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDefault: Color by
        colors.obtain("surfaceDefaultTransparentDefault")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimary: Color by
        colors.obtain("surfaceDefaultTransparentPrimary")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondary: Color by
        colors.obtain("surfaceDefaultTransparentSecondary")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiary: Color by
        colors.obtain("surfaceDefaultTransparentTertiary")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCard: Color by
        colors.obtain("surfaceDefaultTransparentCard")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardBrightness: Color by
        colors.obtain("surfaceDefaultTransparentCardBrightness")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccent: Color by colors.obtain("surfaceDefaultAccent")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositive: Color by colors.obtain("surfaceDefaultPositive")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarning: Color by colors.obtain("surfaceDefaultWarning")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegative: Color by colors.obtain("surfaceDefaultNegative")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClear: Color by colors.obtain("surfaceDefaultClear")

    /**
     * light surface default surfaceTransparentDeep
     */
    public var surfaceDefaultTransparentDeep: Color by
        colors.obtain("surfaceDefaultTransparentDeep")

    /**
     * light surface default surfaceAccentMinorHover
     */
    public var surfaceDefaultAccentMinorHover: Color by
        colors.obtain("surfaceDefaultAccentMinorHover")

    /**
     * light surface default surfaceAccentMinorActive
     */
    public var surfaceDefaultAccentMinorActive: Color by
        colors.obtain("surfaceDefaultAccentMinorActive")

    /**
     * light surface default surfaceTransparentAccentHover
     */
    public var surfaceDefaultTransparentAccentHover: Color by
        colors.obtain("surfaceDefaultTransparentAccentHover")

    /**
     * light surface default surfaceTransparentAccentActive
     */
    public var surfaceDefaultTransparentAccentActive: Color by
        colors.obtain("surfaceDefaultTransparentAccentActive")

    /**
     * light surface default surfaceInfoHover
     */
    public var surfaceDefaultInfoHover: Color by colors.obtain("surfaceDefaultInfoHover")

    /**
     * light surface default surfaceInfoActive
     */
    public var surfaceDefaultInfoActive: Color by colors.obtain("surfaceDefaultInfoActive")

    /**
     * light surface default surfacePositiveMinorHover
     */
    public var surfaceDefaultPositiveMinorHover: Color by
        colors.obtain("surfaceDefaultPositiveMinorHover")

    /**
     * light surface default surfacePositiveMinorActive
     */
    public var surfaceDefaultPositiveMinorActive: Color by
        colors.obtain("surfaceDefaultPositiveMinorActive")

    /**
     * light surface default surfaceWarningMinorHover
     */
    public var surfaceDefaultWarningMinorHover: Color by
        colors.obtain("surfaceDefaultWarningMinorHover")

    /**
     * light surface default surfaceWarningMinorActive
     */
    public var surfaceDefaultWarningMinorActive: Color by
        colors.obtain("surfaceDefaultWarningMinorActive")

    /**
     * light surface default surfaceNegativeMinorHover
     */
    public var surfaceDefaultNegativeMinorHover: Color by
        colors.obtain("surfaceDefaultNegativeMinorHover")

    /**
     * light surface default surfaceNegativeMinorActive
     */
    public var surfaceDefaultNegativeMinorActive: Color by
        colors.obtain("surfaceDefaultNegativeMinorActive")

    /**
     * light surface default surfaceInfoMinorHover
     */
    public var surfaceDefaultInfoMinorHover: Color by colors.obtain("surfaceDefaultInfoMinorHover")

    /**
     * light surface default surfaceInfoMinorActive
     */
    public var surfaceDefaultInfoMinorActive: Color by
        colors.obtain("surfaceDefaultInfoMinorActive")

    /**
     * light surface default surfaceTransparentPositiveHover
     */
    public var surfaceDefaultTransparentPositiveHover: Color by
        colors.obtain("surfaceDefaultTransparentPositiveHover")

    /**
     * light surface default surfaceTransparentPositiveActive
     */
    public var surfaceDefaultTransparentPositiveActive: Color by
        colors.obtain("surfaceDefaultTransparentPositiveActive")

    /**
     * light surface default surfaceTransparentWarningHover
     */
    public var surfaceDefaultTransparentWarningHover: Color by
        colors.obtain("surfaceDefaultTransparentWarningHover")

    /**
     * light surface default surfaceTransparentWarningActive
     */
    public var surfaceDefaultTransparentWarningActive: Color by
        colors.obtain("surfaceDefaultTransparentWarningActive")

    /**
     * light surface default surfaceTransparentNegativeHover
     */
    public var surfaceDefaultTransparentNegativeHover: Color by
        colors.obtain("surfaceDefaultTransparentNegativeHover")

    /**
     * light surface default surfaceTransparentNegativeActive
     */
    public var surfaceDefaultTransparentNegativeActive: Color by
        colors.obtain("surfaceDefaultTransparentNegativeActive")

    /**
     * light surface default surfaceTransparentInfoHover
     */
    public var surfaceDefaultTransparentInfoHover: Color by
        colors.obtain("surfaceDefaultTransparentInfoHover")

    /**
     * light surface default surfaceTransparentInfoActive
     */
    public var surfaceDefaultTransparentInfoActive: Color by
        colors.obtain("surfaceDefaultTransparentInfoActive")

    /**
     * light surface default surfaceAccentMinor
     */
    public var surfaceDefaultAccentMinor: Color by colors.obtain("surfaceDefaultAccentMinor")

    /**
     * light surface default surfaceTransparentAccent
     */
    public var surfaceDefaultTransparentAccent: Color by
        colors.obtain("surfaceDefaultTransparentAccent")

    /**
     * light surface default surfacePositiveMinor
     */
    public var surfaceDefaultPositiveMinor: Color by colors.obtain("surfaceDefaultPositiveMinor")

    /**
     * light surface default surfaceWarningMinor
     */
    public var surfaceDefaultWarningMinor: Color by colors.obtain("surfaceDefaultWarningMinor")

    /**
     * light surface default surfaceNegativeMinor
     */
    public var surfaceDefaultNegativeMinor: Color by colors.obtain("surfaceDefaultNegativeMinor")

    /**
     * light surface default surfaceTransparentPositive
     */
    public var surfaceDefaultTransparentPositive: Color by
        colors.obtain("surfaceDefaultTransparentPositive")

    /**
     * light surface default surfaceTransparentWarning
     */
    public var surfaceDefaultTransparentWarning: Color by
        colors.obtain("surfaceDefaultTransparentWarning")

    /**
     * light surface default surfaceTransparentNegative
     */
    public var surfaceDefaultTransparentNegative: Color by
        colors.obtain("surfaceDefaultTransparentNegative")

    /**
     * light surface default surfaceInfo
     */
    public var surfaceDefaultInfo: Color by colors.obtain("surfaceDefaultInfo")

    /**
     * light surface default surfaceInfoMinor
     */
    public var surfaceDefaultInfoMinor: Color by colors.obtain("surfaceDefaultInfoMinor")

    /**
     * light surface default surfaceTransparentInfo
     */
    public var surfaceDefaultTransparentInfo: Color by
        colors.obtain("surfaceDefaultTransparentInfo")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefaultHover: Color by
        colors.obtain("surfaceDefaultSolidDefaultHover")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefaultActive: Color by
        colors.obtain("surfaceDefaultSolidDefaultActive")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryHover: Color by
        colors.obtain("surfaceDefaultSolidPrimaryHover")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryActive: Color by
        colors.obtain("surfaceDefaultSolidPrimaryActive")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondaryHover: Color by
        colors.obtain("surfaceDefaultSolidSecondaryHover")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondaryActive: Color by
        colors.obtain("surfaceDefaultSolidSecondaryActive")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiaryHover: Color by
        colors.obtain("surfaceDefaultSolidTertiaryHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiaryActive: Color by
        colors.obtain("surfaceDefaultSolidTertiaryActive")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardHover: Color by colors.obtain("surfaceDefaultSolidCardHover")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardActive: Color by
        colors.obtain("surfaceDefaultSolidCardActive")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDefaultHover: Color by
        colors.obtain("surfaceDefaultTransparentDefaultHover")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDefaultActive: Color by
        colors.obtain("surfaceDefaultTransparentDefaultActive")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimaryHover: Color by
        colors.obtain("surfaceDefaultTransparentPrimaryHover")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimaryActive: Color by
        colors.obtain("surfaceDefaultTransparentPrimaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondaryHover: Color by
        colors.obtain("surfaceDefaultTransparentSecondaryHover")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondaryActive: Color by
        colors.obtain("surfaceDefaultTransparentSecondaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiaryHover: Color by
        colors.obtain("surfaceDefaultTransparentTertiaryHover")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiaryActive: Color by
        colors.obtain("surfaceDefaultTransparentTertiaryActive")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardHover: Color by
        colors.obtain("surfaceDefaultTransparentCardHover")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardActive: Color by
        colors.obtain("surfaceDefaultTransparentCardActive")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentHover: Color by colors.obtain("surfaceDefaultAccentHover")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentActive: Color by colors.obtain("surfaceDefaultAccentActive")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositiveHover: Color by colors.obtain("surfaceDefaultPositiveHover")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositiveActive: Color by colors.obtain("surfaceDefaultPositiveActive")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningHover: Color by colors.obtain("surfaceDefaultWarningHover")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningActive: Color by colors.obtain("surfaceDefaultWarningActive")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeHover: Color by colors.obtain("surfaceDefaultNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeActive: Color by colors.obtain("surfaceDefaultNegativeActive")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearHover: Color by colors.obtain("surfaceDefaultClearHover")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearActive: Color by colors.obtain("surfaceDefaultClearActive")

    /**
     * light surface default surfaceTransparentDeepHover
     */
    public var surfaceDefaultTransparentDeepHover: Color by
        colors.obtain("surfaceDefaultTransparentDeepHover")

    /**
     * light surface default surfaceTransparentDeepActive
     */
    public var surfaceDefaultTransparentDeepActive: Color by
        colors.obtain("surfaceDefaultTransparentDeepActive")

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimary: Color by colors.obtain("surfaceOnDarkSolidPrimary")

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryBrightness")

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondary: Color by colors.obtain("surfaceOnDarkSolidSecondary")

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiary: Color by colors.obtain("surfaceOnDarkSolidTertiary")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCard: Color by colors.obtain("surfaceOnDarkSolidCard")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardBrightness: Color by
        colors.obtain("surfaceOnDarkSolidCardBrightness")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDefault: Color by
        colors.obtain("surfaceOnDarkTransparentDefault")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccent: Color by colors.obtain("surfaceOnDarkAccent")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositive: Color by colors.obtain("surfaceOnDarkPositive")

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarning: Color by colors.obtain("surfaceOnDarkWarning")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegative: Color by colors.obtain("surfaceOnDarkNegative")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClear: Color by colors.obtain("surfaceOnDarkClear")

    /**
     * light surface onDark surfaceTransparentDeep
     */
    public var surfaceOnDarkTransparentDeep: Color by colors.obtain("surfaceOnDarkTransparentDeep")

    /**
     * light surface onDark surfaceAccentMinor
     */
    public var surfaceOnDarkAccentMinor: Color by colors.obtain("surfaceOnDarkAccentMinor")

    /**
     * light surface onDark surfaceAccentMinorHover
     */
    public var surfaceOnDarkAccentMinorHover: Color by
        colors.obtain("surfaceOnDarkAccentMinorHover")

    /**
     * light surface onDark surfaceAccentMinorActive
     */
    public var surfaceOnDarkAccentMinorActive: Color by
        colors.obtain("surfaceOnDarkAccentMinorActive")

    /**
     * light surface onDark surfaceTransparentAccent
     */
    public var surfaceOnDarkTransparentAccent: Color by
        colors.obtain("surfaceOnDarkTransparentAccent")

    /**
     * light surface onDark surfaceTransparentAccentHover
     */
    public var surfaceOnDarkTransparentAccentHover: Color by
        colors.obtain("surfaceOnDarkTransparentAccentHover")

    /**
     * light surface onDark surfaceTransparentAccentActive
     */
    public var surfaceOnDarkTransparentAccentActive: Color by
        colors.obtain("surfaceOnDarkTransparentAccentActive")

    /**
     * light surface onDark surfaceSurfaceInfoHover
     */
    public var surfaceOnDarkSurfaceInfoHover: Color by
        colors.obtain("surfaceOnDarkSurfaceInfoHover")

    /**
     * light surface onDark surfaceSurfaceInfoActive
     */
    public var surfaceOnDarkSurfaceInfoActive: Color by
        colors.obtain("surfaceOnDarkSurfaceInfoActive")

    /**
     * light surface onDark surfacePositiveMinor
     */
    public var surfaceOnDarkPositiveMinor: Color by colors.obtain("surfaceOnDarkPositiveMinor")

    /**
     * light surface onDark surfacePositiveMinorHover
     */
    public var surfaceOnDarkPositiveMinorHover: Color by
        colors.obtain("surfaceOnDarkPositiveMinorHover")

    /**
     * light surface onDark surfacePositiveMinorActive
     */
    public var surfaceOnDarkPositiveMinorActive: Color by
        colors.obtain("surfaceOnDarkPositiveMinorActive")

    /**
     * light surface onDark surfaceWarningMinor
     */
    public var surfaceOnDarkWarningMinor: Color by colors.obtain("surfaceOnDarkWarningMinor")

    /**
     * light surface onDark surfaceWarningMinorHover
     */
    public var surfaceOnDarkWarningMinorHover: Color by
        colors.obtain("surfaceOnDarkWarningMinorHover")

    /**
     * light surface onDark surfaceWarningMinorActive
     */
    public var surfaceOnDarkWarningMinorActive: Color by
        colors.obtain("surfaceOnDarkWarningMinorActive")

    /**
     * light surface onDark surfaceNegativeMinor
     */
    public var surfaceOnDarkNegativeMinor: Color by colors.obtain("surfaceOnDarkNegativeMinor")

    /**
     * light surface onDark surfaceNegativeMinorHover
     */
    public var surfaceOnDarkNegativeMinorHover: Color by
        colors.obtain("surfaceOnDarkNegativeMinorHover")

    /**
     * light surface onDark surfaceNegativeMinorActive
     */
    public var surfaceOnDarkNegativeMinorActive: Color by
        colors.obtain("surfaceOnDarkNegativeMinorActive")

    /**
     * light surface onDark surfaceInfoMinorHover
     */
    public var surfaceOnDarkInfoMinorHover: Color by colors.obtain("surfaceOnDarkInfoMinorHover")

    /**
     * light surface onDark surfaceInfoMinorActive
     */
    public var surfaceOnDarkInfoMinorActive: Color by colors.obtain("surfaceOnDarkInfoMinorActive")

    /**
     * light surface onDark surfaceTransparentPositiveHover
     */
    public var surfaceOnDarkTransparentPositiveHover: Color by
        colors.obtain("surfaceOnDarkTransparentPositiveHover")

    /**
     * light surface onDark surfaceTransparentPositiveActive
     */
    public var surfaceOnDarkTransparentPositiveActive: Color by
        colors.obtain("surfaceOnDarkTransparentPositiveActive")

    /**
     * light surface onDark surfaceTransparentWarningHover
     */
    public var surfaceOnDarkTransparentWarningHover: Color by
        colors.obtain("surfaceOnDarkTransparentWarningHover")

    /**
     * light surface onDark surfaceTransparentWarningActive
     */
    public var surfaceOnDarkTransparentWarningActive: Color by
        colors.obtain("surfaceOnDarkTransparentWarningActive")

    /**
     * light surface onDark surfaceTransparentNegativeHover
     */
    public var surfaceOnDarkTransparentNegativeHover: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeHover")

    /**
     * light surface onDark surfaceTransparentNegativeActive
     */
    public var surfaceOnDarkTransparentNegativeActive: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeActive")

    /**
     * light surface onDark surfaceTransparentInfoHover
     */
    public var surfaceOnDarkTransparentInfoHover: Color by
        colors.obtain("surfaceOnDarkTransparentInfoHover")

    /**
     * light surface onDark surfaceTransparentInfoActive
     */
    public var surfaceOnDarkTransparentInfoActive: Color by
        colors.obtain("surfaceOnDarkTransparentInfoActive")

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefault: Color by colors.obtain("surfaceOnDarkSolidDefault")

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefaultHover: Color by
        colors.obtain("surfaceOnDarkSolidDefaultHover")

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefaultActive: Color by
        colors.obtain("surfaceOnDarkSolidDefaultActive")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimary: Color by
        colors.obtain("surfaceOnDarkTransparentPrimary")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentPrimaryHover")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentPrimaryActive")

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondary: Color by
        colors.obtain("surfaceOnDarkTransparentSecondary")

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryHover")

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryActive")

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiary: Color by
        colors.obtain("surfaceOnDarkTransparentTertiary")

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryHover")

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryActive")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCard: Color by colors.obtain("surfaceOnDarkTransparentCard")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardBrightness: Color by
        colors.obtain("surfaceOnDarkTransparentCardBrightness")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardHover: Color by
        colors.obtain("surfaceOnDarkTransparentCardHover")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardActive: Color by
        colors.obtain("surfaceOnDarkTransparentCardActive")

    /**
     * light surface onDark surfaceTransparentPositive
     */
    public var surfaceOnDarkTransparentPositive: Color by
        colors.obtain("surfaceOnDarkTransparentPositive")

    /**
     * light surface onDark surfaceTransparentWarning
     */
    public var surfaceOnDarkTransparentWarning: Color by
        colors.obtain("surfaceOnDarkTransparentWarning")

    /**
     * light surface onDark surfaceTransparentNegative
     */
    public var surfaceOnDarkTransparentNegative: Color by
        colors.obtain("surfaceOnDarkTransparentNegative")

    /**
     * light surface onDark surfaceSurfaceInfo
     */
    public var surfaceOnDarkSurfaceInfo: Color by colors.obtain("surfaceOnDarkSurfaceInfo")

    /**
     * light surface onDark surfaceInfoMinor
     */
    public var surfaceOnDarkInfoMinor: Color by colors.obtain("surfaceOnDarkInfoMinor")

    /**
     * light surface onDark surfaceTransparentInfo
     */
    public var surfaceOnDarkTransparentInfo: Color by colors.obtain("surfaceOnDarkTransparentInfo")

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryHover: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryHover")

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryActive: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryActive")

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryHover: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryHover")

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryActive: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryActive")

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryHover: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryHover")

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryActive: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryActive")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardHover: Color by colors.obtain("surfaceOnDarkSolidCardHover")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardActive: Color by colors.obtain("surfaceOnDarkSolidCardActive")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDefaultHover: Color by
        colors.obtain("surfaceOnDarkTransparentDefaultHover")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDefaultActive: Color by
        colors.obtain("surfaceOnDarkTransparentDefaultActive")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentHover: Color by colors.obtain("surfaceOnDarkAccentHover")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentActive: Color by colors.obtain("surfaceOnDarkAccentActive")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositiveHover: Color by colors.obtain("surfaceOnDarkPositiveHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositiveActive: Color by colors.obtain("surfaceOnDarkPositiveActive")

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningHover: Color by colors.obtain("surfaceOnDarkWarningHover")

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningActive: Color by colors.obtain("surfaceOnDarkWarningActive")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeHover: Color by colors.obtain("surfaceOnDarkNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeActive: Color by colors.obtain("surfaceOnDarkNegativeActive")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearHover: Color by colors.obtain("surfaceOnDarkClearHover")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearActive: Color by colors.obtain("surfaceOnDarkClearActive")

    /**
     * light surface onDark surfaceTransparentDeepHover
     */
    public var surfaceOnDarkTransparentDeepHover: Color by
        colors.obtain("surfaceOnDarkTransparentDeepHover")

    /**
     * light surface onDark surfaceTransparentDeepActive
     */
    public var surfaceOnDarkTransparentDeepActive: Color by
        colors.obtain("surfaceOnDarkTransparentDeepActive")

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefault: Color by colors.obtain("surfaceOnLightSolidDefault")

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimary: Color by colors.obtain("surfaceOnLightSolidPrimary")

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnLightSolidPrimaryBrightness")

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondary: Color by colors.obtain("surfaceOnLightSolidSecondary")

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiary: Color by colors.obtain("surfaceOnLightSolidTertiary")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCard: Color by colors.obtain("surfaceOnLightSolidCard")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardBrightness: Color by
        colors.obtain("surfaceOnLightSolidCardBrightness")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDefault: Color by
        colors.obtain("surfaceOnLightTransparentDefault")

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimary: Color by
        colors.obtain("surfaceOnLightTransparentPrimary")

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondary: Color by
        colors.obtain("surfaceOnLightTransparentSecondary")

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiary: Color by
        colors.obtain("surfaceOnLightTransparentTertiary")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCard: Color by
        colors.obtain("surfaceOnLightTransparentCard")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardBrightness: Color by
        colors.obtain("surfaceOnLightTransparentCardBrightness")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccent: Color by colors.obtain("surfaceOnLightAccent")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositive: Color by colors.obtain("surfaceOnLightPositive")

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarning: Color by colors.obtain("surfaceOnLightWarning")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegative: Color by colors.obtain("surfaceOnLightNegative")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClear: Color by colors.obtain("surfaceOnLightClear")

    /**
     * light surface onLight surfaceTransparentDeep
     */
    public var surfaceOnLightTransparentDeep: Color by
        colors.obtain("surfaceOnLightTransparentDeep")

    /**
     * light surface onLight surfaceAccentMinor
     */
    public var surfaceOnLightAccentMinor: Color by colors.obtain("surfaceOnLightAccentMinor")

    /**
     * light surface onLight surfaceAccentMinorHover
     */
    public var surfaceOnLightAccentMinorHover: Color by
        colors.obtain("surfaceOnLightAccentMinorHover")

    /**
     * light surface onLight surfaceAccentMinorActive
     */
    public var surfaceOnLightAccentMinorActive: Color by
        colors.obtain("surfaceOnLightAccentMinorActive")

    /**
     * light surface onLight surfaceTransparentAccent
     */
    public var surfaceOnLightTransparentAccent: Color by
        colors.obtain("surfaceOnLightTransparentAccent")

    /**
     * light surface onLight surfaceTransparentAccentHover
     */
    public var surfaceOnLightTransparentAccentHover: Color by
        colors.obtain("surfaceOnLightTransparentAccentHover")

    /**
     * light surface onLight surfaceTransparentAccentActive
     */
    public var surfaceOnLightTransparentAccentActive: Color by
        colors.obtain("surfaceOnLightTransparentAccentActive")

    /**
     * light surface onLight surfaceInfoHover
     */
    public var surfaceOnLightInfoHover: Color by colors.obtain("surfaceOnLightInfoHover")

    /**
     * light surface onLight surfaceInfoActive
     */
    public var surfaceOnLightInfoActive: Color by colors.obtain("surfaceOnLightInfoActive")

    /**
     * light surface onLight surfacePositiveMinor
     */
    public var surfaceOnLightPositiveMinor: Color by colors.obtain("surfaceOnLightPositiveMinor")

    /**
     * light surface onLight surfacePositiveMinorHover
     */
    public var surfaceOnLightPositiveMinorHover: Color by
        colors.obtain("surfaceOnLightPositiveMinorHover")

    /**
     * light surface onLight surfacePositiveMinorActive
     */
    public var surfaceOnLightPositiveMinorActive: Color by
        colors.obtain("surfaceOnLightPositiveMinorActive")

    /**
     * light surface onLight surfaceWarningMinor
     */
    public var surfaceOnLightWarningMinor: Color by colors.obtain("surfaceOnLightWarningMinor")

    /**
     * light surface onLight surfaceWarningMinorHover
     */
    public var surfaceOnLightWarningMinorHover: Color by
        colors.obtain("surfaceOnLightWarningMinorHover")

    /**
     * light surface onLight surfaceWarningMinorActive
     */
    public var surfaceOnLightWarningMinorActive: Color by
        colors.obtain("surfaceOnLightWarningMinorActive")

    /**
     * light surface onLight surfaceNegativeMinor
     */
    public var surfaceOnLightNegativeMinor: Color by colors.obtain("surfaceOnLightNegativeMinor")

    /**
     * light surface onLight surfaceNegativeMinorHover
     */
    public var surfaceOnLightNegativeMinorHover: Color by
        colors.obtain("surfaceOnLightNegativeMinorHover")

    /**
     * light surface onLight surfaceNegativeMinorActive
     */
    public var surfaceOnLightNegativeMinorActive: Color by
        colors.obtain("surfaceOnLightNegativeMinorActive")

    /**
     * light surface onLight surfaceInfoMinorHover
     */
    public var surfaceOnLightInfoMinorHover: Color by colors.obtain("surfaceOnLightInfoMinorHover")

    /**
     * light surface onLight surfaceInfoMinorActive
     */
    public var surfaceOnLightInfoMinorActive: Color by
        colors.obtain("surfaceOnLightInfoMinorActive")

    /**
     * light surface onLight surfaceTransparentPositiveHover
     */
    public var surfaceOnLightTransparentPositiveHover: Color by
        colors.obtain("surfaceOnLightTransparentPositiveHover")

    /**
     * light surface onLight surfaceTransparentPositiveActive
     */
    public var surfaceOnLightTransparentPositiveActive: Color by
        colors.obtain("surfaceOnLightTransparentPositiveActive")

    /**
     * light surface onLight surfaceTransparentWarningHover
     */
    public var surfaceOnLightTransparentWarningHover: Color by
        colors.obtain("surfaceOnLightTransparentWarningHover")

    /**
     * light surface onLight surfaceTransparentWarningActive
     */
    public var surfaceOnLightTransparentWarningActive: Color by
        colors.obtain("surfaceOnLightTransparentWarningActive")

    /**
     * light surface onLight surfaceTransparentNegativeHover
     */
    public var surfaceOnLightTransparentNegativeHover: Color by
        colors.obtain("surfaceOnLightTransparentNegativeHover")

    /**
     * light surface onLight surfaceTransparentNegativeActive
     */
    public var surfaceOnLightTransparentNegativeActive: Color by
        colors.obtain("surfaceOnLightTransparentNegativeActive")

    /**
     * light surface onLight surfaceTransparentInfoHover
     */
    public var surfaceOnLightTransparentInfoHover: Color by
        colors.obtain("surfaceOnLightTransparentInfoHover")

    /**
     * light surface onLight surfaceTransparentInfoActive
     */
    public var surfaceOnLightTransparentInfoActive: Color by
        colors.obtain("surfaceOnLightTransparentInfoActive")

    /**
     * light surface onLight surfaceTransparentPositive
     */
    public var surfaceOnLightTransparentPositive: Color by
        colors.obtain("surfaceOnLightTransparentPositive")

    /**
     * light surface onLight surfaceTransparentWarning
     */
    public var surfaceOnLightTransparentWarning: Color by
        colors.obtain("surfaceOnLightTransparentWarning")

    /**
     * light surface onLight surfaceTransparentNegative
     */
    public var surfaceOnLightTransparentNegative: Color by
        colors.obtain("surfaceOnLightTransparentNegative")

    /**
     * light surface onLight surfaceInfo
     */
    public var surfaceOnLightInfo: Color by colors.obtain("surfaceOnLightInfo")

    /**
     * light surface onLight surfaceInfoMinor
     */
    public var surfaceOnLightInfoMinor: Color by colors.obtain("surfaceOnLightInfoMinor")

    /**
     * light surface onLight surfaceTransparentInfo
     */
    public var surfaceOnLightTransparentInfo: Color by
        colors.obtain("surfaceOnLightTransparentInfo")

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefaultHover: Color by
        colors.obtain("surfaceOnLightSolidDefaultHover")

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefaultActive: Color by
        colors.obtain("surfaceOnLightSolidDefaultActive")

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryHover: Color by
        colors.obtain("surfaceOnLightSolidPrimaryHover")

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryActive: Color by
        colors.obtain("surfaceOnLightSolidPrimaryActive")

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryHover: Color by
        colors.obtain("surfaceOnLightSolidSecondaryHover")

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryActive: Color by
        colors.obtain("surfaceOnLightSolidSecondaryActive")

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryHover: Color by
        colors.obtain("surfaceOnLightSolidTertiaryHover")

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryActive: Color by
        colors.obtain("surfaceOnLightSolidTertiaryActive")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardHover: Color by colors.obtain("surfaceOnLightSolidCardHover")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardActive: Color by
        colors.obtain("surfaceOnLightSolidCardActive")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDefaultHover: Color by
        colors.obtain("surfaceOnLightTransparentDefaultHover")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDefaultActive: Color by
        colors.obtain("surfaceOnLightTransparentDefaultActive")

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryHover: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryHover")

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryActive: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryActive")

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryHover")

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryActive")

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryHover")

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryActive")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardHover: Color by
        colors.obtain("surfaceOnLightTransparentCardHover")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardActive: Color by
        colors.obtain("surfaceOnLightTransparentCardActive")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentHover: Color by colors.obtain("surfaceOnLightAccentHover")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentActive: Color by colors.obtain("surfaceOnLightAccentActive")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositiveHover: Color by colors.obtain("surfaceOnLightPositiveHover")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositiveActive: Color by colors.obtain("surfaceOnLightPositiveActive")

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningHover: Color by colors.obtain("surfaceOnLightWarningHover")

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningActive: Color by colors.obtain("surfaceOnLightWarningActive")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeHover: Color by colors.obtain("surfaceOnLightNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeActive: Color by colors.obtain("surfaceOnLightNegativeActive")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearHover: Color by colors.obtain("surfaceOnLightClearHover")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearActive: Color by colors.obtain("surfaceOnLightClearActive")

    /**
     * light surface onLight surfaceTransparentDeepHover
     */
    public var surfaceOnLightTransparentDeepHover: Color by
        colors.obtain("surfaceOnLightTransparentDeepHover")

    /**
     * light surface onLight surfaceTransparentDeepActive
     */
    public var surfaceOnLightTransparentDeepActive: Color by
        colors.obtain("surfaceOnLightTransparentDeepActive")

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefault: Color by colors.obtain("surfaceInverseSolidDefault")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimary: Color by colors.obtain("surfaceInverseSolidPrimary")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryBrightness: Color by
        colors.obtain("surfaceInverseSolidPrimaryBrightness")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondary: Color by colors.obtain("surfaceInverseSolidSecondary")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiary: Color by colors.obtain("surfaceInverseSolidTertiary")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCard: Color by colors.obtain("surfaceInverseSolidCard")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardBrightness: Color by
        colors.obtain("surfaceInverseSolidCardBrightness")

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseTransparentDefault: Color by
        colors.obtain("surfaceInverseTransparentDefault")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimary: Color by
        colors.obtain("surfaceInverseTransparentPrimary")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondary: Color by
        colors.obtain("surfaceInverseTransparentSecondary")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiary: Color by
        colors.obtain("surfaceInverseTransparentTertiary")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCard: Color by
        colors.obtain("surfaceInverseTransparentCard")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardBrightness: Color by
        colors.obtain("surfaceInverseTransparentCardBrightness")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccent: Color by colors.obtain("surfaceInverseAccent")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositive: Color by colors.obtain("surfaceInversePositive")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarning: Color by colors.obtain("surfaceInverseWarning")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegative: Color by colors.obtain("surfaceInverseNegative")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClear: Color by colors.obtain("surfaceInverseClear")

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefaultHover: Color by
        colors.obtain("surfaceInverseSolidDefaultHover")

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefaultActive: Color by
        colors.obtain("surfaceInverseSolidDefaultActive")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryHover: Color by
        colors.obtain("surfaceInverseSolidPrimaryHover")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryActive: Color by
        colors.obtain("surfaceInverseSolidPrimaryActive")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondaryHover: Color by
        colors.obtain("surfaceInverseSolidSecondaryHover")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondaryActive: Color by
        colors.obtain("surfaceInverseSolidSecondaryActive")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiaryHover: Color by
        colors.obtain("surfaceInverseSolidTertiaryHover")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiaryActive: Color by
        colors.obtain("surfaceInverseSolidTertiaryActive")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardHover: Color by colors.obtain("surfaceInverseSolidCardHover")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardActive: Color by
        colors.obtain("surfaceInverseSolidCardActive")

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseTransparentDefaultHover: Color by
        colors.obtain("surfaceInverseTransparentDefaultHover")

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseTransparentDefaultActive: Color by
        colors.obtain("surfaceInverseTransparentDefaultActive")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimaryHover: Color by
        colors.obtain("surfaceInverseTransparentPrimaryHover")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimaryActive: Color by
        colors.obtain("surfaceInverseTransparentPrimaryActive")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondaryHover: Color by
        colors.obtain("surfaceInverseTransparentSecondaryHover")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondaryActive: Color by
        colors.obtain("surfaceInverseTransparentSecondaryActive")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiaryHover: Color by
        colors.obtain("surfaceInverseTransparentTertiaryHover")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiaryActive: Color by
        colors.obtain("surfaceInverseTransparentTertiaryActive")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardHover: Color by
        colors.obtain("surfaceInverseTransparentCardHover")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardActive: Color by
        colors.obtain("surfaceInverseTransparentCardActive")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentHover: Color by colors.obtain("surfaceInverseAccentHover")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentActive: Color by colors.obtain("surfaceInverseAccentActive")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositiveHover: Color by colors.obtain("surfaceInversePositiveHover")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositiveActive: Color by colors.obtain("surfaceInversePositiveActive")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningHover: Color by colors.obtain("surfaceInverseWarningHover")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningActive: Color by colors.obtain("surfaceInverseWarningActive")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeHover: Color by colors.obtain("surfaceInverseNegativeHover")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeActive: Color by colors.obtain("surfaceInverseNegativeActive")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearHover: Color by colors.obtain("surfaceInverseClearHover")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearActive: Color by colors.obtain("surfaceInverseClearActive")

    /**
     * light surface inverse surfaceTransparentDeep
     */
    public var surfaceInverseTransparentDeep: Color by
        colors.obtain("surfaceInverseTransparentDeep")

    /**
     * light surface inverse surfaceTransparentDeepHover
     */
    public var surfaceInverseTransparentDeepHover: Color by
        colors.obtain("surfaceInverseTransparentDeepHover")

    /**
     * light surface inverse surfaceTransparentDeepActive
     */
    public var surfaceInverseTransparentDeepActive: Color by
        colors.obtain("surfaceInverseTransparentDeepActive")

    /**
     * light surface inverse surfaceAccentMinor
     */
    public var surfaceInverseAccentMinor: Color by colors.obtain("surfaceInverseAccentMinor")

    /**
     * light surface inverse surfaceAccentMinorHover
     */
    public var surfaceInverseAccentMinorHover: Color by
        colors.obtain("surfaceInverseAccentMinorHover")

    /**
     * light surface inverse surfaceAccentMinorActive
     */
    public var surfaceInverseAccentMinorActive: Color by
        colors.obtain("surfaceInverseAccentMinorActive")

    /**
     * light surface inverse surfaceTransparentAccent
     */
    public var surfaceInverseTransparentAccent: Color by
        colors.obtain("surfaceInverseTransparentAccent")

    /**
     * light surface inverse surfaceTransparentAccentHover
     */
    public var surfaceInverseTransparentAccentHover: Color by
        colors.obtain("surfaceInverseTransparentAccentHover")

    /**
     * light surface inverse surfaceTransparentAccentActive
     */
    public var surfaceInverseTransparentAccentActive: Color by
        colors.obtain("surfaceInverseTransparentAccentActive")

    /**
     * light surface inverse surfaceInfo
     */
    public var surfaceInverseInfo: Color by colors.obtain("surfaceInverseInfo")

    /**
     * light surface inverse surfaceInfoHover
     */
    public var surfaceInverseInfoHover: Color by colors.obtain("surfaceInverseInfoHover")

    /**
     * light surface inverse surfaceInfoActive
     */
    public var surfaceInverseInfoActive: Color by colors.obtain("surfaceInverseInfoActive")

    /**
     * light surface inverse surfacePositiveMinor
     */
    public var surfaceInversePositiveMinor: Color by colors.obtain("surfaceInversePositiveMinor")

    /**
     * light surface inverse surfacePositiveMinorHover
     */
    public var surfaceInversePositiveMinorHover: Color by
        colors.obtain("surfaceInversePositiveMinorHover")

    /**
     * light surface inverse surfacePositiveMinorActive
     */
    public var surfaceInversePositiveMinorActive: Color by
        colors.obtain("surfaceInversePositiveMinorActive")

    /**
     * light surface inverse surfaceWarningMinor
     */
    public var surfaceInverseWarningMinor: Color by colors.obtain("surfaceInverseWarningMinor")

    /**
     * light surface inverse surfaceWarningMinorHover
     */
    public var surfaceInverseWarningMinorHover: Color by
        colors.obtain("surfaceInverseWarningMinorHover")

    /**
     * light surface inverse surfaceWarningMinorActive
     */
    public var surfaceInverseWarningMinorActive: Color by
        colors.obtain("surfaceInverseWarningMinorActive")

    /**
     * light surface inverse surfaceNegativeMinor
     */
    public var surfaceInverseNegativeMinor: Color by colors.obtain("surfaceInverseNegativeMinor")

    /**
     * light surface inverse surfaceNegativeMinorHover
     */
    public var surfaceInverseNegativeMinorHover: Color by
        colors.obtain("surfaceInverseNegativeMinorHover")

    /**
     * light surface inverse surfaceNegativeMinorActive
     */
    public var surfaceInverseNegativeMinorActive: Color by
        colors.obtain("surfaceInverseNegativeMinorActive")

    /**
     * light surface inverse surfaceInfoMinor
     */
    public var surfaceInverseInfoMinor: Color by colors.obtain("surfaceInverseInfoMinor")

    /**
     * light surface inverse surfaceInfoMinorHover
     */
    public var surfaceInverseInfoMinorHover: Color by colors.obtain("surfaceInverseInfoMinorHover")

    /**
     * light surface inverse surfaceInfoMinorActive
     */
    public var surfaceInverseInfoMinorActive: Color by
        colors.obtain("surfaceInverseInfoMinorActive")

    /**
     * light surface inverse surfaceTransparentPositive
     */
    public var surfaceInverseTransparentPositive: Color by
        colors.obtain("surfaceInverseTransparentPositive")

    /**
     * light surface inverse surfaceTransparentPositiveHover
     */
    public var surfaceInverseTransparentPositiveHover: Color by
        colors.obtain("surfaceInverseTransparentPositiveHover")

    /**
     * light surface inverse surfaceTransparentPositiveActive
     */
    public var surfaceInverseTransparentPositiveActive: Color by
        colors.obtain("surfaceInverseTransparentPositiveActive")

    /**
     * light surface inverse surfaceTransparentWarning
     */
    public var surfaceInverseTransparentWarning: Color by
        colors.obtain("surfaceInverseTransparentWarning")

    /**
     * light surface inverse surfaceTransparentWarningHover
     */
    public var surfaceInverseTransparentWarningHover: Color by
        colors.obtain("surfaceInverseTransparentWarningHover")

    /**
     * light surface inverse surfaceTransparentWarningActive
     */
    public var surfaceInverseTransparentWarningActive: Color by
        colors.obtain("surfaceInverseTransparentWarningActive")

    /**
     * light surface inverse surfaceTransparentNegative
     */
    public var surfaceInverseTransparentNegative: Color by
        colors.obtain("surfaceInverseTransparentNegative")

    /**
     * light surface inverse surfaceTransparentNegativeHover
     */
    public var surfaceInverseTransparentNegativeHover: Color by
        colors.obtain("surfaceInverseTransparentNegativeHover")

    /**
     * light surface inverse surfaceTransparentNegativeActive
     */
    public var surfaceInverseTransparentNegativeActive: Color by
        colors.obtain("surfaceInverseTransparentNegativeActive")

    /**
     * light surface inverse surfaceTransparentInfo
     */
    public var surfaceInverseTransparentInfo: Color by
        colors.obtain("surfaceInverseTransparentInfo")

    /**
     * light surface inverse surfaceTransparentInfoHover
     */
    public var surfaceInverseTransparentInfoHover: Color by
        colors.obtain("surfaceInverseTransparentInfoHover")

    /**
     * light surface inverse surfaceTransparentInfoActive
     */
    public var surfaceInverseTransparentInfoActive: Color by
        colors.obtain("surfaceInverseTransparentInfoActive")

    /**
     * Основной фон
     */
    public var backgroundDefaultPrimary: Color by colors.obtain("backgroundDefaultPrimary")

    /**
     * Основной фон
     */
    public var backgroundDefaultPrimaryBrightness: Color by
        colors.obtain("backgroundDefaultPrimaryBrightness")

    /**
     * Вторичный фон
     */
    public var backgroundDefaultSecondary: Color by colors.obtain("backgroundDefaultSecondary")

    /**
     * Третичный фон
     */
    public var backgroundDefaultTertiary: Color by colors.obtain("backgroundDefaultTertiary")

    /**
     * Основной фон на темном фоне
     */
    public var backgroundDarkPrimary: Color by colors.obtain("backgroundDarkPrimary")

    /**
     * Вторичный фон на темном фоне
     */
    public var backgroundDarkSecondary: Color by colors.obtain("backgroundDarkSecondary")

    /**
     * Третичный фон на темном фоне
     */
    public var backgroundDarkTertiary: Color by colors.obtain("backgroundDarkTertiary")

    /**
     * Основной фон на светлом фоне
     */
    public var backgroundLightPrimary: Color by colors.obtain("backgroundLightPrimary")

    /**
     * Вторичный фон на светлом фоне
     */
    public var backgroundLightSecondary: Color by colors.obtain("backgroundLightSecondary")

    /**
     * Третичный фон на светлом фоне
     */
    public var backgroundLightTertiary: Color by colors.obtain("backgroundLightTertiary")

    /**
     * Инвертированный основной фон
     */
    public var backgroundInversePrimaryBrightness: Color by
        colors.obtain("backgroundInversePrimaryBrightness")

    /**
     * Инвертированный вторичный фон
     */
    public var backgroundInverseSecondary: Color by colors.obtain("backgroundInverseSecondary")

    /**
     * Инвертированный третичный фон
     */
    public var backgroundInverseTertiary: Color by colors.obtain("backgroundInverseTertiary")

    /**
     * Инвертированный основной фон
     */
    public var backgroundInversePrimary: Color by colors.obtain("backgroundInversePrimary")

    /**
     * Цвет фона паранжи светлый
     */
    public var overlayDefaultSoft: Color by colors.obtain("overlayDefaultSoft")

    /**
     * Цвет фона паранжи темный
     */
    public var overlayDefaultHard: Color by colors.obtain("overlayDefaultHard")

    /**
     * light overlay default overlayBlur
     */
    public var overlayDefaultBlur: Color by colors.obtain("overlayDefaultBlur")

    /**
     * Цвет фона паранжи светлый на темном фоне
     */
    public var overlayOnDarkSoft: Color by colors.obtain("overlayOnDarkSoft")

    /**
     * Цвет фона паранжи темный на темном фоне
     */
    public var overlayOnDarkHard: Color by colors.obtain("overlayOnDarkHard")

    /**
     * light overlay onDark overlayBlur
     */
    public var overlayOnDarkBlur: Color by colors.obtain("overlayOnDarkBlur")

    /**
     * Цвет фона паранжи светлый на светлом фоне
     */
    public var overlayOnLightSoft: Color by colors.obtain("overlayOnLightSoft")

    /**
     * Цвет фона паранжи темный на светлом фоне
     */
    public var overlayOnLightHard: Color by colors.obtain("overlayOnLightHard")

    /**
     * light overlay onLight overlayBlur
     */
    public var overlayOnLightBlur: Color by colors.obtain("overlayOnLightBlur")

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public var overlayInverseHard: Color by colors.obtain("overlayInverseHard")

    /**
     * Инвертированный цвет фона паранжи светлый
     */
    public var overlayInverseSoft: Color by colors.obtain("overlayInverseSoft")

    /**
     * light overlay inverse overlayBlur
     */
    public var overlayInverseBlur: Color by colors.obtain("overlayInverseBlur")

    /**
     * light outline default outlineSecondaryHover
     */
    public var outlineDefaultSecondaryHover: Color by colors.obtain("outlineDefaultSecondaryHover")

    /**
     * light outline default outlineSecondaryActive
     */
    public var outlineDefaultSecondaryActive: Color by
        colors.obtain("outlineDefaultSecondaryActive")

    /**
     * light outline default outlineTertiaryHover
     */
    public var outlineDefaultTertiaryHover: Color by colors.obtain("outlineDefaultTertiaryHover")

    /**
     * light outline default outlineTertiaryActive
     */
    public var outlineDefaultTertiaryActive: Color by colors.obtain("outlineDefaultTertiaryActive")

    /**
     * light outline default outlineDefaultHover
     */
    public var outlineDefaultDefaultHover: Color by colors.obtain("outlineDefaultDefaultHover")

    /**
     * light outline default outlineDefaultActive
     */
    public var outlineDefaultDefaultActive: Color by colors.obtain("outlineDefaultDefaultActive")

    /**
     * light outline default outlineTransparentPrimaryHover
     */
    public var outlineDefaultTransparentPrimaryHover: Color by
        colors.obtain("outlineDefaultTransparentPrimaryHover")

    /**
     * light outline default outlineTransparentPrimaryActive
     */
    public var outlineDefaultTransparentPrimaryActive: Color by
        colors.obtain("outlineDefaultTransparentPrimaryActive")

    /**
     * light outline default outlineTransparentSecondaryHover
     */
    public var outlineDefaultTransparentSecondaryHover: Color by
        colors.obtain("outlineDefaultTransparentSecondaryHover")

    /**
     * light outline default outlineTransparentSecondaryActive
     */
    public var outlineDefaultTransparentSecondaryActive: Color by
        colors.obtain("outlineDefaultTransparentSecondaryActive")

    /**
     * light outline default outlineTransparentTertiaryHover
     */
    public var outlineDefaultTransparentTertiaryHover: Color by
        colors.obtain("outlineDefaultTransparentTertiaryHover")

    /**
     * light outline default outlineTransparentTertiaryActive
     */
    public var outlineDefaultTransparentTertiaryActive: Color by
        colors.obtain("outlineDefaultTransparentTertiaryActive")

    /**
     * light outline default outlineTransparentClearHover
     */
    public var outlineDefaultTransparentClearHover: Color by
        colors.obtain("outlineDefaultTransparentClearHover")

    /**
     * light outline default outlineTransparentClearActive
     */
    public var outlineDefaultTransparentClearActive: Color by
        colors.obtain("outlineDefaultTransparentClearActive")

    /**
     * light outline default outlineAccentHover
     */
    public var outlineDefaultAccentHover: Color by colors.obtain("outlineDefaultAccentHover")

    /**
     * light outline default outlineAccentActive
     */
    public var outlineDefaultAccentActive: Color by colors.obtain("outlineDefaultAccentActive")

    /**
     * light outline default outlineAccentMinorHover
     */
    public var outlineDefaultAccentMinorHover: Color by
        colors.obtain("outlineDefaultAccentMinorHover")

    /**
     * light outline default outlineAccentMinorActive
     */
    public var outlineDefaultAccentMinorActive: Color by
        colors.obtain("outlineDefaultAccentMinorActive")

    /**
     * light outline default outlineTransparentAccentHover
     */
    public var outlineDefaultTransparentAccentHover: Color by
        colors.obtain("outlineDefaultTransparentAccentHover")

    /**
     * light outline default outlineTransparentAccentActive
     */
    public var outlineDefaultTransparentAccentActive: Color by
        colors.obtain("outlineDefaultTransparentAccentActive")

    /**
     * light outline default outlinePositiveHover
     */
    public var outlineDefaultPositiveHover: Color by colors.obtain("outlineDefaultPositiveHover")

    /**
     * light outline default outlinePositiveActive
     */
    public var outlineDefaultPositiveActive: Color by colors.obtain("outlineDefaultPositiveActive")

    /**
     * light outline default outlineWarningHover
     */
    public var outlineDefaultWarningHover: Color by colors.obtain("outlineDefaultWarningHover")

    /**
     * light outline default outlineWarningActive
     */
    public var outlineDefaultWarningActive: Color by colors.obtain("outlineDefaultWarningActive")

    /**
     * light outline default outlineNegativeHover
     */
    public var outlineDefaultNegativeHover: Color by colors.obtain("outlineDefaultNegativeHover")

    /**
     * light outline default outlineNegativeActive
     */
    public var outlineDefaultNegativeActive: Color by colors.obtain("outlineDefaultNegativeActive")

    /**
     * light outline default outlineInfoHover
     */
    public var outlineDefaultInfoHover: Color by colors.obtain("outlineDefaultInfoHover")

    /**
     * light outline default outlineInfoActive
     */
    public var outlineDefaultInfoActive: Color by colors.obtain("outlineDefaultInfoActive")

    /**
     * light outline default outlinePositiveMinorHover
     */
    public var outlineDefaultPositiveMinorHover: Color by
        colors.obtain("outlineDefaultPositiveMinorHover")

    /**
     * light outline default outlinePositiveMinorActive
     */
    public var outlineDefaultPositiveMinorActive: Color by
        colors.obtain("outlineDefaultPositiveMinorActive")

    /**
     * light outline default outlineWarningMinorHover
     */
    public var outlineDefaultWarningMinorHover: Color by
        colors.obtain("outlineDefaultWarningMinorHover")

    /**
     * light outline default outlineWarningMinorActive
     */
    public var outlineDefaultWarningMinorActive: Color by
        colors.obtain("outlineDefaultWarningMinorActive")

    /**
     * light outline default outlineNegativeMinorHover
     */
    public var outlineDefaultNegativeMinorHover: Color by
        colors.obtain("outlineDefaultNegativeMinorHover")

    /**
     * light outline default outlineNegativeMinorActive
     */
    public var outlineDefaultNegativeMinorActive: Color by
        colors.obtain("outlineDefaultNegativeMinorActive")

    /**
     * light outline default outlineInfoMinorHover
     */
    public var outlineDefaultInfoMinorHover: Color by colors.obtain("outlineDefaultInfoMinorHover")

    /**
     * light outline default outlineInfoMinorActive
     */
    public var outlineDefaultInfoMinorActive: Color by
        colors.obtain("outlineDefaultInfoMinorActive")

    /**
     * light outline default outlineTransparentPositiveHover
     */
    public var outlineDefaultTransparentPositiveHover: Color by
        colors.obtain("outlineDefaultTransparentPositiveHover")

    /**
     * light outline default outlineTransparentPositiveActive
     */
    public var outlineDefaultTransparentPositiveActive: Color by
        colors.obtain("outlineDefaultTransparentPositiveActive")

    /**
     * light outline default outlineTransparentWarningHover
     */
    public var outlineDefaultTransparentWarningHover: Color by
        colors.obtain("outlineDefaultTransparentWarningHover")

    /**
     * light outline default outlineTransparentWarningActive
     */
    public var outlineDefaultTransparentWarningActive: Color by
        colors.obtain("outlineDefaultTransparentWarningActive")

    /**
     * light outline default outlineNegativeTransparentHover
     */
    public var outlineDefaultNegativeTransparentHover: Color by
        colors.obtain("outlineDefaultNegativeTransparentHover")

    /**
     * light outline default outlineNegativeTransparentActive
     */
    public var outlineDefaultNegativeTransparentActive: Color by
        colors.obtain("outlineDefaultNegativeTransparentActive")

    /**
     * light outline default outlineTransparentInfoHover
     */
    public var outlineDefaultTransparentInfoHover: Color by
        colors.obtain("outlineDefaultTransparentInfoHover")

    /**
     * light outline default outlineTransparentInfoActive
     */
    public var outlineDefaultTransparentInfoActive: Color by
        colors.obtain("outlineDefaultTransparentInfoActive")

    /**
     * light outline default outlinePrimaryHover
     */
    public var outlineDefaultPrimaryHover: Color by colors.obtain("outlineDefaultPrimaryHover")

    /**
     * light outline default outlinePrimaryActive
     */
    public var outlineDefaultPrimaryActive: Color by colors.obtain("outlineDefaultPrimaryActive")

    /**
     * light outline default outlineTransparentPrimary
     */
    public var outlineDefaultTransparentPrimary: Color by
        colors.obtain("outlineDefaultTransparentPrimary")

    /**
     * light outline default outlineTransparentSecondary
     */
    public var outlineDefaultTransparentSecondary: Color by
        colors.obtain("outlineDefaultTransparentSecondary")

    /**
     * light outline default outlineTransparentTertiary
     */
    public var outlineDefaultTransparentTertiary: Color by
        colors.obtain("outlineDefaultTransparentTertiary")

    /**
     * light outline default outlineTransparentClear
     */
    public var outlineDefaultTransparentClear: Color by
        colors.obtain("outlineDefaultTransparentClear")

    /**
     * light outline default outlineAccent
     */
    public var outlineDefaultAccent: Color by colors.obtain("outlineDefaultAccent")

    /**
     * light outline default outlineAccentMinor
     */
    public var outlineDefaultAccentMinor: Color by colors.obtain("outlineDefaultAccentMinor")

    /**
     * light outline default outlineTransparentAccent
     */
    public var outlineDefaultTransparentAccent: Color by
        colors.obtain("outlineDefaultTransparentAccent")

    /**
     * light outline default outlinePositive
     */
    public var outlineDefaultPositive: Color by colors.obtain("outlineDefaultPositive")

    /**
     * light outline default outlineWarning
     */
    public var outlineDefaultWarning: Color by colors.obtain("outlineDefaultWarning")

    /**
     * light outline default outlineNegative
     */
    public var outlineDefaultNegative: Color by colors.obtain("outlineDefaultNegative")

    /**
     * light outline default outlinePositiveMinor
     */
    public var outlineDefaultPositiveMinor: Color by colors.obtain("outlineDefaultPositiveMinor")

    /**
     * light outline default outlineWarningMinor
     */
    public var outlineDefaultWarningMinor: Color by colors.obtain("outlineDefaultWarningMinor")

    /**
     * light outline default outlineNegativeMinor
     */
    public var outlineDefaultNegativeMinor: Color by colors.obtain("outlineDefaultNegativeMinor")

    /**
     * light outline default outlineTransparentPositive
     */
    public var outlineDefaultTransparentPositive: Color by
        colors.obtain("outlineDefaultTransparentPositive")

    /**
     * light outline default outlineTransparentWarning
     */
    public var outlineDefaultTransparentWarning: Color by
        colors.obtain("outlineDefaultTransparentWarning")

    /**
     * light outline default outlineTransparentNegative
     */
    public var outlineDefaultTransparentNegative: Color by
        colors.obtain("outlineDefaultTransparentNegative")

    /**
     * light outline default outlineTransparentNegativeHover
     */
    public var outlineDefaultTransparentNegativeHover: Color by
        colors.obtain("outlineDefaultTransparentNegativeHover")

    /**
     * light outline default outlineTransparentNegativeActive
     */
    public var outlineDefaultTransparentNegativeActive: Color by
        colors.obtain("outlineDefaultTransparentNegativeActive")

    /**
     * light outline default outlineInfo
     */
    public var outlineDefaultInfo: Color by colors.obtain("outlineDefaultInfo")

    /**
     * light outline default outlineInfoMinor
     */
    public var outlineDefaultInfoMinor: Color by colors.obtain("outlineDefaultInfoMinor")

    /**
     * light outline default outlineTransparentInfo
     */
    public var outlineDefaultTransparentInfo: Color by
        colors.obtain("outlineDefaultTransparentInfo")

    /**
     * light outline default outlineSolidPrimaryHover
     */
    public var outlineDefaultSolidPrimaryHover: Color by
        colors.obtain("outlineDefaultSolidPrimaryHover")

    /**
     * light outline default outlineSolidPrimaryActive
     */
    public var outlineDefaultSolidPrimaryActive: Color by
        colors.obtain("outlineDefaultSolidPrimaryActive")

    /**
     * light outline default outlineSolidSecondaryHover
     */
    public var outlineDefaultSolidSecondaryHover: Color by
        colors.obtain("outlineDefaultSolidSecondaryHover")

    /**
     * light outline default outlineSolidSecondaryActive
     */
    public var outlineDefaultSolidSecondaryActive: Color by
        colors.obtain("outlineDefaultSolidSecondaryActive")

    /**
     * light outline default outlineSolidTertiaryHover
     */
    public var outlineDefaultSolidTertiaryHover: Color by
        colors.obtain("outlineDefaultSolidTertiaryHover")

    /**
     * light outline default outlineSolidTertiaryActive
     */
    public var outlineDefaultSolidTertiaryActive: Color by
        colors.obtain("outlineDefaultSolidTertiaryActive")

    /**
     * light outline default outlineSolidDefaultHover
     */
    public var outlineDefaultSolidDefaultHover: Color by
        colors.obtain("outlineDefaultSolidDefaultHover")

    /**
     * light outline default outlineSolidDefaultActive
     */
    public var outlineDefaultSolidDefaultActive: Color by
        colors.obtain("outlineDefaultSolidDefaultActive")

    /**
     * light outline default outlineSolidPrimary
     */
    public var outlineDefaultSolidPrimary: Color by colors.obtain("outlineDefaultSolidPrimary")

    /**
     * light outline default outlineSolidSecondary
     */
    public var outlineDefaultSolidSecondary: Color by colors.obtain("outlineDefaultSolidSecondary")

    /**
     * light outline default outlineSolidTertiary
     */
    public var outlineDefaultSolidTertiary: Color by colors.obtain("outlineDefaultSolidTertiary")

    /**
     * light outline default outlineSolidDefault
     */
    public var outlineDefaultSolidDefault: Color by colors.obtain("outlineDefaultSolidDefault")

    /**
     * light outline onDark outlineSecondaryHover
     */
    public var outlineOnDarkSecondaryHover: Color by colors.obtain("outlineOnDarkSecondaryHover")

    /**
     * light outline onDark outlineSecondaryActive
     */
    public var outlineOnDarkSecondaryActive: Color by colors.obtain("outlineOnDarkSecondaryActive")

    /**
     * light outline onDark outlineTertiaryHover
     */
    public var outlineOnDarkTertiaryHover: Color by colors.obtain("outlineOnDarkTertiaryHover")

    /**
     * light outline onDark outlineTertiaryActive
     */
    public var outlineOnDarkTertiaryActive: Color by colors.obtain("outlineOnDarkTertiaryActive")

    /**
     * light outline onDark outlineDefaultHover
     */
    public var outlineOnDarkDefaultHover: Color by colors.obtain("outlineOnDarkDefaultHover")

    /**
     * light outline onDark outlineDefaultActive
     */
    public var outlineOnDarkDefaultActive: Color by colors.obtain("outlineOnDarkDefaultActive")

    /**
     * light outline onDark outlineTransparentPrimary
     */
    public var outlineOnDarkTransparentPrimary: Color by
        colors.obtain("outlineOnDarkTransparentPrimary")

    /**
     * light outline onDark outlineTransparentPrimaryHover
     */
    public var outlineOnDarkTransparentPrimaryHover: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryHover")

    /**
     * light outline onDark outlineTransparentPrimaryActive
     */
    public var outlineOnDarkTransparentPrimaryActive: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryActive")

    /**
     * light outline onDark outlineTransparentSecondary
     */
    public var outlineOnDarkTransparentSecondary: Color by
        colors.obtain("outlineOnDarkTransparentSecondary")

    /**
     * light outline onDark outlineTransparentSecondaryHover
     */
    public var outlineOnDarkTransparentSecondaryHover: Color by
        colors.obtain("outlineOnDarkTransparentSecondaryHover")

    /**
     * light outline onDark outlineTransparentSecondaryActive
     */
    public var outlineOnDarkTransparentSecondaryActive: Color by
        colors.obtain("outlineOnDarkTransparentSecondaryActive")

    /**
     * light outline onDark outlineTransparentTertiary
     */
    public var outlineOnDarkTransparentTertiary: Color by
        colors.obtain("outlineOnDarkTransparentTertiary")

    /**
     * light outline onDark outlineTransparentTertiaryHover
     */
    public var outlineOnDarkTransparentTertiaryHover: Color by
        colors.obtain("outlineOnDarkTransparentTertiaryHover")

    /**
     * light outline onDark outlineTransparentTertiaryActive
     */
    public var outlineOnDarkTransparentTertiaryActive: Color by
        colors.obtain("outlineOnDarkTransparentTertiaryActive")

    /**
     * light outline onDark outlineAccent
     */
    public var outlineOnDarkAccent: Color by colors.obtain("outlineOnDarkAccent")

    /**
     * light outline onDark outlineAccentHover
     */
    public var outlineOnDarkAccentHover: Color by colors.obtain("outlineOnDarkAccentHover")

    /**
     * light outline onDark outlineAccentActive
     */
    public var outlineOnDarkAccentActive: Color by colors.obtain("outlineOnDarkAccentActive")

    /**
     * light outline onDark outlineAccentMinor
     */
    public var outlineOnDarkAccentMinor: Color by colors.obtain("outlineOnDarkAccentMinor")

    /**
     * light outline onDark outlineAccentMinorHover
     */
    public var outlineOnDarkAccentMinorHover: Color by
        colors.obtain("outlineOnDarkAccentMinorHover")

    /**
     * light outline onDark outlineAccentMinorActive
     */
    public var outlineOnDarkAccentMinorActive: Color by
        colors.obtain("outlineOnDarkAccentMinorActive")

    /**
     * light outline onDark outlineTransparentAccent
     */
    public var outlineOnDarkTransparentAccent: Color by
        colors.obtain("outlineOnDarkTransparentAccent")

    /**
     * light outline onDark outlineTransparentAccentHover
     */
    public var outlineOnDarkTransparentAccentHover: Color by
        colors.obtain("outlineOnDarkTransparentAccentHover")

    /**
     * light outline onDark outlineTransparentAccentActive
     */
    public var outlineOnDarkTransparentAccentActive: Color by
        colors.obtain("outlineOnDarkTransparentAccentActive")

    /**
     * light outline onDark outlinePositive
     */
    public var outlineOnDarkPositive: Color by colors.obtain("outlineOnDarkPositive")

    /**
     * light outline onDark outlinePositiveHover
     */
    public var outlineOnDarkPositiveHover: Color by colors.obtain("outlineOnDarkPositiveHover")

    /**
     * light outline onDark outlinePositiveActive
     */
    public var outlineOnDarkPositiveActive: Color by colors.obtain("outlineOnDarkPositiveActive")

    /**
     * light outline onDark outlineWarning
     */
    public var outlineOnDarkWarning: Color by colors.obtain("outlineOnDarkWarning")

    /**
     * light outline onDark outlineWarningHover
     */
    public var outlineOnDarkWarningHover: Color by colors.obtain("outlineOnDarkWarningHover")

    /**
     * light outline onDark outlineWarningActive
     */
    public var outlineOnDarkWarningActive: Color by colors.obtain("outlineOnDarkWarningActive")

    /**
     * light outline onDark outlineNegative
     */
    public var outlineOnDarkNegative: Color by colors.obtain("outlineOnDarkNegative")

    /**
     * light outline onDark outlineNegativeHover
     */
    public var outlineOnDarkNegativeHover: Color by colors.obtain("outlineOnDarkNegativeHover")

    /**
     * light outline onDark outlineNegativeActive
     */
    public var outlineOnDarkNegativeActive: Color by colors.obtain("outlineOnDarkNegativeActive")

    /**
     * light outline onDark outlineInfoHover
     */
    public var outlineOnDarkInfoHover: Color by colors.obtain("outlineOnDarkInfoHover")

    /**
     * light outline onDark outlineInfoActive
     */
    public var outlineOnDarkInfoActive: Color by colors.obtain("outlineOnDarkInfoActive")

    /**
     * light outline onDark outlinePositiveMinor
     */
    public var outlineOnDarkPositiveMinor: Color by colors.obtain("outlineOnDarkPositiveMinor")

    /**
     * light outline onDark outlinePositiveMinorHover
     */
    public var outlineOnDarkPositiveMinorHover: Color by
        colors.obtain("outlineOnDarkPositiveMinorHover")

    /**
     * light outline onDark outlinePositiveMinorActive
     */
    public var outlineOnDarkPositiveMinorActive: Color by
        colors.obtain("outlineOnDarkPositiveMinorActive")

    /**
     * light outline onDark outlineWarningMinor
     */
    public var outlineOnDarkWarningMinor: Color by colors.obtain("outlineOnDarkWarningMinor")

    /**
     * light outline onDark outlineWarningMinorHover
     */
    public var outlineOnDarkWarningMinorHover: Color by
        colors.obtain("outlineOnDarkWarningMinorHover")

    /**
     * light outline onDark outlineWarningMinorActive
     */
    public var outlineOnDarkWarningMinorActive: Color by
        colors.obtain("outlineOnDarkWarningMinorActive")

    /**
     * light outline onDark outlineNegativeMinor
     */
    public var outlineOnDarkNegativeMinor: Color by colors.obtain("outlineOnDarkNegativeMinor")

    /**
     * light outline onDark outlineNegativeMinorHover
     */
    public var outlineOnDarkNegativeMinorHover: Color by
        colors.obtain("outlineOnDarkNegativeMinorHover")

    /**
     * light outline onDark outlineNegativeMinorActive
     */
    public var outlineOnDarkNegativeMinorActive: Color by
        colors.obtain("outlineOnDarkNegativeMinorActive")

    /**
     * light outline onDark outlineInfoMinorHover
     */
    public var outlineOnDarkInfoMinorHover: Color by colors.obtain("outlineOnDarkInfoMinorHover")

    /**
     * light outline onDark outlineInfoMinorActive
     */
    public var outlineOnDarkInfoMinorActive: Color by colors.obtain("outlineOnDarkInfoMinorActive")

    /**
     * light outline onDark outlineTransparentPositive
     */
    public var outlineOnDarkTransparentPositive: Color by
        colors.obtain("outlineOnDarkTransparentPositive")

    /**
     * light outline onDark outlineTransparentPositiveHover
     */
    public var outlineOnDarkTransparentPositiveHover: Color by
        colors.obtain("outlineOnDarkTransparentPositiveHover")

    /**
     * light outline onDark outlineTransparentPositiveActive
     */
    public var outlineOnDarkTransparentPositiveActive: Color by
        colors.obtain("outlineOnDarkTransparentPositiveActive")

    /**
     * light outline onDark outlineTransparentWarning
     */
    public var outlineOnDarkTransparentWarning: Color by
        colors.obtain("outlineOnDarkTransparentWarning")

    /**
     * light outline onDark outlineTransparentWarningHover
     */
    public var outlineOnDarkTransparentWarningHover: Color by
        colors.obtain("outlineOnDarkTransparentWarningHover")

    /**
     * light outline onDark outlineTransparentWarningActive
     */
    public var outlineOnDarkTransparentWarningActive: Color by
        colors.obtain("outlineOnDarkTransparentWarningActive")

    /**
     * light outline onDark outlineNegativeTransparent
     */
    public var outlineOnDarkNegativeTransparent: Color by
        colors.obtain("outlineOnDarkNegativeTransparent")

    /**
     * light outline onDark outlineNegativeTransparentHover
     */
    public var outlineOnDarkNegativeTransparentHover: Color by
        colors.obtain("outlineOnDarkNegativeTransparentHover")

    /**
     * light outline onDark outlineNegativeTransparentActive
     */
    public var outlineOnDarkNegativeTransparentActive: Color by
        colors.obtain("outlineOnDarkNegativeTransparentActive")

    /**
     * light outline onDark outlineTransparentInfoHover
     */
    public var outlineOnDarkTransparentInfoHover: Color by
        colors.obtain("outlineOnDarkTransparentInfoHover")

    /**
     * light outline onDark outlineTransparentInfoActive
     */
    public var outlineOnDarkTransparentInfoActive: Color by
        colors.obtain("outlineOnDarkTransparentInfoActive")

    /**
     * light outline onDark outlinePrimaryHover
     */
    public var outlineOnDarkPrimaryHover: Color by colors.obtain("outlineOnDarkPrimaryHover")

    /**
     * light outline onDark outlinePrimaryActive
     */
    public var outlineOnDarkPrimaryActive: Color by colors.obtain("outlineOnDarkPrimaryActive")

    /**
     * light outline onDark outlineInfo
     */
    public var outlineOnDarkInfo: Color by colors.obtain("outlineOnDarkInfo")

    /**
     * light outline onDark outlineInfoMinor
     */
    public var outlineOnDarkInfoMinor: Color by colors.obtain("outlineOnDarkInfoMinor")

    /**
     * light outline onDark outlineTransparentInfo
     */
    public var outlineOnDarkTransparentInfo: Color by colors.obtain("outlineOnDarkTransparentInfo")

    /**
     * light outline onDark outlineSolidPrimary
     */
    public var outlineOnDarkSolidPrimary: Color by colors.obtain("outlineOnDarkSolidPrimary")

    /**
     * light outline onDark outlineSolidPrimaryHover
     */
    public var outlineOnDarkSolidPrimaryHover: Color by
        colors.obtain("outlineOnDarkSolidPrimaryHover")

    /**
     * light outline onDark outlineSolidPrimaryActive
     */
    public var outlineOnDarkSolidPrimaryActive: Color by
        colors.obtain("outlineOnDarkSolidPrimaryActive")

    /**
     * light outline onDark outlineSolidSecondary
     */
    public var outlineOnDarkSolidSecondary: Color by colors.obtain("outlineOnDarkSolidSecondary")

    /**
     * light outline onDark outlineSolidSecondaryHover
     */
    public var outlineOnDarkSolidSecondaryHover: Color by
        colors.obtain("outlineOnDarkSolidSecondaryHover")

    /**
     * light outline onDark outlineSolidSecondaryActive
     */
    public var outlineOnDarkSolidSecondaryActive: Color by
        colors.obtain("outlineOnDarkSolidSecondaryActive")

    /**
     * light outline onDark outlineSolidTertiary
     */
    public var outlineOnDarkSolidTertiary: Color by colors.obtain("outlineOnDarkSolidTertiary")

    /**
     * light outline onDark outlineSolidTertiaryHover
     */
    public var outlineOnDarkSolidTertiaryHover: Color by
        colors.obtain("outlineOnDarkSolidTertiaryHover")

    /**
     * light outline onDark outlineSolidTertiaryActive
     */
    public var outlineOnDarkSolidTertiaryActive: Color by
        colors.obtain("outlineOnDarkSolidTertiaryActive")

    /**
     * light outline onDark outlineSolidDefault
     */
    public var outlineOnDarkSolidDefault: Color by colors.obtain("outlineOnDarkSolidDefault")

    /**
     * light outline onDark outlineSolidDefaultHover
     */
    public var outlineOnDarkSolidDefaultHover: Color by
        colors.obtain("outlineOnDarkSolidDefaultHover")

    /**
     * light outline onDark outlineSolidDefaultActive
     */
    public var outlineOnDarkSolidDefaultActive: Color by
        colors.obtain("outlineOnDarkSolidDefaultActive")

    /**
     * light outline onLight outlineSecondaryHover
     */
    public var outlineOnLightSecondaryHover: Color by colors.obtain("outlineOnLightSecondaryHover")

    /**
     * light outline onLight outlineSecondaryActive
     */
    public var outlineOnLightSecondaryActive: Color by
        colors.obtain("outlineOnLightSecondaryActive")

    /**
     * light outline onLight outlineTertiaryHover
     */
    public var outlineOnLightTertiaryHover: Color by colors.obtain("outlineOnLightTertiaryHover")

    /**
     * light outline onLight outlineTertiaryActive
     */
    public var outlineOnLightTertiaryActive: Color by colors.obtain("outlineOnLightTertiaryActive")

    /**
     * light outline onLight outlineDefaultHover
     */
    public var outlineOnLightDefaultHover: Color by colors.obtain("outlineOnLightDefaultHover")

    /**
     * light outline onLight outlineDefaultActive
     */
    public var outlineOnLightDefaultActive: Color by colors.obtain("outlineOnLightDefaultActive")

    /**
     * light outline onLight outlineTransparentPrimary
     */
    public var outlineOnLightTransparentPrimary: Color by
        colors.obtain("outlineOnLightTransparentPrimary")

    /**
     * light outline onLight outlineTransparentPrimaryHover
     */
    public var outlineOnLightTransparentPrimaryHover: Color by
        colors.obtain("outlineOnLightTransparentPrimaryHover")

    /**
     * light outline onLight outlineTransparentPrimaryActive
     */
    public var outlineOnLightTransparentPrimaryActive: Color by
        colors.obtain("outlineOnLightTransparentPrimaryActive")

    /**
     * light outline onLight outlineTransparentSecondary
     */
    public var outlineOnLightTransparentSecondary: Color by
        colors.obtain("outlineOnLightTransparentSecondary")

    /**
     * light outline onLight outlineTransparentSecondaryHover
     */
    public var outlineOnLightTransparentSecondaryHover: Color by
        colors.obtain("outlineOnLightTransparentSecondaryHover")

    /**
     * light outline onLight outlineTransparentSecondaryActive
     */
    public var outlineOnLightTransparentSecondaryActive: Color by
        colors.obtain("outlineOnLightTransparentSecondaryActive")

    /**
     * light outline onLight outlineTransparentTertiary
     */
    public var outlineOnLightTransparentTertiary: Color by
        colors.obtain("outlineOnLightTransparentTertiary")

    /**
     * light outline onLight outlineTransparentTertiaryHover
     */
    public var outlineOnLightTransparentTertiaryHover: Color by
        colors.obtain("outlineOnLightTransparentTertiaryHover")

    /**
     * light outline onLight outlineTransparentTertiaryActive
     */
    public var outlineOnLightTransparentTertiaryActive: Color by
        colors.obtain("outlineOnLightTransparentTertiaryActive")

    /**
     * light outline onLight outlineAccent
     */
    public var outlineOnLightAccent: Color by colors.obtain("outlineOnLightAccent")

    /**
     * light outline onLight outlineAccentHover
     */
    public var outlineOnLightAccentHover: Color by colors.obtain("outlineOnLightAccentHover")

    /**
     * light outline onLight outlineAccentActive
     */
    public var outlineOnLightAccentActive: Color by colors.obtain("outlineOnLightAccentActive")

    /**
     * light outline onLight outlineAccentMinor
     */
    public var outlineOnLightAccentMinor: Color by colors.obtain("outlineOnLightAccentMinor")

    /**
     * light outline onLight outlineAccentMinorHover
     */
    public var outlineOnLightAccentMinorHover: Color by
        colors.obtain("outlineOnLightAccentMinorHover")

    /**
     * light outline onLight outlineAccentMinorActive
     */
    public var outlineOnLightAccentMinorActive: Color by
        colors.obtain("outlineOnLightAccentMinorActive")

    /**
     * light outline onLight outlineTransparentAccent
     */
    public var outlineOnLightTransparentAccent: Color by
        colors.obtain("outlineOnLightTransparentAccent")

    /**
     * light outline onLight outlineTransparentAccentHover
     */
    public var outlineOnLightTransparentAccentHover: Color by
        colors.obtain("outlineOnLightTransparentAccentHover")

    /**
     * light outline onLight outlineTransparentAccentActive
     */
    public var outlineOnLightTransparentAccentActive: Color by
        colors.obtain("outlineOnLightTransparentAccentActive")

    /**
     * light outline onLight outlinePositive
     */
    public var outlineOnLightPositive: Color by colors.obtain("outlineOnLightPositive")

    /**
     * light outline onLight outlinePositiveHover
     */
    public var outlineOnLightPositiveHover: Color by colors.obtain("outlineOnLightPositiveHover")

    /**
     * light outline onLight outlinePositiveActive
     */
    public var outlineOnLightPositiveActive: Color by colors.obtain("outlineOnLightPositiveActive")

    /**
     * light outline onLight outlineWarning
     */
    public var outlineOnLightWarning: Color by colors.obtain("outlineOnLightWarning")

    /**
     * light outline onLight outlineWarningHover
     */
    public var outlineOnLightWarningHover: Color by colors.obtain("outlineOnLightWarningHover")

    /**
     * light outline onLight outlineWarningActive
     */
    public var outlineOnLightWarningActive: Color by colors.obtain("outlineOnLightWarningActive")

    /**
     * light outline onLight outlineNegative
     */
    public var outlineOnLightNegative: Color by colors.obtain("outlineOnLightNegative")

    /**
     * light outline onLight outlineNegativeHover
     */
    public var outlineOnLightNegativeHover: Color by colors.obtain("outlineOnLightNegativeHover")

    /**
     * light outline onLight outlineNegativeActive
     */
    public var outlineOnLightNegativeActive: Color by colors.obtain("outlineOnLightNegativeActive")

    /**
     * light outline onLight outlineInfoHover
     */
    public var outlineOnLightInfoHover: Color by colors.obtain("outlineOnLightInfoHover")

    /**
     * light outline onLight outlineInfoActive
     */
    public var outlineOnLightInfoActive: Color by colors.obtain("outlineOnLightInfoActive")

    /**
     * light outline onLight outlinePositiveMinor
     */
    public var outlineOnLightPositiveMinor: Color by colors.obtain("outlineOnLightPositiveMinor")

    /**
     * light outline onLight outlinePositiveMinorHover
     */
    public var outlineOnLightPositiveMinorHover: Color by
        colors.obtain("outlineOnLightPositiveMinorHover")

    /**
     * light outline onLight outlinePositiveMinorActive
     */
    public var outlineOnLightPositiveMinorActive: Color by
        colors.obtain("outlineOnLightPositiveMinorActive")

    /**
     * light outline onLight outlineWarningMinor
     */
    public var outlineOnLightWarningMinor: Color by colors.obtain("outlineOnLightWarningMinor")

    /**
     * light outline onLight outlineWarningMinorHover
     */
    public var outlineOnLightWarningMinorHover: Color by
        colors.obtain("outlineOnLightWarningMinorHover")

    /**
     * light outline onLight outlineWarningMinorActive
     */
    public var outlineOnLightWarningMinorActive: Color by
        colors.obtain("outlineOnLightWarningMinorActive")

    /**
     * light outline onLight outlineNegativeMinor
     */
    public var outlineOnLightNegativeMinor: Color by colors.obtain("outlineOnLightNegativeMinor")

    /**
     * light outline onLight outlineNegativeMinorHover
     */
    public var outlineOnLightNegativeMinorHover: Color by
        colors.obtain("outlineOnLightNegativeMinorHover")

    /**
     * light outline onLight outlineNegativeMinorActive
     */
    public var outlineOnLightNegativeMinorActive: Color by
        colors.obtain("outlineOnLightNegativeMinorActive")

    /**
     * light outline onLight outlineInfoMinorHover
     */
    public var outlineOnLightInfoMinorHover: Color by colors.obtain("outlineOnLightInfoMinorHover")

    /**
     * light outline onLight outlineInfoMinorActive
     */
    public var outlineOnLightInfoMinorActive: Color by
        colors.obtain("outlineOnLightInfoMinorActive")

    /**
     * light outline onLight outlineTransparentPositive
     */
    public var outlineOnLightTransparentPositive: Color by
        colors.obtain("outlineOnLightTransparentPositive")

    /**
     * light outline onLight outlineTransparentPositiveHover
     */
    public var outlineOnLightTransparentPositiveHover: Color by
        colors.obtain("outlineOnLightTransparentPositiveHover")

    /**
     * light outline onLight outlineTransparentPositiveActive
     */
    public var outlineOnLightTransparentPositiveActive: Color by
        colors.obtain("outlineOnLightTransparentPositiveActive")

    /**
     * light outline onLight outlineTransparentWarning
     */
    public var outlineOnLightTransparentWarning: Color by
        colors.obtain("outlineOnLightTransparentWarning")

    /**
     * light outline onLight outlineTransparentWarningHover
     */
    public var outlineOnLightTransparentWarningHover: Color by
        colors.obtain("outlineOnLightTransparentWarningHover")

    /**
     * light outline onLight outlineTransparentWarningActive
     */
    public var outlineOnLightTransparentWarningActive: Color by
        colors.obtain("outlineOnLightTransparentWarningActive")

    /**
     * light outline onLight outlineNegativeTransparent
     */
    public var outlineOnLightNegativeTransparent: Color by
        colors.obtain("outlineOnLightNegativeTransparent")

    /**
     * light outline onLight outlineNegativeTransparentHover
     */
    public var outlineOnLightNegativeTransparentHover: Color by
        colors.obtain("outlineOnLightNegativeTransparentHover")

    /**
     * light outline onLight outlineNegativeTransparentActive
     */
    public var outlineOnLightNegativeTransparentActive: Color by
        colors.obtain("outlineOnLightNegativeTransparentActive")

    /**
     * light outline onLight outlineTransparentInfoHover
     */
    public var outlineOnLightTransparentInfoHover: Color by
        colors.obtain("outlineOnLightTransparentInfoHover")

    /**
     * light outline onLight outlineTransparentInfoActive
     */
    public var outlineOnLightTransparentInfoActive: Color by
        colors.obtain("outlineOnLightTransparentInfoActive")

    /**
     * light outline onLight outlinePrimaryHover
     */
    public var outlineOnLightPrimaryHover: Color by colors.obtain("outlineOnLightPrimaryHover")

    /**
     * light outline onLight outlinePrimaryActive
     */
    public var outlineOnLightPrimaryActive: Color by colors.obtain("outlineOnLightPrimaryActive")

    /**
     * light outline onLight outlineInfo
     */
    public var outlineOnLightInfo: Color by colors.obtain("outlineOnLightInfo")

    /**
     * light outline onLight outlineInfoMinor
     */
    public var outlineOnLightInfoMinor: Color by colors.obtain("outlineOnLightInfoMinor")

    /**
     * light outline onLight outlineTransparentInfo
     */
    public var outlineOnLightTransparentInfo: Color by
        colors.obtain("outlineOnLightTransparentInfo")

    /**
     * light outline onLight outlineSolidTertiaryHover
     */
    public var outlineOnLightSolidTertiaryHover: Color by
        colors.obtain("outlineOnLightSolidTertiaryHover")

    /**
     * light outline onLight outlineSolidTertiaryActive
     */
    public var outlineOnLightSolidTertiaryActive: Color by
        colors.obtain("outlineOnLightSolidTertiaryActive")

    /**
     * light outline onLight outlineSolidDefaultHover
     */
    public var outlineOnLightSolidDefaultHover: Color by
        colors.obtain("outlineOnLightSolidDefaultHover")

    /**
     * light outline onLight outlineSolidDefaultActive
     */
    public var outlineOnLightSolidDefaultActive: Color by
        colors.obtain("outlineOnLightSolidDefaultActive")

    /**
     * light outline onLight outlineSolidPrimaryHover
     */
    public var outlineOnLightSolidPrimaryHover: Color by
        colors.obtain("outlineOnLightSolidPrimaryHover")

    /**
     * light outline onLight outlineSolidPrimaryActive
     */
    public var outlineOnLightSolidPrimaryActive: Color by
        colors.obtain("outlineOnLightSolidPrimaryActive")

    /**
     * light outline onLight outlineSolidSecondaryHover
     */
    public var outlineOnLightSolidSecondaryHover: Color by
        colors.obtain("outlineOnLightSolidSecondaryHover")

    /**
     * light outline onLight outlineSolidSecondaryActive
     */
    public var outlineOnLightSolidSecondaryActive: Color by
        colors.obtain("outlineOnLightSolidSecondaryActive")

    /**
     * light outline onLight outlineSolidPrimary
     */
    public var outlineOnLightSolidPrimary: Color by colors.obtain("outlineOnLightSolidPrimary")

    /**
     * light outline onLight outlineSolidSecondary
     */
    public var outlineOnLightSolidSecondary: Color by colors.obtain("outlineOnLightSolidSecondary")

    /**
     * light outline onLight outlineSolidTertiary
     */
    public var outlineOnLightSolidTertiary: Color by colors.obtain("outlineOnLightSolidTertiary")

    /**
     * light outline onLight outlineSolidDefault
     */
    public var outlineOnLightSolidDefault: Color by colors.obtain("outlineOnLightSolidDefault")

    /**
     * light outline inverse outlinePrimaryHover
     */
    public var outlineInversePrimaryHover: Color by colors.obtain("outlineInversePrimaryHover")

    /**
     * light outline inverse outlinePrimaryActive
     */
    public var outlineInversePrimaryActive: Color by colors.obtain("outlineInversePrimaryActive")

    /**
     * light outline inverse outlineSecondaryHover
     */
    public var outlineInverseSecondaryHover: Color by colors.obtain("outlineInverseSecondaryHover")

    /**
     * light outline inverse outlineSecondaryActive
     */
    public var outlineInverseSecondaryActive: Color by
        colors.obtain("outlineInverseSecondaryActive")

    /**
     * light outline inverse outlineTertiaryHover
     */
    public var outlineInverseTertiaryHover: Color by colors.obtain("outlineInverseTertiaryHover")

    /**
     * light outline inverse outlineTertiaryActive
     */
    public var outlineInverseTertiaryActive: Color by colors.obtain("outlineInverseTertiaryActive")

    /**
     * light outline inverse outlineDefaultHover
     */
    public var outlineInverseDefaultHover: Color by colors.obtain("outlineInverseDefaultHover")

    /**
     * light outline inverse outlineDefaultActive
     */
    public var outlineInverseDefaultActive: Color by colors.obtain("outlineInverseDefaultActive")

    /**
     * light outline inverse outlineTransparentPrimaryHover
     */
    public var outlineInverseTransparentPrimaryHover: Color by
        colors.obtain("outlineInverseTransparentPrimaryHover")

    /**
     * light outline inverse outlineTransparentPrimaryActive
     */
    public var outlineInverseTransparentPrimaryActive: Color by
        colors.obtain("outlineInverseTransparentPrimaryActive")

    /**
     * light outline inverse outlineTransparentSecondaryHover
     */
    public var outlineInverseTransparentSecondaryHover: Color by
        colors.obtain("outlineInverseTransparentSecondaryHover")

    /**
     * light outline inverse outlineTransparentSecondaryActive
     */
    public var outlineInverseTransparentSecondaryActive: Color by
        colors.obtain("outlineInverseTransparentSecondaryActive")

    /**
     * light outline inverse outlineTransparentTertiaryHover
     */
    public var outlineInverseTransparentTertiaryHover: Color by
        colors.obtain("outlineInverseTransparentTertiaryHover")

    /**
     * light outline inverse outlineTransparentTertiaryActive
     */
    public var outlineInverseTransparentTertiaryActive: Color by
        colors.obtain("outlineInverseTransparentTertiaryActive")

    /**
     * light outline inverse outlineTransparentClearHover
     */
    public var outlineInverseTransparentClearHover: Color by
        colors.obtain("outlineInverseTransparentClearHover")

    /**
     * light outline inverse outlineTransparentClearActive
     */
    public var outlineInverseTransparentClearActive: Color by
        colors.obtain("outlineInverseTransparentClearActive")

    /**
     * light outline inverse outlineAccentHover
     */
    public var outlineInverseAccentHover: Color by colors.obtain("outlineInverseAccentHover")

    /**
     * light outline inverse outlineAccentActive
     */
    public var outlineInverseAccentActive: Color by colors.obtain("outlineInverseAccentActive")

    /**
     * light outline inverse outlineAccentMinorHover
     */
    public var outlineInverseAccentMinorHover: Color by
        colors.obtain("outlineInverseAccentMinorHover")

    /**
     * light outline inverse outlineAccentMinorActive
     */
    public var outlineInverseAccentMinorActive: Color by
        colors.obtain("outlineInverseAccentMinorActive")

    /**
     * light outline inverse outlineTransparentAccentHover
     */
    public var outlineInverseTransparentAccentHover: Color by
        colors.obtain("outlineInverseTransparentAccentHover")

    /**
     * light outline inverse outlineTransparentAccentActive
     */
    public var outlineInverseTransparentAccentActive: Color by
        colors.obtain("outlineInverseTransparentAccentActive")

    /**
     * light outline inverse outlinePositiveHover
     */
    public var outlineInversePositiveHover: Color by colors.obtain("outlineInversePositiveHover")

    /**
     * light outline inverse outlinePositiveActive
     */
    public var outlineInversePositiveActive: Color by colors.obtain("outlineInversePositiveActive")

    /**
     * light outline inverse outlineWarningHover
     */
    public var outlineInverseWarningHover: Color by colors.obtain("outlineInverseWarningHover")

    /**
     * light outline inverse outlineWarningActive
     */
    public var outlineInverseWarningActive: Color by colors.obtain("outlineInverseWarningActive")

    /**
     * light outline inverse outlineNegativeHover
     */
    public var outlineInverseNegativeHover: Color by colors.obtain("outlineInverseNegativeHover")

    /**
     * light outline inverse outlineNegativeActive
     */
    public var outlineInverseNegativeActive: Color by colors.obtain("outlineInverseNegativeActive")

    /**
     * light outline inverse outlineInfoHover
     */
    public var outlineInverseInfoHover: Color by colors.obtain("outlineInverseInfoHover")

    /**
     * light outline inverse outlineInfoActive
     */
    public var outlineInverseInfoActive: Color by colors.obtain("outlineInverseInfoActive")

    /**
     * light outline inverse outlinePositiveMinorHover
     */
    public var outlineInversePositiveMinorHover: Color by
        colors.obtain("outlineInversePositiveMinorHover")

    /**
     * light outline inverse outlinePositiveMinorActive
     */
    public var outlineInversePositiveMinorActive: Color by
        colors.obtain("outlineInversePositiveMinorActive")

    /**
     * light outline inverse outlineWarningMinorHover
     */
    public var outlineInverseWarningMinorHover: Color by
        colors.obtain("outlineInverseWarningMinorHover")

    /**
     * light outline inverse outlineWarningMinorActive
     */
    public var outlineInverseWarningMinorActive: Color by
        colors.obtain("outlineInverseWarningMinorActive")

    /**
     * light outline inverse outlineNegativeMinorHover
     */
    public var outlineInverseNegativeMinorHover: Color by
        colors.obtain("outlineInverseNegativeMinorHover")

    /**
     * light outline inverse outlineNegativeMinorActive
     */
    public var outlineInverseNegativeMinorActive: Color by
        colors.obtain("outlineInverseNegativeMinorActive")

    /**
     * light outline inverse outlineInfoMinorHover
     */
    public var outlineInverseInfoMinorHover: Color by colors.obtain("outlineInverseInfoMinorHover")

    /**
     * light outline inverse outlineInfoMinorActive
     */
    public var outlineInverseInfoMinorActive: Color by
        colors.obtain("outlineInverseInfoMinorActive")

    /**
     * light outline inverse outlineTransparentPositiveHover
     */
    public var outlineInverseTransparentPositiveHover: Color by
        colors.obtain("outlineInverseTransparentPositiveHover")

    /**
     * light outline inverse outlineTransparentPositiveActive
     */
    public var outlineInverseTransparentPositiveActive: Color by
        colors.obtain("outlineInverseTransparentPositiveActive")

    /**
     * light outline inverse outlineTransparentWarningHover
     */
    public var outlineInverseTransparentWarningHover: Color by
        colors.obtain("outlineInverseTransparentWarningHover")

    /**
     * light outline inverse outlineTransparentWarningActive
     */
    public var outlineInverseTransparentWarningActive: Color by
        colors.obtain("outlineInverseTransparentWarningActive")

    /**
     * light outline inverse outlineTransparentNegativeHover
     */
    public var outlineInverseTransparentNegativeHover: Color by
        colors.obtain("outlineInverseTransparentNegativeHover")

    /**
     * light outline inverse outlineTransparentNegativeActive
     */
    public var outlineInverseTransparentNegativeActive: Color by
        colors.obtain("outlineInverseTransparentNegativeActive")

    /**
     * light outline inverse outlineTransparentInfoHover
     */
    public var outlineInverseTransparentInfoHover: Color by
        colors.obtain("outlineInverseTransparentInfoHover")

    /**
     * light outline inverse outlineTransparentInfoActive
     */
    public var outlineInverseTransparentInfoActive: Color by
        colors.obtain("outlineInverseTransparentInfoActive")

    /**
     * light outline inverse outlineTransparentPrimary
     */
    public var outlineInverseTransparentPrimary: Color by
        colors.obtain("outlineInverseTransparentPrimary")

    /**
     * light outline inverse outlineTransparentSecondary
     */
    public var outlineInverseTransparentSecondary: Color by
        colors.obtain("outlineInverseTransparentSecondary")

    /**
     * light outline inverse outlineTransparentTertiary
     */
    public var outlineInverseTransparentTertiary: Color by
        colors.obtain("outlineInverseTransparentTertiary")

    /**
     * light outline inverse outlineTransparentClear
     */
    public var outlineInverseTransparentClear: Color by
        colors.obtain("outlineInverseTransparentClear")

    /**
     * light outline inverse outlineAccent
     */
    public var outlineInverseAccent: Color by colors.obtain("outlineInverseAccent")

    /**
     * light outline inverse outlineAccentMinor
     */
    public var outlineInverseAccentMinor: Color by colors.obtain("outlineInverseAccentMinor")

    /**
     * light outline inverse outlineTransparentAccent
     */
    public var outlineInverseTransparentAccent: Color by
        colors.obtain("outlineInverseTransparentAccent")

    /**
     * light outline inverse outlinePositive
     */
    public var outlineInversePositive: Color by colors.obtain("outlineInversePositive")

    /**
     * light outline inverse outlineWarning
     */
    public var outlineInverseWarning: Color by colors.obtain("outlineInverseWarning")

    /**
     * light outline inverse outlineNegative
     */
    public var outlineInverseNegative: Color by colors.obtain("outlineInverseNegative")

    /**
     * light outline inverse outlineInfo
     */
    public var outlineInverseInfo: Color by colors.obtain("outlineInverseInfo")

    /**
     * light outline inverse outlinePositiveMinor
     */
    public var outlineInversePositiveMinor: Color by colors.obtain("outlineInversePositiveMinor")

    /**
     * light outline inverse outlineWarningMinor
     */
    public var outlineInverseWarningMinor: Color by colors.obtain("outlineInverseWarningMinor")

    /**
     * light outline inverse outlineNegativeMinor
     */
    public var outlineInverseNegativeMinor: Color by colors.obtain("outlineInverseNegativeMinor")

    /**
     * light outline inverse outlineInfoMinor
     */
    public var outlineInverseInfoMinor: Color by colors.obtain("outlineInverseInfoMinor")

    /**
     * light outline inverse outlineTransparentPositive
     */
    public var outlineInverseTransparentPositive: Color by
        colors.obtain("outlineInverseTransparentPositive")

    /**
     * light outline inverse outlineTransparentWarning
     */
    public var outlineInverseTransparentWarning: Color by
        colors.obtain("outlineInverseTransparentWarning")

    /**
     * light outline inverse outlineTransparentNegative
     */
    public var outlineInverseTransparentNegative: Color by
        colors.obtain("outlineInverseTransparentNegative")

    /**
     * light outline inverse outlineTransparentInfo
     */
    public var outlineInverseTransparentInfo: Color by
        colors.obtain("outlineInverseTransparentInfo")

    /**
     * light outline inverse outlineSolidPrimaryHover
     */
    public var outlineInverseSolidPrimaryHover: Color by
        colors.obtain("outlineInverseSolidPrimaryHover")

    /**
     * light outline inverse outlineSolidPrimaryActive
     */
    public var outlineInverseSolidPrimaryActive: Color by
        colors.obtain("outlineInverseSolidPrimaryActive")

    /**
     * light outline inverse outlineSolidSecondaryHover
     */
    public var outlineInverseSolidSecondaryHover: Color by
        colors.obtain("outlineInverseSolidSecondaryHover")

    /**
     * light outline inverse outlineSolidSecondaryActive
     */
    public var outlineInverseSolidSecondaryActive: Color by
        colors.obtain("outlineInverseSolidSecondaryActive")

    /**
     * light outline inverse outlineSolidTertiaryHover
     */
    public var outlineInverseSolidTertiaryHover: Color by
        colors.obtain("outlineInverseSolidTertiaryHover")

    /**
     * light outline inverse outlineSolidTertiaryActive
     */
    public var outlineInverseSolidTertiaryActive: Color by
        colors.obtain("outlineInverseSolidTertiaryActive")

    /**
     * light outline inverse outlineSolidDefaultHover
     */
    public var outlineInverseSolidDefaultHover: Color by
        colors.obtain("outlineInverseSolidDefaultHover")

    /**
     * light outline inverse outlineSolidDefaultActive
     */
    public var outlineInverseSolidDefaultActive: Color by
        colors.obtain("outlineInverseSolidDefaultActive")

    /**
     * light outline inverse outlineSolidPrimary
     */
    public var outlineInverseSolidPrimary: Color by colors.obtain("outlineInverseSolidPrimary")

    /**
     * light outline inverse outlineSolidSecondary
     */
    public var outlineInverseSolidSecondary: Color by colors.obtain("outlineInverseSolidSecondary")

    /**
     * light outline inverse outlineSolidTertiary
     */
    public var outlineInverseSolidTertiary: Color by colors.obtain("outlineInverseSolidTertiary")

    /**
     * light outline inverse outlineSolidDefault
     */
    public var outlineInverseSolidDefault: Color by colors.obtain("outlineInverseSolidDefault")

    /**
     * Желтый цвет для данных
     */
    public var dataDefaultYellow: Color by colors.obtain("dataDefaultYellow")

    /**
     * Желтый цвет для данных
     */
    public var dataDefaultYellowHover: Color by colors.obtain("dataDefaultYellowHover")

    /**
     * Желтый цвет для данных
     */
    public var dataDefaultYellowActive: Color by colors.obtain("dataDefaultYellowActive")

    /**
     * Минорный желтый цвет для данных
     */
    public var dataDefaultYellowMinor: Color by colors.obtain("dataDefaultYellowMinor")

    /**
     * Минорный желтый цвет для данных
     */
    public var dataDefaultYellowMinorHover: Color by colors.obtain("dataDefaultYellowMinorHover")

    /**
     * Минорный желтый цвет для данных
     */
    public var dataDefaultYellowMinorActive: Color by colors.obtain("dataDefaultYellowMinorActive")

    /**
     * Прозрачный желтый цвет для данных
     */
    public var dataDefaultYellowTransparent: Color by colors.obtain("dataDefaultYellowTransparent")

    /**
     * Прозрачный желтый цвет для данных
     */
    public var dataDefaultYellowTransparentHover: Color by
        colors.obtain("dataDefaultYellowTransparentHover")

    /**
     * Прозрачный желтый цвет для данных
     */
    public var dataDefaultYellowTransparentActive: Color by
        colors.obtain("dataDefaultYellowTransparentActive")

    /**
     * Желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellow: Color by colors.obtain("dataOnDarkYellow")

    /**
     * Желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowHover: Color by colors.obtain("dataOnDarkYellowHover")

    /**
     * Желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowActive: Color by colors.obtain("dataOnDarkYellowActive")

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowMinor: Color by colors.obtain("dataOnDarkYellowMinor")

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowMinorHover: Color by colors.obtain("dataOnDarkYellowMinorHover")

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowMinorActive: Color by colors.obtain("dataOnDarkYellowMinorActive")

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowTransparent: Color by colors.obtain("dataOnDarkYellowTransparent")

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowTransparentHover: Color by
        colors.obtain("dataOnDarkYellowTransparentHover")

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public var dataOnDarkYellowTransparentActive: Color by
        colors.obtain("dataOnDarkYellowTransparentActive")

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellow: Color by colors.obtain("dataOnLightYellow")

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowHover: Color by colors.obtain("dataOnLightYellowHover")

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowActive: Color by colors.obtain("dataOnLightYellowActive")

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowMinor: Color by colors.obtain("dataOnLightYellowMinor")

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowMinorHover: Color by colors.obtain("dataOnLightYellowMinorHover")

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowMinorActive: Color by colors.obtain("dataOnLightYellowMinorActive")

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowTransparent: Color by colors.obtain("dataOnLightYellowTransparent")

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowTransparentHover: Color by
        colors.obtain("dataOnLightYellowTransparentHover")

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public var dataOnLightYellowTransparentActive: Color by
        colors.obtain("dataOnLightYellowTransparentActive")

    /**
     * Инвертированный желтый цвет для данных
     */
    public var dataInverseYellow: Color by colors.obtain("dataInverseYellow")

    /**
     * Инвертированный желтый цвет для данных
     */
    public var dataInverseYellowHover: Color by colors.obtain("dataInverseYellowHover")

    /**
     * Инвертированный желтый цвет для данных
     */
    public var dataInverseYellowActive: Color by colors.obtain("dataInverseYellowActive")

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public var dataInverseYellowMinor: Color by colors.obtain("dataInverseYellowMinor")

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public var dataInverseYellowMinorHover: Color by colors.obtain("dataInverseYellowMinorHover")

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public var dataInverseYellowMinorActive: Color by colors.obtain("dataInverseYellowMinorActive")

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public var dataInverseYellowTransparent: Color by colors.obtain("dataInverseYellowTransparent")

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public var dataInverseYellowTransparentHover: Color by
        colors.obtain("dataInverseYellowTransparentHover")

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public var dataInverseYellowTransparentActive: Color by
        colors.obtain("dataInverseYellowTransparentActive")

    /**
     * Возвращает копию [PlasmaSdServiceColors]. Предоставляет возможность переопределять цвета.
     */
    public fun copy(overrideColors: ColorOverrideScope.() -> Unit = {}): PlasmaSdServiceColors {
        val colorOverrideScope = ColorOverrideScope()
        overrideColors.invoke(colorOverrideScope)
        val overrideMap = colorOverrideScope.overrideMap
        return PlasmaSdServiceColors(colors.mapValues { overrideMap[it.key] ?: it.value })
    }
}

/**
 * Скоуп переопределения цветов
 */
public class ColorOverrideScope {
    private val _overrideMap: MutableMap<String, Color> = mutableMapOf()

    internal val overrideMap: Map<String, Color>
        get() = _overrideMap.toMap()

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimary: String = "textDefaultPrimary"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightness: String = "textDefaultPrimaryBrightness"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondary: String = "textDefaultSecondary"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiary: String = "textDefaultTertiary"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraph: String = "textDefaultParagraph"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccent: String = "textDefaultAccent"

    /**
     * Цвет успеха
     */
    public val textDefaultPositive: String = "textDefaultPositive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarning: String = "textDefaultWarning"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegative: String = "textDefaultNegative"

    /**
     * light text default textAccentMinorHover
     */
    public val textDefaultAccentMinorHover: String = "textDefaultAccentMinorHover"

    /**
     * light text default textAccentMinorActive
     */
    public val textDefaultAccentMinorActive: String = "textDefaultAccentMinorActive"

    /**
     * light text default textInfoHover
     */
    public val textDefaultInfoHover: String = "textDefaultInfoHover"

    /**
     * light text default textInfoActive
     */
    public val textDefaultInfoActive: String = "textDefaultInfoActive"

    /**
     * light text default textPositiveMinorHover
     */
    public val textDefaultPositiveMinorHover: String = "textDefaultPositiveMinorHover"

    /**
     * light text default textPositiveMinorActive
     */
    public val textDefaultPositiveMinorActive: String = "textDefaultPositiveMinorActive"

    /**
     * light text default textWarningMinorHover
     */
    public val textDefaultWarningMinorHover: String = "textDefaultWarningMinorHover"

    /**
     * light text default textWarningMinorActive
     */
    public val textDefaultWarningMinorActive: String = "textDefaultWarningMinorActive"

    /**
     * light text default textNegativeMinorHover
     */
    public val textDefaultNegativeMinorHover: String = "textDefaultNegativeMinorHover"

    /**
     * light text default textNegativeMinorActive
     */
    public val textDefaultNegativeMinorActive: String = "textDefaultNegativeMinorActive"

    /**
     * light text default textInfoMinorHover
     */
    public val textDefaultInfoMinorHover: String = "textDefaultInfoMinorHover"

    /**
     * light text default textInfoMinorActive
     */
    public val textDefaultInfoMinorActive: String = "textDefaultInfoMinorActive"

    /**
     * light text default textAccentMinor
     */
    public val textDefaultAccentMinor: String = "textDefaultAccentMinor"

    /**
     * light text default textPositiveMinor
     */
    public val textDefaultPositiveMinor: String = "textDefaultPositiveMinor"

    /**
     * light text default textWarningMinor
     */
    public val textDefaultWarningMinor: String = "textDefaultWarningMinor"

    /**
     * light text default textNegativeMinor
     */
    public val textDefaultNegativeMinor: String = "textDefaultNegativeMinor"

    /**
     * light text default textInfo
     */
    public val textDefaultInfo: String = "textDefaultInfo"

    /**
     * light text default textInfoMinor
     */
    public val textDefaultInfoMinor: String = "textDefaultInfoMinor"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryHover: String = "textDefaultPrimaryHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryActive: String = "textDefaultPrimaryActive"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryHover: String = "textDefaultSecondaryHover"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryActive: String = "textDefaultSecondaryActive"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryHover: String = "textDefaultTertiaryHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryActive: String = "textDefaultTertiaryActive"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphHover: String = "textDefaultParagraphHover"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphActive: String = "textDefaultParagraphActive"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentHover: String = "textDefaultAccentHover"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentActive: String = "textDefaultAccentActive"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveHover: String = "textDefaultPositiveHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveActive: String = "textDefaultPositiveActive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningHover: String = "textDefaultWarningHover"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningActive: String = "textDefaultWarningActive"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeHover: String = "textDefaultNegativeHover"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeActive: String = "textDefaultNegativeActive"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimary: String = "textOnDarkPrimary"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightness: String = "textOnDarkPrimaryBrightness"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondary: String = "textOnDarkSecondary"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiary: String = "textOnDarkTertiary"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraph: String = "textOnDarkParagraph"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccent: String = "textOnDarkAccent"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositive: String = "textOnDarkPositive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarning: String = "textOnDarkWarning"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegative: String = "textOnDarkNegative"

    /**
     * light text onDark textAccentMinor
     */
    public val textOnDarkAccentMinor: String = "textOnDarkAccentMinor"

    /**
     * light text onDark textAccentMinorHover
     */
    public val textOnDarkAccentMinorHover: String = "textOnDarkAccentMinorHover"

    /**
     * light text onDark textAccentMinorActive
     */
    public val textOnDarkAccentMinorActive: String = "textOnDarkAccentMinorActive"

    /**
     * light text onDark textInfoHover
     */
    public val textOnDarkInfoHover: String = "textOnDarkInfoHover"

    /**
     * light text onDark textInfoActive
     */
    public val textOnDarkInfoActive: String = "textOnDarkInfoActive"

    /**
     * light text onDark textPositiveMinor
     */
    public val textOnDarkPositiveMinor: String = "textOnDarkPositiveMinor"

    /**
     * light text onDark textPositiveMinorHover
     */
    public val textOnDarkPositiveMinorHover: String = "textOnDarkPositiveMinorHover"

    /**
     * light text onDark textPositiveMinorActive
     */
    public val textOnDarkPositiveMinorActive: String = "textOnDarkPositiveMinorActive"

    /**
     * light text onDark textWarningMinor
     */
    public val textOnDarkWarningMinor: String = "textOnDarkWarningMinor"

    /**
     * light text onDark textWarningMinorHover
     */
    public val textOnDarkWarningMinorHover: String = "textOnDarkWarningMinorHover"

    /**
     * light text onDark textWarningMinorActive
     */
    public val textOnDarkWarningMinorActive: String = "textOnDarkWarningMinorActive"

    /**
     * light text onDark textNegativeMinor
     */
    public val textOnDarkNegativeMinor: String = "textOnDarkNegativeMinor"

    /**
     * light text onDark textNegativeMinorHover
     */
    public val textOnDarkNegativeMinorHover: String = "textOnDarkNegativeMinorHover"

    /**
     * light text onDark textNegativeMinorActive
     */
    public val textOnDarkNegativeMinorActive: String = "textOnDarkNegativeMinorActive"

    /**
     * light text onDark textInfoMinorHover
     */
    public val textOnDarkInfoMinorHover: String = "textOnDarkInfoMinorHover"

    /**
     * light text onDark textInfoMinorActive
     */
    public val textOnDarkInfoMinorActive: String = "textOnDarkInfoMinorActive"

    /**
     * light text onDark textInfoMinor
     */
    public val textOnDarkInfoMinor: String = "textOnDarkInfoMinor"

    /**
     * light text onDark textInfo
     */
    public val textOnDarkInfo: String = "textOnDarkInfo"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryHover: String = "textOnDarkPrimaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryActive: String = "textOnDarkPrimaryActive"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryHover: String = "textOnDarkSecondaryHover"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryActive: String = "textOnDarkSecondaryActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryHover: String = "textOnDarkTertiaryHover"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryActive: String = "textOnDarkTertiaryActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphHover: String = "textOnDarkParagraphHover"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphActive: String = "textOnDarkParagraphActive"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentHover: String = "textOnDarkAccentHover"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentActive: String = "textOnDarkAccentActive"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveHover: String = "textOnDarkPositiveHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveActive: String = "textOnDarkPositiveActive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningHover: String = "textOnDarkWarningHover"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningActive: String = "textOnDarkWarningActive"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeHover: String = "textOnDarkNegativeHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeActive: String = "textOnDarkNegativeActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimary: String = "textOnLightPrimary"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightness: String = "textOnLightPrimaryBrightness"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondary: String = "textOnLightSecondary"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiary: String = "textOnLightTertiary"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraph: String = "textOnLightParagraph"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccent: String = "textOnLightAccent"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositive: String = "textOnLightPositive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarning: String = "textOnLightWarning"

    /**
     * light text onLight textAccentMinor
     */
    public val textOnLightAccentMinor: String = "textOnLightAccentMinor"

    /**
     * light text onLight textAccentMinorHover
     */
    public val textOnLightAccentMinorHover: String = "textOnLightAccentMinorHover"

    /**
     * light text onLight textAccentMinorActive
     */
    public val textOnLightAccentMinorActive: String = "textOnLightAccentMinorActive"

    /**
     * light text onLight textInfoHover
     */
    public val textOnLightInfoHover: String = "textOnLightInfoHover"

    /**
     * light text onLight textInfoActive
     */
    public val textOnLightInfoActive: String = "textOnLightInfoActive"

    /**
     * light text onLight textPositiveMinor
     */
    public val textOnLightPositiveMinor: String = "textOnLightPositiveMinor"

    /**
     * light text onLight textPositiveMinorHover
     */
    public val textOnLightPositiveMinorHover: String = "textOnLightPositiveMinorHover"

    /**
     * light text onLight textPositiveMinorActive
     */
    public val textOnLightPositiveMinorActive: String = "textOnLightPositiveMinorActive"

    /**
     * light text onLight textWarningMinor
     */
    public val textOnLightWarningMinor: String = "textOnLightWarningMinor"

    /**
     * light text onLight textWarningMinorHover
     */
    public val textOnLightWarningMinorHover: String = "textOnLightWarningMinorHover"

    /**
     * light text onLight textWarningMinorActive
     */
    public val textOnLightWarningMinorActive: String = "textOnLightWarningMinorActive"

    /**
     * light text onLight textNegativeMinor
     */
    public val textOnLightNegativeMinor: String = "textOnLightNegativeMinor"

    /**
     * light text onLight textNegativeMinorHover
     */
    public val textOnLightNegativeMinorHover: String = "textOnLightNegativeMinorHover"

    /**
     * light text onLight textNegativeMinorActive
     */
    public val textOnLightNegativeMinorActive: String = "textOnLightNegativeMinorActive"

    /**
     * light text onLight textInfoMinorHover
     */
    public val textOnLightInfoMinorHover: String = "textOnLightInfoMinorHover"

    /**
     * light text onLight textInfoMinorActive
     */
    public val textOnLightInfoMinorActive: String = "textOnLightInfoMinorActive"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegative: String = "textOnLightNegative"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeHover: String = "textOnLightNegativeHover"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeActive: String = "textOnLightNegativeActive"

    /**
     * light text onLight textInfo
     */
    public val textOnLightInfo: String = "textOnLightInfo"

    /**
     * light text onLight textInfoMinor
     */
    public val textOnLightInfoMinor: String = "textOnLightInfoMinor"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryHover: String = "textOnLightPrimaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryActive: String = "textOnLightPrimaryActive"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryHover: String = "textOnLightSecondaryHover"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryActive: String = "textOnLightSecondaryActive"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryHover: String = "textOnLightTertiaryHover"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryActive: String = "textOnLightTertiaryActive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphHover: String = "textOnLightParagraphHover"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphActive: String = "textOnLightParagraphActive"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentHover: String = "textOnLightAccentHover"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentActive: String = "textOnLightAccentActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveHover: String = "textOnLightPositiveHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveActive: String = "textOnLightPositiveActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningHover: String = "textOnLightWarningHover"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningActive: String = "textOnLightWarningActive"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimary: String = "textInversePrimary"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightness: String = "textInversePrimaryBrightness"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondary: String = "textInverseSecondary"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiary: String = "textInverseTertiary"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraph: String = "textInverseParagraph"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositive: String = "textInversePositive"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarning: String = "textInverseWarning"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegative: String = "textInverseNegative"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryHover: String = "textInversePrimaryHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryActive: String = "textInversePrimaryActive"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryHover: String = "textInverseSecondaryHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryActive: String = "textInverseSecondaryActive"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryHover: String = "textInverseTertiaryHover"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryActive: String = "textInverseTertiaryActive"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraphHover: String = "textInverseParagraphHover"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraphActive: String = "textInverseParagraphActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentHover: String = "textInverseAccentHover"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentActive: String = "textInverseAccentActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveHover: String = "textInversePositiveHover"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveActive: String = "textInversePositiveActive"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningHover: String = "textInverseWarningHover"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningActive: String = "textInverseWarningActive"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeHover: String = "textInverseNegativeHover"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeActive: String = "textInverseNegativeActive"

    /**
     * light text inverse textAccentMinor
     */
    public val textInverseAccentMinor: String = "textInverseAccentMinor"

    /**
     * light text inverse textAccentMinorHover
     */
    public val textInverseAccentMinorHover: String = "textInverseAccentMinorHover"

    /**
     * light text inverse textAccentMinorActive
     */
    public val textInverseAccentMinorActive: String = "textInverseAccentMinorActive"

    /**
     * light text inverse textInfoHover
     */
    public val textInverseInfoHover: String = "textInverseInfoHover"

    /**
     * light text inverse textInfoActive
     */
    public val textInverseInfoActive: String = "textInverseInfoActive"

    /**
     * light text inverse textPositiveMinorHover
     */
    public val textInversePositiveMinorHover: String = "textInversePositiveMinorHover"

    /**
     * light text inverse textPositiveMinorActive
     */
    public val textInversePositiveMinorActive: String = "textInversePositiveMinorActive"

    /**
     * light text inverse textWarningMinorHover
     */
    public val textInverseWarningMinorHover: String = "textInverseWarningMinorHover"

    /**
     * light text inverse textWarningMinorActive
     */
    public val textInverseWarningMinorActive: String = "textInverseWarningMinorActive"

    /**
     * light text inverse textNegativeMinorHover
     */
    public val textInverseNegativeMinorHover: String = "textInverseNegativeMinorHover"

    /**
     * light text inverse textNegativeMinorActive
     */
    public val textInverseNegativeMinorActive: String = "textInverseNegativeMinorActive"

    /**
     * light text inverse textInfoMinorHover
     */
    public val textInverseInfoMinorHover: String = "textInverseInfoMinorHover"

    /**
     * light text inverse textInfoMinorActive
     */
    public val textInverseInfoMinorActive: String = "textInverseInfoMinorActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccent: String = "textInverseAccent"

    /**
     * light text inverse textInfo
     */
    public val textInverseInfo: String = "textInverseInfo"

    /**
     * light text inverse textPositiveMinor
     */
    public val textInversePositiveMinor: String = "textInversePositiveMinor"

    /**
     * light text inverse textWarningMinor
     */
    public val textInverseWarningMinor: String = "textInverseWarningMinor"

    /**
     * light text inverse textNegativeMinor
     */
    public val textInverseNegativeMinor: String = "textInverseNegativeMinor"

    /**
     * light text inverse textInfoMinor
     */
    public val textInverseInfoMinor: String = "textInverseInfoMinor"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefault: String = "surfaceDefaultSolidDefault"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimary: String = "surfaceDefaultSolidPrimary"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightness: String = "surfaceDefaultSolidPrimaryBrightness"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondary: String = "surfaceDefaultSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiary: String = "surfaceDefaultSolidTertiary"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCard: String = "surfaceDefaultSolidCard"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightness: String = "surfaceDefaultSolidCardBrightness"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDefault: String = "surfaceDefaultTransparentDefault"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimary: String = "surfaceDefaultTransparentPrimary"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondary: String = "surfaceDefaultTransparentSecondary"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiary: String = "surfaceDefaultTransparentTertiary"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCard: String = "surfaceDefaultTransparentCard"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightness: String =
        "surfaceDefaultTransparentCardBrightness"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccent: String = "surfaceDefaultAccent"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositive: String = "surfaceDefaultPositive"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarning: String = "surfaceDefaultWarning"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegative: String = "surfaceDefaultNegative"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClear: String = "surfaceDefaultClear"

    /**
     * light surface default surfaceTransparentDeep
     */
    public val surfaceDefaultTransparentDeep: String = "surfaceDefaultTransparentDeep"

    /**
     * light surface default surfaceAccentMinorHover
     */
    public val surfaceDefaultAccentMinorHover: String = "surfaceDefaultAccentMinorHover"

    /**
     * light surface default surfaceAccentMinorActive
     */
    public val surfaceDefaultAccentMinorActive: String = "surfaceDefaultAccentMinorActive"

    /**
     * light surface default surfaceTransparentAccentHover
     */
    public val surfaceDefaultTransparentAccentHover: String = "surfaceDefaultTransparentAccentHover"

    /**
     * light surface default surfaceTransparentAccentActive
     */
    public val surfaceDefaultTransparentAccentActive: String =
        "surfaceDefaultTransparentAccentActive"

    /**
     * light surface default surfaceInfoHover
     */
    public val surfaceDefaultInfoHover: String = "surfaceDefaultInfoHover"

    /**
     * light surface default surfaceInfoActive
     */
    public val surfaceDefaultInfoActive: String = "surfaceDefaultInfoActive"

    /**
     * light surface default surfacePositiveMinorHover
     */
    public val surfaceDefaultPositiveMinorHover: String = "surfaceDefaultPositiveMinorHover"

    /**
     * light surface default surfacePositiveMinorActive
     */
    public val surfaceDefaultPositiveMinorActive: String = "surfaceDefaultPositiveMinorActive"

    /**
     * light surface default surfaceWarningMinorHover
     */
    public val surfaceDefaultWarningMinorHover: String = "surfaceDefaultWarningMinorHover"

    /**
     * light surface default surfaceWarningMinorActive
     */
    public val surfaceDefaultWarningMinorActive: String = "surfaceDefaultWarningMinorActive"

    /**
     * light surface default surfaceNegativeMinorHover
     */
    public val surfaceDefaultNegativeMinorHover: String = "surfaceDefaultNegativeMinorHover"

    /**
     * light surface default surfaceNegativeMinorActive
     */
    public val surfaceDefaultNegativeMinorActive: String = "surfaceDefaultNegativeMinorActive"

    /**
     * light surface default surfaceInfoMinorHover
     */
    public val surfaceDefaultInfoMinorHover: String = "surfaceDefaultInfoMinorHover"

    /**
     * light surface default surfaceInfoMinorActive
     */
    public val surfaceDefaultInfoMinorActive: String = "surfaceDefaultInfoMinorActive"

    /**
     * light surface default surfaceTransparentPositiveHover
     */
    public val surfaceDefaultTransparentPositiveHover: String =
        "surfaceDefaultTransparentPositiveHover"

    /**
     * light surface default surfaceTransparentPositiveActive
     */
    public val surfaceDefaultTransparentPositiveActive: String =
        "surfaceDefaultTransparentPositiveActive"

    /**
     * light surface default surfaceTransparentWarningHover
     */
    public val surfaceDefaultTransparentWarningHover: String =
        "surfaceDefaultTransparentWarningHover"

    /**
     * light surface default surfaceTransparentWarningActive
     */
    public val surfaceDefaultTransparentWarningActive: String =
        "surfaceDefaultTransparentWarningActive"

    /**
     * light surface default surfaceTransparentNegativeHover
     */
    public val surfaceDefaultTransparentNegativeHover: String =
        "surfaceDefaultTransparentNegativeHover"

    /**
     * light surface default surfaceTransparentNegativeActive
     */
    public val surfaceDefaultTransparentNegativeActive: String =
        "surfaceDefaultTransparentNegativeActive"

    /**
     * light surface default surfaceTransparentInfoHover
     */
    public val surfaceDefaultTransparentInfoHover: String = "surfaceDefaultTransparentInfoHover"

    /**
     * light surface default surfaceTransparentInfoActive
     */
    public val surfaceDefaultTransparentInfoActive: String = "surfaceDefaultTransparentInfoActive"

    /**
     * light surface default surfaceAccentMinor
     */
    public val surfaceDefaultAccentMinor: String = "surfaceDefaultAccentMinor"

    /**
     * light surface default surfaceTransparentAccent
     */
    public val surfaceDefaultTransparentAccent: String = "surfaceDefaultTransparentAccent"

    /**
     * light surface default surfacePositiveMinor
     */
    public val surfaceDefaultPositiveMinor: String = "surfaceDefaultPositiveMinor"

    /**
     * light surface default surfaceWarningMinor
     */
    public val surfaceDefaultWarningMinor: String = "surfaceDefaultWarningMinor"

    /**
     * light surface default surfaceNegativeMinor
     */
    public val surfaceDefaultNegativeMinor: String = "surfaceDefaultNegativeMinor"

    /**
     * light surface default surfaceTransparentPositive
     */
    public val surfaceDefaultTransparentPositive: String = "surfaceDefaultTransparentPositive"

    /**
     * light surface default surfaceTransparentWarning
     */
    public val surfaceDefaultTransparentWarning: String = "surfaceDefaultTransparentWarning"

    /**
     * light surface default surfaceTransparentNegative
     */
    public val surfaceDefaultTransparentNegative: String = "surfaceDefaultTransparentNegative"

    /**
     * light surface default surfaceInfo
     */
    public val surfaceDefaultInfo: String = "surfaceDefaultInfo"

    /**
     * light surface default surfaceInfoMinor
     */
    public val surfaceDefaultInfoMinor: String = "surfaceDefaultInfoMinor"

    /**
     * light surface default surfaceTransparentInfo
     */
    public val surfaceDefaultTransparentInfo: String = "surfaceDefaultTransparentInfo"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultHover: String = "surfaceDefaultSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultActive: String = "surfaceDefaultSolidDefaultActive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryHover: String = "surfaceDefaultSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryActive: String = "surfaceDefaultSolidPrimaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryHover: String = "surfaceDefaultSolidSecondaryHover"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryActive: String = "surfaceDefaultSolidSecondaryActive"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryHover: String = "surfaceDefaultSolidTertiaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryActive: String = "surfaceDefaultSolidTertiaryActive"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardHover: String = "surfaceDefaultSolidCardHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardActive: String = "surfaceDefaultSolidCardActive"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDefaultHover: String =
        "surfaceDefaultTransparentDefaultHover"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDefaultActive: String =
        "surfaceDefaultTransparentDefaultActive"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryHover: String =
        "surfaceDefaultTransparentPrimaryHover"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryActive: String =
        "surfaceDefaultTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryHover: String =
        "surfaceDefaultTransparentSecondaryHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryActive: String =
        "surfaceDefaultTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryHover: String =
        "surfaceDefaultTransparentTertiaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryActive: String =
        "surfaceDefaultTransparentTertiaryActive"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardHover: String = "surfaceDefaultTransparentCardHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardActive: String = "surfaceDefaultTransparentCardActive"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentHover: String = "surfaceDefaultAccentHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentActive: String = "surfaceDefaultAccentActive"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositiveHover: String = "surfaceDefaultPositiveHover"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositiveActive: String = "surfaceDefaultPositiveActive"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningHover: String = "surfaceDefaultWarningHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningActive: String = "surfaceDefaultWarningActive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeHover: String = "surfaceDefaultNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeActive: String = "surfaceDefaultNegativeActive"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearHover: String = "surfaceDefaultClearHover"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearActive: String = "surfaceDefaultClearActive"

    /**
     * light surface default surfaceTransparentDeepHover
     */
    public val surfaceDefaultTransparentDeepHover: String = "surfaceDefaultTransparentDeepHover"

    /**
     * light surface default surfaceTransparentDeepActive
     */
    public val surfaceDefaultTransparentDeepActive: String = "surfaceDefaultTransparentDeepActive"

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimary: String = "surfaceOnDarkSolidPrimary"

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightness: String = "surfaceOnDarkSolidPrimaryBrightness"

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondary: String = "surfaceOnDarkSolidSecondary"

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiary: String = "surfaceOnDarkSolidTertiary"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCard: String = "surfaceOnDarkSolidCard"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightness: String = "surfaceOnDarkSolidCardBrightness"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDefault: String = "surfaceOnDarkTransparentDefault"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccent: String = "surfaceOnDarkAccent"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositive: String = "surfaceOnDarkPositive"

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarning: String = "surfaceOnDarkWarning"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegative: String = "surfaceOnDarkNegative"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClear: String = "surfaceOnDarkClear"

    /**
     * light surface onDark surfaceTransparentDeep
     */
    public val surfaceOnDarkTransparentDeep: String = "surfaceOnDarkTransparentDeep"

    /**
     * light surface onDark surfaceAccentMinor
     */
    public val surfaceOnDarkAccentMinor: String = "surfaceOnDarkAccentMinor"

    /**
     * light surface onDark surfaceAccentMinorHover
     */
    public val surfaceOnDarkAccentMinorHover: String = "surfaceOnDarkAccentMinorHover"

    /**
     * light surface onDark surfaceAccentMinorActive
     */
    public val surfaceOnDarkAccentMinorActive: String = "surfaceOnDarkAccentMinorActive"

    /**
     * light surface onDark surfaceTransparentAccent
     */
    public val surfaceOnDarkTransparentAccent: String = "surfaceOnDarkTransparentAccent"

    /**
     * light surface onDark surfaceTransparentAccentHover
     */
    public val surfaceOnDarkTransparentAccentHover: String = "surfaceOnDarkTransparentAccentHover"

    /**
     * light surface onDark surfaceTransparentAccentActive
     */
    public val surfaceOnDarkTransparentAccentActive: String = "surfaceOnDarkTransparentAccentActive"

    /**
     * light surface onDark surfaceSurfaceInfoHover
     */
    public val surfaceOnDarkSurfaceInfoHover: String = "surfaceOnDarkSurfaceInfoHover"

    /**
     * light surface onDark surfaceSurfaceInfoActive
     */
    public val surfaceOnDarkSurfaceInfoActive: String = "surfaceOnDarkSurfaceInfoActive"

    /**
     * light surface onDark surfacePositiveMinor
     */
    public val surfaceOnDarkPositiveMinor: String = "surfaceOnDarkPositiveMinor"

    /**
     * light surface onDark surfacePositiveMinorHover
     */
    public val surfaceOnDarkPositiveMinorHover: String = "surfaceOnDarkPositiveMinorHover"

    /**
     * light surface onDark surfacePositiveMinorActive
     */
    public val surfaceOnDarkPositiveMinorActive: String = "surfaceOnDarkPositiveMinorActive"

    /**
     * light surface onDark surfaceWarningMinor
     */
    public val surfaceOnDarkWarningMinor: String = "surfaceOnDarkWarningMinor"

    /**
     * light surface onDark surfaceWarningMinorHover
     */
    public val surfaceOnDarkWarningMinorHover: String = "surfaceOnDarkWarningMinorHover"

    /**
     * light surface onDark surfaceWarningMinorActive
     */
    public val surfaceOnDarkWarningMinorActive: String = "surfaceOnDarkWarningMinorActive"

    /**
     * light surface onDark surfaceNegativeMinor
     */
    public val surfaceOnDarkNegativeMinor: String = "surfaceOnDarkNegativeMinor"

    /**
     * light surface onDark surfaceNegativeMinorHover
     */
    public val surfaceOnDarkNegativeMinorHover: String = "surfaceOnDarkNegativeMinorHover"

    /**
     * light surface onDark surfaceNegativeMinorActive
     */
    public val surfaceOnDarkNegativeMinorActive: String = "surfaceOnDarkNegativeMinorActive"

    /**
     * light surface onDark surfaceInfoMinorHover
     */
    public val surfaceOnDarkInfoMinorHover: String = "surfaceOnDarkInfoMinorHover"

    /**
     * light surface onDark surfaceInfoMinorActive
     */
    public val surfaceOnDarkInfoMinorActive: String = "surfaceOnDarkInfoMinorActive"

    /**
     * light surface onDark surfaceTransparentPositiveHover
     */
    public val surfaceOnDarkTransparentPositiveHover: String =
        "surfaceOnDarkTransparentPositiveHover"

    /**
     * light surface onDark surfaceTransparentPositiveActive
     */
    public val surfaceOnDarkTransparentPositiveActive: String =
        "surfaceOnDarkTransparentPositiveActive"

    /**
     * light surface onDark surfaceTransparentWarningHover
     */
    public val surfaceOnDarkTransparentWarningHover: String = "surfaceOnDarkTransparentWarningHover"

    /**
     * light surface onDark surfaceTransparentWarningActive
     */
    public val surfaceOnDarkTransparentWarningActive: String =
        "surfaceOnDarkTransparentWarningActive"

    /**
     * light surface onDark surfaceTransparentNegativeHover
     */
    public val surfaceOnDarkTransparentNegativeHover: String =
        "surfaceOnDarkTransparentNegativeHover"

    /**
     * light surface onDark surfaceTransparentNegativeActive
     */
    public val surfaceOnDarkTransparentNegativeActive: String =
        "surfaceOnDarkTransparentNegativeActive"

    /**
     * light surface onDark surfaceTransparentInfoHover
     */
    public val surfaceOnDarkTransparentInfoHover: String = "surfaceOnDarkTransparentInfoHover"

    /**
     * light surface onDark surfaceTransparentInfoActive
     */
    public val surfaceOnDarkTransparentInfoActive: String = "surfaceOnDarkTransparentInfoActive"

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefault: String = "surfaceOnDarkSolidDefault"

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultHover: String = "surfaceOnDarkSolidDefaultHover"

    /**
     * Непр. фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultActive: String = "surfaceOnDarkSolidDefaultActive"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimary: String = "surfaceOnDarkTransparentPrimary"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryHover: String = "surfaceOnDarkTransparentPrimaryHover"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryActive: String =
        "surfaceOnDarkTransparentPrimaryActive"

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondary: String = "surfaceOnDarkTransparentSecondary"

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryHover: String =
        "surfaceOnDarkTransparentSecondaryHover"

    /**
     * Втор. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryActive: String =
        "surfaceOnDarkTransparentSecondaryActive"

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiary: String = "surfaceOnDarkTransparentTertiary"

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryHover: String =
        "surfaceOnDarkTransparentTertiaryHover"

    /**
     * Трет. прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryActive: String =
        "surfaceOnDarkTransparentTertiaryActive"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCard: String = "surfaceOnDarkTransparentCard"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightness: String =
        "surfaceOnDarkTransparentCardBrightness"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardHover: String = "surfaceOnDarkTransparentCardHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardActive: String = "surfaceOnDarkTransparentCardActive"

    /**
     * light surface onDark surfaceTransparentPositive
     */
    public val surfaceOnDarkTransparentPositive: String = "surfaceOnDarkTransparentPositive"

    /**
     * light surface onDark surfaceTransparentWarning
     */
    public val surfaceOnDarkTransparentWarning: String = "surfaceOnDarkTransparentWarning"

    /**
     * light surface onDark surfaceTransparentNegative
     */
    public val surfaceOnDarkTransparentNegative: String = "surfaceOnDarkTransparentNegative"

    /**
     * light surface onDark surfaceSurfaceInfo
     */
    public val surfaceOnDarkSurfaceInfo: String = "surfaceOnDarkSurfaceInfo"

    /**
     * light surface onDark surfaceInfoMinor
     */
    public val surfaceOnDarkInfoMinor: String = "surfaceOnDarkInfoMinor"

    /**
     * light surface onDark surfaceTransparentInfo
     */
    public val surfaceOnDarkTransparentInfo: String = "surfaceOnDarkTransparentInfo"

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryHover: String = "surfaceOnDarkSolidPrimaryHover"

    /**
     * Осн. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryActive: String = "surfaceOnDarkSolidPrimaryActive"

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryHover: String = "surfaceOnDarkSolidSecondaryHover"

    /**
     * Втор. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryActive: String = "surfaceOnDarkSolidSecondaryActive"

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryHover: String = "surfaceOnDarkSolidTertiaryHover"

    /**
     * Трет. непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryActive: String = "surfaceOnDarkSolidTertiaryActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardHover: String = "surfaceOnDarkSolidCardHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardActive: String = "surfaceOnDarkSolidCardActive"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDefaultHover: String = "surfaceOnDarkTransparentDefaultHover"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDefaultActive: String =
        "surfaceOnDarkTransparentDefaultActive"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentHover: String = "surfaceOnDarkAccentHover"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentActive: String = "surfaceOnDarkAccentActive"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositiveHover: String = "surfaceOnDarkPositiveHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositiveActive: String = "surfaceOnDarkPositiveActive"

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningHover: String = "surfaceOnDarkWarningHover"

    /**
     * Цвет фона поверхн./контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningActive: String = "surfaceOnDarkWarningActive"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeHover: String = "surfaceOnDarkNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeActive: String = "surfaceOnDarkNegativeActive"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearHover: String = "surfaceOnDarkClearHover"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearActive: String = "surfaceOnDarkClearActive"

    /**
     * light surface onDark surfaceTransparentDeepHover
     */
    public val surfaceOnDarkTransparentDeepHover: String = "surfaceOnDarkTransparentDeepHover"

    /**
     * light surface onDark surfaceTransparentDeepActive
     */
    public val surfaceOnDarkTransparentDeepActive: String = "surfaceOnDarkTransparentDeepActive"

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefault: String = "surfaceOnLightSolidDefault"

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimary: String = "surfaceOnLightSolidPrimary"

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightness: String = "surfaceOnLightSolidPrimaryBrightness"

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondary: String = "surfaceOnLightSolidSecondary"

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiary: String = "surfaceOnLightSolidTertiary"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCard: String = "surfaceOnLightSolidCard"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightness: String = "surfaceOnLightSolidCardBrightness"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDefault: String = "surfaceOnLightTransparentDefault"

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimary: String = "surfaceOnLightTransparentPrimary"

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondary: String = "surfaceOnLightTransparentSecondary"

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiary: String = "surfaceOnLightTransparentTertiary"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCard: String = "surfaceOnLightTransparentCard"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightness: String =
        "surfaceOnLightTransparentCardBrightness"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccent: String = "surfaceOnLightAccent"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositive: String = "surfaceOnLightPositive"

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarning: String = "surfaceOnLightWarning"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegative: String = "surfaceOnLightNegative"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClear: String = "surfaceOnLightClear"

    /**
     * light surface onLight surfaceTransparentDeep
     */
    public val surfaceOnLightTransparentDeep: String = "surfaceOnLightTransparentDeep"

    /**
     * light surface onLight surfaceAccentMinor
     */
    public val surfaceOnLightAccentMinor: String = "surfaceOnLightAccentMinor"

    /**
     * light surface onLight surfaceAccentMinorHover
     */
    public val surfaceOnLightAccentMinorHover: String = "surfaceOnLightAccentMinorHover"

    /**
     * light surface onLight surfaceAccentMinorActive
     */
    public val surfaceOnLightAccentMinorActive: String = "surfaceOnLightAccentMinorActive"

    /**
     * light surface onLight surfaceTransparentAccent
     */
    public val surfaceOnLightTransparentAccent: String = "surfaceOnLightTransparentAccent"

    /**
     * light surface onLight surfaceTransparentAccentHover
     */
    public val surfaceOnLightTransparentAccentHover: String = "surfaceOnLightTransparentAccentHover"

    /**
     * light surface onLight surfaceTransparentAccentActive
     */
    public val surfaceOnLightTransparentAccentActive: String =
        "surfaceOnLightTransparentAccentActive"

    /**
     * light surface onLight surfaceInfoHover
     */
    public val surfaceOnLightInfoHover: String = "surfaceOnLightInfoHover"

    /**
     * light surface onLight surfaceInfoActive
     */
    public val surfaceOnLightInfoActive: String = "surfaceOnLightInfoActive"

    /**
     * light surface onLight surfacePositiveMinor
     */
    public val surfaceOnLightPositiveMinor: String = "surfaceOnLightPositiveMinor"

    /**
     * light surface onLight surfacePositiveMinorHover
     */
    public val surfaceOnLightPositiveMinorHover: String = "surfaceOnLightPositiveMinorHover"

    /**
     * light surface onLight surfacePositiveMinorActive
     */
    public val surfaceOnLightPositiveMinorActive: String = "surfaceOnLightPositiveMinorActive"

    /**
     * light surface onLight surfaceWarningMinor
     */
    public val surfaceOnLightWarningMinor: String = "surfaceOnLightWarningMinor"

    /**
     * light surface onLight surfaceWarningMinorHover
     */
    public val surfaceOnLightWarningMinorHover: String = "surfaceOnLightWarningMinorHover"

    /**
     * light surface onLight surfaceWarningMinorActive
     */
    public val surfaceOnLightWarningMinorActive: String = "surfaceOnLightWarningMinorActive"

    /**
     * light surface onLight surfaceNegativeMinor
     */
    public val surfaceOnLightNegativeMinor: String = "surfaceOnLightNegativeMinor"

    /**
     * light surface onLight surfaceNegativeMinorHover
     */
    public val surfaceOnLightNegativeMinorHover: String = "surfaceOnLightNegativeMinorHover"

    /**
     * light surface onLight surfaceNegativeMinorActive
     */
    public val surfaceOnLightNegativeMinorActive: String = "surfaceOnLightNegativeMinorActive"

    /**
     * light surface onLight surfaceInfoMinorHover
     */
    public val surfaceOnLightInfoMinorHover: String = "surfaceOnLightInfoMinorHover"

    /**
     * light surface onLight surfaceInfoMinorActive
     */
    public val surfaceOnLightInfoMinorActive: String = "surfaceOnLightInfoMinorActive"

    /**
     * light surface onLight surfaceTransparentPositiveHover
     */
    public val surfaceOnLightTransparentPositiveHover: String =
        "surfaceOnLightTransparentPositiveHover"

    /**
     * light surface onLight surfaceTransparentPositiveActive
     */
    public val surfaceOnLightTransparentPositiveActive: String =
        "surfaceOnLightTransparentPositiveActive"

    /**
     * light surface onLight surfaceTransparentWarningHover
     */
    public val surfaceOnLightTransparentWarningHover: String =
        "surfaceOnLightTransparentWarningHover"

    /**
     * light surface onLight surfaceTransparentWarningActive
     */
    public val surfaceOnLightTransparentWarningActive: String =
        "surfaceOnLightTransparentWarningActive"

    /**
     * light surface onLight surfaceTransparentNegativeHover
     */
    public val surfaceOnLightTransparentNegativeHover: String =
        "surfaceOnLightTransparentNegativeHover"

    /**
     * light surface onLight surfaceTransparentNegativeActive
     */
    public val surfaceOnLightTransparentNegativeActive: String =
        "surfaceOnLightTransparentNegativeActive"

    /**
     * light surface onLight surfaceTransparentInfoHover
     */
    public val surfaceOnLightTransparentInfoHover: String = "surfaceOnLightTransparentInfoHover"

    /**
     * light surface onLight surfaceTransparentInfoActive
     */
    public val surfaceOnLightTransparentInfoActive: String = "surfaceOnLightTransparentInfoActive"

    /**
     * light surface onLight surfaceTransparentPositive
     */
    public val surfaceOnLightTransparentPositive: String = "surfaceOnLightTransparentPositive"

    /**
     * light surface onLight surfaceTransparentWarning
     */
    public val surfaceOnLightTransparentWarning: String = "surfaceOnLightTransparentWarning"

    /**
     * light surface onLight surfaceTransparentNegative
     */
    public val surfaceOnLightTransparentNegative: String = "surfaceOnLightTransparentNegative"

    /**
     * light surface onLight surfaceInfo
     */
    public val surfaceOnLightInfo: String = "surfaceOnLightInfo"

    /**
     * light surface onLight surfaceInfoMinor
     */
    public val surfaceOnLightInfoMinor: String = "surfaceOnLightInfoMinor"

    /**
     * light surface onLight surfaceTransparentInfo
     */
    public val surfaceOnLightTransparentInfo: String = "surfaceOnLightTransparentInfo"

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultHover: String = "surfaceOnLightSolidDefaultHover"

    /**
     * Непр. фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultActive: String = "surfaceOnLightSolidDefaultActive"

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryHover: String = "surfaceOnLightSolidPrimaryHover"

    /**
     * Осн. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryActive: String = "surfaceOnLightSolidPrimaryActive"

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryHover: String = "surfaceOnLightSolidSecondaryHover"

    /**
     * Втор. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryActive: String = "surfaceOnLightSolidSecondaryActive"

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryHover: String = "surfaceOnLightSolidTertiaryHover"

    /**
     * Трет. непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryActive: String = "surfaceOnLightSolidTertiaryActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardHover: String = "surfaceOnLightSolidCardHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardActive: String = "surfaceOnLightSolidCardActive"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDefaultHover: String =
        "surfaceOnLightTransparentDefaultHover"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDefaultActive: String =
        "surfaceOnLightTransparentDefaultActive"

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryHover: String =
        "surfaceOnLightTransparentPrimaryHover"

    /**
     * Осн. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryActive: String =
        "surfaceOnLightTransparentPrimaryActive"

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryHover: String =
        "surfaceOnLightTransparentSecondaryHover"

    /**
     * Втор.  прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryActive: String =
        "surfaceOnLightTransparentSecondaryActive"

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryHover: String =
        "surfaceOnLightTransparentTertiaryHover"

    /**
     * Трет. прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryActive: String =
        "surfaceOnLightTransparentTertiaryActive"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardHover: String = "surfaceOnLightTransparentCardHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardActive: String = "surfaceOnLightTransparentCardActive"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentHover: String = "surfaceOnLightAccentHover"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentActive: String = "surfaceOnLightAccentActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositiveHover: String = "surfaceOnLightPositiveHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositiveActive: String = "surfaceOnLightPositiveActive"

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningHover: String = "surfaceOnLightWarningHover"

    /**
     * Цвет фона поверхн./контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningActive: String = "surfaceOnLightWarningActive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeHover: String = "surfaceOnLightNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeActive: String = "surfaceOnLightNegativeActive"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearHover: String = "surfaceOnLightClearHover"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearActive: String = "surfaceOnLightClearActive"

    /**
     * light surface onLight surfaceTransparentDeepHover
     */
    public val surfaceOnLightTransparentDeepHover: String = "surfaceOnLightTransparentDeepHover"

    /**
     * light surface onLight surfaceTransparentDeepActive
     */
    public val surfaceOnLightTransparentDeepActive: String = "surfaceOnLightTransparentDeepActive"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefault: String = "surfaceInverseSolidDefault"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimary: String = "surfaceInverseSolidPrimary"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightness: String = "surfaceInverseSolidPrimaryBrightness"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondary: String = "surfaceInverseSolidSecondary"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiary: String = "surfaceInverseSolidTertiary"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCard: String = "surfaceInverseSolidCard"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightness: String = "surfaceInverseSolidCardBrightness"

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseTransparentDefault: String = "surfaceInverseTransparentDefault"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimary: String = "surfaceInverseTransparentPrimary"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondary: String = "surfaceInverseTransparentSecondary"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiary: String = "surfaceInverseTransparentTertiary"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCard: String = "surfaceInverseTransparentCard"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightness: String =
        "surfaceInverseTransparentCardBrightness"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccent: String = "surfaceInverseAccent"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositive: String = "surfaceInversePositive"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarning: String = "surfaceInverseWarning"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegative: String = "surfaceInverseNegative"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClear: String = "surfaceInverseClear"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultHover: String = "surfaceInverseSolidDefaultHover"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultActive: String = "surfaceInverseSolidDefaultActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryHover: String = "surfaceInverseSolidPrimaryHover"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryActive: String = "surfaceInverseSolidPrimaryActive"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryHover: String = "surfaceInverseSolidSecondaryHover"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryActive: String = "surfaceInverseSolidSecondaryActive"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryHover: String = "surfaceInverseSolidTertiaryHover"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryActive: String = "surfaceInverseSolidTertiaryActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardHover: String = "surfaceInverseSolidCardHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardActive: String = "surfaceInverseSolidCardActive"

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseTransparentDefaultHover: String =
        "surfaceInverseTransparentDefaultHover"

    /**
     * Инвертированный прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseTransparentDefaultActive: String =
        "surfaceInverseTransparentDefaultActive"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryHover: String =
        "surfaceInverseTransparentPrimaryHover"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryActive: String =
        "surfaceInverseTransparentPrimaryActive"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryHover: String =
        "surfaceInverseTransparentSecondaryHover"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryActive: String =
        "surfaceInverseTransparentSecondaryActive"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryHover: String =
        "surfaceInverseTransparentTertiaryHover"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryActive: String =
        "surfaceInverseTransparentTertiaryActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardHover: String = "surfaceInverseTransparentCardHover"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardActive: String = "surfaceInverseTransparentCardActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentHover: String = "surfaceInverseAccentHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentActive: String = "surfaceInverseAccentActive"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositiveHover: String = "surfaceInversePositiveHover"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositiveActive: String = "surfaceInversePositiveActive"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningHover: String = "surfaceInverseWarningHover"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningActive: String = "surfaceInverseWarningActive"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeHover: String = "surfaceInverseNegativeHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeActive: String = "surfaceInverseNegativeActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearHover: String = "surfaceInverseClearHover"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearActive: String = "surfaceInverseClearActive"

    /**
     * light surface inverse surfaceTransparentDeep
     */
    public val surfaceInverseTransparentDeep: String = "surfaceInverseTransparentDeep"

    /**
     * light surface inverse surfaceTransparentDeepHover
     */
    public val surfaceInverseTransparentDeepHover: String = "surfaceInverseTransparentDeepHover"

    /**
     * light surface inverse surfaceTransparentDeepActive
     */
    public val surfaceInverseTransparentDeepActive: String = "surfaceInverseTransparentDeepActive"

    /**
     * light surface inverse surfaceAccentMinor
     */
    public val surfaceInverseAccentMinor: String = "surfaceInverseAccentMinor"

    /**
     * light surface inverse surfaceAccentMinorHover
     */
    public val surfaceInverseAccentMinorHover: String = "surfaceInverseAccentMinorHover"

    /**
     * light surface inverse surfaceAccentMinorActive
     */
    public val surfaceInverseAccentMinorActive: String = "surfaceInverseAccentMinorActive"

    /**
     * light surface inverse surfaceTransparentAccent
     */
    public val surfaceInverseTransparentAccent: String = "surfaceInverseTransparentAccent"

    /**
     * light surface inverse surfaceTransparentAccentHover
     */
    public val surfaceInverseTransparentAccentHover: String = "surfaceInverseTransparentAccentHover"

    /**
     * light surface inverse surfaceTransparentAccentActive
     */
    public val surfaceInverseTransparentAccentActive: String =
        "surfaceInverseTransparentAccentActive"

    /**
     * light surface inverse surfaceInfo
     */
    public val surfaceInverseInfo: String = "surfaceInverseInfo"

    /**
     * light surface inverse surfaceInfoHover
     */
    public val surfaceInverseInfoHover: String = "surfaceInverseInfoHover"

    /**
     * light surface inverse surfaceInfoActive
     */
    public val surfaceInverseInfoActive: String = "surfaceInverseInfoActive"

    /**
     * light surface inverse surfacePositiveMinor
     */
    public val surfaceInversePositiveMinor: String = "surfaceInversePositiveMinor"

    /**
     * light surface inverse surfacePositiveMinorHover
     */
    public val surfaceInversePositiveMinorHover: String = "surfaceInversePositiveMinorHover"

    /**
     * light surface inverse surfacePositiveMinorActive
     */
    public val surfaceInversePositiveMinorActive: String = "surfaceInversePositiveMinorActive"

    /**
     * light surface inverse surfaceWarningMinor
     */
    public val surfaceInverseWarningMinor: String = "surfaceInverseWarningMinor"

    /**
     * light surface inverse surfaceWarningMinorHover
     */
    public val surfaceInverseWarningMinorHover: String = "surfaceInverseWarningMinorHover"

    /**
     * light surface inverse surfaceWarningMinorActive
     */
    public val surfaceInverseWarningMinorActive: String = "surfaceInverseWarningMinorActive"

    /**
     * light surface inverse surfaceNegativeMinor
     */
    public val surfaceInverseNegativeMinor: String = "surfaceInverseNegativeMinor"

    /**
     * light surface inverse surfaceNegativeMinorHover
     */
    public val surfaceInverseNegativeMinorHover: String = "surfaceInverseNegativeMinorHover"

    /**
     * light surface inverse surfaceNegativeMinorActive
     */
    public val surfaceInverseNegativeMinorActive: String = "surfaceInverseNegativeMinorActive"

    /**
     * light surface inverse surfaceInfoMinor
     */
    public val surfaceInverseInfoMinor: String = "surfaceInverseInfoMinor"

    /**
     * light surface inverse surfaceInfoMinorHover
     */
    public val surfaceInverseInfoMinorHover: String = "surfaceInverseInfoMinorHover"

    /**
     * light surface inverse surfaceInfoMinorActive
     */
    public val surfaceInverseInfoMinorActive: String = "surfaceInverseInfoMinorActive"

    /**
     * light surface inverse surfaceTransparentPositive
     */
    public val surfaceInverseTransparentPositive: String = "surfaceInverseTransparentPositive"

    /**
     * light surface inverse surfaceTransparentPositiveHover
     */
    public val surfaceInverseTransparentPositiveHover: String =
        "surfaceInverseTransparentPositiveHover"

    /**
     * light surface inverse surfaceTransparentPositiveActive
     */
    public val surfaceInverseTransparentPositiveActive: String =
        "surfaceInverseTransparentPositiveActive"

    /**
     * light surface inverse surfaceTransparentWarning
     */
    public val surfaceInverseTransparentWarning: String = "surfaceInverseTransparentWarning"

    /**
     * light surface inverse surfaceTransparentWarningHover
     */
    public val surfaceInverseTransparentWarningHover: String =
        "surfaceInverseTransparentWarningHover"

    /**
     * light surface inverse surfaceTransparentWarningActive
     */
    public val surfaceInverseTransparentWarningActive: String =
        "surfaceInverseTransparentWarningActive"

    /**
     * light surface inverse surfaceTransparentNegative
     */
    public val surfaceInverseTransparentNegative: String = "surfaceInverseTransparentNegative"

    /**
     * light surface inverse surfaceTransparentNegativeHover
     */
    public val surfaceInverseTransparentNegativeHover: String =
        "surfaceInverseTransparentNegativeHover"

    /**
     * light surface inverse surfaceTransparentNegativeActive
     */
    public val surfaceInverseTransparentNegativeActive: String =
        "surfaceInverseTransparentNegativeActive"

    /**
     * light surface inverse surfaceTransparentInfo
     */
    public val surfaceInverseTransparentInfo: String = "surfaceInverseTransparentInfo"

    /**
     * light surface inverse surfaceTransparentInfoHover
     */
    public val surfaceInverseTransparentInfoHover: String = "surfaceInverseTransparentInfoHover"

    /**
     * light surface inverse surfaceTransparentInfoActive
     */
    public val surfaceInverseTransparentInfoActive: String = "surfaceInverseTransparentInfoActive"

    /**
     * Основной фон
     */
    public val backgroundDefaultPrimary: String = "backgroundDefaultPrimary"

    /**
     * Основной фон
     */
    public val backgroundDefaultPrimaryBrightness: String = "backgroundDefaultPrimaryBrightness"

    /**
     * Вторичный фон
     */
    public val backgroundDefaultSecondary: String = "backgroundDefaultSecondary"

    /**
     * Третичный фон
     */
    public val backgroundDefaultTertiary: String = "backgroundDefaultTertiary"

    /**
     * Основной фон на темном фоне
     */
    public val backgroundDarkPrimary: String = "backgroundDarkPrimary"

    /**
     * Вторичный фон на темном фоне
     */
    public val backgroundDarkSecondary: String = "backgroundDarkSecondary"

    /**
     * Третичный фон на темном фоне
     */
    public val backgroundDarkTertiary: String = "backgroundDarkTertiary"

    /**
     * Основной фон на светлом фоне
     */
    public val backgroundLightPrimary: String = "backgroundLightPrimary"

    /**
     * Вторичный фон на светлом фоне
     */
    public val backgroundLightSecondary: String = "backgroundLightSecondary"

    /**
     * Третичный фон на светлом фоне
     */
    public val backgroundLightTertiary: String = "backgroundLightTertiary"

    /**
     * Инвертированный основной фон
     */
    public val backgroundInversePrimaryBrightness: String = "backgroundInversePrimaryBrightness"

    /**
     * Инвертированный вторичный фон
     */
    public val backgroundInverseSecondary: String = "backgroundInverseSecondary"

    /**
     * Инвертированный третичный фон
     */
    public val backgroundInverseTertiary: String = "backgroundInverseTertiary"

    /**
     * Инвертированный основной фон
     */
    public val backgroundInversePrimary: String = "backgroundInversePrimary"

    /**
     * Цвет фона паранжи светлый
     */
    public val overlayDefaultSoft: String = "overlayDefaultSoft"

    /**
     * Цвет фона паранжи темный
     */
    public val overlayDefaultHard: String = "overlayDefaultHard"

    /**
     * light overlay default overlayBlur
     */
    public val overlayDefaultBlur: String = "overlayDefaultBlur"

    /**
     * Цвет фона паранжи светлый на темном фоне
     */
    public val overlayOnDarkSoft: String = "overlayOnDarkSoft"

    /**
     * Цвет фона паранжи темный на темном фоне
     */
    public val overlayOnDarkHard: String = "overlayOnDarkHard"

    /**
     * light overlay onDark overlayBlur
     */
    public val overlayOnDarkBlur: String = "overlayOnDarkBlur"

    /**
     * Цвет фона паранжи светлый на светлом фоне
     */
    public val overlayOnLightSoft: String = "overlayOnLightSoft"

    /**
     * Цвет фона паранжи темный на светлом фоне
     */
    public val overlayOnLightHard: String = "overlayOnLightHard"

    /**
     * light overlay onLight overlayBlur
     */
    public val overlayOnLightBlur: String = "overlayOnLightBlur"

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public val overlayInverseHard: String = "overlayInverseHard"

    /**
     * Инвертированный цвет фона паранжи светлый
     */
    public val overlayInverseSoft: String = "overlayInverseSoft"

    /**
     * light overlay inverse overlayBlur
     */
    public val overlayInverseBlur: String = "overlayInverseBlur"

    /**
     * light outline default outlineSecondaryHover
     */
    public val outlineDefaultSecondaryHover: String = "outlineDefaultSecondaryHover"

    /**
     * light outline default outlineSecondaryActive
     */
    public val outlineDefaultSecondaryActive: String = "outlineDefaultSecondaryActive"

    /**
     * light outline default outlineTertiaryHover
     */
    public val outlineDefaultTertiaryHover: String = "outlineDefaultTertiaryHover"

    /**
     * light outline default outlineTertiaryActive
     */
    public val outlineDefaultTertiaryActive: String = "outlineDefaultTertiaryActive"

    /**
     * light outline default outlineDefaultHover
     */
    public val outlineDefaultDefaultHover: String = "outlineDefaultDefaultHover"

    /**
     * light outline default outlineDefaultActive
     */
    public val outlineDefaultDefaultActive: String = "outlineDefaultDefaultActive"

    /**
     * light outline default outlineTransparentPrimaryHover
     */
    public val outlineDefaultTransparentPrimaryHover: String =
        "outlineDefaultTransparentPrimaryHover"

    /**
     * light outline default outlineTransparentPrimaryActive
     */
    public val outlineDefaultTransparentPrimaryActive: String =
        "outlineDefaultTransparentPrimaryActive"

    /**
     * light outline default outlineTransparentSecondaryHover
     */
    public val outlineDefaultTransparentSecondaryHover: String =
        "outlineDefaultTransparentSecondaryHover"

    /**
     * light outline default outlineTransparentSecondaryActive
     */
    public val outlineDefaultTransparentSecondaryActive: String =
        "outlineDefaultTransparentSecondaryActive"

    /**
     * light outline default outlineTransparentTertiaryHover
     */
    public val outlineDefaultTransparentTertiaryHover: String =
        "outlineDefaultTransparentTertiaryHover"

    /**
     * light outline default outlineTransparentTertiaryActive
     */
    public val outlineDefaultTransparentTertiaryActive: String =
        "outlineDefaultTransparentTertiaryActive"

    /**
     * light outline default outlineTransparentClearHover
     */
    public val outlineDefaultTransparentClearHover: String = "outlineDefaultTransparentClearHover"

    /**
     * light outline default outlineTransparentClearActive
     */
    public val outlineDefaultTransparentClearActive: String = "outlineDefaultTransparentClearActive"

    /**
     * light outline default outlineAccentHover
     */
    public val outlineDefaultAccentHover: String = "outlineDefaultAccentHover"

    /**
     * light outline default outlineAccentActive
     */
    public val outlineDefaultAccentActive: String = "outlineDefaultAccentActive"

    /**
     * light outline default outlineAccentMinorHover
     */
    public val outlineDefaultAccentMinorHover: String = "outlineDefaultAccentMinorHover"

    /**
     * light outline default outlineAccentMinorActive
     */
    public val outlineDefaultAccentMinorActive: String = "outlineDefaultAccentMinorActive"

    /**
     * light outline default outlineTransparentAccentHover
     */
    public val outlineDefaultTransparentAccentHover: String = "outlineDefaultTransparentAccentHover"

    /**
     * light outline default outlineTransparentAccentActive
     */
    public val outlineDefaultTransparentAccentActive: String =
        "outlineDefaultTransparentAccentActive"

    /**
     * light outline default outlinePositiveHover
     */
    public val outlineDefaultPositiveHover: String = "outlineDefaultPositiveHover"

    /**
     * light outline default outlinePositiveActive
     */
    public val outlineDefaultPositiveActive: String = "outlineDefaultPositiveActive"

    /**
     * light outline default outlineWarningHover
     */
    public val outlineDefaultWarningHover: String = "outlineDefaultWarningHover"

    /**
     * light outline default outlineWarningActive
     */
    public val outlineDefaultWarningActive: String = "outlineDefaultWarningActive"

    /**
     * light outline default outlineNegativeHover
     */
    public val outlineDefaultNegativeHover: String = "outlineDefaultNegativeHover"

    /**
     * light outline default outlineNegativeActive
     */
    public val outlineDefaultNegativeActive: String = "outlineDefaultNegativeActive"

    /**
     * light outline default outlineInfoHover
     */
    public val outlineDefaultInfoHover: String = "outlineDefaultInfoHover"

    /**
     * light outline default outlineInfoActive
     */
    public val outlineDefaultInfoActive: String = "outlineDefaultInfoActive"

    /**
     * light outline default outlinePositiveMinorHover
     */
    public val outlineDefaultPositiveMinorHover: String = "outlineDefaultPositiveMinorHover"

    /**
     * light outline default outlinePositiveMinorActive
     */
    public val outlineDefaultPositiveMinorActive: String = "outlineDefaultPositiveMinorActive"

    /**
     * light outline default outlineWarningMinorHover
     */
    public val outlineDefaultWarningMinorHover: String = "outlineDefaultWarningMinorHover"

    /**
     * light outline default outlineWarningMinorActive
     */
    public val outlineDefaultWarningMinorActive: String = "outlineDefaultWarningMinorActive"

    /**
     * light outline default outlineNegativeMinorHover
     */
    public val outlineDefaultNegativeMinorHover: String = "outlineDefaultNegativeMinorHover"

    /**
     * light outline default outlineNegativeMinorActive
     */
    public val outlineDefaultNegativeMinorActive: String = "outlineDefaultNegativeMinorActive"

    /**
     * light outline default outlineInfoMinorHover
     */
    public val outlineDefaultInfoMinorHover: String = "outlineDefaultInfoMinorHover"

    /**
     * light outline default outlineInfoMinorActive
     */
    public val outlineDefaultInfoMinorActive: String = "outlineDefaultInfoMinorActive"

    /**
     * light outline default outlineTransparentPositiveHover
     */
    public val outlineDefaultTransparentPositiveHover: String =
        "outlineDefaultTransparentPositiveHover"

    /**
     * light outline default outlineTransparentPositiveActive
     */
    public val outlineDefaultTransparentPositiveActive: String =
        "outlineDefaultTransparentPositiveActive"

    /**
     * light outline default outlineTransparentWarningHover
     */
    public val outlineDefaultTransparentWarningHover: String =
        "outlineDefaultTransparentWarningHover"

    /**
     * light outline default outlineTransparentWarningActive
     */
    public val outlineDefaultTransparentWarningActive: String =
        "outlineDefaultTransparentWarningActive"

    /**
     * light outline default outlineNegativeTransparentHover
     */
    public val outlineDefaultNegativeTransparentHover: String =
        "outlineDefaultNegativeTransparentHover"

    /**
     * light outline default outlineNegativeTransparentActive
     */
    public val outlineDefaultNegativeTransparentActive: String =
        "outlineDefaultNegativeTransparentActive"

    /**
     * light outline default outlineTransparentInfoHover
     */
    public val outlineDefaultTransparentInfoHover: String = "outlineDefaultTransparentInfoHover"

    /**
     * light outline default outlineTransparentInfoActive
     */
    public val outlineDefaultTransparentInfoActive: String = "outlineDefaultTransparentInfoActive"

    /**
     * light outline default outlinePrimaryHover
     */
    public val outlineDefaultPrimaryHover: String = "outlineDefaultPrimaryHover"

    /**
     * light outline default outlinePrimaryActive
     */
    public val outlineDefaultPrimaryActive: String = "outlineDefaultPrimaryActive"

    /**
     * light outline default outlineTransparentPrimary
     */
    public val outlineDefaultTransparentPrimary: String = "outlineDefaultTransparentPrimary"

    /**
     * light outline default outlineTransparentSecondary
     */
    public val outlineDefaultTransparentSecondary: String = "outlineDefaultTransparentSecondary"

    /**
     * light outline default outlineTransparentTertiary
     */
    public val outlineDefaultTransparentTertiary: String = "outlineDefaultTransparentTertiary"

    /**
     * light outline default outlineTransparentClear
     */
    public val outlineDefaultTransparentClear: String = "outlineDefaultTransparentClear"

    /**
     * light outline default outlineAccent
     */
    public val outlineDefaultAccent: String = "outlineDefaultAccent"

    /**
     * light outline default outlineAccentMinor
     */
    public val outlineDefaultAccentMinor: String = "outlineDefaultAccentMinor"

    /**
     * light outline default outlineTransparentAccent
     */
    public val outlineDefaultTransparentAccent: String = "outlineDefaultTransparentAccent"

    /**
     * light outline default outlinePositive
     */
    public val outlineDefaultPositive: String = "outlineDefaultPositive"

    /**
     * light outline default outlineWarning
     */
    public val outlineDefaultWarning: String = "outlineDefaultWarning"

    /**
     * light outline default outlineNegative
     */
    public val outlineDefaultNegative: String = "outlineDefaultNegative"

    /**
     * light outline default outlinePositiveMinor
     */
    public val outlineDefaultPositiveMinor: String = "outlineDefaultPositiveMinor"

    /**
     * light outline default outlineWarningMinor
     */
    public val outlineDefaultWarningMinor: String = "outlineDefaultWarningMinor"

    /**
     * light outline default outlineNegativeMinor
     */
    public val outlineDefaultNegativeMinor: String = "outlineDefaultNegativeMinor"

    /**
     * light outline default outlineTransparentPositive
     */
    public val outlineDefaultTransparentPositive: String = "outlineDefaultTransparentPositive"

    /**
     * light outline default outlineTransparentWarning
     */
    public val outlineDefaultTransparentWarning: String = "outlineDefaultTransparentWarning"

    /**
     * light outline default outlineTransparentNegative
     */
    public val outlineDefaultTransparentNegative: String = "outlineDefaultTransparentNegative"

    /**
     * light outline default outlineTransparentNegativeHover
     */
    public val outlineDefaultTransparentNegativeHover: String =
        "outlineDefaultTransparentNegativeHover"

    /**
     * light outline default outlineTransparentNegativeActive
     */
    public val outlineDefaultTransparentNegativeActive: String =
        "outlineDefaultTransparentNegativeActive"

    /**
     * light outline default outlineInfo
     */
    public val outlineDefaultInfo: String = "outlineDefaultInfo"

    /**
     * light outline default outlineInfoMinor
     */
    public val outlineDefaultInfoMinor: String = "outlineDefaultInfoMinor"

    /**
     * light outline default outlineTransparentInfo
     */
    public val outlineDefaultTransparentInfo: String = "outlineDefaultTransparentInfo"

    /**
     * light outline default outlineSolidPrimaryHover
     */
    public val outlineDefaultSolidPrimaryHover: String = "outlineDefaultSolidPrimaryHover"

    /**
     * light outline default outlineSolidPrimaryActive
     */
    public val outlineDefaultSolidPrimaryActive: String = "outlineDefaultSolidPrimaryActive"

    /**
     * light outline default outlineSolidSecondaryHover
     */
    public val outlineDefaultSolidSecondaryHover: String = "outlineDefaultSolidSecondaryHover"

    /**
     * light outline default outlineSolidSecondaryActive
     */
    public val outlineDefaultSolidSecondaryActive: String = "outlineDefaultSolidSecondaryActive"

    /**
     * light outline default outlineSolidTertiaryHover
     */
    public val outlineDefaultSolidTertiaryHover: String = "outlineDefaultSolidTertiaryHover"

    /**
     * light outline default outlineSolidTertiaryActive
     */
    public val outlineDefaultSolidTertiaryActive: String = "outlineDefaultSolidTertiaryActive"

    /**
     * light outline default outlineSolidDefaultHover
     */
    public val outlineDefaultSolidDefaultHover: String = "outlineDefaultSolidDefaultHover"

    /**
     * light outline default outlineSolidDefaultActive
     */
    public val outlineDefaultSolidDefaultActive: String = "outlineDefaultSolidDefaultActive"

    /**
     * light outline default outlineSolidPrimary
     */
    public val outlineDefaultSolidPrimary: String = "outlineDefaultSolidPrimary"

    /**
     * light outline default outlineSolidSecondary
     */
    public val outlineDefaultSolidSecondary: String = "outlineDefaultSolidSecondary"

    /**
     * light outline default outlineSolidTertiary
     */
    public val outlineDefaultSolidTertiary: String = "outlineDefaultSolidTertiary"

    /**
     * light outline default outlineSolidDefault
     */
    public val outlineDefaultSolidDefault: String = "outlineDefaultSolidDefault"

    /**
     * light outline onDark outlineSecondaryHover
     */
    public val outlineOnDarkSecondaryHover: String = "outlineOnDarkSecondaryHover"

    /**
     * light outline onDark outlineSecondaryActive
     */
    public val outlineOnDarkSecondaryActive: String = "outlineOnDarkSecondaryActive"

    /**
     * light outline onDark outlineTertiaryHover
     */
    public val outlineOnDarkTertiaryHover: String = "outlineOnDarkTertiaryHover"

    /**
     * light outline onDark outlineTertiaryActive
     */
    public val outlineOnDarkTertiaryActive: String = "outlineOnDarkTertiaryActive"

    /**
     * light outline onDark outlineDefaultHover
     */
    public val outlineOnDarkDefaultHover: String = "outlineOnDarkDefaultHover"

    /**
     * light outline onDark outlineDefaultActive
     */
    public val outlineOnDarkDefaultActive: String = "outlineOnDarkDefaultActive"

    /**
     * light outline onDark outlineTransparentPrimary
     */
    public val outlineOnDarkTransparentPrimary: String = "outlineOnDarkTransparentPrimary"

    /**
     * light outline onDark outlineTransparentPrimaryHover
     */
    public val outlineOnDarkTransparentPrimaryHover: String = "outlineOnDarkTransparentPrimaryHover"

    /**
     * light outline onDark outlineTransparentPrimaryActive
     */
    public val outlineOnDarkTransparentPrimaryActive: String =
        "outlineOnDarkTransparentPrimaryActive"

    /**
     * light outline onDark outlineTransparentSecondary
     */
    public val outlineOnDarkTransparentSecondary: String = "outlineOnDarkTransparentSecondary"

    /**
     * light outline onDark outlineTransparentSecondaryHover
     */
    public val outlineOnDarkTransparentSecondaryHover: String =
        "outlineOnDarkTransparentSecondaryHover"

    /**
     * light outline onDark outlineTransparentSecondaryActive
     */
    public val outlineOnDarkTransparentSecondaryActive: String =
        "outlineOnDarkTransparentSecondaryActive"

    /**
     * light outline onDark outlineTransparentTertiary
     */
    public val outlineOnDarkTransparentTertiary: String = "outlineOnDarkTransparentTertiary"

    /**
     * light outline onDark outlineTransparentTertiaryHover
     */
    public val outlineOnDarkTransparentTertiaryHover: String =
        "outlineOnDarkTransparentTertiaryHover"

    /**
     * light outline onDark outlineTransparentTertiaryActive
     */
    public val outlineOnDarkTransparentTertiaryActive: String =
        "outlineOnDarkTransparentTertiaryActive"

    /**
     * light outline onDark outlineAccent
     */
    public val outlineOnDarkAccent: String = "outlineOnDarkAccent"

    /**
     * light outline onDark outlineAccentHover
     */
    public val outlineOnDarkAccentHover: String = "outlineOnDarkAccentHover"

    /**
     * light outline onDark outlineAccentActive
     */
    public val outlineOnDarkAccentActive: String = "outlineOnDarkAccentActive"

    /**
     * light outline onDark outlineAccentMinor
     */
    public val outlineOnDarkAccentMinor: String = "outlineOnDarkAccentMinor"

    /**
     * light outline onDark outlineAccentMinorHover
     */
    public val outlineOnDarkAccentMinorHover: String = "outlineOnDarkAccentMinorHover"

    /**
     * light outline onDark outlineAccentMinorActive
     */
    public val outlineOnDarkAccentMinorActive: String = "outlineOnDarkAccentMinorActive"

    /**
     * light outline onDark outlineTransparentAccent
     */
    public val outlineOnDarkTransparentAccent: String = "outlineOnDarkTransparentAccent"

    /**
     * light outline onDark outlineTransparentAccentHover
     */
    public val outlineOnDarkTransparentAccentHover: String = "outlineOnDarkTransparentAccentHover"

    /**
     * light outline onDark outlineTransparentAccentActive
     */
    public val outlineOnDarkTransparentAccentActive: String = "outlineOnDarkTransparentAccentActive"

    /**
     * light outline onDark outlinePositive
     */
    public val outlineOnDarkPositive: String = "outlineOnDarkPositive"

    /**
     * light outline onDark outlinePositiveHover
     */
    public val outlineOnDarkPositiveHover: String = "outlineOnDarkPositiveHover"

    /**
     * light outline onDark outlinePositiveActive
     */
    public val outlineOnDarkPositiveActive: String = "outlineOnDarkPositiveActive"

    /**
     * light outline onDark outlineWarning
     */
    public val outlineOnDarkWarning: String = "outlineOnDarkWarning"

    /**
     * light outline onDark outlineWarningHover
     */
    public val outlineOnDarkWarningHover: String = "outlineOnDarkWarningHover"

    /**
     * light outline onDark outlineWarningActive
     */
    public val outlineOnDarkWarningActive: String = "outlineOnDarkWarningActive"

    /**
     * light outline onDark outlineNegative
     */
    public val outlineOnDarkNegative: String = "outlineOnDarkNegative"

    /**
     * light outline onDark outlineNegativeHover
     */
    public val outlineOnDarkNegativeHover: String = "outlineOnDarkNegativeHover"

    /**
     * light outline onDark outlineNegativeActive
     */
    public val outlineOnDarkNegativeActive: String = "outlineOnDarkNegativeActive"

    /**
     * light outline onDark outlineInfoHover
     */
    public val outlineOnDarkInfoHover: String = "outlineOnDarkInfoHover"

    /**
     * light outline onDark outlineInfoActive
     */
    public val outlineOnDarkInfoActive: String = "outlineOnDarkInfoActive"

    /**
     * light outline onDark outlinePositiveMinor
     */
    public val outlineOnDarkPositiveMinor: String = "outlineOnDarkPositiveMinor"

    /**
     * light outline onDark outlinePositiveMinorHover
     */
    public val outlineOnDarkPositiveMinorHover: String = "outlineOnDarkPositiveMinorHover"

    /**
     * light outline onDark outlinePositiveMinorActive
     */
    public val outlineOnDarkPositiveMinorActive: String = "outlineOnDarkPositiveMinorActive"

    /**
     * light outline onDark outlineWarningMinor
     */
    public val outlineOnDarkWarningMinor: String = "outlineOnDarkWarningMinor"

    /**
     * light outline onDark outlineWarningMinorHover
     */
    public val outlineOnDarkWarningMinorHover: String = "outlineOnDarkWarningMinorHover"

    /**
     * light outline onDark outlineWarningMinorActive
     */
    public val outlineOnDarkWarningMinorActive: String = "outlineOnDarkWarningMinorActive"

    /**
     * light outline onDark outlineNegativeMinor
     */
    public val outlineOnDarkNegativeMinor: String = "outlineOnDarkNegativeMinor"

    /**
     * light outline onDark outlineNegativeMinorHover
     */
    public val outlineOnDarkNegativeMinorHover: String = "outlineOnDarkNegativeMinorHover"

    /**
     * light outline onDark outlineNegativeMinorActive
     */
    public val outlineOnDarkNegativeMinorActive: String = "outlineOnDarkNegativeMinorActive"

    /**
     * light outline onDark outlineInfoMinorHover
     */
    public val outlineOnDarkInfoMinorHover: String = "outlineOnDarkInfoMinorHover"

    /**
     * light outline onDark outlineInfoMinorActive
     */
    public val outlineOnDarkInfoMinorActive: String = "outlineOnDarkInfoMinorActive"

    /**
     * light outline onDark outlineTransparentPositive
     */
    public val outlineOnDarkTransparentPositive: String = "outlineOnDarkTransparentPositive"

    /**
     * light outline onDark outlineTransparentPositiveHover
     */
    public val outlineOnDarkTransparentPositiveHover: String =
        "outlineOnDarkTransparentPositiveHover"

    /**
     * light outline onDark outlineTransparentPositiveActive
     */
    public val outlineOnDarkTransparentPositiveActive: String =
        "outlineOnDarkTransparentPositiveActive"

    /**
     * light outline onDark outlineTransparentWarning
     */
    public val outlineOnDarkTransparentWarning: String = "outlineOnDarkTransparentWarning"

    /**
     * light outline onDark outlineTransparentWarningHover
     */
    public val outlineOnDarkTransparentWarningHover: String = "outlineOnDarkTransparentWarningHover"

    /**
     * light outline onDark outlineTransparentWarningActive
     */
    public val outlineOnDarkTransparentWarningActive: String =
        "outlineOnDarkTransparentWarningActive"

    /**
     * light outline onDark outlineNegativeTransparent
     */
    public val outlineOnDarkNegativeTransparent: String = "outlineOnDarkNegativeTransparent"

    /**
     * light outline onDark outlineNegativeTransparentHover
     */
    public val outlineOnDarkNegativeTransparentHover: String =
        "outlineOnDarkNegativeTransparentHover"

    /**
     * light outline onDark outlineNegativeTransparentActive
     */
    public val outlineOnDarkNegativeTransparentActive: String =
        "outlineOnDarkNegativeTransparentActive"

    /**
     * light outline onDark outlineTransparentInfoHover
     */
    public val outlineOnDarkTransparentInfoHover: String = "outlineOnDarkTransparentInfoHover"

    /**
     * light outline onDark outlineTransparentInfoActive
     */
    public val outlineOnDarkTransparentInfoActive: String = "outlineOnDarkTransparentInfoActive"

    /**
     * light outline onDark outlinePrimaryHover
     */
    public val outlineOnDarkPrimaryHover: String = "outlineOnDarkPrimaryHover"

    /**
     * light outline onDark outlinePrimaryActive
     */
    public val outlineOnDarkPrimaryActive: String = "outlineOnDarkPrimaryActive"

    /**
     * light outline onDark outlineInfo
     */
    public val outlineOnDarkInfo: String = "outlineOnDarkInfo"

    /**
     * light outline onDark outlineInfoMinor
     */
    public val outlineOnDarkInfoMinor: String = "outlineOnDarkInfoMinor"

    /**
     * light outline onDark outlineTransparentInfo
     */
    public val outlineOnDarkTransparentInfo: String = "outlineOnDarkTransparentInfo"

    /**
     * light outline onDark outlineSolidPrimary
     */
    public val outlineOnDarkSolidPrimary: String = "outlineOnDarkSolidPrimary"

    /**
     * light outline onDark outlineSolidPrimaryHover
     */
    public val outlineOnDarkSolidPrimaryHover: String = "outlineOnDarkSolidPrimaryHover"

    /**
     * light outline onDark outlineSolidPrimaryActive
     */
    public val outlineOnDarkSolidPrimaryActive: String = "outlineOnDarkSolidPrimaryActive"

    /**
     * light outline onDark outlineSolidSecondary
     */
    public val outlineOnDarkSolidSecondary: String = "outlineOnDarkSolidSecondary"

    /**
     * light outline onDark outlineSolidSecondaryHover
     */
    public val outlineOnDarkSolidSecondaryHover: String = "outlineOnDarkSolidSecondaryHover"

    /**
     * light outline onDark outlineSolidSecondaryActive
     */
    public val outlineOnDarkSolidSecondaryActive: String = "outlineOnDarkSolidSecondaryActive"

    /**
     * light outline onDark outlineSolidTertiary
     */
    public val outlineOnDarkSolidTertiary: String = "outlineOnDarkSolidTertiary"

    /**
     * light outline onDark outlineSolidTertiaryHover
     */
    public val outlineOnDarkSolidTertiaryHover: String = "outlineOnDarkSolidTertiaryHover"

    /**
     * light outline onDark outlineSolidTertiaryActive
     */
    public val outlineOnDarkSolidTertiaryActive: String = "outlineOnDarkSolidTertiaryActive"

    /**
     * light outline onDark outlineSolidDefault
     */
    public val outlineOnDarkSolidDefault: String = "outlineOnDarkSolidDefault"

    /**
     * light outline onDark outlineSolidDefaultHover
     */
    public val outlineOnDarkSolidDefaultHover: String = "outlineOnDarkSolidDefaultHover"

    /**
     * light outline onDark outlineSolidDefaultActive
     */
    public val outlineOnDarkSolidDefaultActive: String = "outlineOnDarkSolidDefaultActive"

    /**
     * light outline onLight outlineSecondaryHover
     */
    public val outlineOnLightSecondaryHover: String = "outlineOnLightSecondaryHover"

    /**
     * light outline onLight outlineSecondaryActive
     */
    public val outlineOnLightSecondaryActive: String = "outlineOnLightSecondaryActive"

    /**
     * light outline onLight outlineTertiaryHover
     */
    public val outlineOnLightTertiaryHover: String = "outlineOnLightTertiaryHover"

    /**
     * light outline onLight outlineTertiaryActive
     */
    public val outlineOnLightTertiaryActive: String = "outlineOnLightTertiaryActive"

    /**
     * light outline onLight outlineDefaultHover
     */
    public val outlineOnLightDefaultHover: String = "outlineOnLightDefaultHover"

    /**
     * light outline onLight outlineDefaultActive
     */
    public val outlineOnLightDefaultActive: String = "outlineOnLightDefaultActive"

    /**
     * light outline onLight outlineTransparentPrimary
     */
    public val outlineOnLightTransparentPrimary: String = "outlineOnLightTransparentPrimary"

    /**
     * light outline onLight outlineTransparentPrimaryHover
     */
    public val outlineOnLightTransparentPrimaryHover: String =
        "outlineOnLightTransparentPrimaryHover"

    /**
     * light outline onLight outlineTransparentPrimaryActive
     */
    public val outlineOnLightTransparentPrimaryActive: String =
        "outlineOnLightTransparentPrimaryActive"

    /**
     * light outline onLight outlineTransparentSecondary
     */
    public val outlineOnLightTransparentSecondary: String = "outlineOnLightTransparentSecondary"

    /**
     * light outline onLight outlineTransparentSecondaryHover
     */
    public val outlineOnLightTransparentSecondaryHover: String =
        "outlineOnLightTransparentSecondaryHover"

    /**
     * light outline onLight outlineTransparentSecondaryActive
     */
    public val outlineOnLightTransparentSecondaryActive: String =
        "outlineOnLightTransparentSecondaryActive"

    /**
     * light outline onLight outlineTransparentTertiary
     */
    public val outlineOnLightTransparentTertiary: String = "outlineOnLightTransparentTertiary"

    /**
     * light outline onLight outlineTransparentTertiaryHover
     */
    public val outlineOnLightTransparentTertiaryHover: String =
        "outlineOnLightTransparentTertiaryHover"

    /**
     * light outline onLight outlineTransparentTertiaryActive
     */
    public val outlineOnLightTransparentTertiaryActive: String =
        "outlineOnLightTransparentTertiaryActive"

    /**
     * light outline onLight outlineAccent
     */
    public val outlineOnLightAccent: String = "outlineOnLightAccent"

    /**
     * light outline onLight outlineAccentHover
     */
    public val outlineOnLightAccentHover: String = "outlineOnLightAccentHover"

    /**
     * light outline onLight outlineAccentActive
     */
    public val outlineOnLightAccentActive: String = "outlineOnLightAccentActive"

    /**
     * light outline onLight outlineAccentMinor
     */
    public val outlineOnLightAccentMinor: String = "outlineOnLightAccentMinor"

    /**
     * light outline onLight outlineAccentMinorHover
     */
    public val outlineOnLightAccentMinorHover: String = "outlineOnLightAccentMinorHover"

    /**
     * light outline onLight outlineAccentMinorActive
     */
    public val outlineOnLightAccentMinorActive: String = "outlineOnLightAccentMinorActive"

    /**
     * light outline onLight outlineTransparentAccent
     */
    public val outlineOnLightTransparentAccent: String = "outlineOnLightTransparentAccent"

    /**
     * light outline onLight outlineTransparentAccentHover
     */
    public val outlineOnLightTransparentAccentHover: String = "outlineOnLightTransparentAccentHover"

    /**
     * light outline onLight outlineTransparentAccentActive
     */
    public val outlineOnLightTransparentAccentActive: String =
        "outlineOnLightTransparentAccentActive"

    /**
     * light outline onLight outlinePositive
     */
    public val outlineOnLightPositive: String = "outlineOnLightPositive"

    /**
     * light outline onLight outlinePositiveHover
     */
    public val outlineOnLightPositiveHover: String = "outlineOnLightPositiveHover"

    /**
     * light outline onLight outlinePositiveActive
     */
    public val outlineOnLightPositiveActive: String = "outlineOnLightPositiveActive"

    /**
     * light outline onLight outlineWarning
     */
    public val outlineOnLightWarning: String = "outlineOnLightWarning"

    /**
     * light outline onLight outlineWarningHover
     */
    public val outlineOnLightWarningHover: String = "outlineOnLightWarningHover"

    /**
     * light outline onLight outlineWarningActive
     */
    public val outlineOnLightWarningActive: String = "outlineOnLightWarningActive"

    /**
     * light outline onLight outlineNegative
     */
    public val outlineOnLightNegative: String = "outlineOnLightNegative"

    /**
     * light outline onLight outlineNegativeHover
     */
    public val outlineOnLightNegativeHover: String = "outlineOnLightNegativeHover"

    /**
     * light outline onLight outlineNegativeActive
     */
    public val outlineOnLightNegativeActive: String = "outlineOnLightNegativeActive"

    /**
     * light outline onLight outlineInfoHover
     */
    public val outlineOnLightInfoHover: String = "outlineOnLightInfoHover"

    /**
     * light outline onLight outlineInfoActive
     */
    public val outlineOnLightInfoActive: String = "outlineOnLightInfoActive"

    /**
     * light outline onLight outlinePositiveMinor
     */
    public val outlineOnLightPositiveMinor: String = "outlineOnLightPositiveMinor"

    /**
     * light outline onLight outlinePositiveMinorHover
     */
    public val outlineOnLightPositiveMinorHover: String = "outlineOnLightPositiveMinorHover"

    /**
     * light outline onLight outlinePositiveMinorActive
     */
    public val outlineOnLightPositiveMinorActive: String = "outlineOnLightPositiveMinorActive"

    /**
     * light outline onLight outlineWarningMinor
     */
    public val outlineOnLightWarningMinor: String = "outlineOnLightWarningMinor"

    /**
     * light outline onLight outlineWarningMinorHover
     */
    public val outlineOnLightWarningMinorHover: String = "outlineOnLightWarningMinorHover"

    /**
     * light outline onLight outlineWarningMinorActive
     */
    public val outlineOnLightWarningMinorActive: String = "outlineOnLightWarningMinorActive"

    /**
     * light outline onLight outlineNegativeMinor
     */
    public val outlineOnLightNegativeMinor: String = "outlineOnLightNegativeMinor"

    /**
     * light outline onLight outlineNegativeMinorHover
     */
    public val outlineOnLightNegativeMinorHover: String = "outlineOnLightNegativeMinorHover"

    /**
     * light outline onLight outlineNegativeMinorActive
     */
    public val outlineOnLightNegativeMinorActive: String = "outlineOnLightNegativeMinorActive"

    /**
     * light outline onLight outlineInfoMinorHover
     */
    public val outlineOnLightInfoMinorHover: String = "outlineOnLightInfoMinorHover"

    /**
     * light outline onLight outlineInfoMinorActive
     */
    public val outlineOnLightInfoMinorActive: String = "outlineOnLightInfoMinorActive"

    /**
     * light outline onLight outlineTransparentPositive
     */
    public val outlineOnLightTransparentPositive: String = "outlineOnLightTransparentPositive"

    /**
     * light outline onLight outlineTransparentPositiveHover
     */
    public val outlineOnLightTransparentPositiveHover: String =
        "outlineOnLightTransparentPositiveHover"

    /**
     * light outline onLight outlineTransparentPositiveActive
     */
    public val outlineOnLightTransparentPositiveActive: String =
        "outlineOnLightTransparentPositiveActive"

    /**
     * light outline onLight outlineTransparentWarning
     */
    public val outlineOnLightTransparentWarning: String = "outlineOnLightTransparentWarning"

    /**
     * light outline onLight outlineTransparentWarningHover
     */
    public val outlineOnLightTransparentWarningHover: String =
        "outlineOnLightTransparentWarningHover"

    /**
     * light outline onLight outlineTransparentWarningActive
     */
    public val outlineOnLightTransparentWarningActive: String =
        "outlineOnLightTransparentWarningActive"

    /**
     * light outline onLight outlineNegativeTransparent
     */
    public val outlineOnLightNegativeTransparent: String = "outlineOnLightNegativeTransparent"

    /**
     * light outline onLight outlineNegativeTransparentHover
     */
    public val outlineOnLightNegativeTransparentHover: String =
        "outlineOnLightNegativeTransparentHover"

    /**
     * light outline onLight outlineNegativeTransparentActive
     */
    public val outlineOnLightNegativeTransparentActive: String =
        "outlineOnLightNegativeTransparentActive"

    /**
     * light outline onLight outlineTransparentInfoHover
     */
    public val outlineOnLightTransparentInfoHover: String = "outlineOnLightTransparentInfoHover"

    /**
     * light outline onLight outlineTransparentInfoActive
     */
    public val outlineOnLightTransparentInfoActive: String = "outlineOnLightTransparentInfoActive"

    /**
     * light outline onLight outlinePrimaryHover
     */
    public val outlineOnLightPrimaryHover: String = "outlineOnLightPrimaryHover"

    /**
     * light outline onLight outlinePrimaryActive
     */
    public val outlineOnLightPrimaryActive: String = "outlineOnLightPrimaryActive"

    /**
     * light outline onLight outlineInfo
     */
    public val outlineOnLightInfo: String = "outlineOnLightInfo"

    /**
     * light outline onLight outlineInfoMinor
     */
    public val outlineOnLightInfoMinor: String = "outlineOnLightInfoMinor"

    /**
     * light outline onLight outlineTransparentInfo
     */
    public val outlineOnLightTransparentInfo: String = "outlineOnLightTransparentInfo"

    /**
     * light outline onLight outlineSolidTertiaryHover
     */
    public val outlineOnLightSolidTertiaryHover: String = "outlineOnLightSolidTertiaryHover"

    /**
     * light outline onLight outlineSolidTertiaryActive
     */
    public val outlineOnLightSolidTertiaryActive: String = "outlineOnLightSolidTertiaryActive"

    /**
     * light outline onLight outlineSolidDefaultHover
     */
    public val outlineOnLightSolidDefaultHover: String = "outlineOnLightSolidDefaultHover"

    /**
     * light outline onLight outlineSolidDefaultActive
     */
    public val outlineOnLightSolidDefaultActive: String = "outlineOnLightSolidDefaultActive"

    /**
     * light outline onLight outlineSolidPrimaryHover
     */
    public val outlineOnLightSolidPrimaryHover: String = "outlineOnLightSolidPrimaryHover"

    /**
     * light outline onLight outlineSolidPrimaryActive
     */
    public val outlineOnLightSolidPrimaryActive: String = "outlineOnLightSolidPrimaryActive"

    /**
     * light outline onLight outlineSolidSecondaryHover
     */
    public val outlineOnLightSolidSecondaryHover: String = "outlineOnLightSolidSecondaryHover"

    /**
     * light outline onLight outlineSolidSecondaryActive
     */
    public val outlineOnLightSolidSecondaryActive: String = "outlineOnLightSolidSecondaryActive"

    /**
     * light outline onLight outlineSolidPrimary
     */
    public val outlineOnLightSolidPrimary: String = "outlineOnLightSolidPrimary"

    /**
     * light outline onLight outlineSolidSecondary
     */
    public val outlineOnLightSolidSecondary: String = "outlineOnLightSolidSecondary"

    /**
     * light outline onLight outlineSolidTertiary
     */
    public val outlineOnLightSolidTertiary: String = "outlineOnLightSolidTertiary"

    /**
     * light outline onLight outlineSolidDefault
     */
    public val outlineOnLightSolidDefault: String = "outlineOnLightSolidDefault"

    /**
     * light outline inverse outlinePrimaryHover
     */
    public val outlineInversePrimaryHover: String = "outlineInversePrimaryHover"

    /**
     * light outline inverse outlinePrimaryActive
     */
    public val outlineInversePrimaryActive: String = "outlineInversePrimaryActive"

    /**
     * light outline inverse outlineSecondaryHover
     */
    public val outlineInverseSecondaryHover: String = "outlineInverseSecondaryHover"

    /**
     * light outline inverse outlineSecondaryActive
     */
    public val outlineInverseSecondaryActive: String = "outlineInverseSecondaryActive"

    /**
     * light outline inverse outlineTertiaryHover
     */
    public val outlineInverseTertiaryHover: String = "outlineInverseTertiaryHover"

    /**
     * light outline inverse outlineTertiaryActive
     */
    public val outlineInverseTertiaryActive: String = "outlineInverseTertiaryActive"

    /**
     * light outline inverse outlineDefaultHover
     */
    public val outlineInverseDefaultHover: String = "outlineInverseDefaultHover"

    /**
     * light outline inverse outlineDefaultActive
     */
    public val outlineInverseDefaultActive: String = "outlineInverseDefaultActive"

    /**
     * light outline inverse outlineTransparentPrimaryHover
     */
    public val outlineInverseTransparentPrimaryHover: String =
        "outlineInverseTransparentPrimaryHover"

    /**
     * light outline inverse outlineTransparentPrimaryActive
     */
    public val outlineInverseTransparentPrimaryActive: String =
        "outlineInverseTransparentPrimaryActive"

    /**
     * light outline inverse outlineTransparentSecondaryHover
     */
    public val outlineInverseTransparentSecondaryHover: String =
        "outlineInverseTransparentSecondaryHover"

    /**
     * light outline inverse outlineTransparentSecondaryActive
     */
    public val outlineInverseTransparentSecondaryActive: String =
        "outlineInverseTransparentSecondaryActive"

    /**
     * light outline inverse outlineTransparentTertiaryHover
     */
    public val outlineInverseTransparentTertiaryHover: String =
        "outlineInverseTransparentTertiaryHover"

    /**
     * light outline inverse outlineTransparentTertiaryActive
     */
    public val outlineInverseTransparentTertiaryActive: String =
        "outlineInverseTransparentTertiaryActive"

    /**
     * light outline inverse outlineTransparentClearHover
     */
    public val outlineInverseTransparentClearHover: String = "outlineInverseTransparentClearHover"

    /**
     * light outline inverse outlineTransparentClearActive
     */
    public val outlineInverseTransparentClearActive: String = "outlineInverseTransparentClearActive"

    /**
     * light outline inverse outlineAccentHover
     */
    public val outlineInverseAccentHover: String = "outlineInverseAccentHover"

    /**
     * light outline inverse outlineAccentActive
     */
    public val outlineInverseAccentActive: String = "outlineInverseAccentActive"

    /**
     * light outline inverse outlineAccentMinorHover
     */
    public val outlineInverseAccentMinorHover: String = "outlineInverseAccentMinorHover"

    /**
     * light outline inverse outlineAccentMinorActive
     */
    public val outlineInverseAccentMinorActive: String = "outlineInverseAccentMinorActive"

    /**
     * light outline inverse outlineTransparentAccentHover
     */
    public val outlineInverseTransparentAccentHover: String = "outlineInverseTransparentAccentHover"

    /**
     * light outline inverse outlineTransparentAccentActive
     */
    public val outlineInverseTransparentAccentActive: String =
        "outlineInverseTransparentAccentActive"

    /**
     * light outline inverse outlinePositiveHover
     */
    public val outlineInversePositiveHover: String = "outlineInversePositiveHover"

    /**
     * light outline inverse outlinePositiveActive
     */
    public val outlineInversePositiveActive: String = "outlineInversePositiveActive"

    /**
     * light outline inverse outlineWarningHover
     */
    public val outlineInverseWarningHover: String = "outlineInverseWarningHover"

    /**
     * light outline inverse outlineWarningActive
     */
    public val outlineInverseWarningActive: String = "outlineInverseWarningActive"

    /**
     * light outline inverse outlineNegativeHover
     */
    public val outlineInverseNegativeHover: String = "outlineInverseNegativeHover"

    /**
     * light outline inverse outlineNegativeActive
     */
    public val outlineInverseNegativeActive: String = "outlineInverseNegativeActive"

    /**
     * light outline inverse outlineInfoHover
     */
    public val outlineInverseInfoHover: String = "outlineInverseInfoHover"

    /**
     * light outline inverse outlineInfoActive
     */
    public val outlineInverseInfoActive: String = "outlineInverseInfoActive"

    /**
     * light outline inverse outlinePositiveMinorHover
     */
    public val outlineInversePositiveMinorHover: String = "outlineInversePositiveMinorHover"

    /**
     * light outline inverse outlinePositiveMinorActive
     */
    public val outlineInversePositiveMinorActive: String = "outlineInversePositiveMinorActive"

    /**
     * light outline inverse outlineWarningMinorHover
     */
    public val outlineInverseWarningMinorHover: String = "outlineInverseWarningMinorHover"

    /**
     * light outline inverse outlineWarningMinorActive
     */
    public val outlineInverseWarningMinorActive: String = "outlineInverseWarningMinorActive"

    /**
     * light outline inverse outlineNegativeMinorHover
     */
    public val outlineInverseNegativeMinorHover: String = "outlineInverseNegativeMinorHover"

    /**
     * light outline inverse outlineNegativeMinorActive
     */
    public val outlineInverseNegativeMinorActive: String = "outlineInverseNegativeMinorActive"

    /**
     * light outline inverse outlineInfoMinorHover
     */
    public val outlineInverseInfoMinorHover: String = "outlineInverseInfoMinorHover"

    /**
     * light outline inverse outlineInfoMinorActive
     */
    public val outlineInverseInfoMinorActive: String = "outlineInverseInfoMinorActive"

    /**
     * light outline inverse outlineTransparentPositiveHover
     */
    public val outlineInverseTransparentPositiveHover: String =
        "outlineInverseTransparentPositiveHover"

    /**
     * light outline inverse outlineTransparentPositiveActive
     */
    public val outlineInverseTransparentPositiveActive: String =
        "outlineInverseTransparentPositiveActive"

    /**
     * light outline inverse outlineTransparentWarningHover
     */
    public val outlineInverseTransparentWarningHover: String =
        "outlineInverseTransparentWarningHover"

    /**
     * light outline inverse outlineTransparentWarningActive
     */
    public val outlineInverseTransparentWarningActive: String =
        "outlineInverseTransparentWarningActive"

    /**
     * light outline inverse outlineTransparentNegativeHover
     */
    public val outlineInverseTransparentNegativeHover: String =
        "outlineInverseTransparentNegativeHover"

    /**
     * light outline inverse outlineTransparentNegativeActive
     */
    public val outlineInverseTransparentNegativeActive: String =
        "outlineInverseTransparentNegativeActive"

    /**
     * light outline inverse outlineTransparentInfoHover
     */
    public val outlineInverseTransparentInfoHover: String = "outlineInverseTransparentInfoHover"

    /**
     * light outline inverse outlineTransparentInfoActive
     */
    public val outlineInverseTransparentInfoActive: String = "outlineInverseTransparentInfoActive"

    /**
     * light outline inverse outlineTransparentPrimary
     */
    public val outlineInverseTransparentPrimary: String = "outlineInverseTransparentPrimary"

    /**
     * light outline inverse outlineTransparentSecondary
     */
    public val outlineInverseTransparentSecondary: String = "outlineInverseTransparentSecondary"

    /**
     * light outline inverse outlineTransparentTertiary
     */
    public val outlineInverseTransparentTertiary: String = "outlineInverseTransparentTertiary"

    /**
     * light outline inverse outlineTransparentClear
     */
    public val outlineInverseTransparentClear: String = "outlineInverseTransparentClear"

    /**
     * light outline inverse outlineAccent
     */
    public val outlineInverseAccent: String = "outlineInverseAccent"

    /**
     * light outline inverse outlineAccentMinor
     */
    public val outlineInverseAccentMinor: String = "outlineInverseAccentMinor"

    /**
     * light outline inverse outlineTransparentAccent
     */
    public val outlineInverseTransparentAccent: String = "outlineInverseTransparentAccent"

    /**
     * light outline inverse outlinePositive
     */
    public val outlineInversePositive: String = "outlineInversePositive"

    /**
     * light outline inverse outlineWarning
     */
    public val outlineInverseWarning: String = "outlineInverseWarning"

    /**
     * light outline inverse outlineNegative
     */
    public val outlineInverseNegative: String = "outlineInverseNegative"

    /**
     * light outline inverse outlineInfo
     */
    public val outlineInverseInfo: String = "outlineInverseInfo"

    /**
     * light outline inverse outlinePositiveMinor
     */
    public val outlineInversePositiveMinor: String = "outlineInversePositiveMinor"

    /**
     * light outline inverse outlineWarningMinor
     */
    public val outlineInverseWarningMinor: String = "outlineInverseWarningMinor"

    /**
     * light outline inverse outlineNegativeMinor
     */
    public val outlineInverseNegativeMinor: String = "outlineInverseNegativeMinor"

    /**
     * light outline inverse outlineInfoMinor
     */
    public val outlineInverseInfoMinor: String = "outlineInverseInfoMinor"

    /**
     * light outline inverse outlineTransparentPositive
     */
    public val outlineInverseTransparentPositive: String = "outlineInverseTransparentPositive"

    /**
     * light outline inverse outlineTransparentWarning
     */
    public val outlineInverseTransparentWarning: String = "outlineInverseTransparentWarning"

    /**
     * light outline inverse outlineTransparentNegative
     */
    public val outlineInverseTransparentNegative: String = "outlineInverseTransparentNegative"

    /**
     * light outline inverse outlineTransparentInfo
     */
    public val outlineInverseTransparentInfo: String = "outlineInverseTransparentInfo"

    /**
     * light outline inverse outlineSolidPrimaryHover
     */
    public val outlineInverseSolidPrimaryHover: String = "outlineInverseSolidPrimaryHover"

    /**
     * light outline inverse outlineSolidPrimaryActive
     */
    public val outlineInverseSolidPrimaryActive: String = "outlineInverseSolidPrimaryActive"

    /**
     * light outline inverse outlineSolidSecondaryHover
     */
    public val outlineInverseSolidSecondaryHover: String = "outlineInverseSolidSecondaryHover"

    /**
     * light outline inverse outlineSolidSecondaryActive
     */
    public val outlineInverseSolidSecondaryActive: String = "outlineInverseSolidSecondaryActive"

    /**
     * light outline inverse outlineSolidTertiaryHover
     */
    public val outlineInverseSolidTertiaryHover: String = "outlineInverseSolidTertiaryHover"

    /**
     * light outline inverse outlineSolidTertiaryActive
     */
    public val outlineInverseSolidTertiaryActive: String = "outlineInverseSolidTertiaryActive"

    /**
     * light outline inverse outlineSolidDefaultHover
     */
    public val outlineInverseSolidDefaultHover: String = "outlineInverseSolidDefaultHover"

    /**
     * light outline inverse outlineSolidDefaultActive
     */
    public val outlineInverseSolidDefaultActive: String = "outlineInverseSolidDefaultActive"

    /**
     * light outline inverse outlineSolidPrimary
     */
    public val outlineInverseSolidPrimary: String = "outlineInverseSolidPrimary"

    /**
     * light outline inverse outlineSolidSecondary
     */
    public val outlineInverseSolidSecondary: String = "outlineInverseSolidSecondary"

    /**
     * light outline inverse outlineSolidTertiary
     */
    public val outlineInverseSolidTertiary: String = "outlineInverseSolidTertiary"

    /**
     * light outline inverse outlineSolidDefault
     */
    public val outlineInverseSolidDefault: String = "outlineInverseSolidDefault"

    /**
     * Желтый цвет для данных
     */
    public val dataDefaultYellow: String = "dataDefaultYellow"

    /**
     * Желтый цвет для данных
     */
    public val dataDefaultYellowHover: String = "dataDefaultYellowHover"

    /**
     * Желтый цвет для данных
     */
    public val dataDefaultYellowActive: String = "dataDefaultYellowActive"

    /**
     * Минорный желтый цвет для данных
     */
    public val dataDefaultYellowMinor: String = "dataDefaultYellowMinor"

    /**
     * Минорный желтый цвет для данных
     */
    public val dataDefaultYellowMinorHover: String = "dataDefaultYellowMinorHover"

    /**
     * Минорный желтый цвет для данных
     */
    public val dataDefaultYellowMinorActive: String = "dataDefaultYellowMinorActive"

    /**
     * Прозрачный желтый цвет для данных
     */
    public val dataDefaultYellowTransparent: String = "dataDefaultYellowTransparent"

    /**
     * Прозрачный желтый цвет для данных
     */
    public val dataDefaultYellowTransparentHover: String = "dataDefaultYellowTransparentHover"

    /**
     * Прозрачный желтый цвет для данных
     */
    public val dataDefaultYellowTransparentActive: String = "dataDefaultYellowTransparentActive"

    /**
     * Желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellow: String = "dataOnDarkYellow"

    /**
     * Желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowHover: String = "dataOnDarkYellowHover"

    /**
     * Желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowActive: String = "dataOnDarkYellowActive"

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowMinor: String = "dataOnDarkYellowMinor"

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowMinorHover: String = "dataOnDarkYellowMinorHover"

    /**
     * Минорный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowMinorActive: String = "dataOnDarkYellowMinorActive"

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowTransparent: String = "dataOnDarkYellowTransparent"

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowTransparentHover: String = "dataOnDarkYellowTransparentHover"

    /**
     * Прозрачный желтый цвет для данных на темном фоне
     */
    public val dataOnDarkYellowTransparentActive: String = "dataOnDarkYellowTransparentActive"

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellow: String = "dataOnLightYellow"

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowHover: String = "dataOnLightYellowHover"

    /**
     * Желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowActive: String = "dataOnLightYellowActive"

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowMinor: String = "dataOnLightYellowMinor"

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowMinorHover: String = "dataOnLightYellowMinorHover"

    /**
     * Минорный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowMinorActive: String = "dataOnLightYellowMinorActive"

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowTransparent: String = "dataOnLightYellowTransparent"

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowTransparentHover: String = "dataOnLightYellowTransparentHover"

    /**
     * Прозрачный желтый цвет для данных на светлом фоне
     */
    public val dataOnLightYellowTransparentActive: String = "dataOnLightYellowTransparentActive"

    /**
     * Инвертированный желтый цвет для данных
     */
    public val dataInverseYellow: String = "dataInverseYellow"

    /**
     * Инвертированный желтый цвет для данных
     */
    public val dataInverseYellowHover: String = "dataInverseYellowHover"

    /**
     * Инвертированный желтый цвет для данных
     */
    public val dataInverseYellowActive: String = "dataInverseYellowActive"

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public val dataInverseYellowMinor: String = "dataInverseYellowMinor"

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public val dataInverseYellowMinorHover: String = "dataInverseYellowMinorHover"

    /**
     * Инвертированный минорный желтый цвет для данных
     */
    public val dataInverseYellowMinorActive: String = "dataInverseYellowMinorActive"

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public val dataInverseYellowTransparent: String = "dataInverseYellowTransparent"

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public val dataInverseYellowTransparentHover: String = "dataInverseYellowTransparentHover"

    /**
     * Инвертированный прозрачный желтый цвет для данных
     */
    public val dataInverseYellowTransparentActive: String = "dataInverseYellowTransparentActive"

    /**
     * Переопределяет аттрибут цвета.
     */
    public infix fun String.overrideBy(color: Color) {
        _overrideMap[this] = color
    }
}

internal val LocalPlasmaSdServiceColors: ProvidableCompositionLocal<PlasmaSdServiceColors> =
    staticCompositionLocalOf {
        lightPlasmaSdServiceColors()
    }

@Suppress("LongMethod")
internal fun PlasmaSdServiceColors.updateColorsFrom(other: PlasmaSdServiceColors) {
    textDefaultPrimary = other.textDefaultPrimary
    textDefaultPrimaryBrightness = other.textDefaultPrimaryBrightness
    textDefaultSecondary = other.textDefaultSecondary
    textDefaultTertiary = other.textDefaultTertiary
    textDefaultParagraph = other.textDefaultParagraph
    textDefaultAccent = other.textDefaultAccent
    textDefaultPositive = other.textDefaultPositive
    textDefaultWarning = other.textDefaultWarning
    textDefaultNegative = other.textDefaultNegative
    textDefaultAccentMinorHover = other.textDefaultAccentMinorHover
    textDefaultAccentMinorActive = other.textDefaultAccentMinorActive
    textDefaultInfoHover = other.textDefaultInfoHover
    textDefaultInfoActive = other.textDefaultInfoActive
    textDefaultPositiveMinorHover = other.textDefaultPositiveMinorHover
    textDefaultPositiveMinorActive = other.textDefaultPositiveMinorActive
    textDefaultWarningMinorHover = other.textDefaultWarningMinorHover
    textDefaultWarningMinorActive = other.textDefaultWarningMinorActive
    textDefaultNegativeMinorHover = other.textDefaultNegativeMinorHover
    textDefaultNegativeMinorActive = other.textDefaultNegativeMinorActive
    textDefaultInfoMinorHover = other.textDefaultInfoMinorHover
    textDefaultInfoMinorActive = other.textDefaultInfoMinorActive
    textDefaultAccentMinor = other.textDefaultAccentMinor
    textDefaultPositiveMinor = other.textDefaultPositiveMinor
    textDefaultWarningMinor = other.textDefaultWarningMinor
    textDefaultNegativeMinor = other.textDefaultNegativeMinor
    textDefaultInfo = other.textDefaultInfo
    textDefaultInfoMinor = other.textDefaultInfoMinor
    textDefaultPrimaryHover = other.textDefaultPrimaryHover
    textDefaultPrimaryActive = other.textDefaultPrimaryActive
    textDefaultSecondaryHover = other.textDefaultSecondaryHover
    textDefaultSecondaryActive = other.textDefaultSecondaryActive
    textDefaultTertiaryHover = other.textDefaultTertiaryHover
    textDefaultTertiaryActive = other.textDefaultTertiaryActive
    textDefaultParagraphHover = other.textDefaultParagraphHover
    textDefaultParagraphActive = other.textDefaultParagraphActive
    textDefaultAccentHover = other.textDefaultAccentHover
    textDefaultAccentActive = other.textDefaultAccentActive
    textDefaultPositiveHover = other.textDefaultPositiveHover
    textDefaultPositiveActive = other.textDefaultPositiveActive
    textDefaultWarningHover = other.textDefaultWarningHover
    textDefaultWarningActive = other.textDefaultWarningActive
    textDefaultNegativeHover = other.textDefaultNegativeHover
    textDefaultNegativeActive = other.textDefaultNegativeActive
    textOnDarkPrimary = other.textOnDarkPrimary
    textOnDarkPrimaryBrightness = other.textOnDarkPrimaryBrightness
    textOnDarkSecondary = other.textOnDarkSecondary
    textOnDarkTertiary = other.textOnDarkTertiary
    textOnDarkParagraph = other.textOnDarkParagraph
    textOnDarkAccent = other.textOnDarkAccent
    textOnDarkPositive = other.textOnDarkPositive
    textOnDarkWarning = other.textOnDarkWarning
    textOnDarkNegative = other.textOnDarkNegative
    textOnDarkAccentMinor = other.textOnDarkAccentMinor
    textOnDarkAccentMinorHover = other.textOnDarkAccentMinorHover
    textOnDarkAccentMinorActive = other.textOnDarkAccentMinorActive
    textOnDarkInfoHover = other.textOnDarkInfoHover
    textOnDarkInfoActive = other.textOnDarkInfoActive
    textOnDarkPositiveMinor = other.textOnDarkPositiveMinor
    textOnDarkPositiveMinorHover = other.textOnDarkPositiveMinorHover
    textOnDarkPositiveMinorActive = other.textOnDarkPositiveMinorActive
    textOnDarkWarningMinor = other.textOnDarkWarningMinor
    textOnDarkWarningMinorHover = other.textOnDarkWarningMinorHover
    textOnDarkWarningMinorActive = other.textOnDarkWarningMinorActive
    textOnDarkNegativeMinor = other.textOnDarkNegativeMinor
    textOnDarkNegativeMinorHover = other.textOnDarkNegativeMinorHover
    textOnDarkNegativeMinorActive = other.textOnDarkNegativeMinorActive
    textOnDarkInfoMinorHover = other.textOnDarkInfoMinorHover
    textOnDarkInfoMinorActive = other.textOnDarkInfoMinorActive
    textOnDarkInfoMinor = other.textOnDarkInfoMinor
    textOnDarkInfo = other.textOnDarkInfo
    textOnDarkPrimaryHover = other.textOnDarkPrimaryHover
    textOnDarkPrimaryActive = other.textOnDarkPrimaryActive
    textOnDarkSecondaryHover = other.textOnDarkSecondaryHover
    textOnDarkSecondaryActive = other.textOnDarkSecondaryActive
    textOnDarkTertiaryHover = other.textOnDarkTertiaryHover
    textOnDarkTertiaryActive = other.textOnDarkTertiaryActive
    textOnDarkParagraphHover = other.textOnDarkParagraphHover
    textOnDarkParagraphActive = other.textOnDarkParagraphActive
    textOnDarkAccentHover = other.textOnDarkAccentHover
    textOnDarkAccentActive = other.textOnDarkAccentActive
    textOnDarkPositiveHover = other.textOnDarkPositiveHover
    textOnDarkPositiveActive = other.textOnDarkPositiveActive
    textOnDarkWarningHover = other.textOnDarkWarningHover
    textOnDarkWarningActive = other.textOnDarkWarningActive
    textOnDarkNegativeHover = other.textOnDarkNegativeHover
    textOnDarkNegativeActive = other.textOnDarkNegativeActive
    textOnLightPrimary = other.textOnLightPrimary
    textOnLightPrimaryBrightness = other.textOnLightPrimaryBrightness
    textOnLightSecondary = other.textOnLightSecondary
    textOnLightTertiary = other.textOnLightTertiary
    textOnLightParagraph = other.textOnLightParagraph
    textOnLightAccent = other.textOnLightAccent
    textOnLightPositive = other.textOnLightPositive
    textOnLightWarning = other.textOnLightWarning
    textOnLightAccentMinor = other.textOnLightAccentMinor
    textOnLightAccentMinorHover = other.textOnLightAccentMinorHover
    textOnLightAccentMinorActive = other.textOnLightAccentMinorActive
    textOnLightInfoHover = other.textOnLightInfoHover
    textOnLightInfoActive = other.textOnLightInfoActive
    textOnLightPositiveMinor = other.textOnLightPositiveMinor
    textOnLightPositiveMinorHover = other.textOnLightPositiveMinorHover
    textOnLightPositiveMinorActive = other.textOnLightPositiveMinorActive
    textOnLightWarningMinor = other.textOnLightWarningMinor
    textOnLightWarningMinorHover = other.textOnLightWarningMinorHover
    textOnLightWarningMinorActive = other.textOnLightWarningMinorActive
    textOnLightNegativeMinor = other.textOnLightNegativeMinor
    textOnLightNegativeMinorHover = other.textOnLightNegativeMinorHover
    textOnLightNegativeMinorActive = other.textOnLightNegativeMinorActive
    textOnLightInfoMinorHover = other.textOnLightInfoMinorHover
    textOnLightInfoMinorActive = other.textOnLightInfoMinorActive
    textOnLightNegative = other.textOnLightNegative
    textOnLightNegativeHover = other.textOnLightNegativeHover
    textOnLightNegativeActive = other.textOnLightNegativeActive
    textOnLightInfo = other.textOnLightInfo
    textOnLightInfoMinor = other.textOnLightInfoMinor
    textOnLightPrimaryHover = other.textOnLightPrimaryHover
    textOnLightPrimaryActive = other.textOnLightPrimaryActive
    textOnLightSecondaryHover = other.textOnLightSecondaryHover
    textOnLightSecondaryActive = other.textOnLightSecondaryActive
    textOnLightTertiaryHover = other.textOnLightTertiaryHover
    textOnLightTertiaryActive = other.textOnLightTertiaryActive
    textOnLightParagraphHover = other.textOnLightParagraphHover
    textOnLightParagraphActive = other.textOnLightParagraphActive
    textOnLightAccentHover = other.textOnLightAccentHover
    textOnLightAccentActive = other.textOnLightAccentActive
    textOnLightPositiveHover = other.textOnLightPositiveHover
    textOnLightPositiveActive = other.textOnLightPositiveActive
    textOnLightWarningHover = other.textOnLightWarningHover
    textOnLightWarningActive = other.textOnLightWarningActive
    textInversePrimary = other.textInversePrimary
    textInversePrimaryBrightness = other.textInversePrimaryBrightness
    textInverseSecondary = other.textInverseSecondary
    textInverseTertiary = other.textInverseTertiary
    textInverseParagraph = other.textInverseParagraph
    textInversePositive = other.textInversePositive
    textInverseWarning = other.textInverseWarning
    textInverseNegative = other.textInverseNegative
    textInversePrimaryHover = other.textInversePrimaryHover
    textInversePrimaryActive = other.textInversePrimaryActive
    textInverseSecondaryHover = other.textInverseSecondaryHover
    textInverseSecondaryActive = other.textInverseSecondaryActive
    textInverseTertiaryHover = other.textInverseTertiaryHover
    textInverseTertiaryActive = other.textInverseTertiaryActive
    textInverseParagraphHover = other.textInverseParagraphHover
    textInverseParagraphActive = other.textInverseParagraphActive
    textInverseAccentHover = other.textInverseAccentHover
    textInverseAccentActive = other.textInverseAccentActive
    textInversePositiveHover = other.textInversePositiveHover
    textInversePositiveActive = other.textInversePositiveActive
    textInverseWarningHover = other.textInverseWarningHover
    textInverseWarningActive = other.textInverseWarningActive
    textInverseNegativeHover = other.textInverseNegativeHover
    textInverseNegativeActive = other.textInverseNegativeActive
    textInverseAccentMinor = other.textInverseAccentMinor
    textInverseAccentMinorHover = other.textInverseAccentMinorHover
    textInverseAccentMinorActive = other.textInverseAccentMinorActive
    textInverseInfoHover = other.textInverseInfoHover
    textInverseInfoActive = other.textInverseInfoActive
    textInversePositiveMinorHover = other.textInversePositiveMinorHover
    textInversePositiveMinorActive = other.textInversePositiveMinorActive
    textInverseWarningMinorHover = other.textInverseWarningMinorHover
    textInverseWarningMinorActive = other.textInverseWarningMinorActive
    textInverseNegativeMinorHover = other.textInverseNegativeMinorHover
    textInverseNegativeMinorActive = other.textInverseNegativeMinorActive
    textInverseInfoMinorHover = other.textInverseInfoMinorHover
    textInverseInfoMinorActive = other.textInverseInfoMinorActive
    textInverseAccent = other.textInverseAccent
    textInverseInfo = other.textInverseInfo
    textInversePositiveMinor = other.textInversePositiveMinor
    textInverseWarningMinor = other.textInverseWarningMinor
    textInverseNegativeMinor = other.textInverseNegativeMinor
    textInverseInfoMinor = other.textInverseInfoMinor
    surfaceDefaultSolidDefault = other.surfaceDefaultSolidDefault
    surfaceDefaultSolidPrimary = other.surfaceDefaultSolidPrimary
    surfaceDefaultSolidPrimaryBrightness = other.surfaceDefaultSolidPrimaryBrightness
    surfaceDefaultSolidSecondary = other.surfaceDefaultSolidSecondary
    surfaceDefaultSolidTertiary = other.surfaceDefaultSolidTertiary
    surfaceDefaultSolidCard = other.surfaceDefaultSolidCard
    surfaceDefaultSolidCardBrightness = other.surfaceDefaultSolidCardBrightness
    surfaceDefaultTransparentDefault = other.surfaceDefaultTransparentDefault
    surfaceDefaultTransparentPrimary = other.surfaceDefaultTransparentPrimary
    surfaceDefaultTransparentSecondary = other.surfaceDefaultTransparentSecondary
    surfaceDefaultTransparentTertiary = other.surfaceDefaultTransparentTertiary
    surfaceDefaultTransparentCard = other.surfaceDefaultTransparentCard
    surfaceDefaultTransparentCardBrightness = other.surfaceDefaultTransparentCardBrightness
    surfaceDefaultAccent = other.surfaceDefaultAccent
    surfaceDefaultPositive = other.surfaceDefaultPositive
    surfaceDefaultWarning = other.surfaceDefaultWarning
    surfaceDefaultNegative = other.surfaceDefaultNegative
    surfaceDefaultClear = other.surfaceDefaultClear
    surfaceDefaultTransparentDeep = other.surfaceDefaultTransparentDeep
    surfaceDefaultAccentMinorHover = other.surfaceDefaultAccentMinorHover
    surfaceDefaultAccentMinorActive = other.surfaceDefaultAccentMinorActive
    surfaceDefaultTransparentAccentHover = other.surfaceDefaultTransparentAccentHover
    surfaceDefaultTransparentAccentActive = other.surfaceDefaultTransparentAccentActive
    surfaceDefaultInfoHover = other.surfaceDefaultInfoHover
    surfaceDefaultInfoActive = other.surfaceDefaultInfoActive
    surfaceDefaultPositiveMinorHover = other.surfaceDefaultPositiveMinorHover
    surfaceDefaultPositiveMinorActive = other.surfaceDefaultPositiveMinorActive
    surfaceDefaultWarningMinorHover = other.surfaceDefaultWarningMinorHover
    surfaceDefaultWarningMinorActive = other.surfaceDefaultWarningMinorActive
    surfaceDefaultNegativeMinorHover = other.surfaceDefaultNegativeMinorHover
    surfaceDefaultNegativeMinorActive = other.surfaceDefaultNegativeMinorActive
    surfaceDefaultInfoMinorHover = other.surfaceDefaultInfoMinorHover
    surfaceDefaultInfoMinorActive = other.surfaceDefaultInfoMinorActive
    surfaceDefaultTransparentPositiveHover = other.surfaceDefaultTransparentPositiveHover
    surfaceDefaultTransparentPositiveActive = other.surfaceDefaultTransparentPositiveActive
    surfaceDefaultTransparentWarningHover = other.surfaceDefaultTransparentWarningHover
    surfaceDefaultTransparentWarningActive = other.surfaceDefaultTransparentWarningActive
    surfaceDefaultTransparentNegativeHover = other.surfaceDefaultTransparentNegativeHover
    surfaceDefaultTransparentNegativeActive = other.surfaceDefaultTransparentNegativeActive
    surfaceDefaultTransparentInfoHover = other.surfaceDefaultTransparentInfoHover
    surfaceDefaultTransparentInfoActive = other.surfaceDefaultTransparentInfoActive
    surfaceDefaultAccentMinor = other.surfaceDefaultAccentMinor
    surfaceDefaultTransparentAccent = other.surfaceDefaultTransparentAccent
    surfaceDefaultPositiveMinor = other.surfaceDefaultPositiveMinor
    surfaceDefaultWarningMinor = other.surfaceDefaultWarningMinor
    surfaceDefaultNegativeMinor = other.surfaceDefaultNegativeMinor
    surfaceDefaultTransparentPositive = other.surfaceDefaultTransparentPositive
    surfaceDefaultTransparentWarning = other.surfaceDefaultTransparentWarning
    surfaceDefaultTransparentNegative = other.surfaceDefaultTransparentNegative
    surfaceDefaultInfo = other.surfaceDefaultInfo
    surfaceDefaultInfoMinor = other.surfaceDefaultInfoMinor
    surfaceDefaultTransparentInfo = other.surfaceDefaultTransparentInfo
    surfaceDefaultSolidDefaultHover = other.surfaceDefaultSolidDefaultHover
    surfaceDefaultSolidDefaultActive = other.surfaceDefaultSolidDefaultActive
    surfaceDefaultSolidPrimaryHover = other.surfaceDefaultSolidPrimaryHover
    surfaceDefaultSolidPrimaryActive = other.surfaceDefaultSolidPrimaryActive
    surfaceDefaultSolidSecondaryHover = other.surfaceDefaultSolidSecondaryHover
    surfaceDefaultSolidSecondaryActive = other.surfaceDefaultSolidSecondaryActive
    surfaceDefaultSolidTertiaryHover = other.surfaceDefaultSolidTertiaryHover
    surfaceDefaultSolidTertiaryActive = other.surfaceDefaultSolidTertiaryActive
    surfaceDefaultSolidCardHover = other.surfaceDefaultSolidCardHover
    surfaceDefaultSolidCardActive = other.surfaceDefaultSolidCardActive
    surfaceDefaultTransparentDefaultHover = other.surfaceDefaultTransparentDefaultHover
    surfaceDefaultTransparentDefaultActive = other.surfaceDefaultTransparentDefaultActive
    surfaceDefaultTransparentPrimaryHover = other.surfaceDefaultTransparentPrimaryHover
    surfaceDefaultTransparentPrimaryActive = other.surfaceDefaultTransparentPrimaryActive
    surfaceDefaultTransparentSecondaryHover = other.surfaceDefaultTransparentSecondaryHover
    surfaceDefaultTransparentSecondaryActive = other.surfaceDefaultTransparentSecondaryActive
    surfaceDefaultTransparentTertiaryHover = other.surfaceDefaultTransparentTertiaryHover
    surfaceDefaultTransparentTertiaryActive = other.surfaceDefaultTransparentTertiaryActive
    surfaceDefaultTransparentCardHover = other.surfaceDefaultTransparentCardHover
    surfaceDefaultTransparentCardActive = other.surfaceDefaultTransparentCardActive
    surfaceDefaultAccentHover = other.surfaceDefaultAccentHover
    surfaceDefaultAccentActive = other.surfaceDefaultAccentActive
    surfaceDefaultPositiveHover = other.surfaceDefaultPositiveHover
    surfaceDefaultPositiveActive = other.surfaceDefaultPositiveActive
    surfaceDefaultWarningHover = other.surfaceDefaultWarningHover
    surfaceDefaultWarningActive = other.surfaceDefaultWarningActive
    surfaceDefaultNegativeHover = other.surfaceDefaultNegativeHover
    surfaceDefaultNegativeActive = other.surfaceDefaultNegativeActive
    surfaceDefaultClearHover = other.surfaceDefaultClearHover
    surfaceDefaultClearActive = other.surfaceDefaultClearActive
    surfaceDefaultTransparentDeepHover = other.surfaceDefaultTransparentDeepHover
    surfaceDefaultTransparentDeepActive = other.surfaceDefaultTransparentDeepActive
    surfaceOnDarkSolidPrimary = other.surfaceOnDarkSolidPrimary
    surfaceOnDarkSolidPrimaryBrightness = other.surfaceOnDarkSolidPrimaryBrightness
    surfaceOnDarkSolidSecondary = other.surfaceOnDarkSolidSecondary
    surfaceOnDarkSolidTertiary = other.surfaceOnDarkSolidTertiary
    surfaceOnDarkSolidCard = other.surfaceOnDarkSolidCard
    surfaceOnDarkSolidCardBrightness = other.surfaceOnDarkSolidCardBrightness
    surfaceOnDarkTransparentDefault = other.surfaceOnDarkTransparentDefault
    surfaceOnDarkAccent = other.surfaceOnDarkAccent
    surfaceOnDarkPositive = other.surfaceOnDarkPositive
    surfaceOnDarkWarning = other.surfaceOnDarkWarning
    surfaceOnDarkNegative = other.surfaceOnDarkNegative
    surfaceOnDarkClear = other.surfaceOnDarkClear
    surfaceOnDarkTransparentDeep = other.surfaceOnDarkTransparentDeep
    surfaceOnDarkAccentMinor = other.surfaceOnDarkAccentMinor
    surfaceOnDarkAccentMinorHover = other.surfaceOnDarkAccentMinorHover
    surfaceOnDarkAccentMinorActive = other.surfaceOnDarkAccentMinorActive
    surfaceOnDarkTransparentAccent = other.surfaceOnDarkTransparentAccent
    surfaceOnDarkTransparentAccentHover = other.surfaceOnDarkTransparentAccentHover
    surfaceOnDarkTransparentAccentActive = other.surfaceOnDarkTransparentAccentActive
    surfaceOnDarkSurfaceInfoHover = other.surfaceOnDarkSurfaceInfoHover
    surfaceOnDarkSurfaceInfoActive = other.surfaceOnDarkSurfaceInfoActive
    surfaceOnDarkPositiveMinor = other.surfaceOnDarkPositiveMinor
    surfaceOnDarkPositiveMinorHover = other.surfaceOnDarkPositiveMinorHover
    surfaceOnDarkPositiveMinorActive = other.surfaceOnDarkPositiveMinorActive
    surfaceOnDarkWarningMinor = other.surfaceOnDarkWarningMinor
    surfaceOnDarkWarningMinorHover = other.surfaceOnDarkWarningMinorHover
    surfaceOnDarkWarningMinorActive = other.surfaceOnDarkWarningMinorActive
    surfaceOnDarkNegativeMinor = other.surfaceOnDarkNegativeMinor
    surfaceOnDarkNegativeMinorHover = other.surfaceOnDarkNegativeMinorHover
    surfaceOnDarkNegativeMinorActive = other.surfaceOnDarkNegativeMinorActive
    surfaceOnDarkInfoMinorHover = other.surfaceOnDarkInfoMinorHover
    surfaceOnDarkInfoMinorActive = other.surfaceOnDarkInfoMinorActive
    surfaceOnDarkTransparentPositiveHover = other.surfaceOnDarkTransparentPositiveHover
    surfaceOnDarkTransparentPositiveActive = other.surfaceOnDarkTransparentPositiveActive
    surfaceOnDarkTransparentWarningHover = other.surfaceOnDarkTransparentWarningHover
    surfaceOnDarkTransparentWarningActive = other.surfaceOnDarkTransparentWarningActive
    surfaceOnDarkTransparentNegativeHover = other.surfaceOnDarkTransparentNegativeHover
    surfaceOnDarkTransparentNegativeActive = other.surfaceOnDarkTransparentNegativeActive
    surfaceOnDarkTransparentInfoHover = other.surfaceOnDarkTransparentInfoHover
    surfaceOnDarkTransparentInfoActive = other.surfaceOnDarkTransparentInfoActive
    surfaceOnDarkSolidDefault = other.surfaceOnDarkSolidDefault
    surfaceOnDarkSolidDefaultHover = other.surfaceOnDarkSolidDefaultHover
    surfaceOnDarkSolidDefaultActive = other.surfaceOnDarkSolidDefaultActive
    surfaceOnDarkTransparentPrimary = other.surfaceOnDarkTransparentPrimary
    surfaceOnDarkTransparentPrimaryHover = other.surfaceOnDarkTransparentPrimaryHover
    surfaceOnDarkTransparentPrimaryActive = other.surfaceOnDarkTransparentPrimaryActive
    surfaceOnDarkTransparentSecondary = other.surfaceOnDarkTransparentSecondary
    surfaceOnDarkTransparentSecondaryHover = other.surfaceOnDarkTransparentSecondaryHover
    surfaceOnDarkTransparentSecondaryActive = other.surfaceOnDarkTransparentSecondaryActive
    surfaceOnDarkTransparentTertiary = other.surfaceOnDarkTransparentTertiary
    surfaceOnDarkTransparentTertiaryHover = other.surfaceOnDarkTransparentTertiaryHover
    surfaceOnDarkTransparentTertiaryActive = other.surfaceOnDarkTransparentTertiaryActive
    surfaceOnDarkTransparentCard = other.surfaceOnDarkTransparentCard
    surfaceOnDarkTransparentCardBrightness = other.surfaceOnDarkTransparentCardBrightness
    surfaceOnDarkTransparentCardHover = other.surfaceOnDarkTransparentCardHover
    surfaceOnDarkTransparentCardActive = other.surfaceOnDarkTransparentCardActive
    surfaceOnDarkTransparentPositive = other.surfaceOnDarkTransparentPositive
    surfaceOnDarkTransparentWarning = other.surfaceOnDarkTransparentWarning
    surfaceOnDarkTransparentNegative = other.surfaceOnDarkTransparentNegative
    surfaceOnDarkSurfaceInfo = other.surfaceOnDarkSurfaceInfo
    surfaceOnDarkInfoMinor = other.surfaceOnDarkInfoMinor
    surfaceOnDarkTransparentInfo = other.surfaceOnDarkTransparentInfo
    surfaceOnDarkSolidPrimaryHover = other.surfaceOnDarkSolidPrimaryHover
    surfaceOnDarkSolidPrimaryActive = other.surfaceOnDarkSolidPrimaryActive
    surfaceOnDarkSolidSecondaryHover = other.surfaceOnDarkSolidSecondaryHover
    surfaceOnDarkSolidSecondaryActive = other.surfaceOnDarkSolidSecondaryActive
    surfaceOnDarkSolidTertiaryHover = other.surfaceOnDarkSolidTertiaryHover
    surfaceOnDarkSolidTertiaryActive = other.surfaceOnDarkSolidTertiaryActive
    surfaceOnDarkSolidCardHover = other.surfaceOnDarkSolidCardHover
    surfaceOnDarkSolidCardActive = other.surfaceOnDarkSolidCardActive
    surfaceOnDarkTransparentDefaultHover = other.surfaceOnDarkTransparentDefaultHover
    surfaceOnDarkTransparentDefaultActive = other.surfaceOnDarkTransparentDefaultActive
    surfaceOnDarkAccentHover = other.surfaceOnDarkAccentHover
    surfaceOnDarkAccentActive = other.surfaceOnDarkAccentActive
    surfaceOnDarkPositiveHover = other.surfaceOnDarkPositiveHover
    surfaceOnDarkPositiveActive = other.surfaceOnDarkPositiveActive
    surfaceOnDarkWarningHover = other.surfaceOnDarkWarningHover
    surfaceOnDarkWarningActive = other.surfaceOnDarkWarningActive
    surfaceOnDarkNegativeHover = other.surfaceOnDarkNegativeHover
    surfaceOnDarkNegativeActive = other.surfaceOnDarkNegativeActive
    surfaceOnDarkClearHover = other.surfaceOnDarkClearHover
    surfaceOnDarkClearActive = other.surfaceOnDarkClearActive
    surfaceOnDarkTransparentDeepHover = other.surfaceOnDarkTransparentDeepHover
    surfaceOnDarkTransparentDeepActive = other.surfaceOnDarkTransparentDeepActive
    surfaceOnLightSolidDefault = other.surfaceOnLightSolidDefault
    surfaceOnLightSolidPrimary = other.surfaceOnLightSolidPrimary
    surfaceOnLightSolidPrimaryBrightness = other.surfaceOnLightSolidPrimaryBrightness
    surfaceOnLightSolidSecondary = other.surfaceOnLightSolidSecondary
    surfaceOnLightSolidTertiary = other.surfaceOnLightSolidTertiary
    surfaceOnLightSolidCard = other.surfaceOnLightSolidCard
    surfaceOnLightSolidCardBrightness = other.surfaceOnLightSolidCardBrightness
    surfaceOnLightTransparentDefault = other.surfaceOnLightTransparentDefault
    surfaceOnLightTransparentPrimary = other.surfaceOnLightTransparentPrimary
    surfaceOnLightTransparentSecondary = other.surfaceOnLightTransparentSecondary
    surfaceOnLightTransparentTertiary = other.surfaceOnLightTransparentTertiary
    surfaceOnLightTransparentCard = other.surfaceOnLightTransparentCard
    surfaceOnLightTransparentCardBrightness = other.surfaceOnLightTransparentCardBrightness
    surfaceOnLightAccent = other.surfaceOnLightAccent
    surfaceOnLightPositive = other.surfaceOnLightPositive
    surfaceOnLightWarning = other.surfaceOnLightWarning
    surfaceOnLightNegative = other.surfaceOnLightNegative
    surfaceOnLightClear = other.surfaceOnLightClear
    surfaceOnLightTransparentDeep = other.surfaceOnLightTransparentDeep
    surfaceOnLightAccentMinor = other.surfaceOnLightAccentMinor
    surfaceOnLightAccentMinorHover = other.surfaceOnLightAccentMinorHover
    surfaceOnLightAccentMinorActive = other.surfaceOnLightAccentMinorActive
    surfaceOnLightTransparentAccent = other.surfaceOnLightTransparentAccent
    surfaceOnLightTransparentAccentHover = other.surfaceOnLightTransparentAccentHover
    surfaceOnLightTransparentAccentActive = other.surfaceOnLightTransparentAccentActive
    surfaceOnLightInfoHover = other.surfaceOnLightInfoHover
    surfaceOnLightInfoActive = other.surfaceOnLightInfoActive
    surfaceOnLightPositiveMinor = other.surfaceOnLightPositiveMinor
    surfaceOnLightPositiveMinorHover = other.surfaceOnLightPositiveMinorHover
    surfaceOnLightPositiveMinorActive = other.surfaceOnLightPositiveMinorActive
    surfaceOnLightWarningMinor = other.surfaceOnLightWarningMinor
    surfaceOnLightWarningMinorHover = other.surfaceOnLightWarningMinorHover
    surfaceOnLightWarningMinorActive = other.surfaceOnLightWarningMinorActive
    surfaceOnLightNegativeMinor = other.surfaceOnLightNegativeMinor
    surfaceOnLightNegativeMinorHover = other.surfaceOnLightNegativeMinorHover
    surfaceOnLightNegativeMinorActive = other.surfaceOnLightNegativeMinorActive
    surfaceOnLightInfoMinorHover = other.surfaceOnLightInfoMinorHover
    surfaceOnLightInfoMinorActive = other.surfaceOnLightInfoMinorActive
    surfaceOnLightTransparentPositiveHover = other.surfaceOnLightTransparentPositiveHover
    surfaceOnLightTransparentPositiveActive = other.surfaceOnLightTransparentPositiveActive
    surfaceOnLightTransparentWarningHover = other.surfaceOnLightTransparentWarningHover
    surfaceOnLightTransparentWarningActive = other.surfaceOnLightTransparentWarningActive
    surfaceOnLightTransparentNegativeHover = other.surfaceOnLightTransparentNegativeHover
    surfaceOnLightTransparentNegativeActive = other.surfaceOnLightTransparentNegativeActive
    surfaceOnLightTransparentInfoHover = other.surfaceOnLightTransparentInfoHover
    surfaceOnLightTransparentInfoActive = other.surfaceOnLightTransparentInfoActive
    surfaceOnLightTransparentPositive = other.surfaceOnLightTransparentPositive
    surfaceOnLightTransparentWarning = other.surfaceOnLightTransparentWarning
    surfaceOnLightTransparentNegative = other.surfaceOnLightTransparentNegative
    surfaceOnLightInfo = other.surfaceOnLightInfo
    surfaceOnLightInfoMinor = other.surfaceOnLightInfoMinor
    surfaceOnLightTransparentInfo = other.surfaceOnLightTransparentInfo
    surfaceOnLightSolidDefaultHover = other.surfaceOnLightSolidDefaultHover
    surfaceOnLightSolidDefaultActive = other.surfaceOnLightSolidDefaultActive
    surfaceOnLightSolidPrimaryHover = other.surfaceOnLightSolidPrimaryHover
    surfaceOnLightSolidPrimaryActive = other.surfaceOnLightSolidPrimaryActive
    surfaceOnLightSolidSecondaryHover = other.surfaceOnLightSolidSecondaryHover
    surfaceOnLightSolidSecondaryActive = other.surfaceOnLightSolidSecondaryActive
    surfaceOnLightSolidTertiaryHover = other.surfaceOnLightSolidTertiaryHover
    surfaceOnLightSolidTertiaryActive = other.surfaceOnLightSolidTertiaryActive
    surfaceOnLightSolidCardHover = other.surfaceOnLightSolidCardHover
    surfaceOnLightSolidCardActive = other.surfaceOnLightSolidCardActive
    surfaceOnLightTransparentDefaultHover = other.surfaceOnLightTransparentDefaultHover
    surfaceOnLightTransparentDefaultActive = other.surfaceOnLightTransparentDefaultActive
    surfaceOnLightTransparentPrimaryHover = other.surfaceOnLightTransparentPrimaryHover
    surfaceOnLightTransparentPrimaryActive = other.surfaceOnLightTransparentPrimaryActive
    surfaceOnLightTransparentSecondaryHover = other.surfaceOnLightTransparentSecondaryHover
    surfaceOnLightTransparentSecondaryActive = other.surfaceOnLightTransparentSecondaryActive
    surfaceOnLightTransparentTertiaryHover = other.surfaceOnLightTransparentTertiaryHover
    surfaceOnLightTransparentTertiaryActive = other.surfaceOnLightTransparentTertiaryActive
    surfaceOnLightTransparentCardHover = other.surfaceOnLightTransparentCardHover
    surfaceOnLightTransparentCardActive = other.surfaceOnLightTransparentCardActive
    surfaceOnLightAccentHover = other.surfaceOnLightAccentHover
    surfaceOnLightAccentActive = other.surfaceOnLightAccentActive
    surfaceOnLightPositiveHover = other.surfaceOnLightPositiveHover
    surfaceOnLightPositiveActive = other.surfaceOnLightPositiveActive
    surfaceOnLightWarningHover = other.surfaceOnLightWarningHover
    surfaceOnLightWarningActive = other.surfaceOnLightWarningActive
    surfaceOnLightNegativeHover = other.surfaceOnLightNegativeHover
    surfaceOnLightNegativeActive = other.surfaceOnLightNegativeActive
    surfaceOnLightClearHover = other.surfaceOnLightClearHover
    surfaceOnLightClearActive = other.surfaceOnLightClearActive
    surfaceOnLightTransparentDeepHover = other.surfaceOnLightTransparentDeepHover
    surfaceOnLightTransparentDeepActive = other.surfaceOnLightTransparentDeepActive
    surfaceInverseSolidDefault = other.surfaceInverseSolidDefault
    surfaceInverseSolidPrimary = other.surfaceInverseSolidPrimary
    surfaceInverseSolidPrimaryBrightness = other.surfaceInverseSolidPrimaryBrightness
    surfaceInverseSolidSecondary = other.surfaceInverseSolidSecondary
    surfaceInverseSolidTertiary = other.surfaceInverseSolidTertiary
    surfaceInverseSolidCard = other.surfaceInverseSolidCard
    surfaceInverseSolidCardBrightness = other.surfaceInverseSolidCardBrightness
    surfaceInverseTransparentDefault = other.surfaceInverseTransparentDefault
    surfaceInverseTransparentPrimary = other.surfaceInverseTransparentPrimary
    surfaceInverseTransparentSecondary = other.surfaceInverseTransparentSecondary
    surfaceInverseTransparentTertiary = other.surfaceInverseTransparentTertiary
    surfaceInverseTransparentCard = other.surfaceInverseTransparentCard
    surfaceInverseTransparentCardBrightness = other.surfaceInverseTransparentCardBrightness
    surfaceInverseAccent = other.surfaceInverseAccent
    surfaceInversePositive = other.surfaceInversePositive
    surfaceInverseWarning = other.surfaceInverseWarning
    surfaceInverseNegative = other.surfaceInverseNegative
    surfaceInverseClear = other.surfaceInverseClear
    surfaceInverseSolidDefaultHover = other.surfaceInverseSolidDefaultHover
    surfaceInverseSolidDefaultActive = other.surfaceInverseSolidDefaultActive
    surfaceInverseSolidPrimaryHover = other.surfaceInverseSolidPrimaryHover
    surfaceInverseSolidPrimaryActive = other.surfaceInverseSolidPrimaryActive
    surfaceInverseSolidSecondaryHover = other.surfaceInverseSolidSecondaryHover
    surfaceInverseSolidSecondaryActive = other.surfaceInverseSolidSecondaryActive
    surfaceInverseSolidTertiaryHover = other.surfaceInverseSolidTertiaryHover
    surfaceInverseSolidTertiaryActive = other.surfaceInverseSolidTertiaryActive
    surfaceInverseSolidCardHover = other.surfaceInverseSolidCardHover
    surfaceInverseSolidCardActive = other.surfaceInverseSolidCardActive
    surfaceInverseTransparentDefaultHover = other.surfaceInverseTransparentDefaultHover
    surfaceInverseTransparentDefaultActive = other.surfaceInverseTransparentDefaultActive
    surfaceInverseTransparentPrimaryHover = other.surfaceInverseTransparentPrimaryHover
    surfaceInverseTransparentPrimaryActive = other.surfaceInverseTransparentPrimaryActive
    surfaceInverseTransparentSecondaryHover = other.surfaceInverseTransparentSecondaryHover
    surfaceInverseTransparentSecondaryActive = other.surfaceInverseTransparentSecondaryActive
    surfaceInverseTransparentTertiaryHover = other.surfaceInverseTransparentTertiaryHover
    surfaceInverseTransparentTertiaryActive = other.surfaceInverseTransparentTertiaryActive
    surfaceInverseTransparentCardHover = other.surfaceInverseTransparentCardHover
    surfaceInverseTransparentCardActive = other.surfaceInverseTransparentCardActive
    surfaceInverseAccentHover = other.surfaceInverseAccentHover
    surfaceInverseAccentActive = other.surfaceInverseAccentActive
    surfaceInversePositiveHover = other.surfaceInversePositiveHover
    surfaceInversePositiveActive = other.surfaceInversePositiveActive
    surfaceInverseWarningHover = other.surfaceInverseWarningHover
    surfaceInverseWarningActive = other.surfaceInverseWarningActive
    surfaceInverseNegativeHover = other.surfaceInverseNegativeHover
    surfaceInverseNegativeActive = other.surfaceInverseNegativeActive
    surfaceInverseClearHover = other.surfaceInverseClearHover
    surfaceInverseClearActive = other.surfaceInverseClearActive
    surfaceInverseTransparentDeep = other.surfaceInverseTransparentDeep
    surfaceInverseTransparentDeepHover = other.surfaceInverseTransparentDeepHover
    surfaceInverseTransparentDeepActive = other.surfaceInverseTransparentDeepActive
    surfaceInverseAccentMinor = other.surfaceInverseAccentMinor
    surfaceInverseAccentMinorHover = other.surfaceInverseAccentMinorHover
    surfaceInverseAccentMinorActive = other.surfaceInverseAccentMinorActive
    surfaceInverseTransparentAccent = other.surfaceInverseTransparentAccent
    surfaceInverseTransparentAccentHover = other.surfaceInverseTransparentAccentHover
    surfaceInverseTransparentAccentActive = other.surfaceInverseTransparentAccentActive
    surfaceInverseInfo = other.surfaceInverseInfo
    surfaceInverseInfoHover = other.surfaceInverseInfoHover
    surfaceInverseInfoActive = other.surfaceInverseInfoActive
    surfaceInversePositiveMinor = other.surfaceInversePositiveMinor
    surfaceInversePositiveMinorHover = other.surfaceInversePositiveMinorHover
    surfaceInversePositiveMinorActive = other.surfaceInversePositiveMinorActive
    surfaceInverseWarningMinor = other.surfaceInverseWarningMinor
    surfaceInverseWarningMinorHover = other.surfaceInverseWarningMinorHover
    surfaceInverseWarningMinorActive = other.surfaceInverseWarningMinorActive
    surfaceInverseNegativeMinor = other.surfaceInverseNegativeMinor
    surfaceInverseNegativeMinorHover = other.surfaceInverseNegativeMinorHover
    surfaceInverseNegativeMinorActive = other.surfaceInverseNegativeMinorActive
    surfaceInverseInfoMinor = other.surfaceInverseInfoMinor
    surfaceInverseInfoMinorHover = other.surfaceInverseInfoMinorHover
    surfaceInverseInfoMinorActive = other.surfaceInverseInfoMinorActive
    surfaceInverseTransparentPositive = other.surfaceInverseTransparentPositive
    surfaceInverseTransparentPositiveHover = other.surfaceInverseTransparentPositiveHover
    surfaceInverseTransparentPositiveActive = other.surfaceInverseTransparentPositiveActive
    surfaceInverseTransparentWarning = other.surfaceInverseTransparentWarning
    surfaceInverseTransparentWarningHover = other.surfaceInverseTransparentWarningHover
    surfaceInverseTransparentWarningActive = other.surfaceInverseTransparentWarningActive
    surfaceInverseTransparentNegative = other.surfaceInverseTransparentNegative
    surfaceInverseTransparentNegativeHover = other.surfaceInverseTransparentNegativeHover
    surfaceInverseTransparentNegativeActive = other.surfaceInverseTransparentNegativeActive
    surfaceInverseTransparentInfo = other.surfaceInverseTransparentInfo
    surfaceInverseTransparentInfoHover = other.surfaceInverseTransparentInfoHover
    surfaceInverseTransparentInfoActive = other.surfaceInverseTransparentInfoActive
    backgroundDefaultPrimary = other.backgroundDefaultPrimary
    backgroundDefaultPrimaryBrightness = other.backgroundDefaultPrimaryBrightness
    backgroundDefaultSecondary = other.backgroundDefaultSecondary
    backgroundDefaultTertiary = other.backgroundDefaultTertiary
    backgroundDarkPrimary = other.backgroundDarkPrimary
    backgroundDarkSecondary = other.backgroundDarkSecondary
    backgroundDarkTertiary = other.backgroundDarkTertiary
    backgroundLightPrimary = other.backgroundLightPrimary
    backgroundLightSecondary = other.backgroundLightSecondary
    backgroundLightTertiary = other.backgroundLightTertiary
    backgroundInversePrimaryBrightness = other.backgroundInversePrimaryBrightness
    backgroundInverseSecondary = other.backgroundInverseSecondary
    backgroundInverseTertiary = other.backgroundInverseTertiary
    backgroundInversePrimary = other.backgroundInversePrimary
    overlayDefaultSoft = other.overlayDefaultSoft
    overlayDefaultHard = other.overlayDefaultHard
    overlayDefaultBlur = other.overlayDefaultBlur
    overlayOnDarkSoft = other.overlayOnDarkSoft
    overlayOnDarkHard = other.overlayOnDarkHard
    overlayOnDarkBlur = other.overlayOnDarkBlur
    overlayOnLightSoft = other.overlayOnLightSoft
    overlayOnLightHard = other.overlayOnLightHard
    overlayOnLightBlur = other.overlayOnLightBlur
    overlayInverseHard = other.overlayInverseHard
    overlayInverseSoft = other.overlayInverseSoft
    overlayInverseBlur = other.overlayInverseBlur
    outlineDefaultSecondaryHover = other.outlineDefaultSecondaryHover
    outlineDefaultSecondaryActive = other.outlineDefaultSecondaryActive
    outlineDefaultTertiaryHover = other.outlineDefaultTertiaryHover
    outlineDefaultTertiaryActive = other.outlineDefaultTertiaryActive
    outlineDefaultDefaultHover = other.outlineDefaultDefaultHover
    outlineDefaultDefaultActive = other.outlineDefaultDefaultActive
    outlineDefaultTransparentPrimaryHover = other.outlineDefaultTransparentPrimaryHover
    outlineDefaultTransparentPrimaryActive = other.outlineDefaultTransparentPrimaryActive
    outlineDefaultTransparentSecondaryHover = other.outlineDefaultTransparentSecondaryHover
    outlineDefaultTransparentSecondaryActive = other.outlineDefaultTransparentSecondaryActive
    outlineDefaultTransparentTertiaryHover = other.outlineDefaultTransparentTertiaryHover
    outlineDefaultTransparentTertiaryActive = other.outlineDefaultTransparentTertiaryActive
    outlineDefaultTransparentClearHover = other.outlineDefaultTransparentClearHover
    outlineDefaultTransparentClearActive = other.outlineDefaultTransparentClearActive
    outlineDefaultAccentHover = other.outlineDefaultAccentHover
    outlineDefaultAccentActive = other.outlineDefaultAccentActive
    outlineDefaultAccentMinorHover = other.outlineDefaultAccentMinorHover
    outlineDefaultAccentMinorActive = other.outlineDefaultAccentMinorActive
    outlineDefaultTransparentAccentHover = other.outlineDefaultTransparentAccentHover
    outlineDefaultTransparentAccentActive = other.outlineDefaultTransparentAccentActive
    outlineDefaultPositiveHover = other.outlineDefaultPositiveHover
    outlineDefaultPositiveActive = other.outlineDefaultPositiveActive
    outlineDefaultWarningHover = other.outlineDefaultWarningHover
    outlineDefaultWarningActive = other.outlineDefaultWarningActive
    outlineDefaultNegativeHover = other.outlineDefaultNegativeHover
    outlineDefaultNegativeActive = other.outlineDefaultNegativeActive
    outlineDefaultInfoHover = other.outlineDefaultInfoHover
    outlineDefaultInfoActive = other.outlineDefaultInfoActive
    outlineDefaultPositiveMinorHover = other.outlineDefaultPositiveMinorHover
    outlineDefaultPositiveMinorActive = other.outlineDefaultPositiveMinorActive
    outlineDefaultWarningMinorHover = other.outlineDefaultWarningMinorHover
    outlineDefaultWarningMinorActive = other.outlineDefaultWarningMinorActive
    outlineDefaultNegativeMinorHover = other.outlineDefaultNegativeMinorHover
    outlineDefaultNegativeMinorActive = other.outlineDefaultNegativeMinorActive
    outlineDefaultInfoMinorHover = other.outlineDefaultInfoMinorHover
    outlineDefaultInfoMinorActive = other.outlineDefaultInfoMinorActive
    outlineDefaultTransparentPositiveHover = other.outlineDefaultTransparentPositiveHover
    outlineDefaultTransparentPositiveActive = other.outlineDefaultTransparentPositiveActive
    outlineDefaultTransparentWarningHover = other.outlineDefaultTransparentWarningHover
    outlineDefaultTransparentWarningActive = other.outlineDefaultTransparentWarningActive
    outlineDefaultNegativeTransparentHover = other.outlineDefaultNegativeTransparentHover
    outlineDefaultNegativeTransparentActive = other.outlineDefaultNegativeTransparentActive
    outlineDefaultTransparentInfoHover = other.outlineDefaultTransparentInfoHover
    outlineDefaultTransparentInfoActive = other.outlineDefaultTransparentInfoActive
    outlineDefaultPrimaryHover = other.outlineDefaultPrimaryHover
    outlineDefaultPrimaryActive = other.outlineDefaultPrimaryActive
    outlineDefaultTransparentPrimary = other.outlineDefaultTransparentPrimary
    outlineDefaultTransparentSecondary = other.outlineDefaultTransparentSecondary
    outlineDefaultTransparentTertiary = other.outlineDefaultTransparentTertiary
    outlineDefaultTransparentClear = other.outlineDefaultTransparentClear
    outlineDefaultAccent = other.outlineDefaultAccent
    outlineDefaultAccentMinor = other.outlineDefaultAccentMinor
    outlineDefaultTransparentAccent = other.outlineDefaultTransparentAccent
    outlineDefaultPositive = other.outlineDefaultPositive
    outlineDefaultWarning = other.outlineDefaultWarning
    outlineDefaultNegative = other.outlineDefaultNegative
    outlineDefaultPositiveMinor = other.outlineDefaultPositiveMinor
    outlineDefaultWarningMinor = other.outlineDefaultWarningMinor
    outlineDefaultNegativeMinor = other.outlineDefaultNegativeMinor
    outlineDefaultTransparentPositive = other.outlineDefaultTransparentPositive
    outlineDefaultTransparentWarning = other.outlineDefaultTransparentWarning
    outlineDefaultTransparentNegative = other.outlineDefaultTransparentNegative
    outlineDefaultTransparentNegativeHover = other.outlineDefaultTransparentNegativeHover
    outlineDefaultTransparentNegativeActive = other.outlineDefaultTransparentNegativeActive
    outlineDefaultInfo = other.outlineDefaultInfo
    outlineDefaultInfoMinor = other.outlineDefaultInfoMinor
    outlineDefaultTransparentInfo = other.outlineDefaultTransparentInfo
    outlineDefaultSolidPrimaryHover = other.outlineDefaultSolidPrimaryHover
    outlineDefaultSolidPrimaryActive = other.outlineDefaultSolidPrimaryActive
    outlineDefaultSolidSecondaryHover = other.outlineDefaultSolidSecondaryHover
    outlineDefaultSolidSecondaryActive = other.outlineDefaultSolidSecondaryActive
    outlineDefaultSolidTertiaryHover = other.outlineDefaultSolidTertiaryHover
    outlineDefaultSolidTertiaryActive = other.outlineDefaultSolidTertiaryActive
    outlineDefaultSolidDefaultHover = other.outlineDefaultSolidDefaultHover
    outlineDefaultSolidDefaultActive = other.outlineDefaultSolidDefaultActive
    outlineDefaultSolidPrimary = other.outlineDefaultSolidPrimary
    outlineDefaultSolidSecondary = other.outlineDefaultSolidSecondary
    outlineDefaultSolidTertiary = other.outlineDefaultSolidTertiary
    outlineDefaultSolidDefault = other.outlineDefaultSolidDefault
    outlineOnDarkSecondaryHover = other.outlineOnDarkSecondaryHover
    outlineOnDarkSecondaryActive = other.outlineOnDarkSecondaryActive
    outlineOnDarkTertiaryHover = other.outlineOnDarkTertiaryHover
    outlineOnDarkTertiaryActive = other.outlineOnDarkTertiaryActive
    outlineOnDarkDefaultHover = other.outlineOnDarkDefaultHover
    outlineOnDarkDefaultActive = other.outlineOnDarkDefaultActive
    outlineOnDarkTransparentPrimary = other.outlineOnDarkTransparentPrimary
    outlineOnDarkTransparentPrimaryHover = other.outlineOnDarkTransparentPrimaryHover
    outlineOnDarkTransparentPrimaryActive = other.outlineOnDarkTransparentPrimaryActive
    outlineOnDarkTransparentSecondary = other.outlineOnDarkTransparentSecondary
    outlineOnDarkTransparentSecondaryHover = other.outlineOnDarkTransparentSecondaryHover
    outlineOnDarkTransparentSecondaryActive = other.outlineOnDarkTransparentSecondaryActive
    outlineOnDarkTransparentTertiary = other.outlineOnDarkTransparentTertiary
    outlineOnDarkTransparentTertiaryHover = other.outlineOnDarkTransparentTertiaryHover
    outlineOnDarkTransparentTertiaryActive = other.outlineOnDarkTransparentTertiaryActive
    outlineOnDarkAccent = other.outlineOnDarkAccent
    outlineOnDarkAccentHover = other.outlineOnDarkAccentHover
    outlineOnDarkAccentActive = other.outlineOnDarkAccentActive
    outlineOnDarkAccentMinor = other.outlineOnDarkAccentMinor
    outlineOnDarkAccentMinorHover = other.outlineOnDarkAccentMinorHover
    outlineOnDarkAccentMinorActive = other.outlineOnDarkAccentMinorActive
    outlineOnDarkTransparentAccent = other.outlineOnDarkTransparentAccent
    outlineOnDarkTransparentAccentHover = other.outlineOnDarkTransparentAccentHover
    outlineOnDarkTransparentAccentActive = other.outlineOnDarkTransparentAccentActive
    outlineOnDarkPositive = other.outlineOnDarkPositive
    outlineOnDarkPositiveHover = other.outlineOnDarkPositiveHover
    outlineOnDarkPositiveActive = other.outlineOnDarkPositiveActive
    outlineOnDarkWarning = other.outlineOnDarkWarning
    outlineOnDarkWarningHover = other.outlineOnDarkWarningHover
    outlineOnDarkWarningActive = other.outlineOnDarkWarningActive
    outlineOnDarkNegative = other.outlineOnDarkNegative
    outlineOnDarkNegativeHover = other.outlineOnDarkNegativeHover
    outlineOnDarkNegativeActive = other.outlineOnDarkNegativeActive
    outlineOnDarkInfoHover = other.outlineOnDarkInfoHover
    outlineOnDarkInfoActive = other.outlineOnDarkInfoActive
    outlineOnDarkPositiveMinor = other.outlineOnDarkPositiveMinor
    outlineOnDarkPositiveMinorHover = other.outlineOnDarkPositiveMinorHover
    outlineOnDarkPositiveMinorActive = other.outlineOnDarkPositiveMinorActive
    outlineOnDarkWarningMinor = other.outlineOnDarkWarningMinor
    outlineOnDarkWarningMinorHover = other.outlineOnDarkWarningMinorHover
    outlineOnDarkWarningMinorActive = other.outlineOnDarkWarningMinorActive
    outlineOnDarkNegativeMinor = other.outlineOnDarkNegativeMinor
    outlineOnDarkNegativeMinorHover = other.outlineOnDarkNegativeMinorHover
    outlineOnDarkNegativeMinorActive = other.outlineOnDarkNegativeMinorActive
    outlineOnDarkInfoMinorHover = other.outlineOnDarkInfoMinorHover
    outlineOnDarkInfoMinorActive = other.outlineOnDarkInfoMinorActive
    outlineOnDarkTransparentPositive = other.outlineOnDarkTransparentPositive
    outlineOnDarkTransparentPositiveHover = other.outlineOnDarkTransparentPositiveHover
    outlineOnDarkTransparentPositiveActive = other.outlineOnDarkTransparentPositiveActive
    outlineOnDarkTransparentWarning = other.outlineOnDarkTransparentWarning
    outlineOnDarkTransparentWarningHover = other.outlineOnDarkTransparentWarningHover
    outlineOnDarkTransparentWarningActive = other.outlineOnDarkTransparentWarningActive
    outlineOnDarkNegativeTransparent = other.outlineOnDarkNegativeTransparent
    outlineOnDarkNegativeTransparentHover = other.outlineOnDarkNegativeTransparentHover
    outlineOnDarkNegativeTransparentActive = other.outlineOnDarkNegativeTransparentActive
    outlineOnDarkTransparentInfoHover = other.outlineOnDarkTransparentInfoHover
    outlineOnDarkTransparentInfoActive = other.outlineOnDarkTransparentInfoActive
    outlineOnDarkPrimaryHover = other.outlineOnDarkPrimaryHover
    outlineOnDarkPrimaryActive = other.outlineOnDarkPrimaryActive
    outlineOnDarkInfo = other.outlineOnDarkInfo
    outlineOnDarkInfoMinor = other.outlineOnDarkInfoMinor
    outlineOnDarkTransparentInfo = other.outlineOnDarkTransparentInfo
    outlineOnDarkSolidPrimary = other.outlineOnDarkSolidPrimary
    outlineOnDarkSolidPrimaryHover = other.outlineOnDarkSolidPrimaryHover
    outlineOnDarkSolidPrimaryActive = other.outlineOnDarkSolidPrimaryActive
    outlineOnDarkSolidSecondary = other.outlineOnDarkSolidSecondary
    outlineOnDarkSolidSecondaryHover = other.outlineOnDarkSolidSecondaryHover
    outlineOnDarkSolidSecondaryActive = other.outlineOnDarkSolidSecondaryActive
    outlineOnDarkSolidTertiary = other.outlineOnDarkSolidTertiary
    outlineOnDarkSolidTertiaryHover = other.outlineOnDarkSolidTertiaryHover
    outlineOnDarkSolidTertiaryActive = other.outlineOnDarkSolidTertiaryActive
    outlineOnDarkSolidDefault = other.outlineOnDarkSolidDefault
    outlineOnDarkSolidDefaultHover = other.outlineOnDarkSolidDefaultHover
    outlineOnDarkSolidDefaultActive = other.outlineOnDarkSolidDefaultActive
    outlineOnLightSecondaryHover = other.outlineOnLightSecondaryHover
    outlineOnLightSecondaryActive = other.outlineOnLightSecondaryActive
    outlineOnLightTertiaryHover = other.outlineOnLightTertiaryHover
    outlineOnLightTertiaryActive = other.outlineOnLightTertiaryActive
    outlineOnLightDefaultHover = other.outlineOnLightDefaultHover
    outlineOnLightDefaultActive = other.outlineOnLightDefaultActive
    outlineOnLightTransparentPrimary = other.outlineOnLightTransparentPrimary
    outlineOnLightTransparentPrimaryHover = other.outlineOnLightTransparentPrimaryHover
    outlineOnLightTransparentPrimaryActive = other.outlineOnLightTransparentPrimaryActive
    outlineOnLightTransparentSecondary = other.outlineOnLightTransparentSecondary
    outlineOnLightTransparentSecondaryHover = other.outlineOnLightTransparentSecondaryHover
    outlineOnLightTransparentSecondaryActive = other.outlineOnLightTransparentSecondaryActive
    outlineOnLightTransparentTertiary = other.outlineOnLightTransparentTertiary
    outlineOnLightTransparentTertiaryHover = other.outlineOnLightTransparentTertiaryHover
    outlineOnLightTransparentTertiaryActive = other.outlineOnLightTransparentTertiaryActive
    outlineOnLightAccent = other.outlineOnLightAccent
    outlineOnLightAccentHover = other.outlineOnLightAccentHover
    outlineOnLightAccentActive = other.outlineOnLightAccentActive
    outlineOnLightAccentMinor = other.outlineOnLightAccentMinor
    outlineOnLightAccentMinorHover = other.outlineOnLightAccentMinorHover
    outlineOnLightAccentMinorActive = other.outlineOnLightAccentMinorActive
    outlineOnLightTransparentAccent = other.outlineOnLightTransparentAccent
    outlineOnLightTransparentAccentHover = other.outlineOnLightTransparentAccentHover
    outlineOnLightTransparentAccentActive = other.outlineOnLightTransparentAccentActive
    outlineOnLightPositive = other.outlineOnLightPositive
    outlineOnLightPositiveHover = other.outlineOnLightPositiveHover
    outlineOnLightPositiveActive = other.outlineOnLightPositiveActive
    outlineOnLightWarning = other.outlineOnLightWarning
    outlineOnLightWarningHover = other.outlineOnLightWarningHover
    outlineOnLightWarningActive = other.outlineOnLightWarningActive
    outlineOnLightNegative = other.outlineOnLightNegative
    outlineOnLightNegativeHover = other.outlineOnLightNegativeHover
    outlineOnLightNegativeActive = other.outlineOnLightNegativeActive
    outlineOnLightInfoHover = other.outlineOnLightInfoHover
    outlineOnLightInfoActive = other.outlineOnLightInfoActive
    outlineOnLightPositiveMinor = other.outlineOnLightPositiveMinor
    outlineOnLightPositiveMinorHover = other.outlineOnLightPositiveMinorHover
    outlineOnLightPositiveMinorActive = other.outlineOnLightPositiveMinorActive
    outlineOnLightWarningMinor = other.outlineOnLightWarningMinor
    outlineOnLightWarningMinorHover = other.outlineOnLightWarningMinorHover
    outlineOnLightWarningMinorActive = other.outlineOnLightWarningMinorActive
    outlineOnLightNegativeMinor = other.outlineOnLightNegativeMinor
    outlineOnLightNegativeMinorHover = other.outlineOnLightNegativeMinorHover
    outlineOnLightNegativeMinorActive = other.outlineOnLightNegativeMinorActive
    outlineOnLightInfoMinorHover = other.outlineOnLightInfoMinorHover
    outlineOnLightInfoMinorActive = other.outlineOnLightInfoMinorActive
    outlineOnLightTransparentPositive = other.outlineOnLightTransparentPositive
    outlineOnLightTransparentPositiveHover = other.outlineOnLightTransparentPositiveHover
    outlineOnLightTransparentPositiveActive = other.outlineOnLightTransparentPositiveActive
    outlineOnLightTransparentWarning = other.outlineOnLightTransparentWarning
    outlineOnLightTransparentWarningHover = other.outlineOnLightTransparentWarningHover
    outlineOnLightTransparentWarningActive = other.outlineOnLightTransparentWarningActive
    outlineOnLightNegativeTransparent = other.outlineOnLightNegativeTransparent
    outlineOnLightNegativeTransparentHover = other.outlineOnLightNegativeTransparentHover
    outlineOnLightNegativeTransparentActive = other.outlineOnLightNegativeTransparentActive
    outlineOnLightTransparentInfoHover = other.outlineOnLightTransparentInfoHover
    outlineOnLightTransparentInfoActive = other.outlineOnLightTransparentInfoActive
    outlineOnLightPrimaryHover = other.outlineOnLightPrimaryHover
    outlineOnLightPrimaryActive = other.outlineOnLightPrimaryActive
    outlineOnLightInfo = other.outlineOnLightInfo
    outlineOnLightInfoMinor = other.outlineOnLightInfoMinor
    outlineOnLightTransparentInfo = other.outlineOnLightTransparentInfo
    outlineOnLightSolidTertiaryHover = other.outlineOnLightSolidTertiaryHover
    outlineOnLightSolidTertiaryActive = other.outlineOnLightSolidTertiaryActive
    outlineOnLightSolidDefaultHover = other.outlineOnLightSolidDefaultHover
    outlineOnLightSolidDefaultActive = other.outlineOnLightSolidDefaultActive
    outlineOnLightSolidPrimaryHover = other.outlineOnLightSolidPrimaryHover
    outlineOnLightSolidPrimaryActive = other.outlineOnLightSolidPrimaryActive
    outlineOnLightSolidSecondaryHover = other.outlineOnLightSolidSecondaryHover
    outlineOnLightSolidSecondaryActive = other.outlineOnLightSolidSecondaryActive
    outlineOnLightSolidPrimary = other.outlineOnLightSolidPrimary
    outlineOnLightSolidSecondary = other.outlineOnLightSolidSecondary
    outlineOnLightSolidTertiary = other.outlineOnLightSolidTertiary
    outlineOnLightSolidDefault = other.outlineOnLightSolidDefault
    outlineInversePrimaryHover = other.outlineInversePrimaryHover
    outlineInversePrimaryActive = other.outlineInversePrimaryActive
    outlineInverseSecondaryHover = other.outlineInverseSecondaryHover
    outlineInverseSecondaryActive = other.outlineInverseSecondaryActive
    outlineInverseTertiaryHover = other.outlineInverseTertiaryHover
    outlineInverseTertiaryActive = other.outlineInverseTertiaryActive
    outlineInverseDefaultHover = other.outlineInverseDefaultHover
    outlineInverseDefaultActive = other.outlineInverseDefaultActive
    outlineInverseTransparentPrimaryHover = other.outlineInverseTransparentPrimaryHover
    outlineInverseTransparentPrimaryActive = other.outlineInverseTransparentPrimaryActive
    outlineInverseTransparentSecondaryHover = other.outlineInverseTransparentSecondaryHover
    outlineInverseTransparentSecondaryActive = other.outlineInverseTransparentSecondaryActive
    outlineInverseTransparentTertiaryHover = other.outlineInverseTransparentTertiaryHover
    outlineInverseTransparentTertiaryActive = other.outlineInverseTransparentTertiaryActive
    outlineInverseTransparentClearHover = other.outlineInverseTransparentClearHover
    outlineInverseTransparentClearActive = other.outlineInverseTransparentClearActive
    outlineInverseAccentHover = other.outlineInverseAccentHover
    outlineInverseAccentActive = other.outlineInverseAccentActive
    outlineInverseAccentMinorHover = other.outlineInverseAccentMinorHover
    outlineInverseAccentMinorActive = other.outlineInverseAccentMinorActive
    outlineInverseTransparentAccentHover = other.outlineInverseTransparentAccentHover
    outlineInverseTransparentAccentActive = other.outlineInverseTransparentAccentActive
    outlineInversePositiveHover = other.outlineInversePositiveHover
    outlineInversePositiveActive = other.outlineInversePositiveActive
    outlineInverseWarningHover = other.outlineInverseWarningHover
    outlineInverseWarningActive = other.outlineInverseWarningActive
    outlineInverseNegativeHover = other.outlineInverseNegativeHover
    outlineInverseNegativeActive = other.outlineInverseNegativeActive
    outlineInverseInfoHover = other.outlineInverseInfoHover
    outlineInverseInfoActive = other.outlineInverseInfoActive
    outlineInversePositiveMinorHover = other.outlineInversePositiveMinorHover
    outlineInversePositiveMinorActive = other.outlineInversePositiveMinorActive
    outlineInverseWarningMinorHover = other.outlineInverseWarningMinorHover
    outlineInverseWarningMinorActive = other.outlineInverseWarningMinorActive
    outlineInverseNegativeMinorHover = other.outlineInverseNegativeMinorHover
    outlineInverseNegativeMinorActive = other.outlineInverseNegativeMinorActive
    outlineInverseInfoMinorHover = other.outlineInverseInfoMinorHover
    outlineInverseInfoMinorActive = other.outlineInverseInfoMinorActive
    outlineInverseTransparentPositiveHover = other.outlineInverseTransparentPositiveHover
    outlineInverseTransparentPositiveActive = other.outlineInverseTransparentPositiveActive
    outlineInverseTransparentWarningHover = other.outlineInverseTransparentWarningHover
    outlineInverseTransparentWarningActive = other.outlineInverseTransparentWarningActive
    outlineInverseTransparentNegativeHover = other.outlineInverseTransparentNegativeHover
    outlineInverseTransparentNegativeActive = other.outlineInverseTransparentNegativeActive
    outlineInverseTransparentInfoHover = other.outlineInverseTransparentInfoHover
    outlineInverseTransparentInfoActive = other.outlineInverseTransparentInfoActive
    outlineInverseTransparentPrimary = other.outlineInverseTransparentPrimary
    outlineInverseTransparentSecondary = other.outlineInverseTransparentSecondary
    outlineInverseTransparentTertiary = other.outlineInverseTransparentTertiary
    outlineInverseTransparentClear = other.outlineInverseTransparentClear
    outlineInverseAccent = other.outlineInverseAccent
    outlineInverseAccentMinor = other.outlineInverseAccentMinor
    outlineInverseTransparentAccent = other.outlineInverseTransparentAccent
    outlineInversePositive = other.outlineInversePositive
    outlineInverseWarning = other.outlineInverseWarning
    outlineInverseNegative = other.outlineInverseNegative
    outlineInverseInfo = other.outlineInverseInfo
    outlineInversePositiveMinor = other.outlineInversePositiveMinor
    outlineInverseWarningMinor = other.outlineInverseWarningMinor
    outlineInverseNegativeMinor = other.outlineInverseNegativeMinor
    outlineInverseInfoMinor = other.outlineInverseInfoMinor
    outlineInverseTransparentPositive = other.outlineInverseTransparentPositive
    outlineInverseTransparentWarning = other.outlineInverseTransparentWarning
    outlineInverseTransparentNegative = other.outlineInverseTransparentNegative
    outlineInverseTransparentInfo = other.outlineInverseTransparentInfo
    outlineInverseSolidPrimaryHover = other.outlineInverseSolidPrimaryHover
    outlineInverseSolidPrimaryActive = other.outlineInverseSolidPrimaryActive
    outlineInverseSolidSecondaryHover = other.outlineInverseSolidSecondaryHover
    outlineInverseSolidSecondaryActive = other.outlineInverseSolidSecondaryActive
    outlineInverseSolidTertiaryHover = other.outlineInverseSolidTertiaryHover
    outlineInverseSolidTertiaryActive = other.outlineInverseSolidTertiaryActive
    outlineInverseSolidDefaultHover = other.outlineInverseSolidDefaultHover
    outlineInverseSolidDefaultActive = other.outlineInverseSolidDefaultActive
    outlineInverseSolidPrimary = other.outlineInverseSolidPrimary
    outlineInverseSolidSecondary = other.outlineInverseSolidSecondary
    outlineInverseSolidTertiary = other.outlineInverseSolidTertiary
    outlineInverseSolidDefault = other.outlineInverseSolidDefault
    dataDefaultYellow = other.dataDefaultYellow
    dataDefaultYellowHover = other.dataDefaultYellowHover
    dataDefaultYellowActive = other.dataDefaultYellowActive
    dataDefaultYellowMinor = other.dataDefaultYellowMinor
    dataDefaultYellowMinorHover = other.dataDefaultYellowMinorHover
    dataDefaultYellowMinorActive = other.dataDefaultYellowMinorActive
    dataDefaultYellowTransparent = other.dataDefaultYellowTransparent
    dataDefaultYellowTransparentHover = other.dataDefaultYellowTransparentHover
    dataDefaultYellowTransparentActive = other.dataDefaultYellowTransparentActive
    dataOnDarkYellow = other.dataOnDarkYellow
    dataOnDarkYellowHover = other.dataOnDarkYellowHover
    dataOnDarkYellowActive = other.dataOnDarkYellowActive
    dataOnDarkYellowMinor = other.dataOnDarkYellowMinor
    dataOnDarkYellowMinorHover = other.dataOnDarkYellowMinorHover
    dataOnDarkYellowMinorActive = other.dataOnDarkYellowMinorActive
    dataOnDarkYellowTransparent = other.dataOnDarkYellowTransparent
    dataOnDarkYellowTransparentHover = other.dataOnDarkYellowTransparentHover
    dataOnDarkYellowTransparentActive = other.dataOnDarkYellowTransparentActive
    dataOnLightYellow = other.dataOnLightYellow
    dataOnLightYellowHover = other.dataOnLightYellowHover
    dataOnLightYellowActive = other.dataOnLightYellowActive
    dataOnLightYellowMinor = other.dataOnLightYellowMinor
    dataOnLightYellowMinorHover = other.dataOnLightYellowMinorHover
    dataOnLightYellowMinorActive = other.dataOnLightYellowMinorActive
    dataOnLightYellowTransparent = other.dataOnLightYellowTransparent
    dataOnLightYellowTransparentHover = other.dataOnLightYellowTransparentHover
    dataOnLightYellowTransparentActive = other.dataOnLightYellowTransparentActive
    dataInverseYellow = other.dataInverseYellow
    dataInverseYellowHover = other.dataInverseYellowHover
    dataInverseYellowActive = other.dataInverseYellowActive
    dataInverseYellowMinor = other.dataInverseYellowMinor
    dataInverseYellowMinorHover = other.dataInverseYellowMinorHover
    dataInverseYellowMinorActive = other.dataInverseYellowMinorActive
    dataInverseYellowTransparent = other.dataInverseYellowTransparent
    dataInverseYellowTransparentHover = other.dataInverseYellowTransparentHover
    dataInverseYellowTransparentActive = other.dataInverseYellowTransparentActive
}

private fun MutableMap<String, Color>.add(
    attribute: String,
    defaultTokenValue: Color,
    overwriteMap: Map<String, Color>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Цвета [PlasmaSdServiceColors] для светлой темы
 */
@Suppress("LongMethod")
public fun lightPlasmaSdServiceColors(overrideColors: ColorOverrideScope.() -> Unit = {}): PlasmaSdServiceColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("textDefaultPrimary", LightColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        LightColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondary", LightColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiary", LightColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraph", LightColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccent", LightColorTokens.TextDefaultAccent, overwrite)
    initial.add("textDefaultPositive", LightColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarning", LightColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegative", LightColorTokens.TextDefaultNegative, overwrite)
    initial.add(
        "textDefaultAccentMinorHover",
        LightColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorActive",
        LightColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoHover", LightColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultInfoActive", LightColorTokens.TextDefaultInfoActive, overwrite)
    initial.add(
        "textDefaultPositiveMinorHover",
        LightColorTokens.TextDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPositiveMinorActive",
        LightColorTokens.TextDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorHover",
        LightColorTokens.TextDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorActive",
        LightColorTokens.TextDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorHover",
        LightColorTokens.TextDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorActive",
        LightColorTokens.TextDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoMinorHover", LightColorTokens.TextDefaultInfoMinorHover, overwrite)
    initial.add(
        "textDefaultInfoMinorActive",
        LightColorTokens.TextDefaultInfoMinorActive,
        overwrite,
    )
    initial.add("textDefaultAccentMinor", LightColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add("textDefaultPositiveMinor", LightColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", LightColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", LightColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfo", LightColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultInfoMinor", LightColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textDefaultPrimaryHover", LightColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", LightColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultSecondaryHover", LightColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add(
        "textDefaultSecondaryActive",
        LightColorTokens.TextDefaultSecondaryActive,
        overwrite,
    )
    initial.add("textDefaultTertiaryHover", LightColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", LightColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultParagraphHover", LightColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add(
        "textDefaultParagraphActive",
        LightColorTokens.TextDefaultParagraphActive,
        overwrite,
    )
    initial.add("textDefaultAccentHover", LightColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", LightColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultPositiveHover", LightColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", LightColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultWarningHover", LightColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", LightColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultNegativeHover", LightColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", LightColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textOnDarkPrimary", LightColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        LightColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondary", LightColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiary", LightColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraph", LightColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccent", LightColorTokens.TextOnDarkAccent, overwrite)
    initial.add("textOnDarkPositive", LightColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarning", LightColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegative", LightColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkAccentMinor", LightColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add(
        "textOnDarkAccentMinorHover",
        LightColorTokens.TextOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorActive",
        LightColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoHover", LightColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", LightColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add("textOnDarkPositiveMinor", LightColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add(
        "textOnDarkPositiveMinorHover",
        LightColorTokens.TextOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkPositiveMinorActive",
        LightColorTokens.TextOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("textOnDarkWarningMinor", LightColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add(
        "textOnDarkWarningMinorHover",
        LightColorTokens.TextOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorActive",
        LightColorTokens.TextOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add("textOnDarkNegativeMinor", LightColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add(
        "textOnDarkNegativeMinorHover",
        LightColorTokens.TextOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorActive",
        LightColorTokens.TextOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoMinorHover", LightColorTokens.TextOnDarkInfoMinorHover, overwrite)
    initial.add("textOnDarkInfoMinorActive", LightColorTokens.TextOnDarkInfoMinorActive, overwrite)
    initial.add("textOnDarkInfoMinor", LightColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnDarkInfo", LightColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPrimaryHover", LightColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", LightColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkSecondaryHover", LightColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", LightColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkTertiaryHover", LightColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", LightColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkParagraphHover", LightColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", LightColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkAccentHover", LightColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", LightColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkPositiveHover", LightColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", LightColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkWarningHover", LightColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", LightColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkNegativeHover", LightColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", LightColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnLightPrimary", LightColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        LightColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondary", LightColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiary", LightColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraph", LightColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccent", LightColorTokens.TextOnLightAccent, overwrite)
    initial.add("textOnLightPositive", LightColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarning", LightColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightAccentMinor", LightColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        LightColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorActive",
        LightColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoHover", LightColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", LightColorTokens.TextOnLightInfoActive, overwrite)
    initial.add("textOnLightPositiveMinor", LightColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add(
        "textOnLightPositiveMinorHover",
        LightColorTokens.TextOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPositiveMinorActive",
        LightColorTokens.TextOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add("textOnLightWarningMinor", LightColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add(
        "textOnLightWarningMinorHover",
        LightColorTokens.TextOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorActive",
        LightColorTokens.TextOnLightWarningMinorActive,
        overwrite,
    )
    initial.add("textOnLightNegativeMinor", LightColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add(
        "textOnLightNegativeMinorHover",
        LightColorTokens.TextOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorActive",
        LightColorTokens.TextOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoMinorHover", LightColorTokens.TextOnLightInfoMinorHover, overwrite)
    initial.add(
        "textOnLightInfoMinorActive",
        LightColorTokens.TextOnLightInfoMinorActive,
        overwrite,
    )
    initial.add("textOnLightNegative", LightColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightNegativeHover", LightColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", LightColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightInfo", LightColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightInfoMinor", LightColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", LightColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", LightColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightSecondaryHover", LightColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add(
        "textOnLightSecondaryActive",
        LightColorTokens.TextOnLightSecondaryActive,
        overwrite,
    )
    initial.add("textOnLightTertiaryHover", LightColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", LightColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightParagraphHover", LightColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add(
        "textOnLightParagraphActive",
        LightColorTokens.TextOnLightParagraphActive,
        overwrite,
    )
    initial.add("textOnLightAccentHover", LightColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", LightColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightPositiveHover", LightColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", LightColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightWarningHover", LightColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", LightColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textInversePrimary", LightColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        LightColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondary", LightColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiary", LightColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraph", LightColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInversePositive", LightColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarning", LightColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegative", LightColorTokens.TextInverseNegative, overwrite)
    initial.add("textInversePrimaryHover", LightColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", LightColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInverseSecondaryHover", LightColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add(
        "textInverseSecondaryActive",
        LightColorTokens.TextInverseSecondaryActive,
        overwrite,
    )
    initial.add("textInverseTertiaryHover", LightColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", LightColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseParagraphHover", LightColorTokens.TextInverseParagraphHover, overwrite)
    initial.add(
        "textInverseParagraphActive",
        LightColorTokens.TextInverseParagraphActive,
        overwrite,
    )
    initial.add("textInverseAccentHover", LightColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", LightColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInversePositiveHover", LightColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", LightColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInverseWarningHover", LightColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", LightColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseNegativeHover", LightColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", LightColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseAccentMinor", LightColorTokens.TextInverseAccentMinor, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        LightColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        LightColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoHover", LightColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseInfoActive", LightColorTokens.TextInverseInfoActive, overwrite)
    initial.add(
        "textInversePositiveMinorHover",
        LightColorTokens.TextInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePositiveMinorActive",
        LightColorTokens.TextInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorHover",
        LightColorTokens.TextInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorActive",
        LightColorTokens.TextInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorHover",
        LightColorTokens.TextInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorActive",
        LightColorTokens.TextInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoMinorHover", LightColorTokens.TextInverseInfoMinorHover, overwrite)
    initial.add(
        "textInverseInfoMinorActive",
        LightColorTokens.TextInverseInfoMinorActive,
        overwrite,
    )
    initial.add("textInverseAccent", LightColorTokens.TextInverseAccent, overwrite)
    initial.add("textInverseInfo", LightColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", LightColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", LightColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", LightColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", LightColorTokens.TextInverseInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultSolidDefault",
        LightColorTokens.SurfaceDefaultSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimary",
        LightColorTokens.SurfaceDefaultSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        LightColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondary",
        LightColorTokens.SurfaceDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiary",
        LightColorTokens.SurfaceDefaultSolidTertiary,
        overwrite,
    )
    initial.add("surfaceDefaultSolidCard", LightColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        LightColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefault",
        LightColorTokens.SurfaceDefaultTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        LightColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        LightColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        LightColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        LightColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        LightColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", LightColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add("surfaceDefaultPositive", LightColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add("surfaceDefaultWarning", LightColorTokens.SurfaceDefaultWarning, overwrite)
    initial.add("surfaceDefaultNegative", LightColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add("surfaceDefaultClear", LightColorTokens.SurfaceDefaultClear, overwrite)
    initial.add(
        "surfaceDefaultTransparentDeep",
        LightColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorHover",
        LightColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        LightColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        LightColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        LightColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceDefaultInfoHover", LightColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultInfoActive", LightColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinorHover",
        LightColorTokens.SurfaceDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinorActive",
        LightColorTokens.SurfaceDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorHover",
        LightColorTokens.SurfaceDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorActive",
        LightColorTokens.SurfaceDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorHover",
        LightColorTokens.SurfaceDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorActive",
        LightColorTokens.SurfaceDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorHover",
        LightColorTokens.SurfaceDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorActive",
        LightColorTokens.SurfaceDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveHover",
        LightColorTokens.SurfaceDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveActive",
        LightColorTokens.SurfaceDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningHover",
        LightColorTokens.SurfaceDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningActive",
        LightColorTokens.SurfaceDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        LightColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        LightColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoHover",
        LightColorTokens.SurfaceDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoActive",
        LightColorTokens.SurfaceDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", LightColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentAccent",
        LightColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinor",
        LightColorTokens.SurfaceDefaultPositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinor",
        LightColorTokens.SurfaceDefaultWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinor",
        LightColorTokens.SurfaceDefaultNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositive",
        LightColorTokens.SurfaceDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarning",
        LightColorTokens.SurfaceDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        LightColorTokens.SurfaceDefaultTransparentNegative,
        overwrite,
    )
    initial.add("surfaceDefaultInfo", LightColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add("surfaceDefaultInfoMinor", LightColorTokens.SurfaceDefaultInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentInfo",
        LightColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        LightColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        LightColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        LightColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        LightColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        LightColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        LightColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        LightColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        LightColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        LightColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        LightColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefaultHover",
        LightColorTokens.SurfaceDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefaultActive",
        LightColorTokens.SurfaceDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        LightColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        LightColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        LightColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        LightColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        LightColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        LightColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        LightColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardActive",
        LightColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentHover", LightColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add(
        "surfaceDefaultAccentActive",
        LightColorTokens.SurfaceDefaultAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveHover",
        LightColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        LightColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningHover",
        LightColorTokens.SurfaceDefaultWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningActive",
        LightColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeHover",
        LightColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        LightColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultClearHover", LightColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", LightColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        LightColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        LightColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", LightColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        LightColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondary",
        LightColorTokens.SurfaceOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiary",
        LightColorTokens.SurfaceOnDarkSolidTertiary,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidCard", LightColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        LightColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefault",
        LightColorTokens.SurfaceOnDarkTransparentDefault,
        overwrite,
    )
    initial.add("surfaceOnDarkAccent", LightColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add("surfaceOnDarkPositive", LightColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarning", LightColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkNegative", LightColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkClear", LightColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add(
        "surfaceOnDarkTransparentDeep",
        LightColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentMinor", LightColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        LightColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        LightColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccent",
        LightColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentHover",
        LightColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        LightColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSurfaceInfoHover",
        LightColorTokens.SurfaceOnDarkSurfaceInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSurfaceInfoActive",
        LightColorTokens.SurfaceOnDarkSurfaceInfoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinor",
        LightColorTokens.SurfaceOnDarkPositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinorHover",
        LightColorTokens.SurfaceOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinorActive",
        LightColorTokens.SurfaceOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningMinor", LightColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add(
        "surfaceOnDarkWarningMinorHover",
        LightColorTokens.SurfaceOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorActive",
        LightColorTokens.SurfaceOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinor",
        LightColorTokens.SurfaceOnDarkNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorHover",
        LightColorTokens.SurfaceOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorActive",
        LightColorTokens.SurfaceOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorHover",
        LightColorTokens.SurfaceOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorActive",
        LightColorTokens.SurfaceOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveHover",
        LightColorTokens.SurfaceOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveActive",
        LightColorTokens.SurfaceOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningHover",
        LightColorTokens.SurfaceOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningActive",
        LightColorTokens.SurfaceOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        LightColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        LightColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoHover",
        LightColorTokens.SurfaceOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoActive",
        LightColorTokens.SurfaceOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", LightColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnDarkSolidDefaultHover",
        LightColorTokens.SurfaceOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultActive",
        LightColorTokens.SurfaceOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        LightColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryHover",
        LightColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryActive",
        LightColorTokens.SurfaceOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondary",
        LightColorTokens.SurfaceOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        LightColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryActive",
        LightColorTokens.SurfaceOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiary",
        LightColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        LightColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        LightColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        LightColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        LightColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        LightColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardActive",
        LightColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositive",
        LightColorTokens.SurfaceOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarning",
        LightColorTokens.SurfaceOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        LightColorTokens.SurfaceOnDarkTransparentNegative,
        overwrite,
    )
    initial.add("surfaceOnDarkSurfaceInfo", LightColorTokens.SurfaceOnDarkSurfaceInfo, overwrite)
    initial.add("surfaceOnDarkInfoMinor", LightColorTokens.SurfaceOnDarkInfoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentInfo",
        LightColorTokens.SurfaceOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        LightColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        LightColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        LightColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        LightColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        LightColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        LightColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardHover",
        LightColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        LightColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefaultHover",
        LightColorTokens.SurfaceOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefaultActive",
        LightColorTokens.SurfaceOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentHover", LightColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", LightColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add(
        "surfaceOnDarkPositiveHover",
        LightColorTokens.SurfaceOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveActive",
        LightColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningHover", LightColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add(
        "surfaceOnDarkWarningActive",
        LightColorTokens.SurfaceOnDarkWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeHover",
        LightColorTokens.SurfaceOnDarkNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeActive",
        LightColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", LightColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", LightColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        LightColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        LightColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefault",
        LightColorTokens.SurfaceOnLightSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimary",
        LightColorTokens.SurfaceOnLightSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        LightColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondary",
        LightColorTokens.SurfaceOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiary",
        LightColorTokens.SurfaceOnLightSolidTertiary,
        overwrite,
    )
    initial.add("surfaceOnLightSolidCard", LightColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        LightColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefault",
        LightColorTokens.SurfaceOnLightTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        LightColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        LightColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        LightColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        LightColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        LightColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightAccent", LightColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add("surfaceOnLightPositive", LightColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add("surfaceOnLightWarning", LightColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add("surfaceOnLightNegative", LightColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightClear", LightColorTokens.SurfaceOnLightClear, overwrite)
    initial.add(
        "surfaceOnLightTransparentDeep",
        LightColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", LightColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorHover",
        LightColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorActive",
        LightColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccent",
        LightColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        LightColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        LightColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightInfoHover", LightColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", LightColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinor",
        LightColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorHover",
        LightColorTokens.SurfaceOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorActive",
        LightColorTokens.SurfaceOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinor",
        LightColorTokens.SurfaceOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorHover",
        LightColorTokens.SurfaceOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorActive",
        LightColorTokens.SurfaceOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinor",
        LightColorTokens.SurfaceOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorHover",
        LightColorTokens.SurfaceOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorActive",
        LightColorTokens.SurfaceOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorHover",
        LightColorTokens.SurfaceOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorActive",
        LightColorTokens.SurfaceOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveHover",
        LightColorTokens.SurfaceOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveActive",
        LightColorTokens.SurfaceOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningHover",
        LightColorTokens.SurfaceOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningActive",
        LightColorTokens.SurfaceOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        LightColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        LightColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoHover",
        LightColorTokens.SurfaceOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoActive",
        LightColorTokens.SurfaceOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositive",
        LightColorTokens.SurfaceOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarning",
        LightColorTokens.SurfaceOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        LightColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", LightColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add("surfaceOnLightInfoMinor", LightColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentInfo",
        LightColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultHover",
        LightColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultActive",
        LightColorTokens.SurfaceOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        LightColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        LightColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        LightColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        LightColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        LightColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        LightColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        LightColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        LightColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefaultHover",
        LightColorTokens.SurfaceOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefaultActive",
        LightColorTokens.SurfaceOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        LightColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        LightColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        LightColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        LightColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        LightColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        LightColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        LightColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        LightColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentHover", LightColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add(
        "surfaceOnLightAccentActive",
        LightColorTokens.SurfaceOnLightAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveHover",
        LightColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveActive",
        LightColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningHover",
        LightColorTokens.SurfaceOnLightWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningActive",
        LightColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeHover",
        LightColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        LightColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightClearHover", LightColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", LightColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        LightColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        LightColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefault",
        LightColorTokens.SurfaceInverseSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimary",
        LightColorTokens.SurfaceInverseSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        LightColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        LightColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiary",
        LightColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", LightColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        LightColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefault",
        LightColorTokens.SurfaceInverseTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        LightColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        LightColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        LightColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCard",
        LightColorTokens.SurfaceInverseTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        LightColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseAccent", LightColorTokens.SurfaceInverseAccent, overwrite)
    initial.add("surfaceInversePositive", LightColorTokens.SurfaceInversePositive, overwrite)
    initial.add("surfaceInverseWarning", LightColorTokens.SurfaceInverseWarning, overwrite)
    initial.add("surfaceInverseNegative", LightColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseClear", LightColorTokens.SurfaceInverseClear, overwrite)
    initial.add(
        "surfaceInverseSolidDefaultHover",
        LightColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        LightColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        LightColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        LightColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        LightColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        LightColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        LightColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        LightColorTokens.SurfaceInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        LightColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        LightColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefaultHover",
        LightColorTokens.SurfaceInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefaultActive",
        LightColorTokens.SurfaceInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        LightColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        LightColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        LightColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        LightColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        LightColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        LightColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        LightColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardActive",
        LightColorTokens.SurfaceInverseTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentHover", LightColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add(
        "surfaceInverseAccentActive",
        LightColorTokens.SurfaceInverseAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveHover",
        LightColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveActive",
        LightColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningHover",
        LightColorTokens.SurfaceInverseWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningActive",
        LightColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeHover",
        LightColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        LightColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", LightColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", LightColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add(
        "surfaceInverseTransparentDeep",
        LightColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        LightColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        LightColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", LightColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        LightColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorActive",
        LightColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccent",
        LightColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentHover",
        LightColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        LightColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseInfo", LightColorTokens.SurfaceInverseInfo, overwrite)
    initial.add("surfaceInverseInfoHover", LightColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", LightColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        LightColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorHover",
        LightColorTokens.SurfaceInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorActive",
        LightColorTokens.SurfaceInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinor",
        LightColorTokens.SurfaceInverseWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorHover",
        LightColorTokens.SurfaceInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorActive",
        LightColorTokens.SurfaceInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinor",
        LightColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorHover",
        LightColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        LightColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", LightColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseInfoMinorHover",
        LightColorTokens.SurfaceInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorActive",
        LightColorTokens.SurfaceInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositive",
        LightColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveHover",
        LightColorTokens.SurfaceInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveActive",
        LightColorTokens.SurfaceInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        LightColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningHover",
        LightColorTokens.SurfaceInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningActive",
        LightColorTokens.SurfaceInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        LightColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        LightColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        LightColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        LightColorTokens.SurfaceInverseTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoHover",
        LightColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        LightColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("backgroundDefaultPrimary", LightColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add(
        "backgroundDefaultPrimaryBrightness",
        LightColorTokens.BackgroundDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "backgroundDefaultSecondary",
        LightColorTokens.BackgroundDefaultSecondary,
        overwrite,
    )
    initial.add("backgroundDefaultTertiary", LightColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundDarkPrimary", LightColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundDarkSecondary", LightColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add("backgroundDarkTertiary", LightColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundLightPrimary", LightColorTokens.BackgroundLightPrimary, overwrite)
    initial.add("backgroundLightSecondary", LightColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("backgroundLightTertiary", LightColorTokens.BackgroundLightTertiary, overwrite)
    initial.add(
        "backgroundInversePrimaryBrightness",
        LightColorTokens.BackgroundInversePrimaryBrightness,
        overwrite,
    )
    initial.add(
        "backgroundInverseSecondary",
        LightColorTokens.BackgroundInverseSecondary,
        overwrite,
    )
    initial.add("backgroundInverseTertiary", LightColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("backgroundInversePrimary", LightColorTokens.BackgroundInversePrimary, overwrite)
    initial.add("overlayDefaultSoft", LightColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", LightColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", LightColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", LightColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", LightColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", LightColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", LightColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", LightColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", LightColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseHard", LightColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseSoft", LightColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseBlur", LightColorTokens.OverlayInverseBlur, overwrite)
    initial.add(
        "outlineDefaultSecondaryHover",
        LightColorTokens.OutlineDefaultSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSecondaryActive",
        LightColorTokens.OutlineDefaultSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTertiaryHover",
        LightColorTokens.OutlineDefaultTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTertiaryActive",
        LightColorTokens.OutlineDefaultTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultDefaultHover",
        LightColorTokens.OutlineDefaultDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultDefaultActive",
        LightColorTokens.OutlineDefaultDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        LightColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        LightColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryHover",
        LightColorTokens.OutlineDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryActive",
        LightColorTokens.OutlineDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryHover",
        LightColorTokens.OutlineDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryActive",
        LightColorTokens.OutlineDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClearHover",
        LightColorTokens.OutlineDefaultTransparentClearHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClearActive",
        LightColorTokens.OutlineDefaultTransparentClearActive,
        overwrite,
    )
    initial.add("outlineDefaultAccentHover", LightColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add(
        "outlineDefaultAccentActive",
        LightColorTokens.OutlineDefaultAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorHover",
        LightColorTokens.OutlineDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorActive",
        LightColorTokens.OutlineDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentHover",
        LightColorTokens.OutlineDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentActive",
        LightColorTokens.OutlineDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveHover",
        LightColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveActive",
        LightColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningHover",
        LightColorTokens.OutlineDefaultWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningActive",
        LightColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        LightColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        LightColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfoHover", LightColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add("outlineDefaultInfoActive", LightColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineDefaultPositiveMinorHover",
        LightColorTokens.OutlineDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveMinorActive",
        LightColorTokens.OutlineDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorHover",
        LightColorTokens.OutlineDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorActive",
        LightColorTokens.OutlineDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorHover",
        LightColorTokens.OutlineDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorActive",
        LightColorTokens.OutlineDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorHover",
        LightColorTokens.OutlineDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorActive",
        LightColorTokens.OutlineDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveHover",
        LightColorTokens.OutlineDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveActive",
        LightColorTokens.OutlineDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningHover",
        LightColorTokens.OutlineDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningActive",
        LightColorTokens.OutlineDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeTransparentHover",
        LightColorTokens.OutlineDefaultNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeTransparentActive",
        LightColorTokens.OutlineDefaultNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoHover",
        LightColorTokens.OutlineDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoActive",
        LightColorTokens.OutlineDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPrimaryHover",
        LightColorTokens.OutlineDefaultPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPrimaryActive",
        LightColorTokens.OutlineDefaultPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        LightColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondary",
        LightColorTokens.OutlineDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiary",
        LightColorTokens.OutlineDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClear",
        LightColorTokens.OutlineDefaultTransparentClear,
        overwrite,
    )
    initial.add("outlineDefaultAccent", LightColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", LightColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        LightColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultPositive", LightColorTokens.OutlineDefaultPositive, overwrite)
    initial.add("outlineDefaultWarning", LightColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultNegative", LightColorTokens.OutlineDefaultNegative, overwrite)
    initial.add(
        "outlineDefaultPositiveMinor",
        LightColorTokens.OutlineDefaultPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinor",
        LightColorTokens.OutlineDefaultWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinor",
        LightColorTokens.OutlineDefaultNegativeMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositive",
        LightColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarning",
        LightColorTokens.OutlineDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegative",
        LightColorTokens.OutlineDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeHover",
        LightColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        LightColorTokens.OutlineDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfo", LightColorTokens.OutlineDefaultInfo, overwrite)
    initial.add("outlineDefaultInfoMinor", LightColorTokens.OutlineDefaultInfoMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentInfo",
        LightColorTokens.OutlineDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryHover",
        LightColorTokens.OutlineDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryActive",
        LightColorTokens.OutlineDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryHover",
        LightColorTokens.OutlineDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryActive",
        LightColorTokens.OutlineDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryHover",
        LightColorTokens.OutlineDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryActive",
        LightColorTokens.OutlineDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefaultHover",
        LightColorTokens.OutlineDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefaultActive",
        LightColorTokens.OutlineDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimary",
        LightColorTokens.OutlineDefaultSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondary",
        LightColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiary",
        LightColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefault",
        LightColorTokens.OutlineDefaultSolidDefault,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSecondaryHover",
        LightColorTokens.OutlineOnDarkSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSecondaryActive",
        LightColorTokens.OutlineOnDarkSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTertiaryHover",
        LightColorTokens.OutlineOnDarkTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTertiaryActive",
        LightColorTokens.OutlineOnDarkTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkDefaultHover", LightColorTokens.OutlineOnDarkDefaultHover, overwrite)
    initial.add(
        "outlineOnDarkDefaultActive",
        LightColorTokens.OutlineOnDarkDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimary",
        LightColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        LightColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        LightColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        LightColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryHover",
        LightColorTokens.OutlineOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryActive",
        LightColorTokens.OutlineOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        LightColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryHover",
        LightColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        LightColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkAccent", LightColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentHover", LightColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", LightColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add("outlineOnDarkAccentMinor", LightColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkAccentMinorHover",
        LightColorTokens.OutlineOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorActive",
        LightColorTokens.OutlineOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccent",
        LightColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentHover",
        LightColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        LightColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", LightColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add(
        "outlineOnDarkPositiveHover",
        LightColorTokens.OutlineOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveActive",
        LightColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarning", LightColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkWarningHover", LightColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add(
        "outlineOnDarkWarningActive",
        LightColorTokens.OutlineOnDarkWarningActive,
        overwrite,
    )
    initial.add("outlineOnDarkNegative", LightColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add(
        "outlineOnDarkNegativeHover",
        LightColorTokens.OutlineOnDarkNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeActive",
        LightColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfoHover", LightColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", LightColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinor",
        LightColorTokens.OutlineOnDarkPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorHover",
        LightColorTokens.OutlineOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorActive",
        LightColorTokens.OutlineOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarningMinor", LightColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add(
        "outlineOnDarkWarningMinorHover",
        LightColorTokens.OutlineOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorActive",
        LightColorTokens.OutlineOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinor",
        LightColorTokens.OutlineOnDarkNegativeMinor,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorHover",
        LightColorTokens.OutlineOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorActive",
        LightColorTokens.OutlineOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorHover",
        LightColorTokens.OutlineOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorActive",
        LightColorTokens.OutlineOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        LightColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveHover",
        LightColorTokens.OutlineOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveActive",
        LightColorTokens.OutlineOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarning",
        LightColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningHover",
        LightColorTokens.OutlineOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningActive",
        LightColorTokens.OutlineOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparent",
        LightColorTokens.OutlineOnDarkNegativeTransparent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparentHover",
        LightColorTokens.OutlineOnDarkNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparentActive",
        LightColorTokens.OutlineOnDarkNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoHover",
        LightColorTokens.OutlineOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoActive",
        LightColorTokens.OutlineOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnDarkPrimaryHover", LightColorTokens.OutlineOnDarkPrimaryHover, overwrite)
    initial.add(
        "outlineOnDarkPrimaryActive",
        LightColorTokens.OutlineOnDarkPrimaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfo", LightColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkInfoMinor", LightColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentInfo",
        LightColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add("outlineOnDarkSolidPrimary", LightColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add(
        "outlineOnDarkSolidPrimaryHover",
        LightColorTokens.OutlineOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryActive",
        LightColorTokens.OutlineOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        LightColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryHover",
        LightColorTokens.OutlineOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryActive",
        LightColorTokens.OutlineOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiary",
        LightColorTokens.OutlineOnDarkSolidTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryHover",
        LightColorTokens.OutlineOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryActive",
        LightColorTokens.OutlineOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkSolidDefault", LightColorTokens.OutlineOnDarkSolidDefault, overwrite)
    initial.add(
        "outlineOnDarkSolidDefaultHover",
        LightColorTokens.OutlineOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidDefaultActive",
        LightColorTokens.OutlineOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSecondaryHover",
        LightColorTokens.OutlineOnLightSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSecondaryActive",
        LightColorTokens.OutlineOnLightSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTertiaryHover",
        LightColorTokens.OutlineOnLightTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTertiaryActive",
        LightColorTokens.OutlineOnLightTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightDefaultHover",
        LightColorTokens.OutlineOnLightDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightDefaultActive",
        LightColorTokens.OutlineOnLightDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimary",
        LightColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        LightColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        LightColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        LightColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryHover",
        LightColorTokens.OutlineOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryActive",
        LightColorTokens.OutlineOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        LightColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryHover",
        LightColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        LightColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightAccent", LightColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentHover", LightColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add(
        "outlineOnLightAccentActive",
        LightColorTokens.OutlineOnLightAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightAccentMinor", LightColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add(
        "outlineOnLightAccentMinorHover",
        LightColorTokens.OutlineOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorActive",
        LightColorTokens.OutlineOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccent",
        LightColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentHover",
        LightColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        LightColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPositive", LightColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        LightColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        LightColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add("outlineOnLightWarning", LightColorTokens.OutlineOnLightWarning, overwrite)
    initial.add(
        "outlineOnLightWarningHover",
        LightColorTokens.OutlineOnLightWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningActive",
        LightColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add("outlineOnLightNegative", LightColorTokens.OutlineOnLightNegative, overwrite)
    initial.add(
        "outlineOnLightNegativeHover",
        LightColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeActive",
        LightColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add("outlineOnLightInfoHover", LightColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfoActive", LightColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        LightColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorHover",
        LightColorTokens.OutlineOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorActive",
        LightColorTokens.OutlineOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinor",
        LightColorTokens.OutlineOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorHover",
        LightColorTokens.OutlineOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorActive",
        LightColorTokens.OutlineOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinor",
        LightColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorHover",
        LightColorTokens.OutlineOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorActive",
        LightColorTokens.OutlineOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorHover",
        LightColorTokens.OutlineOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorActive",
        LightColorTokens.OutlineOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositive",
        LightColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveHover",
        LightColorTokens.OutlineOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveActive",
        LightColorTokens.OutlineOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        LightColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningHover",
        LightColorTokens.OutlineOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningActive",
        LightColorTokens.OutlineOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparent",
        LightColorTokens.OutlineOnLightNegativeTransparent,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparentHover",
        LightColorTokens.OutlineOnLightNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparentActive",
        LightColorTokens.OutlineOnLightNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoHover",
        LightColorTokens.OutlineOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoActive",
        LightColorTokens.OutlineOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightPrimaryHover",
        LightColorTokens.OutlineOnLightPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPrimaryActive",
        LightColorTokens.OutlineOnLightPrimaryActive,
        overwrite,
    )
    initial.add("outlineOnLightInfo", LightColorTokens.OutlineOnLightInfo, overwrite)
    initial.add("outlineOnLightInfoMinor", LightColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentInfo",
        LightColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryHover",
        LightColorTokens.OutlineOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryActive",
        LightColorTokens.OutlineOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefaultHover",
        LightColorTokens.OutlineOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefaultActive",
        LightColorTokens.OutlineOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryHover",
        LightColorTokens.OutlineOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryActive",
        LightColorTokens.OutlineOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryHover",
        LightColorTokens.OutlineOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryActive",
        LightColorTokens.OutlineOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimary",
        LightColorTokens.OutlineOnLightSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondary",
        LightColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiary",
        LightColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefault",
        LightColorTokens.OutlineOnLightSolidDefault,
        overwrite,
    )
    initial.add(
        "outlineInversePrimaryHover",
        LightColorTokens.OutlineInversePrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInversePrimaryActive",
        LightColorTokens.OutlineInversePrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSecondaryHover",
        LightColorTokens.OutlineInverseSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSecondaryActive",
        LightColorTokens.OutlineInverseSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTertiaryHover",
        LightColorTokens.OutlineInverseTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTertiaryActive",
        LightColorTokens.OutlineInverseTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseDefaultHover",
        LightColorTokens.OutlineInverseDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseDefaultActive",
        LightColorTokens.OutlineInverseDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        LightColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        LightColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryHover",
        LightColorTokens.OutlineInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryActive",
        LightColorTokens.OutlineInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryHover",
        LightColorTokens.OutlineInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryActive",
        LightColorTokens.OutlineInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClearHover",
        LightColorTokens.OutlineInverseTransparentClearHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClearActive",
        LightColorTokens.OutlineInverseTransparentClearActive,
        overwrite,
    )
    initial.add("outlineInverseAccentHover", LightColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add(
        "outlineInverseAccentActive",
        LightColorTokens.OutlineInverseAccentActive,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorHover",
        LightColorTokens.OutlineInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorActive",
        LightColorTokens.OutlineInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentHover",
        LightColorTokens.OutlineInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentActive",
        LightColorTokens.OutlineInverseTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveHover",
        LightColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveActive",
        LightColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningHover",
        LightColorTokens.OutlineInverseWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningActive",
        LightColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        LightColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        LightColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add("outlineInverseInfoHover", LightColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", LightColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveMinorHover",
        LightColorTokens.OutlineInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveMinorActive",
        LightColorTokens.OutlineInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorHover",
        LightColorTokens.OutlineInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorActive",
        LightColorTokens.OutlineInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorHover",
        LightColorTokens.OutlineInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorActive",
        LightColorTokens.OutlineInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorHover",
        LightColorTokens.OutlineInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorActive",
        LightColorTokens.OutlineInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveHover",
        LightColorTokens.OutlineInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveActive",
        LightColorTokens.OutlineInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningHover",
        LightColorTokens.OutlineInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningActive",
        LightColorTokens.OutlineInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeHover",
        LightColorTokens.OutlineInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeActive",
        LightColorTokens.OutlineInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoHover",
        LightColorTokens.OutlineInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoActive",
        LightColorTokens.OutlineInverseTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimary",
        LightColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondary",
        LightColorTokens.OutlineInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiary",
        LightColorTokens.OutlineInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClear",
        LightColorTokens.OutlineInverseTransparentClear,
        overwrite,
    )
    initial.add("outlineInverseAccent", LightColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", LightColorTokens.OutlineInverseAccentMinor, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        LightColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
    initial.add("outlineInversePositive", LightColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseWarning", LightColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseNegative", LightColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfo", LightColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "outlineInversePositiveMinor",
        LightColorTokens.OutlineInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinor",
        LightColorTokens.OutlineInverseWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinor",
        LightColorTokens.OutlineInverseNegativeMinor,
        overwrite,
    )
    initial.add("outlineInverseInfoMinor", LightColorTokens.OutlineInverseInfoMinor, overwrite)
    initial.add(
        "outlineInverseTransparentPositive",
        LightColorTokens.OutlineInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarning",
        LightColorTokens.OutlineInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegative",
        LightColorTokens.OutlineInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfo",
        LightColorTokens.OutlineInverseTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryHover",
        LightColorTokens.OutlineInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryActive",
        LightColorTokens.OutlineInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryHover",
        LightColorTokens.OutlineInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryActive",
        LightColorTokens.OutlineInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryHover",
        LightColorTokens.OutlineInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryActive",
        LightColorTokens.OutlineInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidDefaultHover",
        LightColorTokens.OutlineInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidDefaultActive",
        LightColorTokens.OutlineInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimary",
        LightColorTokens.OutlineInverseSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondary",
        LightColorTokens.OutlineInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiary",
        LightColorTokens.OutlineInverseSolidTertiary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidDefault",
        LightColorTokens.OutlineInverseSolidDefault,
        overwrite,
    )
    initial.add("dataDefaultYellow", LightColorTokens.DataDefaultYellow, overwrite)
    initial.add("dataDefaultYellowHover", LightColorTokens.DataDefaultYellowHover, overwrite)
    initial.add("dataDefaultYellowActive", LightColorTokens.DataDefaultYellowActive, overwrite)
    initial.add("dataDefaultYellowMinor", LightColorTokens.DataDefaultYellowMinor, overwrite)
    initial.add(
        "dataDefaultYellowMinorHover",
        LightColorTokens.DataDefaultYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowMinorActive",
        LightColorTokens.DataDefaultYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparent",
        LightColorTokens.DataDefaultYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparentHover",
        LightColorTokens.DataDefaultYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparentActive",
        LightColorTokens.DataDefaultYellowTransparentActive,
        overwrite,
    )
    initial.add("dataOnDarkYellow", LightColorTokens.DataOnDarkYellow, overwrite)
    initial.add("dataOnDarkYellowHover", LightColorTokens.DataOnDarkYellowHover, overwrite)
    initial.add("dataOnDarkYellowActive", LightColorTokens.DataOnDarkYellowActive, overwrite)
    initial.add("dataOnDarkYellowMinor", LightColorTokens.DataOnDarkYellowMinor, overwrite)
    initial.add(
        "dataOnDarkYellowMinorHover",
        LightColorTokens.DataOnDarkYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowMinorActive",
        LightColorTokens.DataOnDarkYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparent",
        LightColorTokens.DataOnDarkYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparentHover",
        LightColorTokens.DataOnDarkYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparentActive",
        LightColorTokens.DataOnDarkYellowTransparentActive,
        overwrite,
    )
    initial.add("dataOnLightYellow", LightColorTokens.DataOnLightYellow, overwrite)
    initial.add("dataOnLightYellowHover", LightColorTokens.DataOnLightYellowHover, overwrite)
    initial.add("dataOnLightYellowActive", LightColorTokens.DataOnLightYellowActive, overwrite)
    initial.add("dataOnLightYellowMinor", LightColorTokens.DataOnLightYellowMinor, overwrite)
    initial.add(
        "dataOnLightYellowMinorHover",
        LightColorTokens.DataOnLightYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowMinorActive",
        LightColorTokens.DataOnLightYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparent",
        LightColorTokens.DataOnLightYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparentHover",
        LightColorTokens.DataOnLightYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparentActive",
        LightColorTokens.DataOnLightYellowTransparentActive,
        overwrite,
    )
    initial.add("dataInverseYellow", LightColorTokens.DataInverseYellow, overwrite)
    initial.add("dataInverseYellowHover", LightColorTokens.DataInverseYellowHover, overwrite)
    initial.add("dataInverseYellowActive", LightColorTokens.DataInverseYellowActive, overwrite)
    initial.add("dataInverseYellowMinor", LightColorTokens.DataInverseYellowMinor, overwrite)
    initial.add(
        "dataInverseYellowMinorHover",
        LightColorTokens.DataInverseYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataInverseYellowMinorActive",
        LightColorTokens.DataInverseYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparent",
        LightColorTokens.DataInverseYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparentHover",
        LightColorTokens.DataInverseYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparentActive",
        LightColorTokens.DataInverseYellowTransparentActive,
        overwrite,
    )
    return PlasmaSdServiceColors(initial)
}

/**
 * Цвета [PlasmaSdServiceColors] для темной темы
 */
@Suppress("LongMethod")
public fun darkPlasmaSdServiceColors(overrideColors: ColorOverrideScope.() -> Unit = {}): PlasmaSdServiceColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("textDefaultPrimary", DarkColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        DarkColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondary", DarkColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiary", DarkColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraph", DarkColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccent", DarkColorTokens.TextDefaultAccent, overwrite)
    initial.add("textDefaultPositive", DarkColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarning", DarkColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegative", DarkColorTokens.TextDefaultNegative, overwrite)
    initial.add(
        "textDefaultAccentMinorHover",
        DarkColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorActive",
        DarkColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoHover", DarkColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultInfoActive", DarkColorTokens.TextDefaultInfoActive, overwrite)
    initial.add(
        "textDefaultPositiveMinorHover",
        DarkColorTokens.TextDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPositiveMinorActive",
        DarkColorTokens.TextDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorHover",
        DarkColorTokens.TextDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorActive",
        DarkColorTokens.TextDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorHover",
        DarkColorTokens.TextDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorActive",
        DarkColorTokens.TextDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoMinorHover", DarkColorTokens.TextDefaultInfoMinorHover, overwrite)
    initial.add("textDefaultInfoMinorActive", DarkColorTokens.TextDefaultInfoMinorActive, overwrite)
    initial.add("textDefaultAccentMinor", DarkColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add("textDefaultPositiveMinor", DarkColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", DarkColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", DarkColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfo", DarkColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultInfoMinor", DarkColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textDefaultPrimaryHover", DarkColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", DarkColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultSecondaryHover", DarkColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add("textDefaultSecondaryActive", DarkColorTokens.TextDefaultSecondaryActive, overwrite)
    initial.add("textDefaultTertiaryHover", DarkColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", DarkColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultParagraphHover", DarkColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add("textDefaultParagraphActive", DarkColorTokens.TextDefaultParagraphActive, overwrite)
    initial.add("textDefaultAccentHover", DarkColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", DarkColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultPositiveHover", DarkColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", DarkColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultWarningHover", DarkColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", DarkColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultNegativeHover", DarkColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", DarkColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textOnDarkPrimary", DarkColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        DarkColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondary", DarkColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiary", DarkColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraph", DarkColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccent", DarkColorTokens.TextOnDarkAccent, overwrite)
    initial.add("textOnDarkPositive", DarkColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarning", DarkColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegative", DarkColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkAccentMinor", DarkColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkAccentMinorHover", DarkColorTokens.TextOnDarkAccentMinorHover, overwrite)
    initial.add(
        "textOnDarkAccentMinorActive",
        DarkColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoHover", DarkColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", DarkColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add("textOnDarkPositiveMinor", DarkColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add(
        "textOnDarkPositiveMinorHover",
        DarkColorTokens.TextOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkPositiveMinorActive",
        DarkColorTokens.TextOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("textOnDarkWarningMinor", DarkColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add(
        "textOnDarkWarningMinorHover",
        DarkColorTokens.TextOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorActive",
        DarkColorTokens.TextOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add("textOnDarkNegativeMinor", DarkColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add(
        "textOnDarkNegativeMinorHover",
        DarkColorTokens.TextOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorActive",
        DarkColorTokens.TextOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoMinorHover", DarkColorTokens.TextOnDarkInfoMinorHover, overwrite)
    initial.add("textOnDarkInfoMinorActive", DarkColorTokens.TextOnDarkInfoMinorActive, overwrite)
    initial.add("textOnDarkInfoMinor", DarkColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnDarkInfo", DarkColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPrimaryHover", DarkColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", DarkColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkSecondaryHover", DarkColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", DarkColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkTertiaryHover", DarkColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", DarkColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkParagraphHover", DarkColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", DarkColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkAccentHover", DarkColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", DarkColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkPositiveHover", DarkColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", DarkColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkWarningHover", DarkColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", DarkColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkNegativeHover", DarkColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", DarkColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnLightPrimary", DarkColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        DarkColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondary", DarkColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiary", DarkColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraph", DarkColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccent", DarkColorTokens.TextOnLightAccent, overwrite)
    initial.add("textOnLightPositive", DarkColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarning", DarkColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightAccentMinor", DarkColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        DarkColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorActive",
        DarkColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoHover", DarkColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", DarkColorTokens.TextOnLightInfoActive, overwrite)
    initial.add("textOnLightPositiveMinor", DarkColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add(
        "textOnLightPositiveMinorHover",
        DarkColorTokens.TextOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPositiveMinorActive",
        DarkColorTokens.TextOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add("textOnLightWarningMinor", DarkColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add(
        "textOnLightWarningMinorHover",
        DarkColorTokens.TextOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorActive",
        DarkColorTokens.TextOnLightWarningMinorActive,
        overwrite,
    )
    initial.add("textOnLightNegativeMinor", DarkColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add(
        "textOnLightNegativeMinorHover",
        DarkColorTokens.TextOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorActive",
        DarkColorTokens.TextOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoMinorHover", DarkColorTokens.TextOnLightInfoMinorHover, overwrite)
    initial.add("textOnLightInfoMinorActive", DarkColorTokens.TextOnLightInfoMinorActive, overwrite)
    initial.add("textOnLightNegative", DarkColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightNegativeHover", DarkColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", DarkColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightInfo", DarkColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightInfoMinor", DarkColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", DarkColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", DarkColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightSecondaryHover", DarkColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add("textOnLightSecondaryActive", DarkColorTokens.TextOnLightSecondaryActive, overwrite)
    initial.add("textOnLightTertiaryHover", DarkColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", DarkColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightParagraphHover", DarkColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add("textOnLightParagraphActive", DarkColorTokens.TextOnLightParagraphActive, overwrite)
    initial.add("textOnLightAccentHover", DarkColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", DarkColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightPositiveHover", DarkColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", DarkColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightWarningHover", DarkColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", DarkColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textInversePrimary", DarkColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        DarkColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondary", DarkColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiary", DarkColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraph", DarkColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInversePositive", DarkColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarning", DarkColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegative", DarkColorTokens.TextInverseNegative, overwrite)
    initial.add("textInversePrimaryHover", DarkColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", DarkColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInverseSecondaryHover", DarkColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add("textInverseSecondaryActive", DarkColorTokens.TextInverseSecondaryActive, overwrite)
    initial.add("textInverseTertiaryHover", DarkColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", DarkColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseParagraphHover", DarkColorTokens.TextInverseParagraphHover, overwrite)
    initial.add("textInverseParagraphActive", DarkColorTokens.TextInverseParagraphActive, overwrite)
    initial.add("textInverseAccentHover", DarkColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", DarkColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInversePositiveHover", DarkColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", DarkColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInverseWarningHover", DarkColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", DarkColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseNegativeHover", DarkColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", DarkColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseAccentMinor", DarkColorTokens.TextInverseAccentMinor, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        DarkColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        DarkColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoHover", DarkColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseInfoActive", DarkColorTokens.TextInverseInfoActive, overwrite)
    initial.add(
        "textInversePositiveMinorHover",
        DarkColorTokens.TextInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePositiveMinorActive",
        DarkColorTokens.TextInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorHover",
        DarkColorTokens.TextInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorActive",
        DarkColorTokens.TextInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorHover",
        DarkColorTokens.TextInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorActive",
        DarkColorTokens.TextInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoMinorHover", DarkColorTokens.TextInverseInfoMinorHover, overwrite)
    initial.add("textInverseInfoMinorActive", DarkColorTokens.TextInverseInfoMinorActive, overwrite)
    initial.add("textInverseAccent", DarkColorTokens.TextInverseAccent, overwrite)
    initial.add("textInverseInfo", DarkColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", DarkColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", DarkColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", DarkColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", DarkColorTokens.TextInverseInfoMinor, overwrite)
    initial.add("surfaceDefaultSolidDefault", DarkColorTokens.SurfaceDefaultSolidDefault, overwrite)
    initial.add("surfaceDefaultSolidPrimary", DarkColorTokens.SurfaceDefaultSolidPrimary, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        DarkColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondary",
        DarkColorTokens.SurfaceDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiary",
        DarkColorTokens.SurfaceDefaultSolidTertiary,
        overwrite,
    )
    initial.add("surfaceDefaultSolidCard", DarkColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        DarkColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefault",
        DarkColorTokens.SurfaceDefaultTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        DarkColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        DarkColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        DarkColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        DarkColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        DarkColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", DarkColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add("surfaceDefaultPositive", DarkColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add("surfaceDefaultWarning", DarkColorTokens.SurfaceDefaultWarning, overwrite)
    initial.add("surfaceDefaultNegative", DarkColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add("surfaceDefaultClear", DarkColorTokens.SurfaceDefaultClear, overwrite)
    initial.add(
        "surfaceDefaultTransparentDeep",
        DarkColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorHover",
        DarkColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        DarkColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        DarkColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        DarkColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceDefaultInfoHover", DarkColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultInfoActive", DarkColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinorHover",
        DarkColorTokens.SurfaceDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinorActive",
        DarkColorTokens.SurfaceDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorHover",
        DarkColorTokens.SurfaceDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorActive",
        DarkColorTokens.SurfaceDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorHover",
        DarkColorTokens.SurfaceDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorActive",
        DarkColorTokens.SurfaceDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorHover",
        DarkColorTokens.SurfaceDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorActive",
        DarkColorTokens.SurfaceDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveHover",
        DarkColorTokens.SurfaceDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveActive",
        DarkColorTokens.SurfaceDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningHover",
        DarkColorTokens.SurfaceDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningActive",
        DarkColorTokens.SurfaceDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        DarkColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        DarkColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoHover",
        DarkColorTokens.SurfaceDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoActive",
        DarkColorTokens.SurfaceDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", DarkColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentAccent",
        DarkColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinor",
        DarkColorTokens.SurfaceDefaultPositiveMinor,
        overwrite,
    )
    initial.add("surfaceDefaultWarningMinor", DarkColorTokens.SurfaceDefaultWarningMinor, overwrite)
    initial.add(
        "surfaceDefaultNegativeMinor",
        DarkColorTokens.SurfaceDefaultNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositive",
        DarkColorTokens.SurfaceDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarning",
        DarkColorTokens.SurfaceDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        DarkColorTokens.SurfaceDefaultTransparentNegative,
        overwrite,
    )
    initial.add("surfaceDefaultInfo", DarkColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add("surfaceDefaultInfoMinor", DarkColorTokens.SurfaceDefaultInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentInfo",
        DarkColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        DarkColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        DarkColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        DarkColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        DarkColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        DarkColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        DarkColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        DarkColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        DarkColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        DarkColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        DarkColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefaultHover",
        DarkColorTokens.SurfaceDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDefaultActive",
        DarkColorTokens.SurfaceDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        DarkColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        DarkColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        DarkColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        DarkColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        DarkColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        DarkColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        DarkColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardActive",
        DarkColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentHover", DarkColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add("surfaceDefaultAccentActive", DarkColorTokens.SurfaceDefaultAccentActive, overwrite)
    initial.add(
        "surfaceDefaultPositiveHover",
        DarkColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        DarkColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add("surfaceDefaultWarningHover", DarkColorTokens.SurfaceDefaultWarningHover, overwrite)
    initial.add(
        "surfaceDefaultWarningActive",
        DarkColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeHover",
        DarkColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        DarkColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultClearHover", DarkColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", DarkColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        DarkColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        DarkColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", DarkColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondary",
        DarkColorTokens.SurfaceOnDarkSolidSecondary,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidTertiary", DarkColorTokens.SurfaceOnDarkSolidTertiary, overwrite)
    initial.add("surfaceOnDarkSolidCard", DarkColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        DarkColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefault",
        DarkColorTokens.SurfaceOnDarkTransparentDefault,
        overwrite,
    )
    initial.add("surfaceOnDarkAccent", DarkColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add("surfaceOnDarkPositive", DarkColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarning", DarkColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkNegative", DarkColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkClear", DarkColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add(
        "surfaceOnDarkTransparentDeep",
        DarkColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentMinor", DarkColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        DarkColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        DarkColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccent",
        DarkColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentHover",
        DarkColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        DarkColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSurfaceInfoHover",
        DarkColorTokens.SurfaceOnDarkSurfaceInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSurfaceInfoActive",
        DarkColorTokens.SurfaceOnDarkSurfaceInfoActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositiveMinor", DarkColorTokens.SurfaceOnDarkPositiveMinor, overwrite)
    initial.add(
        "surfaceOnDarkPositiveMinorHover",
        DarkColorTokens.SurfaceOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinorActive",
        DarkColorTokens.SurfaceOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningMinor", DarkColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add(
        "surfaceOnDarkWarningMinorHover",
        DarkColorTokens.SurfaceOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorActive",
        DarkColorTokens.SurfaceOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkNegativeMinor", DarkColorTokens.SurfaceOnDarkNegativeMinor, overwrite)
    initial.add(
        "surfaceOnDarkNegativeMinorHover",
        DarkColorTokens.SurfaceOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorActive",
        DarkColorTokens.SurfaceOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorHover",
        DarkColorTokens.SurfaceOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorActive",
        DarkColorTokens.SurfaceOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveHover",
        DarkColorTokens.SurfaceOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveActive",
        DarkColorTokens.SurfaceOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningHover",
        DarkColorTokens.SurfaceOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningActive",
        DarkColorTokens.SurfaceOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        DarkColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        DarkColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoHover",
        DarkColorTokens.SurfaceOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoActive",
        DarkColorTokens.SurfaceOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", DarkColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnDarkSolidDefaultHover",
        DarkColorTokens.SurfaceOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultActive",
        DarkColorTokens.SurfaceOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        DarkColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryActive",
        DarkColorTokens.SurfaceOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondary",
        DarkColorTokens.SurfaceOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryActive",
        DarkColorTokens.SurfaceOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiary",
        DarkColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        DarkColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        DarkColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        DarkColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        DarkColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardActive",
        DarkColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositive",
        DarkColorTokens.SurfaceOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarning",
        DarkColorTokens.SurfaceOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        DarkColorTokens.SurfaceOnDarkTransparentNegative,
        overwrite,
    )
    initial.add("surfaceOnDarkSurfaceInfo", DarkColorTokens.SurfaceOnDarkSurfaceInfo, overwrite)
    initial.add("surfaceOnDarkInfoMinor", DarkColorTokens.SurfaceOnDarkInfoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentInfo",
        DarkColorTokens.SurfaceOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        DarkColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        DarkColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        DarkColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        DarkColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardHover",
        DarkColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        DarkColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefaultHover",
        DarkColorTokens.SurfaceOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDefaultActive",
        DarkColorTokens.SurfaceOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentHover", DarkColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", DarkColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add("surfaceOnDarkPositiveHover", DarkColorTokens.SurfaceOnDarkPositiveHover, overwrite)
    initial.add(
        "surfaceOnDarkPositiveActive",
        DarkColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningHover", DarkColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add("surfaceOnDarkWarningActive", DarkColorTokens.SurfaceOnDarkWarningActive, overwrite)
    initial.add("surfaceOnDarkNegativeHover", DarkColorTokens.SurfaceOnDarkNegativeHover, overwrite)
    initial.add(
        "surfaceOnDarkNegativeActive",
        DarkColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", DarkColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", DarkColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        DarkColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        DarkColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidDefault", DarkColorTokens.SurfaceOnLightSolidDefault, overwrite)
    initial.add("surfaceOnLightSolidPrimary", DarkColorTokens.SurfaceOnLightSolidPrimary, overwrite)
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondary",
        DarkColorTokens.SurfaceOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiary",
        DarkColorTokens.SurfaceOnLightSolidTertiary,
        overwrite,
    )
    initial.add("surfaceOnLightSolidCard", DarkColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        DarkColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefault",
        DarkColorTokens.SurfaceOnLightTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        DarkColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        DarkColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        DarkColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        DarkColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        DarkColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightAccent", DarkColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add("surfaceOnLightPositive", DarkColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add("surfaceOnLightWarning", DarkColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add("surfaceOnLightNegative", DarkColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightClear", DarkColorTokens.SurfaceOnLightClear, overwrite)
    initial.add(
        "surfaceOnLightTransparentDeep",
        DarkColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", DarkColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorHover",
        DarkColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorActive",
        DarkColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccent",
        DarkColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        DarkColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        DarkColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightInfoHover", DarkColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", DarkColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinor",
        DarkColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorHover",
        DarkColorTokens.SurfaceOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorActive",
        DarkColorTokens.SurfaceOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarningMinor", DarkColorTokens.SurfaceOnLightWarningMinor, overwrite)
    initial.add(
        "surfaceOnLightWarningMinorHover",
        DarkColorTokens.SurfaceOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorActive",
        DarkColorTokens.SurfaceOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinor",
        DarkColorTokens.SurfaceOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorHover",
        DarkColorTokens.SurfaceOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorActive",
        DarkColorTokens.SurfaceOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorHover",
        DarkColorTokens.SurfaceOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorActive",
        DarkColorTokens.SurfaceOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveHover",
        DarkColorTokens.SurfaceOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveActive",
        DarkColorTokens.SurfaceOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningHover",
        DarkColorTokens.SurfaceOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningActive",
        DarkColorTokens.SurfaceOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        DarkColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        DarkColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoHover",
        DarkColorTokens.SurfaceOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoActive",
        DarkColorTokens.SurfaceOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositive",
        DarkColorTokens.SurfaceOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarning",
        DarkColorTokens.SurfaceOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        DarkColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", DarkColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add("surfaceOnLightInfoMinor", DarkColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentInfo",
        DarkColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultHover",
        DarkColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultActive",
        DarkColorTokens.SurfaceOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        DarkColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        DarkColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        DarkColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        DarkColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        DarkColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        DarkColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        DarkColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        DarkColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefaultHover",
        DarkColorTokens.SurfaceOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDefaultActive",
        DarkColorTokens.SurfaceOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        DarkColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        DarkColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        DarkColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        DarkColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        DarkColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        DarkColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        DarkColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        DarkColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentHover", DarkColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add("surfaceOnLightAccentActive", DarkColorTokens.SurfaceOnLightAccentActive, overwrite)
    initial.add(
        "surfaceOnLightPositiveHover",
        DarkColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveActive",
        DarkColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarningHover", DarkColorTokens.SurfaceOnLightWarningHover, overwrite)
    initial.add(
        "surfaceOnLightWarningActive",
        DarkColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeHover",
        DarkColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        DarkColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightClearHover", DarkColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", DarkColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        DarkColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        DarkColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceInverseSolidDefault", DarkColorTokens.SurfaceInverseSolidDefault, overwrite)
    initial.add("surfaceInverseSolidPrimary", DarkColorTokens.SurfaceInverseSolidPrimary, overwrite)
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        DarkColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        DarkColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiary",
        DarkColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", DarkColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        DarkColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefault",
        DarkColorTokens.SurfaceInverseTransparentDefault,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        DarkColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        DarkColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        DarkColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCard",
        DarkColorTokens.SurfaceInverseTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        DarkColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseAccent", DarkColorTokens.SurfaceInverseAccent, overwrite)
    initial.add("surfaceInversePositive", DarkColorTokens.SurfaceInversePositive, overwrite)
    initial.add("surfaceInverseWarning", DarkColorTokens.SurfaceInverseWarning, overwrite)
    initial.add("surfaceInverseNegative", DarkColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseClear", DarkColorTokens.SurfaceInverseClear, overwrite)
    initial.add(
        "surfaceInverseSolidDefaultHover",
        DarkColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        DarkColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        DarkColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        DarkColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        DarkColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        DarkColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        DarkColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        DarkColorTokens.SurfaceInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        DarkColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        DarkColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefaultHover",
        DarkColorTokens.SurfaceInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDefaultActive",
        DarkColorTokens.SurfaceInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        DarkColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        DarkColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        DarkColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        DarkColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        DarkColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        DarkColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        DarkColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardActive",
        DarkColorTokens.SurfaceInverseTransparentCardActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentHover", DarkColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add("surfaceInverseAccentActive", DarkColorTokens.SurfaceInverseAccentActive, overwrite)
    initial.add(
        "surfaceInversePositiveHover",
        DarkColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveActive",
        DarkColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add("surfaceInverseWarningHover", DarkColorTokens.SurfaceInverseWarningHover, overwrite)
    initial.add(
        "surfaceInverseWarningActive",
        DarkColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeHover",
        DarkColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        DarkColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", DarkColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", DarkColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add(
        "surfaceInverseTransparentDeep",
        DarkColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        DarkColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        DarkColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", DarkColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        DarkColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorActive",
        DarkColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccent",
        DarkColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentHover",
        DarkColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        DarkColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseInfo", DarkColorTokens.SurfaceInverseInfo, overwrite)
    initial.add("surfaceInverseInfoHover", DarkColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", DarkColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        DarkColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorHover",
        DarkColorTokens.SurfaceInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorActive",
        DarkColorTokens.SurfaceInversePositiveMinorActive,
        overwrite,
    )
    initial.add("surfaceInverseWarningMinor", DarkColorTokens.SurfaceInverseWarningMinor, overwrite)
    initial.add(
        "surfaceInverseWarningMinorHover",
        DarkColorTokens.SurfaceInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorActive",
        DarkColorTokens.SurfaceInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinor",
        DarkColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorHover",
        DarkColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        DarkColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", DarkColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseInfoMinorHover",
        DarkColorTokens.SurfaceInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorActive",
        DarkColorTokens.SurfaceInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositive",
        DarkColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveHover",
        DarkColorTokens.SurfaceInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveActive",
        DarkColorTokens.SurfaceInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        DarkColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningHover",
        DarkColorTokens.SurfaceInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningActive",
        DarkColorTokens.SurfaceInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        DarkColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        DarkColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        DarkColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        DarkColorTokens.SurfaceInverseTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoHover",
        DarkColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        DarkColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("backgroundDefaultPrimary", DarkColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add(
        "backgroundDefaultPrimaryBrightness",
        DarkColorTokens.BackgroundDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("backgroundDefaultSecondary", DarkColorTokens.BackgroundDefaultSecondary, overwrite)
    initial.add("backgroundDefaultTertiary", DarkColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundDarkPrimary", DarkColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundDarkSecondary", DarkColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add("backgroundDarkTertiary", DarkColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundLightPrimary", DarkColorTokens.BackgroundLightPrimary, overwrite)
    initial.add("backgroundLightSecondary", DarkColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("backgroundLightTertiary", DarkColorTokens.BackgroundLightTertiary, overwrite)
    initial.add(
        "backgroundInversePrimaryBrightness",
        DarkColorTokens.BackgroundInversePrimaryBrightness,
        overwrite,
    )
    initial.add("backgroundInverseSecondary", DarkColorTokens.BackgroundInverseSecondary, overwrite)
    initial.add("backgroundInverseTertiary", DarkColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("backgroundInversePrimary", DarkColorTokens.BackgroundInversePrimary, overwrite)
    initial.add("overlayDefaultSoft", DarkColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", DarkColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", DarkColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", DarkColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", DarkColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", DarkColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", DarkColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", DarkColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", DarkColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseHard", DarkColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseSoft", DarkColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseBlur", DarkColorTokens.OverlayInverseBlur, overwrite)
    initial.add(
        "outlineDefaultSecondaryHover",
        DarkColorTokens.OutlineDefaultSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSecondaryActive",
        DarkColorTokens.OutlineDefaultSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTertiaryHover",
        DarkColorTokens.OutlineDefaultTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTertiaryActive",
        DarkColorTokens.OutlineDefaultTertiaryActive,
        overwrite,
    )
    initial.add("outlineDefaultDefaultHover", DarkColorTokens.OutlineDefaultDefaultHover, overwrite)
    initial.add(
        "outlineDefaultDefaultActive",
        DarkColorTokens.OutlineDefaultDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        DarkColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        DarkColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryHover",
        DarkColorTokens.OutlineDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryActive",
        DarkColorTokens.OutlineDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryHover",
        DarkColorTokens.OutlineDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryActive",
        DarkColorTokens.OutlineDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClearHover",
        DarkColorTokens.OutlineDefaultTransparentClearHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClearActive",
        DarkColorTokens.OutlineDefaultTransparentClearActive,
        overwrite,
    )
    initial.add("outlineDefaultAccentHover", DarkColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add("outlineDefaultAccentActive", DarkColorTokens.OutlineDefaultAccentActive, overwrite)
    initial.add(
        "outlineDefaultAccentMinorHover",
        DarkColorTokens.OutlineDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorActive",
        DarkColorTokens.OutlineDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentHover",
        DarkColorTokens.OutlineDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentActive",
        DarkColorTokens.OutlineDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveHover",
        DarkColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveActive",
        DarkColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add("outlineDefaultWarningHover", DarkColorTokens.OutlineDefaultWarningHover, overwrite)
    initial.add(
        "outlineDefaultWarningActive",
        DarkColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        DarkColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        DarkColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfoHover", DarkColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add("outlineDefaultInfoActive", DarkColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineDefaultPositiveMinorHover",
        DarkColorTokens.OutlineDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveMinorActive",
        DarkColorTokens.OutlineDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorHover",
        DarkColorTokens.OutlineDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorActive",
        DarkColorTokens.OutlineDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorHover",
        DarkColorTokens.OutlineDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorActive",
        DarkColorTokens.OutlineDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorHover",
        DarkColorTokens.OutlineDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorActive",
        DarkColorTokens.OutlineDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveHover",
        DarkColorTokens.OutlineDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveActive",
        DarkColorTokens.OutlineDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningHover",
        DarkColorTokens.OutlineDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningActive",
        DarkColorTokens.OutlineDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeTransparentHover",
        DarkColorTokens.OutlineDefaultNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeTransparentActive",
        DarkColorTokens.OutlineDefaultNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoHover",
        DarkColorTokens.OutlineDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoActive",
        DarkColorTokens.OutlineDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineDefaultPrimaryHover", DarkColorTokens.OutlineDefaultPrimaryHover, overwrite)
    initial.add(
        "outlineDefaultPrimaryActive",
        DarkColorTokens.OutlineDefaultPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        DarkColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondary",
        DarkColorTokens.OutlineDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiary",
        DarkColorTokens.OutlineDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentClear",
        DarkColorTokens.OutlineDefaultTransparentClear,
        overwrite,
    )
    initial.add("outlineDefaultAccent", DarkColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", DarkColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        DarkColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultPositive", DarkColorTokens.OutlineDefaultPositive, overwrite)
    initial.add("outlineDefaultWarning", DarkColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultNegative", DarkColorTokens.OutlineDefaultNegative, overwrite)
    initial.add(
        "outlineDefaultPositiveMinor",
        DarkColorTokens.OutlineDefaultPositiveMinor,
        overwrite,
    )
    initial.add("outlineDefaultWarningMinor", DarkColorTokens.OutlineDefaultWarningMinor, overwrite)
    initial.add(
        "outlineDefaultNegativeMinor",
        DarkColorTokens.OutlineDefaultNegativeMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositive",
        DarkColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarning",
        DarkColorTokens.OutlineDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegative",
        DarkColorTokens.OutlineDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeHover",
        DarkColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        DarkColorTokens.OutlineDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfo", DarkColorTokens.OutlineDefaultInfo, overwrite)
    initial.add("outlineDefaultInfoMinor", DarkColorTokens.OutlineDefaultInfoMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentInfo",
        DarkColorTokens.OutlineDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryHover",
        DarkColorTokens.OutlineDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryActive",
        DarkColorTokens.OutlineDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryHover",
        DarkColorTokens.OutlineDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryActive",
        DarkColorTokens.OutlineDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryHover",
        DarkColorTokens.OutlineDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryActive",
        DarkColorTokens.OutlineDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefaultHover",
        DarkColorTokens.OutlineDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefaultActive",
        DarkColorTokens.OutlineDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add("outlineDefaultSolidPrimary", DarkColorTokens.OutlineDefaultSolidPrimary, overwrite)
    initial.add(
        "outlineDefaultSolidSecondary",
        DarkColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiary",
        DarkColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add("outlineDefaultSolidDefault", DarkColorTokens.OutlineDefaultSolidDefault, overwrite)
    initial.add(
        "outlineOnDarkSecondaryHover",
        DarkColorTokens.OutlineOnDarkSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSecondaryActive",
        DarkColorTokens.OutlineOnDarkSecondaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkTertiaryHover", DarkColorTokens.OutlineOnDarkTertiaryHover, overwrite)
    initial.add(
        "outlineOnDarkTertiaryActive",
        DarkColorTokens.OutlineOnDarkTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkDefaultHover", DarkColorTokens.OutlineOnDarkDefaultHover, overwrite)
    initial.add("outlineOnDarkDefaultActive", DarkColorTokens.OutlineOnDarkDefaultActive, overwrite)
    initial.add(
        "outlineOnDarkTransparentPrimary",
        DarkColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        DarkColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        DarkColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        DarkColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryHover",
        DarkColorTokens.OutlineOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryActive",
        DarkColorTokens.OutlineOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        DarkColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryHover",
        DarkColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        DarkColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkAccent", DarkColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentHover", DarkColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", DarkColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add("outlineOnDarkAccentMinor", DarkColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkAccentMinorHover",
        DarkColorTokens.OutlineOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorActive",
        DarkColorTokens.OutlineOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccent",
        DarkColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentHover",
        DarkColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        DarkColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", DarkColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkPositiveHover", DarkColorTokens.OutlineOnDarkPositiveHover, overwrite)
    initial.add(
        "outlineOnDarkPositiveActive",
        DarkColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarning", DarkColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkWarningHover", DarkColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add("outlineOnDarkWarningActive", DarkColorTokens.OutlineOnDarkWarningActive, overwrite)
    initial.add("outlineOnDarkNegative", DarkColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkNegativeHover", DarkColorTokens.OutlineOnDarkNegativeHover, overwrite)
    initial.add(
        "outlineOnDarkNegativeActive",
        DarkColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfoHover", DarkColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", DarkColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add("outlineOnDarkPositiveMinor", DarkColorTokens.OutlineOnDarkPositiveMinor, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinorHover",
        DarkColorTokens.OutlineOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorActive",
        DarkColorTokens.OutlineOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarningMinor", DarkColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add(
        "outlineOnDarkWarningMinorHover",
        DarkColorTokens.OutlineOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorActive",
        DarkColorTokens.OutlineOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkNegativeMinor", DarkColorTokens.OutlineOnDarkNegativeMinor, overwrite)
    initial.add(
        "outlineOnDarkNegativeMinorHover",
        DarkColorTokens.OutlineOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorActive",
        DarkColorTokens.OutlineOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorHover",
        DarkColorTokens.OutlineOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorActive",
        DarkColorTokens.OutlineOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        DarkColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveHover",
        DarkColorTokens.OutlineOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveActive",
        DarkColorTokens.OutlineOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarning",
        DarkColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningHover",
        DarkColorTokens.OutlineOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningActive",
        DarkColorTokens.OutlineOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparent",
        DarkColorTokens.OutlineOnDarkNegativeTransparent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparentHover",
        DarkColorTokens.OutlineOnDarkNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeTransparentActive",
        DarkColorTokens.OutlineOnDarkNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoHover",
        DarkColorTokens.OutlineOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoActive",
        DarkColorTokens.OutlineOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnDarkPrimaryHover", DarkColorTokens.OutlineOnDarkPrimaryHover, overwrite)
    initial.add("outlineOnDarkPrimaryActive", DarkColorTokens.OutlineOnDarkPrimaryActive, overwrite)
    initial.add("outlineOnDarkInfo", DarkColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkInfoMinor", DarkColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentInfo",
        DarkColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add("outlineOnDarkSolidPrimary", DarkColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add(
        "outlineOnDarkSolidPrimaryHover",
        DarkColorTokens.OutlineOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryActive",
        DarkColorTokens.OutlineOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        DarkColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryHover",
        DarkColorTokens.OutlineOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryActive",
        DarkColorTokens.OutlineOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkSolidTertiary", DarkColorTokens.OutlineOnDarkSolidTertiary, overwrite)
    initial.add(
        "outlineOnDarkSolidTertiaryHover",
        DarkColorTokens.OutlineOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryActive",
        DarkColorTokens.OutlineOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkSolidDefault", DarkColorTokens.OutlineOnDarkSolidDefault, overwrite)
    initial.add(
        "outlineOnDarkSolidDefaultHover",
        DarkColorTokens.OutlineOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidDefaultActive",
        DarkColorTokens.OutlineOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSecondaryHover",
        DarkColorTokens.OutlineOnLightSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSecondaryActive",
        DarkColorTokens.OutlineOnLightSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTertiaryHover",
        DarkColorTokens.OutlineOnLightTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTertiaryActive",
        DarkColorTokens.OutlineOnLightTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightDefaultHover", DarkColorTokens.OutlineOnLightDefaultHover, overwrite)
    initial.add(
        "outlineOnLightDefaultActive",
        DarkColorTokens.OutlineOnLightDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimary",
        DarkColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        DarkColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        DarkColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        DarkColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryHover",
        DarkColorTokens.OutlineOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryActive",
        DarkColorTokens.OutlineOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        DarkColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryHover",
        DarkColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        DarkColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightAccent", DarkColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentHover", DarkColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add("outlineOnLightAccentActive", DarkColorTokens.OutlineOnLightAccentActive, overwrite)
    initial.add("outlineOnLightAccentMinor", DarkColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add(
        "outlineOnLightAccentMinorHover",
        DarkColorTokens.OutlineOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorActive",
        DarkColorTokens.OutlineOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccent",
        DarkColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentHover",
        DarkColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        DarkColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPositive", DarkColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        DarkColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        DarkColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add("outlineOnLightWarning", DarkColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightWarningHover", DarkColorTokens.OutlineOnLightWarningHover, overwrite)
    initial.add(
        "outlineOnLightWarningActive",
        DarkColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add("outlineOnLightNegative", DarkColorTokens.OutlineOnLightNegative, overwrite)
    initial.add(
        "outlineOnLightNegativeHover",
        DarkColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeActive",
        DarkColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add("outlineOnLightInfoHover", DarkColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfoActive", DarkColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        DarkColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorHover",
        DarkColorTokens.OutlineOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorActive",
        DarkColorTokens.OutlineOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add("outlineOnLightWarningMinor", DarkColorTokens.OutlineOnLightWarningMinor, overwrite)
    initial.add(
        "outlineOnLightWarningMinorHover",
        DarkColorTokens.OutlineOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorActive",
        DarkColorTokens.OutlineOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinor",
        DarkColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorHover",
        DarkColorTokens.OutlineOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorActive",
        DarkColorTokens.OutlineOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorHover",
        DarkColorTokens.OutlineOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorActive",
        DarkColorTokens.OutlineOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositive",
        DarkColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveHover",
        DarkColorTokens.OutlineOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveActive",
        DarkColorTokens.OutlineOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        DarkColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningHover",
        DarkColorTokens.OutlineOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningActive",
        DarkColorTokens.OutlineOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparent",
        DarkColorTokens.OutlineOnLightNegativeTransparent,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparentHover",
        DarkColorTokens.OutlineOnLightNegativeTransparentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeTransparentActive",
        DarkColorTokens.OutlineOnLightNegativeTransparentActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoHover",
        DarkColorTokens.OutlineOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoActive",
        DarkColorTokens.OutlineOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnLightPrimaryHover", DarkColorTokens.OutlineOnLightPrimaryHover, overwrite)
    initial.add(
        "outlineOnLightPrimaryActive",
        DarkColorTokens.OutlineOnLightPrimaryActive,
        overwrite,
    )
    initial.add("outlineOnLightInfo", DarkColorTokens.OutlineOnLightInfo, overwrite)
    initial.add("outlineOnLightInfoMinor", DarkColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentInfo",
        DarkColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryHover",
        DarkColorTokens.OutlineOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryActive",
        DarkColorTokens.OutlineOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefaultHover",
        DarkColorTokens.OutlineOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefaultActive",
        DarkColorTokens.OutlineOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryHover",
        DarkColorTokens.OutlineOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryActive",
        DarkColorTokens.OutlineOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryHover",
        DarkColorTokens.OutlineOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryActive",
        DarkColorTokens.OutlineOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add("outlineOnLightSolidPrimary", DarkColorTokens.OutlineOnLightSolidPrimary, overwrite)
    initial.add(
        "outlineOnLightSolidSecondary",
        DarkColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiary",
        DarkColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add("outlineOnLightSolidDefault", DarkColorTokens.OutlineOnLightSolidDefault, overwrite)
    initial.add("outlineInversePrimaryHover", DarkColorTokens.OutlineInversePrimaryHover, overwrite)
    initial.add(
        "outlineInversePrimaryActive",
        DarkColorTokens.OutlineInversePrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSecondaryHover",
        DarkColorTokens.OutlineInverseSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSecondaryActive",
        DarkColorTokens.OutlineInverseSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTertiaryHover",
        DarkColorTokens.OutlineInverseTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTertiaryActive",
        DarkColorTokens.OutlineInverseTertiaryActive,
        overwrite,
    )
    initial.add("outlineInverseDefaultHover", DarkColorTokens.OutlineInverseDefaultHover, overwrite)
    initial.add(
        "outlineInverseDefaultActive",
        DarkColorTokens.OutlineInverseDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        DarkColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        DarkColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryHover",
        DarkColorTokens.OutlineInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryActive",
        DarkColorTokens.OutlineInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryHover",
        DarkColorTokens.OutlineInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryActive",
        DarkColorTokens.OutlineInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClearHover",
        DarkColorTokens.OutlineInverseTransparentClearHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClearActive",
        DarkColorTokens.OutlineInverseTransparentClearActive,
        overwrite,
    )
    initial.add("outlineInverseAccentHover", DarkColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add("outlineInverseAccentActive", DarkColorTokens.OutlineInverseAccentActive, overwrite)
    initial.add(
        "outlineInverseAccentMinorHover",
        DarkColorTokens.OutlineInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorActive",
        DarkColorTokens.OutlineInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentHover",
        DarkColorTokens.OutlineInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentActive",
        DarkColorTokens.OutlineInverseTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveHover",
        DarkColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveActive",
        DarkColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add("outlineInverseWarningHover", DarkColorTokens.OutlineInverseWarningHover, overwrite)
    initial.add(
        "outlineInverseWarningActive",
        DarkColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        DarkColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        DarkColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add("outlineInverseInfoHover", DarkColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", DarkColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveMinorHover",
        DarkColorTokens.OutlineInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveMinorActive",
        DarkColorTokens.OutlineInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorHover",
        DarkColorTokens.OutlineInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorActive",
        DarkColorTokens.OutlineInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorHover",
        DarkColorTokens.OutlineInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorActive",
        DarkColorTokens.OutlineInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorHover",
        DarkColorTokens.OutlineInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorActive",
        DarkColorTokens.OutlineInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveHover",
        DarkColorTokens.OutlineInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveActive",
        DarkColorTokens.OutlineInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningHover",
        DarkColorTokens.OutlineInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningActive",
        DarkColorTokens.OutlineInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeHover",
        DarkColorTokens.OutlineInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeActive",
        DarkColorTokens.OutlineInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoHover",
        DarkColorTokens.OutlineInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoActive",
        DarkColorTokens.OutlineInverseTransparentInfoActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimary",
        DarkColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondary",
        DarkColorTokens.OutlineInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiary",
        DarkColorTokens.OutlineInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentClear",
        DarkColorTokens.OutlineInverseTransparentClear,
        overwrite,
    )
    initial.add("outlineInverseAccent", DarkColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", DarkColorTokens.OutlineInverseAccentMinor, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        DarkColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
    initial.add("outlineInversePositive", DarkColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseWarning", DarkColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseNegative", DarkColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfo", DarkColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "outlineInversePositiveMinor",
        DarkColorTokens.OutlineInversePositiveMinor,
        overwrite,
    )
    initial.add("outlineInverseWarningMinor", DarkColorTokens.OutlineInverseWarningMinor, overwrite)
    initial.add(
        "outlineInverseNegativeMinor",
        DarkColorTokens.OutlineInverseNegativeMinor,
        overwrite,
    )
    initial.add("outlineInverseInfoMinor", DarkColorTokens.OutlineInverseInfoMinor, overwrite)
    initial.add(
        "outlineInverseTransparentPositive",
        DarkColorTokens.OutlineInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarning",
        DarkColorTokens.OutlineInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegative",
        DarkColorTokens.OutlineInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfo",
        DarkColorTokens.OutlineInverseTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryHover",
        DarkColorTokens.OutlineInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryActive",
        DarkColorTokens.OutlineInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryHover",
        DarkColorTokens.OutlineInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryActive",
        DarkColorTokens.OutlineInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryHover",
        DarkColorTokens.OutlineInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryActive",
        DarkColorTokens.OutlineInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidDefaultHover",
        DarkColorTokens.OutlineInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidDefaultActive",
        DarkColorTokens.OutlineInverseSolidDefaultActive,
        overwrite,
    )
    initial.add("outlineInverseSolidPrimary", DarkColorTokens.OutlineInverseSolidPrimary, overwrite)
    initial.add(
        "outlineInverseSolidSecondary",
        DarkColorTokens.OutlineInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiary",
        DarkColorTokens.OutlineInverseSolidTertiary,
        overwrite,
    )
    initial.add("outlineInverseSolidDefault", DarkColorTokens.OutlineInverseSolidDefault, overwrite)
    initial.add("dataDefaultYellow", DarkColorTokens.DataDefaultYellow, overwrite)
    initial.add("dataDefaultYellowHover", DarkColorTokens.DataDefaultYellowHover, overwrite)
    initial.add("dataDefaultYellowActive", DarkColorTokens.DataDefaultYellowActive, overwrite)
    initial.add("dataDefaultYellowMinor", DarkColorTokens.DataDefaultYellowMinor, overwrite)
    initial.add(
        "dataDefaultYellowMinorHover",
        DarkColorTokens.DataDefaultYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowMinorActive",
        DarkColorTokens.DataDefaultYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparent",
        DarkColorTokens.DataDefaultYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparentHover",
        DarkColorTokens.DataDefaultYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataDefaultYellowTransparentActive",
        DarkColorTokens.DataDefaultYellowTransparentActive,
        overwrite,
    )
    initial.add("dataOnDarkYellow", DarkColorTokens.DataOnDarkYellow, overwrite)
    initial.add("dataOnDarkYellowHover", DarkColorTokens.DataOnDarkYellowHover, overwrite)
    initial.add("dataOnDarkYellowActive", DarkColorTokens.DataOnDarkYellowActive, overwrite)
    initial.add("dataOnDarkYellowMinor", DarkColorTokens.DataOnDarkYellowMinor, overwrite)
    initial.add("dataOnDarkYellowMinorHover", DarkColorTokens.DataOnDarkYellowMinorHover, overwrite)
    initial.add(
        "dataOnDarkYellowMinorActive",
        DarkColorTokens.DataOnDarkYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparent",
        DarkColorTokens.DataOnDarkYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparentHover",
        DarkColorTokens.DataOnDarkYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataOnDarkYellowTransparentActive",
        DarkColorTokens.DataOnDarkYellowTransparentActive,
        overwrite,
    )
    initial.add("dataOnLightYellow", DarkColorTokens.DataOnLightYellow, overwrite)
    initial.add("dataOnLightYellowHover", DarkColorTokens.DataOnLightYellowHover, overwrite)
    initial.add("dataOnLightYellowActive", DarkColorTokens.DataOnLightYellowActive, overwrite)
    initial.add("dataOnLightYellowMinor", DarkColorTokens.DataOnLightYellowMinor, overwrite)
    initial.add(
        "dataOnLightYellowMinorHover",
        DarkColorTokens.DataOnLightYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowMinorActive",
        DarkColorTokens.DataOnLightYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparent",
        DarkColorTokens.DataOnLightYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparentHover",
        DarkColorTokens.DataOnLightYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataOnLightYellowTransparentActive",
        DarkColorTokens.DataOnLightYellowTransparentActive,
        overwrite,
    )
    initial.add("dataInverseYellow", DarkColorTokens.DataInverseYellow, overwrite)
    initial.add("dataInverseYellowHover", DarkColorTokens.DataInverseYellowHover, overwrite)
    initial.add("dataInverseYellowActive", DarkColorTokens.DataInverseYellowActive, overwrite)
    initial.add("dataInverseYellowMinor", DarkColorTokens.DataInverseYellowMinor, overwrite)
    initial.add(
        "dataInverseYellowMinorHover",
        DarkColorTokens.DataInverseYellowMinorHover,
        overwrite,
    )
    initial.add(
        "dataInverseYellowMinorActive",
        DarkColorTokens.DataInverseYellowMinorActive,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparent",
        DarkColorTokens.DataInverseYellowTransparent,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparentHover",
        DarkColorTokens.DataInverseYellowTransparentHover,
        overwrite,
    )
    initial.add(
        "dataInverseYellowTransparentActive",
        DarkColorTokens.DataInverseYellowTransparentActive,
        overwrite,
    )
    return PlasmaSdServiceColors(initial)
}

private fun Map<String, Color>.obtain(name: String): MutableState<Color> =
    mutableStateOf(get(name)!!, structuralEqualityPolicy())
