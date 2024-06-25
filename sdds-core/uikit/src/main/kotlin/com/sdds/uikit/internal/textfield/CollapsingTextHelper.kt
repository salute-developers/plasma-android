package com.sdds.uikit.internal.textfield

import android.animation.TimeInterpolator
import android.content.res.ColorStateList
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Typeface
import android.os.Build
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import android.text.TextUtils
import android.view.Gravity
import android.view.View
import androidx.annotation.ColorInt
import androidx.core.math.MathUtils
import androidx.core.text.TextDirectionHeuristicsCompat
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import com.sdds.uikit.internal.base.AnimationUtils
import com.sdds.uikit.internal.base.CancelableFontCallback
import com.sdds.uikit.internal.base.TextAppearance
import com.sdds.uikit.internal.base.unsafeLazy
import kotlin.math.abs

/**
 * Helper class for rendering and animating collapsed text.
 */
internal class CollapsingTextHelper(private val view: View) {
    private var drawTitle = false
    private var expandedFraction = 0f
    private val expandedBounds: Rect = Rect()
    private val collapsedBounds: Rect = Rect()
    private val currentBounds: RectF = RectF()
    private var expandedTextGravity = Gravity.CENTER_VERTICAL
    private var collapsedTextGravity = Gravity.CENTER_VERTICAL
    private var expandedTextSize = 15f
    private var collapsedTextSize = 15f
    var expandedTextColor: ColorStateList? = null
        private set
    var collapsedTextColor: ColorStateList? = null
        private set
    private var expandedDrawY = 0f
    private var collapsedDrawY = 0f
    private var expandedDrawX = 0f
    private var collapsedDrawX = 0f
    private var currentDrawX = 0f
    private var currentDrawY = 0f
    private var collapsedTypeface: Typeface? = null
    private var expandedTypeface: Typeface? = null
    private var currentTypeface: Typeface? = null
    private var expandedFontCallback: CancelableFontCallback? = null
    private var collapsedFontCallback: CancelableFontCallback? = null
    private var text: CharSequence? = null
    private var textToDraw: CharSequence? = null
    private var isRtl = false
    private var scale = 0f
    private var currentTextSize = 0f
    private var state: IntArray? = null
    private var boundsChanged = false
    private val textPaint: TextPaint = TextPaint(Paint.ANTI_ALIAS_FLAG or Paint.SUBPIXEL_TEXT_FLAG)
    private val tmpPaint: TextPaint = TextPaint(textPaint)
    private var positionInterpolator: TimeInterpolator? = null
    private var textSizeInterpolator: TimeInterpolator? = null
    private var collapsedShadowRadius = 0f
    private var collapsedShadowDx = 0f
    private var collapsedShadowDy = 0f
    private var collapsedShadowColor: ColorStateList? = null
    private var expandedShadowRadius = 0f
    private var expandedShadowDx = 0f
    private var expandedShadowDy = 0f
    private var expandedShadowColor: ColorStateList? = null
    private var collapsedLetterSpacing = 0f
    private var expandedLetterSpacing = 0f
    private var textLayout: StaticLayout? = null
    private var collapsedTextBlend = 0f
    private var expandedTextBlend = 0f
    private var expandedFirstLineDrawX = 0f
    private var textToDrawCollapsed: CharSequence? = null
    private var maxLines = 1

    fun setTextSizeInterpolator(interpolator: TimeInterpolator?) {
        textSizeInterpolator = interpolator
        recalculate()
    }

    fun setPositionInterpolator(interpolator: TimeInterpolator?) {
        positionInterpolator = interpolator
        recalculate()
    }

    fun setExpandedTextSize(textSize: Float) {
        if (expandedTextSize != textSize) {
            expandedTextSize = textSize
            recalculate()
        }
    }

    fun setCollapsedTextSize(textSize: Float) {
        if (collapsedTextSize != textSize) {
            collapsedTextSize = textSize
            recalculate()
        }
    }

    fun setCollapsedTextColor(textColor: ColorStateList?) {
        if (collapsedTextColor !== textColor) {
            collapsedTextColor = textColor
            recalculate()
        }
    }

