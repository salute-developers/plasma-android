// AUTO-GENERATED. DO NOT MODIFY this file.
package com.sdds.serv.theme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.unit.Dp
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
expect fun collectWindowSizeInfoAsState(): State<WindowSizeInfo>
