package com.sdds.playground.sandbox.avatar

import android.os.Parcelable
import androidx.annotation.StyleRes
import com.sdds.serv.R
import com.sdds.uikit.Avatar
import kotlinx.parcelize.Parcelize

internal const val AVATAR_REMOTE_URL = "https://cdn.costumewall.com/wp-content/uploads/2018/09/michael-scott.jpg"

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
internal data class AvatarUiState(
    val variant: AvatarVariant = AvatarVariant.AvatarXXL,
    val status: Avatar.Status = Avatar.Status.ACTIVE,
    val exampleMode: ExampleMode = ExampleMode.Local,
    val fullName: String? = "Michael Scott",
    val actionEnabled: Boolean = false,
    val threshold: Int = 3,
) : Parcelable

/**
 * Стили вариаций компонента
 * @property styleRes ресурс стиля
 */
internal enum class AvatarVariant(@StyleRes val styleRes: Int) {
    AvatarXXL(R.style.Serv_Sdds_ComponentOverlays_AvatarXXL),
    AvatarL(R.style.Serv_Sdds_ComponentOverlays_AvatarL),
    AvatarM(R.style.Serv_Sdds_ComponentOverlays_AvatarM),
    AvatarS(R.style.Serv_Sdds_ComponentOverlays_AvatarS),
}

/**
 * Режим отображения аватара.
 * Нужен только для песочницы, чтобы показать, что аватар может работать в нескольких режимах.
 */
@Parcelize
internal enum class ExampleMode : Parcelable {
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
