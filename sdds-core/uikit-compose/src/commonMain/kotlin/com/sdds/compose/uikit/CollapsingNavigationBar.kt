package com.sdds.compose.uikit

import androidx.compose.animation.core.AnimationSpec
import androidx.compose.animation.core.DecayAnimationSpec
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.rememberSplineBasedDecay
import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.systemBars
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.Saver
import androidx.compose.runtime.saveable.listSaver
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import com.sdds.compose.uikit.CollapsingNavigationBarState.Companion.Saver
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.internal.navigationbar.BaseCollapsingNavBar
import com.sdds.compose.uikit.internal.navigationbar.EnterAlwaysScrollBehavior
import com.sdds.compose.uikit.internal.navigationbar.ExitUntilCollapsedScrollBehavior
import com.sdds.compose.uikit.internal.navigationbar.PinnedScrollBehavior

/**
 * Верхняя панель интерфейса, служащая для навигации и отображения ключевых действий
 * с возможностью раскрытия в зависимости от состояния скролла на экране.
 *
 * @param modifier модификатор
 * @param style стиль компонента [CollapsingNavigationBarStyle]
 * @param expandedTitle заголовок в состоянии expanded
 * @param expandedDescription описание в состоянии expanded
 * @param collapsedTitle заголовок в состоянии collapsed
 * @param collapsedDescription описание в состоянии collapsed
 * @param expandedTextAlign выравнивание текста в состоянии expanded
 * @param collapsedTextAlign выравнивание текста в состоянии collapsed
 * @param actionStart экшены в начале
 * @param actionEnd экшены в конце
 * @param backgroundContent контент фона [CollapsingNavigationBar].
 * Заполняет весь компонент в expanded состоянии, кроме области, занимаемой [content]
 * @param content контент [CollapsingNavigationBar]
 * @param collapsedTextAlign выранивание текста в состоянии collapsed
 * @param expandedTextAlign выранивание текста в состоянии expanded
 * @param windowInsets инсеты [CollapsingNavigationBar]
 * @param scrollBehavior поведение при скролле [NavigationBarScrollBehavior]
 * @param centerAlignmentStrategy режим центрирования текстового блока
 * @param interactionSource источник взаимодействий
 * @param onBackPressed обработчик кнопки назад,
 */
