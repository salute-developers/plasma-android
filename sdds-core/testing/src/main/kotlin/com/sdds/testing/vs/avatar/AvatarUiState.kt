package com.sdds.testing.vs.avatar

import android.os.Parcelable
import com.sdds.testing.vs.UiState
import com.sdds.uikit.Avatar
import kotlinx.parcelize.Parcelize

/**
 * URL аватара для загрузки из сети
 */
const val AVATAR_REMOTE_URL = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg"

/**
 * Состояние [Avatar]
 *
 * @property variant вариация
 * @property status статус [Avatar.Status]
 * @property exampleMode режим отображения аватара
 * @property fullName имя пользователя
 * @property actionEnabled включен ли action у [Avatar]
 * @property threshold максимальное кол-во отображаемых [Avatar]
 */
@Parcelize
data class AvatarUiState(
    override val variant: String = "",
    val status: Avatar.Status = Avatar.Status.ACTIVE,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val fullName: String? = "Michael Scott",
    val actionEnabled: Boolean = false,
    val threshold: Int = 3,
) : Parcelable, UiState {
    override fun updateVariant(variant: String): UiState {
        return copy(variant = variant)
    }
}

/**
 * Режим отображения аватара.
 * Нужен только для песочницы, чтобы показать, что аватар может работать в нескольких режимах.
 */
@Parcelize
enum class ExampleMode : Parcelable {
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
