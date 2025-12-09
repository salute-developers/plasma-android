## NavigationBar + Overlay

NavigationBar можно использовать вместе с Overlay в тех случаях, когда у NavigationBar нет фона и он может накладываться
на другие элементы интерфейса. При этом у компонента Overlay можно динамически менять прозрачность.
[Пример рассчета прозрачности в зависимости от скролла](./OverlayUsage.md#Пример_изменения_alpha_в_зависимости_от_скролла)

```kotlin
Overlay(
    style = Overlay.Default.style(),
    alpha = { 
        (scrollOffset / ScrollThresholdPx).coerceIn(0f, 1f)
    },
) {
    NavigationBar(
        style = NavigationBar.Default.style(),
    )
}
```