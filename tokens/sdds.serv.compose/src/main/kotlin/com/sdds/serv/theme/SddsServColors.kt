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
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccent: Color by
        colors.obtain("surfaceDefaultTransparentAccent")

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
     * light outline default outlineSolidDefault
     */
    public var outlineDefaultSolidDefault: Color by colors.obtain("outlineDefaultSolidDefault")

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
     * light outline onLight outlineSolidDefault
     */
    public var outlineOnLightSolidDefault: Color by colors.obtain("outlineOnLightSolidDefault")

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
     * light outline inverse outlineSolidDefault
     */
    public var outlineInverseSolidDefault: Color by colors.obtain("outlineInverseSolidDefault")

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
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccent: String = "surfaceDefaultTransparentAccent"

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
     * light outline default outlineSolidDefault
     */
    public val outlineDefaultSolidDefault: String = "outlineDefaultSolidDefault"

    /**
     * light outline default outlineSolidDefaultHover
     */
    public val outlineDefaultSolidDefaultHover: String = "outlineDefaultSolidDefaultHover"

    /**
     * light outline default outlineSolidDefaultActive
     */
    public val outlineDefaultSolidDefaultActive: String = "outlineDefaultSolidDefaultActive"

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
     * light outline onLight outlineSolidDefault
     */
    public val outlineOnLightSolidDefault: String = "outlineOnLightSolidDefault"

    /**
     * light outline onLight outlineSolidDefaultHover
     */
    public val outlineOnLightSolidDefaultHover: String = "outlineOnLightSolidDefaultHover"

    /**
     * light outline onLight outlineSolidDefaultActive
     */
    public val outlineOnLightSolidDefaultActive: String = "outlineOnLightSolidDefaultActive"

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
     * light outline inverse outlineSolidDefault
     */
    public val outlineInverseSolidDefault: String = "outlineInverseSolidDefault"

    /**
     * light outline inverse outlineSolidDefaultHover
     */
    public val outlineInverseSolidDefaultHover: String = "outlineInverseSolidDefaultHover"

    /**
     * light outline inverse outlineSolidDefaultActive
     */
    public val outlineInverseSolidDefaultActive: String = "outlineInverseSolidDefaultActive"

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
    surfaceDefaultTransparentAccent = other.surfaceDefaultTransparentAccent
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
    outlineDefaultSolidDefault = other.outlineDefaultSolidDefault
    outlineDefaultSolidDefaultHover = other.outlineDefaultSolidDefaultHover
    outlineDefaultSolidDefaultActive = other.outlineDefaultSolidDefaultActive
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
    outlineOnDarkSolidDefault = other.outlineOnDarkSolidDefault
    outlineOnDarkSolidDefaultHover = other.outlineOnDarkSolidDefaultHover
    outlineOnDarkSolidDefaultActive = other.outlineOnDarkSolidDefaultActive
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
    outlineOnLightSolidDefault = other.outlineOnLightSolidDefault
    outlineOnLightSolidDefaultHover = other.outlineOnLightSolidDefaultHover
    outlineOnLightSolidDefaultActive = other.outlineOnLightSolidDefaultActive
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
    outlineInverseSolidDefault = other.outlineInverseSolidDefault
    outlineInverseSolidDefaultHover = other.outlineInverseSolidDefaultHover
    outlineInverseSolidDefaultActive = other.outlineInverseSolidDefaultActive
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
 * Цвета [SddsServColors] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsServColors(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsServColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("textDefaultPrimaryHover", LightColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", LightColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultPrimary", LightColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        LightColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondaryHover", LightColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add(
        "textDefaultSecondaryActive",
        LightColorTokens.TextDefaultSecondaryActive,
        overwrite,
    )
    initial.add("textDefaultSecondary", LightColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiaryHover", LightColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", LightColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiary", LightColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraphHover", LightColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add(
        "textDefaultParagraphActive",
        LightColorTokens.TextDefaultParagraphActive,
        overwrite,
    )
    initial.add("textDefaultParagraph", LightColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccentHover", LightColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", LightColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultAccent", LightColorTokens.TextDefaultAccent, overwrite)
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
    initial.add("textDefaultPromoHover", LightColorTokens.TextDefaultPromoHover, overwrite)
    initial.add("textDefaultPromoActive", LightColorTokens.TextDefaultPromoActive, overwrite)
    initial.add("textDefaultPromo", LightColorTokens.TextDefaultPromo, overwrite)
    initial.add(
        "textDefaultPromoMinorHover",
        LightColorTokens.TextDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "textDefaultPromoMinorActive",
        LightColorTokens.TextDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoMinor", LightColorTokens.TextDefaultPromoMinor, overwrite)
    initial.add("textDefaultPositiveHover", LightColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", LightColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositive", LightColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarningHover", LightColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", LightColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarning", LightColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegativeHover", LightColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", LightColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegative", LightColorTokens.TextDefaultNegative, overwrite)
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
    initial.add("textDefaultInfo", LightColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultPositiveMinor", LightColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", LightColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", LightColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfoMinor", LightColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textOnDarkPrimaryHover", LightColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", LightColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkPrimary", LightColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        LightColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondaryHover", LightColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", LightColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkSecondary", LightColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiaryHover", LightColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", LightColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkTertiary", LightColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraphHover", LightColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", LightColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkParagraph", LightColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccentHover", LightColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", LightColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkAccent", LightColorTokens.TextOnDarkAccent, overwrite)
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
    initial.add("textOnDarkPromoHover", LightColorTokens.TextOnDarkPromoHover, overwrite)
    initial.add("textOnDarkPromoActive", LightColorTokens.TextOnDarkPromoActive, overwrite)
    initial.add("textOnDarkPromo", LightColorTokens.TextOnDarkPromo, overwrite)
    initial.add("textOnDarkPromoMinorHover", LightColorTokens.TextOnDarkPromoMinorHover, overwrite)
    initial.add(
        "textOnDarkPromoMinorActive",
        LightColorTokens.TextOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("textOnDarkPromoMinor", LightColorTokens.TextOnDarkPromoMinor, overwrite)
    initial.add("textOnDarkPositiveHover", LightColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", LightColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkPositive", LightColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarningHover", LightColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", LightColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkWarning", LightColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegativeHover", LightColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", LightColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkNegative", LightColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkInfoHover", LightColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", LightColorTokens.TextOnDarkInfoActive, overwrite)
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
    initial.add("textOnDarkAccentMinor", LightColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkInfo", LightColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPositiveMinor", LightColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add("textOnDarkWarningMinor", LightColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add("textOnDarkNegativeMinor", LightColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add("textOnDarkInfoMinor", LightColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", LightColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", LightColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimary", LightColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        LightColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondaryHover", LightColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add(
        "textOnLightSecondaryActive",
        LightColorTokens.TextOnLightSecondaryActive,
        overwrite,
    )
    initial.add("textOnLightSecondary", LightColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiaryHover", LightColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", LightColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightTertiary", LightColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraphHover", LightColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add(
        "textOnLightParagraphActive",
        LightColorTokens.TextOnLightParagraphActive,
        overwrite,
    )
    initial.add("textOnLightParagraph", LightColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccentHover", LightColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", LightColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccent", LightColorTokens.TextOnLightAccent, overwrite)
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
    initial.add("textOnLightPromoHover", LightColorTokens.TextOnLightPromoHover, overwrite)
    initial.add("textOnLightPromoActive", LightColorTokens.TextOnLightPromoActive, overwrite)
    initial.add("textOnLightPromo", LightColorTokens.TextOnLightPromo, overwrite)
    initial.add(
        "textOnLightPromoMinorHover",
        LightColorTokens.TextOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightPromoMinorActive",
        LightColorTokens.TextOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoMinor", LightColorTokens.TextOnLightPromoMinor, overwrite)
    initial.add("textOnLightPositiveHover", LightColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", LightColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPositive", LightColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarningHover", LightColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", LightColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textOnLightWarning", LightColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightNegativeHover", LightColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", LightColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegative", LightColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightInfoHover", LightColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", LightColorTokens.TextOnLightInfoActive, overwrite)
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
    initial.add("textOnLightInfo", LightColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightWarningMinor", LightColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add("textOnLightPositiveMinor", LightColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add("textOnLightAccentMinor", LightColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightNegativeMinor", LightColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add("textOnLightInfoMinor", LightColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textInversePrimaryHover", LightColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", LightColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimary", LightColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        LightColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondaryHover", LightColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add(
        "textInverseSecondaryActive",
        LightColorTokens.TextInverseSecondaryActive,
        overwrite,
    )
    initial.add("textInverseSecondary", LightColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiaryHover", LightColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", LightColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseTertiary", LightColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraphHover", LightColorTokens.TextInverseParagraphHover, overwrite)
    initial.add(
        "textInverseParagraphActive",
        LightColorTokens.TextInverseParagraphActive,
        overwrite,
    )
    initial.add("textInverseParagraph", LightColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInverseAccentHover", LightColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", LightColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccent", LightColorTokens.TextInverseAccent, overwrite)
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
    initial.add("textInversePromoHover", LightColorTokens.TextInversePromoHover, overwrite)
    initial.add("textInversePromoActive", LightColorTokens.TextInversePromoActive, overwrite)
    initial.add("textInversePromo", LightColorTokens.TextInversePromo, overwrite)
    initial.add(
        "textInversePromoMinorHover",
        LightColorTokens.TextInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "textInversePromoMinorActive",
        LightColorTokens.TextInversePromoMinorActive,
        overwrite,
    )
    initial.add("textInversePromoMinor", LightColorTokens.TextInversePromoMinor, overwrite)
    initial.add("textInversePositiveHover", LightColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", LightColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositive", LightColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarningHover", LightColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", LightColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseWarning", LightColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegativeHover", LightColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", LightColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegative", LightColorTokens.TextInverseNegative, overwrite)
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
    initial.add("textInverseAccentMinor", LightColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseInfo", LightColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", LightColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", LightColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", LightColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", LightColorTokens.TextInverseInfoMinor, overwrite)
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
        "surfaceDefaultSolidSecondary",
        LightColorTokens.SurfaceDefaultSolidSecondary,
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
        "surfaceDefaultSolidTertiary",
        LightColorTokens.SurfaceDefaultSolidTertiary,
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
    initial.add("surfaceDefaultSolidCard", LightColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        LightColorTokens.SurfaceDefaultSolidCardBrightness,
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
        "surfaceDefaultSolidDefault",
        LightColorTokens.SurfaceDefaultSolidDefault,
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
        "surfaceDefaultTransparentSecondary",
        LightColorTokens.SurfaceDefaultTransparentSecondary,
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
        "surfaceDefaultTransparentTertiary",
        LightColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
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
    initial.add(
        "surfaceDefaultTransparentDeep",
        LightColorTokens.SurfaceDefaultTransparentDeep,
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
    initial.add("surfaceDefaultClearHover", LightColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", LightColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", LightColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultAccentHover", LightColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add(
        "surfaceDefaultAccentActive",
        LightColorTokens.SurfaceDefaultAccentActive,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", LightColorTokens.SurfaceDefaultAccent, overwrite)
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
    initial.add("surfaceDefaultPromoHover", LightColorTokens.SurfaceDefaultPromoHover, overwrite)
    initial.add("surfaceDefaultPromoActive", LightColorTokens.SurfaceDefaultPromoActive, overwrite)
    initial.add("surfaceDefaultPromo", LightColorTokens.SurfaceDefaultPromo, overwrite)
    initial.add(
        "surfaceDefaultPromoMinorHover",
        LightColorTokens.SurfaceDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorActive",
        LightColorTokens.SurfaceDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceDefaultPromoMinor", LightColorTokens.SurfaceDefaultPromoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPromoHover",
        LightColorTokens.SurfaceDefaultTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoActive",
        LightColorTokens.SurfaceDefaultTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromo",
        LightColorTokens.SurfaceDefaultTransparentPromo,
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
    initial.add("surfaceDefaultPositive", LightColorTokens.SurfaceDefaultPositive, overwrite)
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
    initial.add("surfaceDefaultWarning", LightColorTokens.SurfaceDefaultWarning, overwrite)
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
    initial.add("surfaceDefaultNegative", LightColorTokens.SurfaceDefaultNegative, overwrite)
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
    initial.add("surfaceDefaultInfo", LightColorTokens.SurfaceDefaultInfo, overwrite)
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
    initial.add("surfaceDefaultInfoMinor", LightColorTokens.SurfaceDefaultInfoMinor, overwrite)
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
    initial.add(
        "surfaceDefaultTransparentInfo",
        LightColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        LightColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        LightColorTokens.SurfaceDefaultTransparentAccent,
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
    initial.add("surfaceOnDarkSolidPrimary", LightColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        LightColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
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
        "surfaceOnDarkSolidSecondary",
        LightColorTokens.SurfaceOnDarkSolidSecondary,
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
        "surfaceOnDarkSolidTertiary",
        LightColorTokens.SurfaceOnDarkSolidTertiary,
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
    initial.add("surfaceOnDarkSolidCard", LightColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        LightColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
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
    initial.add("surfaceOnDarkSolidDefault", LightColorTokens.SurfaceOnDarkSolidDefault, overwrite)
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
        "surfaceOnDarkTransparentPrimary",
        LightColorTokens.SurfaceOnDarkTransparentPrimary,
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
        "surfaceOnDarkTransparentSecondary",
        LightColorTokens.SurfaceOnDarkTransparentSecondary,
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
        "surfaceOnDarkTransparentTertiary",
        LightColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
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
        "surfaceOnDarkTransparentDeep",
        LightColorTokens.SurfaceOnDarkTransparentDeep,
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
        "surfaceOnDarkTransparentCard",
        LightColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        LightColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", LightColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", LightColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkClear", LightColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkAccentHover", LightColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", LightColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add("surfaceOnDarkAccent", LightColorTokens.SurfaceOnDarkAccent, overwrite)
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
        "surfaceOnDarkTransparentAccentHover",
        LightColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        LightColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoHover", LightColorTokens.SurfaceOnDarkPromoHover, overwrite)
    initial.add("surfaceOnDarkPromoActive", LightColorTokens.SurfaceOnDarkPromoActive, overwrite)
    initial.add("surfaceOnDarkPromo", LightColorTokens.SurfaceOnDarkPromo, overwrite)
    initial.add(
        "surfaceOnDarkPromoMinorHover",
        LightColorTokens.SurfaceOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorActive",
        LightColorTokens.SurfaceOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoMinor", LightColorTokens.SurfaceOnDarkPromoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPromoHover",
        LightColorTokens.SurfaceOnDarkTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoActive",
        LightColorTokens.SurfaceOnDarkTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromo",
        LightColorTokens.SurfaceOnDarkTransparentPromo,
        overwrite,
    )
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
    initial.add("surfaceOnDarkPositive", LightColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarningHover", LightColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add(
        "surfaceOnDarkWarningActive",
        LightColorTokens.SurfaceOnDarkWarningActive,
        overwrite,
    )
    initial.add("surfaceOnDarkWarning", LightColorTokens.SurfaceOnDarkWarning, overwrite)
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
    initial.add("surfaceOnDarkNegative", LightColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkInfoHover", LightColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfoActive", LightColorTokens.SurfaceOnDarkInfoActive, overwrite)
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
    initial.add("surfaceOnDarkAccentMinor", LightColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccent",
        LightColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnDarkInfo", LightColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add(
        "surfaceOnDarkPositiveMinor",
        LightColorTokens.SurfaceOnDarkPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnDarkWarningMinor", LightColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add(
        "surfaceOnDarkNegativeMinor",
        LightColorTokens.SurfaceOnDarkNegativeMinor,
        overwrite,
    )
    initial.add("surfaceOnDarkInfoMinor", LightColorTokens.SurfaceOnDarkInfoMinor, overwrite)
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
    initial.add(
        "surfaceOnDarkTransparentInfo",
        LightColorTokens.SurfaceOnDarkTransparentInfo,
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
        "surfaceOnLightSolidSecondary",
        LightColorTokens.SurfaceOnLightSolidSecondary,
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
        "surfaceOnLightSolidTertiary",
        LightColorTokens.SurfaceOnLightSolidTertiary,
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
    initial.add("surfaceOnLightSolidCard", LightColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        LightColorTokens.SurfaceOnLightSolidCardBrightness,
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
        "surfaceOnLightSolidDefault",
        LightColorTokens.SurfaceOnLightSolidDefault,
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
        "surfaceOnLightTransparentSecondary",
        LightColorTokens.SurfaceOnLightTransparentSecondary,
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
        "surfaceOnLightTransparentTertiary",
        LightColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
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
        "surfaceOnLightTransparentDeep",
        LightColorTokens.SurfaceOnLightTransparentDeep,
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
    initial.add("surfaceOnLightClearHover", LightColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", LightColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightClear", LightColorTokens.SurfaceOnLightClear, overwrite)
    initial.add("surfaceOnLightAccentHover", LightColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add(
        "surfaceOnLightAccentActive",
        LightColorTokens.SurfaceOnLightAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccent", LightColorTokens.SurfaceOnLightAccent, overwrite)
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
        "surfaceOnLightTransparentAccentHover",
        LightColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        LightColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoHover", LightColorTokens.SurfaceOnLightPromoHover, overwrite)
    initial.add("surfaceOnLightPromoActive", LightColorTokens.SurfaceOnLightPromoActive, overwrite)
    initial.add("surfaceOnLightPromo", LightColorTokens.SurfaceOnLightPromo, overwrite)
    initial.add(
        "surfaceOnLightPromoMinorHover",
        LightColorTokens.SurfaceOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorActive",
        LightColorTokens.SurfaceOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoMinor", LightColorTokens.SurfaceOnLightPromoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentPromoHover",
        LightColorTokens.SurfaceOnLightTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoActive",
        LightColorTokens.SurfaceOnLightTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromo",
        LightColorTokens.SurfaceOnLightTransparentPromo,
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
    initial.add("surfaceOnLightPositive", LightColorTokens.SurfaceOnLightPositive, overwrite)
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
    initial.add("surfaceOnLightWarning", LightColorTokens.SurfaceOnLightWarning, overwrite)
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
    initial.add("surfaceOnLightNegative", LightColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightInfoHover", LightColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", LightColorTokens.SurfaceOnLightInfoActive, overwrite)
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
    initial.add("surfaceOnLightAccentMinor", LightColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccent",
        LightColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", LightColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add(
        "surfaceOnLightWarningMinor",
        LightColorTokens.SurfaceOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveMinor",
        LightColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnLightInfoMinor", LightColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightNegativeMinor",
        LightColorTokens.SurfaceOnLightNegativeMinor,
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
    initial.add(
        "surfaceOnLightTransparentInfo",
        LightColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        LightColorTokens.SurfaceOnLightTransparentPrimary,
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
        "surfaceInverseSolidSecondary",
        LightColorTokens.SurfaceInverseSolidSecondary,
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
        "surfaceInverseSolidTertiary",
        LightColorTokens.SurfaceInverseSolidTertiary,
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
    initial.add("surfaceInverseSolidCard", LightColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        LightColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
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
        "surfaceInverseSolidDefault",
        LightColorTokens.SurfaceInverseSolidDefault,
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
        "surfaceInverseTransparentPrimary",
        LightColorTokens.SurfaceInverseTransparentPrimary,
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
        "surfaceInverseTransparentSecondary",
        LightColorTokens.SurfaceInverseTransparentSecondary,
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
        "surfaceInverseTransparentTertiary",
        LightColorTokens.SurfaceInverseTransparentTertiary,
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
    initial.add(
        "surfaceInverseTransparentDeep",
        LightColorTokens.SurfaceInverseTransparentDeep,
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
    initial.add("surfaceInverseClearHover", LightColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", LightColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", LightColorTokens.SurfaceInverseClear, overwrite)
    initial.add("surfaceInverseAccentHover", LightColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add(
        "surfaceInverseAccentActive",
        LightColorTokens.SurfaceInverseAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseAccent", LightColorTokens.SurfaceInverseAccent, overwrite)
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
        "surfaceInverseTransparentAccentHover",
        LightColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        LightColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInversePromoHover", LightColorTokens.SurfaceInversePromoHover, overwrite)
    initial.add("surfaceInversePromoActive", LightColorTokens.SurfaceInversePromoActive, overwrite)
    initial.add("surfaceInversePromo", LightColorTokens.SurfaceInversePromo, overwrite)
    initial.add(
        "surfaceInversePromoMinorHover",
        LightColorTokens.SurfaceInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorActive",
        LightColorTokens.SurfaceInversePromoMinorActive,
        overwrite,
    )
    initial.add("surfaceInversePromoMinor", LightColorTokens.SurfaceInversePromoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPromoHover",
        LightColorTokens.SurfaceInverseTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoActive",
        LightColorTokens.SurfaceInverseTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromo",
        LightColorTokens.SurfaceInverseTransparentPromo,
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
    initial.add("surfaceInversePositive", LightColorTokens.SurfaceInversePositive, overwrite)
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
    initial.add("surfaceInverseWarning", LightColorTokens.SurfaceInverseWarning, overwrite)
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
    initial.add("surfaceInverseNegative", LightColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", LightColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", LightColorTokens.SurfaceInverseInfoActive, overwrite)
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
        "surfaceInverseNegativeMinorHover",
        LightColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        LightColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
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
        "surfaceInverseTransparentInfoHover",
        LightColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        LightColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", LightColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        LightColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfo", LightColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        LightColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningMinor",
        LightColorTokens.SurfaceInverseWarningMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinor",
        LightColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", LightColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPositive",
        LightColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        LightColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        LightColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        LightColorTokens.SurfaceInverseTransparentInfo,
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
    initial.add("backgroundInversePrimary", LightColorTokens.BackgroundInversePrimary, overwrite)
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
    initial.add("overlayDefaultSoft", LightColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", LightColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", LightColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", LightColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", LightColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", LightColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", LightColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", LightColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", LightColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseSoft", LightColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseHard", LightColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseBlur", LightColorTokens.OverlayInverseBlur, overwrite)
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
        "outlineDefaultTransparentDefaultHover",
        LightColorTokens.OutlineDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultActive",
        LightColorTokens.OutlineDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefault",
        LightColorTokens.OutlineDefaultTransparentDefault,
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
    initial.add("outlineDefaultClearHover", LightColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultClearActive", LightColorTokens.OutlineDefaultClearActive, overwrite)
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
    initial.add("outlineDefaultPromoHover", LightColorTokens.OutlineDefaultPromoHover, overwrite)
    initial.add("outlineDefaultPromoActive", LightColorTokens.OutlineDefaultPromoActive, overwrite)
    initial.add("outlineDefaultPromo", LightColorTokens.OutlineDefaultPromo, overwrite)
    initial.add(
        "outlineDefaultPromoMinorHover",
        LightColorTokens.OutlineDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorActive",
        LightColorTokens.OutlineDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoMinor", LightColorTokens.OutlineDefaultPromoMinor, overwrite)
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
        "outlineDefaultTransparentNegativeHover",
        LightColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        LightColorTokens.OutlineDefaultTransparentNegativeActive,
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
    initial.add("outlineDefaultClear", LightColorTokens.OutlineDefaultClear, overwrite)
    initial.add(
        "outlineDefaultSolidPrimary",
        LightColorTokens.OutlineDefaultSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidTertiary",
        LightColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add("outlineDefaultAccent", LightColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", LightColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        LightColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultWarning", LightColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultPositive", LightColorTokens.OutlineDefaultPositive, overwrite)
    initial.add(
        "outlineDefaultTransparentPositive",
        LightColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add("outlineDefaultNegative", LightColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultInfo", LightColorTokens.OutlineDefaultInfo, overwrite)
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
    initial.add("outlineDefaultInfoMinor", LightColorTokens.OutlineDefaultInfoMinor, overwrite)
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
        "outlineDefaultTransparentInfo",
        LightColorTokens.OutlineDefaultTransparentInfo,
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
        "outlineDefaultSolidSecondary",
        LightColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineDefaultSolidDefault",
        LightColorTokens.OutlineDefaultSolidDefault,
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
        "outlineOnDarkSolidTertiaryHover",
        LightColorTokens.OutlineOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiaryActive",
        LightColorTokens.OutlineOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultHover",
        LightColorTokens.OutlineOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultActive",
        LightColorTokens.OutlineOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefault",
        LightColorTokens.OutlineOnDarkTransparentDefault,
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
        "outlineOnDarkTransparentTertiaryHover",
        LightColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        LightColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkClearHover", LightColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", LightColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add("outlineOnDarkAccentHover", LightColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", LightColorTokens.OutlineOnDarkAccentActive, overwrite)
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
        "outlineOnDarkTransparentAccentHover",
        LightColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        LightColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoHover", LightColorTokens.OutlineOnDarkPromoHover, overwrite)
    initial.add("outlineOnDarkPromoActive", LightColorTokens.OutlineOnDarkPromoActive, overwrite)
    initial.add("outlineOnDarkPromo", LightColorTokens.OutlineOnDarkPromo, overwrite)
    initial.add(
        "outlineOnDarkPromoMinorHover",
        LightColorTokens.OutlineOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorActive",
        LightColorTokens.OutlineOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoMinor", LightColorTokens.OutlineOnDarkPromoMinor, overwrite)
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
    initial.add("outlineOnDarkWarningHover", LightColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add(
        "outlineOnDarkWarningActive",
        LightColorTokens.OutlineOnDarkWarningActive,
        overwrite,
    )
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
        "outlineOnDarkPositiveMinorHover",
        LightColorTokens.OutlineOnDarkPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveMinorActive",
        LightColorTokens.OutlineOnDarkPositiveMinorActive,
        overwrite,
    )
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
        "outlineOnDarkTransparentNegativeHover",
        LightColorTokens.OutlineOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeActive",
        LightColorTokens.OutlineOnDarkTransparentNegativeActive,
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
    initial.add("outlineOnDarkClear", LightColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkSolidPrimary", LightColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add("outlineOnDarkAccent", LightColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentMinor", LightColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentAccent",
        LightColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        LightColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", LightColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkWarning", LightColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkNegative", LightColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkInfo", LightColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add(
        "outlineOnDarkPositiveMinor",
        LightColorTokens.OutlineOnDarkPositiveMinor,
        overwrite,
    )
    initial.add("outlineOnDarkWarningMinor", LightColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add(
        "outlineOnDarkNegativeMinor",
        LightColorTokens.OutlineOnDarkNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnDarkInfoMinor", LightColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentWarning",
        LightColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegative",
        LightColorTokens.OutlineOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfo",
        LightColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimary",
        LightColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        LightColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        LightColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        LightColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidTertiary",
        LightColorTokens.OutlineOnDarkSolidTertiary,
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
        "outlineOnLightTransparentDefaultHover",
        LightColorTokens.OutlineOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultActive",
        LightColorTokens.OutlineOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefault",
        LightColorTokens.OutlineOnLightTransparentDefault,
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
        "outlineOnLightTransparentTertiaryHover",
        LightColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        LightColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightClearHover", LightColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add("outlineOnLightClearActive", LightColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add("outlineOnLightAccentHover", LightColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add(
        "outlineOnLightAccentActive",
        LightColorTokens.OutlineOnLightAccentActive,
        overwrite,
    )
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
        "outlineOnLightTransparentAccentHover",
        LightColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        LightColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoHover", LightColorTokens.OutlineOnLightPromoHover, overwrite)
    initial.add("outlineOnLightPromoActive", LightColorTokens.OutlineOnLightPromoActive, overwrite)
    initial.add("outlineOnLightPromo", LightColorTokens.OutlineOnLightPromo, overwrite)
    initial.add(
        "outlineOnLightPromoMinorHover",
        LightColorTokens.OutlineOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorActive",
        LightColorTokens.OutlineOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoMinor", LightColorTokens.OutlineOnLightPromoMinor, overwrite)
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
        "outlineOnLightTransparentNegativeHover",
        LightColorTokens.OutlineOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeActive",
        LightColorTokens.OutlineOnLightTransparentNegativeActive,
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
    initial.add("outlineOnLightClear", LightColorTokens.OutlineOnLightClear, overwrite)
    initial.add(
        "outlineOnLightTransparentAccent",
        LightColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add("outlineOnLightPositive", LightColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightTransparentPositive",
        LightColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        LightColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegative",
        LightColorTokens.OutlineOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfo",
        LightColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidPrimary",
        LightColorTokens.OutlineOnLightSolidPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidTertiary",
        LightColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add("outlineOnLightAccent", LightColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentMinor", LightColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add("outlineOnLightWarning", LightColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightNegative", LightColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfo", LightColorTokens.OutlineOnLightInfo, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        LightColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningMinor",
        LightColorTokens.OutlineOnLightWarningMinor,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeMinor",
        LightColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnLightInfoMinor", LightColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        LightColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        LightColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        LightColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondary",
        LightColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidDefault",
        LightColorTokens.OutlineOnLightSolidDefault,
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
        "outlineInverseTransparentDefaultHover",
        LightColorTokens.OutlineInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultActive",
        LightColorTokens.OutlineInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefault",
        LightColorTokens.OutlineInverseTransparentDefault,
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
    initial.add("outlineInverseClearHover", LightColorTokens.OutlineInverseClearHover, overwrite)
    initial.add("outlineInverseClearActive", LightColorTokens.OutlineInverseClearActive, overwrite)
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
    initial.add("outlineInversePromoHover", LightColorTokens.OutlineInversePromoHover, overwrite)
    initial.add("outlineInversePromoActive", LightColorTokens.OutlineInversePromoActive, overwrite)
    initial.add("outlineInversePromo", LightColorTokens.OutlineInversePromo, overwrite)
    initial.add(
        "outlineInversePromoMinorHover",
        LightColorTokens.OutlineInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorActive",
        LightColorTokens.OutlineInversePromoMinorActive,
        overwrite,
    )
    initial.add("outlineInversePromoMinor", LightColorTokens.OutlineInversePromoMinor, overwrite)
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
    initial.add("outlineInverseClear", LightColorTokens.OutlineInverseClear, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        LightColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
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
        "outlineInverseSolidPrimary",
        LightColorTokens.OutlineInverseSolidPrimary,
        overwrite,
    )
    initial.add("outlineInverseAccent", LightColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", LightColorTokens.OutlineInverseAccentMinor, overwrite)
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
    initial.add("textDefaultPrimaryHover", DarkColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("textDefaultPrimaryActive", DarkColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add("textDefaultPrimary", DarkColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        DarkColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultSecondaryHover", DarkColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add("textDefaultSecondaryActive", DarkColorTokens.TextDefaultSecondaryActive, overwrite)
    initial.add("textDefaultSecondary", DarkColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultTertiaryHover", DarkColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultTertiaryActive", DarkColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiary", DarkColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultParagraphHover", DarkColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add("textDefaultParagraphActive", DarkColorTokens.TextDefaultParagraphActive, overwrite)
    initial.add("textDefaultParagraph", DarkColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultAccentHover", DarkColorTokens.TextDefaultAccentHover, overwrite)
    initial.add("textDefaultAccentActive", DarkColorTokens.TextDefaultAccentActive, overwrite)
    initial.add("textDefaultAccent", DarkColorTokens.TextDefaultAccent, overwrite)
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
    initial.add("textDefaultPromoHover", DarkColorTokens.TextDefaultPromoHover, overwrite)
    initial.add("textDefaultPromoActive", DarkColorTokens.TextDefaultPromoActive, overwrite)
    initial.add("textDefaultPromo", DarkColorTokens.TextDefaultPromo, overwrite)
    initial.add("textDefaultPromoMinorHover", DarkColorTokens.TextDefaultPromoMinorHover, overwrite)
    initial.add(
        "textDefaultPromoMinorActive",
        DarkColorTokens.TextDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("textDefaultPromoMinor", DarkColorTokens.TextDefaultPromoMinor, overwrite)
    initial.add("textDefaultPositiveHover", DarkColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPositiveActive", DarkColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositive", DarkColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultWarningHover", DarkColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultWarningActive", DarkColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarning", DarkColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultNegativeHover", DarkColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultNegativeActive", DarkColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegative", DarkColorTokens.TextDefaultNegative, overwrite)
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
    initial.add("textDefaultInfo", DarkColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultPositiveMinor", DarkColorTokens.TextDefaultPositiveMinor, overwrite)
    initial.add("textDefaultWarningMinor", DarkColorTokens.TextDefaultWarningMinor, overwrite)
    initial.add("textDefaultNegativeMinor", DarkColorTokens.TextDefaultNegativeMinor, overwrite)
    initial.add("textDefaultInfoMinor", DarkColorTokens.TextDefaultInfoMinor, overwrite)
    initial.add("textOnDarkPrimaryHover", DarkColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPrimaryActive", DarkColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add("textOnDarkPrimary", DarkColorTokens.TextOnDarkPrimary, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        DarkColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkSecondaryHover", DarkColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkSecondaryActive", DarkColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkSecondary", DarkColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkTertiaryHover", DarkColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkTertiaryActive", DarkColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkTertiary", DarkColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkParagraphHover", DarkColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkParagraphActive", DarkColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("textOnDarkParagraph", DarkColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkAccentHover", DarkColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkAccentActive", DarkColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("textOnDarkAccent", DarkColorTokens.TextOnDarkAccent, overwrite)
    initial.add("textOnDarkAccentMinorHover", DarkColorTokens.TextOnDarkAccentMinorHover, overwrite)
    initial.add(
        "textOnDarkAccentMinorActive",
        DarkColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkPromoHover", DarkColorTokens.TextOnDarkPromoHover, overwrite)
    initial.add("textOnDarkPromoActive", DarkColorTokens.TextOnDarkPromoActive, overwrite)
    initial.add("textOnDarkPromo", DarkColorTokens.TextOnDarkPromo, overwrite)
    initial.add("textOnDarkPromoMinorHover", DarkColorTokens.TextOnDarkPromoMinorHover, overwrite)
    initial.add("textOnDarkPromoMinorActive", DarkColorTokens.TextOnDarkPromoMinorActive, overwrite)
    initial.add("textOnDarkPromoMinor", DarkColorTokens.TextOnDarkPromoMinor, overwrite)
    initial.add("textOnDarkPositiveHover", DarkColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnDarkPositiveActive", DarkColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkPositive", DarkColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkWarningHover", DarkColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkWarningActive", DarkColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkWarning", DarkColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkNegativeHover", DarkColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkNegativeActive", DarkColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkNegative", DarkColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkInfoHover", DarkColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkInfoActive", DarkColorTokens.TextOnDarkInfoActive, overwrite)
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
    initial.add("textOnDarkAccentMinor", DarkColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkInfo", DarkColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkPositiveMinor", DarkColorTokens.TextOnDarkPositiveMinor, overwrite)
    initial.add("textOnDarkWarningMinor", DarkColorTokens.TextOnDarkWarningMinor, overwrite)
    initial.add("textOnDarkNegativeMinor", DarkColorTokens.TextOnDarkNegativeMinor, overwrite)
    initial.add("textOnDarkInfoMinor", DarkColorTokens.TextOnDarkInfoMinor, overwrite)
    initial.add("textOnLightPrimaryHover", DarkColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", DarkColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimary", DarkColorTokens.TextOnLightPrimary, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        DarkColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightSecondaryHover", DarkColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add("textOnLightSecondaryActive", DarkColorTokens.TextOnLightSecondaryActive, overwrite)
    initial.add("textOnLightSecondary", DarkColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightTertiaryHover", DarkColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightTertiaryActive", DarkColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightTertiary", DarkColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightParagraphHover", DarkColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add("textOnLightParagraphActive", DarkColorTokens.TextOnLightParagraphActive, overwrite)
    initial.add("textOnLightParagraph", DarkColorTokens.TextOnLightParagraph, overwrite)
    initial.add("textOnLightAccentHover", DarkColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightAccentActive", DarkColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccent", DarkColorTokens.TextOnLightAccent, overwrite)
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
    initial.add("textOnLightPromoHover", DarkColorTokens.TextOnLightPromoHover, overwrite)
    initial.add("textOnLightPromoActive", DarkColorTokens.TextOnLightPromoActive, overwrite)
    initial.add("textOnLightPromo", DarkColorTokens.TextOnLightPromo, overwrite)
    initial.add("textOnLightPromoMinorHover", DarkColorTokens.TextOnLightPromoMinorHover, overwrite)
    initial.add(
        "textOnLightPromoMinorActive",
        DarkColorTokens.TextOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("textOnLightPromoMinor", DarkColorTokens.TextOnLightPromoMinor, overwrite)
    initial.add("textOnLightPositiveHover", DarkColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add("textOnLightPositiveActive", DarkColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPositive", DarkColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightWarningHover", DarkColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightWarningActive", DarkColorTokens.TextOnLightWarningActive, overwrite)
    initial.add("textOnLightWarning", DarkColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightNegativeHover", DarkColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textOnLightNegativeActive", DarkColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegative", DarkColorTokens.TextOnLightNegative, overwrite)
    initial.add("textOnLightInfoHover", DarkColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textOnLightInfoActive", DarkColorTokens.TextOnLightInfoActive, overwrite)
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
    initial.add("textOnLightInfo", DarkColorTokens.TextOnLightInfo, overwrite)
    initial.add("textOnLightWarningMinor", DarkColorTokens.TextOnLightWarningMinor, overwrite)
    initial.add("textOnLightPositiveMinor", DarkColorTokens.TextOnLightPositiveMinor, overwrite)
    initial.add("textOnLightAccentMinor", DarkColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightNegativeMinor", DarkColorTokens.TextOnLightNegativeMinor, overwrite)
    initial.add("textOnLightInfoMinor", DarkColorTokens.TextOnLightInfoMinor, overwrite)
    initial.add("textInversePrimaryHover", DarkColorTokens.TextInversePrimaryHover, overwrite)
    initial.add("textInversePrimaryActive", DarkColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimary", DarkColorTokens.TextInversePrimary, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        DarkColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add("textInverseSecondaryHover", DarkColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add("textInverseSecondaryActive", DarkColorTokens.TextInverseSecondaryActive, overwrite)
    initial.add("textInverseSecondary", DarkColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseTertiaryHover", DarkColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textInverseTertiaryActive", DarkColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textInverseTertiary", DarkColorTokens.TextInverseTertiary, overwrite)
    initial.add("textInverseParagraphHover", DarkColorTokens.TextInverseParagraphHover, overwrite)
    initial.add("textInverseParagraphActive", DarkColorTokens.TextInverseParagraphActive, overwrite)
    initial.add("textInverseParagraph", DarkColorTokens.TextInverseParagraph, overwrite)
    initial.add("textInverseAccentHover", DarkColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentActive", DarkColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccent", DarkColorTokens.TextInverseAccent, overwrite)
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
    initial.add("textInversePromoHover", DarkColorTokens.TextInversePromoHover, overwrite)
    initial.add("textInversePromoActive", DarkColorTokens.TextInversePromoActive, overwrite)
    initial.add("textInversePromo", DarkColorTokens.TextInversePromo, overwrite)
    initial.add("textInversePromoMinorHover", DarkColorTokens.TextInversePromoMinorHover, overwrite)
    initial.add(
        "textInversePromoMinorActive",
        DarkColorTokens.TextInversePromoMinorActive,
        overwrite,
    )
    initial.add("textInversePromoMinor", DarkColorTokens.TextInversePromoMinor, overwrite)
    initial.add("textInversePositiveHover", DarkColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInversePositiveActive", DarkColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositive", DarkColorTokens.TextInversePositive, overwrite)
    initial.add("textInverseWarningHover", DarkColorTokens.TextInverseWarningHover, overwrite)
    initial.add("textInverseWarningActive", DarkColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInverseWarning", DarkColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseNegativeHover", DarkColorTokens.TextInverseNegativeHover, overwrite)
    initial.add("textInverseNegativeActive", DarkColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegative", DarkColorTokens.TextInverseNegative, overwrite)
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
    initial.add("textInverseAccentMinor", DarkColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseInfo", DarkColorTokens.TextInverseInfo, overwrite)
    initial.add("textInversePositiveMinor", DarkColorTokens.TextInversePositiveMinor, overwrite)
    initial.add("textInverseWarningMinor", DarkColorTokens.TextInverseWarningMinor, overwrite)
    initial.add("textInverseNegativeMinor", DarkColorTokens.TextInverseNegativeMinor, overwrite)
    initial.add("textInverseInfoMinor", DarkColorTokens.TextInverseInfoMinor, overwrite)
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
    initial.add("surfaceDefaultSolidPrimary", DarkColorTokens.SurfaceDefaultSolidPrimary, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        DarkColorTokens.SurfaceDefaultSolidPrimaryBrightness,
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
        "surfaceDefaultSolidSecondary",
        DarkColorTokens.SurfaceDefaultSolidSecondary,
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
        "surfaceDefaultSolidTertiary",
        DarkColorTokens.SurfaceDefaultSolidTertiary,
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
    initial.add("surfaceDefaultSolidCard", DarkColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        DarkColorTokens.SurfaceDefaultSolidCardBrightness,
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
    initial.add("surfaceDefaultSolidDefault", DarkColorTokens.SurfaceDefaultSolidDefault, overwrite)
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
        "surfaceDefaultTransparentSecondary",
        DarkColorTokens.SurfaceDefaultTransparentSecondary,
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
        "surfaceDefaultTransparentTertiary",
        DarkColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
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
    initial.add(
        "surfaceDefaultTransparentDeep",
        DarkColorTokens.SurfaceDefaultTransparentDeep,
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
    initial.add("surfaceDefaultClearHover", DarkColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add("surfaceDefaultClearActive", DarkColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", DarkColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultAccentHover", DarkColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add("surfaceDefaultAccentActive", DarkColorTokens.SurfaceDefaultAccentActive, overwrite)
    initial.add("surfaceDefaultAccent", DarkColorTokens.SurfaceDefaultAccent, overwrite)
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
    initial.add("surfaceDefaultPromoHover", DarkColorTokens.SurfaceDefaultPromoHover, overwrite)
    initial.add("surfaceDefaultPromoActive", DarkColorTokens.SurfaceDefaultPromoActive, overwrite)
    initial.add("surfaceDefaultPromo", DarkColorTokens.SurfaceDefaultPromo, overwrite)
    initial.add(
        "surfaceDefaultPromoMinorHover",
        DarkColorTokens.SurfaceDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPromoMinorActive",
        DarkColorTokens.SurfaceDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceDefaultPromoMinor", DarkColorTokens.SurfaceDefaultPromoMinor, overwrite)
    initial.add(
        "surfaceDefaultTransparentPromoHover",
        DarkColorTokens.SurfaceDefaultTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromoActive",
        DarkColorTokens.SurfaceDefaultTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPromo",
        DarkColorTokens.SurfaceDefaultTransparentPromo,
        overwrite,
    )
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
    initial.add("surfaceDefaultPositive", DarkColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add("surfaceDefaultWarningHover", DarkColorTokens.SurfaceDefaultWarningHover, overwrite)
    initial.add(
        "surfaceDefaultWarningActive",
        DarkColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add("surfaceDefaultWarning", DarkColorTokens.SurfaceDefaultWarning, overwrite)
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
    initial.add("surfaceDefaultNegative", DarkColorTokens.SurfaceDefaultNegative, overwrite)
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
    initial.add("surfaceDefaultInfo", DarkColorTokens.SurfaceDefaultInfo, overwrite)
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
    initial.add("surfaceDefaultInfoMinor", DarkColorTokens.SurfaceDefaultInfoMinor, overwrite)
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
    initial.add(
        "surfaceDefaultTransparentInfo",
        DarkColorTokens.SurfaceDefaultTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        DarkColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        DarkColorTokens.SurfaceDefaultTransparentAccent,
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
    initial.add("surfaceOnDarkSolidPrimary", DarkColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
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
        "surfaceOnDarkSolidSecondary",
        DarkColorTokens.SurfaceOnDarkSolidSecondary,
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
    initial.add("surfaceOnDarkSolidTertiary", DarkColorTokens.SurfaceOnDarkSolidTertiary, overwrite)
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
    initial.add("surfaceOnDarkSolidCard", DarkColorTokens.SurfaceOnDarkSolidCard, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        DarkColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
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
    initial.add("surfaceOnDarkSolidDefault", DarkColorTokens.SurfaceOnDarkSolidDefault, overwrite)
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
        "surfaceOnDarkTransparentPrimary",
        DarkColorTokens.SurfaceOnDarkTransparentPrimary,
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
        "surfaceOnDarkTransparentSecondary",
        DarkColorTokens.SurfaceOnDarkTransparentSecondary,
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
        "surfaceOnDarkTransparentTertiary",
        DarkColorTokens.SurfaceOnDarkTransparentTertiary,
        overwrite,
    )
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
    initial.add(
        "surfaceOnDarkTransparentDeep",
        DarkColorTokens.SurfaceOnDarkTransparentDeep,
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
        "surfaceOnDarkTransparentCard",
        DarkColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        DarkColorTokens.SurfaceOnDarkTransparentCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClearHover", DarkColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", DarkColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkClear", DarkColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkAccentHover", DarkColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", DarkColorTokens.SurfaceOnDarkAccentActive, overwrite)
    initial.add("surfaceOnDarkAccent", DarkColorTokens.SurfaceOnDarkAccent, overwrite)
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
        "surfaceOnDarkTransparentAccentHover",
        DarkColorTokens.SurfaceOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentActive",
        DarkColorTokens.SurfaceOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoHover", DarkColorTokens.SurfaceOnDarkPromoHover, overwrite)
    initial.add("surfaceOnDarkPromoActive", DarkColorTokens.SurfaceOnDarkPromoActive, overwrite)
    initial.add("surfaceOnDarkPromo", DarkColorTokens.SurfaceOnDarkPromo, overwrite)
    initial.add(
        "surfaceOnDarkPromoMinorHover",
        DarkColorTokens.SurfaceOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPromoMinorActive",
        DarkColorTokens.SurfaceOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPromoMinor", DarkColorTokens.SurfaceOnDarkPromoMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentPromoHover",
        DarkColorTokens.SurfaceOnDarkTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromoActive",
        DarkColorTokens.SurfaceOnDarkTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPromo",
        DarkColorTokens.SurfaceOnDarkTransparentPromo,
        overwrite,
    )
    initial.add("surfaceOnDarkPositiveHover", DarkColorTokens.SurfaceOnDarkPositiveHover, overwrite)
    initial.add(
        "surfaceOnDarkPositiveActive",
        DarkColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositive", DarkColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkWarningHover", DarkColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add("surfaceOnDarkWarningActive", DarkColorTokens.SurfaceOnDarkWarningActive, overwrite)
    initial.add("surfaceOnDarkWarning", DarkColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkNegativeHover", DarkColorTokens.SurfaceOnDarkNegativeHover, overwrite)
    initial.add(
        "surfaceOnDarkNegativeActive",
        DarkColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkNegative", DarkColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add("surfaceOnDarkInfoHover", DarkColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfoActive", DarkColorTokens.SurfaceOnDarkInfoActive, overwrite)
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
    initial.add("surfaceOnDarkAccentMinor", DarkColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccent",
        DarkColorTokens.SurfaceOnDarkTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnDarkInfo", DarkColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add("surfaceOnDarkPositiveMinor", DarkColorTokens.SurfaceOnDarkPositiveMinor, overwrite)
    initial.add("surfaceOnDarkWarningMinor", DarkColorTokens.SurfaceOnDarkWarningMinor, overwrite)
    initial.add("surfaceOnDarkNegativeMinor", DarkColorTokens.SurfaceOnDarkNegativeMinor, overwrite)
    initial.add("surfaceOnDarkInfoMinor", DarkColorTokens.SurfaceOnDarkInfoMinor, overwrite)
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
    initial.add(
        "surfaceOnDarkTransparentInfo",
        DarkColorTokens.SurfaceOnDarkTransparentInfo,
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
    initial.add("surfaceOnLightSolidPrimary", DarkColorTokens.SurfaceOnLightSolidPrimary, overwrite)
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnLightSolidPrimaryBrightness,
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
        "surfaceOnLightSolidSecondary",
        DarkColorTokens.SurfaceOnLightSolidSecondary,
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
        "surfaceOnLightSolidTertiary",
        DarkColorTokens.SurfaceOnLightSolidTertiary,
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
    initial.add("surfaceOnLightSolidCard", DarkColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        DarkColorTokens.SurfaceOnLightSolidCardBrightness,
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
    initial.add("surfaceOnLightSolidDefault", DarkColorTokens.SurfaceOnLightSolidDefault, overwrite)
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
        "surfaceOnLightTransparentSecondary",
        DarkColorTokens.SurfaceOnLightTransparentSecondary,
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
        "surfaceOnLightTransparentTertiary",
        DarkColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
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
    initial.add(
        "surfaceOnLightTransparentDeep",
        DarkColorTokens.SurfaceOnLightTransparentDeep,
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
    initial.add("surfaceOnLightClearHover", DarkColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add("surfaceOnLightClearActive", DarkColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightClear", DarkColorTokens.SurfaceOnLightClear, overwrite)
    initial.add("surfaceOnLightAccentHover", DarkColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add("surfaceOnLightAccentActive", DarkColorTokens.SurfaceOnLightAccentActive, overwrite)
    initial.add("surfaceOnLightAccent", DarkColorTokens.SurfaceOnLightAccent, overwrite)
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
        "surfaceOnLightTransparentAccentHover",
        DarkColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        DarkColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoHover", DarkColorTokens.SurfaceOnLightPromoHover, overwrite)
    initial.add("surfaceOnLightPromoActive", DarkColorTokens.SurfaceOnLightPromoActive, overwrite)
    initial.add("surfaceOnLightPromo", DarkColorTokens.SurfaceOnLightPromo, overwrite)
    initial.add(
        "surfaceOnLightPromoMinorHover",
        DarkColorTokens.SurfaceOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPromoMinorActive",
        DarkColorTokens.SurfaceOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("surfaceOnLightPromoMinor", DarkColorTokens.SurfaceOnLightPromoMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentPromoHover",
        DarkColorTokens.SurfaceOnLightTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromoActive",
        DarkColorTokens.SurfaceOnLightTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPromo",
        DarkColorTokens.SurfaceOnLightTransparentPromo,
        overwrite,
    )
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
    initial.add("surfaceOnLightPositive", DarkColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add("surfaceOnLightWarningHover", DarkColorTokens.SurfaceOnLightWarningHover, overwrite)
    initial.add(
        "surfaceOnLightWarningActive",
        DarkColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarning", DarkColorTokens.SurfaceOnLightWarning, overwrite)
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
    initial.add("surfaceOnLightNegative", DarkColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightInfoHover", DarkColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", DarkColorTokens.SurfaceOnLightInfoActive, overwrite)
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
    initial.add("surfaceOnLightAccentMinor", DarkColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccent",
        DarkColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", DarkColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add("surfaceOnLightWarningMinor", DarkColorTokens.SurfaceOnLightWarningMinor, overwrite)
    initial.add(
        "surfaceOnLightPositiveMinor",
        DarkColorTokens.SurfaceOnLightPositiveMinor,
        overwrite,
    )
    initial.add("surfaceOnLightInfoMinor", DarkColorTokens.SurfaceOnLightInfoMinor, overwrite)
    initial.add(
        "surfaceOnLightNegativeMinor",
        DarkColorTokens.SurfaceOnLightNegativeMinor,
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
    initial.add(
        "surfaceOnLightTransparentInfo",
        DarkColorTokens.SurfaceOnLightTransparentInfo,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        DarkColorTokens.SurfaceOnLightTransparentPrimary,
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
    initial.add("surfaceInverseSolidPrimary", DarkColorTokens.SurfaceInverseSolidPrimary, overwrite)
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        DarkColorTokens.SurfaceInverseSolidPrimaryBrightness,
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
        "surfaceInverseSolidSecondary",
        DarkColorTokens.SurfaceInverseSolidSecondary,
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
        "surfaceInverseSolidTertiary",
        DarkColorTokens.SurfaceInverseSolidTertiary,
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
    initial.add("surfaceInverseSolidCard", DarkColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseSolidCardBrightness",
        DarkColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
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
    initial.add("surfaceInverseSolidDefault", DarkColorTokens.SurfaceInverseSolidDefault, overwrite)
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
        "surfaceInverseTransparentPrimary",
        DarkColorTokens.SurfaceInverseTransparentPrimary,
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
        "surfaceInverseTransparentSecondary",
        DarkColorTokens.SurfaceInverseTransparentSecondary,
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
        "surfaceInverseTransparentTertiary",
        DarkColorTokens.SurfaceInverseTransparentTertiary,
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
    initial.add(
        "surfaceInverseTransparentDeep",
        DarkColorTokens.SurfaceInverseTransparentDeep,
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
    initial.add("surfaceInverseClearHover", DarkColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add("surfaceInverseClearActive", DarkColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", DarkColorTokens.SurfaceInverseClear, overwrite)
    initial.add("surfaceInverseAccentHover", DarkColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add("surfaceInverseAccentActive", DarkColorTokens.SurfaceInverseAccentActive, overwrite)
    initial.add("surfaceInverseAccent", DarkColorTokens.SurfaceInverseAccent, overwrite)
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
        "surfaceInverseTransparentAccentHover",
        DarkColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentActive",
        DarkColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInversePromoHover", DarkColorTokens.SurfaceInversePromoHover, overwrite)
    initial.add("surfaceInversePromoActive", DarkColorTokens.SurfaceInversePromoActive, overwrite)
    initial.add("surfaceInversePromo", DarkColorTokens.SurfaceInversePromo, overwrite)
    initial.add(
        "surfaceInversePromoMinorHover",
        DarkColorTokens.SurfaceInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInversePromoMinorActive",
        DarkColorTokens.SurfaceInversePromoMinorActive,
        overwrite,
    )
    initial.add("surfaceInversePromoMinor", DarkColorTokens.SurfaceInversePromoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPromoHover",
        DarkColorTokens.SurfaceInverseTransparentPromoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromoActive",
        DarkColorTokens.SurfaceInverseTransparentPromoActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPromo",
        DarkColorTokens.SurfaceInverseTransparentPromo,
        overwrite,
    )
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
    initial.add("surfaceInversePositive", DarkColorTokens.SurfaceInversePositive, overwrite)
    initial.add("surfaceInverseWarningHover", DarkColorTokens.SurfaceInverseWarningHover, overwrite)
    initial.add(
        "surfaceInverseWarningActive",
        DarkColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add("surfaceInverseWarning", DarkColorTokens.SurfaceInverseWarning, overwrite)
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
    initial.add("surfaceInverseNegative", DarkColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", DarkColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseInfoActive", DarkColorTokens.SurfaceInverseInfoActive, overwrite)
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
        "surfaceInverseNegativeMinorHover",
        DarkColorTokens.SurfaceInverseNegativeMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeMinorActive",
        DarkColorTokens.SurfaceInverseNegativeMinorActive,
        overwrite,
    )
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
        "surfaceInverseTransparentInfoHover",
        DarkColorTokens.SurfaceInverseTransparentInfoHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfoActive",
        DarkColorTokens.SurfaceInverseTransparentInfoActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", DarkColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        DarkColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfo", DarkColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInversePositiveMinor",
        DarkColorTokens.SurfaceInversePositiveMinor,
        overwrite,
    )
    initial.add("surfaceInverseWarningMinor", DarkColorTokens.SurfaceInverseWarningMinor, overwrite)
    initial.add(
        "surfaceInverseNegativeMinor",
        DarkColorTokens.SurfaceInverseNegativeMinor,
        overwrite,
    )
    initial.add("surfaceInverseInfoMinor", DarkColorTokens.SurfaceInverseInfoMinor, overwrite)
    initial.add(
        "surfaceInverseTransparentPositive",
        DarkColorTokens.SurfaceInverseTransparentPositive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentWarning",
        DarkColorTokens.SurfaceInverseTransparentWarning,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        DarkColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentInfo",
        DarkColorTokens.SurfaceInverseTransparentInfo,
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
    initial.add("backgroundInversePrimary", DarkColorTokens.BackgroundInversePrimary, overwrite)
    initial.add(
        "backgroundInversePrimaryBrightness",
        DarkColorTokens.BackgroundInversePrimaryBrightness,
        overwrite,
    )
    initial.add("backgroundInverseSecondary", DarkColorTokens.BackgroundInverseSecondary, overwrite)
    initial.add("backgroundInverseTertiary", DarkColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("overlayDefaultSoft", DarkColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayDefaultHard", DarkColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultBlur", DarkColorTokens.OverlayDefaultBlur, overwrite)
    initial.add("overlayOnDarkSoft", DarkColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", DarkColorTokens.OverlayOnDarkHard, overwrite)
    initial.add("overlayOnDarkBlur", DarkColorTokens.OverlayOnDarkBlur, overwrite)
    initial.add("overlayOnLightSoft", DarkColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayOnLightHard", DarkColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayOnLightBlur", DarkColorTokens.OverlayOnLightBlur, overwrite)
    initial.add("overlayInverseSoft", DarkColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayInverseHard", DarkColorTokens.OverlayInverseHard, overwrite)
    initial.add("overlayInverseBlur", DarkColorTokens.OverlayInverseBlur, overwrite)
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
        "outlineDefaultTransparentDefaultHover",
        DarkColorTokens.OutlineDefaultTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefaultActive",
        DarkColorTokens.OutlineDefaultTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentDefault",
        DarkColorTokens.OutlineDefaultTransparentDefault,
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
    initial.add("outlineDefaultClearHover", DarkColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultClearActive", DarkColorTokens.OutlineDefaultClearActive, overwrite)
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
    initial.add("outlineDefaultPromoHover", DarkColorTokens.OutlineDefaultPromoHover, overwrite)
    initial.add("outlineDefaultPromoActive", DarkColorTokens.OutlineDefaultPromoActive, overwrite)
    initial.add("outlineDefaultPromo", DarkColorTokens.OutlineDefaultPromo, overwrite)
    initial.add(
        "outlineDefaultPromoMinorHover",
        DarkColorTokens.OutlineDefaultPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPromoMinorActive",
        DarkColorTokens.OutlineDefaultPromoMinorActive,
        overwrite,
    )
    initial.add("outlineDefaultPromoMinor", DarkColorTokens.OutlineDefaultPromoMinor, overwrite)
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
        "outlineDefaultTransparentNegativeHover",
        DarkColorTokens.OutlineDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentNegativeActive",
        DarkColorTokens.OutlineDefaultTransparentNegativeActive,
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
    initial.add("outlineDefaultClear", DarkColorTokens.OutlineDefaultClear, overwrite)
    initial.add("outlineDefaultSolidPrimary", DarkColorTokens.OutlineDefaultSolidPrimary, overwrite)
    initial.add(
        "outlineDefaultSolidTertiary",
        DarkColorTokens.OutlineDefaultSolidTertiary,
        overwrite,
    )
    initial.add("outlineDefaultAccent", DarkColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultAccentMinor", DarkColorTokens.OutlineDefaultAccentMinor, overwrite)
    initial.add(
        "outlineDefaultTransparentAccent",
        DarkColorTokens.OutlineDefaultTransparentAccent,
        overwrite,
    )
    initial.add("outlineDefaultWarning", DarkColorTokens.OutlineDefaultWarning, overwrite)
    initial.add("outlineDefaultPositive", DarkColorTokens.OutlineDefaultPositive, overwrite)
    initial.add(
        "outlineDefaultTransparentPositive",
        DarkColorTokens.OutlineDefaultTransparentPositive,
        overwrite,
    )
    initial.add("outlineDefaultNegative", DarkColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultInfo", DarkColorTokens.OutlineDefaultInfo, overwrite)
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
    initial.add("outlineDefaultInfoMinor", DarkColorTokens.OutlineDefaultInfoMinor, overwrite)
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
        "outlineDefaultTransparentInfo",
        DarkColorTokens.OutlineDefaultTransparentInfo,
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
        "outlineDefaultSolidSecondary",
        DarkColorTokens.OutlineDefaultSolidSecondary,
        overwrite,
    )
    initial.add("outlineDefaultSolidDefault", DarkColorTokens.OutlineDefaultSolidDefault, overwrite)
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
        "outlineOnDarkSolidSecondaryHover",
        DarkColorTokens.OutlineOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondaryActive",
        DarkColorTokens.OutlineOnDarkSolidSecondaryActive,
        overwrite,
    )
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
    initial.add(
        "outlineOnDarkTransparentDefaultHover",
        DarkColorTokens.OutlineOnDarkTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefaultActive",
        DarkColorTokens.OutlineOnDarkTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentDefault",
        DarkColorTokens.OutlineOnDarkTransparentDefault,
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
        "outlineOnDarkTransparentTertiaryHover",
        DarkColorTokens.OutlineOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiaryActive",
        DarkColorTokens.OutlineOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnDarkClearHover", DarkColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", DarkColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add("outlineOnDarkAccentHover", DarkColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkAccentActive", DarkColorTokens.OutlineOnDarkAccentActive, overwrite)
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
        "outlineOnDarkTransparentAccentHover",
        DarkColorTokens.OutlineOnDarkTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentAccentActive",
        DarkColorTokens.OutlineOnDarkTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoHover", DarkColorTokens.OutlineOnDarkPromoHover, overwrite)
    initial.add("outlineOnDarkPromoActive", DarkColorTokens.OutlineOnDarkPromoActive, overwrite)
    initial.add("outlineOnDarkPromo", DarkColorTokens.OutlineOnDarkPromo, overwrite)
    initial.add(
        "outlineOnDarkPromoMinorHover",
        DarkColorTokens.OutlineOnDarkPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPromoMinorActive",
        DarkColorTokens.OutlineOnDarkPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnDarkPromoMinor", DarkColorTokens.OutlineOnDarkPromoMinor, overwrite)
    initial.add("outlineOnDarkPositiveHover", DarkColorTokens.OutlineOnDarkPositiveHover, overwrite)
    initial.add(
        "outlineOnDarkPositiveActive",
        DarkColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkWarningHover", DarkColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add("outlineOnDarkWarningActive", DarkColorTokens.OutlineOnDarkWarningActive, overwrite)
    initial.add("outlineOnDarkNegativeHover", DarkColorTokens.OutlineOnDarkNegativeHover, overwrite)
    initial.add(
        "outlineOnDarkNegativeActive",
        DarkColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkInfoHover", DarkColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", DarkColorTokens.OutlineOnDarkInfoActive, overwrite)
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
        "outlineOnDarkTransparentNegativeHover",
        DarkColorTokens.OutlineOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegativeActive",
        DarkColorTokens.OutlineOnDarkTransparentNegativeActive,
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
    initial.add("outlineOnDarkClear", DarkColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkSolidPrimary", DarkColorTokens.OutlineOnDarkSolidPrimary, overwrite)
    initial.add("outlineOnDarkAccent", DarkColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add("outlineOnDarkAccentMinor", DarkColorTokens.OutlineOnDarkAccentMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentAccent",
        DarkColorTokens.OutlineOnDarkTransparentAccent,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPositive",
        DarkColorTokens.OutlineOnDarkTransparentPositive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", DarkColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkWarning", DarkColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkNegative", DarkColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkInfo", DarkColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkPositiveMinor", DarkColorTokens.OutlineOnDarkPositiveMinor, overwrite)
    initial.add("outlineOnDarkWarningMinor", DarkColorTokens.OutlineOnDarkWarningMinor, overwrite)
    initial.add("outlineOnDarkNegativeMinor", DarkColorTokens.OutlineOnDarkNegativeMinor, overwrite)
    initial.add("outlineOnDarkInfoMinor", DarkColorTokens.OutlineOnDarkInfoMinor, overwrite)
    initial.add(
        "outlineOnDarkTransparentWarning",
        DarkColorTokens.OutlineOnDarkTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentNegative",
        DarkColorTokens.OutlineOnDarkTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentInfo",
        DarkColorTokens.OutlineOnDarkTransparentInfo,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimary",
        DarkColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentSecondary",
        DarkColorTokens.OutlineOnDarkTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentTertiary",
        DarkColorTokens.OutlineOnDarkTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkSolidSecondary",
        DarkColorTokens.OutlineOnDarkSolidSecondary,
        overwrite,
    )
    initial.add("outlineOnDarkSolidTertiary", DarkColorTokens.OutlineOnDarkSolidTertiary, overwrite)
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
        "outlineOnLightTransparentDefaultHover",
        DarkColorTokens.OutlineOnLightTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefaultActive",
        DarkColorTokens.OutlineOnLightTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentDefault",
        DarkColorTokens.OutlineOnLightTransparentDefault,
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
        "outlineOnLightTransparentTertiaryHover",
        DarkColorTokens.OutlineOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiaryActive",
        DarkColorTokens.OutlineOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add("outlineOnLightClearHover", DarkColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add("outlineOnLightClearActive", DarkColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add("outlineOnLightAccentHover", DarkColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add("outlineOnLightAccentActive", DarkColorTokens.OutlineOnLightAccentActive, overwrite)
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
        "outlineOnLightTransparentAccentHover",
        DarkColorTokens.OutlineOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentAccentActive",
        DarkColorTokens.OutlineOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoHover", DarkColorTokens.OutlineOnLightPromoHover, overwrite)
    initial.add("outlineOnLightPromoActive", DarkColorTokens.OutlineOnLightPromoActive, overwrite)
    initial.add("outlineOnLightPromo", DarkColorTokens.OutlineOnLightPromo, overwrite)
    initial.add(
        "outlineOnLightPromoMinorHover",
        DarkColorTokens.OutlineOnLightPromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPromoMinorActive",
        DarkColorTokens.OutlineOnLightPromoMinorActive,
        overwrite,
    )
    initial.add("outlineOnLightPromoMinor", DarkColorTokens.OutlineOnLightPromoMinor, overwrite)
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
    initial.add("outlineOnLightWarningHover", DarkColorTokens.OutlineOnLightWarningHover, overwrite)
    initial.add(
        "outlineOnLightWarningActive",
        DarkColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
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
        "outlineOnLightPositiveMinorHover",
        DarkColorTokens.OutlineOnLightPositiveMinorHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveMinorActive",
        DarkColorTokens.OutlineOnLightPositiveMinorActive,
        overwrite,
    )
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
        "outlineOnLightTransparentNegativeHover",
        DarkColorTokens.OutlineOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegativeActive",
        DarkColorTokens.OutlineOnLightTransparentNegativeActive,
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
    initial.add("outlineOnLightClear", DarkColorTokens.OutlineOnLightClear, overwrite)
    initial.add(
        "outlineOnLightTransparentAccent",
        DarkColorTokens.OutlineOnLightTransparentAccent,
        overwrite,
    )
    initial.add("outlineOnLightPositive", DarkColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightTransparentPositive",
        DarkColorTokens.OutlineOnLightTransparentPositive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWarning",
        DarkColorTokens.OutlineOnLightTransparentWarning,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentNegative",
        DarkColorTokens.OutlineOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentInfo",
        DarkColorTokens.OutlineOnLightTransparentInfo,
        overwrite,
    )
    initial.add("outlineOnLightSolidPrimary", DarkColorTokens.OutlineOnLightSolidPrimary, overwrite)
    initial.add(
        "outlineOnLightSolidTertiary",
        DarkColorTokens.OutlineOnLightSolidTertiary,
        overwrite,
    )
    initial.add("outlineOnLightAccent", DarkColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightAccentMinor", DarkColorTokens.OutlineOnLightAccentMinor, overwrite)
    initial.add("outlineOnLightWarning", DarkColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightNegative", DarkColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfo", DarkColorTokens.OutlineOnLightInfo, overwrite)
    initial.add(
        "outlineOnLightPositiveMinor",
        DarkColorTokens.OutlineOnLightPositiveMinor,
        overwrite,
    )
    initial.add("outlineOnLightWarningMinor", DarkColorTokens.OutlineOnLightWarningMinor, overwrite)
    initial.add(
        "outlineOnLightNegativeMinor",
        DarkColorTokens.OutlineOnLightNegativeMinor,
        overwrite,
    )
    initial.add("outlineOnLightInfoMinor", DarkColorTokens.OutlineOnLightInfoMinor, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        DarkColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentSecondary",
        DarkColorTokens.OutlineOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentTertiary",
        DarkColorTokens.OutlineOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "outlineOnLightSolidSecondary",
        DarkColorTokens.OutlineOnLightSolidSecondary,
        overwrite,
    )
    initial.add("outlineOnLightSolidDefault", DarkColorTokens.OutlineOnLightSolidDefault, overwrite)
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
        "outlineInverseTransparentDefaultHover",
        DarkColorTokens.OutlineInverseTransparentDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefaultActive",
        DarkColorTokens.OutlineInverseTransparentDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentDefault",
        DarkColorTokens.OutlineInverseTransparentDefault,
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
    initial.add("outlineInverseClearHover", DarkColorTokens.OutlineInverseClearHover, overwrite)
    initial.add("outlineInverseClearActive", DarkColorTokens.OutlineInverseClearActive, overwrite)
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
    initial.add("outlineInversePromoHover", DarkColorTokens.OutlineInversePromoHover, overwrite)
    initial.add("outlineInversePromoActive", DarkColorTokens.OutlineInversePromoActive, overwrite)
    initial.add("outlineInversePromo", DarkColorTokens.OutlineInversePromo, overwrite)
    initial.add(
        "outlineInversePromoMinorHover",
        DarkColorTokens.OutlineInversePromoMinorHover,
        overwrite,
    )
    initial.add(
        "outlineInversePromoMinorActive",
        DarkColorTokens.OutlineInversePromoMinorActive,
        overwrite,
    )
    initial.add("outlineInversePromoMinor", DarkColorTokens.OutlineInversePromoMinor, overwrite)
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
    initial.add("outlineInverseClear", DarkColorTokens.OutlineInverseClear, overwrite)
    initial.add(
        "outlineInverseTransparentAccent",
        DarkColorTokens.OutlineInverseTransparentAccent,
        overwrite,
    )
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
    initial.add("outlineInverseSolidPrimary", DarkColorTokens.OutlineInverseSolidPrimary, overwrite)
    initial.add("outlineInverseAccent", DarkColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentMinor", DarkColorTokens.OutlineInverseAccentMinor, overwrite)
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
    return SddsServColors(initial)
}

private fun Map<String, Color>.obtain(name: String): MutableState<Color> =
    mutableStateOf(get(name)!!, structuralEqualityPolicy())
