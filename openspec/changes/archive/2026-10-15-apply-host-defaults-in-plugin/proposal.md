## Why

Android-песочница оборачивает истории в тему со стилями по умолчанию: `LocalButtonStyle`, `LocalSwitchStyle`, `LocalSpinnerStyle` и
текст по умолчанию (`ProvideTextStyle`). Плагин этого не делает, поэтому вспомогательные элементы историй (кнопки «Show …»,
Switch, подписи) рисуются стилем библиотеки, а текст чёрным на тёмном фоне. Стили должна задавать тема дизайн-системы:
клиент DS Builder будет передавать их в payload (парный change `fix-compose-preview-states-and-defaults`).

## What Changes

- Контракт payload получает необязательный раздел `defaults` (текст по умолчанию и стили `button`, `switch`, `spinner`).
- SDK при показе компонента задаёт по `defaults` `LocalTextStyle`, `LocalButtonStyle`, `LocalSwitchStyle`, `LocalSpinnerStyle`.
- Без `defaults` поведение прежнее.
- История `SelectItem` передаёт содержимое disclosure: без него переключатель `disclosureEnabled` ничего не рисовал.

## Capabilities

### New Capabilities

- `compose-preview-host-defaults`: стили и текст по умолчанию, которые клиент передаёт плагину.

### Modified Capabilities

Нет.

## Impact

- `integration-core/preview-contract` (модель и копия схемы), `preview-sdk-compose`, `preview-compose-plugin` (браузерный тест).
- Парный change в `design-system-builder`.