    fun setExpandedTextColor(textColor: ColorStateList?) {
        if (expandedTextColor !== textColor) {
            expandedTextColor = textColor
            recalculate()
        }
    }

    fun setExpandedBounds(left: Int, top: Int, right: Int, bottom: Int) {
        if (!rectEquals(expandedBounds, left, top, right, bottom)) {
            expandedBounds[left, top, right] = bottom
            boundsChanged = true
            onBoundsChanged()
        }
    }

    fun setExpandedBounds(bounds: Rect) {
        setExpandedBounds(bounds.left, bounds.top, bounds.right, bounds.bottom)
    }

    fun setCollapsedBounds(left: Int, top: Int, right: Int, bottom: Int) {
        if (!rectEquals(collapsedBounds, left, top, right, bottom)) {
            collapsedBounds[left, top, right] = bottom
            boundsChanged = true
            onBoundsChanged()
        }
    }

    fun setCollapsedBounds(bounds: Rect) {
        setCollapsedBounds(bounds.left, bounds.top, bounds.right, bounds.bottom)
    }

    fun getCollapsedTextActualBounds(bounds: RectF, labelWidth: Int, textGravity: Int) {
        isRtl = calculateIsRtl((text)!!)
        bounds.left = getCollapsedTextLeftBound(labelWidth, textGravity)
        bounds.top = collapsedBounds.top.toFloat()
        bounds.right = getCollapsedTextRightBound(bounds, labelWidth, textGravity)
        bounds.bottom = collapsedBounds.top + collapsedTextHeight
    }

    private fun getCollapsedTextLeftBound(width: Int, gravity: Int): Float {
        return if ((
            gravity == Gravity.CENTER ||
                (gravity and Gravity.HORIZONTAL_GRAVITY_MASK) == Gravity.CENTER_HORIZONTAL
            )
        ) {
            width / 2f - calculateCollapsedTextWidth() / 2
        } else if ((
            (gravity and Gravity.END) == Gravity.END ||
                (gravity and Gravity.RIGHT) == Gravity.RIGHT
            )
        ) {
            if (isRtl) collapsedBounds.left.toFloat() else (collapsedBounds.right - calculateCollapsedTextWidth())
        } else {
            if (isRtl) (collapsedBounds.right - calculateCollapsedTextWidth()) else collapsedBounds.left.toFloat()
        }
    }

    private fun getCollapsedTextRightBound(bounds: RectF, width: Int, gravity: Int): Float {
        return if ((
            gravity == Gravity.CENTER ||
                (gravity and Gravity.HORIZONTAL_GRAVITY_MASK) == Gravity.CENTER_HORIZONTAL
            )
        ) {
            width / 2f + calculateCollapsedTextWidth() / 2
        } else if ((
            (gravity and Gravity.END) == Gravity.END ||
                (gravity and Gravity.RIGHT) == Gravity.RIGHT
            )
        ) {
            if (isRtl) (bounds.left + calculateCollapsedTextWidth()) else collapsedBounds.right.toFloat()
        } else {
            if (isRtl) collapsedBounds.right.toFloat() else (bounds.left + calculateCollapsedTextWidth())
        }
    }

    fun calculateCollapsedTextWidth(): Float {
        val currentText = text ?: return 0f
        getTextPaintCollapsed(tmpPaint)
        return tmpPaint.measureText(currentText, 0, currentText.length)
    }

    val expandedTextHeight: Float
        get() {
            getTextPaintExpanded(tmpPaint)
            // Return expanded height measured from the baseline.
            return -tmpPaint.ascent()
        }
    val collapsedTextHeight: Float
        get() {
            getTextPaintCollapsed(tmpPaint)
            // Return collapsed height measured from the baseline.
            return -tmpPaint.ascent()
        }

    private fun getTextPaintExpanded(textPaint: TextPaint) {
        textPaint.textSize = expandedTextSize
        textPaint.typeface = expandedTypeface
        textPaint.letterSpacing = expandedLetterSpacing
    }

    private fun getTextPaintCollapsed(textPaint: TextPaint) {
        textPaint.textSize = collapsedTextSize
        textPaint.typeface = collapsedTypeface
        textPaint.letterSpacing = collapsedLetterSpacing
    }

