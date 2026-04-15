---
title: Анимация изменения состояний компонентов
---

`Motion API` позволяет описывать поведение значений компонента при смене его состояний (`pressed`, `focused`, `disabled`, `selected` и других) единообразно и декларативно. API отделяет:

- источник состояний компонента;
- описание правил анимации;
- чтение итогового значения в composable-коде.

Это удобно, когда у компонента есть несколько параметров, которые должны реагировать на одно и то же изменение состояния по-разному: например, цвет анимируется через `tween`, размер меняется мгновенно, а сложная кисть синхронизируется с внешним прогрессом.

## Основные сущности

### `MotionStyle`

`MotionStyle` - это набор motion-свойств компонента. Обычно он хранит несколько `MotionProperty` и используется как часть публичного стиля компонента.

Пример:

```kotlin
interface ButtonMotionStyle : MotionStyle {
    val containerColor: MotionProperty<Color>
    val contentColor: MotionProperty<Color>
    val elevation: MotionProperty<Dp>
}
```

### `MotionProperty`

`MotionProperty<T>` описывает, как должно меняться конкретное значение типа `T`.

Есть три основных варианта:

- `transition(...)` - анимация запускается самим Motion API при смене `ValueStateSet`;
- `interpolation(...)` - значение вычисляется по внешнему `fraction`, который приходит из канала интерполяции;
- `noMotion()` или `MotionProperty.default()` - анимация не используется, сразу берётся целевое значение.

### `MotionContext`

`MotionContext` хранит всё, что нужно для вычисления анимации:

- `interactionSource`, из которого собираются интерактивные состояния;
- `stateSnapshotProvider`, который возвращает переход между предыдущим и текущим состоянием;
- `transitionChannel` для transition-анимаций;
- набор `interpolationChannels` для interpolation-свойств.

Обычно контекст создаётся через `rememberMotionContext()`.

### `Motion`

`Motion<S>` объединяет `MotionStyle` и `MotionContext`. Это удобная точка входа, если компоненту нужно передавать стиль и контекст вместе.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_Remember.kt
```

## Как работает Motion API

Общий поток выглядит так:

1. Компонент создаёт `MotionContext`.
2. `MotionContext` отслеживает изменение состояний и формирует `MotionStateSnapshot`.
3. `MotionProperty` выбирает подходящий сегмент по условиям.
4. Для `transition` используется `FiniteAnimationSpec`.
5. Для `interpolation` берётся `fraction` из зарегистрированного канала.
6. `StatefulValue<T>.get*AsState(...)` возвращает итоговое `State<T>`, которое можно напрямую применять в UI.

## Создание `MotionContext`

Базовый сценарий:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_Context.kt
```

Такой контекст уже умеет:

- отслеживать `pressed`, `hovered`, `focused`, `activated`, `selected`;
- строить `Transition<ValueStateSet>` для переходов между состояниями;
- предоставлять снимок состояний всем motion-свойствам.

Если требуется interpolation-канал или дополнительные состояния, их можно зарегистрировать в `builder`.

Пример регистрации канала интерполяции:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_InterpolationChannel.kt
```

## Transition-свойства

`transition(...)` подходит для стандартных анимаций между значениями `StatefulValue`, когда запуск анимации должен происходить автоматически при смене состояния компонента.

Пример:
```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_TransitionProp.kt
```

Что здесь происходит:

- для нажатия и отпускания описаны разные сегменты;
- сегмент выбирается по `MotionStateSnapshot`;
- если ни один сегмент не подошёл, используется значение по умолчанию с `snap()`.

### Когда использовать `transition`

Используйте `transition`, когда:

- анимация должна стартовать автоматически от изменения состояния;
- достаточно `FiniteAnimationSpec<T>`;
- значение можно анимировать стандартным способом через `animateValue`.

Типичные случаи:

- цвета;
- размеры;
- смещения;
- прямоугольники;
- `Brush`, если нужен переход между состояниями без внешнего прогресса.

## Interpolation-свойства

`interpolation(...)` подходит для случаев, когда прогресс анимации задаётся извне. Motion API не управляет временем сам, а только вычисляет промежуточное значение между двумя состояниями.

Пример:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_InterpolationProp.kt
```

