package com.sdds.uikit

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import androidx.core.content.withStyledAttributes
import androidx.core.view.isVisible
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import kotlin.math.abs

/**
 *
 * @param context контекст
 * @param attrs аттрибуты view
 * @param defStyleAttr аттрибут стиля по умолчанию
 * @param defStyleRes ресурс стиля по умолчанию
 */
open class NoteCompact @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = R.attr.sd_noteCompactStyle,
    defStyleRes: Int = R.style.Sdds_Components_NoteCompact,
) : Note(context, attrs, defStyleAttr, defStyleRes) {

    private var actionStartMargin: Int = 0
    private var actionEndMargin: Int = 0
    private var closeStartMargin: Int = 0

    init {
        obtainAttributes(attrs, defStyleAttr, defStyleRes)
        updateCloseStartMargin()
    }

    /**
     * Устанавливает отступы от action в начале и в конце
     */
    open fun setActionHorizontalMargin(startMargin: Int = 0, endMargin: Int = 0) {
        var change = false
        if (actionStartMargin != startMargin) {
            actionStartMargin = startMargin
            change = true
        }
        if (actionEndMargin != endMargin) {
            actionEndMargin = endMargin
            change = true
        }
        if (change) updateActionMargins()
    }

    /**
     * Устанавливает отступы от closeIcon в начале и в конце
     */
    open fun setCloseIconStartMargin(startMargin: Int = 0) {
        if (closeStartMargin != startMargin) {
            closeStartMargin = startMargin
            updateCloseStartMargin()
        }
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (child == null) return
        super.addView(child, index, params)
        val lp = child.layoutParams as? LayoutParams
        lp?.let { child.applyContentSettings(it) }
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        val horizontalPaddings = paddingStart + paddingEnd
        val verticalPaddings = paddingTop + paddingBottom
        val extraTopPadding = paddingBottom - paddingTop
        var widthUsed = 0
        var heightUsed = 0
        var contentWidth = 0
        var contentHeight = 0
        contentBefore?.let { cb ->
            measureChildWithMargins(contentBefore, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            contentWidth = cb.measuredWidth + cb.marginStart + cb.marginEnd
            contentHeight = cb.measuredHeight + cb.marginTop + cb.marginBottom
            widthUsed += contentWidth
            heightUsed += contentHeight
        }
        var actionWidth = 0
        var actionHeight = 0
        action?.let { action ->
            measureChildWithMargins(action, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            actionWidth = action.measuredWidth + action.marginStart + action.marginEnd
            actionHeight = action.measuredHeight + action.marginTop + action.marginBottom
            widthUsed += actionWidth
        }
        var closeWidth = 0
        if (closeIconView.isVisible) {
            measureChildWithMargins(closeIconView, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            closeWidth = closeIconView.measuredWidth + closeIconView.marginStart + closeIconView.marginEnd
            widthUsed += closeWidth
        }
        var titleWidth = 0
        var titleHeight = 0
        if (titleTv.isVisible) {
            measureChildWithMargins(titleTv, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            titleWidth = titleTv.measuredWidth
            titleHeight = titleTv.measuredHeight
            heightUsed += titleHeight
        }
        var textWidth = 0
        var textHeight = 0
        if (textTv.isVisible) {
            measureChildWithMargins(textTv, widthMeasureSpec, widthUsed, heightMeasureSpec, heightUsed)
            textWidth = textTv.measuredWidth
            textHeight = textTv.measuredHeight + textTopMargin
        }
        val layoutWidth = contentWidth + maxOf(titleWidth, textWidth) + actionWidth + closeWidth + horizontalPaddings
        val spacerHeight = if (extraTopPadding > 0) extraTopPadding else 0
        val layoutHeight = calculateLayoutHeight(
            contentHeight, spacerHeight, titleHeight, textHeight, actionHeight, contentBeforeArrangement,
        ) + verticalPaddings
        val finalWidth = resolveSize(layoutWidth, widthMeasureSpec)
        val finalHeight = resolveSize(layoutHeight, heightMeasureSpec)
        setMeasuredDimension(finalWidth, finalHeight)
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        var contentWidth = 0
        var contentHeight = 0
        var contentWidthMargins = 0
        contentBefore?.let { cB ->
            contentWidth = cB.measuredWidth
            contentHeight = cB.measuredHeight
            contentWidthMargins = contentWidth + cB.marginStart + cB.marginEnd
        }
        val textHeight = if (textTv.isVisible) (textTv.measuredHeight) else 0
        val titleHeight = if (titleTv.isVisible) titleTv.measuredHeight else 0
        var titleWidth = 0
        var textWidth = 0
        val actionHeight = action?.measuredHeight ?: 0
        var actionWidthMargins = 0
        val extraPadding = paddingBottom - paddingTop
        val spacerHeight = if (extraPadding > 0) extraPadding else 0
        val (contentOffsetY, actionOffsetY, textOffsetY) =
            calculateAllOffsets(contentHeight, titleHeight, textHeight, actionHeight, spacerHeight)
        var x = paddingStart
        var y = paddingTop
        contentBefore?.let { cB ->
            cB.layout(
                x + cB.marginStart,
                y + contentOffsetY + cB.marginTop,
                x + cB.marginStart + contentWidth,
                y + contentOffsetY + cB.marginTop + contentHeight,
            )
        }
        x += contentWidthMargins
        y += textOffsetY
        if (titleTv.isVisible) {
            titleWidth = titleTv.measuredWidth
            titleTv.layout(x, y, x + titleWidth, y + titleHeight)
            y += titleHeight
        }
        if (textTv.isVisible) {
            if (titleTv.isVisible) y += textTopMargin
            textWidth = textTv.measuredWidth
            textTv.layout(x, y, x + textWidth, y + textHeight)
        }
        x += maxOf(titleWidth, textWidth)
        action?.let { ac ->
            y = paddingTop + actionOffsetY
            ac.layout(
                x + ac.marginStart,
                y + ac.marginTop,
                x + ac.marginStart + ac.measuredWidth,
                y + ac.marginTop + actionHeight,
            )
            actionWidthMargins = ac.measuredWidth + ac.marginStart + ac.marginEnd
        }
        if (closeIconView.isVisible) {
            val someTextHeight = if (titleTv.isVisible) titleHeight else textHeight
            x += (actionWidthMargins + closeIconView.marginStart)
            y = paddingTop + textOffsetY + (someTextHeight - closeIconView.measuredHeight) / 2
            closeIconView.layout(x, y, x + closeIconView.measuredWidth, y + closeIconView.measuredHeight)
        }
    }

    private fun obtainAttributes(attrs: AttributeSet?, defStyleAttr: Int, defStyleRes: Int) {
        context.withStyledAttributes(attrs, R.styleable.NoteCompact, defStyleAttr, defStyleRes) {
            actionStartMargin = getDimensionPixelSize(R.styleable.NoteCompact_sd_actionStartMargin, 0)
            actionEndMargin = getDimensionPixelSize(R.styleable.NoteCompact_sd_actionEndMargin, 0)
            closeStartMargin = getDimensionPixelSize(R.styleable.NoteCompact_sd_closeStartMargin, 0)
        }
    }

    private fun View.applyContentSettings(noteParams: LayoutParams) {
        when (noteParams.noteContent) {
            NoteContent.CONTENT_BEFORE -> {
                (this as? ImageView)?.apply {
                    colorState = this@NoteCompact.colorState
                }
            }

            NoteContent.ACTION -> {
                val lp = noteParams as? MarginLayoutParams
                if (lp != null) {
                    lp.marginStart += actionStartMargin
                    lp.marginEnd += actionEndMargin
                    this.layoutParams = lp
                }
            }
        }
    }

    private fun updateCloseStartMargin() {
        val lp = closeIconView.layoutParams as? MarginLayoutParams
        lp?.setMargins(closeStartMargin, 0, 0, 0)
        closeIconView.layoutParams = lp
    }

    private fun updateActionMargins() {
        action?.let {
            val lp = (it.layoutParams as? MarginLayoutParams) ?: return
            lp.marginStart = actionStartMargin
            lp.marginEnd = actionEndMargin
            it.layoutParams = lp
        }
    }

    private fun calculateLayoutHeight(
        cbHeight: Int,
        spacerHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        aHeight: Int,
        arrangement: ContentBeforeVerticalArrangement,
    ): Int {
        return when (arrangement) {
            ContentBeforeVerticalArrangement.Top ->
                calculateHeightWhenTop(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)

            ContentBeforeVerticalArrangement.Center ->
                calculateHeightWhenCenter(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)

            ContentBeforeVerticalArrangement.Bottom ->
                calculateHeightWhenBottom(cbHeight, spacerHeight, titleHeight, textHeight, aHeight)
        }
    }

    private fun calculateHeightWhenTop(
        cbHeight: Int,
        spacerHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        aHeight: Int,
    ): Int {
        val maxHalf = maxOf(cbHeight / 2, aHeight / 2)
        val cbHalfGreater = cbHeight / 2 > aHeight / 2
        return when {
            maxHalf >= (titleHeight / 2 + textHeight) -> {
                if (cbHalfGreater) {
                    maxHalf * 2 + spacerHeight
                } else {
                    maxHalf * 2
                }
            }

            maxHalf > titleHeight / 2 -> {
                if (cbHalfGreater) {
                    spacerHeight + maxHalf + titleHeight / 2 + textHeight
                } else {
                    maxHalf + titleHeight / 2 + textHeight
                }
            }

            else -> spacerHeight + titleHeight + textHeight
        }
    }

    private fun calculateHeightWhenCenter(
        cbHeight: Int,
        spacerHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        aHeight: Int,
    ): Int {
        val offsetPartContent = cbHeight / 2 - (titleHeight + textHeight) / 2
        val offsetTopPartAction = aHeight / 2 - titleHeight / 2
        val offsetBottomPartAction = aHeight / 2 - (titleHeight / 2 + textHeight)
        val maxTopOffset = maxOf(offsetPartContent, offsetTopPartAction)
        val maxBottomOffset = maxOf(offsetPartContent, offsetBottomPartAction)
        var result = titleHeight + textHeight
        result += if (maxTopOffset > 0) {
            if (offsetPartContent > offsetTopPartAction) {
                maxTopOffset + spacerHeight
            } else {
                maxTopOffset
            }
        } else {
            spacerHeight
        }
        if (maxBottomOffset > 0) result += maxBottomOffset
        return result
    }

    private fun calculateHeightWhenBottom(
        cbHeight: Int,
        spacerHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        aHeight: Int,
    ): Int {
        val offsetPartContent = cbHeight - (titleHeight + textHeight)
        val offsetTopPartAction = aHeight / 2 - titleHeight / 2
        val maxTopOffset = maxOf(offsetPartContent, offsetTopPartAction, spacerHeight)
        val offsetBottomPartAction = aHeight / 2 - (titleHeight / 2 + textHeight)
        var result = titleHeight + textHeight
        result += if (maxTopOffset > 0) {
            if (offsetPartContent > offsetTopPartAction) {
                maxTopOffset + spacerHeight
            } else {
                maxTopOffset
            }
        } else {
            spacerHeight
        }
        if (offsetBottomPartAction > 0) result += offsetBottomPartAction
        return result
    }

    private fun calculateContentOffsetY(contentHeight: Int, titleHeight: Int, textHeight: Int): Int {
        val someTextHeight = if (titleHeight > 0) titleHeight else textHeight
        val finalTextHeight = if (titleHeight > 0 && textHeight > 0) {
            textHeight + textTopMargin
        } else {
            textHeight
        }
        return when (contentBeforeArrangement) {
            ContentBeforeVerticalArrangement.Top -> (someTextHeight - contentHeight) / 2
            ContentBeforeVerticalArrangement.Center -> (titleHeight + finalTextHeight - contentHeight) / 2
            ContentBeforeVerticalArrangement.Bottom -> titleHeight + finalTextHeight - contentHeight
        }
    }

    private fun calculateAllOffsets(
        contentHeight: Int,
        titleHeight: Int,
        textHeight: Int,
        actionHeight: Int,
        spacerHeight: Int,
    ): Triple<Int, Int, Int> {
        var contentOffsetY = calculateContentOffsetY(contentHeight, titleHeight, textHeight)
        val someTextHeight = if (titleHeight > 0) titleHeight else textHeight
        var actionOffsetY = (someTextHeight - actionHeight) / 2
        var textOffsetY = 0
        val firstPlaceContent = (contentOffsetY <= actionOffsetY && contentOffsetY < 0 && contentHeight > 0)
        val firstPlaceAction = (actionOffsetY < contentOffsetY && actionOffsetY < 0 && actionHeight > 0)
        if (firstPlaceContent) {
            textOffsetY += spacerHeight + abs(contentOffsetY)
            actionOffsetY += spacerHeight + abs(contentOffsetY)
            contentOffsetY = spacerHeight
        } else if (firstPlaceAction) {
//          сначала выравниваем action в 0
            textOffsetY += abs(actionOffsetY)
            contentOffsetY += abs(actionOffsetY)
            actionOffsetY = 0
//            проверяем сколько нужно добавить дополнительно
            val extraContent = if (contentOffsetY < spacerHeight) spacerHeight - contentOffsetY else 0
            val extraText = if (textOffsetY < spacerHeight) spacerHeight - textOffsetY else 0
            val finalExtra = if (extraContent > extraText) extraContent else extraText
//            добавляем extra
            textOffsetY += finalExtra
            contentOffsetY += finalExtra
            actionOffsetY += finalExtra
        } else {
            textOffsetY = spacerHeight
            actionOffsetY += spacerHeight
            contentOffsetY += spacerHeight
        }
        return Triple(contentOffsetY, actionOffsetY, textOffsetY)
    }
}
