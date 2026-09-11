# segment-compose-motion Specification

## Purpose

Определить поддержку StatefulValue и Motion API в Compose-контейнерах SegmentHorizontal и SegmentVertical: состояния визуальных свойств, переходы, совместимость существующего API, генерацию стилей и проверку визуальных регрессий.

## Requirements

### Requirement: Stateful visual values for Segment

SegmentStyle SHALL предоставлять `shapes: StatefulValue<CornerBasedShape>`, SegmentColors — `backgroundBrush: StatefulValue<Brush>`, а SegmentDimensions — `paddingStartValues`, `paddingEndValues`, `paddingTopValues`, `paddingBottomValues`, `gapValues`, `dividerPaddingStartValues`, `dividerPaddingEndValues` типа `StatefulValue<Dp>`. SegmentHorizontal и SegmentVertical SHALL использовать эти значения через переданный MotionContext. Вложенные segmentItemStyle и dividerStyle SHALL сохранять обычные style-контракты.

#### Scenario: Container dimensions depend on semantic state
- **WHEN** в semanticStateSource Motion контейнера изменяется состояние, для которого заданы отличающиеся padding, gap и divider padding
- **THEN** обе ориентации Segment используют значения, соответствующие этому состоянию, включая отступы разделителей по своей оси

#### Scenario: Gradient background
- **WHEN** backgroundBrush содержит градиент для текущего состояния и hasBackground равен true
- **THEN** Segment отображает соответствующий Brush без преобразования в однотонный Color

#### Scenario: Style changes while Motion is retained
- **WHEN** компонент получает новый SegmentStyle при сохранённом экземпляре Motion
- **THEN** фон, форма и размеры обновляются в соответствии с новым стилем и текущими состояниями

### Requirement: Public Segment Motion API

Библиотека SHALL предоставлять SegmentMotionStyle, SegmentMotionStyleBuilder, LocalSegmentMotionStyle и rememberSegmentMotion. MotionStyle SHALL содержать backgroundColor типа MotionProperty<Brush> и paddingStart, paddingEnd, paddingTop, paddingBottom, gap, dividerPaddingStart, dividerPaddingEnd типа MotionProperty<Dp>. Все эти свойства SHALL применяться при чтении соответствующих StatefulValue и по умолчанию использовать noMotion(). rememberSegmentMotion SHALL использовать переданные стиль и контекст, а по умолчанию — LocalSegmentMotionStyle и запоминаемый MotionContext.

#### Scenario: Explicit transition of background and spacing
- **WHEN** для backgroundColor и gap настроен переход с ненулевой длительностью и изменяется состояние в MotionContext
- **THEN** фон и gap проходят настроенный переход от предыдущих значений к целевым

#### Scenario: Default Motion and local override
- **WHEN** rememberSegmentMotion вызывается без явного style
- **THEN** он использует LocalSegmentMotionStyle, а при отсутствии переопределения все свойства переключаются без анимационной задержки

### Requirement: Segment overload compatibility

SegmentHorizontal и SegmentVertical SHALL сохранять существующие публичные сигнатуры, defaults и порядок параметров. Новые перегрузки SHALL принимать обязательный Motion<SegmentMotionStyle> без отдельных источников состояний. Существующие перегрузки SHALL делегировать общему пути отрисовки, используя исходный interactionSource.

#### Scenario: Existing call without Motion
- **WHEN** существующий потребитель вызывает SegmentHorizontal или SegmentVertical без motion, в том числе с trailing content lambda
- **THEN** вызов остаётся однозначным и компилируется без изменения аргументов

#### Scenario: Existing interaction source remains connected
- **WHEN** в interactionSource, переданный старой перегрузке, поступает поддерживаемое взаимодействие
- **THEN** общий путь отрисовки получает его и применяет соответствующие значения стиля

### Requirement: Legacy Segment style adapters

Старые свойства формы, цветов и размеров SHALL сохранять типы и быть deprecated с указанием stateful-замен. Builder-ы SHALL сохранять обычные значения и принимать StatefulValue; цветовой builder SHALL принимать Color, InteractiveColor, Brush и StatefulValue<Brush>. Старые getters формы/размеров SHALL возвращать default-значения. Цветовые адаптеры SHALL сохранять поддерживаемые состояния Color/InteractiveColor и SolidColor; ограничение legacy-getter-а для градиентов SHALL быть документировано.

#### Scenario: Existing style construction and property reads
- **WHEN** стиль создаётся прежними вызовами shape, colors и dimensions со статическими значениями
- **THEN** вызовы компилируются, новые свойства содержат эквивалентные значения, а старые getters возвращают прежние типы и значения

#### Scenario: Legacy background interaction states
- **WHEN** backgroundColor получает InteractiveColor с default и focused-цветами
- **THEN** оба состояния сохраняются в backgroundBrush и legacy InteractiveColor-представлении

