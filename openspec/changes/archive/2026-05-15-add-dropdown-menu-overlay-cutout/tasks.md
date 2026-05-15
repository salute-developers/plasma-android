## 1. API и core implementation (`sdds-core/uikit-compose`)

- [x] 1.1 Добавить новый публичный API `ModalDropdownMenu(...)`, сохранив существующие публичные сигнатуры `DropdownMenu(...)` без изменений.
- [x] 1.2 Реализовать modal-сценарий через `EdgeToEdgeDialog` с overlay-слоем и dismiss по tap.
- [x] 1.3 Расширить `TriggerInfo` и добавить новый overload `Modifier.popoverTrigger(triggerInfo, shape = ...)` с безопасным default для старого API.
- [x] 1.4 Реализовать cutout под trigger через `CutoutState` и proxy `Box`, используя shape из `TriggerInfo`.
- [x] 1.5 Расширить `DropdownMenuStyle` свойством `overlayStyle`, builder-методом и KDoc для нового публичного API.

## 2. Генерация стилей и интеграция (`sdds-core/plugin_theme_builder`, `tokens`)

- [x] 2.1 Обновить compose-генерацию dropdown-menu style в `plugin_theme_builder` с поддержкой нового поля `overlayStyle` или его безопасного default.
- [x] 2.2 Убедиться, что generated compose dropdown-menu styles в `tokens/*-compose` продолжают собираться после расширения `DropdownMenuStyle`.

## 3. Документация и тесты (`integration-core`)

- [x] 3.1 Обновить fixtures/samples/story для `DropdownMenu`, чтобы показать сценарий с `ModalDropdownMenu` и cutout под trigger.
- [x] 3.2 Обновить docs template или generated docs-facing usage для публичных API `ModalDropdownMenu`, `DropdownMenu`, `TriggerInfo` и `popoverTrigger(...)`.
- [x] 3.3 Добавить или обновить compose screenshot/testcases для сценариев: обычный dropdown, modal dropdown, dismiss по tap и cutout под trigger.

## 4. Валидация

- [x] 4.1 Запустить релевантные модульные проверки для `sdds-core/uikit-compose`, `integration-core` и затронутых token compose modules.
- [x] 4.2 Запустить `./gradlew detektAll testAll` или эквивалентный сокращённый набор команд из корня репозитория для подтверждения, что change готов к применению.
