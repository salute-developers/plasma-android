package com.sdds.compose.uikit.ai

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.VectorConverter
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.rememberTextMeasurer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.sdds.compose.uikit.File
import com.sdds.compose.uikit.LocalButtonGroupStyle
import com.sdds.compose.uikit.LocalButtonStyle
import com.sdds.compose.uikit.LocalFileStyle
import com.sdds.compose.uikit.LocalIconButtonStyle
import com.sdds.compose.uikit.ProvideTextStyle
import com.sdds.compose.uikit.ScrollBar
import com.sdds.compose.uikit.graphics.backgroundBrush
import com.sdds.compose.uikit.interactions.getValueAsState
import com.sdds.compose.uikit.motion.Motion
import com.sdds.compose.uikit.motion.components.aiinput.AiInputMotionStyle
import com.sdds.compose.uikit.motion.components.aiinput.rememberAiInputMotion
import com.sdds.compose.uikit.motion.getBrushAsState
import com.sdds.compose.uikit.motion.getDpAsState
import com.sdds.compose.uikit.motion.getTextStyleAsState
import com.sdds.compose.uikit.motion.rememberMotionContext

/**
 * Компонент ввода для AI-интерфейсов.
 *
 * Объединяет текстовое поле, область вложений и набор контролов слева и справа.
 * Режим отображения определяется через [AiInputStyle.mode]:
 * - [AiInputMode.Condensed] — поле ввода в одной строке с контролами при однострочном тексте,
 *   переносится над контролами при многострочном.
 * - [AiInputMode.Extended] — поле ввода всегда располагается над контролами.
 *
 * В многострочном режиме поле ввода становится вертикально прокручиваемым.
 * При [hasScrollBar] = true справа отображается [ScrollBar], который появляется
 * при прокрутке и исчезает после её остановки.
 *
 * @param value текущее значение текстового поля
 * @param onValueChange колбэк изменения значения
 * @param modifier модификатор
 * @param style стиль компонента [AiInputStyle]
 * @param motion объект анимаций
 * @param enabled доступность компонента для взаимодействия
 * @param readOnly режим только для чтения
 * @param keyboardOptions параметры клавиатуры
 * @param keyboardActions обработчики действий клавиатуры
 * @param visualTransformation трансформация отображаемого текста
 * @param interactionSource источник взаимодействий
 * @param hasScrollBar показывать ли скроллбар в многострочном режиме
 * @param placeholder слот placeholder, отображается при пустом тексте
 * @param content слот контента (например, File-компоненты); располагается над полем ввода с горизонтальным скроллом
 * @param startControls слот левой группы контролов; стиль группы провайдится через [LocalButtonGroupStyle]
 * @param endControls слот правой группы контролов; стиль группы провайдится через [LocalButtonGroupStyle]
 * @param sendButton слот кнопки отправки, располагается справа от [endControls]; стиль провайдится через [LocalButtonStyle]
 */
