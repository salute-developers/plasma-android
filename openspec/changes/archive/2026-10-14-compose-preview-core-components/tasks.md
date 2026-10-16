## 1. Спайк (генератор фабрик, preview-sdk-compose)

- [x] 1.1 Проверить точки входа в билдер для всех 79 записей меты (`builderFunName` либо `<Style>.builder()` с нужным типом билдера) и тип каждого параметра; решить A (KSP) или B (Gradle-задача), записать в `design.md` (D0)
- [x] 1.1a Создать неопубликуемый генератор (выбрано: модуль `integration-core:preview-generator` с Gradle-задачей, без `convention.maven-publish`) с зависимостью на ресурс api-меты артефакта `uikit-compose`
- [x] 1.2 Реализовать выбор перегрузки и оформление значения для BasicButton, CheckBox, TextField, Avatar, Tabs
- [x] 1.3 Дифференциальный тест выбора вызова билдера против Theme Builder на конфигах golden-тестов для этих пяти компонентов
- [x] 1.4 Выяснить, есть ли в клиенте DS Builder соответствия свойств Compose и метаданные `Meta.preview.compose` для компонентов кроме кнопки; записать результат в `design.md` (D9b)
- [x] 1.5 Зафиксировать результаты спайка в `design.md`: правила выбора, имена кастомных состояний, нужен ли `key` у `@StoryProperty`

## 2. Реестр (sandbox-core, sandbox-ksp, uikit-compose-fixtures)

- [x] 2.1 Добавить необязательный `componentId` в `@Story` (значение по умолчанию пустая строка) и проверку уникальности идентификаторов в `sandbox-ksp`
- [x] 2.2 Добавить перечисление историй в `StoryRegistry` (`previewEntries()`) и генерацию записей `{componentId, story, styleQualifiedName}`
- [x] 2.3 Проставить `componentId` во всех историях `uikit-compose-fixtures`, чей компонент есть в api-мете (в том числе `BottomSheetStory` как `ModalBottomSheet`); четыре истории без компонента меты (`Icon`, `Text`, `IconTabs`, `Mask`) остаются без идентификатора
- [x] 2.4 Тесты: проверка идентификаторов в `sandbox-ksp` (unit), записи реестра на реальных историях (`StoryRegistryEntriesTest`); дубликат идентификатора роняет сборку KSP (проверено на реальных историях)

## 2a. Истории для дочерних компонентов (uikit-compose-fixtures, sandbox-core)

- [x] 2a.1 Для каждого компонента меты без истории определено: у всех девяти есть ключ, публичный composable есть у семи, `DropdownEmptyState` и `DropdownLoadingState` отрисовываются через пустой `DropdownScope` и `FooterLoadingState`; `BottomSheetStory` относится к `ModalBottomSheet` (решение в `design.md`, D2b)
- [x] 2a.2 Недостающие `ComponentKey` не потребовались (ключи для всех девяти уже есть)
- [x] 2a.3 Написаны истории для `AccordionItem`, `IconTabItem`, `ListItem`, `NavigationDrawerItem`, `SelectItem`, `TabBarItem`, `TabItem`, `DropdownEmptyState`, `DropdownLoadingState`
- [x] 2a.4 Проставлены `componentId` (включая `ModalBottomSheet` у `BottomSheetStory`); в `StoryRegistry` 79 записей; демо `sandbox-compose` и View-модуль собираются
- [x] 2a.5 Четыре истории без компонента меты (`Icon`, `Text`, `IconTabs`, `Mask`) внесены в список исключений теста покрытия (`StyleFactoryCoverageTest`) с причиной

## 3. Генерация фабрик (интеграция по результату спайка)

- [x] 3.1 Генерация фабрик и карты `componentId` на фабрику по всем 79 записям меты, фазы A–C (`GeneratedPreviewStyleFactories`)
- [x] 3.2 Состояния: интерактивные и `stateEnum` (`PreviewStateMap`), пропуск неизвестных с предупреждением `unknown_state` по правилам компонента-владельца стиля
- [x] 3.3 Вложенные стили (`component_style`): тип проверяется до отрисовки (`style_type_mismatch`, `style_component_not_found`)
- [x] 3.4 Пропуск `icon`, `shadow` и градиентов для цветовых свойств без перегрузки с `Brush` с предупреждением `unsupported_property`
- [x] 3.5 Метаданные для предупреждений рядом с каждой фабрикой (`unsupportedProperties`, `gradientUnsupportedProperties`, `nestedStyleTypes`, `states`) вместо отдельной функции анализа (D5)
- [x] 3.6 Тесты: детерминированность генерации (`GeneratorDeterminismTest`), покрытие меты, историй и фабрик со списком исключений (`StyleFactoryCoverageTest`; убранный `componentId` роняет тест)

## 4. SDK и плагин (preview-sdk-compose, preview-compose-plugin)

- [x] 4.1 Type-erased сборка компонентов из записей реестра и фабрик (`previewComponentsFrom`): класс стиля истории и фабрики сверяется при сборке, запись без фабрики пропускается
- [x] 4.2 Рекурсивное построение вложенных стилей и коды `style_type_mismatch`, `style_component_not_found` (проверка в `prepare`, до отрисовки)
- [x] 4.3 Плагин собирает компоненты из реестра; manifest `components` генерируется из списка фабрик (шаблон `src/manifest`), браузерный тест сверяет manifest с описаниями компонентов
- [x] 4.4 Удалены `BasicButtonPreviewStyleFactory`, её тесты и ручная регистрация в `Main.kt`; тест порядка записей перенесён в SDK (`StatefulValueOrderTest`)
- [x] 4.5 Тесты: `component_not_found` для компонента без фабрики (`ComponentNotFoundTest`), предупреждения по правилам компонента-владельца, проверка вложенных стилей, сборка компонентов из реестра
- [x] 4.6 Браузерная галерея: payload из меты для каждого компонента, проверки успеха, предупреждений, непустого кадра, ошибок страницы и застывшего рендера, скриншоты и HTML-страница; Compose-ресурсы добавлены в архив
- [x] 4.7 Сравнение с эталонным стилем для BasicButton, CheckBox и Tabs на уровне стилей (JVM-тест, прямой вызов билдера): отступление от скриншотного сравнения, см. `design.md`

## 5. Документация

- [x] 5.1 KDoc публичного API (`@Story`, `StoryRegistry`, `StoryEntry`, поддержка генерации в SDK) и README плагина: как добавить компонент в preview, галерея, ресурсы
- [x] 5.2 Замерены размер архива и холодный старт, результаты записаны в `design.md`; порога нет

## 6. Проверки

- [x] 6.1 `./gradlew spotlessApplyAll detektAll testAll` по репозиторию проходит (detekt нашёл одну замечание в моём коде, исправлено)
- [x] 6.2 Независимое ревью выполнено; замечания исправлены (список в `design.md`, «Правки по независимому ревью»)
- [x] 6.3 [внешняя проверка] Открыть страницу галереи и просмотреть скриншоты всех компонентов
- [ ] 6.4 [внешняя проверка] Проверить несколько компонентов разных фаз вместе с клиентом DS Builder в браузере (для компонентов, для которых клиент собирает payload, см. 1.4)
