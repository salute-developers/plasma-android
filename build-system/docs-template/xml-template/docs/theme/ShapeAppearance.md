---
title: Токены форм
---

Компоненты `sdds-uikit` поддерживают различные скругления углов, настраиваемые через атрибуты `sd_shapeAppearance` и
`sd_shapeAppearanceAdjustment`.
Компонент с этим атрибутом получает ShapeDrawable в качестве background, при этом `sd_shapeAppearance` можно
использовать вместе с `android:background` только если в `android:background` установлен экземпляр ShapeDrawable (
например, токены градиентов). В остальных случаях рекомендуется использовать `sd_shapeAppearance` вместе с
`android:backgroundTint`.

Для конфигурирования формы компонентов предусмотрены следующие атрибуты:

|       Название атрибута       |                                              Описание                                               |       Формат данных        |
|:-----------------------------:|:---------------------------------------------------------------------------------------------------:|:--------------------------:|
|      sd_shapeAppearance       |                                          форма скругления                                           |         reference          |
| sd_shapeAppearanceAdjustment  |          корректировка скругления. Поддерживаются положительные и отрицательные значения.           |         dimension          |
|        sd_strokeWidth         | по краю формы компонента возможно установить рамку (бордер), параметр устанавливает толщину бордера | float, fraction, dimension |
|        sd_strokeColor         |                                            цвет бордера                                             |      reference, color      |
| sd_shapeColorAnimationEnabled |       если фон компонента зависит от состояния (state), то смена цвета фона будет анимирована       |          boolean           |

Значение атрибута `sd_shapeAppearance` — это ссылка на стили, у которых родительский стиль
`{{ docs-theme-prefix }}.Shape`. Рекомендуется использовать стили через атрибуты темы, а не напрямую.

Токены скруглений разделяются на группы согласно размеру скругления: Xxs, Xs, S, M, L, Xl, Xxl и Rounded. Токен скругления в Figma имеет следующую структуру названия:
```
CornerRadius/cR<название размера>
```
Допускаются также вычисляемые значения:
```
CornerRadius/calc:[cR<название размера> - 2]
```
Например, Figma токену `CornerRadius/cRm` соответствует стиль `@style/{{ docs-theme-prefix }}.Shape.Round.M` и атрибут
`?{{ docs-theme-resPrefix }}_shapeRoundM`.
Figma токену `CornerRadius/calc:[cRl - 2]` соответствует стиль `@style/{{ docs-theme-prefix }}.Shape.Round.L` и атрибут
`?{{ docs-theme-resPrefix }}_shapeRoundL`, но с дополнительной корректировкой `sd_shapeAppearanceAdjustment=-2dp`.
Для получения скругления угла 50% используйте `?sd_shapeAppearanceCircle`.

Пример использования в XML:

```xml
<com.sdds.uikit.Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:sd_shapeAppearance="?{{ docs-theme-resPrefix }}_shapeRoundL"
    app:sd_shapeAppearanceAdjustment="2dp"
    android:text="Label"
    app:sd_value="Value" />
```

Пример конфигурирования стиля:

```xml
<resources>
    <style name="CustomButton" parent="Sdds.Components.Button">
        ...
        <item name="sd_shapeAppearance">?{{ docs-theme-resPrefix }}_shapeRoundL</item>
        <item name="sd_shapeAppearanceAdjustment">2dp</item>
        ...
    </style>
</resources>
```