    fun onBoundsChanged() {
        drawTitle = (
            collapsedBounds.width() > 0
            ) && (
            collapsedBounds.height() > 0
            ) && (
            expandedBounds.width() > 0
            ) && (expandedBounds.height() > 0)
    }

    fun setExpandedTextGravity(gravity: Int) {
        if (expandedTextGravity != gravity) {
            expandedTextGravity = gravity
            recalculate()
        }
    }

    fun getExpandedTextGravity(): Int {
        return expandedTextGravity
    }

    fun setCollapsedTextGravity(gravity: Int) {
        if (collapsedTextGravity != gravity) {
            collapsedTextGravity = gravity
            recalculate()
        }
    }

    fun getCollapsedTextGravity(): Int {
        return collapsedTextGravity
    }

    fun setCollapsedTextAppearance(resId: Int) {
        val textAppearance = TextAppearance(view.context, resId)
        if (textAppearance.textColor != null) {
            collapsedTextColor = textAppearance.textColor
        }
        if (textAppearance.textSize != 0f) {
            collapsedTextSize = textAppearance.textSize
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            if (textAppearance.shadowColor != null) {
                collapsedShadowColor = textAppearance.shadowColor
            }
            collapsedShadowDx = textAppearance.shadowDx
            collapsedShadowDy = textAppearance.shadowDy
            collapsedShadowRadius = textAppearance.shadowRadius
            collapsedLetterSpacing = textAppearance.letterSpacing
        }

        // Cancel pending async fetch, if any, and replace with a new one.
        collapsedFontCallback?.cancel()
        collapsedFontCallback = CancelableFontCallback(
            { font -> setCollapsedTypeface(font) },
            textAppearance.fallbackFont,
        ).also { callback ->
            textAppearance.getFontAsync(view.context, callback)
        }
        recalculate()
    }

    fun setExpandedTextAppearance(resId: Int) {
        val textAppearance = TextAppearance(view.context, resId)
        if (textAppearance.textColor != null) {
            expandedTextColor = textAppearance.textColor
        }
        if (textAppearance.textSize != 0f) {
            expandedTextSize = textAppearance.textSize
        }
        if (textAppearance.shadowColor != null) {
            expandedShadowColor = textAppearance.shadowColor
        }
        expandedShadowDx = textAppearance.shadowDx
        expandedShadowDy = textAppearance.shadowDy
        expandedShadowRadius = textAppearance.shadowRadius
        expandedLetterSpacing = textAppearance.letterSpacing

        // Cancel pending async fetch, if any, and replace with a new one.
        expandedFontCallback?.cancel()
        expandedFontCallback = CancelableFontCallback(
            { font -> setExpandedTypeface(font) },
            textAppearance.fallbackFont,
        ).also { callback ->
            textAppearance.getFontAsync(view.context, callback)
        }
        recalculate()
    }

    fun setCollapsedTypeface(typeface: Typeface) {
        if (setCollapsedTypefaceInternal(typeface)) {
            recalculate()
        }
    }

    fun setExpandedTypeface(typeface: Typeface) {
        if (setExpandedTypefaceInternal(typeface)) {
            recalculate()
        }
    }

    fun setTypefaces(typeface: Typeface) {
        val collapsedFontChanged = setCollapsedTypefaceInternal(typeface)
        val expandedFontChanged = setExpandedTypefaceInternal(typeface)
        if (collapsedFontChanged || expandedFontChanged) {
            recalculate()
        }
    }

    // Matches the Typeface comparison in TextView
    private fun setCollapsedTypefaceInternal(typeface: Typeface): Boolean {
        // Explicit Typeface setting cancels pending async fetch, if any, to avoid old font overriding
        // already updated one when async op comes back after a while.
        collapsedFontCallback?.cancel()
        if (collapsedTypeface !== typeface) {
            collapsedTypeface = typeface
            return true
        }
        return false
    }

    // Matches the Typeface comparison in TextView
    private fun setExpandedTypefaceInternal(typeface: Typeface): Boolean {
        // Explicit Typeface setting cancels pending async fetch, if any, to avoid old font overriding
        // already updated one when async op comes back after a while.
        expandedFontCallback?.cancel()
        if (expandedTypeface !== typeface) {
            expandedTypeface = typeface
            return true
        }
        return false
    }

