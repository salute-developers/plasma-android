## NavigationBar для корневой страницы или вложенной странницы

У NavigationBar есть 2 конфигурации для корневой и вложенной страницы, отличающиеся наличием кнопки назад.

### Пример NavigationBar для корневой страницы

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NavigationBar_MainPage.kt
```

### Пример NavigationBar для вложенной страницы

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NavigationBar_InternalPage.kt
```

## NavigationBar + Overlay

NavigationBar можно использовать вместе с Overlay в тех случаях, когда у NavigationBar нет фона и он может накладываться
на другие элементы интерфейса. При этом у компонента Overlay можно динамически менять прозрачность.
[Пример рассчета прозрачности в зависимости от скролла](./OverlayUsage.md#Пример_изменения_alpha_в_зависимости_от_скролла)

### Наложение Overlay и изменение альфы начиная с порогового значения скролла

```kotlin
// @sample: com/sdds/plasma/homeds/docs/samples/NavigationBar_WithOverlay.kt
```