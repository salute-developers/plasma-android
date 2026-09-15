## 1. Подготовка — sdds-core, integration-core, tokens

- [x] 1.1 Сверить Autocomplete, TextField и существующий BaseDropdownMenu Motion API с design.md, сохранить исходные публичные сигнатуры/defaults и подтвердить границу с feature/plasma-8013; проверить текущий diff, не затрагивая изменения других задач.
- [x] 1.2 Сверить доступные задачи через `./gradlew :sdds-core:uikit-compose:tasks --all :tokens:sdds.serv.compose:tasks --all`, перечень Compose-библиотек в tokens/settings.gradle.kts и Debug/Release workflow; определить существующие generated-потребители AutocompleteNormal/Tight и группу из 18 скриншотных вариантов.

## 2. Публичный API — sdds-core:uikit-compose

- [x] 2.1 Добавить перегрузку Autocomplete с обязательным первым dropdownMotion; сохранить старую сигнатуру, порядок/defaults и trailing listContent, делегируя через rememberDropdownMenuMotion. Передать исходный Motion в BaseDropdownMenu без новых MotionStyle/адаптеров или изменения зависимых компонентов.
- [x] 2.2 Сохранить AutocompleteStyle/Builder, DropdownProperties, произвольный field и providers, внешнее управление showDropdown/onDismissRequest, слоты, scrollState, derivedStateOf ширины триггера, геометрию popup и fadeIn/fadeOut; добавить согласованный KDoc обеих перегрузок.

## 3. Целевые проверки — tokens:sdds.serv.compose, integration-core:uikit-compose-testcases

- [x] 3.1 Проверить старые named/positional/trailing-lambda вызовы и новый dropdownMotion-вызов; добавить наблюдаемую UI-проверку существующей semantic strokeColor, учесть штатный LocalDropdownMenuMotionStyle без изменения renderer меню.
- [x] 3.2 Добавить проверки замены Motion/его источника на открытом меню и смены dropdownStyle при сохранённом Motion; проверить реакцию только на актуальный источник и независимость Motion поля/строк.
- [x] 3.3 Проверить существующий переход stateful-цвета TextField через field по промежуточному/конечному кадру и noMotion; покрыть String/TextFieldValue, selection/composition, ввод/выбор/закрытие и один callback выбора, актуальный dismiss и отсутствие автоматического открытия при фокусе либо изменении enabled/readOnly поля.
- [x] 3.4 Проверить Width.TriggerWidth/Exactly, ограничение высоты и перемещение триггера, footer/list/emptyState и fallback при отсутствии emptyState, сохранение popup fade-переходов; использовать существующие тестовые обвязки, общие тесткейсы менять только при необходимости.

## 4. Примеры и документация — integration-core, build-system

- [x] 4.1 Добавить компилируемый Android-пример (DocSample доступен в androidMain) в uikit-compose-fixtures: StatefulValue и существующий TextFieldMotionStyle внутри field, отдельный dropdownMotion и внешнее управление показом/выбором; сохранить действующие примеры.
- [x] 4.2 Обновить AutocompleteUsage.md и проверить sample-маркеры: новая перегрузка, вложенные stateful-стили, независимость контекстов, noMotion и прежние анимации, совместимость вызовов и граница возможностей меню до feature/plasma-8013.

## 5. Сборка и совместимость — sdds-core, integration-core, tokens

- [x] 5.1 Выполнить Android/JVM-компиляцию uikit-compose, uikit-compose-fixtures, sdds.serv.compose и sandbox-compose командами design.md, подтвердив совместимость старых generated AutocompleteNormal/Tight без регенерации; при изменении uikit-compose-testcases выполнить `./gradlew :integration-core:uikit-compose-testcases:compileDebugKotlin`.
- [x] 5.2 Выполнить `./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck`, целевые UI-тесты через `:tokens:sdds.serv.compose:testDebugUnitTest` и spotlessCheck изменённых модулей по design.md; устранить регрессии и ошибки форматирования.
- [x] 5.3 Выполнить `./gradlew :sdds-core:uikit-compose:apiDump`, затем отдельным запуском `./gradlew :sdds-core:uikit-compose:apiCheck`; проверить Android/JVM diff на сохранность старого API и новую перегрузку. Проверить отсутствие изменений style-builder-метаданных, токенов и исходников/generated-файлов зависимых компонентов из Non-Goals.

## 6. Полная скриншотная приёмка — все Compose-библиотеки tokens

- [x] 6.1 Выполнить полный набор `./gradlew :tokens:plasma.giga.compose:verifyRoborazziDebug :tokens:plasma.sd.service.compose:verifyRoborazziDebug :tokens:plasma.homeds.compose:verifyRoborazziDebug :tokens:sdds.serv.compose:verifyRoborazziDebug :tokens:plasma-stards-compose:verifyRoborazziDebug :tokens:sdds-sbcom-compose:verifyRoborazziDebug :tokens:sdds-finai-compose:verifyRoborazziDebug --continue --stacktrace --max-workers=2`, включив новые подключённые Compose-библиотеки; не применять фильтр Autocomplete/изменённых модулей. Для Release workflow использовать полный соответствующий verifyRoborazziRelease-набор.
- [x] 6.2 Проверить отчёты по каждому модулю, все предусмотренные темы/конфигурации и существующие 18 вариантов Autocomplete; явно учесть пропуски, NO-SOURCE/отсутствие тестов и блокировки, не считая их успешно проверенными снимками.
- [x] 6.3 Разобрать визуальные расхождения всех компонентов до обновления эталонов, исправить регрессии и повторить затронутые проверки; сохранить verification.md с итогами unit/UI/API и полного скриншотного прогона, путями отчётов и границей приёмки относительно feature/plasma-8013. Не отмечать приёмку завершённой при необъяснённых падениях или незавершённых проверках модулей с тестами.
