---
title: AiAnswer
---

Компонент AiAnswer используется для отображения ответа ассистента в ИИ-сценариях.
Он поддерживает три семантических состояния: `Default`, `Loading` и `Error`.

AiAnswer не разбирает разметку, форматированный текст, потоковые фрагменты и ссылки на источники, а также не владеет моделями ответа, действий или подсказок.
Нужная отрисовка передаётся в `content`, действия - в `actionsStart` и `actionsEnd`, подсказки - в `suggestions`.

## Обычное состояние

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/answer/AiAnswer_Default.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.answer.AiAnswer_Default -->

## Загрузка

Слот загрузки может полностью заменить стандартную отрисовку или вызвать вспомогательную функцию `AiAnswerLoading`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/answer/AiAnswer_LoadingCustom.kt
```

## Ошибка

Слот ошибки может полностью заменить стандартную отрисовку или вызвать вспомогательную функцию `AiAnswerError`.

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/answer/AiAnswer_ErrorCustom.kt
```

## Стиль AiAnswer

В большинстве случаев можно использовать готовые сгенерированные стили, а при необходимости создать собственный стиль через метод `builder()`. Подробнее о том, как работают `Style`, `StyleBuilder` и параметры стиля с состояниями, см. в разделе [Стилизация компонентов](../theme/Styles.md).

<!-- @style-api -->

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/answer/AiAnswer_Style.kt
```

## Слоты

- `title` и `content` - обычные необязательные composable-слоты.
- `actionsStart` и `actionsEnd` - слоты с областью видимости `ButtonGroupScope`, каждый отрисовывается в отдельном ButtonGroup.
- `suggestions` - слот с областью видимости `FlowRowScope`, отрисовывается внутри ChipGroup.
- `loading` и `error` - слоты с областью видимости и доступом к текущим `AiAnswerState`, `AiAnswerStyle` и `Motion<AiAnswerMotionStyle>`.
