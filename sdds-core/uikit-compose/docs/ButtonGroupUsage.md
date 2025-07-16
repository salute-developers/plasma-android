# Package com.sdds.compose.uikit

## ButtonGroup

Группа кнопок.

В качестве контента ожидает [Button](ButtonUsage) либо [IconButton](ButtonUsage). Кнопки стилизуются автоматически.

### Группа кнопок BasicButton
```kotlin
ButtonGroup(
    style = BasicButtonGroup.M.NoGap.Segmented.style(),
    orientation = ButtonGroupOrientation.Horizontal,
) {
    button { Button(label = "label", onClick = {...}) }
    button { Button(label = "label", onClick = {...}) }
    button { Button(label = "label", onClick = {...}) }
}
```

### Группа кнопок IconButton
```kotlin
ButtonGroup(
    style = IconButtonGroup.M.Dense.Segmented.style(),
    orientation = ButtonGroupOrientation.Horizontal,
) {
    button { IconButton(icon = painterResource(R.drawable.ic_plasma_24), onClick = {...}) }
    button { IconButton(icon = painterResource(R.drawable.ic_plasma_24), onClick = {...}) }
    button { IconButton(icon = painterResource(R.drawable.ic_plasma_24), onClick = {...}) }
}
```

## Стиль ButtonGroup

Стиль ButtonGroup можно настроить с помощью ButtonGroupStyle.builder(). 
Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder() для базовой кнопки BasicButton

```kotlin
ButtonGroupStyle.builder()
    .externalShape(CircleShape)
    .internalShape(RoundedCornerShape(5))
    .buttonStyle(BasicButton.M.Default.style())
    .dimensions {
        spacing(2.dp)
    }
    .style()
```

### Создание стиля с помощью builder() для кнопки с иконкой IconButton

```kotlin
ButtonGroupStyle.builder()
    .externalShape(CircleShape)
    .internalShape(RoundedCornerShape(5))
    .buttonStyle(IconButton.M.Default.style())
    .dimensions {
        spacing(2.dp)
    }
    .style()
```

## ButtonGroupOrientation

Способ расположения кнопок: по вертикали либо по горизонтали. Возможные значения: Horizontal, Vertical
