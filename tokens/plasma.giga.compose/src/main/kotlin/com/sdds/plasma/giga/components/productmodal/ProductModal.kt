package com.sdds.plasma.giga.components.productmodal

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.window.DialogProperties
import com.sdds.compose.uikit.IconButton
import com.sdds.compose.uikit.ImageSource
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.Modal
import com.sdds.compose.uikit.ModalAnimations
import com.sdds.compose.uikit.ModalGravity
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.Text
import com.sdds.compose.uikit.graphics.brush.BrushProducer
import com.sdds.compose.uikit.interactions.getValue
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.plasma.giga.motion.productmodal.ProductModalMotionStyle
import com.sdds.plasma.giga.motion.productmodal.rememberProductModalMotion

/**
 * Компонент ProductModal, построенный поверх компонента [Modal].
 *
 * Контент компонента разбит на слоты:
 * - [header] - хедер, внутри которого провайдятся стиль и цвет текста из [ProductModalStyle];
 * - [content] - контент, например изображение;
 * - [extra] - произвольный контент;
 * - [footer] - футер, внутри которого провайдится стиль ButtonGroupStyle из [ProductModalStyle];
 * - [footerText] - текст под футером, внутри которого провайдятся стиль и цвет текста из [ProductModalStyle].
 *
 * Форма и цвет фона берутся из ModalStyle внутри [ProductModalStyle], все слоты прозрачные.
 *
 * @param show будет ли показан [ProductModal]
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне [ProductModal]
 * @param modifier модификатор для контента
 * @param dimBackground нужно ли затемнять фон
 * @param style стиль компонента [ProductModalStyle]
 * @param gravity расположение контента в окне [ModalGravity]
 * @param dialogProperties свойства [DialogProperties]
 * @param edgeToEdge растягивать окно на всю высоту экрана
 * @param hasClose должна ли показываться кнопка закрытия, показывается только вместе с [closeIcon]
 * @param closeIcon иконка кнопки закрытия, по умолчанию кнопка не отображается
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [Modal]
 * @param motion объект анимации для компонента
 * @param animations настройки анимаций модального окна
 * @param headerMode режим расположения хедера [ProductModalHeaderMode]
 * @param header слот для хедера
 * @param content слот для контента, например изображения
 * @param extra слот для произвольного контента
 * @param footer слот для футера, например кнопок, внутри [ColumnScope] можно выровнять контент через [Modifier.align]
 * @param footerText слот для текста под футером, внутри [ColumnScope] можно выровнять текст через [Modifier.align]
 */
