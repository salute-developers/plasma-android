## Context

Основная реализация находится в `sdds-core/uikit-compose/src/commonMain/kotlin/com/sdds/compose/uikit`: `Segment.kt`, `SegmentStyle.kt`, `SegmentItem.kt`, `SegmentItemStyle.kt`. Компоненты уже являются multiplatform; новая логика не должна зависеть от Android API.

SegmentHorizontal и SegmentVertical читают форму и размеры напрямую, а фон — через `InteractiveColor.colorForInteraction`. SegmentItem создаёт внутренний `rememberCommonButtonMotion`, но передаёт ему адаптированные значения только для ButtonText. Выбор элемента записывается в `MutableSemanticStateSource`; встроенный Counter уже использует те же источники состояний и взаимодействий.

Основания из истории Git:

- `f17113611` (TabBar/TabBarItem, 04.06.2026): миграция пары контейнер–элемент, отдельные MotionStyle и deprecated-свойства.
- `30032f184` (Chip, 18.06.2026): stateful-форма, типографика, размеры, Brush и адаптеры старых builder-вызовов.
- `6387720b5` (TextField, 19.08.2026): актуальная миграция публичного style API и сгенерированных стилей.
- `f312728d4` (Buttons, 25.05.2026): источник частичной интеграции Motion в SegmentItem.

`api-info-ksp` распознаёт StatefulValue и аннотации `ApiInfo`/`ApiName`; универсальный Compose-генератор предпочитает stateful-перегрузки. Новая архитектура кодогенерации для этой задачи не нужна.

## Goals / Non-Goals

**Goals:**

- Полностью перевести визуальные значения Segment и SegmentItem на StatefulValue с чтением через MotionContext.
- Предоставить публичное управление переходами цветов, типографики и всех размеров через отдельные MotionStyle.
- Сохранить старые вызовы компонентов и стандартных builder-ов, параметры размещения, приоритет endIcon над Counter и текущие defaults.
- Учесть selected и комбинации взаимодействий во всех значениях, включая valueMargin, размеры иконок и встроенный Counter.
- Обновить KDoc, документацию и проверить потребителей в `integration-core` и `tokens`.

**Non-Goals:**

- Плавная интерполяция форм; форма только переключается по состоянию.
- Перевод `disabledAlpha` в StatefulValue, новые состояния или изменение модели обработки кликов/disabled.
- Изменение View/XML-компонентов, исходных дизайн-токенов, брендовых анимаций, зависимостей и Gradle-конвенций.
- Изменение общих механизмов Motion/StatefulValue или обещание бинарной совместимости произвольных внешних реализаций интерфейсов.

## Decisions

### 1. Новые свойства дополняют старый style API

В интерфейсах и default-реализациях старые свойства сохраняют типы и помечаются `@Deprecated` с указанием замены. Основная отрисовка использует новые свойства:

