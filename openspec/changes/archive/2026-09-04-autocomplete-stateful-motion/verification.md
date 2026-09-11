# Проверка autocomplete-stateful-motion

Дата: 2026-09-03. База: `da07f04a3` (завершённая миграция ComboBox). JDK 17, Debug workflow.

## Реализация и границы

- В Autocomplete добавлена перегрузка с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>`. Старая форма сохраняет сигнатуру/defaults и делегирует с `rememberDropdownMenuMotion()`.
- Сравнение с исходником базы подтвердило: прежнее тело компонента и DropdownProperties сохранены; в вызов BaseDropdownMenu добавлен только `motion = dropdownMotion`. AutocompleteStyle/Builder, style-builder-метаданные, токены и generated-стили не менялись.
- DropdownMenu/Popover, TextField, List/ListItem, SelectItem и ComboBox не изменены. Новые MotionStyle и адаптеры StatefulValue не добавлены. Передача контекста меню проверена по существующей stateful-обводке; анимации свойств меню из feature/plasma-8013 не входят в приёмку.
- Добавлен пример `Autocomplete_Motion` и раздел StatefulValue/Motion в AutocompleteUsage.md. Пример размещён в androidMain по существующей схеме fixtures: зависимость docs и обработка DocSample подключены там. Это уточнение внесено в design/spec/tasks; общий API проверен на Android/JVM.

## Сборка, API и документация

- Android/JVM-компиляция: uikit-compose, uikit-compose-fixtures, sandbox-compose, sdds.serv.compose — успешно. Старые AutocompleteNormal/Tight продолжают компилироваться; plasma.sd.service.compose также собран в полном прогоне.
- detekt ядра и spotlessCheck всех изменённых Kotlin-модулей — успешно.
- apiDump выполнен; отдельный apiCheck — успешно. В Android- и JVM-дампах по одной новой сигнатуре Autocomplete, удалённых/изменённых прежних сигнатур нет; klib-проверка штатно SKIPPED.
- collectCodeSnippets и validateCoreDocumentation — успешно. Новый пример зарегистрирован KSP и извлечён по пути `com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Motion.kt`, совпадающему с sample-маркером документации.

## Поведенческие тесты

Ядро: **17 unit-тестов, 0 ошибок, 0 пропусков**.

**7 новых AutocompleteMotionTest, 0 ошибок, 0 пропусков:**

1. Semantic strokeColor, замена источника на открытом меню, отключение старого источника, замена dropdownStyle и независимость состояний поля/строки.
2. Stateful-заливка вложенного TextFieldStyle через provider, локальный TextFieldMotionStyle, промежуточный/конечный кадры и переключение на noMotion.
3. Старый positional-вызов с trailing lambda под LocalDropdownMenuMotionStyle, String-ввод, фильтрация и один callback выбора.
4. TextFieldValue selection/composition, ввод и внешнее управление показом при focus/readOnly/disabled поля.
5. Актуальный onDismissRequest при Android Back; меню закрывается после изменения внешнего showDropdown.
6. Ширина триггера/явная ширина, ограничение высоты, перемещение триггера, footer/list/emptyState и fallback при отсутствии emptyState.
7. Промежуточные кадры fadeIn/fadeOut при default Motion свойств меню.

В полном запуске также прошли прежние **10 SegmentMotionTest, 7 ComboBoxMotionTest и 6 SelectItemMotionTest**: всего 30 Motion/UI-тестов. У текущего пустого DropdownMenuMotionStyle нет собственных наблюдаемых переходов; сохранение локального стиля проверено по существующему remember-helper и совместимому вызову, без добавления свойств меню ради теста.

## Полный прогон скриншотов

Выполнены все семь verifyRoborazziDebug из design.md с `--continue`, без фильтра тестов или компонентов. Состав сверён с tokens/settings.gradle.kts и действующим Debug workflow.

| Библиотека | Всего тестов | Прошло | Пропущено | Ошибок | Темы проверенных снимков |
| --- | ---: | ---: | ---: | ---: | --- |
| plasma.giga.compose | 828 | 824 | 4 | 0 | dark: 412, light: 412 |
| plasma.sd.service.compose | 888 | 884 | 4 | 0 | dark: 442, light: 442 |
| plasma.homeds.compose | 642 | 640 | 2 | 0 | dark: 320, light: 320 |
| sdds.serv.compose | 1148 | 1144 | 4 | 0 | dark: 572, light: 572 |
| plasma-stards-compose | 298 | 290 | 8 | 0 | dark: 290 |
| sdds-sbcom-compose | 428 | 426 | 2 | 0 | dark: 213, light: 213 |
| sdds-finai-compose | 0 | 0 | 0 | 0 | NO-SOURCE |
| **Итого** | **4232** | **4208** | **24** | **0** | |

Все **4208** результатов Roborazzi имеют тип `unchanged`. PNG-эталоны не обновлялись. Существующие **18 вариантов ComposeAutocompleteScreenshotTest** (9 сценариев в light/dark) прошли без пропусков.

FinAI: testDebugUnitTest — NO-SOURCE, verifyRoborazziDebug — UP-TO-DATE без снимков. Это отсутствие покрытия, а не успешно выполненные скриншотные тесты. Остальные шесть модулей выполнили тестовые задачи в полном запуске.

Все 24 пропуска совпадают с предыдущим полным прогоном ComboBox; новых Ignore/фильтров нет:

| Библиотека | Существующий пропуск | Количество |
| --- | --- | ---: |
| plasma.giga.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 2 |
| plasma.giga.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd` | 2 |
| plasma.sd.service.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd` | 2 |
| plasma.sd.service.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 2 |
| plasma.homeds.compose | `ComposeWheelScreenshotTest.testWheelH1LeftAlignTwoVisibleEntriesNineTADivider` | 2 |
| sdds.serv.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 2 |
| sdds.serv.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd` | 2 |
| plasma-stards-compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd` | 1 |
| plasma-stards-compose | `ComposeTextAreaScreenshotTest.testTextAreaSDefaultInnerLabelFocused` | 1 |
| plasma-stards-compose | `ComposeTextAreaScreenshotTest.testTextAreaClearXsDefaultOuterLabelFocused` | 1 |
| plasma-stards-compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldClearXSDefaultOuterLabelFocused` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldFocused` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldMInputText` | 1 |
| plasma-stards-compose | `ComposeWheelScreenshotTest.testWheelH1LeftAlignTwoVisibleEntriesNineTADivider` | 1 |
| sdds-sbcom-compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 2 |

## Отчёты и журналы

Полная проверка: **BUILD SUCCESSFUL, 2м56с**. Отдельный apiCheck: **BUILD SUCCESSFUL, 5с**. Незавершённых проверок модулей с тестами и необъяснённых падений нет.

- [Полный запуск](/tmp/autocomplete-full-verification.log)
- [API-check](/tmp/autocomplete-api-check.log)
- [Целевые UI-тесты](/tmp/autocomplete-targeted4.log)
- [Сводные данные](/tmp/autocomplete-verification-data.json)
- plasma.giga.compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/roborazzi/index.html).
- plasma.sd.service.compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/roborazzi/index.html).
- plasma.homeds.compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/roborazzi/index.html).
- sdds.serv.compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/roborazzi/index.html).
- plasma-stards-compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/roborazzi/index.html).
- sdds-sbcom-compose: [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/roborazzi/index.html).
- [Извлечённый пример](/Users/sergeyvelesko/data/code/plasma-android/integration-core/uikit-compose-fixtures/build/docs/assets/examples/kotlin/com/sdds/compose/uikit/fixtures/samples/autocomplete/Autocomplete_Motion.kt).
