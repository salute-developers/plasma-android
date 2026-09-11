package com.sdds.plasma.homeds.components.bubble

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.graphics.brush.asStatefulBrush
import com.sdds.compose.uikit.interactions.StatefulValue
import com.sdds.compose.uikit.interactions.asStatefulBrush
import com.sdds.compose.uikit.interactions.asStatefulValue
import com.sdds.compose.uikit.shadow.ShadowAppearance
import com.sdds.compose.uikit.shadow.ShadowLayer
import com.sdds.compose.uikit.style.Style
import com.sdds.compose.uikit.style.StyleBuilder
import com.sdds.icons.R

/**
 * CompositionLocal c [BubbleStyle] для компонентов [BubbleTrigger]/[BubbleHost].
 */
public val LocalBubbleStyle =
    compositionLocalOf { BubbleStyle.builder().style() }

/**
 * Стиль компонента апсейл-бабла на карточке устройства.
 *
 * На данном этапе публично доступна только одна готовая вариация — [BubbleStyle.Companion.Default]
 * (см. `styles/customcomponents/bubble/BubbleStyles.kt`); набор размерных/видовых вариаций
 * будет добавлен отдельным изменением при появлении полной дизайн-спеки.
 */
@Stable
public interface BubbleStyle : Style {

    /**
     * Цвета компонента
     * @see BubbleColors
     */
    public val colors: BubbleColors

    /**
     * Размеры компонента
     * @see BubbleDimensions
     */
    public val dimensions: BubbleDimensions

    /**
     * Типографика текста содержимого развёрнутого бабла.
     */
    public val textStyle: StatefulValue<TextStyle>

    /**
     * Внутренняя тень (inner glow) заливки триггера/тела.
     */
    public val shadow: StatefulValue<ShadowAppearance>

    /**
     * Иконка триггера в свёрнутом состоянии (звёздочка).
     */
    @get:DrawableRes
    public val starIcon: Int

    /**
     * Иконка триггера в развёрнутом состоянии (крестик, кнопка закрытия).
     */
    @get:DrawableRes
    public val closeIcon: Int

    /**
     * Длительность анимации разворачивания тела бабла (мс) — таймлайн `expandProgress`/
     * `iconMorph`/`rotationProgress`/`bounceProgress` в [BubbleTrigger].
     */
    public val expandDurationMillis: Int

    /**
     * Длительность анимации сворачивания тела бабла (мс), см. [expandDurationMillis].
     */
    public val collapseDurationMillis: Int

    public companion object {

        /**
         * Возвращает экземпляр [BubbleStyleBuilder]
         */
        public fun builder(): BubbleStyleBuilder = DefaultBubbleStyle.Builder()
    }
}

/**
 * Builder стиля [BubbleStyle].
 */
@Stable
public interface BubbleStyleBuilder : StyleBuilder<BubbleStyle> {

    /**
     * Устанавливает цвета компонента при помощи [builder]
     * @see BubbleStyle.colors
     */
    @Composable
    public fun colors(builder: @Composable BubbleColorsBuilder.() -> Unit): BubbleStyleBuilder

    /**
     * Устанавливает размеры и отступы компонента при помощи [builder]
     * @see BubbleStyle.dimensions
     */
    @Composable
    public fun dimensions(builder: @Composable BubbleDimensionsBuilder.() -> Unit): BubbleStyleBuilder

    /** @see BubbleStyle.textStyle */
    public fun textStyle(textStyle: TextStyle): BubbleStyleBuilder = textStyle(textStyle.asStatefulValue())

    /** @see BubbleStyle.textStyle */
    public fun textStyle(textStyle: StatefulValue<TextStyle>): BubbleStyleBuilder

    /** @see BubbleStyle.shadow */
    public fun shadow(shadow: ShadowAppearance): BubbleStyleBuilder = shadow(shadow.asStatefulValue())

    /** @see BubbleStyle.shadow */
    public fun shadow(shadow: StatefulValue<ShadowAppearance>): BubbleStyleBuilder

    /** @see BubbleStyle.starIcon */
    public fun starIcon(@DrawableRes icon: Int): BubbleStyleBuilder

    /** @see BubbleStyle.closeIcon */
    public fun closeIcon(@DrawableRes icon: Int): BubbleStyleBuilder