В этом случае:

- сегмент выбирается по состоянию;
- канал по ключу `ThumbProgressKey` поставляет `fraction`;
- `MotionEvaluator` вычисляет промежуточное значение.

### Когда использовать `interpolation`

Используйте `interpolation`, когда:

- несколько значений должны синхронно меняться по одному и тому же внешнему прогрессу;
- прогресс уже существует вне Motion API;
- нужно отдельно управлять направлением интерполяции через `InterpolationVector`.

## Сегменты и условия

Каждое motion-свойство может содержать несколько сегментов. Сегмент связывает:

- условие `condition { ... }`;
- спецификацию вычисления значения.

Условие получает `MotionStateSnapshot`, в котором доступны:

- `initial` - предыдущее состояние;
- `target` - текущее состояние.

В DSL доступны удобные проверки, например:

- `snapshot changes InteractiveState.Selected` - в снимке состояния изменяется состояние selected (либо было selected, либо стало selected)
- `snapshot changesTo InteractiveState.Selected` - состояние стало selected
- `snapshot changesFrom InteractiveState.Selected` - состояние было selected
- `snapshot has InteractiveState.Selected` - состояние selected есть в снимке (либо было, либо стало, либо не изменилось) 
- `snapshot hasNo InteractiveState.Selected` - состояние selected отсутствует в сниме

## InterpolationVector

Для interpolation-сегмента можно изменить точки, между которыми будет считаться промежуточное значение. По умолчанию используется вектор `initial -> target`.

Если нужно подправить направление, можно задать `vector(...)`.

Пример:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_InterpolationVector.kt
```

Это полезно, когда итоговое значение нужно интерполировать не строго между фактическими `initial` и `target`, а между их скорректированными версиями.

## MotionEvaluator

`MotionEvaluator<T>` отвечает только за вычисление промежуточного значения.

Готовые evaluators:

- `colorEvaluator()`
- `dpEvaluator()`
- `rectEvaluator()`
- `sizeEvaluator()`
- `intSizeEvaluator()`
- `offsetEvaluator()`
- `dpOffsetEvaluator()`
- `genericBrushEvaluator()`

Если встроенного evaluator недостаточно, можно передать свой:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_InterpolationEvaluator.kt
```

## Чтение значений через `get*AsState`

После того как `MotionContext` и `MotionProperty` созданы, компонент получает итоговое значение через extension-функции для `StatefulValue`.

Доступны функции:

- `getColorAsState`
- `getBrushAsState`
- `getDpAsState`
- `getFloatAsState`
- `getIntAsState`
- `getOffsetAsState`
- `getIntOffsetAsState`
- `getSizeAsState`
- `getIntSizeAsState`
- `getRectAsState`

Пример:

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/motion/Motion_ValueAsState.kt
```

Здесь:

- `StatefulValue<T>` хранит значения для разных состояний;
- `motionProperty` описывает, как между ними переходить;
- `context` поставляет текущее состояние и каналы.

## Рекомендации по использованию

- Храните motion-правила в style-слое, а не внутри composable-логики.
- Используйте `transition` для обычных state-to-state анимаций.
- Используйте `interpolation`, если нужен общий внешний `fraction` для нескольких свойств.
- Давайте `label` важным свойствам и контекстам, чтобы упростить отладку.
- Группируйте связанные свойства в один `MotionStyle`, чтобы компоненту было проще применять их согласованно.
- Если анимация не нужна, явно используйте `noMotion()` или `MotionProperty.default()`.

## Когда Motion API особенно полезен

API лучше всего подходит для компонентов, у которых:

- есть несколько визуальных параметров, зависящих от состояния;
- поведение отличается для разных переходов, например `pressed -> default` и `default -> pressed`;
- часть значений анимируется внутренним `Transition`, а часть должна синхронизироваться с внешним прогрессом.

В итоге Motion API помогает хранить правила анимации рядом со стилем компонента, а код самого компонента оставляет сфокусированным на чтении готовых значений и отображении UI.
