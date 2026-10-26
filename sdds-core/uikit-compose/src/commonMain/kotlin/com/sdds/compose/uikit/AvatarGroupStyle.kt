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
    @Deprecated("Use dimensionValues", ReplaceWith("dimensionValues"))
    val dimensions: AvatarGroupDimensions

    /**
     * Размеры и отступы компонента
     * @see AvatarGroupDimensionValues
     */
    val dimensionValues: AvatarGroupDimensionValues

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
    @Deprecated("Use dimensionValues(AvatarGroupDimensionValuesBuilder)", ReplaceWith("dimensionValues { }"))
    fun dimensions(dimensions: AvatarGroupDimensions): AvatarGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see AvatarGroupStyle.dimensions
     * @see AvatarGroupDimensions
     */
    @Deprecated("Use dimensionValues(AvatarGroupDimensionValuesBuilder)", ReplaceWith("dimensionValues { }"))
    @Composable
    fun dimensions(builder: @Composable AvatarGroupDimensionsBuilder.() -> Unit): AvatarGroupStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента [dimensions]
     * @see AvatarGroupStyle.dimensions
     * @see AvatarGroupDimensionValues
     */
    @Composable
    fun dimensionValues(builder: @Composable AvatarGroupDimensionValuesBuilder.() -> Unit): AvatarGroupStyleBuilder
}

/**
 * Размеры и отступы компонента [AvatarGroup]
 * @property itemOffset смещение дочерних [Avatar] относительно друг друга
 * @property itemSpacing расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
 */
@Deprecated("Use dimensionValues", ReplaceWith("dimensionValues"))
@Immutable
data class AvatarGroupDimensions(
    val itemOffset: Dp = AvatarDefaults.DefaultItemOffset,
    val itemSpacing: Dp = AvatarDefaults.DefaultItemSpacing,
)

/**
 * Размеры и отступы компонента [AvatarGroup]
 * @property itemOffsetValues смещение дочерних [Avatar] относительно друг друга
 * @property itemSpacingValues расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
 */
@Immutable
interface AvatarGroupDimensionValues {

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
        fun builder(): AvatarGroupDimensionValuesBuilder = DefaultAvatarGroupDimensionValues.Builder()
    }
}

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

/**
 * Билдер для [AvatarGroupDimensionValues]
 */
interface AvatarGroupDimensionValuesBuilder {

    /**
     * Устанавливает смещение дочерних [Avatar] относительно друг друга
     */
    fun itemOffset(itemOffset: Dp): AvatarGroupDimensionValuesBuilder =
        itemOffset(itemOffset.asStatefulValue())

    /**
     * Устанавливает смещения дочерних [Avatar] относительно друг друга
     */
    fun itemOffset(itemOffset: StatefulValue<Dp>): AvatarGroupDimensionValuesBuilder

    /**
     * Устанавливает расстояние между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    fun itemSpacing(itemSpacing: Dp): AvatarGroupDimensionValuesBuilder =
        itemSpacing(itemSpacing.asStatefulValue())

    /**
     * Устанавливает расстояния между дочерними [Avatar] (влияет на толщину выреза [Avatar])
     */
    fun itemSpacing(itemSpacing: StatefulValue<Dp>): AvatarGroupDimensionValuesBuilder

    /**
     * Собирает [AvatarGroupDimensionValues]
     */
    fun build(): AvatarGroupDimensionValues
}

@Immutable
private data class DefaultAvatarGroupStyle(
    override val avatarStyle: AvatarStyle,
    @Deprecated("Use dimensionValues(AvatarGroupDimensionValuesBuilder)", ReplaceWith("dimensionValues { }"))
    override val dimensions: AvatarGroupDimensions,
    override val dimensionValues: AvatarGroupDimensionValues,
) : AvatarGroupStyle {

    class Builder(override val receiver: Any?) : AvatarGroupStyleBuilder {

        private var avatarStyle: AvatarStyle? = null

        private var dimensionsBuilder: DefaultAvatarGroupDimensionsBuilder = DefaultAvatarGroupDimensionsBuilder()
        private var dimensionValuesBuilder: AvatarGroupDimensionValuesBuilder =
            AvatarGroupDimensionValues.builder()

        override fun avatarStyle(avatarStyle: AvatarStyle) = apply {
            this.avatarStyle = avatarStyle
        }

        @Deprecated("Use dimensionValues(AvatarGroupDimensionValuesBuilder)", ReplaceWith("dimensionValues { }"))
        override fun dimensions(dimensions: AvatarGroupDimensions) = apply {
            this.dimensionsBuilder.apply {
                itemOffset(dimensions.itemOffset)
                itemSpacing(dimensions.itemSpacing)
            }
            this.dimensionValuesBuilder.apply {
                itemOffset(dimensions.itemOffset)
                itemSpacing(dimensions.itemSpacing)
            }
        }

        @Deprecated("Use dimensionValues(AvatarGroupDimensionValuesBuilder)", ReplaceWith("dimensionValues { }"))
        @Composable
        override fun dimensions(
            builder: @Composable AvatarGroupDimensionsBuilder.() -> Unit,
        ): AvatarGroupStyleBuilder = apply {
            dimensionsBuilder.builder()
            val dimensions = dimensionsBuilder.build()
            dimensionValuesBuilder
                .itemOffset(dimensions.itemOffset)
                .itemSpacing(dimensions.itemSpacing)
        }

        @Composable
        override fun dimensionValues(
            builder: @Composable AvatarGroupDimensionValuesBuilder.() -> Unit,
        ): AvatarGroupStyleBuilder = apply {
            this.dimensionValuesBuilder.builder()
        }

        override fun style(): AvatarGroupStyle =
            DefaultAvatarGroupStyle(
                avatarStyle = avatarStyle ?: AvatarStyle.builder().style(),
                dimensions = dimensionsBuilder.build(),
                dimensionValues = dimensionValuesBuilder.build(),
            )
    }
}

@Immutable
private data class DefaultAvatarGroupDimensionValues(
    override val itemOffsetValues: StatefulValue<Dp>,
    override val itemSpacingValues: StatefulValue<Dp>,
) : AvatarGroupDimensionValues {
    class Builder : AvatarGroupDimensionValuesBuilder {

        private var itemOffsetValues: StatefulValue<Dp> =
            AvatarDefaults.DefaultItemOffset.asStatefulValue()
        private var itemSpacingValues: StatefulValue<Dp> =
            AvatarDefaults.DefaultItemSpacing.asStatefulValue()

        override fun itemOffset(itemOffset: StatefulValue<Dp>): AvatarGroupDimensionValuesBuilder =
            apply { this.itemOffsetValues = itemOffset }

        override fun itemSpacing(itemSpacing: StatefulValue<Dp>): AvatarGroupDimensionValuesBuilder =
            apply { this.itemSpacingValues = itemSpacing }

        override fun build(): AvatarGroupDimensionValues =
            DefaultAvatarGroupDimensionValues(itemOffsetValues, itemSpacingValues)
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