    /** @see BubbleStyle.expandDurationMillis */
    public fun expandDuration(durationMillis: Int): BubbleStyleBuilder

    /** @see BubbleStyle.collapseDurationMillis */
    public fun collapseDuration(durationMillis: Int): BubbleStyleBuilder
}

/**
 * Цвета компонента апсейл-бабла.
 */
@Stable
public interface BubbleColors {

    /**
     * Кисть заливки тела бабла (и свёрнутого триггера — единая заливка Union-формы).
     */
    public val bodyBrush: StatefulValue<Brush>

    /**
     * Кисть иконки триггера (звёздочка/крестик).
     */
    public val iconBrush: StatefulValue<Brush>

    /**
     * Кисть декоративной обводки-«мерцания» вокруг иконки триггера (см. Figma: узел
     * "Trigger"/"Star 3") — тонкая полупрозрачная рамка поверх круга-якоря/тела, без собственной
     * заливки. Поворачивается при морфинге иконки (см. [BubbleTriggerIcon]).
     */
    public val borderBrush: StatefulValue<Brush>

    /**
     * Цвет текста, предоставляемый слоту содержимого развёрнутого бабла.
     */
    public val textColor: StatefulValue<Brush>

    /**
     * Кисть незаполненной части прогресс-бара (см. [BubbleTrigger] — перегрузка с `text`/
     * `progress` вместо content-слота).
     */
    public val progressTrackBrush: StatefulValue<Brush>

    /**
     * Кисть заполненной (пройденной) части прогресс-бара.
     */
    public val progressValueBrush: StatefulValue<Brush>

    public companion object {

        /**
         * Возвращает экземпляр [BubbleColorsBuilder]
         */
        public fun builder(): BubbleColorsBuilder = DefaultBubbleColors.Builder()
    }
}

/**
 * Builder для [BubbleColors].
 */
@Stable
public interface BubbleColorsBuilder {

    /** @see BubbleColors.bodyBrush */
    public fun bodyColor(color: Color): BubbleColorsBuilder = bodyColor(color.asStatefulBrush())

    /** @see BubbleColors.bodyBrush */
    public fun bodyColor(brush: Brush): BubbleColorsBuilder = bodyColor(brush.asStatefulValue())

    /** @see BubbleColors.bodyBrush */
    public fun bodyColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /** @see BubbleColors.iconBrush */
    public fun iconColor(color: Color): BubbleColorsBuilder = iconColor(color.asStatefulBrush())

    /** @see BubbleColors.iconBrush */
    public fun iconColor(brush: Brush): BubbleColorsBuilder = iconColor(brush.asStatefulValue())

    /** @see BubbleColors.iconBrush */
    public fun iconColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /** @see BubbleColors.borderBrush */
    public fun borderColor(color: Color): BubbleColorsBuilder = borderColor(color.asStatefulBrush())

    /** @see BubbleColors.borderBrush */
    public fun borderColor(brush: Brush): BubbleColorsBuilder = borderColor(brush.asStatefulValue())

    /** @see BubbleColors.borderBrush */
    public fun borderColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /** @see BubbleColors.textColor */
    public fun textColor(color: Color): BubbleColorsBuilder = textColor(color.asStatefulBrush())

    /** @see BubbleColors.textColor */
    public fun textColor(brush: Brush): BubbleColorsBuilder = textColor(brush.asStatefulValue())

    /** @see BubbleColors.textColor */
    public fun textColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /** @see BubbleColors.progressTrackBrush */
    public fun progressTrackColor(color: Color): BubbleColorsBuilder = progressTrackColor(color.asStatefulBrush())

    /** @see BubbleColors.progressTrackBrush */
    public fun progressTrackColor(brush: Brush): BubbleColorsBuilder = progressTrackColor(brush.asStatefulValue())

    /** @see BubbleColors.progressTrackBrush */
    public fun progressTrackColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /** @see BubbleColors.progressValueBrush */
    public fun progressValueColor(color: Color): BubbleColorsBuilder = progressValueColor(color.asStatefulBrush())

    /** @see BubbleColors.progressValueBrush */
    public fun progressValueColor(brush: Brush): BubbleColorsBuilder = progressValueColor(brush.asStatefulValue())

    /** @see BubbleColors.progressValueBrush */
    public fun progressValueColor(brush: StatefulValue<Brush>): BubbleColorsBuilder

