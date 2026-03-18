package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.spring
import androidx.compose.foundation.OverscrollEffect
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.TargetedFlingBehavior
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.PagerDefaults
import androidx.compose.foundation.pager.PagerScope
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.rememberOverscrollEffect
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Компонент карусели с горизонтальной прокруткой, поддерживающий индикаторы страниц,
 * навигационные кнопки и различные варианты отображения.
 *
 * Карусель предоставляет удобный интерфейс для пролистывания контента с возможностью
 * кастомизации внешнего вида, поведения и навигации. Поддерживает как программное
 * управление через [PagerState], так и пользовательское взаимодействие.
 *
 * Пример использования:
 * ```
 * val state = rememberPagerState(pageCount = { items.size })
 *
 * Carousel(
 *     state = state,
 *     hasIndicator = true,
 *     hasControls = true
 * ) { page ->
 *     Card { Text(items[page]) }
 * }
 * ```
 *
 * @param state состояние карусели, управляющее текущей страницей и прокруткой.
 * Создается через [rememberPagerState] с указанием количества страниц.
 * @param modifier модификатор для настройки внешнего вида и поведения карусели.
 * @param style стиль карусели, определяющий внешний вид индикаторов, кнопок
 * и их расположение. По умолчанию берется из [LocalCarouselStyle].
 * @param contentPadding внутренние отступы контента карусели от её границ.
 * Позволяет создать эффект "отступов" по краям.
 * @param gap промежуток между соседними элементами карусели.
 * По умолчанию берется из стиля карусели.
 * @param pageSize размер страницы относительно видимой области.
 * Может быть [PageSize.Fill] (на всю ширину),
 * [PageSize.Fixed] (фиксированный размер)
 * @param snapPosition позиция привязки страницы после прокрутки.
 * Определяет, какая часть страницы будет привязана к началу/центру/концу.
 * @param hasIndicator флаг отображения индикатора страниц (точек внизу карусели).
 * @param hasControls флаг отображения навигационных кнопок "вперед/назад".
 * @param indicatorVisibleCount максимальное количество отображаемых точек-индикаторов.
 * При большем количестве страниц индикатор сворачивается.
 * @param beyondViewportPageCount количество страниц, загружаемых за пределами видимой области.
 * Влияет на производительность и плавность прокрутки.
 * @param verticalAlignment вертикальное выравнивание контента внутри карусели.
 * Полезно при разной высоте элементов.
 * @param flingBehavior поведение при "броске" прокрутки (быстром пролистывании).
 * По умолчанию используется стандартное поведение из [PagerDefaults.flingBehavior].
 * @param userScrollEnabled разрешает или запрещает прокрутку пользователем.
 * При false карусель можно листать только программно.
 * @param reverseLayout инвертирует направление прокрутки.
 * При true элементы располагаются справа налево.
 * @param key функция для генерации стабильных ключей страниц.
 * Помогает Compose правильно идентифицировать элементы при изменениях.
 * @param pageNestedScrollConnection обработка вложенной прокрутки.
 * По умолчанию обеспечивает корректную работу карусели внутри прокручиваемых контейнеров.
 * @param overscrollEffect эффект при достижении границ карусели.
 * По умолчанию [rememberOverscrollEffect] для визуальной обратной связи.
 * @param pageContent композируемая функция для отображения содержимого каждой страницы.
 * Вызывается с индексом страницы в качестве параметра.
 *
 * @see PagerState
 * @see CarouselStyle
 * @see PageSize
 * @see SnapPosition
 * @see TargetedFlingBehavior
 */
@Composable
@Suppress("LongMethod")
fun Carousel(
    state: PagerState,
    modifier: Modifier = Modifier,
    style: CarouselStyle = LocalCarouselStyle.current,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    gap: Dp = style.dimensions.gap,
    pageSize: PageSize = PageSize.Fill,
    snapPosition: SnapPosition = SnapPosition.Start,
    hasIndicator: Boolean = true,
    hasControls: Boolean = true,
    indicatorVisibleCount: Int = 5,
    beyondViewportPageCount: Int = PagerDefaults.BeyondViewportPageCount,
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    flingBehavior: TargetedFlingBehavior = PagerDefaults.flingBehavior(state = state),
    userScrollEnabled: Boolean = true,
    reverseLayout: Boolean = false,
    key: ((index: Int) -> Any)? = null,
    pageNestedScrollConnection: NestedScrollConnection =
        PagerDefaults.pageNestedScrollConnection(state, Orientation.Horizontal),
    overscrollEffect: OverscrollEffect? = rememberOverscrollEffect(),
    pageContent: @Composable PagerScope.(page: Int) -> Unit,
) {
    val coroutineScope = rememberCoroutineScope()
    val animationSpec: AnimationSpec<Float> = remember { spring() }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(style.dimensions.indicatorPadding),
    ) {
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OuterStartButton(
                style = style,
                hasControls = hasControls,
                state = state,
                coroutineScope = coroutineScope,
                animationSpec = animationSpec,
            )

            Box(modifier = Modifier.weight(1f)) {
                HorizontalPager(
                    state = state,
                    contentPadding = contentPadding,
                    pageSize = pageSize,
                    beyondViewportPageCount = beyondViewportPageCount,
                    pageSpacing = gap,
                    verticalAlignment = verticalAlignment,
                    flingBehavior = flingBehavior,
                    userScrollEnabled = userScrollEnabled,
                    reverseLayout = reverseLayout,
                    key = key,
                    pageNestedScrollConnection = pageNestedScrollConnection,
                    snapPosition = snapPosition,
                    overscrollEffect = overscrollEffect,

                ) {
                    pageContent(it)
                }
                InnerStartButton(
                    modifier = Modifier.align(Alignment.CenterStart),
                    style = style,
                    hasControls = hasControls,
                    state = state,
                    coroutineScope = coroutineScope,
                    animationSpec = animationSpec,
                )
                InnerEndButton(
                    modifier = Modifier.align(Alignment.CenterEnd),
                    style = style,
                    hasControls = hasControls,
                    state = state,
                    coroutineScope = coroutineScope,
                    animationSpec = animationSpec,
                )
            }

            OuterEndButton(
                style = style,
                hasControls = hasControls,
                state = state,
                coroutineScope = coroutineScope,
                animationSpec = animationSpec,
            )
        }

        if (hasIndicator) {
            PaginationDots(
                style = style.indicatorStyle,
                selectedIndex = state.currentPage,
                totalCount = state.pageCount,
                visibleCount = indicatorVisibleCount,
                scrollAnimationSpec = animationSpec,
            )
        }
    }
}

