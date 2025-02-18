// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import com.sdds.serv.tokens.DarkColorTokens
import com.sdds.serv.tokens.LightColorTokens
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Цвета SddsServ
 */
@Immutable
public class SddsServColors(
    private val colors: Map<String, Color>,
) {
    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryHover: Color by colors.obtain("textDefaultPrimaryHover")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryActive: Color by colors.obtain("textDefaultPrimaryActive")

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
    public var textDefaultSecondaryHover: Color by colors.obtain("textDefaultSecondaryHover")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondaryActive: Color by colors.obtain("textDefaultSecondaryActive")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondary: Color by colors.obtain("textDefaultSecondary")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryHover: Color by colors.obtain("textDefaultTertiaryHover")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryActive: Color by colors.obtain("textDefaultTertiaryActive")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiary: Color by colors.obtain("textDefaultTertiary")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphHover: Color by colors.obtain("textDefaultParagraphHover")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphActive: Color by colors.obtain("textDefaultParagraphActive")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraph: Color by colors.obtain("textDefaultParagraph")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentHover: Color by colors.obtain("textDefaultAccentHover")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentActive: Color by colors.obtain("textDefaultAccentActive")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccent: Color by colors.obtain("textDefaultAccent")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinorHover: Color by colors.obtain("textDefaultAccentMinorHover")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinorActive: Color by colors.obtain("textDefaultAccentMinorActive")

    /**
     * Промо цвет
     */
    public var textDefaultPromoHover: Color by colors.obtain("textDefaultPromoHover")

    /**
     * Промо цвет
     */
    public var textDefaultPromoActive: Color by colors.obtain("textDefaultPromoActive")

    /**
     * Промо цвет
     */
    public var textDefaultPromo: Color by colors.obtain("textDefaultPromo")

    /**
     * Минорный промо цвет
     */
    public var textDefaultPromoMinorHover: Color by colors.obtain("textDefaultPromoMinorHover")

    /**
     * Минорный промо цвет
     */
    public var textDefaultPromoMinorActive: Color by colors.obtain("textDefaultPromoMinorActive")

    /**
     * Минорный промо цвет
     */
    public var textDefaultPromoMinor: Color by colors.obtain("textDefaultPromoMinor")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveHover: Color by colors.obtain("textDefaultPositiveHover")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveActive: Color by colors.obtain("textDefaultPositiveActive")

    /**
     * Цвет успеха
     */
    public var textDefaultPositive: Color by colors.obtain("textDefaultPositive")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningHover: Color by colors.obtain("textDefaultWarningHover")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningActive: Color by colors.obtain("textDefaultWarningActive")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarning: Color by colors.obtain("textDefaultWarning")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeHover: Color by colors.obtain("textDefaultNegativeHover")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeActive: Color by colors.obtain("textDefaultNegativeActive")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegative: Color by colors.obtain("textDefaultNegative")

    /**
     * Цвет информации
     */
    public var textDefaultInfoHover: Color by colors.obtain("textDefaultInfoHover")

    /**
     * Цвет информации
     */
    public var textDefaultInfoActive: Color by colors.obtain("textDefaultInfoActive")

    /**
     * Минорный цвет успеха
     */
    public var textDefaultPositiveMinorHover: Color by
        colors.obtain("textDefaultPositiveMinorHover")

    /**
     * Минорный цвет успеха
     */
    public var textDefaultPositiveMinorActive: Color by
        colors.obtain("textDefaultPositiveMinorActive")

    /**
     * Минорный цвет предупреждения
     */
    public var textDefaultWarningMinorHover: Color by colors.obtain("textDefaultWarningMinorHover")

    /**
     * Минорный цвет предупреждения
     */
    public var textDefaultWarningMinorActive: Color by
        colors.obtain("textDefaultWarningMinorActive")

    /**
     * Минорный цвет ошибки
     */
    public var textDefaultNegativeMinorHover: Color by
        colors.obtain("textDefaultNegativeMinorHover")

    /**
     * Минорный цвет ошибки
     */
    public var textDefaultNegativeMinorActive: Color by
        colors.obtain("textDefaultNegativeMinorActive")

    /**
     * Минорный цвет информации
     */
    public var textDefaultInfoMinorHover: Color by colors.obtain("textDefaultInfoMinorHover")

    /**
     * Минорный цвет информации
     */
    public var textDefaultInfoMinorActive: Color by colors.obtain("textDefaultInfoMinorActive")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinor: Color by colors.obtain("textDefaultAccentMinor")

    /**
     * Цвет информации
     */
    public var textDefaultInfo: Color by colors.obtain("textDefaultInfo")

    /**
     * Минорный цвет успеха
     */
    public var textDefaultPositiveMinor: Color by colors.obtain("textDefaultPositiveMinor")

    /**
     * Минорный цвет предупреждения
     */
    public var textDefaultWarningMinor: Color by colors.obtain("textDefaultWarningMinor")

    /**
     * Минорный цвет ошибки
     */
    public var textDefaultNegativeMinor: Color by colors.obtain("textDefaultNegativeMinor")

    /**
     * Минорный цвет информации
     */
    public var textDefaultInfoMinor: Color by colors.obtain("textDefaultInfoMinor")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryHover: Color by colors.obtain("textOnDarkPrimaryHover")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryActive: Color by colors.obtain("textOnDarkPrimaryActive")

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
    public var textOnDarkSecondaryHover: Color by colors.obtain("textOnDarkSecondaryHover")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondaryActive: Color by colors.obtain("textOnDarkSecondaryActive")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondary: Color by colors.obtain("textOnDarkSecondary")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryHover: Color by colors.obtain("textOnDarkTertiaryHover")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryActive: Color by colors.obtain("textOnDarkTertiaryActive")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiary: Color by colors.obtain("textOnDarkTertiary")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphHover: Color by colors.obtain("textOnDarkParagraphHover")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphActive: Color by colors.obtain("textOnDarkParagraphActive")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraph: Color by colors.obtain("textOnDarkParagraph")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentHover: Color by colors.obtain("textOnDarkAccentHover")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentActive: Color by colors.obtain("textOnDarkAccentActive")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccent: Color by colors.obtain("textOnDarkAccent")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinorHover: Color by colors.obtain("textOnDarkAccentMinorHover")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinorActive: Color by colors.obtain("textOnDarkAccentMinorActive")

    /**
     * Промо цвет на темном фоне
     */
    public var textOnDarkPromoHover: Color by colors.obtain("textOnDarkPromoHover")

    /**
     * Промо цвет на темном фоне
     */
    public var textOnDarkPromoActive: Color by colors.obtain("textOnDarkPromoActive")

    /**
     * Промо цвет на темном фоне
     */
    public var textOnDarkPromo: Color by colors.obtain("textOnDarkPromo")

    /**
     * Минорный промо цвет на темном фоне
     */
    public var textOnDarkPromoMinorHover: Color by colors.obtain("textOnDarkPromoMinorHover")

    /**
     * Минорный промо цвет на темном фоне
     */
    public var textOnDarkPromoMinorActive: Color by colors.obtain("textOnDarkPromoMinorActive")

    /**
     * Минорный промо цвет на темном фоне
     */
    public var textOnDarkPromoMinor: Color by colors.obtain("textOnDarkPromoMinor")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveHover: Color by colors.obtain("textOnDarkPositiveHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveActive: Color by colors.obtain("textOnDarkPositiveActive")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositive: Color by colors.obtain("textOnDarkPositive")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningHover: Color by colors.obtain("textOnDarkWarningHover")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningActive: Color by colors.obtain("textOnDarkWarningActive")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarning: Color by colors.obtain("textOnDarkWarning")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeHover: Color by colors.obtain("textOnDarkNegativeHover")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeActive: Color by colors.obtain("textOnDarkNegativeActive")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegative: Color by colors.obtain("textOnDarkNegative")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfoHover: Color by colors.obtain("textOnDarkInfoHover")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfoActive: Color by colors.obtain("textOnDarkInfoActive")

    /**
     * Минорный цвет успеха на темном фоне
     */
    public var textOnDarkPositiveMinorHover: Color by colors.obtain("textOnDarkPositiveMinorHover")

    /**
     * Минорный цвет успеха на темном фоне
     */
    public var textOnDarkPositiveMinorActive: Color by
        colors.obtain("textOnDarkPositiveMinorActive")

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningMinorHover: Color by colors.obtain("textOnDarkWarningMinorHover")

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningMinorActive: Color by colors.obtain("textOnDarkWarningMinorActive")

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeMinorHover: Color by colors.obtain("textOnDarkNegativeMinorHover")

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeMinorActive: Color by
        colors.obtain("textOnDarkNegativeMinorActive")

    /**
     * Минорный цвет информации на темном фоне
     */
    public var textOnDarkInfoMinorHover: Color by colors.obtain("textOnDarkInfoMinorHover")

    /**
     * Минорный цвет информации на темном фоне
     */
    public var textOnDarkInfoMinorActive: Color by colors.obtain("textOnDarkInfoMinorActive")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinor: Color by colors.obtain("textOnDarkAccentMinor")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfo: Color by colors.obtain("textOnDarkInfo")

    /**
     * Минорный цвет успеха на темном фоне
     */
    public var textOnDarkPositiveMinor: Color by colors.obtain("textOnDarkPositiveMinor")

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningMinor: Color by colors.obtain("textOnDarkWarningMinor")

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeMinor: Color by colors.obtain("textOnDarkNegativeMinor")

    /**
     * Минорный цвет информации на темном фоне
     */
    public var textOnDarkInfoMinor: Color by colors.obtain("textOnDarkInfoMinor")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryHover: Color by colors.obtain("textOnLightPrimaryHover")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryActive: Color by colors.obtain("textOnLightPrimaryActive")

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
    public var textOnLightSecondaryHover: Color by colors.obtain("textOnLightSecondaryHover")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondaryActive: Color by colors.obtain("textOnLightSecondaryActive")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondary: Color by colors.obtain("textOnLightSecondary")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryHover: Color by colors.obtain("textOnLightTertiaryHover")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryActive: Color by colors.obtain("textOnLightTertiaryActive")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiary: Color by colors.obtain("textOnLightTertiary")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphHover: Color by colors.obtain("textOnLightParagraphHover")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphActive: Color by colors.obtain("textOnLightParagraphActive")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraph: Color by colors.obtain("textOnLightParagraph")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentHover: Color by colors.obtain("textOnLightAccentHover")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentActive: Color by colors.obtain("textOnLightAccentActive")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccent: Color by colors.obtain("textOnLightAccent")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinorHover: Color by colors.obtain("textOnLightAccentMinorHover")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinorActive: Color by colors.obtain("textOnLightAccentMinorActive")

    /**
     * Промо цвет на светлом фоне
     */
    public var textOnLightPromoHover: Color by colors.obtain("textOnLightPromoHover")

    /**
     * Промо цвет на светлом фоне
     */
    public var textOnLightPromoActive: Color by colors.obtain("textOnLightPromoActive")

    /**
     * Промо цвет на светлом фоне
     */
    public var textOnLightPromo: Color by colors.obtain("textOnLightPromo")

    /**
     * Минорный промо цвет на светлом фоне
     */
    public var textOnLightPromoMinorHover: Color by colors.obtain("textOnLightPromoMinorHover")

    /**
     * Минорный промо цвет на светлом фоне
     */
    public var textOnLightPromoMinorActive: Color by colors.obtain("textOnLightPromoMinorActive")

    /**
     * Минорный промо цвет на светлом фоне
     */
    public var textOnLightPromoMinor: Color by colors.obtain("textOnLightPromoMinor")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveHover: Color by colors.obtain("textOnLightPositiveHover")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveActive: Color by colors.obtain("textOnLightPositiveActive")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositive: Color by colors.obtain("textOnLightPositive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningHover: Color by colors.obtain("textOnLightWarningHover")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningActive: Color by colors.obtain("textOnLightWarningActive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarning: Color by colors.obtain("textOnLightWarning")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeHover: Color by colors.obtain("textOnLightNegativeHover")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeActive: Color by colors.obtain("textOnLightNegativeActive")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegative: Color by colors.obtain("textOnLightNegative")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfoHover: Color by colors.obtain("textOnLightInfoHover")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfoActive: Color by colors.obtain("textOnLightInfoActive")

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public var textOnLightPositiveMinorHover: Color by
        colors.obtain("textOnLightPositiveMinorHover")

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public var textOnLightPositiveMinorActive: Color by
        colors.obtain("textOnLightPositiveMinorActive")

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningMinorHover: Color by colors.obtain("textOnLightWarningMinorHover")

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningMinorActive: Color by
        colors.obtain("textOnLightWarningMinorActive")

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeMinorHover: Color by
        colors.obtain("textOnLightNegativeMinorHover")

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeMinorActive: Color by
        colors.obtain("textOnLightNegativeMinorActive")

    /**
     * Минорный цвет информации на светлом фоне
     */
    public var textOnLightInfoMinorHover: Color by colors.obtain("textOnLightInfoMinorHover")

    /**
     * Минорный цвет информации на светлом фоне
     */
    public var textOnLightInfoMinorActive: Color by colors.obtain("textOnLightInfoMinorActive")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfo: Color by colors.obtain("textOnLightInfo")

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningMinor: Color by colors.obtain("textOnLightWarningMinor")

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public var textOnLightPositiveMinor: Color by colors.obtain("textOnLightPositiveMinor")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinor: Color by colors.obtain("textOnLightAccentMinor")

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeMinor: Color by colors.obtain("textOnLightNegativeMinor")

    /**
     * Минорный цвет информации на светлом фоне
     */
    public var textOnLightInfoMinor: Color by colors.obtain("textOnLightInfoMinor")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryHover: Color by colors.obtain("textInversePrimaryHover")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryActive: Color by colors.obtain("textInversePrimaryActive")

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
    public var textInverseSecondaryHover: Color by colors.obtain("textInverseSecondaryHover")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondaryActive: Color by colors.obtain("textInverseSecondaryActive")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondary: Color by colors.obtain("textInverseSecondary")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryHover: Color by colors.obtain("textInverseTertiaryHover")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryActive: Color by colors.obtain("textInverseTertiaryActive")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiary: Color by colors.obtain("textInverseTertiary")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraphHover: Color by colors.obtain("textInverseParagraphHover")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraphActive: Color by colors.obtain("textInverseParagraphActive")

    /**
     * Инвертированный cплошной наборный текст
     */
    public var textInverseParagraph: Color by colors.obtain("textInverseParagraph")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentHover: Color by colors.obtain("textInverseAccentHover")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentActive: Color by colors.obtain("textInverseAccentActive")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccent: Color by colors.obtain("textInverseAccent")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinorHover: Color by colors.obtain("textInverseAccentMinorHover")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinorActive: Color by colors.obtain("textInverseAccentMinorActive")

    /**
     * Инвертированный промо цвет
     */
    public var textInversePromoHover: Color by colors.obtain("textInversePromoHover")

    /**
     * Инвертированный промо цвет
     */
    public var textInversePromoActive: Color by colors.obtain("textInversePromoActive")

    /**
     * Инвертированный промо цвет
     */
    public var textInversePromo: Color by colors.obtain("textInversePromo")

    /**
     * Инвертированный минорный промо цвет
     */
    public var textInversePromoMinorHover: Color by colors.obtain("textInversePromoMinorHover")

    /**
     * Инвертированный минорный промо цвет
     */
    public var textInversePromoMinorActive: Color by colors.obtain("textInversePromoMinorActive")

    /**
     * Инвертированный минорный промо цвет
     */
    public var textInversePromoMinor: Color by colors.obtain("textInversePromoMinor")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveHover: Color by colors.obtain("textInversePositiveHover")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveActive: Color by colors.obtain("textInversePositiveActive")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositive: Color by colors.obtain("textInversePositive")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningHover: Color by colors.obtain("textInverseWarningHover")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningActive: Color by colors.obtain("textInverseWarningActive")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarning: Color by colors.obtain("textInverseWarning")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeHover: Color by colors.obtain("textInverseNegativeHover")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeActive: Color by colors.obtain("textInverseNegativeActive")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegative: Color by colors.obtain("textInverseNegative")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfoHover: Color by colors.obtain("textInverseInfoHover")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfoActive: Color by colors.obtain("textInverseInfoActive")

    /**
     * Инвертированный минорный цвет успеха
     */
    public var textInversePositiveMinorHover: Color by
        colors.obtain("textInversePositiveMinorHover")

    /**
     * Инвертированный минорный цвет успеха
     */
    public var textInversePositiveMinorActive: Color by
        colors.obtain("textInversePositiveMinorActive")

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public var textInverseWarningMinorHover: Color by colors.obtain("textInverseWarningMinorHover")

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public var textInverseWarningMinorActive: Color by
        colors.obtain("textInverseWarningMinorActive")

    /**
     * Инвертированный минорный цвет ошибки
     */
    public var textInverseNegativeMinorHover: Color by
        colors.obtain("textInverseNegativeMinorHover")

    /**
     * Инвертированный минорный цвет ошибки
     */
    public var textInverseNegativeMinorActive: Color by
        colors.obtain("textInverseNegativeMinorActive")

    /**
     * Инвертированный минорный цвет информации
     */
    public var textInverseInfoMinorHover: Color by colors.obtain("textInverseInfoMinorHover")

    /**
     * Инвертированный минорный цвет информации
     */
    public var textInverseInfoMinorActive: Color by colors.obtain("textInverseInfoMinorActive")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinor: Color by colors.obtain("textInverseAccentMinor")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfo: Color by colors.obtain("textInverseInfo")

    /**
     * Инвертированный минорный цвет успеха
     */
    public var textInversePositiveMinor: Color by colors.obtain("textInversePositiveMinor")

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public var textInverseWarningMinor: Color by colors.obtain("textInverseWarningMinor")

    /**
     * Инвертированный минорный цвет ошибки
     */
    public var textInverseNegativeMinor: Color by colors.obtain("textInverseNegativeMinor")

    /**
     * Инвертированный минорный цвет информации
     */
    public var textInverseInfoMinor: Color by colors.obtain("textInverseInfoMinor")

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
    public var surfaceDefaultSolidSecondaryHover: Color by
        colors.obtain("surfaceDefaultSolidSecondaryHover")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondaryActive: Color by
        colors.obtain("surfaceDefaultSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondary: Color by colors.obtain("surfaceDefaultSolidSecondary")

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
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiary: Color by colors.obtain("surfaceDefaultSolidTertiary")

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
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCard: Color by colors.obtain("surfaceDefaultSolidCard")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardBrightness: Color by
        colors.obtain("surfaceDefaultSolidCardBrightness")

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
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefault: Color by colors.obtain("surfaceDefaultSolidDefault")

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
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondary: Color by
        colors.obtain("surfaceDefaultTransparentSecondary")

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
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiary: Color by
        colors.obtain("surfaceDefaultTransparentTertiary")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDeepHover: Color by
        colors.obtain("surfaceDefaultTransparentDeepHover")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDeepActive: Color by
        colors.obtain("surfaceDefaultTransparentDeepActive")

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultTransparentDeep: Color by
        colors.obtain("surfaceDefaultTransparentDeep")

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
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearHover: Color by colors.obtain("surfaceDefaultClearHover")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearActive: Color by colors.obtain("surfaceDefaultClearActive")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClear: Color by colors.obtain("surfaceDefaultClear")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentHover: Color by colors.obtain("surfaceDefaultAccentHover")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentActive: Color by colors.obtain("surfaceDefaultAccentActive")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccent: Color by colors.obtain("surfaceDefaultAccent")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinorHover: Color by
        colors.obtain("surfaceDefaultAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinorActive: Color by
        colors.obtain("surfaceDefaultAccentMinorActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccentHover: Color by
        colors.obtain("surfaceDefaultTransparentAccentHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccentActive: Color by
        colors.obtain("surfaceDefaultTransparentAccentActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccent: Color by
        colors.obtain("surfaceDefaultTransparentAccent")

    /**
     * Промо фон поверхности/контрола
     */
    public var surfaceDefaultPromoHover: Color by colors.obtain("surfaceDefaultPromoHover")

    /**
     * Промо фон поверхности/контрола
     */
    public var surfaceDefaultPromoActive: Color by colors.obtain("surfaceDefaultPromoActive")

    /**
     * Промо фон поверхности/контрола
     */
    public var surfaceDefaultPromo: Color by colors.obtain("surfaceDefaultPromo")

    /**
     * Минорный промо фон поверхности/контрола
     */
    public var surfaceDefaultPromoMinorHover: Color by
        colors.obtain("surfaceDefaultPromoMinorHover")

    /**
     * Минорный промо фон поверхности/контрола
     */
    public var surfaceDefaultPromoMinorActive: Color by
        colors.obtain("surfaceDefaultPromoMinorActive")

    /**
     * Минорный промо фон поверхности/контрола
     */
    public var surfaceDefaultPromoMinor: Color by colors.obtain("surfaceDefaultPromoMinor")

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPromoHover: Color by
        colors.obtain("surfaceDefaultTransparentPromoHover")

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPromoActive: Color by
        colors.obtain("surfaceDefaultTransparentPromoActive")

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPromo: Color by
        colors.obtain("surfaceDefaultTransparentPromo")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositiveHover: Color by colors.obtain("surfaceDefaultPositiveHover")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositiveActive: Color by colors.obtain("surfaceDefaultPositiveActive")

    /**
     * Цвет успеха
     */
    public var surfaceDefaultPositive: Color by colors.obtain("surfaceDefaultPositive")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningHover: Color by colors.obtain("surfaceDefaultWarningHover")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningActive: Color by colors.obtain("surfaceDefaultWarningActive")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarning: Color by colors.obtain("surfaceDefaultWarning")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeHover: Color by colors.obtain("surfaceDefaultNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeActive: Color by colors.obtain("surfaceDefaultNegativeActive")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegative: Color by colors.obtain("surfaceDefaultNegative")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoHover: Color by colors.obtain("surfaceDefaultInfoHover")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoActive: Color by colors.obtain("surfaceDefaultInfoActive")

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositiveMinorHover: Color by
        colors.obtain("surfaceDefaultPositiveMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositiveMinorActive: Color by
        colors.obtain("surfaceDefaultPositiveMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningMinorHover: Color by
        colors.obtain("surfaceDefaultWarningMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningMinorActive: Color by
        colors.obtain("surfaceDefaultWarningMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeMinorHover: Color by
        colors.obtain("surfaceDefaultNegativeMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeMinorActive: Color by
        colors.obtain("surfaceDefaultNegativeMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoMinorHover: Color by colors.obtain("surfaceDefaultInfoMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoMinorActive: Color by
        colors.obtain("surfaceDefaultInfoMinorActive")

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultTransparentPositiveHover: Color by
        colors.obtain("surfaceDefaultTransparentPositiveHover")

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultTransparentPositiveActive: Color by
        colors.obtain("surfaceDefaultTransparentPositiveActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentWarningHover: Color by
        colors.obtain("surfaceDefaultTransparentWarningHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentWarningActive: Color by
        colors.obtain("surfaceDefaultTransparentWarningActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegativeHover: Color by
        colors.obtain("surfaceDefaultTransparentNegativeHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegativeActive: Color by
        colors.obtain("surfaceDefaultTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultTransparentInfoHover: Color by
        colors.obtain("surfaceDefaultTransparentInfoHover")

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultTransparentInfoActive: Color by
        colors.obtain("surfaceDefaultTransparentInfoActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinor: Color by colors.obtain("surfaceDefaultAccentMinor")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfo: Color by colors.obtain("surfaceDefaultInfo")

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositiveMinor: Color by colors.obtain("surfaceDefaultPositiveMinor")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningMinor: Color by colors.obtain("surfaceDefaultWarningMinor")

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeMinor: Color by colors.obtain("surfaceDefaultNegativeMinor")

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoMinor: Color by colors.obtain("surfaceDefaultInfoMinor")

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultTransparentPositive: Color by
        colors.obtain("surfaceDefaultTransparentPositive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentWarning: Color by
        colors.obtain("surfaceDefaultTransparentWarning")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegative: Color by
        colors.obtain("surfaceDefaultTransparentNegative")

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultTransparentInfo: Color by
        colors.obtain("surfaceDefaultTransparentInfo")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimary: Color by
        colors.obtain("surfaceDefaultTransparentPrimary")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryHover: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryActive: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryActive")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimary: Color by colors.obtain("surfaceOnDarkSolidPrimary")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryBrightness")

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryHover: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryHover")

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryActive: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public var surfaceOnDarkSolidSecondary: Color by colors.obtain("surfaceOnDarkSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryHover: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryActive: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryActive")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiary: Color by colors.obtain("surfaceOnDarkSolidTertiary")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardHover: Color by colors.obtain("surfaceOnDarkSolidCardHover")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardActive: Color by colors.obtain("surfaceOnDarkSolidCardActive")

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
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefaultHover: Color by
        colors.obtain("surfaceOnDarkSolidDefaultHover")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefaultActive: Color by
        colors.obtain("surfaceOnDarkSolidDefaultActive")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefault: Color by colors.obtain("surfaceOnDarkSolidDefault")

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
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimary: Color by
        colors.obtain("surfaceOnDarkTransparentPrimary")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryHover")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondary: Color by
        colors.obtain("surfaceOnDarkTransparentSecondary")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryHover")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiary: Color by
        colors.obtain("surfaceOnDarkTransparentTertiary")

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDeepHover: Color by
        colors.obtain("surfaceOnDarkTransparentDeepHover")

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDeepActive: Color by
        colors.obtain("surfaceOnDarkTransparentDeepActive")

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public var surfaceOnDarkTransparentDeep: Color by colors.obtain("surfaceOnDarkTransparentDeep")

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
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCard: Color by colors.obtain("surfaceOnDarkTransparentCard")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardBrightness: Color by
        colors.obtain("surfaceOnDarkTransparentCardBrightness")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearHover: Color by colors.obtain("surfaceOnDarkClearHover")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearActive: Color by colors.obtain("surfaceOnDarkClearActive")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClear: Color by colors.obtain("surfaceOnDarkClear")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentHover: Color by colors.obtain("surfaceOnDarkAccentHover")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentActive: Color by colors.obtain("surfaceOnDarkAccentActive")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccent: Color by colors.obtain("surfaceOnDarkAccent")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinorHover: Color by
        colors.obtain("surfaceOnDarkAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinorActive: Color by
        colors.obtain("surfaceOnDarkAccentMinorActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentAccentHover: Color by
        colors.obtain("surfaceOnDarkTransparentAccentHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentAccentActive: Color by
        colors.obtain("surfaceOnDarkTransparentAccentActive")

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromoHover: Color by colors.obtain("surfaceOnDarkPromoHover")

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromoActive: Color by colors.obtain("surfaceOnDarkPromoActive")

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromo: Color by colors.obtain("surfaceOnDarkPromo")

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromoMinorHover: Color by colors.obtain("surfaceOnDarkPromoMinorHover")

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromoMinorActive: Color by
        colors.obtain("surfaceOnDarkPromoMinorActive")

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkPromoMinor: Color by colors.obtain("surfaceOnDarkPromoMinor")

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPromoHover: Color by
        colors.obtain("surfaceOnDarkTransparentPromoHover")

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPromoActive: Color by
        colors.obtain("surfaceOnDarkTransparentPromoActive")

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPromo: Color by
        colors.obtain("surfaceOnDarkTransparentPromo")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositiveHover: Color by colors.obtain("surfaceOnDarkPositiveHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositiveActive: Color by colors.obtain("surfaceOnDarkPositiveActive")

    /**
     * Цвет успеха на темном фоне
     */
    public var surfaceOnDarkPositive: Color by colors.obtain("surfaceOnDarkPositive")

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningHover: Color by colors.obtain("surfaceOnDarkWarningHover")

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningActive: Color by colors.obtain("surfaceOnDarkWarningActive")

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public var surfaceOnDarkWarning: Color by colors.obtain("surfaceOnDarkWarning")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeHover: Color by colors.obtain("surfaceOnDarkNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeActive: Color by colors.obtain("surfaceOnDarkNegativeActive")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegative: Color by colors.obtain("surfaceOnDarkNegative")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoHover: Color by colors.obtain("surfaceOnDarkInfoHover")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoActive: Color by colors.obtain("surfaceOnDarkInfoActive")

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositiveMinorHover: Color by
        colors.obtain("surfaceOnDarkPositiveMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositiveMinorActive: Color by
        colors.obtain("surfaceOnDarkPositiveMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningMinorHover: Color by
        colors.obtain("surfaceOnDarkWarningMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningMinorActive: Color by
        colors.obtain("surfaceOnDarkWarningMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeMinorHover: Color by
        colors.obtain("surfaceOnDarkNegativeMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeMinorActive: Color by
        colors.obtain("surfaceOnDarkNegativeMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoMinorHover: Color by colors.obtain("surfaceOnDarkInfoMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoMinorActive: Color by colors.obtain("surfaceOnDarkInfoMinorActive")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkTransparentPositiveHover: Color by
        colors.obtain("surfaceOnDarkTransparentPositiveHover")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkTransparentPositiveActive: Color by
        colors.obtain("surfaceOnDarkTransparentPositiveActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentWarningHover: Color by
        colors.obtain("surfaceOnDarkTransparentWarningHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentWarningActive: Color by
        colors.obtain("surfaceOnDarkTransparentWarningActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegativeHover: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegativeActive: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkTransparentInfoHover: Color by
        colors.obtain("surfaceOnDarkTransparentInfoHover")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkTransparentInfoActive: Color by
        colors.obtain("surfaceOnDarkTransparentInfoActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinor: Color by colors.obtain("surfaceOnDarkAccentMinor")

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentAccent: Color by
        colors.obtain("surfaceOnDarkTransparentAccent")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfo: Color by colors.obtain("surfaceOnDarkInfo")

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositiveMinor: Color by colors.obtain("surfaceOnDarkPositiveMinor")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningMinor: Color by colors.obtain("surfaceOnDarkWarningMinor")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeMinor: Color by colors.obtain("surfaceOnDarkNegativeMinor")

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoMinor: Color by colors.obtain("surfaceOnDarkInfoMinor")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkTransparentPositive: Color by
        colors.obtain("surfaceOnDarkTransparentPositive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentWarning: Color by
        colors.obtain("surfaceOnDarkTransparentWarning")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegative: Color by
        colors.obtain("surfaceOnDarkTransparentNegative")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkTransparentInfo: Color by colors.obtain("surfaceOnDarkTransparentInfo")

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryHover: Color by
        colors.obtain("surfaceOnLightSolidPrimaryHover")

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryActive: Color by
        colors.obtain("surfaceOnLightSolidPrimaryActive")

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidPrimary: Color by colors.obtain("surfaceOnLightSolidPrimary")

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnLightSolidPrimaryBrightness")

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryHover: Color by
        colors.obtain("surfaceOnLightSolidSecondaryHover")

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryActive: Color by
        colors.obtain("surfaceOnLightSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidSecondary: Color by colors.obtain("surfaceOnLightSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryHover: Color by
        colors.obtain("surfaceOnLightSolidTertiaryHover")

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryActive: Color by
        colors.obtain("surfaceOnLightSolidTertiaryActive")

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public var surfaceOnLightSolidTertiary: Color by colors.obtain("surfaceOnLightSolidTertiary")

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
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCard: Color by colors.obtain("surfaceOnLightSolidCard")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardBrightness: Color by
        colors.obtain("surfaceOnLightSolidCardBrightness")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefaultHover: Color by
        colors.obtain("surfaceOnLightSolidDefaultHover")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefaultActive: Color by
        colors.obtain("surfaceOnLightSolidDefaultActive")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefault: Color by colors.obtain("surfaceOnLightSolidDefault")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryHover: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryHover")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryActive: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryHover")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondary: Color by
        colors.obtain("surfaceOnLightTransparentSecondary")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryHover")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiary: Color by
        colors.obtain("surfaceOnLightTransparentTertiary")

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDeepHover: Color by
        colors.obtain("surfaceOnLightTransparentDeepHover")

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDeepActive: Color by
        colors.obtain("surfaceOnLightTransparentDeepActive")

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public var surfaceOnLightTransparentDeep: Color by
        colors.obtain("surfaceOnLightTransparentDeep")

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
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearHover: Color by colors.obtain("surfaceOnLightClearHover")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearActive: Color by colors.obtain("surfaceOnLightClearActive")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClear: Color by colors.obtain("surfaceOnLightClear")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentHover: Color by colors.obtain("surfaceOnLightAccentHover")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentActive: Color by colors.obtain("surfaceOnLightAccentActive")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccent: Color by colors.obtain("surfaceOnLightAccent")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinorHover: Color by
        colors.obtain("surfaceOnLightAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinorActive: Color by
        colors.obtain("surfaceOnLightAccentMinorActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccentHover: Color by
        colors.obtain("surfaceOnLightTransparentAccentHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccentActive: Color by
        colors.obtain("surfaceOnLightTransparentAccentActive")

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromoHover: Color by colors.obtain("surfaceOnLightPromoHover")

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromoActive: Color by colors.obtain("surfaceOnLightPromoActive")

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromo: Color by colors.obtain("surfaceOnLightPromo")

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromoMinorHover: Color by
        colors.obtain("surfaceOnLightPromoMinorHover")

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromoMinorActive: Color by
        colors.obtain("surfaceOnLightPromoMinorActive")

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightPromoMinor: Color by colors.obtain("surfaceOnLightPromoMinor")

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPromoHover: Color by
        colors.obtain("surfaceOnLightTransparentPromoHover")

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPromoActive: Color by
        colors.obtain("surfaceOnLightTransparentPromoActive")

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPromo: Color by
        colors.obtain("surfaceOnLightTransparentPromo")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositiveHover: Color by colors.obtain("surfaceOnLightPositiveHover")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositiveActive: Color by colors.obtain("surfaceOnLightPositiveActive")

    /**
     * Цвет успеха на светлом фоне
     */
    public var surfaceOnLightPositive: Color by colors.obtain("surfaceOnLightPositive")

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningHover: Color by colors.obtain("surfaceOnLightWarningHover")

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningActive: Color by colors.obtain("surfaceOnLightWarningActive")

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public var surfaceOnLightWarning: Color by colors.obtain("surfaceOnLightWarning")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeHover: Color by colors.obtain("surfaceOnLightNegativeHover")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeActive: Color by colors.obtain("surfaceOnLightNegativeActive")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegative: Color by colors.obtain("surfaceOnLightNegative")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoHover: Color by colors.obtain("surfaceOnLightInfoHover")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoActive: Color by colors.obtain("surfaceOnLightInfoActive")

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositiveMinorHover: Color by
        colors.obtain("surfaceOnLightPositiveMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositiveMinorActive: Color by
        colors.obtain("surfaceOnLightPositiveMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningMinorHover: Color by
        colors.obtain("surfaceOnLightWarningMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningMinorActive: Color by
        colors.obtain("surfaceOnLightWarningMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeMinorHover: Color by
        colors.obtain("surfaceOnLightNegativeMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeMinorActive: Color by
        colors.obtain("surfaceOnLightNegativeMinorActive")

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoMinorHover: Color by colors.obtain("surfaceOnLightInfoMinorHover")

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoMinorActive: Color by
        colors.obtain("surfaceOnLightInfoMinorActive")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightTransparentPositiveHover: Color by
        colors.obtain("surfaceOnLightTransparentPositiveHover")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightTransparentPositiveActive: Color by
        colors.obtain("surfaceOnLightTransparentPositiveActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentWarningHover: Color by
        colors.obtain("surfaceOnLightTransparentWarningHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentWarningActive: Color by
        colors.obtain("surfaceOnLightTransparentWarningActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegativeHover: Color by
        colors.obtain("surfaceOnLightTransparentNegativeHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegativeActive: Color by
        colors.obtain("surfaceOnLightTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightTransparentInfoHover: Color by
        colors.obtain("surfaceOnLightTransparentInfoHover")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightTransparentInfoActive: Color by
        colors.obtain("surfaceOnLightTransparentInfoActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinor: Color by colors.obtain("surfaceOnLightAccentMinor")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccent: Color by
        colors.obtain("surfaceOnLightTransparentAccent")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfo: Color by colors.obtain("surfaceOnLightInfo")

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningMinor: Color by colors.obtain("surfaceOnLightWarningMinor")

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositiveMinor: Color by colors.obtain("surfaceOnLightPositiveMinor")

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoMinor: Color by colors.obtain("surfaceOnLightInfoMinor")

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeMinor: Color by colors.obtain("surfaceOnLightNegativeMinor")

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightTransparentPositive: Color by
        colors.obtain("surfaceOnLightTransparentPositive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentWarning: Color by
        colors.obtain("surfaceOnLightTransparentWarning")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegative: Color by
        colors.obtain("surfaceOnLightTransparentNegative")

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightTransparentInfo: Color by
        colors.obtain("surfaceOnLightTransparentInfo")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimary: Color by
        colors.obtain("surfaceOnLightTransparentPrimary")

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
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimary: Color by colors.obtain("surfaceInverseSolidPrimary")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryBrightness: Color by
        colors.obtain("surfaceInverseSolidPrimaryBrightness")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public var surfaceInverseSolidSecondaryHover: Color by
        colors.obtain("surfaceInverseSolidSecondaryHover")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public var surfaceInverseSolidSecondaryActive: Color by
        colors.obtain("surfaceInverseSolidSecondaryActive")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public var surfaceInverseSolidSecondary: Color by colors.obtain("surfaceInverseSolidSecondary")

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
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiary: Color by colors.obtain("surfaceInverseSolidTertiary")

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
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCard: Color by colors.obtain("surfaceInverseSolidCard")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardBrightness: Color by
        colors.obtain("surfaceInverseSolidCardBrightness")

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
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefault: Color by colors.obtain("surfaceInverseSolidDefault")

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
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimary: Color by
        colors.obtain("surfaceInverseTransparentPrimary")

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
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondary: Color by
        colors.obtain("surfaceInverseTransparentSecondary")

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
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiary: Color by
        colors.obtain("surfaceInverseTransparentTertiary")

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public var surfaceInverseTransparentDeepHover: Color by
        colors.obtain("surfaceInverseTransparentDeepHover")

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public var surfaceInverseTransparentDeepActive: Color by
        colors.obtain("surfaceInverseTransparentDeepActive")

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public var surfaceInverseTransparentDeep: Color by
        colors.obtain("surfaceInverseTransparentDeep")

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
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearHover: Color by colors.obtain("surfaceInverseClearHover")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearActive: Color by colors.obtain("surfaceInverseClearActive")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClear: Color by colors.obtain("surfaceInverseClear")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentHover: Color by colors.obtain("surfaceInverseAccentHover")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentActive: Color by colors.obtain("surfaceInverseAccentActive")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccent: Color by colors.obtain("surfaceInverseAccent")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinorHover: Color by
        colors.obtain("surfaceInverseAccentMinorHover")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinorActive: Color by
        colors.obtain("surfaceInverseAccentMinorActive")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccentHover: Color by
        colors.obtain("surfaceInverseTransparentAccentHover")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccentActive: Color by
        colors.obtain("surfaceInverseTransparentAccentActive")

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public var surfaceInversePromoHover: Color by colors.obtain("surfaceInversePromoHover")

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public var surfaceInversePromoActive: Color by colors.obtain("surfaceInversePromoActive")

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public var surfaceInversePromo: Color by colors.obtain("surfaceInversePromo")

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public var surfaceInversePromoMinorHover: Color by
        colors.obtain("surfaceInversePromoMinorHover")

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public var surfaceInversePromoMinorActive: Color by
        colors.obtain("surfaceInversePromoMinorActive")

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public var surfaceInversePromoMinor: Color by colors.obtain("surfaceInversePromoMinor")

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public var surfaceInverseTransparentPromoHover: Color by
        colors.obtain("surfaceInverseTransparentPromoHover")

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public var surfaceInverseTransparentPromoActive: Color by
        colors.obtain("surfaceInverseTransparentPromoActive")

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public var surfaceInverseTransparentPromo: Color by
        colors.obtain("surfaceInverseTransparentPromo")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositiveHover: Color by colors.obtain("surfaceInversePositiveHover")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositiveActive: Color by colors.obtain("surfaceInversePositiveActive")

    /**
     * Инвертированный цвет успеха
     */
    public var surfaceInversePositive: Color by colors.obtain("surfaceInversePositive")

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public var surfaceInverseWarningHover: Color by colors.obtain("surfaceInverseWarningHover")

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public var surfaceInverseWarningActive: Color by colors.obtain("surfaceInverseWarningActive")

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public var surfaceInverseWarning: Color by colors.obtain("surfaceInverseWarning")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeHover: Color by colors.obtain("surfaceInverseNegativeHover")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeActive: Color by colors.obtain("surfaceInverseNegativeActive")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegative: Color by colors.obtain("surfaceInverseNegative")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoHover: Color by colors.obtain("surfaceInverseInfoHover")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoActive: Color by colors.obtain("surfaceInverseInfoActive")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositiveMinorHover: Color by
        colors.obtain("surfaceInversePositiveMinorHover")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositiveMinorActive: Color by
        colors.obtain("surfaceInversePositiveMinorActive")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningMinorHover: Color by
        colors.obtain("surfaceInverseWarningMinorHover")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningMinorActive: Color by
        colors.obtain("surfaceInverseWarningMinorActive")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeMinorHover: Color by
        colors.obtain("surfaceInverseNegativeMinorHover")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeMinorActive: Color by
        colors.obtain("surfaceInverseNegativeMinorActive")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoMinorHover: Color by colors.obtain("surfaceInverseInfoMinorHover")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoMinorActive: Color by
        colors.obtain("surfaceInverseInfoMinorActive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInverseTransparentPositiveHover: Color by
        colors.obtain("surfaceInverseTransparentPositiveHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInverseTransparentPositiveActive: Color by
        colors.obtain("surfaceInverseTransparentPositiveActive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentWarningHover: Color by
        colors.obtain("surfaceInverseTransparentWarningHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentWarningActive: Color by
        colors.obtain("surfaceInverseTransparentWarningActive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegativeHover: Color by
        colors.obtain("surfaceInverseTransparentNegativeHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegativeActive: Color by
        colors.obtain("surfaceInverseTransparentNegativeActive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseTransparentInfoHover: Color by
        colors.obtain("surfaceInverseTransparentInfoHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseTransparentInfoActive: Color by
        colors.obtain("surfaceInverseTransparentInfoActive")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinor: Color by colors.obtain("surfaceInverseAccentMinor")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccent: Color by
        colors.obtain("surfaceInverseTransparentAccent")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfo: Color by colors.obtain("surfaceInverseInfo")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositiveMinor: Color by colors.obtain("surfaceInversePositiveMinor")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningMinor: Color by colors.obtain("surfaceInverseWarningMinor")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeMinor: Color by colors.obtain("surfaceInverseNegativeMinor")

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoMinor: Color by colors.obtain("surfaceInverseInfoMinor")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInverseTransparentPositive: Color by
        colors.obtain("surfaceInverseTransparentPositive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentWarning: Color by
        colors.obtain("surfaceInverseTransparentWarning")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegative: Color by
        colors.obtain("surfaceInverseTransparentNegative")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseTransparentInfo: Color by
        colors.obtain("surfaceInverseTransparentInfo")

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
    public var backgroundInversePrimary: Color by colors.obtain("backgroundInversePrimary")

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
     * Инвертированный цвет фона паранжи светлый
     */
    public var overlayInverseSoft: Color by colors.obtain("overlayInverseSoft")

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public var overlayInverseHard: Color by colors.obtain("overlayInverseHard")

    /**
     * light overlay inverse overlayBlur
     */
    public var overlayInverseBlur: Color by colors.obtain("overlayInverseBlur")

    /**
     * Основной непрозрачный цвет обводки
     */
    public var outlineDefaultSolidPrimaryHover: Color by
        colors.obtain("outlineDefaultSolidPrimaryHover")

    /**
     * Основной непрозрачный цвет обводки
     */
    public var outlineDefaultSolidPrimaryActive: Color by
        colors.obtain("outlineDefaultSolidPrimaryActive")

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidSecondaryHover: Color by
        colors.obtain("outlineDefaultSolidSecondaryHover")

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidSecondaryActive: Color by
        colors.obtain("outlineDefaultSolidSecondaryActive")

    /**
     * Третичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidTertiaryHover: Color by
        colors.obtain("outlineDefaultSolidTertiaryHover")

    /**
     * Третичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidTertiaryActive: Color by
        colors.obtain("outlineDefaultSolidTertiaryActive")

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public var outlineDefaultTransparentDefaultHover: Color by
        colors.obtain("outlineDefaultTransparentDefaultHover")

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public var outlineDefaultTransparentDefaultActive: Color by
        colors.obtain("outlineDefaultTransparentDefaultActive")

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public var outlineDefaultTransparentDefault: Color by
        colors.obtain("outlineDefaultTransparentDefault")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimaryHover: Color by
        colors.obtain("outlineDefaultTransparentPrimaryHover")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimaryActive: Color by
        colors.obtain("outlineDefaultTransparentPrimaryActive")

    /**
     * Вторичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentSecondaryHover: Color by
        colors.obtain("outlineDefaultTransparentSecondaryHover")

    /**
     * Вторичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentSecondaryActive: Color by
        colors.obtain("outlineDefaultTransparentSecondaryActive")

    /**
     * Третичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentTertiaryHover: Color by
        colors.obtain("outlineDefaultTransparentTertiaryHover")

    /**
     * Третичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentTertiaryActive: Color by
        colors.obtain("outlineDefaultTransparentTertiaryActive")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClearHover: Color by colors.obtain("outlineDefaultClearHover")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClearActive: Color by colors.obtain("outlineDefaultClearActive")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccentHover: Color by colors.obtain("outlineDefaultAccentHover")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccentActive: Color by colors.obtain("outlineDefaultAccentActive")

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public var outlineDefaultAccentMinorHover: Color by
        colors.obtain("outlineDefaultAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public var outlineDefaultAccentMinorActive: Color by
        colors.obtain("outlineDefaultAccentMinorActive")

    /**
     * Прозрачный акцентный цвет обводки
     */
    public var outlineDefaultTransparentAccentHover: Color by
        colors.obtain("outlineDefaultTransparentAccentHover")

    /**
     * Прозрачный акцентный цвет обводки
     */
    public var outlineDefaultTransparentAccentActive: Color by
        colors.obtain("outlineDefaultTransparentAccentActive")

    /**
     * Промо цвет обводки
     */
    public var outlineDefaultPromoHover: Color by colors.obtain("outlineDefaultPromoHover")

    /**
     * Промо цвет обводки
     */
    public var outlineDefaultPromoActive: Color by colors.obtain("outlineDefaultPromoActive")

    /**
     * Промо цвет обводки
     */
    public var outlineDefaultPromo: Color by colors.obtain("outlineDefaultPromo")

    /**
     * Минорный промо цвет обводки
     */
    public var outlineDefaultPromoMinorHover: Color by
        colors.obtain("outlineDefaultPromoMinorHover")

    /**
     * Минорный промо цвет обводки
     */
    public var outlineDefaultPromoMinorActive: Color by
        colors.obtain("outlineDefaultPromoMinorActive")

    /**
     * Минорный промо цвет обводки
     */
    public var outlineDefaultPromoMinor: Color by colors.obtain("outlineDefaultPromoMinor")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositiveHover: Color by colors.obtain("outlineDefaultPositiveHover")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositiveActive: Color by colors.obtain("outlineDefaultPositiveActive")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarningHover: Color by colors.obtain("outlineDefaultWarningHover")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarningActive: Color by colors.obtain("outlineDefaultWarningActive")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegativeHover: Color by colors.obtain("outlineDefaultNegativeHover")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegativeActive: Color by colors.obtain("outlineDefaultNegativeActive")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfoHover: Color by colors.obtain("outlineDefaultInfoHover")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfoActive: Color by colors.obtain("outlineDefaultInfoActive")

    /**
     * Минорный цвет обводки успех
     */
    public var outlineDefaultPositiveMinorHover: Color by
        colors.obtain("outlineDefaultPositiveMinorHover")

    /**
     * Минорный цвет обводки успех
     */
    public var outlineDefaultPositiveMinorActive: Color by
        colors.obtain("outlineDefaultPositiveMinorActive")

    /**
     * Минорный цвет обводки предупреждение
     */
    public var outlineDefaultWarningMinorHover: Color by
        colors.obtain("outlineDefaultWarningMinorHover")

    /**
     * Минорный цвет обводки предупреждение
     */
    public var outlineDefaultWarningMinorActive: Color by
        colors.obtain("outlineDefaultWarningMinorActive")

    /**
     * Минорный цвет обводки ошибка
     */
    public var outlineDefaultNegativeMinorHover: Color by
        colors.obtain("outlineDefaultNegativeMinorHover")

    /**
     * Минорный цвет обводки ошибка
     */
    public var outlineDefaultNegativeMinorActive: Color by
        colors.obtain("outlineDefaultNegativeMinorActive")

    /**
     * Минорный цвет обводки информация
     */
    public var outlineDefaultInfoMinorHover: Color by colors.obtain("outlineDefaultInfoMinorHover")

    /**
     * Минорный цвет обводки информация
     */
    public var outlineDefaultInfoMinorActive: Color by
        colors.obtain("outlineDefaultInfoMinorActive")

    /**
     * Прозрачный цвет обводки успех
     */
    public var outlineDefaultTransparentPositiveHover: Color by
        colors.obtain("outlineDefaultTransparentPositiveHover")

    /**
     * Прозрачный цвет обводки успех
     */
    public var outlineDefaultTransparentPositiveActive: Color by
        colors.obtain("outlineDefaultTransparentPositiveActive")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentWarningHover: Color by
        colors.obtain("outlineDefaultTransparentWarningHover")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentWarningActive: Color by
        colors.obtain("outlineDefaultTransparentWarningActive")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentNegativeHover: Color by
        colors.obtain("outlineDefaultTransparentNegativeHover")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentNegativeActive: Color by
        colors.obtain("outlineDefaultTransparentNegativeActive")

    /**
     * Прозрачный цвет обводки информация
     */
    public var outlineDefaultTransparentInfoHover: Color by
        colors.obtain("outlineDefaultTransparentInfoHover")

    /**
     * Прозрачный цвет обводки информация
     */
    public var outlineDefaultTransparentInfoActive: Color by
        colors.obtain("outlineDefaultTransparentInfoActive")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClear: Color by colors.obtain("outlineDefaultClear")

    /**
     * Основной непрозрачный цвет обводки
     */
    public var outlineDefaultSolidPrimary: Color by colors.obtain("outlineDefaultSolidPrimary")

    /**
     * Третичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidTertiary: Color by colors.obtain("outlineDefaultSolidTertiary")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccent: Color by colors.obtain("outlineDefaultAccent")

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public var outlineDefaultAccentMinor: Color by colors.obtain("outlineDefaultAccentMinor")

    /**
     * Прозрачный акцентный цвет обводки
     */
    public var outlineDefaultTransparentAccent: Color by
        colors.obtain("outlineDefaultTransparentAccent")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarning: Color by colors.obtain("outlineDefaultWarning")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositive: Color by colors.obtain("outlineDefaultPositive")

    /**
     * Прозрачный цвет обводки успех
     */
    public var outlineDefaultTransparentPositive: Color by
        colors.obtain("outlineDefaultTransparentPositive")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegative: Color by colors.obtain("outlineDefaultNegative")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfo: Color by colors.obtain("outlineDefaultInfo")

    /**
     * Минорный цвет обводки успех
     */
    public var outlineDefaultPositiveMinor: Color by colors.obtain("outlineDefaultPositiveMinor")

    /**
     * Минорный цвет обводки предупреждение
     */
    public var outlineDefaultWarningMinor: Color by colors.obtain("outlineDefaultWarningMinor")

    /**
     * Минорный цвет обводки ошибка
     */
    public var outlineDefaultNegativeMinor: Color by colors.obtain("outlineDefaultNegativeMinor")

    /**
     * Минорный цвет обводки информация
     */
    public var outlineDefaultInfoMinor: Color by colors.obtain("outlineDefaultInfoMinor")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentWarning: Color by
        colors.obtain("outlineDefaultTransparentWarning")

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public var outlineDefaultTransparentNegative: Color by
        colors.obtain("outlineDefaultTransparentNegative")

    /**
     * Прозрачный цвет обводки информация
     */
    public var outlineDefaultTransparentInfo: Color by
        colors.obtain("outlineDefaultTransparentInfo")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimary: Color by
        colors.obtain("outlineDefaultTransparentPrimary")

    /**
     * Вторичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentSecondary: Color by
        colors.obtain("outlineDefaultTransparentSecondary")

    /**
     * Третичный прозрачный цвет обводки
     */
    public var outlineDefaultTransparentTertiary: Color by
        colors.obtain("outlineDefaultTransparentTertiary")

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public var outlineDefaultSolidSecondary: Color by colors.obtain("outlineDefaultSolidSecondary")

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidPrimaryHover: Color by
        colors.obtain("outlineOnDarkSolidPrimaryHover")

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidPrimaryActive: Color by
        colors.obtain("outlineOnDarkSolidPrimaryActive")

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidSecondaryHover: Color by
        colors.obtain("outlineOnDarkSolidSecondaryHover")

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidSecondaryActive: Color by
        colors.obtain("outlineOnDarkSolidSecondaryActive")

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidTertiaryHover: Color by
        colors.obtain("outlineOnDarkSolidTertiaryHover")

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidTertiaryActive: Color by
        colors.obtain("outlineOnDarkSolidTertiaryActive")

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public var outlineOnDarkTransparentDefaultHover: Color by
        colors.obtain("outlineOnDarkTransparentDefaultHover")

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public var outlineOnDarkTransparentDefaultActive: Color by
        colors.obtain("outlineOnDarkTransparentDefaultActive")

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public var outlineOnDarkTransparentDefault: Color by
        colors.obtain("outlineOnDarkTransparentDefault")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimaryHover: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryHover")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimaryActive: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryActive")

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentSecondaryHover: Color by
        colors.obtain("outlineOnDarkTransparentSecondaryHover")

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentSecondaryActive: Color by
        colors.obtain("outlineOnDarkTransparentSecondaryActive")

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentTertiaryHover: Color by
        colors.obtain("outlineOnDarkTransparentTertiaryHover")

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentTertiaryActive: Color by
        colors.obtain("outlineOnDarkTransparentTertiaryActive")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClearHover: Color by colors.obtain("outlineOnDarkClearHover")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClearActive: Color by colors.obtain("outlineOnDarkClearActive")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentHover: Color by colors.obtain("outlineOnDarkAccentHover")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentActive: Color by colors.obtain("outlineOnDarkAccentActive")

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentMinorHover: Color by
        colors.obtain("outlineOnDarkAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentMinorActive: Color by
        colors.obtain("outlineOnDarkAccentMinorActive")

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentAccentHover: Color by
        colors.obtain("outlineOnDarkTransparentAccentHover")

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentAccentActive: Color by
        colors.obtain("outlineOnDarkTransparentAccentActive")

    /**
     * Промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromoHover: Color by colors.obtain("outlineOnDarkPromoHover")

    /**
     * Промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromoActive: Color by colors.obtain("outlineOnDarkPromoActive")

    /**
     * Промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromo: Color by colors.obtain("outlineOnDarkPromo")

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromoMinorHover: Color by colors.obtain("outlineOnDarkPromoMinorHover")

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromoMinorActive: Color by
        colors.obtain("outlineOnDarkPromoMinorActive")

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public var outlineOnDarkPromoMinor: Color by colors.obtain("outlineOnDarkPromoMinor")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveHover: Color by colors.obtain("outlineOnDarkPositiveHover")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveActive: Color by colors.obtain("outlineOnDarkPositiveActive")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningHover: Color by colors.obtain("outlineOnDarkWarningHover")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningActive: Color by colors.obtain("outlineOnDarkWarningActive")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeHover: Color by colors.obtain("outlineOnDarkNegativeHover")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeActive: Color by colors.obtain("outlineOnDarkNegativeActive")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoHover: Color by colors.obtain("outlineOnDarkInfoHover")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoActive: Color by colors.obtain("outlineOnDarkInfoActive")

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveMinorHover: Color by
        colors.obtain("outlineOnDarkPositiveMinorHover")

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveMinorActive: Color by
        colors.obtain("outlineOnDarkPositiveMinorActive")

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningMinorHover: Color by
        colors.obtain("outlineOnDarkWarningMinorHover")

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningMinorActive: Color by
        colors.obtain("outlineOnDarkWarningMinorActive")

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeMinorHover: Color by
        colors.obtain("outlineOnDarkNegativeMinorHover")

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeMinorActive: Color by
        colors.obtain("outlineOnDarkNegativeMinorActive")

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoMinorHover: Color by colors.obtain("outlineOnDarkInfoMinorHover")

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoMinorActive: Color by colors.obtain("outlineOnDarkInfoMinorActive")

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkTransparentPositiveHover: Color by
        colors.obtain("outlineOnDarkTransparentPositiveHover")

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkTransparentPositiveActive: Color by
        colors.obtain("outlineOnDarkTransparentPositiveActive")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentWarningHover: Color by
        colors.obtain("outlineOnDarkTransparentWarningHover")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentWarningActive: Color by
        colors.obtain("outlineOnDarkTransparentWarningActive")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentNegativeHover: Color by
        colors.obtain("outlineOnDarkTransparentNegativeHover")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentNegativeActive: Color by
        colors.obtain("outlineOnDarkTransparentNegativeActive")

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkTransparentInfoHover: Color by
        colors.obtain("outlineOnDarkTransparentInfoHover")

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkTransparentInfoActive: Color by
        colors.obtain("outlineOnDarkTransparentInfoActive")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClear: Color by colors.obtain("outlineOnDarkClear")

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidPrimary: Color by colors.obtain("outlineOnDarkSolidPrimary")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccent: Color by colors.obtain("outlineOnDarkAccent")

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentMinor: Color by colors.obtain("outlineOnDarkAccentMinor")

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentAccent: Color by
        colors.obtain("outlineOnDarkTransparentAccent")

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkTransparentPositive: Color by
        colors.obtain("outlineOnDarkTransparentPositive")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositive: Color by colors.obtain("outlineOnDarkPositive")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarning: Color by colors.obtain("outlineOnDarkWarning")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegative: Color by colors.obtain("outlineOnDarkNegative")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfo: Color by colors.obtain("outlineOnDarkInfo")

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveMinor: Color by colors.obtain("outlineOnDarkPositiveMinor")

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningMinor: Color by colors.obtain("outlineOnDarkWarningMinor")

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeMinor: Color by colors.obtain("outlineOnDarkNegativeMinor")

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoMinor: Color by colors.obtain("outlineOnDarkInfoMinor")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentWarning: Color by
        colors.obtain("outlineOnDarkTransparentWarning")

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkTransparentNegative: Color by
        colors.obtain("outlineOnDarkTransparentNegative")

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public var outlineOnDarkTransparentInfo: Color by colors.obtain("outlineOnDarkTransparentInfo")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimary: Color by
        colors.obtain("outlineOnDarkTransparentPrimary")

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentSecondary: Color by
        colors.obtain("outlineOnDarkTransparentSecondary")

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentTertiary: Color by
        colors.obtain("outlineOnDarkTransparentTertiary")

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidSecondary: Color by colors.obtain("outlineOnDarkSolidSecondary")

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkSolidTertiary: Color by colors.obtain("outlineOnDarkSolidTertiary")

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidPrimaryHover: Color by
        colors.obtain("outlineOnLightSolidPrimaryHover")

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidPrimaryActive: Color by
        colors.obtain("outlineOnLightSolidPrimaryActive")

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidSecondaryHover: Color by
        colors.obtain("outlineOnLightSolidSecondaryHover")

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidSecondaryActive: Color by
        colors.obtain("outlineOnLightSolidSecondaryActive")

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidTertiaryHover: Color by
        colors.obtain("outlineOnLightSolidTertiaryHover")

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidTertiaryActive: Color by
        colors.obtain("outlineOnLightSolidTertiaryActive")

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public var outlineOnLightTransparentDefaultHover: Color by
        colors.obtain("outlineOnLightTransparentDefaultHover")

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public var outlineOnLightTransparentDefaultActive: Color by
        colors.obtain("outlineOnLightTransparentDefaultActive")

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public var outlineOnLightTransparentDefault: Color by
        colors.obtain("outlineOnLightTransparentDefault")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimaryHover: Color by
        colors.obtain("outlineOnLightTransparentPrimaryHover")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimaryActive: Color by
        colors.obtain("outlineOnLightTransparentPrimaryActive")

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentSecondaryHover: Color by
        colors.obtain("outlineOnLightTransparentSecondaryHover")

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentSecondaryActive: Color by
        colors.obtain("outlineOnLightTransparentSecondaryActive")

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentTertiaryHover: Color by
        colors.obtain("outlineOnLightTransparentTertiaryHover")

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentTertiaryActive: Color by
        colors.obtain("outlineOnLightTransparentTertiaryActive")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClearHover: Color by colors.obtain("outlineOnLightClearHover")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClearActive: Color by colors.obtain("outlineOnLightClearActive")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentHover: Color by colors.obtain("outlineOnLightAccentHover")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentActive: Color by colors.obtain("outlineOnLightAccentActive")

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentMinorHover: Color by
        colors.obtain("outlineOnLightAccentMinorHover")

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentMinorActive: Color by
        colors.obtain("outlineOnLightAccentMinorActive")

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentAccentHover: Color by
        colors.obtain("outlineOnLightTransparentAccentHover")

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentAccentActive: Color by
        colors.obtain("outlineOnLightTransparentAccentActive")

    /**
     * Промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromoHover: Color by colors.obtain("outlineOnLightPromoHover")

    /**
     * Промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromoActive: Color by colors.obtain("outlineOnLightPromoActive")

    /**
     * Промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromo: Color by colors.obtain("outlineOnLightPromo")

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromoMinorHover: Color by
        colors.obtain("outlineOnLightPromoMinorHover")

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromoMinorActive: Color by
        colors.obtain("outlineOnLightPromoMinorActive")

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public var outlineOnLightPromoMinor: Color by colors.obtain("outlineOnLightPromoMinor")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveHover: Color by colors.obtain("outlineOnLightPositiveHover")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveActive: Color by colors.obtain("outlineOnLightPositiveActive")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningHover: Color by colors.obtain("outlineOnLightWarningHover")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningActive: Color by colors.obtain("outlineOnLightWarningActive")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeHover: Color by colors.obtain("outlineOnLightNegativeHover")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeActive: Color by colors.obtain("outlineOnLightNegativeActive")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoHover: Color by colors.obtain("outlineOnLightInfoHover")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoActive: Color by colors.obtain("outlineOnLightInfoActive")

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveMinorHover: Color by
        colors.obtain("outlineOnLightPositiveMinorHover")

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveMinorActive: Color by
        colors.obtain("outlineOnLightPositiveMinorActive")

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningMinorHover: Color by
        colors.obtain("outlineOnLightWarningMinorHover")

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningMinorActive: Color by
        colors.obtain("outlineOnLightWarningMinorActive")

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeMinorHover: Color by
        colors.obtain("outlineOnLightNegativeMinorHover")

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeMinorActive: Color by
        colors.obtain("outlineOnLightNegativeMinorActive")

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoMinorHover: Color by colors.obtain("outlineOnLightInfoMinorHover")

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoMinorActive: Color by
        colors.obtain("outlineOnLightInfoMinorActive")

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightTransparentPositiveHover: Color by
        colors.obtain("outlineOnLightTransparentPositiveHover")

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightTransparentPositiveActive: Color by
        colors.obtain("outlineOnLightTransparentPositiveActive")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentWarningHover: Color by
        colors.obtain("outlineOnLightTransparentWarningHover")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentWarningActive: Color by
        colors.obtain("outlineOnLightTransparentWarningActive")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentNegativeHover: Color by
        colors.obtain("outlineOnLightTransparentNegativeHover")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentNegativeActive: Color by
        colors.obtain("outlineOnLightTransparentNegativeActive")

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightTransparentInfoHover: Color by
        colors.obtain("outlineOnLightTransparentInfoHover")

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightTransparentInfoActive: Color by
        colors.obtain("outlineOnLightTransparentInfoActive")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClear: Color by colors.obtain("outlineOnLightClear")

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentAccent: Color by
        colors.obtain("outlineOnLightTransparentAccent")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositive: Color by colors.obtain("outlineOnLightPositive")

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightTransparentPositive: Color by
        colors.obtain("outlineOnLightTransparentPositive")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentWarning: Color by
        colors.obtain("outlineOnLightTransparentWarning")

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightTransparentNegative: Color by
        colors.obtain("outlineOnLightTransparentNegative")

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightTransparentInfo: Color by
        colors.obtain("outlineOnLightTransparentInfo")

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidPrimary: Color by colors.obtain("outlineOnLightSolidPrimary")

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidTertiary: Color by colors.obtain("outlineOnLightSolidTertiary")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccent: Color by colors.obtain("outlineOnLightAccent")

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentMinor: Color by colors.obtain("outlineOnLightAccentMinor")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarning: Color by colors.obtain("outlineOnLightWarning")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegative: Color by colors.obtain("outlineOnLightNegative")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfo: Color by colors.obtain("outlineOnLightInfo")

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveMinor: Color by colors.obtain("outlineOnLightPositiveMinor")

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningMinor: Color by colors.obtain("outlineOnLightWarningMinor")

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeMinor: Color by colors.obtain("outlineOnLightNegativeMinor")

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoMinor: Color by colors.obtain("outlineOnLightInfoMinor")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimary: Color by
        colors.obtain("outlineOnLightTransparentPrimary")

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentSecondary: Color by
        colors.obtain("outlineOnLightTransparentSecondary")

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentTertiary: Color by
        colors.obtain("outlineOnLightTransparentTertiary")

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightSolidSecondary: Color by colors.obtain("outlineOnLightSolidSecondary")

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public var outlineInverseSolidPrimaryHover: Color by
        colors.obtain("outlineInverseSolidPrimaryHover")

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public var outlineInverseSolidPrimaryActive: Color by
        colors.obtain("outlineInverseSolidPrimaryActive")

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidSecondaryHover: Color by
        colors.obtain("outlineInverseSolidSecondaryHover")

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidSecondaryActive: Color by
        colors.obtain("outlineInverseSolidSecondaryActive")

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidTertiaryHover: Color by
        colors.obtain("outlineInverseSolidTertiaryHover")

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidTertiaryActive: Color by
        colors.obtain("outlineInverseSolidTertiaryActive")

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public var outlineInverseTransparentDefaultHover: Color by
        colors.obtain("outlineInverseTransparentDefaultHover")

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public var outlineInverseTransparentDefaultActive: Color by
        colors.obtain("outlineInverseTransparentDefaultActive")

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public var outlineInverseTransparentDefault: Color by
        colors.obtain("outlineInverseTransparentDefault")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimaryHover: Color by
        colors.obtain("outlineInverseTransparentPrimaryHover")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimaryActive: Color by
        colors.obtain("outlineInverseTransparentPrimaryActive")

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentSecondaryHover: Color by
        colors.obtain("outlineInverseTransparentSecondaryHover")

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentSecondaryActive: Color by
        colors.obtain("outlineInverseTransparentSecondaryActive")

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentTertiaryHover: Color by
        colors.obtain("outlineInverseTransparentTertiaryHover")

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentTertiaryActive: Color by
        colors.obtain("outlineInverseTransparentTertiaryActive")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClearHover: Color by colors.obtain("outlineInverseClearHover")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClearActive: Color by colors.obtain("outlineInverseClearActive")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccentHover: Color by colors.obtain("outlineInverseAccentHover")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccentActive: Color by colors.obtain("outlineInverseAccentActive")

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public var outlineInverseAccentMinorHover: Color by
        colors.obtain("outlineInverseAccentMinorHover")

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public var outlineInverseAccentMinorActive: Color by
        colors.obtain("outlineInverseAccentMinorActive")

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public var outlineInverseTransparentAccentHover: Color by
        colors.obtain("outlineInverseTransparentAccentHover")

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public var outlineInverseTransparentAccentActive: Color by
        colors.obtain("outlineInverseTransparentAccentActive")

    /**
     * Инвертированный промо цвет обводки
     */
    public var outlineInversePromoHover: Color by colors.obtain("outlineInversePromoHover")

    /**
     * Инвертированный промо цвет обводки
     */
    public var outlineInversePromoActive: Color by colors.obtain("outlineInversePromoActive")

    /**
     * Инвертированный промо цвет обводки
     */
    public var outlineInversePromo: Color by colors.obtain("outlineInversePromo")

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public var outlineInversePromoMinorHover: Color by
        colors.obtain("outlineInversePromoMinorHover")

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public var outlineInversePromoMinorActive: Color by
        colors.obtain("outlineInversePromoMinorActive")

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public var outlineInversePromoMinor: Color by colors.obtain("outlineInversePromoMinor")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositiveHover: Color by colors.obtain("outlineInversePositiveHover")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositiveActive: Color by colors.obtain("outlineInversePositiveActive")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarningHover: Color by colors.obtain("outlineInverseWarningHover")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarningActive: Color by colors.obtain("outlineInverseWarningActive")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegativeHover: Color by colors.obtain("outlineInverseNegativeHover")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegativeActive: Color by colors.obtain("outlineInverseNegativeActive")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfoHover: Color by colors.obtain("outlineInverseInfoHover")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfoActive: Color by colors.obtain("outlineInverseInfoActive")

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public var outlineInversePositiveMinorHover: Color by
        colors.obtain("outlineInversePositiveMinorHover")

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public var outlineInversePositiveMinorActive: Color by
        colors.obtain("outlineInversePositiveMinorActive")

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public var outlineInverseWarningMinorHover: Color by
        colors.obtain("outlineInverseWarningMinorHover")

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public var outlineInverseWarningMinorActive: Color by
        colors.obtain("outlineInverseWarningMinorActive")

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public var outlineInverseNegativeMinorHover: Color by
        colors.obtain("outlineInverseNegativeMinorHover")

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public var outlineInverseNegativeMinorActive: Color by
        colors.obtain("outlineInverseNegativeMinorActive")

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public var outlineInverseInfoMinorHover: Color by colors.obtain("outlineInverseInfoMinorHover")

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public var outlineInverseInfoMinorActive: Color by
        colors.obtain("outlineInverseInfoMinorActive")

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public var outlineInverseTransparentPositiveHover: Color by
        colors.obtain("outlineInverseTransparentPositiveHover")

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public var outlineInverseTransparentPositiveActive: Color by
        colors.obtain("outlineInverseTransparentPositiveActive")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentWarningHover: Color by
        colors.obtain("outlineInverseTransparentWarningHover")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentWarningActive: Color by
        colors.obtain("outlineInverseTransparentWarningActive")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentNegativeHover: Color by
        colors.obtain("outlineInverseTransparentNegativeHover")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentNegativeActive: Color by
        colors.obtain("outlineInverseTransparentNegativeActive")

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public var outlineInverseTransparentInfoHover: Color by
        colors.obtain("outlineInverseTransparentInfoHover")

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public var outlineInverseTransparentInfoActive: Color by
        colors.obtain("outlineInverseTransparentInfoActive")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClear: Color by colors.obtain("outlineInverseClear")

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public var outlineInverseTransparentAccent: Color by
        colors.obtain("outlineInverseTransparentAccent")

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public var outlineInverseTransparentPositive: Color by
        colors.obtain("outlineInverseTransparentPositive")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentWarning: Color by
        colors.obtain("outlineInverseTransparentWarning")

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public var outlineInverseTransparentNegative: Color by
        colors.obtain("outlineInverseTransparentNegative")

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public var outlineInverseTransparentInfo: Color by
        colors.obtain("outlineInverseTransparentInfo")

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public var outlineInverseSolidPrimary: Color by colors.obtain("outlineInverseSolidPrimary")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccent: Color by colors.obtain("outlineInverseAccent")

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public var outlineInverseAccentMinor: Color by colors.obtain("outlineInverseAccentMinor")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositive: Color by colors.obtain("outlineInversePositive")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarning: Color by colors.obtain("outlineInverseWarning")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegative: Color by colors.obtain("outlineInverseNegative")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfo: Color by colors.obtain("outlineInverseInfo")

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public var outlineInversePositiveMinor: Color by colors.obtain("outlineInversePositiveMinor")

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public var outlineInverseWarningMinor: Color by colors.obtain("outlineInverseWarningMinor")

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public var outlineInverseNegativeMinor: Color by colors.obtain("outlineInverseNegativeMinor")

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public var outlineInverseInfoMinor: Color by colors.obtain("outlineInverseInfoMinor")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimary: Color by
        colors.obtain("outlineInverseTransparentPrimary")

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentSecondary: Color by
        colors.obtain("outlineInverseTransparentSecondary")

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public var outlineInverseTransparentTertiary: Color by
        colors.obtain("outlineInverseTransparentTertiary")

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidSecondary: Color by colors.obtain("outlineInverseSolidSecondary")

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public var outlineInverseSolidTertiary: Color by colors.obtain("outlineInverseSolidTertiary")

    /**
     * Возвращает копию [SddsServColors]. Предоставляет возможность переопределять цвета.
     */
    public fun copy(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsServColors {
        val colorOverrideScope = ColorOverrideScope()
        overrideColors.invoke(colorOverrideScope)
        val overrideMap = colorOverrideScope.overrideMap
        return SddsServColors(colors.mapValues { overrideMap[it.key] ?: it.value })
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
    public val textDefaultPrimaryHover: String = "textDefaultPrimaryHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryActive: String = "textDefaultPrimaryActive"

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
    public val textDefaultSecondaryHover: String = "textDefaultSecondaryHover"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryActive: String = "textDefaultSecondaryActive"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondary: String = "textDefaultSecondary"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryHover: String = "textDefaultTertiaryHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryActive: String = "textDefaultTertiaryActive"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiary: String = "textDefaultTertiary"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphHover: String = "textDefaultParagraphHover"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphActive: String = "textDefaultParagraphActive"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraph: String = "textDefaultParagraph"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentHover: String = "textDefaultAccentHover"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentActive: String = "textDefaultAccentActive"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccent: String = "textDefaultAccent"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorHover: String = "textDefaultAccentMinorHover"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorActive: String = "textDefaultAccentMinorActive"

    /**
     * Промо цвет
     */
    public val textDefaultPromoHover: String = "textDefaultPromoHover"

    /**
     * Промо цвет
     */
    public val textDefaultPromoActive: String = "textDefaultPromoActive"

    /**
     * Промо цвет
     */
    public val textDefaultPromo: String = "textDefaultPromo"

    /**
     * Минорный промо цвет
     */
    public val textDefaultPromoMinorHover: String = "textDefaultPromoMinorHover"

    /**
     * Минорный промо цвет
     */
    public val textDefaultPromoMinorActive: String = "textDefaultPromoMinorActive"

    /**
     * Минорный промо цвет
     */
    public val textDefaultPromoMinor: String = "textDefaultPromoMinor"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveHover: String = "textDefaultPositiveHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveActive: String = "textDefaultPositiveActive"

    /**
     * Цвет успеха
     */
    public val textDefaultPositive: String = "textDefaultPositive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningHover: String = "textDefaultWarningHover"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningActive: String = "textDefaultWarningActive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarning: String = "textDefaultWarning"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeHover: String = "textDefaultNegativeHover"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeActive: String = "textDefaultNegativeActive"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegative: String = "textDefaultNegative"

    /**
     * Цвет информации
     */
    public val textDefaultInfoHover: String = "textDefaultInfoHover"

    /**
     * Цвет информации
     */
    public val textDefaultInfoActive: String = "textDefaultInfoActive"

    /**
     * Минорный цвет успеха
     */
    public val textDefaultPositiveMinorHover: String = "textDefaultPositiveMinorHover"

    /**
     * Минорный цвет успеха
     */
    public val textDefaultPositiveMinorActive: String = "textDefaultPositiveMinorActive"

    /**
     * Минорный цвет предупреждения
     */
    public val textDefaultWarningMinorHover: String = "textDefaultWarningMinorHover"

    /**
     * Минорный цвет предупреждения
     */
    public val textDefaultWarningMinorActive: String = "textDefaultWarningMinorActive"

    /**
     * Минорный цвет ошибки
     */
    public val textDefaultNegativeMinorHover: String = "textDefaultNegativeMinorHover"

    /**
     * Минорный цвет ошибки
     */
    public val textDefaultNegativeMinorActive: String = "textDefaultNegativeMinorActive"

    /**
     * Минорный цвет информации
     */
    public val textDefaultInfoMinorHover: String = "textDefaultInfoMinorHover"

    /**
     * Минорный цвет информации
     */
    public val textDefaultInfoMinorActive: String = "textDefaultInfoMinorActive"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinor: String = "textDefaultAccentMinor"

    /**
     * Цвет информации
     */
    public val textDefaultInfo: String = "textDefaultInfo"

    /**
     * Минорный цвет успеха
     */
    public val textDefaultPositiveMinor: String = "textDefaultPositiveMinor"

    /**
     * Минорный цвет предупреждения
     */
    public val textDefaultWarningMinor: String = "textDefaultWarningMinor"

    /**
     * Минорный цвет ошибки
     */
    public val textDefaultNegativeMinor: String = "textDefaultNegativeMinor"

    /**
     * Минорный цвет информации
     */
    public val textDefaultInfoMinor: String = "textDefaultInfoMinor"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryHover: String = "textOnDarkPrimaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryActive: String = "textOnDarkPrimaryActive"

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
    public val textOnDarkSecondaryHover: String = "textOnDarkSecondaryHover"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryActive: String = "textOnDarkSecondaryActive"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondary: String = "textOnDarkSecondary"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryHover: String = "textOnDarkTertiaryHover"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryActive: String = "textOnDarkTertiaryActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiary: String = "textOnDarkTertiary"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphHover: String = "textOnDarkParagraphHover"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphActive: String = "textOnDarkParagraphActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraph: String = "textOnDarkParagraph"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentHover: String = "textOnDarkAccentHover"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentActive: String = "textOnDarkAccentActive"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccent: String = "textOnDarkAccent"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorHover: String = "textOnDarkAccentMinorHover"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorActive: String = "textOnDarkAccentMinorActive"

    /**
     * Промо цвет на темном фоне
     */
    public val textOnDarkPromoHover: String = "textOnDarkPromoHover"

    /**
     * Промо цвет на темном фоне
     */
    public val textOnDarkPromoActive: String = "textOnDarkPromoActive"

    /**
     * Промо цвет на темном фоне
     */
    public val textOnDarkPromo: String = "textOnDarkPromo"

    /**
     * Минорный промо цвет на темном фоне
     */
    public val textOnDarkPromoMinorHover: String = "textOnDarkPromoMinorHover"

    /**
     * Минорный промо цвет на темном фоне
     */
    public val textOnDarkPromoMinorActive: String = "textOnDarkPromoMinorActive"

    /**
     * Минорный промо цвет на темном фоне
     */
    public val textOnDarkPromoMinor: String = "textOnDarkPromoMinor"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveHover: String = "textOnDarkPositiveHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveActive: String = "textOnDarkPositiveActive"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositive: String = "textOnDarkPositive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningHover: String = "textOnDarkWarningHover"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningActive: String = "textOnDarkWarningActive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarning: String = "textOnDarkWarning"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeHover: String = "textOnDarkNegativeHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeActive: String = "textOnDarkNegativeActive"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegative: String = "textOnDarkNegative"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoHover: String = "textOnDarkInfoHover"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoActive: String = "textOnDarkInfoActive"

    /**
     * Минорный цвет успеха на темном фоне
     */
    public val textOnDarkPositiveMinorHover: String = "textOnDarkPositiveMinorHover"

    /**
     * Минорный цвет успеха на темном фоне
     */
    public val textOnDarkPositiveMinorActive: String = "textOnDarkPositiveMinorActive"

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningMinorHover: String = "textOnDarkWarningMinorHover"

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningMinorActive: String = "textOnDarkWarningMinorActive"

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeMinorHover: String = "textOnDarkNegativeMinorHover"

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeMinorActive: String = "textOnDarkNegativeMinorActive"

    /**
     * Минорный цвет информации на темном фоне
     */
    public val textOnDarkInfoMinorHover: String = "textOnDarkInfoMinorHover"

    /**
     * Минорный цвет информации на темном фоне
     */
    public val textOnDarkInfoMinorActive: String = "textOnDarkInfoMinorActive"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinor: String = "textOnDarkAccentMinor"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfo: String = "textOnDarkInfo"

    /**
     * Минорный цвет успеха на темном фоне
     */
    public val textOnDarkPositiveMinor: String = "textOnDarkPositiveMinor"

    /**
     * Минорный цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningMinor: String = "textOnDarkWarningMinor"

    /**
     * Минорный цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeMinor: String = "textOnDarkNegativeMinor"

    /**
     * Минорный цвет информации на темном фоне
     */
    public val textOnDarkInfoMinor: String = "textOnDarkInfoMinor"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryHover: String = "textOnLightPrimaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryActive: String = "textOnLightPrimaryActive"

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
    public val textOnLightSecondaryHover: String = "textOnLightSecondaryHover"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryActive: String = "textOnLightSecondaryActive"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondary: String = "textOnLightSecondary"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryHover: String = "textOnLightTertiaryHover"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryActive: String = "textOnLightTertiaryActive"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiary: String = "textOnLightTertiary"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphHover: String = "textOnLightParagraphHover"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphActive: String = "textOnLightParagraphActive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraph: String = "textOnLightParagraph"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentHover: String = "textOnLightAccentHover"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentActive: String = "textOnLightAccentActive"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccent: String = "textOnLightAccent"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorHover: String = "textOnLightAccentMinorHover"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorActive: String = "textOnLightAccentMinorActive"

    /**
     * Промо цвет на светлом фоне
     */
    public val textOnLightPromoHover: String = "textOnLightPromoHover"

    /**
     * Промо цвет на светлом фоне
     */
    public val textOnLightPromoActive: String = "textOnLightPromoActive"

    /**
     * Промо цвет на светлом фоне
     */
    public val textOnLightPromo: String = "textOnLightPromo"

    /**
     * Минорный промо цвет на светлом фоне
     */
    public val textOnLightPromoMinorHover: String = "textOnLightPromoMinorHover"

    /**
     * Минорный промо цвет на светлом фоне
     */
    public val textOnLightPromoMinorActive: String = "textOnLightPromoMinorActive"

    /**
     * Минорный промо цвет на светлом фоне
     */
    public val textOnLightPromoMinor: String = "textOnLightPromoMinor"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveHover: String = "textOnLightPositiveHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveActive: String = "textOnLightPositiveActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositive: String = "textOnLightPositive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningHover: String = "textOnLightWarningHover"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningActive: String = "textOnLightWarningActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarning: String = "textOnLightWarning"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeHover: String = "textOnLightNegativeHover"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeActive: String = "textOnLightNegativeActive"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegative: String = "textOnLightNegative"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoHover: String = "textOnLightInfoHover"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoActive: String = "textOnLightInfoActive"

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public val textOnLightPositiveMinorHover: String = "textOnLightPositiveMinorHover"

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public val textOnLightPositiveMinorActive: String = "textOnLightPositiveMinorActive"

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningMinorHover: String = "textOnLightWarningMinorHover"

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningMinorActive: String = "textOnLightWarningMinorActive"

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeMinorHover: String = "textOnLightNegativeMinorHover"

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeMinorActive: String = "textOnLightNegativeMinorActive"

    /**
     * Минорный цвет информации на светлом фоне
     */
    public val textOnLightInfoMinorHover: String = "textOnLightInfoMinorHover"

    /**
     * Минорный цвет информации на светлом фоне
     */
    public val textOnLightInfoMinorActive: String = "textOnLightInfoMinorActive"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfo: String = "textOnLightInfo"

    /**
     * Минорный цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningMinor: String = "textOnLightWarningMinor"

    /**
     * Минорный цвет успеха на светлом фоне
     */
    public val textOnLightPositiveMinor: String = "textOnLightPositiveMinor"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinor: String = "textOnLightAccentMinor"

    /**
     * Минорный цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeMinor: String = "textOnLightNegativeMinor"

    /**
     * Минорный цвет информации на светлом фоне
     */
    public val textOnLightInfoMinor: String = "textOnLightInfoMinor"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryHover: String = "textInversePrimaryHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryActive: String = "textInversePrimaryActive"

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
    public val textInverseSecondaryHover: String = "textInverseSecondaryHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryActive: String = "textInverseSecondaryActive"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondary: String = "textInverseSecondary"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryHover: String = "textInverseTertiaryHover"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryActive: String = "textInverseTertiaryActive"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiary: String = "textInverseTertiary"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraphHover: String = "textInverseParagraphHover"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraphActive: String = "textInverseParagraphActive"

    /**
     * Инвертированный cплошной наборный текст
     */
    public val textInverseParagraph: String = "textInverseParagraph"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentHover: String = "textInverseAccentHover"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentActive: String = "textInverseAccentActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccent: String = "textInverseAccent"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorHover: String = "textInverseAccentMinorHover"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorActive: String = "textInverseAccentMinorActive"

    /**
     * Инвертированный промо цвет
     */
    public val textInversePromoHover: String = "textInversePromoHover"

    /**
     * Инвертированный промо цвет
     */
    public val textInversePromoActive: String = "textInversePromoActive"

    /**
     * Инвертированный промо цвет
     */
    public val textInversePromo: String = "textInversePromo"

    /**
     * Инвертированный минорный промо цвет
     */
    public val textInversePromoMinorHover: String = "textInversePromoMinorHover"

    /**
     * Инвертированный минорный промо цвет
     */
    public val textInversePromoMinorActive: String = "textInversePromoMinorActive"

    /**
     * Инвертированный минорный промо цвет
     */
    public val textInversePromoMinor: String = "textInversePromoMinor"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveHover: String = "textInversePositiveHover"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveActive: String = "textInversePositiveActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositive: String = "textInversePositive"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningHover: String = "textInverseWarningHover"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningActive: String = "textInverseWarningActive"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarning: String = "textInverseWarning"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeHover: String = "textInverseNegativeHover"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeActive: String = "textInverseNegativeActive"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegative: String = "textInverseNegative"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoHover: String = "textInverseInfoHover"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoActive: String = "textInverseInfoActive"

    /**
     * Инвертированный минорный цвет успеха
     */
    public val textInversePositiveMinorHover: String = "textInversePositiveMinorHover"

    /**
     * Инвертированный минорный цвет успеха
     */
    public val textInversePositiveMinorActive: String = "textInversePositiveMinorActive"

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public val textInverseWarningMinorHover: String = "textInverseWarningMinorHover"

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public val textInverseWarningMinorActive: String = "textInverseWarningMinorActive"

    /**
     * Инвертированный минорный цвет ошибки
     */
    public val textInverseNegativeMinorHover: String = "textInverseNegativeMinorHover"

    /**
     * Инвертированный минорный цвет ошибки
     */
    public val textInverseNegativeMinorActive: String = "textInverseNegativeMinorActive"

    /**
     * Инвертированный минорный цвет информации
     */
    public val textInverseInfoMinorHover: String = "textInverseInfoMinorHover"

    /**
     * Инвертированный минорный цвет информации
     */
    public val textInverseInfoMinorActive: String = "textInverseInfoMinorActive"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinor: String = "textInverseAccentMinor"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfo: String = "textInverseInfo"

    /**
     * Инвертированный минорный цвет успеха
     */
    public val textInversePositiveMinor: String = "textInversePositiveMinor"

    /**
     * Инвертированный минорный цвет предупреждения
     */
    public val textInverseWarningMinor: String = "textInverseWarningMinor"

    /**
     * Инвертированный минорный цвет ошибки
     */
    public val textInverseNegativeMinor: String = "textInverseNegativeMinor"

    /**
     * Инвертированный минорный цвет информации
     */
    public val textInverseInfoMinor: String = "textInverseInfoMinor"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryHover: String = "surfaceDefaultSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryActive: String = "surfaceDefaultSolidPrimaryActive"

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
    public val surfaceDefaultSolidSecondaryHover: String = "surfaceDefaultSolidSecondaryHover"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryActive: String = "surfaceDefaultSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondary: String = "surfaceDefaultSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryHover: String = "surfaceDefaultSolidTertiaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryActive: String = "surfaceDefaultSolidTertiaryActive"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiary: String = "surfaceDefaultSolidTertiary"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardHover: String = "surfaceDefaultSolidCardHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardActive: String = "surfaceDefaultSolidCardActive"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCard: String = "surfaceDefaultSolidCard"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightness: String = "surfaceDefaultSolidCardBrightness"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultHover: String = "surfaceDefaultSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultActive: String = "surfaceDefaultSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefault: String = "surfaceDefaultSolidDefault"

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
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondary: String = "surfaceDefaultTransparentSecondary"

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
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiary: String = "surfaceDefaultTransparentTertiary"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDeepHover: String = "surfaceDefaultTransparentDeepHover"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDeepActive: String = "surfaceDefaultTransparentDeepActive"

    /**
     * Прозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultTransparentDeep: String = "surfaceDefaultTransparentDeep"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardHover: String = "surfaceDefaultTransparentCardHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardActive: String = "surfaceDefaultTransparentCardActive"

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
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearHover: String = "surfaceDefaultClearHover"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearActive: String = "surfaceDefaultClearActive"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClear: String = "surfaceDefaultClear"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentHover: String = "surfaceDefaultAccentHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentActive: String = "surfaceDefaultAccentActive"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccent: String = "surfaceDefaultAccent"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorHover: String = "surfaceDefaultAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorActive: String = "surfaceDefaultAccentMinorActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentHover: String = "surfaceDefaultTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentActive: String =
        "surfaceDefaultTransparentAccentActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccent: String = "surfaceDefaultTransparentAccent"

    /**
     * Промо фон поверхности/контрола
     */
    public val surfaceDefaultPromoHover: String = "surfaceDefaultPromoHover"

    /**
     * Промо фон поверхности/контрола
     */
    public val surfaceDefaultPromoActive: String = "surfaceDefaultPromoActive"

    /**
     * Промо фон поверхности/контрола
     */
    public val surfaceDefaultPromo: String = "surfaceDefaultPromo"

    /**
     * Минорный промо фон поверхности/контрола
     */
    public val surfaceDefaultPromoMinorHover: String = "surfaceDefaultPromoMinorHover"

    /**
     * Минорный промо фон поверхности/контрола
     */
    public val surfaceDefaultPromoMinorActive: String = "surfaceDefaultPromoMinorActive"

    /**
     * Минорный промо фон поверхности/контрола
     */
    public val surfaceDefaultPromoMinor: String = "surfaceDefaultPromoMinor"

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPromoHover: String = "surfaceDefaultTransparentPromoHover"

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPromoActive: String = "surfaceDefaultTransparentPromoActive"

    /**
     * Прозрачный промо фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPromo: String = "surfaceDefaultTransparentPromo"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositiveHover: String = "surfaceDefaultPositiveHover"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositiveActive: String = "surfaceDefaultPositiveActive"

    /**
     * Цвет успеха
     */
    public val surfaceDefaultPositive: String = "surfaceDefaultPositive"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningHover: String = "surfaceDefaultWarningHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningActive: String = "surfaceDefaultWarningActive"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarning: String = "surfaceDefaultWarning"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeHover: String = "surfaceDefaultNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeActive: String = "surfaceDefaultNegativeActive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegative: String = "surfaceDefaultNegative"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoHover: String = "surfaceDefaultInfoHover"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoActive: String = "surfaceDefaultInfoActive"

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveMinorHover: String = "surfaceDefaultPositiveMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveMinorActive: String = "surfaceDefaultPositiveMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningMinorHover: String = "surfaceDefaultWarningMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningMinorActive: String = "surfaceDefaultWarningMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeMinorHover: String = "surfaceDefaultNegativeMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeMinorActive: String = "surfaceDefaultNegativeMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoMinorHover: String = "surfaceDefaultInfoMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoMinorActive: String = "surfaceDefaultInfoMinorActive"

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultTransparentPositiveHover: String =
        "surfaceDefaultTransparentPositiveHover"

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultTransparentPositiveActive: String =
        "surfaceDefaultTransparentPositiveActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentWarningHover: String =
        "surfaceDefaultTransparentWarningHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentWarningActive: String =
        "surfaceDefaultTransparentWarningActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeHover: String =
        "surfaceDefaultTransparentNegativeHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeActive: String =
        "surfaceDefaultTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultTransparentInfoHover: String = "surfaceDefaultTransparentInfoHover"

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultTransparentInfoActive: String = "surfaceDefaultTransparentInfoActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinor: String = "surfaceDefaultAccentMinor"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfo: String = "surfaceDefaultInfo"

    /**
     * Минорный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveMinor: String = "surfaceDefaultPositiveMinor"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningMinor: String = "surfaceDefaultWarningMinor"

    /**
     * Минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeMinor: String = "surfaceDefaultNegativeMinor"

    /**
     * Минорный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoMinor: String = "surfaceDefaultInfoMinor"

    /**
     * Прозрачный цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultTransparentPositive: String = "surfaceDefaultTransparentPositive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentWarning: String = "surfaceDefaultTransparentWarning"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegative: String = "surfaceDefaultTransparentNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultTransparentInfo: String = "surfaceDefaultTransparentInfo"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimary: String = "surfaceDefaultTransparentPrimary"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryHover: String = "surfaceOnDarkSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryActive: String = "surfaceOnDarkSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimary: String = "surfaceOnDarkSolidPrimary"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightness: String = "surfaceOnDarkSolidPrimaryBrightness"

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryHover: String = "surfaceOnDarkSolidSecondaryHover"

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryActive: String = "surfaceOnDarkSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности на темном фоне
     */
    public val surfaceOnDarkSolidSecondary: String = "surfaceOnDarkSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryHover: String = "surfaceOnDarkSolidTertiaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryActive: String = "surfaceOnDarkSolidTertiaryActive"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiary: String = "surfaceOnDarkSolidTertiary"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardHover: String = "surfaceOnDarkSolidCardHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardActive: String = "surfaceOnDarkSolidCardActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCard: String = "surfaceOnDarkSolidCard"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightness: String = "surfaceOnDarkSolidCardBrightness"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultHover: String = "surfaceOnDarkSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultActive: String = "surfaceOnDarkSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefault: String = "surfaceOnDarkSolidDefault"

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
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimary: String = "surfaceOnDarkTransparentPrimary"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryHover: String =
        "surfaceOnDarkTransparentSecondaryHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryActive: String =
        "surfaceOnDarkTransparentSecondaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondary: String = "surfaceOnDarkTransparentSecondary"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryHover: String =
        "surfaceOnDarkTransparentTertiaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryActive: String =
        "surfaceOnDarkTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiary: String = "surfaceOnDarkTransparentTertiary"

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDeepHover: String = "surfaceOnDarkTransparentDeepHover"

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDeepActive: String = "surfaceOnDarkTransparentDeepActive"

    /**
     * Прозрачный фон поверхности по умолчанию на темном фоне
     */
    public val surfaceOnDarkTransparentDeep: String = "surfaceOnDarkTransparentDeep"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardHover: String = "surfaceOnDarkTransparentCardHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardActive: String = "surfaceOnDarkTransparentCardActive"

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
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearHover: String = "surfaceOnDarkClearHover"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearActive: String = "surfaceOnDarkClearActive"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClear: String = "surfaceOnDarkClear"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentHover: String = "surfaceOnDarkAccentHover"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentActive: String = "surfaceOnDarkAccentActive"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccent: String = "surfaceOnDarkAccent"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorHover: String = "surfaceOnDarkAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorActive: String = "surfaceOnDarkAccentMinorActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentHover: String = "surfaceOnDarkTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentActive: String = "surfaceOnDarkTransparentAccentActive"

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromoHover: String = "surfaceOnDarkPromoHover"

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromoActive: String = "surfaceOnDarkPromoActive"

    /**
     * Промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromo: String = "surfaceOnDarkPromo"

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromoMinorHover: String = "surfaceOnDarkPromoMinorHover"

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromoMinorActive: String = "surfaceOnDarkPromoMinorActive"

    /**
     * Минорный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkPromoMinor: String = "surfaceOnDarkPromoMinor"

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPromoHover: String = "surfaceOnDarkTransparentPromoHover"

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPromoActive: String = "surfaceOnDarkTransparentPromoActive"

    /**
     * Прозрачный промо фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPromo: String = "surfaceOnDarkTransparentPromo"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositiveHover: String = "surfaceOnDarkPositiveHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositiveActive: String = "surfaceOnDarkPositiveActive"

    /**
     * Цвет успеха на темном фоне
     */
    public val surfaceOnDarkPositive: String = "surfaceOnDarkPositive"

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningHover: String = "surfaceOnDarkWarningHover"

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningActive: String = "surfaceOnDarkWarningActive"

    /**
     * Цвет фона поверхности предупреждение на темном фоне
     */
    public val surfaceOnDarkWarning: String = "surfaceOnDarkWarning"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeHover: String = "surfaceOnDarkNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeActive: String = "surfaceOnDarkNegativeActive"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegative: String = "surfaceOnDarkNegative"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoHover: String = "surfaceOnDarkInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoActive: String = "surfaceOnDarkInfoActive"

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveMinorHover: String = "surfaceOnDarkPositiveMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveMinorActive: String = "surfaceOnDarkPositiveMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningMinorHover: String = "surfaceOnDarkWarningMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningMinorActive: String = "surfaceOnDarkWarningMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeMinorHover: String = "surfaceOnDarkNegativeMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeMinorActive: String = "surfaceOnDarkNegativeMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoMinorHover: String = "surfaceOnDarkInfoMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoMinorActive: String = "surfaceOnDarkInfoMinorActive"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkTransparentPositiveHover: String =
        "surfaceOnDarkTransparentPositiveHover"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkTransparentPositiveActive: String =
        "surfaceOnDarkTransparentPositiveActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentWarningHover: String = "surfaceOnDarkTransparentWarningHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentWarningActive: String =
        "surfaceOnDarkTransparentWarningActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeHover: String =
        "surfaceOnDarkTransparentNegativeHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeActive: String =
        "surfaceOnDarkTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkTransparentInfoHover: String = "surfaceOnDarkTransparentInfoHover"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkTransparentInfoActive: String = "surfaceOnDarkTransparentInfoActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinor: String = "surfaceOnDarkAccentMinor"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccent: String = "surfaceOnDarkTransparentAccent"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfo: String = "surfaceOnDarkInfo"

    /**
     * Минорный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveMinor: String = "surfaceOnDarkPositiveMinor"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningMinor: String = "surfaceOnDarkWarningMinor"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeMinor: String = "surfaceOnDarkNegativeMinor"

    /**
     * Минорный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoMinor: String = "surfaceOnDarkInfoMinor"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkTransparentPositive: String = "surfaceOnDarkTransparentPositive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentWarning: String = "surfaceOnDarkTransparentWarning"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegative: String = "surfaceOnDarkTransparentNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkTransparentInfo: String = "surfaceOnDarkTransparentInfo"

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryHover: String = "surfaceOnLightSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryActive: String = "surfaceOnLightSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidPrimary: String = "surfaceOnLightSolidPrimary"

    /**
     * Основной непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightness: String = "surfaceOnLightSolidPrimaryBrightness"

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryHover: String = "surfaceOnLightSolidSecondaryHover"

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryActive: String = "surfaceOnLightSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidSecondary: String = "surfaceOnLightSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryHover: String = "surfaceOnLightSolidTertiaryHover"

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryActive: String = "surfaceOnLightSolidTertiaryActive"

    /**
     * Третичный непрозрачный фон поверхности на светлом фоне
     */
    public val surfaceOnLightSolidTertiary: String = "surfaceOnLightSolidTertiary"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardHover: String = "surfaceOnLightSolidCardHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardActive: String = "surfaceOnLightSolidCardActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCard: String = "surfaceOnLightSolidCard"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightness: String = "surfaceOnLightSolidCardBrightness"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultHover: String = "surfaceOnLightSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultActive: String = "surfaceOnLightSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefault: String = "surfaceOnLightSolidDefault"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryHover: String =
        "surfaceOnLightTransparentPrimaryHover"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryActive: String =
        "surfaceOnLightTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryHover: String =
        "surfaceOnLightTransparentSecondaryHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryActive: String =
        "surfaceOnLightTransparentSecondaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondary: String = "surfaceOnLightTransparentSecondary"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryHover: String =
        "surfaceOnLightTransparentTertiaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryActive: String =
        "surfaceOnLightTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiary: String = "surfaceOnLightTransparentTertiary"

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDeepHover: String = "surfaceOnLightTransparentDeepHover"

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDeepActive: String = "surfaceOnLightTransparentDeepActive"

    /**
     * Прозрачный фон поверхности по умолчанию на светлом фоне
     */
    public val surfaceOnLightTransparentDeep: String = "surfaceOnLightTransparentDeep"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardHover: String = "surfaceOnLightTransparentCardHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardActive: String = "surfaceOnLightTransparentCardActive"

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
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearHover: String = "surfaceOnLightClearHover"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearActive: String = "surfaceOnLightClearActive"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClear: String = "surfaceOnLightClear"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentHover: String = "surfaceOnLightAccentHover"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentActive: String = "surfaceOnLightAccentActive"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccent: String = "surfaceOnLightAccent"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorHover: String = "surfaceOnLightAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorActive: String = "surfaceOnLightAccentMinorActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentHover: String = "surfaceOnLightTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentActive: String =
        "surfaceOnLightTransparentAccentActive"

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromoHover: String = "surfaceOnLightPromoHover"

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromoActive: String = "surfaceOnLightPromoActive"

    /**
     * Промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromo: String = "surfaceOnLightPromo"

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromoMinorHover: String = "surfaceOnLightPromoMinorHover"

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromoMinorActive: String = "surfaceOnLightPromoMinorActive"

    /**
     * Минорный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightPromoMinor: String = "surfaceOnLightPromoMinor"

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPromoHover: String = "surfaceOnLightTransparentPromoHover"

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPromoActive: String = "surfaceOnLightTransparentPromoActive"

    /**
     * Прозрачный промо фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPromo: String = "surfaceOnLightTransparentPromo"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositiveHover: String = "surfaceOnLightPositiveHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositiveActive: String = "surfaceOnLightPositiveActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val surfaceOnLightPositive: String = "surfaceOnLightPositive"

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningHover: String = "surfaceOnLightWarningHover"

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningActive: String = "surfaceOnLightWarningActive"

    /**
     * Цвет фона поверхности предупреждение на светлом фоне
     */
    public val surfaceOnLightWarning: String = "surfaceOnLightWarning"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeHover: String = "surfaceOnLightNegativeHover"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeActive: String = "surfaceOnLightNegativeActive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegative: String = "surfaceOnLightNegative"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoHover: String = "surfaceOnLightInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoActive: String = "surfaceOnLightInfoActive"

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveMinorHover: String = "surfaceOnLightPositiveMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveMinorActive: String = "surfaceOnLightPositiveMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningMinorHover: String = "surfaceOnLightWarningMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningMinorActive: String = "surfaceOnLightWarningMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeMinorHover: String = "surfaceOnLightNegativeMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeMinorActive: String = "surfaceOnLightNegativeMinorActive"

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoMinorHover: String = "surfaceOnLightInfoMinorHover"

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoMinorActive: String = "surfaceOnLightInfoMinorActive"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightTransparentPositiveHover: String =
        "surfaceOnLightTransparentPositiveHover"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightTransparentPositiveActive: String =
        "surfaceOnLightTransparentPositiveActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentWarningHover: String =
        "surfaceOnLightTransparentWarningHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentWarningActive: String =
        "surfaceOnLightTransparentWarningActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeHover: String =
        "surfaceOnLightTransparentNegativeHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeActive: String =
        "surfaceOnLightTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightTransparentInfoHover: String = "surfaceOnLightTransparentInfoHover"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightTransparentInfoActive: String = "surfaceOnLightTransparentInfoActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinor: String = "surfaceOnLightAccentMinor"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccent: String = "surfaceOnLightTransparentAccent"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfo: String = "surfaceOnLightInfo"

    /**
     * Минорный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningMinor: String = "surfaceOnLightWarningMinor"

    /**
     * Минорный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveMinor: String = "surfaceOnLightPositiveMinor"

    /**
     * Минорный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoMinor: String = "surfaceOnLightInfoMinor"

    /**
     * Минорный цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeMinor: String = "surfaceOnLightNegativeMinor"

    /**
     * Прозрачный цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightTransparentPositive: String = "surfaceOnLightTransparentPositive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentWarning: String = "surfaceOnLightTransparentWarning"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegative: String = "surfaceOnLightTransparentNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightTransparentInfo: String = "surfaceOnLightTransparentInfo"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimary: String = "surfaceOnLightTransparentPrimary"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryHover: String = "surfaceInverseSolidPrimaryHover"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryActive: String = "surfaceInverseSolidPrimaryActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimary: String = "surfaceInverseSolidPrimary"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightness: String = "surfaceInverseSolidPrimaryBrightness"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public val surfaceInverseSolidSecondaryHover: String = "surfaceInverseSolidSecondaryHover"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public val surfaceInverseSolidSecondaryActive: String = "surfaceInverseSolidSecondaryActive"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности
     */
    public val surfaceInverseSolidSecondary: String = "surfaceInverseSolidSecondary"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryHover: String = "surfaceInverseSolidTertiaryHover"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryActive: String = "surfaceInverseSolidTertiaryActive"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiary: String = "surfaceInverseSolidTertiary"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardHover: String = "surfaceInverseSolidCardHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardActive: String = "surfaceInverseSolidCardActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCard: String = "surfaceInverseSolidCard"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightness: String = "surfaceInverseSolidCardBrightness"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultHover: String = "surfaceInverseSolidDefaultHover"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultActive: String = "surfaceInverseSolidDefaultActive"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefault: String = "surfaceInverseSolidDefault"

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
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimary: String = "surfaceInverseTransparentPrimary"

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
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondary: String = "surfaceInverseTransparentSecondary"

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
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiary: String = "surfaceInverseTransparentTertiary"

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public val surfaceInverseTransparentDeepHover: String = "surfaceInverseTransparentDeepHover"

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public val surfaceInverseTransparentDeepActive: String = "surfaceInverseTransparentDeepActive"

    /**
     * Инвертированный прозрачный фон поверхности по умолчанию
     */
    public val surfaceInverseTransparentDeep: String = "surfaceInverseTransparentDeep"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardHover: String = "surfaceInverseTransparentCardHover"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardActive: String = "surfaceInverseTransparentCardActive"

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
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearHover: String = "surfaceInverseClearHover"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearActive: String = "surfaceInverseClearActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClear: String = "surfaceInverseClear"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentHover: String = "surfaceInverseAccentHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentActive: String = "surfaceInverseAccentActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccent: String = "surfaceInverseAccent"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorHover: String = "surfaceInverseAccentMinorHover"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorActive: String = "surfaceInverseAccentMinorActive"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentHover: String = "surfaceInverseTransparentAccentHover"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentActive: String =
        "surfaceInverseTransparentAccentActive"

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public val surfaceInversePromoHover: String = "surfaceInversePromoHover"

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public val surfaceInversePromoActive: String = "surfaceInversePromoActive"

    /**
     * Инвертированный промо фон поверхности/контрола
     */
    public val surfaceInversePromo: String = "surfaceInversePromo"

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public val surfaceInversePromoMinorHover: String = "surfaceInversePromoMinorHover"

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public val surfaceInversePromoMinorActive: String = "surfaceInversePromoMinorActive"

    /**
     * Инвертированный минорный промо фон поверхности/контрола
     */
    public val surfaceInversePromoMinor: String = "surfaceInversePromoMinor"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public val surfaceInverseTransparentPromoHover: String = "surfaceInverseTransparentPromoHover"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public val surfaceInverseTransparentPromoActive: String = "surfaceInverseTransparentPromoActive"

    /**
     * Инвертированный прозрачный промо фон поверхности/контрола
     */
    public val surfaceInverseTransparentPromo: String = "surfaceInverseTransparentPromo"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositiveHover: String = "surfaceInversePositiveHover"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositiveActive: String = "surfaceInversePositiveActive"

    /**
     * Инвертированный цвет успеха
     */
    public val surfaceInversePositive: String = "surfaceInversePositive"

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public val surfaceInverseWarningHover: String = "surfaceInverseWarningHover"

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public val surfaceInverseWarningActive: String = "surfaceInverseWarningActive"

    /**
     * Инвертированный цвет фона поверхности предупреждение
     */
    public val surfaceInverseWarning: String = "surfaceInverseWarning"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeHover: String = "surfaceInverseNegativeHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeActive: String = "surfaceInverseNegativeActive"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegative: String = "surfaceInverseNegative"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoHover: String = "surfaceInverseInfoHover"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoActive: String = "surfaceInverseInfoActive"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveMinorHover: String = "surfaceInversePositiveMinorHover"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveMinorActive: String = "surfaceInversePositiveMinorActive"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningMinorHover: String = "surfaceInverseWarningMinorHover"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningMinorActive: String = "surfaceInverseWarningMinorActive"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeMinorHover: String = "surfaceInverseNegativeMinorHover"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeMinorActive: String = "surfaceInverseNegativeMinorActive"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoMinorHover: String = "surfaceInverseInfoMinorHover"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoMinorActive: String = "surfaceInverseInfoMinorActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInverseTransparentPositiveHover: String =
        "surfaceInverseTransparentPositiveHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInverseTransparentPositiveActive: String =
        "surfaceInverseTransparentPositiveActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentWarningHover: String =
        "surfaceInverseTransparentWarningHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentWarningActive: String =
        "surfaceInverseTransparentWarningActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeHover: String =
        "surfaceInverseTransparentNegativeHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeActive: String =
        "surfaceInverseTransparentNegativeActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseTransparentInfoHover: String = "surfaceInverseTransparentInfoHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseTransparentInfoActive: String = "surfaceInverseTransparentInfoActive"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinor: String = "surfaceInverseAccentMinor"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccent: String = "surfaceInverseTransparentAccent"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfo: String = "surfaceInverseInfo"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveMinor: String = "surfaceInversePositiveMinor"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningMinor: String = "surfaceInverseWarningMinor"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeMinor: String = "surfaceInverseNegativeMinor"

    /**
     * Инвертированный минорный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoMinor: String = "surfaceInverseInfoMinor"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInverseTransparentPositive: String = "surfaceInverseTransparentPositive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentWarning: String = "surfaceInverseTransparentWarning"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegative: String = "surfaceInverseTransparentNegative"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseTransparentInfo: String = "surfaceInverseTransparentInfo"

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
    public val backgroundInversePrimary: String = "backgroundInversePrimary"

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
     * Инвертированный цвет фона паранжи светлый
     */
    public val overlayInverseSoft: String = "overlayInverseSoft"

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public val overlayInverseHard: String = "overlayInverseHard"

    /**
     * light overlay inverse overlayBlur
     */
    public val overlayInverseBlur: String = "overlayInverseBlur"

    /**
     * Основной непрозрачный цвет обводки
     */
    public val outlineDefaultSolidPrimaryHover: String = "outlineDefaultSolidPrimaryHover"

    /**
     * Основной непрозрачный цвет обводки
     */
    public val outlineDefaultSolidPrimaryActive: String = "outlineDefaultSolidPrimaryActive"

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidSecondaryHover: String = "outlineDefaultSolidSecondaryHover"

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidSecondaryActive: String = "outlineDefaultSolidSecondaryActive"

    /**
     * Третичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidTertiaryHover: String = "outlineDefaultSolidTertiaryHover"

    /**
     * Третичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidTertiaryActive: String = "outlineDefaultSolidTertiaryActive"

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public val outlineDefaultTransparentDefaultHover: String =
        "outlineDefaultTransparentDefaultHover"

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public val outlineDefaultTransparentDefaultActive: String =
        "outlineDefaultTransparentDefaultActive"

    /**
     * Прозрачный цвет обводки по умолчанию
     */
    public val outlineDefaultTransparentDefault: String = "outlineDefaultTransparentDefault"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryHover: String =
        "outlineDefaultTransparentPrimaryHover"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryActive: String =
        "outlineDefaultTransparentPrimaryActive"

    /**
     * Вторичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentSecondaryHover: String =
        "outlineDefaultTransparentSecondaryHover"

    /**
     * Вторичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentSecondaryActive: String =
        "outlineDefaultTransparentSecondaryActive"

    /**
     * Третичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentTertiaryHover: String =
        "outlineDefaultTransparentTertiaryHover"

    /**
     * Третичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentTertiaryActive: String =
        "outlineDefaultTransparentTertiaryActive"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearHover: String = "outlineDefaultClearHover"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearActive: String = "outlineDefaultClearActive"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentHover: String = "outlineDefaultAccentHover"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentActive: String = "outlineDefaultAccentActive"

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public val outlineDefaultAccentMinorHover: String = "outlineDefaultAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public val outlineDefaultAccentMinorActive: String = "outlineDefaultAccentMinorActive"

    /**
     * Прозрачный акцентный цвет обводки
     */
    public val outlineDefaultTransparentAccentHover: String = "outlineDefaultTransparentAccentHover"

    /**
     * Прозрачный акцентный цвет обводки
     */
    public val outlineDefaultTransparentAccentActive: String =
        "outlineDefaultTransparentAccentActive"

    /**
     * Промо цвет обводки
     */
    public val outlineDefaultPromoHover: String = "outlineDefaultPromoHover"

    /**
     * Промо цвет обводки
     */
    public val outlineDefaultPromoActive: String = "outlineDefaultPromoActive"

    /**
     * Промо цвет обводки
     */
    public val outlineDefaultPromo: String = "outlineDefaultPromo"

    /**
     * Минорный промо цвет обводки
     */
    public val outlineDefaultPromoMinorHover: String = "outlineDefaultPromoMinorHover"

    /**
     * Минорный промо цвет обводки
     */
    public val outlineDefaultPromoMinorActive: String = "outlineDefaultPromoMinorActive"

    /**
     * Минорный промо цвет обводки
     */
    public val outlineDefaultPromoMinor: String = "outlineDefaultPromoMinor"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveHover: String = "outlineDefaultPositiveHover"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveActive: String = "outlineDefaultPositiveActive"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningHover: String = "outlineDefaultWarningHover"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningActive: String = "outlineDefaultWarningActive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeHover: String = "outlineDefaultNegativeHover"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeActive: String = "outlineDefaultNegativeActive"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoHover: String = "outlineDefaultInfoHover"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoActive: String = "outlineDefaultInfoActive"

    /**
     * Минорный цвет обводки успех
     */
    public val outlineDefaultPositiveMinorHover: String = "outlineDefaultPositiveMinorHover"

    /**
     * Минорный цвет обводки успех
     */
    public val outlineDefaultPositiveMinorActive: String = "outlineDefaultPositiveMinorActive"

    /**
     * Минорный цвет обводки предупреждение
     */
    public val outlineDefaultWarningMinorHover: String = "outlineDefaultWarningMinorHover"

    /**
     * Минорный цвет обводки предупреждение
     */
    public val outlineDefaultWarningMinorActive: String = "outlineDefaultWarningMinorActive"

    /**
     * Минорный цвет обводки ошибка
     */
    public val outlineDefaultNegativeMinorHover: String = "outlineDefaultNegativeMinorHover"

    /**
     * Минорный цвет обводки ошибка
     */
    public val outlineDefaultNegativeMinorActive: String = "outlineDefaultNegativeMinorActive"

    /**
     * Минорный цвет обводки информация
     */
    public val outlineDefaultInfoMinorHover: String = "outlineDefaultInfoMinorHover"

    /**
     * Минорный цвет обводки информация
     */
    public val outlineDefaultInfoMinorActive: String = "outlineDefaultInfoMinorActive"

    /**
     * Прозрачный цвет обводки успех
     */
    public val outlineDefaultTransparentPositiveHover: String =
        "outlineDefaultTransparentPositiveHover"

    /**
     * Прозрачный цвет обводки успех
     */
    public val outlineDefaultTransparentPositiveActive: String =
        "outlineDefaultTransparentPositiveActive"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentWarningHover: String =
        "outlineDefaultTransparentWarningHover"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentWarningActive: String =
        "outlineDefaultTransparentWarningActive"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentNegativeHover: String =
        "outlineDefaultTransparentNegativeHover"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentNegativeActive: String =
        "outlineDefaultTransparentNegativeActive"

    /**
     * Прозрачный цвет обводки информация
     */
    public val outlineDefaultTransparentInfoHover: String = "outlineDefaultTransparentInfoHover"

    /**
     * Прозрачный цвет обводки информация
     */
    public val outlineDefaultTransparentInfoActive: String = "outlineDefaultTransparentInfoActive"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClear: String = "outlineDefaultClear"

    /**
     * Основной непрозрачный цвет обводки
     */
    public val outlineDefaultSolidPrimary: String = "outlineDefaultSolidPrimary"

    /**
     * Третичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidTertiary: String = "outlineDefaultSolidTertiary"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccent: String = "outlineDefaultAccent"

    /**
     * Акцентный минорный непрозрачный цвет обводки
     */
    public val outlineDefaultAccentMinor: String = "outlineDefaultAccentMinor"

    /**
     * Прозрачный акцентный цвет обводки
     */
    public val outlineDefaultTransparentAccent: String = "outlineDefaultTransparentAccent"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarning: String = "outlineDefaultWarning"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositive: String = "outlineDefaultPositive"

    /**
     * Прозрачный цвет обводки успех
     */
    public val outlineDefaultTransparentPositive: String = "outlineDefaultTransparentPositive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegative: String = "outlineDefaultNegative"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfo: String = "outlineDefaultInfo"

    /**
     * Минорный цвет обводки успех
     */
    public val outlineDefaultPositiveMinor: String = "outlineDefaultPositiveMinor"

    /**
     * Минорный цвет обводки предупреждение
     */
    public val outlineDefaultWarningMinor: String = "outlineDefaultWarningMinor"

    /**
     * Минорный цвет обводки ошибка
     */
    public val outlineDefaultNegativeMinor: String = "outlineDefaultNegativeMinor"

    /**
     * Минорный цвет обводки информация
     */
    public val outlineDefaultInfoMinor: String = "outlineDefaultInfoMinor"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentWarning: String = "outlineDefaultTransparentWarning"

    /**
     * Прозрачный цвет обводки предупреждение
     */
    public val outlineDefaultTransparentNegative: String = "outlineDefaultTransparentNegative"

    /**
     * Прозрачный цвет обводки информация
     */
    public val outlineDefaultTransparentInfo: String = "outlineDefaultTransparentInfo"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimary: String = "outlineDefaultTransparentPrimary"

    /**
     * Вторичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentSecondary: String = "outlineDefaultTransparentSecondary"

    /**
     * Третичный прозрачный цвет обводки
     */
    public val outlineDefaultTransparentTertiary: String = "outlineDefaultTransparentTertiary"

    /**
     * Вторичный непрозрачный цвет обводки
     */
    public val outlineDefaultSolidSecondary: String = "outlineDefaultSolidSecondary"

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidPrimaryHover: String = "outlineOnDarkSolidPrimaryHover"

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidPrimaryActive: String = "outlineOnDarkSolidPrimaryActive"

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidSecondaryHover: String = "outlineOnDarkSolidSecondaryHover"

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidSecondaryActive: String = "outlineOnDarkSolidSecondaryActive"

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidTertiaryHover: String = "outlineOnDarkSolidTertiaryHover"

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidTertiaryActive: String = "outlineOnDarkSolidTertiaryActive"

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public val outlineOnDarkTransparentDefaultHover: String = "outlineOnDarkTransparentDefaultHover"

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public val outlineOnDarkTransparentDefaultActive: String =
        "outlineOnDarkTransparentDefaultActive"

    /**
     * Прозрачный цвет обводки по умолчанию на темном фоне
     */
    public val outlineOnDarkTransparentDefault: String = "outlineOnDarkTransparentDefault"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryHover: String = "outlineOnDarkTransparentPrimaryHover"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryActive: String =
        "outlineOnDarkTransparentPrimaryActive"

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentSecondaryHover: String =
        "outlineOnDarkTransparentSecondaryHover"

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentSecondaryActive: String =
        "outlineOnDarkTransparentSecondaryActive"

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentTertiaryHover: String =
        "outlineOnDarkTransparentTertiaryHover"

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentTertiaryActive: String =
        "outlineOnDarkTransparentTertiaryActive"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearHover: String = "outlineOnDarkClearHover"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearActive: String = "outlineOnDarkClearActive"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentHover: String = "outlineOnDarkAccentHover"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentActive: String = "outlineOnDarkAccentActive"

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentMinorHover: String = "outlineOnDarkAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentMinorActive: String = "outlineOnDarkAccentMinorActive"

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentAccentHover: String = "outlineOnDarkTransparentAccentHover"

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentAccentActive: String = "outlineOnDarkTransparentAccentActive"

    /**
     * Промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromoHover: String = "outlineOnDarkPromoHover"

    /**
     * Промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromoActive: String = "outlineOnDarkPromoActive"

    /**
     * Промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromo: String = "outlineOnDarkPromo"

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromoMinorHover: String = "outlineOnDarkPromoMinorHover"

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromoMinorActive: String = "outlineOnDarkPromoMinorActive"

    /**
     * Минорный промо цвет обводки на темном фоне
     */
    public val outlineOnDarkPromoMinor: String = "outlineOnDarkPromoMinor"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveHover: String = "outlineOnDarkPositiveHover"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveActive: String = "outlineOnDarkPositiveActive"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningHover: String = "outlineOnDarkWarningHover"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningActive: String = "outlineOnDarkWarningActive"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeHover: String = "outlineOnDarkNegativeHover"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeActive: String = "outlineOnDarkNegativeActive"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoHover: String = "outlineOnDarkInfoHover"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoActive: String = "outlineOnDarkInfoActive"

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveMinorHover: String = "outlineOnDarkPositiveMinorHover"

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveMinorActive: String = "outlineOnDarkPositiveMinorActive"

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningMinorHover: String = "outlineOnDarkWarningMinorHover"

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningMinorActive: String = "outlineOnDarkWarningMinorActive"

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeMinorHover: String = "outlineOnDarkNegativeMinorHover"

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeMinorActive: String = "outlineOnDarkNegativeMinorActive"

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoMinorHover: String = "outlineOnDarkInfoMinorHover"

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoMinorActive: String = "outlineOnDarkInfoMinorActive"

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkTransparentPositiveHover: String =
        "outlineOnDarkTransparentPositiveHover"

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkTransparentPositiveActive: String =
        "outlineOnDarkTransparentPositiveActive"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentWarningHover: String = "outlineOnDarkTransparentWarningHover"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentWarningActive: String =
        "outlineOnDarkTransparentWarningActive"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentNegativeHover: String =
        "outlineOnDarkTransparentNegativeHover"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentNegativeActive: String =
        "outlineOnDarkTransparentNegativeActive"

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkTransparentInfoHover: String = "outlineOnDarkTransparentInfoHover"

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkTransparentInfoActive: String = "outlineOnDarkTransparentInfoActive"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClear: String = "outlineOnDarkClear"

    /**
     * Основной непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidPrimary: String = "outlineOnDarkSolidPrimary"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccent: String = "outlineOnDarkAccent"

    /**
     * Акцентный минорный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentMinor: String = "outlineOnDarkAccentMinor"

    /**
     * Прозрачный акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentAccent: String = "outlineOnDarkTransparentAccent"

    /**
     * Прозрачный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkTransparentPositive: String = "outlineOnDarkTransparentPositive"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositive: String = "outlineOnDarkPositive"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarning: String = "outlineOnDarkWarning"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegative: String = "outlineOnDarkNegative"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfo: String = "outlineOnDarkInfo"

    /**
     * Минорный цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveMinor: String = "outlineOnDarkPositiveMinor"

    /**
     * Минорный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningMinor: String = "outlineOnDarkWarningMinor"

    /**
     * Минорный цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeMinor: String = "outlineOnDarkNegativeMinor"

    /**
     * Минорный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoMinor: String = "outlineOnDarkInfoMinor"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentWarning: String = "outlineOnDarkTransparentWarning"

    /**
     * Прозрачный цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkTransparentNegative: String = "outlineOnDarkTransparentNegative"

    /**
     * Прозрачный цвет обводки информация на темном фоне
     */
    public val outlineOnDarkTransparentInfo: String = "outlineOnDarkTransparentInfo"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimary: String = "outlineOnDarkTransparentPrimary"

    /**
     * Вторичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentSecondary: String = "outlineOnDarkTransparentSecondary"

    /**
     * Третичный прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentTertiary: String = "outlineOnDarkTransparentTertiary"

    /**
     * Вторичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidSecondary: String = "outlineOnDarkSolidSecondary"

    /**
     * Третичный непрозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkSolidTertiary: String = "outlineOnDarkSolidTertiary"

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidPrimaryHover: String = "outlineOnLightSolidPrimaryHover"

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidPrimaryActive: String = "outlineOnLightSolidPrimaryActive"

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidSecondaryHover: String = "outlineOnLightSolidSecondaryHover"

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidSecondaryActive: String = "outlineOnLightSolidSecondaryActive"

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidTertiaryHover: String = "outlineOnLightSolidTertiaryHover"

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidTertiaryActive: String = "outlineOnLightSolidTertiaryActive"

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public val outlineOnLightTransparentDefaultHover: String =
        "outlineOnLightTransparentDefaultHover"

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public val outlineOnLightTransparentDefaultActive: String =
        "outlineOnLightTransparentDefaultActive"

    /**
     * Прозрачный цвет обводки по умолчанию на светлом фоне
     */
    public val outlineOnLightTransparentDefault: String = "outlineOnLightTransparentDefault"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryHover: String =
        "outlineOnLightTransparentPrimaryHover"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryActive: String =
        "outlineOnLightTransparentPrimaryActive"

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentSecondaryHover: String =
        "outlineOnLightTransparentSecondaryHover"

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentSecondaryActive: String =
        "outlineOnLightTransparentSecondaryActive"

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentTertiaryHover: String =
        "outlineOnLightTransparentTertiaryHover"

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentTertiaryActive: String =
        "outlineOnLightTransparentTertiaryActive"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearHover: String = "outlineOnLightClearHover"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearActive: String = "outlineOnLightClearActive"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentHover: String = "outlineOnLightAccentHover"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentActive: String = "outlineOnLightAccentActive"

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentMinorHover: String = "outlineOnLightAccentMinorHover"

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentMinorActive: String = "outlineOnLightAccentMinorActive"

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentAccentHover: String = "outlineOnLightTransparentAccentHover"

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentAccentActive: String =
        "outlineOnLightTransparentAccentActive"

    /**
     * Промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromoHover: String = "outlineOnLightPromoHover"

    /**
     * Промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromoActive: String = "outlineOnLightPromoActive"

    /**
     * Промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromo: String = "outlineOnLightPromo"

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromoMinorHover: String = "outlineOnLightPromoMinorHover"

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromoMinorActive: String = "outlineOnLightPromoMinorActive"

    /**
     * Минорный промо цвет обводки на светлом фоне
     */
    public val outlineOnLightPromoMinor: String = "outlineOnLightPromoMinor"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveHover: String = "outlineOnLightPositiveHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveActive: String = "outlineOnLightPositiveActive"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningHover: String = "outlineOnLightWarningHover"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningActive: String = "outlineOnLightWarningActive"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeHover: String = "outlineOnLightNegativeHover"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeActive: String = "outlineOnLightNegativeActive"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoHover: String = "outlineOnLightInfoHover"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoActive: String = "outlineOnLightInfoActive"

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveMinorHover: String = "outlineOnLightPositiveMinorHover"

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveMinorActive: String = "outlineOnLightPositiveMinorActive"

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningMinorHover: String = "outlineOnLightWarningMinorHover"

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningMinorActive: String = "outlineOnLightWarningMinorActive"

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeMinorHover: String = "outlineOnLightNegativeMinorHover"

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeMinorActive: String = "outlineOnLightNegativeMinorActive"

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoMinorHover: String = "outlineOnLightInfoMinorHover"

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoMinorActive: String = "outlineOnLightInfoMinorActive"

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightTransparentPositiveHover: String =
        "outlineOnLightTransparentPositiveHover"

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightTransparentPositiveActive: String =
        "outlineOnLightTransparentPositiveActive"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentWarningHover: String =
        "outlineOnLightTransparentWarningHover"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentWarningActive: String =
        "outlineOnLightTransparentWarningActive"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentNegativeHover: String =
        "outlineOnLightTransparentNegativeHover"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentNegativeActive: String =
        "outlineOnLightTransparentNegativeActive"

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightTransparentInfoHover: String = "outlineOnLightTransparentInfoHover"

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightTransparentInfoActive: String = "outlineOnLightTransparentInfoActive"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClear: String = "outlineOnLightClear"

    /**
     * Прозрачный акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentAccent: String = "outlineOnLightTransparentAccent"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositive: String = "outlineOnLightPositive"

    /**
     * Прозрачный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightTransparentPositive: String = "outlineOnLightTransparentPositive"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentWarning: String = "outlineOnLightTransparentWarning"

    /**
     * Прозрачный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightTransparentNegative: String = "outlineOnLightTransparentNegative"

    /**
     * Прозрачный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightTransparentInfo: String = "outlineOnLightTransparentInfo"

    /**
     * Основной непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidPrimary: String = "outlineOnLightSolidPrimary"

    /**
     * Третичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidTertiary: String = "outlineOnLightSolidTertiary"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccent: String = "outlineOnLightAccent"

    /**
     * Акцентный минорный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentMinor: String = "outlineOnLightAccentMinor"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarning: String = "outlineOnLightWarning"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegative: String = "outlineOnLightNegative"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfo: String = "outlineOnLightInfo"

    /**
     * Минорный цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveMinor: String = "outlineOnLightPositiveMinor"

    /**
     * Минорный цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningMinor: String = "outlineOnLightWarningMinor"

    /**
     * Минорный цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeMinor: String = "outlineOnLightNegativeMinor"

    /**
     * Минорный цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoMinor: String = "outlineOnLightInfoMinor"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimary: String = "outlineOnLightTransparentPrimary"

    /**
     * Вторичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentSecondary: String = "outlineOnLightTransparentSecondary"

    /**
     * Третичный прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentTertiary: String = "outlineOnLightTransparentTertiary"

    /**
     * Вторичный непрозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightSolidSecondary: String = "outlineOnLightSolidSecondary"

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public val outlineInverseSolidPrimaryHover: String = "outlineInverseSolidPrimaryHover"

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public val outlineInverseSolidPrimaryActive: String = "outlineInverseSolidPrimaryActive"

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidSecondaryHover: String = "outlineInverseSolidSecondaryHover"

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidSecondaryActive: String = "outlineInverseSolidSecondaryActive"

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidTertiaryHover: String = "outlineInverseSolidTertiaryHover"

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidTertiaryActive: String = "outlineInverseSolidTertiaryActive"

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public val outlineInverseTransparentDefaultHover: String =
        "outlineInverseTransparentDefaultHover"

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public val outlineInverseTransparentDefaultActive: String =
        "outlineInverseTransparentDefaultActive"

    /**
     * Инвертированный прозрачный цвет обводки по умолчанию
     */
    public val outlineInverseTransparentDefault: String = "outlineInverseTransparentDefault"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryHover: String =
        "outlineInverseTransparentPrimaryHover"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryActive: String =
        "outlineInverseTransparentPrimaryActive"

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentSecondaryHover: String =
        "outlineInverseTransparentSecondaryHover"

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentSecondaryActive: String =
        "outlineInverseTransparentSecondaryActive"

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentTertiaryHover: String =
        "outlineInverseTransparentTertiaryHover"

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentTertiaryActive: String =
        "outlineInverseTransparentTertiaryActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearHover: String = "outlineInverseClearHover"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearActive: String = "outlineInverseClearActive"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentHover: String = "outlineInverseAccentHover"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentActive: String = "outlineInverseAccentActive"

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public val outlineInverseAccentMinorHover: String = "outlineInverseAccentMinorHover"

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public val outlineInverseAccentMinorActive: String = "outlineInverseAccentMinorActive"

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public val outlineInverseTransparentAccentHover: String = "outlineInverseTransparentAccentHover"

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public val outlineInverseTransparentAccentActive: String =
        "outlineInverseTransparentAccentActive"

    /**
     * Инвертированный промо цвет обводки
     */
    public val outlineInversePromoHover: String = "outlineInversePromoHover"

    /**
     * Инвертированный промо цвет обводки
     */
    public val outlineInversePromoActive: String = "outlineInversePromoActive"

    /**
     * Инвертированный промо цвет обводки
     */
    public val outlineInversePromo: String = "outlineInversePromo"

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public val outlineInversePromoMinorHover: String = "outlineInversePromoMinorHover"

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public val outlineInversePromoMinorActive: String = "outlineInversePromoMinorActive"

    /**
     * Инвертированный минорный промо цвет обводки
     */
    public val outlineInversePromoMinor: String = "outlineInversePromoMinor"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveHover: String = "outlineInversePositiveHover"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveActive: String = "outlineInversePositiveActive"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningHover: String = "outlineInverseWarningHover"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningActive: String = "outlineInverseWarningActive"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeHover: String = "outlineInverseNegativeHover"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeActive: String = "outlineInverseNegativeActive"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoHover: String = "outlineInverseInfoHover"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoActive: String = "outlineInverseInfoActive"

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public val outlineInversePositiveMinorHover: String = "outlineInversePositiveMinorHover"

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public val outlineInversePositiveMinorActive: String = "outlineInversePositiveMinorActive"

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public val outlineInverseWarningMinorHover: String = "outlineInverseWarningMinorHover"

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public val outlineInverseWarningMinorActive: String = "outlineInverseWarningMinorActive"

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public val outlineInverseNegativeMinorHover: String = "outlineInverseNegativeMinorHover"

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public val outlineInverseNegativeMinorActive: String = "outlineInverseNegativeMinorActive"

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public val outlineInverseInfoMinorHover: String = "outlineInverseInfoMinorHover"

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public val outlineInverseInfoMinorActive: String = "outlineInverseInfoMinorActive"

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public val outlineInverseTransparentPositiveHover: String =
        "outlineInverseTransparentPositiveHover"

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public val outlineInverseTransparentPositiveActive: String =
        "outlineInverseTransparentPositiveActive"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentWarningHover: String =
        "outlineInverseTransparentWarningHover"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentWarningActive: String =
        "outlineInverseTransparentWarningActive"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentNegativeHover: String =
        "outlineInverseTransparentNegativeHover"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentNegativeActive: String =
        "outlineInverseTransparentNegativeActive"

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public val outlineInverseTransparentInfoHover: String = "outlineInverseTransparentInfoHover"

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public val outlineInverseTransparentInfoActive: String = "outlineInverseTransparentInfoActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClear: String = "outlineInverseClear"

    /**
     * Прозрачный инвертированный акцентный цвет обводки
     */
    public val outlineInverseTransparentAccent: String = "outlineInverseTransparentAccent"

    /**
     * Прозрачный инвертированный цвет обводки успех
     */
    public val outlineInverseTransparentPositive: String = "outlineInverseTransparentPositive"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentWarning: String = "outlineInverseTransparentWarning"

    /**
     * Прозрачный инвертированный цвет обводки предупреждение
     */
    public val outlineInverseTransparentNegative: String = "outlineInverseTransparentNegative"

    /**
     * Прозрачный инвертированный цвет обводки информация
     */
    public val outlineInverseTransparentInfo: String = "outlineInverseTransparentInfo"

    /**
     * Инвертированный основной непрозрачный цвет обводки
     */
    public val outlineInverseSolidPrimary: String = "outlineInverseSolidPrimary"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccent: String = "outlineInverseAccent"

    /**
     * Инвертированный акцентный минорный непрозрачный цвет обводки
     */
    public val outlineInverseAccentMinor: String = "outlineInverseAccentMinor"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositive: String = "outlineInversePositive"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarning: String = "outlineInverseWarning"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegative: String = "outlineInverseNegative"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfo: String = "outlineInverseInfo"

    /**
     * Инвертированный минорный цвет обводки успех
     */
    public val outlineInversePositiveMinor: String = "outlineInversePositiveMinor"

    /**
     * Инвертированный минорный цвет обводки предупреждение
     */
    public val outlineInverseWarningMinor: String = "outlineInverseWarningMinor"

    /**
     * Инвертированный минорный цвет обводки ошибка
     */
    public val outlineInverseNegativeMinor: String = "outlineInverseNegativeMinor"

    /**
     * Инвертированный минорный цвет обводки информация
     */
    public val outlineInverseInfoMinor: String = "outlineInverseInfoMinor"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimary: String = "outlineInverseTransparentPrimary"

    /**
     * Инвертированный вторичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentSecondary: String = "outlineInverseTransparentSecondary"

    /**
     * Инвертированный третичный прозрачный цвет обводки
     */
    public val outlineInverseTransparentTertiary: String = "outlineInverseTransparentTertiary"

    /**
     * Инвертированный вторичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidSecondary: String = "outlineInverseSolidSecondary"

    /**
     * Инвертированный третичный непрозрачный цвет обводки
     */
    public val outlineInverseSolidTertiary: String = "outlineInverseSolidTertiary"

    /**
     * Переопределяет аттрибут цвета.
     */
    public infix fun String.overrideBy(color: Color) {
        _overrideMap[this] = color
    }
}

internal val LocalSddsServColors: ProvidableCompositionLocal<SddsServColors> =
    staticCompositionLocalOf {
        lightSddsServColors()
    }

@Suppress("LongMethod")
internal fun SddsServColors.updateColorsFrom(other: SddsServColors) {
    textDefaultPrimaryHover = other.textDefaultPrimaryHover
    textDefaultPrimaryActive = other.textDefaultPrimaryActive
    textDefaultPrimary = other.textDefaultPrimary
    textDefaultPrimaryBrightness = other.textDefaultPrimaryBrightness
    textDefaultSecondaryHover = other.textDefaultSecondaryHover
    textDefaultSecondaryActive = other.textDefaultSecondaryActive
    textDefaultSecondary = other.textDefaultSecondary
    textDefaultTertiaryHover = other.textDefaultTertiaryHover
    textDefaultTertiaryActive = other.textDefaultTertiaryActive
    textDefaultTertiary = other.textDefaultTertiary
    textDefaultParagraphHover = other.textDefaultParagraphHover
    textDefaultParagraphActive = other.textDefaultParagraphActive
    textDefaultParagraph = other.textDefaultParagraph
    textDefaultAccentHover = other.textDefaultAccentHover
    textDefaultAccentActive = other.textDefaultAccentActive
    textDefaultAccent = other.textDefaultAccent
    textDefaultAccentMinorHover = other.textDefaultAccentMinorHover
    textDefaultAccentMinorActive = other.textDefaultAccentMinorActive
    textDefaultPromoHover = other.textDefaultPromoHover
    textDefaultPromoActive = other.textDefaultPromoActive
    textDefaultPromo = other.textDefaultPromo
    textDefaultPromoMinorHover = other.textDefaultPromoMinorHover
    textDefaultPromoMinorActive = other.textDefaultPromoMinorActive
    textDefaultPromoMinor = other.textDefaultPromoMinor
    textDefaultPositiveHover = other.textDefaultPositiveHover
    textDefaultPositiveActive = other.textDefaultPositiveActive
    textDefaultPositive = other.textDefaultPositive
    textDefaultWarningHover = other.textDefaultWarningHover
    textDefaultWarningActive = other.textDefaultWarningActive
    textDefaultWarning = other.textDefaultWarning
    textDefaultNegativeHover = other.textDefaultNegativeHover
    textDefaultNegativeActive = other.textDefaultNegativeActive
    textDefaultNegative = other.textDefaultNegative
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
    textDefaultInfo = other.textDefaultInfo
    textDefaultPositiveMinor = other.textDefaultPositiveMinor
    textDefaultWarningMinor = other.textDefaultWarningMinor
    textDefaultNegativeMinor = other.textDefaultNegativeMinor
    textDefaultInfoMinor = other.textDefaultInfoMinor
    textOnDarkPrimaryHover = other.textOnDarkPrimaryHover
    textOnDarkPrimaryActive = other.textOnDarkPrimaryActive
    textOnDarkPrimary = other.textOnDarkPrimary
    textOnDarkPrimaryBrightness = other.textOnDarkPrimaryBrightness
    textOnDarkSecondaryHover = other.textOnDarkSecondaryHover
    textOnDarkSecondaryActive = other.textOnDarkSecondaryActive
    textOnDarkSecondary = other.textOnDarkSecondary
    textOnDarkTertiaryHover = other.textOnDarkTertiaryHover
    textOnDarkTertiaryActive = other.textOnDarkTertiaryActive
    textOnDarkTertiary = other.textOnDarkTertiary
    textOnDarkParagraphHover = other.textOnDarkParagraphHover
    textOnDarkParagraphActive = other.textOnDarkParagraphActive
    textOnDarkParagraph = other.textOnDarkParagraph
    textOnDarkAccentHover = other.textOnDarkAccentHover
    textOnDarkAccentActive = other.textOnDarkAccentActive
    textOnDarkAccent = other.textOnDarkAccent
    textOnDarkAccentMinorHover = other.textOnDarkAccentMinorHover
    textOnDarkAccentMinorActive = other.textOnDarkAccentMinorActive
    textOnDarkPromoHover = other.textOnDarkPromoHover
    textOnDarkPromoActive = other.textOnDarkPromoActive
    textOnDarkPromo = other.textOnDarkPromo
    textOnDarkPromoMinorHover = other.textOnDarkPromoMinorHover
    textOnDarkPromoMinorActive = other.textOnDarkPromoMinorActive
    textOnDarkPromoMinor = other.textOnDarkPromoMinor
    textOnDarkPositiveHover = other.textOnDarkPositiveHover
    textOnDarkPositiveActive = other.textOnDarkPositiveActive
    textOnDarkPositive = other.textOnDarkPositive
    textOnDarkWarningHover = other.textOnDarkWarningHover
    textOnDarkWarningActive = other.textOnDarkWarningActive
    textOnDarkWarning = other.textOnDarkWarning
    textOnDarkNegativeHover = other.textOnDarkNegativeHover
    textOnDarkNegativeActive = other.textOnDarkNegativeActive
    textOnDarkNegative = other.textOnDarkNegative
    textOnDarkInfoHover = other.textOnDarkInfoHover
    textOnDarkInfoActive = other.textOnDarkInfoActive
    textOnDarkPositiveMinorHover = other.textOnDarkPositiveMinorHover
    textOnDarkPositiveMinorActive = other.textOnDarkPositiveMinorActive
    textOnDarkWarningMinorHover = other.textOnDarkWarningMinorHover
    textOnDarkWarningMinorActive = other.textOnDarkWarningMinorActive
    textOnDarkNegativeMinorHover = other.textOnDarkNegativeMinorHover
    textOnDarkNegativeMinorActive = other.textOnDarkNegativeMinorActive
    textOnDarkInfoMinorHover = other.textOnDarkInfoMinorHover
    textOnDarkInfoMinorActive = other.textOnDarkInfoMinorActive
    textOnDarkAccentMinor = other.textOnDarkAccentMinor
    textOnDarkInfo = other.textOnDarkInfo
    textOnDarkPositiveMinor = other.textOnDarkPositiveMinor
    textOnDarkWarningMinor = other.textOnDarkWarningMinor
    textOnDarkNegativeMinor = other.textOnDarkNegativeMinor
    textOnDarkInfoMinor = other.textOnDarkInfoMinor
    textOnLightPrimaryHover = other.textOnLightPrimaryHover
    textOnLightPrimaryActive = other.textOnLightPrimaryActive
    textOnLightPrimary = other.textOnLightPrimary
    textOnLightPrimaryBrightness = other.textOnLightPrimaryBrightness
    textOnLightSecondaryHover = other.textOnLightSecondaryHover
    textOnLightSecondaryActive = other.textOnLightSecondaryActive
    textOnLightSecondary = other.textOnLightSecondary
    textOnLightTertiaryHover = other.textOnLightTertiaryHover
    textOnLightTertiaryActive = other.textOnLightTertiaryActive
    textOnLightTertiary = other.textOnLightTertiary
    textOnLightParagraphHover = other.textOnLightParagraphHover
    textOnLightParagraphActive = other.textOnLightParagraphActive
    textOnLightParagraph = other.textOnLightParagraph
    textOnLightAccentHover = other.textOnLightAccentHover
    textOnLightAccentActive = other.textOnLightAccentActive
    textOnLightAccent = other.textOnLightAccent
    textOnLightAccentMinorHover = other.textOnLightAccentMinorHover
    textOnLightAccentMinorActive = other.textOnLightAccentMinorActive
    textOnLightPromoHover = other.textOnLightPromoHover
    textOnLightPromoActive = other.textOnLightPromoActive
    textOnLightPromo = other.textOnLightPromo
    textOnLightPromoMinorHover = other.textOnLightPromoMinorHover
    textOnLightPromoMinorActive = other.textOnLightPromoMinorActive
    textOnLightPromoMinor = other.textOnLightPromoMinor
    textOnLightPositiveHover = other.textOnLightPositiveHover
    textOnLightPositiveActive = other.textOnLightPositiveActive
    textOnLightPositive = other.textOnLightPositive
    textOnLightWarningHover = other.textOnLightWarningHover
    textOnLightWarningActive = other.textOnLightWarningActive
    textOnLightWarning = other.textOnLightWarning
    textOnLightNegativeHover = other.textOnLightNegativeHover
    textOnLightNegativeActive = other.textOnLightNegativeActive
    textOnLightNegative = other.textOnLightNegative
    textOnLightInfoHover = other.textOnLightInfoHover
    textOnLightInfoActive = other.textOnLightInfoActive
    textOnLightPositiveMinorHover = other.textOnLightPositiveMinorHover
    textOnLightPositiveMinorActive = other.textOnLightPositiveMinorActive
    textOnLightWarningMinorHover = other.textOnLightWarningMinorHover
    textOnLightWarningMinorActive = other.textOnLightWarningMinorActive
    textOnLightNegativeMinorHover = other.textOnLightNegativeMinorHover
    textOnLightNegativeMinorActive = other.textOnLightNegativeMinorActive
    textOnLightInfoMinorHover = other.textOnLightInfoMinorHover
    textOnLightInfoMinorActive = other.textOnLightInfoMinorActive
    textOnLightInfo = other.textOnLightInfo
    textOnLightWarningMinor = other.textOnLightWarningMinor
    textOnLightPositiveMinor = other.textOnLightPositiveMinor
    textOnLightAccentMinor = other.textOnLightAccentMinor
    textOnLightNegativeMinor = other.textOnLightNegativeMinor
    textOnLightInfoMinor = other.textOnLightInfoMinor
    textInversePrimaryHover = other.textInversePrimaryHover
    textInversePrimaryActive = other.textInversePrimaryActive
    textInversePrimary = other.textInversePrimary
    textInversePrimaryBrightness = other.textInversePrimaryBrightness
    textInverseSecondaryHover = other.textInverseSecondaryHover
    textInverseSecondaryActive = other.textInverseSecondaryActive
    textInverseSecondary = other.textInverseSecondary
    textInverseTertiaryHover = other.textInverseTertiaryHover
    textInverseTertiaryActive = other.textInverseTertiaryActive
    textInverseTertiary = other.textInverseTertiary
    textInverseParagraphHover = other.textInverseParagraphHover
    textInverseParagraphActive = other.textInverseParagraphActive
    textInverseParagraph = other.textInverseParagraph
    textInverseAccentHover = other.textInverseAccentHover
    textInverseAccentActive = other.textInverseAccentActive
    textInverseAccent = other.textInverseAccent
    textInverseAccentMinorHover = other.textInverseAccentMinorHover
    textInverseAccentMinorActive = other.textInverseAccentMinorActive
    textInversePromoHover = other.textInversePromoHover
    textInversePromoActive = other.textInversePromoActive
    textInversePromo = other.textInversePromo
    textInversePromoMinorHover = other.textInversePromoMinorHover
    textInversePromoMinorActive = other.textInversePromoMinorActive
    textInversePromoMinor = other.textInversePromoMinor
    textInversePositiveHover = other.textInversePositiveHover
    textInversePositiveActive = other.textInversePositiveActive
    textInversePositive = other.textInversePositive
    textInverseWarningHover = other.textInverseWarningHover
    textInverseWarningActive = other.textInverseWarningActive
    textInverseWarning = other.textInverseWarning
    textInverseNegativeHover = other.textInverseNegativeHover
    textInverseNegativeActive = other.textInverseNegativeActive
    textInverseNegative = other.textInverseNegative
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
    textInverseAccentMinor = other.textInverseAccentMinor
    textInverseInfo = other.textInverseInfo
    textInversePositiveMinor = other.textInversePositiveMinor
    textInverseWarningMinor = other.textInverseWarningMinor
    textInverseNegativeMinor = other.textInverseNegativeMinor
    textInverseInfoMinor = other.textInverseInfoMinor
    surfaceDefaultSolidPrimaryHover = other.surfaceDefaultSolidPrimaryHover
    surfaceDefaultSolidPrimaryActive = other.surfaceDefaultSolidPrimaryActive
    surfaceDefaultSolidPrimary = other.surfaceDefaultSolidPrimary
    surfaceDefaultSolidPrimaryBrightness = other.surfaceDefaultSolidPrimaryBrightness
    surfaceDefaultSolidSecondaryHover = other.surfaceDefaultSolidSecondaryHover
    surfaceDefaultSolidSecondaryActive = other.surfaceDefaultSolidSecondaryActive
    surfaceDefaultSolidSecondary = other.surfaceDefaultSolidSecondary
    surfaceDefaultSolidTertiaryHover = other.surfaceDefaultSolidTertiaryHover
    surfaceDefaultSolidTertiaryActive = other.surfaceDefaultSolidTertiaryActive
    surfaceDefaultSolidTertiary = other.surfaceDefaultSolidTertiary
    surfaceDefaultSolidCardHover = other.surfaceDefaultSolidCardHover
    surfaceDefaultSolidCardActive = other.surfaceDefaultSolidCardActive
    surfaceDefaultSolidCard = other.surfaceDefaultSolidCard
    surfaceDefaultSolidCardBrightness = other.surfaceDefaultSolidCardBrightness
    surfaceDefaultSolidDefaultHover = other.surfaceDefaultSolidDefaultHover
    surfaceDefaultSolidDefaultActive = other.surfaceDefaultSolidDefaultActive
    surfaceDefaultSolidDefault = other.surfaceDefaultSolidDefault
    surfaceDefaultTransparentPrimaryHover = other.surfaceDefaultTransparentPrimaryHover
    surfaceDefaultTransparentPrimaryActive = other.surfaceDefaultTransparentPrimaryActive
    surfaceDefaultTransparentSecondaryHover = other.surfaceDefaultTransparentSecondaryHover
    surfaceDefaultTransparentSecondaryActive = other.surfaceDefaultTransparentSecondaryActive
    surfaceDefaultTransparentSecondary = other.surfaceDefaultTransparentSecondary
    surfaceDefaultTransparentTertiaryHover = other.surfaceDefaultTransparentTertiaryHover
    surfaceDefaultTransparentTertiaryActive = other.surfaceDefaultTransparentTertiaryActive
    surfaceDefaultTransparentTertiary = other.surfaceDefaultTransparentTertiary
    surfaceDefaultTransparentDeepHover = other.surfaceDefaultTransparentDeepHover
    surfaceDefaultTransparentDeepActive = other.surfaceDefaultTransparentDeepActive
    surfaceDefaultTransparentDeep = other.surfaceDefaultTransparentDeep
    surfaceDefaultTransparentCardHover = other.surfaceDefaultTransparentCardHover
    surfaceDefaultTransparentCardActive = other.surfaceDefaultTransparentCardActive
    surfaceDefaultTransparentCard = other.surfaceDefaultTransparentCard
    surfaceDefaultTransparentCardBrightness = other.surfaceDefaultTransparentCardBrightness
    surfaceDefaultClearHover = other.surfaceDefaultClearHover
    surfaceDefaultClearActive = other.surfaceDefaultClearActive
    surfaceDefaultClear = other.surfaceDefaultClear
    surfaceDefaultAccentHover = other.surfaceDefaultAccentHover
    surfaceDefaultAccentActive = other.surfaceDefaultAccentActive
    surfaceDefaultAccent = other.surfaceDefaultAccent
    surfaceDefaultAccentMinorHover = other.surfaceDefaultAccentMinorHover
    surfaceDefaultAccentMinorActive = other.surfaceDefaultAccentMinorActive
    surfaceDefaultTransparentAccentHover = other.surfaceDefaultTransparentAccentHover
    surfaceDefaultTransparentAccentActive = other.surfaceDefaultTransparentAccentActive
    surfaceDefaultTransparentAccent = other.surfaceDefaultTransparentAccent
    surfaceDefaultPromoHover = other.surfaceDefaultPromoHover
    surfaceDefaultPromoActive = other.surfaceDefaultPromoActive
    surfaceDefaultPromo = other.surfaceDefaultPromo
    surfaceDefaultPromoMinorHover = other.surfaceDefaultPromoMinorHover
    surfaceDefaultPromoMinorActive = other.surfaceDefaultPromoMinorActive
    surfaceDefaultPromoMinor = other.surfaceDefaultPromoMinor
    surfaceDefaultTransparentPromoHover = other.surfaceDefaultTransparentPromoHover
    surfaceDefaultTransparentPromoActive = other.surfaceDefaultTransparentPromoActive
    surfaceDefaultTransparentPromo = other.surfaceDefaultTransparentPromo
    surfaceDefaultPositiveHover = other.surfaceDefaultPositiveHover
    surfaceDefaultPositiveActive = other.surfaceDefaultPositiveActive
    surfaceDefaultPositive = other.surfaceDefaultPositive
    surfaceDefaultWarningHover = other.surfaceDefaultWarningHover
    surfaceDefaultWarningActive = other.surfaceDefaultWarningActive
    surfaceDefaultWarning = other.surfaceDefaultWarning
    surfaceDefaultNegativeHover = other.surfaceDefaultNegativeHover
    surfaceDefaultNegativeActive = other.surfaceDefaultNegativeActive
    surfaceDefaultNegative = other.surfaceDefaultNegative
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
    surfaceDefaultInfo = other.surfaceDefaultInfo
    surfaceDefaultPositiveMinor = other.surfaceDefaultPositiveMinor
    surfaceDefaultWarningMinor = other.surfaceDefaultWarningMinor
    surfaceDefaultNegativeMinor = other.surfaceDefaultNegativeMinor
    surfaceDefaultInfoMinor = other.surfaceDefaultInfoMinor
    surfaceDefaultTransparentPositive = other.surfaceDefaultTransparentPositive
    surfaceDefaultTransparentWarning = other.surfaceDefaultTransparentWarning
    surfaceDefaultTransparentNegative = other.surfaceDefaultTransparentNegative
    surfaceDefaultTransparentInfo = other.surfaceDefaultTransparentInfo
    surfaceDefaultTransparentPrimary = other.surfaceDefaultTransparentPrimary
    surfaceOnDarkSolidPrimaryHover = other.surfaceOnDarkSolidPrimaryHover
    surfaceOnDarkSolidPrimaryActive = other.surfaceOnDarkSolidPrimaryActive
    surfaceOnDarkSolidPrimary = other.surfaceOnDarkSolidPrimary
    surfaceOnDarkSolidPrimaryBrightness = other.surfaceOnDarkSolidPrimaryBrightness
    surfaceOnDarkSolidSecondaryHover = other.surfaceOnDarkSolidSecondaryHover
    surfaceOnDarkSolidSecondaryActive = other.surfaceOnDarkSolidSecondaryActive
    surfaceOnDarkSolidSecondary = other.surfaceOnDarkSolidSecondary
    surfaceOnDarkSolidTertiaryHover = other.surfaceOnDarkSolidTertiaryHover
    surfaceOnDarkSolidTertiaryActive = other.surfaceOnDarkSolidTertiaryActive
    surfaceOnDarkSolidTertiary = other.surfaceOnDarkSolidTertiary
    surfaceOnDarkSolidCardHover = other.surfaceOnDarkSolidCardHover
    surfaceOnDarkSolidCardActive = other.surfaceOnDarkSolidCardActive
    surfaceOnDarkSolidCard = other.surfaceOnDarkSolidCard
    surfaceOnDarkSolidCardBrightness = other.surfaceOnDarkSolidCardBrightness
    surfaceOnDarkSolidDefaultHover = other.surfaceOnDarkSolidDefaultHover
    surfaceOnDarkSolidDefaultActive = other.surfaceOnDarkSolidDefaultActive
    surfaceOnDarkSolidDefault = other.surfaceOnDarkSolidDefault
    surfaceOnDarkTransparentPrimaryHover = other.surfaceOnDarkTransparentPrimaryHover
    surfaceOnDarkTransparentPrimaryActive = other.surfaceOnDarkTransparentPrimaryActive
    surfaceOnDarkTransparentPrimary = other.surfaceOnDarkTransparentPrimary
    surfaceOnDarkTransparentSecondaryHover = other.surfaceOnDarkTransparentSecondaryHover
    surfaceOnDarkTransparentSecondaryActive = other.surfaceOnDarkTransparentSecondaryActive
    surfaceOnDarkTransparentSecondary = other.surfaceOnDarkTransparentSecondary
    surfaceOnDarkTransparentTertiaryHover = other.surfaceOnDarkTransparentTertiaryHover
    surfaceOnDarkTransparentTertiaryActive = other.surfaceOnDarkTransparentTertiaryActive
    surfaceOnDarkTransparentTertiary = other.surfaceOnDarkTransparentTertiary
    surfaceOnDarkTransparentDeepHover = other.surfaceOnDarkTransparentDeepHover
    surfaceOnDarkTransparentDeepActive = other.surfaceOnDarkTransparentDeepActive
    surfaceOnDarkTransparentDeep = other.surfaceOnDarkTransparentDeep
    surfaceOnDarkTransparentCardHover = other.surfaceOnDarkTransparentCardHover
    surfaceOnDarkTransparentCardActive = other.surfaceOnDarkTransparentCardActive
    surfaceOnDarkTransparentCard = other.surfaceOnDarkTransparentCard
    surfaceOnDarkTransparentCardBrightness = other.surfaceOnDarkTransparentCardBrightness
    surfaceOnDarkClearHover = other.surfaceOnDarkClearHover
    surfaceOnDarkClearActive = other.surfaceOnDarkClearActive
    surfaceOnDarkClear = other.surfaceOnDarkClear
    surfaceOnDarkAccentHover = other.surfaceOnDarkAccentHover
    surfaceOnDarkAccentActive = other.surfaceOnDarkAccentActive
    surfaceOnDarkAccent = other.surfaceOnDarkAccent
    surfaceOnDarkAccentMinorHover = other.surfaceOnDarkAccentMinorHover
    surfaceOnDarkAccentMinorActive = other.surfaceOnDarkAccentMinorActive
    surfaceOnDarkTransparentAccentHover = other.surfaceOnDarkTransparentAccentHover
    surfaceOnDarkTransparentAccentActive = other.surfaceOnDarkTransparentAccentActive
    surfaceOnDarkPromoHover = other.surfaceOnDarkPromoHover
    surfaceOnDarkPromoActive = other.surfaceOnDarkPromoActive
    surfaceOnDarkPromo = other.surfaceOnDarkPromo
    surfaceOnDarkPromoMinorHover = other.surfaceOnDarkPromoMinorHover
    surfaceOnDarkPromoMinorActive = other.surfaceOnDarkPromoMinorActive
    surfaceOnDarkPromoMinor = other.surfaceOnDarkPromoMinor
    surfaceOnDarkTransparentPromoHover = other.surfaceOnDarkTransparentPromoHover
    surfaceOnDarkTransparentPromoActive = other.surfaceOnDarkTransparentPromoActive
    surfaceOnDarkTransparentPromo = other.surfaceOnDarkTransparentPromo
    surfaceOnDarkPositiveHover = other.surfaceOnDarkPositiveHover
    surfaceOnDarkPositiveActive = other.surfaceOnDarkPositiveActive
    surfaceOnDarkPositive = other.surfaceOnDarkPositive
    surfaceOnDarkWarningHover = other.surfaceOnDarkWarningHover
    surfaceOnDarkWarningActive = other.surfaceOnDarkWarningActive
    surfaceOnDarkWarning = other.surfaceOnDarkWarning
    surfaceOnDarkNegativeHover = other.surfaceOnDarkNegativeHover
    surfaceOnDarkNegativeActive = other.surfaceOnDarkNegativeActive
    surfaceOnDarkNegative = other.surfaceOnDarkNegative
    surfaceOnDarkInfoHover = other.surfaceOnDarkInfoHover
    surfaceOnDarkInfoActive = other.surfaceOnDarkInfoActive
    surfaceOnDarkPositiveMinorHover = other.surfaceOnDarkPositiveMinorHover
    surfaceOnDarkPositiveMinorActive = other.surfaceOnDarkPositiveMinorActive
    surfaceOnDarkWarningMinorHover = other.surfaceOnDarkWarningMinorHover
    surfaceOnDarkWarningMinorActive = other.surfaceOnDarkWarningMinorActive
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
    surfaceOnDarkAccentMinor = other.surfaceOnDarkAccentMinor
    surfaceOnDarkTransparentAccent = other.surfaceOnDarkTransparentAccent
    surfaceOnDarkInfo = other.surfaceOnDarkInfo
    surfaceOnDarkPositiveMinor = other.surfaceOnDarkPositiveMinor
    surfaceOnDarkWarningMinor = other.surfaceOnDarkWarningMinor
    surfaceOnDarkNegativeMinor = other.surfaceOnDarkNegativeMinor
    surfaceOnDarkInfoMinor = other.surfaceOnDarkInfoMinor
    surfaceOnDarkTransparentPositive = other.surfaceOnDarkTransparentPositive
    surfaceOnDarkTransparentWarning = other.surfaceOnDarkTransparentWarning
    surfaceOnDarkTransparentNegative = other.surfaceOnDarkTransparentNegative
    surfaceOnDarkTransparentInfo = other.surfaceOnDarkTransparentInfo
    surfaceOnLightSolidPrimaryHover = other.surfaceOnLightSolidPrimaryHover
    surfaceOnLightSolidPrimaryActive = other.surfaceOnLightSolidPrimaryActive
    surfaceOnLightSolidPrimary = other.surfaceOnLightSolidPrimary
    surfaceOnLightSolidPrimaryBrightness = other.surfaceOnLightSolidPrimaryBrightness
    surfaceOnLightSolidSecondaryHover = other.surfaceOnLightSolidSecondaryHover
    surfaceOnLightSolidSecondaryActive = other.surfaceOnLightSolidSecondaryActive
    surfaceOnLightSolidSecondary = other.surfaceOnLightSolidSecondary
    surfaceOnLightSolidTertiaryHover = other.surfaceOnLightSolidTertiaryHover
    surfaceOnLightSolidTertiaryActive = other.surfaceOnLightSolidTertiaryActive
    surfaceOnLightSolidTertiary = other.surfaceOnLightSolidTertiary
    surfaceOnLightSolidCardHover = other.surfaceOnLightSolidCardHover
    surfaceOnLightSolidCardActive = other.surfaceOnLightSolidCardActive
    surfaceOnLightSolidCard = other.surfaceOnLightSolidCard
    surfaceOnLightSolidCardBrightness = other.surfaceOnLightSolidCardBrightness
    surfaceOnLightSolidDefaultHover = other.surfaceOnLightSolidDefaultHover
    surfaceOnLightSolidDefaultActive = other.surfaceOnLightSolidDefaultActive
    surfaceOnLightSolidDefault = other.surfaceOnLightSolidDefault
    surfaceOnLightTransparentPrimaryHover = other.surfaceOnLightTransparentPrimaryHover
    surfaceOnLightTransparentPrimaryActive = other.surfaceOnLightTransparentPrimaryActive
    surfaceOnLightTransparentSecondaryHover = other.surfaceOnLightTransparentSecondaryHover
    surfaceOnLightTransparentSecondaryActive = other.surfaceOnLightTransparentSecondaryActive
    surfaceOnLightTransparentSecondary = other.surfaceOnLightTransparentSecondary
    surfaceOnLightTransparentTertiaryHover = other.surfaceOnLightTransparentTertiaryHover
    surfaceOnLightTransparentTertiaryActive = other.surfaceOnLightTransparentTertiaryActive
    surfaceOnLightTransparentTertiary = other.surfaceOnLightTransparentTertiary
    surfaceOnLightTransparentDeepHover = other.surfaceOnLightTransparentDeepHover
    surfaceOnLightTransparentDeepActive = other.surfaceOnLightTransparentDeepActive
    surfaceOnLightTransparentDeep = other.surfaceOnLightTransparentDeep
    surfaceOnLightTransparentCardHover = other.surfaceOnLightTransparentCardHover
    surfaceOnLightTransparentCardActive = other.surfaceOnLightTransparentCardActive
    surfaceOnLightTransparentCard = other.surfaceOnLightTransparentCard
    surfaceOnLightTransparentCardBrightness = other.surfaceOnLightTransparentCardBrightness
    surfaceOnLightClearHover = other.surfaceOnLightClearHover
    surfaceOnLightClearActive = other.surfaceOnLightClearActive
    surfaceOnLightClear = other.surfaceOnLightClear
    surfaceOnLightAccentHover = other.surfaceOnLightAccentHover
    surfaceOnLightAccentActive = other.surfaceOnLightAccentActive
    surfaceOnLightAccent = other.surfaceOnLightAccent
    surfaceOnLightAccentMinorHover = other.surfaceOnLightAccentMinorHover
    surfaceOnLightAccentMinorActive = other.surfaceOnLightAccentMinorActive
    surfaceOnLightTransparentAccentHover = other.surfaceOnLightTransparentAccentHover
    surfaceOnLightTransparentAccentActive = other.surfaceOnLightTransparentAccentActive
    surfaceOnLightPromoHover = other.surfaceOnLightPromoHover
    surfaceOnLightPromoActive = other.surfaceOnLightPromoActive
    surfaceOnLightPromo = other.surfaceOnLightPromo
    surfaceOnLightPromoMinorHover = other.surfaceOnLightPromoMinorHover
    surfaceOnLightPromoMinorActive = other.surfaceOnLightPromoMinorActive
    surfaceOnLightPromoMinor = other.surfaceOnLightPromoMinor
    surfaceOnLightTransparentPromoHover = other.surfaceOnLightTransparentPromoHover
    surfaceOnLightTransparentPromoActive = other.surfaceOnLightTransparentPromoActive
    surfaceOnLightTransparentPromo = other.surfaceOnLightTransparentPromo
    surfaceOnLightPositiveHover = other.surfaceOnLightPositiveHover
    surfaceOnLightPositiveActive = other.surfaceOnLightPositiveActive
    surfaceOnLightPositive = other.surfaceOnLightPositive
    surfaceOnLightWarningHover = other.surfaceOnLightWarningHover
    surfaceOnLightWarningActive = other.surfaceOnLightWarningActive
    surfaceOnLightWarning = other.surfaceOnLightWarning
    surfaceOnLightNegativeHover = other.surfaceOnLightNegativeHover
    surfaceOnLightNegativeActive = other.surfaceOnLightNegativeActive
    surfaceOnLightNegative = other.surfaceOnLightNegative
    surfaceOnLightInfoHover = other.surfaceOnLightInfoHover
    surfaceOnLightInfoActive = other.surfaceOnLightInfoActive
    surfaceOnLightPositiveMinorHover = other.surfaceOnLightPositiveMinorHover
    surfaceOnLightPositiveMinorActive = other.surfaceOnLightPositiveMinorActive
    surfaceOnLightWarningMinorHover = other.surfaceOnLightWarningMinorHover
    surfaceOnLightWarningMinorActive = other.surfaceOnLightWarningMinorActive
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
    surfaceOnLightAccentMinor = other.surfaceOnLightAccentMinor
    surfaceOnLightTransparentAccent = other.surfaceOnLightTransparentAccent
    surfaceOnLightInfo = other.surfaceOnLightInfo
    surfaceOnLightWarningMinor = other.surfaceOnLightWarningMinor
    surfaceOnLightPositiveMinor = other.surfaceOnLightPositiveMinor
    surfaceOnLightInfoMinor = other.surfaceOnLightInfoMinor
    surfaceOnLightNegativeMinor = other.surfaceOnLightNegativeMinor
    surfaceOnLightTransparentPositive = other.surfaceOnLightTransparentPositive
    surfaceOnLightTransparentWarning = other.surfaceOnLightTransparentWarning
    surfaceOnLightTransparentNegative = other.surfaceOnLightTransparentNegative
    surfaceOnLightTransparentInfo = other.surfaceOnLightTransparentInfo
    surfaceOnLightTransparentPrimary = other.surfaceOnLightTransparentPrimary
    surfaceInverseSolidPrimaryHover = other.surfaceInverseSolidPrimaryHover
    surfaceInverseSolidPrimaryActive = other.surfaceInverseSolidPrimaryActive
    surfaceInverseSolidPrimary = other.surfaceInverseSolidPrimary
    surfaceInverseSolidPrimaryBrightness = other.surfaceInverseSolidPrimaryBrightness
    surfaceInverseSolidSecondaryHover = other.surfaceInverseSolidSecondaryHover
    surfaceInverseSolidSecondaryActive = other.surfaceInverseSolidSecondaryActive
    surfaceInverseSolidSecondary = other.surfaceInverseSolidSecondary
    surfaceInverseSolidTertiaryHover = other.surfaceInverseSolidTertiaryHover
    surfaceInverseSolidTertiaryActive = other.surfaceInverseSolidTertiaryActive
    surfaceInverseSolidTertiary = other.surfaceInverseSolidTertiary
    surfaceInverseSolidCardHover = other.surfaceInverseSolidCardHover
    surfaceInverseSolidCardActive = other.surfaceInverseSolidCardActive
    surfaceInverseSolidCard = other.surfaceInverseSolidCard
    surfaceInverseSolidCardBrightness = other.surfaceInverseSolidCardBrightness
    surfaceInverseSolidDefaultHover = other.surfaceInverseSolidDefaultHover
    surfaceInverseSolidDefaultActive = other.surfaceInverseSolidDefaultActive
    surfaceInverseSolidDefault = other.surfaceInverseSolidDefault
    surfaceInverseTransparentPrimaryHover = other.surfaceInverseTransparentPrimaryHover
    surfaceInverseTransparentPrimaryActive = other.surfaceInverseTransparentPrimaryActive
    surfaceInverseTransparentPrimary = other.surfaceInverseTransparentPrimary
    surfaceInverseTransparentSecondaryHover = other.surfaceInverseTransparentSecondaryHover
    surfaceInverseTransparentSecondaryActive = other.surfaceInverseTransparentSecondaryActive
    surfaceInverseTransparentSecondary = other.surfaceInverseTransparentSecondary
    surfaceInverseTransparentTertiaryHover = other.surfaceInverseTransparentTertiaryHover
    surfaceInverseTransparentTertiaryActive = other.surfaceInverseTransparentTertiaryActive
    surfaceInverseTransparentTertiary = other.surfaceInverseTransparentTertiary
    surfaceInverseTransparentDeepHover = other.surfaceInverseTransparentDeepHover
    surfaceInverseTransparentDeepActive = other.surfaceInverseTransparentDeepActive
    surfaceInverseTransparentDeep = other.surfaceInverseTransparentDeep
    surfaceInverseTransparentCardHover = other.surfaceInverseTransparentCardHover
    surfaceInverseTransparentCardActive = other.surfaceInverseTransparentCardActive
    surfaceInverseTransparentCard = other.surfaceInverseTransparentCard
    surfaceInverseTransparentCardBrightness = other.surfaceInverseTransparentCardBrightness
    surfaceInverseClearHover = other.surfaceInverseClearHover
    surfaceInverseClearActive = other.surfaceInverseClearActive
    surfaceInverseClear = other.surfaceInverseClear
    surfaceInverseAccentHover = other.surfaceInverseAccentHover
    surfaceInverseAccentActive = other.surfaceInverseAccentActive
    surfaceInverseAccent = other.surfaceInverseAccent
    surfaceInverseAccentMinorHover = other.surfaceInverseAccentMinorHover
    surfaceInverseAccentMinorActive = other.surfaceInverseAccentMinorActive
    surfaceInverseTransparentAccentHover = other.surfaceInverseTransparentAccentHover
    surfaceInverseTransparentAccentActive = other.surfaceInverseTransparentAccentActive
    surfaceInversePromoHover = other.surfaceInversePromoHover
    surfaceInversePromoActive = other.surfaceInversePromoActive
    surfaceInversePromo = other.surfaceInversePromo
    surfaceInversePromoMinorHover = other.surfaceInversePromoMinorHover
    surfaceInversePromoMinorActive = other.surfaceInversePromoMinorActive
    surfaceInversePromoMinor = other.surfaceInversePromoMinor
    surfaceInverseTransparentPromoHover = other.surfaceInverseTransparentPromoHover
    surfaceInverseTransparentPromoActive = other.surfaceInverseTransparentPromoActive
    surfaceInverseTransparentPromo = other.surfaceInverseTransparentPromo
    surfaceInversePositiveHover = other.surfaceInversePositiveHover
    surfaceInversePositiveActive = other.surfaceInversePositiveActive
    surfaceInversePositive = other.surfaceInversePositive
    surfaceInverseWarningHover = other.surfaceInverseWarningHover
    surfaceInverseWarningActive = other.surfaceInverseWarningActive
    surfaceInverseWarning = other.surfaceInverseWarning
    surfaceInverseNegativeHover = other.surfaceInverseNegativeHover
    surfaceInverseNegativeActive = other.surfaceInverseNegativeActive
    surfaceInverseNegative = other.surfaceInverseNegative
    surfaceInverseInfoHover = other.surfaceInverseInfoHover
    surfaceInverseInfoActive = other.surfaceInverseInfoActive
    surfaceInversePositiveMinorHover = other.surfaceInversePositiveMinorHover
    surfaceInversePositiveMinorActive = other.surfaceInversePositiveMinorActive
    surfaceInverseWarningMinorHover = other.surfaceInverseWarningMinorHover
    surfaceInverseWarningMinorActive = other.surfaceInverseWarningMinorActive
    surfaceInverseNegativeMinorHover = other.surfaceInverseNegativeMinorHover
    surfaceInverseNegativeMinorActive = other.surfaceInverseNegativeMinorActive
    surfaceInverseInfoMinorHover = other.surfaceInverseInfoMinorHover
    surfaceInverseInfoMinorActive = other.surfaceInverseInfoMinorActive
    surfaceInverseTransparentPositiveHover = other.surfaceInverseTransparentPositiveHover
    surfaceInverseTransparentPositiveActive = other.surfaceInverseTransparentPositiveActive
    surfaceInverseTransparentWarningHover = other.surfaceInverseTransparentWarningHover
    surfaceInverseTransparentWarningActive = other.surfaceInverseTransparentWarningActive
    surfaceInverseTransparentNegativeHover = other.surfaceInverseTransparentNegativeHover
    surfaceInverseTransparentNegativeActive = other.surfaceInverseTransparentNegativeActive
    surfaceInverseTransparentInfoHover = other.surfaceInverseTransparentInfoHover
    surfaceInverseTransparentInfoActive = other.surfaceInverseTransparentInfoActive
    surfaceInverseAccentMinor = other.surfaceInverseAccentMinor
    surfaceInverseTransparentAccent = other.surfaceInverseTransparentAccent
    surfaceInverseInfo = other.surfaceInverseInfo
    surfaceInversePositiveMinor = other.surfaceInversePositiveMinor
    surfaceInverseWarningMinor = other.surfaceInverseWarningMinor
    surfaceInverseNegativeMinor = other.surfaceInverseNegativeMinor
    surfaceInverseInfoMinor = other.surfaceInverseInfoMinor
    surfaceInverseTransparentPositive = other.surfaceInverseTransparentPositive
    surfaceInverseTransparentWarning = other.surfaceInverseTransparentWarning
    surfaceInverseTransparentNegative = other.surfaceInverseTransparentNegative
    surfaceInverseTransparentInfo = other.surfaceInverseTransparentInfo
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
    backgroundInversePrimary = other.backgroundInversePrimary
    backgroundInversePrimaryBrightness = other.backgroundInversePrimaryBrightness
    backgroundInverseSecondary = other.backgroundInverseSecondary
    backgroundInverseTertiary = other.backgroundInverseTertiary
    overlayDefaultSoft = other.overlayDefaultSoft
    overlayDefaultHard = other.overlayDefaultHard
    overlayDefaultBlur = other.overlayDefaultBlur
    overlayOnDarkSoft = other.overlayOnDarkSoft
    overlayOnDarkHard = other.overlayOnDarkHard
    overlayOnDarkBlur = other.overlayOnDarkBlur
    overlayOnLightSoft = other.overlayOnLightSoft
    overlayOnLightHard = other.overlayOnLightHard
    overlayOnLightBlur = other.overlayOnLightBlur
    overlayInverseSoft = other.overlayInverseSoft
    overlayInverseHard = other.overlayInverseHard
    overlayInverseBlur = other.overlayInverseBlur
    outlineDefaultSolidPrimaryHover = other.outlineDefaultSolidPrimaryHover
    outlineDefaultSolidPrimaryActive = other.outlineDefaultSolidPrimaryActive
    outlineDefaultSolidSecondaryHover = other.outlineDefaultSolidSecondaryHover
    outlineDefaultSolidSecondaryActive = other.outlineDefaultSolidSecondaryActive
    outlineDefaultSolidTertiaryHover = other.outlineDefaultSolidTertiaryHover
    outlineDefaultSolidTertiaryActive = other.outlineDefaultSolidTertiaryActive
    outlineDefaultTransparentDefaultHover = other.outlineDefaultTransparentDefaultHover
    outlineDefaultTransparentDefaultActive = other.outlineDefaultTransparentDefaultActive
    outlineDefaultTransparentDefault = other.outlineDefaultTransparentDefault
    outlineDefaultTransparentPrimaryHover = other.outlineDefaultTransparentPrimaryHover
    outlineDefaultTransparentPrimaryActive = other.outlineDefaultTransparentPrimaryActive
    outlineDefaultTransparentSecondaryHover = other.outlineDefaultTransparentSecondaryHover
    outlineDefaultTransparentSecondaryActive = other.outlineDefaultTransparentSecondaryActive
    outlineDefaultTransparentTertiaryHover = other.outlineDefaultTransparentTertiaryHover
    outlineDefaultTransparentTertiaryActive = other.outlineDefaultTransparentTertiaryActive
    outlineDefaultClearHover = other.outlineDefaultClearHover
    outlineDefaultClearActive = other.outlineDefaultClearActive
    outlineDefaultAccentHover = other.outlineDefaultAccentHover
    outlineDefaultAccentActive = other.outlineDefaultAccentActive
    outlineDefaultAccentMinorHover = other.outlineDefaultAccentMinorHover
    outlineDefaultAccentMinorActive = other.outlineDefaultAccentMinorActive
    outlineDefaultTransparentAccentHover = other.outlineDefaultTransparentAccentHover
    outlineDefaultTransparentAccentActive = other.outlineDefaultTransparentAccentActive
    outlineDefaultPromoHover = other.outlineDefaultPromoHover
    outlineDefaultPromoActive = other.outlineDefaultPromoActive
    outlineDefaultPromo = other.outlineDefaultPromo
    outlineDefaultPromoMinorHover = other.outlineDefaultPromoMinorHover
    outlineDefaultPromoMinorActive = other.outlineDefaultPromoMinorActive
    outlineDefaultPromoMinor = other.outlineDefaultPromoMinor
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
    outlineDefaultTransparentNegativeHover = other.outlineDefaultTransparentNegativeHover
    outlineDefaultTransparentNegativeActive = other.outlineDefaultTransparentNegativeActive
    outlineDefaultTransparentInfoHover = other.outlineDefaultTransparentInfoHover
    outlineDefaultTransparentInfoActive = other.outlineDefaultTransparentInfoActive
    outlineDefaultClear = other.outlineDefaultClear
    outlineDefaultSolidPrimary = other.outlineDefaultSolidPrimary
    outlineDefaultSolidTertiary = other.outlineDefaultSolidTertiary
    outlineDefaultAccent = other.outlineDefaultAccent
    outlineDefaultAccentMinor = other.outlineDefaultAccentMinor
    outlineDefaultTransparentAccent = other.outlineDefaultTransparentAccent
    outlineDefaultWarning = other.outlineDefaultWarning
    outlineDefaultPositive = other.outlineDefaultPositive
    outlineDefaultTransparentPositive = other.outlineDefaultTransparentPositive
    outlineDefaultNegative = other.outlineDefaultNegative
    outlineDefaultInfo = other.outlineDefaultInfo
    outlineDefaultPositiveMinor = other.outlineDefaultPositiveMinor
    outlineDefaultWarningMinor = other.outlineDefaultWarningMinor
    outlineDefaultNegativeMinor = other.outlineDefaultNegativeMinor
    outlineDefaultInfoMinor = other.outlineDefaultInfoMinor
    outlineDefaultTransparentWarning = other.outlineDefaultTransparentWarning
    outlineDefaultTransparentNegative = other.outlineDefaultTransparentNegative
    outlineDefaultTransparentInfo = other.outlineDefaultTransparentInfo
    outlineDefaultTransparentPrimary = other.outlineDefaultTransparentPrimary
    outlineDefaultTransparentSecondary = other.outlineDefaultTransparentSecondary
    outlineDefaultTransparentTertiary = other.outlineDefaultTransparentTertiary
    outlineDefaultSolidSecondary = other.outlineDefaultSolidSecondary
    outlineOnDarkSolidPrimaryHover = other.outlineOnDarkSolidPrimaryHover
    outlineOnDarkSolidPrimaryActive = other.outlineOnDarkSolidPrimaryActive
    outlineOnDarkSolidSecondaryHover = other.outlineOnDarkSolidSecondaryHover
    outlineOnDarkSolidSecondaryActive = other.outlineOnDarkSolidSecondaryActive
    outlineOnDarkSolidTertiaryHover = other.outlineOnDarkSolidTertiaryHover
    outlineOnDarkSolidTertiaryActive = other.outlineOnDarkSolidTertiaryActive
    outlineOnDarkTransparentDefaultHover = other.outlineOnDarkTransparentDefaultHover
    outlineOnDarkTransparentDefaultActive = other.outlineOnDarkTransparentDefaultActive
    outlineOnDarkTransparentDefault = other.outlineOnDarkTransparentDefault
    outlineOnDarkTransparentPrimaryHover = other.outlineOnDarkTransparentPrimaryHover
    outlineOnDarkTransparentPrimaryActive = other.outlineOnDarkTransparentPrimaryActive
    outlineOnDarkTransparentSecondaryHover = other.outlineOnDarkTransparentSecondaryHover
    outlineOnDarkTransparentSecondaryActive = other.outlineOnDarkTransparentSecondaryActive
    outlineOnDarkTransparentTertiaryHover = other.outlineOnDarkTransparentTertiaryHover
    outlineOnDarkTransparentTertiaryActive = other.outlineOnDarkTransparentTertiaryActive
    outlineOnDarkClearHover = other.outlineOnDarkClearHover
    outlineOnDarkClearActive = other.outlineOnDarkClearActive
    outlineOnDarkAccentHover = other.outlineOnDarkAccentHover
    outlineOnDarkAccentActive = other.outlineOnDarkAccentActive
    outlineOnDarkAccentMinorHover = other.outlineOnDarkAccentMinorHover
    outlineOnDarkAccentMinorActive = other.outlineOnDarkAccentMinorActive
    outlineOnDarkTransparentAccentHover = other.outlineOnDarkTransparentAccentHover
    outlineOnDarkTransparentAccentActive = other.outlineOnDarkTransparentAccentActive
    outlineOnDarkPromoHover = other.outlineOnDarkPromoHover
    outlineOnDarkPromoActive = other.outlineOnDarkPromoActive
    outlineOnDarkPromo = other.outlineOnDarkPromo
    outlineOnDarkPromoMinorHover = other.outlineOnDarkPromoMinorHover
    outlineOnDarkPromoMinorActive = other.outlineOnDarkPromoMinorActive
    outlineOnDarkPromoMinor = other.outlineOnDarkPromoMinor
    outlineOnDarkPositiveHover = other.outlineOnDarkPositiveHover
    outlineOnDarkPositiveActive = other.outlineOnDarkPositiveActive
    outlineOnDarkWarningHover = other.outlineOnDarkWarningHover
    outlineOnDarkWarningActive = other.outlineOnDarkWarningActive
    outlineOnDarkNegativeHover = other.outlineOnDarkNegativeHover
    outlineOnDarkNegativeActive = other.outlineOnDarkNegativeActive
    outlineOnDarkInfoHover = other.outlineOnDarkInfoHover
    outlineOnDarkInfoActive = other.outlineOnDarkInfoActive
    outlineOnDarkPositiveMinorHover = other.outlineOnDarkPositiveMinorHover
    outlineOnDarkPositiveMinorActive = other.outlineOnDarkPositiveMinorActive
    outlineOnDarkWarningMinorHover = other.outlineOnDarkWarningMinorHover
    outlineOnDarkWarningMinorActive = other.outlineOnDarkWarningMinorActive
    outlineOnDarkNegativeMinorHover = other.outlineOnDarkNegativeMinorHover
    outlineOnDarkNegativeMinorActive = other.outlineOnDarkNegativeMinorActive
    outlineOnDarkInfoMinorHover = other.outlineOnDarkInfoMinorHover
    outlineOnDarkInfoMinorActive = other.outlineOnDarkInfoMinorActive
    outlineOnDarkTransparentPositiveHover = other.outlineOnDarkTransparentPositiveHover
    outlineOnDarkTransparentPositiveActive = other.outlineOnDarkTransparentPositiveActive
    outlineOnDarkTransparentWarningHover = other.outlineOnDarkTransparentWarningHover
    outlineOnDarkTransparentWarningActive = other.outlineOnDarkTransparentWarningActive
    outlineOnDarkTransparentNegativeHover = other.outlineOnDarkTransparentNegativeHover
    outlineOnDarkTransparentNegativeActive = other.outlineOnDarkTransparentNegativeActive
    outlineOnDarkTransparentInfoHover = other.outlineOnDarkTransparentInfoHover
    outlineOnDarkTransparentInfoActive = other.outlineOnDarkTransparentInfoActive
    outlineOnDarkClear = other.outlineOnDarkClear
    outlineOnDarkSolidPrimary = other.outlineOnDarkSolidPrimary
    outlineOnDarkAccent = other.outlineOnDarkAccent
    outlineOnDarkAccentMinor = other.outlineOnDarkAccentMinor
    outlineOnDarkTransparentAccent = other.outlineOnDarkTransparentAccent
    outlineOnDarkTransparentPositive = other.outlineOnDarkTransparentPositive
    outlineOnDarkPositive = other.outlineOnDarkPositive
    outlineOnDarkWarning = other.outlineOnDarkWarning
    outlineOnDarkNegative = other.outlineOnDarkNegative
    outlineOnDarkInfo = other.outlineOnDarkInfo
    outlineOnDarkPositiveMinor = other.outlineOnDarkPositiveMinor
    outlineOnDarkWarningMinor = other.outlineOnDarkWarningMinor
    outlineOnDarkNegativeMinor = other.outlineOnDarkNegativeMinor
    outlineOnDarkInfoMinor = other.outlineOnDarkInfoMinor
    outlineOnDarkTransparentWarning = other.outlineOnDarkTransparentWarning
    outlineOnDarkTransparentNegative = other.outlineOnDarkTransparentNegative
    outlineOnDarkTransparentInfo = other.outlineOnDarkTransparentInfo
    outlineOnDarkTransparentPrimary = other.outlineOnDarkTransparentPrimary
    outlineOnDarkTransparentSecondary = other.outlineOnDarkTransparentSecondary
    outlineOnDarkTransparentTertiary = other.outlineOnDarkTransparentTertiary
    outlineOnDarkSolidSecondary = other.outlineOnDarkSolidSecondary
    outlineOnDarkSolidTertiary = other.outlineOnDarkSolidTertiary
    outlineOnLightSolidPrimaryHover = other.outlineOnLightSolidPrimaryHover
    outlineOnLightSolidPrimaryActive = other.outlineOnLightSolidPrimaryActive
    outlineOnLightSolidSecondaryHover = other.outlineOnLightSolidSecondaryHover
    outlineOnLightSolidSecondaryActive = other.outlineOnLightSolidSecondaryActive
    outlineOnLightSolidTertiaryHover = other.outlineOnLightSolidTertiaryHover
    outlineOnLightSolidTertiaryActive = other.outlineOnLightSolidTertiaryActive
    outlineOnLightTransparentDefaultHover = other.outlineOnLightTransparentDefaultHover
    outlineOnLightTransparentDefaultActive = other.outlineOnLightTransparentDefaultActive
    outlineOnLightTransparentDefault = other.outlineOnLightTransparentDefault
    outlineOnLightTransparentPrimaryHover = other.outlineOnLightTransparentPrimaryHover
    outlineOnLightTransparentPrimaryActive = other.outlineOnLightTransparentPrimaryActive
    outlineOnLightTransparentSecondaryHover = other.outlineOnLightTransparentSecondaryHover
    outlineOnLightTransparentSecondaryActive = other.outlineOnLightTransparentSecondaryActive
    outlineOnLightTransparentTertiaryHover = other.outlineOnLightTransparentTertiaryHover
    outlineOnLightTransparentTertiaryActive = other.outlineOnLightTransparentTertiaryActive
    outlineOnLightClearHover = other.outlineOnLightClearHover
    outlineOnLightClearActive = other.outlineOnLightClearActive
    outlineOnLightAccentHover = other.outlineOnLightAccentHover
    outlineOnLightAccentActive = other.outlineOnLightAccentActive
    outlineOnLightAccentMinorHover = other.outlineOnLightAccentMinorHover
    outlineOnLightAccentMinorActive = other.outlineOnLightAccentMinorActive
    outlineOnLightTransparentAccentHover = other.outlineOnLightTransparentAccentHover
    outlineOnLightTransparentAccentActive = other.outlineOnLightTransparentAccentActive
    outlineOnLightPromoHover = other.outlineOnLightPromoHover
    outlineOnLightPromoActive = other.outlineOnLightPromoActive
    outlineOnLightPromo = other.outlineOnLightPromo
    outlineOnLightPromoMinorHover = other.outlineOnLightPromoMinorHover
    outlineOnLightPromoMinorActive = other.outlineOnLightPromoMinorActive
    outlineOnLightPromoMinor = other.outlineOnLightPromoMinor
    outlineOnLightPositiveHover = other.outlineOnLightPositiveHover
    outlineOnLightPositiveActive = other.outlineOnLightPositiveActive
    outlineOnLightWarningHover = other.outlineOnLightWarningHover
    outlineOnLightWarningActive = other.outlineOnLightWarningActive
    outlineOnLightNegativeHover = other.outlineOnLightNegativeHover
    outlineOnLightNegativeActive = other.outlineOnLightNegativeActive
    outlineOnLightInfoHover = other.outlineOnLightInfoHover
    outlineOnLightInfoActive = other.outlineOnLightInfoActive
    outlineOnLightPositiveMinorHover = other.outlineOnLightPositiveMinorHover
    outlineOnLightPositiveMinorActive = other.outlineOnLightPositiveMinorActive
    outlineOnLightWarningMinorHover = other.outlineOnLightWarningMinorHover
    outlineOnLightWarningMinorActive = other.outlineOnLightWarningMinorActive
    outlineOnLightNegativeMinorHover = other.outlineOnLightNegativeMinorHover
    outlineOnLightNegativeMinorActive = other.outlineOnLightNegativeMinorActive
    outlineOnLightInfoMinorHover = other.outlineOnLightInfoMinorHover
    outlineOnLightInfoMinorActive = other.outlineOnLightInfoMinorActive
    outlineOnLightTransparentPositiveHover = other.outlineOnLightTransparentPositiveHover
    outlineOnLightTransparentPositiveActive = other.outlineOnLightTransparentPositiveActive
    outlineOnLightTransparentWarningHover = other.outlineOnLightTransparentWarningHover
    outlineOnLightTransparentWarningActive = other.outlineOnLightTransparentWarningActive
    outlineOnLightTransparentNegativeHover = other.outlineOnLightTransparentNegativeHover
    outlineOnLightTransparentNegativeActive = other.outlineOnLightTransparentNegativeActive
    outlineOnLightTransparentInfoHover = other.outlineOnLightTransparentInfoHover
    outlineOnLightTransparentInfoActive = other.outlineOnLightTransparentInfoActive
    outlineOnLightClear = other.outlineOnLightClear
    outlineOnLightTransparentAccent = other.outlineOnLightTransparentAccent
    outlineOnLightPositive = other.outlineOnLightPositive
    outlineOnLightTransparentPositive = other.outlineOnLightTransparentPositive
    outlineOnLightTransparentWarning = other.outlineOnLightTransparentWarning
    outlineOnLightTransparentNegative = other.outlineOnLightTransparentNegative
    outlineOnLightTransparentInfo = other.outlineOnLightTransparentInfo
    outlineOnLightSolidPrimary = other.outlineOnLightSolidPrimary
    outlineOnLightSolidTertiary = other.outlineOnLightSolidTertiary
    outlineOnLightAccent = other.outlineOnLightAccent
    outlineOnLightAccentMinor = other.outlineOnLightAccentMinor
    outlineOnLightWarning = other.outlineOnLightWarning
    outlineOnLightNegative = other.outlineOnLightNegative
    outlineOnLightInfo = other.outlineOnLightInfo
    outlineOnLightPositiveMinor = other.outlineOnLightPositiveMinor
    outlineOnLightWarningMinor = other.outlineOnLightWarningMinor
    outlineOnLightNegativeMinor = other.outlineOnLightNegativeMinor
    outlineOnLightInfoMinor = other.outlineOnLightInfoMinor
    outlineOnLightTransparentPrimary = other.outlineOnLightTransparentPrimary
    outlineOnLightTransparentSecondary = other.outlineOnLightTransparentSecondary
    outlineOnLightTransparentTertiary = other.outlineOnLightTransparentTertiary
    outlineOnLightSolidSecondary = other.outlineOnLightSolidSecondary
    outlineInverseSolidPrimaryHover = other.outlineInverseSolidPrimaryHover
    outlineInverseSolidPrimaryActive = other.outlineInverseSolidPrimaryActive
    outlineInverseSolidSecondaryHover = other.outlineInverseSolidSecondaryHover
    outlineInverseSolidSecondaryActive = other.outlineInverseSolidSecondaryActive
    outlineInverseSolidTertiaryHover = other.outlineInverseSolidTertiaryHover
    outlineInverseSolidTertiaryActive = other.outlineInverseSolidTertiaryActive
    outlineInverseTransparentDefaultHover = other.outlineInverseTransparentDefaultHover
    outlineInverseTransparentDefaultActive = other.outlineInverseTransparentDefaultActive
    outlineInverseTransparentDefault = other.outlineInverseTransparentDefault
    outlineInverseTransparentPrimaryHover = other.outlineInverseTransparentPrimaryHover
    outlineInverseTransparentPrimaryActive = other.outlineInverseTransparentPrimaryActive
    outlineInverseTransparentSecondaryHover = other.outlineInverseTransparentSecondaryHover
    outlineInverseTransparentSecondaryActive = other.outlineInverseTransparentSecondaryActive
    outlineInverseTransparentTertiaryHover = other.outlineInverseTransparentTertiaryHover
    outlineInverseTransparentTertiaryActive = other.outlineInverseTransparentTertiaryActive
    outlineInverseClearHover = other.outlineInverseClearHover
    outlineInverseClearActive = other.outlineInverseClearActive
    outlineInverseAccentHover = other.outlineInverseAccentHover
    outlineInverseAccentActive = other.outlineInverseAccentActive
    outlineInverseAccentMinorHover = other.outlineInverseAccentMinorHover
    outlineInverseAccentMinorActive = other.outlineInverseAccentMinorActive
    outlineInverseTransparentAccentHover = other.outlineInverseTransparentAccentHover
    outlineInverseTransparentAccentActive = other.outlineInverseTransparentAccentActive
    outlineInversePromoHover = other.outlineInversePromoHover
    outlineInversePromoActive = other.outlineInversePromoActive
    outlineInversePromo = other.outlineInversePromo
    outlineInversePromoMinorHover = other.outlineInversePromoMinorHover
    outlineInversePromoMinorActive = other.outlineInversePromoMinorActive
    outlineInversePromoMinor = other.outlineInversePromoMinor
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
    outlineInverseClear = other.outlineInverseClear
    outlineInverseTransparentAccent = other.outlineInverseTransparentAccent
    outlineInverseTransparentPositive = other.outlineInverseTransparentPositive
    outlineInverseTransparentWarning = other.outlineInverseTransparentWarning
    outlineInverseTransparentNegative = other.outlineInverseTransparentNegative
    outlineInverseTransparentInfo = other.outlineInverseTransparentInfo
    outlineInverseSolidPrimary = other.outlineInverseSolidPrimary
    outlineInverseAccent = other.outlineInverseAccent
    outlineInverseAccentMinor = other.outlineInverseAccentMinor
    outlineInversePositive = other.outlineInversePositive
    outlineInverseWarning = other.outlineInverseWarning
    outlineInverseNegative = other.outlineInverseNegative
    outlineInverseInfo = other.outlineInverseInfo
    outlineInversePositiveMinor = other.outlineInversePositiveMinor
    outlineInverseWarningMinor = other.outlineInverseWarningMinor
    outlineInverseNegativeMinor = other.outlineInverseNegativeMinor
    outlineInverseInfoMinor = other.outlineInverseInfoMinor
    outlineInverseTransparentPrimary = other.outlineInverseTransparentPrimary
    outlineInverseTransparentSecondary = other.outlineInverseTransparentSecondary
    outlineInverseTransparentTertiary = other.outlineInverseTransparentTertiary
    outlineInverseSolidSecondary = other.outlineInverseSolidSecondary
    outlineInverseSolidTertiary = other.outlineInverseSolidTertiary
}

private fun MutableMap<String, Color>.add(
    attribute: String,
    defaultTokenValue: Color,
    overwriteMap: Map<String, Color>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Цвета [SddsServColors] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsServColors(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsServColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("textDefaultPrimaryHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultPrimary", com.sdds.serv.tokens.LightColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondaryHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add(
        "textDefaultSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultSecondaryActive,
        overwrite,
    )
    initial.add("textDefaultSecondary", com.sdds.serv.tokens.LightColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiaryHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiary", com.sdds.serv.tokens.LightColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraphHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add(
        "textDefaultParagraphActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultParagraphActive,
        overwrite,
    )
    initial.add("textDefaultParagraph", com.sdds.serv.tokens.LightColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccentHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultAccent", com.sdds.serv.tokens.LightColorTokens.TextDefaultAccent, overwrite)
    initial.add(
        "textDefaultAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultPromoHover, overwrite)
    initial.add("textDefaultPromoActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultPromoActive, overwrite)
    initial.add("textDefaultPromo", com.sdds.serv.tokens.LightColorTokens.TextDefaultPromo, overwrite)
    initial.add(
        "textDefaultPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultPromoMinor, overwrite)
    initial.add("textDefaultPositiveHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositive", com.sdds.serv.tokens.LightColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarningHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarning", com.sdds.serv.tokens.LightColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegativeHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegative", com.sdds.serv.tokens.LightColorTokens.TextDefaultNegative, overwrite)
    initial.add("textDefaultInfoHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultInfoActive", com.sdds.serv.tokens.LightColorTokens.TextDefaultInfoActive, overwrite)
    initial.add(
        "textDefaultPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoMinorHover", com.sdds.serv.tokens.LightColorTokens.TextDefaultInfoMinorHover, overwrite)
    initial.add(
        "textDefaultInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextDefaultInfoMinorActive,
        overwrite,
    )
    initial.add("textDefaultAccentMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add("textDefaultInfo", com.sdds.serv.tokens.LightColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultPositiveMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfoMinor", com.sdds.serv.tokens.LightColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textOnDarkPrimaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkPrimary", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkSecondary", com.sdds.serv.tokens.LightColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkTertiary", com.sdds.serv.tokens.LightColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraphHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkParagraph", com.sdds.serv.tokens.LightColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccentHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkAccent", com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccent, overwrite)
    initial.add(
        "textOnDarkAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkPromoHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromoHover, overwrite)
    initial.add("textOnDarkPromoActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromoActive, overwrite)
    initial.add("textOnDarkPromo", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromo, overwrite)
    initial.add("textOnDarkPromoMinorHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromoMinorHover, overwrite)
    initial.add(
        "textOnDarkPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("textOnDarkPromoMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPromoMinor, overwrite)
    initial.add("textOnDarkPositiveHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkPositive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarningHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkWarning", com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegativeHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkNegative", com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkInfoHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add(
        "textOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoMinorHover", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfoMinorHover, overwrite)
    initial.add("textOnDarkInfoMinorActive", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfoMinorActive, overwrite)
    initial.add("textOnDarkAccentMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkInfo", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPositiveMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add("textOnDarkWarningMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add("textOnDarkNegativeMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add("textOnDarkInfoMinor", com.sdds.serv.tokens.LightColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimary", com.sdds.serv.tokens.LightColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add(
        "textOnLightSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightSecondaryActive,
        overwrite,
    )
    initial.add("textOnLightSecondary", com.sdds.serv.tokens.LightColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiaryHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightTertiary", com.sdds.serv.tokens.LightColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraphHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add(
        "textOnLightParagraphActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightParagraphActive,
        overwrite,
    )
    initial.add("textOnLightParagraph", com.sdds.serv.tokens.LightColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccentHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccent", com.sdds.serv.tokens.LightColorTokens.TextOnLightAccent, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightPromoHover, overwrite)
    initial.add("textOnLightPromoActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightPromoActive, overwrite)
    initial.add("textOnLightPromo", com.sdds.serv.tokens.LightColorTokens.TextOnLightPromo, overwrite)
    initial.add(
        "textOnLightPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightPromoMinor, overwrite)
    initial.add("textOnLightPositiveHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPositive", com.sdds.serv.tokens.LightColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarningHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textOnLightWarning", com.sdds.serv.tokens.LightColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightNegativeHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegative", com.sdds.serv.tokens.LightColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightInfoHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", com.sdds.serv.tokens.LightColorTokens.TextOnLightInfoActive, overwrite)
    initial.add(
        "textOnLightPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoMinorHover", com.sdds.serv.tokens.LightColorTokens.TextOnLightInfoMinorHover, overwrite)
    initial.add(
        "textOnLightInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextOnLightInfoMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfo", com.sdds.serv.tokens.LightColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightWarningMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add("textOnLightPositiveMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add("textOnLightAccentMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightNegativeMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add("textOnLightInfoMinor", com.sdds.serv.tokens.LightColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textInversePrimaryHover", com.sdds.serv.tokens.LightColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", com.sdds.serv.tokens.LightColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimary", com.sdds.serv.tokens.LightColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondaryHover", com.sdds.serv.tokens.LightColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add(
        "textInverseSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseSecondaryActive,
        overwrite,
    )
    initial.add("textInverseSecondary", com.sdds.serv.tokens.LightColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiaryHover", com.sdds.serv.tokens.LightColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", com.sdds.serv.tokens.LightColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseTertiary", com.sdds.serv.tokens.LightColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraphHover", com.sdds.serv.tokens.LightColorTokens.TextInverseParagraphHover, overwrite)
    initial.add(
        "textInverseParagraphActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseParagraphActive,
        overwrite,
    )
    initial.add("textInverseParagraph", com.sdds.serv.tokens.LightColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInverseAccentHover", com.sdds.serv.tokens.LightColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", com.sdds.serv.tokens.LightColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccent", com.sdds.serv.tokens.LightColorTokens.TextInverseAccent, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInversePromoHover", com.sdds.serv.tokens.LightColorTokens.TextInversePromoHover, overwrite)
    initial.add("textInversePromoActive", com.sdds.serv.tokens.LightColorTokens.TextInversePromoActive, overwrite)
    initial.add("textInversePromo", com.sdds.serv.tokens.LightColorTokens.TextInversePromo, overwrite)
    initial.add(
        "textInversePromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInversePromoMinorActive,
        overwrite,
    )
    initial.add("textInversePromoMinor", com.sdds.serv.tokens.LightColorTokens.TextInversePromoMinor, overwrite)
    initial.add("textInversePositiveHover", com.sdds.serv.tokens.LightColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", com.sdds.serv.tokens.LightColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositive", com.sdds.serv.tokens.LightColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarningHover", com.sdds.serv.tokens.LightColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", com.sdds.serv.tokens.LightColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseWarning", com.sdds.serv.tokens.LightColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegativeHover", com.sdds.serv.tokens.LightColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", com.sdds.serv.tokens.LightColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegative", com.sdds.serv.tokens.LightColorTokens.TextInverseNegative, overwrite)
    initial.add("textInverseInfoHover", com.sdds.serv.tokens.LightColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseInfoActive", com.sdds.serv.tokens.LightColorTokens.TextInverseInfoActive, overwrite)
    initial.add(
        "textInversePositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.TextInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoMinorHover", com.sdds.serv.tokens.LightColorTokens.TextInverseInfoMinorHover, overwrite)
    initial.add(
        "textInverseInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.TextInverseInfoMinorActive,
        overwrite,
    )
    initial.add("textInverseAccentMinor", com.sdds.serv.tokens.LightColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseInfo", com.sdds.serv.tokens.LightColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", com.sdds.serv.tokens.LightColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", com.sdds.serv.tokens.LightColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", com.sdds.serv.tokens.LightColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", com.sdds.serv.tokens.LightColorTokens.TextInverseInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add("surfaceDefaultSolidCard", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefault",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeep",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultClearHover", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultAccentHover", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add(
        "surfaceDefaultAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccentActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add(
        "surfaceDefaultAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add("surfaceDefaultPromoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromoHover, overwrite)
    initial.add("surfaceDefaultPromoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromoActive, overwrite)
    initial.add("surfaceDefaultPromo", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromo, overwrite)
    initial.add(
        "surfaceDefaultPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceDefaultPromoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPromoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPromoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add("surfaceDefaultPositive", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add(
        "surfaceDefaultWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add("surfaceDefaultWarning", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarning, overwrite)
    initial.add(
        "surfaceDefaultNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultNegative", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add("surfaceDefaultInfoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultInfoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add("surfaceDefaultInfo", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultPositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultNegativeMinor,
        overwrite,
    )
    initial.add("surfaceDefaultInfoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidCard", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeep",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkClear", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkAccentHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add("surfaceOnDarkAccent", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromoHover, overwrite)
    initial.add("surfaceOnDarkPromoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromoActive, overwrite)
    initial.add("surfaceOnDarkPromo", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromo, overwrite)
    initial.add(
        "surfaceOnDarkPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPromoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPromoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarningHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add(
        "surfaceOnDarkWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarningActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarning", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add(
        "surfaceOnDarkNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkNegative", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkInfoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfoActive, overwrite)
    initial.add(
        "surfaceOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnDarkInfo", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add(
        "surfaceOnDarkPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add(
        "surfaceOnDarkNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkNegativeMinor,
        overwrite,
    )
    initial.add("surfaceOnDarkInfoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkInfoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidCard", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefault",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeep",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightClearHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightClear", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightClear, overwrite)
    initial.add("surfaceOnLightAccentHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add(
        "surfaceOnLightAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccent", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromoHover, overwrite)
    initial.add("surfaceOnLightPromoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromoActive, overwrite)
    initial.add("surfaceOnLightPromo", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromo, overwrite)
    initial.add(
        "surfaceOnLightPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPromoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentPromoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnLightPositive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add(
        "surfaceOnLightWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarning", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add(
        "surfaceOnLightNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightNegative", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightInfoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add(
        "surfaceOnLightWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnLightInfoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefault",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeep",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCard",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseClear, overwrite)
    initial.add("surfaceInverseAccentHover", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add(
        "surfaceInverseAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseAccent", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccent, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInversePromoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromoHover, overwrite)
    initial.add("surfaceInversePromoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromoActive, overwrite)
    initial.add("surfaceInversePromo", com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromo, overwrite)
    initial.add(
        "surfaceInversePromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromoMinorActive,
        overwrite,
    )
    initial.add("surfaceInversePromoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceInversePromoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPromoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add("surfaceInversePositive", com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositive, overwrite)
    initial.add(
        "surfaceInverseWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add("surfaceInverseWarning", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarning, overwrite)
    initial.add(
        "surfaceInverseNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInverseNegative", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInversePositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfo", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", com.sdds.serv.tokens.LightColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.SurfaceInverseTransparentInfo,
        overwrite,
    )
    initial.add("backgroundDefaultPrimary", com.sdds.serv.tokens.LightColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add(
        "backgroundDefaultPrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.BackgroundDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "backgroundDefaultSecondary",
        com.sdds.serv.tokens.LightColorTokens.BackgroundDefaultSecondary,
        overwrite,
    )
    initial.add("backgroundDefaultTertiary", com.sdds.serv.tokens.LightColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundDarkPrimary", com.sdds.serv.tokens.LightColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundDarkSecondary", com.sdds.serv.tokens.LightColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add("backgroundDarkTertiary", com.sdds.serv.tokens.LightColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundLightPrimary", com.sdds.serv.tokens.LightColorTokens.BackgroundLightPrimary, overwrite)
    initial.add("backgroundLightSecondary", com.sdds.serv.tokens.LightColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("backgroundLightTertiary", com.sdds.serv.tokens.LightColorTokens.BackgroundLightTertiary, overwrite)
    initial.add("backgroundInversePrimary", com.sdds.serv.tokens.LightColorTokens.BackgroundInversePrimary, overwrite)
    initial.add(
        "backgroundInversePrimaryBrightness",
        com.sdds.serv.tokens.LightColorTokens.BackgroundInversePrimaryBrightness,
        overwrite,
    )
    initial.add(
        "backgroundInverseSecondary",
        com.sdds.serv.tokens.LightColorTokens.BackgroundInverseSecondary,
        overwrite,
    )
    initial.add("backgroundInverseTertiary", com.sdds.serv.tokens.LightColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("overlayDefaultSoft", com.sdds.serv.tokens.LightColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", com.sdds.serv.tokens.LightColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", com.sdds.serv.tokens.LightColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", com.sdds.serv.tokens.LightColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", com.sdds.serv.tokens.LightColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", com.sdds.serv.tokens.LightColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", com.sdds.serv.tokens.LightColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", com.sdds.serv.tokens.LightColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", com.sdds.serv.tokens.LightColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseSoft", com.sdds.serv.tokens.LightColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseHard", com.sdds.serv.tokens.LightColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseBlur", com.sdds.serv.tokens.LightColorTokens.OverlayInverseBlur, overwrite)
    initial.add(
        "outlineDefaultSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefault",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineDefaultClearHover", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultClearActive", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultClearActive, overwrite)
    initial.add("outlineDefaultAccentHover", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add(
        "outlineDefaultAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoHover", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromoHover, overwrite)
    initial.add("outlineDefaultPromoActive", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromoActive, overwrite)
    initial.add("outlineDefaultPromo", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromo, overwrite)
    initial.add(
        "outlineDefaultPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPromoMinor, overwrite)
    initial.add(
        "outlineDefaultPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfoHover", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add("outlineDefaultInfoActive", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineDefaultPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineDefaultClear", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultClear, overwrite)
    initial.add(
        "outlineDefaultSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add("outlineDefaultAccent", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultWarning", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultPositive", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositive, overwrite)
    initial.add(
        "outlineDefaultTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add("outlineDefaultNegative", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultInfo", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfo, overwrite)
    initial.add(
        "outlineDefaultPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultNegativeMinor,
        overwrite,
    )
    initial.add("outlineDefaultInfoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineDefaultInfoMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefault",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkClearHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add("outlineOnDarkAccentHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add(
        "outlineOnDarkAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromoHover, overwrite)
    initial.add("outlineOnDarkPromoActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromoActive, overwrite)
    initial.add("outlineOnDarkPromo", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromo, overwrite)
    initial.add(
        "outlineOnDarkPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPromoMinor, overwrite)
    initial.add(
        "outlineOnDarkPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarningHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add(
        "outlineOnDarkWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfoHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnDarkClear", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkSolidPrimary", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add("outlineOnDarkAccent", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkWarning", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkNegative", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkInfo", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkPositiveMinor,
        overwrite,
    )
    initial.add("outlineOnDarkWarningMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add(
        "outlineOnDarkNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnDarkInfoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnDarkSolidTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefault",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightClearHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add("outlineOnLightClearActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add("outlineOnLightAccentHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add(
        "outlineOnLightAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccentActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromoHover, overwrite)
    initial.add("outlineOnLightPromoActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromoActive, overwrite)
    initial.add("outlineOnLightPromo", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromo, overwrite)
    initial.add(
        "outlineOnLightPromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPromoMinor, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add("outlineOnLightInfoHover", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfoActive", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add(
        "outlineOnLightPositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnLightClear", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightClear, overwrite)
    initial.add(
        "outlineOnLightTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add("outlineOnLightPositive", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add("outlineOnLightAccent", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add("outlineOnLightWarning", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightNegative", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfo", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfo, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnLightInfoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefault",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineInverseClearHover", com.sdds.serv.tokens.LightColorTokens.OutlineInverseClearHover, overwrite)
    initial.add("outlineInverseClearActive", com.sdds.serv.tokens.LightColorTokens.OutlineInverseClearActive, overwrite)
    initial.add("outlineInverseAccentHover", com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add(
        "outlineInverseAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccentActive,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineInversePromoHover", com.sdds.serv.tokens.LightColorTokens.OutlineInversePromoHover, overwrite)
    initial.add("outlineInversePromoActive", com.sdds.serv.tokens.LightColorTokens.OutlineInversePromoActive, overwrite)
    initial.add("outlineInversePromo", com.sdds.serv.tokens.LightColorTokens.OutlineInversePromo, overwrite)
    initial.add(
        "outlineInversePromoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePromoMinorActive,
        overwrite,
    )
    initial.add("outlineInversePromoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineInversePromoMinor, overwrite)
    initial.add(
        "outlineInversePositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add("outlineInverseInfoHover", com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoHover",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoActive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineInverseClear", com.sdds.serv.tokens.LightColorTokens.OutlineInverseClear, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositive",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarning",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegative",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfo",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidPrimary,
        overwrite,
    )
    initial.add("outlineInverseAccent", com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", com.sdds.serv.tokens.LightColorTokens.OutlineInverseAccentMinor, overwrite)
    initial.add("outlineInversePositive", com.sdds.serv.tokens.LightColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseWarning", com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseNegative", com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfo", com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "outlineInversePositiveMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinor",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseNegativeMinor,
        overwrite,
    )
    initial.add("outlineInverseInfoMinor", com.sdds.serv.tokens.LightColorTokens.OutlineInverseInfoMinor, overwrite)
    initial.add(
        "outlineInverseTransparentPrimary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiary",
        com.sdds.serv.tokens.LightColorTokens.OutlineInverseSolidTertiary,
        overwrite,
    )
    return SddsServColors(initial)
}

/**
 * Цвета [SddsServColors] для темной темы
 */
@Suppress("LongMethod")
public fun darkSddsServColors(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsServColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("textDefaultPrimaryHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultPrimary", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondaryHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add("textDefaultSecondaryActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultSecondaryActive, overwrite)
    initial.add("textDefaultSecondary", com.sdds.serv.tokens.DarkColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiaryHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiary", com.sdds.serv.tokens.DarkColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraphHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add("textDefaultParagraphActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultParagraphActive, overwrite)
    initial.add("textDefaultParagraph", com.sdds.serv.tokens.DarkColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccentHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultAccent", com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccent, overwrite)
    initial.add(
        "textDefaultAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromoHover, overwrite)
    initial.add("textDefaultPromoActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromoActive, overwrite)
    initial.add("textDefaultPromo", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromo, overwrite)
    initial.add("textDefaultPromoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromoMinorHover, overwrite)
    initial.add(
        "textDefaultPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPromoMinor, overwrite)
    initial.add("textDefaultPositiveHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarningHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarning", com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegativeHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegative", com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegative, overwrite)
    initial.add("textDefaultInfoHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultInfoActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfoActive, overwrite)
    initial.add(
        "textDefaultPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add("textDefaultInfoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfoMinorHover, overwrite)
    initial.add("textDefaultInfoMinorActive", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfoMinorActive, overwrite)
    initial.add("textDefaultAccentMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add("textDefaultInfo", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultPositiveMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfoMinor", com.sdds.serv.tokens.DarkColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textOnDarkPrimaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkPrimary", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkSecondary", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkTertiary", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraphHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkParagraph", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccentHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkAccent", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccent, overwrite)
    initial.add("textOnDarkAccentMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccentMinorHover, overwrite)
    initial.add(
        "textOnDarkAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkPromoHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromoHover, overwrite)
    initial.add("textOnDarkPromoActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromoActive, overwrite)
    initial.add("textOnDarkPromo", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromo, overwrite)
    initial.add("textOnDarkPromoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromoMinorHover, overwrite)
    initial.add("textOnDarkPromoMinorActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromoMinorActive, overwrite)
    initial.add("textOnDarkPromoMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPromoMinor, overwrite)
    initial.add("textOnDarkPositiveHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkPositive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarningHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkWarning", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegativeHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkNegative", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkInfoHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add(
        "textOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfoMinorHover, overwrite)
    initial.add("textOnDarkInfoMinorActive", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfoMinorActive, overwrite)
    initial.add("textOnDarkAccentMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkInfo", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPositiveMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add("textOnDarkWarningMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add("textOnDarkNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add("textOnDarkInfoMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimary", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add("textOnLightSecondaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightSecondaryActive, overwrite)
    initial.add("textOnLightSecondary", com.sdds.serv.tokens.DarkColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiaryHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightTertiary", com.sdds.serv.tokens.DarkColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraphHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add("textOnLightParagraphActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightParagraphActive, overwrite)
    initial.add("textOnLightParagraph", com.sdds.serv.tokens.DarkColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccentHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccent", com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccent, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromoHover, overwrite)
    initial.add("textOnLightPromoActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromoActive, overwrite)
    initial.add("textOnLightPromo", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromo, overwrite)
    initial.add("textOnLightPromoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromoMinorHover, overwrite)
    initial.add(
        "textOnLightPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPromoMinor, overwrite)
    initial.add("textOnLightPositiveHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPositive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarningHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textOnLightWarning", com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightNegativeHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegative", com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightInfoHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfoActive, overwrite)
    initial.add(
        "textOnLightPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add("textOnLightInfoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfoMinorHover, overwrite)
    initial.add("textOnLightInfoMinorActive", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfoMinorActive, overwrite)
    initial.add("textOnLightInfo", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightWarningMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add("textOnLightPositiveMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add("textOnLightAccentMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add("textOnLightInfoMinor", com.sdds.serv.tokens.DarkColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textInversePrimaryHover", com.sdds.serv.tokens.DarkColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", com.sdds.serv.tokens.DarkColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimary", com.sdds.serv.tokens.DarkColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondaryHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add("textInverseSecondaryActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseSecondaryActive, overwrite)
    initial.add("textInverseSecondary", com.sdds.serv.tokens.DarkColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiaryHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseTertiary", com.sdds.serv.tokens.DarkColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraphHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseParagraphHover, overwrite)
    initial.add("textInverseParagraphActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseParagraphActive, overwrite)
    initial.add("textInverseParagraph", com.sdds.serv.tokens.DarkColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInverseAccentHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccent", com.sdds.serv.tokens.DarkColorTokens.TextInverseAccent, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInversePromoHover", com.sdds.serv.tokens.DarkColorTokens.TextInversePromoHover, overwrite)
    initial.add("textInversePromoActive", com.sdds.serv.tokens.DarkColorTokens.TextInversePromoActive, overwrite)
    initial.add("textInversePromo", com.sdds.serv.tokens.DarkColorTokens.TextInversePromo, overwrite)
    initial.add("textInversePromoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextInversePromoMinorHover, overwrite)
    initial.add(
        "textInversePromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextInversePromoMinorActive,
        overwrite,
    )
    initial.add("textInversePromoMinor", com.sdds.serv.tokens.DarkColorTokens.TextInversePromoMinor, overwrite)
    initial.add("textInversePositiveHover", com.sdds.serv.tokens.DarkColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", com.sdds.serv.tokens.DarkColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositive", com.sdds.serv.tokens.DarkColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarningHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseWarning", com.sdds.serv.tokens.DarkColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegativeHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegative", com.sdds.serv.tokens.DarkColorTokens.TextInverseNegative, overwrite)
    initial.add("textInverseInfoHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseInfoActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfoActive, overwrite)
    initial.add(
        "textInversePositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.TextInverseNegativeMinorActive,
        overwrite,
    )
    initial.add("textInverseInfoMinorHover", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfoMinorHover, overwrite)
    initial.add("textInverseInfoMinorActive", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfoMinorActive, overwrite)
    initial.add("textInverseAccentMinor", com.sdds.serv.tokens.DarkColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseInfo", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", com.sdds.serv.tokens.DarkColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", com.sdds.serv.tokens.DarkColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", com.sdds.serv.tokens.DarkColorTokens.TextInverseInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add("surfaceDefaultSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidPrimary, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add("surfaceDefaultSolidCard", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceDefaultSolidDefault", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultSolidDefault, overwrite)
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeep",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultClearHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultAccentHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add("surfaceDefaultAccentActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccentActive, overwrite)
    initial.add("surfaceDefaultAccent", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add(
        "surfaceDefaultAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add("surfaceDefaultPromoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromoHover, overwrite)
    initial.add("surfaceDefaultPromoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromoActive, overwrite)
    initial.add("surfaceDefaultPromo", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromo, overwrite)
    initial.add(
        "surfaceDefaultPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceDefaultPromoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPromoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPromoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add("surfaceDefaultPositive", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add("surfaceDefaultWarningHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarningHover, overwrite)
    initial.add(
        "surfaceDefaultWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add("surfaceDefaultWarning", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarning, overwrite)
    initial.add(
        "surfaceDefaultNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultNegative", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add("surfaceDefaultInfoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultInfoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add("surfaceDefaultInfo", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add(
        "surfaceDefaultPositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultPositiveMinor,
        overwrite,
    )
    initial.add("surfaceDefaultWarningMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultWarningMinor, overwrite)
    initial.add(
        "surfaceDefaultNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultNegativeMinor,
        overwrite,
    )
    initial.add("surfaceDefaultInfoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultInfoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidTertiary", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidTertiary, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidCard", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeep",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCard",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkClear", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkAccentHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add("surfaceOnDarkAccent", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromoHover, overwrite)
    initial.add("surfaceOnDarkPromoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromoActive, overwrite)
    initial.add("surfaceOnDarkPromo", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromo, overwrite)
    initial.add(
        "surfaceOnDarkPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPromoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPromoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPromo,
        overwrite,
    )
    initial.add("surfaceOnDarkPositiveHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositiveHover, overwrite)
    initial.add(
        "surfaceOnDarkPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarningHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add("surfaceOnDarkWarningActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarningActive, overwrite)
    initial.add("surfaceOnDarkWarning", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkNegativeHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegativeHover, overwrite)
    initial.add(
        "surfaceOnDarkNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkNegative", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkInfoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfoActive, overwrite)
    initial.add(
        "surfaceOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnDarkInfo", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add("surfaceOnDarkPositiveMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkPositiveMinor, overwrite)
    initial.add("surfaceOnDarkWarningMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add("surfaceOnDarkNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkNegativeMinor, overwrite)
    initial.add("surfaceOnDarkInfoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkInfoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidPrimary, overwrite)
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidCard", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidDefault", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightSolidDefault, overwrite)
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeep",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightClearHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightClear", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightClear, overwrite)
    initial.add("surfaceOnLightAccentHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add("surfaceOnLightAccentActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccentActive, overwrite)
    initial.add("surfaceOnLightAccent", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromoHover, overwrite)
    initial.add("surfaceOnLightPromoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromoActive, overwrite)
    initial.add("surfaceOnLightPromo", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromo, overwrite)
    initial.add(
        "surfaceOnLightPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPromoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentPromoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnLightPositive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add("surfaceOnLightWarningHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarningHover, overwrite)
    initial.add(
        "surfaceOnLightWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarning", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add(
        "surfaceOnLightNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightNegative", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightInfoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add("surfaceOnLightWarningMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightWarningMinor, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnLightInfoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightNegativeMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add("surfaceInverseSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidPrimary, overwrite)
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceInverseSolidDefault", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseSolidDefault, overwrite)
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeep",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCard",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseClear, overwrite)
    initial.add("surfaceInverseAccentHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add("surfaceInverseAccentActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccentActive, overwrite)
    initial.add("surfaceInverseAccent", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccent, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInversePromoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromoHover, overwrite)
    initial.add("surfaceInversePromoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromoActive, overwrite)
    initial.add("surfaceInversePromo", com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromo, overwrite)
    initial.add(
        "surfaceInversePromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromoMinorActive,
        overwrite,
    )
    initial.add("surfaceInversePromoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePromoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPromoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPromo,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add("surfaceInversePositive", com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositive, overwrite)
    initial.add("surfaceInverseWarningHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarningHover, overwrite)
    initial.add(
        "surfaceInverseWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add("surfaceInverseWarning", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarning, overwrite)
    initial.add(
        "surfaceInverseNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInverseNegative", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInversePositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfo", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add("surfaceInverseWarningMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseWarningMinor, overwrite)
    initial.add(
        "surfaceInverseNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.SurfaceInverseTransparentInfo,
        overwrite,
    )
    initial.add("backgroundDefaultPrimary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add(
        "backgroundDefaultPrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.BackgroundDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("backgroundDefaultSecondary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDefaultSecondary, overwrite)
    initial.add("backgroundDefaultTertiary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundDarkPrimary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundDarkSecondary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add("backgroundDarkTertiary", com.sdds.serv.tokens.DarkColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundLightPrimary", com.sdds.serv.tokens.DarkColorTokens.BackgroundLightPrimary, overwrite)
    initial.add("backgroundLightSecondary", com.sdds.serv.tokens.DarkColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("backgroundLightTertiary", com.sdds.serv.tokens.DarkColorTokens.BackgroundLightTertiary, overwrite)
    initial.add("backgroundInversePrimary", com.sdds.serv.tokens.DarkColorTokens.BackgroundInversePrimary, overwrite)
    initial.add(
        "backgroundInversePrimaryBrightness",
        com.sdds.serv.tokens.DarkColorTokens.BackgroundInversePrimaryBrightness,
        overwrite,
    )
    initial.add("backgroundInverseSecondary", com.sdds.serv.tokens.DarkColorTokens.BackgroundInverseSecondary, overwrite)
    initial.add("backgroundInverseTertiary", com.sdds.serv.tokens.DarkColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("overlayDefaultSoft", com.sdds.serv.tokens.DarkColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", com.sdds.serv.tokens.DarkColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", com.sdds.serv.tokens.DarkColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", com.sdds.serv.tokens.DarkColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", com.sdds.serv.tokens.DarkColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", com.sdds.serv.tokens.DarkColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", com.sdds.serv.tokens.DarkColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", com.sdds.serv.tokens.DarkColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", com.sdds.serv.tokens.DarkColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseSoft", com.sdds.serv.tokens.DarkColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseHard", com.sdds.serv.tokens.DarkColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseBlur", com.sdds.serv.tokens.DarkColorTokens.OverlayInverseBlur, overwrite)
    initial.add(
        "outlineDefaultSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefault",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineDefaultClearHover", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultClearActive", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultClearActive, overwrite)
    initial.add("outlineDefaultAccentHover", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add("outlineDefaultAccentActive", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccentActive, overwrite)
    initial.add(
        "outlineDefaultAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromoHover, overwrite)
    initial.add("outlineDefaultPromoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromoActive, overwrite)
    initial.add("outlineDefaultPromo", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromo, overwrite)
    initial.add(
        "outlineDefaultPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPromoMinor, overwrite)
    initial.add(
        "outlineDefaultPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add("outlineDefaultWarningHover", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarningHover, overwrite)
    initial.add(
        "outlineDefaultWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add("outlineDefaultInfoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add("outlineDefaultInfoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineDefaultPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineDefaultClear", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultClear, overwrite)
    initial.add("outlineDefaultSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidPrimary, overwrite)
    initial.add(
        "outlineDefaultSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add("outlineDefaultAccent", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultWarning", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultPositive", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositive, overwrite)
    initial.add(
        "outlineDefaultTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add("outlineDefaultNegative", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultInfo", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfo, overwrite)
    initial.add(
        "outlineDefaultPositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultPositiveMinor,
        overwrite,
    )
    initial.add("outlineDefaultWarningMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultWarningMinor, overwrite)
    initial.add(
        "outlineDefaultNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultNegativeMinor,
        overwrite,
    )
    initial.add("outlineDefaultInfoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultInfoMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefault",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkClearHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add("outlineOnDarkAccentHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add(
        "outlineOnDarkAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromoHover, overwrite)
    initial.add("outlineOnDarkPromoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromoActive, overwrite)
    initial.add("outlineOnDarkPromo", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromo, overwrite)
    initial.add(
        "outlineOnDarkPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPromoMinor, overwrite)
    initial.add("outlineOnDarkPositiveHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositiveHover, overwrite)
    initial.add(
        "outlineOnDarkPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarningHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add("outlineOnDarkWarningActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarningActive, overwrite)
    initial.add("outlineOnDarkNegativeHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegativeHover, overwrite)
    initial.add(
        "outlineOnDarkNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnDarkClear", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add("outlineOnDarkAccent", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkWarning", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkNegative", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkInfo", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkPositiveMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkPositiveMinor, overwrite)
    initial.add("outlineOnDarkWarningMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add("outlineOnDarkNegativeMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkNegativeMinor, overwrite)
    initial.add("outlineOnDarkInfoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add("outlineOnDarkSolidTertiary", com.sdds.serv.tokens.DarkColorTokens.OutlineOnDarkSolidTertiary, overwrite)
    initial.add(
        "outlineOnLightSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefault",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightClearHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add("outlineOnLightClearActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add("outlineOnLightAccentHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add("outlineOnLightAccentActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccentActive, overwrite)
    initial.add(
        "outlineOnLightAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromoHover, overwrite)
    initial.add("outlineOnLightPromoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromoActive, overwrite)
    initial.add("outlineOnLightPromo", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromo, overwrite)
    initial.add(
        "outlineOnLightPromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPromoMinor, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add("outlineOnLightWarningHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarningHover, overwrite)
    initial.add(
        "outlineOnLightWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add("outlineOnLightInfoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add(
        "outlineOnLightPositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineOnLightClear", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightClear, overwrite)
    initial.add(
        "outlineOnLightTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add("outlineOnLightPositive", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add("outlineOnLightSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidPrimary, overwrite)
    initial.add(
        "outlineOnLightSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add("outlineOnLightAccent", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add("outlineOnLightWarning", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightNegative", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfo", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfo, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add("outlineOnLightWarningMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightWarningMinor, overwrite)
    initial.add(
        "outlineOnLightNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnLightInfoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefault",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentDefault,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiaryActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineInverseClearHover", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseClearHover, overwrite)
    initial.add("outlineInverseClearActive", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseClearActive, overwrite)
    initial.add("outlineInverseAccentHover", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add("outlineInverseAccentActive", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccentActive, overwrite)
    initial.add(
        "outlineInverseAccentMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseAccentMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentAccentActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineInversePromoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromoHover, overwrite)
    initial.add("outlineInversePromoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromoActive, overwrite)
    initial.add("outlineInversePromo", com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromo, overwrite)
    initial.add(
        "outlineInversePromoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromoMinorActive,
        overwrite,
    )
    initial.add("outlineInversePromoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineInversePromoMinor, overwrite)
    initial.add(
        "outlineInversePositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add("outlineInverseWarningHover", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarningHover, overwrite)
    initial.add(
        "outlineInverseWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add("outlineInverseInfoHover", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositiveMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarningMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarningMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegativeMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInverseInfoMinorActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfoMinorActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositiveActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentWarningHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarningActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegativeActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoHover",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfoActive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("outlineInverseClear", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseClear, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPositive",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWarning",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentNegative",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentInfo",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentInfo,
        overwrite,
    )
    initial.add("outlineInverseSolidPrimary", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidPrimary, overwrite)
    initial.add("outlineInverseAccent", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseAccentMinor, overwrite)
    initial.add("outlineInversePositive", com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseWarning", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseNegative", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfo", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "outlineInversePositiveMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInversePositiveMinor,
        overwrite,
    )
    initial.add("outlineInverseWarningMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseWarningMinor, overwrite)
    initial.add(
        "outlineInverseNegativeMinor",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseNegativeMinor,
        overwrite,
    )
    initial.add("outlineInverseInfoMinor", com.sdds.serv.tokens.DarkColorTokens.OutlineInverseInfoMinor, overwrite)
    initial.add(
        "outlineInverseTransparentPrimary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidSecondary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineInverseSolidTertiary",
        com.sdds.serv.tokens.DarkColorTokens.OutlineInverseSolidTertiary,
        overwrite,
    )
    return SddsServColors(initial)
}

private fun Map<String, Color>.obtain(name: String): MutableState<Color> =
    mutableStateOf(get(name)!!, structuralEqualityPolicy())
