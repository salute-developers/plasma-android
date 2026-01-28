---
title: TabBar
---

Компонент для навигации между разделами интерфейса.
В компоненте доступно отображение максимум 10 табов.
В качестве контента ожидает [TabItem](#tabitem) либо [IconTabItem](#icontabitem).

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabs/Tabs_Simple.kt
```

## TabsClip

Способ расположения табов. Возможные значения: 
- **None** - табы размещаются как есть. Непоместившиеся табы уйдут за границу контейнера.
- **ShowMore** - табы размещаются, пока есть место в контейнере. Если все табы не помещаются, отображается disclosure-кнопка, по нажатию которой открывается список с непоместившимися табами.
- **Scroll** - табы размещаются в скроллящемся контейнере

## TabsOrientation

Ориентация табов. Возможные значения:
- **Vertical** - табы размещаются вертикально
- **Horizontal** - табы размещаются горизонтально

## Стиль Tabs

Для Tabs существует набор сгенерированных стилей. Также стиль можно настроить с помощью TabsStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabs/Tabs_Style.kt
```

## TabItem

Элемент Tabs. При использовании в Tabs TabItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabs/TabItem_Style.kt
```

## IconTabItem

Элемент Tabs. При использовании в Tabs IconTabItem стилизуется автоматически. Также можно настроить стиль элемента с помощью TabItemStyle.builder().

### Создание стиля с помощью builder()

```kotlin
// @sample: com/sdds/compose/uikit/fixtures/samples/tabs/TabItemIcon_Style.kt
```
