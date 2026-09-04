# Проверки Segment StatefulValue и Motion

## Реализация и генератор

- Старые вызовы Segment и SegmentItem скомпилированы на Android; старые getters и builder-перегрузки проверены unit-тестами.
- Основная библиотека собирается для Android и JVM.
- KSP-метаданные содержат новые StatefulValue-параметры Brush, Dp, TextStyle и CornerBasedShape. Aliases iconMargin → startContentPadding и counterMargin → endContentPadding сохранены.
- Штатный generateComponents проверен с актуальными KSP-метаданными. Во временной копии конфигурации sdds.serv добавлены состояния gap/minWidth/valueMargin/iconMargin/counterMargin, формы, типографики и градиента (включая selected+pressed). Сгенерированный код успешно скомпилирован для JVM и Android. Изменений генератора не потребовалось.
- Segment/SegmentItem в sdds.serv, plasma.giga, plasma.sd.service, plasma-stards, sdds-sbcom и sandbox-compose регенерированы штатными задачами из настроенных источников. В рабочее дерево перенесены только файлы Segment/SegmentItem, затем выполнен Spotless. В sdds-sbcom регенерация не дала diff.
- Сравнение API до/после подтвердило сохранность прежних сигнатур SegmentKt, SegmentItemKt, SegmentStyle, SegmentItemStyle и размеров. KMP apiDump формирует отдельные Android/JVM-файлы; старый общий baseline сохранён.

## Целевые тесты

Ядро: 11 unit-тестов, 0 ошибок (включая 4 новых SegmentStyleTest); detekt и Spotless прошли. Целевые UI-тесты: 10 из 10 прошли.

`SegmentStyleTest`: статические и stateful builder-ы, legacy getters, сохранение комбинированных цветов, fallback для градиентов.

`SegmentMotionTest`: размеры слотов и Painter, semantic valueMargin, selected/pressed/focused, смена стиля, независимость соседей и Counter, локальные MotionStyle, промежуточные/конечные размеры, цвета, tint и типографика, разделители, Dp.Unspecified, градиент и disabledAlpha, Button с value.

## Полный скриншотный прогон

Дата: 2026-09-03. Базовый commit: `57e9b8213` (develop). Область: все семь Compose-библиотек из tokens/settings.gradle.kts, Debug workflow. Все задачи `verifyRoborazziDebug` запускались с `--continue --stacktrace --max-workers=2`, без фильтра тестов. Release workflow для этой ветки не применяется.

Общая команда с проверками сборки завершилась `BUILD SUCCESSFUL in 5m 6s`: 731 задача (184 выполнены, 40 получены из кеша, 507 актуальны). Скриншотные testDebugUnitTest шести библиотек выполнены в этом запуске, отчёты имеют текущую дату.

| Библиотека | Всего скриншотных тестов | Прошли | Пропущены | Падения | Отчёт |
| --- | ---: | ---: | ---: | ---: | --- |
| plasma.giga.compose | 828 | 824 | 4 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.giga.compose/build/reports/roborazzi/index.html) |
| plasma.sd.service.compose | 888 | 884 | 4 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.sd.service.compose/build/reports/roborazzi/index.html) |
| plasma.homeds.compose | 642 | 640 | 2 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma.homeds.compose/build/reports/roborazzi/index.html) |
| sdds.serv.compose | 1148 | 1144 | 4 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds.serv.compose/build/reports/roborazzi/index.html) |
| plasma-stards-compose | 298 | 290 | 8 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/plasma-stards-compose/build/reports/roborazzi/index.html) |
| sdds-sbcom-compose | 428 | 426 | 2 | 0 | [JUnit](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/tests/testDebugUnitTest/index.html), [Roborazzi](/Users/sergeyvelesko/data/code/plasma-android/tokens/sdds-sbcom-compose/build/reports/roborazzi/index.html) |
| sdds-finai-compose | 0 | 0 | 0 | 0 | NO-SOURCE; покрытия нет |
| **Итого** | 4232 | 4208 | 24 | 0 | |

