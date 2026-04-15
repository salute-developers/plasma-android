package com.sdds.compose.uikit.motion

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.interaction.collectIsHoveredAsState
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import com.sdds.compose.uikit.interactions.InteractiveState
import com.sdds.compose.uikit.interactions.ValueState
import com.sdds.compose.uikit.interactions.ValueStateSet
import com.sdds.compose.uikit.interactions.collectIsActivatedAsState
import com.sdds.compose.uikit.interactions.collectIsSelectedAsState

/**
 * Контекст выполнения motion.
 *
 * Хранит каналы анимации, источник интеракций и провайдер снимка состояний, по которому
 * motion-свойства выбирают нужные сегменты.
 */
@Stable
interface MotionContext {
    /**
     * Метка контекста.
     */
    val label: String?

    /**
     * Провайдер transition-канала.
     */
    val transitionChannel: MotionChannelProvider<TransitionMotionChannel>

    /**
     * Набор зарегистрированных каналов интерполяции.
     */
    val interpolationChannels: Map<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>>

    /**
     * Провайдер текущего снимка состояний.
     */
    val stateSnapshotProvider: MotionStateSnapshotProvider

    /**
     * Источник интеракций, на основе которого вычисляются состояния компонента.
     */
    val interactionSource: MutableInteractionSource
}

/**
 * Провайдер канала для указанного снимка состояний.
 */
fun interface MotionChannelProvider<T : MotionChannel> {

    /**
     * Возвращает канал motion для указанного снимка состояний.
     * @param snapshot снимок состояний
     */
    @Composable
    fun provide(snapshot: MotionStateSnapshot): T
}

/**
 * Провайдер текущего снимка состояний компонента.
 */
fun interface MotionStateSnapshotProvider {

    /**
     * Возвращает текущий снимок состояний компонента.
     */
    @Composable
    fun provide(): MotionStateSnapshot
}

/**
 * Снимок перехода между состояниями компонента.
 *
 * [initial] соответствует предыдущему набору состояний, [target] - текущему.
 */
@Immutable
data class MotionStateSnapshot(
    /**
     * Предыдущий набор состояний.
     */
    val initial: ValueStateSet,
    /**
     * Текущий целевой набор состояний.
     */
    val target: ValueStateSet,
)

/**
 * Scope для конфигурации [MotionContext].
 */
interface MotionContextBuilderScope {
    /**
     * Регистрирует канал интерполяции по [channelKey].
     * @param channelKey ключ канала
     * @param channelProvider провайдер канала
     */
    fun interpolationChannel(
        channelKey: MotionChannelKey = DefaultInterpolationChannelKey,
        channelProvider: MotionChannelProvider<InterpolationMotionChannel>,
    )

    /**
     * Регистрирует дополнительный провайдер снимка состояний.
     *
     * Полезно, когда компоненту нужно учитывать не только интеракции из [interactionSource],
     * но и внешние логические/семантические состояния.
     *
     * @param stateSnapshotProvider провайдер снимка состояний
     */
    fun stateSnapshotProvider(
        stateSnapshotProvider: MotionStateSnapshotProvider,
    )
}

/**
 * Создаёт и запоминает [MotionContext].
 *
 * По умолчанию контекст:
 * - отслеживает состояния из [interactionSource];
 * - создаёт transition-канал для смены `ValueStateSet`;
 * - позволяет дополнительно зарегистрировать interpolation-каналы и внешние источники состояний.
 *
 * @param interactionSource источник интеракций компонента.
 * @param label метка для отладки.
 * @param builder дополнительная настройка каналов интерполяции и снимков состояний.
 */
@Composable
fun rememberMotionContext(
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    label: String? = null,
    builder: MotionContextBuilderScope.() -> Unit = {},
): MotionContext {
    val stateSnapshot = getStateSnapshot(interactionSource, label = label)
    return remember(interactionSource) {
        MotionContextBuilder(interactionSource, label) { state -> updateTransitionChannel(state.target, label) }
            .apply { builder() }
            .build(stateSnapshot)
    }
}

