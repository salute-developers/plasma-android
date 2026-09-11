# Проверки ComboBox / SelectItem StatefulValue и Motion

Дата: 2026-09-03. База: `262ceada1`, ветка `feature/segment-combobox-stateful`.

## Итог реализации

- SelectItem: StatefulValue для Shape, двух Brush и семи Dp. По подтверждённому решению пользователя форма/размеры выбираются через `getValueAsState(motion.context)`, без анимации размеров. MotionStyle содержит только backgroundColor/iconColor. Старые цветовые getters возвращают `Color.Transparent.asInteractive()`, как в Cell/Chip. Дополнительные `getFiniteDpAsState`/`asLegacyColor` не добавлены; Segment не изменён.
- Обе формы SelectItem, обе commonMain-формы ComboBoxTextField и ComboBox получили обязательные Motion-перегрузки; прежние вызовы и Android drawable-адаптеры сохранены.
- Selected строки и интеракции разделяются встроенными Cell/CheckBox. Используется существующая CheckBox-перегрузка с ToggleableState: Boolean-обёртка в текущей базе не передаёт motion. Исходники Cell/CheckBox не изменены.
- Замена источника и двух разных открытых SelectState проверена: прежняя активация снимается, подписки и callbacks используют актуальный экземпляр. Сохранён публичный equals SelectState; локальная передача и ключи/замыкания учитывают идентичность экземпляра.
- DropdownMotion передаётся существующему BaseDropdownMenu. Исходники и generated-файлы DropdownMenu/Popover/Tooltip не менялись. Анимации свойств меню из `feature/plasma-8013` не входят в приёмку; объединение этой ветки не требуется.

## Генерация, API, примеры

- KSP: SelectItem содержит StatefulValue<Shape>, два StatefulValue<Brush> и семь StatefulValue<Dp>; ComboBox сохраняет три обычных component_style-ссылки. MotionStyleBuilder не получает ApiInfo.
- Штатный generateComponents с актуальными KSP-метаданными успешно обработал временную конфигурацию SelectItem с selected/selected+pressed, stateful-размерами, формой и градиентом. Полученный код скомпилирован для Android/JVM. Генератор не изменён.
- SelectItem регенерирован в sdds.serv.compose, plasma-stards-compose и sandbox-compose через отдельные output-директории. В 9 изменённых generated-файлах сохранены ссылки на цвета/формы и численные значения токенов. После форматирования регенерация ComboBox не оставила diff.
- Старые объявления сохранены в 24 затронутых Android API-классах и 23 JVM API-классах, включая перегрузки, getters и builder-ы. apiDump обновлён; отдельный apiCheck прошёл. Klib-проверки штатно SKIPPED; проверяемый контракт этого change — Android/JVM.
- Три новых DocSample скомпилированы и зарегистрированы в DocSampleRegistry: ComboBox_Motion, SelectItem_Motion, SelectItem_CustomCellMotion. Обновлены ComboBoxUsage.md и раздел SelectItem в SelectUsage.md.

## Сборки и целевые тесты

- Android/JVM: uikit-compose, uikit-compose-fixtures, sandbox-compose, sdds.serv.compose — успешно. uikit-compose-testcases и остальные Compose-библиотеки собраны для Android.
- Ядро: **17 unit-тестов, 0 ошибок, 0 пропусков**, включая 4 новых SelectItemStyleTest и 2 ComboBoxDismissStateTest.
- **13 новых UI-тестов, 0 ошибок**: 7 ComboBoxMotionTest и 6 SelectItemMotionTest. Проверены оба типа ввода, selection/composition TextFieldValue, телефонный/TV-фокус, источник и замена SelectState, активация/закрытие/иконка, disabled/readOnly, передача semantic strokeColor в меню, ширина/header/footer/emptyState, Selected и комбинированные интеракции, смена стиля, независимость строк, Cell/CheckBox и один callback, промежуточные/конечные цвета, мгновенные размеры, градиент/Shape/indication, резервирование control slot и Dp.Unspecified.
- Ещё 10 существующих SegmentMotionTest успешно повторились в полном запуске.
- Detekt ядра и Spotless всех изменённых модулей — успешно. OpenSpec strict validation и git diff --check — успешно.

## Полный скриншотный прогон

Проверены все семь Compose-библиотек из tokens/settings.gradle.kts. Использованы verifyRoborazziDebug, `--continue --stacktrace --max-workers=2`, **без фильтра тестов**. Это Debug workflow; Release-задачи не запускались.

