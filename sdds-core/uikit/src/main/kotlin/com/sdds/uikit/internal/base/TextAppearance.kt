package com.sdds.uikit.internal.base

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Typeface
import android.text.TextPaint
import android.util.Log
import androidx.annotation.FontRes
import androidx.annotation.StyleRes
import androidx.annotation.VisibleForTesting
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.res.ResourcesCompat.FontCallback
import androidx.core.provider.FontsContractCompat
import com.google.android.material.resources.TextAppearanceConfig
import com.sdds.uikit.R

/**
 * Utility class that contains the data from parsing a TextAppearance style resource.
 *
 * @hide
 */
internal class TextAppearance(context: Context, @StyleRes id: Int) {
    val textColor: ColorStateList?
    val textColorHint: ColorStateList?
    val textColorLink: ColorStateList?
    val shadowColor: ColorStateList?
    val fontFamily: String?
    val textStyle: Int
    val typeface: Int
    val textAllCaps: Boolean
    val shadowDx: Float
    val shadowDy: Float
    val shadowRadius: Float
    var hasLetterSpacing = false
    var letterSpacing = 0f
    var textSize: Float

    @FontRes
    private val fontFamilyResourceId: Int
    private var fontResolved = false
    private var font: Typeface? = null

    /** Parses the given TextAppearance style resource.  */
    init {
        val typedArray = context.obtainStyledAttributes(id, R.styleable.SdTextAppearance)
        textSize = typedArray.getDimension(R.styleable.SdTextAppearance_android_textSize, 0f)
        textColor = typedArray.getColorStateList(R.styleable.SdTextAppearance_android_textColor)
        textColorHint = typedArray.getColorStateList(R.styleable.SdTextAppearance_android_textColorHint)
        textColorLink = typedArray.getColorStateList(R.styleable.SdTextAppearance_android_textColorLink)
        textStyle = typedArray.getInt(R.styleable.SdTextAppearance_android_textStyle, Typeface.NORMAL)
        typeface = typedArray.getInt(R.styleable.SdTextAppearance_android_typeface, TYPEFACE_SANS)

        val fontFamilyIndex: Int = if (typedArray.hasValue(R.styleable.SdTextAppearance_fontFamily)) {
            R.styleable.SdTextAppearance_fontFamily
        } else {
            R.styleable.SdTextAppearance_android_fontFamily
        }
        fontFamilyResourceId = typedArray.getResourceId(fontFamilyIndex, 0)
        fontFamily = typedArray.getString(fontFamilyIndex)
        textAllCaps = typedArray.getBoolean(R.styleable.SdTextAppearance_android_textAllCaps, false)
        shadowColor = typedArray.getColorStateList(R.styleable.SdTextAppearance_android_shadowColor)
        shadowDx = typedArray.getFloat(R.styleable.SdTextAppearance_android_shadowDx, 0f)
        shadowDy = typedArray.getFloat(R.styleable.SdTextAppearance_android_shadowDy, 0f)
        shadowRadius = typedArray.getFloat(R.styleable.SdTextAppearance_android_shadowRadius, 0f)
        hasLetterSpacing = typedArray.hasValue(R.styleable.SdTextAppearance_android_letterSpacing)
        letterSpacing = typedArray.getFloat(R.styleable.SdTextAppearance_android_letterSpacing, 0f)
        typedArray.recycle()
    }

    /**
     * Synchronously resolves the font Typeface using the fontFamily, style, and typeface.
     *
     * @see androidx.appcompat.widget.AppCompatTextHelper
     */
    @VisibleForTesting
    @Suppress("EmptyCatchBlock", "TooGenericExceptionCaught")
    fun getFont(context: Context): Typeface {
        if (fontResolved) {
            return font!!
        }

        // Try resolving fontFamily as a font resource.
        if (!context.isRestricted) {
            try {
                font = ResourcesCompat.getFont(context, fontFamilyResourceId)
                if (font != null) {
                    font = Typeface.create(font, textStyle)
                }
            } catch (e: UnsupportedOperationException) {
                // Expected if it is not a font resource.
            } catch (e: Resources.NotFoundException) {
            } catch (e: Exception) {
                Log.d(TAG, "Error loading font $fontFamily", e)
            }
        }

        // If not resolved create fallback and resolve.
        createFallbackFont()
        fontResolved = true
        return font!!
    }

    /**
     * Resolves the requested font using the fontFamily, style, and typeface. Immediately (and
     * synchronously) calls [TextAppearanceFontCallback.onFontRetrieved] with
     * the requested font, if it has been resolved already, or [ ][TextAppearanceFontCallback.onFontRetrievalFailed] if requested fontFamily is invalid.
     * Otherwise callback is invoked asynchronously when the font is loaded (or async loading fails).
     * While font is being fetched asynchronously, [.getFallbackFont] can be used as a
     * temporary font.
     *
     * @param context the [Context].
     * @param callback callback to notify when font is loaded.
     * @see androidx.appcompat.widget.AppCompatTextHelper
     */
    @Suppress("TooGenericExceptionCaught")
    fun getFontAsync(
        context: Context,
        callback: TextAppearanceFontCallback,
    ) {
        if (shouldLoadFontSynchronously()) {
            getFont(context)
        } else {
            // No-op if font already resolved.
            createFallbackFont()
        }
        if (fontFamilyResourceId == 0) {
            // Only fontFamily id requires async fetch, if undefined the fallback font is the actual font.
            fontResolved = true
        }
        if (fontResolved) {
            callback.onFontRetrieved(font ?: return, true)
            return
        }

        // Try to resolve fontFamily asynchronously. If failed fallback font is used instead.
        try {
            ResourcesCompat.getFont(
                context,
                fontFamilyResourceId,
                object : FontCallback() {
                    override fun onFontRetrieved(typeface: Typeface) {
                        val createdFont = Typeface.create(typeface, textStyle).also {
                            font = it
                            fontResolved = true
                        }
                        callback.onFontRetrieved(createdFont, false)
                    }

                    override fun onFontRetrievalFailed(reason: Int) {
                        fontResolved = true
                        callback.onFontRetrievalFailed(reason)
                    }
                }, /* handler */
                null,
            )
        } catch (e: Resources.NotFoundException) {
            // Expected if it is not a font resource.
            fontResolved = true
            callback.onFontRetrievalFailed(FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_NOT_FOUND)
        } catch (e: Exception) {
            Log.d(TAG, "Error loading font $fontFamily", e)
            fontResolved = true
            callback.onFontRetrievalFailed(FontsContractCompat.FontRequestCallback.FAIL_REASON_FONT_LOAD_ERROR)
        }
    }

