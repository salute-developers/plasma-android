# autocomplete-compose-motion Specification

## Purpose

Определить совместимое подключение существующего Motion API выпадающего меню к Autocomplete, использование StatefulValue/Motion вложенного поля через слот, сохранение внешнего управления и раскладки, границу с отдельной миграцией DropdownMenu и полную скриншотную приёмку Compose-библиотек.

## Requirements
### Requirement: Autocomplete exposes the existing dropdown Motion contract compatibly

Autocomplete SHALL предоставлять новую перегрузку с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>` и передавать полученный объект в существующий параметр motion у BaseDropdownMenu без подмены контекста или стиля. Старая перегрузка SHALL сохранять публичную сигнатуру, имена, порядок и defaults параметров, включая последний listContent, и делегировать новой с rememberDropdownMenuMotion, учитывающим LocalDropdownMenuMotionStyle. Android/JVM API-dump SHALL сохранять старые сигнатуры и отражать добавленную перегрузку.

#### Scenario: Explicit semantic context reaches the menu
- **WHEN** Autocomplete получает dropdownMotion с пользовательским semanticStateSource, а меню имеет ненулевую strokeWidth и strokeColor со значением для этого semantic-состояния
- **THEN** изменение состояния меняет отображаемую обводку меню по переданному контексту

#### Scenario: Existing and new calls remain unambiguous
- **WHEN** потребитель использует прежние named/positional аргументы и trailing lambda для listContent либо новый вызов с обязательным dropdownMotion
- **THEN** каждый вызов однозначно компилируется, а старая публичная сигнатура сохраняется в Android/JVM API

#### Scenario: Default menu Motion uses the local style
- **WHEN** прежняя перегрузка вызывается под переопределённым LocalDropdownMenuMotionStyle
- **THEN** для меню используется этот стиль через существующий rememberDropdownMenuMotion без создания wrapper-ом другого MotionStyle

### Requirement: Stateful values and field Motion remain owned by nested components

AutocompleteStyle/Builder SHALL сохранять обычные textFieldStyle и dropdownStyle, их builder-контракты и defaults. StatefulValue SHALL настраиваться внутри вложенных стилей. Autocomplete SHALL сохранять произвольный `field: @Composable () -> Unit` с LocalTextFieldStyle, предоставляющим style.textFieldStyle; существующий TextField в слоте SHALL принимать собственный Motion для String и TextFieldValue. Отдельные AutocompleteMotionStyle, AutocompleteTextField, StatefulValue<Style> и адаптеры значений SHALL NOT вводиться.

#### Scenario: Text field uses stateful values and its existing transitions
- **WHEN** поле в слоте получает TextFieldStyle со stateful-заливкой и TextFieldMotionStyle с переходом поддерживаемого цвета, после чего меняется соответствующее состояние
- **THEN** TextField показывает промежуточное и конечное значения перехода через существующий Motion API

#### Scenario: Existing generated styles and arbitrary field content
- **WHEN** потребитель использует прежний AutocompleteNormal/Tight или собственный AutocompleteStyle и передаёт TextField либо другое содержимое в field
- **THEN** стиль и слот продолжают компилироваться и работать без новых членов style-builder-интерфейсов; TextField получает вложенный стиль через прежний provider, если не задан явный style

### Requirement: Motion contexts stay independent and replacement takes effect

Autocomplete SHALL сохранять независимость контекстов поля, меню и строк по умолчанию. Переданный dropdownMotion SHALL управлять только существующим путём меню и SHALL NOT автоматически заменять Motion содержимого слотов или публиковать в них состояния открытия. При замене dropdownMotion либо dropdownStyle на открытом меню отрисовка SHALL использовать актуальные значения без необходимости закрывать и повторно открывать меню.

#### Scenario: Replace dropdown context while open
- **WHEN** открытый Autocomplete получает Motion с новым источником состояний, после чего старый и новый источники изменяются независимо
- **THEN** stateful-обводка меню соответствует новому источнику, изменения старого источника больше не определяют её значение, showDropdown не меняется

#### Scenario: Replace visual style with retained Motion
- **WHEN** style.dropdownStyle заменяется при сохранённом dropdownMotion и открытом меню
- **THEN** обводка разрешается по новому стилю и текущему состоянию того же контекста

#### Scenario: Independent field and item interactions
- **WHEN** поле или строка используют собственный Motion, а состояние отдельного dropdownMotion изменяется
- **THEN** wrapper не изменяет источники поля и строки; их stateful-значения продолжают определяться собственными контекстами

### Requirement: Visibility input selection and dismissal remain externally controlled

Autocomplete SHALL продолжать определять показ меню по showDropdown и передавать актуальный onDismissRequest без внутренней фильтрации, SelectState, дополнительного состояния открытия или автоматического открытия по фокусу. Изменение текста, выбор подсказки и закрытие SHALL оставаться в вызывающем коде. Wrapper SHALL сохранять callbacks и данные TextFieldValue, включая selection/composition, и SHALL NOT добавлять повторные callbacks ввода/выбора.

#### Scenario: Typing and selecting a suggestion
- **WHEN** вызывающий код открывает меню и фильтрует данные после ввода, а по нажатию строки подставляет подсказку и устанавливает showDropdown=false
- **THEN** Autocomplete отображает переданные результаты и закрывается по обновлённому флагу, обработчик выбора выполняется один раз, String/TextFieldValue сохраняют данные вызывающего кода

#### Scenario: Dismiss callback does not mutate external state implicitly
- **WHEN** popup запрашивает закрытие и вызывается актуальный onDismissRequest
- **THEN** решение об изменении showDropdown остаётся у потребителя; wrapper не меняет текст, данные списка или переданный Motion

#### Scenario: Field focus and editing restrictions remain local
- **WHEN** поле получает фокус либо использует собственные enabled/readOnly настройки, а вызывающий код не меняет showDropdown
- **THEN** действуют прежние ограничения TextField, а контейнер не меняет видимость меню на основании этих состояний

### Requirement: Popup geometry content and existing animations are preserved

Autocomplete SHALL сохранять Width.TriggerWidth/Exactly, Height.FullHeight/Constrained, offset=0.dp, clipWidth=false, clipHeight=true, placement/placementMode/popupProperties, Recalculate/Start и обновление положения по актуальному TriggerInfo. Он SHALL сохранять List/scrollState, footer и существующую замену содержимого на emptyState при showEmptyState и непустом слоте. Существующие fadeIn/fadeOut и TextFieldAnimation SHALL сохраняться независимо от noMotion свойств.

#### Scenario: Width height and trigger movement
- **WHEN** используется ширина триггера либо явная ширина и ограниченная либо полная высота, а триггер меняет размер или положение
- **THEN** меню применяет прежние правила ширины, высоты и размещения с актуальными параметрами popup

#### Scenario: List footer and empty state
- **WHEN** показывается список с footer либо включается showEmptyState с переданным emptyState
- **THEN** сохраняются прежние компоновка и прокрутка списка с footer; emptyState заменяет основное содержимое меню, а при отсутствующем emptyState сохраняется ветка списка

#### Scenario: No property motion preserves popup fades
- **WHEN** настроенные переходы свойств отключены через noMotion и showDropdown переключается
- **THEN** меню сохраняет существующие fadeIn/fadeOut, а TextField в слоте сохраняет свою TextFieldAnimation

### Requirement: DropdownMenu migration stays outside this change

Реализация SHALL использовать существующий контракт BaseDropdownMenu без изменения исходников, стилей, MotionStyle и generated-файлов DropdownMenu/Popover/BasePopover. Приёмка SHALL проверять наблюдаемую передачу контекста на доступном stateful-свойстве меню и SHALL NOT требовать новых анимаций его фона, формы или размеров. Слияние feature/plasma-8013 SHALL NOT быть условием завершения этой задачи; после отдельного объединения веток совместимость проверяется повторно.

#### Scenario: Existing menu API is sufficient before parallel migration
- **WHEN** задача реализуется на базе с текущим DropdownMenuMotionStyle без MotionProperty
- **THEN** Autocomplete принимает dropdownMotion и проходит проверку stateful-обводки и поведения popup без переноса реализации из feature/plasma-8013

### Requirement: Documentation demonstrates the supported composition

Публичный KDoc и AutocompleteUsage.md SHALL описывать новую перегрузку, настройку StatefulValue внутри вложенных стилей, передачу Motion непосредственно TextField в слоте, независимость контекстов, внешнее управление показом и границу возможностей текущего меню. uikit-compose-fixtures SHALL содержать компилируемый пример с существующим TextFieldMotionStyle и отдельным dropdownMotion, подключённый штатным sample-маркером. Генераторы, значения токенов и style-builder-метаданные SHALL сохраняться.

#### Scenario: Published sample matches the public API
- **WHEN** пример собирается в Android fixtures и документация извлекает его по sample-маркеру, а общий API проходит Android/JVM-компиляцию
- **THEN** используются существующие stateful/Motion свойства TextField и новая перегрузка Autocomplete, а документация не обещает ещё не реализованных переходов меню

### Requirement: Acceptance covers all configured Compose screenshot libraries

Приёмка SHALL включать полный прогон verifyRoborazzi всех Compose-библиотек, подключённых в tokens/settings.gradle.kts, в варианте текущего workflow. Прогон SHALL охватывать все компоненты и предусмотренные темы/конфигурации без фильтра Autocomplete или изменённых модулей. Отчёт SHALL содержать по каждому модулю выполненные, пропущенные и упавшие тесты, отсутствие тестов/NO-SOURCE, блокировки и пути JUnit/Roborazzi-отчётов. Необъяснённые падения или незавершённые проверки модулей с тестами SHALL препятствовать объявлению успешной приёмки.

#### Scenario: Full configured regression run
- **WHEN** реализация готова к приёмке для Debug workflow
- **THEN** выполняются verifyRoborazziDebug для plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose и новых подключённых Compose-библиотек с продолжением после ошибок; существующие 18 вариантов Autocomplete входят в прогон

#### Scenario: Release workflow and incomplete coverage
- **WHEN** выбран Release workflow либо модуль содержит отключённые тесты или не содержит снимков
- **THEN** используется соответствующий полный verifyRoborazziRelease-набор; пропуски и отсутствие покрытия явно отражаются в отчёте и не считаются успешно проверенными скриншотами

#### Scenario: Visual differences in any component
- **WHEN** полный прогон обнаруживает расхождение у Autocomplete или другого компонента
- **THEN** причина разбирается до обновления эталона, регрессии исправляются и затронутые проверки повторяются; итог не содержит необъяснённых падений