    /**
     * Возвращает готовый экземпляр [BubbleColors]
     */
    public fun build(): BubbleColors
}

@Immutable
private class DefaultBubbleColors(
    override val bodyBrush: StatefulValue<Brush>,
    override val iconBrush: StatefulValue<Brush>,
    override val borderBrush: StatefulValue<Brush>,
    override val textColor: StatefulValue<Brush>,
    override val progressTrackBrush: StatefulValue<Brush>,
    override val progressValueBrush: StatefulValue<Brush>,
) : BubbleColors {

    class Builder : BubbleColorsBuilder {
        private var bodyBrush: StatefulValue<Brush>? = null
        private var iconBrush: StatefulValue<Brush>? = null
        private var borderBrush: StatefulValue<Brush>? = null
        private var textColor: StatefulValue<Brush>? = null
        private var progressTrackBrush: StatefulValue<Brush>? = null
        private var progressValueBrush: StatefulValue<Brush>? = null

        override fun bodyColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.bodyBrush = brush
        }

        override fun iconColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.iconBrush = brush
        }

        override fun borderColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.borderBrush = brush
        }

        override fun textColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.textColor = brush
        }

        override fun progressTrackColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.progressTrackBrush = brush
        }

        override fun progressValueColor(brush: StatefulValue<Brush>): BubbleColorsBuilder = apply {
            this.progressValueBrush = brush
        }

        override fun build(): BubbleColors {
            val body = bodyBrush ?: Color.Green.asStatefulBrush()
            return DefaultBubbleColors(
                bodyBrush = body,
                iconBrush = iconBrush ?: Color.White.asStatefulBrush(),
                borderBrush = borderBrush ?: Color.White.copy(alpha = 0.12f).asStatefulBrush(),
                textColor = textColor ?: Color.White.asStatefulBrush(),
                progressTrackBrush = progressTrackBrush ?: Color.White.copy(alpha = 0.24f).asStatefulBrush(),
                progressValueBrush = progressValueBrush ?: Color.White.asStatefulBrush(),
            )
        }
    }
}

/**
 * Размеры компонента апсейл-бабла.
 */
@Stable
public interface BubbleDimensions {

    /**
     * Диаметр свёрнутого триггера (и круга-якоря в основании развёрнутого бабла).
     */
    public val circleSize: StatefulValue<Dp>

    /**
     * Размер иконки (звёздочка/крестик) внутри круга-якоря.
     */
    public val iconSize: StatefulValue<Dp>

    /**
     * Радиус скругления трёх «дальних» углов тела развёрнутого бабла (не считая угла, ближайшего
     * к кругу-якорю — см. [bodyNearCornerRadius]).
     */
    public val bodyCornerRadius: StatefulValue<Dp>

    /**
     * Радиус скругления угла тела, ближайшего к кругу-якорю/шейке. Меньше [bodyCornerRadius].
     * Внутренне ограничивается сверху, чтобы дуга не пересекалась с дугой [neckFilletRadius]
     * (см. `buildBubblePath`).
     */
    public val bodyNearCornerRadius: StatefulValue<Dp>

    /**
     * Минимальная высота тела развёрнутого бабла.
     */
    public val bodyMinHeight: StatefulValue<Dp>

    /**
     * Рекомендуемая ширина тела развёрнутого бабла — используется перегрузкой [BubbleTrigger]
     * с `text`/`progress`. Не используется перегрузкой с произвольным content-слотом.
     */
    public val width: StatefulValue<Dp>

    /**
     * Ширина «шейки», соединяющей круг-якорь с телом бабла в полностью развёрнутом состоянии.
     */
    public val neckWidth: StatefulValue<Dp>

    /**
     * Длина «шейки» — реальный зазор между кругом-якорем и телом в полностью развёрнутом состоянии.
     */
    public val neckLength: StatefulValue<Dp>

    /**
     * Радиус вогнутой галтели на стыке «шейки» с телом бабла. На стыке «шейки» с кругом-якорем
     * галтель не рисуется (радиус там всегда 0) — на Figma-макете плавность именно у тела, а не
     * у круга.
     */
    public val neckFilletRadius: StatefulValue<Dp>

    /**
     * Внутренний отступ содержимого (content-слота) тела бабла от начального (левого в LTR) края.
     */
    public val paddingStart: StatefulValue<Dp>