@Suppress("CyclomaticComplexMethod")
@Composable
fun AiInput(
    value: TextFieldValue,
    onValueChange: (TextFieldValue) -> Unit,
    modifier: Modifier = Modifier,
    style: AiInputStyle = LocalAiInputStyle.current,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    hasScrollBar: Boolean = true,
    placeholder: (@Composable () -> Unit)? = null,
    content: (@Composable RowScope.() -> Unit)? = null,
    startControls: (@Composable () -> Unit)? = null,
    endControls: (@Composable () -> Unit)? = null,
    sendButton: (@Composable () -> Unit)? = null,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    motion: Motion<AiInputMotionStyle> = rememberAiInputMotion(
        motionContext = rememberMotionContext(interactionSource),
    ),
) {
    val backgroundColorState = style.colors.backgroundColor.getBrushAsState(
        motion.context,
        motion.style.backgroundColor,
    )
    val inputColorState = style.colors.inputColor.getBrushAsState(
        motion.context,
        motion.style.inputColor,
    )
    val placeholderColorState = style.colors.placeholderColor.getBrushAsState(
        motion.context,
        motion.style.placeholderColor,
    )
    val cursorColorState = style.colors.cursorColor.getBrushAsState(
        motion.context,
        motion.style.cursorColor,
    )
    val shape = style.shape.getValueAsState(motion.context)
    val contentClipShape = style.fileStyle.shape.getValueAsState(motion.context)

    val paddingStart by style.dimensions.paddingStart.getDpAsState(motion.context, motion.style.paddingStart)
    val paddingEnd by style.dimensions.paddingEnd.getDpAsState(motion.context, motion.style.paddingEnd)
    val paddingTop by style.dimensions.paddingTop.getDpAsState(motion.context, motion.style.paddingTop)
    val paddingBottom by style.dimensions.paddingBottom.getDpAsState(motion.context, motion.style.paddingBottom)
    val textFieldPaddingStart by style.dimensions.textFieldPaddingStart.getDpAsState(
        motion.context,
        motion.style.textFieldPaddingStart,
    )
    val textFieldPaddingEnd by style.dimensions.textFieldPaddingEnd.getDpAsState(
        motion.context,
        motion.style.textFieldPaddingEnd,
    )
    val textFieldPaddingTop by style.dimensions.textFieldPaddingTop.getDpAsState(
        motion.context,
        motion.style.textFieldPaddingTop,
    )
    val textFieldPaddingBottom by style.dimensions.textFieldPaddingBottom.getDpAsState(
        motion.context,
        motion.style.textFieldPaddingBottom,
    )
    val contentPadding by style.dimensions.contentPadding.getDpAsState(
        motion.context,
        motion.style.contentPadding,
    )
    val contentSpacing by style.dimensions.contentSpacing.getDpAsState(
        motion.context,
        motion.style.contentSpacing,
    )
    val scrollBarPaddingStart by style.dimensions.scrollBarPaddingStart.getDpAsState(
        motion.context,
        motion.style.scrollBarPaddingStart,
    )
    val scrollBarPaddingTop by style.dimensions.scrollBarPaddingTop.getDpAsState(
        motion.context,
        motion.style.scrollBarPaddingTop,
    )
    val scrollBarPaddingBottom by style.dimensions.scrollBarPaddingBottom.getDpAsState(
        motion.context,
        motion.style.scrollBarPaddingBottom,
    )

    val inputStyle by style.inputStyle.getTextStyleAsState(motion.context, motion.style.inputStyle)
    val placeholderStyle by style.placeholderStyle.getTextStyleAsState(motion.context, motion.style.placeholderStyle)

    val textMeasurer = rememberTextMeasurer()

    // Многострочность определяет раскладка (onMultilineChanged): она знает живые ширины контролов и
    // меряет «влезает ли текст в одну строку» по ТЕКУЩЕЙ узкой ширине поля (width − ширина контролов).
    // Решение не зависит от текущей раскладки, поэтому не осциллирует при изменении ширины контролов.
    var isMultiline by remember { mutableStateOf(false) }
    val verticalScrollState: ScrollState = rememberScrollState()
    var textLayoutResult by remember { mutableStateOf<TextLayoutResult?>(null) }
    val density = LocalDensity.current

    val showFieldAboveControls = style.mode == AiInputMode.Extended || isMultiline

    // Анимируемая высота текстового поля в многострочном режиме. Целевую высоту считает раскладка
    // (через onTextHeightMeasured), а контролы и нижняя граница привязаны к этой анимируемой высоте —
    // поэтому они едут вместе с границей, а не «догоняют» её, как при animateContentSize.
    var multilineTargetHeight by remember { mutableIntStateOf(0) }
    val fieldHeightAnim = remember { Animatable(0, Int.VectorConverter) }
    LaunchedEffect(multilineTargetHeight, showFieldAboveControls) {
        if (!showFieldAboveControls) {
            fieldHeightAnim.snapTo(0)
            return@LaunchedEffect
        }
        if (multilineTargetHeight <= 0) return@LaunchedEffect
        if (fieldHeightAnim.value <= 0) {
            // Первый кадр в многострочном режиме — без анимации, чтобы поле не «вырастало» из нуля.
            fieldHeightAnim.snapTo(multilineTargetHeight)
        } else {
            fieldHeightAnim.animateTo(
                multilineTargetHeight,
                animationSpec = spring(stiffness = Spring.StiffnessMedium, visibilityThreshold = 1),
            )
        }
    }

    LaunchedEffect(textLayoutResult) {
        val layout = textLayoutResult ?: return@LaunchedEffect
        // Скролл считаем по ЦЕЛЕВОЙ (устоявшейся) высоте вьюпорта, а не по текущей анимируемой
        // (viewportHeight отстаёт и в момент анимации меньше): иначе при росте поля эффект
        // скроллит в маленьком вьюпорте, а затем скролл сбрасывается — верх текста дёргается.
        val verticalPaddingPx = with(density) { (textFieldPaddingTop + textFieldPaddingBottom).roundToPx() }
        val targetViewport = (multilineTargetHeight - verticalPaddingPx).coerceAtLeast(0)
        if (targetViewport <= 0) return@LaunchedEffect
        val cursorOffset = value.selection.end.coerceIn(0, layout.layoutInput.text.length)
        val cursorRect = layout.getCursorRect(cursorOffset)
        val cursorTop = cursorRect.top.toInt()
        val cursorBottom = cursorRect.bottom.toInt()
        val scrollTop = verticalScrollState.value
        val scrollBottom = scrollTop + targetViewport
        val target = when {
            cursorBottom > scrollBottom -> (cursorBottom - targetViewport).coerceAtLeast(0)
            cursorTop < scrollTop -> cursorTop.coerceAtLeast(0)
            else -> return@LaunchedEffect
        }
        verticalScrollState.scrollTo(target)
    }

    // scrollEnabled включаем только когда высота ограничена родителем. При unbounded-высоте
    // Modifier.verticalScroll бросает IllegalStateException (бесконечная высота), поэтому
    // в таком случае поле просто растёт по содержимому, а контролы кладутся под ним обычным Column.
    val textFieldBlock: @Composable (Modifier, Boolean) -> Unit = { fieldModifier, scrollEnabled ->
        // maxValue > 0 означает, что контент не помещается во вьюпорт и реально скроллится.
        // Когда высота свободна и текст растёт без ограничений, скроллить нечего — скрываем.
        val isScrollable = scrollEnabled && verticalScrollState.maxValue > 0
        val showScrollBar = hasScrollBar && isMultiline && isScrollable
        // Скроллбар накладывается поверх поля и НЕ участвует в измерении: размеры строки диктует
        // только текстовое поле. Поэтому textFieldPaddingEnd остаётся отступом от текста до края
        // компонента, а скроллбар рисуется внутри этого отступа и не сдвигает верстку при
        // появлении/исчезновении.
        Layout(
            modifier = fieldModifier,
            content = {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            start = textFieldPaddingStart,
                            end = textFieldPaddingEnd,
                            top = textFieldPaddingTop,
                            bottom = textFieldPaddingBottom,
                        ),
                ) {
                    BasicTextField(
                        value = value,
                        onValueChange = onValueChange,
                        modifier = Modifier.fillMaxWidth(),
                        enabled = enabled,
                        readOnly = readOnly,
                        textStyle = inputStyle.copy(brush = inputColorState.value),
                        keyboardOptions = keyboardOptions,
                        keyboardActions = keyboardActions,
                        visualTransformation = visualTransformation,
                        interactionSource = interactionSource,
                        cursorBrush = cursorColorState.value,
                        // Многострочность считает раскладка (по узкой ширине), здесь лишь сохраняем
                        // результат для авто-скролла к курсору.
                        onTextLayout = { result -> textLayoutResult = result },
                        decorationBox = { innerTextField ->
                            Box(
                                modifier = if (scrollEnabled) {
                                    Modifier.verticalScroll(verticalScrollState)
                                } else {
                                    Modifier
                                },
                            ) {
                                if (value.text.isEmpty() && placeholder != null) {
                                    ProvideTextStyle(
                                        value = placeholderStyle,
                                        brush = { placeholderColorState.value },
                                    ) {
                                        placeholder()
                                    }
                                }
                                innerTextField()
                            }
                        },
                    )
                }
                if (showScrollBar) {
                    // Трек выравнивается по области текста: инсет от границ поля = textFieldPadding
                    // (как и сам текст) + scrollBarPadding внутрь.
                    ScrollBar(
                        scrollState = verticalScrollState,
                        modifier = Modifier.padding(
                            top = textFieldPaddingTop + scrollBarPaddingTop,
                            bottom = textFieldPaddingBottom + scrollBarPaddingBottom,
                        ),
                        style = style.scrollBarStyle,
                        hasTrack = true,
                        alwaysShowScrollbar = false,
                    )
                }
            },
        ) { measurables, constraints ->
            val fieldPlaceable = measurables[0].measure(constraints)
            // Скроллбар измеряется на полную высоту поля, но не влияет на итоговый размер строки.
            val scrollBarPlaceable = measurables.getOrNull(1)?.measure(
                Constraints(
                    minWidth = 0,
                    maxWidth = constraints.maxWidth,
                    minHeight = fieldPlaceable.height,
                    maxHeight = fieldPlaceable.height,
                ),
            )
            layout(fieldPlaceable.width, fieldPlaceable.height) {
                fieldPlaceable.place(0, 0)
                scrollBarPlaceable?.let {
                    // Скроллбар начинается сразу после зоны textFieldPaddingEnd, то есть его левый
                    // край — на правой границе поля (+ scrollBarPaddingStart). Скроллбар не входит
                    // в размер строки, поэтому выходит правее поля, во внешний paddingEnd компонента.
                    val x = fieldPlaceable.width + scrollBarPaddingStart.roundToPx()
                    it.place(x, 0)
                }
            }
        }
    }

    // Единая раскладка: фон, паддинги, область content, поле и контролы — всё в одном Layout, чтобы
    // он получал РОДИТЕЛЬСКИЕ ограничения напрямую (включая hasFixedHeight). Промежуточный Column
    // «съедал» фиксированность высоты, из-за чего её приходилось снимать костыльно.
    AiInputLayout(
        modifier = modifier
            .clip(shape.value)
            .backgroundBrush(brushProducer = { backgroundColorState.value })
            .padding(
                start = paddingStart,
                end = paddingEnd,
                top = paddingTop,
                bottom = paddingBottom,
            ),
        multiline = showFieldAboveControls,
        condensed = style.mode == AiInputMode.Condensed,
        animatedFieldHeight = fieldHeightAnim.value,
        contentPadding = contentPadding,
        onTextHeightMeasured = { multilineTargetHeight = it },
        onMultilineChanged = { isMultiline = it },
        naturalLineCount = { fieldWidthPx ->
            val contentWidth = (fieldWidthPx - (textFieldPaddingStart + textFieldPaddingEnd).roundToPx())
                .coerceAtLeast(0)
            textMeasurer.measure(
                text = value.text,
                style = inputStyle,
                constraints = Constraints(maxWidth = contentWidth),
            ).lineCount
        },
        naturalTextHeightPx = { fieldWidthPx ->
            val contentWidth = (fieldWidthPx - (textFieldPaddingStart + textFieldPaddingEnd).roundToPx())
                .coerceAtLeast(0)
            val lineCount = textMeasurer.measure(
                text = value.text,
                style = inputStyle,
                constraints = Constraints(maxWidth = contentWidth),
            ).lineCount
            // Высоту считаем как «число строк × высота эталонной строки», а не по фактическим
            // пикселям: иначе пустая строка с курсором (метрики fallback-шрифта) и строка с
            // символом отличаются на пару px, и ввод первого символа на новой строке даёт
            // заметный прирост. Эталон ≥ высоты любой строки, поэтому лишнего скролла нет.
            val singleLineHeight = textMeasurer.measure(text = "X", style = inputStyle).size.height
            lineCount * singleLineHeight + (textFieldPaddingTop + textFieldPaddingBottom).roundToPx()
        },
        content = content?.let { contentSlot ->
            {
                CompositionLocalProvider(LocalFileStyle provides style.fileStyle) {
                    Row(
                        modifier = Modifier
                            .clip(contentClipShape.value)
                            .horizontalScroll(rememberScrollState()),
                        horizontalArrangement = Arrangement.spacedBy(contentSpacing),
                    ) {
                        contentSlot()
                    }
                }
            }
        },
        field = { textFieldBlock(Modifier.fillMaxWidth(), showFieldAboveControls) },
        startControls = startControls?.let {
            {
                CompositionLocalProvider(LocalButtonGroupStyle provides style.startButtonGroupStyle) {
                    it()
                }
            }
        },
        endControls = endControls?.let {
            {
                CompositionLocalProvider(LocalButtonGroupStyle provides style.endButtonGroupStyle) {
                    it()
                }
            }
        },
        sendButton = sendButton?.let {
            {
                CompositionLocalProvider(LocalIconButtonStyle provides style.sendButtonStyle) {
                    it()
                }
            }
        },
    )
}

