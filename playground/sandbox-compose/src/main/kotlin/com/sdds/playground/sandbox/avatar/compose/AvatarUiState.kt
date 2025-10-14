package com.sdds.playground.sandbox.avatar.compose

import androidx.compose.ui.Alignment
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarPlaceholder
import com.sdds.compose.uikit.AvatarStatus
import com.sdds.playground.sandbox.core.compose.UiState

/**
 * Состояние [Avatar]
 *
 * @property status статус [AvatarStatus]
 * @property exampleMode режим отображения аватара
 * @property placeholder текст-заглушка
 * @property threshold максимальное кол-во отображаемых [Avatar]
 * @property extra обвесы (badge, counter)
 * @property extraPlacement расположение обвесов
 * @property badgeText текст badge
 * @property badgeContentStart иконка badge вначале
 * @property badgeContentEnd иконка badge вконце
 * @property counterText текст счетчика
 */
internal data class AvatarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val status: AvatarStatus = AvatarStatus.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val placeholder: AvatarPlaceholder? = AvatarPlaceholder.Name("Michael Scott"),
    val threshold: Int = DEFAULT_THRESHOLD,
    val extra: AvatarExtra = AvatarExtra.None,
    val extraPlacement: AvatarExtraPlacement = AvatarExtraPlacement.TopStart,
    val badgeText: String = "Label",
    val badgeContentStart: Boolean = false,
    val badgeContentEnd: Boolean = false,
    val counterText: String = "1",
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

/**
 * Режим отображения аватара.
 * Нужен только для песочницы, чтобы показать, что аватар может работать в нескольких режимах.
 */
internal enum class ExampleMode {
    /**
     * Аватар будет отображать локальное изображение
     */
    Local,

    /**
     * Аватар будет отображать изображение, загруженное из интернета
     */
    Remote,

    /**
     * Аватар будет отображать заглушку
     */
    Placeholder,
}

/**
 * Обвесы аватара
 */
enum class AvatarExtra {
    /**
     * Без обвеса
     */
    None,

    /**
     * Бейдж
     */
    Badge,

    /**
     * Счетчик
     */
    Counter,
}

/**
 * Расположение обвесов [Avatar]
 * @property alignment значение расположения
 */
enum class AvatarExtraPlacement(val alignment: Alignment) {
    TopStart(Alignment.TopStart),
    TopEnd(Alignment.TopEnd),
    BottomEnd(Alignment.BottomEnd),
    BottomStart(Alignment.BottomStart),
}

private const val DEFAULT_THRESHOLD = 3
