## Why

ComboBoxTextField скрывает уже существующий Motion API текстового поля, а SelectItem ещё использует обычные размеры и InteractiveColor без общего контекста выбранности и взаимодействий. Нужна миграция по образцу уже переведённых компонентов: управляемые StatefulValue и переходы, совместимые вызовы и согласованное поведение встроенных компонентов, независимо от параллельной разработки DropdownMenu.

## What Changes

- Добавить Motion-перегрузки ComboBoxTextField для String и TextFieldValue с использованием существующего `Motion<TextFieldMotionStyle>`; сохранить старые commonMain-перегрузки и Android-адаптеры drawable-иконок.
- Добавить перегрузку ComboBox с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>` и передавать его в существующий BaseDropdownMenu. ComboBoxStyle сохраняет три обычных вложенных стиля; отдельный ComboBoxMotionStyle не вводится.
- Перевести форму, два цвета и семь размеров SelectItem на StatefulValue, переключать размеры без анимации по образцу BaseTextField, добавить SelectItemMotionStyle для фона/иконки, CompositionLocal, remember-helper и Motion-перегрузки обеих форм компонента.
- Сопоставить checked с семантическим Selected; встроенные Cell и CheckBox получают контекст соответствующего элемента, сохраняя собственные MotionStyle и независимость соседних строк.
- Сохранить старые свойства и builder-вызовы с Deprecated/ReplaceWith; цветовые getters возвращают Transparent по образцу Cell/Chip. **BREAKING для собственных реализаций style/builder-интерфейсов:** новые обязательные stateful-члены потребуют дополнения таких реализаций. Существующие вызовы компонентов, штатных builder-ов и старые getters сохраняются.
- Сохранить открытие по вводу/фокусу/активации, readOnly/enabled, TextFieldAnimation, существующие fade-переходы popup, защиту от повторного открытия после dismiss и правила размеров/позиционирования меню.
- Обновить KSP-метаданные SelectItem, необходимые сгенерированные стили, компилируемые примеры, документацию и декларации API. Добавить целевые проверки состояний, взаимодействий и переходов; выполнить полный скриншотный прогон Compose-библиотек.

Реализация и стили DropdownMenu, BaseDropdownMenu, Popover и BasePopover, включая их MotionStyle, находятся вне этого изменения: ими занимается `feature/plasma-8013`. Использование существующего параметра motion в вызове BaseDropdownMenu не требует изменения его реализации. Реализация ComboBox/SelectItem и её приёмка не зависят от слияния этой ветки; полноценные переходы свойств самого меню проверяются при последующей интеграции соответствующей работы.

## Capabilities

### New Capabilities

- `combobox-compose-motion`: подключение Motion к полю и меню ComboBox, совместимость перегрузок и поведения, граница с параллельной миграцией DropdownMenu и полный Compose screenshot regression gate.
- `select-item-compose-motion`: stateful-стиль SelectItem, Motion API, выбранность и контексты встроенных компонентов, legacy-адаптеры, генерация и документация.

### Modified Capabilities

Нет. Существующие требования к ImageSource, ApiInfo и штатной генерации сохраняются; новые контракты описываются двумя capabilities выше.

## Impact

- `sdds-core:uikit-compose`: ComboBox, ComboBoxTextField, SelectItem/SelectItemStyle, новый Motion API SelectItem, API-dump и KSP-метаданные. Публичный API расширяется.
- `integration-core:uikit-compose-fixtures`, `uikit-compose-testcases`, при необходимости `sandbox-compose`: примеры, общие тестовые сценарии и штатная регенерация затронутых стилей.
- `tokens`: регенерация только затронутых SelectItem/ComboBox-стилей из текущих настроенных источников; репрезентативные UI/Motion-тесты в `sdds.serv.compose`. Значения дизайн-токенов не меняются.
- `build-system/docs-template/compose-template`: документация ComboBox и SelectItem; Gradle conventions не меняются.
- `sdds-core:plugin_theme_builder`: используется существующая универсальная генерация. Изменение генератора допускается только при воспроизводимой несовместимости новых метаданных, с минимальным исправлением и целевым тестом.
- Валидация: Android/JVM сборка, старые и новые вызовы, unit/UI-тесты, KSP и генерация, API-check, форматирование/статический анализ и полный verifyRoborazzi-прогон всех семи подключённых Compose-библиотек без фильтра компонентов, с явным отчётом о пропусках и NO-SOURCE.
