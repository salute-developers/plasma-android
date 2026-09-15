## Context

Autocomplete в `sdds-core/uikit-compose/src/commonMain` состоит из слота `field`, триггера popup и BaseDropdownMenu со встроенным List. AutocompleteStyle содержит только TextFieldStyle и DropdownMenuStyle; собственных Shape/Brush/Dp у него нет. Общий DropdownProperties также используется ComboBox и Select и описывает параметры размещения, а не stateful-стиль компонента.

TextField уже поддерживает StatefulValue и Motion для String/TextFieldValue (`6387720b5`). Пользователь может передать ему Motion непосредственно внутри `field`. Меню создаёт Motion внутри BaseDropdownMenu, но внешний Autocomplete не позволяет заменить его контекст. Подход к устранению этого ограничения уже применён в ComboBox (`da07f04a3`): обязательный dropdownMotion в новой перегрузке, делегирование старой и сохранение вложенных стилей.

На текущей базе DropdownMenuMotionStyle не содержит MotionProperty. Stateful strokeColor разрешается по полному MotionContext в BaseDropdownMenu, а фон BasePopover — по interactionSource. Поэтому передача Motion наблюдаема уже сейчас, но сама по себе не добавляет анимации свойств меню. DropdownMenu/Popover находятся в области `feature/plasma-8013`.

## Goals / Non-Goals

**Goals:**

- Открыть доступ к существующему Motion меню с сохранением source- и бинарной совместимости старой перегрузки.
- Документировать использование StatefulValue/Motion вложенного TextField через слот и независимость контекстов частей.
- Сохранить внешнее управление показом, вводом и выбором, размеры и размещение popup, слоты и существующие переходы появления.
- Проверить публичный API, компилируемые примеры, поведение, передачу контекста и все скриншотные тесты подключённых Compose-библиотек.

**Non-Goals:**

- AutocompleteMotionStyle, новый AutocompleteTextField, StatefulValue<Style>, миграция DropdownProperties или новые адаптеры `getFiniteDpAsState`/`asLegacyColor`.
- Изменения исходников/стилей/генерации DropdownMenu, BaseDropdownMenu, Popover/BasePopover и добавление им анимационных свойств.
- Изменения TextField, List/ListItem, SelectItem или ComboBox; автоматическое объединение контекстов поля, меню и строк.
- Новый SelectState, внутренняя фильтрация, автоматическое открытие по фокусу, новые флаги enabled/readOnly у контейнера либо публикация semantic-состояния открытия.
- Изменения дизайн-токенов, style-builder API, генераторов, Gradle conventions и View-компонента Autocomplete.

## Decisions

### 1. Новая перегрузка с обязательным dropdownMotion

Существующая функция сохраняет сигнатуру, имена, порядок и defaults всех параметров, включая последний `listContent` для trailing lambda. Она делегирует новой форме, передавая `rememberDropdownMenuMotion()`. Helper сохраняет существующее чтение LocalDropdownMenuMotionStyle и независимый запоминаемый контекст.

В новой форме первым параметром добавляется обязательный `dropdownMotion: Motion<DropdownMenuMotionStyle>`, остальные параметры совпадают со старой формой. Тело компонента располагается в новой форме; исходный объект Motion передаётся в `BaseDropdownMenu(motion = dropdownMotion)` без создания заменяющего стиля или контекста. Отдельный interactionSource у Autocomplete не вводится.

Обязательный параметр делает выбор перегрузки однозначным. Добавление необязательного параметра только в существующую функцию изменило бы её бинарную сигнатуру. Отдельный агрегирующий MotionStyle не имеет собственных анимируемых свойств и дублировал бы вложенные компоненты.

### 2. StatefulValue остаётся контрактом вложенных стилей

AutocompleteStyle/Builder продолжают хранить и принимать обычные TextFieldStyle и DropdownMenuStyle. Потребитель задаёт StatefulValue внутри этих стилей. Существующие AutocompleteNormal/Tight в `sdds.serv.compose`, `plasma.sd.service.compose` и `integration-core:sandbox-compose` продолжают использовать те же builder-вызовы. Для этой миграции не требуется регенерация или изменение ApiInfo-метаданных.

