@file:Suppress("LongMethod", "LongParameterList", "UndocumentedPublicProperty", "UnnecessaryAbstractClass")

package com.sdds.compose.uikit.theme

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Контракт цветовой палитры SDDS
 * @author Малышев Александр on 23.04.2024
 */
@Stable
abstract class CoreColors {

    abstract var textPrimary: Color
        internal set
    abstract var textSecondary: Color
        internal set
    abstract var textTertiary: Color
        internal set
    abstract var textParagraph: Color
        internal set
    abstract var textAccent: Color
        internal set
    abstract var textAccentAthena: Color
        internal set
    abstract var textAccentJoy: Color
        internal set
    abstract var textAccentB2E: Color
        internal set
    abstract var textAccentBrand: Color
        internal set
    abstract var textPositive: Color
        internal set
    abstract var textWarning: Color
        internal set
    abstract var textNegative: Color
        internal set
    abstract var onDarkTextPrimary: Color
        internal set
    abstract var onDarkTextSecondary: Color
        internal set
    abstract var onDarkTextTertiary: Color
        internal set
    abstract var onDarkTextParagraph: Color
        internal set
    abstract var onDarkTextAccent: Color
        internal set
    abstract var onDarkTextAccentAthena: Color
        internal set
    abstract var onDarkTextAccentJoy: Color
        internal set
    abstract var onDarkTextAccentB2E: Color
        internal set
    abstract var onDarkTextAccentBrand: Color
        internal set
    abstract var onDarkTextPositive: Color
        internal set
    abstract var onDarkTextWarning: Color
        internal set
    abstract var onDarkTextNegative: Color
        internal set
    abstract var onLightTextPrimary: Color
        internal set
    abstract var onLightTextSecondary: Color
        internal set
    abstract var onLightTextTertiary: Color
        internal set
    abstract var onLightTextParagraph: Color
        internal set
    abstract var onLightTextAccent: Color
        internal set
    abstract var onLightTextAccentAthena: Color
        internal set
    abstract var onLightTextAccentJoy: Color
        internal set
    abstract var onLightTextAccentB2E: Color
        internal set
    abstract var onLightTextAccentBrand: Color
        internal set
    abstract var onLightTextPositive: Color
        internal set
    abstract var onLightTextWarning: Color
        internal set
    abstract var onLightTextNegative: Color
        internal set
    abstract var surfaceSolidCard: Color
        internal set
    abstract var surfaceSolidPrimary: Color
        internal set
    abstract var surfaceSolidSecondary: Color
        internal set
    abstract var surfaceSolidTertiary: Color
        internal set
    abstract var surfaceSolidDefault: Color
        internal set
    abstract var surfaceTransparentCard: Color
        internal set
    abstract var surfaceTransparentPrimary: Color
        internal set
    abstract var surfaceTransparentSecondary: Color
        internal set
    abstract var surfaceTransparentTertiary: Color
        internal set
    abstract var surfaceClear: Color
        internal set
    abstract var surfaceAccent: Color
        internal set
    abstract var surfaceAccentAthena: Color
        internal set
    abstract var surfaceAccentJoy: Color
        internal set
    abstract var surfaceAccentB2E: Color
        internal set
    abstract var surfaceAccentBrand: Color
        internal set
    abstract var surfacePositive: Color
        internal set
    abstract var surfaceWarning: Color
        internal set
    abstract var surfaceNegative: Color
        internal set
    abstract var surfaceSpeechBubbleSent: Color
        internal set
    abstract var surfaceSpeechBubbleReceived: Color
        internal set
    abstract var onDarkSurfaceSolidCard: Color
        internal set
    abstract var onDarkSurfaceSolidPrimary: Color
        internal set
    abstract var onDarkSurfaceSolidSecondary: Color
        internal set
    abstract var onDarkSurfaceSolidTertiary: Color
        internal set
    abstract var onDarkSurfaceSolidDefault: Color
        internal set
    abstract var onDarkSurfaceTransparentCard: Color
        internal set
    abstract var onDarkSurfaceTransparentPrimary: Color
        internal set
    abstract var onDarkSurfaceTransparentSecondary: Color
        internal set
    abstract var onDarkSurfaceTransparentTertiary: Color
        internal set
    abstract var onDarkSurfaceAccent: Color
        internal set
    abstract var onDarkSurfaceAccentAthena: Color
        internal set
    abstract var onDarkSurfaceAccentJoy: Color
        internal set
    abstract var onDarkSurfaceAccentB2E: Color
        internal set
    abstract var onDarkSurfaceAccentBrand: Color
        internal set
    abstract var onDarkSurfacePositive: Color
        internal set
    abstract var onDarkSurfaceWarning: Color
        internal set
    abstract var onDarkSurfaceNegative: Color
        internal set
    abstract var onLightSurfaceSolidCard: Color
        internal set
    abstract var onLightSurfaceSolidPrimary: Color
        internal set
    abstract var onLightSurfaceSolidSecondary: Color
        internal set
    abstract var onLightSurfaceSolidTertiary: Color
        internal set
    abstract var onLightSurfaceSolidDefault: Color
        internal set
    abstract var onLightSurfaceTransparentCard: Color
        internal set
    abstract var onLightSurfaceTransparentPrimary: Color
        internal set
    abstract var onLightSurfaceTransparentSecondary: Color
        internal set
    abstract var onLightSurfaceTransparentTertiary: Color
        internal set
    abstract var onLightSurfaceTransparentDeep: Color
        internal set
    abstract var onLightSurfaceAccent: Color
        internal set
    abstract var onLightSurfaceAccentAthena: Color
        internal set
    abstract var onLightSurfaceAccentJoy: Color
        internal set
    abstract var onLightSurfaceAccentB2E: Color
        internal set
    abstract var onLightSurfaceAccentBrand: Color
        internal set
    abstract var onLightSurfacePositive: Color
        internal set
    abstract var onLightSurfaceWarning: Color
        internal set
    abstract var onLightSurfaceNegative: Color
        internal set
    abstract var backgroundPrimary: Color
        internal set
    abstract var backgroundSecondary: Color
        internal set
    abstract var darkOverlayHard: Color
        internal set
    abstract var darkOverlaySoft: Color
        internal set
    abstract var darkOverlayBlur: Color
        internal set
    abstract var inverseTextPrimary: Color
        internal set
    abstract var inverseTextSecondary: Color
        internal set
    abstract var inverseTextTertiary: Color
        internal set
    abstract var inverseTextParagraph: Color
        internal set