В sdds.serv.compose дополнительно выполнены все 10 SegmentMotionTest: 10 прошли, ошибок и пропусков нет; они не включены в таблицу скриншотов.

`sdds-finai-compose:testDebugUnitTest` и компиляция его тестов вернули **NO-SOURCE**, а `verifyRoborazziDebug` — UP-TO-DATE без фактических снимков. Это отсутствие скриншотного покрытия, а не успешные тесты.

Запуск сохранил все объявленные параметризации и конфигурации: телефонные наборы light/night, TV-конфигурации plasma-stards и специальные конфигурации отдельных тестов. Пропуски обусловлены существующими @Ignore; новые отключения не добавлялись. Они связаны с известными сценариями Popover/DropDownMenu, обрезкой Wheel и масштабированием сфокусированных TextField/TextArea.

| Библиотека | Класс | Пропущенные случаи (включая параметры темы) |
| --- | --- | --- |
| plasma.giga.compose | ComposePopoverScreenshotTest | testPopoverMDefaultLooseTopEnd[] × 2 |
| plasma.giga.compose | ComposeDropDownMenuScreenshotTest | testDropDownMenuXlLooseBottomEnd[] × 2 |
| plasma.sd.service.compose | ComposeDropDownMenuScreenshotTest | testDropDownMenuXlLooseBottomEnd[] × 2 |
| plasma.sd.service.compose | ComposePopoverScreenshotTest | testPopoverMDefaultLooseTopEnd[] × 2 |
| plasma.homeds.compose | ComposeWheelScreenshotTest | testWheelH1LeftAlignTwoVisibleEntriesNineTADivider[] × 2 |
| sdds.serv.compose | ComposePopoverScreenshotTest | testPopoverMDefaultLooseTopEnd[] × 2 |
| sdds.serv.compose | ComposeDropDownMenuScreenshotTest | testDropDownMenuXlLooseBottomEnd[] × 2 |
| plasma-stards-compose | ComposeDropDownMenuScreenshotTest | testDropDownMenuXlLooseBottomEnd |
| plasma-stards-compose | ComposeTextAreaScreenshotTest | testTextAreaSDefaultInnerLabelFocused, testTextAreaClearXsDefaultOuterLabelFocused |
| plasma-stards-compose | ComposePopoverScreenshotTest | testPopoverMDefaultLooseTopEnd |
| plasma-stards-compose | ComposeTextFieldScreenshotTest | testTextFieldClearXSDefaultOuterLabelFocused, testTextFieldFocused, testTextFieldMInputText |
| plasma-stards-compose | ComposeWheelScreenshotTest | testWheelH1LeftAlignTwoVisibleEntriesNineTADivider |
| sdds-sbcom-compose | ComposePopoverScreenshotTest | testPopoverMDefaultLooseTopEnd[] × 2 |

Визуальных расхождений и необъяснённых падений нет. Использован штатный порог сравнения Roborazzi 0.005; результаты сравнения имеют тип unchanged. PNG-эталоны не обновлялись. Каталоги diff: `tokens/<module>/build/outputs/roborazzi`; результаты текущего прогона ошибок не содержат.

## Итоговые проверки

- `testDebugUnitTest`, `detekt`, `spotlessCheck` ядра — успешно.
- `apiDump` и `apiCheck` — успешно. Сохранены все прежние объявления в 27 Segment-классах API, включая builder-ы.
- JVM/Android сборки uikit-compose, sandbox-compose, uikit-compose-fixtures и sdds.serv.compose — успешно; uikit-compose-testcases и остальные Compose-библиотеки собраны для Android.
- Spotless проверен во всех изменённых модулях. Сравнение сгенерированных файлов подтвердило сохранность ссылок на цвета, формы, типографику и численных размеров токенов.
- Полный журнал Gradle текущей сессии: `/tmp/segment-motion-full-verification.log`.