Слот `field: @Composable () -> Unit` остаётся произвольным. Для TextField в нём используется существующий `motion: Motion<TextFieldMotionStyle>` с подходящей перегрузкой/focusSelectorSettings. Поддерживаются String и TextFieldValue. LocalTextFieldStyle по-прежнему предоставляет style.textFieldStyle; явный style самого TextField имеет прежний приоритет. Размеры и форма поля разрешаются существующим BaseTextField через getValueAsState; настройки переходов заливок/текста использует существующий TextFieldMotionStyle.

Контексты поля, меню и элементов списка независимы по умолчанию. Потребитель может явно связать нужные источники; wrapper не подменяет контекст поля или строк переданным dropdownMotion. Специальный параметр textFieldMotion у контейнера не нужен: контейнер не создаёт TextField и не может передать Motion произвольному содержимому слота.

### 3. Управление и жизненный цикл

Фактический показ меню продолжает определять `showDropdown`. Wrapper передаёт актуальный onDismissRequest, не хранит дополнительное состояние открытия и не меняет данные поля/списка. Фильтрация, открытие после ввода, заполнение TextFieldValue при выборе и закрытие остаются в вызывающем коде.

При замене dropdownMotion во время показа последующая отрисовка использует новый контекст; события старого источника больше не определяют значения меню. Замена dropdownStyle при сохранённом Motion также отражается в отрисовке. Для этого не нужны эффекты активации или механизмы SelectState из ComboBox: у Autocomplete их нет.

Сохраняются rememberLazyListState, слот поля под LocalTextFieldStyle, List и его провайдеры стилей. Полная информация о триггере передаётся лямбдой; в композиции читается только derivedStateOf ширины. Это сохраняет поведение при скролле и перемещении триггера.

### 4. Геометрия, содержимое и существующие анимации

Остаются Width.TriggerWidth/Exactly, Height.FullHeight/Constrained, offset=0.dp, clipWidth=false, clipHeight=true, placement/placementMode/popupProperties из DropdownProperties, Recalculate и Start. `showEmptyState` вместе с непустым слотом заменяет основное содержимое меню; при отсутствии слота работает прежняя ветка списка. Footer и список сохраняют существующую компоновку и скролл, header остаётся null.

Существующие fadeIn/fadeOut и TextFieldAnimation не отключаются при noMotion: они независимы от новых настроек переходов свойств. Тесты кадров поля учитывают собственные анимации TextField, а тесты popup — завершение fade-перехода.

### 5. Граница с параллельной миграцией меню

Наблюдаемая проверка передачи dropdownMotion использует существующий semantic strokeColor при заданной strokeWidth. Смена состояния должна изменить обводку, включая замену источника и стиля на открытом меню. Одна лишь успешная компиляция named-аргумента недостаточна.

Промежуточные и конечные кадры Motion проверяются на уже реализованном свойстве TextField внутри `field`, например backgroundColor. От меню в этой задаче не требуется новая анимация фона, размеров или формы; исходники BaseDropdownMenu/BasePopover ради тестов не меняются. Если `feature/plasma-8013` уже вошла в базовую ветку к реализации, используется актуальный совместимый контракт без расширения области изменения. Последующая интеграционная проверка после объединения веток не является блокером этого change.

### 6. Документация и проверки

В `integration-core:uikit-compose-fixtures` добавляется компилируемый Android-пример Autocomplete с stateful-заливкой поля, существующим TextFieldMotionStyle и отдельным dropdownMotion. Обновляется `build-system/docs-template/compose-template/docs/components/AutocompleteUsage.md`: новая перегрузка, способы настройки вложенных стилей, независимость контекстов, внешнее управление показом и граница возможностей текущего меню. Существующие sample-маркеры сохраняются; новые соответствуют именам функций/сниппетов. Обе перегрузки получают согласованный KDoc. При реализации подтверждено, что DocSample и composableCodeSnippet подключены только в androidMain fixtures; пример размещается там по образцу ComboBox. Добавлять Android-зависимость docs в commonMain не требуется. Общий API и существующие потребители проверяются на Android/JVM, извлечение нового sample — на Android.

UI-тесты размещаются в `tokens:sdds.serv.compose`, используя существующий MotionTestBase и паттерны ComboBoxMotionTest. Проверяются старые/новые вызовы, semantic strokeColor, замена Motion и стиля, независимость поля, поддерживаемый переход поля, ввод и выбор, TextFieldValue selection/composition, dismiss, геометрия и слоты. Не требуется отдельный тест, зеркально проверяющий строку делегирования. Существующая группа Autocomplete имеет 9 сценариев в light/dark (18 вариантов); она входит в общий прогон.