    /**
     * Копирует текущий экземпляр с изменениями
     */
    abstract fun copy(
        textPrimary: Color = this.textPrimary,
        textSecondary: Color = this.textSecondary,
        textTertiary: Color = this.textTertiary,
        textParagraph: Color = this.textParagraph,
        textAccent: Color = this.textAccent,
        textAccentAthena: Color = this.textAccentAthena,
        textAccentJoy: Color = this.textAccentJoy,
        textAccentB2E: Color = this.textAccentB2E,
        textAccentBrand: Color = this.textAccentBrand,
        textPositive: Color = this.textPositive,
        textWarning: Color = this.textWarning,
        textNegative: Color = this.textNegative,
        onDarkTextPrimary: Color = this.onDarkTextPrimary,
        onDarkTextSecondary: Color = this.onDarkTextSecondary,
        onDarkTextTertiary: Color = this.onDarkTextTertiary,
        onDarkTextParagraph: Color = this.onDarkTextParagraph,
        onDarkTextAccent: Color = this.onDarkTextAccent,
        onDarkTextAccentAthena: Color = this.onDarkTextAccentAthena,
        onDarkTextAccentJoy: Color = this.onDarkTextAccentJoy,
        onDarkTextAccentB2E: Color = this.onDarkTextAccentB2E,
        onDarkTextAccentBrand: Color = this.onDarkTextAccentBrand,
        onDarkTextPositive: Color = this.onDarkTextPositive,
        onDarkTextWarning: Color = this.onDarkTextWarning,
        onDarkTextNegative: Color = this.onDarkTextNegative,
        onLightTextPrimary: Color = this.onLightTextPrimary,
        onLightTextSecondary: Color = this.onLightTextSecondary,
        onLightTextTertiary: Color = this.onLightTextTertiary,
        onLightTextParagraph: Color = this.onLightTextParagraph,
        onLightTextAccent: Color = this.onLightTextAccent,
        onLightTextAccentAthena: Color = this.onLightTextAccentAthena,
        onLightTextAccentJoy: Color = this.onLightTextAccentJoy,
        onLightTextAccentB2E: Color = this.onLightTextAccentB2E,
        onLightTextAccentBrand: Color = this.onLightTextAccentBrand,
        onLightTextPositive: Color = this.onLightTextPositive,
        onLightTextWarning: Color = this.onLightTextWarning,
        onLightTextNegative: Color = this.onLightTextNegative,
        surfaceSolidCard: Color = this.surfaceSolidCard,
        surfaceSolidPrimary: Color = this.surfaceSolidPrimary,
        surfaceSolidSecondary: Color = this.surfaceSolidSecondary,
        surfaceSolidTertiary: Color = this.surfaceSolidTertiary,
        surfaceSolidDefault: Color = this.surfaceSolidDefault,
        surfaceTransparentCard: Color = this.surfaceTransparentCard,
        surfaceTransparentPrimary: Color = this.surfaceTransparentPrimary,
        surfaceTransparentSecondary: Color = this.surfaceTransparentSecondary,
        surfaceTransparentTertiary: Color = this.surfaceTransparentTertiary,
        surfaceClear: Color = this.surfaceClear,
        surfaceAccent: Color = this.surfaceAccent,
        surfaceAccentAthena: Color = this.surfaceAccentAthena,
        surfaceAccentJoy: Color = this.surfaceAccentJoy,
        surfaceAccentB2E: Color = this.surfaceAccentB2E,
        surfaceAccentBrand: Color = this.surfaceAccentBrand,
        surfacePositive: Color = this.surfacePositive,
        surfaceWarning: Color = this.surfaceWarning,
        surfaceNegative: Color = this.surfaceNegative,
        surfaceSpeechBubbleSent: Color = this.surfaceSpeechBubbleSent,
        surfaceSpeechBubbleReceived: Color = this.surfaceSpeechBubbleReceived,
        onDarkSurfaceSolidCard: Color = this.onDarkSurfaceSolidCard,
        onDarkSurfaceSolidPrimary: Color = this.onDarkSurfaceSolidPrimary,
        onDarkSurfaceSolidSecondary: Color = this.onDarkSurfaceSolidSecondary,
        onDarkSurfaceSolidTertiary: Color = this.onDarkSurfaceSolidTertiary,
        onDarkSurfaceSolidDefault: Color = this.onDarkSurfaceSolidDefault,
        onDarkSurfaceTransparentCard: Color = this.onDarkSurfaceTransparentCard,
        onDarkSurfaceTransparentPrimary: Color = this.onDarkSurfaceTransparentPrimary,
        onDarkSurfaceTransparentSecondary: Color = this.onDarkSurfaceTransparentSecondary,
        onDarkSurfaceTransparentTertiary: Color = this.onDarkSurfaceTransparentTertiary,
        onDarkSurfaceAccent: Color = this.onDarkSurfaceAccent,
        onDarkSurfaceAccentAthena: Color = this.onDarkSurfaceAccentAthena,
        onDarkSurfaceAccentJoy: Color = this.onDarkSurfaceAccentJoy,
        onDarkSurfaceAccentB2E: Color = this.onDarkSurfaceAccentB2E,
        onDarkSurfaceAccentBrand: Color = this.onDarkSurfaceAccentBrand,
        onDarkSurfacePositive: Color = this.onDarkSurfacePositive,
        onDarkSurfaceWarning: Color = this.onDarkSurfaceWarning,
        onDarkSurfaceNegative: Color = this.onDarkSurfaceNegative,
        onLightSurfaceSolidCard: Color = this.onLightSurfaceSolidCard,
        onLightSurfaceSolidPrimary: Color = this.onLightSurfaceSolidPrimary,
        onLightSurfaceSolidSecondary: Color = this.onLightSurfaceSolidSecondary,
        onLightSurfaceSolidTertiary: Color = this.onLightSurfaceSolidTertiary,
        onLightSurfaceSolidDefault: Color = this.onLightSurfaceSolidDefault,
        onLightSurfaceTransparentCard: Color = this.onLightSurfaceTransparentCard,
        onLightSurfaceTransparentPrimary: Color = this.onLightSurfaceTransparentPrimary,
        onLightSurfaceTransparentSecondary: Color = this.onLightSurfaceTransparentSecondary,
        onLightSurfaceTransparentTertiary: Color = this.onLightSurfaceTransparentTertiary,
        onLightSurfaceTransparentDeep: Color = this.onLightSurfaceTransparentDeep,
        onLightSurfaceAccent: Color = this.onLightSurfaceAccent,
        onLightSurfaceAccentAthena: Color = this.onLightSurfaceAccentAthena,
        onLightSurfaceAccentJoy: Color = this.onLightSurfaceAccentJoy,
        onLightSurfaceAccentB2E: Color = this.onLightSurfaceAccentB2E,
        onLightSurfaceAccentBrand: Color = this.onLightSurfaceAccentBrand,
        onLightSurfacePositive: Color = this.onLightSurfacePositive,
        onLightSurfaceWarning: Color = this.onLightSurfaceWarning,
        onLightSurfaceNegative: Color = this.onLightSurfaceNegative,
        backgroundPrimary: Color = this.backgroundPrimary,
        backgroundSecondary: Color = this.backgroundSecondary,
        darkOverlayHard: Color = this.darkOverlayHard,
        darkOverlaySoft: Color = this.darkOverlaySoft,
        darkOverlayBlur: Color = this.darkOverlayBlur,
        inverseTextPrimary: Color = this.inverseTextPrimary,
        inverseTextSecondary: Color = this.inverseTextSecondary,
        inverseTextTertiary: Color = this.inverseTextTertiary,
        inverseTextParagraph: Color = this.inverseTextParagraph,
    ): CoreColors

