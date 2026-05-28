## Why

В дизайн-системе отсутствует компонент заголовка для AI-интерфейсов. Компонент `AiHeader` закрывает эту потребность: предоставляет стандартизированный шапочный блок с двумя слотами для кнопок и текстовым блоком (title + subtitle) с настраиваемым выравниванием, divider-ом и полной поддержкой токенов.

## What Changes

- **Новый Composable `AiHeader`** в `sdds-core/uikit-compose` — самостоятельный компонент на базе Row/Column с двумя слотами `IconButton` по краям, текстовым блоком title/subtitle и разделителем внизу.
- **Стиль компонента** — `AiHeaderStyle`, `AiHeaderStyleBuilder`, `AiHeaderColors`, `AiHeaderColorsBuilder`, `AiHeaderDimensions`, `AiHeaderDimensionsBuilder` в `sdds-core/uikit-compose`.
- **Конфиг и генератор стиля** — `AiHeaderConfig`, `AiHeaderConfigDelegate`, `AiHeaderComposeVariationGenerator` в `sdds-core/plugin_theme_builder`.
- Регистрация компонента в `ComponentDelegates` под ключом `"ai-header"`.

## Capabilities

### New Capabilities

- `ai-header-component`: Реализация Composable-компонента AiHeader — Row-layout с двумя опциональными слотами IconButton по краям, Column с title/subtitle в центре, настраиваемым горизонтальным выравниванием текстового блока (start/center/end) и Divider внизу по флагу `hasDivider`.
- `ai-header-style`: Стиль компонента AiHeader — интерфейс `AiHeaderStyle`, билдеры, `AiHeaderColors`/`AiHeaderDimensions` с их билдерами, `LocalAiHeaderStyle` CompositionLocal. Стиль провайдит `ButtonStyle` для IconButton-слотов и `TextStyle`/цвет для title и subtitle.
- `ai-header-theme-builder`: Конфиг `AiHeaderConfig`, делегат `AiHeaderConfigDelegate` и генератор Compose-вариаций `AiHeaderComposeVariationGenerator` в `plugin_theme_builder`; регистрация в `ComponentDelegates`.

### Modified Capabilities

## Impact

- `sdds-core/uikit-compose` — новые публичные файлы `AiHeader.kt`, `AiHeaderStyle.kt`; изменений в существующих файлах нет.
- `sdds-core/plugin_theme_builder` — новый пакет `components/aiheader`, обновление `ComponentDelegates.kt`.
- Публичный API: новый компонент и стиль; breaking changes отсутствуют.
- Токены: компонент потребляет токены активной темы через `LocalAiHeaderStyle`.
- Docs generation: KDoc в новых файлах подхватывается `docs-ksp` автоматически.
