## Context

ComboBoxStyle содержит только textFieldStyle, dropdownStyle и selectItemStyle. ComboBox предоставляет эти стили через CompositionLocal и вызывает BaseDropdownMenu, который уже принимает `Motion<DropdownMenuMotionStyle>`. ComboBoxTextField имеет две commonMain-формы (String/TextFieldValue с ImageSource) и два deprecated Android-адаптера с drawable id. Обе основные формы вызывают TextField без возможности передать ему Motion извне.

SelectItem имеет две формы: произвольный content и удобный overload со слотами встроенной Cell. Визуальные свойства строки пока статические либо InteractiveColor. checked управляет контрольной иконкой/CheckBox, но не публикуется как Selected для фона и размеров строки. Встроенные Cell и CheckBox используют собственные контексты.

Ориентиры: `6387720b5` (TextField и MaskedTextField Motion), завершённый `segment-stateful-motion` (совместимые перегрузки, Brush, семантическая выбранность, общий контекст встроенного компонента). В локальной истории есть `2eb82183d` из `feature/plasma-8013`, меняющий Popover и адаптацию DropdownMenu; эта работа не включается в данный change.

## Goals / Non-Goals

**Goals:**

- Дать потребителю ComboBoxTextField доступ к существующим возможностям TextField Motion, сохранив поведение ввода, фокуса и открытия.
- Дать ComboBox явный вход для уже существующего Motion меню.
- Мигрировать собственные визуальные значения SelectItem и согласовать состояния строки, встроенной Cell и CheckBox.
- Сохранить source-вызовы компонентов, старые getters, обычные builder-вызовы и текущие defaults; проверить сохранность старых публичных сигнатур.
- Поддержать штатную генерацию, KDoc, документацию и полный прогон скриншотов Compose-библиотек.

**Non-Goals:**

- Изменение DropdownMenuStyle, DropdownMenuMotionStyle, DropdownMenu/ModalDropdownMenu, BaseDropdownMenu, Popover/Tooltip/BasePopover и их генерации. Эти файлы остаются за `feature/plasma-8013`.
- Новые анимационные свойства TextField, Cell, CheckBox или глобальная переработка MotionContext. Используются возможности, имеющиеся у зависимых компонентов на ветке реализации.
- Отдельный ComboBoxMotionStyle, превращение вложенных стилей в StatefulValue<Style>, изменение алгоритмов фильтрации и SelectDataStateManager.
- Изменение дизайн-токенов, типов single/multiple, выбора иконки, анимация формы, новые правила кликов или принудительное объединение контекстов всего списка.

## Decisions

### 1. Раздельные точки входа Motion

У ComboBox появляется новая перегрузка с обязательным `dropdownMotion: Motion<DropdownMenuMotionStyle>`. Остальные параметры соответствуют существующему вызову. Старая перегрузка делегирует ей с `rememberDropdownMenuMotion()`, использующим существующий LocalDropdownMenuMotionStyle. Полученный Motion без подмены контекста или стиля передаётся в существующий параметр motion у BaseDropdownMenu. Внутренний контракт и реализация меню не изменяются.

У обеих commonMain-форм ComboBoxTextField появляется новая перегрузка с обязательным `motion: Motion<TextFieldMotionStyle>`. Старая создаёт Motion с прежним interactionSource и LocalTextFieldMotionStyle, затем делегирует. В новой перегрузке отдельного interactionSource нет: helper состояния и TextField используют `motion.context.interactionSource`, а TextField получает сам Motion. Android-адаптеры остаются делегатами commonMain-пути; добавлять новые drawable-перегрузки не требуется.

Выбор обязательного аргумента сохраняет однозначность существующих вызовов и не меняет их сигнатуры. Альтернатива с добавлением необязательного motion в существующий метод меняет бинарную сигнатуру; единый ComboBoxMotionStyle дублирует уже существующие типы поля и меню и создаёт ненужную зависимость от их развития.

Контексты поля, меню и отдельных строк независимы по умолчанию. Для собственных сценариев потребитель может явно связать источники поля и меню. Это не распространяется автоматически на строки LazyList. ComboBoxScope и ComboBoxStyle сохраняют текущие контракты.

### 2. Сохранение поведения ComboBox