    /**
     * Устанавливает цвета из объекта [other] в текущий объект
     */
    abstract fun updateColorsFrom(other: CoreColors)

    override fun toString(): String {
        return "${this::class.simpleName}(" +
            "textPrimary=$textPrimary, " +
            "textSecondary=$textSecondary, " +
            "textTertiary=$textTertiary, " +
            "textParagraph=$textParagraph, " +
            "textAccent=$textAccent, " +
            "textAccentAthena=$textAccentAthena, " +
            "textAccentJoy=$textAccentJoy, " +
            "textAccentB2E=$textAccentB2E, " +
            "textAccentBrand=$textAccentBrand, " +
            "textPositive=$textPositive, " +
            "textWarning=$textWarning, " +
            "textNegative=$textNegative, " +
            "onDarkTextPrimary=$onDarkTextPrimary, " +
            "onDarkTextSecondary=$onDarkTextSecondary, " +
            "onDarkTextTertiary=$onDarkTextTertiary, " +
            "onDarkTextParagraph=$onDarkTextParagraph, " +
            "onDarkTextAccent=$onDarkTextAccent, " +
            "onDarkTextAccentAthena=$onDarkTextAccentAthena, " +
            "onDarkTextAccentJoy=$onDarkTextAccentJoy, " +
            "onDarkTextAccentB2E=$onDarkTextAccentB2E, " +
            "onDarkTextAccentBrand=$onDarkTextAccentBrand, " +
            "onDarkTextPositive=$onDarkTextPositive, " +
            "onDarkTextWarning=$onDarkTextWarning, " +
            "onDarkTextNegative=$onDarkTextNegative, " +
            "onLightTextPrimary=$onLightTextPrimary, " +
            "onLightTextSecondary=$onLightTextSecondary, " +
            "onLightTextTertiary=$onLightTextTertiary, " +
            "onLightTextParagraph=$onLightTextParagraph, " +
            "onLightTextAccent=$onLightTextAccent, " +
            "onLightTextAccentAthena=$onLightTextAccentAthena, " +
            "onLightTextAccentJoy=$onLightTextAccentJoy, " +
            "onLightTextAccentB2E=$onLightTextAccentB2E, " +
            "onLightTextAccentBrand=$onLightTextAccentBrand, " +
            "onLightTextPositive=$onLightTextPositive, " +
            "onLightTextWarning=$onLightTextWarning, " +
            "onLightTextNegative=$onLightTextNegative, " +
            "surfaceSolidCard=$surfaceSolidCard, " +
            "surfaceSolidPrimary=$surfaceSolidPrimary, " +
            "surfaceSolidSecondary=$surfaceSolidSecondary, " +
            "surfaceSolidTertiary=$surfaceSolidTertiary, " +
            "surfaceSolidDefault=$surfaceSolidDefault, " +
            "surfaceTransparentCard=$surfaceTransparentCard, " +
            "surfaceTransparentPrimary=$surfaceTransparentPrimary, " +
            "surfaceTransparentSecondary=$surfaceTransparentSecondary, " +
            "surfaceTransparentTertiary=$surfaceTransparentTertiary, " +
            "surfaceClear=$surfaceClear, " +
            "surfaceAccent=$surfaceAccent, " +
            "surfaceAccentAthena=$surfaceAccentAthena, " +
            "surfaceAccentJoy=$surfaceAccentJoy, " +
            "surfaceAccentB2E=$surfaceAccentB2E, " +
            "surfaceAccentBrand=$surfaceAccentBrand, " +
            "surfacePositive=$surfacePositive, " +
            "surfaceWarning=$surfaceWarning, " +
            "surfaceNegative=$surfaceNegative, " +
            "surfaceSpeechBubbleSent=$surfaceSpeechBubbleSent, " +
            "surfaceSpeechBubbleReceived=$surfaceSpeechBubbleReceived, " +
            "onDarkSurfaceSolidCard=$onDarkSurfaceSolidCard, " +
            "onDarkSurfaceSolidPrimary=$onDarkSurfaceSolidPrimary, " +
            "onDarkSurfaceSolidSecondary=$onDarkSurfaceSolidSecondary, " +
            "onDarkSurfaceSolidTertiary=$onDarkSurfaceSolidTertiary, " +
            "onDarkSurfaceSolidDefault=$onDarkSurfaceSolidDefault, " +
            "onDarkSurfaceTransparentCard=$onDarkSurfaceTransparentCard, " +
            "onDarkSurfaceTransparentPrimary=$onDarkSurfaceTransparentPrimary, " +
            "onDarkSurfaceTransparentSecondary=$onDarkSurfaceTransparentSecondary, " +
            "onDarkSurfaceTransparentTertiary=$onDarkSurfaceTransparentTertiary, " +
            "onDarkSurfaceAccent=$onDarkSurfaceAccent, " +
            "onDarkSurfaceAccentAthena=$onDarkSurfaceAccentAthena, " +
            "onDarkSurfaceAccentJoy=$onDarkSurfaceAccentJoy, " +
            "onDarkSurfaceAccentB2E=$onDarkSurfaceAccentB2E, " +
            "onDarkSurfaceAccentBrand=$onDarkSurfaceAccentBrand, " +
            "onDarkSurfacePositive=$onDarkSurfacePositive, " +
            "onDarkSurfaceWarning=$onDarkSurfaceWarning, " +
            "onDarkSurfaceNegative=$onDarkSurfaceNegative, " +
            "onLightSurfaceSolidCard=$onLightSurfaceSolidCard, " +
            "onLightSurfaceSolidPrimary=$onLightSurfaceSolidPrimary, " +
            "onLightSurfaceSolidSecondary=$onLightSurfaceSolidSecondary, " +
            "onLightSurfaceSolidTertiary=$onLightSurfaceSolidTertiary, " +
            "onLightSurfaceSolidDefault=$onLightSurfaceSolidDefault, " +
            "onLightSurfaceTransparentCard=$onLightSurfaceTransparentCard, " +
            "onLightSurfaceTransparentPrimary=$onLightSurfaceTransparentPrimary, " +
            "onLightSurfaceTransparentSecondary=$onLightSurfaceTransparentSecondary, " +
            "onLightSurfaceTransparentTertiary=$onLightSurfaceTransparentTertiary, " +
            "onLightSurfaceTransparentDeep=$onLightSurfaceTransparentDeep, " +
            "onLightSurfaceAccent=$onLightSurfaceAccent, " +
            "onLightSurfaceAccentAthena=$onLightSurfaceAccentAthena, " +
            "onLightSurfaceAccentJoy=$onLightSurfaceAccentJoy, " +
            "onLightSurfaceAccentB2E=$onLightSurfaceAccentB2E, " +
            "onLightSurfaceAccentBrand=$onLightSurfaceAccentBrand, " +
            "onLightSurfacePositive=$onLightSurfacePositive, " +
            "onLightSurfaceWarning=$onLightSurfaceWarning, " +
            "onLightSurfaceNegative=$onLightSurfaceNegative, " +
            "backgroundPrimary=$backgroundPrimary, " +
            "backgroundSecondary=$backgroundSecondary, " +
            "darkOverlayHard=$darkOverlayHard, " +
            "darkOverlaySoft=$darkOverlaySoft, " +
            "darkOverlayBlur=$darkOverlayBlur, " +
            "inverseTextPrimary=$inverseTextPrimary, " +
            "inverseTextSecondary=$inverseTextSecondary, " +
            "inverseTextTertiary=$inverseTextTertiary, " +
            "inverseTextParagraph=$inverseTextParagraph" +
            ")"
    }
}