    /**
     * Внутренний отступ содержимого (content-слота) тела бабла от конечного (правого в LTR) края.
     */
    public val paddingEnd: StatefulValue<Dp>

    /**
     * Внутренний отступ содержимого (content-слота) тела бабла от верхнего края.
     */
    public val paddingTop: StatefulValue<Dp>

    /**
     * Внутренний отступ содержимого (content-слота) тела бабла от нижнего края.
     */
    public val paddingBottom: StatefulValue<Dp>

    /**
     * Высота прогресс-бара (см. [BubbleTrigger] — перегрузка с `text`/`progress` вместо
     * content-слота).
     */
    public val progressHeight: StatefulValue<Dp>

    /**
     * Отступ между текстом (строкой текст+шеврон) и прогресс-баром под ней — та же перегрузка
     * [BubbleTrigger], что и [progressHeight]. Не используется, если прогресс-бар скрыт
     * (`hasProgress = false`).
     */
    public val progressSpacing: StatefulValue<Dp>

    /**
     * Толщина указателя значения прогресса — разрыва между заполненной (пройденной) и трековой
     * частями прогресс-бара, чья позиция и показывает `progress` перегрузки [BubbleTrigger]
     * с `text`/`progress` (см. `BubbleProgress`). Считается вдоль той же оси, что и общая
     * ширина бара (а не [progressHeight] — та ось перпендикулярна).
     */
    public val progressPointerThickness: StatefulValue<Dp>

    /**
     * Радиус скругления крайних (внешних, "пилюльных") торцов сегментов прогресс-бара
     * (см. `BubbleProgress`) — торцы у разрыва-указателя прямые. Внутренне ограничивается сверху
     * половиной [progressHeight] и половиной ширины сегмента.
     */
    public val progressCornerRadius: StatefulValue<Dp>

    /**
     * Насколько иконка-шеврон (перегрузка [BubbleTrigger] с `text`/`progress`) заезжает на
     * последнее слово текста — иконка встроена в поток текста как inline-контент (привязана к
     * последнему слову последней строки, переносится вместе с ней) вплотную, без зазора, и
     * дополнительно сдвигается на это расстояние В СТОРОНУ текста (навстречу, а не от него).
     */
    public val chevronTextOverlap: StatefulValue<Dp>

    /**
     * Размер иконки-шеврона (перегрузка [BubbleTrigger] с `text`/`progress`).
     */
    public val chevronIconSize: StatefulValue<Dp>

    public companion object {

        /**
         * Возвращает экземпляр [BubbleDimensionsBuilder]
         */
        public fun builder(): BubbleDimensionsBuilder = DefaultBubbleDimensions.Builder()
    }
}

/**
 * Builder для [BubbleDimensions].
 */
@Stable
public interface BubbleDimensionsBuilder {

    /** @see BubbleDimensions.circleSize */
    public fun circleSize(size: Dp): BubbleDimensionsBuilder = circleSize(size.asStatefulValue())

