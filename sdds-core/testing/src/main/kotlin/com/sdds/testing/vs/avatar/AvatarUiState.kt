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
 * @property threshold имя пользователя
 * @property extra обвесы (badge, counter)
 * @property extraPlacement расположение обвесов
 * @property badgeText текст badge
 * @property badgeContentStart иконка badge вначале
 * @property badgeContentEnd иконка badge вконце
 * @property counterText текст счетчика
 */
@Parcelize
data class AvatarUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val status: Avatar.Status = Avatar.Status.ACTIVE,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val fullName: String? = "Michael Scott",
    val threshold: Int = 3,
    val extra: AvatarExtra = AvatarExtra.None,
    val extraPlacement: AvatarExtraPlacement = AvatarExtraPlacement.TOP_START,
    val badgeText: String = "Label",
    val badgeContentStart: Boolean = false,
    val badgeContentEnd: Boolean = false,
    val counterText: String = "1",
) : Parcelable, UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
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

/**
 * Обвесы аватара
 */
@Parcelize
enum class AvatarExtra : Parcelable {
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
 * Расположение обвесом [Avatar]
 * @property raw значение расположения
 */
@Parcelize
enum class AvatarExtraPlacement(val raw: Int) : Parcelable {
    TOP_START(Avatar.EXTRA_PLACEMENT_TOP_START),
    TOP_END(Avatar.EXTRA_PLACEMENT_TOP_END),
    BOTTOM_END(Avatar.EXTRA_PLACEMENT_BOTTOM_END),
    BOTTOM_START(Avatar.EXTRA_PLACEMENT_BOTTOM_START),
}
