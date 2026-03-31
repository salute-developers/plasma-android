package com.sdds.compose.uikit

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder

/**
 * CompositionLocal c [CarouselStyle] для компонента [Carousel]
 */
val LocalCarouselStyle: ProvidableCompositionLocal<CarouselStyle> =
    compositionLocalOf(structuralEqualityPolicy()) { CarouselStyle.builder().style() }

/**
 * Стиль компонента карусели.
 * Определяет визуальное оформление всех составных частей карусели:
 * индикаторов страниц, кнопок навигации и их размещение.
 *
 * @see PaginationDotsStyle
 * @see ButtonStyle
 * @see CarouselButtonsPlacement
 * @see CarouselDimensions
 */
@Immutable
interface CarouselStyle : Style {
    /**
     * Стиль точек-индикаторов текущей позиции в карусели.
     * Определяет внешний вид, размеры и анимацию индикаторов страниц.
     */
    val indicatorStyle: PaginationDotsStyle

    /**
     * Стиль кнопки навигации "вперед" (следующий элемент).
     * Определяет внешний вид, размеры и состояния кнопки.
     */
    val nextButtonStyle: ButtonStyle

    /**
     * Стиль кнопки навигации "назад" (предыдущий элемент).
     * Определяет внешний вид, размеры и состояния кнопки.
     */
    val prevButtonStyle: ButtonStyle

    /**
     * Ресурс иконки для кнопки "вперед".
     */
    @get:DrawableRes
    val nextButtonIcon: Int?

    /**
     * Ресурс иконки для кнопки "назад".
     */
    @get:DrawableRes
    val prevButtonIcon: Int?

    /**
     * Расположение кнопок навигации относительно контента карусели.
     * Может быть внутри (поверх контента) или снаружи (по бокам).
     */
    val buttonsPlacement: CarouselButtonsPlacement

    /**
     * Размеры и отступы компонента карусели.
     */
    val dimensions: CarouselDimensions

    companion object {
        /**
         * Возвращает экземпляр билдера [CarouselStyleBuilder] для создания стиля.
         *
         * @return новый экземпляр [CarouselStyleBuilder]
         */
        fun builder(receiver: Any? = null): CarouselStyleBuilder =
            DefaultCarouselStyle.Builder()
    }
}

/**
 * Билдер для создания [CarouselStyle].
 * Позволяет настроить все параметры стиля карусели.
 *
 * @see CarouselStyle
 * @see StyleBuilder
 */
interface CarouselStyleBuilder : StyleBuilder<CarouselStyle> {

    /**
     * Устанавливает стиль точек-индикаторов
     * @param indicatorStyle стиль индикаторов
     */
    fun indicatorStyle(indicatorStyle: PaginationDotsStyle): CarouselStyleBuilder

    /**
     * Устанавливает стиль кнопки "вперед"
     * @param nextButtonStyle стиль кнопки
     */
    fun nextButtonStyle(nextButtonStyle: ButtonStyle): CarouselStyleBuilder

    /**
     * Устанавливает стиль кнопки "назад"
     * @param prevButtonStyle стиль кнопки
     */
    fun prevButtonStyle(prevButtonStyle: ButtonStyle): CarouselStyleBuilder

    /**
     * Устанавливает иконку для кнопки "вперед"
     * @param nextButtonIcon ресурс иконки
     */
    fun nextButtonIcon(@DrawableRes nextButtonIcon: Int): CarouselStyleBuilder

    /**
     * Устанавливает иконку для кнопки "назад"
     * @param prevButtonIcon ресурс иконки
     */
    fun prevButtonIcon(@DrawableRes prevButtonIcon: Int): CarouselStyleBuilder

    /**
     * Устанавливает расположение кнопок навигации
     * @param buttonsPlacement расположение кнопок
     */
    fun buttonsPlacement(buttonsPlacement: CarouselButtonsPlacement): CarouselStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента через DSL билдер [CarouselDimensionsBuilder].
     * Используется в контексте композиции для доступа к ресурсам темы.
     *
     * @param builder лямбда с контекстом [CarouselDimensionsBuilder] для настройки размеров
     */
    @Composable
    fun dimensions(builder: @Composable CarouselDimensionsBuilder.() -> Unit): CarouselStyleBuilder
}

/**
 * Размеры и отступы компонента карусели.
 */
@Immutable
interface CarouselDimensions {
    /**
     * Отступ для кнопки "вперед" от правого края карусели.
     * Обеспечивает визуальный отступ между кнопкой и контентом/краем.
     */
    val nextButtonPadding: Dp

    /**
     * Отступ для кнопки "назад" от левого края карусели.
     * Обеспечивает визуальный отступ между кнопкой и контентом/краем.
     */
    val prevButtonPadding: Dp

    /**
     * Отступ для индикаторов от нижнего края карусели.
     * Определяет расстояние между контентом карусели и точками-индикаторами.
     */
    val indicatorPadding: Dp

    /**
     * Промежуток между соседними элементами карусели.
     * Создает визуальное разделение между элементами при прокрутке.
     */
    val gap: Dp

    companion object {
        /**
         * Возвращает экземпляр билдера [CarouselDimensionsBuilder] для создания размеров.
         *
         * @return новый экземпляр [CarouselDimensionsBuilder]
         */
        fun builder(): CarouselDimensionsBuilder = DefaultCarouselDimensions.Builder()
    }
}

