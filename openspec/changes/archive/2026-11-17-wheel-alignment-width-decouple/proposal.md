## Why

Публичный enum `WheelAlignment` (`com.sdds.compose.uikit`, `sdds-core/uikit-compose`) одновременно кодирует две независимые вещи:

1. **выравнивание контента внутри каждого колеса** (`getBaseWheelAlignment`, `Wheel.kt:345`);
2. **распределение ширины между колёсами** (`shouldStretchWheel`, `Wheel.kt:338`) — значение `Mixed` помимо «контент стянут к центру» неявно включает режим ширины «центральное колесо по контенту, боковые делят остаток».

Из-за этой связки в дизайн-системе невозможно выразить состояние с макетов: **центральное колесо по ширине контента, боковые — на остаток, контент во всех колёсах отцентрован**. Единственный режим с нужным распределением ширины (`Mixed`) жёстко навязывает выравнивание контента `End/Center/Start`, а режим с отцентрованным контентом (`Center`) даёт равные ширины 1/N. Ни `wheelConstraints`, ни `dataEdgePlacement` на распределение ширины не влияют, `BaseWheel` — internal. Единственный доступный обход — собирать три одноколёсных `Wheel` в `Row` вручную, копируя логику селектора и разделителей.

Решение — вынести распределение ширины в отдельный ортогональный параметр `WheelWidthMode`, оставив `WheelAlignment` ответственным только за выравнивание контента.

## What Changes

- Вводится enum `WheelWidthMode` со значениями `Auto`, `Equal`, `CenterContent` (в `Wheel.kt`, рядом с `WheelAlignment`).
- `WheelStyle` получает свойство `widthMode: WheelWidthMode` (по умолчанию `Auto`), `WheelStyleBuilder` — метод `widthMode(widthMode)`.
- `Wheel(...)` получает параметр `widthMode: WheelWidthMode = style.widthMode` (симметрично существующему `alignment`).
- Значение `Auto` сохраняет обратную совместимость: резолвится в `CenterContent` при `alignment == Mixed` и в `Equal` при любом другом `alignment`. Поведение всех существующих вызовов (включая сгенерированные токены) не меняется.
- Логика распределения ширины (`shouldStretchWheel`) переписана на `widthMode` вместо `alignment`; `getBaseWheelAlignment` остаётся ответственным только за выравнивание контента.
- Нужное макетное состояние выражается как `alignment = WheelAlignment.Center` + `widthMode = WheelWidthMode.CenterContent`.
- Из рабочего дерева удаляется незакоммиченная экспериментальная правка `WheelAlignment.MixedCentered` (не реализована, отсутствует в BCV-бейзлайне, функционально покрывается парой `Center + CenterContent`).
- **Изменение обратно совместимо на уровне исходников**: новый enum и новое поле билдера с дефолтом `Auto`; существующие вызовы меняют поведение только если явно запрашивают новый `widthMode`.

## Capabilities

### New Capabilities

- `wheel-compose-width-mode`: Режим распределения ширины между колёсами — равные ширины (`Equal`) или «центр по контенту, боковые на остаток» (`CenterContent`), с совместимым режимом `Auto`. Включает новый enum, поле/билдер `WheelStyle`, параметр `Wheel`, переключение `shouldStretchWheel` на `widthMode` и поддержку в конфигурационном builder-API.

### Modified Capabilities

- Существующие спеки (`wheel-compose-looping`, `wheel-compose-selection-indicator`, `wheel-text-after-mode`) не затрагиваются на уровне требований. Контракт `WheelAlignment` сужается документационно (enum описывает только выравнивание контента), видимое поведение `Mixed` сохраняется через `Auto` — изменений на уровне требований нет.

## Impact

- **`sdds-core`**:
  - `uikit-compose` — основные изменения: `Wheel.kt` (новый enum, параметр `Wheel`, `shouldStretchWheel`, резолв `Auto`), `WheelStyle.kt` (поле `widthMode`, метод билдера, `DefaultWheelStyle`, дефолт `Auto`).
  - `plugin_theme_builder` — изменения кода **не требуются**: универсальный генератор (`UniversalComposeVariationGenerator` + `ValuePropertyMapper`) резолвит enum-свойства по KSP-мете автоматически; новое поле `widthMode` попадёт в мету через `@ApiInfo`/KSP.
- **`integration-core`** — новые тест-кейсы в `uikit-compose-testcases` (`WheelTestCases`), doc-сэмпл в `uikit-compose-fixtures` (`WheelSamples`), поле `widthMode` в `WheelStory`/`WheelUiState`.
- **`tokens`** — при добавлении `widthMode` в brand-конфиги theme-converter (внешний репозиторий) пересобираются сгенерированные `WheelStyles.kt`; новых скриншотных кейсов достаточно в `plasma.homeds.compose`/`plasma-stards-compose`.
- **`build-system`** — обновление док-шаблона `docs-template/compose-template/docs/components/WheelUsage.md` (раздел `### WheelAlignment` + новый `### WheelWidthMode`).
- **Публичное API** — аддитивно: JVM-подпись `Wheel(...)` расширяется параметром по умолчанию (три BCV `.api`-файла), `WheelStyle`/`WheelStyleBuilder` получают новое поле/метод. View-стек не затрагивается.
- **Валидация** — `./gradlew :sdds-core:uikit-compose:apiDump` затем отдельно `apiCheck`; компиляция `uikit-compose` и `uikit-compose-fixtures`; `detekt`; скриншотные прогоны токенов.
