package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.interactions.InteractiveColor
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asInteractive
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal, предоставляющий текущий [DrawerStyle] для потомков.
 */
val LocalDrawerStyle = compositionLocalOf { DrawerStyle.builder().style() }

/**
 * Стиль выезжающей панели (Drawer), включающий форму, цвета, размеры и другие параметры.
 */
@Immutable
interface DrawerStyle : Style {

    /**
     * Форма панели.
     */
    val shape: Shape

    /**
     * Параметры тени панели.
     */
    val shadow: ShadowAppearance

    /**
     * Цветовая схема панели.
     */
    val colors: DrawerColors

    /**
     * Размеры и отступы панели.
     */
    val dimensions: DrawerDimensions

    /**
     * Ресурс иконки закрытия.
     */
    @get:DrawableRes
    val closeIconRes: Int

    /**
     * Расположение иконки
     * @see CloseIconPlacement
     */
    val closeIconPlacement: CloseIconPlacement

    /**
     * Выравнивание иконки
     * @see CloseIconAlignment
     */
    val closeIconAlignment: CloseIconAlignment

    companion object {
        /**
         * Возвращает новый [DrawerStyleBuilder] для создания стиля панели.
         *
         * @param receiver необязательный объект для связывания с билдром.
         */
        fun builder(receiver: Any? = null): DrawerStyleBuilder =
            DefaultDrawerStyle.Builder(receiver)
    }
}

/**
 * Цвета выезжающей панели.
 */
@Immutable
interface DrawerColors {
    /**
     * Цвет фона в интерактивных состояниях или `null`, если не используется.
     */
    val backgroundColor: InteractiveColor?

    /**
     * Фон в виде кисти с поддержкой состояний.
     */
    val background: StatefulValue<Brush>

    /**
     * Цвет обводки панели.
     */
    val stroke: InteractiveColor

    /**
     * Цвет иконки закрытия.
     */
    val closeIconColor: InteractiveColor
}

/**
 * Билдер для [DrawerStyle].
 */
interface DrawerStyleBuilder : StyleBuilder<DrawerStyle> {

    /**
     * Устанавливает цвета панели.
     *
     * @param builder конфигурация цветов.
     */
    @Composable
    fun colors(builder: @Composable DrawerColorsBuilder.() -> Unit): DrawerStyleBuilder

    /**
     * Устанавливает форму панели.
     *
     * @param shape форма с закруглёнными углами.
     */
    fun shape(shape: CornerBasedShape): DrawerStyleBuilder

    /**
     * Устанавливает тень панели.
     *
     * @param shadow параметры тени.
     */
    fun shadow(shadow: ShadowAppearance): DrawerStyleBuilder

    /**
     * Устанавливает размеры и отступы панели.
     *
     * @param builder конфигурация размеров.
     */
    @Composable
    fun dimensions(builder: @Composable DrawerDimensionsBuilder.() -> Unit): DrawerStyleBuilder

    /**
     * Устанавливает ресурс иконки закрытия панели.
     *
     * @param closeIconRes ID ресурса иконки.
     */
    fun closeIconRes(@DrawableRes closeIconRes: Int): DrawerStyleBuilder

    /**
     * Устанавливает расположение иконки [CloseIconPlacement]
     *
     * @param closeIconPlacement расположение иконки
     */
    fun closeIconPlacement(closeIconPlacement: CloseIconPlacement): DrawerStyleBuilder

    /**
     * Устанавливает выравнивание иконки [CloseIconAlignment]
     *
     * @param closeIconAlignment выравнивание иконки
     */
    fun closeIconAlignment(closeIconAlignment: CloseIconAlignment): DrawerStyleBuilder
}

/**
 * Билдер для [DrawerColors].
 */
interface DrawerColorsBuilder {

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColors.backgroundColor
     * @see InteractiveColor
     */
    fun backgroundColor(backgroundColor: InteractiveColor): DrawerColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColorsBuilder.backgroundColor
     * @see DrawerColors.background
     */
    fun backgroundColor(backgroundColor: Color): DrawerColorsBuilder =
        backgroundColor(backgroundColor.asInteractive())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColorsBuilder.backgroundColor
     * @see DrawerColors.background
     */
    fun background(background: StatefulValue<Brush>): DrawerColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColorsBuilder.backgroundColor
     * @see DrawerColors.background
     */
    fun background(background: Brush): DrawerColorsBuilder =
        background(background.asStatefulValue())

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColors.backgroundColor
     * @see InteractiveColor
     */
    fun strokeColor(strokeColor: InteractiveColor): DrawerColorsBuilder

    /**
     * Устанавливает цвет [backgroundColor] фона компонента.
     * @see DrawerColorsBuilder.backgroundColor
     * @see DrawerColors.background
     */
    fun strokeColor(strokeColor: Color): DrawerColorsBuilder =
        strokeColor(strokeColor.asInteractive())

    /**
     * Устанавливает цвет [closeIconColor] иконки закрытия.
     * @see DrawerColors.closeIconColor
     * @see InteractiveColor
     */
    fun closeIconColor(closeIconColor: InteractiveColor): DrawerColorsBuilder

