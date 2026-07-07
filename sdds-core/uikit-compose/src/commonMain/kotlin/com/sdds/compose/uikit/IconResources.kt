package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import com.sdds.compose.uikit.annotations.DrawableRes
import com.sdds.compose.uikit.internal.platform.painterResource

/**
 * Создает [ImageSource] на основе drawable-ресурса.
 *
 * @param id идентификатор drawable-ресурса
 */
@Composable
fun resourceImageSource(@DrawableRes id: Int): ImageSource {
    return ImageSource { painterResource(id) }
}
