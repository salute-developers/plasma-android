## Why

`AiHeaderDimensions` хранит все отступы и размеры как plain `Dp`, что не даёт системе Motion анимировать их и не позволяет задавать разные значения для разных интерактивных состояний. Для согласованности с паттерном `NavigationDrawerDimensions` все поля должны быть `StatefulValue<Dp>`.

## What Changes

- `AiHeaderDimensions`: все 10 полей (`paddingStart`, `paddingEnd`, `paddingTop`, `paddingBottom`, `textPaddingStart`, `textPaddingEnd`, `textPaddingTop`, `textPaddingBottom`, `subtitlePadding`, `dividerThickness`) меняют тип с `Dp` на `StatefulValue<Dp>` — **BREAKING**
- `AiHeaderDimensionsBuilder`: добавляются абстрактные `StatefulValue<Dp>`-перегрузки для всех 10 сеттеров; существующие `Dp`-сеттеры становятся default-методами, делегирующими через `asStatefulValue()`
- `AiHeaderMotionStyle` / `AiHeaderMotionStyleBuilder`: добавляются 10 полей `MotionProperty<Dp>` — по одному на каждый параметр dimensions
- `AiHeader.kt`: резолв размеров через `getDpAsState(motion.context, motion.style.paddingX)` вместо прямого использования `Dp`

## Capabilities

### New Capabilities

_нет_

### Modified Capabilities

- `ai-header-style`: тип полей `AiHeaderDimensions` меняется с `Dp` на `StatefulValue<Dp>`; `AiHeaderMotionStyle` расширяется `MotionProperty<Dp>` для всех dimension-полей; компонент резолвит размеры через Motion API

## Impact

- `sdds-core/uikit-compose` — изменение публичного API: `AiHeaderDimensions`, `AiHeaderDimensionsBuilder`, `AiHeaderMotionStyle`, `AiHeaderMotionStyleBuilder`
- `sdds-core/uikit-compose` — `AiHeader.kt` (внутренняя логика резолва)
- `tokens/*` — сгенерированные стили компилируются без изменений: генератор уже вызывает `Dp`-перегрузку билдера, которая станет default-методом
