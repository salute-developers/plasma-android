package com.sdds.uikit.internal.base

import android.graphics.Typeface

/**
 * [FontCallback] allowing cancelling of pending async font fetch, in case a different font is
 * set / requested in the meantime. On failed fetch, specified fallback font will be applied.
 *
 * @hide
 */
internal class CancelableFontCallback(
    private val applyFont: ApplyFont,
    private val fallbackFont: Typeface,
) : TextAppearanceFontCallback() {

    /** Functional interface for method to call when font is retrieved (or fails with fallback).  */
    internal fun interface ApplyFont {
        fun apply(font: Typeface)
    }

    private var cancelled = false

    override fun onFontRetrieved(typeface: Typeface, fontResolvedSynchronously: Boolean) {
        updateIfNotCancelled(typeface)
    }

    override fun onFontRetrievalFailed(reason: Int) {
        updateIfNotCancelled(fallbackFont)
    }

    /**
     * Cancels this callback. No async operations will actually be interrupted as a result of this
     * method, but it will ignore any subsequent result of the fetch.
     *
     *
     * Callback cannot be resumed after canceling. New callback has to be created.
     */
    fun cancel() {
        cancelled = true
    }

    private fun updateIfNotCancelled(updatedFont: Typeface) {
        if (!cancelled) {
            applyFont.apply(updatedFont)
        }
    }
}
