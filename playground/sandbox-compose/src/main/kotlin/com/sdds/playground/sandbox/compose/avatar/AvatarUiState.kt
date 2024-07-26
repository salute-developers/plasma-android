package com.sdds.playground.sandbox.avatar

import com.sdds.playground.sandbox.compose.avatar.SandboxAvatar

/**
 * Состояние Avatar
 *
 * @property size размер [SandboxAvatar.Size]
 * @property status статус [SandboxAvatar.Status]
 * @property exampleMode режим отображения аватара
 * @property placeholder текст-заглушка
 * @property actionEnabled включен ли action у [SandboxAvatar]
 */
internal data class AvatarUiState(
    val size: SandboxAvatar.Size = SandboxAvatar.Size.XXL,
    val status: SandboxAvatar.Status = SandboxAvatar.Status.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val placeholder: String? = "PP",
    val actionEnabled: Boolean = false,
)

/**
 * Режим отображения аватара.
 * Нужен только для песочницы, чтобы показать, что аватар может работать в нескольких режимах.
 */
enum class ExampleMode {
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
