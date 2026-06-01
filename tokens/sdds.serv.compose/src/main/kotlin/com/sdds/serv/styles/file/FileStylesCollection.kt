// AUTO-GENERATED. DO NOT MODIFY this file.
@file:Suppress(
    "UndocumentedPublicClass",
    "UndocumentedPublicProperty",
    "ktlint:standard:max-line-length",
    "MatchingDeclarationName",
    "CyclomaticComplexMethod",
    "LongMethod",
)

package com.sdds.serv.styles.`file`

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.FileStyle
import com.sdds.compose.uikit.FileStyleBuilder
import com.sdds.compose.uikit.style.modify
import com.sdds.compose.uikit.style.style
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Вспомогательный объект для описания всех стилей компонента File
 */
public enum class FileStyles(
    public val key: String,
) {
    FileCircularProgressXsDefault("FileCircularProgress.Xs.Default"),
    FileCircularProgressXsNegative("FileCircularProgress.Xs.Negative"),
    FileCircularProgressSDefault("FileCircularProgress.S.Default"),
    FileCircularProgressSNegative("FileCircularProgress.S.Negative"),
    FileCircularProgressMDefault("FileCircularProgress.M.Default"),
    FileCircularProgressMNegative("FileCircularProgress.M.Negative"),
    FileCircularProgressLDefault("FileCircularProgress.L.Default"),
    FileCircularProgressLNegative("FileCircularProgress.L.Negative"),
    FileLinearProgressXsDefault("FileLinearProgress.Xs.Default"),
    FileLinearProgressXsNegative("FileLinearProgress.Xs.Negative"),
    FileLinearProgressSDefault("FileLinearProgress.S.Default"),
    FileLinearProgressSNegative("FileLinearProgress.S.Negative"),
    FileLinearProgressMDefault("FileLinearProgress.M.Default"),
    FileLinearProgressMNegative("FileLinearProgress.M.Negative"),
    FileLinearProgressLDefault("FileLinearProgress.L.Default"),
    FileLinearProgressLNegative("FileLinearProgress.L.Negative"),
    ;

    /**
     * Typed API для подбора стиля file-circular-progress
     */
    public object CircularProgress

    /**
     * Typed API для подбора стиля file-linear-progress
     */
    public object LinearProgress
}

/**
 * Возможные значения свойства size для file-circular-progress
 */
public enum class FileCircularProgressSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства view для file-circular-progress
 */
public enum class FileCircularProgressView {
    Default,
    Negative,
}

/**
 * Возможные значения свойства size для file-linear-progress
 */
public enum class FileLinearProgressSize {
    Xs,
    S,
    M,
    L,
}

/**
 * Возможные значения свойства view для file-linear-progress
 */
public enum class FileLinearProgressView {
    Default,
    Negative,
}

/**
 * Возвращает [FileStyle] для [FileStyles]
 */
@Composable
public fun FileStyles.style(modify: @Composable FileStyleBuilder.() -> Unit = {}): FileStyle {
    val builder = when (this) {
        FileStyles.FileCircularProgressXsDefault -> FileCircularProgress.Xs.Default
        FileStyles.FileCircularProgressXsNegative -> FileCircularProgress.Xs.Negative
        FileStyles.FileCircularProgressSDefault -> FileCircularProgress.S.Default
        FileStyles.FileCircularProgressSNegative -> FileCircularProgress.S.Negative
        FileStyles.FileCircularProgressMDefault -> FileCircularProgress.M.Default
        FileStyles.FileCircularProgressMNegative -> FileCircularProgress.M.Negative
        FileStyles.FileCircularProgressLDefault -> FileCircularProgress.L.Default
        FileStyles.FileCircularProgressLNegative -> FileCircularProgress.L.Negative
        FileStyles.FileLinearProgressXsDefault -> FileLinearProgress.Xs.Default
        FileStyles.FileLinearProgressXsNegative -> FileLinearProgress.Xs.Negative
        FileStyles.FileLinearProgressSDefault -> FileLinearProgress.S.Default
        FileStyles.FileLinearProgressSNegative -> FileLinearProgress.S.Negative
        FileStyles.FileLinearProgressMDefault -> FileLinearProgress.M.Default
        FileStyles.FileLinearProgressMNegative -> FileLinearProgress.M.Negative
        FileStyles.FileLinearProgressLDefault -> FileLinearProgress.L.Default
        FileStyles.FileLinearProgressLNegative -> FileLinearProgress.L.Negative
    }
    return builder.modify(modify).style()
}