| Контракт | Старое свойство | Новое свойство и тип |
| --- | --- | --- |
| SegmentStyle, SegmentItemStyle | `shape` | `shapes: StatefulValue<CornerBasedShape>` |
| SegmentItemStyle | `labelStyle`, `valueStyle` | `labelStyles`, `valueStyles: StatefulValue<TextStyle>` |
| SegmentColors | `backgroundColor` | `backgroundBrush: StatefulValue<Brush>` |
| SegmentItemColors | `backgroundColor`, `labelColor`, `valueColor`, `startContentColor`, `endContentColor` | соответствующие `backgroundBrush`, `labelBrush`, `valueBrush`, `startContentBrush`, `endContentBrush` |
| SegmentDimensions | `paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `gap`, `dividerPaddingStart`, `dividerPaddingEnd` | соответствующие свойства с суффиксом `Values: StatefulValue<Dp>` |
| SegmentItemDimensions | `minHeight`, `minWidth`, `paddingStart`, `paddingEnd`, `startContentPadding`, `endContentPadding`, `valueMargin`, `startContentSize`, `endContentSize` | соответствующие свойства с суффиксом `Values: StatefulValue<Dp>` |

Имена методов builder-ов остаются прежними. К обычным Dp, CornerBasedShape и TextStyle добавляются StatefulValue-перегрузки; цветовые методы принимают Color, InteractiveColor, Brush и StatefulValue<Brush>. Старые методы адаптируют входные значения через `asStatefulValue()` / `asStatefulBrush()` без потери поддерживаемых состояний. Аннотации `@ApiName("iconMargin")` и `@ApiName("counterMargin")` должны присутствовать у соответствующих новых перегрузок.

Старые getters формы, типографики и размеров возвращают default stateful-значение. Для цветов сохраняется эквивалентное InteractiveColor-представление Color/InteractiveColor и наборов SolidColor. Градиент не представим в старом Color-контракте: для такого значения допустим явно документированный `Color.Transparent` fallback legacy-getter-а. Отрисовка всегда использует Brush и не зависит от этого fallback.

Численные defaults и значения цветов, в том числе selected-цвета SegmentItem, сохраняются. Вложенные `segmentItemStyle`, `dividerStyle`, `counterStyle` остаются обычными стилями.

Альтернатива с заменой типов существующих свойств отклонена: она ломает прямое чтение значений и усложняет миграцию потребителей. Полная совместимость внешних реализаций расширяемых интерфейсов отдельно не гарантируется.

### 2. Два отдельных публичных Motion API

В пакете `motion.components.segment` добавить:

- `SegmentMotionStyle`, builder, `LocalSegmentMotionStyle`, `rememberSegmentMotion`.
- `SegmentItemMotionStyle`, builder, `LocalSegmentItemMotionStyle`, `rememberSegmentItemMotion`.

SegmentMotionStyle содержит `backgroundColor: MotionProperty<Brush>` и семь `MotionProperty<Dp>` с именами соответствующих размерных методов builder-а. Один стиль обслуживает обе ориентации контейнера.

SegmentItemMotionStyle наследуется от CommonButtonMotionStyle: переиспользует backgroundColor, labelColor, valueColor, labelStyle, valueStyle; добавляет startContentColor/endContentColor и девять размерных MotionProperty. Builder возвращает конкретный SegmentItemMotionStyleBuilder для последовательной настройки, включая унаследованные методы. Ковариантность `Motion<out S>` позволяет использовать его в ButtonText.

Все перечисленные свойства по умолчанию равны `noMotion()`. Значения действительно читаются с соответствующей MotionProperty; объявленных, но не используемых свойств быть не должно. MotionProperty для формы не добавляется: форма разрешается через `getValueAsState(motion.context)` без интерполяции.

Использование только CommonButtonMotionStyle отклонено: у него нет размеров, отступов и цветов слотов SegmentItem. Использование только `getValueAsState` для всех свойств тоже недостаточно, поскольку не предоставляет настройку переходов.

### 3. Один путь отрисовки для каждого компонента

У SegmentHorizontal и SegmentVertical появляются перегрузки с обязательным `motion: Motion<SegmentMotionStyle>`; у каждой из трёх форм SegmentItem — аналог с `Motion<SegmentItemMotionStyle>`. Motion обязателен в новых перегрузках, совпадающих по остальным входам со старыми: вызовы без motion остаются однозначными. Новые перегрузки не принимают отдельные interactionSource/semanticStateSource.

Старые функции сохраняют имена, порядок, типы и defaults параметров. Они создают Motion с исходным interactionSource и, для SegmentItem, исходным semanticStateSource, затем делегируют новым функциям. Старые overload-ы Segment получают default semanticStateSource из rememberMotionContext. Внешние источники нельзя заменять новыми экземплярами при делегировании.

Перегрузки с Painter и String адаптируют входные данные к общей отрисовке слотов. Размеры иконок также берутся из того же переданного Motion. Контейнер продолжает предоставлять дочерние стили через CompositionLocal, но не объединяет автоматически состояния разных SegmentItem со своим контекстом.

### 4. Состояния и отрисовка проходят через один MotionContext

Фон и tint слотов используют Brush/getBrushAsState и существующий механизм `LocalTintBrushProducer`. Типографика читается через getTextStyleAsState; все размеры — через getDpAsState с MotionProperty данного поля. Разрешённая форма применяется согласованно к фону и focus selector.

`isSelected` записывается в semanticStateSource из motion.context; pressed/hovered/focused поступают из его interactionSource. Комбинации выбираются существующим алгоритмом StatefulValue. Изменение входного стиля при сохранённом Motion также должно обновлять значения.

Встроенный Counter создаёт свой `rememberCounterMotion`, используя тот же MotionContext, что и SegmentItem. У него остаются собственные CounterStyle/CounterMotionStyle. При наличии endIcon Counter не отображается, пустой counter не создаёт счётчик. Произвольный пользовательский slot не получает скрытой новой логики выбора: его автор может явно использовать тот же контекст.

`enabled` сохраняет текущее поведение и `disabledAlpha`; новые semantic-состояния disabled не вводятся. Кликабельность продолжает задаваться переданным modifier. При переходе на Motion вызывающий код связывает clickable и компонент через `motion.context.interactionSource`.

### 5. Локальная адаптация ButtonText для valueMargin

Сейчас ButtonText в `internal/BaseButton.kt` читает `valueMargin.getValue(motion.context.interactionSource)` и не видит selected из semanticStateSource. Простая передача StatefulValue сохранит этот дефект.

Выделить внутренний путь ButtonText, принимающий уже разрешённый `valueMargin: Dp`. Существующий внутренний overload с StatefulValue сохраняется и разрешает margin через полный MotionContext перед делегированием. SegmentItem разрешает margin через собственный `motion.style.valueMargin` и передаёт Dp в общий путь. Это даёт анимируемый отступ SegmentItem без расширения публичного CommonButtonMotionStyle размерными свойствами всех кнопок.

Проверка общего пути включает представительный Button с value и семантическим selected, чтобы изменение helper-а не осталось непроверенным.

### 6. Геометрия и сохранение текущего поведения

В StartContent используется разрешённый startContentSize, в EndContent — endContentSize, включая LocalIconDefaultSize и Painter-overload. Текущее ошибочное чтение startContentSize в EndContent исправляется; сценарий с разными размерами фиксирует ожидаемый результат.

Сохраняются stretch, hasBackground, состав/порядок слотов, orientation разделителей и расчёт divider padding по оси контейнера. Для gap существующая нормализация нечислового Dp в 0.dp применяется после разрешения stateful-значения. Defaults Dp.Unspecified не заменяются без необходимости; они не должны приводить к интерполяции NaN или некорректной геометрии.

### 7. Генерация и документация

После обновления builder-ов проверить KSP-метаданные и выбор новых перегрузок универсальным генератором. Генератор должен сохранить комбинированные состояния цветов, поддержать Brush и stateful-размеры/формы/типографику. Регенерация затронутых Compose-стилей выполняется штатными задачами dsBuilder с существующими источниками токенов; файлы стилей и API-метаданных вручную не редактируются. Если без регенерации старые стили компилируются, это также фиксируется как проверка совместимости адаптеров.

Обновляются KDoc публичных свойств, builder-ов и новых перегрузок, примеры в `integration-core:uikit-compose-fixtures`, шаблоны SegmentUsage.md/SegmentItemUsage.md в `build-system`. Пример показывает настройку StatefulValue, MotionStyle, общего источника для clickable и переключение selected; в документации явно указано отсутствие анимаций по умолчанию и плавной анимации формы.

## Risks / Trade-offs

- [Неоднозначность composable-overload-ов] → обязательный motion в новых перегрузках и компиляция существующих вызовов с именованными/позиционными аргументами и trailing lambda.
- [Сброс или расхождение состояний при создании вложенного Motion] → передавать исходные источники в адаптерах и общий MotionContext встроенному Counter; проверить selected вместе с pressed/focused и независимость соседних элементов.
- [Потеря состояния при преобразовании InteractiveColor] → проверить default, selected и комбинированные состояния, а также чтение старых getters; не копировать прозрачные заглушки старых миграций для поддерживаемых SolidColor.
- [Неопределённые размеры при интерполяции] → сохранить fallback gap; для значений, не допускающих численную интерполяцию, применять переключение, не создавая NaN-размеров.
- [Общее изменение ButtonText влияет на Buttons] → сохранить внутренний stateful-overload и проверить представительный сценарий Button с value.
- [Добавление методов интерфейсов влияет на сторонние реализации] → сохранить старые сигнатуры, проверить API diff и документировать необходимость адаптации собственных style/builder-реализаций.
- [Генерация меняет несвязанные брендовые стили] → использовать существующие версии источников и проверять diff; включать только объяснимые результаты этой миграции.

## Migration Plan

1. Добавить новые style-свойства, адаптеры старого API и Motion-контракты в `sdds-core:uikit-compose`.
2. Перевести отрисовку обеих ориентаций и трёх форм SegmentItem, адаптировать ButtonText, сохранить контекст Counter.
3. Добавить целевые проверки состояний/переходов, обновить публичный API и проверить метаданные.
4. Проверить старые сгенерированные стили, выполнить необходимую регенерацию и сборку потребителей; обновить примеры и документацию.
5. Прогнать все скриншотные тесты всех подключённых Compose-библиотек, проверить отчёты по каждому модулю и разобрать все расхождения, в том числе у остальных компонентов, использующих общие helpers.
6. Выпустить изменения согласованно с затронутыми Compose-модулями. До выпуска откат выполняется возвратом изменений uikit-compose и связанных результатов генерации/документации; миграции данных нет.

Команды валидации выполняются из корня репозитория. Перед реализацией уточнить target-specific задачи текущей конфигурации через `./gradlew :sdds-core:uikit-compose:tasks --all` и списки задач Compose-библиотек из `tokens/settings.gradle.kts`. Базовый набор сборки и проверок API:

```sh
./gradlew :sdds-core:uikit-compose:compileKotlinJvm :sdds-core:uikit-compose:compileDebugKotlinAndroid
./gradlew :sdds-core:uikit-compose:testDebugUnitTest :sdds-core:uikit-compose:detekt :sdds-core:uikit-compose:spotlessCheck
./gradlew :sdds-core:uikit-compose:apiDump :sdds-core:uikit-compose:apiCheck
./gradlew :sdds-core:uikit-compose:kspCommonMainKotlinMetadata
./gradlew :integration-core:uikit-compose-fixtures:compileKotlinJvm :integration-core:uikit-compose-testcases:compileDebugKotlin
./gradlew :tokens:sdds.serv.compose:compileKotlinJvm :tokens:sdds.serv.compose:compileDebugKotlinAndroid
```

Обязательная скриншотная приёмка охватывает полный набор тестов каждого подключённого Compose token-модуля. На момент proposal это семь библиотек: plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose. Перед запуском список сверяется с актуальным settings; добавленные Compose-библиотеки также включаются. Отбор по изменённым файлам или фильтр только на ComposeSegmentScreenshotTest не заменяет полный прогон.

Используются штатные verify-задачи из `.github/workflows/screenshots-verify-debug.yml`, без фильтра `--tests`:

```sh
./gradlew \
  :tokens:plasma.giga.compose:verifyRoborazziDebug \
  :tokens:plasma.sd.service.compose:verifyRoborazziDebug \
  :tokens:plasma.homeds.compose:verifyRoborazziDebug \
  :tokens:sdds.serv.compose:verifyRoborazziDebug \
  :tokens:plasma-stards-compose:verifyRoborazziDebug \
  :tokens:sdds-sbcom-compose:verifyRoborazziDebug \
  :tokens:sdds-finai-compose:verifyRoborazziDebug \
  --continue --stacktrace
