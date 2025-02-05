package com.sdds.testing.vs.avatar

import android.content.Context
import android.view.ContextThemeWrapper
import com.sdds.testing.R
import com.sdds.uikit.Avatar

/**
 * Фабрика для создания аватаров
 */
fun avatarFactory(
    context: Context,
    avatarId: Int,
    avatarStyle: Int = 0,
    status: Avatar.Status = Avatar.Status.ACTIVE,
    fullName: String = "Michael Scott",
    imageMode: ImageMode = ImageMode.Local,
    actionEnabled: Boolean = false,
): Avatar {
    return Avatar(ContextThemeWrapper(context, avatarStyle)).apply {
        this.id = avatarId
        this.status = status
        this.actionEnabled = actionEnabled
        id = R.id.avatar
        setInitials(fullName)
        when (imageMode) {
            ImageMode.Local -> setImageResource(R.drawable.il_avatar_for_test)
            ImageMode.Placeholder -> setImageDrawable(null)
        }
    }
        .also { avatar = it }
}

private var avatar: Avatar? = null

/**
 * Статус аватара
 */
enum class ImageMode {
    Local,

    Placeholder,
}
