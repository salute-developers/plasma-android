## 1. Подготовка — sdds-core, integration-core, tokens

- [x] 1.1 Сверить текущие ComboBox/ComboBoxTextField/SelectItem и существующие TextField/Cell/CheckBox Motion API с design.md; зафиксировать исходные сигнатуры/defaults и границу с feature/plasma-8013. Не переносить реализацию DropdownMenu/Popover и не делать её условием начала работ.
- [x] 1.2 Проверить реальные задачи через `./gradlew :sdds-core:uikit-compose:tasks --all :tokens:sdds.serv.compose:tasks --all`; определить затронутые generated-потребители SelectItem/ComboBox и модули тестов/примеров.

## 2. Stateful-стиль SelectItem — sdds-core:uikit-compose

- [x] 2.1 Добавить shapes: StatefulValue<Shape>, backgroundBrush/iconBrush и семь свойств размеров с суффиксом Values по таблице design.md; сохранить тип Shape, исходные defaults, itemType/disableAlpha и контракты вложенных стилей/иконок.
- [x] 2.2 Добавить статические и StatefulValue builder-перегрузки, Brush-перегрузки цветов и deprecated/ReplaceWith для старых getters; сохранить default и комбинированные InteractiveColor-состояния в новых Brush-свойствах; deprecated цветовые getters возвращают Transparent по образцу Cell/Chip.
- [x] 2.3 Проверить имена параметров, ApiInfo и ImageSource/drawable-контракт SelectItemStyleBuilder; добавить KDoc новых свойств/перегрузок и указать необходимость дополнения собственных style/builder-реализаций.

## 3. Motion и отрисовка SelectItem — sdds-core:uikit-compose

- [x] 3.1 Добавить SelectItemMotionStyle/Builder, LocalSelectItemMotionStyle и rememberSelectItemMotion с двумя Brush-свойствами; размеры переключаются через getValueAsState, noMotion defaults и KDoc; не аннотировать MotionStyleBuilder через ApiInfo.
- [x] 3.2 Добавить Motion-аналоги обеих форм SelectItem, сохранив старые сигнатуры и делегирование с исходным interactionSource; перевести фон/tint на MotionProperty, размеры на getValueAsState и полный MotionContext.
- [x] 3.3 Связать checked с semantic Selected без SelectInteraction; применять одну разрешённую форму к фону и shapeable indication, сохранить минимум высоты, control slot, disableAlpha, запрет disabled-клика и безопасное переключение неконечных Dp.
- [x] 3.4 Передать встроенным Cell/CheckBox контекст строки при собственных MotionStyle; сохранить checked/enabled, принадлежащие каждому компоненту состояния, один callback выбора и providers. Произвольный content оставить с явной передачей контекста потребителем.

## 4. Подключение ComboBox Motion — sdds-core:uikit-compose

- [x] 4.1 Добавить Motion-перегрузки ComboBoxTextField для String/TextFieldValue; старые commonMain-вызовы и Android drawable-адаптеры направить в общий путь, сохранив параметры. TextField и helper состояния должны получать один источник из MotionContext.
- [x] 4.2 Переподключать эффекты активации/подписки при замене Motion interactionSource или SelectState; корректно снимать активацию со старого источника и сохранять opening/dismiss/readOnly/focusSelector-поведение, TextFieldAnimation, иконку и keyboard composition/selection.
- [x] 4.3 Добавить ComboBox overload с обязательным dropdownMotion и делегирование старой формы; передать Motion существующему BaseDropdownMenu без изменения его исходников/контракта. Сохранить DropdownProperties, offset, ширину триггера, popup/clip/placement, header/footer/emptyState и fade-переходы.

## 5. Метаданные и генерация — sdds-core, integration-core, tokens

- [x] 5.1 Выполнить `./gradlew :sdds-core:uikit-compose:kspCommonMainKotlinMetadata`; проверить StatefulValue-типы Shape/Brush/Dp, полноту перегрузок SelectItem и неизменность обычных ComboBox component_style-контрактов.
- [x] 5.2 Проверить сборку старых сгенерированных стилей и штатную генерацию конфигурации SelectItem с selected/selected+pressed, stateful-размерами, формой и градиентом; скомпилировать результат для Android/JVM. При воспроизводимой несовместимости генератора внести минимальное исправление и целевой тест, затем выполнить `./gradlew :sdds-core:plugin_theme_builder:test`.
- [x] 5.3 Выполнить необходимую регенерацию SelectItem/ComboBox-стилей в tokens и sandbox-compose штатными dsBuilder-задачами с текущими версиями источников; проверить diff, сохранив значения токенов. При полной генерации использовать отдельную output-директорию и не переносить DropdownMenu/Popover/Cell/CheckBox-файлы.

