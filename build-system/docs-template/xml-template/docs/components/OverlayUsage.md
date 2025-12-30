---
title: Overlay
---

Overlay представляет из себя контейнер - подложку, для изменения заднего фона, когда на экране  
появляются всплывающие окна, такие как Toast, Popover, Modal и другие.
Компонент основан на FrameLayout поддержкой изменения формы скругления, поэтому для стилизации  
доступны атрибуты AndroidFrameLayout.  

```xml
<com.sdds.uikit.OverlayView
    style="@style/{{ docs-theme-prefix }}.Components.OverlayView"
    android:layout_width="match_parent"
    android:layout_height="match_parent"/>
```

## Стиль Overlay

Существует готовый стиль. Так же можно настроить стиль самостоятельно.  
Для использования заранее сгенерированного стиля, необходимо через атрибут style указать стиль из библиотеки (пример выше).  
Помимо атрибутов FrameLayout, для корректного отображения цвета фона, используйте атрибут

|Название атрибута|Описание|Формат данных|
|:-:|:-:|:-:|
|sd_background|цвет фона|color, reference|