/**
 * Билдер для создания [CarouselDimensions] с fluent-интерфейсом.
 * Позволяет поэтапно настроить размеры и отступы карусели.
 *
 * @see CarouselDimensions
 */
interface CarouselDimensionsBuilder {
    /**
     * Устанавливает отступ для кнопки "вперед"
     * @param nextButtonPadding значение отступа в [Dp]
     */
    fun nextButtonPadding(nextButtonPadding: Dp): CarouselDimensionsBuilder

    /**
     * Устанавливает отступ для кнопки "назад"
     * @param prevButtonPadding значение отступа в [Dp]
     */
    fun prevButtonPadding(prevButtonPadding: Dp): CarouselDimensionsBuilder

    /**
     * Устанавливает отступ для индикаторов
     * @param indicatorPadding значение отступа в [Dp]
     */
    fun indicatorPadding(indicatorPadding: Dp): CarouselDimensionsBuilder

    /**
     * Устанавливает промежуток между элементами
     * @param gap значение промежутка в [Dp]
     */
    fun gap(gap: Dp): CarouselDimensionsBuilder

    /**
     * Создает экземпляр [CarouselDimensions] с настроенными параметрами.
     *
     * @return новый экземпляр [CarouselDimensions]
     */
    fun build(): CarouselDimensions
}

private data class DefaultCarouselStyle(
    override val dimensions: CarouselDimensions,
    override val indicatorStyle: PaginationDotsStyle,
    override val nextButtonStyle: ButtonStyle,
    override val prevButtonStyle: ButtonStyle,
    override val nextButtonIcon: Int?,
    override val prevButtonIcon: Int?,
    override val buttonsPlacement: CarouselButtonsPlacement,
) : CarouselStyle {
    class Builder : CarouselStyleBuilder {
        var indicatorStyle: PaginationDotsStyle? = null
        var nextButtonStyle: ButtonStyle? = null
        var prevButtonStyle: ButtonStyle? = null
        var nextButtonIcon: Int? = null
        var prevButtonIcon: Int? = null
        var buttonsPlacement: CarouselButtonsPlacement? = null

        private val dimensionsBuilder: CarouselDimensionsBuilder = CarouselDimensions.builder()

        override fun indicatorStyle(indicatorStyle: PaginationDotsStyle) = apply {
            this.indicatorStyle = indicatorStyle
        }

        override fun nextButtonStyle(nextButtonStyle: ButtonStyle) = apply {
            this.nextButtonStyle = nextButtonStyle
        }

        override fun prevButtonStyle(prevButtonStyle: ButtonStyle) = apply {
            this.prevButtonStyle = prevButtonStyle
        }

        override fun nextButtonIcon(nextButtonIcon: Int) = apply {
            this.nextButtonIcon = nextButtonIcon
        }

        override fun prevButtonIcon(prevButtonIcon: Int) = apply {
            this.prevButtonIcon = prevButtonIcon
        }

        override fun buttonsPlacement(buttonsPlacement: CarouselButtonsPlacement) = apply {
            this.buttonsPlacement = buttonsPlacement
        }

        @Composable
        override fun dimensions(builder: @Composable CarouselDimensionsBuilder.() -> Unit):
                CarouselStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun style(): CarouselStyle =
            DefaultCarouselStyle(
                dimensions = dimensionsBuilder.build(),
                indicatorStyle = indicatorStyle ?: PaginationDotsStyle.builder().style(),
                nextButtonStyle = nextButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
                prevButtonStyle = prevButtonStyle ?: ButtonStyle.iconButtonBuilder().style(),
                nextButtonIcon = nextButtonIcon,
                prevButtonIcon = prevButtonIcon,
                buttonsPlacement = buttonsPlacement ?: CarouselButtonsPlacement.Inner,
            )
    }
}

private data class DefaultCarouselDimensions(
    override val nextButtonPadding: Dp,
    override val prevButtonPadding: Dp,
    override val indicatorPadding: Dp,
    override val gap: Dp,
) : CarouselDimensions {
    class Builder : CarouselDimensionsBuilder {
        private var nextButtonPadding: Dp? = null

        private var prevButtonPadding: Dp? = null

        private var indicatorPadding: Dp? = null

        private var gap: Dp? = null

        override fun nextButtonPadding(nextButtonPadding: Dp): CarouselDimensionsBuilder =
            apply { this.nextButtonPadding = nextButtonPadding }

        override fun prevButtonPadding(prevButtonPadding: Dp): CarouselDimensionsBuilder =
            apply { this.prevButtonPadding = prevButtonPadding }

        override fun indicatorPadding(indicatorPadding: Dp): CarouselDimensionsBuilder =
            apply { this.indicatorPadding = indicatorPadding }

        override fun gap(gap: Dp): CarouselDimensionsBuilder = apply { this.gap = gap }

        override fun build(): CarouselDimensions = DefaultCarouselDimensions(
            nextButtonPadding = nextButtonPadding ?: 8.dp,
            prevButtonPadding = prevButtonPadding ?: 8.dp,
            indicatorPadding = indicatorPadding ?: 8.dp,
            gap = gap ?: 8.dp,
        )
    }
}
