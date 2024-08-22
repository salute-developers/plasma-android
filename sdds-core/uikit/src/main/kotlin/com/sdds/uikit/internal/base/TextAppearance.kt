package com.sdds.uikit.internal.base

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.Resources
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build.VERSION
import android.os.Build.VERSION_CODES
import android.text.TextPaint
import android.util.Log
import android.util.Xml
import androidx.annotation.FontRes
import androidx.annotation.RequiresApi
import androidx.annotation.StyleRes
import androidx.annotation.VisibleForTesting
import androidx.core.content.res.ResourcesCompat
import androidx.core.content.res.ResourcesCompat.FontCallback
import androidx.core.provider.FontsContractCompat
import com.google.android.material.resources.TextAppearanceConfig
import com.sdds.uikit.R
import org.xmlpull.v1.XmlPullParser

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

    @RequiresApi(VERSION_CODES.O)
    var fontVariationSettings: String? = null

    @FontRes
    private val fontFamilyResourceId: Int
    private var fontResolved = false
    private var font: Typeface? = null
    private var systemFontLoadAttempted = false

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
        if (!maybeLoadFontSynchronously(context)) {
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
                },
                /* handler */
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
        updateTextPaintMeasureState(context, textPaint, fallbackFont)
        getFontAsync(
            context,
            object : TextAppearanceFontCallback() {
                override fun onFontRetrieved(typeface: Typeface, fontResolvedSynchronously: Boolean) {
                    updateTextPaintMeasureState(context, textPaint, typeface)
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
        textPaint.color = textColor.colorForState(
            textPaint.drawableState,
            Color.BLACK,
        )
        textPaint.setShadowLayer(
            shadowRadius,
            shadowDx,
            shadowDy,
            shadowColor.colorForState(textPaint.drawableState, Color.TRANSPARENT),
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
        if (maybeLoadFontSynchronously(context) && fontResolved && font != null) {
            updateTextPaintMeasureState(context, textPaint, font!!)
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
        context: Context,
        textPaint: TextPaint,
        typeface: Typeface,
    ) {
        var tpfc = typeface
        val boldTypeface: Typeface? = TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, tpfc)
        if (boldTypeface != null) {
            tpfc = boldTypeface
        }
        textPaint.typeface = tpfc
        val fake = textStyle and tpfc.style.inv()
        textPaint.isFakeBoldText = fake and Typeface.BOLD != 0
        textPaint.textSkewX = if (fake and Typeface.ITALIC != 0) -0.25f else 0f
        textPaint.textSize = textSize
        if (VERSION.SDK_INT >= VERSION_CODES.O) {
            textPaint.fontVariationSettings = fontVariationSettings
        }
        if (hasLetterSpacing) {
            textPaint.letterSpacing = letterSpacing
        }
    }

    @Suppress("ReturnCount")
    private fun maybeLoadFontSynchronously(context: Context): Boolean {
        if (TextAppearanceConfig.shouldLoadFontSynchronously()) {
            getFont(context)
            return true
        }
        if (fontResolved) {
            return true
        }
        if (fontFamilyResourceId == 0) {
            return false
        }
        val cachedFont = ResourcesCompat.getCachedFont(context, fontFamilyResourceId)
        if (cachedFont != null) {
            font = cachedFont
            fontResolved = true
            return true
        }
        val systemFont = getSystemTypeface(context)
        if (systemFont != null) {
            font = systemFont
            fontResolved = true
            return true
        }
        return false
    }

    private fun getSystemTypeface(context: Context): Typeface? {
        if (systemFontLoadAttempted) {
            // Only attempt to load the system font once.
            return null
        }
        systemFontLoadAttempted = true
        val systemFontFamily = readFontProviderSystemFontFamily(context, fontFamilyResourceId) ?: return null
        val regularSystemTypeface = Typeface.create(systemFontFamily, Typeface.NORMAL)
        return if (regularSystemTypeface === Typeface.DEFAULT) {
            // If Typeface#create returned Typeface.DEFAULT then systemFontFamily is not present on the
            // device as a system font, so we will have to load the font asynchronously.
            null
        } else {
            Typeface.create(regularSystemTypeface, textStyle)
        }
    }

    @Suppress("ResourceType", "PrivateResource", "TooGenericExceptionCaught")
    private fun readFontProviderSystemFontFamily(
        context: Context,
        @FontRes fontFamilyResourceId: Int,
    ): String? {
        val resources = context.resources
        if (fontFamilyResourceId == 0 || resources.getResourceTypeName(fontFamilyResourceId) != "font") {
            return null
        }
        try {
            val xpp: XmlPullParser = resources.getXml(fontFamilyResourceId)
            while (xpp.eventType != XmlPullParser.END_DOCUMENT) {
                if (xpp.eventType == XmlPullParser.START_TAG && xpp.name == "font-family") {
                    val attrs = Xml.asAttributeSet(xpp)
                    val a = resources.obtainAttributes(attrs, androidx.core.R.styleable.FontFamily)
                    val systemFontFamily =
                        a.getString(androidx.core.R.styleable.FontFamily_fontProviderSystemFontFamily)
                    a.recycle()
                    return systemFontFamily
                }
                xpp.next()
            }
        } catch (t: Throwable) {
            // Fail silently if we can't find fontProviderSystemFontFamily for any reason.
        }
        return null
    }

    companion object {
        private const val TAG = "TextAppearance"

        // Enums from AppCompatTextHelper.
        private const val TYPEFACE_SANS = 1
        private const val TYPEFACE_SERIF = 2
        private const val TYPEFACE_MONOSPACE = 3
    }
}