/**
 * CompositionLocal цветовой палитры
 */
val LocalColors = staticCompositionLocalOf { debugColors() }

private fun debugColors(): CoreColors =
    CoreColorsImpl(
        textPrimary = Color.Black,
        textSecondary = Color.Black,
        textTertiary = Color.Black,
        textParagraph = Color.Black,
        textAccent = Color.Black,
        textAccentAthena = Color.Black,
        textAccentJoy = Color.Black,
        textAccentB2E = Color.Black,
        textAccentBrand = Color.Black,
        textPositive = Color.Black,
        textWarning = Color.Black,
        textNegative = Color.Black,
        onDarkTextPrimary = Color.Black,
        onDarkTextSecondary = Color.Black,
        onDarkTextTertiary = Color.Black,
        onDarkTextParagraph = Color.Black,
        onDarkTextAccent = Color.Black,
        onDarkTextAccentAthena = Color.Black,
        onDarkTextAccentJoy = Color.Black,
        onDarkTextAccentB2E = Color.Black,
        onDarkTextAccentBrand = Color.Black,
        onDarkTextPositive = Color.Black,
        onDarkTextWarning = Color.Black,
        onDarkTextNegative = Color.Black,
        onLightTextPrimary = Color.Black,
        onLightTextSecondary = Color.Black,
        onLightTextTertiary = Color.Black,
        onLightTextParagraph = Color.Black,
        onLightTextAccent = Color.Black,
        onLightTextAccentAthena = Color.Black,
        onLightTextAccentJoy = Color.Black,
        onLightTextAccentB2E = Color.Black,
        onLightTextAccentBrand = Color.Black,
        onLightTextPositive = Color.Black,
        onLightTextWarning = Color.Black,
        onLightTextNegative = Color.Black,
        surfaceSolidCard = Color.Black,
        surfaceSolidPrimary = Color.Black,
        surfaceSolidSecondary = Color.Black,
        surfaceSolidTertiary = Color.Black,
        surfaceSolidDefault = Color.Black,
        surfaceTransparentCard = Color.Black,
        surfaceTransparentPrimary = Color.Black,
        surfaceTransparentSecondary = Color.Black,
        surfaceTransparentTertiary = Color.Black,
        surfaceClear = Color.Black,
        surfaceAccent = Color.Black,
        surfaceAccentAthena = Color.Black,
        surfaceAccentJoy = Color.Black,
        surfaceAccentB2E = Color.Black,
        surfaceAccentBrand = Color.Black,
        surfacePositive = Color.Black,
        surfaceWarning = Color.Black,
        surfaceNegative = Color.Black,
        surfaceSpeechBubbleSent = Color.Black,
        surfaceSpeechBubbleReceived = Color.Black,
        onDarkSurfaceSolidCard = Color.Black,
        onDarkSurfaceSolidPrimary = Color.Black,
        onDarkSurfaceSolidSecondary = Color.Black,
        onDarkSurfaceSolidTertiary = Color.Black,
        onDarkSurfaceSolidDefault = Color.Black,
        onDarkSurfaceTransparentCard = Color.Black,
        onDarkSurfaceTransparentPrimary = Color.Black,
        onDarkSurfaceTransparentSecondary = Color.Black,
        onDarkSurfaceTransparentTertiary = Color.Black,
        onDarkSurfaceAccent = Color.Black,
        onDarkSurfaceAccentAthena = Color.Black,
        onDarkSurfaceAccentJoy = Color.Black,
        onDarkSurfaceAccentB2E = Color.Black,
        onDarkSurfaceAccentBrand = Color.Black,
        onDarkSurfacePositive = Color.Black,
        onDarkSurfaceWarning = Color.Black,
        onDarkSurfaceNegative = Color.Black,
        onLightSurfaceSolidCard = Color.Black,
        onLightSurfaceSolidPrimary = Color.Black,
        onLightSurfaceSolidSecondary = Color.Black,
        onLightSurfaceSolidTertiary = Color.Black,
        onLightSurfaceSolidDefault = Color.Black,
        onLightSurfaceTransparentCard = Color.Black,
        onLightSurfaceTransparentPrimary = Color.Black,
        onLightSurfaceTransparentSecondary = Color.Black,
        onLightSurfaceTransparentTertiary = Color.Black,
        onLightSurfaceTransparentDeep = Color.Black,
        onLightSurfaceAccent = Color.Black,
        onLightSurfaceAccentAthena = Color.Black,
        onLightSurfaceAccentJoy = Color.Black,
        onLightSurfaceAccentB2E = Color.Black,
        onLightSurfaceAccentBrand = Color.Black,
        onLightSurfacePositive = Color.Black,
        onLightSurfaceWarning = Color.Black,
        onLightSurfaceNegative = Color.Black,
        backgroundPrimary = Color.Black,
        backgroundSecondary = Color.Black,
        darkOverlayHard = Color.Black,
        darkOverlaySoft = Color.Black,
        darkOverlayBlur = Color.Black,
        inverseTextPrimary = Color.Black,
        inverseTextSecondary = Color.Black,
        inverseTextTertiary = Color.Black,
        inverseTextParagraph = Color.Black,
    )