private const val CONTENT_LAYOUT_ID = "content"
private const val FIELD_LAYOUT_ID = "field"
private const val START_CONTROLS_LAYOUT_ID = "start"
private const val END_CONTROLS_LAYOUT_ID = "end"
private const val SEND_BUTTON_LAYOUT_ID = "send"

/**
 * Единая раскладка AiInput: область [content] сверху, под ней — поле ([field]) и контролы.
 *
 * Раскладка — единственный кастомный [Layout] компонента (фон и паддинги навешаны на [modifier]),
 * поэтому она получает РОДИТЕЛЬСКИЕ ограничения напрямую и может различать фиксированную высоту
 * (`constraints.hasFixedHeight`, т.е. `Modifier.height(...)`) и auto-resize без промежуточного
 * состояния — Column «съедал» бы фиксированность высоты до того, как она дойдёт сюда.
 *
 * Поле ([field]) всегда остаётся дочерним элементом с одним и тем же [FIELD_LAYOUT_ID] — позиция в
 * дереве композиции не меняется при переключении [multiline], поэтому текстовое поле не пересоздаётся
 * и сохраняет фокус и курсор.
 *
 * - [multiline] == false (однострочный Condensed): контролы и поле выстраиваются в одну строку
 *   `[start][field][end][send]`, поле занимает всё свободное место по ширине.
 * - [multiline] == true (многострочный/Extended): поле занимает полную ширину сверху, контролы
 *   кладутся строкой под ним (`start` слева, `end`+`send` справа). При фиксированной высоте поле
 *   заполняет остаток высоты, а контролы прибиваются к низу компонента; при auto-resize высота поля
 *   берётся из [naturalTextHeightPx] (измеряется на полной ширине), и компонент растёт по содержимому.
 */