```

Для веток, использующих release-workflow, выполнить соответствующий полный набор `verifyRoborazziRelease`. Вариант проверки выбирается по действующему CI workflow; обязательный охват — все тесты всех Compose-библиотек, включая все предусмотренные ими темы и конфигурации.

Для каждого модуля сохранить команду, результат, количество выполненных/пропущенных/упавших тестов и пути `build/reports`, `build/test-results`, `build/outputs/roborazzi`. Ошибка одного модуля не должна скрывать результаты остальных: используется `--continue` или отдельные запуски. Если библиотека не содержит скриншотных тестов, явно зафиксировать отсутствие покрытия; результат NO-SOURCE не означает, что тесты прошли. Отсутствующая задача или ошибка окружения считается блокировкой соответствующей проверки и отражается в итоговом отчёте. Необъяснённые визуальные расхождения разбираются до изменения эталонов; после исправлений затронутые проверки повторяются.

При несовпадении имён KMP/Android-задач использовать реальные эквиваленты из `tasks --all` и записать команды/результаты. Дополнительно запускаются задачи новых целевых тестов и проверок других действительно затронутых модулей. Если правился plugin_theme_builder, выполнить `./gradlew :sdds-core:plugin_theme_builder:test`. Полные testAll/detektAll для остальных видов проверок выполняются только при необходимом CI gate или выявленной межмодульной зависимости; полный скриншотный прогон Compose обязателен независимо от этого.

## Open Questions

Блокирующих продуктовых вопросов нет. Точные task names и необходимость изменения результатов генерации определяются по актуальной Gradle-конфигурации при реализации, не меняя согласованный объём.