private class CoreColorsImpl(
    textPrimary: Color,
    textSecondary: Color,
    textTertiary: Color,
    textParagraph: Color,
    textAccent: Color,
    textAccentAthena: Color,
    textAccentJoy: Color,
    textAccentB2E: Color,
    textAccentBrand: Color,
    textPositive: Color,
    textWarning: Color,
    textNegative: Color,
    onDarkTextPrimary: Color,
    onDarkTextSecondary: Color,
    onDarkTextTertiary: Color,
    onDarkTextParagraph: Color,
    onDarkTextAccent: Color,
    onDarkTextAccentAthena: Color,
    onDarkTextAccentJoy: Color,
    onDarkTextAccentB2E: Color,
    onDarkTextAccentBrand: Color,
    onDarkTextPositive: Color,
    onDarkTextWarning: Color,
    onDarkTextNegative: Color,
    onLightTextPrimary: Color,
    onLightTextSecondary: Color,
    onLightTextTertiary: Color,
    onLightTextParagraph: Color,
    onLightTextAccent: Color,
    onLightTextAccentAthena: Color,
    onLightTextAccentJoy: Color,
    onLightTextAccentB2E: Color,
    onLightTextAccentBrand: Color,
    onLightTextPositive: Color,
    onLightTextWarning: Color,
    onLightTextNegative: Color,
    surfaceSolidCard: Color,
    surfaceSolidPrimary: Color,
    surfaceSolidSecondary: Color,
    surfaceSolidTertiary: Color,
    surfaceSolidDefault: Color,
    surfaceTransparentCard: Color,
    surfaceTransparentPrimary: Color,
    surfaceTransparentSecondary: Color,
    surfaceTransparentTertiary: Color,
    surfaceClear: Color,
    surfaceAccent: Color,
    surfaceAccentAthena: Color,
    surfaceAccentJoy: Color,
    surfaceAccentB2E: Color,
    surfaceAccentBrand: Color,
    surfacePositive: Color,
    surfaceWarning: Color,
    surfaceNegative: Color,
    surfaceSpeechBubbleSent: Color,
    surfaceSpeechBubbleReceived: Color,
    onDarkSurfaceSolidCard: Color,
    onDarkSurfaceSolidPrimary: Color,
    onDarkSurfaceSolidSecondary: Color,
    onDarkSurfaceSolidTertiary: Color,
    onDarkSurfaceSolidDefault: Color,
    onDarkSurfaceTransparentCard: Color,
    onDarkSurfaceTransparentPrimary: Color,
    onDarkSurfaceTransparentSecondary: Color,
    onDarkSurfaceTransparentTertiary: Color,
    onDarkSurfaceAccent: Color,
    onDarkSurfaceAccentAthena: Color,
    onDarkSurfaceAccentJoy: Color,
    onDarkSurfaceAccentB2E: Color,
    onDarkSurfaceAccentBrand: Color,
    onDarkSurfacePositive: Color,
    onDarkSurfaceWarning: Color,
    onDarkSurfaceNegative: Color,
    onLightSurfaceSolidCard: Color,
    onLightSurfaceSolidPrimary: Color,
    onLightSurfaceSolidSecondary: Color,
    onLightSurfaceSolidTertiary: Color,
    onLightSurfaceSolidDefault: Color,
    onLightSurfaceTransparentCard: Color,
    onLightSurfaceTransparentPrimary: Color,
    onLightSurfaceTransparentSecondary: Color,
    onLightSurfaceTransparentTertiary: Color,
    onLightSurfaceTransparentDeep: Color,
    onLightSurfaceAccent: Color,
    onLightSurfaceAccentAthena: Color,
    onLightSurfaceAccentJoy: Color,
    onLightSurfaceAccentB2E: Color,
    onLightSurfaceAccentBrand: Color,
    onLightSurfacePositive: Color,
    onLightSurfaceWarning: Color,
    onLightSurfaceNegative: Color,
    backgroundPrimary: Color,
    backgroundSecondary: Color,
    darkOverlayHard: Color,
    darkOverlaySoft: Color,
    darkOverlayBlur: Color,
    inverseTextPrimary: Color,
    inverseTextSecondary: Color,
    inverseTextTertiary: Color,
    inverseTextParagraph: Color,
) : CoreColors() {

    override var textPrimary by mutableStateOf(textPrimary, structuralEqualityPolicy())

    override var textSecondary by mutableStateOf(textSecondary, structuralEqualityPolicy())

    override var textTertiary by mutableStateOf(textTertiary, structuralEqualityPolicy())

    override var textParagraph by mutableStateOf(textParagraph, structuralEqualityPolicy())

    override var textAccent by mutableStateOf(textAccent, structuralEqualityPolicy())

    override var textAccentAthena by mutableStateOf(textAccentAthena, structuralEqualityPolicy())

    override var textAccentJoy by mutableStateOf(textAccentJoy, structuralEqualityPolicy())

    override var textAccentB2E by mutableStateOf(textAccentB2E, structuralEqualityPolicy())

    override var textAccentBrand by mutableStateOf(textAccentBrand, structuralEqualityPolicy())

    override var textPositive by mutableStateOf(textPositive, structuralEqualityPolicy())

    override var textWarning by mutableStateOf(textWarning, structuralEqualityPolicy())

    override var textNegative by mutableStateOf(textNegative, structuralEqualityPolicy())

    override var onDarkTextPrimary by mutableStateOf(onDarkTextPrimary, structuralEqualityPolicy())

    override var onDarkTextSecondary by mutableStateOf(onDarkTextSecondary, structuralEqualityPolicy())

    override var onDarkTextTertiary by mutableStateOf(onDarkTextTertiary, structuralEqualityPolicy())

    override var onDarkTextParagraph by mutableStateOf(onDarkTextParagraph, structuralEqualityPolicy())

    override var onDarkTextAccent by mutableStateOf(onDarkTextAccent, structuralEqualityPolicy())

    override var onDarkTextAccentAthena by mutableStateOf(onDarkTextAccentAthena, structuralEqualityPolicy())

    override var onDarkTextAccentJoy by mutableStateOf(onDarkTextAccentJoy, structuralEqualityPolicy())

    override var onDarkTextAccentB2E by mutableStateOf(onDarkTextAccentB2E, structuralEqualityPolicy())

    override var onDarkTextAccentBrand by mutableStateOf(onDarkTextAccentBrand, structuralEqualityPolicy())

    override var onDarkTextPositive by mutableStateOf(onDarkTextPositive, structuralEqualityPolicy())

    override var onDarkTextWarning by mutableStateOf(onDarkTextWarning, structuralEqualityPolicy())

    override var onDarkTextNegative by mutableStateOf(onDarkTextNegative, structuralEqualityPolicy())

    override var onLightTextPrimary by mutableStateOf(onLightTextPrimary, structuralEqualityPolicy())

    override var onLightTextSecondary by mutableStateOf(onLightTextSecondary, structuralEqualityPolicy())

    override var onLightTextTertiary by mutableStateOf(onLightTextTertiary, structuralEqualityPolicy())

    override var onLightTextParagraph by mutableStateOf(onLightTextParagraph, structuralEqualityPolicy())

    override var onLightTextAccent by mutableStateOf(onLightTextAccent, structuralEqualityPolicy())

    override var onLightTextAccentAthena by mutableStateOf(onLightTextAccentAthena, structuralEqualityPolicy())

    override var onLightTextAccentJoy by mutableStateOf(onLightTextAccentJoy, structuralEqualityPolicy())

    override var onLightTextAccentB2E by mutableStateOf(onLightTextAccentB2E, structuralEqualityPolicy())

    override var onLightTextAccentBrand by mutableStateOf(onLightTextAccentBrand, structuralEqualityPolicy())

    override var onLightTextPositive by mutableStateOf(onLightTextPositive, structuralEqualityPolicy())

    override var onLightTextWarning by mutableStateOf(onLightTextWarning, structuralEqualityPolicy())

    override var onLightTextNegative by mutableStateOf(onLightTextNegative, structuralEqualityPolicy())

    override var surfaceSolidCard by mutableStateOf(surfaceSolidCard, structuralEqualityPolicy())

    override var surfaceSolidPrimary by mutableStateOf(surfaceSolidPrimary, structuralEqualityPolicy())

    override var surfaceSolidSecondary by mutableStateOf(surfaceSolidSecondary, structuralEqualityPolicy())

    override var surfaceSolidTertiary by mutableStateOf(surfaceSolidTertiary, structuralEqualityPolicy())

    override var surfaceSolidDefault by mutableStateOf(surfaceSolidDefault, structuralEqualityPolicy())

    override var surfaceTransparentCard by mutableStateOf(surfaceTransparentCard, structuralEqualityPolicy())

    override var surfaceTransparentPrimary by mutableStateOf(surfaceTransparentPrimary, structuralEqualityPolicy())

    override var surfaceTransparentSecondary by mutableStateOf(surfaceTransparentSecondary, structuralEqualityPolicy())

    override var surfaceTransparentTertiary by mutableStateOf(surfaceTransparentTertiary, structuralEqualityPolicy())

    override var surfaceClear by mutableStateOf(surfaceClear, structuralEqualityPolicy())

    override var surfaceAccent by mutableStateOf(surfaceAccent, structuralEqualityPolicy())

    override var surfaceAccentAthena by mutableStateOf(surfaceAccentAthena, structuralEqualityPolicy())

    override var surfaceAccentJoy by mutableStateOf(surfaceAccentJoy, structuralEqualityPolicy())

    override var surfaceAccentB2E by mutableStateOf(surfaceAccentB2E, structuralEqualityPolicy())

    override var surfaceAccentBrand by mutableStateOf(surfaceAccentBrand, structuralEqualityPolicy())

    override var surfacePositive by mutableStateOf(surfacePositive, structuralEqualityPolicy())

    override var surfaceWarning by mutableStateOf(surfaceWarning, structuralEqualityPolicy())

    override var surfaceNegative by mutableStateOf(surfaceNegative, structuralEqualityPolicy())

    override var surfaceSpeechBubbleSent by mutableStateOf(surfaceSpeechBubbleSent, structuralEqualityPolicy())

    override var surfaceSpeechBubbleReceived by mutableStateOf(surfaceSpeechBubbleReceived, structuralEqualityPolicy())

    override var onDarkSurfaceSolidCard by mutableStateOf(onDarkSurfaceSolidCard, structuralEqualityPolicy())

    override var onDarkSurfaceSolidPrimary by mutableStateOf(onDarkSurfaceSolidPrimary, structuralEqualityPolicy())

    override var onDarkSurfaceSolidSecondary by mutableStateOf(onDarkSurfaceSolidSecondary, structuralEqualityPolicy())

    override var onDarkSurfaceSolidTertiary by mutableStateOf(onDarkSurfaceSolidTertiary, structuralEqualityPolicy())

    override var onDarkSurfaceSolidDefault by mutableStateOf(onDarkSurfaceSolidDefault, structuralEqualityPolicy())

    override var onDarkSurfaceTransparentCard by mutableStateOf(
        onDarkSurfaceTransparentCard,
        structuralEqualityPolicy(),
    )

    override var onDarkSurfaceTransparentPrimary by mutableStateOf(
        onDarkSurfaceTransparentPrimary,
        structuralEqualityPolicy(),
    )

    override var onDarkSurfaceTransparentSecondary by mutableStateOf(
        onDarkSurfaceTransparentSecondary,
        structuralEqualityPolicy(),
    )

    override var onDarkSurfaceTransparentTertiary by mutableStateOf(
        onDarkSurfaceTransparentTertiary,
        structuralEqualityPolicy(),
    )

    override var onDarkSurfaceAccent by mutableStateOf(onDarkSurfaceAccent, structuralEqualityPolicy())

    override var onDarkSurfaceAccentAthena by mutableStateOf(onDarkSurfaceAccentAthena, structuralEqualityPolicy())

    override var onDarkSurfaceAccentJoy by mutableStateOf(onDarkSurfaceAccentJoy, structuralEqualityPolicy())

    override var onDarkSurfaceAccentB2E by mutableStateOf(onDarkSurfaceAccentB2E, structuralEqualityPolicy())

    override var onDarkSurfaceAccentBrand by mutableStateOf(onDarkSurfaceAccentBrand, structuralEqualityPolicy())

    override var onDarkSurfacePositive by mutableStateOf(onDarkSurfacePositive, structuralEqualityPolicy())

    override var onDarkSurfaceWarning by mutableStateOf(onDarkSurfaceWarning, structuralEqualityPolicy())

    override var onDarkSurfaceNegative by mutableStateOf(onDarkSurfaceNegative, structuralEqualityPolicy())

    override var onLightSurfaceSolidCard by mutableStateOf(onLightSurfaceSolidCard, structuralEqualityPolicy())

    override var onLightSurfaceSolidPrimary by mutableStateOf(onLightSurfaceSolidPrimary, structuralEqualityPolicy())

    override var onLightSurfaceSolidSecondary by mutableStateOf(
        onLightSurfaceSolidSecondary,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceSolidTertiary by mutableStateOf(onLightSurfaceSolidTertiary, structuralEqualityPolicy())

    override var onLightSurfaceSolidDefault by mutableStateOf(onLightSurfaceSolidDefault, structuralEqualityPolicy())

    override var onLightSurfaceTransparentCard by mutableStateOf(
        onLightSurfaceTransparentCard,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceTransparentPrimary by mutableStateOf(
        onLightSurfaceTransparentPrimary,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceTransparentSecondary by mutableStateOf(
        onLightSurfaceTransparentSecondary,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceTransparentTertiary by mutableStateOf(
        onLightSurfaceTransparentTertiary,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceTransparentDeep by mutableStateOf(
        onLightSurfaceTransparentDeep,
        structuralEqualityPolicy(),
    )

    override var onLightSurfaceAccent by mutableStateOf(onLightSurfaceAccent, structuralEqualityPolicy())

    override var onLightSurfaceAccentAthena by mutableStateOf(onLightSurfaceAccentAthena, structuralEqualityPolicy())

    override var onLightSurfaceAccentJoy by mutableStateOf(onLightSurfaceAccentJoy, structuralEqualityPolicy())

    override var onLightSurfaceAccentB2E by mutableStateOf(onLightSurfaceAccentB2E, structuralEqualityPolicy())

    override var onLightSurfaceAccentBrand by mutableStateOf(onLightSurfaceAccentBrand, structuralEqualityPolicy())

    override var onLightSurfacePositive by mutableStateOf(onLightSurfacePositive, structuralEqualityPolicy())

    override var onLightSurfaceWarning by mutableStateOf(onLightSurfaceWarning, structuralEqualityPolicy())

    override var onLightSurfaceNegative by mutableStateOf(onLightSurfaceNegative, structuralEqualityPolicy())

    override var backgroundPrimary by mutableStateOf(backgroundPrimary, structuralEqualityPolicy())

    override var backgroundSecondary by mutableStateOf(backgroundSecondary, structuralEqualityPolicy())

    override var darkOverlayHard by mutableStateOf(darkOverlayHard, structuralEqualityPolicy())

    override var darkOverlaySoft by mutableStateOf(darkOverlaySoft, structuralEqualityPolicy())

    override var darkOverlayBlur by mutableStateOf(darkOverlayBlur, structuralEqualityPolicy())

    override var inverseTextPrimary by mutableStateOf(inverseTextPrimary, structuralEqualityPolicy())

    override var inverseTextSecondary by mutableStateOf(inverseTextSecondary, structuralEqualityPolicy())

    override var inverseTextTertiary by mutableStateOf(inverseTextTertiary, structuralEqualityPolicy())

    override var inverseTextParagraph by mutableStateOf(inverseTextParagraph, structuralEqualityPolicy())

    override fun copy(
        textPrimary: Color,
        textSecondary: Color,
        textTertiary: Color,
        textParagraph: Color,
        textAccent: Color,
        textAccentAthena: Color,
        textAccentJoy: Color,
        textAccentB2E: Color,
        textAccentBrand: Color,
        textPositive: Color,
        textWarning: Color,
        textNegative: Color,
        onDarkTextPrimary: Color,
        onDarkTextSecondary: Color,
        onDarkTextTertiary: Color,
        onDarkTextParagraph: Color,
        onDarkTextAccent: Color,
        onDarkTextAccentAthena: Color,
        onDarkTextAccentJoy: Color,
        onDarkTextAccentB2E: Color,
        onDarkTextAccentBrand: Color,
        onDarkTextPositive: Color,
        onDarkTextWarning: Color,
        onDarkTextNegative: Color,
        onLightTextPrimary: Color,
        onLightTextSecondary: Color,
        onLightTextTertiary: Color,
        onLightTextParagraph: Color,
        onLightTextAccent: Color,
        onLightTextAccentAthena: Color,
        onLightTextAccentJoy: Color,
        onLightTextAccentB2E: Color,
        onLightTextAccentBrand: Color,
        onLightTextPositive: Color,
        onLightTextWarning: Color,
        onLightTextNegative: Color,
        surfaceSolidCard: Color,
        surfaceSolidPrimary: Color,
        surfaceSolidSecondary: Color,
        surfaceSolidTertiary: Color,
        surfaceSolidDefault: Color,
        surfaceTransparentCard: Color,
        surfaceTransparentPrimary: Color,
        surfaceTransparentSecondary: Color,
        surfaceTransparentTertiary: Color,
        surfaceClear: Color,
        surfaceAccent: Color,
        surfaceAccentAthena: Color,
        surfaceAccentJoy: Color,
        surfaceAccentB2E: Color,
        surfaceAccentBrand: Color,
        surfacePositive: Color,
        surfaceWarning: Color,
        surfaceNegative: Color,
        surfaceSpeechBubbleSent: Color,
        surfaceSpeechBubbleReceived: Color,
        onDarkSurfaceSolidCard: Color,
        onDarkSurfaceSolidPrimary: Color,
        onDarkSurfaceSolidSecondary: Color,
        onDarkSurfaceSolidTertiary: Color,
        onDarkSurfaceSolidDefault: Color,
        onDarkSurfaceTransparentCard: Color,
        onDarkSurfaceTransparentPrimary: Color,
        onDarkSurfaceTransparentSecondary: Color,
        onDarkSurfaceTransparentTertiary: Color,
        onDarkSurfaceAccent: Color,
        onDarkSurfaceAccentAthena: Color,
        onDarkSurfaceAccentJoy: Color,
        onDarkSurfaceAccentB2E: Color,
        onDarkSurfaceAccentBrand: Color,
        onDarkSurfacePositive: Color,
        onDarkSurfaceWarning: Color,
        onDarkSurfaceNegative: Color,
        onLightSurfaceSolidCard: Color,
        onLightSurfaceSolidPrimary: Color,
        onLightSurfaceSolidSecondary: Color,
        onLightSurfaceSolidTertiary: Color,
        onLightSurfaceSolidDefault: Color,
        onLightSurfaceTransparentCard: Color,
        onLightSurfaceTransparentPrimary: Color,
        onLightSurfaceTransparentSecondary: Color,
        onLightSurfaceTransparentTertiary: Color,
        onLightSurfaceTransparentDeep: Color,
        onLightSurfaceAccent: Color,
        onLightSurfaceAccentAthena: Color,
        onLightSurfaceAccentJoy: Color,
        onLightSurfaceAccentB2E: Color,
        onLightSurfaceAccentBrand: Color,
        onLightSurfacePositive: Color,
        onLightSurfaceWarning: Color,
        onLightSurfaceNegative: Color,
        backgroundPrimary: Color,
        backgroundSecondary: Color,
        darkOverlayHard: Color,
        darkOverlaySoft: Color,
        darkOverlayBlur: Color,
        inverseTextPrimary: Color,
        inverseTextSecondary: Color,
        inverseTextTertiary: Color,
        inverseTextParagraph: Color,
    ): CoreColors = CoreColorsImpl(
        textPrimary,
        textSecondary,
        textTertiary,
        textParagraph,
        textAccent,
        textAccentAthena,
        textAccentJoy,
        textAccentB2E,
        textAccentBrand,
        textPositive,
        textWarning,
        textNegative,
        onDarkTextPrimary,
        onDarkTextSecondary,
        onDarkTextTertiary,
        onDarkTextParagraph,
        onDarkTextAccent,
        onDarkTextAccentAthena,
        onDarkTextAccentJoy,
        onDarkTextAccentB2E,
        onDarkTextAccentBrand,
        onDarkTextPositive,
        onDarkTextWarning,
        onDarkTextNegative,
        onLightTextPrimary,
        onLightTextSecondary,
        onLightTextTertiary,
        onLightTextParagraph,
        onLightTextAccent,
        onLightTextAccentAthena,
        onLightTextAccentJoy,
        onLightTextAccentB2E,
        onLightTextAccentBrand,
        onLightTextPositive,
        onLightTextWarning,
        onLightTextNegative,
        surfaceSolidCard,
        surfaceSolidPrimary,
        surfaceSolidSecondary,
        surfaceSolidTertiary,
        surfaceSolidDefault,
        surfaceTransparentCard,
        surfaceTransparentPrimary,
        surfaceTransparentSecondary,
        surfaceTransparentTertiary,
        surfaceClear,
        surfaceAccent,
        surfaceAccentAthena,
        surfaceAccentJoy,
        surfaceAccentB2E,
        surfaceAccentBrand,
        surfacePositive,
        surfaceWarning,
        surfaceNegative,
        surfaceSpeechBubbleSent,
        surfaceSpeechBubbleReceived,
        onDarkSurfaceSolidCard,
        onDarkSurfaceSolidPrimary,
        onDarkSurfaceSolidSecondary,
        onDarkSurfaceSolidTertiary,
        onDarkSurfaceSolidDefault,
        onDarkSurfaceTransparentCard,
        onDarkSurfaceTransparentPrimary,
        onDarkSurfaceTransparentSecondary,
        onDarkSurfaceTransparentTertiary,
        onDarkSurfaceAccent,
        onDarkSurfaceAccentAthena,
        onDarkSurfaceAccentJoy,
        onDarkSurfaceAccentB2E,
        onDarkSurfaceAccentBrand,
        onDarkSurfacePositive,
        onDarkSurfaceWarning,
        onDarkSurfaceNegative,
        onLightSurfaceSolidCard,
        onLightSurfaceSolidPrimary,
        onLightSurfaceSolidSecondary,
        onLightSurfaceSolidTertiary,
        onLightSurfaceSolidDefault,
        onLightSurfaceTransparentCard,
        onLightSurfaceTransparentPrimary,
        onLightSurfaceTransparentSecondary,
        onLightSurfaceTransparentTertiary,
        onLightSurfaceTransparentDeep,
        onLightSurfaceAccent,
        onLightSurfaceAccentAthena,
        onLightSurfaceAccentJoy,
        onLightSurfaceAccentB2E,
        onLightSurfaceAccentBrand,
        onLightSurfacePositive,
        onLightSurfaceWarning,
        onLightSurfaceNegative,
        backgroundPrimary,
        backgroundSecondary,
        darkOverlayHard,
        darkOverlaySoft,
        darkOverlayBlur,
        inverseTextPrimary,
        inverseTextSecondary,
        inverseTextTertiary,
        inverseTextParagraph,
    )

    override fun updateColorsFrom(other: CoreColors) {
        textPrimary = other.textPrimary
        textSecondary = other.textSecondary
        textTertiary = other.textTertiary
        textParagraph = other.textParagraph
        textAccent = other.textAccent
        textAccentAthena = other.textAccentAthena
        textAccentJoy = other.textAccentJoy
        textAccentB2E = other.textAccentJoy
        textAccentBrand = other.textAccentBrand
        textPositive = other.textPositive
        textWarning = other.textWarning
        textNegative = other.textNegative
        onDarkTextPrimary = other.onDarkTextPrimary
        onDarkTextSecondary = other.onDarkTextSecondary
        onDarkTextTertiary = other.onDarkTextTertiary
        onDarkTextParagraph = other.onDarkTextParagraph
        onDarkTextAccent = other.onDarkTextAccent
        onDarkTextAccentAthena = other.onDarkTextAccentAthena
        onDarkTextAccentJoy = other.onDarkTextAccentJoy
        onDarkTextAccentB2E = other.onDarkTextAccentB2E
        onDarkTextAccentBrand = other.onDarkTextAccentBrand
        onDarkTextPositive = other.onDarkTextPositive
        onDarkTextWarning = other.onDarkTextWarning
        onDarkTextNegative = other.onDarkTextNegative
        onLightTextPrimary = other.onLightTextPrimary
        onLightTextSecondary = other.onLightTextSecondary
        onLightTextTertiary = other.onLightTextTertiary
        onLightTextParagraph = other.onLightTextParagraph
        onLightTextAccent = other.onLightTextAccent
        onLightTextAccentAthena = other.onLightTextAccentAthena
        onLightTextAccentJoy = other.onLightTextAccentJoy
        onLightTextAccentB2E = other.onLightTextAccentB2E
        onLightTextAccentBrand = other.onLightTextAccentBrand
        onLightTextPositive = other.onLightTextPositive
        onLightTextWarning = other.onLightTextWarning
        onLightTextNegative = other.onLightTextNegative
        surfaceSolidCard = other.surfaceSolidCard
        surfaceSolidPrimary = other.surfaceSolidPrimary
        surfaceSolidSecondary = other.surfaceSolidSecondary
        surfaceSolidTertiary = other.surfaceSolidTertiary
        surfaceSolidDefault = other.surfaceSolidDefault
        surfaceTransparentCard = other.surfaceTransparentCard
        surfaceTransparentPrimary = other.surfaceTransparentPrimary
        surfaceTransparentSecondary = other.surfaceTransparentSecondary
        surfaceTransparentTertiary = other.surfaceTransparentTertiary
        surfaceClear = other.surfaceClear
        surfaceAccent = other.surfaceAccent
        surfaceAccentAthena = other.surfaceAccentAthena
        surfaceAccentJoy = other.surfaceAccentJoy
        surfaceAccentB2E = other.surfaceAccentB2E
        surfaceAccentBrand = other.surfaceAccentBrand
        surfacePositive = other.surfacePositive
        surfaceWarning = other.surfaceWarning
        surfaceNegative = other.surfaceNegative
        onDarkSurfaceSolidCard = other.onDarkSurfaceSolidCard
        onDarkSurfaceSolidPrimary = other.onDarkSurfaceSolidPrimary
        onDarkSurfaceSolidSecondary = other.onDarkSurfaceSolidSecondary
        onDarkSurfaceSolidTertiary = other.onDarkSurfaceSolidTertiary
        onDarkSurfaceSolidDefault = other.onDarkSurfaceSolidDefault
        onDarkSurfaceTransparentCard = other.onDarkSurfaceTransparentCard
        onDarkSurfaceTransparentPrimary = other.onDarkSurfaceTransparentPrimary
        onDarkSurfaceTransparentSecondary = other.onDarkSurfaceTransparentSecondary
        onDarkSurfaceTransparentTertiary = other.onDarkSurfaceTransparentTertiary
        onDarkSurfaceAccent = other.onDarkSurfaceAccent
        onDarkSurfaceAccentAthena = other.onDarkSurfaceAccentAthena
        onDarkSurfaceAccentJoy = other.onDarkSurfaceAccentJoy
        onDarkSurfaceAccentB2E = other.onDarkSurfaceAccentB2E
        onDarkSurfaceAccentBrand = other.onDarkSurfaceAccentBrand
        onDarkSurfacePositive = other.onDarkSurfacePositive
        onDarkSurfaceWarning = other.onDarkSurfaceWarning
        onDarkSurfaceNegative = other.onDarkSurfaceNegative
        onLightSurfaceSolidCard = other.onLightSurfaceSolidCard
        onLightSurfaceSolidPrimary = other.onLightSurfaceSolidPrimary
        onLightSurfaceSolidSecondary = other.onLightSurfaceSolidSecondary
        onLightSurfaceSolidTertiary = other.onLightSurfaceSolidTertiary
        onLightSurfaceSolidDefault = other.onLightSurfaceSolidDefault
        onLightSurfaceTransparentCard = other.onLightSurfaceTransparentCard
        onLightSurfaceTransparentPrimary = other.onLightSurfaceTransparentPrimary
        onLightSurfaceTransparentSecondary = other.onLightSurfaceTransparentSecondary
        onLightSurfaceTransparentTertiary = other.onLightSurfaceTransparentTertiary
        onLightSurfaceTransparentDeep = other.onLightSurfaceTransparentDeep
        onLightSurfaceAccent = other.onLightSurfaceAccent
        onLightSurfaceAccentAthena = other.onLightSurfaceAccentAthena
        onLightSurfaceAccentJoy = other.onLightSurfaceAccentJoy
        onLightSurfaceAccentB2E = other.onLightSurfaceAccentB2E
        onLightSurfaceAccentBrand = other.onLightSurfaceAccentBrand
        onLightSurfacePositive = other.onLightSurfacePositive
        onLightSurfaceWarning = other.onLightSurfaceWarning
        onLightSurfaceNegative = other.onLightSurfaceNegative
        backgroundPrimary = other.backgroundPrimary
        backgroundSecondary = other.backgroundSecondary
        darkOverlayHard = other.darkOverlayHard
        darkOverlaySoft = other.darkOverlaySoft
        darkOverlayBlur = other.darkOverlayBlur
        inverseTextPrimary = other.inverseTextPrimary
        inverseTextSecondary = other.inverseTextSecondary
        inverseTextTertiary = other.inverseTextTertiary
        inverseTextParagraph = other.inverseTextParagraph
    }
}
