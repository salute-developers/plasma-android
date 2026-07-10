package com.sdds.compose.uikit

import com.sdds.compose.uikit.annotations.DrawableRes

/**
 * Создает [ImageSource] на основе drawable-ресурса.
 *
 * @param id идентификатор drawable-ресурса
 */
fun resourceImageSource(@DrawableRes id: Int): ImageSource {
    return ImageSource { androidx.compose.ui.res.painterResource(id) }
}
