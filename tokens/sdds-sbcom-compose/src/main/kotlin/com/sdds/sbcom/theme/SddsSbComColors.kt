// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.sbcom.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
import com.sdds.sbcom.tokens.DarkColorTokens
import com.sdds.sbcom.tokens.LightColorTokens
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.collections.MutableMap

/**
 * Цвета SddsSbCom
 */
@Immutable
public class SddsSbComColors(
    private val colors: Map<String, Color>,
) {
    /**
     * Default Hover On Dark
     */
    public var outlineOnDarkDefaultHover: Color by colors.obtain("outlineOnDarkDefaultHover")

    /**
     * Accent Secondary Hover Default
     */
    public var surfaceDefaultAccentSecondaryHover: Color by
        colors.obtain("surfaceDefaultAccentSecondaryHover")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardBrightnessHover: Color by
        colors.obtain("surfaceDefaultTransparentCardBrightnessHover")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardBrightnessActive: Color by
        colors.obtain("surfaceDefaultTransparentCardBrightnessActive")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryBrightnessHover: Color by
        colors.obtain("surfaceOnLightSolidPrimaryBrightnessHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryBrightnessActive: Color by
        colors.obtain("surfaceOnLightSolidPrimaryBrightnessActive")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardBrightnessHover: Color by
        colors.obtain("surfaceOnDarkTransparentCardBrightnessHover")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardBrightnessHover: Color by
        colors.obtain("surfaceOnDarkSolidCardBrightnessHover")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardBrightnessActive: Color by
        colors.obtain("surfaceOnDarkTransparentCardBrightnessActive")

    /**
     * On Light Personas Olive Text Accent
     */
    public var personasOnLightOliveTextAccent: Color by
        colors.obtain("personasOnLightOliveTextAccent")

    /**
     * On Dark Personas Olive Text Accent
     */
    public var personasOnDarkOliveTextAccent: Color by
        colors.obtain("personasOnDarkOliveTextAccent")

    /**
     * Inverse Personas Ochre Text Accent
     */
    public var personasInverseOchreTextAccent: Color by
        colors.obtain("personasInverseOchreTextAccent")

    /**
     * Inverse Personas Pink Text Accent
     */
    public var personasInversePinkTextAccent: Color by
        colors.obtain("personasInversePinkTextAccent")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiaryActive: Color by
        colors.obtain("surfaceDefaultSolidTertiaryActive")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryBrightnessHover: Color by
        colors.obtain("surfaceInverseSolidPrimaryBrightnessHover")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimary: Color by colors.obtain("textDefaultPrimary")

    /**
     * Inverse Surface Transparent Navi
     */
    public var surfaceInverseTransparentNavi: Color by
        colors.obtain("surfaceInverseTransparentNavi")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardBrightnessHover: Color by
        colors.obtain("surfaceInverseTransparentCardBrightnessHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryActive: Color by
        colors.obtain("surfaceOnLightSolidTertiaryActive")

    /**
     * Inverse Personas Indigo Text Accent
     */
    public var personasInverseIndigoTextAccent: Color by
        colors.obtain("personasInverseIndigoTextAccent")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryBrightnessActive: Color by
        colors.obtain("surfaceInverseSolidPrimaryBrightnessActive")

    /**
     * Personas Olive Text Accent
     */
    public var personasDefaultOliveTextAccent: Color by
        colors.obtain("personasDefaultOliveTextAccent")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinorHover: Color by colors.obtain("textOnDarkAccentMinorHover")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardBrightnessActive: Color by
        colors.obtain("surfaceOnLightTransparentCardBrightnessActive")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardBrightnessHover: Color by
        colors.obtain("surfaceOnLightTransparentCardBrightnessHover")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardBrightnessActive: Color by
        colors.obtain("surfaceOnLightSolidCardBrightnessActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinorActive: Color by
        colors.obtain("surfaceOnDarkAccentMinorActive")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardBrightnessHover: Color by
        colors.obtain("surfaceOnLightSolidCardBrightnessHover")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveActive: Color by colors.obtain("outlineOnLightPositiveActive")

    /**
     * Outline Primary
     */
    public var outlineDefaultPrimary: Color by colors.obtain("outlineDefaultPrimary")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiary: Color by colors.obtain("surfaceInverseSolidTertiary")

    /**
     * Inverse Personas Green Text Accent
     */
    public var personasInverseGreenTextAccent: Color by
        colors.obtain("personasInverseGreenTextAccent")

    /**
     * Surface Accent Secondary
     */
    public var surfaceDefaultAccentSecondary: Color by
        colors.obtain("surfaceDefaultAccentSecondary")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinor: Color by colors.obtain("surfaceDefaultAccentMinor")

    /**
     * On Dark Surface Accent Secondary
     */
    public var surfaceOnDarkAccentSecondary: Color by colors.obtain("surfaceOnDarkAccentSecondary")

    /**
     * On Dark Personas Indigo Text Accent
     */
    public var personasOnDarkIndigoTextAccent: Color by
        colors.obtain("personasOnDarkIndigoTextAccent")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryActive: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinor: Color by colors.obtain("surfaceOnLightAccentMinor")

    /**
     * On Light Personas Ochre Text Accent
     */
    public var personasOnLightOchreTextAccent: Color by
        colors.obtain("personasOnLightOchreTextAccent")

    /**
     * On Light Personas Violet Text Accent
     */
    public var personasOnLightVioletTextAccent: Color by
        colors.obtain("personasOnLightVioletTextAccent")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardBrightnessActive: Color by
        colors.obtain("surfaceInverseTransparentCardBrightnessActive")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningActive: Color by colors.obtain("outlineOnLightWarningActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinorHover: Color by
        colors.obtain("surfaceOnDarkAccentMinorHover")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardBrightnessActive: Color by
        colors.obtain("surfaceInverseSolidCardBrightnessActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinorHover: Color by
        colors.obtain("surfaceOnLightAccentMinorHover")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinor: Color by colors.obtain("surfaceInverseAccentMinor")

    /**
     * On Dark Surface Transparent Accent Minor
     */
    public var surfaceOnDarkTransparentAccentMinor: Color by
        colors.obtain("surfaceOnDarkTransparentAccentMinor")

    /**
     * On Light Personas Sea Blue Text Accent
     */
    public var personasOnLightSeaBlueTextAccent: Color by
        colors.obtain("personasOnLightSeaBlueTextAccent")

    /**
     * On Dark Personas Blue Text Accent
     */
    public var personasOnDarkBlueTextAccent: Color by colors.obtain("personasOnDarkBlueTextAccent")

    /**
     * On Dark Personas Violet Text Accent
     */
    public var personasOnDarkVioletTextAccent: Color by
        colors.obtain("personasOnDarkVioletTextAccent")

    /**
     * Personas Ochre Text Accent
     */
    public var personasDefaultOchreTextAccent: Color by
        colors.obtain("personasDefaultOchreTextAccent")

    /**
     * On Light Surface Transparent Navi
     */
    public var surfaceOnLightTransparentNavi: Color by
        colors.obtain("surfaceOnLightTransparentNavi")

    /**
     * Blue Text Accent Active Inverse
     */
    public var personasInverseBlueTextAccentActive: Color by
        colors.obtain("personasInverseBlueTextAccentActive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningActive: Color by colors.obtain("textOnLightWarningActive")

    /**
     * Olive Text Accent Hover Inverse
     */
    public var personasInverseOliveTextAccentHover: Color by
        colors.obtain("personasInverseOliveTextAccentHover")

    /**
     * Transparent Navi Active On Light
     */
    public var surfaceOnLightTransparentNaviActive: Color by
        colors.obtain("surfaceOnLightTransparentNaviActive")

    /**
     * Blue Text Accent Active On Light
     */
    public var personasOnLightBlueTextAccentActive: Color by
        colors.obtain("personasOnLightBlueTextAccentActive")

    /**
     * Primary Active On Light
     */
    public var outlineOnLightPrimaryActive: Color by colors.obtain("outlineOnLightPrimaryActive")

    /**
     * Default Active On Light
     */
    public var outlineOnLightDefaultActive: Color by colors.obtain("outlineOnLightDefaultActive")

    /**
     * Olive Text Accent Active On Dark
     */
    public var personasOnDarkOliveTextAccentActive: Color by
        colors.obtain("personasOnDarkOliveTextAccentActive")

    /**
     * On Dark Personas Sea Blue Text Accent
     */
    public var personasOnDarkSeaBlueTextAccent: Color by
        colors.obtain("personasOnDarkSeaBlueTextAccent")

    /**
     * Violet Text Accent Active On Dark
     */
    public var personasOnDarkVioletTextAccentActive: Color by
        colors.obtain("personasOnDarkVioletTextAccentActive")

    /**
     * Green Text Accent Hover On Dark
     */
    public var personasOnDarkGreenTextAccentHover: Color by
        colors.obtain("personasOnDarkGreenTextAccentHover")

    /**
     * Accent Secondary Active On Dark
     */
    public var surfaceOnDarkAccentSecondaryActive: Color by
        colors.obtain("surfaceOnDarkAccentSecondaryActive")

    /**
     * Green Text Accent Active Inverse
     */
    public var personasInverseGreenTextAccentActive: Color by
        colors.obtain("personasInverseGreenTextAccentActive")

    /**
     * Inverse Surface Accent Secondary
     */
    public var surfaceInverseAccentSecondary: Color by
        colors.obtain("surfaceInverseAccentSecondary")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryBrightnessHover: Color by
        colors.obtain("textOnDarkPrimaryBrightnessHover")

    /**
     * Pink Text Accent Active On Dark
     */
    public var personasOnDarkPinkTextAccentActive: Color by
        colors.obtain("personasOnDarkPinkTextAccentActive")

    /**
     * Indigo Text Accent Active Inverse
     */
    public var personasInverseIndigoTextAccentActive: Color by
        colors.obtain("personasInverseIndigoTextAccentActive")

    /**
     * Sea Blue Text Accent Active Default
     */
    public var personasDefaultSeaBlueTextAccentActive: Color by
        colors.obtain("personasDefaultSeaBlueTextAccentActive")

    /**
     * On Light Surface Transparent Accent Minor
     */
    public var surfaceOnLightTransparentAccentMinor: Color by
        colors.obtain("surfaceOnLightTransparentAccentMinor")

    /**
     * Pink Text Accent Active On Light
     */
    public var personasOnLightPinkTextAccentActive: Color by
        colors.obtain("personasOnLightPinkTextAccentActive")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryBrightnessHover: Color by
        colors.obtain("textDefaultPrimaryBrightnessHover")

    /**
     * Transparent Accent Minor Active Inverse
     */
    public var surfaceInverseTransparentAccentMinorActive: Color by
        colors.obtain("surfaceInverseTransparentAccentMinorActive")

    /**
     * Ochre Text Accent Hover Default
     */
    public var personasDefaultOchreTextAccentHover: Color by
        colors.obtain("personasDefaultOchreTextAccentHover")

    /**
     * Pink Text Accent Active Inverse
     */
    public var personasInversePinkTextAccentActive: Color by
        colors.obtain("personasInversePinkTextAccentActive")

    /**
     * Transparent Navi Hover On Light
     */
    public var surfaceOnLightTransparentNaviHover: Color by
        colors.obtain("surfaceOnLightTransparentNaviHover")

    /**
     * Primary Active Default
     */
    public var outlineDefaultPrimaryActive: Color by colors.obtain("outlineDefaultPrimaryActive")

    /**
     * Sea Blue Text Accent Active On Dark
     */
    public var personasOnDarkSeaBlueTextAccentActive: Color by
        colors.obtain("personasOnDarkSeaBlueTextAccentActive")

    /**
     * On Light Personas Green Text Accent
     */
    public var personasOnLightGreenTextAccent: Color by
        colors.obtain("personasOnLightGreenTextAccent")

    /**
     * Accent Secondary Active Inverse
     */
    public var surfaceInverseAccentSecondaryActive: Color by
        colors.obtain("surfaceInverseAccentSecondaryActive")

    /**
     * Indigo Text Accent Active Default
     */
    public var personasDefaultIndigoTextAccentActive: Color by
        colors.obtain("personasDefaultIndigoTextAccentActive")

    /**
     * Green Text Accent Active Default
     */
    public var personasDefaultGreenTextAccentActive: Color by
        colors.obtain("personasDefaultGreenTextAccentActive")

    /**
     * Transparent Navi Hover On Dark
     */
    public var surfaceOnDarkTransparentNaviHover: Color by
        colors.obtain("surfaceOnDarkTransparentNaviHover")

    /**
     * Sea Blue Text Accent Hover Inverse
     */
    public var personasInverseSeaBlueTextAccentHover: Color by
        colors.obtain("personasInverseSeaBlueTextAccentHover")

    /**
     * Accent Secondary Hover On Light
     */
    public var surfaceOnLightAccentSecondaryHover: Color by
        colors.obtain("surfaceOnLightAccentSecondaryHover")

    /**
     * Blue Text Accent Hover Inverse
     */
    public var personasInverseBlueTextAccentHover: Color by
        colors.obtain("personasInverseBlueTextAccentHover")

    /**
     * Indigo Text Accent Hover Inverse
     */
    public var personasInverseIndigoTextAccentHover: Color by
        colors.obtain("personasInverseIndigoTextAccentHover")

    /**
     * On Dark Personas Ochre Text Accent
     */
    public var personasOnDarkOchreTextAccent: Color by
        colors.obtain("personasOnDarkOchreTextAccent")

    /**
     * Green Text Accent Hover On Light
     */
    public var personasOnLightGreenTextAccentHover: Color by
        colors.obtain("personasOnLightGreenTextAccentHover")

    /**
     * Ochre Text Accent Active On Dark
     */
    public var personasOnDarkOchreTextAccentActive: Color by
        colors.obtain("personasOnDarkOchreTextAccentActive")

    /**
     * Ochre Text Accent Hover On Light
     */
    public var personasOnLightOchreTextAccentHover: Color by
        colors.obtain("personasOnLightOchreTextAccentHover")

    /**
     * Primary Hover Default
     */
    public var outlineDefaultPrimaryHover: Color by colors.obtain("outlineDefaultPrimaryHover")

    /**
     * Transparent Accent Minor Active Default
     */
    public var surfaceDefaultTransparentAccentMinorActive: Color by
        colors.obtain("surfaceDefaultTransparentAccentMinorActive")

    /**
     * Transparent Navi Hover Default
     */
    public var surfaceDefaultTransparentNaviHover: Color by
        colors.obtain("surfaceDefaultTransparentNaviHover")

    /**
     * Default Hover Inverse
     */
    public var outlineInverseDefaultHover: Color by colors.obtain("outlineInverseDefaultHover")

    /**
     * Violet Text Accent Hover Inverse
     */
    public var personasInverseVioletTextAccentHover: Color by
        colors.obtain("personasInverseVioletTextAccentHover")

    /**
     * Transparent Accent Minor Hover On Light
     */
    public var surfaceOnLightTransparentAccentMinorHover: Color by
        colors.obtain("surfaceOnLightTransparentAccentMinorHover")

    /**
     * Transparent Accent Minor Hover Inverse
     */
    public var surfaceInverseTransparentAccentMinorHover: Color by
        colors.obtain("surfaceInverseTransparentAccentMinorHover")

    /**
     * Transparent Navi Hover Inverse
     */
    public var surfaceInverseTransparentNaviHover: Color by
        colors.obtain("surfaceInverseTransparentNaviHover")

    /**
     * Primary Hover Inverse
     */
    public var outlineInversePrimaryHover: Color by colors.obtain("outlineInversePrimaryHover")

    /**
     * Olive Text Accent Hover Default
     */
    public var personasDefaultOliveTextAccentHover: Color by
        colors.obtain("personasDefaultOliveTextAccentHover")

    /**
     * Personas Violet Text Accent
     */
    public var personasDefaultVioletTextAccent: Color by
        colors.obtain("personasDefaultVioletTextAccent")

    /**
     * Ochre Text Accent Hover Inverse
     */
    public var personasInverseOchreTextAccentHover: Color by
        colors.obtain("personasInverseOchreTextAccentHover")

    /**
     * Green Text Accent Active On Dark
     */
    public var personasOnDarkGreenTextAccentActive: Color by
        colors.obtain("personasOnDarkGreenTextAccentActive")

    /**
     * Pink Text Accent Hover On Dark
     */
    public var personasOnDarkPinkTextAccentHover: Color by
        colors.obtain("personasOnDarkPinkTextAccentHover")

    /**
     * Pink Text Accent Hover Inverse
     */
    public var personasInversePinkTextAccentHover: Color by
        colors.obtain("personasInversePinkTextAccentHover")

    /**
     * Indigo Text Accent Hover On Dark
     */
    public var personasOnDarkIndigoTextAccentHover: Color by
        colors.obtain("personasOnDarkIndigoTextAccentHover")

    /**
     * Blue Text Accent Hover On Light
     */
    public var personasOnLightBlueTextAccentHover: Color by
        colors.obtain("personasOnLightBlueTextAccentHover")

    /**
     * Olive Text Accent Hover On Light
     */
    public var personasOnLightOliveTextAccentHover: Color by
        colors.obtain("personasOnLightOliveTextAccentHover")

    /**
     * Violet Text Accent Hover On Light
     */
    public var personasOnLightVioletTextAccentHover: Color by
        colors.obtain("personasOnLightVioletTextAccentHover")

    /**
     * Primary Hover On Dark
     */
    public var outlineOnDarkPrimaryHover: Color by colors.obtain("outlineOnDarkPrimaryHover")

    /**
     * On Dark Personas Pink Text Accent
     */
    public var personasOnDarkPinkTextAccent: Color by colors.obtain("personasOnDarkPinkTextAccent")

    /**
     * On Dark Outline Primary
     */
    public var outlineOnDarkPrimary: Color by colors.obtain("outlineOnDarkPrimary")

    /**
     * On Light Personas Blue Text Accent
     */
    public var personasOnLightBlueTextAccent: Color by
        colors.obtain("personasOnLightBlueTextAccent")

    /**
     * Accent Secondary Active Default
     */
    public var surfaceDefaultAccentSecondaryActive: Color by
        colors.obtain("surfaceDefaultAccentSecondaryActive")

    /**
     * Personas Blue Text Accent
     */
    public var personasDefaultBlueTextAccent: Color by
        colors.obtain("personasDefaultBlueTextAccent")

    /**
     * Blue Text Accent Active Default
     */
    public var personasDefaultBlueTextAccentActive: Color by
        colors.obtain("personasDefaultBlueTextAccentActive")

    /**
     * Personas Green Text Accent
     */
    public var personasDefaultGreenTextAccent: Color by
        colors.obtain("personasDefaultGreenTextAccent")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryBrightnessActive: Color by
        colors.obtain("surfaceDefaultSolidPrimaryBrightnessActive")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryBrightnessHover: Color by
        colors.obtain("textOnLightPrimaryBrightnessHover")

    /**
     * Personas Pink Text Accent
     */
    public var personasDefaultPinkTextAccent: Color by
        colors.obtain("personasDefaultPinkTextAccent")

    /**
     * Personas Sea Blue Text Accent
     */
    public var personasDefaultSeaBlueTextAccent: Color by
        colors.obtain("personasDefaultSeaBlueTextAccent")

    /**
     * Surface Transparent Accent Minor
     */
    public var surfaceDefaultTransparentAccentMinor: Color by
        colors.obtain("surfaceDefaultTransparentAccentMinor")

    /**
     * Violet Text Accent Hover Default
     */
    public var personasDefaultVioletTextAccentHover: Color by
        colors.obtain("personasDefaultVioletTextAccentHover")

    /**
     * Inverse Personas Blue Text Accent
     */
    public var personasInverseBlueTextAccent: Color by
        colors.obtain("personasInverseBlueTextAccent")

    /**
     * Olive Text Accent Active Inverse
     */
    public var personasInverseOliveTextAccentActive: Color by
        colors.obtain("personasInverseOliveTextAccentActive")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardBrightnessHover: Color by
        colors.obtain("surfaceInverseSolidCardBrightnessHover")

    /**
     * Inverse Surface Transparent Accent Minor
     */
    public var surfaceInverseTransparentAccentMinor: Color by
        colors.obtain("surfaceInverseTransparentAccentMinor")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryBrightnessHover: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryBrightnessHover")

    /**
     * On Dark Surface Transparent Navi
     */
    public var surfaceOnDarkTransparentNavi: Color by colors.obtain("surfaceOnDarkTransparentNavi")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryBrightnessHover: Color by
        colors.obtain("textInversePrimaryBrightnessHover")

    /**
     * Background Hardline
     */
    public var backgroundDefaultHardline: Color by colors.obtain("backgroundDefaultHardline")

    /**
     * Inverse Outline Primary
     */
    public var outlineInversePrimary: Color by colors.obtain("outlineInversePrimary")

    /**
     * On Dark Outline Default
     */
    public var outlineOnDarkDefault: Color by colors.obtain("outlineOnDarkDefault")

    /**
     * Inverse Personas Violet Text Accent
     */
    public var personasInverseVioletTextAccent: Color by
        colors.obtain("personasInverseVioletTextAccent")

    /**
     * Personas Indigo Text Accent
     */
    public var personasDefaultIndigoTextAccent: Color by
        colors.obtain("personasDefaultIndigoTextAccent")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryBrightnessActive: Color by
        colors.obtain("textInversePrimaryBrightnessActive")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryBrightnessActive: Color by
        colors.obtain("textOnDarkPrimaryBrightnessActive")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryBrightnessActive: Color by
        colors.obtain("textOnLightPrimaryBrightnessActive")

    /**
     * Indigo Text Accent Active On Dark
     */
    public var personasOnDarkIndigoTextAccentActive: Color by
        colors.obtain("personasOnDarkIndigoTextAccentActive")

    /**
     * Ochre Text Accent Hover On Dark
     */
    public var personasOnDarkOchreTextAccentHover: Color by
        colors.obtain("personasOnDarkOchreTextAccentHover")

    /**
     * Pink Text Accent Hover Default
     */
    public var personasDefaultPinkTextAccentHover: Color by
        colors.obtain("personasDefaultPinkTextAccentHover")

    /**
     * Transparent Navi Active On Dark
     */
    public var surfaceOnDarkTransparentNaviActive: Color by
        colors.obtain("surfaceOnDarkTransparentNaviActive")

    /**
     * On Light Surface Accent Secondary
     */
    public var surfaceOnLightAccentSecondary: Color by
        colors.obtain("surfaceOnLightAccentSecondary")

    /**
     * On Light Outline Default
     */
    public var outlineOnLightDefault: Color by colors.obtain("outlineOnLightDefault")

    /**
     * Pink Text Accent Active Default
     */
    public var personasDefaultPinkTextAccentActive: Color by
        colors.obtain("personasDefaultPinkTextAccentActive")

    /**
     * Ochre Text Accent Active Inverse
     */
    public var personasInverseOchreTextAccentActive: Color by
        colors.obtain("personasInverseOchreTextAccentActive")

    /**
     * Inverse Personas Olive Text Accent
     */
    public var personasInverseOliveTextAccent: Color by
        colors.obtain("personasInverseOliveTextAccent")

    /**
     * Blue Text Accent Active On Dark
     */
    public var personasOnDarkBlueTextAccentActive: Color by
        colors.obtain("personasOnDarkBlueTextAccentActive")

    /**
     * On Dark Personas Green Text Accent
     */
    public var personasOnDarkGreenTextAccent: Color by
        colors.obtain("personasOnDarkGreenTextAccent")

    /**
     * Olive Text Accent Active On Light
     */
    public var personasOnLightOliveTextAccentActive: Color by
        colors.obtain("personasOnLightOliveTextAccentActive")

    /**
     * On Light Personas Pink Text Accent
     */
    public var personasOnLightPinkTextAccent: Color by
        colors.obtain("personasOnLightPinkTextAccent")

    /**
     * Sea Blue Text Accent Active On Light
     */
    public var personasOnLightSeaBlueTextAccentActive: Color by
        colors.obtain("personasOnLightSeaBlueTextAccentActive")

    /**
     * Transparent Accent Minor Hover Default
     */
    public var surfaceDefaultTransparentAccentMinorHover: Color by
        colors.obtain("surfaceDefaultTransparentAccentMinorHover")

    /**
     * Transparent Navi Active Inverse
     */
    public var surfaceInverseTransparentNaviActive: Color by
        colors.obtain("surfaceInverseTransparentNaviActive")

    /**
     * Transparent Accent Minor Hover On Dark
     */
    public var surfaceOnDarkTransparentAccentMinorHover: Color by
        colors.obtain("surfaceOnDarkTransparentAccentMinorHover")

    /**
     * On Light Personas Indigo Text Accent
     */
    public var personasOnLightIndigoTextAccent: Color by
        colors.obtain("personasOnLightIndigoTextAccent")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryBrightnessActive: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryBrightnessActive")

    /**
     * Transparent Accent Minor Active On Dark
     */
    public var surfaceOnDarkTransparentAccentMinorActive: Color by
        colors.obtain("surfaceOnDarkTransparentAccentMinorActive")

    /**
     * Accent Secondary Active On Light
     */
    public var surfaceOnLightAccentSecondaryActive: Color by
        colors.obtain("surfaceOnLightAccentSecondaryActive")

    /**
     * Green Text Accent Hover Inverse
     */
    public var personasInverseGreenTextAccentHover: Color by
        colors.obtain("personasInverseGreenTextAccentHover")

    /**
     * Indigo Text Accent Active On Light
     */
    public var personasOnLightIndigoTextAccentActive: Color by
        colors.obtain("personasOnLightIndigoTextAccentActive")

    /**
     * New description
     */
    public var outlineDefaultTransparentWhiteActive: Color by
        colors.obtain("outlineDefaultTransparentWhiteActive")

    /**
     * New description
     */
    public var outlineDefaultTransparentWhiteHover: Color by
        colors.obtain("outlineDefaultTransparentWhiteHover")

    /**
     * New description
     */
    public var outlineInverseDeep: Color by colors.obtain("outlineInverseDeep")

    /**
     * New description
     */
    public var outlineInverseDeepActive: Color by colors.obtain("outlineInverseDeepActive")

    /**
     * New description
     */
    public var outlineInverseDeepHover: Color by colors.obtain("outlineInverseDeepHover")

    /**
     * New description
     */
    public var outlineInverseTransparentWhite: Color by
        colors.obtain("outlineInverseTransparentWhite")

    /**
     * New description
     */
    public var outlineInverseTransparentWhiteHover: Color by
        colors.obtain("outlineInverseTransparentWhiteHover")

    /**
     * New description
     */
    public var outlineOnDarkDeep: Color by colors.obtain("outlineOnDarkDeep")

    /**
     * New description
     */
    public var outlineOnDarkDeepActive: Color by colors.obtain("outlineOnDarkDeepActive")

    /**
     * New description
     */
    public var outlineOnDarkDeepHover: Color by colors.obtain("outlineOnDarkDeepHover")

    /**
     * New description
     */
    public var outlineOnDarkTransparentWhite: Color by
        colors.obtain("outlineOnDarkTransparentWhite")

    /**
     * New description
     */
    public var outlineOnDarkTransparentWhiteActive: Color by
        colors.obtain("outlineOnDarkTransparentWhiteActive")

    /**
     * New description
     */
    public var outlineOnDarkTransparentWhiteHover: Color by
        colors.obtain("outlineOnDarkTransparentWhiteHover")

    /**
     * New description
     */
    public var outlineOnLightDeep: Color by colors.obtain("outlineOnLightDeep")

    /**
     * New description
     */
    public var outlineOnLightDeepActive: Color by colors.obtain("outlineOnLightDeepActive")

    /**
     * New description
     */
    public var outlineOnLightDeepHover: Color by colors.obtain("outlineOnLightDeepHover")

    /**
     * New description
     */
    public var outlineOnLightTransparentWhite: Color by
        colors.obtain("outlineOnLightTransparentWhite")

    /**
     * New description
     */
    public var surfaceDefaultSolidDeep: Color by colors.obtain("surfaceDefaultSolidDeep")

    /**
     * New description
     */
    public var surfaceDefaultSolidDeepActive: Color by
        colors.obtain("surfaceDefaultSolidDeepActive")

    /**
     * New description
     */
    public var surfaceDefaultSolidDeepHover: Color by colors.obtain("surfaceDefaultSolidDeepHover")

    /**
     * New description
     */
    public var surfaceDefaultTransparentCardMinor: Color by
        colors.obtain("surfaceDefaultTransparentCardMinor")

    /**
     * New description
     */
    public var surfaceDefaultTransparentCardMinorActive: Color by
        colors.obtain("surfaceDefaultTransparentCardMinorActive")

    /**
     * New description
     */
    public var surfaceDefaultTransparentCardMinorHover: Color by
        colors.obtain("surfaceDefaultTransparentCardMinorHover")

    /**
     * New description
     */
    public var surfaceInverseSolidDeep: Color by colors.obtain("surfaceInverseSolidDeep")

    /**
     * New description
     */
    public var surfaceInverseSolidDeepActive: Color by
        colors.obtain("surfaceInverseSolidDeepActive")

    /**
     * New description
     */
    public var surfaceInverseSolidDeepHover: Color by colors.obtain("surfaceInverseSolidDeepHover")

    /**
     * New description
     */
    public var surfaceInverseTransparentCardMinor: Color by
        colors.obtain("surfaceInverseTransparentCardMinor")

    /**
     * New description
     */
    public var surfaceInverseTransparentCardMinorActive: Color by
        colors.obtain("surfaceInverseTransparentCardMinorActive")

    /**
     * New description
     */
    public var surfaceInverseTransparentCardMinorHover: Color by
        colors.obtain("surfaceInverseTransparentCardMinorHover")

    /**
     * New description
     */
    public var surfaceOnDarkSolidDeep: Color by colors.obtain("surfaceOnDarkSolidDeep")

    /**
     * New description
     */
    public var surfaceOnDarkSolidDeepActive: Color by colors.obtain("surfaceOnDarkSolidDeepActive")

    /**
     * New description
     */
    public var surfaceOnDarkSolidDeepHover: Color by colors.obtain("surfaceOnDarkSolidDeepHover")

    /**
     * New description
     */
    public var surfaceOnDarkTransparentCardMinor: Color by
        colors.obtain("surfaceOnDarkTransparentCardMinor")

    /**
     * New description
     */
    public var surfaceOnDarkTransparentCardMinorActive: Color by
        colors.obtain("surfaceOnDarkTransparentCardMinorActive")

    /**
     * New description
     */
    public var surfaceOnDarkTransparentCardMinorHover: Color by
        colors.obtain("surfaceOnDarkTransparentCardMinorHover")

    /**
     * New description
     */
    public var surfaceOnLightSolidDeep: Color by colors.obtain("surfaceOnLightSolidDeep")

    /**
     * New description
     */
    public var surfaceOnLightSolidDeepActive: Color by
        colors.obtain("surfaceOnLightSolidDeepActive")

    /**
     * New description
     */
    public var surfaceOnLightSolidDeepHover: Color by colors.obtain("surfaceOnLightSolidDeepHover")

    /**
     * New description
     */
    public var surfaceOnLightTransparentCardMinor: Color by
        colors.obtain("surfaceOnLightTransparentCardMinor")

    /**
     * New description
     */
    public var surfaceOnLightTransparentCardMinorActive: Color by
        colors.obtain("surfaceOnLightTransparentCardMinorActive")

    /**
     * New description
     */
    public var surfaceOnLightTransparentCardMinorHover: Color by
        colors.obtain("surfaceOnLightTransparentCardMinorHover")

    /**
     * New description
     */
    public var outlineDefaultDeepActive: Color by colors.obtain("outlineDefaultDeepActive")

    /**
     * New description
     */
    public var outlineDefaultDeepHover: Color by colors.obtain("outlineDefaultDeepHover")

    /**
     * New description
     */
    public var outlineOnLightTransparentWhiteActive: Color by
        colors.obtain("outlineOnLightTransparentWhiteActive")

    /**
     * New description
     */
    public var outlineOnLightTransparentWhiteHover: Color by
        colors.obtain("outlineOnLightTransparentWhiteHover")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveActive: Color by colors.obtain("textDefaultPositiveActive")

    /**
     * Цвет успеха
     */
    public var textDefaultPositiveHover: Color by colors.obtain("textDefaultPositiveHover")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryActive: Color by colors.obtain("textDefaultPrimaryActive")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryBrightness: Color by colors.obtain("textDefaultPrimaryBrightness")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegative: Color by colors.obtain("textDefaultNegative")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeActive: Color by colors.obtain("textDefaultNegativeActive")

    /**
     * Цвет ошибки
     */
    public var textDefaultNegativeHover: Color by colors.obtain("textDefaultNegativeHover")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryActive: Color by colors.obtain("textDefaultTertiaryActive")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiaryHover: Color by colors.obtain("textDefaultTertiaryHover")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarning: Color by colors.obtain("textDefaultWarning")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningActive: Color by colors.obtain("textDefaultWarningActive")

    /**
     * Цвет предупреждения
     */
    public var textDefaultWarningHover: Color by colors.obtain("textDefaultWarningHover")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinor: Color by colors.obtain("textDefaultAccentMinor")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinorActive: Color by colors.obtain("textDefaultAccentMinorActive")

    /**
     * Акцентный минорный цвет
     */
    public var textDefaultAccentMinorHover: Color by colors.obtain("textDefaultAccentMinorHover")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphHover: Color by colors.obtain("textDefaultParagraphHover")

    /**
     * Цвет успеха
     */
    public var textDefaultPositive: Color by colors.obtain("textDefaultPositive")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraph: Color by colors.obtain("textDefaultParagraph")

    /**
     * Сплошной наборный текст
     */
    public var textDefaultParagraphActive: Color by colors.obtain("textDefaultParagraphActive")

    /**
     * Цвет информации
     */
    public var textDefaultInfo: Color by colors.obtain("textDefaultInfo")

    /**
     * Цвет информации
     */
    public var textDefaultInfoActive: Color by colors.obtain("textDefaultInfoActive")

    /**
     * Цвет информации
     */
    public var textDefaultInfoHover: Color by colors.obtain("textDefaultInfoHover")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondary: Color by colors.obtain("textDefaultSecondary")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondaryActive: Color by colors.obtain("textDefaultSecondaryActive")

    /**
     * Вторичный цвет текста
     */
    public var textDefaultSecondaryHover: Color by colors.obtain("textDefaultSecondaryHover")

    /**
     * Третичный цвет текста
     */
    public var textDefaultTertiary: Color by colors.obtain("textDefaultTertiary")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccent: Color by colors.obtain("textDefaultAccent")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentActive: Color by colors.obtain("textDefaultAccentActive")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinorActive: Color by colors.obtain("textOnDarkAccentMinorActive")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfoActive: Color by colors.obtain("textOnDarkInfoActive")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfo: Color by colors.obtain("textOnDarkInfo")

    /**
     * Цвет информации на темном фоне
     */
    public var textOnDarkInfoHover: Color by colors.obtain("textOnDarkInfoHover")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegative: Color by colors.obtain("textOnDarkNegative")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondary: Color by colors.obtain("textOnDarkSecondary")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondaryActive: Color by colors.obtain("textOnDarkSecondaryActive")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiary: Color by colors.obtain("textOnDarkTertiary")

    /**
     * Вторичный цвет текста на темном фоне
     */
    public var textOnDarkSecondaryHover: Color by colors.obtain("textOnDarkSecondaryHover")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimary: Color by colors.obtain("textOnDarkPrimary")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentHover: Color by colors.obtain("textOnDarkAccentHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositive: Color by colors.obtain("textOnDarkPositive")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphHover: Color by colors.obtain("textOnDarkParagraphHover")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeActive: Color by colors.obtain("textOnDarkNegativeActive")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraph: Color by colors.obtain("textOnDarkParagraph")

    /**
     * Цвет ошибки на темном фоне
     */
    public var textOnDarkNegativeHover: Color by colors.obtain("textOnDarkNegativeHover")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryActive: Color by colors.obtain("textOnDarkPrimaryActive")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryBrightness: Color by colors.obtain("textOnDarkPrimaryBrightness")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningHover: Color by colors.obtain("textOnDarkWarningHover")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryActive: Color by colors.obtain("textOnDarkTertiaryActive")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarning: Color by colors.obtain("textOnDarkWarning")

    /**
     * Цвет предупреждения на темном фоне
     */
    public var textOnDarkWarningActive: Color by colors.obtain("textOnDarkWarningActive")

    /**
     * Третичный цвет текста на темном фоне
     */
    public var textOnDarkTertiaryHover: Color by colors.obtain("textOnDarkTertiaryHover")

    /**
     * Основной цвет текста на темном фоне
     */
    public var textOnDarkPrimaryHover: Color by colors.obtain("textOnDarkPrimaryHover")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveActive: Color by colors.obtain("textOnDarkPositiveActive")

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public var textOnDarkAccentMinor: Color by colors.obtain("textOnDarkAccentMinor")

    /**
     * Цвет успеха на темном фоне
     */
    public var textOnDarkPositiveHover: Color by colors.obtain("textOnDarkPositiveHover")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryActive: Color by colors.obtain("textOnLightTertiaryActive")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarning: Color by colors.obtain("textOnLightWarning")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiaryHover: Color by colors.obtain("textOnLightTertiaryHover")

    /**
     * Цвет предупреждения на светлом фоне
     */
    public var textOnLightWarningHover: Color by colors.obtain("textOnLightWarningHover")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveActive: Color by colors.obtain("textOnLightPositiveActive")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimary: Color by colors.obtain("textOnLightPrimary")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositiveHover: Color by colors.obtain("textOnLightPositiveHover")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinorActive: Color by colors.obtain("textOnLightAccentMinorActive")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraph: Color by colors.obtain("textOnLightParagraph")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinorHover: Color by colors.obtain("textOnLightAccentMinorHover")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphActive: Color by colors.obtain("textOnLightParagraphActive")

    /**
     * Цвет успеха на светлом фоне
     */
    public var textOnLightPositive: Color by colors.obtain("textOnLightPositive")

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public var textOnLightParagraphHover: Color by colors.obtain("textOnLightParagraphHover")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondary: Color by colors.obtain("textOnLightSecondary")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondaryActive: Color by colors.obtain("textOnLightSecondaryActive")

    /**
     * Третичный цвет текста на светлом фоне
     */
    public var textOnLightTertiary: Color by colors.obtain("textOnLightTertiary")

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public var textOnLightSecondaryHover: Color by colors.obtain("textOnLightSecondaryHover")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryActive: Color by colors.obtain("textOnLightPrimaryActive")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryHover: Color by colors.obtain("textOnLightPrimaryHover")

    /**
     * Основной цвет текста на светлом фоне
     */
    public var textOnLightPrimaryBrightness: Color by colors.obtain("textOnLightPrimaryBrightness")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentActive: Color by colors.obtain("textOnLightAccentActive")

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public var textOnLightAccentMinor: Color by colors.obtain("textOnLightAccentMinor")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccent: Color by colors.obtain("textOnLightAccent")

    /**
     * Акцентный цвет на светлом фоне
     */
    public var textOnLightAccentHover: Color by colors.obtain("textOnLightAccentHover")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeActive: Color by colors.obtain("textOnLightNegativeActive")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegativeHover: Color by colors.obtain("textOnLightNegativeHover")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondaryHover: Color by colors.obtain("textInverseSecondaryHover")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondary: Color by colors.obtain("textInverseSecondary")

    /**
     * Инвертированный вторичный цвет текста
     */
    public var textInverseSecondaryActive: Color by colors.obtain("textInverseSecondaryActive")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryActive: Color by colors.obtain("textInverseTertiaryActive")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfo: Color by colors.obtain("textOnLightInfo")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiaryHover: Color by colors.obtain("textInverseTertiaryHover")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfoActive: Color by colors.obtain("textOnLightInfoActive")

    /**
     * Цвет информации на светлом фоне
     */
    public var textOnLightInfoHover: Color by colors.obtain("textOnLightInfoHover")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryActive: Color by colors.obtain("textInversePrimaryActive")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryHover: Color by colors.obtain("textInversePrimaryHover")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimaryBrightness: Color by colors.obtain("textInversePrimaryBrightness")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinorActive: Color by colors.obtain("textInverseAccentMinorActive")

    /**
     * Инвертированный сплошной наборный текст
     */
    public var textInverseParagraph: Color by colors.obtain("textInverseParagraph")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinorHover: Color by colors.obtain("textInverseAccentMinorHover")

    /**
     * Инвертированный сплошной наборный текст
     */
    public var textInverseParagraphActive: Color by colors.obtain("textInverseParagraphActive")

    /**
     * Инвертированный основной цвет текста
     */
    public var textInversePrimary: Color by colors.obtain("textInversePrimary")

    /**
     * Инвертированный сплошной наборный текст
     */
    public var textInverseParagraphHover: Color by colors.obtain("textInverseParagraphHover")

    /**
     * Инвертированный третичный цвет текста
     */
    public var textInverseTertiary: Color by colors.obtain("textInverseTertiary")

    /**
     * Цвет ошибки на светлом фоне
     */
    public var textOnLightNegative: Color by colors.obtain("textOnLightNegative")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentActive: Color by colors.obtain("textInverseAccentActive")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccentHover: Color by colors.obtain("textInverseAccentHover")

    /**
     * Инвертированный минорный акцентный цвет
     */
    public var textInverseAccentMinor: Color by colors.obtain("textInverseAccentMinor")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegative: Color by colors.obtain("textInverseNegative")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveActive: Color by colors.obtain("textInversePositiveActive")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositiveHover: Color by colors.obtain("textInversePositiveHover")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeActive: Color by colors.obtain("textInverseNegativeActive")

    /**
     * Инвертированный цвет ошибки
     */
    public var textInverseNegativeHover: Color by colors.obtain("textInverseNegativeHover")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondary: Color by colors.obtain("surfaceDefaultSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiary: Color by colors.obtain("surfaceDefaultSolidTertiary")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondaryActive: Color by
        colors.obtain("surfaceDefaultSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidSecondaryHover: Color by
        colors.obtain("surfaceDefaultSolidSecondaryHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidTertiaryHover: Color by
        colors.obtain("surfaceDefaultSolidTertiaryHover")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfoActive: Color by colors.obtain("textInverseInfoActive")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfo: Color by colors.obtain("textInverseInfo")

    /**
     * Инвертированный цвет информации
     */
    public var textInverseInfoHover: Color by colors.obtain("textInverseInfoHover")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarning: Color by colors.obtain("textInverseWarning")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningHover: Color by colors.obtain("textInverseWarningHover")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimary: Color by colors.obtain("surfaceDefaultSolidPrimary")

    /**
     * Инвертированный цвет предупреждения
     */
    public var textInverseWarningActive: Color by colors.obtain("textInverseWarningActive")

    /**
     * Инвертированный цвет успеха
     */
    public var textInversePositive: Color by colors.obtain("textInversePositive")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryHover: Color by
        colors.obtain("surfaceDefaultSolidPrimaryHover")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentHover: Color by colors.obtain("surfaceDefaultAccentHover")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccentActive: Color by colors.obtain("surfaceDefaultAccentActive")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimaryActive: Color by
        colors.obtain("surfaceDefaultTransparentPrimaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondary: Color by
        colors.obtain("surfaceDefaultTransparentSecondary")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimaryHover: Color by
        colors.obtain("surfaceDefaultTransparentPrimaryHover")

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentDeep: Color by
        colors.obtain("surfaceDefaultTransparentDeep")

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentPrimary: Color by
        colors.obtain("surfaceDefaultTransparentPrimary")

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentDeepActive: Color by
        colors.obtain("surfaceDefaultTransparentDeepActive")

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentDeepHover: Color by
        colors.obtain("surfaceDefaultTransparentDeepHover")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardActive: Color by
        colors.obtain("surfaceDefaultSolidCardActive")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardHover: Color by colors.obtain("surfaceDefaultSolidCardHover")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardBrightness: Color by
        colors.obtain("surfaceDefaultSolidCardBrightness")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearActive: Color by colors.obtain("surfaceDefaultClearActive")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClear: Color by colors.obtain("surfaceDefaultClear")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCard: Color by colors.obtain("surfaceDefaultSolidCard")

    /**
     * Фон поверхности/контрола без заливки
     */
    public var surfaceDefaultClearHover: Color by colors.obtain("surfaceDefaultClearHover")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardActive: Color by
        colors.obtain("surfaceDefaultTransparentCardActive")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardHover: Color by
        colors.obtain("surfaceDefaultTransparentCardHover")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCardBrightness: Color by
        colors.obtain("surfaceDefaultTransparentCardBrightness")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefaultActive: Color by
        colors.obtain("surfaceDefaultSolidDefaultActive")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefaultHover: Color by
        colors.obtain("surfaceDefaultSolidDefaultHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccentActive: Color by
        colors.obtain("surfaceDefaultTransparentAccentActive")

    /**
     * Прозрачный фон для карточек
     */
    public var surfaceDefaultTransparentCard: Color by
        colors.obtain("surfaceDefaultTransparentCard")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondaryActive: Color by
        colors.obtain("surfaceDefaultTransparentSecondaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiary: Color by
        colors.obtain("surfaceDefaultTransparentTertiary")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccentHover: Color by
        colors.obtain("surfaceDefaultTransparentAccentHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentAccent: Color by
        colors.obtain("surfaceDefaultTransparentAccent")

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentSecondaryHover: Color by
        colors.obtain("surfaceDefaultTransparentSecondaryHover")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiaryActive: Color by
        colors.obtain("surfaceDefaultTransparentTertiaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public var surfaceDefaultTransparentTertiaryHover: Color by
        colors.obtain("surfaceDefaultTransparentTertiaryHover")

    /**
     * Цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositiveActive: Color by colors.obtain("surfaceDefaultPositiveActive")

    /**
     * Цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositiveHover: Color by colors.obtain("surfaceDefaultPositiveHover")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeActive: Color by colors.obtain("surfaceDefaultNegativeActive")

    /**
     * Цвет фона поверхности/контрола успех
     */
    public var surfaceDefaultPositive: Color by colors.obtain("surfaceDefaultPositive")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegativeHover: Color by colors.obtain("surfaceDefaultNegativeHover")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoHover: Color by colors.obtain("surfaceDefaultInfoHover")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarning: Color by colors.obtain("surfaceDefaultWarning")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningHover: Color by colors.obtain("surfaceDefaultWarningHover")

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultWarningActive: Color by colors.obtain("surfaceDefaultWarningActive")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfoActive: Color by colors.obtain("surfaceDefaultInfoActive")

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public var surfaceDefaultNegative: Color by colors.obtain("surfaceDefaultNegative")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegativeActive: Color by
        colors.obtain("surfaceDefaultTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegativeHover: Color by
        colors.obtain("surfaceDefaultTransparentNegativeHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceDefaultTransparentNegative: Color by
        colors.obtain("surfaceDefaultTransparentNegative")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondary: Color by colors.obtain("surfaceOnDarkSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiary: Color by colors.obtain("surfaceOnDarkSolidTertiary")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryActive: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidSecondaryHover: Color by
        colors.obtain("surfaceOnDarkSolidSecondaryHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidTertiaryHover: Color by
        colors.obtain("surfaceOnDarkSolidTertiaryHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryActive: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryActive")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryBrightness")

    /**
     * Цвет для readOnly
     */
    public var surfaceDefaultReadOnlyActive: Color by colors.obtain("surfaceDefaultReadOnlyActive")

    /**
     * Цвет для readOnly
     */
    public var surfaceDefaultReadOnly: Color by colors.obtain("surfaceDefaultReadOnly")

    /**
     * Цвет для readOnly
     */
    public var surfaceDefaultReadOnlyHover: Color by colors.obtain("surfaceDefaultReadOnlyHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimaryHover: Color by
        colors.obtain("surfaceOnDarkSolidPrimaryHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkSolidPrimary: Color by colors.obtain("surfaceOnDarkSolidPrimary")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccent: Color by colors.obtain("surfaceOnDarkAccent")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentHover: Color by colors.obtain("surfaceOnDarkAccentHover")

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentActive: Color by colors.obtain("surfaceOnDarkAccentActive")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentPrimaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondary: Color by
        colors.obtain("surfaceOnDarkTransparentSecondary")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentPrimaryHover")

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentDeep: Color by colors.obtain("surfaceOnDarkTransparentDeep")

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentPrimary: Color by
        colors.obtain("surfaceOnDarkTransparentPrimary")

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentDeepActive: Color by
        colors.obtain("surfaceOnDarkTransparentDeepActive")

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentDeepHover: Color by
        colors.obtain("surfaceOnDarkTransparentDeepHover")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardActive: Color by colors.obtain("surfaceOnDarkSolidCardActive")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardHover: Color by colors.obtain("surfaceOnDarkSolidCardHover")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardBrightness: Color by
        colors.obtain("surfaceOnDarkSolidCardBrightness")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClear: Color by colors.obtain("surfaceOnDarkClear")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearHover: Color by colors.obtain("surfaceOnDarkClearHover")

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public var surfaceOnDarkClearActive: Color by colors.obtain("surfaceOnDarkClearActive")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCard: Color by colors.obtain("surfaceOnDarkSolidCard")

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
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCard: Color by colors.obtain("surfaceOnDarkTransparentCard")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardHover: Color by
        colors.obtain("surfaceOnDarkTransparentCardHover")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardBrightness: Color by
        colors.obtain("surfaceOnDarkTransparentCardBrightness")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiary: Color by
        colors.obtain("surfaceOnDarkTransparentTertiary")

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public var surfaceOnDarkTransparentCardActive: Color by
        colors.obtain("surfaceOnDarkTransparentCardActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentSecondaryHover")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnDarkTransparentTertiaryHover")

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositiveActive: Color by colors.obtain("surfaceOnDarkPositiveActive")

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositiveHover: Color by colors.obtain("surfaceOnDarkPositiveHover")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeActive: Color by colors.obtain("surfaceOnDarkNegativeActive")

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public var surfaceOnDarkPositive: Color by colors.obtain("surfaceOnDarkPositive")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegativeHover: Color by colors.obtain("surfaceOnDarkNegativeHover")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoHover: Color by colors.obtain("surfaceOnDarkInfoHover")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfo: Color by colors.obtain("surfaceOnDarkInfo")

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public var surfaceOnDarkInfoActive: Color by colors.obtain("surfaceOnDarkInfoActive")

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningActive: Color by colors.obtain("surfaceOnDarkWarningActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkTransparentAccent: Color by
        colors.obtain("surfaceOnDarkTransparentAccent")

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
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarning: Color by colors.obtain("surfaceOnDarkWarning")

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkWarningHover: Color by colors.obtain("surfaceOnDarkWarningHover")

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public var surfaceOnDarkNegative: Color by colors.obtain("surfaceOnDarkNegative")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegativeActive: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegativeHover: Color by
        colors.obtain("surfaceOnDarkTransparentNegativeHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnDarkReadOnlyActive: Color by colors.obtain("surfaceOnDarkReadOnlyActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public var surfaceOnDarkTransparentNegative: Color by
        colors.obtain("surfaceOnDarkTransparentNegative")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondary: Color by colors.obtain("surfaceOnLightSolidSecondary")

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiary: Color by colors.obtain("surfaceOnLightSolidTertiary")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryActive: Color by
        colors.obtain("surfaceOnLightSolidSecondaryActive")

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidSecondaryHover: Color by
        colors.obtain("surfaceOnLightSolidSecondaryHover")

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidTertiaryHover: Color by
        colors.obtain("surfaceOnLightSolidTertiaryHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnDarkReadOnlyHover: Color by colors.obtain("surfaceOnDarkReadOnlyHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnDarkReadOnly: Color by colors.obtain("surfaceOnDarkReadOnly")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryActive: Color by
        colors.obtain("surfaceOnLightSolidPrimaryActive")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryHover: Color by
        colors.obtain("surfaceOnLightSolidPrimaryHover")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimaryBrightness: Color by
        colors.obtain("surfaceOnLightSolidPrimaryBrightness")

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightSolidPrimary: Color by colors.obtain("surfaceOnLightSolidPrimary")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccent: Color by colors.obtain("surfaceOnLightAccent")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentHover: Color by colors.obtain("surfaceOnLightAccentHover")

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentActive: Color by colors.obtain("surfaceOnLightAccentActive")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryActive: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryActive")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondary: Color by
        colors.obtain("surfaceOnLightTransparentSecondary")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimaryHover: Color by
        colors.obtain("surfaceOnLightTransparentPrimaryHover")

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentDeep: Color by
        colors.obtain("surfaceOnLightTransparentDeep")

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentPrimary: Color by
        colors.obtain("surfaceOnLightTransparentPrimary")

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentDeepActive: Color by
        colors.obtain("surfaceOnLightTransparentDeepActive")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardActive: Color by
        colors.obtain("surfaceOnLightSolidCardActive")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardHover: Color by colors.obtain("surfaceOnLightSolidCardHover")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCardBrightness: Color by
        colors.obtain("surfaceOnLightSolidCardBrightness")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearActive: Color by colors.obtain("surfaceOnLightClearActive")

    /**
     * Основной фон для карточек на светлом фоне
     */
    public var surfaceOnLightSolidCard: Color by colors.obtain("surfaceOnLightSolidCard")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClearHover: Color by colors.obtain("surfaceOnLightClearHover")

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
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public var surfaceOnLightSolidDefaultHover: Color by
        colors.obtain("surfaceOnLightSolidDefaultHover")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardActive: Color by
        colors.obtain("surfaceOnLightTransparentCardActive")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardHover: Color by
        colors.obtain("surfaceOnLightTransparentCardHover")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryActive: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiary: Color by
        colors.obtain("surfaceOnLightTransparentTertiary")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCardBrightness: Color by
        colors.obtain("surfaceOnLightTransparentCardBrightness")

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public var surfaceOnLightTransparentCard: Color by
        colors.obtain("surfaceOnLightTransparentCard")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryActive: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryActive")

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentTertiaryHover: Color by
        colors.obtain("surfaceOnLightTransparentTertiaryHover")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfo: Color by colors.obtain("surfaceOnLightInfo")

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositiveActive: Color by colors.obtain("surfaceOnLightPositiveActive")

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositiveHover: Color by colors.obtain("surfaceOnLightPositiveHover")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeActive: Color by colors.obtain("surfaceOnLightNegativeActive")

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public var surfaceOnLightPositive: Color by colors.obtain("surfaceOnLightPositive")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegativeHover: Color by colors.obtain("surfaceOnLightNegativeHover")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoHover: Color by colors.obtain("surfaceOnLightInfoHover")

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public var surfaceOnLightInfoActive: Color by colors.obtain("surfaceOnLightInfoActive")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccentHover: Color by
        colors.obtain("surfaceOnLightTransparentAccentHover")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccent: Color by
        colors.obtain("surfaceOnLightTransparentAccent")

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentAccentActive: Color by
        colors.obtain("surfaceOnLightTransparentAccentActive")

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarning: Color by colors.obtain("surfaceOnLightWarning")

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningActive: Color by colors.obtain("surfaceOnLightWarningActive")

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public var surfaceOnLightNegative: Color by colors.obtain("surfaceOnLightNegative")

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightWarningHover: Color by colors.obtain("surfaceOnLightWarningHover")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegativeActive: Color by
        colors.obtain("surfaceOnLightTransparentNegativeActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegativeHover: Color by
        colors.obtain("surfaceOnLightTransparentNegativeHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnLightReadOnlyActive: Color by colors.obtain("surfaceOnLightReadOnlyActive")

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public var surfaceOnLightTransparentNegative: Color by
        colors.obtain("surfaceOnLightTransparentNegative")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondary: Color by colors.obtain("surfaceInverseSolidSecondary")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondaryHover: Color by
        colors.obtain("surfaceInverseSolidSecondaryHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnLightReadOnlyHover: Color by colors.obtain("surfaceOnLightReadOnlyHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceOnLightReadOnly: Color by colors.obtain("surfaceOnLightReadOnly")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryBrightness: Color by
        colors.obtain("surfaceInverseSolidPrimaryBrightness")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryActive: Color by
        colors.obtain("surfaceInverseSolidPrimaryActive")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimaryHover: Color by
        colors.obtain("surfaceInverseSolidPrimaryHover")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiaryHover: Color by
        colors.obtain("surfaceInverseTransparentTertiaryHover")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearActive: Color by colors.obtain("surfaceInverseClearActive")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClear: Color by colors.obtain("surfaceInverseClear")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimaryActive: Color by
        colors.obtain("surfaceInverseTransparentPrimaryActive")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondary: Color by
        colors.obtain("surfaceInverseTransparentSecondary")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimaryHover: Color by
        colors.obtain("surfaceInverseTransparentPrimaryHover")

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentDeep: Color by
        colors.obtain("surfaceInverseTransparentDeep")

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentPrimary: Color by
        colors.obtain("surfaceInverseTransparentPrimary")

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentDeepActive: Color by
        colors.obtain("surfaceInverseTransparentDeepActive")

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentDeepHover: Color by
        colors.obtain("surfaceInverseTransparentDeepHover")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardActive: Color by
        colors.obtain("surfaceInverseSolidCardActive")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardHover: Color by colors.obtain("surfaceInverseSolidCardHover")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCardBrightness: Color by
        colors.obtain("surfaceInverseSolidCardBrightness")

    /**
     * Инвертированный основной фон для карточек
     */
    public var surfaceInverseSolidCard: Color by colors.obtain("surfaceInverseSolidCard")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardBrightness: Color by
        colors.obtain("surfaceInverseTransparentCardBrightness")

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public var surfaceInverseTransparentCardHover: Color by
        colors.obtain("surfaceInverseTransparentCardHover")

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefaultActive: Color by
        colors.obtain("surfaceInverseSolidDefaultActive")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiaryActive: Color by
        colors.obtain("surfaceInverseSolidTertiaryActive")

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
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefaultHover: Color by
        colors.obtain("surfaceInverseSolidDefaultHover")

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidTertiaryHover: Color by
        colors.obtain("surfaceInverseSolidTertiaryHover")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondaryActive: Color by
        colors.obtain("surfaceInverseTransparentSecondaryActive")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiary: Color by
        colors.obtain("surfaceInverseTransparentTertiary")

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentSecondaryHover: Color by
        colors.obtain("surfaceInverseTransparentSecondaryHover")

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public var surfaceInverseTransparentTertiaryActive: Color by
        colors.obtain("surfaceInverseTransparentTertiaryActive")

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public var surfaceInverseClearHover: Color by colors.obtain("surfaceInverseClearHover")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningActive: Color by colors.obtain("surfaceInverseWarningActive")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarningHover: Color by colors.obtain("surfaceInverseWarningHover")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentHover: Color by colors.obtain("surfaceInverseAccentHover")

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositiveActive: Color by colors.obtain("surfaceInversePositiveActive")

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositiveHover: Color by colors.obtain("surfaceInversePositiveHover")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeActive: Color by colors.obtain("surfaceInverseNegativeActive")

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public var surfaceInversePositive: Color by colors.obtain("surfaceInversePositive")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegativeHover: Color by colors.obtain("surfaceInverseNegativeHover")

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public var surfaceInverseNegative: Color by colors.obtain("surfaceInverseNegative")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoHover: Color by colors.obtain("surfaceInverseInfoHover")

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseWarning: Color by colors.obtain("surfaceInverseWarning")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccent: Color by
        colors.obtain("surfaceInverseTransparentAccent")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfoActive: Color by colors.obtain("surfaceInverseInfoActive")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccentActive: Color by
        colors.obtain("surfaceInverseTransparentAccentActive")

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public var surfaceInverseInfo: Color by colors.obtain("surfaceInverseInfo")

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseTransparentAccentHover: Color by
        colors.obtain("surfaceInverseTransparentAccentHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegativeActive: Color by
        colors.obtain("surfaceInverseTransparentNegativeActive")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegativeHover: Color by
        colors.obtain("surfaceInverseTransparentNegativeHover")

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public var surfaceInverseTransparentNegative: Color by
        colors.obtain("surfaceInverseTransparentNegative")

    /**
     * Вторичный фон
     */
    public var backgroundDefaultSecondary: Color by colors.obtain("backgroundDefaultSecondary")

    /**
     * Третичный фон
     */
    public var backgroundDefaultTertiary: Color by colors.obtain("backgroundDefaultTertiary")

    /**
     * Основной фон на светлом фоне
     */
    public var backgroundLightPrimary: Color by colors.obtain("backgroundLightPrimary")

    /**
     * Цвет для readOnly
     */
    public var surfaceInverseReadOnlyActive: Color by colors.obtain("surfaceInverseReadOnlyActive")

    /**
     * Вторичный фон на темном фоне
     */
    public var backgroundDarkSecondary: Color by colors.obtain("backgroundDarkSecondary")

    /**
     * Цвет для readOnly
     */
    public var surfaceInverseReadOnlyHover: Color by colors.obtain("surfaceInverseReadOnlyHover")

    /**
     * Цвет для readOnly
     */
    public var surfaceInverseReadOnly: Color by colors.obtain("surfaceInverseReadOnly")

    /**
     * Третичный фон на темном фоне
     */
    public var backgroundDarkTertiary: Color by colors.obtain("backgroundDarkTertiary")

    /**
     * Основной фон
     */
    public var backgroundDefaultPrimary: Color by colors.obtain("backgroundDefaultPrimary")

    /**
     * Цвет фона паранжи светлый на темном фоне
     */
    public var overlayOnDarkSoft: Color by colors.obtain("overlayOnDarkSoft")

    /**
     * Цвет фона паранжи темный на темном фоне
     */
    public var overlayOnDarkHard: Color by colors.obtain("overlayOnDarkHard")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimaryActive: Color by
        colors.obtain("outlineDefaultTransparentPrimaryActive")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimary: Color by
        colors.obtain("outlineDefaultTransparentPrimary")

    /**
     * Основной прозрачный цвет обводки
     */
    public var outlineDefaultTransparentPrimaryHover: Color by
        colors.obtain("outlineDefaultTransparentPrimaryHover")

    /**
     * Цвет фона паранжи темный
     */
    public var overlayDefaultHard: Color by colors.obtain("overlayDefaultHard")

    /**
     * Цвет фона паранжи светлый
     */
    public var overlayDefaultSoft: Color by colors.obtain("overlayDefaultSoft")

    /**
     * Цвет фона паранжи темный на светлом фоне
     */
    public var overlayOnLightHard: Color by colors.obtain("overlayOnLightHard")

    /**
     * Инвертированный цвет фона паранжи светлый
     */
    public var overlayInverseSoft: Color by colors.obtain("overlayInverseSoft")

    /**
     * Цвет фона паранжи светлый на светлом фоне
     */
    public var overlayOnLightSoft: Color by colors.obtain("overlayOnLightSoft")

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public var overlayInverseHard: Color by colors.obtain("overlayInverseHard")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClear: Color by colors.obtain("outlineDefaultClear")

    /**
     * Инвертированный третичный фон
     */
    public var backgroundInverseTertiary: Color by colors.obtain("backgroundInverseTertiary")

    /**
     * Инвертированный вторичный фон
     */
    public var backgroundInverseSecondary: Color by colors.obtain("backgroundInverseSecondary")

    /**
     * Третичный фон на светлом фоне
     */
    public var backgroundLightTertiary: Color by colors.obtain("backgroundLightTertiary")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositive: Color by colors.obtain("outlineDefaultPositive")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegative: Color by colors.obtain("outlineDefaultNegative")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccentHover: Color by colors.obtain("outlineDefaultAccentHover")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccentActive: Color by colors.obtain("outlineDefaultAccentActive")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositiveActive: Color by colors.obtain("outlineDefaultPositiveActive")

    /**
     * Цвет обводки успех
     */
    public var outlineDefaultPositiveHover: Color by colors.obtain("outlineDefaultPositiveHover")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegativeActive: Color by colors.obtain("outlineDefaultNegativeActive")

    /**
     * Цвет обводки ошибка
     */
    public var outlineDefaultNegativeHover: Color by colors.obtain("outlineDefaultNegativeHover")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClearHover: Color by colors.obtain("outlineDefaultClearHover")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfoHover: Color by colors.obtain("outlineDefaultInfoHover")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarningHover: Color by colors.obtain("outlineDefaultWarningHover")

    /**
     * Бесцветная обводка
     */
    public var outlineDefaultClearActive: Color by colors.obtain("outlineDefaultClearActive")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarning: Color by colors.obtain("outlineDefaultWarning")

    /**
     * Цвет обводки предупреждение
     */
    public var outlineDefaultWarningActive: Color by colors.obtain("outlineDefaultWarningActive")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfo: Color by colors.obtain("outlineDefaultInfo")

    /**
     * Цвет обводки информация
     */
    public var outlineDefaultInfoActive: Color by colors.obtain("outlineDefaultInfoActive")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimary: Color by
        colors.obtain("outlineOnDarkTransparentPrimary")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimaryActive: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryActive")

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public var outlineOnDarkTransparentPrimaryHover: Color by
        colors.obtain("outlineOnDarkTransparentPrimaryHover")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarning: Color by colors.obtain("outlineOnDarkWarning")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccent: Color by colors.obtain("outlineOnDarkAccent")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveActive: Color by colors.obtain("outlineOnDarkPositiveActive")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositiveHover: Color by colors.obtain("outlineOnDarkPositiveHover")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeActive: Color by colors.obtain("outlineOnDarkNegativeActive")

    /**
     * Цвет обводки успех на темном фоне
     */
    public var outlineOnDarkPositive: Color by colors.obtain("outlineOnDarkPositive")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegativeHover: Color by colors.obtain("outlineOnDarkNegativeHover")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentHover: Color by colors.obtain("outlineOnDarkAccentHover")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClear: Color by colors.obtain("outlineOnDarkClear")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoHover: Color by colors.obtain("outlineOnDarkInfoHover")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfoActive: Color by colors.obtain("outlineOnDarkInfoActive")

    /**
     * Цвет обводки информация на темном фоне
     */
    public var outlineOnDarkInfo: Color by colors.obtain("outlineOnDarkInfo")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClearHover: Color by colors.obtain("outlineOnDarkClearHover")

    /**
     * Бесцветная обводка на темном фоне
     */
    public var outlineOnDarkClearActive: Color by colors.obtain("outlineOnDarkClearActive")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningActive: Color by colors.obtain("outlineOnDarkWarningActive")

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public var outlineOnDarkNegative: Color by colors.obtain("outlineOnDarkNegative")

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public var outlineOnDarkWarningHover: Color by colors.obtain("outlineOnDarkWarningHover")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositiveHover: Color by colors.obtain("outlineOnLightPositiveHover")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClear: Color by colors.obtain("outlineOnLightClear")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClearHover: Color by colors.obtain("outlineOnLightClearHover")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimary: Color by
        colors.obtain("outlineOnLightTransparentPrimary")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimaryActive: Color by
        colors.obtain("outlineOnLightTransparentPrimaryActive")

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public var outlineOnLightTransparentPrimaryHover: Color by
        colors.obtain("outlineOnLightTransparentPrimaryHover")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentHover: Color by colors.obtain("outlineOnLightAccentHover")

    /**
     * Цвет обводки успех на светлом фоне
     */
    public var outlineOnLightPositive: Color by colors.obtain("outlineOnLightPositive")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccentActive: Color by colors.obtain("outlineOnLightAccentActive")

    /**
     * Бесцветная обводка на светлом фоне
     */
    public var outlineOnLightClearActive: Color by colors.obtain("outlineOnLightClearActive")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeActive: Color by colors.obtain("outlineOnLightNegativeActive")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegativeHover: Color by colors.obtain("outlineOnLightNegativeHover")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarning: Color by colors.obtain("outlineOnLightWarning")

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public var outlineOnLightWarningHover: Color by colors.obtain("outlineOnLightWarningHover")

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public var outlineOnLightNegative: Color by colors.obtain("outlineOnLightNegative")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoHover: Color by colors.obtain("outlineOnLightInfoHover")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfo: Color by colors.obtain("outlineOnLightInfo")

    /**
     * Цвет обводки информация на светлом фоне
     */
    public var outlineOnLightInfoActive: Color by colors.obtain("outlineOnLightInfoActive")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccentActive: Color by colors.obtain("outlineInverseAccentActive")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClear: Color by colors.obtain("outlineInverseClear")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClearActive: Color by colors.obtain("outlineInverseClearActive")

    /**
     * Инвертированная бесцветная обводка
     */
    public var outlineInverseClearHover: Color by colors.obtain("outlineInverseClearHover")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimaryHover: Color by
        colors.obtain("outlineInverseTransparentPrimaryHover")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimary: Color by
        colors.obtain("outlineInverseTransparentPrimary")

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public var outlineInverseTransparentPrimaryActive: Color by
        colors.obtain("outlineInverseTransparentPrimaryActive")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositive: Color by colors.obtain("outlineInversePositive")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegative: Color by colors.obtain("outlineInverseNegative")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfoHover: Color by colors.obtain("outlineInverseInfoHover")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfoActive: Color by colors.obtain("outlineInverseInfoActive")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositiveActive: Color by colors.obtain("outlineInversePositiveActive")

    /**
     * Инвертированный цвет обводки успех
     */
    public var outlineInversePositiveHover: Color by colors.obtain("outlineInversePositiveHover")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegativeActive: Color by colors.obtain("outlineInverseNegativeActive")

    /**
     * Инвертированный цвет обводки ошибка
     */
    public var outlineInverseNegativeHover: Color by colors.obtain("outlineInverseNegativeHover")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarningActive: Color by colors.obtain("outlineInverseWarningActive")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarningHover: Color by colors.obtain("outlineInverseWarningHover")

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public var outlineInverseWarning: Color by colors.obtain("outlineInverseWarning")

    /**
     * Инвертированный цвет обводки информация
     */
    public var outlineInverseInfo: Color by colors.obtain("outlineInverseInfo")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinorHover: Color by
        colors.obtain("surfaceInverseAccentMinorHover")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public var surfaceOnDarkSolidDefault: Color by colors.obtain("surfaceOnDarkSolidDefault")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightAccentMinorActive: Color by
        colors.obtain("surfaceOnLightAccentMinorActive")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryHover: Color by colors.obtain("textDefaultPrimaryHover")

    /**
     * Основной фон на темном фоне
     */
    public var backgroundDarkPrimary: Color by colors.obtain("backgroundDarkPrimary")

    /**
     * Inverse Background Hardline
     */
    public var backgroundInverseHardline: Color by colors.obtain("backgroundInverseHardline")

    /**
     * Инвертированный основной фон
     */
    public var backgroundInversePrimary: Color by colors.obtain("backgroundInversePrimary")

    /**
     * Light Background Hardline
     */
    public var backgroundLightHardline: Color by colors.obtain("backgroundLightHardline")

    /**
     * Вторичный фон на светлом фоне
     */
    public var backgroundLightSecondary: Color by colors.obtain("backgroundLightSecondary")

    /**
     * Акцентный цвет обводки
     */
    public var outlineDefaultAccent: Color by colors.obtain("outlineDefaultAccent")

    /**
     * New description
     */
    public var outlineDefaultDeep: Color by colors.obtain("outlineDefaultDeep")

    /**
     * Outline Default
     */
    public var outlineDefaultDefault: Color by colors.obtain("outlineDefaultDefault")

    /**
     * Default Active Default
     */
    public var outlineDefaultDefaultActive: Color by colors.obtain("outlineDefaultDefaultActive")

    /**
     * Default Hover Default
     */
    public var outlineDefaultDefaultHover: Color by colors.obtain("outlineDefaultDefaultHover")

    /**
     * New description
     */
    public var outlineDefaultTransparentWhite: Color by
        colors.obtain("outlineDefaultTransparentWhite")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccent: Color by colors.obtain("outlineInverseAccent")

    /**
     * Инвертированный акцентный цвет обводки
     */
    public var outlineInverseAccentHover: Color by colors.obtain("outlineInverseAccentHover")

    /**
     * Inverse Outline Default
     */
    public var outlineInverseDefault: Color by colors.obtain("outlineInverseDefault")

    /**
     * Default Active Inverse
     */
    public var outlineInverseDefaultActive: Color by colors.obtain("outlineInverseDefaultActive")

    /**
     * Default Hover On Light
     */
    public var outlineOnLightDefaultHover: Color by colors.obtain("outlineOnLightDefaultHover")

    /**
     * Primary Hover On Light
     */
    public var outlineOnLightPrimaryHover: Color by colors.obtain("outlineOnLightPrimaryHover")

    /**
     * Blue Text Accent Hover Default
     */
    public var personasDefaultBlueTextAccentHover: Color by
        colors.obtain("personasDefaultBlueTextAccentHover")

    /**
     * Green Text Accent Hover Default
     */
    public var personasDefaultGreenTextAccentHover: Color by
        colors.obtain("personasDefaultGreenTextAccentHover")

    /**
     * Indigo Text Accent Hover Default
     */
    public var personasDefaultIndigoTextAccentHover: Color by
        colors.obtain("personasDefaultIndigoTextAccentHover")

    /**
     * Sea Blue Text Accent Hover Default
     */
    public var personasDefaultSeaBlueTextAccentHover: Color by
        colors.obtain("personasDefaultSeaBlueTextAccentHover")

    /**
     * Blue Text Accent Hover On Dark
     */
    public var personasOnDarkBlueTextAccentHover: Color by
        colors.obtain("personasOnDarkBlueTextAccentHover")

    /**
     * Olive Text Accent Hover On Dark
     */
    public var personasOnDarkOliveTextAccentHover: Color by
        colors.obtain("personasOnDarkOliveTextAccentHover")

    /**
     * Sea Blue Text Accent Hover On Dark
     */
    public var personasOnDarkSeaBlueTextAccentHover: Color by
        colors.obtain("personasOnDarkSeaBlueTextAccentHover")

    /**
     * Violet Text Accent Hover On Dark
     */
    public var personasOnDarkVioletTextAccentHover: Color by
        colors.obtain("personasOnDarkVioletTextAccentHover")

    /**
     * Indigo Text Accent Hover On Light
     */
    public var personasOnLightIndigoTextAccentHover: Color by
        colors.obtain("personasOnLightIndigoTextAccentHover")

    /**
     * Pink Text Accent Hover On Light
     */
    public var personasOnLightPinkTextAccentHover: Color by
        colors.obtain("personasOnLightPinkTextAccentHover")

    /**
     * Sea Blue Text Accent Hover On Light
     */
    public var personasOnLightSeaBlueTextAccentHover: Color by
        colors.obtain("personasOnLightSeaBlueTextAccentHover")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinorHover: Color by
        colors.obtain("surfaceDefaultAccentMinorHover")

    /**
     * Accent Secondary Hover Inverse
     */
    public var surfaceInverseAccentSecondaryHover: Color by
        colors.obtain("surfaceInverseAccentSecondaryHover")

    /**
     * Accent Secondary Hover On Dark
     */
    public var surfaceOnDarkAccentSecondaryHover: Color by
        colors.obtain("surfaceOnDarkAccentSecondaryHover")

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentDeepHover: Color by
        colors.obtain("surfaceOnLightTransparentDeepHover")

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public var surfaceOnLightTransparentSecondaryHover: Color by
        colors.obtain("surfaceOnLightTransparentSecondaryHover")

    /**
     * Акцентный цвет
     */
    public var textDefaultAccentHover: Color by colors.obtain("textDefaultAccentHover")

    /**
     * Primary Active Inverse
     */
    public var outlineInversePrimaryActive: Color by colors.obtain("outlineInversePrimaryActive")

    /**
     * New description
     */
    public var outlineInverseTransparentWhiteActive: Color by
        colors.obtain("outlineInverseTransparentWhiteActive")

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public var outlineOnDarkAccentActive: Color by colors.obtain("outlineOnDarkAccentActive")

    /**
     * Default Active On Dark
     */
    public var outlineOnDarkDefaultActive: Color by colors.obtain("outlineOnDarkDefaultActive")

    /**
     * Primary Active On Dark
     */
    public var outlineOnDarkPrimaryActive: Color by colors.obtain("outlineOnDarkPrimaryActive")

    /**
     * Ochre Text Accent Active Default
     */
    public var personasDefaultOchreTextAccentActive: Color by
        colors.obtain("personasDefaultOchreTextAccentActive")

    /**
     * Olive Text Accent Active Default
     */
    public var personasDefaultOliveTextAccentActive: Color by
        colors.obtain("personasDefaultOliveTextAccentActive")

    /**
     * Violet Text Accent Active Default
     */
    public var personasDefaultVioletTextAccentActive: Color by
        colors.obtain("personasDefaultVioletTextAccentActive")

    /**
     * Sea Blue Text Accent Active Inverse
     */
    public var personasInverseSeaBlueTextAccentActive: Color by
        colors.obtain("personasInverseSeaBlueTextAccentActive")

    /**
     * Violet Text Accent Active Inverse
     */
    public var personasInverseVioletTextAccentActive: Color by
        colors.obtain("personasInverseVioletTextAccentActive")

    /**
     * Green Text Accent Active On Light
     */
    public var personasOnLightGreenTextAccentActive: Color by
        colors.obtain("personasOnLightGreenTextAccentActive")

    /**
     * Ochre Text Accent Active On Light
     */
    public var personasOnLightOchreTextAccentActive: Color by
        colors.obtain("personasOnLightOchreTextAccentActive")

    /**
     * Violet Text Accent Active On Light
     */
    public var personasOnLightVioletTextAccentActive: Color by
        colors.obtain("personasOnLightVioletTextAccentActive")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultAccentMinorActive: Color by
        colors.obtain("surfaceDefaultAccentMinorActive")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryActive: Color by
        colors.obtain("surfaceDefaultSolidPrimaryActive")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryBrightnessHover: Color by
        colors.obtain("surfaceDefaultSolidPrimaryBrightnessHover")

    /**
     * Transparent Navi Active Default
     */
    public var surfaceDefaultTransparentNaviActive: Color by
        colors.obtain("surfaceDefaultTransparentNaviActive")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccentActive: Color by colors.obtain("surfaceInverseAccentActive")

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseAccentMinorActive: Color by
        colors.obtain("surfaceInverseAccentMinorActive")

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidSecondaryActive: Color by
        colors.obtain("surfaceInverseSolidSecondaryActive")

    /**
     * Transparent Accent Minor Active On Light
     */
    public var surfaceOnLightTransparentAccentMinorActive: Color by
        colors.obtain("surfaceOnLightTransparentAccentMinorActive")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccentActive: Color by colors.obtain("textOnDarkAccentActive")

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public var outlineOnLightAccent: Color by colors.obtain("outlineOnLightAccent")

    /**
     * On Light Outline Primary
     */
    public var outlineOnLightPrimary: Color by colors.obtain("outlineOnLightPrimary")

    /**
     * Inverse Personas Sea Blue Text Accent
     */
    public var personasInverseSeaBlueTextAccent: Color by
        colors.obtain("personasInverseSeaBlueTextAccent")

    /**
     * Акцентный фон поверхности/контрола
     */
    public var surfaceDefaultAccent: Color by colors.obtain("surfaceDefaultAccent")

    /**
     * Цвет фона поверхности/контрола информация
     */
    public var surfaceDefaultInfo: Color by colors.obtain("surfaceDefaultInfo")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardBrightnessActive: Color by
        colors.obtain("surfaceDefaultSolidCardBrightnessActive")

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceDefaultSolidDefault: Color by colors.obtain("surfaceDefaultSolidDefault")

    /**
     * Surface Transparent Navi
     */
    public var surfaceDefaultTransparentNavi: Color by
        colors.obtain("surfaceDefaultTransparentNavi")

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public var surfaceInverseAccent: Color by colors.obtain("surfaceInverseAccent")

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public var surfaceInverseSolidPrimary: Color by colors.obtain("surfaceInverseSolidPrimary")

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public var surfaceOnDarkAccentMinor: Color by colors.obtain("surfaceOnDarkAccentMinor")

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public var surfaceOnLightClear: Color by colors.obtain("surfaceOnLightClear")

    /**
     * Основной цвет текста
     */
    public var textDefaultPrimaryBrightnessActive: Color by
        colors.obtain("textDefaultPrimaryBrightnessActive")

    /**
     * Инвертированный акцентный цвет
     */
    public var textInverseAccent: Color by colors.obtain("textInverseAccent")

    /**
     * Акцентный цвет на темном фоне
     */
    public var textOnDarkAccent: Color by colors.obtain("textOnDarkAccent")

    /**
     * Dark Background Hardline
     */
    public var backgroundDarkHardline: Color by colors.obtain("backgroundDarkHardline")

    /**
     * Основной фон для карточек
     */
    public var surfaceDefaultSolidCardBrightnessHover: Color by
        colors.obtain("surfaceDefaultSolidCardBrightnessHover")

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public var surfaceDefaultSolidPrimaryBrightness: Color by
        colors.obtain("surfaceDefaultSolidPrimaryBrightness")

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public var surfaceInverseSolidDefault: Color by colors.obtain("surfaceInverseSolidDefault")

    /**
     * Основной фон для карточек на темном фоне
     */
    public var surfaceOnDarkSolidCardBrightnessActive: Color by
        colors.obtain("surfaceOnDarkSolidCardBrightnessActive")

    /**
     * Сплошной наборный текст на темном фоне
     */
    public var textOnDarkParagraphActive: Color by colors.obtain("textOnDarkParagraphActive")

    /**
     * New description
     */
    public var overlayDefaultMedium: Color by colors.obtain("overlayDefaultMedium")

    /**
     * New description
     */
    public var overlayInverseMedium: Color by colors.obtain("overlayInverseMedium")

    /**
     * New description
     */
    public var overlayOnDarkMedium: Color by colors.obtain("overlayOnDarkMedium")

    /**
     * New description
     */
    public var overlayOnLightMedium: Color by colors.obtain("overlayOnLightMedium")

    /**
     * Возвращает копию [SddsSbComColors]. Предоставляет возможность переопределять цвета.
     */
    public fun copy(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsSbComColors {
        val colorOverrideScope = ColorOverrideScope()
        overrideColors.invoke(colorOverrideScope)
        val overrideMap = colorOverrideScope.overrideMap
        return SddsSbComColors(colors.mapValues { overrideMap[it.key] ?: it.value })
    }

    /**
     * Возвращает копию [SddsSbComColors]. Предоставляет возможность переопределять цвета.
     */
    internal fun copyAttrs(overrideColors: ColorAttrOverrideScope.() -> Unit = {}): SddsSbComColors {
        val colorOverrideScope = ColorAttrOverrideScope()
        overrideColors.invoke(colorOverrideScope)
        val overrideMap = colorOverrideScope.overrideMap
        return SddsSbComColors(colors.mapValues { colors[overrideMap[it.key]] ?: it.value })
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
     * Default Hover On Dark
     */
    public val outlineOnDarkDefaultHover: String = "outlineOnDarkDefaultHover"

    /**
     * Accent Secondary Hover Default
     */
    public val surfaceDefaultAccentSecondaryHover: String = "surfaceDefaultAccentSecondaryHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightnessHover: String =
        "surfaceDefaultTransparentCardBrightnessHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightnessActive: String =
        "surfaceDefaultTransparentCardBrightnessActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightnessHover: String =
        "surfaceOnLightSolidPrimaryBrightnessHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightnessActive: String =
        "surfaceOnLightSolidPrimaryBrightnessActive"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightnessHover: String =
        "surfaceOnDarkTransparentCardBrightnessHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightnessHover: String =
        "surfaceOnDarkSolidCardBrightnessHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightnessActive: String =
        "surfaceOnDarkTransparentCardBrightnessActive"

    /**
     * On Light Personas Olive Text Accent
     */
    public val personasOnLightOliveTextAccent: String = "personasOnLightOliveTextAccent"

    /**
     * On Dark Personas Olive Text Accent
     */
    public val personasOnDarkOliveTextAccent: String = "personasOnDarkOliveTextAccent"

    /**
     * Inverse Personas Ochre Text Accent
     */
    public val personasInverseOchreTextAccent: String = "personasInverseOchreTextAccent"

    /**
     * Inverse Personas Pink Text Accent
     */
    public val personasInversePinkTextAccent: String = "personasInversePinkTextAccent"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryActive: String = "surfaceDefaultSolidTertiaryActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightnessHover: String =
        "surfaceInverseSolidPrimaryBrightnessHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimary: String = "textDefaultPrimary"

    /**
     * Inverse Surface Transparent Navi
     */
    public val surfaceInverseTransparentNavi: String = "surfaceInverseTransparentNavi"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightnessHover: String =
        "surfaceInverseTransparentCardBrightnessHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryActive: String = "surfaceOnLightSolidTertiaryActive"

    /**
     * Inverse Personas Indigo Text Accent
     */
    public val personasInverseIndigoTextAccent: String = "personasInverseIndigoTextAccent"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightnessActive: String =
        "surfaceInverseSolidPrimaryBrightnessActive"

    /**
     * Personas Olive Text Accent
     */
    public val personasDefaultOliveTextAccent: String = "personasDefaultOliveTextAccent"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorHover: String = "textOnDarkAccentMinorHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightnessActive: String =
        "surfaceOnLightTransparentCardBrightnessActive"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightnessHover: String =
        "surfaceOnLightTransparentCardBrightnessHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightnessActive: String =
        "surfaceOnLightSolidCardBrightnessActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorActive: String = "surfaceOnDarkAccentMinorActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightnessHover: String =
        "surfaceOnLightSolidCardBrightnessHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveActive: String = "outlineOnLightPositiveActive"

    /**
     * Outline Primary
     */
    public val outlineDefaultPrimary: String = "outlineDefaultPrimary"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiary: String = "surfaceInverseSolidTertiary"

    /**
     * Inverse Personas Green Text Accent
     */
    public val personasInverseGreenTextAccent: String = "personasInverseGreenTextAccent"

    /**
     * Surface Accent Secondary
     */
    public val surfaceDefaultAccentSecondary: String = "surfaceDefaultAccentSecondary"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinor: String = "surfaceDefaultAccentMinor"

    /**
     * On Dark Surface Accent Secondary
     */
    public val surfaceOnDarkAccentSecondary: String = "surfaceOnDarkAccentSecondary"

    /**
     * On Dark Personas Indigo Text Accent
     */
    public val personasOnDarkIndigoTextAccent: String = "personasOnDarkIndigoTextAccent"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryActive: String = "surfaceOnDarkSolidTertiaryActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinor: String = "surfaceOnLightAccentMinor"

    /**
     * On Light Personas Ochre Text Accent
     */
    public val personasOnLightOchreTextAccent: String = "personasOnLightOchreTextAccent"

    /**
     * On Light Personas Violet Text Accent
     */
    public val personasOnLightVioletTextAccent: String = "personasOnLightVioletTextAccent"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightnessActive: String =
        "surfaceInverseTransparentCardBrightnessActive"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningActive: String = "outlineOnLightWarningActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorHover: String = "surfaceOnDarkAccentMinorHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightnessActive: String =
        "surfaceInverseSolidCardBrightnessActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorHover: String = "surfaceOnLightAccentMinorHover"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinor: String = "surfaceInverseAccentMinor"

    /**
     * On Dark Surface Transparent Accent Minor
     */
    public val surfaceOnDarkTransparentAccentMinor: String = "surfaceOnDarkTransparentAccentMinor"

    /**
     * On Light Personas Sea Blue Text Accent
     */
    public val personasOnLightSeaBlueTextAccent: String = "personasOnLightSeaBlueTextAccent"

    /**
     * On Dark Personas Blue Text Accent
     */
    public val personasOnDarkBlueTextAccent: String = "personasOnDarkBlueTextAccent"

    /**
     * On Dark Personas Violet Text Accent
     */
    public val personasOnDarkVioletTextAccent: String = "personasOnDarkVioletTextAccent"

    /**
     * Personas Ochre Text Accent
     */
    public val personasDefaultOchreTextAccent: String = "personasDefaultOchreTextAccent"

    /**
     * On Light Surface Transparent Navi
     */
    public val surfaceOnLightTransparentNavi: String = "surfaceOnLightTransparentNavi"

    /**
     * Blue Text Accent Active Inverse
     */
    public val personasInverseBlueTextAccentActive: String = "personasInverseBlueTextAccentActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningActive: String = "textOnLightWarningActive"

    /**
     * Olive Text Accent Hover Inverse
     */
    public val personasInverseOliveTextAccentHover: String = "personasInverseOliveTextAccentHover"

    /**
     * Transparent Navi Active On Light
     */
    public val surfaceOnLightTransparentNaviActive: String = "surfaceOnLightTransparentNaviActive"

    /**
     * Blue Text Accent Active On Light
     */
    public val personasOnLightBlueTextAccentActive: String = "personasOnLightBlueTextAccentActive"

    /**
     * Primary Active On Light
     */
    public val outlineOnLightPrimaryActive: String = "outlineOnLightPrimaryActive"

    /**
     * Default Active On Light
     */
    public val outlineOnLightDefaultActive: String = "outlineOnLightDefaultActive"

    /**
     * Olive Text Accent Active On Dark
     */
    public val personasOnDarkOliveTextAccentActive: String = "personasOnDarkOliveTextAccentActive"

    /**
     * On Dark Personas Sea Blue Text Accent
     */
    public val personasOnDarkSeaBlueTextAccent: String = "personasOnDarkSeaBlueTextAccent"

    /**
     * Violet Text Accent Active On Dark
     */
    public val personasOnDarkVioletTextAccentActive: String = "personasOnDarkVioletTextAccentActive"

    /**
     * Green Text Accent Hover On Dark
     */
    public val personasOnDarkGreenTextAccentHover: String = "personasOnDarkGreenTextAccentHover"

    /**
     * Accent Secondary Active On Dark
     */
    public val surfaceOnDarkAccentSecondaryActive: String = "surfaceOnDarkAccentSecondaryActive"

    /**
     * Green Text Accent Active Inverse
     */
    public val personasInverseGreenTextAccentActive: String = "personasInverseGreenTextAccentActive"

    /**
     * Inverse Surface Accent Secondary
     */
    public val surfaceInverseAccentSecondary: String = "surfaceInverseAccentSecondary"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightnessHover: String = "textOnDarkPrimaryBrightnessHover"

    /**
     * Pink Text Accent Active On Dark
     */
    public val personasOnDarkPinkTextAccentActive: String = "personasOnDarkPinkTextAccentActive"

    /**
     * Indigo Text Accent Active Inverse
     */
    public val personasInverseIndigoTextAccentActive: String =
        "personasInverseIndigoTextAccentActive"

    /**
     * Sea Blue Text Accent Active Default
     */
    public val personasDefaultSeaBlueTextAccentActive: String =
        "personasDefaultSeaBlueTextAccentActive"

    /**
     * On Light Surface Transparent Accent Minor
     */
    public val surfaceOnLightTransparentAccentMinor: String = "surfaceOnLightTransparentAccentMinor"

    /**
     * Pink Text Accent Active On Light
     */
    public val personasOnLightPinkTextAccentActive: String = "personasOnLightPinkTextAccentActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightnessHover: String = "textDefaultPrimaryBrightnessHover"

    /**
     * Transparent Accent Minor Active Inverse
     */
    public val surfaceInverseTransparentAccentMinorActive: String =
        "surfaceInverseTransparentAccentMinorActive"

    /**
     * Ochre Text Accent Hover Default
     */
    public val personasDefaultOchreTextAccentHover: String = "personasDefaultOchreTextAccentHover"

    /**
     * Pink Text Accent Active Inverse
     */
    public val personasInversePinkTextAccentActive: String = "personasInversePinkTextAccentActive"

    /**
     * Transparent Navi Hover On Light
     */
    public val surfaceOnLightTransparentNaviHover: String = "surfaceOnLightTransparentNaviHover"

    /**
     * Primary Active Default
     */
    public val outlineDefaultPrimaryActive: String = "outlineDefaultPrimaryActive"

    /**
     * Sea Blue Text Accent Active On Dark
     */
    public val personasOnDarkSeaBlueTextAccentActive: String =
        "personasOnDarkSeaBlueTextAccentActive"

    /**
     * On Light Personas Green Text Accent
     */
    public val personasOnLightGreenTextAccent: String = "personasOnLightGreenTextAccent"

    /**
     * Accent Secondary Active Inverse
     */
    public val surfaceInverseAccentSecondaryActive: String = "surfaceInverseAccentSecondaryActive"

    /**
     * Indigo Text Accent Active Default
     */
    public val personasDefaultIndigoTextAccentActive: String =
        "personasDefaultIndigoTextAccentActive"

    /**
     * Green Text Accent Active Default
     */
    public val personasDefaultGreenTextAccentActive: String = "personasDefaultGreenTextAccentActive"

    /**
     * Transparent Navi Hover On Dark
     */
    public val surfaceOnDarkTransparentNaviHover: String = "surfaceOnDarkTransparentNaviHover"

    /**
     * Sea Blue Text Accent Hover Inverse
     */
    public val personasInverseSeaBlueTextAccentHover: String =
        "personasInverseSeaBlueTextAccentHover"

    /**
     * Accent Secondary Hover On Light
     */
    public val surfaceOnLightAccentSecondaryHover: String = "surfaceOnLightAccentSecondaryHover"

    /**
     * Blue Text Accent Hover Inverse
     */
    public val personasInverseBlueTextAccentHover: String = "personasInverseBlueTextAccentHover"

    /**
     * Indigo Text Accent Hover Inverse
     */
    public val personasInverseIndigoTextAccentHover: String = "personasInverseIndigoTextAccentHover"

    /**
     * On Dark Personas Ochre Text Accent
     */
    public val personasOnDarkOchreTextAccent: String = "personasOnDarkOchreTextAccent"

    /**
     * Green Text Accent Hover On Light
     */
    public val personasOnLightGreenTextAccentHover: String = "personasOnLightGreenTextAccentHover"

    /**
     * Ochre Text Accent Active On Dark
     */
    public val personasOnDarkOchreTextAccentActive: String = "personasOnDarkOchreTextAccentActive"

    /**
     * Ochre Text Accent Hover On Light
     */
    public val personasOnLightOchreTextAccentHover: String = "personasOnLightOchreTextAccentHover"

    /**
     * Primary Hover Default
     */
    public val outlineDefaultPrimaryHover: String = "outlineDefaultPrimaryHover"

    /**
     * Transparent Accent Minor Active Default
     */
    public val surfaceDefaultTransparentAccentMinorActive: String =
        "surfaceDefaultTransparentAccentMinorActive"

    /**
     * Transparent Navi Hover Default
     */
    public val surfaceDefaultTransparentNaviHover: String = "surfaceDefaultTransparentNaviHover"

    /**
     * Default Hover Inverse
     */
    public val outlineInverseDefaultHover: String = "outlineInverseDefaultHover"

    /**
     * Violet Text Accent Hover Inverse
     */
    public val personasInverseVioletTextAccentHover: String = "personasInverseVioletTextAccentHover"

    /**
     * Transparent Accent Minor Hover On Light
     */
    public val surfaceOnLightTransparentAccentMinorHover: String =
        "surfaceOnLightTransparentAccentMinorHover"

    /**
     * Transparent Accent Minor Hover Inverse
     */
    public val surfaceInverseTransparentAccentMinorHover: String =
        "surfaceInverseTransparentAccentMinorHover"

    /**
     * Transparent Navi Hover Inverse
     */
    public val surfaceInverseTransparentNaviHover: String = "surfaceInverseTransparentNaviHover"

    /**
     * Primary Hover Inverse
     */
    public val outlineInversePrimaryHover: String = "outlineInversePrimaryHover"

    /**
     * Olive Text Accent Hover Default
     */
    public val personasDefaultOliveTextAccentHover: String = "personasDefaultOliveTextAccentHover"

    /**
     * Personas Violet Text Accent
     */
    public val personasDefaultVioletTextAccent: String = "personasDefaultVioletTextAccent"

    /**
     * Ochre Text Accent Hover Inverse
     */
    public val personasInverseOchreTextAccentHover: String = "personasInverseOchreTextAccentHover"

    /**
     * Green Text Accent Active On Dark
     */
    public val personasOnDarkGreenTextAccentActive: String = "personasOnDarkGreenTextAccentActive"

    /**
     * Pink Text Accent Hover On Dark
     */
    public val personasOnDarkPinkTextAccentHover: String = "personasOnDarkPinkTextAccentHover"

    /**
     * Pink Text Accent Hover Inverse
     */
    public val personasInversePinkTextAccentHover: String = "personasInversePinkTextAccentHover"

    /**
     * Indigo Text Accent Hover On Dark
     */
    public val personasOnDarkIndigoTextAccentHover: String = "personasOnDarkIndigoTextAccentHover"

    /**
     * Blue Text Accent Hover On Light
     */
    public val personasOnLightBlueTextAccentHover: String = "personasOnLightBlueTextAccentHover"

    /**
     * Olive Text Accent Hover On Light
     */
    public val personasOnLightOliveTextAccentHover: String = "personasOnLightOliveTextAccentHover"

    /**
     * Violet Text Accent Hover On Light
     */
    public val personasOnLightVioletTextAccentHover: String = "personasOnLightVioletTextAccentHover"

    /**
     * Primary Hover On Dark
     */
    public val outlineOnDarkPrimaryHover: String = "outlineOnDarkPrimaryHover"

    /**
     * On Dark Personas Pink Text Accent
     */
    public val personasOnDarkPinkTextAccent: String = "personasOnDarkPinkTextAccent"

    /**
     * On Dark Outline Primary
     */
    public val outlineOnDarkPrimary: String = "outlineOnDarkPrimary"

    /**
     * On Light Personas Blue Text Accent
     */
    public val personasOnLightBlueTextAccent: String = "personasOnLightBlueTextAccent"

    /**
     * Accent Secondary Active Default
     */
    public val surfaceDefaultAccentSecondaryActive: String = "surfaceDefaultAccentSecondaryActive"

    /**
     * Personas Blue Text Accent
     */
    public val personasDefaultBlueTextAccent: String = "personasDefaultBlueTextAccent"

    /**
     * Blue Text Accent Active Default
     */
    public val personasDefaultBlueTextAccentActive: String = "personasDefaultBlueTextAccentActive"

    /**
     * Personas Green Text Accent
     */
    public val personasDefaultGreenTextAccent: String = "personasDefaultGreenTextAccent"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightnessActive: String =
        "surfaceDefaultSolidPrimaryBrightnessActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightnessHover: String = "textOnLightPrimaryBrightnessHover"

    /**
     * Personas Pink Text Accent
     */
    public val personasDefaultPinkTextAccent: String = "personasDefaultPinkTextAccent"

    /**
     * Personas Sea Blue Text Accent
     */
    public val personasDefaultSeaBlueTextAccent: String = "personasDefaultSeaBlueTextAccent"

    /**
     * Surface Transparent Accent Minor
     */
    public val surfaceDefaultTransparentAccentMinor: String = "surfaceDefaultTransparentAccentMinor"

    /**
     * Violet Text Accent Hover Default
     */
    public val personasDefaultVioletTextAccentHover: String = "personasDefaultVioletTextAccentHover"

    /**
     * Inverse Personas Blue Text Accent
     */
    public val personasInverseBlueTextAccent: String = "personasInverseBlueTextAccent"

    /**
     * Olive Text Accent Active Inverse
     */
    public val personasInverseOliveTextAccentActive: String = "personasInverseOliveTextAccentActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightnessHover: String =
        "surfaceInverseSolidCardBrightnessHover"

    /**
     * Inverse Surface Transparent Accent Minor
     */
    public val surfaceInverseTransparentAccentMinor: String = "surfaceInverseTransparentAccentMinor"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightnessHover: String =
        "surfaceOnDarkSolidPrimaryBrightnessHover"

    /**
     * On Dark Surface Transparent Navi
     */
    public val surfaceOnDarkTransparentNavi: String = "surfaceOnDarkTransparentNavi"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightnessHover: String = "textInversePrimaryBrightnessHover"

    /**
     * Background Hardline
     */
    public val backgroundDefaultHardline: String = "backgroundDefaultHardline"

    /**
     * Inverse Outline Primary
     */
    public val outlineInversePrimary: String = "outlineInversePrimary"

    /**
     * On Dark Outline Default
     */
    public val outlineOnDarkDefault: String = "outlineOnDarkDefault"

    /**
     * Inverse Personas Violet Text Accent
     */
    public val personasInverseVioletTextAccent: String = "personasInverseVioletTextAccent"

    /**
     * Personas Indigo Text Accent
     */
    public val personasDefaultIndigoTextAccent: String = "personasDefaultIndigoTextAccent"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightnessActive: String = "textInversePrimaryBrightnessActive"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightnessActive: String = "textOnDarkPrimaryBrightnessActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightnessActive: String = "textOnLightPrimaryBrightnessActive"

    /**
     * Indigo Text Accent Active On Dark
     */
    public val personasOnDarkIndigoTextAccentActive: String = "personasOnDarkIndigoTextAccentActive"

    /**
     * Ochre Text Accent Hover On Dark
     */
    public val personasOnDarkOchreTextAccentHover: String = "personasOnDarkOchreTextAccentHover"

    /**
     * Pink Text Accent Hover Default
     */
    public val personasDefaultPinkTextAccentHover: String = "personasDefaultPinkTextAccentHover"

    /**
     * Transparent Navi Active On Dark
     */
    public val surfaceOnDarkTransparentNaviActive: String = "surfaceOnDarkTransparentNaviActive"

    /**
     * On Light Surface Accent Secondary
     */
    public val surfaceOnLightAccentSecondary: String = "surfaceOnLightAccentSecondary"

    /**
     * On Light Outline Default
     */
    public val outlineOnLightDefault: String = "outlineOnLightDefault"

    /**
     * Pink Text Accent Active Default
     */
    public val personasDefaultPinkTextAccentActive: String = "personasDefaultPinkTextAccentActive"

    /**
     * Ochre Text Accent Active Inverse
     */
    public val personasInverseOchreTextAccentActive: String = "personasInverseOchreTextAccentActive"

    /**
     * Inverse Personas Olive Text Accent
     */
    public val personasInverseOliveTextAccent: String = "personasInverseOliveTextAccent"

    /**
     * Blue Text Accent Active On Dark
     */
    public val personasOnDarkBlueTextAccentActive: String = "personasOnDarkBlueTextAccentActive"

    /**
     * On Dark Personas Green Text Accent
     */
    public val personasOnDarkGreenTextAccent: String = "personasOnDarkGreenTextAccent"

    /**
     * Olive Text Accent Active On Light
     */
    public val personasOnLightOliveTextAccentActive: String = "personasOnLightOliveTextAccentActive"

    /**
     * On Light Personas Pink Text Accent
     */
    public val personasOnLightPinkTextAccent: String = "personasOnLightPinkTextAccent"

    /**
     * Sea Blue Text Accent Active On Light
     */
    public val personasOnLightSeaBlueTextAccentActive: String =
        "personasOnLightSeaBlueTextAccentActive"

    /**
     * Transparent Accent Minor Hover Default
     */
    public val surfaceDefaultTransparentAccentMinorHover: String =
        "surfaceDefaultTransparentAccentMinorHover"

    /**
     * Transparent Navi Active Inverse
     */
    public val surfaceInverseTransparentNaviActive: String = "surfaceInverseTransparentNaviActive"

    /**
     * Transparent Accent Minor Hover On Dark
     */
    public val surfaceOnDarkTransparentAccentMinorHover: String =
        "surfaceOnDarkTransparentAccentMinorHover"

    /**
     * On Light Personas Indigo Text Accent
     */
    public val personasOnLightIndigoTextAccent: String = "personasOnLightIndigoTextAccent"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightnessActive: String =
        "surfaceOnDarkSolidPrimaryBrightnessActive"

    /**
     * Transparent Accent Minor Active On Dark
     */
    public val surfaceOnDarkTransparentAccentMinorActive: String =
        "surfaceOnDarkTransparentAccentMinorActive"

    /**
     * Accent Secondary Active On Light
     */
    public val surfaceOnLightAccentSecondaryActive: String = "surfaceOnLightAccentSecondaryActive"

    /**
     * Green Text Accent Hover Inverse
     */
    public val personasInverseGreenTextAccentHover: String = "personasInverseGreenTextAccentHover"

    /**
     * Indigo Text Accent Active On Light
     */
    public val personasOnLightIndigoTextAccentActive: String =
        "personasOnLightIndigoTextAccentActive"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhiteActive: String = "outlineDefaultTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhiteHover: String = "outlineDefaultTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineInverseDeep: String = "outlineInverseDeep"

    /**
     * New description
     */
    public val outlineInverseDeepActive: String = "outlineInverseDeepActive"

    /**
     * New description
     */
    public val outlineInverseDeepHover: String = "outlineInverseDeepHover"

    /**
     * New description
     */
    public val outlineInverseTransparentWhite: String = "outlineInverseTransparentWhite"

    /**
     * New description
     */
    public val outlineInverseTransparentWhiteHover: String = "outlineInverseTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineOnDarkDeep: String = "outlineOnDarkDeep"

    /**
     * New description
     */
    public val outlineOnDarkDeepActive: String = "outlineOnDarkDeepActive"

    /**
     * New description
     */
    public val outlineOnDarkDeepHover: String = "outlineOnDarkDeepHover"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhite: String = "outlineOnDarkTransparentWhite"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhiteActive: String = "outlineOnDarkTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhiteHover: String = "outlineOnDarkTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineOnLightDeep: String = "outlineOnLightDeep"

    /**
     * New description
     */
    public val outlineOnLightDeepActive: String = "outlineOnLightDeepActive"

    /**
     * New description
     */
    public val outlineOnLightDeepHover: String = "outlineOnLightDeepHover"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhite: String = "outlineOnLightTransparentWhite"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeep: String = "surfaceDefaultSolidDeep"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeepActive: String = "surfaceDefaultSolidDeepActive"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeepHover: String = "surfaceDefaultSolidDeepHover"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinor: String = "surfaceDefaultTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinorActive: String =
        "surfaceDefaultTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinorHover: String =
        "surfaceDefaultTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceInverseSolidDeep: String = "surfaceInverseSolidDeep"

    /**
     * New description
     */
    public val surfaceInverseSolidDeepActive: String = "surfaceInverseSolidDeepActive"

    /**
     * New description
     */
    public val surfaceInverseSolidDeepHover: String = "surfaceInverseSolidDeepHover"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinor: String = "surfaceInverseTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinorActive: String =
        "surfaceInverseTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinorHover: String =
        "surfaceInverseTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeep: String = "surfaceOnDarkSolidDeep"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeepActive: String = "surfaceOnDarkSolidDeepActive"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeepHover: String = "surfaceOnDarkSolidDeepHover"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinor: String = "surfaceOnDarkTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinorActive: String =
        "surfaceOnDarkTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinorHover: String =
        "surfaceOnDarkTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeep: String = "surfaceOnLightSolidDeep"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeepActive: String = "surfaceOnLightSolidDeepActive"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeepHover: String = "surfaceOnLightSolidDeepHover"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinor: String = "surfaceOnLightTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinorActive: String =
        "surfaceOnLightTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinorHover: String =
        "surfaceOnLightTransparentCardMinorHover"

    /**
     * New description
     */
    public val outlineDefaultDeepActive: String = "outlineDefaultDeepActive"

    /**
     * New description
     */
    public val outlineDefaultDeepHover: String = "outlineDefaultDeepHover"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhiteActive: String = "outlineOnLightTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhiteHover: String = "outlineOnLightTransparentWhiteHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveActive: String = "textDefaultPositiveActive"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveHover: String = "textDefaultPositiveHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryActive: String = "textDefaultPrimaryActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightness: String = "textDefaultPrimaryBrightness"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegative: String = "textDefaultNegative"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeActive: String = "textDefaultNegativeActive"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeHover: String = "textDefaultNegativeHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryActive: String = "textDefaultTertiaryActive"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryHover: String = "textDefaultTertiaryHover"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarning: String = "textDefaultWarning"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningActive: String = "textDefaultWarningActive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningHover: String = "textDefaultWarningHover"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinor: String = "textDefaultAccentMinor"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorActive: String = "textDefaultAccentMinorActive"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorHover: String = "textDefaultAccentMinorHover"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphHover: String = "textDefaultParagraphHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositive: String = "textDefaultPositive"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraph: String = "textDefaultParagraph"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphActive: String = "textDefaultParagraphActive"

    /**
     * Цвет информации
     */
    public val textDefaultInfo: String = "textDefaultInfo"

    /**
     * Цвет информации
     */
    public val textDefaultInfoActive: String = "textDefaultInfoActive"

    /**
     * Цвет информации
     */
    public val textDefaultInfoHover: String = "textDefaultInfoHover"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondary: String = "textDefaultSecondary"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryActive: String = "textDefaultSecondaryActive"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryHover: String = "textDefaultSecondaryHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiary: String = "textDefaultTertiary"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccent: String = "textDefaultAccent"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentActive: String = "textDefaultAccentActive"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorActive: String = "textOnDarkAccentMinorActive"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoActive: String = "textOnDarkInfoActive"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfo: String = "textOnDarkInfo"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoHover: String = "textOnDarkInfoHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegative: String = "textOnDarkNegative"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondary: String = "textOnDarkSecondary"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryActive: String = "textOnDarkSecondaryActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiary: String = "textOnDarkTertiary"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryHover: String = "textOnDarkSecondaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimary: String = "textOnDarkPrimary"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentHover: String = "textOnDarkAccentHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositive: String = "textOnDarkPositive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphHover: String = "textOnDarkParagraphHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeActive: String = "textOnDarkNegativeActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraph: String = "textOnDarkParagraph"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeHover: String = "textOnDarkNegativeHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryActive: String = "textOnDarkPrimaryActive"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightness: String = "textOnDarkPrimaryBrightness"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningHover: String = "textOnDarkWarningHover"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryActive: String = "textOnDarkTertiaryActive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarning: String = "textOnDarkWarning"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningActive: String = "textOnDarkWarningActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryHover: String = "textOnDarkTertiaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryHover: String = "textOnDarkPrimaryHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveActive: String = "textOnDarkPositiveActive"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinor: String = "textOnDarkAccentMinor"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveHover: String = "textOnDarkPositiveHover"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryActive: String = "textOnLightTertiaryActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarning: String = "textOnLightWarning"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryHover: String = "textOnLightTertiaryHover"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningHover: String = "textOnLightWarningHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveActive: String = "textOnLightPositiveActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimary: String = "textOnLightPrimary"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveHover: String = "textOnLightPositiveHover"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorActive: String = "textOnLightAccentMinorActive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraph: String = "textOnLightParagraph"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorHover: String = "textOnLightAccentMinorHover"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphActive: String = "textOnLightParagraphActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositive: String = "textOnLightPositive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphHover: String = "textOnLightParagraphHover"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondary: String = "textOnLightSecondary"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryActive: String = "textOnLightSecondaryActive"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiary: String = "textOnLightTertiary"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryHover: String = "textOnLightSecondaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryActive: String = "textOnLightPrimaryActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryHover: String = "textOnLightPrimaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightness: String = "textOnLightPrimaryBrightness"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentActive: String = "textOnLightAccentActive"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinor: String = "textOnLightAccentMinor"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccent: String = "textOnLightAccent"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentHover: String = "textOnLightAccentHover"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeActive: String = "textOnLightNegativeActive"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeHover: String = "textOnLightNegativeHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryHover: String = "textInverseSecondaryHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondary: String = "textInverseSecondary"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryActive: String = "textInverseSecondaryActive"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryActive: String = "textInverseTertiaryActive"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfo: String = "textOnLightInfo"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryHover: String = "textInverseTertiaryHover"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoActive: String = "textOnLightInfoActive"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoHover: String = "textOnLightInfoHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryActive: String = "textInversePrimaryActive"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryHover: String = "textInversePrimaryHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightness: String = "textInversePrimaryBrightness"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorActive: String = "textInverseAccentMinorActive"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraph: String = "textInverseParagraph"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorHover: String = "textInverseAccentMinorHover"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraphActive: String = "textInverseParagraphActive"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimary: String = "textInversePrimary"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraphHover: String = "textInverseParagraphHover"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiary: String = "textInverseTertiary"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegative: String = "textOnLightNegative"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentActive: String = "textInverseAccentActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentHover: String = "textInverseAccentHover"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinor: String = "textInverseAccentMinor"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegative: String = "textInverseNegative"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveActive: String = "textInversePositiveActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveHover: String = "textInversePositiveHover"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeActive: String = "textInverseNegativeActive"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeHover: String = "textInverseNegativeHover"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondary: String = "surfaceDefaultSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiary: String = "surfaceDefaultSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryActive: String = "surfaceDefaultSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryHover: String = "surfaceDefaultSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryHover: String = "surfaceDefaultSolidTertiaryHover"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoActive: String = "textInverseInfoActive"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfo: String = "textInverseInfo"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoHover: String = "textInverseInfoHover"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarning: String = "textInverseWarning"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningHover: String = "textInverseWarningHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimary: String = "surfaceDefaultSolidPrimary"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningActive: String = "textInverseWarningActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositive: String = "textInversePositive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryHover: String = "surfaceDefaultSolidPrimaryHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentHover: String = "surfaceDefaultAccentHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentActive: String = "surfaceDefaultAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryActive: String =
        "surfaceDefaultTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondary: String = "surfaceDefaultTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryHover: String =
        "surfaceDefaultTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeep: String = "surfaceDefaultTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimary: String = "surfaceDefaultTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeepActive: String = "surfaceDefaultTransparentDeepActive"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeepHover: String = "surfaceDefaultTransparentDeepHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardActive: String = "surfaceDefaultSolidCardActive"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardHover: String = "surfaceDefaultSolidCardHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightness: String = "surfaceDefaultSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearActive: String = "surfaceDefaultClearActive"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClear: String = "surfaceDefaultClear"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCard: String = "surfaceDefaultSolidCard"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearHover: String = "surfaceDefaultClearHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardActive: String = "surfaceDefaultTransparentCardActive"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardHover: String = "surfaceDefaultTransparentCardHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightness: String =
        "surfaceDefaultTransparentCardBrightness"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultActive: String = "surfaceDefaultSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultHover: String = "surfaceDefaultSolidDefaultHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentActive: String =
        "surfaceDefaultTransparentAccentActive"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCard: String = "surfaceDefaultTransparentCard"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryActive: String =
        "surfaceDefaultTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiary: String = "surfaceDefaultTransparentTertiary"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentHover: String = "surfaceDefaultTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccent: String = "surfaceDefaultTransparentAccent"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryHover: String =
        "surfaceDefaultTransparentSecondaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryActive: String =
        "surfaceDefaultTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryHover: String =
        "surfaceDefaultTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveActive: String = "surfaceDefaultPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveHover: String = "surfaceDefaultPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeActive: String = "surfaceDefaultNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositive: String = "surfaceDefaultPositive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeHover: String = "surfaceDefaultNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoHover: String = "surfaceDefaultInfoHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarning: String = "surfaceDefaultWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningHover: String = "surfaceDefaultWarningHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningActive: String = "surfaceDefaultWarningActive"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoActive: String = "surfaceDefaultInfoActive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegative: String = "surfaceDefaultNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeActive: String =
        "surfaceDefaultTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeHover: String =
        "surfaceDefaultTransparentNegativeHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegative: String = "surfaceDefaultTransparentNegative"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondary: String = "surfaceOnDarkSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiary: String = "surfaceOnDarkSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryActive: String = "surfaceOnDarkSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryHover: String = "surfaceOnDarkSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryHover: String = "surfaceOnDarkSolidTertiaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryActive: String = "surfaceOnDarkSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightness: String = "surfaceOnDarkSolidPrimaryBrightness"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnlyActive: String = "surfaceDefaultReadOnlyActive"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnly: String = "surfaceDefaultReadOnly"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnlyHover: String = "surfaceDefaultReadOnlyHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryHover: String = "surfaceOnDarkSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimary: String = "surfaceOnDarkSolidPrimary"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccent: String = "surfaceOnDarkAccent"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentHover: String = "surfaceOnDarkAccentHover"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentActive: String = "surfaceOnDarkAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryActive: String =
        "surfaceOnDarkTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondary: String = "surfaceOnDarkTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryHover: String = "surfaceOnDarkTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeep: String = "surfaceOnDarkTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimary: String = "surfaceOnDarkTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeepActive: String = "surfaceOnDarkTransparentDeepActive"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeepHover: String = "surfaceOnDarkTransparentDeepHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardActive: String = "surfaceOnDarkSolidCardActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardHover: String = "surfaceOnDarkSolidCardHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightness: String = "surfaceOnDarkSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClear: String = "surfaceOnDarkClear"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearHover: String = "surfaceOnDarkClearHover"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearActive: String = "surfaceOnDarkClearActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCard: String = "surfaceOnDarkSolidCard"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultHover: String = "surfaceOnDarkSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultActive: String = "surfaceOnDarkSolidDefaultActive"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCard: String = "surfaceOnDarkTransparentCard"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardHover: String = "surfaceOnDarkTransparentCardHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightness: String =
        "surfaceOnDarkTransparentCardBrightness"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryActive: String =
        "surfaceOnDarkTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiary: String = "surfaceOnDarkTransparentTertiary"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardActive: String = "surfaceOnDarkTransparentCardActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryHover: String =
        "surfaceOnDarkTransparentSecondaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryActive: String =
        "surfaceOnDarkTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryHover: String =
        "surfaceOnDarkTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveActive: String = "surfaceOnDarkPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveHover: String = "surfaceOnDarkPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeActive: String = "surfaceOnDarkNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositive: String = "surfaceOnDarkPositive"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeHover: String = "surfaceOnDarkNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoHover: String = "surfaceOnDarkInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfo: String = "surfaceOnDarkInfo"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoActive: String = "surfaceOnDarkInfoActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningActive: String = "surfaceOnDarkWarningActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccent: String = "surfaceOnDarkTransparentAccent"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentHover: String = "surfaceOnDarkTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentActive: String = "surfaceOnDarkTransparentAccentActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarning: String = "surfaceOnDarkWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningHover: String = "surfaceOnDarkWarningHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegative: String = "surfaceOnDarkNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeActive: String =
        "surfaceOnDarkTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeHover: String =
        "surfaceOnDarkTransparentNegativeHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnlyActive: String = "surfaceOnDarkReadOnlyActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegative: String = "surfaceOnDarkTransparentNegative"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondary: String = "surfaceOnLightSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiary: String = "surfaceOnLightSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryActive: String = "surfaceOnLightSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryHover: String = "surfaceOnLightSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryHover: String = "surfaceOnLightSolidTertiaryHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnlyHover: String = "surfaceOnDarkReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnly: String = "surfaceOnDarkReadOnly"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryActive: String = "surfaceOnLightSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryHover: String = "surfaceOnLightSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightness: String = "surfaceOnLightSolidPrimaryBrightness"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimary: String = "surfaceOnLightSolidPrimary"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccent: String = "surfaceOnLightAccent"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentHover: String = "surfaceOnLightAccentHover"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentActive: String = "surfaceOnLightAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryActive: String =
        "surfaceOnLightTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondary: String = "surfaceOnLightTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryHover: String =
        "surfaceOnLightTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeep: String = "surfaceOnLightTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimary: String = "surfaceOnLightTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeepActive: String = "surfaceOnLightTransparentDeepActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardActive: String = "surfaceOnLightSolidCardActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardHover: String = "surfaceOnLightSolidCardHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightness: String = "surfaceOnLightSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearActive: String = "surfaceOnLightClearActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCard: String = "surfaceOnLightSolidCard"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearHover: String = "surfaceOnLightClearHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultActive: String = "surfaceOnLightSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefault: String = "surfaceOnLightSolidDefault"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultHover: String = "surfaceOnLightSolidDefaultHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardActive: String = "surfaceOnLightTransparentCardActive"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardHover: String = "surfaceOnLightTransparentCardHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryActive: String =
        "surfaceOnLightTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiary: String = "surfaceOnLightTransparentTertiary"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightness: String =
        "surfaceOnLightTransparentCardBrightness"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCard: String = "surfaceOnLightTransparentCard"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryActive: String =
        "surfaceOnLightTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryHover: String =
        "surfaceOnLightTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfo: String = "surfaceOnLightInfo"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveActive: String = "surfaceOnLightPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveHover: String = "surfaceOnLightPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeActive: String = "surfaceOnLightNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositive: String = "surfaceOnLightPositive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeHover: String = "surfaceOnLightNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoHover: String = "surfaceOnLightInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoActive: String = "surfaceOnLightInfoActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentHover: String = "surfaceOnLightTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccent: String = "surfaceOnLightTransparentAccent"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentActive: String =
        "surfaceOnLightTransparentAccentActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarning: String = "surfaceOnLightWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningActive: String = "surfaceOnLightWarningActive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegative: String = "surfaceOnLightNegative"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningHover: String = "surfaceOnLightWarningHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeActive: String =
        "surfaceOnLightTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeHover: String =
        "surfaceOnLightTransparentNegativeHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnlyActive: String = "surfaceOnLightReadOnlyActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegative: String = "surfaceOnLightTransparentNegative"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondary: String = "surfaceInverseSolidSecondary"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryHover: String = "surfaceInverseSolidSecondaryHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnlyHover: String = "surfaceOnLightReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnly: String = "surfaceOnLightReadOnly"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightness: String = "surfaceInverseSolidPrimaryBrightness"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryActive: String = "surfaceInverseSolidPrimaryActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryHover: String = "surfaceInverseSolidPrimaryHover"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryHover: String =
        "surfaceInverseTransparentTertiaryHover"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearActive: String = "surfaceInverseClearActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClear: String = "surfaceInverseClear"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryActive: String =
        "surfaceInverseTransparentPrimaryActive"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondary: String = "surfaceInverseTransparentSecondary"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryHover: String =
        "surfaceInverseTransparentPrimaryHover"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeep: String = "surfaceInverseTransparentDeep"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimary: String = "surfaceInverseTransparentPrimary"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeepActive: String = "surfaceInverseTransparentDeepActive"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeepHover: String = "surfaceInverseTransparentDeepHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardActive: String = "surfaceInverseSolidCardActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardHover: String = "surfaceInverseSolidCardHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightness: String = "surfaceInverseSolidCardBrightness"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCard: String = "surfaceInverseSolidCard"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightness: String =
        "surfaceInverseTransparentCardBrightness"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardHover: String = "surfaceInverseTransparentCardHover"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultActive: String = "surfaceInverseSolidDefaultActive"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryActive: String = "surfaceInverseSolidTertiaryActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardActive: String = "surfaceInverseTransparentCardActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCard: String = "surfaceInverseTransparentCard"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultHover: String = "surfaceInverseSolidDefaultHover"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryHover: String = "surfaceInverseSolidTertiaryHover"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryActive: String =
        "surfaceInverseTransparentSecondaryActive"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiary: String = "surfaceInverseTransparentTertiary"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryHover: String =
        "surfaceInverseTransparentSecondaryHover"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryActive: String =
        "surfaceInverseTransparentTertiaryActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearHover: String = "surfaceInverseClearHover"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningActive: String = "surfaceInverseWarningActive"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningHover: String = "surfaceInverseWarningHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentHover: String = "surfaceInverseAccentHover"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveActive: String = "surfaceInversePositiveActive"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveHover: String = "surfaceInversePositiveHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeActive: String = "surfaceInverseNegativeActive"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositive: String = "surfaceInversePositive"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeHover: String = "surfaceInverseNegativeHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegative: String = "surfaceInverseNegative"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoHover: String = "surfaceInverseInfoHover"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarning: String = "surfaceInverseWarning"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccent: String = "surfaceInverseTransparentAccent"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoActive: String = "surfaceInverseInfoActive"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentActive: String =
        "surfaceInverseTransparentAccentActive"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfo: String = "surfaceInverseInfo"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentHover: String = "surfaceInverseTransparentAccentHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeActive: String =
        "surfaceInverseTransparentNegativeActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeHover: String =
        "surfaceInverseTransparentNegativeHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegative: String = "surfaceInverseTransparentNegative"

    /**
     * Вторичный фон
     */
    public val backgroundDefaultSecondary: String = "backgroundDefaultSecondary"

    /**
     * Третичный фон
     */
    public val backgroundDefaultTertiary: String = "backgroundDefaultTertiary"

    /**
     * Основной фон на светлом фоне
     */
    public val backgroundLightPrimary: String = "backgroundLightPrimary"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnlyActive: String = "surfaceInverseReadOnlyActive"

    /**
     * Вторичный фон на темном фоне
     */
    public val backgroundDarkSecondary: String = "backgroundDarkSecondary"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnlyHover: String = "surfaceInverseReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnly: String = "surfaceInverseReadOnly"

    /**
     * Третичный фон на темном фоне
     */
    public val backgroundDarkTertiary: String = "backgroundDarkTertiary"

    /**
     * Основной фон
     */
    public val backgroundDefaultPrimary: String = "backgroundDefaultPrimary"

    /**
     * Цвет фона паранжи светлый на темном фоне
     */
    public val overlayOnDarkSoft: String = "overlayOnDarkSoft"

    /**
     * Цвет фона паранжи темный на темном фоне
     */
    public val overlayOnDarkHard: String = "overlayOnDarkHard"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryActive: String =
        "outlineDefaultTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimary: String = "outlineDefaultTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryHover: String =
        "outlineDefaultTransparentPrimaryHover"

    /**
     * Цвет фона паранжи темный
     */
    public val overlayDefaultHard: String = "overlayDefaultHard"

    /**
     * Цвет фона паранжи светлый
     */
    public val overlayDefaultSoft: String = "overlayDefaultSoft"

    /**
     * Цвет фона паранжи темный на светлом фоне
     */
    public val overlayOnLightHard: String = "overlayOnLightHard"

    /**
     * Инвертированный цвет фона паранжи светлый
     */
    public val overlayInverseSoft: String = "overlayInverseSoft"

    /**
     * Цвет фона паранжи светлый на светлом фоне
     */
    public val overlayOnLightSoft: String = "overlayOnLightSoft"

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public val overlayInverseHard: String = "overlayInverseHard"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClear: String = "outlineDefaultClear"

    /**
     * Инвертированный третичный фон
     */
    public val backgroundInverseTertiary: String = "backgroundInverseTertiary"

    /**
     * Инвертированный вторичный фон
     */
    public val backgroundInverseSecondary: String = "backgroundInverseSecondary"

    /**
     * Третичный фон на светлом фоне
     */
    public val backgroundLightTertiary: String = "backgroundLightTertiary"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositive: String = "outlineDefaultPositive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegative: String = "outlineDefaultNegative"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentHover: String = "outlineDefaultAccentHover"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentActive: String = "outlineDefaultAccentActive"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveActive: String = "outlineDefaultPositiveActive"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveHover: String = "outlineDefaultPositiveHover"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeActive: String = "outlineDefaultNegativeActive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeHover: String = "outlineDefaultNegativeHover"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearHover: String = "outlineDefaultClearHover"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoHover: String = "outlineDefaultInfoHover"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningHover: String = "outlineDefaultWarningHover"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearActive: String = "outlineDefaultClearActive"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarning: String = "outlineDefaultWarning"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningActive: String = "outlineDefaultWarningActive"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfo: String = "outlineDefaultInfo"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoActive: String = "outlineDefaultInfoActive"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimary: String = "outlineOnDarkTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryActive: String =
        "outlineOnDarkTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryHover: String = "outlineOnDarkTransparentPrimaryHover"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarning: String = "outlineOnDarkWarning"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccent: String = "outlineOnDarkAccent"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveActive: String = "outlineOnDarkPositiveActive"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveHover: String = "outlineOnDarkPositiveHover"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeActive: String = "outlineOnDarkNegativeActive"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositive: String = "outlineOnDarkPositive"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeHover: String = "outlineOnDarkNegativeHover"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentHover: String = "outlineOnDarkAccentHover"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClear: String = "outlineOnDarkClear"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoHover: String = "outlineOnDarkInfoHover"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoActive: String = "outlineOnDarkInfoActive"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfo: String = "outlineOnDarkInfo"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearHover: String = "outlineOnDarkClearHover"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearActive: String = "outlineOnDarkClearActive"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningActive: String = "outlineOnDarkWarningActive"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegative: String = "outlineOnDarkNegative"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningHover: String = "outlineOnDarkWarningHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveHover: String = "outlineOnLightPositiveHover"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClear: String = "outlineOnLightClear"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearHover: String = "outlineOnLightClearHover"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimary: String = "outlineOnLightTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryActive: String =
        "outlineOnLightTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryHover: String =
        "outlineOnLightTransparentPrimaryHover"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentHover: String = "outlineOnLightAccentHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositive: String = "outlineOnLightPositive"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentActive: String = "outlineOnLightAccentActive"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearActive: String = "outlineOnLightClearActive"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeActive: String = "outlineOnLightNegativeActive"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeHover: String = "outlineOnLightNegativeHover"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarning: String = "outlineOnLightWarning"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningHover: String = "outlineOnLightWarningHover"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegative: String = "outlineOnLightNegative"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoHover: String = "outlineOnLightInfoHover"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfo: String = "outlineOnLightInfo"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoActive: String = "outlineOnLightInfoActive"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentActive: String = "outlineInverseAccentActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClear: String = "outlineInverseClear"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearActive: String = "outlineInverseClearActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearHover: String = "outlineInverseClearHover"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryHover: String =
        "outlineInverseTransparentPrimaryHover"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimary: String = "outlineInverseTransparentPrimary"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryActive: String =
        "outlineInverseTransparentPrimaryActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositive: String = "outlineInversePositive"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegative: String = "outlineInverseNegative"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoHover: String = "outlineInverseInfoHover"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoActive: String = "outlineInverseInfoActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveActive: String = "outlineInversePositiveActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveHover: String = "outlineInversePositiveHover"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeActive: String = "outlineInverseNegativeActive"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeHover: String = "outlineInverseNegativeHover"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningActive: String = "outlineInverseWarningActive"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningHover: String = "outlineInverseWarningHover"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarning: String = "outlineInverseWarning"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfo: String = "outlineInverseInfo"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorHover: String = "surfaceInverseAccentMinorHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefault: String = "surfaceOnDarkSolidDefault"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorActive: String = "surfaceOnLightAccentMinorActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryHover: String = "textDefaultPrimaryHover"

    /**
     * Основной фон на темном фоне
     */
    public val backgroundDarkPrimary: String = "backgroundDarkPrimary"

    /**
     * Inverse Background Hardline
     */
    public val backgroundInverseHardline: String = "backgroundInverseHardline"

    /**
     * Инвертированный основной фон
     */
    public val backgroundInversePrimary: String = "backgroundInversePrimary"

    /**
     * Light Background Hardline
     */
    public val backgroundLightHardline: String = "backgroundLightHardline"

    /**
     * Вторичный фон на светлом фоне
     */
    public val backgroundLightSecondary: String = "backgroundLightSecondary"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccent: String = "outlineDefaultAccent"

    /**
     * New description
     */
    public val outlineDefaultDeep: String = "outlineDefaultDeep"

    /**
     * Outline Default
     */
    public val outlineDefaultDefault: String = "outlineDefaultDefault"

    /**
     * Default Active Default
     */
    public val outlineDefaultDefaultActive: String = "outlineDefaultDefaultActive"

    /**
     * Default Hover Default
     */
    public val outlineDefaultDefaultHover: String = "outlineDefaultDefaultHover"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhite: String = "outlineDefaultTransparentWhite"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccent: String = "outlineInverseAccent"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentHover: String = "outlineInverseAccentHover"

    /**
     * Inverse Outline Default
     */
    public val outlineInverseDefault: String = "outlineInverseDefault"

    /**
     * Default Active Inverse
     */
    public val outlineInverseDefaultActive: String = "outlineInverseDefaultActive"

    /**
     * Default Hover On Light
     */
    public val outlineOnLightDefaultHover: String = "outlineOnLightDefaultHover"

    /**
     * Primary Hover On Light
     */
    public val outlineOnLightPrimaryHover: String = "outlineOnLightPrimaryHover"

    /**
     * Blue Text Accent Hover Default
     */
    public val personasDefaultBlueTextAccentHover: String = "personasDefaultBlueTextAccentHover"

    /**
     * Green Text Accent Hover Default
     */
    public val personasDefaultGreenTextAccentHover: String = "personasDefaultGreenTextAccentHover"

    /**
     * Indigo Text Accent Hover Default
     */
    public val personasDefaultIndigoTextAccentHover: String = "personasDefaultIndigoTextAccentHover"

    /**
     * Sea Blue Text Accent Hover Default
     */
    public val personasDefaultSeaBlueTextAccentHover: String =
        "personasDefaultSeaBlueTextAccentHover"

    /**
     * Blue Text Accent Hover On Dark
     */
    public val personasOnDarkBlueTextAccentHover: String = "personasOnDarkBlueTextAccentHover"

    /**
     * Olive Text Accent Hover On Dark
     */
    public val personasOnDarkOliveTextAccentHover: String = "personasOnDarkOliveTextAccentHover"

    /**
     * Sea Blue Text Accent Hover On Dark
     */
    public val personasOnDarkSeaBlueTextAccentHover: String = "personasOnDarkSeaBlueTextAccentHover"

    /**
     * Violet Text Accent Hover On Dark
     */
    public val personasOnDarkVioletTextAccentHover: String = "personasOnDarkVioletTextAccentHover"

    /**
     * Indigo Text Accent Hover On Light
     */
    public val personasOnLightIndigoTextAccentHover: String = "personasOnLightIndigoTextAccentHover"

    /**
     * Pink Text Accent Hover On Light
     */
    public val personasOnLightPinkTextAccentHover: String = "personasOnLightPinkTextAccentHover"

    /**
     * Sea Blue Text Accent Hover On Light
     */
    public val personasOnLightSeaBlueTextAccentHover: String =
        "personasOnLightSeaBlueTextAccentHover"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorHover: String = "surfaceDefaultAccentMinorHover"

    /**
     * Accent Secondary Hover Inverse
     */
    public val surfaceInverseAccentSecondaryHover: String = "surfaceInverseAccentSecondaryHover"

    /**
     * Accent Secondary Hover On Dark
     */
    public val surfaceOnDarkAccentSecondaryHover: String = "surfaceOnDarkAccentSecondaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeepHover: String = "surfaceOnLightTransparentDeepHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryHover: String =
        "surfaceOnLightTransparentSecondaryHover"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentHover: String = "textDefaultAccentHover"

    /**
     * Primary Active Inverse
     */
    public val outlineInversePrimaryActive: String = "outlineInversePrimaryActive"

    /**
     * New description
     */
    public val outlineInverseTransparentWhiteActive: String = "outlineInverseTransparentWhiteActive"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentActive: String = "outlineOnDarkAccentActive"

    /**
     * Default Active On Dark
     */
    public val outlineOnDarkDefaultActive: String = "outlineOnDarkDefaultActive"

    /**
     * Primary Active On Dark
     */
    public val outlineOnDarkPrimaryActive: String = "outlineOnDarkPrimaryActive"

    /**
     * Ochre Text Accent Active Default
     */
    public val personasDefaultOchreTextAccentActive: String = "personasDefaultOchreTextAccentActive"

    /**
     * Olive Text Accent Active Default
     */
    public val personasDefaultOliveTextAccentActive: String = "personasDefaultOliveTextAccentActive"

    /**
     * Violet Text Accent Active Default
     */
    public val personasDefaultVioletTextAccentActive: String =
        "personasDefaultVioletTextAccentActive"

    /**
     * Sea Blue Text Accent Active Inverse
     */
    public val personasInverseSeaBlueTextAccentActive: String =
        "personasInverseSeaBlueTextAccentActive"

    /**
     * Violet Text Accent Active Inverse
     */
    public val personasInverseVioletTextAccentActive: String =
        "personasInverseVioletTextAccentActive"

    /**
     * Green Text Accent Active On Light
     */
    public val personasOnLightGreenTextAccentActive: String = "personasOnLightGreenTextAccentActive"

    /**
     * Ochre Text Accent Active On Light
     */
    public val personasOnLightOchreTextAccentActive: String = "personasOnLightOchreTextAccentActive"

    /**
     * Violet Text Accent Active On Light
     */
    public val personasOnLightVioletTextAccentActive: String =
        "personasOnLightVioletTextAccentActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorActive: String = "surfaceDefaultAccentMinorActive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryActive: String = "surfaceDefaultSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightnessHover: String =
        "surfaceDefaultSolidPrimaryBrightnessHover"

    /**
     * Transparent Navi Active Default
     */
    public val surfaceDefaultTransparentNaviActive: String = "surfaceDefaultTransparentNaviActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentActive: String = "surfaceInverseAccentActive"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorActive: String = "surfaceInverseAccentMinorActive"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryActive: String = "surfaceInverseSolidSecondaryActive"

    /**
     * Transparent Accent Minor Active On Light
     */
    public val surfaceOnLightTransparentAccentMinorActive: String =
        "surfaceOnLightTransparentAccentMinorActive"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentActive: String = "textOnDarkAccentActive"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccent: String = "outlineOnLightAccent"

    /**
     * On Light Outline Primary
     */
    public val outlineOnLightPrimary: String = "outlineOnLightPrimary"

    /**
     * Inverse Personas Sea Blue Text Accent
     */
    public val personasInverseSeaBlueTextAccent: String = "personasInverseSeaBlueTextAccent"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccent: String = "surfaceDefaultAccent"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfo: String = "surfaceDefaultInfo"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightnessActive: String =
        "surfaceDefaultSolidCardBrightnessActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefault: String = "surfaceDefaultSolidDefault"

    /**
     * Surface Transparent Navi
     */
    public val surfaceDefaultTransparentNavi: String = "surfaceDefaultTransparentNavi"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccent: String = "surfaceInverseAccent"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimary: String = "surfaceInverseSolidPrimary"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinor: String = "surfaceOnDarkAccentMinor"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClear: String = "surfaceOnLightClear"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightnessActive: String = "textDefaultPrimaryBrightnessActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccent: String = "textInverseAccent"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccent: String = "textOnDarkAccent"

    /**
     * Dark Background Hardline
     */
    public val backgroundDarkHardline: String = "backgroundDarkHardline"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightnessHover: String =
        "surfaceDefaultSolidCardBrightnessHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightness: String = "surfaceDefaultSolidPrimaryBrightness"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefault: String = "surfaceInverseSolidDefault"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightnessActive: String =
        "surfaceOnDarkSolidCardBrightnessActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphActive: String = "textOnDarkParagraphActive"

    /**
     * New description
     */
    public val overlayDefaultMedium: String = "overlayDefaultMedium"

    /**
     * New description
     */
    public val overlayInverseMedium: String = "overlayInverseMedium"

    /**
     * New description
     */
    public val overlayOnDarkMedium: String = "overlayOnDarkMedium"

    /**
     * New description
     */
    public val overlayOnLightMedium: String = "overlayOnLightMedium"

    /**
     * Переопределяет аттрибут цвета.
     */
    public infix fun String.overrideBy(color: Color) {
        _overrideMap[this] = color
    }
}

/**
 * Скоуп переопределения цветов по арибутам
 */
internal class ColorAttrOverrideScope {
    private val _overrideMap: MutableMap<String, String> = mutableMapOf()

    internal val overrideMap: Map<String, String>
        get() = _overrideMap.toMap()

    /**
     * Default Hover On Dark
     */
    public val outlineOnDarkDefaultHover: String = "outlineOnDarkDefaultHover"

    /**
     * Accent Secondary Hover Default
     */
    public val surfaceDefaultAccentSecondaryHover: String = "surfaceDefaultAccentSecondaryHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightnessHover: String =
        "surfaceDefaultTransparentCardBrightnessHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightnessActive: String =
        "surfaceDefaultTransparentCardBrightnessActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightnessHover: String =
        "surfaceOnLightSolidPrimaryBrightnessHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightnessActive: String =
        "surfaceOnLightSolidPrimaryBrightnessActive"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightnessHover: String =
        "surfaceOnDarkTransparentCardBrightnessHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightnessHover: String =
        "surfaceOnDarkSolidCardBrightnessHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightnessActive: String =
        "surfaceOnDarkTransparentCardBrightnessActive"

    /**
     * On Light Personas Olive Text Accent
     */
    public val personasOnLightOliveTextAccent: String = "personasOnLightOliveTextAccent"

    /**
     * On Dark Personas Olive Text Accent
     */
    public val personasOnDarkOliveTextAccent: String = "personasOnDarkOliveTextAccent"

    /**
     * Inverse Personas Ochre Text Accent
     */
    public val personasInverseOchreTextAccent: String = "personasInverseOchreTextAccent"

    /**
     * Inverse Personas Pink Text Accent
     */
    public val personasInversePinkTextAccent: String = "personasInversePinkTextAccent"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryActive: String = "surfaceDefaultSolidTertiaryActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightnessHover: String =
        "surfaceInverseSolidPrimaryBrightnessHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimary: String = "textDefaultPrimary"

    /**
     * Inverse Surface Transparent Navi
     */
    public val surfaceInverseTransparentNavi: String = "surfaceInverseTransparentNavi"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightnessHover: String =
        "surfaceInverseTransparentCardBrightnessHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryActive: String = "surfaceOnLightSolidTertiaryActive"

    /**
     * Inverse Personas Indigo Text Accent
     */
    public val personasInverseIndigoTextAccent: String = "personasInverseIndigoTextAccent"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightnessActive: String =
        "surfaceInverseSolidPrimaryBrightnessActive"

    /**
     * Personas Olive Text Accent
     */
    public val personasDefaultOliveTextAccent: String = "personasDefaultOliveTextAccent"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorHover: String = "textOnDarkAccentMinorHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightnessActive: String =
        "surfaceOnLightTransparentCardBrightnessActive"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightnessHover: String =
        "surfaceOnLightTransparentCardBrightnessHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightnessActive: String =
        "surfaceOnLightSolidCardBrightnessActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorActive: String = "surfaceOnDarkAccentMinorActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightnessHover: String =
        "surfaceOnLightSolidCardBrightnessHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveActive: String = "outlineOnLightPositiveActive"

    /**
     * Outline Primary
     */
    public val outlineDefaultPrimary: String = "outlineDefaultPrimary"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiary: String = "surfaceInverseSolidTertiary"

    /**
     * Inverse Personas Green Text Accent
     */
    public val personasInverseGreenTextAccent: String = "personasInverseGreenTextAccent"

    /**
     * Surface Accent Secondary
     */
    public val surfaceDefaultAccentSecondary: String = "surfaceDefaultAccentSecondary"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinor: String = "surfaceDefaultAccentMinor"

    /**
     * On Dark Surface Accent Secondary
     */
    public val surfaceOnDarkAccentSecondary: String = "surfaceOnDarkAccentSecondary"

    /**
     * On Dark Personas Indigo Text Accent
     */
    public val personasOnDarkIndigoTextAccent: String = "personasOnDarkIndigoTextAccent"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryActive: String = "surfaceOnDarkSolidTertiaryActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinor: String = "surfaceOnLightAccentMinor"

    /**
     * On Light Personas Ochre Text Accent
     */
    public val personasOnLightOchreTextAccent: String = "personasOnLightOchreTextAccent"

    /**
     * On Light Personas Violet Text Accent
     */
    public val personasOnLightVioletTextAccent: String = "personasOnLightVioletTextAccent"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightnessActive: String =
        "surfaceInverseTransparentCardBrightnessActive"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningActive: String = "outlineOnLightWarningActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinorHover: String = "surfaceOnDarkAccentMinorHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightnessActive: String =
        "surfaceInverseSolidCardBrightnessActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorHover: String = "surfaceOnLightAccentMinorHover"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinor: String = "surfaceInverseAccentMinor"

    /**
     * On Dark Surface Transparent Accent Minor
     */
    public val surfaceOnDarkTransparentAccentMinor: String = "surfaceOnDarkTransparentAccentMinor"

    /**
     * On Light Personas Sea Blue Text Accent
     */
    public val personasOnLightSeaBlueTextAccent: String = "personasOnLightSeaBlueTextAccent"

    /**
     * On Dark Personas Blue Text Accent
     */
    public val personasOnDarkBlueTextAccent: String = "personasOnDarkBlueTextAccent"

    /**
     * On Dark Personas Violet Text Accent
     */
    public val personasOnDarkVioletTextAccent: String = "personasOnDarkVioletTextAccent"

    /**
     * Personas Ochre Text Accent
     */
    public val personasDefaultOchreTextAccent: String = "personasDefaultOchreTextAccent"

    /**
     * On Light Surface Transparent Navi
     */
    public val surfaceOnLightTransparentNavi: String = "surfaceOnLightTransparentNavi"

    /**
     * Blue Text Accent Active Inverse
     */
    public val personasInverseBlueTextAccentActive: String = "personasInverseBlueTextAccentActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningActive: String = "textOnLightWarningActive"

    /**
     * Olive Text Accent Hover Inverse
     */
    public val personasInverseOliveTextAccentHover: String = "personasInverseOliveTextAccentHover"

    /**
     * Transparent Navi Active On Light
     */
    public val surfaceOnLightTransparentNaviActive: String = "surfaceOnLightTransparentNaviActive"

    /**
     * Blue Text Accent Active On Light
     */
    public val personasOnLightBlueTextAccentActive: String = "personasOnLightBlueTextAccentActive"

    /**
     * Primary Active On Light
     */
    public val outlineOnLightPrimaryActive: String = "outlineOnLightPrimaryActive"

    /**
     * Default Active On Light
     */
    public val outlineOnLightDefaultActive: String = "outlineOnLightDefaultActive"

    /**
     * Olive Text Accent Active On Dark
     */
    public val personasOnDarkOliveTextAccentActive: String = "personasOnDarkOliveTextAccentActive"

    /**
     * On Dark Personas Sea Blue Text Accent
     */
    public val personasOnDarkSeaBlueTextAccent: String = "personasOnDarkSeaBlueTextAccent"

    /**
     * Violet Text Accent Active On Dark
     */
    public val personasOnDarkVioletTextAccentActive: String = "personasOnDarkVioletTextAccentActive"

    /**
     * Green Text Accent Hover On Dark
     */
    public val personasOnDarkGreenTextAccentHover: String = "personasOnDarkGreenTextAccentHover"

    /**
     * Accent Secondary Active On Dark
     */
    public val surfaceOnDarkAccentSecondaryActive: String = "surfaceOnDarkAccentSecondaryActive"

    /**
     * Green Text Accent Active Inverse
     */
    public val personasInverseGreenTextAccentActive: String = "personasInverseGreenTextAccentActive"

    /**
     * Inverse Surface Accent Secondary
     */
    public val surfaceInverseAccentSecondary: String = "surfaceInverseAccentSecondary"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightnessHover: String = "textOnDarkPrimaryBrightnessHover"

    /**
     * Pink Text Accent Active On Dark
     */
    public val personasOnDarkPinkTextAccentActive: String = "personasOnDarkPinkTextAccentActive"

    /**
     * Indigo Text Accent Active Inverse
     */
    public val personasInverseIndigoTextAccentActive: String =
        "personasInverseIndigoTextAccentActive"

    /**
     * Sea Blue Text Accent Active Default
     */
    public val personasDefaultSeaBlueTextAccentActive: String =
        "personasDefaultSeaBlueTextAccentActive"

    /**
     * On Light Surface Transparent Accent Minor
     */
    public val surfaceOnLightTransparentAccentMinor: String = "surfaceOnLightTransparentAccentMinor"

    /**
     * Pink Text Accent Active On Light
     */
    public val personasOnLightPinkTextAccentActive: String = "personasOnLightPinkTextAccentActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightnessHover: String = "textDefaultPrimaryBrightnessHover"

    /**
     * Transparent Accent Minor Active Inverse
     */
    public val surfaceInverseTransparentAccentMinorActive: String =
        "surfaceInverseTransparentAccentMinorActive"

    /**
     * Ochre Text Accent Hover Default
     */
    public val personasDefaultOchreTextAccentHover: String = "personasDefaultOchreTextAccentHover"

    /**
     * Pink Text Accent Active Inverse
     */
    public val personasInversePinkTextAccentActive: String = "personasInversePinkTextAccentActive"

    /**
     * Transparent Navi Hover On Light
     */
    public val surfaceOnLightTransparentNaviHover: String = "surfaceOnLightTransparentNaviHover"

    /**
     * Primary Active Default
     */
    public val outlineDefaultPrimaryActive: String = "outlineDefaultPrimaryActive"

    /**
     * Sea Blue Text Accent Active On Dark
     */
    public val personasOnDarkSeaBlueTextAccentActive: String =
        "personasOnDarkSeaBlueTextAccentActive"

    /**
     * On Light Personas Green Text Accent
     */
    public val personasOnLightGreenTextAccent: String = "personasOnLightGreenTextAccent"

    /**
     * Accent Secondary Active Inverse
     */
    public val surfaceInverseAccentSecondaryActive: String = "surfaceInverseAccentSecondaryActive"

    /**
     * Indigo Text Accent Active Default
     */
    public val personasDefaultIndigoTextAccentActive: String =
        "personasDefaultIndigoTextAccentActive"

    /**
     * Green Text Accent Active Default
     */
    public val personasDefaultGreenTextAccentActive: String = "personasDefaultGreenTextAccentActive"

    /**
     * Transparent Navi Hover On Dark
     */
    public val surfaceOnDarkTransparentNaviHover: String = "surfaceOnDarkTransparentNaviHover"

    /**
     * Sea Blue Text Accent Hover Inverse
     */
    public val personasInverseSeaBlueTextAccentHover: String =
        "personasInverseSeaBlueTextAccentHover"

    /**
     * Accent Secondary Hover On Light
     */
    public val surfaceOnLightAccentSecondaryHover: String = "surfaceOnLightAccentSecondaryHover"

    /**
     * Blue Text Accent Hover Inverse
     */
    public val personasInverseBlueTextAccentHover: String = "personasInverseBlueTextAccentHover"

    /**
     * Indigo Text Accent Hover Inverse
     */
    public val personasInverseIndigoTextAccentHover: String = "personasInverseIndigoTextAccentHover"

    /**
     * On Dark Personas Ochre Text Accent
     */
    public val personasOnDarkOchreTextAccent: String = "personasOnDarkOchreTextAccent"

    /**
     * Green Text Accent Hover On Light
     */
    public val personasOnLightGreenTextAccentHover: String = "personasOnLightGreenTextAccentHover"

    /**
     * Ochre Text Accent Active On Dark
     */
    public val personasOnDarkOchreTextAccentActive: String = "personasOnDarkOchreTextAccentActive"

    /**
     * Ochre Text Accent Hover On Light
     */
    public val personasOnLightOchreTextAccentHover: String = "personasOnLightOchreTextAccentHover"

    /**
     * Primary Hover Default
     */
    public val outlineDefaultPrimaryHover: String = "outlineDefaultPrimaryHover"

    /**
     * Transparent Accent Minor Active Default
     */
    public val surfaceDefaultTransparentAccentMinorActive: String =
        "surfaceDefaultTransparentAccentMinorActive"

    /**
     * Transparent Navi Hover Default
     */
    public val surfaceDefaultTransparentNaviHover: String = "surfaceDefaultTransparentNaviHover"

    /**
     * Default Hover Inverse
     */
    public val outlineInverseDefaultHover: String = "outlineInverseDefaultHover"

    /**
     * Violet Text Accent Hover Inverse
     */
    public val personasInverseVioletTextAccentHover: String = "personasInverseVioletTextAccentHover"

    /**
     * Transparent Accent Minor Hover On Light
     */
    public val surfaceOnLightTransparentAccentMinorHover: String =
        "surfaceOnLightTransparentAccentMinorHover"

    /**
     * Transparent Accent Minor Hover Inverse
     */
    public val surfaceInverseTransparentAccentMinorHover: String =
        "surfaceInverseTransparentAccentMinorHover"

    /**
     * Transparent Navi Hover Inverse
     */
    public val surfaceInverseTransparentNaviHover: String = "surfaceInverseTransparentNaviHover"

    /**
     * Primary Hover Inverse
     */
    public val outlineInversePrimaryHover: String = "outlineInversePrimaryHover"

    /**
     * Olive Text Accent Hover Default
     */
    public val personasDefaultOliveTextAccentHover: String = "personasDefaultOliveTextAccentHover"

    /**
     * Personas Violet Text Accent
     */
    public val personasDefaultVioletTextAccent: String = "personasDefaultVioletTextAccent"

    /**
     * Ochre Text Accent Hover Inverse
     */
    public val personasInverseOchreTextAccentHover: String = "personasInverseOchreTextAccentHover"

    /**
     * Green Text Accent Active On Dark
     */
    public val personasOnDarkGreenTextAccentActive: String = "personasOnDarkGreenTextAccentActive"

    /**
     * Pink Text Accent Hover On Dark
     */
    public val personasOnDarkPinkTextAccentHover: String = "personasOnDarkPinkTextAccentHover"

    /**
     * Pink Text Accent Hover Inverse
     */
    public val personasInversePinkTextAccentHover: String = "personasInversePinkTextAccentHover"

    /**
     * Indigo Text Accent Hover On Dark
     */
    public val personasOnDarkIndigoTextAccentHover: String = "personasOnDarkIndigoTextAccentHover"

    /**
     * Blue Text Accent Hover On Light
     */
    public val personasOnLightBlueTextAccentHover: String = "personasOnLightBlueTextAccentHover"

    /**
     * Olive Text Accent Hover On Light
     */
    public val personasOnLightOliveTextAccentHover: String = "personasOnLightOliveTextAccentHover"

    /**
     * Violet Text Accent Hover On Light
     */
    public val personasOnLightVioletTextAccentHover: String = "personasOnLightVioletTextAccentHover"

    /**
     * Primary Hover On Dark
     */
    public val outlineOnDarkPrimaryHover: String = "outlineOnDarkPrimaryHover"

    /**
     * On Dark Personas Pink Text Accent
     */
    public val personasOnDarkPinkTextAccent: String = "personasOnDarkPinkTextAccent"

    /**
     * On Dark Outline Primary
     */
    public val outlineOnDarkPrimary: String = "outlineOnDarkPrimary"

    /**
     * On Light Personas Blue Text Accent
     */
    public val personasOnLightBlueTextAccent: String = "personasOnLightBlueTextAccent"

    /**
     * Accent Secondary Active Default
     */
    public val surfaceDefaultAccentSecondaryActive: String = "surfaceDefaultAccentSecondaryActive"

    /**
     * Personas Blue Text Accent
     */
    public val personasDefaultBlueTextAccent: String = "personasDefaultBlueTextAccent"

    /**
     * Blue Text Accent Active Default
     */
    public val personasDefaultBlueTextAccentActive: String = "personasDefaultBlueTextAccentActive"

    /**
     * Personas Green Text Accent
     */
    public val personasDefaultGreenTextAccent: String = "personasDefaultGreenTextAccent"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightnessActive: String =
        "surfaceDefaultSolidPrimaryBrightnessActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightnessHover: String = "textOnLightPrimaryBrightnessHover"

    /**
     * Personas Pink Text Accent
     */
    public val personasDefaultPinkTextAccent: String = "personasDefaultPinkTextAccent"

    /**
     * Personas Sea Blue Text Accent
     */
    public val personasDefaultSeaBlueTextAccent: String = "personasDefaultSeaBlueTextAccent"

    /**
     * Surface Transparent Accent Minor
     */
    public val surfaceDefaultTransparentAccentMinor: String = "surfaceDefaultTransparentAccentMinor"

    /**
     * Violet Text Accent Hover Default
     */
    public val personasDefaultVioletTextAccentHover: String = "personasDefaultVioletTextAccentHover"

    /**
     * Inverse Personas Blue Text Accent
     */
    public val personasInverseBlueTextAccent: String = "personasInverseBlueTextAccent"

    /**
     * Olive Text Accent Active Inverse
     */
    public val personasInverseOliveTextAccentActive: String = "personasInverseOliveTextAccentActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightnessHover: String =
        "surfaceInverseSolidCardBrightnessHover"

    /**
     * Inverse Surface Transparent Accent Minor
     */
    public val surfaceInverseTransparentAccentMinor: String = "surfaceInverseTransparentAccentMinor"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightnessHover: String =
        "surfaceOnDarkSolidPrimaryBrightnessHover"

    /**
     * On Dark Surface Transparent Navi
     */
    public val surfaceOnDarkTransparentNavi: String = "surfaceOnDarkTransparentNavi"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightnessHover: String = "textInversePrimaryBrightnessHover"

    /**
     * Background Hardline
     */
    public val backgroundDefaultHardline: String = "backgroundDefaultHardline"

    /**
     * Inverse Outline Primary
     */
    public val outlineInversePrimary: String = "outlineInversePrimary"

    /**
     * On Dark Outline Default
     */
    public val outlineOnDarkDefault: String = "outlineOnDarkDefault"

    /**
     * Inverse Personas Violet Text Accent
     */
    public val personasInverseVioletTextAccent: String = "personasInverseVioletTextAccent"

    /**
     * Personas Indigo Text Accent
     */
    public val personasDefaultIndigoTextAccent: String = "personasDefaultIndigoTextAccent"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightnessActive: String = "textInversePrimaryBrightnessActive"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightnessActive: String = "textOnDarkPrimaryBrightnessActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightnessActive: String = "textOnLightPrimaryBrightnessActive"

    /**
     * Indigo Text Accent Active On Dark
     */
    public val personasOnDarkIndigoTextAccentActive: String = "personasOnDarkIndigoTextAccentActive"

    /**
     * Ochre Text Accent Hover On Dark
     */
    public val personasOnDarkOchreTextAccentHover: String = "personasOnDarkOchreTextAccentHover"

    /**
     * Pink Text Accent Hover Default
     */
    public val personasDefaultPinkTextAccentHover: String = "personasDefaultPinkTextAccentHover"

    /**
     * Transparent Navi Active On Dark
     */
    public val surfaceOnDarkTransparentNaviActive: String = "surfaceOnDarkTransparentNaviActive"

    /**
     * On Light Surface Accent Secondary
     */
    public val surfaceOnLightAccentSecondary: String = "surfaceOnLightAccentSecondary"

    /**
     * On Light Outline Default
     */
    public val outlineOnLightDefault: String = "outlineOnLightDefault"

    /**
     * Pink Text Accent Active Default
     */
    public val personasDefaultPinkTextAccentActive: String = "personasDefaultPinkTextAccentActive"

    /**
     * Ochre Text Accent Active Inverse
     */
    public val personasInverseOchreTextAccentActive: String = "personasInverseOchreTextAccentActive"

    /**
     * Inverse Personas Olive Text Accent
     */
    public val personasInverseOliveTextAccent: String = "personasInverseOliveTextAccent"

    /**
     * Blue Text Accent Active On Dark
     */
    public val personasOnDarkBlueTextAccentActive: String = "personasOnDarkBlueTextAccentActive"

    /**
     * On Dark Personas Green Text Accent
     */
    public val personasOnDarkGreenTextAccent: String = "personasOnDarkGreenTextAccent"

    /**
     * Olive Text Accent Active On Light
     */
    public val personasOnLightOliveTextAccentActive: String = "personasOnLightOliveTextAccentActive"

    /**
     * On Light Personas Pink Text Accent
     */
    public val personasOnLightPinkTextAccent: String = "personasOnLightPinkTextAccent"

    /**
     * Sea Blue Text Accent Active On Light
     */
    public val personasOnLightSeaBlueTextAccentActive: String =
        "personasOnLightSeaBlueTextAccentActive"

    /**
     * Transparent Accent Minor Hover Default
     */
    public val surfaceDefaultTransparentAccentMinorHover: String =
        "surfaceDefaultTransparentAccentMinorHover"

    /**
     * Transparent Navi Active Inverse
     */
    public val surfaceInverseTransparentNaviActive: String = "surfaceInverseTransparentNaviActive"

    /**
     * Transparent Accent Minor Hover On Dark
     */
    public val surfaceOnDarkTransparentAccentMinorHover: String =
        "surfaceOnDarkTransparentAccentMinorHover"

    /**
     * On Light Personas Indigo Text Accent
     */
    public val personasOnLightIndigoTextAccent: String = "personasOnLightIndigoTextAccent"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightnessActive: String =
        "surfaceOnDarkSolidPrimaryBrightnessActive"

    /**
     * Transparent Accent Minor Active On Dark
     */
    public val surfaceOnDarkTransparentAccentMinorActive: String =
        "surfaceOnDarkTransparentAccentMinorActive"

    /**
     * Accent Secondary Active On Light
     */
    public val surfaceOnLightAccentSecondaryActive: String = "surfaceOnLightAccentSecondaryActive"

    /**
     * Green Text Accent Hover Inverse
     */
    public val personasInverseGreenTextAccentHover: String = "personasInverseGreenTextAccentHover"

    /**
     * Indigo Text Accent Active On Light
     */
    public val personasOnLightIndigoTextAccentActive: String =
        "personasOnLightIndigoTextAccentActive"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhiteActive: String = "outlineDefaultTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhiteHover: String = "outlineDefaultTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineInverseDeep: String = "outlineInverseDeep"

    /**
     * New description
     */
    public val outlineInverseDeepActive: String = "outlineInverseDeepActive"

    /**
     * New description
     */
    public val outlineInverseDeepHover: String = "outlineInverseDeepHover"

    /**
     * New description
     */
    public val outlineInverseTransparentWhite: String = "outlineInverseTransparentWhite"

    /**
     * New description
     */
    public val outlineInverseTransparentWhiteHover: String = "outlineInverseTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineOnDarkDeep: String = "outlineOnDarkDeep"

    /**
     * New description
     */
    public val outlineOnDarkDeepActive: String = "outlineOnDarkDeepActive"

    /**
     * New description
     */
    public val outlineOnDarkDeepHover: String = "outlineOnDarkDeepHover"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhite: String = "outlineOnDarkTransparentWhite"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhiteActive: String = "outlineOnDarkTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineOnDarkTransparentWhiteHover: String = "outlineOnDarkTransparentWhiteHover"

    /**
     * New description
     */
    public val outlineOnLightDeep: String = "outlineOnLightDeep"

    /**
     * New description
     */
    public val outlineOnLightDeepActive: String = "outlineOnLightDeepActive"

    /**
     * New description
     */
    public val outlineOnLightDeepHover: String = "outlineOnLightDeepHover"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhite: String = "outlineOnLightTransparentWhite"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeep: String = "surfaceDefaultSolidDeep"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeepActive: String = "surfaceDefaultSolidDeepActive"

    /**
     * New description
     */
    public val surfaceDefaultSolidDeepHover: String = "surfaceDefaultSolidDeepHover"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinor: String = "surfaceDefaultTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinorActive: String =
        "surfaceDefaultTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceDefaultTransparentCardMinorHover: String =
        "surfaceDefaultTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceInverseSolidDeep: String = "surfaceInverseSolidDeep"

    /**
     * New description
     */
    public val surfaceInverseSolidDeepActive: String = "surfaceInverseSolidDeepActive"

    /**
     * New description
     */
    public val surfaceInverseSolidDeepHover: String = "surfaceInverseSolidDeepHover"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinor: String = "surfaceInverseTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinorActive: String =
        "surfaceInverseTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceInverseTransparentCardMinorHover: String =
        "surfaceInverseTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeep: String = "surfaceOnDarkSolidDeep"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeepActive: String = "surfaceOnDarkSolidDeepActive"

    /**
     * New description
     */
    public val surfaceOnDarkSolidDeepHover: String = "surfaceOnDarkSolidDeepHover"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinor: String = "surfaceOnDarkTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinorActive: String =
        "surfaceOnDarkTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceOnDarkTransparentCardMinorHover: String =
        "surfaceOnDarkTransparentCardMinorHover"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeep: String = "surfaceOnLightSolidDeep"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeepActive: String = "surfaceOnLightSolidDeepActive"

    /**
     * New description
     */
    public val surfaceOnLightSolidDeepHover: String = "surfaceOnLightSolidDeepHover"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinor: String = "surfaceOnLightTransparentCardMinor"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinorActive: String =
        "surfaceOnLightTransparentCardMinorActive"

    /**
     * New description
     */
    public val surfaceOnLightTransparentCardMinorHover: String =
        "surfaceOnLightTransparentCardMinorHover"

    /**
     * New description
     */
    public val outlineDefaultDeepActive: String = "outlineDefaultDeepActive"

    /**
     * New description
     */
    public val outlineDefaultDeepHover: String = "outlineDefaultDeepHover"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhiteActive: String = "outlineOnLightTransparentWhiteActive"

    /**
     * New description
     */
    public val outlineOnLightTransparentWhiteHover: String = "outlineOnLightTransparentWhiteHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveActive: String = "textDefaultPositiveActive"

    /**
     * Цвет успеха
     */
    public val textDefaultPositiveHover: String = "textDefaultPositiveHover"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryActive: String = "textDefaultPrimaryActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightness: String = "textDefaultPrimaryBrightness"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegative: String = "textDefaultNegative"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeActive: String = "textDefaultNegativeActive"

    /**
     * Цвет ошибки
     */
    public val textDefaultNegativeHover: String = "textDefaultNegativeHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryActive: String = "textDefaultTertiaryActive"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiaryHover: String = "textDefaultTertiaryHover"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarning: String = "textDefaultWarning"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningActive: String = "textDefaultWarningActive"

    /**
     * Цвет предупреждения
     */
    public val textDefaultWarningHover: String = "textDefaultWarningHover"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinor: String = "textDefaultAccentMinor"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorActive: String = "textDefaultAccentMinorActive"

    /**
     * Акцентный минорный цвет
     */
    public val textDefaultAccentMinorHover: String = "textDefaultAccentMinorHover"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphHover: String = "textDefaultParagraphHover"

    /**
     * Цвет успеха
     */
    public val textDefaultPositive: String = "textDefaultPositive"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraph: String = "textDefaultParagraph"

    /**
     * Сплошной наборный текст
     */
    public val textDefaultParagraphActive: String = "textDefaultParagraphActive"

    /**
     * Цвет информации
     */
    public val textDefaultInfo: String = "textDefaultInfo"

    /**
     * Цвет информации
     */
    public val textDefaultInfoActive: String = "textDefaultInfoActive"

    /**
     * Цвет информации
     */
    public val textDefaultInfoHover: String = "textDefaultInfoHover"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondary: String = "textDefaultSecondary"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryActive: String = "textDefaultSecondaryActive"

    /**
     * Вторичный цвет текста
     */
    public val textDefaultSecondaryHover: String = "textDefaultSecondaryHover"

    /**
     * Третичный цвет текста
     */
    public val textDefaultTertiary: String = "textDefaultTertiary"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccent: String = "textDefaultAccent"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentActive: String = "textDefaultAccentActive"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinorActive: String = "textOnDarkAccentMinorActive"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoActive: String = "textOnDarkInfoActive"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfo: String = "textOnDarkInfo"

    /**
     * Цвет информации на темном фоне
     */
    public val textOnDarkInfoHover: String = "textOnDarkInfoHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegative: String = "textOnDarkNegative"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondary: String = "textOnDarkSecondary"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryActive: String = "textOnDarkSecondaryActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiary: String = "textOnDarkTertiary"

    /**
     * Вторичный цвет текста на темном фоне
     */
    public val textOnDarkSecondaryHover: String = "textOnDarkSecondaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimary: String = "textOnDarkPrimary"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentHover: String = "textOnDarkAccentHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositive: String = "textOnDarkPositive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphHover: String = "textOnDarkParagraphHover"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeActive: String = "textOnDarkNegativeActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraph: String = "textOnDarkParagraph"

    /**
     * Цвет ошибки на темном фоне
     */
    public val textOnDarkNegativeHover: String = "textOnDarkNegativeHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryActive: String = "textOnDarkPrimaryActive"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryBrightness: String = "textOnDarkPrimaryBrightness"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningHover: String = "textOnDarkWarningHover"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryActive: String = "textOnDarkTertiaryActive"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarning: String = "textOnDarkWarning"

    /**
     * Цвет предупреждения на темном фоне
     */
    public val textOnDarkWarningActive: String = "textOnDarkWarningActive"

    /**
     * Третичный цвет текста на темном фоне
     */
    public val textOnDarkTertiaryHover: String = "textOnDarkTertiaryHover"

    /**
     * Основной цвет текста на темном фоне
     */
    public val textOnDarkPrimaryHover: String = "textOnDarkPrimaryHover"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveActive: String = "textOnDarkPositiveActive"

    /**
     * Акцентный минорный цвет на темном фоне
     */
    public val textOnDarkAccentMinor: String = "textOnDarkAccentMinor"

    /**
     * Цвет успеха на темном фоне
     */
    public val textOnDarkPositiveHover: String = "textOnDarkPositiveHover"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryActive: String = "textOnLightTertiaryActive"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarning: String = "textOnLightWarning"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiaryHover: String = "textOnLightTertiaryHover"

    /**
     * Цвет предупреждения на светлом фоне
     */
    public val textOnLightWarningHover: String = "textOnLightWarningHover"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveActive: String = "textOnLightPositiveActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimary: String = "textOnLightPrimary"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositiveHover: String = "textOnLightPositiveHover"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorActive: String = "textOnLightAccentMinorActive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraph: String = "textOnLightParagraph"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinorHover: String = "textOnLightAccentMinorHover"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphActive: String = "textOnLightParagraphActive"

    /**
     * Цвет успеха на светлом фоне
     */
    public val textOnLightPositive: String = "textOnLightPositive"

    /**
     * Сплошной наборный текст на светлом фоне
     */
    public val textOnLightParagraphHover: String = "textOnLightParagraphHover"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondary: String = "textOnLightSecondary"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryActive: String = "textOnLightSecondaryActive"

    /**
     * Третичный цвет текста на светлом фоне
     */
    public val textOnLightTertiary: String = "textOnLightTertiary"

    /**
     * Вторичный цвет текста на светлом фоне
     */
    public val textOnLightSecondaryHover: String = "textOnLightSecondaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryActive: String = "textOnLightPrimaryActive"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryHover: String = "textOnLightPrimaryHover"

    /**
     * Основной цвет текста на светлом фоне
     */
    public val textOnLightPrimaryBrightness: String = "textOnLightPrimaryBrightness"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentActive: String = "textOnLightAccentActive"

    /**
     * Акцентный минорный цвет на светлом фоне
     */
    public val textOnLightAccentMinor: String = "textOnLightAccentMinor"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccent: String = "textOnLightAccent"

    /**
     * Акцентный цвет на светлом фоне
     */
    public val textOnLightAccentHover: String = "textOnLightAccentHover"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeActive: String = "textOnLightNegativeActive"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegativeHover: String = "textOnLightNegativeHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryHover: String = "textInverseSecondaryHover"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondary: String = "textInverseSecondary"

    /**
     * Инвертированный вторичный цвет текста
     */
    public val textInverseSecondaryActive: String = "textInverseSecondaryActive"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryActive: String = "textInverseTertiaryActive"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfo: String = "textOnLightInfo"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiaryHover: String = "textInverseTertiaryHover"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoActive: String = "textOnLightInfoActive"

    /**
     * Цвет информации на светлом фоне
     */
    public val textOnLightInfoHover: String = "textOnLightInfoHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryActive: String = "textInversePrimaryActive"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryHover: String = "textInversePrimaryHover"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimaryBrightness: String = "textInversePrimaryBrightness"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorActive: String = "textInverseAccentMinorActive"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraph: String = "textInverseParagraph"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinorHover: String = "textInverseAccentMinorHover"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraphActive: String = "textInverseParagraphActive"

    /**
     * Инвертированный основной цвет текста
     */
    public val textInversePrimary: String = "textInversePrimary"

    /**
     * Инвертированный сплошной наборный текст
     */
    public val textInverseParagraphHover: String = "textInverseParagraphHover"

    /**
     * Инвертированный третичный цвет текста
     */
    public val textInverseTertiary: String = "textInverseTertiary"

    /**
     * Цвет ошибки на светлом фоне
     */
    public val textOnLightNegative: String = "textOnLightNegative"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentActive: String = "textInverseAccentActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccentHover: String = "textInverseAccentHover"

    /**
     * Инвертированный минорный акцентный цвет
     */
    public val textInverseAccentMinor: String = "textInverseAccentMinor"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegative: String = "textInverseNegative"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveActive: String = "textInversePositiveActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositiveHover: String = "textInversePositiveHover"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeActive: String = "textInverseNegativeActive"

    /**
     * Инвертированный цвет ошибки
     */
    public val textInverseNegativeHover: String = "textInverseNegativeHover"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondary: String = "surfaceDefaultSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiary: String = "surfaceDefaultSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryActive: String = "surfaceDefaultSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidSecondaryHover: String = "surfaceDefaultSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidTertiaryHover: String = "surfaceDefaultSolidTertiaryHover"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoActive: String = "textInverseInfoActive"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfo: String = "textInverseInfo"

    /**
     * Инвертированный цвет информации
     */
    public val textInverseInfoHover: String = "textInverseInfoHover"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarning: String = "textInverseWarning"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningHover: String = "textInverseWarningHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimary: String = "surfaceDefaultSolidPrimary"

    /**
     * Инвертированный цвет предупреждения
     */
    public val textInverseWarningActive: String = "textInverseWarningActive"

    /**
     * Инвертированный цвет успеха
     */
    public val textInversePositive: String = "textInversePositive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryHover: String = "surfaceDefaultSolidPrimaryHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentHover: String = "surfaceDefaultAccentHover"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccentActive: String = "surfaceDefaultAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryActive: String =
        "surfaceDefaultTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondary: String = "surfaceDefaultTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimaryHover: String =
        "surfaceDefaultTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeep: String = "surfaceDefaultTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentPrimary: String = "surfaceDefaultTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeepActive: String = "surfaceDefaultTransparentDeepActive"

    /**
     * Глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentDeepHover: String = "surfaceDefaultTransparentDeepHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardActive: String = "surfaceDefaultSolidCardActive"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardHover: String = "surfaceDefaultSolidCardHover"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightness: String = "surfaceDefaultSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearActive: String = "surfaceDefaultClearActive"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClear: String = "surfaceDefaultClear"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCard: String = "surfaceDefaultSolidCard"

    /**
     * Фон поверхности/контрола без заливки
     */
    public val surfaceDefaultClearHover: String = "surfaceDefaultClearHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardActive: String = "surfaceDefaultTransparentCardActive"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardHover: String = "surfaceDefaultTransparentCardHover"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCardBrightness: String =
        "surfaceDefaultTransparentCardBrightness"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultActive: String = "surfaceDefaultSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefaultHover: String = "surfaceDefaultSolidDefaultHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentActive: String =
        "surfaceDefaultTransparentAccentActive"

    /**
     * Прозрачный фон для карточек
     */
    public val surfaceDefaultTransparentCard: String = "surfaceDefaultTransparentCard"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryActive: String =
        "surfaceDefaultTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiary: String = "surfaceDefaultTransparentTertiary"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccentHover: String = "surfaceDefaultTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentAccent: String = "surfaceDefaultTransparentAccent"

    /**
     * Вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentSecondaryHover: String =
        "surfaceDefaultTransparentSecondaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryActive: String =
        "surfaceDefaultTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола
     */
    public val surfaceDefaultTransparentTertiaryHover: String =
        "surfaceDefaultTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveActive: String = "surfaceDefaultPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositiveHover: String = "surfaceDefaultPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeActive: String = "surfaceDefaultNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех
     */
    public val surfaceDefaultPositive: String = "surfaceDefaultPositive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegativeHover: String = "surfaceDefaultNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoHover: String = "surfaceDefaultInfoHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarning: String = "surfaceDefaultWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningHover: String = "surfaceDefaultWarningHover"

    /**
     * Цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultWarningActive: String = "surfaceDefaultWarningActive"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfoActive: String = "surfaceDefaultInfoActive"

    /**
     * Цвет фона поверхности/контрола ошибка
     */
    public val surfaceDefaultNegative: String = "surfaceDefaultNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeActive: String =
        "surfaceDefaultTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegativeHover: String =
        "surfaceDefaultTransparentNegativeHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceDefaultTransparentNegative: String = "surfaceDefaultTransparentNegative"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondary: String = "surfaceOnDarkSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiary: String = "surfaceOnDarkSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryActive: String = "surfaceOnDarkSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidSecondaryHover: String = "surfaceOnDarkSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidTertiaryHover: String = "surfaceOnDarkSolidTertiaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryActive: String = "surfaceOnDarkSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryBrightness: String = "surfaceOnDarkSolidPrimaryBrightness"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnlyActive: String = "surfaceDefaultReadOnlyActive"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnly: String = "surfaceDefaultReadOnly"

    /**
     * Цвет для readOnly
     */
    public val surfaceDefaultReadOnlyHover: String = "surfaceDefaultReadOnlyHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimaryHover: String = "surfaceOnDarkSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkSolidPrimary: String = "surfaceOnDarkSolidPrimary"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccent: String = "surfaceOnDarkAccent"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentHover: String = "surfaceOnDarkAccentHover"

    /**
     * Акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentActive: String = "surfaceOnDarkAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryActive: String =
        "surfaceOnDarkTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondary: String = "surfaceOnDarkTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimaryHover: String = "surfaceOnDarkTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeep: String = "surfaceOnDarkTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentPrimary: String = "surfaceOnDarkTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeepActive: String = "surfaceOnDarkTransparentDeepActive"

    /**
     * Глубокий прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentDeepHover: String = "surfaceOnDarkTransparentDeepHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardActive: String = "surfaceOnDarkSolidCardActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardHover: String = "surfaceOnDarkSolidCardHover"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightness: String = "surfaceOnDarkSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClear: String = "surfaceOnDarkClear"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearHover: String = "surfaceOnDarkClearHover"

    /**
     * Фон поверхности/контрола без заливки на темном фоне
     */
    public val surfaceOnDarkClearActive: String = "surfaceOnDarkClearActive"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCard: String = "surfaceOnDarkSolidCard"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultHover: String = "surfaceOnDarkSolidDefaultHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefaultActive: String = "surfaceOnDarkSolidDefaultActive"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCard: String = "surfaceOnDarkTransparentCard"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardHover: String = "surfaceOnDarkTransparentCardHover"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardBrightness: String =
        "surfaceOnDarkTransparentCardBrightness"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryActive: String =
        "surfaceOnDarkTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiary: String = "surfaceOnDarkTransparentTertiary"

    /**
     * Прозрачный фон для карточек на темном фоне
     */
    public val surfaceOnDarkTransparentCardActive: String = "surfaceOnDarkTransparentCardActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentSecondaryHover: String =
        "surfaceOnDarkTransparentSecondaryHover"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryActive: String =
        "surfaceOnDarkTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentTertiaryHover: String =
        "surfaceOnDarkTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveActive: String = "surfaceOnDarkPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositiveHover: String = "surfaceOnDarkPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeActive: String = "surfaceOnDarkNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех на темном фоне
     */
    public val surfaceOnDarkPositive: String = "surfaceOnDarkPositive"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegativeHover: String = "surfaceOnDarkNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoHover: String = "surfaceOnDarkInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfo: String = "surfaceOnDarkInfo"

    /**
     * Цвет фона поверхности/контрола информация на темном фоне
     */
    public val surfaceOnDarkInfoActive: String = "surfaceOnDarkInfoActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningActive: String = "surfaceOnDarkWarningActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccent: String = "surfaceOnDarkTransparentAccent"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentHover: String = "surfaceOnDarkTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkTransparentAccentActive: String = "surfaceOnDarkTransparentAccentActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarning: String = "surfaceOnDarkWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkWarningHover: String = "surfaceOnDarkWarningHover"

    /**
     * Цвет фона поверхности/контрола ошибка на темном фоне
     */
    public val surfaceOnDarkNegative: String = "surfaceOnDarkNegative"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeActive: String =
        "surfaceOnDarkTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegativeHover: String =
        "surfaceOnDarkTransparentNegativeHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnlyActive: String = "surfaceOnDarkReadOnlyActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на темном фоне
     */
    public val surfaceOnDarkTransparentNegative: String = "surfaceOnDarkTransparentNegative"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondary: String = "surfaceOnLightSolidSecondary"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiary: String = "surfaceOnLightSolidTertiary"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryActive: String = "surfaceOnLightSolidSecondaryActive"

    /**
     * Вторичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidSecondaryHover: String = "surfaceOnLightSolidSecondaryHover"

    /**
     * Третичный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidTertiaryHover: String = "surfaceOnLightSolidTertiaryHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnlyHover: String = "surfaceOnDarkReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnDarkReadOnly: String = "surfaceOnDarkReadOnly"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryActive: String = "surfaceOnLightSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryHover: String = "surfaceOnLightSolidPrimaryHover"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimaryBrightness: String = "surfaceOnLightSolidPrimaryBrightness"

    /**
     * Основной непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightSolidPrimary: String = "surfaceOnLightSolidPrimary"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccent: String = "surfaceOnLightAccent"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentHover: String = "surfaceOnLightAccentHover"

    /**
     * Акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentActive: String = "surfaceOnLightAccentActive"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryActive: String =
        "surfaceOnLightTransparentPrimaryActive"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondary: String = "surfaceOnLightTransparentSecondary"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimaryHover: String =
        "surfaceOnLightTransparentPrimaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeep: String = "surfaceOnLightTransparentDeep"

    /**
     * Основной прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentPrimary: String = "surfaceOnLightTransparentPrimary"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeepActive: String = "surfaceOnLightTransparentDeepActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardActive: String = "surfaceOnLightSolidCardActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardHover: String = "surfaceOnLightSolidCardHover"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCardBrightness: String = "surfaceOnLightSolidCardBrightness"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearActive: String = "surfaceOnLightClearActive"

    /**
     * Основной фон для карточек на светлом фоне
     */
    public val surfaceOnLightSolidCard: String = "surfaceOnLightSolidCard"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClearHover: String = "surfaceOnLightClearHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultActive: String = "surfaceOnLightSolidDefaultActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefault: String = "surfaceOnLightSolidDefault"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на светлом фоне
     */
    public val surfaceOnLightSolidDefaultHover: String = "surfaceOnLightSolidDefaultHover"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardActive: String = "surfaceOnLightTransparentCardActive"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardHover: String = "surfaceOnLightTransparentCardHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryActive: String =
        "surfaceOnLightTransparentSecondaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiary: String = "surfaceOnLightTransparentTertiary"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCardBrightness: String =
        "surfaceOnLightTransparentCardBrightness"

    /**
     * Прозрачный фон для карточек на светлом фоне
     */
    public val surfaceOnLightTransparentCard: String = "surfaceOnLightTransparentCard"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryActive: String =
        "surfaceOnLightTransparentTertiaryActive"

    /**
     * Третичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentTertiaryHover: String =
        "surfaceOnLightTransparentTertiaryHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfo: String = "surfaceOnLightInfo"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveActive: String = "surfaceOnLightPositiveActive"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositiveHover: String = "surfaceOnLightPositiveHover"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeActive: String = "surfaceOnLightNegativeActive"

    /**
     * Цвет фона поверхности/контрола успех на светлом фоне
     */
    public val surfaceOnLightPositive: String = "surfaceOnLightPositive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegativeHover: String = "surfaceOnLightNegativeHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoHover: String = "surfaceOnLightInfoHover"

    /**
     * Цвет фона поверхности/контрола информация на светлом фоне
     */
    public val surfaceOnLightInfoActive: String = "surfaceOnLightInfoActive"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentHover: String = "surfaceOnLightTransparentAccentHover"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccent: String = "surfaceOnLightTransparentAccent"

    /**
     * Прозрачный акцентный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentAccentActive: String =
        "surfaceOnLightTransparentAccentActive"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarning: String = "surfaceOnLightWarning"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningActive: String = "surfaceOnLightWarningActive"

    /**
     * Цвет фона поверхности/контрола ошибка на светлом фоне
     */
    public val surfaceOnLightNegative: String = "surfaceOnLightNegative"

    /**
     * Цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightWarningHover: String = "surfaceOnLightWarningHover"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeActive: String =
        "surfaceOnLightTransparentNegativeActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegativeHover: String =
        "surfaceOnLightTransparentNegativeHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnlyActive: String = "surfaceOnLightReadOnlyActive"

    /**
     * Прозрачный цвет фона поверхности/контрола предупреждение на светлом фоне
     */
    public val surfaceOnLightTransparentNegative: String = "surfaceOnLightTransparentNegative"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondary: String = "surfaceInverseSolidSecondary"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryHover: String = "surfaceInverseSolidSecondaryHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnlyHover: String = "surfaceOnLightReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceOnLightReadOnly: String = "surfaceOnLightReadOnly"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryBrightness: String = "surfaceInverseSolidPrimaryBrightness"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryActive: String = "surfaceInverseSolidPrimaryActive"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimaryHover: String = "surfaceInverseSolidPrimaryHover"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryHover: String =
        "surfaceInverseTransparentTertiaryHover"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearActive: String = "surfaceInverseClearActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClear: String = "surfaceInverseClear"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryActive: String =
        "surfaceInverseTransparentPrimaryActive"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondary: String = "surfaceInverseTransparentSecondary"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimaryHover: String =
        "surfaceInverseTransparentPrimaryHover"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeep: String = "surfaceInverseTransparentDeep"

    /**
     * Инвертированный основной прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentPrimary: String = "surfaceInverseTransparentPrimary"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeepActive: String = "surfaceInverseTransparentDeepActive"

    /**
     * Инвертированный глубокий прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentDeepHover: String = "surfaceInverseTransparentDeepHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardActive: String = "surfaceInverseSolidCardActive"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardHover: String = "surfaceInverseSolidCardHover"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCardBrightness: String = "surfaceInverseSolidCardBrightness"

    /**
     * Инвертированный основной фон для карточек
     */
    public val surfaceInverseSolidCard: String = "surfaceInverseSolidCard"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardBrightness: String =
        "surfaceInverseTransparentCardBrightness"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardHover: String = "surfaceInverseTransparentCardHover"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultActive: String = "surfaceInverseSolidDefaultActive"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryActive: String = "surfaceInverseSolidTertiaryActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCardActive: String = "surfaceInverseTransparentCardActive"

    /**
     * Инвертированный прозрачный фон для карточек
     */
    public val surfaceInverseTransparentCard: String = "surfaceInverseTransparentCard"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefaultHover: String = "surfaceInverseSolidDefaultHover"

    /**
     * Инвертированный третичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidTertiaryHover: String = "surfaceInverseSolidTertiaryHover"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryActive: String =
        "surfaceInverseTransparentSecondaryActive"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiary: String = "surfaceInverseTransparentTertiary"

    /**
     * Инвертированный вторичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentSecondaryHover: String =
        "surfaceInverseTransparentSecondaryHover"

    /**
     * Инвертированный третичный прозрачный фон поверхности/контрола
     */
    public val surfaceInverseTransparentTertiaryActive: String =
        "surfaceInverseTransparentTertiaryActive"

    /**
     * Инвертированный фон поверхности/контрола без заливки
     */
    public val surfaceInverseClearHover: String = "surfaceInverseClearHover"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningActive: String = "surfaceInverseWarningActive"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarningHover: String = "surfaceInverseWarningHover"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentHover: String = "surfaceInverseAccentHover"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveActive: String = "surfaceInversePositiveActive"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositiveHover: String = "surfaceInversePositiveHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeActive: String = "surfaceInverseNegativeActive"

    /**
     * Инвертированный цвет фона поверхности/контрола успех
     */
    public val surfaceInversePositive: String = "surfaceInversePositive"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegativeHover: String = "surfaceInverseNegativeHover"

    /**
     * Инвертированный цвет фона поверхности/контрола ошибка
     */
    public val surfaceInverseNegative: String = "surfaceInverseNegative"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoHover: String = "surfaceInverseInfoHover"

    /**
     * Инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseWarning: String = "surfaceInverseWarning"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccent: String = "surfaceInverseTransparentAccent"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfoActive: String = "surfaceInverseInfoActive"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentActive: String =
        "surfaceInverseTransparentAccentActive"

    /**
     * Инвертированный цвет фона поверхности/контрола информация
     */
    public val surfaceInverseInfo: String = "surfaceInverseInfo"

    /**
     * Прозрачный инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseTransparentAccentHover: String = "surfaceInverseTransparentAccentHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeActive: String =
        "surfaceInverseTransparentNegativeActive"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegativeHover: String =
        "surfaceInverseTransparentNegativeHover"

    /**
     * Прозрачный инвертированный цвет фона поверхности/контрола предупреждение
     */
    public val surfaceInverseTransparentNegative: String = "surfaceInverseTransparentNegative"

    /**
     * Вторичный фон
     */
    public val backgroundDefaultSecondary: String = "backgroundDefaultSecondary"

    /**
     * Третичный фон
     */
    public val backgroundDefaultTertiary: String = "backgroundDefaultTertiary"

    /**
     * Основной фон на светлом фоне
     */
    public val backgroundLightPrimary: String = "backgroundLightPrimary"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnlyActive: String = "surfaceInverseReadOnlyActive"

    /**
     * Вторичный фон на темном фоне
     */
    public val backgroundDarkSecondary: String = "backgroundDarkSecondary"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnlyHover: String = "surfaceInverseReadOnlyHover"

    /**
     * Цвет для readOnly
     */
    public val surfaceInverseReadOnly: String = "surfaceInverseReadOnly"

    /**
     * Третичный фон на темном фоне
     */
    public val backgroundDarkTertiary: String = "backgroundDarkTertiary"

    /**
     * Основной фон
     */
    public val backgroundDefaultPrimary: String = "backgroundDefaultPrimary"

    /**
     * Цвет фона паранжи светлый на темном фоне
     */
    public val overlayOnDarkSoft: String = "overlayOnDarkSoft"

    /**
     * Цвет фона паранжи темный на темном фоне
     */
    public val overlayOnDarkHard: String = "overlayOnDarkHard"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryActive: String =
        "outlineDefaultTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimary: String = "outlineDefaultTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки
     */
    public val outlineDefaultTransparentPrimaryHover: String =
        "outlineDefaultTransparentPrimaryHover"

    /**
     * Цвет фона паранжи темный
     */
    public val overlayDefaultHard: String = "overlayDefaultHard"

    /**
     * Цвет фона паранжи светлый
     */
    public val overlayDefaultSoft: String = "overlayDefaultSoft"

    /**
     * Цвет фона паранжи темный на светлом фоне
     */
    public val overlayOnLightHard: String = "overlayOnLightHard"

    /**
     * Инвертированный цвет фона паранжи светлый
     */
    public val overlayInverseSoft: String = "overlayInverseSoft"

    /**
     * Цвет фона паранжи светлый на светлом фоне
     */
    public val overlayOnLightSoft: String = "overlayOnLightSoft"

    /**
     * Инвертированный цвет фона паранжи темный
     */
    public val overlayInverseHard: String = "overlayInverseHard"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClear: String = "outlineDefaultClear"

    /**
     * Инвертированный третичный фон
     */
    public val backgroundInverseTertiary: String = "backgroundInverseTertiary"

    /**
     * Инвертированный вторичный фон
     */
    public val backgroundInverseSecondary: String = "backgroundInverseSecondary"

    /**
     * Третичный фон на светлом фоне
     */
    public val backgroundLightTertiary: String = "backgroundLightTertiary"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositive: String = "outlineDefaultPositive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegative: String = "outlineDefaultNegative"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentHover: String = "outlineDefaultAccentHover"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccentActive: String = "outlineDefaultAccentActive"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveActive: String = "outlineDefaultPositiveActive"

    /**
     * Цвет обводки успех
     */
    public val outlineDefaultPositiveHover: String = "outlineDefaultPositiveHover"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeActive: String = "outlineDefaultNegativeActive"

    /**
     * Цвет обводки ошибка
     */
    public val outlineDefaultNegativeHover: String = "outlineDefaultNegativeHover"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearHover: String = "outlineDefaultClearHover"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoHover: String = "outlineDefaultInfoHover"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningHover: String = "outlineDefaultWarningHover"

    /**
     * Бесцветная обводка
     */
    public val outlineDefaultClearActive: String = "outlineDefaultClearActive"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarning: String = "outlineDefaultWarning"

    /**
     * Цвет обводки предупреждение
     */
    public val outlineDefaultWarningActive: String = "outlineDefaultWarningActive"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfo: String = "outlineDefaultInfo"

    /**
     * Цвет обводки информация
     */
    public val outlineDefaultInfoActive: String = "outlineDefaultInfoActive"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimary: String = "outlineOnDarkTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryActive: String =
        "outlineOnDarkTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки на темном фоне
     */
    public val outlineOnDarkTransparentPrimaryHover: String = "outlineOnDarkTransparentPrimaryHover"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarning: String = "outlineOnDarkWarning"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccent: String = "outlineOnDarkAccent"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveActive: String = "outlineOnDarkPositiveActive"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositiveHover: String = "outlineOnDarkPositiveHover"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeActive: String = "outlineOnDarkNegativeActive"

    /**
     * Цвет обводки успех на темном фоне
     */
    public val outlineOnDarkPositive: String = "outlineOnDarkPositive"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegativeHover: String = "outlineOnDarkNegativeHover"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentHover: String = "outlineOnDarkAccentHover"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClear: String = "outlineOnDarkClear"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoHover: String = "outlineOnDarkInfoHover"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfoActive: String = "outlineOnDarkInfoActive"

    /**
     * Цвет обводки информация на темном фоне
     */
    public val outlineOnDarkInfo: String = "outlineOnDarkInfo"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearHover: String = "outlineOnDarkClearHover"

    /**
     * Бесцветная обводка на темном фоне
     */
    public val outlineOnDarkClearActive: String = "outlineOnDarkClearActive"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningActive: String = "outlineOnDarkWarningActive"

    /**
     * Цвет обводки ошибка на темном фоне
     */
    public val outlineOnDarkNegative: String = "outlineOnDarkNegative"

    /**
     * Цвет обводки предупреждение на темном фоне
     */
    public val outlineOnDarkWarningHover: String = "outlineOnDarkWarningHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositiveHover: String = "outlineOnLightPositiveHover"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClear: String = "outlineOnLightClear"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearHover: String = "outlineOnLightClearHover"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimary: String = "outlineOnLightTransparentPrimary"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryActive: String =
        "outlineOnLightTransparentPrimaryActive"

    /**
     * Основной прозрачный цвет обводки на светлом фоне
     */
    public val outlineOnLightTransparentPrimaryHover: String =
        "outlineOnLightTransparentPrimaryHover"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentHover: String = "outlineOnLightAccentHover"

    /**
     * Цвет обводки успех на светлом фоне
     */
    public val outlineOnLightPositive: String = "outlineOnLightPositive"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccentActive: String = "outlineOnLightAccentActive"

    /**
     * Бесцветная обводка на светлом фоне
     */
    public val outlineOnLightClearActive: String = "outlineOnLightClearActive"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeActive: String = "outlineOnLightNegativeActive"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegativeHover: String = "outlineOnLightNegativeHover"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarning: String = "outlineOnLightWarning"

    /**
     * Цвет обводки предупреждение на светлом фоне
     */
    public val outlineOnLightWarningHover: String = "outlineOnLightWarningHover"

    /**
     * Цвет обводки ошибка на светлом фоне
     */
    public val outlineOnLightNegative: String = "outlineOnLightNegative"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoHover: String = "outlineOnLightInfoHover"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfo: String = "outlineOnLightInfo"

    /**
     * Цвет обводки информация на светлом фоне
     */
    public val outlineOnLightInfoActive: String = "outlineOnLightInfoActive"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentActive: String = "outlineInverseAccentActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClear: String = "outlineInverseClear"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearActive: String = "outlineInverseClearActive"

    /**
     * Инвертированная бесцветная обводка
     */
    public val outlineInverseClearHover: String = "outlineInverseClearHover"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryHover: String =
        "outlineInverseTransparentPrimaryHover"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimary: String = "outlineInverseTransparentPrimary"

    /**
     * Инвертированный основной прозрачный цвет обводки
     */
    public val outlineInverseTransparentPrimaryActive: String =
        "outlineInverseTransparentPrimaryActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositive: String = "outlineInversePositive"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegative: String = "outlineInverseNegative"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoHover: String = "outlineInverseInfoHover"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfoActive: String = "outlineInverseInfoActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveActive: String = "outlineInversePositiveActive"

    /**
     * Инвертированный цвет обводки успех
     */
    public val outlineInversePositiveHover: String = "outlineInversePositiveHover"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeActive: String = "outlineInverseNegativeActive"

    /**
     * Инвертированный цвет обводки ошибка
     */
    public val outlineInverseNegativeHover: String = "outlineInverseNegativeHover"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningActive: String = "outlineInverseWarningActive"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarningHover: String = "outlineInverseWarningHover"

    /**
     * Инвертированный цвет обводки предупреждение
     */
    public val outlineInverseWarning: String = "outlineInverseWarning"

    /**
     * Инвертированный цвет обводки информация
     */
    public val outlineInverseInfo: String = "outlineInverseInfo"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorHover: String = "surfaceInverseAccentMinorHover"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию на темном фоне
     */
    public val surfaceOnDarkSolidDefault: String = "surfaceOnDarkSolidDefault"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightAccentMinorActive: String = "surfaceOnLightAccentMinorActive"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryHover: String = "textDefaultPrimaryHover"

    /**
     * Основной фон на темном фоне
     */
    public val backgroundDarkPrimary: String = "backgroundDarkPrimary"

    /**
     * Inverse Background Hardline
     */
    public val backgroundInverseHardline: String = "backgroundInverseHardline"

    /**
     * Инвертированный основной фон
     */
    public val backgroundInversePrimary: String = "backgroundInversePrimary"

    /**
     * Light Background Hardline
     */
    public val backgroundLightHardline: String = "backgroundLightHardline"

    /**
     * Вторичный фон на светлом фоне
     */
    public val backgroundLightSecondary: String = "backgroundLightSecondary"

    /**
     * Акцентный цвет обводки
     */
    public val outlineDefaultAccent: String = "outlineDefaultAccent"

    /**
     * New description
     */
    public val outlineDefaultDeep: String = "outlineDefaultDeep"

    /**
     * Outline Default
     */
    public val outlineDefaultDefault: String = "outlineDefaultDefault"

    /**
     * Default Active Default
     */
    public val outlineDefaultDefaultActive: String = "outlineDefaultDefaultActive"

    /**
     * Default Hover Default
     */
    public val outlineDefaultDefaultHover: String = "outlineDefaultDefaultHover"

    /**
     * New description
     */
    public val outlineDefaultTransparentWhite: String = "outlineDefaultTransparentWhite"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccent: String = "outlineInverseAccent"

    /**
     * Инвертированный акцентный цвет обводки
     */
    public val outlineInverseAccentHover: String = "outlineInverseAccentHover"

    /**
     * Inverse Outline Default
     */
    public val outlineInverseDefault: String = "outlineInverseDefault"

    /**
     * Default Active Inverse
     */
    public val outlineInverseDefaultActive: String = "outlineInverseDefaultActive"

    /**
     * Default Hover On Light
     */
    public val outlineOnLightDefaultHover: String = "outlineOnLightDefaultHover"

    /**
     * Primary Hover On Light
     */
    public val outlineOnLightPrimaryHover: String = "outlineOnLightPrimaryHover"

    /**
     * Blue Text Accent Hover Default
     */
    public val personasDefaultBlueTextAccentHover: String = "personasDefaultBlueTextAccentHover"

    /**
     * Green Text Accent Hover Default
     */
    public val personasDefaultGreenTextAccentHover: String = "personasDefaultGreenTextAccentHover"

    /**
     * Indigo Text Accent Hover Default
     */
    public val personasDefaultIndigoTextAccentHover: String = "personasDefaultIndigoTextAccentHover"

    /**
     * Sea Blue Text Accent Hover Default
     */
    public val personasDefaultSeaBlueTextAccentHover: String =
        "personasDefaultSeaBlueTextAccentHover"

    /**
     * Blue Text Accent Hover On Dark
     */
    public val personasOnDarkBlueTextAccentHover: String = "personasOnDarkBlueTextAccentHover"

    /**
     * Olive Text Accent Hover On Dark
     */
    public val personasOnDarkOliveTextAccentHover: String = "personasOnDarkOliveTextAccentHover"

    /**
     * Sea Blue Text Accent Hover On Dark
     */
    public val personasOnDarkSeaBlueTextAccentHover: String = "personasOnDarkSeaBlueTextAccentHover"

    /**
     * Violet Text Accent Hover On Dark
     */
    public val personasOnDarkVioletTextAccentHover: String = "personasOnDarkVioletTextAccentHover"

    /**
     * Indigo Text Accent Hover On Light
     */
    public val personasOnLightIndigoTextAccentHover: String = "personasOnLightIndigoTextAccentHover"

    /**
     * Pink Text Accent Hover On Light
     */
    public val personasOnLightPinkTextAccentHover: String = "personasOnLightPinkTextAccentHover"

    /**
     * Sea Blue Text Accent Hover On Light
     */
    public val personasOnLightSeaBlueTextAccentHover: String =
        "personasOnLightSeaBlueTextAccentHover"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorHover: String = "surfaceDefaultAccentMinorHover"

    /**
     * Accent Secondary Hover Inverse
     */
    public val surfaceInverseAccentSecondaryHover: String = "surfaceInverseAccentSecondaryHover"

    /**
     * Accent Secondary Hover On Dark
     */
    public val surfaceOnDarkAccentSecondaryHover: String = "surfaceOnDarkAccentSecondaryHover"

    /**
     * Глубокий прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentDeepHover: String = "surfaceOnLightTransparentDeepHover"

    /**
     * Вторичный прозрачный фон поверхности/контрола на светлом фоне
     */
    public val surfaceOnLightTransparentSecondaryHover: String =
        "surfaceOnLightTransparentSecondaryHover"

    /**
     * Акцентный цвет
     */
    public val textDefaultAccentHover: String = "textDefaultAccentHover"

    /**
     * Primary Active Inverse
     */
    public val outlineInversePrimaryActive: String = "outlineInversePrimaryActive"

    /**
     * New description
     */
    public val outlineInverseTransparentWhiteActive: String = "outlineInverseTransparentWhiteActive"

    /**
     * Акцентный цвет обводки на темном фоне
     */
    public val outlineOnDarkAccentActive: String = "outlineOnDarkAccentActive"

    /**
     * Default Active On Dark
     */
    public val outlineOnDarkDefaultActive: String = "outlineOnDarkDefaultActive"

    /**
     * Primary Active On Dark
     */
    public val outlineOnDarkPrimaryActive: String = "outlineOnDarkPrimaryActive"

    /**
     * Ochre Text Accent Active Default
     */
    public val personasDefaultOchreTextAccentActive: String = "personasDefaultOchreTextAccentActive"

    /**
     * Olive Text Accent Active Default
     */
    public val personasDefaultOliveTextAccentActive: String = "personasDefaultOliveTextAccentActive"

    /**
     * Violet Text Accent Active Default
     */
    public val personasDefaultVioletTextAccentActive: String =
        "personasDefaultVioletTextAccentActive"

    /**
     * Sea Blue Text Accent Active Inverse
     */
    public val personasInverseSeaBlueTextAccentActive: String =
        "personasInverseSeaBlueTextAccentActive"

    /**
     * Violet Text Accent Active Inverse
     */
    public val personasInverseVioletTextAccentActive: String =
        "personasInverseVioletTextAccentActive"

    /**
     * Green Text Accent Active On Light
     */
    public val personasOnLightGreenTextAccentActive: String = "personasOnLightGreenTextAccentActive"

    /**
     * Ochre Text Accent Active On Light
     */
    public val personasOnLightOchreTextAccentActive: String = "personasOnLightOchreTextAccentActive"

    /**
     * Violet Text Accent Active On Light
     */
    public val personasOnLightVioletTextAccentActive: String =
        "personasOnLightVioletTextAccentActive"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultAccentMinorActive: String = "surfaceDefaultAccentMinorActive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryActive: String = "surfaceDefaultSolidPrimaryActive"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightnessHover: String =
        "surfaceDefaultSolidPrimaryBrightnessHover"

    /**
     * Transparent Navi Active Default
     */
    public val surfaceDefaultTransparentNaviActive: String = "surfaceDefaultTransparentNaviActive"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccentActive: String = "surfaceInverseAccentActive"

    /**
     * Инвертированный акцентный минорный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseAccentMinorActive: String = "surfaceInverseAccentMinorActive"

    /**
     * Инвертированный вторичный непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidSecondaryActive: String = "surfaceInverseSolidSecondaryActive"

    /**
     * Transparent Accent Minor Active On Light
     */
    public val surfaceOnLightTransparentAccentMinorActive: String =
        "surfaceOnLightTransparentAccentMinorActive"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccentActive: String = "textOnDarkAccentActive"

    /**
     * Акцентный цвет обводки на светлом фоне
     */
    public val outlineOnLightAccent: String = "outlineOnLightAccent"

    /**
     * On Light Outline Primary
     */
    public val outlineOnLightPrimary: String = "outlineOnLightPrimary"

    /**
     * Inverse Personas Sea Blue Text Accent
     */
    public val personasInverseSeaBlueTextAccent: String = "personasInverseSeaBlueTextAccent"

    /**
     * Акцентный фон поверхности/контрола
     */
    public val surfaceDefaultAccent: String = "surfaceDefaultAccent"

    /**
     * Цвет фона поверхности/контрола информация
     */
    public val surfaceDefaultInfo: String = "surfaceDefaultInfo"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightnessActive: String =
        "surfaceDefaultSolidCardBrightnessActive"

    /**
     * Непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceDefaultSolidDefault: String = "surfaceDefaultSolidDefault"

    /**
     * Surface Transparent Navi
     */
    public val surfaceDefaultTransparentNavi: String = "surfaceDefaultTransparentNavi"

    /**
     * Инвертированный акцентный фон поверхности/контрола
     */
    public val surfaceInverseAccent: String = "surfaceInverseAccent"

    /**
     * Инвертированный основной непрозрачный фон поверхности/контрола
     */
    public val surfaceInverseSolidPrimary: String = "surfaceInverseSolidPrimary"

    /**
     * Акцентный минорный непрозрачный фон поверхности/контрола на темном фоне
     */
    public val surfaceOnDarkAccentMinor: String = "surfaceOnDarkAccentMinor"

    /**
     * Фон поверхности/контрола без заливки на светлом фоне
     */
    public val surfaceOnLightClear: String = "surfaceOnLightClear"

    /**
     * Основной цвет текста
     */
    public val textDefaultPrimaryBrightnessActive: String = "textDefaultPrimaryBrightnessActive"

    /**
     * Инвертированный акцентный цвет
     */
    public val textInverseAccent: String = "textInverseAccent"

    /**
     * Акцентный цвет на темном фоне
     */
    public val textOnDarkAccent: String = "textOnDarkAccent"

    /**
     * Dark Background Hardline
     */
    public val backgroundDarkHardline: String = "backgroundDarkHardline"

    /**
     * Основной фон для карточек
     */
    public val surfaceDefaultSolidCardBrightnessHover: String =
        "surfaceDefaultSolidCardBrightnessHover"

    /**
     * Основной непрозрачный фон поверхности/контрола
     */
    public val surfaceDefaultSolidPrimaryBrightness: String = "surfaceDefaultSolidPrimaryBrightness"

    /**
     * Инвертированный непрозрачный фон поверхности/контрола по умолчанию
     */
    public val surfaceInverseSolidDefault: String = "surfaceInverseSolidDefault"

    /**
     * Основной фон для карточек на темном фоне
     */
    public val surfaceOnDarkSolidCardBrightnessActive: String =
        "surfaceOnDarkSolidCardBrightnessActive"

    /**
     * Сплошной наборный текст на темном фоне
     */
    public val textOnDarkParagraphActive: String = "textOnDarkParagraphActive"

    /**
     * New description
     */
    public val overlayDefaultMedium: String = "overlayDefaultMedium"

    /**
     * New description
     */
    public val overlayInverseMedium: String = "overlayInverseMedium"

    /**
     * New description
     */
    public val overlayOnDarkMedium: String = "overlayOnDarkMedium"

    /**
     * New description
     */
    public val overlayOnLightMedium: String = "overlayOnLightMedium"

    /**
     * Переопределяет аттрибут цвета.
     */
    public infix fun String.overrideBy(color: String) {
        _overrideMap[this] = color
    }
}

internal val LocalSddsSbComColors: ProvidableCompositionLocal<SddsSbComColors> =
    staticCompositionLocalOf {
        lightSddsSbComColors()
    }

@Suppress("LongMethod")
internal fun SddsSbComColors.updateColorsFrom(other: SddsSbComColors) {
    outlineOnDarkDefaultHover = other.outlineOnDarkDefaultHover
    surfaceDefaultAccentSecondaryHover = other.surfaceDefaultAccentSecondaryHover
    surfaceDefaultTransparentCardBrightnessHover =
        other.surfaceDefaultTransparentCardBrightnessHover
    surfaceDefaultTransparentCardBrightnessActive =
        other.surfaceDefaultTransparentCardBrightnessActive
    surfaceOnLightSolidPrimaryBrightnessHover = other.surfaceOnLightSolidPrimaryBrightnessHover
    surfaceOnLightSolidPrimaryBrightnessActive = other.surfaceOnLightSolidPrimaryBrightnessActive
    surfaceOnDarkTransparentCardBrightnessHover = other.surfaceOnDarkTransparentCardBrightnessHover
    surfaceOnDarkSolidCardBrightnessHover = other.surfaceOnDarkSolidCardBrightnessHover
    surfaceOnDarkTransparentCardBrightnessActive =
        other.surfaceOnDarkTransparentCardBrightnessActive
    personasOnLightOliveTextAccent = other.personasOnLightOliveTextAccent
    personasOnDarkOliveTextAccent = other.personasOnDarkOliveTextAccent
    personasInverseOchreTextAccent = other.personasInverseOchreTextAccent
    personasInversePinkTextAccent = other.personasInversePinkTextAccent
    surfaceDefaultSolidTertiaryActive = other.surfaceDefaultSolidTertiaryActive
    surfaceInverseSolidPrimaryBrightnessHover = other.surfaceInverseSolidPrimaryBrightnessHover
    textDefaultPrimary = other.textDefaultPrimary
    surfaceInverseTransparentNavi = other.surfaceInverseTransparentNavi
    surfaceInverseTransparentCardBrightnessHover =
        other.surfaceInverseTransparentCardBrightnessHover
    surfaceOnLightSolidTertiaryActive = other.surfaceOnLightSolidTertiaryActive
    personasInverseIndigoTextAccent = other.personasInverseIndigoTextAccent
    surfaceInverseSolidPrimaryBrightnessActive = other.surfaceInverseSolidPrimaryBrightnessActive
    personasDefaultOliveTextAccent = other.personasDefaultOliveTextAccent
    textOnDarkAccentMinorHover = other.textOnDarkAccentMinorHover
    surfaceOnLightTransparentCardBrightnessActive =
        other.surfaceOnLightTransparentCardBrightnessActive
    surfaceOnLightTransparentCardBrightnessHover =
        other.surfaceOnLightTransparentCardBrightnessHover
    surfaceOnLightSolidCardBrightnessActive = other.surfaceOnLightSolidCardBrightnessActive
    surfaceOnDarkAccentMinorActive = other.surfaceOnDarkAccentMinorActive
    surfaceOnLightSolidCardBrightnessHover = other.surfaceOnLightSolidCardBrightnessHover
    outlineOnLightPositiveActive = other.outlineOnLightPositiveActive
    outlineDefaultPrimary = other.outlineDefaultPrimary
    surfaceInverseSolidTertiary = other.surfaceInverseSolidTertiary
    personasInverseGreenTextAccent = other.personasInverseGreenTextAccent
    surfaceDefaultAccentSecondary = other.surfaceDefaultAccentSecondary
    surfaceDefaultAccentMinor = other.surfaceDefaultAccentMinor
    surfaceOnDarkAccentSecondary = other.surfaceOnDarkAccentSecondary
    personasOnDarkIndigoTextAccent = other.personasOnDarkIndigoTextAccent
    surfaceOnDarkSolidTertiaryActive = other.surfaceOnDarkSolidTertiaryActive
    surfaceOnLightAccentMinor = other.surfaceOnLightAccentMinor
    personasOnLightOchreTextAccent = other.personasOnLightOchreTextAccent
    personasOnLightVioletTextAccent = other.personasOnLightVioletTextAccent
    surfaceInverseTransparentCardBrightnessActive =
        other.surfaceInverseTransparentCardBrightnessActive
    outlineOnLightWarningActive = other.outlineOnLightWarningActive
    surfaceOnDarkAccentMinorHover = other.surfaceOnDarkAccentMinorHover
    surfaceInverseSolidCardBrightnessActive = other.surfaceInverseSolidCardBrightnessActive
    surfaceOnLightAccentMinorHover = other.surfaceOnLightAccentMinorHover
    surfaceInverseAccentMinor = other.surfaceInverseAccentMinor
    surfaceOnDarkTransparentAccentMinor = other.surfaceOnDarkTransparentAccentMinor
    personasOnLightSeaBlueTextAccent = other.personasOnLightSeaBlueTextAccent
    personasOnDarkBlueTextAccent = other.personasOnDarkBlueTextAccent
    personasOnDarkVioletTextAccent = other.personasOnDarkVioletTextAccent
    personasDefaultOchreTextAccent = other.personasDefaultOchreTextAccent
    surfaceOnLightTransparentNavi = other.surfaceOnLightTransparentNavi
    personasInverseBlueTextAccentActive = other.personasInverseBlueTextAccentActive
    textOnLightWarningActive = other.textOnLightWarningActive
    personasInverseOliveTextAccentHover = other.personasInverseOliveTextAccentHover
    surfaceOnLightTransparentNaviActive = other.surfaceOnLightTransparentNaviActive
    personasOnLightBlueTextAccentActive = other.personasOnLightBlueTextAccentActive
    outlineOnLightPrimaryActive = other.outlineOnLightPrimaryActive
    outlineOnLightDefaultActive = other.outlineOnLightDefaultActive
    personasOnDarkOliveTextAccentActive = other.personasOnDarkOliveTextAccentActive
    personasOnDarkSeaBlueTextAccent = other.personasOnDarkSeaBlueTextAccent
    personasOnDarkVioletTextAccentActive = other.personasOnDarkVioletTextAccentActive
    personasOnDarkGreenTextAccentHover = other.personasOnDarkGreenTextAccentHover
    surfaceOnDarkAccentSecondaryActive = other.surfaceOnDarkAccentSecondaryActive
    personasInverseGreenTextAccentActive = other.personasInverseGreenTextAccentActive
    surfaceInverseAccentSecondary = other.surfaceInverseAccentSecondary
    textOnDarkPrimaryBrightnessHover = other.textOnDarkPrimaryBrightnessHover
    personasOnDarkPinkTextAccentActive = other.personasOnDarkPinkTextAccentActive
    personasInverseIndigoTextAccentActive = other.personasInverseIndigoTextAccentActive
    personasDefaultSeaBlueTextAccentActive = other.personasDefaultSeaBlueTextAccentActive
    surfaceOnLightTransparentAccentMinor = other.surfaceOnLightTransparentAccentMinor
    personasOnLightPinkTextAccentActive = other.personasOnLightPinkTextAccentActive
    textDefaultPrimaryBrightnessHover = other.textDefaultPrimaryBrightnessHover
    surfaceInverseTransparentAccentMinorActive = other.surfaceInverseTransparentAccentMinorActive
    personasDefaultOchreTextAccentHover = other.personasDefaultOchreTextAccentHover
    personasInversePinkTextAccentActive = other.personasInversePinkTextAccentActive
    surfaceOnLightTransparentNaviHover = other.surfaceOnLightTransparentNaviHover
    outlineDefaultPrimaryActive = other.outlineDefaultPrimaryActive
    personasOnDarkSeaBlueTextAccentActive = other.personasOnDarkSeaBlueTextAccentActive
    personasOnLightGreenTextAccent = other.personasOnLightGreenTextAccent
    surfaceInverseAccentSecondaryActive = other.surfaceInverseAccentSecondaryActive
    personasDefaultIndigoTextAccentActive = other.personasDefaultIndigoTextAccentActive
    personasDefaultGreenTextAccentActive = other.personasDefaultGreenTextAccentActive
    surfaceOnDarkTransparentNaviHover = other.surfaceOnDarkTransparentNaviHover
    personasInverseSeaBlueTextAccentHover = other.personasInverseSeaBlueTextAccentHover
    surfaceOnLightAccentSecondaryHover = other.surfaceOnLightAccentSecondaryHover
    personasInverseBlueTextAccentHover = other.personasInverseBlueTextAccentHover
    personasInverseIndigoTextAccentHover = other.personasInverseIndigoTextAccentHover
    personasOnDarkOchreTextAccent = other.personasOnDarkOchreTextAccent
    personasOnLightGreenTextAccentHover = other.personasOnLightGreenTextAccentHover
    personasOnDarkOchreTextAccentActive = other.personasOnDarkOchreTextAccentActive
    personasOnLightOchreTextAccentHover = other.personasOnLightOchreTextAccentHover
    outlineDefaultPrimaryHover = other.outlineDefaultPrimaryHover
    surfaceDefaultTransparentAccentMinorActive = other.surfaceDefaultTransparentAccentMinorActive
    surfaceDefaultTransparentNaviHover = other.surfaceDefaultTransparentNaviHover
    outlineInverseDefaultHover = other.outlineInverseDefaultHover
    personasInverseVioletTextAccentHover = other.personasInverseVioletTextAccentHover
    surfaceOnLightTransparentAccentMinorHover = other.surfaceOnLightTransparentAccentMinorHover
    surfaceInverseTransparentAccentMinorHover = other.surfaceInverseTransparentAccentMinorHover
    surfaceInverseTransparentNaviHover = other.surfaceInverseTransparentNaviHover
    outlineInversePrimaryHover = other.outlineInversePrimaryHover
    personasDefaultOliveTextAccentHover = other.personasDefaultOliveTextAccentHover
    personasDefaultVioletTextAccent = other.personasDefaultVioletTextAccent
    personasInverseOchreTextAccentHover = other.personasInverseOchreTextAccentHover
    personasOnDarkGreenTextAccentActive = other.personasOnDarkGreenTextAccentActive
    personasOnDarkPinkTextAccentHover = other.personasOnDarkPinkTextAccentHover
    personasInversePinkTextAccentHover = other.personasInversePinkTextAccentHover
    personasOnDarkIndigoTextAccentHover = other.personasOnDarkIndigoTextAccentHover
    personasOnLightBlueTextAccentHover = other.personasOnLightBlueTextAccentHover
    personasOnLightOliveTextAccentHover = other.personasOnLightOliveTextAccentHover
    personasOnLightVioletTextAccentHover = other.personasOnLightVioletTextAccentHover
    outlineOnDarkPrimaryHover = other.outlineOnDarkPrimaryHover
    personasOnDarkPinkTextAccent = other.personasOnDarkPinkTextAccent
    outlineOnDarkPrimary = other.outlineOnDarkPrimary
    personasOnLightBlueTextAccent = other.personasOnLightBlueTextAccent
    surfaceDefaultAccentSecondaryActive = other.surfaceDefaultAccentSecondaryActive
    personasDefaultBlueTextAccent = other.personasDefaultBlueTextAccent
    personasDefaultBlueTextAccentActive = other.personasDefaultBlueTextAccentActive
    personasDefaultGreenTextAccent = other.personasDefaultGreenTextAccent
    surfaceDefaultSolidPrimaryBrightnessActive = other.surfaceDefaultSolidPrimaryBrightnessActive
    textOnLightPrimaryBrightnessHover = other.textOnLightPrimaryBrightnessHover
    personasDefaultPinkTextAccent = other.personasDefaultPinkTextAccent
    personasDefaultSeaBlueTextAccent = other.personasDefaultSeaBlueTextAccent
    surfaceDefaultTransparentAccentMinor = other.surfaceDefaultTransparentAccentMinor
    personasDefaultVioletTextAccentHover = other.personasDefaultVioletTextAccentHover
    personasInverseBlueTextAccent = other.personasInverseBlueTextAccent
    personasInverseOliveTextAccentActive = other.personasInverseOliveTextAccentActive
    surfaceInverseSolidCardBrightnessHover = other.surfaceInverseSolidCardBrightnessHover
    surfaceInverseTransparentAccentMinor = other.surfaceInverseTransparentAccentMinor
    surfaceOnDarkSolidPrimaryBrightnessHover = other.surfaceOnDarkSolidPrimaryBrightnessHover
    surfaceOnDarkTransparentNavi = other.surfaceOnDarkTransparentNavi
    textInversePrimaryBrightnessHover = other.textInversePrimaryBrightnessHover
    backgroundDefaultHardline = other.backgroundDefaultHardline
    outlineInversePrimary = other.outlineInversePrimary
    outlineOnDarkDefault = other.outlineOnDarkDefault
    personasInverseVioletTextAccent = other.personasInverseVioletTextAccent
    personasDefaultIndigoTextAccent = other.personasDefaultIndigoTextAccent
    textInversePrimaryBrightnessActive = other.textInversePrimaryBrightnessActive
    textOnDarkPrimaryBrightnessActive = other.textOnDarkPrimaryBrightnessActive
    textOnLightPrimaryBrightnessActive = other.textOnLightPrimaryBrightnessActive
    personasOnDarkIndigoTextAccentActive = other.personasOnDarkIndigoTextAccentActive
    personasOnDarkOchreTextAccentHover = other.personasOnDarkOchreTextAccentHover
    personasDefaultPinkTextAccentHover = other.personasDefaultPinkTextAccentHover
    surfaceOnDarkTransparentNaviActive = other.surfaceOnDarkTransparentNaviActive
    surfaceOnLightAccentSecondary = other.surfaceOnLightAccentSecondary
    outlineOnLightDefault = other.outlineOnLightDefault
    personasDefaultPinkTextAccentActive = other.personasDefaultPinkTextAccentActive
    personasInverseOchreTextAccentActive = other.personasInverseOchreTextAccentActive
    personasInverseOliveTextAccent = other.personasInverseOliveTextAccent
    personasOnDarkBlueTextAccentActive = other.personasOnDarkBlueTextAccentActive
    personasOnDarkGreenTextAccent = other.personasOnDarkGreenTextAccent
    personasOnLightOliveTextAccentActive = other.personasOnLightOliveTextAccentActive
    personasOnLightPinkTextAccent = other.personasOnLightPinkTextAccent
    personasOnLightSeaBlueTextAccentActive = other.personasOnLightSeaBlueTextAccentActive
    surfaceDefaultTransparentAccentMinorHover = other.surfaceDefaultTransparentAccentMinorHover
    surfaceInverseTransparentNaviActive = other.surfaceInverseTransparentNaviActive
    surfaceOnDarkTransparentAccentMinorHover = other.surfaceOnDarkTransparentAccentMinorHover
    personasOnLightIndigoTextAccent = other.personasOnLightIndigoTextAccent
    surfaceOnDarkSolidPrimaryBrightnessActive = other.surfaceOnDarkSolidPrimaryBrightnessActive
    surfaceOnDarkTransparentAccentMinorActive = other.surfaceOnDarkTransparentAccentMinorActive
    surfaceOnLightAccentSecondaryActive = other.surfaceOnLightAccentSecondaryActive
    personasInverseGreenTextAccentHover = other.personasInverseGreenTextAccentHover
    personasOnLightIndigoTextAccentActive = other.personasOnLightIndigoTextAccentActive
    outlineDefaultTransparentWhiteActive = other.outlineDefaultTransparentWhiteActive
    outlineDefaultTransparentWhiteHover = other.outlineDefaultTransparentWhiteHover
    outlineInverseDeep = other.outlineInverseDeep
    outlineInverseDeepActive = other.outlineInverseDeepActive
    outlineInverseDeepHover = other.outlineInverseDeepHover
    outlineInverseTransparentWhite = other.outlineInverseTransparentWhite
    outlineInverseTransparentWhiteHover = other.outlineInverseTransparentWhiteHover
    outlineOnDarkDeep = other.outlineOnDarkDeep
    outlineOnDarkDeepActive = other.outlineOnDarkDeepActive
    outlineOnDarkDeepHover = other.outlineOnDarkDeepHover
    outlineOnDarkTransparentWhite = other.outlineOnDarkTransparentWhite
    outlineOnDarkTransparentWhiteActive = other.outlineOnDarkTransparentWhiteActive
    outlineOnDarkTransparentWhiteHover = other.outlineOnDarkTransparentWhiteHover
    outlineOnLightDeep = other.outlineOnLightDeep
    outlineOnLightDeepActive = other.outlineOnLightDeepActive
    outlineOnLightDeepHover = other.outlineOnLightDeepHover
    outlineOnLightTransparentWhite = other.outlineOnLightTransparentWhite
    surfaceDefaultSolidDeep = other.surfaceDefaultSolidDeep
    surfaceDefaultSolidDeepActive = other.surfaceDefaultSolidDeepActive
    surfaceDefaultSolidDeepHover = other.surfaceDefaultSolidDeepHover
    surfaceDefaultTransparentCardMinor = other.surfaceDefaultTransparentCardMinor
    surfaceDefaultTransparentCardMinorActive = other.surfaceDefaultTransparentCardMinorActive
    surfaceDefaultTransparentCardMinorHover = other.surfaceDefaultTransparentCardMinorHover
    surfaceInverseSolidDeep = other.surfaceInverseSolidDeep
    surfaceInverseSolidDeepActive = other.surfaceInverseSolidDeepActive
    surfaceInverseSolidDeepHover = other.surfaceInverseSolidDeepHover
    surfaceInverseTransparentCardMinor = other.surfaceInverseTransparentCardMinor
    surfaceInverseTransparentCardMinorActive = other.surfaceInverseTransparentCardMinorActive
    surfaceInverseTransparentCardMinorHover = other.surfaceInverseTransparentCardMinorHover
    surfaceOnDarkSolidDeep = other.surfaceOnDarkSolidDeep
    surfaceOnDarkSolidDeepActive = other.surfaceOnDarkSolidDeepActive
    surfaceOnDarkSolidDeepHover = other.surfaceOnDarkSolidDeepHover
    surfaceOnDarkTransparentCardMinor = other.surfaceOnDarkTransparentCardMinor
    surfaceOnDarkTransparentCardMinorActive = other.surfaceOnDarkTransparentCardMinorActive
    surfaceOnDarkTransparentCardMinorHover = other.surfaceOnDarkTransparentCardMinorHover
    surfaceOnLightSolidDeep = other.surfaceOnLightSolidDeep
    surfaceOnLightSolidDeepActive = other.surfaceOnLightSolidDeepActive
    surfaceOnLightSolidDeepHover = other.surfaceOnLightSolidDeepHover
    surfaceOnLightTransparentCardMinor = other.surfaceOnLightTransparentCardMinor
    surfaceOnLightTransparentCardMinorActive = other.surfaceOnLightTransparentCardMinorActive
    surfaceOnLightTransparentCardMinorHover = other.surfaceOnLightTransparentCardMinorHover
    outlineDefaultDeepActive = other.outlineDefaultDeepActive
    outlineDefaultDeepHover = other.outlineDefaultDeepHover
    outlineOnLightTransparentWhiteActive = other.outlineOnLightTransparentWhiteActive
    outlineOnLightTransparentWhiteHover = other.outlineOnLightTransparentWhiteHover
    textDefaultPositiveActive = other.textDefaultPositiveActive
    textDefaultPositiveHover = other.textDefaultPositiveHover
    textDefaultPrimaryActive = other.textDefaultPrimaryActive
    textDefaultPrimaryBrightness = other.textDefaultPrimaryBrightness
    textDefaultNegative = other.textDefaultNegative
    textDefaultNegativeActive = other.textDefaultNegativeActive
    textDefaultNegativeHover = other.textDefaultNegativeHover
    textDefaultTertiaryActive = other.textDefaultTertiaryActive
    textDefaultTertiaryHover = other.textDefaultTertiaryHover
    textDefaultWarning = other.textDefaultWarning
    textDefaultWarningActive = other.textDefaultWarningActive
    textDefaultWarningHover = other.textDefaultWarningHover
    textDefaultAccentMinor = other.textDefaultAccentMinor
    textDefaultAccentMinorActive = other.textDefaultAccentMinorActive
    textDefaultAccentMinorHover = other.textDefaultAccentMinorHover
    textDefaultParagraphHover = other.textDefaultParagraphHover
    textDefaultPositive = other.textDefaultPositive
    textDefaultParagraph = other.textDefaultParagraph
    textDefaultParagraphActive = other.textDefaultParagraphActive
    textDefaultInfo = other.textDefaultInfo
    textDefaultInfoActive = other.textDefaultInfoActive
    textDefaultInfoHover = other.textDefaultInfoHover
    textDefaultSecondary = other.textDefaultSecondary
    textDefaultSecondaryActive = other.textDefaultSecondaryActive
    textDefaultSecondaryHover = other.textDefaultSecondaryHover
    textDefaultTertiary = other.textDefaultTertiary
    textDefaultAccent = other.textDefaultAccent
    textDefaultAccentActive = other.textDefaultAccentActive
    textOnDarkAccentMinorActive = other.textOnDarkAccentMinorActive
    textOnDarkInfoActive = other.textOnDarkInfoActive
    textOnDarkInfo = other.textOnDarkInfo
    textOnDarkInfoHover = other.textOnDarkInfoHover
    textOnDarkNegative = other.textOnDarkNegative
    textOnDarkSecondary = other.textOnDarkSecondary
    textOnDarkSecondaryActive = other.textOnDarkSecondaryActive
    textOnDarkTertiary = other.textOnDarkTertiary
    textOnDarkSecondaryHover = other.textOnDarkSecondaryHover
    textOnDarkPrimary = other.textOnDarkPrimary
    textOnDarkAccentHover = other.textOnDarkAccentHover
    textOnDarkPositive = other.textOnDarkPositive
    textOnDarkParagraphHover = other.textOnDarkParagraphHover
    textOnDarkNegativeActive = other.textOnDarkNegativeActive
    textOnDarkParagraph = other.textOnDarkParagraph
    textOnDarkNegativeHover = other.textOnDarkNegativeHover
    textOnDarkPrimaryActive = other.textOnDarkPrimaryActive
    textOnDarkPrimaryBrightness = other.textOnDarkPrimaryBrightness
    textOnDarkWarningHover = other.textOnDarkWarningHover
    textOnDarkTertiaryActive = other.textOnDarkTertiaryActive
    textOnDarkWarning = other.textOnDarkWarning
    textOnDarkWarningActive = other.textOnDarkWarningActive
    textOnDarkTertiaryHover = other.textOnDarkTertiaryHover
    textOnDarkPrimaryHover = other.textOnDarkPrimaryHover
    textOnDarkPositiveActive = other.textOnDarkPositiveActive
    textOnDarkAccentMinor = other.textOnDarkAccentMinor
    textOnDarkPositiveHover = other.textOnDarkPositiveHover
    textOnLightTertiaryActive = other.textOnLightTertiaryActive
    textOnLightWarning = other.textOnLightWarning
    textOnLightTertiaryHover = other.textOnLightTertiaryHover
    textOnLightWarningHover = other.textOnLightWarningHover
    textOnLightPositiveActive = other.textOnLightPositiveActive
    textOnLightPrimary = other.textOnLightPrimary
    textOnLightPositiveHover = other.textOnLightPositiveHover
    textOnLightAccentMinorActive = other.textOnLightAccentMinorActive
    textOnLightParagraph = other.textOnLightParagraph
    textOnLightAccentMinorHover = other.textOnLightAccentMinorHover
    textOnLightParagraphActive = other.textOnLightParagraphActive
    textOnLightPositive = other.textOnLightPositive
    textOnLightParagraphHover = other.textOnLightParagraphHover
    textOnLightSecondary = other.textOnLightSecondary
    textOnLightSecondaryActive = other.textOnLightSecondaryActive
    textOnLightTertiary = other.textOnLightTertiary
    textOnLightSecondaryHover = other.textOnLightSecondaryHover
    textOnLightPrimaryActive = other.textOnLightPrimaryActive
    textOnLightPrimaryHover = other.textOnLightPrimaryHover
    textOnLightPrimaryBrightness = other.textOnLightPrimaryBrightness
    textOnLightAccentActive = other.textOnLightAccentActive
    textOnLightAccentMinor = other.textOnLightAccentMinor
    textOnLightAccent = other.textOnLightAccent
    textOnLightAccentHover = other.textOnLightAccentHover
    textOnLightNegativeActive = other.textOnLightNegativeActive
    textOnLightNegativeHover = other.textOnLightNegativeHover
    textInverseSecondaryHover = other.textInverseSecondaryHover
    textInverseSecondary = other.textInverseSecondary
    textInverseSecondaryActive = other.textInverseSecondaryActive
    textInverseTertiaryActive = other.textInverseTertiaryActive
    textOnLightInfo = other.textOnLightInfo
    textInverseTertiaryHover = other.textInverseTertiaryHover
    textOnLightInfoActive = other.textOnLightInfoActive
    textOnLightInfoHover = other.textOnLightInfoHover
    textInversePrimaryActive = other.textInversePrimaryActive
    textInversePrimaryHover = other.textInversePrimaryHover
    textInversePrimaryBrightness = other.textInversePrimaryBrightness
    textInverseAccentMinorActive = other.textInverseAccentMinorActive
    textInverseParagraph = other.textInverseParagraph
    textInverseAccentMinorHover = other.textInverseAccentMinorHover
    textInverseParagraphActive = other.textInverseParagraphActive
    textInversePrimary = other.textInversePrimary
    textInverseParagraphHover = other.textInverseParagraphHover
    textInverseTertiary = other.textInverseTertiary
    textOnLightNegative = other.textOnLightNegative
    textInverseAccentActive = other.textInverseAccentActive
    textInverseAccentHover = other.textInverseAccentHover
    textInverseAccentMinor = other.textInverseAccentMinor
    textInverseNegative = other.textInverseNegative
    textInversePositiveActive = other.textInversePositiveActive
    textInversePositiveHover = other.textInversePositiveHover
    textInverseNegativeActive = other.textInverseNegativeActive
    textInverseNegativeHover = other.textInverseNegativeHover
    surfaceDefaultSolidSecondary = other.surfaceDefaultSolidSecondary
    surfaceDefaultSolidTertiary = other.surfaceDefaultSolidTertiary
    surfaceDefaultSolidSecondaryActive = other.surfaceDefaultSolidSecondaryActive
    surfaceDefaultSolidSecondaryHover = other.surfaceDefaultSolidSecondaryHover
    surfaceDefaultSolidTertiaryHover = other.surfaceDefaultSolidTertiaryHover
    textInverseInfoActive = other.textInverseInfoActive
    textInverseInfo = other.textInverseInfo
    textInverseInfoHover = other.textInverseInfoHover
    textInverseWarning = other.textInverseWarning
    textInverseWarningHover = other.textInverseWarningHover
    surfaceDefaultSolidPrimary = other.surfaceDefaultSolidPrimary
    textInverseWarningActive = other.textInverseWarningActive
    textInversePositive = other.textInversePositive
    surfaceDefaultSolidPrimaryHover = other.surfaceDefaultSolidPrimaryHover
    surfaceDefaultAccentHover = other.surfaceDefaultAccentHover
    surfaceDefaultAccentActive = other.surfaceDefaultAccentActive
    surfaceDefaultTransparentPrimaryActive = other.surfaceDefaultTransparentPrimaryActive
    surfaceDefaultTransparentSecondary = other.surfaceDefaultTransparentSecondary
    surfaceDefaultTransparentPrimaryHover = other.surfaceDefaultTransparentPrimaryHover
    surfaceDefaultTransparentDeep = other.surfaceDefaultTransparentDeep
    surfaceDefaultTransparentPrimary = other.surfaceDefaultTransparentPrimary
    surfaceDefaultTransparentDeepActive = other.surfaceDefaultTransparentDeepActive
    surfaceDefaultTransparentDeepHover = other.surfaceDefaultTransparentDeepHover
    surfaceDefaultSolidCardActive = other.surfaceDefaultSolidCardActive
    surfaceDefaultSolidCardHover = other.surfaceDefaultSolidCardHover
    surfaceDefaultSolidCardBrightness = other.surfaceDefaultSolidCardBrightness
    surfaceDefaultClearActive = other.surfaceDefaultClearActive
    surfaceDefaultClear = other.surfaceDefaultClear
    surfaceDefaultSolidCard = other.surfaceDefaultSolidCard
    surfaceDefaultClearHover = other.surfaceDefaultClearHover
    surfaceDefaultTransparentCardActive = other.surfaceDefaultTransparentCardActive
    surfaceDefaultTransparentCardHover = other.surfaceDefaultTransparentCardHover
    surfaceDefaultTransparentCardBrightness = other.surfaceDefaultTransparentCardBrightness
    surfaceDefaultSolidDefaultActive = other.surfaceDefaultSolidDefaultActive
    surfaceDefaultSolidDefaultHover = other.surfaceDefaultSolidDefaultHover
    surfaceDefaultTransparentAccentActive = other.surfaceDefaultTransparentAccentActive
    surfaceDefaultTransparentCard = other.surfaceDefaultTransparentCard
    surfaceDefaultTransparentSecondaryActive = other.surfaceDefaultTransparentSecondaryActive
    surfaceDefaultTransparentTertiary = other.surfaceDefaultTransparentTertiary
    surfaceDefaultTransparentAccentHover = other.surfaceDefaultTransparentAccentHover
    surfaceDefaultTransparentAccent = other.surfaceDefaultTransparentAccent
    surfaceDefaultTransparentSecondaryHover = other.surfaceDefaultTransparentSecondaryHover
    surfaceDefaultTransparentTertiaryActive = other.surfaceDefaultTransparentTertiaryActive
    surfaceDefaultTransparentTertiaryHover = other.surfaceDefaultTransparentTertiaryHover
    surfaceDefaultPositiveActive = other.surfaceDefaultPositiveActive
    surfaceDefaultPositiveHover = other.surfaceDefaultPositiveHover
    surfaceDefaultNegativeActive = other.surfaceDefaultNegativeActive
    surfaceDefaultPositive = other.surfaceDefaultPositive
    surfaceDefaultNegativeHover = other.surfaceDefaultNegativeHover
    surfaceDefaultInfoHover = other.surfaceDefaultInfoHover
    surfaceDefaultWarning = other.surfaceDefaultWarning
    surfaceDefaultWarningHover = other.surfaceDefaultWarningHover
    surfaceDefaultWarningActive = other.surfaceDefaultWarningActive
    surfaceDefaultInfoActive = other.surfaceDefaultInfoActive
    surfaceDefaultNegative = other.surfaceDefaultNegative
    surfaceDefaultTransparentNegativeActive = other.surfaceDefaultTransparentNegativeActive
    surfaceDefaultTransparentNegativeHover = other.surfaceDefaultTransparentNegativeHover
    surfaceDefaultTransparentNegative = other.surfaceDefaultTransparentNegative
    surfaceOnDarkSolidSecondary = other.surfaceOnDarkSolidSecondary
    surfaceOnDarkSolidTertiary = other.surfaceOnDarkSolidTertiary
    surfaceOnDarkSolidSecondaryActive = other.surfaceOnDarkSolidSecondaryActive
    surfaceOnDarkSolidSecondaryHover = other.surfaceOnDarkSolidSecondaryHover
    surfaceOnDarkSolidTertiaryHover = other.surfaceOnDarkSolidTertiaryHover
    surfaceOnDarkSolidPrimaryActive = other.surfaceOnDarkSolidPrimaryActive
    surfaceOnDarkSolidPrimaryBrightness = other.surfaceOnDarkSolidPrimaryBrightness
    surfaceDefaultReadOnlyActive = other.surfaceDefaultReadOnlyActive
    surfaceDefaultReadOnly = other.surfaceDefaultReadOnly
    surfaceDefaultReadOnlyHover = other.surfaceDefaultReadOnlyHover
    surfaceOnDarkSolidPrimaryHover = other.surfaceOnDarkSolidPrimaryHover
    surfaceOnDarkSolidPrimary = other.surfaceOnDarkSolidPrimary
    surfaceOnDarkAccent = other.surfaceOnDarkAccent
    surfaceOnDarkAccentHover = other.surfaceOnDarkAccentHover
    surfaceOnDarkAccentActive = other.surfaceOnDarkAccentActive
    surfaceOnDarkTransparentPrimaryActive = other.surfaceOnDarkTransparentPrimaryActive
    surfaceOnDarkTransparentSecondary = other.surfaceOnDarkTransparentSecondary
    surfaceOnDarkTransparentPrimaryHover = other.surfaceOnDarkTransparentPrimaryHover
    surfaceOnDarkTransparentDeep = other.surfaceOnDarkTransparentDeep
    surfaceOnDarkTransparentPrimary = other.surfaceOnDarkTransparentPrimary
    surfaceOnDarkTransparentDeepActive = other.surfaceOnDarkTransparentDeepActive
    surfaceOnDarkTransparentDeepHover = other.surfaceOnDarkTransparentDeepHover
    surfaceOnDarkSolidCardActive = other.surfaceOnDarkSolidCardActive
    surfaceOnDarkSolidCardHover = other.surfaceOnDarkSolidCardHover
    surfaceOnDarkSolidCardBrightness = other.surfaceOnDarkSolidCardBrightness
    surfaceOnDarkClear = other.surfaceOnDarkClear
    surfaceOnDarkClearHover = other.surfaceOnDarkClearHover
    surfaceOnDarkClearActive = other.surfaceOnDarkClearActive
    surfaceOnDarkSolidCard = other.surfaceOnDarkSolidCard
    surfaceOnDarkSolidDefaultHover = other.surfaceOnDarkSolidDefaultHover
    surfaceOnDarkSolidDefaultActive = other.surfaceOnDarkSolidDefaultActive
    surfaceOnDarkTransparentCard = other.surfaceOnDarkTransparentCard
    surfaceOnDarkTransparentCardHover = other.surfaceOnDarkTransparentCardHover
    surfaceOnDarkTransparentCardBrightness = other.surfaceOnDarkTransparentCardBrightness
    surfaceOnDarkTransparentSecondaryActive = other.surfaceOnDarkTransparentSecondaryActive
    surfaceOnDarkTransparentTertiary = other.surfaceOnDarkTransparentTertiary
    surfaceOnDarkTransparentCardActive = other.surfaceOnDarkTransparentCardActive
    surfaceOnDarkTransparentSecondaryHover = other.surfaceOnDarkTransparentSecondaryHover
    surfaceOnDarkTransparentTertiaryActive = other.surfaceOnDarkTransparentTertiaryActive
    surfaceOnDarkTransparentTertiaryHover = other.surfaceOnDarkTransparentTertiaryHover
    surfaceOnDarkPositiveActive = other.surfaceOnDarkPositiveActive
    surfaceOnDarkPositiveHover = other.surfaceOnDarkPositiveHover
    surfaceOnDarkNegativeActive = other.surfaceOnDarkNegativeActive
    surfaceOnDarkPositive = other.surfaceOnDarkPositive
    surfaceOnDarkNegativeHover = other.surfaceOnDarkNegativeHover
    surfaceOnDarkInfoHover = other.surfaceOnDarkInfoHover
    surfaceOnDarkInfo = other.surfaceOnDarkInfo
    surfaceOnDarkInfoActive = other.surfaceOnDarkInfoActive
    surfaceOnDarkWarningActive = other.surfaceOnDarkWarningActive
    surfaceOnDarkTransparentAccent = other.surfaceOnDarkTransparentAccent
    surfaceOnDarkTransparentAccentHover = other.surfaceOnDarkTransparentAccentHover
    surfaceOnDarkTransparentAccentActive = other.surfaceOnDarkTransparentAccentActive
    surfaceOnDarkWarning = other.surfaceOnDarkWarning
    surfaceOnDarkWarningHover = other.surfaceOnDarkWarningHover
    surfaceOnDarkNegative = other.surfaceOnDarkNegative
    surfaceOnDarkTransparentNegativeActive = other.surfaceOnDarkTransparentNegativeActive
    surfaceOnDarkTransparentNegativeHover = other.surfaceOnDarkTransparentNegativeHover
    surfaceOnDarkReadOnlyActive = other.surfaceOnDarkReadOnlyActive
    surfaceOnDarkTransparentNegative = other.surfaceOnDarkTransparentNegative
    surfaceOnLightSolidSecondary = other.surfaceOnLightSolidSecondary
    surfaceOnLightSolidTertiary = other.surfaceOnLightSolidTertiary
    surfaceOnLightSolidSecondaryActive = other.surfaceOnLightSolidSecondaryActive
    surfaceOnLightSolidSecondaryHover = other.surfaceOnLightSolidSecondaryHover
    surfaceOnLightSolidTertiaryHover = other.surfaceOnLightSolidTertiaryHover
    surfaceOnDarkReadOnlyHover = other.surfaceOnDarkReadOnlyHover
    surfaceOnDarkReadOnly = other.surfaceOnDarkReadOnly
    surfaceOnLightSolidPrimaryActive = other.surfaceOnLightSolidPrimaryActive
    surfaceOnLightSolidPrimaryHover = other.surfaceOnLightSolidPrimaryHover
    surfaceOnLightSolidPrimaryBrightness = other.surfaceOnLightSolidPrimaryBrightness
    surfaceOnLightSolidPrimary = other.surfaceOnLightSolidPrimary
    surfaceOnLightAccent = other.surfaceOnLightAccent
    surfaceOnLightAccentHover = other.surfaceOnLightAccentHover
    surfaceOnLightAccentActive = other.surfaceOnLightAccentActive
    surfaceOnLightTransparentPrimaryActive = other.surfaceOnLightTransparentPrimaryActive
    surfaceOnLightTransparentSecondary = other.surfaceOnLightTransparentSecondary
    surfaceOnLightTransparentPrimaryHover = other.surfaceOnLightTransparentPrimaryHover
    surfaceOnLightTransparentDeep = other.surfaceOnLightTransparentDeep
    surfaceOnLightTransparentPrimary = other.surfaceOnLightTransparentPrimary
    surfaceOnLightTransparentDeepActive = other.surfaceOnLightTransparentDeepActive
    surfaceOnLightSolidCardActive = other.surfaceOnLightSolidCardActive
    surfaceOnLightSolidCardHover = other.surfaceOnLightSolidCardHover
    surfaceOnLightSolidCardBrightness = other.surfaceOnLightSolidCardBrightness
    surfaceOnLightClearActive = other.surfaceOnLightClearActive
    surfaceOnLightSolidCard = other.surfaceOnLightSolidCard
    surfaceOnLightClearHover = other.surfaceOnLightClearHover
    surfaceOnLightSolidDefaultActive = other.surfaceOnLightSolidDefaultActive
    surfaceOnLightSolidDefault = other.surfaceOnLightSolidDefault
    surfaceOnLightSolidDefaultHover = other.surfaceOnLightSolidDefaultHover
    surfaceOnLightTransparentCardActive = other.surfaceOnLightTransparentCardActive
    surfaceOnLightTransparentCardHover = other.surfaceOnLightTransparentCardHover
    surfaceOnLightTransparentSecondaryActive = other.surfaceOnLightTransparentSecondaryActive
    surfaceOnLightTransparentTertiary = other.surfaceOnLightTransparentTertiary
    surfaceOnLightTransparentCardBrightness = other.surfaceOnLightTransparentCardBrightness
    surfaceOnLightTransparentCard = other.surfaceOnLightTransparentCard
    surfaceOnLightTransparentTertiaryActive = other.surfaceOnLightTransparentTertiaryActive
    surfaceOnLightTransparentTertiaryHover = other.surfaceOnLightTransparentTertiaryHover
    surfaceOnLightInfo = other.surfaceOnLightInfo
    surfaceOnLightPositiveActive = other.surfaceOnLightPositiveActive
    surfaceOnLightPositiveHover = other.surfaceOnLightPositiveHover
    surfaceOnLightNegativeActive = other.surfaceOnLightNegativeActive
    surfaceOnLightPositive = other.surfaceOnLightPositive
    surfaceOnLightNegativeHover = other.surfaceOnLightNegativeHover
    surfaceOnLightInfoHover = other.surfaceOnLightInfoHover
    surfaceOnLightInfoActive = other.surfaceOnLightInfoActive
    surfaceOnLightTransparentAccentHover = other.surfaceOnLightTransparentAccentHover
    surfaceOnLightTransparentAccent = other.surfaceOnLightTransparentAccent
    surfaceOnLightTransparentAccentActive = other.surfaceOnLightTransparentAccentActive
    surfaceOnLightWarning = other.surfaceOnLightWarning
    surfaceOnLightWarningActive = other.surfaceOnLightWarningActive
    surfaceOnLightNegative = other.surfaceOnLightNegative
    surfaceOnLightWarningHover = other.surfaceOnLightWarningHover
    surfaceOnLightTransparentNegativeActive = other.surfaceOnLightTransparentNegativeActive
    surfaceOnLightTransparentNegativeHover = other.surfaceOnLightTransparentNegativeHover
    surfaceOnLightReadOnlyActive = other.surfaceOnLightReadOnlyActive
    surfaceOnLightTransparentNegative = other.surfaceOnLightTransparentNegative
    surfaceInverseSolidSecondary = other.surfaceInverseSolidSecondary
    surfaceInverseSolidSecondaryHover = other.surfaceInverseSolidSecondaryHover
    surfaceOnLightReadOnlyHover = other.surfaceOnLightReadOnlyHover
    surfaceOnLightReadOnly = other.surfaceOnLightReadOnly
    surfaceInverseSolidPrimaryBrightness = other.surfaceInverseSolidPrimaryBrightness
    surfaceInverseSolidPrimaryActive = other.surfaceInverseSolidPrimaryActive
    surfaceInverseSolidPrimaryHover = other.surfaceInverseSolidPrimaryHover
    surfaceInverseTransparentTertiaryHover = other.surfaceInverseTransparentTertiaryHover
    surfaceInverseClearActive = other.surfaceInverseClearActive
    surfaceInverseClear = other.surfaceInverseClear
    surfaceInverseTransparentPrimaryActive = other.surfaceInverseTransparentPrimaryActive
    surfaceInverseTransparentSecondary = other.surfaceInverseTransparentSecondary
    surfaceInverseTransparentPrimaryHover = other.surfaceInverseTransparentPrimaryHover
    surfaceInverseTransparentDeep = other.surfaceInverseTransparentDeep
    surfaceInverseTransparentPrimary = other.surfaceInverseTransparentPrimary
    surfaceInverseTransparentDeepActive = other.surfaceInverseTransparentDeepActive
    surfaceInverseTransparentDeepHover = other.surfaceInverseTransparentDeepHover
    surfaceInverseSolidCardActive = other.surfaceInverseSolidCardActive
    surfaceInverseSolidCardHover = other.surfaceInverseSolidCardHover
    surfaceInverseSolidCardBrightness = other.surfaceInverseSolidCardBrightness
    surfaceInverseSolidCard = other.surfaceInverseSolidCard
    surfaceInverseTransparentCardBrightness = other.surfaceInverseTransparentCardBrightness
    surfaceInverseTransparentCardHover = other.surfaceInverseTransparentCardHover
    surfaceInverseSolidDefaultActive = other.surfaceInverseSolidDefaultActive
    surfaceInverseSolidTertiaryActive = other.surfaceInverseSolidTertiaryActive
    surfaceInverseTransparentCardActive = other.surfaceInverseTransparentCardActive
    surfaceInverseTransparentCard = other.surfaceInverseTransparentCard
    surfaceInverseSolidDefaultHover = other.surfaceInverseSolidDefaultHover
    surfaceInverseSolidTertiaryHover = other.surfaceInverseSolidTertiaryHover
    surfaceInverseTransparentSecondaryActive = other.surfaceInverseTransparentSecondaryActive
    surfaceInverseTransparentTertiary = other.surfaceInverseTransparentTertiary
    surfaceInverseTransparentSecondaryHover = other.surfaceInverseTransparentSecondaryHover
    surfaceInverseTransparentTertiaryActive = other.surfaceInverseTransparentTertiaryActive
    surfaceInverseClearHover = other.surfaceInverseClearHover
    surfaceInverseWarningActive = other.surfaceInverseWarningActive
    surfaceInverseWarningHover = other.surfaceInverseWarningHover
    surfaceInverseAccentHover = other.surfaceInverseAccentHover
    surfaceInversePositiveActive = other.surfaceInversePositiveActive
    surfaceInversePositiveHover = other.surfaceInversePositiveHover
    surfaceInverseNegativeActive = other.surfaceInverseNegativeActive
    surfaceInversePositive = other.surfaceInversePositive
    surfaceInverseNegativeHover = other.surfaceInverseNegativeHover
    surfaceInverseNegative = other.surfaceInverseNegative
    surfaceInverseInfoHover = other.surfaceInverseInfoHover
    surfaceInverseWarning = other.surfaceInverseWarning
    surfaceInverseTransparentAccent = other.surfaceInverseTransparentAccent
    surfaceInverseInfoActive = other.surfaceInverseInfoActive
    surfaceInverseTransparentAccentActive = other.surfaceInverseTransparentAccentActive
    surfaceInverseInfo = other.surfaceInverseInfo
    surfaceInverseTransparentAccentHover = other.surfaceInverseTransparentAccentHover
    surfaceInverseTransparentNegativeActive = other.surfaceInverseTransparentNegativeActive
    surfaceInverseTransparentNegativeHover = other.surfaceInverseTransparentNegativeHover
    surfaceInverseTransparentNegative = other.surfaceInverseTransparentNegative
    backgroundDefaultSecondary = other.backgroundDefaultSecondary
    backgroundDefaultTertiary = other.backgroundDefaultTertiary
    backgroundLightPrimary = other.backgroundLightPrimary
    surfaceInverseReadOnlyActive = other.surfaceInverseReadOnlyActive
    backgroundDarkSecondary = other.backgroundDarkSecondary
    surfaceInverseReadOnlyHover = other.surfaceInverseReadOnlyHover
    surfaceInverseReadOnly = other.surfaceInverseReadOnly
    backgroundDarkTertiary = other.backgroundDarkTertiary
    backgroundDefaultPrimary = other.backgroundDefaultPrimary
    overlayOnDarkSoft = other.overlayOnDarkSoft
    overlayOnDarkHard = other.overlayOnDarkHard
    outlineDefaultTransparentPrimaryActive = other.outlineDefaultTransparentPrimaryActive
    outlineDefaultTransparentPrimary = other.outlineDefaultTransparentPrimary
    outlineDefaultTransparentPrimaryHover = other.outlineDefaultTransparentPrimaryHover
    overlayDefaultHard = other.overlayDefaultHard
    overlayDefaultSoft = other.overlayDefaultSoft
    overlayOnLightHard = other.overlayOnLightHard
    overlayInverseSoft = other.overlayInverseSoft
    overlayOnLightSoft = other.overlayOnLightSoft
    overlayInverseHard = other.overlayInverseHard
    outlineDefaultClear = other.outlineDefaultClear
    backgroundInverseTertiary = other.backgroundInverseTertiary
    backgroundInverseSecondary = other.backgroundInverseSecondary
    backgroundLightTertiary = other.backgroundLightTertiary
    outlineDefaultPositive = other.outlineDefaultPositive
    outlineDefaultNegative = other.outlineDefaultNegative
    outlineDefaultAccentHover = other.outlineDefaultAccentHover
    outlineDefaultAccentActive = other.outlineDefaultAccentActive
    outlineDefaultPositiveActive = other.outlineDefaultPositiveActive
    outlineDefaultPositiveHover = other.outlineDefaultPositiveHover
    outlineDefaultNegativeActive = other.outlineDefaultNegativeActive
    outlineDefaultNegativeHover = other.outlineDefaultNegativeHover
    outlineDefaultClearHover = other.outlineDefaultClearHover
    outlineDefaultInfoHover = other.outlineDefaultInfoHover
    outlineDefaultWarningHover = other.outlineDefaultWarningHover
    outlineDefaultClearActive = other.outlineDefaultClearActive
    outlineDefaultWarning = other.outlineDefaultWarning
    outlineDefaultWarningActive = other.outlineDefaultWarningActive
    outlineDefaultInfo = other.outlineDefaultInfo
    outlineDefaultInfoActive = other.outlineDefaultInfoActive
    outlineOnDarkTransparentPrimary = other.outlineOnDarkTransparentPrimary
    outlineOnDarkTransparentPrimaryActive = other.outlineOnDarkTransparentPrimaryActive
    outlineOnDarkTransparentPrimaryHover = other.outlineOnDarkTransparentPrimaryHover
    outlineOnDarkWarning = other.outlineOnDarkWarning
    outlineOnDarkAccent = other.outlineOnDarkAccent
    outlineOnDarkPositiveActive = other.outlineOnDarkPositiveActive
    outlineOnDarkPositiveHover = other.outlineOnDarkPositiveHover
    outlineOnDarkNegativeActive = other.outlineOnDarkNegativeActive
    outlineOnDarkPositive = other.outlineOnDarkPositive
    outlineOnDarkNegativeHover = other.outlineOnDarkNegativeHover
    outlineOnDarkAccentHover = other.outlineOnDarkAccentHover
    outlineOnDarkClear = other.outlineOnDarkClear
    outlineOnDarkInfoHover = other.outlineOnDarkInfoHover
    outlineOnDarkInfoActive = other.outlineOnDarkInfoActive
    outlineOnDarkInfo = other.outlineOnDarkInfo
    outlineOnDarkClearHover = other.outlineOnDarkClearHover
    outlineOnDarkClearActive = other.outlineOnDarkClearActive
    outlineOnDarkWarningActive = other.outlineOnDarkWarningActive
    outlineOnDarkNegative = other.outlineOnDarkNegative
    outlineOnDarkWarningHover = other.outlineOnDarkWarningHover
    outlineOnLightPositiveHover = other.outlineOnLightPositiveHover
    outlineOnLightClear = other.outlineOnLightClear
    outlineOnLightClearHover = other.outlineOnLightClearHover
    outlineOnLightTransparentPrimary = other.outlineOnLightTransparentPrimary
    outlineOnLightTransparentPrimaryActive = other.outlineOnLightTransparentPrimaryActive
    outlineOnLightTransparentPrimaryHover = other.outlineOnLightTransparentPrimaryHover
    outlineOnLightAccentHover = other.outlineOnLightAccentHover
    outlineOnLightPositive = other.outlineOnLightPositive
    outlineOnLightAccentActive = other.outlineOnLightAccentActive
    outlineOnLightClearActive = other.outlineOnLightClearActive
    outlineOnLightNegativeActive = other.outlineOnLightNegativeActive
    outlineOnLightNegativeHover = other.outlineOnLightNegativeHover
    outlineOnLightWarning = other.outlineOnLightWarning
    outlineOnLightWarningHover = other.outlineOnLightWarningHover
    outlineOnLightNegative = other.outlineOnLightNegative
    outlineOnLightInfoHover = other.outlineOnLightInfoHover
    outlineOnLightInfo = other.outlineOnLightInfo
    outlineOnLightInfoActive = other.outlineOnLightInfoActive
    outlineInverseAccentActive = other.outlineInverseAccentActive
    outlineInverseClear = other.outlineInverseClear
    outlineInverseClearActive = other.outlineInverseClearActive
    outlineInverseClearHover = other.outlineInverseClearHover
    outlineInverseTransparentPrimaryHover = other.outlineInverseTransparentPrimaryHover
    outlineInverseTransparentPrimary = other.outlineInverseTransparentPrimary
    outlineInverseTransparentPrimaryActive = other.outlineInverseTransparentPrimaryActive
    outlineInversePositive = other.outlineInversePositive
    outlineInverseNegative = other.outlineInverseNegative
    outlineInverseInfoHover = other.outlineInverseInfoHover
    outlineInverseInfoActive = other.outlineInverseInfoActive
    outlineInversePositiveActive = other.outlineInversePositiveActive
    outlineInversePositiveHover = other.outlineInversePositiveHover
    outlineInverseNegativeActive = other.outlineInverseNegativeActive
    outlineInverseNegativeHover = other.outlineInverseNegativeHover
    outlineInverseWarningActive = other.outlineInverseWarningActive
    outlineInverseWarningHover = other.outlineInverseWarningHover
    outlineInverseWarning = other.outlineInverseWarning
    outlineInverseInfo = other.outlineInverseInfo
    surfaceInverseAccentMinorHover = other.surfaceInverseAccentMinorHover
    surfaceOnDarkSolidDefault = other.surfaceOnDarkSolidDefault
    surfaceOnLightAccentMinorActive = other.surfaceOnLightAccentMinorActive
    textDefaultPrimaryHover = other.textDefaultPrimaryHover
    backgroundDarkPrimary = other.backgroundDarkPrimary
    backgroundInverseHardline = other.backgroundInverseHardline
    backgroundInversePrimary = other.backgroundInversePrimary
    backgroundLightHardline = other.backgroundLightHardline
    backgroundLightSecondary = other.backgroundLightSecondary
    outlineDefaultAccent = other.outlineDefaultAccent
    outlineDefaultDeep = other.outlineDefaultDeep
    outlineDefaultDefault = other.outlineDefaultDefault
    outlineDefaultDefaultActive = other.outlineDefaultDefaultActive
    outlineDefaultDefaultHover = other.outlineDefaultDefaultHover
    outlineDefaultTransparentWhite = other.outlineDefaultTransparentWhite
    outlineInverseAccent = other.outlineInverseAccent
    outlineInverseAccentHover = other.outlineInverseAccentHover
    outlineInverseDefault = other.outlineInverseDefault
    outlineInverseDefaultActive = other.outlineInverseDefaultActive
    outlineOnLightDefaultHover = other.outlineOnLightDefaultHover
    outlineOnLightPrimaryHover = other.outlineOnLightPrimaryHover
    personasDefaultBlueTextAccentHover = other.personasDefaultBlueTextAccentHover
    personasDefaultGreenTextAccentHover = other.personasDefaultGreenTextAccentHover
    personasDefaultIndigoTextAccentHover = other.personasDefaultIndigoTextAccentHover
    personasDefaultSeaBlueTextAccentHover = other.personasDefaultSeaBlueTextAccentHover
    personasOnDarkBlueTextAccentHover = other.personasOnDarkBlueTextAccentHover
    personasOnDarkOliveTextAccentHover = other.personasOnDarkOliveTextAccentHover
    personasOnDarkSeaBlueTextAccentHover = other.personasOnDarkSeaBlueTextAccentHover
    personasOnDarkVioletTextAccentHover = other.personasOnDarkVioletTextAccentHover
    personasOnLightIndigoTextAccentHover = other.personasOnLightIndigoTextAccentHover
    personasOnLightPinkTextAccentHover = other.personasOnLightPinkTextAccentHover
    personasOnLightSeaBlueTextAccentHover = other.personasOnLightSeaBlueTextAccentHover
    surfaceDefaultAccentMinorHover = other.surfaceDefaultAccentMinorHover
    surfaceInverseAccentSecondaryHover = other.surfaceInverseAccentSecondaryHover
    surfaceOnDarkAccentSecondaryHover = other.surfaceOnDarkAccentSecondaryHover
    surfaceOnLightTransparentDeepHover = other.surfaceOnLightTransparentDeepHover
    surfaceOnLightTransparentSecondaryHover = other.surfaceOnLightTransparentSecondaryHover
    textDefaultAccentHover = other.textDefaultAccentHover
    outlineInversePrimaryActive = other.outlineInversePrimaryActive
    outlineInverseTransparentWhiteActive = other.outlineInverseTransparentWhiteActive
    outlineOnDarkAccentActive = other.outlineOnDarkAccentActive
    outlineOnDarkDefaultActive = other.outlineOnDarkDefaultActive
    outlineOnDarkPrimaryActive = other.outlineOnDarkPrimaryActive
    personasDefaultOchreTextAccentActive = other.personasDefaultOchreTextAccentActive
    personasDefaultOliveTextAccentActive = other.personasDefaultOliveTextAccentActive
    personasDefaultVioletTextAccentActive = other.personasDefaultVioletTextAccentActive
    personasInverseSeaBlueTextAccentActive = other.personasInverseSeaBlueTextAccentActive
    personasInverseVioletTextAccentActive = other.personasInverseVioletTextAccentActive
    personasOnLightGreenTextAccentActive = other.personasOnLightGreenTextAccentActive
    personasOnLightOchreTextAccentActive = other.personasOnLightOchreTextAccentActive
    personasOnLightVioletTextAccentActive = other.personasOnLightVioletTextAccentActive
    surfaceDefaultAccentMinorActive = other.surfaceDefaultAccentMinorActive
    surfaceDefaultSolidPrimaryActive = other.surfaceDefaultSolidPrimaryActive
    surfaceDefaultSolidPrimaryBrightnessHover = other.surfaceDefaultSolidPrimaryBrightnessHover
    surfaceDefaultTransparentNaviActive = other.surfaceDefaultTransparentNaviActive
    surfaceInverseAccentActive = other.surfaceInverseAccentActive
    surfaceInverseAccentMinorActive = other.surfaceInverseAccentMinorActive
    surfaceInverseSolidSecondaryActive = other.surfaceInverseSolidSecondaryActive
    surfaceOnLightTransparentAccentMinorActive = other.surfaceOnLightTransparentAccentMinorActive
    textOnDarkAccentActive = other.textOnDarkAccentActive
    outlineOnLightAccent = other.outlineOnLightAccent
    outlineOnLightPrimary = other.outlineOnLightPrimary
    personasInverseSeaBlueTextAccent = other.personasInverseSeaBlueTextAccent
    surfaceDefaultAccent = other.surfaceDefaultAccent
    surfaceDefaultInfo = other.surfaceDefaultInfo
    surfaceDefaultSolidCardBrightnessActive = other.surfaceDefaultSolidCardBrightnessActive
    surfaceDefaultSolidDefault = other.surfaceDefaultSolidDefault
    surfaceDefaultTransparentNavi = other.surfaceDefaultTransparentNavi
    surfaceInverseAccent = other.surfaceInverseAccent
    surfaceInverseSolidPrimary = other.surfaceInverseSolidPrimary
    surfaceOnDarkAccentMinor = other.surfaceOnDarkAccentMinor
    surfaceOnLightClear = other.surfaceOnLightClear
    textDefaultPrimaryBrightnessActive = other.textDefaultPrimaryBrightnessActive
    textInverseAccent = other.textInverseAccent
    textOnDarkAccent = other.textOnDarkAccent
    backgroundDarkHardline = other.backgroundDarkHardline
    surfaceDefaultSolidCardBrightnessHover = other.surfaceDefaultSolidCardBrightnessHover
    surfaceDefaultSolidPrimaryBrightness = other.surfaceDefaultSolidPrimaryBrightness
    surfaceInverseSolidDefault = other.surfaceInverseSolidDefault
    surfaceOnDarkSolidCardBrightnessActive = other.surfaceOnDarkSolidCardBrightnessActive
    textOnDarkParagraphActive = other.textOnDarkParagraphActive
    overlayDefaultMedium = other.overlayDefaultMedium
    overlayInverseMedium = other.overlayInverseMedium
    overlayOnDarkMedium = other.overlayOnDarkMedium
    overlayOnLightMedium = other.overlayOnLightMedium
}

private fun MutableMap<String, Color>.add(
    attribute: String,
    defaultTokenValue: Color,
    overwriteMap: Map<String, Color>,
) {
    this[attribute] = overwriteMap[attribute] ?: defaultTokenValue
}

/**
 * Цвета [SddsSbComColors] для светлой темы
 */
@Suppress("LongMethod")
public fun lightSddsSbComColors(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsSbComColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("outlineOnDarkDefaultHover", LightColorTokens.OutlineOnDarkDefaultHover, overwrite)
    initial.add(
        "surfaceDefaultAccentSecondaryHover",
        LightColorTokens.SurfaceDefaultAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightnessHover",
        LightColorTokens.SurfaceDefaultTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightnessActive",
        LightColorTokens.SurfaceDefaultTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightnessHover",
        LightColorTokens.SurfaceOnLightSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightnessActive",
        LightColorTokens.SurfaceOnLightSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightnessHover",
        LightColorTokens.SurfaceOnDarkTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardBrightnessHover",
        LightColorTokens.SurfaceOnDarkSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightnessActive",
        LightColorTokens.SurfaceOnDarkTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccent",
        LightColorTokens.PersonasOnLightOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccent",
        LightColorTokens.PersonasOnDarkOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccent",
        LightColorTokens.PersonasInverseOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccent",
        LightColorTokens.PersonasInversePinkTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        LightColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightnessHover",
        LightColorTokens.SurfaceInverseSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add("textDefaultPrimary", LightColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "surfaceInverseTransparentNavi",
        LightColorTokens.SurfaceInverseTransparentNavi,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightnessHover",
        LightColorTokens.SurfaceInverseTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        LightColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccent",
        LightColorTokens.PersonasInverseIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightnessActive",
        LightColorTokens.SurfaceInverseSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOliveTextAccent",
        LightColorTokens.PersonasDefaultOliveTextAccent,
        overwrite,
    )
    initial.add(
        "textOnDarkAccentMinorHover",
        LightColorTokens.TextOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightnessActive",
        LightColorTokens.SurfaceOnLightTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightnessHover",
        LightColorTokens.SurfaceOnLightTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightnessActive",
        LightColorTokens.SurfaceOnLightSolidCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        LightColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightnessHover",
        LightColorTokens.SurfaceOnLightSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        LightColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add("outlineDefaultPrimary", LightColorTokens.OutlineDefaultPrimary, overwrite)
    initial.add(
        "surfaceInverseSolidTertiary",
        LightColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccent",
        LightColorTokens.PersonasInverseGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentSecondary",
        LightColorTokens.SurfaceDefaultAccentSecondary,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", LightColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkAccentSecondary",
        LightColorTokens.SurfaceOnDarkAccentSecondary,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccent",
        LightColorTokens.PersonasOnDarkIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        LightColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", LightColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "personasOnLightOchreTextAccent",
        LightColorTokens.PersonasOnLightOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccent",
        LightColorTokens.PersonasOnLightVioletTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightnessActive",
        LightColorTokens.SurfaceInverseTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningActive",
        LightColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        LightColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightnessActive",
        LightColorTokens.SurfaceInverseSolidCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorHover",
        LightColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", LightColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccentMinor",
        LightColorTokens.SurfaceOnDarkTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccent",
        LightColorTokens.PersonasOnLightSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccent",
        LightColorTokens.PersonasOnDarkBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccent",
        LightColorTokens.PersonasOnDarkVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultOchreTextAccent",
        LightColorTokens.PersonasDefaultOchreTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNavi",
        LightColorTokens.SurfaceOnLightTransparentNavi,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccentActive",
        LightColorTokens.PersonasInverseBlueTextAccentActive,
        overwrite,
    )
    initial.add("textOnLightWarningActive", LightColorTokens.TextOnLightWarningActive, overwrite)
    initial.add(
        "personasInverseOliveTextAccentHover",
        LightColorTokens.PersonasInverseOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNaviActive",
        LightColorTokens.SurfaceOnLightTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "personasOnLightBlueTextAccentActive",
        LightColorTokens.PersonasOnLightBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightPrimaryActive",
        LightColorTokens.OutlineOnLightPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightDefaultActive",
        LightColorTokens.OutlineOnLightDefaultActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccentActive",
        LightColorTokens.PersonasOnDarkOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccent",
        LightColorTokens.PersonasOnDarkSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccentActive",
        LightColorTokens.PersonasOnDarkVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccentHover",
        LightColorTokens.PersonasOnDarkGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentSecondaryActive",
        LightColorTokens.SurfaceOnDarkAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccentActive",
        LightColorTokens.PersonasInverseGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondary",
        LightColorTokens.SurfaceInverseAccentSecondary,
        overwrite,
    )
    initial.add(
        "textOnDarkPrimaryBrightnessHover",
        LightColorTokens.TextOnDarkPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkPinkTextAccentActive",
        LightColorTokens.PersonasOnDarkPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccentActive",
        LightColorTokens.PersonasInverseIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccentActive",
        LightColorTokens.PersonasDefaultSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinor",
        LightColorTokens.SurfaceOnLightTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccentActive",
        LightColorTokens.PersonasOnLightPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "textDefaultPrimaryBrightnessHover",
        LightColorTokens.TextDefaultPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinorActive",
        LightColorTokens.SurfaceInverseTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOchreTextAccentHover",
        LightColorTokens.PersonasDefaultOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccentActive",
        LightColorTokens.PersonasInversePinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNaviHover",
        LightColorTokens.SurfaceOnLightTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPrimaryActive",
        LightColorTokens.OutlineDefaultPrimaryActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccentActive",
        LightColorTokens.PersonasOnDarkSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccent",
        LightColorTokens.PersonasOnLightGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondaryActive",
        LightColorTokens.SurfaceInverseAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccentActive",
        LightColorTokens.PersonasDefaultIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccentActive",
        LightColorTokens.PersonasDefaultGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNaviHover",
        LightColorTokens.SurfaceOnDarkTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "personasInverseSeaBlueTextAccentHover",
        LightColorTokens.PersonasInverseSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondaryHover",
        LightColorTokens.SurfaceOnLightAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccentHover",
        LightColorTokens.PersonasInverseBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccentHover",
        LightColorTokens.PersonasInverseIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccent",
        LightColorTokens.PersonasOnDarkOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccentHover",
        LightColorTokens.PersonasOnLightGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccentActive",
        LightColorTokens.PersonasOnDarkOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOchreTextAccentHover",
        LightColorTokens.PersonasOnLightOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPrimaryHover",
        LightColorTokens.OutlineDefaultPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentMinorActive",
        LightColorTokens.SurfaceDefaultTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNaviHover",
        LightColorTokens.SurfaceDefaultTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "outlineInverseDefaultHover",
        LightColorTokens.OutlineInverseDefaultHover,
        overwrite,
    )
    initial.add(
        "personasInverseVioletTextAccentHover",
        LightColorTokens.PersonasInverseVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinorHover",
        LightColorTokens.SurfaceOnLightTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinorHover",
        LightColorTokens.SurfaceInverseTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNaviHover",
        LightColorTokens.SurfaceInverseTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "outlineInversePrimaryHover",
        LightColorTokens.OutlineInversePrimaryHover,
        overwrite,
    )
    initial.add(
        "personasDefaultOliveTextAccentHover",
        LightColorTokens.PersonasDefaultOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccent",
        LightColorTokens.PersonasDefaultVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccentHover",
        LightColorTokens.PersonasInverseOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccentActive",
        LightColorTokens.PersonasOnDarkGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkPinkTextAccentHover",
        LightColorTokens.PersonasOnDarkPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccentHover",
        LightColorTokens.PersonasInversePinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccentHover",
        LightColorTokens.PersonasOnDarkIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightBlueTextAccentHover",
        LightColorTokens.PersonasOnLightBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccentHover",
        LightColorTokens.PersonasOnLightOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccentHover",
        LightColorTokens.PersonasOnLightVioletTextAccentHover,
        overwrite,
    )
    initial.add("outlineOnDarkPrimaryHover", LightColorTokens.OutlineOnDarkPrimaryHover, overwrite)
    initial.add(
        "personasOnDarkPinkTextAccent",
        LightColorTokens.PersonasOnDarkPinkTextAccent,
        overwrite,
    )
    initial.add("outlineOnDarkPrimary", LightColorTokens.OutlineOnDarkPrimary, overwrite)
    initial.add(
        "personasOnLightBlueTextAccent",
        LightColorTokens.PersonasOnLightBlueTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentSecondaryActive",
        LightColorTokens.SurfaceDefaultAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasDefaultBlueTextAccent",
        LightColorTokens.PersonasDefaultBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultBlueTextAccentActive",
        LightColorTokens.PersonasDefaultBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccent",
        LightColorTokens.PersonasDefaultGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightnessActive",
        LightColorTokens.SurfaceDefaultSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnLightPrimaryBrightnessHover",
        LightColorTokens.TextOnLightPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "personasDefaultPinkTextAccent",
        LightColorTokens.PersonasDefaultPinkTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccent",
        LightColorTokens.PersonasDefaultSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentMinor",
        LightColorTokens.SurfaceDefaultTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccentHover",
        LightColorTokens.PersonasDefaultVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccent",
        LightColorTokens.PersonasInverseBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOliveTextAccentActive",
        LightColorTokens.PersonasInverseOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightnessHover",
        LightColorTokens.SurfaceInverseSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinor",
        LightColorTokens.SurfaceInverseTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightnessHover",
        LightColorTokens.SurfaceOnDarkSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNavi",
        LightColorTokens.SurfaceOnDarkTransparentNavi,
        overwrite,
    )
    initial.add(
        "textInversePrimaryBrightnessHover",
        LightColorTokens.TextInversePrimaryBrightnessHover,
        overwrite,
    )
    initial.add("backgroundDefaultHardline", LightColorTokens.BackgroundDefaultHardline, overwrite)
    initial.add("outlineInversePrimary", LightColorTokens.OutlineInversePrimary, overwrite)
    initial.add("outlineOnDarkDefault", LightColorTokens.OutlineOnDarkDefault, overwrite)
    initial.add(
        "personasInverseVioletTextAccent",
        LightColorTokens.PersonasInverseVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccent",
        LightColorTokens.PersonasDefaultIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "textInversePrimaryBrightnessActive",
        LightColorTokens.TextInversePrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnDarkPrimaryBrightnessActive",
        LightColorTokens.TextOnDarkPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnLightPrimaryBrightnessActive",
        LightColorTokens.TextOnLightPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccentActive",
        LightColorTokens.PersonasOnDarkIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccentHover",
        LightColorTokens.PersonasOnDarkOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultPinkTextAccentHover",
        LightColorTokens.PersonasDefaultPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNaviActive",
        LightColorTokens.SurfaceOnDarkTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondary",
        LightColorTokens.SurfaceOnLightAccentSecondary,
        overwrite,
    )
    initial.add("outlineOnLightDefault", LightColorTokens.OutlineOnLightDefault, overwrite)
    initial.add(
        "personasDefaultPinkTextAccentActive",
        LightColorTokens.PersonasDefaultPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccentActive",
        LightColorTokens.PersonasInverseOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseOliveTextAccent",
        LightColorTokens.PersonasInverseOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccentActive",
        LightColorTokens.PersonasOnDarkBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccent",
        LightColorTokens.PersonasOnDarkGreenTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccentActive",
        LightColorTokens.PersonasOnLightOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccent",
        LightColorTokens.PersonasOnLightPinkTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccentActive",
        LightColorTokens.PersonasOnLightSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentMinorHover",
        LightColorTokens.SurfaceDefaultTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNaviActive",
        LightColorTokens.SurfaceInverseTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentMinorHover",
        LightColorTokens.SurfaceOnDarkTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccent",
        LightColorTokens.PersonasOnLightIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightnessActive",
        LightColorTokens.SurfaceOnDarkSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentMinorActive",
        LightColorTokens.SurfaceOnDarkTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondaryActive",
        LightColorTokens.SurfaceOnLightAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccentHover",
        LightColorTokens.PersonasInverseGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccentActive",
        LightColorTokens.PersonasOnLightIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWhiteActive",
        LightColorTokens.OutlineDefaultTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWhiteHover",
        LightColorTokens.OutlineDefaultTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineInverseDeep", LightColorTokens.OutlineInverseDeep, overwrite)
    initial.add("outlineInverseDeepActive", LightColorTokens.OutlineInverseDeepActive, overwrite)
    initial.add("outlineInverseDeepHover", LightColorTokens.OutlineInverseDeepHover, overwrite)
    initial.add(
        "outlineInverseTransparentWhite",
        LightColorTokens.OutlineInverseTransparentWhite,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWhiteHover",
        LightColorTokens.OutlineInverseTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineOnDarkDeep", LightColorTokens.OutlineOnDarkDeep, overwrite)
    initial.add("outlineOnDarkDeepActive", LightColorTokens.OutlineOnDarkDeepActive, overwrite)
    initial.add("outlineOnDarkDeepHover", LightColorTokens.OutlineOnDarkDeepHover, overwrite)
    initial.add(
        "outlineOnDarkTransparentWhite",
        LightColorTokens.OutlineOnDarkTransparentWhite,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWhiteActive",
        LightColorTokens.OutlineOnDarkTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWhiteHover",
        LightColorTokens.OutlineOnDarkTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineOnLightDeep", LightColorTokens.OutlineOnLightDeep, overwrite)
    initial.add("outlineOnLightDeepActive", LightColorTokens.OutlineOnLightDeepActive, overwrite)
    initial.add("outlineOnLightDeepHover", LightColorTokens.OutlineOnLightDeepHover, overwrite)
    initial.add(
        "outlineOnLightTransparentWhite",
        LightColorTokens.OutlineOnLightTransparentWhite,
        overwrite,
    )
    initial.add("surfaceDefaultSolidDeep", LightColorTokens.SurfaceDefaultSolidDeep, overwrite)
    initial.add(
        "surfaceDefaultSolidDeepActive",
        LightColorTokens.SurfaceDefaultSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDeepHover",
        LightColorTokens.SurfaceDefaultSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinor",
        LightColorTokens.SurfaceDefaultTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinorActive",
        LightColorTokens.SurfaceDefaultTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinorHover",
        LightColorTokens.SurfaceDefaultTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceInverseSolidDeep", LightColorTokens.SurfaceInverseSolidDeep, overwrite)
    initial.add(
        "surfaceInverseSolidDeepActive",
        LightColorTokens.SurfaceInverseSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDeepHover",
        LightColorTokens.SurfaceInverseSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinor",
        LightColorTokens.SurfaceInverseTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinorActive",
        LightColorTokens.SurfaceInverseTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinorHover",
        LightColorTokens.SurfaceInverseTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDeep", LightColorTokens.SurfaceOnDarkSolidDeep, overwrite)
    initial.add(
        "surfaceOnDarkSolidDeepActive",
        LightColorTokens.SurfaceOnDarkSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDeepHover",
        LightColorTokens.SurfaceOnDarkSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinor",
        LightColorTokens.SurfaceOnDarkTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinorActive",
        LightColorTokens.SurfaceOnDarkTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinorHover",
        LightColorTokens.SurfaceOnDarkTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceOnLightSolidDeep", LightColorTokens.SurfaceOnLightSolidDeep, overwrite)
    initial.add(
        "surfaceOnLightSolidDeepActive",
        LightColorTokens.SurfaceOnLightSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDeepHover",
        LightColorTokens.SurfaceOnLightSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinor",
        LightColorTokens.SurfaceOnLightTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinorActive",
        LightColorTokens.SurfaceOnLightTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinorHover",
        LightColorTokens.SurfaceOnLightTransparentCardMinorHover,
        overwrite,
    )
    initial.add("outlineDefaultDeepActive", LightColorTokens.OutlineDefaultDeepActive, overwrite)
    initial.add("outlineDefaultDeepHover", LightColorTokens.OutlineDefaultDeepHover, overwrite)
    initial.add(
        "outlineOnLightTransparentWhiteActive",
        LightColorTokens.OutlineOnLightTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWhiteHover",
        LightColorTokens.OutlineOnLightTransparentWhiteHover,
        overwrite,
    )
    initial.add("textDefaultPositiveActive", LightColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositiveHover", LightColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPrimaryActive", LightColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        LightColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultNegative", LightColorTokens.TextDefaultNegative, overwrite)
    initial.add("textDefaultNegativeActive", LightColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegativeHover", LightColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultTertiaryActive", LightColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiaryHover", LightColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultWarning", LightColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultWarningActive", LightColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarningHover", LightColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultAccentMinor", LightColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add(
        "textDefaultAccentMinorActive",
        LightColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorHover",
        LightColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add("textDefaultParagraphHover", LightColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add("textDefaultPositive", LightColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultParagraph", LightColorTokens.TextDefaultParagraph, overwrite)
    initial.add(
        "textDefaultParagraphActive",
        LightColorTokens.TextDefaultParagraphActive,
        overwrite,
    )
    initial.add("textDefaultInfo", LightColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultInfoActive", LightColorTokens.TextDefaultInfoActive, overwrite)
    initial.add("textDefaultInfoHover", LightColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultSecondary", LightColorTokens.TextDefaultSecondary, overwrite)
    initial.add(
        "textDefaultSecondaryActive",
        LightColorTokens.TextDefaultSecondaryActive,
        overwrite,
    )
    initial.add("textDefaultSecondaryHover", LightColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add("textDefaultTertiary", LightColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultAccent", LightColorTokens.TextDefaultAccent, overwrite)
    initial.add("textDefaultAccentActive", LightColorTokens.TextDefaultAccentActive, overwrite)
    initial.add(
        "textOnDarkAccentMinorActive",
        LightColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoActive", LightColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add("textOnDarkInfo", LightColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkInfoHover", LightColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkNegative", LightColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkSecondary", LightColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkSecondaryActive", LightColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkTertiary", LightColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkSecondaryHover", LightColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkPrimary", LightColorTokens.TextOnDarkPrimary, overwrite)
    initial.add("textOnDarkAccentHover", LightColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkPositive", LightColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkParagraphHover", LightColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkNegativeActive", LightColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkParagraph", LightColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkNegativeHover", LightColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkPrimaryActive", LightColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        LightColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkWarningHover", LightColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkTertiaryActive", LightColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkWarning", LightColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkWarningActive", LightColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkTertiaryHover", LightColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkPrimaryHover", LightColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPositiveActive", LightColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkAccentMinor", LightColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkPositiveHover", LightColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnLightTertiaryActive", LightColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightWarning", LightColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightTertiaryHover", LightColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightWarningHover", LightColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightPositiveActive", LightColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPrimary", LightColorTokens.TextOnLightPrimary, overwrite)
    initial.add("textOnLightPositiveHover", LightColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add(
        "textOnLightAccentMinorActive",
        LightColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightParagraph", LightColorTokens.TextOnLightParagraph, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        LightColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textOnLightParagraphActive",
        LightColorTokens.TextOnLightParagraphActive,
        overwrite,
    )
    initial.add("textOnLightPositive", LightColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightParagraphHover", LightColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add("textOnLightSecondary", LightColorTokens.TextOnLightSecondary, overwrite)
    initial.add(
        "textOnLightSecondaryActive",
        LightColorTokens.TextOnLightSecondaryActive,
        overwrite,
    )
    initial.add("textOnLightTertiary", LightColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightSecondaryHover", LightColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", LightColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimaryHover", LightColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        LightColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightAccentActive", LightColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccentMinor", LightColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightAccent", LightColorTokens.TextOnLightAccent, overwrite)
    initial.add("textOnLightAccentHover", LightColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightNegativeActive", LightColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegativeHover", LightColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textInverseSecondaryHover", LightColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add("textInverseSecondary", LightColorTokens.TextInverseSecondary, overwrite)
    initial.add(
        "textInverseSecondaryActive",
        LightColorTokens.TextInverseSecondaryActive,
        overwrite,
    )
    initial.add("textInverseTertiaryActive", LightColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textOnLightInfo", LightColorTokens.TextOnLightInfo, overwrite)
    initial.add("textInverseTertiaryHover", LightColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textOnLightInfoActive", LightColorTokens.TextOnLightInfoActive, overwrite)
    initial.add("textOnLightInfoHover", LightColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textInversePrimaryActive", LightColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimaryHover", LightColorTokens.TextInversePrimaryHover, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        LightColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        LightColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInverseParagraph", LightColorTokens.TextInverseParagraph, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        LightColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add(
        "textInverseParagraphActive",
        LightColorTokens.TextInverseParagraphActive,
        overwrite,
    )
    initial.add("textInversePrimary", LightColorTokens.TextInversePrimary, overwrite)
    initial.add("textInverseParagraphHover", LightColorTokens.TextInverseParagraphHover, overwrite)
    initial.add("textInverseTertiary", LightColorTokens.TextInverseTertiary, overwrite)
    initial.add("textOnLightNegative", LightColorTokens.TextOnLightNegative, overwrite)
    initial.add("textInverseAccentActive", LightColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccentHover", LightColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentMinor", LightColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseNegative", LightColorTokens.TextInverseNegative, overwrite)
    initial.add("textInversePositiveActive", LightColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositiveHover", LightColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInverseNegativeActive", LightColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegativeHover", LightColorTokens.TextInverseNegativeHover, overwrite)
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
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        LightColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        LightColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        LightColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add("textInverseInfoActive", LightColorTokens.TextInverseInfoActive, overwrite)
    initial.add("textInverseInfo", LightColorTokens.TextInverseInfo, overwrite)
    initial.add("textInverseInfoHover", LightColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseWarning", LightColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseWarningHover", LightColorTokens.TextInverseWarningHover, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimary",
        LightColorTokens.SurfaceDefaultSolidPrimary,
        overwrite,
    )
    initial.add("textInverseWarningActive", LightColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInversePositive", LightColorTokens.TextInversePositive, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        LightColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add("surfaceDefaultAccentHover", LightColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add(
        "surfaceDefaultAccentActive",
        LightColorTokens.SurfaceDefaultAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        LightColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        LightColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        LightColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeep",
        LightColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        LightColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        LightColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        LightColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        LightColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        LightColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        LightColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultClearActive", LightColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", LightColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultSolidCard", LightColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add("surfaceDefaultClearHover", LightColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add(
        "surfaceDefaultTransparentCardActive",
        LightColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        LightColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        LightColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        LightColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        LightColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        LightColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        LightColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        LightColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        LightColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        LightColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        LightColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        LightColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        LightColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        LightColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        LightColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveHover",
        LightColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        LightColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultPositive", LightColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add(
        "surfaceDefaultNegativeHover",
        LightColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add("surfaceDefaultInfoHover", LightColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultWarning", LightColorTokens.SurfaceDefaultWarning, overwrite)
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
    initial.add("surfaceDefaultInfoActive", LightColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add("surfaceDefaultNegative", LightColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        LightColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        LightColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        LightColorTokens.SurfaceDefaultTransparentNegative,
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
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        LightColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        LightColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        LightColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        LightColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        LightColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultReadOnlyActive",
        LightColorTokens.SurfaceDefaultReadOnlyActive,
        overwrite,
    )
    initial.add("surfaceDefaultReadOnly", LightColorTokens.SurfaceDefaultReadOnly, overwrite)
    initial.add(
        "surfaceDefaultReadOnlyHover",
        LightColorTokens.SurfaceDefaultReadOnlyHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        LightColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", LightColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add("surfaceOnDarkAccent", LightColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add("surfaceOnDarkAccentHover", LightColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", LightColorTokens.SurfaceOnDarkAccentActive, overwrite)
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
        "surfaceOnDarkTransparentPrimaryHover",
        LightColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeep",
        LightColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        LightColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        LightColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        LightColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        LightColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardHover",
        LightColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        LightColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClear", LightColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkClearHover", LightColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", LightColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkSolidCard", LightColorTokens.SurfaceOnDarkSolidCard, overwrite)
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
        "surfaceOnDarkTransparentCard",
        LightColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        LightColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        LightColorTokens.SurfaceOnDarkTransparentCardBrightness,
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
        "surfaceOnDarkTransparentCardActive",
        LightColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        LightColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        LightColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        LightColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveActive",
        LightColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveHover",
        LightColorTokens.SurfaceOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkNegativeActive",
        LightColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositive", LightColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add(
        "surfaceOnDarkNegativeHover",
        LightColorTokens.SurfaceOnDarkNegativeHover,
        overwrite,
    )
    initial.add("surfaceOnDarkInfoHover", LightColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfo", LightColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add("surfaceOnDarkInfoActive", LightColorTokens.SurfaceOnDarkInfoActive, overwrite)
    initial.add(
        "surfaceOnDarkWarningActive",
        LightColorTokens.SurfaceOnDarkWarningActive,
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
    initial.add("surfaceOnDarkWarning", LightColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkWarningHover", LightColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add("surfaceOnDarkNegative", LightColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        LightColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        LightColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkReadOnlyActive",
        LightColorTokens.SurfaceOnDarkReadOnlyActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        LightColorTokens.SurfaceOnDarkTransparentNegative,
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
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        LightColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        LightColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        LightColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkReadOnlyHover",
        LightColorTokens.SurfaceOnDarkReadOnlyHover,
        overwrite,
    )
    initial.add("surfaceOnDarkReadOnly", LightColorTokens.SurfaceOnDarkReadOnly, overwrite)
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        LightColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        LightColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        LightColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimary",
        LightColorTokens.SurfaceOnLightSolidPrimary,
        overwrite,
    )
    initial.add("surfaceOnLightAccent", LightColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add("surfaceOnLightAccentHover", LightColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add(
        "surfaceOnLightAccentActive",
        LightColorTokens.SurfaceOnLightAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        LightColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        LightColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        LightColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeep",
        LightColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        LightColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        LightColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        LightColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        LightColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        LightColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightClearActive", LightColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightSolidCard", LightColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add("surfaceOnLightClearHover", LightColorTokens.SurfaceOnLightClearHover, overwrite)
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
        "surfaceOnLightSolidDefaultHover",
        LightColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        LightColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        LightColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        LightColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        LightColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        LightColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        LightColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        LightColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        LightColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", LightColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add(
        "surfaceOnLightPositiveActive",
        LightColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveHover",
        LightColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        LightColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightPositive", LightColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add(
        "surfaceOnLightNegativeHover",
        LightColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add("surfaceOnLightInfoHover", LightColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", LightColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        LightColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccent",
        LightColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        LightColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarning", LightColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add(
        "surfaceOnLightWarningActive",
        LightColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add("surfaceOnLightNegative", LightColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add(
        "surfaceOnLightWarningHover",
        LightColorTokens.SurfaceOnLightWarningHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        LightColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        LightColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightReadOnlyActive",
        LightColorTokens.SurfaceOnLightReadOnlyActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        LightColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        LightColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        LightColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightReadOnlyHover",
        LightColorTokens.SurfaceOnLightReadOnlyHover,
        overwrite,
    )
    initial.add("surfaceOnLightReadOnly", LightColorTokens.SurfaceOnLightReadOnly, overwrite)
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        LightColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        LightColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        LightColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        LightColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add("surfaceInverseClearActive", LightColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", LightColorTokens.SurfaceInverseClear, overwrite)
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        LightColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        LightColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        LightColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeep",
        LightColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        LightColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        LightColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        LightColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        LightColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        LightColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightness",
        LightColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", LightColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        LightColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        LightColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        LightColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        LightColorTokens.SurfaceInverseSolidTertiaryActive,
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
        "surfaceInverseSolidDefaultHover",
        LightColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        LightColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        LightColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        LightColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        LightColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        LightColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", LightColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add(
        "surfaceInverseWarningActive",
        LightColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseWarningHover",
        LightColorTokens.SurfaceInverseWarningHover,
        overwrite,
    )
    initial.add("surfaceInverseAccentHover", LightColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add(
        "surfaceInversePositiveActive",
        LightColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveHover",
        LightColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        LightColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInversePositive", LightColorTokens.SurfaceInversePositive, overwrite)
    initial.add(
        "surfaceInverseNegativeHover",
        LightColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add("surfaceInverseNegative", LightColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", LightColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseWarning", LightColorTokens.SurfaceInverseWarning, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        LightColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfoActive", LightColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInverseTransparentAccentActive",
        LightColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseInfo", LightColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInverseTransparentAccentHover",
        LightColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        LightColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        LightColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        LightColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add(
        "backgroundDefaultSecondary",
        LightColorTokens.BackgroundDefaultSecondary,
        overwrite,
    )
    initial.add("backgroundDefaultTertiary", LightColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundLightPrimary", LightColorTokens.BackgroundLightPrimary, overwrite)
    initial.add(
        "surfaceInverseReadOnlyActive",
        LightColorTokens.SurfaceInverseReadOnlyActive,
        overwrite,
    )
    initial.add("backgroundDarkSecondary", LightColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add(
        "surfaceInverseReadOnlyHover",
        LightColorTokens.SurfaceInverseReadOnlyHover,
        overwrite,
    )
    initial.add("surfaceInverseReadOnly", LightColorTokens.SurfaceInverseReadOnly, overwrite)
    initial.add("backgroundDarkTertiary", LightColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundDefaultPrimary", LightColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add("overlayOnDarkSoft", LightColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", LightColorTokens.OverlayOnDarkHard, overwrite)
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        LightColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        LightColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        LightColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add("overlayDefaultHard", LightColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultSoft", LightColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayOnLightHard", LightColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayInverseSoft", LightColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayOnLightSoft", LightColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayInverseHard", LightColorTokens.OverlayInverseHard, overwrite)
    initial.add("outlineDefaultClear", LightColorTokens.OutlineDefaultClear, overwrite)
    initial.add("backgroundInverseTertiary", LightColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add(
        "backgroundInverseSecondary",
        LightColorTokens.BackgroundInverseSecondary,
        overwrite,
    )
    initial.add("backgroundLightTertiary", LightColorTokens.BackgroundLightTertiary, overwrite)
    initial.add("outlineDefaultPositive", LightColorTokens.OutlineDefaultPositive, overwrite)
    initial.add("outlineDefaultNegative", LightColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultAccentHover", LightColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add(
        "outlineDefaultAccentActive",
        LightColorTokens.OutlineDefaultAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveActive",
        LightColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveHover",
        LightColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        LightColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        LightColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add("outlineDefaultClearHover", LightColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultInfoHover", LightColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add(
        "outlineDefaultWarningHover",
        LightColorTokens.OutlineDefaultWarningHover,
        overwrite,
    )
    initial.add("outlineDefaultClearActive", LightColorTokens.OutlineDefaultClearActive, overwrite)
    initial.add("outlineDefaultWarning", LightColorTokens.OutlineDefaultWarning, overwrite)
    initial.add(
        "outlineDefaultWarningActive",
        LightColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add("outlineDefaultInfo", LightColorTokens.OutlineDefaultInfo, overwrite)
    initial.add("outlineDefaultInfoActive", LightColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineOnDarkTransparentPrimary",
        LightColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        LightColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        LightColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add("outlineOnDarkWarning", LightColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkAccent", LightColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add(
        "outlineOnDarkPositiveActive",
        LightColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPositiveHover",
        LightColorTokens.OutlineOnDarkPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineOnDarkNegativeActive",
        LightColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", LightColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add(
        "outlineOnDarkNegativeHover",
        LightColorTokens.OutlineOnDarkNegativeHover,
        overwrite,
    )
    initial.add("outlineOnDarkAccentHover", LightColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkClear", LightColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkInfoHover", LightColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", LightColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add("outlineOnDarkInfo", LightColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkClearHover", LightColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", LightColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add(
        "outlineOnDarkWarningActive",
        LightColorTokens.OutlineOnDarkWarningActive,
        overwrite,
    )
    initial.add("outlineOnDarkNegative", LightColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkWarningHover", LightColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        LightColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add("outlineOnLightClear", LightColorTokens.OutlineOnLightClear, overwrite)
    initial.add("outlineOnLightClearHover", LightColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        LightColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        LightColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        LightColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add("outlineOnLightAccentHover", LightColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add("outlineOnLightPositive", LightColorTokens.OutlineOnLightPositive, overwrite)
    initial.add(
        "outlineOnLightAccentActive",
        LightColorTokens.OutlineOnLightAccentActive,
        overwrite,
    )
    initial.add("outlineOnLightClearActive", LightColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add(
        "outlineOnLightNegativeActive",
        LightColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeHover",
        LightColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add("outlineOnLightWarning", LightColorTokens.OutlineOnLightWarning, overwrite)
    initial.add(
        "outlineOnLightWarningHover",
        LightColorTokens.OutlineOnLightWarningHover,
        overwrite,
    )
    initial.add("outlineOnLightNegative", LightColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfoHover", LightColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfo", LightColorTokens.OutlineOnLightInfo, overwrite)
    initial.add("outlineOnLightInfoActive", LightColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add(
        "outlineInverseAccentActive",
        LightColorTokens.OutlineInverseAccentActive,
        overwrite,
    )
    initial.add("outlineInverseClear", LightColorTokens.OutlineInverseClear, overwrite)
    initial.add("outlineInverseClearActive", LightColorTokens.OutlineInverseClearActive, overwrite)
    initial.add("outlineInverseClearHover", LightColorTokens.OutlineInverseClearHover, overwrite)
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        LightColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimary",
        LightColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        LightColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add("outlineInversePositive", LightColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseNegative", LightColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfoHover", LightColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", LightColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveActive",
        LightColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveHover",
        LightColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        LightColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        LightColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningActive",
        LightColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningHover",
        LightColorTokens.OutlineInverseWarningHover,
        overwrite,
    )
    initial.add("outlineInverseWarning", LightColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseInfo", LightColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        LightColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", LightColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorActive",
        LightColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultPrimaryHover", LightColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("backgroundDarkPrimary", LightColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundInverseHardline", LightColorTokens.BackgroundInverseHardline, overwrite)
    initial.add("backgroundInversePrimary", LightColorTokens.BackgroundInversePrimary, overwrite)
    initial.add("backgroundLightHardline", LightColorTokens.BackgroundLightHardline, overwrite)
    initial.add("backgroundLightSecondary", LightColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("outlineDefaultAccent", LightColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultDeep", LightColorTokens.OutlineDefaultDeep, overwrite)
    initial.add("outlineDefaultDefault", LightColorTokens.OutlineDefaultDefault, overwrite)
    initial.add(
        "outlineDefaultDefaultActive",
        LightColorTokens.OutlineDefaultDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultDefaultHover",
        LightColorTokens.OutlineDefaultDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWhite",
        LightColorTokens.OutlineDefaultTransparentWhite,
        overwrite,
    )
    initial.add("outlineInverseAccent", LightColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentHover", LightColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add("outlineInverseDefault", LightColorTokens.OutlineInverseDefault, overwrite)
    initial.add(
        "outlineInverseDefaultActive",
        LightColorTokens.OutlineInverseDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightDefaultHover",
        LightColorTokens.OutlineOnLightDefaultHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPrimaryHover",
        LightColorTokens.OutlineOnLightPrimaryHover,
        overwrite,
    )
    initial.add(
        "personasDefaultBlueTextAccentHover",
        LightColorTokens.PersonasDefaultBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccentHover",
        LightColorTokens.PersonasDefaultGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccentHover",
        LightColorTokens.PersonasDefaultIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccentHover",
        LightColorTokens.PersonasDefaultSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccentHover",
        LightColorTokens.PersonasOnDarkBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccentHover",
        LightColorTokens.PersonasOnDarkOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccentHover",
        LightColorTokens.PersonasOnDarkSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccentHover",
        LightColorTokens.PersonasOnDarkVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccentHover",
        LightColorTokens.PersonasOnLightIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccentHover",
        LightColorTokens.PersonasOnLightPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccentHover",
        LightColorTokens.PersonasOnLightSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorHover",
        LightColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondaryHover",
        LightColorTokens.SurfaceInverseAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentSecondaryHover",
        LightColorTokens.SurfaceOnDarkAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        LightColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        LightColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add("textDefaultAccentHover", LightColorTokens.TextDefaultAccentHover, overwrite)
    initial.add(
        "outlineInversePrimaryActive",
        LightColorTokens.OutlineInversePrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWhiteActive",
        LightColorTokens.OutlineInverseTransparentWhiteActive,
        overwrite,
    )
    initial.add("outlineOnDarkAccentActive", LightColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add(
        "outlineOnDarkDefaultActive",
        LightColorTokens.OutlineOnDarkDefaultActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkPrimaryActive",
        LightColorTokens.OutlineOnDarkPrimaryActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOchreTextAccentActive",
        LightColorTokens.PersonasDefaultOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOliveTextAccentActive",
        LightColorTokens.PersonasDefaultOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccentActive",
        LightColorTokens.PersonasDefaultVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseSeaBlueTextAccentActive",
        LightColorTokens.PersonasInverseSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseVioletTextAccentActive",
        LightColorTokens.PersonasInverseVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccentActive",
        LightColorTokens.PersonasOnLightGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOchreTextAccentActive",
        LightColorTokens.PersonasOnLightOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccentActive",
        LightColorTokens.PersonasOnLightVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        LightColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        LightColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightnessHover",
        LightColorTokens.SurfaceDefaultSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNaviActive",
        LightColorTokens.SurfaceDefaultTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentActive",
        LightColorTokens.SurfaceInverseAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentMinorActive",
        LightColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        LightColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinorActive",
        LightColorTokens.SurfaceOnLightTransparentAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkAccentActive", LightColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("outlineOnLightAccent", LightColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightPrimary", LightColorTokens.OutlineOnLightPrimary, overwrite)
    initial.add(
        "personasInverseSeaBlueTextAccent",
        LightColorTokens.PersonasInverseSeaBlueTextAccent,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", LightColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add("surfaceDefaultInfo", LightColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightnessActive",
        LightColorTokens.SurfaceDefaultSolidCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefault",
        LightColorTokens.SurfaceDefaultSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNavi",
        LightColorTokens.SurfaceDefaultTransparentNavi,
        overwrite,
    )
    initial.add("surfaceInverseAccent", LightColorTokens.SurfaceInverseAccent, overwrite)
    initial.add(
        "surfaceInverseSolidPrimary",
        LightColorTokens.SurfaceInverseSolidPrimary,
        overwrite,
    )
    initial.add("surfaceOnDarkAccentMinor", LightColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add("surfaceOnLightClear", LightColorTokens.SurfaceOnLightClear, overwrite)
    initial.add(
        "textDefaultPrimaryBrightnessActive",
        LightColorTokens.TextDefaultPrimaryBrightnessActive,
        overwrite,
    )
    initial.add("textInverseAccent", LightColorTokens.TextInverseAccent, overwrite)
    initial.add("textOnDarkAccent", LightColorTokens.TextOnDarkAccent, overwrite)
    initial.add("backgroundDarkHardline", LightColorTokens.BackgroundDarkHardline, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightnessHover",
        LightColorTokens.SurfaceDefaultSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        LightColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefault",
        LightColorTokens.SurfaceInverseSolidDefault,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardBrightnessActive",
        LightColorTokens.SurfaceOnDarkSolidCardBrightnessActive,
        overwrite,
    )
    initial.add("textOnDarkParagraphActive", LightColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("overlayDefaultMedium", LightColorTokens.OverlayDefaultMedium, overwrite)
    initial.add("overlayInverseMedium", LightColorTokens.OverlayInverseMedium, overwrite)
    initial.add("overlayOnDarkMedium", LightColorTokens.OverlayOnDarkMedium, overwrite)
    initial.add("overlayOnLightMedium", LightColorTokens.OverlayOnLightMedium, overwrite)
    return SddsSbComColors(initial)
}

/**
 * Цвета [SddsSbComColors] для темной темы
 */
@Suppress("LongMethod")
public fun darkSddsSbComColors(overrideColors: ColorOverrideScope.() -> Unit = {}): SddsSbComColors {
    val colorOverrideScope = ColorOverrideScope()
    overrideColors.invoke(colorOverrideScope)
    val overwrite = colorOverrideScope.overrideMap
    val initial = mutableMapOf<String, Color>()
    initial.add("outlineOnDarkDefaultHover", DarkColorTokens.OutlineOnDarkDefaultHover, overwrite)
    initial.add(
        "surfaceDefaultAccentSecondaryHover",
        DarkColorTokens.SurfaceDefaultAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightnessHover",
        DarkColorTokens.SurfaceDefaultTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightnessActive",
        DarkColorTokens.SurfaceDefaultTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightnessHover",
        DarkColorTokens.SurfaceOnLightSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightnessActive",
        DarkColorTokens.SurfaceOnLightSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightnessHover",
        DarkColorTokens.SurfaceOnDarkTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardBrightnessHover",
        DarkColorTokens.SurfaceOnDarkSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightnessActive",
        DarkColorTokens.SurfaceOnDarkTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccent",
        DarkColorTokens.PersonasOnLightOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccent",
        DarkColorTokens.PersonasOnDarkOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccent",
        DarkColorTokens.PersonasInverseOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccent",
        DarkColorTokens.PersonasInversePinkTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryActive",
        DarkColorTokens.SurfaceDefaultSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightnessHover",
        DarkColorTokens.SurfaceInverseSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add("textDefaultPrimary", DarkColorTokens.TextDefaultPrimary, overwrite)
    initial.add(
        "surfaceInverseTransparentNavi",
        DarkColorTokens.SurfaceInverseTransparentNavi,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightnessHover",
        DarkColorTokens.SurfaceInverseTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryActive",
        DarkColorTokens.SurfaceOnLightSolidTertiaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccent",
        DarkColorTokens.PersonasInverseIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryBrightnessActive",
        DarkColorTokens.SurfaceInverseSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOliveTextAccent",
        DarkColorTokens.PersonasDefaultOliveTextAccent,
        overwrite,
    )
    initial.add("textOnDarkAccentMinorHover", DarkColorTokens.TextOnDarkAccentMinorHover, overwrite)
    initial.add(
        "surfaceOnLightTransparentCardBrightnessActive",
        DarkColorTokens.SurfaceOnLightTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightnessHover",
        DarkColorTokens.SurfaceOnLightTransparentCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightnessActive",
        DarkColorTokens.SurfaceOnLightSolidCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorActive",
        DarkColorTokens.SurfaceOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightnessHover",
        DarkColorTokens.SurfaceOnLightSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "outlineOnLightPositiveActive",
        DarkColorTokens.OutlineOnLightPositiveActive,
        overwrite,
    )
    initial.add("outlineDefaultPrimary", DarkColorTokens.OutlineDefaultPrimary, overwrite)
    initial.add(
        "surfaceInverseSolidTertiary",
        DarkColorTokens.SurfaceInverseSolidTertiary,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccent",
        DarkColorTokens.PersonasInverseGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentSecondary",
        DarkColorTokens.SurfaceDefaultAccentSecondary,
        overwrite,
    )
    initial.add("surfaceDefaultAccentMinor", DarkColorTokens.SurfaceDefaultAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkAccentSecondary",
        DarkColorTokens.SurfaceOnDarkAccentSecondary,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccent",
        DarkColorTokens.PersonasOnDarkIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryActive",
        DarkColorTokens.SurfaceOnDarkSolidTertiaryActive,
        overwrite,
    )
    initial.add("surfaceOnLightAccentMinor", DarkColorTokens.SurfaceOnLightAccentMinor, overwrite)
    initial.add(
        "personasOnLightOchreTextAccent",
        DarkColorTokens.PersonasOnLightOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccent",
        DarkColorTokens.PersonasOnLightVioletTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardBrightnessActive",
        DarkColorTokens.SurfaceInverseTransparentCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightWarningActive",
        DarkColorTokens.OutlineOnLightWarningActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentMinorHover",
        DarkColorTokens.SurfaceOnDarkAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightnessActive",
        DarkColorTokens.SurfaceInverseSolidCardBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentMinorHover",
        DarkColorTokens.SurfaceOnLightAccentMinorHover,
        overwrite,
    )
    initial.add("surfaceInverseAccentMinor", DarkColorTokens.SurfaceInverseAccentMinor, overwrite)
    initial.add(
        "surfaceOnDarkTransparentAccentMinor",
        DarkColorTokens.SurfaceOnDarkTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccent",
        DarkColorTokens.PersonasOnLightSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccent",
        DarkColorTokens.PersonasOnDarkBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccent",
        DarkColorTokens.PersonasOnDarkVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultOchreTextAccent",
        DarkColorTokens.PersonasDefaultOchreTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNavi",
        DarkColorTokens.SurfaceOnLightTransparentNavi,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccentActive",
        DarkColorTokens.PersonasInverseBlueTextAccentActive,
        overwrite,
    )
    initial.add("textOnLightWarningActive", DarkColorTokens.TextOnLightWarningActive, overwrite)
    initial.add(
        "personasInverseOliveTextAccentHover",
        DarkColorTokens.PersonasInverseOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNaviActive",
        DarkColorTokens.SurfaceOnLightTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "personasOnLightBlueTextAccentActive",
        DarkColorTokens.PersonasOnLightBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightPrimaryActive",
        DarkColorTokens.OutlineOnLightPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightDefaultActive",
        DarkColorTokens.OutlineOnLightDefaultActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccentActive",
        DarkColorTokens.PersonasOnDarkOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccent",
        DarkColorTokens.PersonasOnDarkSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccentActive",
        DarkColorTokens.PersonasOnDarkVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccentHover",
        DarkColorTokens.PersonasOnDarkGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentSecondaryActive",
        DarkColorTokens.SurfaceOnDarkAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccentActive",
        DarkColorTokens.PersonasInverseGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondary",
        DarkColorTokens.SurfaceInverseAccentSecondary,
        overwrite,
    )
    initial.add(
        "textOnDarkPrimaryBrightnessHover",
        DarkColorTokens.TextOnDarkPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkPinkTextAccentActive",
        DarkColorTokens.PersonasOnDarkPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccentActive",
        DarkColorTokens.PersonasInverseIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccentActive",
        DarkColorTokens.PersonasDefaultSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinor",
        DarkColorTokens.SurfaceOnLightTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccentActive",
        DarkColorTokens.PersonasOnLightPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "textDefaultPrimaryBrightnessHover",
        DarkColorTokens.TextDefaultPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinorActive",
        DarkColorTokens.SurfaceInverseTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOchreTextAccentHover",
        DarkColorTokens.PersonasDefaultOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccentActive",
        DarkColorTokens.PersonasInversePinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNaviHover",
        DarkColorTokens.SurfaceOnLightTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultPrimaryActive",
        DarkColorTokens.OutlineDefaultPrimaryActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccentActive",
        DarkColorTokens.PersonasOnDarkSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccent",
        DarkColorTokens.PersonasOnLightGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondaryActive",
        DarkColorTokens.SurfaceInverseAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccentActive",
        DarkColorTokens.PersonasDefaultIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccentActive",
        DarkColorTokens.PersonasDefaultGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNaviHover",
        DarkColorTokens.SurfaceOnDarkTransparentNaviHover,
        overwrite,
    )
    initial.add(
        "personasInverseSeaBlueTextAccentHover",
        DarkColorTokens.PersonasInverseSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondaryHover",
        DarkColorTokens.SurfaceOnLightAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccentHover",
        DarkColorTokens.PersonasInverseBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInverseIndigoTextAccentHover",
        DarkColorTokens.PersonasInverseIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccent",
        DarkColorTokens.PersonasOnDarkOchreTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccentHover",
        DarkColorTokens.PersonasOnLightGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccentActive",
        DarkColorTokens.PersonasOnDarkOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOchreTextAccentHover",
        DarkColorTokens.PersonasOnLightOchreTextAccentHover,
        overwrite,
    )
    initial.add("outlineDefaultPrimaryHover", DarkColorTokens.OutlineDefaultPrimaryHover, overwrite)
    initial.add(
        "surfaceDefaultTransparentAccentMinorActive",
        DarkColorTokens.SurfaceDefaultTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNaviHover",
        DarkColorTokens.SurfaceDefaultTransparentNaviHover,
        overwrite,
    )
    initial.add("outlineInverseDefaultHover", DarkColorTokens.OutlineInverseDefaultHover, overwrite)
    initial.add(
        "personasInverseVioletTextAccentHover",
        DarkColorTokens.PersonasInverseVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinorHover",
        DarkColorTokens.SurfaceOnLightTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinorHover",
        DarkColorTokens.SurfaceInverseTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNaviHover",
        DarkColorTokens.SurfaceInverseTransparentNaviHover,
        overwrite,
    )
    initial.add("outlineInversePrimaryHover", DarkColorTokens.OutlineInversePrimaryHover, overwrite)
    initial.add(
        "personasDefaultOliveTextAccentHover",
        DarkColorTokens.PersonasDefaultOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccent",
        DarkColorTokens.PersonasDefaultVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccentHover",
        DarkColorTokens.PersonasInverseOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccentActive",
        DarkColorTokens.PersonasOnDarkGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkPinkTextAccentHover",
        DarkColorTokens.PersonasOnDarkPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInversePinkTextAccentHover",
        DarkColorTokens.PersonasInversePinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccentHover",
        DarkColorTokens.PersonasOnDarkIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightBlueTextAccentHover",
        DarkColorTokens.PersonasOnLightBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccentHover",
        DarkColorTokens.PersonasOnLightOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccentHover",
        DarkColorTokens.PersonasOnLightVioletTextAccentHover,
        overwrite,
    )
    initial.add("outlineOnDarkPrimaryHover", DarkColorTokens.OutlineOnDarkPrimaryHover, overwrite)
    initial.add(
        "personasOnDarkPinkTextAccent",
        DarkColorTokens.PersonasOnDarkPinkTextAccent,
        overwrite,
    )
    initial.add("outlineOnDarkPrimary", DarkColorTokens.OutlineOnDarkPrimary, overwrite)
    initial.add(
        "personasOnLightBlueTextAccent",
        DarkColorTokens.PersonasOnLightBlueTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentSecondaryActive",
        DarkColorTokens.SurfaceDefaultAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasDefaultBlueTextAccent",
        DarkColorTokens.PersonasDefaultBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultBlueTextAccentActive",
        DarkColorTokens.PersonasDefaultBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccent",
        DarkColorTokens.PersonasDefaultGreenTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightnessActive",
        DarkColorTokens.SurfaceDefaultSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnLightPrimaryBrightnessHover",
        DarkColorTokens.TextOnLightPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "personasDefaultPinkTextAccent",
        DarkColorTokens.PersonasDefaultPinkTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccent",
        DarkColorTokens.PersonasDefaultSeaBlueTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentMinor",
        DarkColorTokens.SurfaceDefaultTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccentHover",
        DarkColorTokens.PersonasDefaultVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasInverseBlueTextAccent",
        DarkColorTokens.PersonasInverseBlueTextAccent,
        overwrite,
    )
    initial.add(
        "personasInverseOliveTextAccentActive",
        DarkColorTokens.PersonasInverseOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightnessHover",
        DarkColorTokens.SurfaceInverseSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentAccentMinor",
        DarkColorTokens.SurfaceInverseTransparentAccentMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightnessHover",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNavi",
        DarkColorTokens.SurfaceOnDarkTransparentNavi,
        overwrite,
    )
    initial.add(
        "textInversePrimaryBrightnessHover",
        DarkColorTokens.TextInversePrimaryBrightnessHover,
        overwrite,
    )
    initial.add("backgroundDefaultHardline", DarkColorTokens.BackgroundDefaultHardline, overwrite)
    initial.add("outlineInversePrimary", DarkColorTokens.OutlineInversePrimary, overwrite)
    initial.add("outlineOnDarkDefault", DarkColorTokens.OutlineOnDarkDefault, overwrite)
    initial.add(
        "personasInverseVioletTextAccent",
        DarkColorTokens.PersonasInverseVioletTextAccent,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccent",
        DarkColorTokens.PersonasDefaultIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "textInversePrimaryBrightnessActive",
        DarkColorTokens.TextInversePrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnDarkPrimaryBrightnessActive",
        DarkColorTokens.TextOnDarkPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "textOnLightPrimaryBrightnessActive",
        DarkColorTokens.TextOnLightPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkIndigoTextAccentActive",
        DarkColorTokens.PersonasOnDarkIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkOchreTextAccentHover",
        DarkColorTokens.PersonasOnDarkOchreTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultPinkTextAccentHover",
        DarkColorTokens.PersonasDefaultPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNaviActive",
        DarkColorTokens.SurfaceOnDarkTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondary",
        DarkColorTokens.SurfaceOnLightAccentSecondary,
        overwrite,
    )
    initial.add("outlineOnLightDefault", DarkColorTokens.OutlineOnLightDefault, overwrite)
    initial.add(
        "personasDefaultPinkTextAccentActive",
        DarkColorTokens.PersonasDefaultPinkTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseOchreTextAccentActive",
        DarkColorTokens.PersonasInverseOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseOliveTextAccent",
        DarkColorTokens.PersonasInverseOliveTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccentActive",
        DarkColorTokens.PersonasOnDarkBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnDarkGreenTextAccent",
        DarkColorTokens.PersonasOnDarkGreenTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightOliveTextAccentActive",
        DarkColorTokens.PersonasOnLightOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccent",
        DarkColorTokens.PersonasOnLightPinkTextAccent,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccentActive",
        DarkColorTokens.PersonasOnLightSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentMinorHover",
        DarkColorTokens.SurfaceDefaultTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNaviActive",
        DarkColorTokens.SurfaceInverseTransparentNaviActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentMinorHover",
        DarkColorTokens.SurfaceOnDarkTransparentAccentMinorHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccent",
        DarkColorTokens.PersonasOnLightIndigoTextAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightnessActive",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightnessActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentAccentMinorActive",
        DarkColorTokens.SurfaceOnDarkTransparentAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightAccentSecondaryActive",
        DarkColorTokens.SurfaceOnLightAccentSecondaryActive,
        overwrite,
    )
    initial.add(
        "personasInverseGreenTextAccentHover",
        DarkColorTokens.PersonasInverseGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccentActive",
        DarkColorTokens.PersonasOnLightIndigoTextAccentActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWhiteActive",
        DarkColorTokens.OutlineDefaultTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentWhiteHover",
        DarkColorTokens.OutlineDefaultTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineInverseDeep", DarkColorTokens.OutlineInverseDeep, overwrite)
    initial.add("outlineInverseDeepActive", DarkColorTokens.OutlineInverseDeepActive, overwrite)
    initial.add("outlineInverseDeepHover", DarkColorTokens.OutlineInverseDeepHover, overwrite)
    initial.add(
        "outlineInverseTransparentWhite",
        DarkColorTokens.OutlineInverseTransparentWhite,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWhiteHover",
        DarkColorTokens.OutlineInverseTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineOnDarkDeep", DarkColorTokens.OutlineOnDarkDeep, overwrite)
    initial.add("outlineOnDarkDeepActive", DarkColorTokens.OutlineOnDarkDeepActive, overwrite)
    initial.add("outlineOnDarkDeepHover", DarkColorTokens.OutlineOnDarkDeepHover, overwrite)
    initial.add(
        "outlineOnDarkTransparentWhite",
        DarkColorTokens.OutlineOnDarkTransparentWhite,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWhiteActive",
        DarkColorTokens.OutlineOnDarkTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentWhiteHover",
        DarkColorTokens.OutlineOnDarkTransparentWhiteHover,
        overwrite,
    )
    initial.add("outlineOnLightDeep", DarkColorTokens.OutlineOnLightDeep, overwrite)
    initial.add("outlineOnLightDeepActive", DarkColorTokens.OutlineOnLightDeepActive, overwrite)
    initial.add("outlineOnLightDeepHover", DarkColorTokens.OutlineOnLightDeepHover, overwrite)
    initial.add(
        "outlineOnLightTransparentWhite",
        DarkColorTokens.OutlineOnLightTransparentWhite,
        overwrite,
    )
    initial.add("surfaceDefaultSolidDeep", DarkColorTokens.SurfaceDefaultSolidDeep, overwrite)
    initial.add(
        "surfaceDefaultSolidDeepActive",
        DarkColorTokens.SurfaceDefaultSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDeepHover",
        DarkColorTokens.SurfaceDefaultSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinor",
        DarkColorTokens.SurfaceDefaultTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinorActive",
        DarkColorTokens.SurfaceDefaultTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardMinorHover",
        DarkColorTokens.SurfaceDefaultTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceInverseSolidDeep", DarkColorTokens.SurfaceInverseSolidDeep, overwrite)
    initial.add(
        "surfaceInverseSolidDeepActive",
        DarkColorTokens.SurfaceInverseSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDeepHover",
        DarkColorTokens.SurfaceInverseSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinor",
        DarkColorTokens.SurfaceInverseTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinorActive",
        DarkColorTokens.SurfaceInverseTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardMinorHover",
        DarkColorTokens.SurfaceInverseTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDeep", DarkColorTokens.SurfaceOnDarkSolidDeep, overwrite)
    initial.add(
        "surfaceOnDarkSolidDeepActive",
        DarkColorTokens.SurfaceOnDarkSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidDeepHover",
        DarkColorTokens.SurfaceOnDarkSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinor",
        DarkColorTokens.SurfaceOnDarkTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinorActive",
        DarkColorTokens.SurfaceOnDarkTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardMinorHover",
        DarkColorTokens.SurfaceOnDarkTransparentCardMinorHover,
        overwrite,
    )
    initial.add("surfaceOnLightSolidDeep", DarkColorTokens.SurfaceOnLightSolidDeep, overwrite)
    initial.add(
        "surfaceOnLightSolidDeepActive",
        DarkColorTokens.SurfaceOnLightSolidDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidDeepHover",
        DarkColorTokens.SurfaceOnLightSolidDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinor",
        DarkColorTokens.SurfaceOnLightTransparentCardMinor,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinorActive",
        DarkColorTokens.SurfaceOnLightTransparentCardMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardMinorHover",
        DarkColorTokens.SurfaceOnLightTransparentCardMinorHover,
        overwrite,
    )
    initial.add("outlineDefaultDeepActive", DarkColorTokens.OutlineDefaultDeepActive, overwrite)
    initial.add("outlineDefaultDeepHover", DarkColorTokens.OutlineDefaultDeepHover, overwrite)
    initial.add(
        "outlineOnLightTransparentWhiteActive",
        DarkColorTokens.OutlineOnLightTransparentWhiteActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentWhiteHover",
        DarkColorTokens.OutlineOnLightTransparentWhiteHover,
        overwrite,
    )
    initial.add("textDefaultPositiveActive", DarkColorTokens.TextDefaultPositiveActive, overwrite)
    initial.add("textDefaultPositiveHover", DarkColorTokens.TextDefaultPositiveHover, overwrite)
    initial.add("textDefaultPrimaryActive", DarkColorTokens.TextDefaultPrimaryActive, overwrite)
    initial.add(
        "textDefaultPrimaryBrightness",
        DarkColorTokens.TextDefaultPrimaryBrightness,
        overwrite,
    )
    initial.add("textDefaultNegative", DarkColorTokens.TextDefaultNegative, overwrite)
    initial.add("textDefaultNegativeActive", DarkColorTokens.TextDefaultNegativeActive, overwrite)
    initial.add("textDefaultNegativeHover", DarkColorTokens.TextDefaultNegativeHover, overwrite)
    initial.add("textDefaultTertiaryActive", DarkColorTokens.TextDefaultTertiaryActive, overwrite)
    initial.add("textDefaultTertiaryHover", DarkColorTokens.TextDefaultTertiaryHover, overwrite)
    initial.add("textDefaultWarning", DarkColorTokens.TextDefaultWarning, overwrite)
    initial.add("textDefaultWarningActive", DarkColorTokens.TextDefaultWarningActive, overwrite)
    initial.add("textDefaultWarningHover", DarkColorTokens.TextDefaultWarningHover, overwrite)
    initial.add("textDefaultAccentMinor", DarkColorTokens.TextDefaultAccentMinor, overwrite)
    initial.add(
        "textDefaultAccentMinorActive",
        DarkColorTokens.TextDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "textDefaultAccentMinorHover",
        DarkColorTokens.TextDefaultAccentMinorHover,
        overwrite,
    )
    initial.add("textDefaultParagraphHover", DarkColorTokens.TextDefaultParagraphHover, overwrite)
    initial.add("textDefaultPositive", DarkColorTokens.TextDefaultPositive, overwrite)
    initial.add("textDefaultParagraph", DarkColorTokens.TextDefaultParagraph, overwrite)
    initial.add("textDefaultParagraphActive", DarkColorTokens.TextDefaultParagraphActive, overwrite)
    initial.add("textDefaultInfo", DarkColorTokens.TextDefaultInfo, overwrite)
    initial.add("textDefaultInfoActive", DarkColorTokens.TextDefaultInfoActive, overwrite)
    initial.add("textDefaultInfoHover", DarkColorTokens.TextDefaultInfoHover, overwrite)
    initial.add("textDefaultSecondary", DarkColorTokens.TextDefaultSecondary, overwrite)
    initial.add("textDefaultSecondaryActive", DarkColorTokens.TextDefaultSecondaryActive, overwrite)
    initial.add("textDefaultSecondaryHover", DarkColorTokens.TextDefaultSecondaryHover, overwrite)
    initial.add("textDefaultTertiary", DarkColorTokens.TextDefaultTertiary, overwrite)
    initial.add("textDefaultAccent", DarkColorTokens.TextDefaultAccent, overwrite)
    initial.add("textDefaultAccentActive", DarkColorTokens.TextDefaultAccentActive, overwrite)
    initial.add(
        "textOnDarkAccentMinorActive",
        DarkColorTokens.TextOnDarkAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkInfoActive", DarkColorTokens.TextOnDarkInfoActive, overwrite)
    initial.add("textOnDarkInfo", DarkColorTokens.TextOnDarkInfo, overwrite)
    initial.add("textOnDarkInfoHover", DarkColorTokens.TextOnDarkInfoHover, overwrite)
    initial.add("textOnDarkNegative", DarkColorTokens.TextOnDarkNegative, overwrite)
    initial.add("textOnDarkSecondary", DarkColorTokens.TextOnDarkSecondary, overwrite)
    initial.add("textOnDarkSecondaryActive", DarkColorTokens.TextOnDarkSecondaryActive, overwrite)
    initial.add("textOnDarkTertiary", DarkColorTokens.TextOnDarkTertiary, overwrite)
    initial.add("textOnDarkSecondaryHover", DarkColorTokens.TextOnDarkSecondaryHover, overwrite)
    initial.add("textOnDarkPrimary", DarkColorTokens.TextOnDarkPrimary, overwrite)
    initial.add("textOnDarkAccentHover", DarkColorTokens.TextOnDarkAccentHover, overwrite)
    initial.add("textOnDarkPositive", DarkColorTokens.TextOnDarkPositive, overwrite)
    initial.add("textOnDarkParagraphHover", DarkColorTokens.TextOnDarkParagraphHover, overwrite)
    initial.add("textOnDarkNegativeActive", DarkColorTokens.TextOnDarkNegativeActive, overwrite)
    initial.add("textOnDarkParagraph", DarkColorTokens.TextOnDarkParagraph, overwrite)
    initial.add("textOnDarkNegativeHover", DarkColorTokens.TextOnDarkNegativeHover, overwrite)
    initial.add("textOnDarkPrimaryActive", DarkColorTokens.TextOnDarkPrimaryActive, overwrite)
    initial.add(
        "textOnDarkPrimaryBrightness",
        DarkColorTokens.TextOnDarkPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnDarkWarningHover", DarkColorTokens.TextOnDarkWarningHover, overwrite)
    initial.add("textOnDarkTertiaryActive", DarkColorTokens.TextOnDarkTertiaryActive, overwrite)
    initial.add("textOnDarkWarning", DarkColorTokens.TextOnDarkWarning, overwrite)
    initial.add("textOnDarkWarningActive", DarkColorTokens.TextOnDarkWarningActive, overwrite)
    initial.add("textOnDarkTertiaryHover", DarkColorTokens.TextOnDarkTertiaryHover, overwrite)
    initial.add("textOnDarkPrimaryHover", DarkColorTokens.TextOnDarkPrimaryHover, overwrite)
    initial.add("textOnDarkPositiveActive", DarkColorTokens.TextOnDarkPositiveActive, overwrite)
    initial.add("textOnDarkAccentMinor", DarkColorTokens.TextOnDarkAccentMinor, overwrite)
    initial.add("textOnDarkPositiveHover", DarkColorTokens.TextOnDarkPositiveHover, overwrite)
    initial.add("textOnLightTertiaryActive", DarkColorTokens.TextOnLightTertiaryActive, overwrite)
    initial.add("textOnLightWarning", DarkColorTokens.TextOnLightWarning, overwrite)
    initial.add("textOnLightTertiaryHover", DarkColorTokens.TextOnLightTertiaryHover, overwrite)
    initial.add("textOnLightWarningHover", DarkColorTokens.TextOnLightWarningHover, overwrite)
    initial.add("textOnLightPositiveActive", DarkColorTokens.TextOnLightPositiveActive, overwrite)
    initial.add("textOnLightPrimary", DarkColorTokens.TextOnLightPrimary, overwrite)
    initial.add("textOnLightPositiveHover", DarkColorTokens.TextOnLightPositiveHover, overwrite)
    initial.add(
        "textOnLightAccentMinorActive",
        DarkColorTokens.TextOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textOnLightParagraph", DarkColorTokens.TextOnLightParagraph, overwrite)
    initial.add(
        "textOnLightAccentMinorHover",
        DarkColorTokens.TextOnLightAccentMinorHover,
        overwrite,
    )
    initial.add("textOnLightParagraphActive", DarkColorTokens.TextOnLightParagraphActive, overwrite)
    initial.add("textOnLightPositive", DarkColorTokens.TextOnLightPositive, overwrite)
    initial.add("textOnLightParagraphHover", DarkColorTokens.TextOnLightParagraphHover, overwrite)
    initial.add("textOnLightSecondary", DarkColorTokens.TextOnLightSecondary, overwrite)
    initial.add("textOnLightSecondaryActive", DarkColorTokens.TextOnLightSecondaryActive, overwrite)
    initial.add("textOnLightTertiary", DarkColorTokens.TextOnLightTertiary, overwrite)
    initial.add("textOnLightSecondaryHover", DarkColorTokens.TextOnLightSecondaryHover, overwrite)
    initial.add("textOnLightPrimaryActive", DarkColorTokens.TextOnLightPrimaryActive, overwrite)
    initial.add("textOnLightPrimaryHover", DarkColorTokens.TextOnLightPrimaryHover, overwrite)
    initial.add(
        "textOnLightPrimaryBrightness",
        DarkColorTokens.TextOnLightPrimaryBrightness,
        overwrite,
    )
    initial.add("textOnLightAccentActive", DarkColorTokens.TextOnLightAccentActive, overwrite)
    initial.add("textOnLightAccentMinor", DarkColorTokens.TextOnLightAccentMinor, overwrite)
    initial.add("textOnLightAccent", DarkColorTokens.TextOnLightAccent, overwrite)
    initial.add("textOnLightAccentHover", DarkColorTokens.TextOnLightAccentHover, overwrite)
    initial.add("textOnLightNegativeActive", DarkColorTokens.TextOnLightNegativeActive, overwrite)
    initial.add("textOnLightNegativeHover", DarkColorTokens.TextOnLightNegativeHover, overwrite)
    initial.add("textInverseSecondaryHover", DarkColorTokens.TextInverseSecondaryHover, overwrite)
    initial.add("textInverseSecondary", DarkColorTokens.TextInverseSecondary, overwrite)
    initial.add("textInverseSecondaryActive", DarkColorTokens.TextInverseSecondaryActive, overwrite)
    initial.add("textInverseTertiaryActive", DarkColorTokens.TextInverseTertiaryActive, overwrite)
    initial.add("textOnLightInfo", DarkColorTokens.TextOnLightInfo, overwrite)
    initial.add("textInverseTertiaryHover", DarkColorTokens.TextInverseTertiaryHover, overwrite)
    initial.add("textOnLightInfoActive", DarkColorTokens.TextOnLightInfoActive, overwrite)
    initial.add("textOnLightInfoHover", DarkColorTokens.TextOnLightInfoHover, overwrite)
    initial.add("textInversePrimaryActive", DarkColorTokens.TextInversePrimaryActive, overwrite)
    initial.add("textInversePrimaryHover", DarkColorTokens.TextInversePrimaryHover, overwrite)
    initial.add(
        "textInversePrimaryBrightness",
        DarkColorTokens.TextInversePrimaryBrightness,
        overwrite,
    )
    initial.add(
        "textInverseAccentMinorActive",
        DarkColorTokens.TextInverseAccentMinorActive,
        overwrite,
    )
    initial.add("textInverseParagraph", DarkColorTokens.TextInverseParagraph, overwrite)
    initial.add(
        "textInverseAccentMinorHover",
        DarkColorTokens.TextInverseAccentMinorHover,
        overwrite,
    )
    initial.add("textInverseParagraphActive", DarkColorTokens.TextInverseParagraphActive, overwrite)
    initial.add("textInversePrimary", DarkColorTokens.TextInversePrimary, overwrite)
    initial.add("textInverseParagraphHover", DarkColorTokens.TextInverseParagraphHover, overwrite)
    initial.add("textInverseTertiary", DarkColorTokens.TextInverseTertiary, overwrite)
    initial.add("textOnLightNegative", DarkColorTokens.TextOnLightNegative, overwrite)
    initial.add("textInverseAccentActive", DarkColorTokens.TextInverseAccentActive, overwrite)
    initial.add("textInverseAccentHover", DarkColorTokens.TextInverseAccentHover, overwrite)
    initial.add("textInverseAccentMinor", DarkColorTokens.TextInverseAccentMinor, overwrite)
    initial.add("textInverseNegative", DarkColorTokens.TextInverseNegative, overwrite)
    initial.add("textInversePositiveActive", DarkColorTokens.TextInversePositiveActive, overwrite)
    initial.add("textInversePositiveHover", DarkColorTokens.TextInversePositiveHover, overwrite)
    initial.add("textInverseNegativeActive", DarkColorTokens.TextInverseNegativeActive, overwrite)
    initial.add("textInverseNegativeHover", DarkColorTokens.TextInverseNegativeHover, overwrite)
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
    initial.add(
        "surfaceDefaultSolidSecondaryActive",
        DarkColorTokens.SurfaceDefaultSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidSecondaryHover",
        DarkColorTokens.SurfaceDefaultSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidTertiaryHover",
        DarkColorTokens.SurfaceDefaultSolidTertiaryHover,
        overwrite,
    )
    initial.add("textInverseInfoActive", DarkColorTokens.TextInverseInfoActive, overwrite)
    initial.add("textInverseInfo", DarkColorTokens.TextInverseInfo, overwrite)
    initial.add("textInverseInfoHover", DarkColorTokens.TextInverseInfoHover, overwrite)
    initial.add("textInverseWarning", DarkColorTokens.TextInverseWarning, overwrite)
    initial.add("textInverseWarningHover", DarkColorTokens.TextInverseWarningHover, overwrite)
    initial.add("surfaceDefaultSolidPrimary", DarkColorTokens.SurfaceDefaultSolidPrimary, overwrite)
    initial.add("textInverseWarningActive", DarkColorTokens.TextInverseWarningActive, overwrite)
    initial.add("textInversePositive", DarkColorTokens.TextInversePositive, overwrite)
    initial.add(
        "surfaceDefaultSolidPrimaryHover",
        DarkColorTokens.SurfaceDefaultSolidPrimaryHover,
        overwrite,
    )
    initial.add("surfaceDefaultAccentHover", DarkColorTokens.SurfaceDefaultAccentHover, overwrite)
    initial.add("surfaceDefaultAccentActive", DarkColorTokens.SurfaceDefaultAccentActive, overwrite)
    initial.add(
        "surfaceDefaultTransparentPrimaryActive",
        DarkColorTokens.SurfaceDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondary",
        DarkColorTokens.SurfaceDefaultTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimaryHover",
        DarkColorTokens.SurfaceDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeep",
        DarkColorTokens.SurfaceDefaultTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentPrimary",
        DarkColorTokens.SurfaceDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepActive",
        DarkColorTokens.SurfaceDefaultTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentDeepHover",
        DarkColorTokens.SurfaceDefaultTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardActive",
        DarkColorTokens.SurfaceDefaultSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardHover",
        DarkColorTokens.SurfaceDefaultSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidCardBrightness",
        DarkColorTokens.SurfaceDefaultSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceDefaultClearActive", DarkColorTokens.SurfaceDefaultClearActive, overwrite)
    initial.add("surfaceDefaultClear", DarkColorTokens.SurfaceDefaultClear, overwrite)
    initial.add("surfaceDefaultSolidCard", DarkColorTokens.SurfaceDefaultSolidCard, overwrite)
    initial.add("surfaceDefaultClearHover", DarkColorTokens.SurfaceDefaultClearHover, overwrite)
    initial.add(
        "surfaceDefaultTransparentCardActive",
        DarkColorTokens.SurfaceDefaultTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardHover",
        DarkColorTokens.SurfaceDefaultTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCardBrightness",
        DarkColorTokens.SurfaceDefaultTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultActive",
        DarkColorTokens.SurfaceDefaultSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidDefaultHover",
        DarkColorTokens.SurfaceDefaultSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentActive",
        DarkColorTokens.SurfaceDefaultTransparentAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentCard",
        DarkColorTokens.SurfaceDefaultTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryActive",
        DarkColorTokens.SurfaceDefaultTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiary",
        DarkColorTokens.SurfaceDefaultTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccentHover",
        DarkColorTokens.SurfaceDefaultTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentAccent",
        DarkColorTokens.SurfaceDefaultTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentSecondaryHover",
        DarkColorTokens.SurfaceDefaultTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryActive",
        DarkColorTokens.SurfaceDefaultTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentTertiaryHover",
        DarkColorTokens.SurfaceDefaultTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveActive",
        DarkColorTokens.SurfaceDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultPositiveHover",
        DarkColorTokens.SurfaceDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultNegativeActive",
        DarkColorTokens.SurfaceDefaultNegativeActive,
        overwrite,
    )
    initial.add("surfaceDefaultPositive", DarkColorTokens.SurfaceDefaultPositive, overwrite)
    initial.add(
        "surfaceDefaultNegativeHover",
        DarkColorTokens.SurfaceDefaultNegativeHover,
        overwrite,
    )
    initial.add("surfaceDefaultInfoHover", DarkColorTokens.SurfaceDefaultInfoHover, overwrite)
    initial.add("surfaceDefaultWarning", DarkColorTokens.SurfaceDefaultWarning, overwrite)
    initial.add("surfaceDefaultWarningHover", DarkColorTokens.SurfaceDefaultWarningHover, overwrite)
    initial.add(
        "surfaceDefaultWarningActive",
        DarkColorTokens.SurfaceDefaultWarningActive,
        overwrite,
    )
    initial.add("surfaceDefaultInfoActive", DarkColorTokens.SurfaceDefaultInfoActive, overwrite)
    initial.add("surfaceDefaultNegative", DarkColorTokens.SurfaceDefaultNegative, overwrite)
    initial.add(
        "surfaceDefaultTransparentNegativeActive",
        DarkColorTokens.SurfaceDefaultTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegativeHover",
        DarkColorTokens.SurfaceDefaultTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNegative",
        DarkColorTokens.SurfaceDefaultTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondary",
        DarkColorTokens.SurfaceOnDarkSolidSecondary,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidTertiary", DarkColorTokens.SurfaceOnDarkSolidTertiary, overwrite)
    initial.add(
        "surfaceOnDarkSolidSecondaryActive",
        DarkColorTokens.SurfaceOnDarkSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidSecondaryHover",
        DarkColorTokens.SurfaceOnDarkSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidTertiaryHover",
        DarkColorTokens.SurfaceOnDarkSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryActive",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceDefaultReadOnlyActive",
        DarkColorTokens.SurfaceDefaultReadOnlyActive,
        overwrite,
    )
    initial.add("surfaceDefaultReadOnly", DarkColorTokens.SurfaceDefaultReadOnly, overwrite)
    initial.add(
        "surfaceDefaultReadOnlyHover",
        DarkColorTokens.SurfaceDefaultReadOnlyHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidPrimaryHover",
        DarkColorTokens.SurfaceOnDarkSolidPrimaryHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidPrimary", DarkColorTokens.SurfaceOnDarkSolidPrimary, overwrite)
    initial.add("surfaceOnDarkAccent", DarkColorTokens.SurfaceOnDarkAccent, overwrite)
    initial.add("surfaceOnDarkAccentHover", DarkColorTokens.SurfaceOnDarkAccentHover, overwrite)
    initial.add("surfaceOnDarkAccentActive", DarkColorTokens.SurfaceOnDarkAccentActive, overwrite)
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
        "surfaceOnDarkTransparentPrimaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeep",
        DarkColorTokens.SurfaceOnDarkTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentPrimary",
        DarkColorTokens.SurfaceOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepActive",
        DarkColorTokens.SurfaceOnDarkTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentDeepHover",
        DarkColorTokens.SurfaceOnDarkTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardActive",
        DarkColorTokens.SurfaceOnDarkSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardHover",
        DarkColorTokens.SurfaceOnDarkSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkSolidCardBrightness",
        DarkColorTokens.SurfaceOnDarkSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnDarkClear", DarkColorTokens.SurfaceOnDarkClear, overwrite)
    initial.add("surfaceOnDarkClearHover", DarkColorTokens.SurfaceOnDarkClearHover, overwrite)
    initial.add("surfaceOnDarkClearActive", DarkColorTokens.SurfaceOnDarkClearActive, overwrite)
    initial.add("surfaceOnDarkSolidCard", DarkColorTokens.SurfaceOnDarkSolidCard, overwrite)
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
        "surfaceOnDarkTransparentCard",
        DarkColorTokens.SurfaceOnDarkTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardHover",
        DarkColorTokens.SurfaceOnDarkTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentCardBrightness",
        DarkColorTokens.SurfaceOnDarkTransparentCardBrightness,
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
        "surfaceOnDarkTransparentCardActive",
        DarkColorTokens.SurfaceOnDarkTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentSecondaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryActive",
        DarkColorTokens.SurfaceOnDarkTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentTertiaryHover",
        DarkColorTokens.SurfaceOnDarkTransparentTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkPositiveActive",
        DarkColorTokens.SurfaceOnDarkPositiveActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositiveHover", DarkColorTokens.SurfaceOnDarkPositiveHover, overwrite)
    initial.add(
        "surfaceOnDarkNegativeActive",
        DarkColorTokens.SurfaceOnDarkNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnDarkPositive", DarkColorTokens.SurfaceOnDarkPositive, overwrite)
    initial.add("surfaceOnDarkNegativeHover", DarkColorTokens.SurfaceOnDarkNegativeHover, overwrite)
    initial.add("surfaceOnDarkInfoHover", DarkColorTokens.SurfaceOnDarkInfoHover, overwrite)
    initial.add("surfaceOnDarkInfo", DarkColorTokens.SurfaceOnDarkInfo, overwrite)
    initial.add("surfaceOnDarkInfoActive", DarkColorTokens.SurfaceOnDarkInfoActive, overwrite)
    initial.add("surfaceOnDarkWarningActive", DarkColorTokens.SurfaceOnDarkWarningActive, overwrite)
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
    initial.add("surfaceOnDarkWarning", DarkColorTokens.SurfaceOnDarkWarning, overwrite)
    initial.add("surfaceOnDarkWarningHover", DarkColorTokens.SurfaceOnDarkWarningHover, overwrite)
    initial.add("surfaceOnDarkNegative", DarkColorTokens.SurfaceOnDarkNegative, overwrite)
    initial.add(
        "surfaceOnDarkTransparentNegativeActive",
        DarkColorTokens.SurfaceOnDarkTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegativeHover",
        DarkColorTokens.SurfaceOnDarkTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkReadOnlyActive",
        DarkColorTokens.SurfaceOnDarkReadOnlyActive,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkTransparentNegative",
        DarkColorTokens.SurfaceOnDarkTransparentNegative,
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
    initial.add(
        "surfaceOnLightSolidSecondaryActive",
        DarkColorTokens.SurfaceOnLightSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidSecondaryHover",
        DarkColorTokens.SurfaceOnLightSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidTertiaryHover",
        DarkColorTokens.SurfaceOnLightSolidTertiaryHover,
        overwrite,
    )
    initial.add("surfaceOnDarkReadOnlyHover", DarkColorTokens.SurfaceOnDarkReadOnlyHover, overwrite)
    initial.add("surfaceOnDarkReadOnly", DarkColorTokens.SurfaceOnDarkReadOnly, overwrite)
    initial.add(
        "surfaceOnLightSolidPrimaryActive",
        DarkColorTokens.SurfaceOnLightSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryHover",
        DarkColorTokens.SurfaceOnLightSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidPrimaryBrightness",
        DarkColorTokens.SurfaceOnLightSolidPrimaryBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightSolidPrimary", DarkColorTokens.SurfaceOnLightSolidPrimary, overwrite)
    initial.add("surfaceOnLightAccent", DarkColorTokens.SurfaceOnLightAccent, overwrite)
    initial.add("surfaceOnLightAccentHover", DarkColorTokens.SurfaceOnLightAccentHover, overwrite)
    initial.add("surfaceOnLightAccentActive", DarkColorTokens.SurfaceOnLightAccentActive, overwrite)
    initial.add(
        "surfaceOnLightTransparentPrimaryActive",
        DarkColorTokens.SurfaceOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondary",
        DarkColorTokens.SurfaceOnLightTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimaryHover",
        DarkColorTokens.SurfaceOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeep",
        DarkColorTokens.SurfaceOnLightTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentPrimary",
        DarkColorTokens.SurfaceOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepActive",
        DarkColorTokens.SurfaceOnLightTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardActive",
        DarkColorTokens.SurfaceOnLightSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardHover",
        DarkColorTokens.SurfaceOnLightSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightSolidCardBrightness",
        DarkColorTokens.SurfaceOnLightSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceOnLightClearActive", DarkColorTokens.SurfaceOnLightClearActive, overwrite)
    initial.add("surfaceOnLightSolidCard", DarkColorTokens.SurfaceOnLightSolidCard, overwrite)
    initial.add("surfaceOnLightClearHover", DarkColorTokens.SurfaceOnLightClearHover, overwrite)
    initial.add(
        "surfaceOnLightSolidDefaultActive",
        DarkColorTokens.SurfaceOnLightSolidDefaultActive,
        overwrite,
    )
    initial.add("surfaceOnLightSolidDefault", DarkColorTokens.SurfaceOnLightSolidDefault, overwrite)
    initial.add(
        "surfaceOnLightSolidDefaultHover",
        DarkColorTokens.SurfaceOnLightSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardActive",
        DarkColorTokens.SurfaceOnLightTransparentCardActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardHover",
        DarkColorTokens.SurfaceOnLightTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryActive",
        DarkColorTokens.SurfaceOnLightTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiary",
        DarkColorTokens.SurfaceOnLightTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCardBrightness",
        DarkColorTokens.SurfaceOnLightTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentCard",
        DarkColorTokens.SurfaceOnLightTransparentCard,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryActive",
        DarkColorTokens.SurfaceOnLightTransparentTertiaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentTertiaryHover",
        DarkColorTokens.SurfaceOnLightTransparentTertiaryHover,
        overwrite,
    )
    initial.add("surfaceOnLightInfo", DarkColorTokens.SurfaceOnLightInfo, overwrite)
    initial.add(
        "surfaceOnLightPositiveActive",
        DarkColorTokens.SurfaceOnLightPositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightPositiveHover",
        DarkColorTokens.SurfaceOnLightPositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightNegativeActive",
        DarkColorTokens.SurfaceOnLightNegativeActive,
        overwrite,
    )
    initial.add("surfaceOnLightPositive", DarkColorTokens.SurfaceOnLightPositive, overwrite)
    initial.add(
        "surfaceOnLightNegativeHover",
        DarkColorTokens.SurfaceOnLightNegativeHover,
        overwrite,
    )
    initial.add("surfaceOnLightInfoHover", DarkColorTokens.SurfaceOnLightInfoHover, overwrite)
    initial.add("surfaceOnLightInfoActive", DarkColorTokens.SurfaceOnLightInfoActive, overwrite)
    initial.add(
        "surfaceOnLightTransparentAccentHover",
        DarkColorTokens.SurfaceOnLightTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccent",
        DarkColorTokens.SurfaceOnLightTransparentAccent,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentActive",
        DarkColorTokens.SurfaceOnLightTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceOnLightWarning", DarkColorTokens.SurfaceOnLightWarning, overwrite)
    initial.add(
        "surfaceOnLightWarningActive",
        DarkColorTokens.SurfaceOnLightWarningActive,
        overwrite,
    )
    initial.add("surfaceOnLightNegative", DarkColorTokens.SurfaceOnLightNegative, overwrite)
    initial.add("surfaceOnLightWarningHover", DarkColorTokens.SurfaceOnLightWarningHover, overwrite)
    initial.add(
        "surfaceOnLightTransparentNegativeActive",
        DarkColorTokens.SurfaceOnLightTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegativeHover",
        DarkColorTokens.SurfaceOnLightTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightReadOnlyActive",
        DarkColorTokens.SurfaceOnLightReadOnlyActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentNegative",
        DarkColorTokens.SurfaceOnLightTransparentNegative,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondary",
        DarkColorTokens.SurfaceInverseSolidSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryHover",
        DarkColorTokens.SurfaceInverseSolidSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightReadOnlyHover",
        DarkColorTokens.SurfaceOnLightReadOnlyHover,
        overwrite,
    )
    initial.add("surfaceOnLightReadOnly", DarkColorTokens.SurfaceOnLightReadOnly, overwrite)
    initial.add(
        "surfaceInverseSolidPrimaryBrightness",
        DarkColorTokens.SurfaceInverseSolidPrimaryBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryActive",
        DarkColorTokens.SurfaceInverseSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidPrimaryHover",
        DarkColorTokens.SurfaceInverseSolidPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryHover",
        DarkColorTokens.SurfaceInverseTransparentTertiaryHover,
        overwrite,
    )
    initial.add("surfaceInverseClearActive", DarkColorTokens.SurfaceInverseClearActive, overwrite)
    initial.add("surfaceInverseClear", DarkColorTokens.SurfaceInverseClear, overwrite)
    initial.add(
        "surfaceInverseTransparentPrimaryActive",
        DarkColorTokens.SurfaceInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondary",
        DarkColorTokens.SurfaceInverseTransparentSecondary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimaryHover",
        DarkColorTokens.SurfaceInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeep",
        DarkColorTokens.SurfaceInverseTransparentDeep,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentPrimary",
        DarkColorTokens.SurfaceInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepActive",
        DarkColorTokens.SurfaceInverseTransparentDeepActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentDeepHover",
        DarkColorTokens.SurfaceInverseTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardActive",
        DarkColorTokens.SurfaceInverseSolidCardActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardHover",
        DarkColorTokens.SurfaceInverseSolidCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidCardBrightness",
        DarkColorTokens.SurfaceInverseSolidCardBrightness,
        overwrite,
    )
    initial.add("surfaceInverseSolidCard", DarkColorTokens.SurfaceInverseSolidCard, overwrite)
    initial.add(
        "surfaceInverseTransparentCardBrightness",
        DarkColorTokens.SurfaceInverseTransparentCardBrightness,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentCardHover",
        DarkColorTokens.SurfaceInverseTransparentCardHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidDefaultActive",
        DarkColorTokens.SurfaceInverseSolidDefaultActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryActive",
        DarkColorTokens.SurfaceInverseSolidTertiaryActive,
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
        "surfaceInverseSolidDefaultHover",
        DarkColorTokens.SurfaceInverseSolidDefaultHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidTertiaryHover",
        DarkColorTokens.SurfaceInverseSolidTertiaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryActive",
        DarkColorTokens.SurfaceInverseTransparentSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiary",
        DarkColorTokens.SurfaceInverseTransparentTertiary,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentSecondaryHover",
        DarkColorTokens.SurfaceInverseTransparentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentTertiaryActive",
        DarkColorTokens.SurfaceInverseTransparentTertiaryActive,
        overwrite,
    )
    initial.add("surfaceInverseClearHover", DarkColorTokens.SurfaceInverseClearHover, overwrite)
    initial.add(
        "surfaceInverseWarningActive",
        DarkColorTokens.SurfaceInverseWarningActive,
        overwrite,
    )
    initial.add("surfaceInverseWarningHover", DarkColorTokens.SurfaceInverseWarningHover, overwrite)
    initial.add("surfaceInverseAccentHover", DarkColorTokens.SurfaceInverseAccentHover, overwrite)
    initial.add(
        "surfaceInversePositiveActive",
        DarkColorTokens.SurfaceInversePositiveActive,
        overwrite,
    )
    initial.add(
        "surfaceInversePositiveHover",
        DarkColorTokens.SurfaceInversePositiveHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseNegativeActive",
        DarkColorTokens.SurfaceInverseNegativeActive,
        overwrite,
    )
    initial.add("surfaceInversePositive", DarkColorTokens.SurfaceInversePositive, overwrite)
    initial.add(
        "surfaceInverseNegativeHover",
        DarkColorTokens.SurfaceInverseNegativeHover,
        overwrite,
    )
    initial.add("surfaceInverseNegative", DarkColorTokens.SurfaceInverseNegative, overwrite)
    initial.add("surfaceInverseInfoHover", DarkColorTokens.SurfaceInverseInfoHover, overwrite)
    initial.add("surfaceInverseWarning", DarkColorTokens.SurfaceInverseWarning, overwrite)
    initial.add(
        "surfaceInverseTransparentAccent",
        DarkColorTokens.SurfaceInverseTransparentAccent,
        overwrite,
    )
    initial.add("surfaceInverseInfoActive", DarkColorTokens.SurfaceInverseInfoActive, overwrite)
    initial.add(
        "surfaceInverseTransparentAccentActive",
        DarkColorTokens.SurfaceInverseTransparentAccentActive,
        overwrite,
    )
    initial.add("surfaceInverseInfo", DarkColorTokens.SurfaceInverseInfo, overwrite)
    initial.add(
        "surfaceInverseTransparentAccentHover",
        DarkColorTokens.SurfaceInverseTransparentAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeActive",
        DarkColorTokens.SurfaceInverseTransparentNegativeActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegativeHover",
        DarkColorTokens.SurfaceInverseTransparentNegativeHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseTransparentNegative",
        DarkColorTokens.SurfaceInverseTransparentNegative,
        overwrite,
    )
    initial.add("backgroundDefaultSecondary", DarkColorTokens.BackgroundDefaultSecondary, overwrite)
    initial.add("backgroundDefaultTertiary", DarkColorTokens.BackgroundDefaultTertiary, overwrite)
    initial.add("backgroundLightPrimary", DarkColorTokens.BackgroundLightPrimary, overwrite)
    initial.add(
        "surfaceInverseReadOnlyActive",
        DarkColorTokens.SurfaceInverseReadOnlyActive,
        overwrite,
    )
    initial.add("backgroundDarkSecondary", DarkColorTokens.BackgroundDarkSecondary, overwrite)
    initial.add(
        "surfaceInverseReadOnlyHover",
        DarkColorTokens.SurfaceInverseReadOnlyHover,
        overwrite,
    )
    initial.add("surfaceInverseReadOnly", DarkColorTokens.SurfaceInverseReadOnly, overwrite)
    initial.add("backgroundDarkTertiary", DarkColorTokens.BackgroundDarkTertiary, overwrite)
    initial.add("backgroundDefaultPrimary", DarkColorTokens.BackgroundDefaultPrimary, overwrite)
    initial.add("overlayOnDarkSoft", DarkColorTokens.OverlayOnDarkSoft, overwrite)
    initial.add("overlayOnDarkHard", DarkColorTokens.OverlayOnDarkHard, overwrite)
    initial.add(
        "outlineDefaultTransparentPrimaryActive",
        DarkColorTokens.OutlineDefaultTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimary",
        DarkColorTokens.OutlineDefaultTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineDefaultTransparentPrimaryHover",
        DarkColorTokens.OutlineDefaultTransparentPrimaryHover,
        overwrite,
    )
    initial.add("overlayDefaultHard", DarkColorTokens.OverlayDefaultHard, overwrite)
    initial.add("overlayDefaultSoft", DarkColorTokens.OverlayDefaultSoft, overwrite)
    initial.add("overlayOnLightHard", DarkColorTokens.OverlayOnLightHard, overwrite)
    initial.add("overlayInverseSoft", DarkColorTokens.OverlayInverseSoft, overwrite)
    initial.add("overlayOnLightSoft", DarkColorTokens.OverlayOnLightSoft, overwrite)
    initial.add("overlayInverseHard", DarkColorTokens.OverlayInverseHard, overwrite)
    initial.add("outlineDefaultClear", DarkColorTokens.OutlineDefaultClear, overwrite)
    initial.add("backgroundInverseTertiary", DarkColorTokens.BackgroundInverseTertiary, overwrite)
    initial.add("backgroundInverseSecondary", DarkColorTokens.BackgroundInverseSecondary, overwrite)
    initial.add("backgroundLightTertiary", DarkColorTokens.BackgroundLightTertiary, overwrite)
    initial.add("outlineDefaultPositive", DarkColorTokens.OutlineDefaultPositive, overwrite)
    initial.add("outlineDefaultNegative", DarkColorTokens.OutlineDefaultNegative, overwrite)
    initial.add("outlineDefaultAccentHover", DarkColorTokens.OutlineDefaultAccentHover, overwrite)
    initial.add("outlineDefaultAccentActive", DarkColorTokens.OutlineDefaultAccentActive, overwrite)
    initial.add(
        "outlineDefaultPositiveActive",
        DarkColorTokens.OutlineDefaultPositiveActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultPositiveHover",
        DarkColorTokens.OutlineDefaultPositiveHover,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeActive",
        DarkColorTokens.OutlineDefaultNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineDefaultNegativeHover",
        DarkColorTokens.OutlineDefaultNegativeHover,
        overwrite,
    )
    initial.add("outlineDefaultClearHover", DarkColorTokens.OutlineDefaultClearHover, overwrite)
    initial.add("outlineDefaultInfoHover", DarkColorTokens.OutlineDefaultInfoHover, overwrite)
    initial.add("outlineDefaultWarningHover", DarkColorTokens.OutlineDefaultWarningHover, overwrite)
    initial.add("outlineDefaultClearActive", DarkColorTokens.OutlineDefaultClearActive, overwrite)
    initial.add("outlineDefaultWarning", DarkColorTokens.OutlineDefaultWarning, overwrite)
    initial.add(
        "outlineDefaultWarningActive",
        DarkColorTokens.OutlineDefaultWarningActive,
        overwrite,
    )
    initial.add("outlineDefaultInfo", DarkColorTokens.OutlineDefaultInfo, overwrite)
    initial.add("outlineDefaultInfoActive", DarkColorTokens.OutlineDefaultInfoActive, overwrite)
    initial.add(
        "outlineOnDarkTransparentPrimary",
        DarkColorTokens.OutlineOnDarkTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryActive",
        DarkColorTokens.OutlineOnDarkTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnDarkTransparentPrimaryHover",
        DarkColorTokens.OutlineOnDarkTransparentPrimaryHover,
        overwrite,
    )
    initial.add("outlineOnDarkWarning", DarkColorTokens.OutlineOnDarkWarning, overwrite)
    initial.add("outlineOnDarkAccent", DarkColorTokens.OutlineOnDarkAccent, overwrite)
    initial.add(
        "outlineOnDarkPositiveActive",
        DarkColorTokens.OutlineOnDarkPositiveActive,
        overwrite,
    )
    initial.add("outlineOnDarkPositiveHover", DarkColorTokens.OutlineOnDarkPositiveHover, overwrite)
    initial.add(
        "outlineOnDarkNegativeActive",
        DarkColorTokens.OutlineOnDarkNegativeActive,
        overwrite,
    )
    initial.add("outlineOnDarkPositive", DarkColorTokens.OutlineOnDarkPositive, overwrite)
    initial.add("outlineOnDarkNegativeHover", DarkColorTokens.OutlineOnDarkNegativeHover, overwrite)
    initial.add("outlineOnDarkAccentHover", DarkColorTokens.OutlineOnDarkAccentHover, overwrite)
    initial.add("outlineOnDarkClear", DarkColorTokens.OutlineOnDarkClear, overwrite)
    initial.add("outlineOnDarkInfoHover", DarkColorTokens.OutlineOnDarkInfoHover, overwrite)
    initial.add("outlineOnDarkInfoActive", DarkColorTokens.OutlineOnDarkInfoActive, overwrite)
    initial.add("outlineOnDarkInfo", DarkColorTokens.OutlineOnDarkInfo, overwrite)
    initial.add("outlineOnDarkClearHover", DarkColorTokens.OutlineOnDarkClearHover, overwrite)
    initial.add("outlineOnDarkClearActive", DarkColorTokens.OutlineOnDarkClearActive, overwrite)
    initial.add("outlineOnDarkWarningActive", DarkColorTokens.OutlineOnDarkWarningActive, overwrite)
    initial.add("outlineOnDarkNegative", DarkColorTokens.OutlineOnDarkNegative, overwrite)
    initial.add("outlineOnDarkWarningHover", DarkColorTokens.OutlineOnDarkWarningHover, overwrite)
    initial.add(
        "outlineOnLightPositiveHover",
        DarkColorTokens.OutlineOnLightPositiveHover,
        overwrite,
    )
    initial.add("outlineOnLightClear", DarkColorTokens.OutlineOnLightClear, overwrite)
    initial.add("outlineOnLightClearHover", DarkColorTokens.OutlineOnLightClearHover, overwrite)
    initial.add(
        "outlineOnLightTransparentPrimary",
        DarkColorTokens.OutlineOnLightTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryActive",
        DarkColorTokens.OutlineOnLightTransparentPrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightTransparentPrimaryHover",
        DarkColorTokens.OutlineOnLightTransparentPrimaryHover,
        overwrite,
    )
    initial.add("outlineOnLightAccentHover", DarkColorTokens.OutlineOnLightAccentHover, overwrite)
    initial.add("outlineOnLightPositive", DarkColorTokens.OutlineOnLightPositive, overwrite)
    initial.add("outlineOnLightAccentActive", DarkColorTokens.OutlineOnLightAccentActive, overwrite)
    initial.add("outlineOnLightClearActive", DarkColorTokens.OutlineOnLightClearActive, overwrite)
    initial.add(
        "outlineOnLightNegativeActive",
        DarkColorTokens.OutlineOnLightNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineOnLightNegativeHover",
        DarkColorTokens.OutlineOnLightNegativeHover,
        overwrite,
    )
    initial.add("outlineOnLightWarning", DarkColorTokens.OutlineOnLightWarning, overwrite)
    initial.add("outlineOnLightWarningHover", DarkColorTokens.OutlineOnLightWarningHover, overwrite)
    initial.add("outlineOnLightNegative", DarkColorTokens.OutlineOnLightNegative, overwrite)
    initial.add("outlineOnLightInfoHover", DarkColorTokens.OutlineOnLightInfoHover, overwrite)
    initial.add("outlineOnLightInfo", DarkColorTokens.OutlineOnLightInfo, overwrite)
    initial.add("outlineOnLightInfoActive", DarkColorTokens.OutlineOnLightInfoActive, overwrite)
    initial.add("outlineInverseAccentActive", DarkColorTokens.OutlineInverseAccentActive, overwrite)
    initial.add("outlineInverseClear", DarkColorTokens.OutlineInverseClear, overwrite)
    initial.add("outlineInverseClearActive", DarkColorTokens.OutlineInverseClearActive, overwrite)
    initial.add("outlineInverseClearHover", DarkColorTokens.OutlineInverseClearHover, overwrite)
    initial.add(
        "outlineInverseTransparentPrimaryHover",
        DarkColorTokens.OutlineInverseTransparentPrimaryHover,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimary",
        DarkColorTokens.OutlineInverseTransparentPrimary,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentPrimaryActive",
        DarkColorTokens.OutlineInverseTransparentPrimaryActive,
        overwrite,
    )
    initial.add("outlineInversePositive", DarkColorTokens.OutlineInversePositive, overwrite)
    initial.add("outlineInverseNegative", DarkColorTokens.OutlineInverseNegative, overwrite)
    initial.add("outlineInverseInfoHover", DarkColorTokens.OutlineInverseInfoHover, overwrite)
    initial.add("outlineInverseInfoActive", DarkColorTokens.OutlineInverseInfoActive, overwrite)
    initial.add(
        "outlineInversePositiveActive",
        DarkColorTokens.OutlineInversePositiveActive,
        overwrite,
    )
    initial.add(
        "outlineInversePositiveHover",
        DarkColorTokens.OutlineInversePositiveHover,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeActive",
        DarkColorTokens.OutlineInverseNegativeActive,
        overwrite,
    )
    initial.add(
        "outlineInverseNegativeHover",
        DarkColorTokens.OutlineInverseNegativeHover,
        overwrite,
    )
    initial.add(
        "outlineInverseWarningActive",
        DarkColorTokens.OutlineInverseWarningActive,
        overwrite,
    )
    initial.add("outlineInverseWarningHover", DarkColorTokens.OutlineInverseWarningHover, overwrite)
    initial.add("outlineInverseWarning", DarkColorTokens.OutlineInverseWarning, overwrite)
    initial.add("outlineInverseInfo", DarkColorTokens.OutlineInverseInfo, overwrite)
    initial.add(
        "surfaceInverseAccentMinorHover",
        DarkColorTokens.SurfaceInverseAccentMinorHover,
        overwrite,
    )
    initial.add("surfaceOnDarkSolidDefault", DarkColorTokens.SurfaceOnDarkSolidDefault, overwrite)
    initial.add(
        "surfaceOnLightAccentMinorActive",
        DarkColorTokens.SurfaceOnLightAccentMinorActive,
        overwrite,
    )
    initial.add("textDefaultPrimaryHover", DarkColorTokens.TextDefaultPrimaryHover, overwrite)
    initial.add("backgroundDarkPrimary", DarkColorTokens.BackgroundDarkPrimary, overwrite)
    initial.add("backgroundInverseHardline", DarkColorTokens.BackgroundInverseHardline, overwrite)
    initial.add("backgroundInversePrimary", DarkColorTokens.BackgroundInversePrimary, overwrite)
    initial.add("backgroundLightHardline", DarkColorTokens.BackgroundLightHardline, overwrite)
    initial.add("backgroundLightSecondary", DarkColorTokens.BackgroundLightSecondary, overwrite)
    initial.add("outlineDefaultAccent", DarkColorTokens.OutlineDefaultAccent, overwrite)
    initial.add("outlineDefaultDeep", DarkColorTokens.OutlineDefaultDeep, overwrite)
    initial.add("outlineDefaultDefault", DarkColorTokens.OutlineDefaultDefault, overwrite)
    initial.add(
        "outlineDefaultDefaultActive",
        DarkColorTokens.OutlineDefaultDefaultActive,
        overwrite,
    )
    initial.add("outlineDefaultDefaultHover", DarkColorTokens.OutlineDefaultDefaultHover, overwrite)
    initial.add(
        "outlineDefaultTransparentWhite",
        DarkColorTokens.OutlineDefaultTransparentWhite,
        overwrite,
    )
    initial.add("outlineInverseAccent", DarkColorTokens.OutlineInverseAccent, overwrite)
    initial.add("outlineInverseAccentHover", DarkColorTokens.OutlineInverseAccentHover, overwrite)
    initial.add("outlineInverseDefault", DarkColorTokens.OutlineInverseDefault, overwrite)
    initial.add(
        "outlineInverseDefaultActive",
        DarkColorTokens.OutlineInverseDefaultActive,
        overwrite,
    )
    initial.add("outlineOnLightDefaultHover", DarkColorTokens.OutlineOnLightDefaultHover, overwrite)
    initial.add("outlineOnLightPrimaryHover", DarkColorTokens.OutlineOnLightPrimaryHover, overwrite)
    initial.add(
        "personasDefaultBlueTextAccentHover",
        DarkColorTokens.PersonasDefaultBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultGreenTextAccentHover",
        DarkColorTokens.PersonasDefaultGreenTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultIndigoTextAccentHover",
        DarkColorTokens.PersonasDefaultIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasDefaultSeaBlueTextAccentHover",
        DarkColorTokens.PersonasDefaultSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkBlueTextAccentHover",
        DarkColorTokens.PersonasOnDarkBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkOliveTextAccentHover",
        DarkColorTokens.PersonasOnDarkOliveTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkSeaBlueTextAccentHover",
        DarkColorTokens.PersonasOnDarkSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnDarkVioletTextAccentHover",
        DarkColorTokens.PersonasOnDarkVioletTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightIndigoTextAccentHover",
        DarkColorTokens.PersonasOnLightIndigoTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightPinkTextAccentHover",
        DarkColorTokens.PersonasOnLightPinkTextAccentHover,
        overwrite,
    )
    initial.add(
        "personasOnLightSeaBlueTextAccentHover",
        DarkColorTokens.PersonasOnLightSeaBlueTextAccentHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorHover",
        DarkColorTokens.SurfaceDefaultAccentMinorHover,
        overwrite,
    )
    initial.add(
        "surfaceInverseAccentSecondaryHover",
        DarkColorTokens.SurfaceInverseAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnDarkAccentSecondaryHover",
        DarkColorTokens.SurfaceOnDarkAccentSecondaryHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentDeepHover",
        DarkColorTokens.SurfaceOnLightTransparentDeepHover,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentSecondaryHover",
        DarkColorTokens.SurfaceOnLightTransparentSecondaryHover,
        overwrite,
    )
    initial.add("textDefaultAccentHover", DarkColorTokens.TextDefaultAccentHover, overwrite)
    initial.add(
        "outlineInversePrimaryActive",
        DarkColorTokens.OutlineInversePrimaryActive,
        overwrite,
    )
    initial.add(
        "outlineInverseTransparentWhiteActive",
        DarkColorTokens.OutlineInverseTransparentWhiteActive,
        overwrite,
    )
    initial.add("outlineOnDarkAccentActive", DarkColorTokens.OutlineOnDarkAccentActive, overwrite)
    initial.add("outlineOnDarkDefaultActive", DarkColorTokens.OutlineOnDarkDefaultActive, overwrite)
    initial.add("outlineOnDarkPrimaryActive", DarkColorTokens.OutlineOnDarkPrimaryActive, overwrite)
    initial.add(
        "personasDefaultOchreTextAccentActive",
        DarkColorTokens.PersonasDefaultOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultOliveTextAccentActive",
        DarkColorTokens.PersonasDefaultOliveTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasDefaultVioletTextAccentActive",
        DarkColorTokens.PersonasDefaultVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseSeaBlueTextAccentActive",
        DarkColorTokens.PersonasInverseSeaBlueTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasInverseVioletTextAccentActive",
        DarkColorTokens.PersonasInverseVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightGreenTextAccentActive",
        DarkColorTokens.PersonasOnLightGreenTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightOchreTextAccentActive",
        DarkColorTokens.PersonasOnLightOchreTextAccentActive,
        overwrite,
    )
    initial.add(
        "personasOnLightVioletTextAccentActive",
        DarkColorTokens.PersonasOnLightVioletTextAccentActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultAccentMinorActive",
        DarkColorTokens.SurfaceDefaultAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryActive",
        DarkColorTokens.SurfaceDefaultSolidPrimaryActive,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightnessHover",
        DarkColorTokens.SurfaceDefaultSolidPrimaryBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultTransparentNaviActive",
        DarkColorTokens.SurfaceDefaultTransparentNaviActive,
        overwrite,
    )
    initial.add("surfaceInverseAccentActive", DarkColorTokens.SurfaceInverseAccentActive, overwrite)
    initial.add(
        "surfaceInverseAccentMinorActive",
        DarkColorTokens.SurfaceInverseAccentMinorActive,
        overwrite,
    )
    initial.add(
        "surfaceInverseSolidSecondaryActive",
        DarkColorTokens.SurfaceInverseSolidSecondaryActive,
        overwrite,
    )
    initial.add(
        "surfaceOnLightTransparentAccentMinorActive",
        DarkColorTokens.SurfaceOnLightTransparentAccentMinorActive,
        overwrite,
    )
    initial.add("textOnDarkAccentActive", DarkColorTokens.TextOnDarkAccentActive, overwrite)
    initial.add("outlineOnLightAccent", DarkColorTokens.OutlineOnLightAccent, overwrite)
    initial.add("outlineOnLightPrimary", DarkColorTokens.OutlineOnLightPrimary, overwrite)
    initial.add(
        "personasInverseSeaBlueTextAccent",
        DarkColorTokens.PersonasInverseSeaBlueTextAccent,
        overwrite,
    )
    initial.add("surfaceDefaultAccent", DarkColorTokens.SurfaceDefaultAccent, overwrite)
    initial.add("surfaceDefaultInfo", DarkColorTokens.SurfaceDefaultInfo, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightnessActive",
        DarkColorTokens.SurfaceDefaultSolidCardBrightnessActive,
        overwrite,
    )
    initial.add("surfaceDefaultSolidDefault", DarkColorTokens.SurfaceDefaultSolidDefault, overwrite)
    initial.add(
        "surfaceDefaultTransparentNavi",
        DarkColorTokens.SurfaceDefaultTransparentNavi,
        overwrite,
    )
    initial.add("surfaceInverseAccent", DarkColorTokens.SurfaceInverseAccent, overwrite)
    initial.add("surfaceInverseSolidPrimary", DarkColorTokens.SurfaceInverseSolidPrimary, overwrite)
    initial.add("surfaceOnDarkAccentMinor", DarkColorTokens.SurfaceOnDarkAccentMinor, overwrite)
    initial.add("surfaceOnLightClear", DarkColorTokens.SurfaceOnLightClear, overwrite)
    initial.add(
        "textDefaultPrimaryBrightnessActive",
        DarkColorTokens.TextDefaultPrimaryBrightnessActive,
        overwrite,
    )
    initial.add("textInverseAccent", DarkColorTokens.TextInverseAccent, overwrite)
    initial.add("textOnDarkAccent", DarkColorTokens.TextOnDarkAccent, overwrite)
    initial.add("backgroundDarkHardline", DarkColorTokens.BackgroundDarkHardline, overwrite)
    initial.add(
        "surfaceDefaultSolidCardBrightnessHover",
        DarkColorTokens.SurfaceDefaultSolidCardBrightnessHover,
        overwrite,
    )
    initial.add(
        "surfaceDefaultSolidPrimaryBrightness",
        DarkColorTokens.SurfaceDefaultSolidPrimaryBrightness,
        overwrite,
    )
    initial.add("surfaceInverseSolidDefault", DarkColorTokens.SurfaceInverseSolidDefault, overwrite)
    initial.add(
        "surfaceOnDarkSolidCardBrightnessActive",
        DarkColorTokens.SurfaceOnDarkSolidCardBrightnessActive,
        overwrite,
    )
    initial.add("textOnDarkParagraphActive", DarkColorTokens.TextOnDarkParagraphActive, overwrite)
    initial.add("overlayDefaultMedium", DarkColorTokens.OverlayDefaultMedium, overwrite)
    initial.add("overlayInverseMedium", DarkColorTokens.OverlayInverseMedium, overwrite)
    initial.add("overlayOnDarkMedium", DarkColorTokens.OverlayOnDarkMedium, overwrite)
    initial.add("overlayOnLightMedium", DarkColorTokens.OverlayOnLightMedium, overwrite)
    return SddsSbComColors(initial)
}

private fun Map<String, Color>.obtain(name: String): MutableState<Color> =
    mutableStateOf(get(name)!!, structuralEqualityPolicy())
