package com.sdds.playground.sandbox.avatar.compose

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
 * @property actionEnabled включен ли action у [Avatar]
 * @property threshold максимальное кол-во отображаемых [Avatar]
 */
internal data class AvatarUiState(
    override val variant: String = "",
    val status: AvatarStatus = AvatarStatus.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val placeholder: AvatarPlaceholder? = AvatarPlaceholder.Name("Michael Scott"),
    val actionEnabled: Boolean = false,
    val threshold: Int = DEFAULT_THRESHOLD,
) : UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
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

private const val DEFAULT_THRESHOLD = 3