    fun getCollapsedTypeface(): Typeface = collapsedTypeface ?: Typeface.DEFAULT

    fun getExpandedTypeface(): Typeface = expandedTypeface ?: Typeface.DEFAULT

    fun setState(state: IntArray?): Boolean {
        this.state = state
        if (isStateful) {
            recalculate()
            return true
        }
        return false
    }

    val isStateful: Boolean
        get() = ((collapsedTextColor?.isStateful == true) || (expandedTextColor?.isStateful == true))
    var expansionFraction: Float
        get() = expandedFraction

        /**
         * Set the value indicating the current scroll value. This decides how much of the background will
         * be displayed, as well as the title metrics/positioning.
         *
         *
         * A value of `0.0` indicates that the layout is fully expanded. A value of `1.0`
         * indicates that the layout is fully collapsed.
         */
        set(fraction) {
            var fraction = fraction
            fraction = MathUtils.clamp(fraction, 0f, 1f)
            if (fraction != expandedFraction) {
                expandedFraction = fraction
                calculateCurrentOffsets()
            }
        }

    fun getCollapsedTextSize(): Float {
        return collapsedTextSize
    }

    fun getExpandedTextSize(): Float {
        return expandedTextSize
    }

    private fun calculateCurrentOffsets() {
        calculateOffsets(expandedFraction)
    }

    private fun calculateOffsets(fraction: Float) {
        interpolateBounds(fraction)
        currentDrawX = lerp(expandedDrawX, collapsedDrawX, fraction, positionInterpolator)
        currentDrawY = lerp(expandedDrawY, collapsedDrawY, fraction, positionInterpolator)
        setInterpolatedTextSize(
            lerp(expandedTextSize, collapsedTextSize, fraction, textSizeInterpolator),
        )
        setCollapsedTextBlend(
            1 - lerp(0f, 1f, 1 - fraction, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR),
        )
        setExpandedTextBlend(lerp(1f, 0f, fraction, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR))
        if (collapsedTextColor !== expandedTextColor) {
            // If the collapsed and expanded text colors are different, blend them based on the
            // fraction
            textPaint.color = blendColors(
                currentExpandedTextColor,
                currentCollapsedTextColor,
                fraction,
            )
        } else {
            textPaint.color = currentCollapsedTextColor
        }
        if (collapsedLetterSpacing != expandedLetterSpacing) {
            textPaint.letterSpacing = lerp(
                expandedLetterSpacing,
                collapsedLetterSpacing,
                fraction,
                AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR,
            )
        } else {
            textPaint.letterSpacing = collapsedLetterSpacing
        }
        textPaint.setShadowLayer(
            lerp(expandedShadowRadius, collapsedShadowRadius, fraction, null),
            lerp(expandedShadowDx, collapsedShadowDx, fraction, null),
            lerp(expandedShadowDy, collapsedShadowDy, fraction, null),
            blendColors(
                getCurrentColor(expandedShadowColor),
                getCurrentColor(collapsedShadowColor),
                fraction,
            ),
        )
        view.postInvalidateOnAnimation()
    }

    @get:ColorInt
    private val currentExpandedTextColor: Int
        get() = getCurrentColor(expandedTextColor)

    @get:ColorInt
    val currentCollapsedTextColor: Int
        get() = getCurrentColor(collapsedTextColor)

    @ColorInt
    private fun getCurrentColor(colorStateList: ColorStateList?): Int {
        if (colorStateList == null) {
            return 0
        }
        return if (state != null) {
            colorStateList.getColorForState(state, 0)
        } else {
            colorStateList.defaultColor
        }
    }

