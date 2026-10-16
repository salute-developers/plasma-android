## Context

`PreparedComposePreview.Content()` строит стиль компонента (`styleFactory.create`) и рисует историю. Вложенные стили payload
(`styles`) строятся фабриками по `component`. Песочница задаёт `LocalButtonStyle`, `LocalSwitchStyle`, `LocalSpinnerStyle` и
`ProvideTextStyle` в теме приложения.

## Decisions

1. **Формат.** `defaults: { text?: { style?, color? }, styles?: { button?, switch?, spinner? } }`: `style` и `color` — id токенов
   `typography` и `color`, значения `styles` — идентификаторы вложенных стилей из `styles`.
2. **Применение.** Перед содержимым истории SDK оборачивает его в `CompositionLocalProvider` с `LocalButtonStyle`,
   `LocalSwitchStyle`, `LocalSpinnerStyle` (стили строятся фабриками `BasicButton`, `Switch`, `Spinner`) и
   `ProvideTextStyle(стиль, цвет)`. Недоступный токен или стиль пропускается без ошибки.
3. **Область.** Только эти четыре значения: они совпадают с набором, который задаёт песочница для историй.
4. **Совместимость.** Поле необязательное; плагин без него не падает на payload с ним, если игнорирует неизвестные поля (проверить).
