## Why

`DropdownMenu` в `sdds-core/uikit-compose` сейчас открывается поверх контента без затемняющего слоя, поэтому для modal-like сценариев не хватает визуального акцента на открытом меню и триггере. Изменение нужно сейчас, потому что в библиотеке уже есть готовые примитивы `Overlay`, `CutoutState` и `EdgeToEdgeDialog`, которые позволяют сделать отдельный modal-сценарий без усложнения базового `DropdownMenu`.

## What Changes

- Добавить новый публичный Compose API `ModalDropdownMenu` для modal-сценария dropdown.
- Обеспечить затемнение фона через компонент `Overlay` с вырезом под trigger, чтобы trigger не затемнялся при открытом меню.
- Обеспечить dismiss `ModalDropdownMenu` по клику на overlay.
- Расширить `DropdownMenuStyle` поддержкой `OverlayStyle`, чтобы overlay можно было стилизовать через стиль самого компонента.
- Расширить `TriggerInfo` и `Modifier.popoverTrigger(...)`, чтобы trigger мог передавать форму выреза (`Shape`) для точного совпадения с геометрией trigger.
- Сохранить существующие публичные overload `DropdownMenu(...)` и `popoverTrigger(triggerInfo)` без изменения сигнатур; modal API добавить рядом.
- Обновить docs/fixtures/testcases и генерацию compose-стилей для `DropdownMenu`, чтобы новое поле `overlayStyle` корректно проходило через стиль и документацию.

## Capabilities

### New Capabilities
- `dropdown-menu-overlay-cutout`: `ModalDropdownMenu` может показывать overlay с dismiss по tap и вырезом под trigger, форма которого передаётся через `TriggerInfo`.

### Modified Capabilities

## Impact

- Затронутые модули: `sdds-core/uikit-compose`, `sdds-core/plugin_theme_builder`, `integration-core/uikit-compose-fixtures`, `integration-core/uikit-compose-testcases`, а также compose-модули в `tokens`, где генерируются `DropdownMenuStyle`.
- Изменение затрагивает публичный Compose API (`ModalDropdownMenu`, `TriggerInfo`, `Modifier.popoverTrigger(...)`) и docs-facing поведение компонента.
- Изменение не должно ломать существующие вызовы: существующий `DropdownMenu` и старый modifier сохраняются без поведенческих изменений.
