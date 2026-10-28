## Why

Свойства api-меты типа `icon` (`iconClosed`, `iconOpened` у `AccordionItem` и аналоги) плагин пропускает: SDK не умеет
превращать значение payload в `ImageSource`, поэтому у компонентов с иконками (стрелка аккордеона и другие) иконок в
превью нет. Иконки Compose-набора (`sdds-core:icons-compose`, около 4300 `ImageVector`) уже в зависимостях плагина.
Дизайн-системы используют всего 26 разных иконок, и все они есть в `icons-compose`.

## What Changes

- Payload передаёт иконку `literal`-строкой с именем, как оно записано в данных (`disclosure.down.fill.16`).
- Плагин приводит имя к члену `SddsIcons` (`DisclosureDownFill16`), находит иконку в реестре `PreviewIcons` и строит
  `ImageSource`; SDK получает `iconValue()`.
- `preview-generator` генерирует вызовы билдера для свойств `icon`; `unsupportedProperties` остаётся только для `shadow`.
- Реестр содержит иконки из списка `preview-icons.txt` (сейчас 26 имён), список проверяется тестом.
- Неизвестное имя даёт предупреждение `unknown_icon`, значение по умолчанию сохраняется, render не отклоняется.
- Браузерный тест рисует компонент с иконкой и проверяет предупреждение для неизвестного имени.

## Capabilities

### New Capabilities

- `compose-preview-icons`: поиск иконки по имени и построение `ImageSource` для свойств `icon`.

### Modified Capabilities

- `compose-preview-style-generation`: тени по-прежнему вне покрытия, иконки покрываются.

## Impact

- `integration-core/preview-sdk-compose`, `integration-core/preview-generator`, `integration-core/preview-compose-plugin`
  (зависимость `icons-compose`, список иконок, реестр, браузерный тест).
- Парный change `add-compose-preview-icons` в `design-system-builder` (клиент).
- Не входит: тени (`shadow`), иконки-ассеты (SVG и PNG из `payload.assets`), выбор иконки в редакторе.
