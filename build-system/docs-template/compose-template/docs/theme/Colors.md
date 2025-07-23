---
title: Токены цвета и градиентов
---

Токены цвета делятся на несколько логических групп, согласно назначению элемента: `text`, `surface`, `background` и `outline`.

Эти группы в свою очередь делятся на подтемы:
- `Default` - По умолчанию, значения токенов меняются в зависимости от темы
- `OnDark` - Статические значения токенов из тёмной темы, не меняются при переключении темы,
- `OnLight` - Статические значения токенов из светлой темы, не меняются при переключении темы,
- `Inverse` Инвертированные значения токенов подтемы `Default`.

Токены цвета представляют из себя экземпляры класса `androidx.compose.ui.graphics.Color`, токены градиента - экземпляры класса `List<androidx.compose.ui.graphics.ShaderBrush>`, т.к. градиенты могут быть многослойными.
Чтобы применить многослойный бэкграунд можно использовать модификатор `Modifier.compositeGradient()`.
Для применения градиента к тексту используется первый слой токена градиента, например, `{{ docs-theme-codeReference }}.gradients.textDefaultAccentGradient.first()`.

### Структура именования токена цвета
```
область применения + подтема + название состояния
```

Например,
- Токену с названием `🌕 Surfaces Default/Accent/surfaceAccent` в коде будет соответствовать аттрибут `{{ docs-theme-codeReference }}.colors.surfaceDefaultAccent`.
- Токену c названием `🌕 Surfaces Default/Transparent/surfaceTransparentSecondary` в коде будет соответствовать аттрибут `{{ docs-theme-codeReference }}.colors.surfaceDefaultTransparentSecondary`

>Использовать токены цвета и градиентов необходимо через объект `{{ docs-theme-codeReference }}`.