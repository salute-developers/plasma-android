package com.sdds.testing.vs.file

import com.sdds.testing.vs.ComponentScope
import com.sdds.testing.vs.RoborazziConfig
import com.sdds.uikit.File

/**
 * Тест-кейсы для [File]
 */
@Suppress("UndocumentedPublicFunction")
abstract class FileTestCases(mode: String) : RoborazziConfig(mode) {

    /**
     * PLASMA-T2444
     */
    abstract fun testFileCircularProgressLDefaultIsLoadingStart()

    /**
     * PLASMA-T2445
     */
    abstract fun testFileLinearProgressMNegativeIsLoadingHasContentEnd()

    /**
     * PLASMA-T2446
     */
    abstract fun testFileCircularProgressSDefaultHasContentDescriptionEnd()

    /**
     * PLASMA-T2447
     */
    abstract fun testFileLinearProgressXsNegativeIsLoadingLabelDescriptionStart()

    /**
     * PLASMA-T2448
     */
    abstract fun testFileCircularProgressLNegativeIsLoadingLongText()

    /**
     * PLASMA-T2449
     */
    abstract fun testFileCircularProgressLDefaultIsLoadingHasContentNoDescriptionEnd()

    fun ComponentScope.fileLabelDescriptionIsLoadingStart(style: Int): File =
        file(
            context = context,
            style = style,
            state = FileUiState(
                variant = "",
                appearance = "",
                label = "image.jpg",
                description = "1.2MB",
                isLoading = true,
                hasContentStart = false,
                actionPlacement = ActionPlacement.Start,
                contentType = FileContentType.Icon,
            ),
        )

    fun ComponentScope.fileIsLoadingHasContentEnd(style: Int): File =
        file(
            context = context,
            style = style,
            state = FileUiState(
                variant = "",
                appearance = "",
                label = "image.jpg",
                description = "1.2MB",
                isLoading = true,
                hasContentStart = true,
                actionPlacement = ActionPlacement.End,
                contentType = FileContentType.Icon,
            ),
        )

    fun ComponentScope.fileHasContentNoLabelEnd(style: Int): File =
        file(
            context = context,
            style = style,
            state = FileUiState(
                variant = "",
                appearance = "",
                label = "",
                description = "1.2MB",
                isLoading = false,
                hasContentStart = true,
                actionPlacement = ActionPlacement.End,
                contentType = FileContentType.Icon,
            ),
        )

    fun ComponentScope.fileLongText(style: Int): File =
        file(
            context = context,
            style = style,
            state = FileUiState(
                variant = "",
                appearance = "",
                label = "Lorem Ipsum is simply dummy text of the printing and typesetting",
                description = "Lorem Ipsum is simply dummy text of the printing and typesetting",
                isLoading = true,
                hasContentStart = false,
                actionPlacement = ActionPlacement.End,
                contentType = FileContentType.Icon,
            ),
        )

    fun ComponentScope.fileIsLoadingHasContentNoDescriptionEnd(style: Int): File =
        file(
            context = context,
            style = style,
            state = FileUiState(
                variant = "",
                appearance = "",
                label = "image.jpg",
                description = "",
                isLoading = true,
                hasContentStart = true,
                actionPlacement = ActionPlacement.End,
                contentType = FileContentType.Icon,
            ),
        )
}
