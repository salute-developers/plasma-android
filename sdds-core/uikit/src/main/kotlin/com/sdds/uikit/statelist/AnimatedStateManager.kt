package com.sdds.uikit.statelist

import android.animation.TypeEvaluator
import android.animation.ValueAnimator
import android.util.Log

/**
 * Интерфейс, предоставляющий доступ к менеджеру состояний анимации.
 *
 * Используется для компонентов, которые могут управлять анимированными состояниями
 * и нуждаются в доступе к [StateManager] для отслеживания изменений состояний.
 */
interface AnimatedStateManagerHolder {

    /**
     * Менеджер состояний, отвечающий за отслеживание и управление
     * текущим и предыдущим состояниями анимации.
     */
    val manager: StateManager
}

/**
 * Снимок состояния анимации, содержащий начальное и целевое состояния.
 *
 * Используется для захвата пары состояний (предыдущего и текущего) в конкретный момент времени,
 * что позволяет анимировать переход между ними.
 *
 * @property initial Начальное состояние в виде массива целых чисел (предыдущее состояние)
 * @property target Целевое состояние в виде массива целых чисел (текущее состояние)
 */
data class StateSnapshot(
    val initial: IntArray,
    val target: IntArray,
) {
    /**
     * Сравнивает текущий объект с другим объектом на равенство.
     *
     * Два снимка состояния считаются равными, если их начальные и целевые массивы
     * содержат одинаковые элементы в одинаковом порядке.
     *
     * @param other Объект для сравнения
     * @return `true`, если объекты равны, иначе `false`
     */
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as StateSnapshot

        if (!initial.contentEquals(other.initial)) return false
        if (!target.contentEquals(other.target)) return false

        return true
    }

    /**
     * Вычисляет хэш-код на основе содержимого массивов [initial] и [target].
     *
     * @return Хэш-код объекта
     */
    override fun hashCode(): Int {
        var result = initial.contentHashCode()
        result = 31 * result + target.contentHashCode()
        return result
    }
}

/**
 * Создает и запускает анимацию для значения произвольного типа.
 *
 * Функция создает [ValueAnimator] с указанными начальным и целевым значениями,
 * использует переданный оценщик для интерполяции значений во время анимации,
 * и вызывает колбэк [onValue] на каждом кадре анимации с текущим значением.
 *
 * @param T Тип анимируемого значения
 * @param initial Начальное значение анимации
 * @param target Целевое значение анимации
 * @param evaluator Оценщик, определяющий, как интерполировать значения между [initial] и [target]
 * @param config Конфигурация анимации, содержащая длительность и интерполятор
 * @param onValue Колбэк, вызываемый на каждом кадре анимации с текущим значением
 */
fun <T> animateValue(
    initial: T,
    target: T,
    evaluator: TypeEvaluator<T>,
    config: AnimationConfig,
    onValue: (T) -> Unit,
) {
    ValueAnimator.ofObject(
        evaluator,
        initial,
        target,
    )
        .apply {
            duration = config.duration
            interpolator = config.interpolator
            addUpdateListener {
                Log.e("Animation", "animateValue: onUpdate ${it.animatedValue}")
                @Suppress("UNCHECKED_CAST")
                onValue(it.animatedValue as T)
            }
            start()
        }
}

/**
 * Анимирует переход между состояниями для [ValueStateList].
 *
 * Расширение для [ValueStateList], которое автоматически извлекает начальное и целевое значения
 * из переданного снимка состояния и запускает анимацию между ними.
 *
 * @param T Тип анимируемого значения
 * @param stateSnapshot Снимок состояния, содержащий начальное и целевое состояния
 * @param evaluator Оценщик, определяющий, как интерполировать значения
 * @param config Конфигурация анимации
 * @param defaultValue Значение по умолчанию, используемое, если для указанного состояния не найдено значение
 * @param onValue Колбэк, вызываемый на каждом кадре анимации с текущим значением
 */
fun <T> ValueStateList<T>.animateValue(
    stateSnapshot: StateSnapshot,
    evaluator: TypeEvaluator<T>,
    config: AnimationConfig,
    defaultValue: T? = null,
    onValue: (T) -> Unit,
) {
    animateValue(
        initial = getValueForState(stateSnapshot.initial, defaultValue),
        target = getValueForState(stateSnapshot.target, defaultValue),
        evaluator = evaluator,
        config = config,
        onValue = onValue,
    )
}

/**
 * Менеджер состояний для отслеживания изменений состояний анимации.
 *
 * Хранит текущее и предыдущее состояния,
 * позволяя отслеживать изменения и получать снимок состояния для анимации переходов.
 *
 * @property stateSnapshot Снимок текущего состояния, содержащий предыдущее и текущее состояния
 */
class StateManager {

    /**
     * Возвращает снимок текущего состояния, содержащий предыдущее и текущее состояния.
     */
    val stateSnapshot: StateSnapshot
        get() = StateSnapshot(prevState, currentState)

    private var prevState = intArrayOf()
    private var currentState = intArrayOf()

    /**
     * Обновляет текущее состояние, если оно отличается от переданного.
     *
     * При изменении состояния предыдущее состояние заменяется текущим,
     * а текущее обновляется новым значением.
     *
     * @param drawableState Новое состояние в виде массива целых чисел
     * @return `true`, если состояние было изменено, `false` - если новое состояние совпадает с текущим
     */
    fun update(drawableState: IntArray): Boolean {
        if (!currentState.contentEquals(drawableState)) {
            prevState = currentState
            currentState = drawableState
            return true
        }
        return false
    }
}