    @Suppress("LongMethod", "CyclomaticComplexMethod", "ComplexCondition")
    private fun calculateBaseOffsets() {
        val currentTextSize = currentTextSize

        // We then calculate the collapsed text size, using the same logic
        calculateUsingTextSize(collapsedTextSize)
        this.textLayout?.let { textLayout ->
            if (textToDraw != null) {
                textToDrawCollapsed = TextUtils.ellipsize(
                    textToDraw, textPaint, textLayout.width.toFloat(), TextUtils.TruncateAt.END,
                )
            }
        }

        var width: Float = textToDrawCollapsed?.let { text ->
            textPaint.measureText(text, 0, text.length)
        } ?: 0f

        val collapsedAbsGravity = GravityCompat.getAbsoluteGravity(
            collapsedTextGravity,
            if (isRtl) ViewCompat.LAYOUT_DIRECTION_RTL else ViewCompat.LAYOUT_DIRECTION_LTR,
        )

        collapsedDrawY = when (collapsedAbsGravity and Gravity.VERTICAL_GRAVITY_MASK) {
            Gravity.BOTTOM -> collapsedBounds.bottom + textPaint.ascent()
            Gravity.TOP -> collapsedBounds.top.toFloat()
            else -> {
                val textOffset = (textPaint.descent() - textPaint.ascent()) / 2
                collapsedBounds.centerY() - textOffset
            }
        }
        collapsedDrawX = when (collapsedAbsGravity and GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) {
            Gravity.CENTER_HORIZONTAL -> collapsedBounds.centerX() - (width / 2)
            Gravity.RIGHT -> collapsedBounds.right - width
            else -> collapsedBounds.left.toFloat()
        }

        calculateUsingTextSize(expandedTextSize)
        val expandedTextHeight = textLayout?.height?.toFloat() ?: 0f
        val measuredWidth: Float = textToDraw?.let { text ->
            textPaint.measureText(text, 0, text.length)
        } ?: 0f
        width = if ((textLayout != null) && (maxLines > 1) && !isRtl) {
            textLayout?.width?.toFloat() ?: 0f
        } else {
            measuredWidth
        }
        expandedFirstLineDrawX = textLayout?.getLineLeft(0) ?: 0f

        val expandedAbsGravity = GravityCompat.getAbsoluteGravity(
            expandedTextGravity,
            if (isRtl) ViewCompat.LAYOUT_DIRECTION_RTL else ViewCompat.LAYOUT_DIRECTION_LTR,
        )
        expandedDrawY = when (expandedAbsGravity and Gravity.VERTICAL_GRAVITY_MASK) {
            Gravity.BOTTOM -> expandedBounds.bottom - expandedTextHeight + textPaint.descent()
            Gravity.TOP -> expandedBounds.top.toFloat()
            else -> {
                val textOffset = expandedTextHeight / 2
                expandedBounds.exactCenterY() - textOffset
            }
        }
        expandedDrawX = when (expandedAbsGravity and GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) {
            Gravity.CENTER_HORIZONTAL -> expandedBounds.centerX() - (width / 2)
            Gravity.RIGHT -> expandedBounds.right - width
            else -> expandedBounds.left.toFloat()
        }

        // Now reset the text size back to the original
        setInterpolatedTextSize(currentTextSize)
    }

    private fun interpolateBounds(fraction: Float) {
        currentBounds.left =
            lerp(expandedBounds.left.toFloat(), collapsedBounds.left.toFloat(), fraction, positionInterpolator)
        currentBounds.top = lerp(expandedDrawY, collapsedDrawY, fraction, positionInterpolator)
        currentBounds.right =
            lerp(expandedBounds.right.toFloat(), collapsedBounds.right.toFloat(), fraction, positionInterpolator)
        currentBounds.bottom =
            lerp(expandedBounds.bottom.toFloat(), collapsedBounds.bottom.toFloat(), fraction, positionInterpolator)
    }

    private fun setCollapsedTextBlend(blend: Float) {
        collapsedTextBlend = blend
        ViewCompat.postInvalidateOnAnimation(view)
    }

    private fun setExpandedTextBlend(blend: Float) {
        expandedTextBlend = blend
        ViewCompat.postInvalidateOnAnimation(view)
    }