@Immutable
private class SimpleMotionContext(
    override val interpolationChannels: Map<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>>,
    override val transitionChannel: MotionChannelProvider<TransitionMotionChannel>,
    override val interactionSource: MutableInteractionSource,
    private val stateSnapshot: State<MotionStateSnapshot>,
    private val extraSnapshotProviders: Set<MotionStateSnapshotProvider>,
    override val label: String?,
) : MotionContext {
    override val stateSnapshotProvider: MotionStateSnapshotProvider = MotionStateSnapshotProvider {
        extraSnapshotProviders
            .map { it.provide() }
            .fold(stateSnapshot.value) { acc, snapshot ->
                acc.merge(snapshot)
            }
    }
}

private class MotionContextBuilder(
    private val interactionSource: MutableInteractionSource,
    private val label: String?,
    private val transitionChannel: MotionChannelProvider<TransitionMotionChannel>,
) : MotionContextBuilderScope {

    private val channels: MutableMap<MotionChannelKey, MotionChannelProvider<InterpolationMotionChannel>> =
        mutableMapOf()
    private var stateSnapshotProviders = mutableSetOf<MotionStateSnapshotProvider>()

    override fun interpolationChannel(
        channelKey: MotionChannelKey,
        channelProvider: MotionChannelProvider<InterpolationMotionChannel>,
    ) {
        channels[channelKey] = channelProvider
    }

    override fun stateSnapshotProvider(
        stateSnapshotProvider: MotionStateSnapshotProvider,
    ) {
        this.stateSnapshotProviders.add(stateSnapshotProvider)
    }

    fun build(stateSnapshot: State<MotionStateSnapshot>): MotionContext {
        return SimpleMotionContext(
            transitionChannel = transitionChannel,
            interpolationChannels = channels,
            interactionSource = interactionSource,
            stateSnapshot = stateSnapshot,
            extraSnapshotProviders = stateSnapshotProviders,
            label = label,
        )
    }
}

private class SnapshotStateHolder(var state: ValueStateSet)

@Composable
private fun getStateSnapshot(
    interactionSource: InteractionSource,
    stateSet: Set<ValueState> = emptySet(),
    label: String?,
): State<MotionStateSnapshot> {
    val isPressed by interactionSource.collectIsPressedAsState()
    val isHovered by interactionSource.collectIsHoveredAsState()
    val isFocused by interactionSource.collectIsFocusedAsState()
    val isActivated by interactionSource.collectIsActivatedAsState()
    val isSelected by interactionSource.collectIsSelectedAsState()
    val interactiveStateSet = remember(
        isPressed,
        isFocused,
        isHovered,
        isActivated,
        isSelected,
    ) {
        HashSet<InteractiveState>().apply {
            if (isPressed) add(InteractiveState.Pressed)
            if (isFocused) add(InteractiveState.Focused)
            if (isHovered) add(InteractiveState.Hovered)
            if (isActivated) add(InteractiveState.Activated)
            if (isSelected) add(InteractiveState.Selected)
        }
    }
    val combinedStateSet = remember(interactiveStateSet, stateSet) { interactiveStateSet + stateSet }
    val previousState = remember { SnapshotStateHolder(combinedStateSet) }
    val snapshot = remember {
        mutableStateOf(
            MotionStateSnapshot(
                initial = previousState.state,
                target = combinedStateSet,
            ),
        )
    }
    SideEffect {
        if (previousState.state != combinedStateSet) {
            snapshot.value = MotionStateSnapshot(
                initial = previousState.state,
                target = combinedStateSet,
            )
            previousState.state = combinedStateSet
        }
    }
    return snapshot
}

private fun MotionStateSnapshot.merge(other: MotionStateSnapshot): MotionStateSnapshot {
    return MotionStateSnapshot(
        initial = initial + other.initial,
        target = target + other.target,
    )
}
