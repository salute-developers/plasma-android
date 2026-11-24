## Context

В `sdds-core/uikit-compose` (`Wheel.kt`) параметр `alignment: WheelAlignment` управляет двумя разнородными поведениями measure-фазы `WheelLayout`:

- `shouldStretchWheel(alignment, wheelIndex, wheelCount)` (`Wheel.kt:338`) — при `Mixed` растягивает только крайние колёса, центральные измеряет «компактно» (по контенту); при `Start/End/Center` растягивает все колёса на равные 1/N. Работает только при фиксированной внешней ширине (`stretchWheels = constraints.hasFixedWidth`).
- `getBaseWheelAlignment(alignment, wheelIndex, wheelCount)` (`Wheel.kt:345`) — выравнивание контента внутри колеса: `Mixed` → `End/Center/Start`, остальные — uniformly.

Связка исторически следует Figma-вариантам пикера, где «контент стянут к центру» требует компактного центрального колеса для симметричных зазоров вокруг разделителей. Но макеты содержат и комбинацию «распределение ширины как в Mixed + контент по центру», которую текущая неортогональная модель выразить не может.

Затронутые модули: `sdds-core/uikit-compose` (runtime + BCV-бейзлайны), `integration-core/uikit-compose-testcases`, `integration-core/uikit-compose-fixtures`, `build-system/docs-template`. `plugin_theme_builder` — без изменений кода (универсальный генератор). View-стек (`sdds-core/uikit`) — вне объёма.

## Goals / Non-Goals

**Goals:**
- Добавить публичный enum `WheelWidthMode { Auto, Equal, CenterContent }` — ортогональный `WheelAlignment`.
- `Equal`: все колёса равной ширины (нынешнее поведение не-Mixed). `CenterContent`: центральные колёса по ширине контента, крайние делят остаток поровну ( нынешнее поведение Mixed по ширине).
- `Auto` (дефолт стиля и параметра) сохраняет текущее поведение 1-в-1: `Mixed → CenterContent`, иначе `Equal`.
- `WheelStyle.widthMode` + метод билдера; параметр `widthMode` в `Wheel(...)`.
- `WheelAlignment` остаётся только про выравнивание контента; `Mixed` не помечается deprecated (выравнивание «к центру» — валидный самостоятельный режим).
- Покрыть юнит-тестами чистую measure-логику, добавить тест-кейс/сэмпл/story-контрол, обновить BCV и доки.

**Non-Goals:**
- View-реализация (`sdds-core/uikit`, `wheel_attrs.xml`) — только Compose.
- Переход на явный `widthMode` в существующих brand-конфигах theme-converter — отдельная работа во внешнем репозитории; здесь только обеспечивается поддержка значения генерацией.
- Изменение визуального поведения `Mixed` «из коробки».
- Распределение ширины по **выбранному** элементу (ширина компактного колеса остаётся по самому широкому элементу набора данных, как сейчас).

## Decisions

### 1. Отдельный enum `WheelWidthMode` вместо новых значений `WheelAlignment`

```kotlin
/**
 * Режим распределения ширины между колёсами при фиксированной ширине компонента.
 */
enum class WheelWidthMode {
    /** Mixed => CenterContent, иначе Equal. Совместимость с поведением до введения параметра. */
    Auto,
    /** Все колёса занимают равную долю доступной ширины */
    Equal,
    /** Колёса, кроме крайних, измеряются по ширине контента; крайние делят остаток поровну */
    CenterContent,
}
```

Объявляется в `Wheel.kt` рядом с `WheelAlignment` (конвенция компонента: все enum-ы в `Wheel.kt`).

**Альтернатива — значение `WheelAlignment.MixedCentered`** (эксперимент в рабочем дереве): дешевле на один кейс, но enum окончательно перестаёт быть ортогональным — каждая будущая пара «ширина × выравнивание» требует нового значения (`EqualCentered`, `StartMixed`, …). Отклонено.

### 2. Обратная совместимость через `Auto`

Резолв выполняется один раз в `Wheel()`, до входа в measure:

```kotlin
val effectiveWidthMode = widthMode.resolveFor(alignment)
// Auto + alignment == Mixed -> CenterContent; Auto + любой другой -> Equal
```

`WheelStyle.Builder.style()` дефолт `widthMode ?: WheelWidthMode.Auto`; параметр `Wheel(widthMode: WheelWidthMode = style.widthMode)`. Все существующие consumers (включая сгенерированные `WheelStyles.kt`, которые `.widthMode(...)` не вызывают) получают идентичное поведение. Специальный случай `Mixed` живёт ровно в одном чистом методе `resolveFor`, а не размазан по measure-логике.

**Альтернатива — дефолт `Equal` + депрекация шириновой части `Mixed`:** ломает визуал существующих брендов без явного запроса. Отклонено.
**Альтернатива — `WheelWidthMode?` в стиле:** nullable в публичном интерфейсе и билдере хуже, чем явный `Auto`; KDoc `Auto` документирует правило.

