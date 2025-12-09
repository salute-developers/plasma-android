---
title: File
---
Компонент для отображения загруженных файлов.

В качестве `progress` ожидает [CircularProgressBar](CircularProgressBarUsage.md) для варианта с внутренним расположением прогресса 
и [ProgressBar](ProgressBarUsage.md) для варианта с нижним расположением прогресса (см. [FileProgressPlacement](#fileactionplacement)). Либо произвольный контент.

В качестве `action` ожидает [IconButton](ButtonUsage.md) либо произвольный контент.

В качестве `image` ожидает иконку / изображение / произвольный контент.

### Пример со встроенным круглым прогрессом
```kotlin
File(
    style = FileCircularProgress.M.Default.style(),
    label = "image.png",
    description = "226 КБ",
    isLoading = true,
    image = {
        Icon(
            painterResource(R.drawable.ic_file_check_fill_36),
            contentDescription = ""
        )
    },
    progress = {
        CircularProgressBar(
            progress = 0.4f,
            valueContent = {
                Icon(
                    modifier = Modifier.size(12.dp),
                    painter = painterResource(id = com.sdds.icons.R.drawable.ic_close_16),
                    contentDescription = ""
                )
            }
        )
    },
    action = {
        IconButton(
            iconRes = com.sdds.icons.R.drawable.ic_close_36,
            onClick = {},
        )
    },
)
```

### Пример с внешним линейным прогрессом снизу
```kotlin
File(
    style = FileLinearProgress.M.Default.style(),
    label = "image.png",
    description = "226 КБ",
    isLoading = true,
    image = {
        Icon(
            painterResource(R.drawable.ic_file_check_fill_36),
            contentDescription = ""
        )
    },
    progress = {
        ProgressBar(progress = 0.4f)
    },
    action = {
        IconButton(
            iconRes = com.sdds.icons.R.drawable.ic_close_36,
            onClick = {},
        )
    },
)
```

## Стиль File

Стиль File можно настроить с помощью FileStyle.builder(). Так же существует набор сгенерированных стилей.

### Создание стиля с помощью builder()

```kotlin
FileStyle.builder()
    .colors {
        iconColor(Color.Cyan)
        descriptionColor(Color.Gray)
        labelColor(Color.Black)
    }
    .dimensions {
        descriptionPadding(2.dp)
        startContentPadding(12.dp)
        endContentPadding(12.dp)
        bottomContentPadding(12.dp)
    }
    .labelStyle(SddsServTheme.typography.bodyMNormal)
    .descriptionStyle(SddsServTheme.typography.bodySNormal)
    .actionButtonStyle(IconButton.Xs.Clear.style())
    .circularProgressBarStyle(CircularProgressBar.Xs.Default.style())
    .style()
```

## FileActionPlacement

Расположение `action` и встроенного `progress`. Возможные значения: Start, End.

## FileProgressPlacement

Расположение `progress`. Возможные значения: Inline (прогресс встроен слева или справа от `label` и `description`), Outer (прогресс расположен снизу).