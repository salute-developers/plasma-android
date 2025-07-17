---
title: Токены скруглений
---

Токены скруглений — это экземпляры класса `androidx.compose.foundation.shape.CornerBasedShape`. Их можно использовать везде, где ожидается `androidx.compose.ui.graphics.Shape`: например, в `Modifier.shape()`, `Modifier.background()`, `Modifier.clip()` и других.
Большинство компонентов из `sdds-uikit-compose` также поддерживают установку свойства `shape` через стили.

Для использования токенов скруглений необходимо обращаться к ним через объект `{{ docs-theme-codeReference }}`.

Все токены сгруппированы по размеру скругления: Xxs, Xs, S, M, L, Xl, Xxl и Rounded. Название токена имеет следующую структуру:
```
CornerRadius/cR<название размера>
```

Также доступны вычисляемые токены скруглений:
```
CornerRadius/calc:[cR<название размера> - 2]
```

Пример: токену `CornerRadius/cRm` соответствует атрибут `{{ docs-theme-codeReference }}.shapes.shapeRoundM`.

Пример: `CornerRadius/calc:[cRl - 2]` соответствует вызову `{{ docs-theme-codeReference }}.shapes.shapeRoundL.adjustBy((-2).dp)`.