### 3. API-поверхность: и `WheelStyle`, и параметр `Wheel(...)`

Симметрично `alignment`/`itemAlignment`: новый параметр `widthMode` в `Wheel(...)` после `alignment`, поле `widthMode` в `WheelStyle`, метод `fun widthMode(widthMode: WheelWidthMode): WheelStyleBuilder` — по чек-листу из пяти мест `WheelStyle.kt`, как это делалось для `textAfterMode` (`val` интерфейса → `fun` билдера → `override val` в `DefaultWheelStyle` → nullable-поле + `apply` в `Builder` → дефолт в `style()`).

Параметр с дефолтом меняет JVM-сигнатуру `Wheel(...)` — фиксация через BCV `apiDump` трёх файлов (`api/uikit-compose.api`, `api/android/`, `api/jvm/`). В версии 0.x добавление параметров с дефолтом практикой проекта допустимо.

### 4. Measure-логика: `WheelLayout` принимает уже разрешённый режим

- `WheelLayout` вместо `alignment` для ширины получает `widthMode: WheelWidthMode` (`Equal | CenterContent`, `Auto` внутрь не попадает).
- `shouldStretchWheel(widthMode, wheelIndex, wheelCount) = widthMode != CenterContent || wheelIndex == 0 || wheelIndex == wheelCount - 1`.
- `getBaseWheelAlignment(alignment, wheelIndex, wheelCount)` — без изменений (только контентное выравнивание).
- Оба метода помечаются `internal` (прецедент `calculateLoopingInitialFirstVisibleItemIndex` в `BaseWheel.kt`) и покрываются юнит-тестом в `androidUnitTest` по образцу `BaseWheelLoopingTest` (чистый JUnit4, без Compose-правила).
- `resolveFor(alignment)` — тоже `internal`, тестируется напрямую.

### 5. Крайние семантики (фиксируются тест-кейсами)

- `wheelCount == 1`: колесо одновременно крайнее → `CenterContent ≡ Equal` (вся ширина).
- `wheelCount == 2`: оба колеса крайние → `CenterContent ≡ Equal`.
- Нет фиксированной внешней ширины → `stretchWheels == false`, все колёса компактные, режим ширины не применяется (как сейчас).
- `wheelConstraints` по-прежнему ограничивает компактные колёса: `Strict` — не больше `1/N`, `Loose` — без лимита; взаимодействие: `CenterContent + Strict` ограничивает и центр сверху.

### 6. Кодогенерация и меты — без правок плагина

KSP (`ApiInfoProcessorProvider.extractEnumValues`) собирает значения enum-параметра `widthMode` в `ComposeValuePropertyMeta`; `ValuePropertyMapper` резолвит строки конфига (`"auto"`, `"equal"`, `"centerContent"`/`"center-content"`) в константы и добавляет импорт enum'а. При отсутствии `widthMode` в конфиге вызов не генерируется → дефолт `Auto`. Новый вариант стилей для брендов появляется правкой внешнего `theme-converter` (`wheel_config.json`: binding + значение props) и bump'ом `components-version` — вне объёма этого изменения.

### 7. Удаление эксперимента `MixedCentered`

Из рабочего дерева `Wheel.kt` удаляется незакоммиченное значение `WheelAlignment.MixedCentered` (KDoc-копия `Mixed`, нереализованная логика, отсутствие в BCV-бейзлайне). Пары `Center + CenterContent` достаточно. Прочие незакоммиченные эксперименты (локальный source theme-converter в `ThemeBuilderPlugin.kt`, ручная правка сгенерированного `plasma.homeds.compose/.../WheelStyles.kt`, `wheelConstraints = Loose` в `WheelStory`) в состав изменения не входят и до коммита ревьюятся/откатываются отдельно.

## Risks / Trade-offs

- **[Trade-off] `Auto` в публичном enum — тристатное значение**: плата за бинарную и визуальную совместимость; KDoc явно описывает правило резолва, миграция на явные `Equal/CenterContent` возможна позже без брейка.
- **[Trade-off] `CenterContent + Strict` ограничивает центр 1/N**: для очень широких значений центр обрежется — документированное следствие `wheelConstraints`, вариант без лимита — `Loose`.
- **[Риск] Тихий skip неизвестного enum-значения в Compose-генераторе** (`ValuePropertyMapper.map` возвращает `""`): опечатка в конфиге `widthMode` молча оставит `Auto`. Принимаем как существующее поведение генератора; заметим в доке для конфигующих.
- **[Риск] Локальные `apiDump` падают по TLS-резолву `kotlin-metadata-jvm`** (задокументировано в архивных change'ах) — тогда `.api`-файлы правятся вручную по формату BCV и перепроверяются `apiCheck`/CI.
- **[Trade-off] Скриншотные кейсы добавляют новые золотые PNG** в токены — ожидаемое следствие, рекординг `recordRoborazzi*` в задачах.