    fun draw(canvas: Canvas) {
        val textLayout = textLayout ?: return
        val saveCount = canvas.save()
        // Compute where to draw textLayout for this frame
        if (textToDraw != null && drawTitle) {
            val currentExpandedX = currentDrawX + textLayout.getLineLeft(0) - expandedFirstLineDrawX * 2
            textPaint.textSize = currentTextSize
            val x = currentDrawX
            val y = currentDrawY
            if (DEBUG_DRAW) {
                // Just a debug tool, which drawn a magenta rect in the text bounds
                canvas.drawRect(
                    currentBounds.left,
                    y,
                    currentBounds.right,
                    y + textLayout.height * scale,
                    DebugDrawPaint,
                )
            }
            if (scale != 1f) {
                canvas.scale(scale, scale, x, y)
            }
            if (shouldDrawMultiline()) {
                drawMultilineTransition(canvas, currentExpandedX, y)
            } else {
                canvas.translate(x, y)
                textLayout.draw(canvas)
            }
            canvas.restoreToCount(saveCount)
        }
    }

    private fun shouldDrawMultiline(): Boolean {
        return (maxLines > 1) && !isRtl
    }

    private fun drawMultilineTransition(canvas: Canvas, currentExpandedX: Float, y: Float) {
        val textLayout = this.textLayout ?: return
        val originalAlpha = textPaint.alpha
        // position expanded text appropriately
        canvas.translate(currentExpandedX, y)
        // Expanded text
        textPaint.alpha = (expandedTextBlend * originalAlpha).toInt()
        textLayout.draw(canvas)

        // Collapsed text
        textPaint.alpha = (collapsedTextBlend * originalAlpha).toInt()
        val lineBaseline = textLayout.getLineBaseline(0)
        canvas.drawText(
            (textToDrawCollapsed)!!, /* start = */
            0,
            textToDrawCollapsed!!.length, /* x = */
            0f,
            lineBaseline.toFloat(),
            textPaint,
        )
        // Remove ellipsis for Cross-section animation
        var tmp = textToDrawCollapsed.toString().trim { it <= ' ' }
        if (tmp.endsWith(ELLIPSIS_NORMAL)) {
            tmp = tmp.substring(0, tmp.length - 1)
        }
        // Cross-section between both texts (should stay at original alpha)
        textPaint.alpha = originalAlpha
        canvas.drawText(
            tmp, /* start = */
            0,
            textLayout.getLineEnd(0).coerceAtMost(tmp.length), /* x = */
            0f,
            lineBaseline.toFloat(),
            textPaint,
        )
    }

    private fun calculateIsRtl(text: CharSequence): Boolean {
        val defaultIsRtl = isDefaultIsRtl
        return (
            if (defaultIsRtl) {
                TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL
            } else {
                TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR
            }
            ).isRtl(text, 0, text.length)
    }

    private val isDefaultIsRtl: Boolean
        get() = ViewCompat.getLayoutDirection(view) == ViewCompat.LAYOUT_DIRECTION_RTL

    private fun setInterpolatedTextSize(textSize: Float) {
        calculateUsingTextSize(textSize)
        ViewCompat.postInvalidateOnAnimation(view)
    }

    // Matches the Typeface comparison in TextView
    private fun calculateUsingTextSize(textSize: Float) {
        val currentText = text ?: return
        val collapsedWidth = collapsedBounds.width().toFloat()
        val expandedWidth = expandedBounds.width().toFloat()
        val availableWidth: Float
        val newTextSize: Float
        var updateDrawText = false
        if (isClose(textSize, collapsedTextSize)) {
            newTextSize = collapsedTextSize
            scale = 1f
            if (currentTypeface !== collapsedTypeface) {
                currentTypeface = collapsedTypeface
                updateDrawText = true
            }
            availableWidth = collapsedWidth
        } else {
            newTextSize = expandedTextSize
            if (currentTypeface !== expandedTypeface) {
                currentTypeface = expandedTypeface
                updateDrawText = true
            }
            scale = if (isClose(textSize, expandedTextSize)) {
                // If we're close to the expanded text size, snap to it and use a scale of 1
                1f
            } else {
                // Else, we'll scale down from the expanded text size
                textSize / expandedTextSize
            }
            val textSizeRatio = collapsedTextSize / expandedTextSize
            // This is the size of the expanded bounds when it is scaled to match the
            // collapsed text size
            val scaledDownWidth = expandedWidth * textSizeRatio

            // If the scaled down size is larger than the actual collapsed width, we need to
            // cap the available width so that when the expanded text scales down, it matches
            // the collapsed width
            // Otherwise we'll just use the expanded width
            availableWidth = if (scaledDownWidth > collapsedWidth) {
                Math.min(
                    collapsedWidth / textSizeRatio,
                    expandedWidth,
                )
            } else {
                expandedWidth
            }
        }
        if (availableWidth > 0) {
            updateDrawText = (currentTextSize != newTextSize) || boundsChanged || updateDrawText
            currentTextSize = newTextSize
            boundsChanged = false
        }
        if (textToDraw == null || updateDrawText) {
            textPaint.textSize = currentTextSize
            textPaint.typeface = currentTypeface
            // Use linear text scaling if we're scaling the canvas
            textPaint.isLinearText = scale != 1f
            isRtl = calculateIsRtl(currentText)
            textLayout = createStaticLayout(if (shouldDrawMultiline()) maxLines else 1, availableWidth, isRtl)
            textToDraw = currentText
        }
    }

