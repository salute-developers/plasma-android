package com.sdds.playground.sandbox.avatar

import com.sdds.compose.uikit.Avatar
import com.sdds.playground.sandbox.avatar.SandboxAvatarSettingsProvider.Threshold

/**
 * Состояние Avatar
 *
 * @property size размер [SandboxAvatar.Size]
 * @property status статус [SandboxAvatar.Status]
 * @property exampleMode режим отображения аватара
 * @property placeholder текст-заглушка
 * @property actionEnabled включен ли action у [SandboxAvatar]
 * @property threshold максимальное кол-во отображаемых [SandboxAvatar]
 */
internal data class AvatarUiState(
    val size: SandboxAvatar.Size = SandboxAvatar.Size.XXL,
    val status: SandboxAvatar.Status = SandboxAvatar.Status.Active,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val placeholder: Avatar.Placeholder? = Avatar.Placeholder.Name("Michael Scott"),
    val actionEnabled: Boolean = false,
    val threshold: Int = Threshold,
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