/**
 * Расположение кнопок прокрутки [Carousel]
 */
enum class CarouselButtonsPlacement {
    /**
     * Кнопки расположены внутри карусели
     */
    Inner,

    /**
     * Кнопки расположены снаружи карусели
     */
    Outer,
}

@Composable
private fun OuterStartButton(
    style: CarouselStyle,
    hasControls: Boolean,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    val buttonsPlacement = style.buttonsPlacement
    val prevIcon = style.prevButtonIcon
    if (buttonsPlacement == CarouselButtonsPlacement.Inner) return
    if (prevIcon == null || !hasControls) return
    val paddings = PaddingValues(end = style.dimensions.prevButtonPadding)

    Box(Modifier.size(style.nextButtonStyle.dimensions.height)) {
        if (state.currentPage != 0) {
            StartButton(
                paddings = paddings,
                iconRes = prevIcon,
                style = style,
                state = state,
                coroutineScope = coroutineScope,
                animationSpec = animationSpec,
                modifier = modifier,
            )
        }
    }
}

@Composable
private fun InnerStartButton(
    style: CarouselStyle,
    hasControls: Boolean,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    val buttonsPlacement = style.buttonsPlacement
    val prevIcon = style.prevButtonIcon
    if (buttonsPlacement == CarouselButtonsPlacement.Outer) return
    if (prevIcon == null || !hasControls || state.currentPage == 0) return
    val paddings = PaddingValues(start = style.dimensions.prevButtonPadding)

    StartButton(
        paddings = paddings,
        iconRes = prevIcon,
        style = style,
        state = state,
        coroutineScope = coroutineScope,
        animationSpec = animationSpec,
        modifier = modifier,
    )
}

@Composable
private fun StartButton(
    paddings: PaddingValues,
    iconRes: Int,
    style: CarouselStyle,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    ControlButton(
        modifier = modifier,
        paddings = paddings,
        buttonStyle = style.prevButtonStyle,
        iconRes = iconRes,
        scrollAction = {
            coroutineScope.launch {
                state.animateScrollToPage(state.currentPage - 1, animationSpec = animationSpec)
            }
        },
    )
}

@Composable
private fun OuterEndButton(
    style: CarouselStyle,
    hasControls: Boolean,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    val buttonsPlacement = style.buttonsPlacement
    val nextIcon = style.nextButtonIcon
    if (buttonsPlacement == CarouselButtonsPlacement.Inner) return
    if (nextIcon == null || !hasControls) return
    val paddings = PaddingValues(start = style.dimensions.nextButtonPadding)

    Box(Modifier.size(style.nextButtonStyle.dimensions.height)) {
        if (state.currentPage != state.pageCount - 1) {
            EndButton(
                paddings = paddings,
                iconRes = nextIcon,
                style = style,
                state = state,
                coroutineScope = coroutineScope,
                animationSpec = animationSpec,
                modifier = modifier,
            )
        }
    }
}

@Composable
private fun InnerEndButton(
    style: CarouselStyle,
    hasControls: Boolean,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    val buttonsPlacement = style.buttonsPlacement
    val nextIcon = style.nextButtonIcon
    if (buttonsPlacement == CarouselButtonsPlacement.Outer) return
    if (nextIcon == null || !hasControls || state.currentPage == state.pageCount - 1) return
    val paddings = PaddingValues(end = style.dimensions.nextButtonPadding)

    EndButton(
        paddings = paddings,
        iconRes = nextIcon,
        style = style,
        state = state,
        coroutineScope = coroutineScope,
        animationSpec = animationSpec,
        modifier = modifier,
    )
}

@Composable
private fun EndButton(
    paddings: PaddingValues,
    iconRes: Int,
    style: CarouselStyle,
    state: PagerState,
    coroutineScope: CoroutineScope,
    animationSpec: AnimationSpec<Float>,
    modifier: Modifier = Modifier,
) {
    ControlButton(
        modifier = modifier,
        paddings = paddings,
        buttonStyle = style.nextButtonStyle,
        iconRes = iconRes,
        scrollAction = {
            coroutineScope.launch {
                state.animateScrollToPage(state.currentPage + 1, animationSpec = animationSpec)
            }
        },
    )
}

@Composable
private fun ControlButton(
    modifier: Modifier,
    paddings: PaddingValues,
    buttonStyle: ButtonStyle,
    iconRes: Int,
    scrollAction: () -> Unit,
) {
    IconButton(
        modifier = modifier.padding(paddings),
        style = buttonStyle,
        iconRes = iconRes,
        onClick = scrollAction,
    )
}
