## ADDED Requirements

### Requirement: ComboBox exposes the existing dropdown Motion contract

ComboBox SHALL предоставлять новую перегрузку с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>` и передавать полученный Motion без подмены контекста и стиля в существующий параметр motion у BaseDropdownMenu. Старый overload SHALL сохранять публичную сигнатуру, defaults и порядок параметров и делегировать новому с rememberDropdownMenuMotion, учитывающим LocalDropdownMenuMotionStyle. ComboBoxStyle SHALL сохранять обычные textFieldStyle, dropdownStyle и selectItemStyle; отдельный ComboBoxMotionStyle SHALL NOT вводиться.

#### Scenario: Explicit dropdown context reaches the menu
- **WHEN** ComboBox получает dropdownMotion с пользовательским semanticStateSource, а strokeColor меню содержит значение для состояния этого источника
- **THEN** меню разрешает существующее stateful-свойство обводки по переданному контексту без изменения реализации DropdownMenu

#### Scenario: Existing ComboBox call
- **WHEN** потребитель вызывает прежнюю перегрузку ComboBox с trigger/listContent и обычным ComboBoxStyle
- **THEN** вызов остаётся однозначным, компилируется и использует существующий механизм создания Motion меню

### Requirement: ComboBoxTextField exposes TextField Motion

Обе commonMain-формы ComboBoxTextField (String и TextFieldValue, ImageSource-иконки) SHALL иметь новые перегрузки с обязательным `Motion<TextFieldMotionStyle>`. Переданный Motion SHALL использоваться внутренним TextField; helper открытия SHALL наблюдать и публиковать взаимодействия через тот же `motion.context.interactionSource`. Новые перегрузки SHALL не принимать отдельный interactionSource. Существующие перегрузки и deprecated Android drawable-адаптеры SHALL сохранять сигнатуры и делегировать общему пути; Motion старого пути SHALL использовать прежний interactionSource и LocalTextFieldMotionStyle.

#### Scenario: Explicit text field transition
- **WHEN** поле получает TextFieldMotionStyle с настроенным переходом поддерживаемого цвета и в его контексте меняется соответствующее состояние
- **THEN** внутренний TextField применяет этот переход и достигает целевого цвета

#### Scenario: Existing source and local style remain effective
- **WHEN** старый overload получает interactionSource при переопределённом LocalTextFieldMotionStyle
- **THEN** и логика открытия, и отрисовка используют этот источник, а переходы определяются локальным стилем

#### Scenario: String, TextFieldValue and Android adapters remain usable
- **WHEN** потребитель использует любую старую форму поля или новую Motion-форму с TextFieldValue
- **THEN** вызов компилируется, сохраняются callbacks, выделение и composition-состояние TextFieldValue, а Android-иконки разрешаются существующим ImageSource-адаптером

### Requirement: Motion sources reconnect without stale activation

ComboBoxTextField SHALL переподключать эффекты и подписки при замене interactionSource через Motion или старый overload, при замене SelectState и при изменении readOnly/focusSelectorSettings. При выходе из композиции или замене источника принадлежащая wrapper-у активация SHALL сниматься с прежнего источника. Открытое состояние SHALL публиковаться в новом источнике без необходимости предварительно закрыть и открыть список.

#### Scenario: Replace context while the list is open
- **WHEN** при открытом списке поле получает Motion с другим interactionSource
- **THEN** wrapper снимает свою активацию со старого источника, активирует новый и далее реагирует только на актуальные подписки

#### Scenario: Replace SelectState
- **WHEN** ComboBox получает новый SelectState, а поле остаётся в композиции
- **THEN** ввод, фокус, активация и иконка управляют новым состоянием, не изменяя прежнее

#### Scenario: Replace visual style with retained Motion
- **WHEN** поле получает новый TextFieldStyle при сохранённом Motion
- **THEN** поддерживаемые stateful-свойства разрешаются по новому стилю и текущему контексту

### Requirement: ComboBox opening and editing behavior is preserved

Миграция SHALL сохранять открытие после ввода, открытие по FocusInteraction при выключенном focus selector и по ActivateInteraction при включённом, закрытие через SelectState/иконку/dismiss, а также существующие enabled/readOnly-контракты поля и контейнера. Wrapper SHALL не добавлять повторные callbacks изменения текста/выбора. Существующая защита от повторного открытия после dismiss тем же нажатием SHALL сохраняться.

#### Scenario: Phone and TV focus paths
- **WHEN** поле получает подходящее FocusInteraction или ActivateInteraction в соответствующем режиме focus selector
- **THEN** список открывается по прежним правилам, включая ограничение readOnly

#### Scenario: Dismiss followed by the same icon click
- **WHEN** нажатие сначала закрывает popup через onDismissRequest и затем достигает обработчика иконки в интервале недавнего dismiss
- **THEN** список остаётся закрытым, а последующее самостоятельное нажатие может снова открыть его

#### Scenario: Disabled or read-only component
- **WHEN** disabled/readOnly установлены в соответствующих параметрах поля или контейнера
- **THEN** сохраняются прежние ограничения ввода/клика и условие показа меню, без новой автоматической передачи флагов между контейнером и trigger

### Requirement: Popup layout and existing animations remain compatible

ComboBox SHALL сохранять приоритет DropdownProperties/ширины триггера, offset=0.dp, ограничения высоты, placement/clip/popupProperties, header/footer/emptyState и текущие fadeIn/fadeOut. ComboBoxTextField SHALL сохранять TextFieldAnimation, chipsContent и слот иконки. Добавление Motion SHALL не отключать эти существующие анимации и не обещать новые свойства зависимых MotionStyle.

#### Scenario: Trigger width and explicit width
- **WHEN** меню отображается с Width.TriggerWidth либо Width.Exactly при переданном dropdownMotion
- **THEN** применяются прежняя ширина и позиционирование без переноса приоритета на размеры DropdownMenuStyle

#### Scenario: Unconfigured Motion
- **WHEN** потребитель не настраивает новые переходы Motion
- **THEN** сохраняются прежний вид компонента, TextFieldAnimation и анимации появления/исчезновения popup

### Requirement: DropdownMenu parallel implementation remains outside this change

Изменение SHALL использовать существующие DropdownMenuMotionStyle и BaseDropdownMenu и SHALL NOT изменять реализацию, стили, MotionStyle или сгенерированные стили DropdownMenu/ModalDropdownMenu/Popover/Tooltip/BasePopover. Собственные контексты поля, меню и элементов SHALL оставаться независимыми по умолчанию. Приёмка ComboBox/SelectItem SHALL быть выполнима без слияния feature/plasma-8013; проверка новых переходов самого меню SHALL относиться к последующей интеграции той работы.

#### Scenario: Implementation before the parallel branch is merged
- **WHEN** ветка реализации содержит текущий DropdownMenuMotionStyle без настраиваемых переходов
- **THEN** новые ComboBox API компилируются и передают Motion через имеющийся контракт, а приёмка не требует изменения BasePopover ради анимации его фона

#### Scenario: Explicit sharing does not join list items
- **WHEN** потребитель явно связывает контексты поля и меню и меняет их состояние
- **THEN** источники отдельных SelectItem не заменяются и не объединяются автоматически

### Requirement: ComboBox Motion documentation uses compilable examples

KDoc и ComboBoxUsage SHALL описывать передачу Motion поля и меню, приоритет источников старых/новых overload-ов, существующие анимации и границу возможностей DropdownMenu. Примеры SHALL компилироваться в uikit-compose-fixtures через публичные API на текущей ветке без зависимости от feature/plasma-8013.

#### Scenario: Consumer follows the field and dropdown examples
- **WHEN** потребитель использует примеры явного TextField Motion и dropdownMotion
- **THEN** примеры компилируются, а документация различает поддержку передачи контекста меню и наличие конкретных анимационных свойств его MotionStyle

### Requirement: Full Compose screenshot regression acceptance

Приёмка SHALL включать полный прогон скриншотных тестов всех Compose-библиотек, подключённых в tokens/settings.gradle.kts, через verifyRoborazzi-задачи варианта действующего workflow. Прогон SHALL охватывать все компоненты, предусмотренные темы и конфигурации без фильтра ComboBox/SelectItem или списка изменённых модулей. Отчёт SHALL содержать результаты по каждому модулю, пропуски, NO-SOURCE/отсутствие тестов, блокировки и визуальные расхождения. Приёмка SHALL не объявляться успешной при необъяснённых падениях или незавершённых проверках модулей с тестами.

#### Scenario: Full configured library set
- **WHEN** реализация готова к приёмке на develop
- **THEN** выполняются verifyRoborazziDebug для plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose и новых подключённых Compose-библиотек, с продолжением после ошибок

#### Scenario: Missing tests and existing ignores
- **WHEN** модуль не содержит тестов либо часть тестов отключена
- **THEN** отчёт явно отражает отсутствие покрытия/пропуски, не объявляя их прошедшими скриншотными проверками

#### Scenario: Visual differences outside ComboBox
- **WHEN** полный прогон обнаруживает расхождение у Select, CheckBox, Cell или другого компонента
- **THEN** причина разбирается до обновления эталона и итог не содержит необъяснённых падений