| Библиотека | Всего | Прошли | Пропуски | Падения | Темы выполненных снимков | Отчёты |
| --- | ---: | ---: | ---: | ---: | --- | --- |
| plasma.giga.compose | 828 | 824 | 4 | 0 | dark: 412, light: 412 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/roborazzi/index.html) |
| plasma.sd.service.compose | 888 | 884 | 4 | 0 | dark: 442, light: 442 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/roborazzi/index.html) |
| plasma.homeds.compose | 642 | 640 | 2 | 0 | dark: 320, light: 320 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/roborazzi/index.html) |
| sdds.serv.compose | 1148 | 1144 | 4 | 0 | dark: 572, light: 572 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/roborazzi/index.html) |
| plasma-stards-compose | 298 | 290 | 8 | 0 | dark: 290 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/roborazzi/index.html) |
| sdds-sbcom-compose | 428 | 426 | 2 | 0 | dark: 213, light: 213 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/roborazzi/index.html) |
| sdds-finai-compose | 0 | 0 | 0 | 0 | нет тестов | NO-SOURCE; покрытия нет |
| **Итого** | **4232** | **4208** | **24** | **0** | | |

Все 4208 результатов сравнения имеют тип `unchanged`; использован штатный порог Roborazzi 0.005. PNG-эталоны не обновлялись. В sdds.serv.compose отдельно подтверждены все 20 ComposeComboBoxScreenshotTest и 20 ComposeSelectScreenshotTest, включая прежние размещения/состояния и другого потребителя SelectItem.

FinAI: testDebugUnitTest — **NO-SOURCE**, verifyRoborazziDebug — UP-TO-DATE без снимков. Это отсутствие покрытия, а не успешные скриншотные тесты. Остальные шесть библиотек выполнили testDebugUnitTest в полном запуске. Сохранены предусмотренные light/dark и TV-конфигурации.

### Существующие пропуски

Новых Ignore/фильтров не добавлено. Все 24 пропуска совпадают с предыдущим полным прогоном:

| Библиотека | Тест | Количество |
| --- | --- | ---: |
| plasma.giga.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd[]` | 2 |
| plasma.giga.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd[]` | 2 |
| plasma.sd.service.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd[]` | 2 |
| plasma.sd.service.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd[]` | 2 |
| plasma.homeds.compose | `ComposeWheelScreenshotTest.testWheelH1LeftAlignTwoVisibleEntriesNineTADivider[]` | 2 |
| sdds.serv.compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd[]` | 2 |
| sdds.serv.compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd[]` | 2 |
| plasma-stards-compose | `ComposeDropDownMenuScreenshotTest.testDropDownMenuXlLooseBottomEnd` | 1 |
| plasma-stards-compose | `ComposeTextAreaScreenshotTest.testTextAreaSDefaultInnerLabelFocused` | 1 |
| plasma-stards-compose | `ComposeTextAreaScreenshotTest.testTextAreaClearXsDefaultOuterLabelFocused` | 1 |
| plasma-stards-compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldClearXSDefaultOuterLabelFocused` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldFocused` | 1 |
| plasma-stards-compose | `ComposeTextFieldScreenshotTest.testTextFieldMInputText` | 1 |
| plasma-stards-compose | `ComposeWheelScreenshotTest.testWheelH1LeftAlignTwoVisibleEntriesNineTADivider` | 1 |
| sdds-sbcom-compose | `ComposePopoverScreenshotTest.testPopoverMDefaultLooseTopEnd[]` | 2 |

## Особенности запуска и журналы

Общий запуск завершился за 4м49с: 715 задач, 61 выполнена, 654 актуальны. Все сборки, статические проверки, unit/UI/скриншотные тесты и apiDump завершились успешно. Общий статус был FAILED только из-за валидации недекларированной зависимости Gradle между apiDump и apiCheck при совместном вызове. После завершённого dump выполнен отдельный `./gradlew :sdds-core:uikit-compose:apiCheck --stacktrace --max-workers=2`: **BUILD SUCCESSFUL in 6s**. Необъяснённых падений нет.

Штатная генерация sandbox выполнялась отдельно от компиляции: их совместный вызов также выявляет проверку неявных зависимостей проекта. Генерация отдельной задачей прошла, conventions не менялись.

- Полная приёмка: `/tmp/combobox-motion-full-verification.log`.
- Завершающий API-check: `/tmp/combobox-motion-api-check.log`.
- Успешные целевые unit/UI-тесты: `/tmp/combobox-motion-targeted7.log`.
- Реальная и синтетическая генерация: `/tmp/combobox-motion-generation.log`, `/tmp/combobox-motion-synthetic.log`, `/tmp/combobox-motion-consumers.log`.
- Android/JVM-компиляция синтетического стиля: задачи compileKotlinJvm/compileDebugKotlinAndroid в `/tmp/combobox-motion-targeted2.log` (последующие ошибки компиляции новых UI-тестов исправлены до финальной приёмки).
- Завершающее форматирование sdds.serv: `/tmp/combobox-motion-format4.log`.
- JUnit XML: `tokens/<module>/build/test-results/testDebugUnitTest`.
- Roborazzi JSON: `tokens/<module>/build/test-results/roborazzi/results`; изображения сравнения: `tokens/<module>/build/outputs/roborazzi`.
