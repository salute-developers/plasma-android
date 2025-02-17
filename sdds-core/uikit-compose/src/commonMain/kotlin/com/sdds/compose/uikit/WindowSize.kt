package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Класс размерности окна.
 * См. [developer.android.com](https://developer.android.com/guide/topics/large-screens/support-different-screen-sizes)
 * @author Малышев Александр on 23.04.2024
 */
enum class WindowSizeClass {
    Compact,
    Medium,
    Expanded,
}

/**
 * Возвращает значение в dp - брейкпоинт по ширине для указанного класса размерности.
 */
fun WindowSizeClass.widthBreakPoint(): Dp =
    when (this) {
        WindowSizeClass.Compact -> 0.dp
        WindowSizeClass.Medium -> 600.dp
        WindowSizeClass.Expanded -> 840.dp
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
expect fun collectWindowSizeInfoAsState(): State<WindowSizeInfo>