    /**
     * Устанавливает цвет [closeIconColor] иконки закрытия.
     * @see DrawerColorsBuilder.backgroundColor
     * @see DrawerColors.background
     */
    fun closeIconColor(closeIconColor: Color): DrawerColorsBuilder =
        closeIconColor(closeIconColor.asInteractive())

    /**
     * Возвращает готовый экземпляр [DrawerColors]
     */
    fun build(): DrawerColors

    companion object {
        /**
         * Возвращает экземпляр [DrawerColorsBuilder]
         */
        fun builder(): DrawerColorsBuilder = DefaultDrawerColors.Builder()
    }
}

/**
 * Размеры и отступы выезжающей панели.
 */
@Immutable
interface DrawerDimensions {
    /**
     * Толщина обводки панели.
     */
    val strokeWidth: Dp

    /**
     * Размер области, на которую панель видна в закрытом состоянии.
     */
    val peekSize: Dp

    /**
     * Внутренние отступы панели.
     */
    val paddings: PaddingValues

    /**
     * Отступ от иконки закрытия до заголовка. Работает только при [CloseIconPlacement.Inner]
     */
    val closeIconHeaderPadding: Dp

    /**
     * Смещение иконки закрытия от панели по горизонтали. Работает только при [CloseIconPlacement.Outer]
     */
    val closeIconOffsetX: Dp

    /**
     * Смещение иконки закрытия от панели по вертикали. Работает только при [CloseIconPlacement.Outer]
     */
    val closeIconOffsetY: Dp
}

/**
 * Билдер для [DrawerDimensions].
 */
interface DrawerDimensionsBuilder {

