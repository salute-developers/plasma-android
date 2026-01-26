---
title: FloatingButtonBar
---
Группа кнопок [ButtonGroup](../../../../../build-system/docs-template/compose-template/docs/components/ButtonGroupUsage.md), расположенная в компоненте [Overlay](../../../../../build-system/docs-template/compose-template/docs/components/OverlayUsage.md).

### Пример создания FloatingButtonBar на основе группы кнопок BasicButton

```kotlin
Overlay(
    style = Overlay.Default.style(),
) {
    ButtonGroup(
        modifier = Modifier.padding(vertical = 16.dp, horizontal = 20.dp),
        style = BasicButtonGroup.M.Wide.Default.style(),
        orientation = ButtonGroupOrientation.Vertical,
    ) {
        button { Button(label = "Label", onClick = {}) }
        button { Button(label = "Label", onClick = {}) }
    }
}
```

Поскольку FloatingButtonBar основан на компоненте [Overlay](../../../../../build-system/docs-template/compose-template/docs/components/OverlayUsage.md), для выравнивания контента  
внутри overlay, используйте стандартные Modifier для Box.