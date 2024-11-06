package com.sdds.compose.uikit

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import com.sdds.compose.uikit.internal.AvatarDefaults
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [AvatarGroupStyle] для компонента [AvatarGroup]
 */
val LocalAvatarGroupStyle = compositionLocalOf { AvatarGroupStyle.builder().style() }

/**
 * Стиль компонента [AvatarGroup]
 */
@Stable
interface AvatarGroupStyle : Style {

    /**
     * Стиль дочерних [Avatar]
     * @see AvatarStyle
     */
    val avatarStyle: AvatarStyle

    /**
     * Размеры и отступы компонента
     * @see AvatarGroupDimensions
     */
    val dimensions: AvatarGroupDimensions

    companion object {

        /**
         * Возвращает экземпляр [AvatarGroupStyleBuilder]
         */
        fun builder(): AvatarGroupStyleBuilder = DefaultAvatarGroupStyle.Builder()
    }
}

/**
 * Builder для [AvatarStyle]
 */
@Stable
interface AvatarGroupStyleBuilder : StyleBuilder<AvatarGroupStyle> {

    /**
     * Устанавливает стиль [avatarStyle] для дочерних [Avatar]
     * @see AvatarGroupStyle.avatarStyle
     * @see AvatarStyle
     */
    fun avatarStyle(avatarStyle: AvatarStyle): AvatarGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see AvatarGroupStyle.dimensions
     * @see AvatarGroupDimensions
     */
    fun dimensions(dimensions: AvatarGroupDimensions): AvatarGroupStyleBuilder
}

/**
 * Размеры и отступы компонента [AvatarGroup]
 * @property itemOffset смещение дочерних [Avatar] относительно друг друга
 * @property itemSpacing расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
 */
@Immutable
data class AvatarGroupDimensions(
    val itemOffset: Dp = AvatarDefaults.DefaultItemOffset,
    val itemSpacing: Dp = AvatarDefaults.DefaultItemSpacing,
)

@Immutable
private data class DefaultAvatarGroupStyle(
    override val avatarStyle: AvatarStyle,
    override val dimensions: AvatarGroupDimensions,
) : AvatarGroupStyle {

    class Builder : AvatarGroupStyleBuilder {

        private var avatarStyle: AvatarStyle? = null
        private var dimensions: AvatarGroupDimensions? = null

        override fun avatarStyle(avatarStyle: AvatarStyle) = apply {
            this.avatarStyle = avatarStyle
        }

        override fun dimensions(dimensions: AvatarGroupDimensions) = apply {
            this.dimensions = dimensions
        }

        override fun style(): AvatarGroupStyle =
            DefaultAvatarGroupStyle(
                avatarStyle = avatarStyle ?: AvatarStyle.builder().style(),
                dimensions = dimensions ?: AvatarGroupDimensions(),
            )
    }
}
