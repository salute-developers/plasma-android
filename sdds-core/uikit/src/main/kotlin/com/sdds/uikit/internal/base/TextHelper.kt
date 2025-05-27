package com.sdds.uikit.internal.base

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.graphics.PorterDuff
import android.graphics.Typeface
import android.os.Build
import android.os.LocaleList
import android.text.method.PasswordTransformationMethod
import android.util.AttributeSet
import android.util.TypedValue
import android.widget.TextView
import androidx.annotation.StyleableRes
import androidx.appcompat.R
import androidx.core.content.res.ResourcesCompat
import androidx.core.widget.TextViewCompat

internal class TextHelper(private val mView: TextView) {

    private var mStyle = Typeface.NORMAL
    private var mFontWeight: Int = TEXT_FONT_WEIGHT_UNSPECIFIED
    private var mFontTypeface: Typeface? = null
    private var mAsyncFontPending = false

    @Suppress("LongMethod", "CyclomaticComplexMethod")
    fun loadFromAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        val context = mView.context

        // First read the TextAppearance style id
        var a = context.obtainStyledAttributes(attrs, R.styleable.AppCompatTextHelper, defStyleAttr, defStyleRes)

        val ap = a.getResourceId(R.styleable.AppCompatTextHelper_android_textAppearance, -1)
        a.recycle()

        // PasswordTransformationMethod wipes out all other TransformationMethod instances
        // in TextView's constructor, so we should only set a new transformation method
        // if we don't have a PasswordTransformationMethod currently...
        val hasPwdTm =
            mView.transformationMethod is PasswordTransformationMethod
        var allCaps = false
        var allCapsSet = false
        var fontVariation: String? = null
        var localeListString: String? = null

