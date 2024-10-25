package com.sdds.playground.sandbox.avatar

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.Avatar
import com.sdds.compose.uikit.AvatarStyle

/**
 * Состояние [Avatar]
 *
 * @property size размер [Size]
 * @property status статус [Avatar.Status]
 * @property exampleMode режим отображения аватара
 * @property placeholder текст-заглушка
 * @property actionEnabled включен ли action у [Avatar]
 * @property threshold максимальное кол-во отображаемых [Avatar]
 */
internal data class AvatarUiState(
    val size: Size = Size.XXL,
    val status: Avatar.Status = Avatar.Status.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val placeholder: Avatar.Placeholder? = Avatar.Placeholder.Name("Michael Scott"),
    val actionEnabled: Boolean = false,
    val threshold: Int = DEFAULT_THRESHOLD,
)

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
 * Размер компонента
 */
internal enum class Size {
    XXL, L, M, S,
}

@Composable
internal fun AvatarUiState.avatarStyle(): AvatarStyle =
    when (size) {
        Size.XXL -> Avatar.Xxl.style()
        Size.L -> Avatar.L.style()
        Size.M -> Avatar.M.style()
        Size.S -> Avatar.S.style()
    }

private const val DEFAULT_THRESHOLD = 3
