package com.sdds.compose.uikit

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulValue
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
@ApiInfo
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
    @Deprecated("Use dimensions(AvatarGroupDimensionsBuilder)", ReplaceWith("dimensions { }"))
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
interface AvatarGroupDimensions {

    /**
     * Смещения дочерних [Avatar] относительно друг друга
     */
    val itemOffsetValues: StatefulValue<Dp>

    /**
     * Расстояния между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    val itemSpacingValues: StatefulValue<Dp>

    companion object {

        /**
         * Возвращает [AvatarGroupDimensionsBuilder]
         */
        fun builder(): AvatarGroupDimensionsBuilder = DefaultAvatarGroupDimensions.Builder()
    }
}

/**
 * Factory-функция для создания [AvatarGroupDimensions] из параметров.
 *
 * @deprecated Используйте [AvatarGroupDimensions.builder]
 */
@Deprecated(
    "Use dimensions() with builder instead",
)
fun AvatarGroupDimensions(
    itemOffset: Dp = AvatarDefaults.DefaultItemOffset,
    itemSpacing: Dp = AvatarDefaults.DefaultItemSpacing,
): AvatarGroupDimensions = DefaultAvatarGroupDimensions(
    itemOffsetValues = itemOffset.asStatefulValue(),
    itemSpacingValues = itemSpacing.asStatefulValue(),
)

/**
 * Билдер для [AvatarGroupDimensions]
 */
interface AvatarGroupDimensionsBuilder {

    /**
     * Устанавливает смещение дочерних [Avatar] относительно друг друга
     */
    fun itemOffset(itemOffset: Dp): AvatarGroupDimensionsBuilder =
        itemOffset(itemOffset.asStatefulValue())

    /**
     * Устанавливает смещения дочерних [Avatar] относительно друг друга
     */
    fun itemOffset(itemOffset: StatefulValue<Dp>): AvatarGroupDimensionsBuilder

    /**
     * Устанавливает расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    fun itemSpacing(itemSpacing: Dp): AvatarGroupDimensionsBuilder =
        itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояния между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): AvatarGroupDimensionsBuilder

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
        private var dimensionsBuilder: DefaultAvatarGroupDimensions.Builder =
            DefaultAvatarGroupDimensions.Builder()

        override fun avatarStyle(avatarStyle: AvatarStyle) = apply {
            this.avatarStyle = avatarStyle
        }

        @Deprecated("Use dimensions() with builder instead")
        override fun dimensions(dimensions: AvatarGroupDimensions) = apply {
            this.dimensionsBuilder.apply {
                itemOffset(dimensions.itemOffsetValues)
                itemSpacing(dimensions.itemSpacingValues)
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

@Immutable
private data class DefaultAvatarGroupDimensions(
    override val itemOffsetValues: StatefulValue<Dp>,
    override val itemSpacingValues: StatefulValue<Dp>,
) : AvatarGroupDimensions {
    class Builder : AvatarGroupDimensionsBuilder {

        private var itemOffsetValues: StatefulValue<Dp> =
            AvatarDefaults.DefaultItemOffset.asStatefulValue()
        private var itemSpacingValues: StatefulValue<Dp> =
            AvatarDefaults.DefaultItemSpacing.asStatefulValue()

        override fun itemOffset(itemOffset: StatefulValue<Dp>): AvatarGroupDimensionsBuilder =
            apply { this.itemOffsetValues = itemOffset }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>): AvatarGroupDimensionsBuilder =
            apply { this.itemSpacingValues = itemSpacing }

        override fun build(): AvatarGroupDimensions =
            DefaultAvatarGroupDimensions(itemOffsetValues, itemSpacingValues)
    }
}
