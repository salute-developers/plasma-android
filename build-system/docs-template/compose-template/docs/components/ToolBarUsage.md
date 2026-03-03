---
title: ToolBar
---

Вспомогательная панель с набором инструментов для работы на основном экране. Позволяет размещать  
набор элементов (секций) горизонтально или вертикально с разделителями [Divider](./DividerUsage.md).
Отображение разделителей для секций настраивается с помощью параметра hasDivider.

### Простой пример использования ToolBar

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/toolbar/ToolBar_Simple.kt
```

<!-- @screenshot: com.sdds.compose.uikit.fixtures.samples.ToolBar.ToolBar_Simple -->

Контент ToolBar задается через ToolBarScope. Scope предоставляет функцию для добавления 
`fun section(content: @Composable () -> Unit)`. Каждый вызов `section {some composable content}`  
добавляет одну секцию в ToolBar, если количество секций больше 1, автоматически добавляются разделители (Divider).  
Порядок отображения секций полностью соответствует порядку вызовов `section {some composable content}`.  
Если требуется оставить пустое место, нужно задать необходимое количество пустых секций `section {}`. При  
этом пустая секция занимает свое место в ToolBar, участвует в расстановке Divider. Расположение секций задается  
параметром orientation, ожидает значение ToolBarOrientation. Horizontal - секции располагаются в Row,  
Vertical - секции располагаются в Column.

## Стиль ToolBar

Для ToolBar существует набор сгенерированных стилей. Также стиль можно настроить с помощью ToolBarStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/toolbar/ToolBar_Style.kt
```