    private fun createStaticLayout(
        maxLines: Int,
        availableWidth: Float,
        isRtl: Boolean,
    ): StaticLayout? {
        val currentText = text ?: return null
        return StaticLayout.Builder.obtain(currentText, 0, currentText.length, textPaint, availableWidth.toInt())
            .setEllipsize(TextUtils.TruncateAt.END)
            .setAlignment(if (isRtl) Layout.Alignment.ALIGN_OPPOSITE else Layout.Alignment.ALIGN_NORMAL)
            .setIncludePad(false)
            .setMaxLines(maxLines)
            .build()
    }

    fun recalculate() {
        if (view.height > 0 && view.width > 0) {
            // If we've already been laid out, calculate everything now otherwise we'll wait
            // until a layout
            calculateBaseOffsets()
            calculateCurrentOffsets()
        }
    }

    /**
     * Set the title to display
     *
     * @param text
     */
    fun setText(text: CharSequence?) {
        if (text == null || !TextUtils.equals(this.text, text)) {
            this.text = text
            textToDraw = null
            recalculate()
        }
    }

    fun getText(): CharSequence? {
        return text
    }

    fun setMaxLines(maxLines: Int) {
        if (maxLines != this.maxLines) {
            this.maxLines = maxLines
            recalculate()
        }
    }

    fun getMaxLines(): Int {
        return maxLines
    }

    companion object {
        private const val TAG = "TextField"
        private const val ELLIPSIS_NORMAL = "\u2026" // HORIZONTAL ELLIPSIS (…)
        private const val DEBUG_DRAW = false
        private val DebugDrawPaint: Paint by unsafeLazy {
            Paint().apply {
                isAntiAlias = true
                style = Paint.Style.STROKE
                color = Color.MAGENTA
            }
        }

        /**
         * Returns true if `value` is 'close' to it's closest decimal value. Close is currently
         * defined as it's difference being < 0.001.
         */
        private fun isClose(value: Float, targetValue: Float): Boolean {
            return abs(value - targetValue) < 0.001f
        }

        /**
         * Blend `color1` and `color2` using the given ratio.
         *
         * @param ratio of which to blend. 0.0 will return `color1`, 0.5 will give an even blend,
         * 1.0 will return `color2`.
         */
        private fun blendColors(color1: Int, color2: Int, ratio: Float): Int {
            val inverseRatio = 1f - ratio
            val a = (Color.alpha(color1) * inverseRatio) + (Color.alpha(color2) * ratio)
            val r = (Color.red(color1) * inverseRatio) + (Color.red(color2) * ratio)
            val g = (Color.green(color1) * inverseRatio) + (Color.green(color2) * ratio)
            val b = (Color.blue(color1) * inverseRatio) + (Color.blue(color2) * ratio)
            return Color.argb(a.toInt(), r.toInt(), g.toInt(), b.toInt())
        }

        private fun lerp(
            startValue: Float,
            endValue: Float,
            fraction: Float,
            interpolator: TimeInterpolator?,
        ): Float {
            var f = fraction
            if (interpolator != null) {
                f = interpolator.getInterpolation(f)
            }
            return AnimationUtils.lerp(startValue, endValue, f)
        }

        private fun rectEquals(r: Rect, left: Int, top: Int, right: Int, bottom: Int): Boolean {
            return !((r.left != left) || (r.top != top) || (r.right != right) || (r.bottom != bottom))
        }
    }
}