@Suppress("CyclomaticComplexMethod", "LongMethod")
@Composable
private fun AiInputLayout(
    multiline: Boolean,
    condensed: Boolean,
    animatedFieldHeight: Int,
    contentPadding: Dp,
    onTextHeightMeasured: (Int) -> Unit,
    onMultilineChanged: (Boolean) -> Unit,
    naturalLineCount: Density.(fieldWidthPx: Int) -> Int,
    naturalTextHeightPx: Density.(fieldWidthPx: Int) -> Int,
    field: @Composable () -> Unit,
    content: (@Composable () -> Unit)?,
    startControls: (@Composable () -> Unit)?,
    endControls: (@Composable () -> Unit)?,
    sendButton: (@Composable () -> Unit)?,
    modifier: Modifier = Modifier,
) {
    Layout(
        modifier = modifier,
        content = {
            content?.let { Box(Modifier.layoutId(CONTENT_LAYOUT_ID)) { it() } }
            Box(Modifier.layoutId(FIELD_LAYOUT_ID), propagateMinConstraints = true) { field() }
            startControls?.let { Box(Modifier.layoutId(START_CONTROLS_LAYOUT_ID)) { it() } }
            endControls?.let { Box(Modifier.layoutId(END_CONTROLS_LAYOUT_ID)) { it() } }
            sendButton?.let { Box(Modifier.layoutId(SEND_BUTTON_LAYOUT_ID)) { it() } }
        },
    ) { measurables, constraints ->
        val width = constraints.maxWidth
        val contentMeasurable = measurables.find { it.layoutId == CONTENT_LAYOUT_ID }
        val fieldMeasurable = measurables.first { it.layoutId == FIELD_LAYOUT_ID }
        val startMeasurable = measurables.find { it.layoutId == START_CONTROLS_LAYOUT_ID }
        val endMeasurable = measurables.find { it.layoutId == END_CONTROLS_LAYOUT_ID }
        val sendMeasurable = measurables.find { it.layoutId == SEND_BUTTON_LAYOUT_ID }
        val looseConstraints =
            Constraints(minWidth = 0, maxWidth = width, minHeight = 0, maxHeight = Constraints.Infinity)
        val boundedMaxHeight = if (constraints.hasBoundedHeight) constraints.maxHeight else Int.MAX_VALUE

        // Область content (например, File-компоненты) занимает верх; ниже неё на contentPadding
        // начинается зона поля/контролов. Высота content вычитается из доступной высоты.
        val contentPlaceable = contentMeasurable?.measure(looseConstraints)
        val contentGap = if (contentPlaceable != null) contentPadding.roundToPx() else 0
        val topOffset = (contentPlaceable?.height ?: 0) + contentGap

        val startPlaceable = startMeasurable?.measure(looseConstraints)
        val endPlaceable = endMeasurable?.measure(looseConstraints)
        val sendPlaceable = sendMeasurable?.measure(looseConstraints)

        val controlsWidth =
            (startPlaceable?.width ?: 0) + (endPlaceable?.width ?: 0) + (sendPlaceable?.width ?: 0)
        // Многострочность всегда оцениваем по УЗКОЙ ширине поля (между контролами в Condensed; полная
        // ширина в Extended, где поле и так над контролами). Ширина берётся из ЖИВЫХ контролов этого
        // же измерения, поэтому при добавлении/удалении контрола порог сразу актуален — нет осцилляции.
        val singleLineFieldWidth = if (condensed) {
            (width - controlsWidth).coerceAtLeast(0)
        } else {
            width
        }
        onMultilineChanged(naturalLineCount(singleLineFieldWidth) > 1)

        if (multiline) {
            val controlsHeight = maxOf(
                startPlaceable?.height ?: 0,
                endPlaceable?.height ?: 0,
                sendPlaceable?.height ?: 0,
            )
            // Высота поля и общая высота зоны поля+контролов.
            // - Фиксированная высота: поле заполняет остаток (доступная высота − высота контролов),
            //   зона занимает весь остаток, контролы садятся в самый низ компонента.
            // - Auto-resize: поле растёт по содержимому. Целевую (устоявшуюся) высоту считаем на полной
            //   ширине через TextMeasurer (свежо, без отстающего textLayoutResult) и сообщаем наружу для
            //   анимации; в раскладке используем уже анимированную высоту, чтобы контролы и граница
            //   ехали вместе.
            val textHeight: Int
            val regionHeight: Int
            if (constraints.hasFixedHeight) {
                val available = (constraints.maxHeight - topOffset).coerceAtLeast(0)
                textHeight = (available - controlsHeight).coerceAtLeast(0)
                onTextHeightMeasured(textHeight)
                regionHeight = available
            } else {
                val measuredTextHeight = naturalTextHeightPx(width)
                onTextHeightMeasured(measuredTextHeight)
                textHeight = if (animatedFieldHeight > 0) animatedFieldHeight else measuredTextHeight
                regionHeight = textHeight + controlsHeight
            }
            // Поле меряется фиксированной конечной высотой — это даёт ограниченный вьюпорт для
            // внутреннего verticalScroll (иначе при unbounded-высоте scroll бросает исключение).
            val fieldPlaceable = fieldMeasurable.measure(
                Constraints(minWidth = width, maxWidth = width, minHeight = textHeight, maxHeight = textHeight),
            )
            val total = (topOffset + regionHeight).coerceIn(constraints.minHeight, boundedMaxHeight)
            layout(width, total) {
                contentPlaceable?.placeRelative(0, 0)
                fieldPlaceable.placeRelative(0, topOffset)
                val controlsTop = topOffset + textHeight
                startPlaceable?.placeRelative(0, controlsTop + (controlsHeight - startPlaceable.height) / 2)
                val sendX = width - (sendPlaceable?.width ?: 0)
                sendPlaceable?.placeRelative(sendX, controlsTop + (controlsHeight - sendPlaceable.height) / 2)
                val endX = sendX - (endPlaceable?.width ?: 0)
                endPlaceable?.placeRelative(endX, controlsTop + (controlsHeight - endPlaceable.height) / 2)
            }
        } else {
            val fieldWidth = (width - controlsWidth).coerceAtLeast(0)
            val fieldPlaceable = fieldMeasurable.measure(
                Constraints(
                    minWidth = fieldWidth,
                    maxWidth = fieldWidth,
                    minHeight = 0,
                    maxHeight = Constraints.Infinity,
                ),
            )
            val rowHeight = maxOf(
                fieldPlaceable.height,
                startPlaceable?.height ?: 0,
                endPlaceable?.height ?: 0,
                sendPlaceable?.height ?: 0,
            )
            val total = (topOffset + rowHeight).coerceIn(constraints.minHeight, boundedMaxHeight)
            layout(width, total) {
                contentPlaceable?.placeRelative(0, 0)
                var x = 0
                startPlaceable?.let {
                    it.placeRelative(x, topOffset + (rowHeight - it.height) / 2)
                    x += it.width
                }
                fieldPlaceable.placeRelative(x, topOffset + (rowHeight - fieldPlaceable.height) / 2)
                x += fieldPlaceable.width
                endPlaceable?.let {
                    it.placeRelative(x, topOffset + (rowHeight - it.height) / 2)
                    x += it.width
                }
                sendPlaceable?.let {
                    it.placeRelative(x, topOffset + (rowHeight - it.height) / 2)
                    x += it.width
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "AiInput — Condensed, empty")
@Composable
private fun AiInputPreviewCondensedEmpty() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    AiInput(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier.fillMaxWidth(),
        placeholder = { BasicText("Введите сообщение") },
        startControls = { BasicText("◀") },
        sendButton = { BasicText("▶") },
    )
}

@Preview(showBackground = true, name = "AiInput — Condensed, multiline")
@Composable
private fun AiInputPreviewCondensedMultiline() {
    var text by remember {
        mutableStateOf(TextFieldValue("Text"))
    }
    AiInput(
        value = text,
        onValueChange = { text = it },
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        placeholder = { BasicText("Введите сообщение") },
        content = {
            File(label = "label1")
            File(label = "label2")
            File(label = "label3")
        },
        startControls = { BasicText("◀") },
        sendButton = { BasicText("▶") },
    )
}

@Preview(showBackground = true, name = "AiInput — Extended")
@Composable
private fun AiInputPreviewExtended() {
    var text by remember {
        mutableStateOf(
            TextFieldValue(
                "Первая строка текста\nВторая строка текста\nТретья строка текста\nЧетвёртая строка\nПятая строка",
            ),
        )
    }
    AiInput(
        value = text,
        onValueChange = { text = it },
        hasScrollBar = true,
        modifier = Modifier
            .height(100.dp)
            .fillMaxWidth(),
        style = AiInputStyle.builder().mode(AiInputMode.Extended).style(),
        placeholder = { BasicText("Введите сообщение") },
        startControls = { BasicText("◀") },
        content = {
            File(label = "label1")
            File(label = "label2")
            File(label = "label3")
        },
        endControls = { BasicText("⊕") },
        sendButton = { BasicText("▶") },
    )
}