/**
 * Возвращает экземпляр [FileStyles] для file-circular-progress
 */
public fun FileStyles.CircularProgress.resolve(
    size: FileCircularProgressSize =
        FileCircularProgressSize.Xs,
    view: FileCircularProgressView =
        FileCircularProgressView.Default,
): FileStyles = when {
    size == FileCircularProgressSize.Xs && view == FileCircularProgressView.Default ->
        FileStyles.FileCircularProgressXsDefault
    size == FileCircularProgressSize.Xs && view == FileCircularProgressView.Negative ->
        FileStyles.FileCircularProgressXsNegative
    size == FileCircularProgressSize.S && view == FileCircularProgressView.Default ->
        FileStyles.FileCircularProgressSDefault
    size == FileCircularProgressSize.S && view == FileCircularProgressView.Negative ->
        FileStyles.FileCircularProgressSNegative
    size == FileCircularProgressSize.M && view == FileCircularProgressView.Default ->
        FileStyles.FileCircularProgressMDefault
    size == FileCircularProgressSize.M && view == FileCircularProgressView.Negative ->
        FileStyles.FileCircularProgressMNegative
    size == FileCircularProgressSize.L && view == FileCircularProgressView.Default ->
        FileStyles.FileCircularProgressLDefault
    size == FileCircularProgressSize.L && view == FileCircularProgressView.Negative ->
        FileStyles.FileCircularProgressLNegative
    else -> error("Unsupported file-circular-progress style combination")
}

/**
 * Возвращает [FileStyle] для file-circular-progress
 */
@Composable
public fun FileStyles.CircularProgress.style(
    size: FileCircularProgressSize = FileCircularProgressSize.Xs,
    view: FileCircularProgressView = FileCircularProgressView.Default,
    modify: @Composable FileStyleBuilder.() -> Unit = {},
): FileStyle = resolve(size, view).style(modify)

/**
 * Возвращает экземпляр [FileStyles] для file-linear-progress
 */
public fun FileStyles.LinearProgress.resolve(
    size: FileLinearProgressSize =
        FileLinearProgressSize.Xs,
    view: FileLinearProgressView = FileLinearProgressView.Default,
): FileStyles = when {
    size == FileLinearProgressSize.Xs && view == FileLinearProgressView.Default ->
        FileStyles.FileLinearProgressXsDefault
    size == FileLinearProgressSize.Xs && view == FileLinearProgressView.Negative ->
        FileStyles.FileLinearProgressXsNegative
    size == FileLinearProgressSize.S && view == FileLinearProgressView.Default ->
        FileStyles.FileLinearProgressSDefault
    size == FileLinearProgressSize.S && view == FileLinearProgressView.Negative ->
        FileStyles.FileLinearProgressSNegative
    size == FileLinearProgressSize.M && view == FileLinearProgressView.Default ->
        FileStyles.FileLinearProgressMDefault
    size == FileLinearProgressSize.M && view == FileLinearProgressView.Negative ->
        FileStyles.FileLinearProgressMNegative
    size == FileLinearProgressSize.L && view == FileLinearProgressView.Default ->
        FileStyles.FileLinearProgressLDefault
    size == FileLinearProgressSize.L && view == FileLinearProgressView.Negative ->
        FileStyles.FileLinearProgressLNegative
    else -> error("Unsupported file-linear-progress style combination")
}

/**
 * Возвращает [FileStyle] для file-linear-progress
 */
@Composable
public fun FileStyles.LinearProgress.style(
    size: FileLinearProgressSize = FileLinearProgressSize.Xs,
    view: FileLinearProgressView = FileLinearProgressView.Default,
    modify: @Composable FileStyleBuilder.() -> Unit = {},
): FileStyle = resolve(size, view).style(modify)
