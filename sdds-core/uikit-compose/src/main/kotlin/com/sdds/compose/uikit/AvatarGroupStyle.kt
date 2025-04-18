package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
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
        fun builder(): AvatarGroupStyleBuilder = builder(null)

        /**
         * Возвращает экземпляр [AvatarGroupStyleBuilder]
         */
        fun builder(receiver: Any?): AvatarGroupStyleBuilder = DefaultAvatarGroupStyle.Builder(receiver)
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

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see AvatarGroupStyle.dimensions
     * @see AvatarGroupDimensions
     */
    @Composable
    fun dimensions(builder: @Composable AvatarGroupDimensionsBuilder.() -> Unit): AvatarGroupStyleBuilder
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

/**
 * Билдер для [AvatarGroupDimensions]
 */
interface AvatarGroupDimensionsBuilder {

    /**
     * Устанавливает смещение дочерних [Avatar] относительно друг друга
     */
    fun itemOffset(itemOffset: Dp): AvatarGroupDimensionsBuilder

    /**
     * Устанавливает расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    fun itemSpacing(itemSpacing: Dp): AvatarGroupDimensionsBuilder

    /**
     * Собирает [AvatarGroupDimensions]
     */
    fun build(): AvatarGroupDimensions
}

@Immutable
private data class DefaultAvatarGroupStyle(
    override val avatarStyle: AvatarStyle,
    override val dimensions: AvatarGroupDimensions,
) : AvatarGroupStyle {

    class Builder(override val receiver: Any?) : AvatarGroupStyleBuilder {

        private var avatarStyle: AvatarStyle? = null
        private var dimensionsBuilder: DefaultAvatarGroupDimensionsBuilder = DefaultAvatarGroupDimensionsBuilder()

        override fun avatarStyle(avatarStyle: AvatarStyle) = apply {
            this.avatarStyle = avatarStyle
        }

        override fun dimensions(dimensions: AvatarGroupDimensions) = apply {
            dimensionsBuilder.apply {
                itemOffset(dimensions.itemOffset)
                itemSpacing(dimensions.itemSpacing)
            }
        }

        @Composable
        override fun dimensions(
            builder: @Composable AvatarGroupDimensionsBuilder.() -> Unit,
        ): AvatarGroupStyleBuilder = apply {
            dimensionsBuilder.builder()
        }

        override fun style(): AvatarGroupStyle =
            DefaultAvatarGroupStyle(
                avatarStyle = avatarStyle ?: AvatarStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
            )
    }
}

private class DefaultAvatarGroupDimensionsBuilder : AvatarGroupDimensionsBuilder {

    private var itemOffset: Dp = AvatarDefaults.DefaultItemOffset
    private var itemSpacing: Dp = AvatarDefaults.DefaultItemSpacing

    override fun itemOffset(itemOffset: Dp): AvatarGroupDimensionsBuilder = apply {
        this.itemOffset = itemOffset
    }

    override fun itemSpacing(itemSpacing: Dp): AvatarGroupDimensionsBuilder = apply {
        this.itemSpacing = itemSpacing
    }

    override fun build(): AvatarGroupDimensions {
        return AvatarGroupDimensions(itemOffset, itemSpacing)
    }
}