    /**
     * Устанавливает внутренний отступ вначале
     */
    fun paddingStart(pStart: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает внутренний отступ вконце
     */
    fun paddingEnd(pEnd: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает внутренний отступ сверху
     */
    fun paddingTop(pTop: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает внутренний отступ снизу
     */
    fun paddingBottom(pBottom: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает толщину бордера
     */
    fun strokeWidth(width: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает размер области, на которую будет виден [Drawer] в закртом состоянии
     */
    fun peekSize(size: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает отступ от иконки закрытия до заголовка
     */
    fun closeIconHeaderPadding(closeIconHeaderPadding: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает смещение иконки закрытия от панели по горизонтали. Работает только при [CloseIconPlacement.Outer]
     */
    fun closeIconOffsetX(closeIconOffsetX: Dp): DrawerDimensionsBuilder

    /**
     * Устанавливает смещение иконки закрытия от панели по вертикали. Работает только при [CloseIconPlacement.Outer]
     */
    fun closeIconOffsetY(closeIconOffsetY: Dp): DrawerDimensionsBuilder

    /**
     * Создает [DrawerDimensions]
     */
    fun build(): DrawerDimensions

    companion object {
        /**
         * Возвращает экземпляр [DrawerDimensionsBuilder]
         */
        fun builder(): DrawerDimensionsBuilder = DefaultDrawerDimensions.Builder()
    }
}

@Immutable
private class DefaultDrawerColors(
    override val background: StatefulValue<Brush>,
    override val backgroundColor: InteractiveColor?,
    override val stroke: InteractiveColor,
    override val closeIconColor: InteractiveColor,
) : DrawerColors {

    class Builder : DrawerColorsBuilder {
        private var backgroundColor: InteractiveColor? = null
        private var background: StatefulValue<Brush>? = null
        private var strokeColor: InteractiveColor? = null
        private var closeIconColor: InteractiveColor? = null

        override fun backgroundColor(backgroundColor: InteractiveColor): DrawerColorsBuilder = apply {
            this.backgroundColor = backgroundColor
        }

        override fun background(background: StatefulValue<Brush>): DrawerColorsBuilder = apply {
            this.background = background
        }

        override fun strokeColor(strokeColor: InteractiveColor): DrawerColorsBuilder = apply {
            this.strokeColor = strokeColor
        }

        override fun closeIconColor(closeIconColor: InteractiveColor): DrawerColorsBuilder = apply {
            this.closeIconColor = closeIconColor
        }

        override fun build(): DrawerColors {
            return DefaultDrawerColors(
                backgroundColor = backgroundColor,
                background = background ?: SolidColor(Color.White).asStatefulValue(),
                stroke = strokeColor ?: Color.Gray.asInteractive(),
                closeIconColor = closeIconColor ?: Color.Gray.asInteractive(),
            )
        }
    }
}

@Immutable
private class DefaultDrawerDimensions(
    override val strokeWidth: Dp,
    override val peekSize: Dp,
    override val paddings: PaddingValues,
    override val closeIconHeaderPadding: Dp,
    override val closeIconOffsetX: Dp,
    override val closeIconOffsetY: Dp,
) : DrawerDimensions {
    class Builder : DrawerDimensionsBuilder {

        private var pStart: Dp? = null
        private var pEnd: Dp? = null
        private var pTop: Dp? = null
        private var pBottom: Dp? = null
        private var peekSize: Dp? = null
        private var strokeWidth: Dp? = null
        private var closeIconHeaderPadding: Dp? = null
        private var closeIconOffsetX: Dp? = null
        private var closeIconOffsetY: Dp? = null

        override fun paddingStart(pStart: Dp): DrawerDimensionsBuilder = apply {
            this.pStart = pStart
        }

        override fun paddingEnd(pEnd: Dp): DrawerDimensionsBuilder = apply {
            this.pEnd = pEnd
        }

        override fun paddingTop(pTop: Dp): DrawerDimensionsBuilder = apply {
            this.pTop = pTop
        }

        override fun paddingBottom(pBottom: Dp): DrawerDimensionsBuilder = apply {
            this.pBottom = pBottom
        }

        override fun strokeWidth(width: Dp): DrawerDimensionsBuilder = apply {
            this.strokeWidth = width
        }

        override fun peekSize(size: Dp): DrawerDimensionsBuilder = apply {
            this.peekSize = size
        }

        override fun closeIconHeaderPadding(closeIconHeaderPadding: Dp): DrawerDimensionsBuilder = apply {
            this.closeIconHeaderPadding = closeIconHeaderPadding
        }

        override fun closeIconOffsetX(closeIconOffsetX: Dp): DrawerDimensionsBuilder = apply {
            this.closeIconOffsetX = closeIconOffsetX
        }

        override fun closeIconOffsetY(closeIconOffsetY: Dp): DrawerDimensionsBuilder = apply {
            this.closeIconOffsetY = closeIconOffsetY
        }

        override fun build(): DrawerDimensions {
            return DefaultDrawerDimensions(
                paddings = PaddingValues(
                    pStart ?: DefaultDrawerPaddings,
                    pTop ?: DefaultDrawerPaddings,
                    pEnd ?: DefaultDrawerPaddings,
                    pBottom ?: DefaultDrawerPaddings,
                ),
                strokeWidth = strokeWidth ?: Dp.Unspecified,
                peekSize = peekSize ?: 0.dp,
                closeIconHeaderPadding = closeIconHeaderPadding ?: 0.dp,
                closeIconOffsetX = closeIconOffsetX ?: 0.dp,
                closeIconOffsetY = closeIconOffsetY ?: 0.dp,
            )
        }
    }
}

@Immutable
private class DefaultDrawerStyle(
    override val shape: Shape,
    override val colors: DrawerColors,
    override val dimensions: DrawerDimensions,
    override val closeIconRes: Int,
    override val shadow: ShadowAppearance,
    override val closeIconPlacement: CloseIconPlacement,
    override val closeIconAlignment: CloseIconAlignment,
) : DrawerStyle {

    class Builder(receiver: Any?) : DrawerStyleBuilder {
        private var colorsBuilder: DrawerColorsBuilder = DrawerColorsBuilder.builder()
        private var shape: CornerBasedShape? = null
        private var shadow: ShadowAppearance? = null
        private var dimensionsBuilder: DrawerDimensionsBuilder = DrawerDimensionsBuilder.builder()
        private var closeIconRes: Int = -1
        private var closeIconPlacement = CloseIconPlacement.Inner
        private var closeIconAlignment = CloseIconAlignment.End

        @Composable
        override fun colors(builder: @Composable (DrawerColorsBuilder.() -> Unit)): DrawerStyleBuilder = apply {
            this.colorsBuilder.builder()
        }

        override fun shape(shape: CornerBasedShape): DrawerStyleBuilder = apply {
            this.shape = shape
        }

        override fun shadow(shadow: ShadowAppearance): DrawerStyleBuilder = apply {
            this.shadow = shadow
        }

        @Composable
        override fun dimensions(
            builder:
            @Composable (DrawerDimensionsBuilder.() -> Unit),
        ): DrawerStyleBuilder = apply {
            this.dimensionsBuilder.builder()
        }

        override fun closeIconRes(closeIconRes: Int): DrawerStyleBuilder = apply {
            this.closeIconRes = closeIconRes
        }

        override fun closeIconPlacement(closeIconPlacement: CloseIconPlacement): DrawerStyleBuilder = apply {
            this.closeIconPlacement = closeIconPlacement
        }

        override fun closeIconAlignment(closeIconAlignment: CloseIconAlignment): DrawerStyleBuilder = apply {
            this.closeIconAlignment = closeIconAlignment
        }

        override fun style(): DrawerStyle {
            return DefaultDrawerStyle(
                colors = colorsBuilder.build(),
                shape = shape ?: DefaultDrawerShape,
                dimensions = dimensionsBuilder.build(),
                closeIconRes = closeIconRes,
                shadow = shadow ?: ShadowAppearance(),
                closeIconPlacement = closeIconPlacement,
                closeIconAlignment = closeIconAlignment,
            )
        }
    }
}

private val DefaultDrawerPaddings = 16.dp
private val DefaultDrawerShape = RectangleShape
