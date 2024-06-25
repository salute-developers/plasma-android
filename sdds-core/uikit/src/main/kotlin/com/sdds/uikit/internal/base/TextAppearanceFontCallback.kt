package com.sdds.uikit.internal.base

import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat.FontCallback

/**
 * [FontCallback] font fetch, in case a different font is set / requested in the meantime.
 *
 */
@Suppress("UnnecessaryAbstractClass")
internal abstract class TextAppearanceFontCallback {
    /**
     * Called when an asynchronous font was finished loading.
     *
     * @param typeface Font that was loaded.
     * @param fontResolvedSynchronously Whether the font was loaded synchronously, because it was
     * already available.
     */
    abstract fun onFontRetrieved(typeface: Typeface, fontResolvedSynchronously: Boolean)

    /** Called when an asynchronous font failed to load.  */
    abstract fun onFontRetrievalFailed(reason: Int)
}