## 6. Целевые тесты — sdds-core:uikit-compose, integration-core:uikit-compose-testcases, tokens:sdds.serv.compose

- [x] 6.1 Проверить обычные и stateful builder-вызовы/getters SelectItem, сохранение default/selected/комбинированных цветов в Brush и Transparent в deprecated getters, все старые component overload-ы и однозначность новых Motion-вызовов ComboBox/ComboBoxTextField/SelectItem.
- [x] 6.2 Добавить UI-сценарии checked, checked+pressed/hovered/focused, снятия checked, смены стиля при сохранённом Motion и независимости соседей; проверить состояния встроенных Cell/CheckBox и отсутствие двойного callback выбора.
- [x] 6.3 Добавить управляемые по времени проверки noMotion/CompositionLocal и промежуточных/конечных значений фона и tint SelectItem, мгновенного переключения размеров, а также поддерживаемого перехода TextField через ComboBoxTextField; не требовать новых MotionProperty зависимых компонентов.
- [x] 6.4 Проверить String/TextFieldValue (selection/composition), ввод/фокус/активацию, замену SelectState/interactionSource при открытом списке, снятие прежней активации, close/dismiss/повторный клик и disabled/readOnly в обычном/TV-режимах focus selector.
- [x] 6.5 Проверить передачу dropdownMotion на наблюдаемом существующем свойстве меню (например, semantic strokeColor), правила размеров/позиционирования, header/footer/emptyState и сохранение popup-анимаций. Проверить Select как другого потребителя SelectItem; исходники DropdownMenu/BasePopover не менять ради тестов.
- [x] 6.6 Добавить регрессии single/multiple, отсутствующей иконки и резервирования control slot, градиента, произвольной Shape и формы indication, controlSize/controlMargin, неконечных Dp и disabled-раскладки/прозрачности.

## 7. Примеры и документация — integration-core, build-system

- [x] 7.1 Добавить компилируемые примеры в uikit-compose-fixtures: TextField Motion внутри ComboBox, передача dropdownMotion по текущему API, SelectItem StatefulValue/Motion и явный общий context для пользовательской Cell.
- [x] 7.2 Обновить ComboBoxUsage.md и раздел SelectItem в SelectUsage.md: новые overload-ы, источники, noMotion и прежние анимации, совместимость getters/builder-ов, градиенты, форма, миграция собственных интерфейсных реализаций и граница с feature/plasma-8013; проверить sample-маркеры и KDoc.

## 8. Сборка и полная приёмка — затронутые included builds

- [x] 8.1 Выполнить Android/JVM сборки uikit-compose, uikit-compose-fixtures и sdds.serv.compose, а также `:integration-core:uikit-compose-testcases:compileDebugKotlin` по командам design.md; собрать остальных действительно затронутых потребителей, включая sandbox-compose при регенерации.
- [x] 8.2 Выполнить `./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck`, целевые новые UI-тесты в выбранном модуле и проверки форматирования всех изменённых модулей; при изменении генератора проверить также его тесты/форматирование.
- [x] 8.3 Выполнить `./gradlew :sdds-core:uikit-compose:apiDump :sdds-core:uikit-compose:apiCheck`, проверить diff на сохранность старых сигнатур и наличие новых API; отдельно проверить отсутствие изменений исходников и generated-файлов DropdownMenu/Popover, принадлежащих параллельной работе.
- [x] 8.4 Сверить все подключённые Compose-библиотеки в tokens/settings.gradle.kts и выполнить полный набор verifyRoborazziDebug из design.md для plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose и новых подключённых библиотек; использовать --continue без фильтра ComboBox/SelectItem или изменённых модулей. Для release workflow выполнить полный соответствующий verifyRoborazziRelease.
- [x] 8.5 Проверить отчёты полного прогона по каждому модулю: выполненные/пропущенные/упавшие тесты, предусмотренные темы/конфигурации, пути JUnit/Roborazzi и diff. Явно отметить отсутствие тестов, NO-SOURCE и блокировки без объявления таких проверок успешными.
- [x] 8.6 Разобрать все расхождения полного прогона, включая другие компоненты, до обновления эталонов; исправить регрессии и повторить затронутые проверки. Сохранить итоговый отчёт без необъяснённых падений, указав, что анимации свойств меню из feature/plasma-8013 не входят в приёмку этого change.