### Requirement: Segment layout and child isolation

Миграция SHALL сохранять поведение stretch, hasBackground, порядок элементов/разделителей и предоставление вложенных стилей. Горизонтальный Segment SHALL предоставлять вертикальную ориентацию Divider, вертикальный Segment — горизонтальную. Разрешённый неопределённый gap SHALL нормализоваться в 0.dp; переходы с неопределёнными размерами SHALL не создавать NaN-геометрию. Контейнер SHALL не объединять автоматически источники состояний разных дочерних элементов.

#### Scenario: Background disabled while dimensions remain stateful
- **WHEN** hasBackground равен false и изменяется состояние для padding или gap
- **THEN** фон остаётся прозрачным, а размеры продолжают обновляться

#### Scenario: Layout defaults and stretching
- **WHEN** SegmentHorizontal отображается со stretch=true, а затем со stretch=false при стандартном стиле
- **THEN** сохраняется прежнее распределение ширины элементов для каждого режима, порядок слотов и divider padding

#### Scenario: Unspecified spacing
- **WHEN** разрешённый gap равен Dp.Unspecified
- **THEN** Arrangement получает расстояние 0.dp без ошибки измерения

#### Scenario: Independent item selection
- **WHEN** два SegmentItem используют разные контексты внутри одного контейнера и выбранность первого изменяется
- **THEN** состояния второго элемента и контейнера не изменяются автоматически

### Requirement: Segment shape switching

Segment SHALL разрешать shapes через MotionContext и применять выбранную форму к фону. Stateful-форма SHALL переключаться без плавной интерполяции; API SHALL не обещать анимацию формы в рамках этого изменения.

#### Scenario: Shape follows container state
- **WHEN** изменяется состояние, для которого задана другая CornerBasedShape
- **THEN** контейнер применяет эту форму после обновления состояния без промежуточных форм

### Requirement: Segment generation and documentation integration

Метаданные Segment builder-ов SHALL включать stateful-перегрузки, а штатная Compose-генерация SHALL создавать компилируемые стили со статическими и stateful-значениями без специального генератора Segment. Документация SHALL описывать новый Motion API, noMotion defaults, переключение формы и сохранение старых вызовов.

#### Scenario: Generated Segment style with states
- **WHEN** генератор получает конфигурацию с состояниями backgroundColor, shape и gap и обновлённые API-метаданные
- **THEN** результат компилируется с новым SegmentStyleBuilder и сохраняет значения указанных состояний

#### Scenario: Usable Motion example
- **WHEN** потребитель использует пример из документации для настройки состояния и перехода gap контейнера
- **THEN** пример компилируется через публичные StatefulValue и Segment Motion API

### Requirement: Full Compose screenshot regression acceptance

Приёмка миграции Segment и SegmentItem SHALL включать полный прогон всех существующих скриншотных тестов всех Compose-библиотек, подключённых в tokens/settings.gradle.kts, через штатные verifyRoborazzi-задачи варианта действующего CI workflow. Прогон SHALL охватывать все тестируемые компоненты, темы и конфигурации без ограничения классами Segment или списком изменённых модулей. Отчёт SHALL содержать результат по каждой библиотеке; отсутствие тестов, пропуски и блокировки SHALL указываться явно. Приёмка SHALL не объявляться успешной при необъяснённых падениях или незавершённых проверках библиотек, содержащих тесты.

#### Scenario: All Compose libraries and components are checked
- **WHEN** реализация и результаты генерации подготовлены к приёмке
- **THEN** выполняется полный набор скриншотных тестов plasma.giga.compose, plasma.sd.service.compose, plasma.homeds.compose, sdds.serv.compose, plasma-stards-compose, sdds-sbcom-compose, sdds-finai-compose и иных подключённых Compose-библиотек, независимо от наличия изменений в конкретном модуле

#### Scenario: A failure does not hide other library results
- **WHEN** скриншотная проверка одной Compose-библиотеки завершается ошибкой
- **THEN** остальные библиотеки также проверяются, результаты сохраняются отдельно и падение разбирается до завершения приёмки

#### Scenario: Missing screenshot coverage or blocked execution
- **WHEN** у подключённой библиотеки отсутствуют скриншотные тесты либо запуск блокируется отсутствующей задачей или ошибкой окружения
- **THEN** в отчёте явно указывается отсутствие покрытия или блокировка вместо утверждения об успешном прохождении тестов

#### Scenario: Visual differences are reviewed
- **WHEN** полный прогон обнаруживает отличия от эталонов у любого компонента
- **THEN** причина каждого отличия проверяется до обновления эталона, регрессии исправляются и соответствующие проверки повторяются
