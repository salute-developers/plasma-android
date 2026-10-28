## Context

`FactoryGenerator.statementFor` для `icon` и `shadow` добавляет свойство в `unsupportedProperties` и не порождает вызов
билдера. Результат при этом остаётся успешным: предупреждение `unsupported_property` выдаётся, только когда payload
содержит такое свойство. Значения в payload читаются через `dpValue`, `typographyValue`, `shapeValue`, `colorValue`,
`floatValue`, `stringValue` и аналоги SDK.

## Проверено на данных

- Дизайн-системы используют 26 различных имён иконок (выгрузки `tokens/*/build/theme-builder/components`); в базе
  `sdds_serv` их 20. Все 26 после приведения `a.b.c.16` к `ABC16` есть в `icons-compose` как члены `SddsIcons`.
- Имена в данных записаны строчными буквами через точку, размер последней частью: `disclosure.down.fill.16`, `plus.16`.

## Decisions

1. **Формат.** `literal`-строка с именем из данных (`disclosure.down.fill.16`). Плагин приводит её к члену `SddsIcons`:
   делит по `.`, `-` и `_` и пишет каждую часть с заглавной буквы (`DisclosureDownFill16`). Схема payload не меняется.
2. **SDK.** `iconValue()` читает `literal`-строку, приводит имя и ищет иконку в реестре; возвращает `ImageSource` либо
   `null` для неизвестного имени. `ImageSource` строится как `ImageSource { rememberVectorPainter(vector) }` без вызова
   composable при создании стиля.
3. **Генератор.** Для `icon` порождается `properties["iconClosed"]?.iconValue()?.let { builder.iconClosed(it) }`
   по перегрузке с `ImageSource` (устаревшая перегрузка с `@DrawableRes Int` пропускается, как сейчас). `icon` убирается
   из `unsupportedLiteral`, `shadow` остаётся.
4. **Реестр.** `PreviewIcons` — сгенерированная карта «член `SddsIcons` → `ImageVector`» только для имён из списка
   `preview-icons.txt` (26 имён). Полный набор (около 4300 иконок) не берём: компилятор оставляет в wasm всё, на что
   ссылается карта, а дизайн-системам нужна малая часть. Тест проверяет, что каждое имя списка есть в `icons-compose`.
   Список обновляется вместе с новой иконкой в конфигурациях; пока иконки в нём нет, превью показывает `unknown_icon`.
5. **Неизвестное имя.** Предупреждение `unknown_icon` с путём к свойству; билдер сохраняет значение по умолчанию.
6. **Покрытие.** Тест генератора сверяет, что для каждого свойства `icon` api-меты есть вызов билдера, и что `shadow`
   остаётся в `unsupportedProperties`.

## Risks / Trade-offs

- Иконка, которой нет в списке, не появится в превью до обновления списка и пересборки плагина.
- Иконки с растровыми или произвольными данными (не `ImageVector` из набора) не поддерживаются.