Сохраняются SelectState, открытие после onValueChange, открытие по FocusInteraction при выключенном focus selector и по ActivateInteraction при включённом, а также независимые enabled/readOnly параметры контейнера и поля. Условие фактического открытия меню остаётся `state.isOpened && enabled && !readOnly`; геометрия — DropdownProperties/ширина триггера, offset=0.dp, текущие clip/placement/popupProperties.

Существующие TextFieldAnimation и fadeIn/fadeOut продолжают работать. noMotion относится к новым настраиваемым переходам визуальных свойств, а не к отключению уже существующих анимаций компонента. Контракт не обещает анимацию тех свойств TextField или меню, для которых у соответствующего MotionStyle ещё нет реализации.

Helper ComboBoxTextField должен корректно переподключаться при замене источника или SelectState на открытом списке. Эффект публикации ActivateInteraction зависит от SelectState, interactionSource и isOpened; подписка на взаимодействия — также от readOnly/focusSelectorSettings. Активация снимается с прежнего источника при его замене/выходе из композиции. Проверяются закрытие через иконку, dismiss и защита от повторного открытия тем же нажатием (текущий интервал 300 мс).

Клик по иконке сохраняет собственный interactionSource; её tint/размер задаёт окружающий TextField через существующие providers. Миграция не добавляет второй обработчик открытия и не меняет keyboard selection/composition для TextFieldValue.

### 3. Stateful API SelectItem

| Владелец | Старое свойство | Новое свойство и тип |
| --- | --- | --- |
| SelectItemStyle | shape: Shape | shapes: StatefulValue<Shape> |
| SelectItemColors | backgroundColor: InteractiveColor | backgroundBrush: StatefulValue<Brush> |
| SelectItemColors | iconColor: InteractiveColor | iconBrush: StatefulValue<Brush> |
| SelectItemDimensions | controlSize: Dp | controlSizeValues: StatefulValue<Dp> |
| SelectItemDimensions | controlMargin: Dp | controlMarginValues: StatefulValue<Dp> |
| SelectItemDimensions | paddingStart: Dp | paddingStartValues: StatefulValue<Dp> |
| SelectItemDimensions | paddingEnd: Dp | paddingEndValues: StatefulValue<Dp> |
| SelectItemDimensions | paddingTop: Dp | paddingTopValues: StatefulValue<Dp> |
| SelectItemDimensions | paddingBottom: Dp | paddingBottomValues: StatefulValue<Dp> |
| SelectItemDimensions | height: Dp | heightValues: StatefulValue<Dp> |

Тип Shape сохраняется: старый контракт допускает произвольную форму, не только CornerBasedShape. itemType, disableAlpha (именно существующее имя), checkBoxStyle, cellStyle, iconSource и deprecated icon сохраняют прежние типы, defaults и семантику. Источник иконки остаётся ImageSource?, миграция изображения в StatefulValue не входит в задачу.

Старые свойства помечаются Deprecated/ReplaceWith; форма/размеры возвращают default нового значения. Старые цветовые getters возвращают Color.Transparent.asInteractive(), по образцу Cell/Chip. Default и комбинированные состояния InteractiveColor сохраняются в новых Brush-свойствах при вызове старых builder-ов; обратная адаптация не добавляется. Builder-ы сохраняют статические перегрузки Shape/Dp/Color/InteractiveColor и получают StatefulValue-перегрузки; цвета также принимают Brush. Сохраняются имена параметров, ApiInfo и существующие метаданные. MotionStyleBuilder не получает ApiInfo.

Собственные реализации style/builder-интерфейсов требуют реализации новых членов, как при миграции Segment. Это ограничение явно отражено в proposal и документации; обычные потребители builder-ов и сгенерированные стили продолжают компилироваться.

### 4. SelectItemMotionStyle и отрисовка

Публичный API в `motion/components/select/`: SelectItemMotionStyle, SelectItemMotionStyleBuilder, LocalSelectItemMotionStyle и rememberSelectItemMotion. В стиле два MotionProperty<Brush> — backgroundColor, iconColor; форма и семь размеров переключаются через getValueAsState(motion.context) без анимации. Все defaults — noMotion(). Стиль относится к собственным свойствам строки, не копирует CellMotionStyle или CheckBoxMotionStyle.