@Composable
@NonRestartableComposable
fun CollapsingNavigationBar(
    modifier: Modifier = Modifier,
    style: CollapsingNavigationBarStyle = LocalCollapsingNavigationBarStyle.current,
    expandedTitle: (@Composable () -> Unit)?,
    expandedDescription: (@Composable () -> Unit)? = null,
    expandedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Start,
    collapsedTitle: (@Composable () -> Unit)?,
    collapsedDescription: (@Composable () -> Unit)? = null,
    collapsedTextAlign: NavigationBarTextAlign = NavigationBarTextAlign.Center,
    actionStart: (@Composable RowScope.() -> Unit)? = null,
    actionEnd: (@Composable RowScope.() -> Unit)? = null,
    backgroundContent: (@Composable BoxScope.() -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
    windowInsets: WindowInsets = CollapsingNavigationBarDefaults.windowInsets,
    scrollBehavior: NavigationBarScrollBehavior? = null,
    centerAlignmentStrategy: NavBarCenterAlignmentStrategy = NavBarCenterAlignmentStrategy.Absolute,
    interactionSource: InteractionSource = remember { MutableInteractionSource() },
    onBackPressed: () -> Unit = {},
) {
    BaseCollapsingNavBar(
        modifier = modifier,
        style = style,
        expandedTitle = expandedTitle,
        collapsedTitle = collapsedTitle,
        expandedDescription = expandedDescription,
        collapsedDescription = collapsedDescription,
        backgroundContent = backgroundContent,
        actionStart = actionStart,
        actionEnd = actionEnd,
        windowInsets = windowInsets,
        scrollBehavior = scrollBehavior,
        interactionSource = interactionSource,
        collapsedTextAlign = collapsedTextAlign,
        expandedTextAlign = expandedTextAlign,
        content = content,
        centerAlignmentStrategy = centerAlignmentStrategy,
        onBackPressed = onBackPressed,
    )
}

/**
 * Состояния [CollapsingNavigationBar]
 */
enum class CollapsingNavigationBarStates : ValueState {
    Collapsed, Expanded
}

/**
 * Поведение [CollapsingNavigationBar] при скролле
 *
 * @see [CollapsingNavigationBarDefaults.pinnedScrollBehavior]
 * @see [CollapsingNavigationBarDefaults.enterAlwaysScrollBehavior]
 * @see [CollapsingNavigationBarDefaults.exitUntilCollapsedScrollBehavior]
 */
@Stable
interface NavigationBarScrollBehavior {

    /**
     * Состояние [CollapsingNavigationBar], которое прикреплено к этому поведению и читается во время скролла.
     */
    val state: CollapsingNavigationBarState

    /**
     * Закреплен ли [CollapsingNavigationBar]
     */
    val isPinned: Boolean

    /**
     * Необязательный параметр [AnimationSpec],
     * определяющий, как [CollapsingNavigationBar] фиксируется в полностью свернутом или
     * полностью развернутом состоянии при прокрутке с помощью перетаскивания в промежуточное положение.
     */
    val snapAnimationSpec: AnimationSpec<Float>?

    /**
     * Необязательный параметр [DecayAnimationSpec], определяющий способ перемещения [CollapsingNavigationBar],
     * когда пользователь перемещает саму панель приложения или содержимое под ней.
     */
    val flingAnimationSpec: DecayAnimationSpec<Float>?

    /**
     * Экземпляр [NestedScrollConnection], который следует прикрепить к [Modifier.nestedScroll] для отслеживания событий прокрутки.
     */
    val nestedScrollConnection: NestedScrollConnection
}

/**
 * Содержит дефолтные настройки [CollapsingNavigationBar]
 */
object CollapsingNavigationBarDefaults {

    /**
     * Дефолтные инсеты [CollapsingNavigationBar]
     */
    val windowInsets: WindowInsets
        @Composable
        get() = WindowInsets.systemBars
            .only(WindowInsetsSides.Horizontal + WindowInsetsSides.Top)

    /**
     * Возвращает закрепленный [NavigationBarScrollBehavior], который отслеживает коллбэки вложенной прокрутки и
     * соответствующим образом обновляет [CollapsingNavigationBarState.contentOffset].
     */
    @Composable
    fun pinnedScrollBehavior(
        state: CollapsingNavigationBarState = rememberCollapsingNavigationBarState(),
        canScroll: () -> Boolean = { true },
    ): NavigationBarScrollBehavior = PinnedScrollBehavior(state = state, canScroll = canScroll)

    /**
     * Возвращает [NavigationBarScrollBehavior]. Навигационная панель, настроенная с этим
     * [NavigationBarScrollBehavior], будет немедленно сворачиваться при прокрутке контента вверх и
     * немедленно появляться при прокрутке контента вниз.
     *
     * @param state объект состояния, используемый для управления или наблюдения за состоянием прокрутки
     * навигационной панели. Смотрите [rememberCollapsingNavigationBarState] для состояния,
     * которое запоминается между композициями.
     * @param canScroll callback, используемый для определения того, должны ли события прокрутки
     * обрабатываться этим [EnterAlwaysScrollBehavior]
     * @param snapAnimationSpec опциональный [AnimationSpec], который определяет, как навигационная панель
     * переходит в полностью свернутое или полностью развернутое состояние, когда флинг или перетаскивание
     * прокручивает ее в промежуточное положение
     * @param flingAnimationSpec опциональный [DecayAnimationSpec], который определяет, как выполняется флинг
     * навигационной панели, когда пользователь делает флинг самой панелью или контентом под ней
     */
    @Composable
    fun enterAlwaysScrollBehavior(
        state: CollapsingNavigationBarState = rememberCollapsingNavigationBarState(),
        canScroll: () -> Boolean = { true },
        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay(),
    ): NavigationBarScrollBehavior =
        EnterAlwaysScrollBehavior(
            state = state,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec,
            canScroll = canScroll,
        )

    /**
     * Возвращает [NavigationBarScrollBehavior], который настраивает свои свойства для влияния на цвета и
     * высоту навигационной панели.
     *
     * Навигационная панель, настроенная с этим [NavigationBarScrollBehavior], будет немедленно сворачиваться
     * при прокрутке вложенного контента вверх и будет разворачивать свернутую область обратно, когда
     * контент прокручивается полностью вниз.
     *
     * @param state объект состояния, используемый для управления или наблюдения за состоянием прокрутки
     * навигационной панели. Смотрите [rememberCollapsingNavigationBarState] для состояния,
     * которое запоминается между композициями.
     * @param canScroll callback, используемый для определения того, должны ли события прокрутки
     * обрабатываться этим [ExitUntilCollapsedScrollBehavior]
     * @param snapAnimationSpec опциональный [AnimationSpec], который определяет, как навигационная панель
     * переходит в полностью свернутое или полностью развернутое состояние, когда флинг или перетаскивание
     * прокручивает ее в промежуточное положение
     * @param flingAnimationSpec опциональный [DecayAnimationSpec], который определяет, как выполняется флинг
     * навигационной панели, когда пользователь делает флинг самой панелью или контентом под ней
     */
    @Composable
    fun exitUntilCollapsedScrollBehavior(
        state: CollapsingNavigationBarState = rememberCollapsingNavigationBarState(),
        canScroll: () -> Boolean = { true },
        snapAnimationSpec: AnimationSpec<Float>? = spring(stiffness = Spring.StiffnessMediumLow),
        flingAnimationSpec: DecayAnimationSpec<Float>? = rememberSplineBasedDecay(),
    ): NavigationBarScrollBehavior =
        ExitUntilCollapsedScrollBehavior(
            state = state,
            snapAnimationSpec = snapAnimationSpec,
            flingAnimationSpec = flingAnimationSpec,
            canScroll = canScroll,
        )
}

/**
 * Создает [CollapsingNavigationBarState], который запоминается между композициями.
 *
 * @param initialHeightOffsetLimit начальное значение для [CollapsingNavigationBarState.heightOffsetLimit],
 * которое представляет лимит в пикселях, до которого навигационная панель может сворачиваться при
 * прокрутке скроллируемого контента
 * @param initialHeightOffset начальное значение для [CollapsingNavigationBarState.heightOffset].
 * Начальное смещение высоты должно быть между нулем и [initialHeightOffsetLimit].
 * @param initialContentOffset начальное значение для [CollapsingNavigationBarState.contentOffset]
 */
@Composable
fun rememberCollapsingNavigationBarState(
    initialHeightOffsetLimit: Float = -Float.MAX_VALUE,
    initialHeightOffset: Float = 0f,
    initialContentOffset: Float = 0f,
): CollapsingNavigationBarState {
    return rememberSaveable(saver = Saver) {
        CollapsingNavigationBarState(
            initialHeightOffsetLimit,
            initialHeightOffset,
            initialContentOffset,
        )
    }
}

/**
 * Объект состояния, который может быть поднят для управления и наблюдения за состоянием навигационной панели.
 * Состояние считывается и обновляется реализацией [NavigationBarScrollBehavior].
 *
 * В большинстве случаев это состояние будет создано через [rememberCollapsingNavigationBarState].
 *
 * @param initialHeightOffsetLimit начальное значение для [CollapsingNavigationBarState.heightOffsetLimit]
 * @param initialHeightOffset начальное значение для [CollapsingNavigationBarState.heightOffset]
 * @param initialContentOffset начальное значение для [CollapsingNavigationBarState.contentOffset]
 */
@Stable
class CollapsingNavigationBarState(
    initialHeightOffsetLimit: Float,
    initialHeightOffset: Float,
    initialContentOffset: Float,
) {

    /**
     * Лимит смещения высоты навигационной панели в пикселях, который представляет предел,
     * до которого навигационная панель может сворачиваться.
     *
     * Используйте этот лимит для ограничения значения [heightOffset] при его обновлении.
     */
    var heightOffsetLimit by mutableFloatStateOf(initialHeightOffsetLimit)

    /**
     * Текущее смещение высоты навигационной панели в пикселях. Это смещение высоты применяется к фиксированной
     * высоте панели для управления отображаемой высотой при прокрутке контента.
     *
     * Обновления значения [heightOffset] ограничиваются между нулем и [heightOffsetLimit].
     */
    var heightOffset: Float
        get() = _heightOffset.floatValue
        set(newOffset) {
            _heightOffset.floatValue = newOffset.coerceIn(
                minimumValue = heightOffsetLimit,
                maximumValue = 0f,
            )
        }

    /**
     * Общее смещение контента, прокрученного под навигационной панелью.
     *
     * Смещение контента используется для вычисления [overlappedFraction], которое затем может быть
     * прочитано реализацией.
     *
     * Это значение обновляется [NavigationBarScrollBehavior] всякий раз, когда вложенное соединение
     * прокрутки потребляет события прокрутки. Типичная реализация будет обновлять значение как сумму всех
     * значений `consumed.y` из [NestedScrollConnection.onPostScroll].
     */
    var contentOffset by mutableFloatStateOf(initialContentOffset)

    /**
     * Значение, представляющее процент свернутой высоты навигационной панели.
     *
     * Значение `0.0` представляет полностью развернутую панель, а `1.0` представляет полностью свернутую панель
     * (вычисляется как [heightOffset] / [heightOffsetLimit]).
     */
    val collapsedFraction: Float
        get() = if (heightOffsetLimit != 0f) {
            heightOffset / heightOffsetLimit
        } else {
            0f
        }

    /**
     * Значение, представляющее процент площади навигационной панели, которая перекрывается с
     * контентом, прокрученным под ней.
     *
     * Значение `0.0` указывает, что панель не перекрывает никакой контент, а `1.0` указывает, что
     * вся видимая область панели перекрывает прокрученный контент.
     */
    val overlappedFraction: Float
        get() = if (heightOffsetLimit != 0f) {
            1 - (
                (heightOffsetLimit - contentOffset).coerceIn(
                    minimumValue = heightOffsetLimit,
                    maximumValue = 0f,
                ) / heightOffsetLimit
                )
        } else {
            0f
        }

    private var _heightOffset = mutableFloatStateOf(initialHeightOffset)

    companion object {
        /**
         * Стандартная реализация [Saver] для [CollapsingNavigationBarState].
         */
        val Saver: Saver<CollapsingNavigationBarState, *> = listSaver(
            save = { listOf(it.heightOffsetLimit, it.heightOffset, it.contentOffset) },
            restore = {
                CollapsingNavigationBarState(
                    initialHeightOffsetLimit = it[0],
                    initialHeightOffset = it[1],
                    initialContentOffset = it[2],
                )
            },
        )
    }
}
