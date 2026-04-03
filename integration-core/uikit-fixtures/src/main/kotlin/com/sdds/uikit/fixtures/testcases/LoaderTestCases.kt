package com.sdds.uikit.fixtures.testcases

import android.view.Gravity
import android.widget.FrameLayout
import com.sdds.uikit.Loader
import com.sdds.uikit.fixtures.ComponentScope
import com.sdds.uikit.fixtures.RoborazziConfig
import com.sdds.uikit.fixtures.stories.loader.LoaderType
import com.sdds.uikit.fixtures.stories.loader.LoaderUiState
import com.sdds.uikit.fixtures.stories.loader.loader

/**
 * Тест-кейсы для [Loader]
 */
@Suppress("UndocumentedPublicFunction")
abstract class LoaderTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-2212
     */
    abstract fun testLoaderSpinner()

    /**
     * PLASMA-2213
     */
    abstract fun testLoaderProgress()

    fun ComponentScope.loaderSpinner(style: Int): Loader =
        fillSize {
            loader(
                context = context,
                style = style,
                LoaderUiState(
                    variant = "",
                    loaderType = LoaderType.Spinner,
                ),
            ).apply {
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.WRAP_CONTENT,
                    FrameLayout.LayoutParams.WRAP_CONTENT,
                    Gravity.CENTER,
                )
            }
        }

    fun ComponentScope.loaderProgress(style: Int): Loader =
        fillSize {
            loader(
                context = context,
                style = style,
                LoaderUiState(
                    variant = "",
                    loaderType = LoaderType.Progress,
                ),
            ).apply {
                layoutParams = FrameLayout.LayoutParams(
                    FrameLayout.LayoutParams.WRAP_CONTENT,
                    FrameLayout.LayoutParams.WRAP_CONTENT,
                    Gravity.CENTER,
                )
            }
        }
}