@Composable
fun ProductModal(
    show: Boolean,
    onDismissRequest: () -> Unit,
    modifier: Modifier = Modifier,
    dimBackground: Boolean = true,
    style: ProductModalStyle = LocalProductModalStyle.current,
    gravity: ModalGravity = ModalGravity.Center,
    dialogProperties: DialogProperties = DialogProperties(),
    edgeToEdge: Boolean = true,
    hasClose: Boolean = true,
    closeIcon: Painter? = null,
    useNativeBlackout: Boolean = false,
    animations: ModalAnimations = ModalAnimations(),
    headerMode: ProductModalHeaderMode = ProductModalHeaderMode.Default,
    header: (@Composable () -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    extra: (@Composable () -> Unit)? = null,
    footer: (@Composable ColumnScope.() -> Unit)? = null,
    footerText: (@Composable ColumnScope.() -> Unit)? = null,
    motion: Motion<ProductModalMotionStyle> = rememberProductModalMotion(),
) {
    Modal(
        show = show,
        dimBackground = dimBackground,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        style = style.modalStyle,
        gravity = gravity,
        dialogProperties = dialogProperties,
        edgeToEdge = edgeToEdge,
        hasClose = false,
        closeIcon = null,
        useNativeBlackout = useNativeBlackout,
        interactionSource = motion.context.interactionSource,
        animations = animations,
    ) {
        val columnContent: @Composable ColumnScope.() -> Unit = {
            content?.invoke()
            ExtraSlot(style, motion, extra)
            FooterSlot(style, motion, footer, footerText)
        }
        Box {
            when (headerMode) {
                ProductModalHeaderMode.Default -> {
                    Column {
                        HeaderSlot(style, motion, content = header)
                        columnContent()
                    }
                }

                ProductModalHeaderMode.Absolute -> {
                    Box {
                        Column(content = columnContent)
                        HeaderSlot(
                            style = style,
                            motion = motion,
                            modifier = Modifier.align(Alignment.TopStart),
                            content = header,
                        )
                    }
                }
            }
            if (hasClose && closeIcon != null) {
                IconClose(style, motion, onDismissRequest, closeIcon)
            }
        }
    }
}

/**
 * Компонент ProductModal, построенный поверх компонента [Modal].
 *
 * Перегрузка со строковыми параметрами [header] и [footerText]: строки оборачиваются в [Text],
 * остальные слоты передаются как лямбды.
 *
 * @param show будет ли показан [ProductModal]
 * @param onDismissRequest колбэк, который будет вызван при нажатии вне [ProductModal]
 * @param header текст хедера
 * @param modifier модификатор для контента
 * @param dimBackground нужно ли затемнять фон
 * @param style стиль компонента [ProductModalStyle]
 * @param gravity расположение контента в окне [ModalGravity]
 * @param dialogProperties свойства [DialogProperties]
 * @param edgeToEdge растягивать окно на всю высоту экрана
 * @param hasClose должна ли показываться кнопка закрытия, показывается только вместе с [closeIcon]
 * @param closeIcon иконка кнопки закрытия, по умолчанию кнопка не отображается
 * @param useNativeBlackout использовать нативное затемнение фона вокруг [Modal]
 * @param motion объект анимации для компонента
 * @param animations настройки анимаций модального окна
 * @param headerMode режим расположения хедера [ProductModalHeaderMode]
 * @param footerText текст под футером
 * @param content слот для контента, например изображения
 * @param extra слот для произвольного контента
 * @param footer слот для футера, например кнопок, внутри [ColumnScope] можно выровнять контент через [Modifier.align]
 */
@Composable
fun ProductModal(
    show: Boolean,
    onDismissRequest: () -> Unit,
    header: String,
    modifier: Modifier = Modifier,
    dimBackground: Boolean = true,
    style: ProductModalStyle = LocalProductModalStyle.current,
    gravity: ModalGravity = ModalGravity.Center,
    dialogProperties: DialogProperties = DialogProperties(),
    edgeToEdge: Boolean = true,
    hasClose: Boolean = true,
    closeIcon: Painter? = null,
    useNativeBlackout: Boolean = false,
    animations: ModalAnimations = ModalAnimations(),
    headerMode: ProductModalHeaderMode = ProductModalHeaderMode.Default,
    footerText: String? = null,
    content: (@Composable () -> Unit)? = null,
    extra: (@Composable () -> Unit)? = null,
    footer: (@Composable ColumnScope.() -> Unit)? = null,
    motion: Motion<ProductModalMotionStyle> = rememberProductModalMotion(),
) {
    val footerTextSlot: (@Composable ColumnScope.() -> Unit)? = if (footerText != null) {
        @Composable { Text(footerText) }
    } else {
        null
    }
    ProductModal(
        show = show,
        dimBackground = dimBackground,
        onDismissRequest = onDismissRequest,
        modifier = modifier,
        style = style,
        gravity = gravity,
        dialogProperties = dialogProperties,
        edgeToEdge = edgeToEdge,
        hasClose = hasClose,
        closeIcon = closeIcon,
        useNativeBlackout = useNativeBlackout,
        motion = motion,
        animations = animations,
        headerMode = headerMode,
        header = @Composable { Text(header) },
        content = content,
        extra = extra,
        footer = footer,
        footerText = footerTextSlot,
    )
}

/**
 * Режим расположения хедера в компоненте [ProductModal]
 */
enum class ProductModalHeaderMode {
    /**
     * Хедер расположен в колонке над остальным контентом
     */
    Default,

    /**
     * Хедер наложен поверх контента и выровнен по верхнему краю компонента
     */
    Absolute,
}

/**
 * Кнопка закрытия, расположенная поверх контента в правом верхнем углу,
 * с отступами из [ProductModalDimensions]
 */
@Composable
private fun BoxScope.IconClose(
    style: ProductModalStyle,
    motion: Motion<ProductModalMotionStyle>,
    onDismissRequest: () -> Unit,
    closeIcon: Painter,
) {
    val interactionSource = motion.context.interactionSource
    val semanticStateSource = motion.context.semanticStateSource
    val imageSource = remember(closeIcon) { ImageSource { closeIcon } }
    IconButton(
        modifier = Modifier
            .align(Alignment.TopEnd)
            .padding(
                top = style.dimensions.closePaddingTop.getValue(interactionSource, semanticStateSource),
                end = style.dimensions.closePaddingEnd.getValue(interactionSource, semanticStateSource),
            ),
        iconSource = imageSource,
        style = style.iconButtonStyle,
        onClick = onDismissRequest,
    )
}

/**
 * Слот для хедера внутри [ProductModal], провайдящий стиль и цвет текста из [ProductModalStyle]
 */
@Composable
private fun HeaderSlot(
    style: ProductModalStyle,
    motion: Motion<ProductModalMotionStyle>,
    modifier: Modifier = Modifier,
    content: (@Composable () -> Unit)?,
) {
    if (content == null) return
    val dimensions = style.dimensions
    val interactionSource = motion.context.interactionSource
    val semanticStateSource = motion.context.semanticStateSource
    val textStyle by style.headerTextStyle.getTextStyleAsState(
        context = motion.context,
        motionProperty = motion.style.headerTextStyle,
    )
    val textColor by style.colors.headerTextColor.getBrushAsState(
        context = motion.context,
        motionProperty = motion.style.headerTextColor,
    )
    Box(
        modifier = modifier.padding(
            start = dimensions.headerPaddingStart.getValue(interactionSource, semanticStateSource),
            top = dimensions.headerPaddingTop.getValue(interactionSource, semanticStateSource),
            end = dimensions.headerPaddingEnd.getValue(interactionSource, semanticStateSource),
            bottom = dimensions.headerPaddingBottom.getValue(interactionSource, semanticStateSource),
        ),
    ) {
        ProvideTextStyle(textStyle, BrushProducer { textColor }) {
            content.invoke()
        }
    }
}

/**
 * Слот для произвольного контента внутри [ProductModal]
 */
@Composable
private fun ExtraSlot(
    style: ProductModalStyle,
    motion: Motion<ProductModalMotionStyle>,
    content: (@Composable () -> Unit)?,
) {
    if (content == null) return
    val dimensions = style.dimensions
    val interactionSource = motion.context.interactionSource
    val semanticStateSource = motion.context.semanticStateSource
    Box(
        modifier = Modifier.padding(
            start = dimensions.extraPaddingStart.getValue(interactionSource, semanticStateSource),
            top = dimensions.extraPaddingTop.getValue(interactionSource, semanticStateSource),
            end = dimensions.extraPaddingEnd.getValue(interactionSource, semanticStateSource),
            bottom = dimensions.extraPaddingBottom.getValue(interactionSource, semanticStateSource),
        ),
    ) {
        content.invoke()
    }
}

/**
 * Слот для футера внутри [ProductModal].
 * Контент футера располагается в колонке: группа кнопок сверху, текст [footerText] снизу.
 * Отступ между ними берётся из [ProductModalDimensions.footerTextPadding] и не добавляется,
 * если заполнен только один из слотов.
 */
@Composable
private fun FooterSlot(
    style: ProductModalStyle,
    motion: Motion<ProductModalMotionStyle>,
    footer: (@Composable ColumnScope.() -> Unit)?,
    footerText: (@Composable ColumnScope.() -> Unit)?,
) {
    if (footer == null && footerText == null) return
    val dimensions = style.dimensions
    val interactionSource = motion.context.interactionSource
    val semanticStateSource = motion.context.semanticStateSource
    Column(
        modifier = Modifier.padding(
            start = dimensions.footerPaddingStart.getValue(interactionSource, semanticStateSource),
            top = dimensions.footerPaddingTop.getValue(interactionSource, semanticStateSource),
            end = dimensions.footerPaddingEnd.getValue(interactionSource, semanticStateSource),
            bottom = dimensions.footerPaddingBottom.getValue(interactionSource, semanticStateSource),
        ),
        verticalArrangement = Arrangement.spacedBy(
            dimensions.footerTextPadding.getValue(interactionSource, semanticStateSource),
        ),
    ) {
        if (footer != null) {
            CompositionLocalProvider(LocalButtonGroupStyle provides style.buttonGroupStyle) {
                footer.invoke(this)
            }
        }
        FooterTextSlot(style, motion, footerText)
    }
}

/**
 * Слот для текста под футером внутри [ProductModal],
 * провайдящий стиль и цвет текста из [ProductModalStyle]
 */
@Composable
private fun ColumnScope.FooterTextSlot(
    style: ProductModalStyle,
    motion: Motion<ProductModalMotionStyle>,
    content: (@Composable ColumnScope.() -> Unit)?,
) {
    if (content == null) return
    val textStyle by style.footerTextStyle.getTextStyleAsState(
        context = motion.context,
        motionProperty = motion.style.footerTextStyle,
    )
    val textColor by style.colors.footerTextColor.getBrushAsState(
        context = motion.context,
        motionProperty = motion.style.footerTextColor,
    )
    val scope = this
    ProvideTextStyle(textStyle, BrushProducer { textColor }) {
        content.invoke(scope)
    }
}
