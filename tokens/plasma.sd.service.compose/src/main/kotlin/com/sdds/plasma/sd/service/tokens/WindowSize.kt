// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.plasma.sd.service.tokens
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp

/**
 * Класс размерности окна.
 * См. [developer.android.com](https://developer.android.com/guide/topics/large-screens/support-different-screen-sizes)
 */
enum class WindowSizeClass {
    Compact,
    Medium,
    Expanded,
}

/**
 * Возвращает значение в dp - брейкпоинт по высоте для указанного класса размерности.
 */
fun WindowSizeClass.heightBreakPoint(): Dp =
    when (this) {
        WindowSizeClass.Compact -> 0.dp
        WindowSizeClass.Medium -> 480.dp
        WindowSizeClass.Expanded -> 900.dp
    }

/**
 * Информация о размерности окна
 * @property widthClass класс размерности ширины окна
 * @property heightClass класс размерности высоты окна
 */
data class WindowSizeInfo(
    val widthClass: WindowSizeClass = WindowSizeClass.Medium,
    val heightClass: WindowSizeClass = WindowSizeClass.Medium,
)

/**
 * Возвращает информацию о размерности окна как state
 */
@Composable
fun collectWindowSizeInfoAsState(): State<WindowSizeInfo> {
    val info = remember { mutableStateOf(WindowSizeInfo()) }
    val context = LocalContext.current
    val mediumWidthBreakPoint = WindowSizeClass.Medium.widthBreakPoint().px
    val mediumHeightBreakPoint = WindowSizeClass.Medium.heightBreakPoint().px
    val expandedWidthBreakPoint = WindowSizeClass.Expanded.widthBreakPoint().px
    val expandedHeightBreakPoint = WindowSizeClass.Expanded.heightBreakPoint().px

    info.value = remember(context, LocalConfiguration.current) {
        val displayMetrics = context.resources.displayMetrics
        val size = IntSize(displayMetrics.widthPixels, displayMetrics.heightPixels)
        val widthClass = when {
            size.width < mediumWidthBreakPoint -> WindowSizeClass.Compact
            size.width in mediumWidthBreakPoint until expandedWidthBreakPoint -> WindowSizeClass.Medium
            else -> WindowSizeClass.Expanded
        }
        val heightClass = when {
            size.height < mediumHeightBreakPoint -> WindowSizeClass.Compact
            size.height in mediumHeightBreakPoint until expandedHeightBreakPoint -> WindowSizeClass.Medium
            else -> WindowSizeClass.Expanded
        }
        WindowSizeInfo(widthClass, heightClass)
    }

    return info
}

private val Dp.px: Int
    @Composable
    get() = with(LocalDensity.current) { this@px.roundToPx() }