        // First check TextAppearance's textAllCaps value
        if (ap != -1) {
            a = context.obtainStyledAttributes(ap, R.styleable.TextAppearance)
            if (!hasPwdTm && a.hasValue(R.styleable.TextAppearance_textAllCaps)) {
                allCapsSet = true
                allCaps = a.getBoolean(R.styleable.TextAppearance_textAllCaps, false)
            }

            updateTypefaceAndStyle(context, a)
            if (a.hasValue(R.styleable.TextAppearance_textLocale)) {
                localeListString = a.getString(R.styleable.TextAppearance_textLocale)
            }
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
                a.hasValue(R.styleable.TextAppearance_fontVariationSettings)
            ) {
                fontVariation = a.getString(R.styleable.TextAppearance_fontVariationSettings)
            }
            a.recycle()
        }

        // Now read the style's values
        a = context.obtainStyledAttributes(
            attrs, R.styleable.TextAppearance,
            defStyleAttr, 0,
        )
        if (!hasPwdTm && a.hasValue(R.styleable.TextAppearance_textAllCaps)) {
            allCapsSet = true
            allCaps = a.getBoolean(R.styleable.TextAppearance_textAllCaps, false)
        }
        if (a.hasValue(R.styleable.TextAppearance_textLocale)) {
            localeListString = a.getString(R.styleable.TextAppearance_textLocale)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O &&
            a.hasValue(R.styleable.TextAppearance_fontVariationSettings)
        ) {
            fontVariation = a.getString(R.styleable.TextAppearance_fontVariationSettings)
        }
        // In P, when the text size attribute is 0, this would not be set. Fix this here.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P &&
            a.hasValue(R.styleable.TextAppearance_android_textSize)
        ) {
            if (a.getDimensionPixelSize(R.styleable.TextAppearance_android_textSize, -1) == 0) {
                mView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 0.0f)
            }
        }

        updateTypefaceAndStyle(context, a)
        a.recycle()

        if (!hasPwdTm && allCapsSet) {
            mView.isAllCaps = allCaps
        }
        if (mFontTypeface != null) {
            if (mFontWeight == TEXT_FONT_WEIGHT_UNSPECIFIED) {
                mView.setTypeface(mFontTypeface, mStyle)
            } else {
                mView.setTypeface(mFontTypeface)
            }
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            if (fontVariation != null) {
                mView.setFontVariationSettings(fontVariation)
            }
        }
        if (localeListString != null) {
            mView.textLocales = LocaleList.forLanguageTags(localeListString)
        }

        // Read line and baseline heights attributes.
        a = context.obtainStyledAttributes(attrs, R.styleable.AppCompatTextView)

        if (a.hasValue(R.styleable.AppCompatTextView_drawableTint)) {
            val tintList = a.getColorStateList(
                R.styleable.AppCompatTextView_drawableTint,
            )
            TextViewCompat.setCompoundDrawableTintList(mView, tintList)
        }
        if (a.hasValue(R.styleable.AppCompatTextView_drawableTintMode)) {
            val tintMode = parseTintMode(a.getInt(R.styleable.AppCompatTextView_drawableTintMode, -1))
            TextViewCompat.setCompoundDrawableTintMode(mView, tintMode)
        }

        val firstBaselineToTopHeight = a.getDimensionPixelSize(
            R.styleable.AppCompatTextView_firstBaselineToTopHeight,
            -1,
        )
        val lastBaselineToBottomHeight = a.getDimensionPixelSize(
            R.styleable.AppCompatTextView_lastBaselineToBottomHeight,
            -1,
        )
        val lineHeight = a.getDimensionPixelSize(
            R.styleable.AppCompatTextView_lineHeight,
            -1,
        )

        a.recycle()
        if (firstBaselineToTopHeight != -1) {
            TextViewCompat.setFirstBaselineToTopHeight(mView, firstBaselineToTopHeight)
        }
        if (lastBaselineToBottomHeight != -1) {
            TextViewCompat.setLastBaselineToBottomHeight(mView, lastBaselineToBottomHeight)
        }
        if (lineHeight != -1) {
            TextViewCompat.setLineHeight(mView, lineHeight)
        }
    }

    @Suppress("LongMethod", "NestedBlockDepth", "CyclomaticComplexMethod")
    private fun updateTypefaceAndStyle(context: Context, a: TypedArray) {
        mStyle = a.getInt(R.styleable.TextAppearance_android_textStyle, mStyle)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            mFontWeight = a.getInt(
                R.styleable.TextAppearance_android_textFontWeight,
                TEXT_FONT_WEIGHT_UNSPECIFIED,
            )
            if (mFontWeight != TEXT_FONT_WEIGHT_UNSPECIFIED) {
                mStyle = Typeface.NORMAL or (mStyle and Typeface.ITALIC)
            }
        }

        if (a.hasValue(R.styleable.TextAppearance_android_fontFamily) ||
            a.hasValue(R.styleable.TextAppearance_fontFamily)
        ) {
            mFontTypeface = null
            val fontFamilyId = if (a.hasValue(R.styleable.TextAppearance_fontFamily)) {
                R.styleable.TextAppearance_fontFamily
            } else {
                R.styleable.TextAppearance_android_fontFamily
            }
            if (!context.isRestricted) {
                try {
                    // Note the callback will be triggered on the UI thread.
                    val typeface = a.getFont(context, fontFamilyId)
                    if (typeface != null) {
                        mFontTypeface = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P &&
                            mFontWeight != TEXT_FONT_WEIGHT_UNSPECIFIED
                        ) {
                            Typeface.create(
                                Typeface.create(typeface, Typeface.NORMAL), mFontWeight,
                                (mStyle and Typeface.ITALIC) != 0,
                            )
                        } else {
                            typeface
                        }
                    }
                    // If this call gave us an immediate result, ignore any pending callbacks.
                    mAsyncFontPending = mFontTypeface == null
                } catch (e: UnsupportedOperationException) {
                    // Expected if it is not a font resource.
                } catch (e: Resources.NotFoundException) {
                    // Do nothing
                }
            }
            if (mFontTypeface == null) {
                // Try with String. This is done by TextView JB+, but fails in ICS
                val fontFamilyName = a.getString(fontFamilyId)
                if (fontFamilyName != null) {
                    mFontTypeface = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P &&
                        mFontWeight != TEXT_FONT_WEIGHT_UNSPECIFIED
                    ) {
                        Typeface.create(
                            Typeface.create(fontFamilyName, Typeface.NORMAL), mFontWeight,
                            (mStyle and Typeface.ITALIC) != 0,
                        )
                    } else {
                        Typeface.create(fontFamilyName, mStyle)
                    }
                }
            }
            return
        }

        if (a.hasValue(R.styleable.TextAppearance_android_typeface)) {
            // Ignore previous pending fonts
            mAsyncFontPending = false
            val typefaceIndex =
                a.getInt(R.styleable.TextAppearance_android_typeface, SANS)
            when (typefaceIndex) {
                SANS -> mFontTypeface = Typeface.SANS_SERIF
                SERIF -> mFontTypeface = Typeface.SERIF
                MONOSPACE -> mFontTypeface = Typeface.MONOSPACE
            }
        }
    }

    companion object {
        private const val TEXT_FONT_WEIGHT_UNSPECIFIED = -1

        // Enum for the "typeface" XML parameter.
        private const val SANS = 1
        private const val SERIF = 2
        private const val MONOSPACE = 3

        fun parseTintMode(value: Int, defaultMode: PorterDuff.Mode? = null): PorterDuff.Mode? {
            return when (value) {
                3 -> PorterDuff.Mode.SRC_OVER
                5 -> PorterDuff.Mode.SRC_IN
                9 -> PorterDuff.Mode.SRC_ATOP
                14 -> PorterDuff.Mode.MULTIPLY
                15 -> PorterDuff.Mode.SCREEN
                16 -> PorterDuff.Mode.ADD
                else -> defaultMode
            }
        }

        fun TypedArray.getFont(
            context: Context,
            @StyleableRes index: Int,
        ): Typeface? {
            val resourceId: Int = getResourceId(index, 0)
            if (resourceId == 0) {
                return null
            }
            return ResourcesCompat.getFont(context, resourceId)
        }
    }
}
