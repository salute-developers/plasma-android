## Why

Autocomplete скрывает существующий Motion API выпадающего меню, поэтому потребитель не может передать ему собственный контекст состояний. Нужно завершить подключение компонента к StatefulValue/Motion по образцу ComboBox: поле уже поддерживает их через слот TextField, а у AutocompleteStyle нет собственных визуальных значений для миграции.

## What Changes

- Добавить перегрузку Autocomplete с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>` и передавать его в существующий BaseDropdownMenu. Старая перегрузка сохраняет сигнатуру/defaults и делегирует новой с `rememberDropdownMenuMotion()`.
- Сохранить AutocompleteStyle с обычными `textFieldStyle` и `dropdownStyle`. StatefulValue настраиваются внутри вложенных стилей; отдельный AutocompleteMotionStyle, StatefulValue<Style> и новые адаптеры значений не требуются.
- Сохранить произвольный слот `field`, внешнее управление через `showDropdown`/`onDismissRequest`, содержимое списка и геометрию popup. Motion текстового поля задаётся непосредственно существующему TextField в слоте, контексты частей независимы по умолчанию.
- Добавить KDoc и компилируемый пример StatefulValue/Motion поля с передачей Motion меню, обновить AutocompleteUsage.md и Android/JVM API-dump.
- Проверить передачу контекста, смену Motion/стиля, поведение и совместимость; выполнить полный прогон скриншотных тестов всех подключённых Compose-библиотек.

DropdownMenu, BaseDropdownMenu, Popover/BasePopover и их стили, генерация и Motion API остаются в области параллельной работы `feature/plasma-8013`. Эта миграция использует существующий вход Motion и не зависит от слияния той ветки. На текущей базе проверяется доступное stateful-свойство обводки меню; новые анимационные свойства самого меню не входят в приёмку.

## Capabilities

### New Capabilities

- `autocomplete-compose-motion`: совместимое подключение Motion меню, использование StatefulValue/Motion поля через слот, сохранение внешнего управления и раскладки, границы с DropdownMenu, документация и полная скриншотная приёмка Compose-библиотек.

### Modified Capabilities

Нет. Существующие требования ComboBox, TextField и DropdownMenu не изменяются.

## Impact

- `sdds-core:uikit-compose`: новая публичная перегрузка Autocomplete, делегирование старой, KDoc и API-dump. Контракты AutocompleteStyle/Builder и DropdownProperties сохраняются.
- `integration-core:uikit-compose-fixtures`: пример для документации; `uikit-compose-testcases` — только если требуется общий сценарий для целевых тестов.
- `tokens:sdds.serv.compose`: целевые UI/Motion-тесты и существующие скриншоты Autocomplete. Все подключённые Compose-библиотеки в `tokens` участвуют в полной скриншотной приёмке.
- `build-system/docs-template/compose-template`: AutocompleteUsage.md и подключение нового sample штатным механизмом документации. Генератор документации и Gradle conventions не меняются.
- Значения дизайн-токенов, метаданные style-builder-ов и `sdds-core:plugin_theme_builder` не меняются. Совместимость готовых AutocompleteNormal/Tight-стилей проверяется сборкой; регенерация стилей не требуется.
- Валидация: Android/JVM-компиляция, целевые поведенческие/Motion-тесты, API-check, форматирование/статический анализ и полный verifyRoborazzi-прогон с отчётом о результатах, пропусках и NO-SOURCE по каждому модулю.