Обе существующие формы SelectItem сохраняются и делегируют новым перегрузкам с обязательным Motion<SelectItemMotionStyle>. В старом пути Motion создаётся на основе исходного interactionSource; в новом источники берутся только из context. Фон и tint разрешаются через getBrushAsState, размеры и форма — через getValueAsState и полный MotionContext без интерполяции. Одно разрешённое значение формы используется для фона и shapeable indication.

height сохраняет значение минимальной высоты, controlSize — размеры контрольного слота. Сохраняются размещение контрольного слота, controlMargin, padding, выравнивание и резервирование места при отсутствии иконки в single-варианте. Сохраняется disableAlpha и отключение клика. Все Dp, включая неконечные, выбираются через getValueAsState без дополнительного getFiniteDpAsState. Сохраняется прежняя семантика размерных модификаторов. Не вводится нормализация к 0.dp для всех свойств.

### 5. Выбранность и встроенные компоненты

checked публикуется как InteractiveState.Selected в semanticStateSource Motion строки, без отправки SelectInteraction. Снятие checked удаляет Selected и сохраняет прочие состояния. Поддерживаются Selected+Pressed/Hovered/Focused и смена стиля при сохранённом Motion.

Во встроенной Cell (overload со слотами) создаётся `rememberCellMotion(motionContext = itemMotion.context)` с собственным LocalCellMotionStyle. Встроенный CheckBox получает тот же context, ToggleableState(checked)/enabled и собственный CheckBoxMotionStyle через существующую state-перегрузку (Boolean-обёртка на текущей ветке не передаёт motion); он сохраняет свои состояния Checked/Indeterminate/Error и не подменяет Selected строки. Двойного изменения выбора или дополнительного onCheckedChange не вводится: выбор по-прежнему меняет onClick строки. Исходники Cell/CheckBox не мигрируются повторно.

Произвольный content остаётся пользовательским. Если пользователь создаёт Cell или другой stateful-компонент внутри него, общий контекст передаётся явно; это показывается отдельным примером. LocalCellStyle/LocalCheckBoxStyle/LocalTintBrushProducer сохраняются. Автоматическая передача контекста предусмотрена только для компонентов, которые создаёт сам SelectItem.

### 6. Генерация, документация и граница параллельной работы

Выполняется kspCommonMainKotlinMetadata, проверяется выбор StatefulValue-перегрузок SelectItem для Shape/Brush/Dp. Представительная конфигурация включает selected и selected+pressed, размеры, форму и градиент. Генерация выполняется штатными dsBuilder-задачами с текущими версиями источников, при необходимости в отдельной временной директории. В diff переносятся только затронутые SelectItem/ComboBox-файлы; сгенерированные DropdownMenu/Popover/Cell/CheckBox-стили не обновляются этой задачей. ComboBox-конфигурации остаются композицией component_style-ссылок.

Примеры добавляются в fixtures для ComboBoxTextField Motion, dropdownMotion passthrough и SelectItem с выбранностью/переходами. Документация обновляется в ComboBoxUsage.md и разделе SelectItem в SelectUsage.md; используются существующие sample-маркеры и публичные API. KDoc отражает источники, noMotion defaults, ограничения legacy-цветов, форму без интерполяции и необходимость обновления собственных реализаций интерфейсов.

Для меню приёмка этой задачи проверяет саму передачу Motion/context по существующему контракту и сохранение поведения popup. Она не требует анимации фона/размеров BasePopover и не должна исправлять эти реализации. Проверка передачи должна наблюдать предоставленный context в пути меню, а не ограничиваться компиляцией named-аргумента; если текущий renderer не позволяет проверить нужное semantic-свойство, применяется узкая проверка вызова/взаимодействий без изменения API меню. Если `feature/plasma-8013` войдёт в базовую ветку до реализации, используется её существующий контракт без расширения объёма. После отдельного объединения веток требуется повторная интеграционная проверка; это последующая проверка совместимости, а не незавершённая задача этого change.

### 7. План валидации

Сначала сверить реальные задачи через `./gradlew :sdds-core:uikit-compose:tasks --all :tokens:sdds.serv.compose:tasks --all`. Базовые проверки:

```sh
./gradlew :sdds-core:uikit-compose:compileKotlinJvm :sdds-core:uikit-compose:compileDebugKotlinAndroid
./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck
./gradlew :sdds-core:uikit-compose:kspCommonMainKotlinMetadata :sdds-core:uikit-compose:apiDump :sdds-core:uikit-compose:apiCheck
./gradlew :integration-core:uikit-compose-fixtures:compileKotlinJvm :integration-core:uikit-compose-fixtures:compileDebugKotlinAndroid :integration-core:uikit-compose-testcases:compileDebugKotlin
./gradlew :tokens:sdds.serv.compose:compileKotlinJvm :tokens:sdds.serv.compose:compileDebugKotlinAndroid
```

UI-тесты размещаются в доступном Android/Robolectric-модуле (предпочтительно sdds.serv.compose), общие сценарии — в uikit-compose-testcases. Нужны проверки промежуточных и конечных кадров Motion строки/поддерживаемых свойств поля, noMotion/CompositionLocal, checked и сочетаний состояний, источников, замены стиля/контекста, single/multiple, control slot, формы indication, disabled/readOnly, TextFieldValue selection/composition и поведения popup. Отдельно проверить Select как другого потребителя SelectItem. Если меняется plugin_theme_builder, выполнить его test и проверку форматирования.

Полный обязательный скриншотный прогон на develop:

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

Повторно сверить tokens/settings.gradle.kts и добавить новые подключённые Compose-библиотеки. Для release workflow использовать полный соответствующий набор verifyRoborazziRelease. Не применять фильтры ComboBox/SelectItem к полному прогону. В отчёте по каждому модулю указать выполненные, пропущенные, упавшие тесты, темы/конфигурации, JUnit/Roborazzi-отчёты и расхождения. NO-SOURCE и отсутствие тестов не считать успешными скриншотами. Все новые расхождения, включая другие компоненты, разобрать до изменения эталонов; необъяснённых падений оставаться не должно.

## Risks / Trade-offs

- Замена источника при открытом popup теряет ActivateInteraction → эффекты учитывают источник и SelectState, тестируется отключение старого и подключение нового источника.
- Selected строки смешивается с состояниями соседей или Checkbox → один context на строку, изменение только принадлежащих компоненту состояний, проверки двух соседних элементов и переключения checked.
- Общий контекст встроенной Cell/CheckBox меняет выбранные/pressed-цвета → это заявленная возможность; defaults проверяются скриншотами ComboBox, Select и полным набором библиотек.
- Полный генератор может переписать DropdownMenu и пересечься с параллельной веткой → отдельная output-директория и перенос только согласованных результатов генерации.
- Старые InteractiveColor getters не представляют градиент → документированный прозрачный fallback; реальная отрисовка использует Brush.
- Дополнительные обязательные свойства расширяемых интерфейсов требуют изменений у внешних реализаций → явное описание миграции и проверка сохранности старых вызовов/методов, без обещания бинарной совместимости произвольных старых реализаций интерфейсов.
- Возможности Cell/TextField/DropdownMenu Motion различаются → проверяются реально поддерживаемые свойства, новые MotionProperty зависимых компонентов не добавляются скрыто.

## Migration Plan

1. Добавить stateful-контракты и совместимые адаптеры SelectItem, затем его Motion API и перегрузки.
2. Подключить Motion к ComboBoxTextField и существующему вызову BaseDropdownMenu; проверить события открытия/закрытия и источники.
3. Подключить контексты встроенных Cell/CheckBox, выполнить метаданные/генерацию, обновить примеры, документацию и API.
4. Выполнить целевые и полные проверки, зафиксировать результаты в change. Публикация, merge и архивирование выполняются отдельными действиями.

При необходимости отката отменяются связанные исходники, их generated-результаты и API-dump вместе; работа feature/plasma-8013 и эталоны других изменений не затрагиваются.

## Open Questions

Блокирующих продуктовых решений нет. На старте apply уточняются только актуальное состояние существующих зависимых API, реальные Gradle-задачи и перечень генерируемых потребителей; это не расширяет согласованную границу с DropdownMenu.

### Уточнение при реализации

По подтверждённому решению пользователя размеры следуют BaseTextField (`getValueAsState`), а deprecated цвета — Cell/Chip (`Transparent`). Дополнительные адаптеры из Segment не переносятся. Для замены двух открытых SelectState учитывается идентичность экземпляра, поскольку SelectState.equals сравнивает isOpened: локальная передача использует referentialEqualityPolicy, а эффекты и замыкания — ключ по экземпляру. Публичный equals SelectState сохраняется.