    /** @see BubbleDimensions.circleSize */
    public fun circleSize(size: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.iconSize */
    public fun iconSize(size: Dp): BubbleDimensionsBuilder = iconSize(size.asStatefulValue())

    /** @see BubbleDimensions.iconSize */
    public fun iconSize(size: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.bodyCornerRadius */
    public fun bodyCornerRadius(radius: Dp): BubbleDimensionsBuilder = bodyCornerRadius(radius.asStatefulValue())

    /** @see BubbleDimensions.bodyCornerRadius */
    public fun bodyCornerRadius(radius: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.bodyNearCornerRadius */
    public fun bodyNearCornerRadius(radius: Dp): BubbleDimensionsBuilder =
        bodyNearCornerRadius(radius.asStatefulValue())

    /** @see BubbleDimensions.bodyNearCornerRadius */
    public fun bodyNearCornerRadius(radius: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.bodyMinHeight */
    public fun bodyMinHeight(height: Dp): BubbleDimensionsBuilder = bodyMinHeight(height.asStatefulValue())

    /** @see BubbleDimensions.bodyMinHeight */
    public fun bodyMinHeight(height: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.width */
    public fun width(width: Dp): BubbleDimensionsBuilder = width(width.asStatefulValue())

    /** @see BubbleDimensions.width */
    public fun width(width: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.neckWidth */
    public fun neckWidth(width: Dp): BubbleDimensionsBuilder = neckWidth(width.asStatefulValue())

    /** @see BubbleDimensions.neckWidth */
    public fun neckWidth(width: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.neckLength */
    public fun neckLength(length: Dp): BubbleDimensionsBuilder = neckLength(length.asStatefulValue())

    /** @see BubbleDimensions.neckLength */
    public fun neckLength(length: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.neckFilletRadius */
    public fun neckFilletRadius(radius: Dp): BubbleDimensionsBuilder =
        neckFilletRadius(radius.asStatefulValue())

    /** @see BubbleDimensions.neckFilletRadius */
    public fun neckFilletRadius(radius: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.paddingStart */
    public fun paddingStart(padding: Dp): BubbleDimensionsBuilder = paddingStart(padding.asStatefulValue())

    /** @see BubbleDimensions.paddingStart */
    public fun paddingStart(padding: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.paddingEnd */
    public fun paddingEnd(padding: Dp): BubbleDimensionsBuilder = paddingEnd(padding.asStatefulValue())

    /** @see BubbleDimensions.paddingEnd */
    public fun paddingEnd(padding: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.paddingTop */
    public fun paddingTop(padding: Dp): BubbleDimensionsBuilder = paddingTop(padding.asStatefulValue())

    /** @see BubbleDimensions.paddingTop */
    public fun paddingTop(padding: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.paddingBottom */
    public fun paddingBottom(padding: Dp): BubbleDimensionsBuilder = paddingBottom(padding.asStatefulValue())

    /** @see BubbleDimensions.paddingBottom */
    public fun paddingBottom(padding: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.progressHeight */
    public fun progressHeight(height: Dp): BubbleDimensionsBuilder = progressHeight(height.asStatefulValue())

    /** @see BubbleDimensions.progressHeight */
    public fun progressHeight(height: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.progressSpacing */
    public fun progressSpacing(spacing: Dp): BubbleDimensionsBuilder = progressSpacing(spacing.asStatefulValue())

    /** @see BubbleDimensions.progressSpacing */
    public fun progressSpacing(spacing: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.progressPointerThickness */
    public fun progressPointerThickness(thickness: Dp): BubbleDimensionsBuilder =
        progressPointerThickness(thickness.asStatefulValue())

    /** @see BubbleDimensions.progressPointerThickness */
    public fun progressPointerThickness(thickness: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.progressCornerRadius */
    public fun progressCornerRadius(radius: Dp): BubbleDimensionsBuilder =
        progressCornerRadius(radius.asStatefulValue())

    /** @see BubbleDimensions.progressCornerRadius */
    public fun progressCornerRadius(radius: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.chevronTextOverlap */
    public fun chevronTextOverlap(overlap: Dp): BubbleDimensionsBuilder =
        chevronTextOverlap(overlap.asStatefulValue())

    /** @see BubbleDimensions.chevronTextOverlap */
    public fun chevronTextOverlap(overlap: StatefulValue<Dp>): BubbleDimensionsBuilder

    /** @see BubbleDimensions.chevronIconSize */
    public fun chevronIconSize(size: Dp): BubbleDimensionsBuilder = chevronIconSize(size.asStatefulValue())

    /** @see BubbleDimensions.chevronIconSize */
    public fun chevronIconSize(size: StatefulValue<Dp>): BubbleDimensionsBuilder

    /**
     * Возвращает готовый экземпляр [BubbleDimensions]
     */
    public fun build(): BubbleDimensions
}

@Immutable
private class DefaultBubbleDimensions(
    override val circleSize: StatefulValue<Dp>,
    override val iconSize: StatefulValue<Dp>,
    override val bodyCornerRadius: StatefulValue<Dp>,
    override val bodyNearCornerRadius: StatefulValue<Dp>,
    override val bodyMinHeight: StatefulValue<Dp>,
    override val width: StatefulValue<Dp>,
    override val neckWidth: StatefulValue<Dp>,
    override val neckLength: StatefulValue<Dp>,
    override val neckFilletRadius: StatefulValue<Dp>,
    override val paddingStart: StatefulValue<Dp>,
    override val paddingEnd: StatefulValue<Dp>,
    override val paddingTop: StatefulValue<Dp>,
    override val paddingBottom: StatefulValue<Dp>,
    override val progressHeight: StatefulValue<Dp>,
    override val progressSpacing: StatefulValue<Dp>,
    override val progressPointerThickness: StatefulValue<Dp>,
    override val progressCornerRadius: StatefulValue<Dp>,
    override val chevronTextOverlap: StatefulValue<Dp>,
    override val chevronIconSize: StatefulValue<Dp>,
) : BubbleDimensions {

    class Builder : BubbleDimensionsBuilder {
        private var circleSize: StatefulValue<Dp>? = null
        private var iconSize: StatefulValue<Dp>? = null
        private var bodyCornerRadius: StatefulValue<Dp>? = null
        private var bodyNearCornerRadius: StatefulValue<Dp>? = null
        private var bodyMinHeight: StatefulValue<Dp>? = null
        private var width: StatefulValue<Dp>? = null
        private var neckWidth: StatefulValue<Dp>? = null
        private var neckLength: StatefulValue<Dp>? = null
        private var neckFilletRadius: StatefulValue<Dp>? = null
        private var paddingStart: StatefulValue<Dp>? = null
        private var paddingEnd: StatefulValue<Dp>? = null
        private var paddingTop: StatefulValue<Dp>? = null
        private var paddingBottom: StatefulValue<Dp>? = null
        private var progressHeight: StatefulValue<Dp>? = null
        private var progressSpacing: StatefulValue<Dp>? = null
        private var progressPointerThickness: StatefulValue<Dp>? = null
        private var progressCornerRadius: StatefulValue<Dp>? = null
        private var chevronTextOverlap: StatefulValue<Dp>? = null
        private var chevronIconSize: StatefulValue<Dp>? = null

        override fun circleSize(size: StatefulValue<Dp>) = apply { this.circleSize = size }
        override fun iconSize(size: StatefulValue<Dp>) = apply { this.iconSize = size }
        override fun bodyCornerRadius(radius: StatefulValue<Dp>) = apply { this.bodyCornerRadius = radius }
        override fun bodyNearCornerRadius(radius: StatefulValue<Dp>) = apply { this.bodyNearCornerRadius = radius }
        override fun bodyMinHeight(height: StatefulValue<Dp>) = apply { this.bodyMinHeight = height }
        override fun width(width: StatefulValue<Dp>) = apply { this.width = width }
        override fun neckWidth(width: StatefulValue<Dp>) = apply { this.neckWidth = width }
        override fun neckLength(length: StatefulValue<Dp>) = apply { this.neckLength = length }
        override fun neckFilletRadius(radius: StatefulValue<Dp>) = apply { this.neckFilletRadius = radius }
        override fun paddingStart(padding: StatefulValue<Dp>) = apply { this.paddingStart = padding }
        override fun paddingEnd(padding: StatefulValue<Dp>) = apply { this.paddingEnd = padding }
        override fun paddingTop(padding: StatefulValue<Dp>) = apply { this.paddingTop = padding }
        override fun paddingBottom(padding: StatefulValue<Dp>) = apply { this.paddingBottom = padding }
        override fun progressHeight(height: StatefulValue<Dp>) = apply { this.progressHeight = height }
        override fun progressSpacing(spacing: StatefulValue<Dp>) = apply { this.progressSpacing = spacing }
        override fun progressPointerThickness(thickness: StatefulValue<Dp>) = apply {
            this.progressPointerThickness = thickness
        }
        override fun progressCornerRadius(radius: StatefulValue<Dp>) = apply { this.progressCornerRadius = radius }
        override fun chevronTextOverlap(overlap: StatefulValue<Dp>) = apply { this.chevronTextOverlap = overlap }
        override fun chevronIconSize(size: StatefulValue<Dp>) = apply { this.chevronIconSize = size }

        @Suppress("CyclomaticComplexMethod")
        override fun build(): BubbleDimensions = DefaultBubbleDimensions(
            circleSize = circleSize ?: 32.dp.asStatefulValue(),
            iconSize = iconSize ?: 16.dp.asStatefulValue(),
            bodyCornerRadius = bodyCornerRadius ?: 12.dp.asStatefulValue(),
            bodyNearCornerRadius = bodyNearCornerRadius ?: 6.dp.asStatefulValue(),
            bodyMinHeight = bodyMinHeight ?: 40.dp.asStatefulValue(),
            width = width ?: 100.dp.asStatefulValue(),
            neckWidth = neckWidth ?: 12.dp.asStatefulValue(),
            neckLength = neckLength ?: 4.dp.asStatefulValue(),
            neckFilletRadius = neckFilletRadius ?: 4.dp.asStatefulValue(),
            paddingStart = paddingStart ?: 8.dp.asStatefulValue(),
            paddingEnd = paddingEnd ?: 8.dp.asStatefulValue(),
            paddingTop = paddingTop ?: 6.dp.asStatefulValue(),
            paddingBottom = paddingBottom ?: 8.dp.asStatefulValue(),
            progressHeight = progressHeight ?: 4.dp.asStatefulValue(),
            progressSpacing = progressSpacing ?: 8.dp.asStatefulValue(),
            progressPointerThickness = progressPointerThickness ?: 4.dp.asStatefulValue(),
            progressCornerRadius = progressCornerRadius ?: 2.dp.asStatefulValue(),
            chevronTextOverlap = chevronTextOverlap ?: 3.dp.asStatefulValue(),
            chevronIconSize = chevronIconSize ?: 16.dp.asStatefulValue(),
        )
    }
}

@Immutable
internal class DefaultBubbleStyle(
    override val colors: BubbleColors,
    override val dimensions: BubbleDimensions,
    override val textStyle: StatefulValue<TextStyle>,
    override val shadow: StatefulValue<ShadowAppearance>,
    @get:DrawableRes override val starIcon: Int,
    @get:DrawableRes override val closeIcon: Int,
    override val expandDurationMillis: Int,
    override val collapseDurationMillis: Int,
) : BubbleStyle {

    @Stable
    class Builder : BubbleStyleBuilder {
        private var colorsBuilder: BubbleColorsBuilder = BubbleColors.builder()
        private var dimensionsBuilder: BubbleDimensionsBuilder = BubbleDimensions.builder()
        private var textStyle: StatefulValue<TextStyle>? = null
        private var shadow: StatefulValue<ShadowAppearance>? = null

        @DrawableRes private var starIcon: Int? = null

        @DrawableRes private var closeIcon: Int? = null
        private var expandDurationMillis: Int? = null
        private var collapseDurationMillis: Int? = null

        @Composable
        override fun colors(builder: @Composable BubbleColorsBuilder.() -> Unit): BubbleStyleBuilder =
            apply { this.colorsBuilder.builder() }

        @Composable
        override fun dimensions(
            builder: @Composable BubbleDimensionsBuilder.() -> Unit,
        ): BubbleStyleBuilder = apply { this.dimensionsBuilder.builder() }

        override fun textStyle(textStyle: StatefulValue<TextStyle>) = apply { this.textStyle = textStyle }

        override fun shadow(shadow: StatefulValue<ShadowAppearance>) = apply { this.shadow = shadow }

        override fun starIcon(@DrawableRes icon: Int) = apply { this.starIcon = icon }

        override fun closeIcon(@DrawableRes icon: Int) = apply { this.closeIcon = icon }

        override fun expandDuration(durationMillis: Int) = apply { this.expandDurationMillis = durationMillis }

        override fun collapseDuration(durationMillis: Int) = apply { this.collapseDurationMillis = durationMillis }

        @Suppress("CyclomaticComplexMethod")
        override fun style(): BubbleStyle = DefaultBubbleStyle(
            colors = colorsBuilder.build(),
            dimensions = dimensionsBuilder.build(),
            textStyle = textStyle ?: TextStyle.Default.asStatefulValue(),
            shadow = shadow ?: ShadowAppearance(
                listOf(
                    ShadowLayer(
                        color = Color(0xFFD0FF77).copy(alpha = 0.6f),
                        offset = DpOffset.Zero,
                        spreadRadius = 0.dp,
                        blurRadius = 4.dp,
                    ),
                ),
            ).asStatefulValue(),
            starIcon = starIcon ?: R.drawable.ic_star_four_fill_16,
            closeIcon = closeIcon ?: R.drawable.ic_close_24,
            expandDurationMillis = expandDurationMillis ?: DEFAULT_EXPAND_DURATION_MILLIS,
            collapseDurationMillis = collapseDurationMillis ?: DEFAULT_COLLAPSE_DURATION_MILLIS,
        )
    }

    private companion object {
        private const val DEFAULT_EXPAND_DURATION_MILLIS = 600
        private const val DEFAULT_COLLAPSE_DURATION_MILLIS = 600
    }
}