Перед реализацией сверить имена задач с `./gradlew :sdds-core:uikit-compose:tasks --all :tokens:sdds.serv.compose:tasks --all`. Базовые команды из корня репозитория, JDK 17:

```sh
./gradlew :sdds-core:uikit-compose:compileKotlinJvm :sdds-core:uikit-compose:compileDebugKotlinAndroid
./gradlew :integration-core:uikit-compose-fixtures:compileKotlinJvm :integration-core:uikit-compose-fixtures:compileDebugKotlinAndroid
./gradlew :tokens:sdds.serv.compose:compileKotlinJvm :tokens:sdds.serv.compose:compileDebugKotlinAndroid
./gradlew :integration-core:sandbox-compose:compileKotlinJvm :integration-core:sandbox-compose:compileDebugKotlinAndroid
./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck
./gradlew :integration-core:uikit-compose-fixtures:spotlessCheck :tokens:sdds.serv.compose:spotlessCheck
./gradlew :sdds-core:uikit-compose:apiDump
./gradlew :sdds-core:uikit-compose:apiCheck
```

apiDump и apiCheck выполняются отдельными запусками: совместный запуск выявлял в предыдущей миграции недекларированную зависимость Gradle. Если изменены общие тесткейсы, дополнительно выполнить `./gradlew :integration-core:uikit-compose-testcases:compileDebugKotlin :integration-core:uikit-compose-testcases:spotlessCheck`. Целевые UI-тесты сначала запускаются отдельно через testDebugUnitTest выбранного модуля; затем выполняется полный verifyRoborazzi без фильтра тестов. Компиляция потребителей в `plasma.sd.service.compose` входит в полный прогон.

Полный набор для Debug workflow:

```sh
./gradlew \
  :tokens:plasma.giga.compose:verifyRoborazziDebug \
  :tokens:plasma.sd.service.compose:verifyRoborazziDebug \
  :tokens:plasma.homeds.compose:verifyRoborazziDebug \
  :tokens:sdds.serv.compose:verifyRoborazziDebug \
  :tokens:plasma-stards-compose:verifyRoborazziDebug \
  :tokens:sdds-sbcom-compose:verifyRoborazziDebug \
  :tokens:sdds-finai-compose:verifyRoborazziDebug \
  --continue --stacktrace --max-workers=2
```

Набор повторно сверяется с tokens/settings.gradle.kts; новые подключённые Compose-библиотеки также включаются. Для Release workflow используется соответствующий набор verifyRoborazziRelease. Проверяются все компоненты и предусмотренные темы/конфигурации. Итоговый verification.md содержит результаты каждого модуля, пропуски, NO-SOURCE/отсутствие тестов, блокировки, пути отчётов и разобранные визуальные расхождения. Эталоны не обновляются для маскировки регрессий; приёмка не объявляется успешной при незавершённом прогоне или необъяснённых падениях.

## Risks / Trade-offs

- Пользователь ожидает анимацию всех свойств меню → документация и приёмка различают передачу существующего Motion и возможности текущего renderer; расширение DropdownMenu остаётся в `feature/plasma-8013`.
- Добавление перегрузки ломает старые positional/trailing-lambda вызовы или бинарный API → старые параметры сохраняются, новый Motion обязателен, проверяются вызовы и Android/JVM API-dump.
- Отрисовка удерживает прежний контекст после замены → целевой тест меняет Motion на открытом меню и затем отдельно изменяет старый/новый источники.
- Новый пример случайно объединяет semantic-состояния поля и меню → в основном примере используются отдельные контексты; явное связывание описывается как выбор потребителя.
- Полный скриншотный прогон содержит существующие skips/NO-SOURCE → они перечисляются отдельно и не считаются успешно выполненными снимками; новые расхождения разбираются независимо от компонента.

## Migration Plan

Добавить совместимую перегрузку, пример, документацию и целевые тесты; проверить сборки и API, затем полный набор скриншотов. Существующим потребителям не требуется миграция вызовов. Для настройки меню они добавляют dropdownMotion, поле настраивают через прежний слот. Откат состоит в отмене связанных изменений компонента, примера, тестов, документации и API-dump; миграций данных и изменений токенов нет.

## Open Questions

Блокирующих вопросов нет. Фактические имена задач и набор Compose-библиотек повторно проверяются при Apply по текущему состоянию проекта.
