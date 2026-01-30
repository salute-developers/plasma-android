package com.sdds.testing.vs.skeleton

import android.content.Context
import android.util.TypedValue
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.annotation.StyleRes
import androidx.core.content.withStyledAttributes
import com.sdds.testing.R
import com.sdds.testing.vs.getTextColorPrimary
import com.sdds.testing.vs.styleWrapper
import com.sdds.uikit.RectSkeleton
import com.sdds.uikit.SkeletonLineWidthProvider
import com.sdds.uikit.TextSkeleton
import com.sdds.uikit.TextView

/**
 * Создает [RectSkeleton]
 * @param context контекст
 * @param style стиль
 * @param state состояние компонента
 */
fun rectSkeleton(
    context: Context,
    @StyleRes style: Int? = null,
    state: RectSkeletonUiState = RectSkeletonUiState(),
): RectSkeleton {
    return RectSkeleton(context.styleWrapper(style)).apply {
        layoutParams = ViewGroup.LayoutParams(
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_108x),
            context.resources.getDimensionPixelSize(com.sdds.uikit.R.dimen.sdds_spacer_50x),
        )
    }
}

/**
 * Создает [TextSkeleton] с контейнером и текстом.
 * @param context контекст
 * @param style стиль
 * @param state состояние
 */
fun textSkeleton(
    context: Context,
    @StyleRes style: Int? = null,
    state: TextSkeletonUiState = TextSkeletonUiState(),
): ViewGroup {
    val appearanceOverlay = R.style.TestTheme_AppearanceOverlay
    val contextWithAppearance = context.styleWrapper(appearanceOverlay)
    val contextWithSkeleton = contextWithAppearance.styleWrapper(style)
    val appearanceRes = resolveTextAppearance(contextWithSkeleton)

    val skeletonView = skeletonShimmer(contextWithSkeleton, state, appearanceRes)
    val textView = text(context, state, appearanceRes)
    return FrameLayout(context).apply {
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT,
        )
        addView(textView)
        addView(skeletonView)
    }
}

private fun resolveTextAppearance(context: Context): Int {
    var textAppearance = 0
    val link = context.resolveStyle(com.sdds.uikit.R.attr.sd_textSkeletonStyle)
    context.withStyledAttributes(link, com.sdds.uikit.R.styleable.TextSkeleton) {
        textAppearance = getResourceId(com.sdds.uikit.R.styleable.TextSkeleton_android_textAppearance, 0)
    }
    return textAppearance
}

private fun Context.resolveStyle(attr: Int): Int {
    return TypedValue().run {
        theme.resolveAttribute(attr, this, true)
        data
    }
}

private fun skeletonShimmer(
    context: Context,
    state: TextSkeletonUiState = TextSkeletonUiState(),
    @StyleRes textStyle: Int,
): TextSkeleton {
    return TextSkeleton(context)
        .applyState(state)
        .apply {
            id = R.id.text_skeleton
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            setTextAppearance(textStyle)
        }
}

private fun text(
    context: Context,
    state: TextSkeletonUiState = TextSkeletonUiState(),
    @StyleRes textStyle: Int,
): TextView {
    return TextView(context)
        .applyState(state)
        .apply {
            id = R.id.text_over_skeleton
            layoutParams =
                ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setTextColor(context.getTextColorPrimary())
            setTextAppearance(textStyle)
        }
}

/**
 * Применяет [TextSkeletonUiState] к [TextView]
 */
fun TextView.applyState(state: TextSkeletonUiState) = apply {
    maxLines = state.lineCount
    text = state.text
}

/**
 * Применяет [TextSkeletonUiState] к [TextSkeleton]
 */
fun TextSkeleton.applyState(state: TextSkeletonUiState) = apply {
    lineCount = state.lineCount
    lineWidthProvider = when (state.width) {
        TextSkeletonWidth.Random -> SkeletonLineWidthProvider.RandomDeviation()
        TextSkeletonWidth.FullWidth -> SkeletonLineWidthProvider.FillMaxWidth
    }
}