    /**
     * Asynchronously resolves the requested font Typeface using the fontFamily, style, and typeface,
     * and automatically updates given `textPaint` using [.updateTextPaintMeasureState] on
     * successful load.
     *
     * @param context The [Context].
     * @param textPaint [TextPaint] to be updated.
     * @param callback Callback to notify when font is available.
     * @see .getFontAsync
     */
    fun getFontAsync(
        context: Context,
        textPaint: TextPaint,
        callback: TextAppearanceFontCallback,
    ) {
        // Updates text paint using fallback font while waiting for font to be requested.
        updateTextPaintMeasureState(textPaint, fallbackFont)
        getFontAsync(
            context,
            object : TextAppearanceFontCallback() {
                override fun onFontRetrieved(typeface: Typeface, fontResolvedSynchronously: Boolean) {
                    updateTextPaintMeasureState(textPaint, typeface)
                    callback.onFontRetrieved(typeface, fontResolvedSynchronously)
                }

                override fun onFontRetrievalFailed(reason: Int) {
                    callback.onFontRetrievalFailed(reason)
                }
            },
        )
    }

    val fallbackFont: Typeface
        /**
         * Returns a fallback [Typeface] that is retrieved synchronously, in case the actual font is
         * not yet resolved or pending async fetch or an actual [Typeface] if resolved already.
         *
         *
         * Fallback font is a font that can be resolved using typeface attributes not requiring any
         * async operations, i.e. android:typeface, android:textStyle and android:fontFamily defined as
         * string rather than resource id.
         */
        get() {
            createFallbackFont()
            return font ?: Typeface.DEFAULT
        }

    private fun createFallbackFont() {
        // Try resolving fontFamily as a string name if specified.
        if (font == null && fontFamily != null) {
            font = Typeface.create(fontFamily, textStyle)
        }

        // Try resolving typeface if specified otherwise fallback to Typeface.DEFAULT.
        if (font == null) {
            font = when (typeface) {
                TYPEFACE_SANS -> Typeface.SANS_SERIF
                TYPEFACE_SERIF -> Typeface.SERIF
                TYPEFACE_MONOSPACE -> Typeface.MONOSPACE
                else -> Typeface.DEFAULT
            }
            font = Typeface.create(font, textStyle)
        }
    }

    /**
     * Applies the attributes that affect drawing from TextAppearance to the given TextPaint. Note
     * that not all attributes can be applied to the TextPaint.
     *
     * @see android.text.style.TextAppearanceSpan.updateDrawState
     */
    fun updateDrawState(
        context: Context,
        textPaint: TextPaint,
        callback: TextAppearanceFontCallback,
    ) {
        updateMeasureState(context, textPaint, callback)
        textPaint.color = textColor?.getColorForState(
            textPaint.drawableState,
            textColor.defaultColor,
        )
            ?: Color.BLACK
        textPaint.setShadowLayer(
            shadowRadius,
            shadowDx,
            shadowDy,
            shadowColor?.getColorForState(textPaint.drawableState, shadowColor.defaultColor) ?: Color.TRANSPARENT,
        )
    }

    /**
     * Applies the attributes that affect measurement from TextAppearance to the given TextPaint. Note
     * that not all attributes can be applied to the TextPaint.
     *
     * @see android.text.style.TextAppearanceSpan.updateMeasureState
     */
    fun updateMeasureState(
        context: Context,
        textPaint: TextPaint,
        callback: TextAppearanceFontCallback,
    ) {
        if (shouldLoadFontSynchronously()) {
            updateTextPaintMeasureState(textPaint, getFont(context))
        } else {
            getFontAsync(context, textPaint, callback)
        }
    }

    /**
     * Applies the attributes that affect measurement from Typeface to the given TextPaint.
     *
     * @see android.text.style.TextAppearanceSpan.updateMeasureState
     */
    fun updateTextPaintMeasureState(
        textPaint: TextPaint,
        typeface: Typeface,
    ) {
        textPaint.typeface = typeface
        val fake = textStyle and typeface.style.inv()
        textPaint.isFakeBoldText = fake and Typeface.BOLD != 0
        textPaint.textSkewX = if (fake and Typeface.ITALIC != 0) -0.25f else 0f
        textPaint.textSize = textSize
        if (hasLetterSpacing) {
            textPaint.letterSpacing = letterSpacing
        }
    }

    private fun shouldLoadFontSynchronously(): Boolean {
        return TextAppearanceConfig.shouldLoadFontSynchronously()
    }

    companion object {
        private const val TAG = "TextAppearance"

        // Enums from AppCompatTextHelper.
        private const val TYPEFACE_SANS = 1
        private const val TYPEFACE_SERIF = 2
        private const val TYPEFACE_MONOSPACE = 3
    }
}
