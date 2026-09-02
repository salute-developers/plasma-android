## Why

У Compose `CheckBox` (`sdds-core/uikit-compose`) сегодня есть только два визуальных состояния значения — галочка (On) и палочка (Indeterminate). Продукту нужен третий, равноправный глиф — крестик, сигнализирующий, что элемент помечен как ошибочный/невалидный извне (например, результатом валидации формы), а не просто снят/выбран пользователем. Добавить это нужно так, чтобы не сломать ни один существующий вызов `CheckBox(...)`.

## What Changes

- Вводится новое value-состояние **Error** — равноправное с On/Off/Indeterminate, взаимоисключающее с ними, доступное только программно (не как результат клика по компоненту).
- Публичный тип состояния расширяется через **новый параллельный enum** и **новые перегрузки** `CheckBox(...)`; существующие перегрузки на `androidx.compose.ui.state.ToggleableState` не меняются — `ToggleableState` закрытый enum AndroidX и не может быть расширен четвёртым значением.
- Крестик рисуется тем же parametric-path механизмом, что и галочка/палочка (`CheckBoxControl.kt`), с собственной анимацией reveal и кроссфейд-переходом при прямом переключении Checked/Indeterminate ↔ Error.
- Стилевой слой (`CheckBoxStates : ValueState`, `CheckBoxColorValues`) расширяется значением `Error` по уже существующему паттерну — без breaking changes.
- Демо в сэндбоксе (`CheckBoxStory`, `CheckBoxGroupStory`) дорабатывается, чтобы новое состояние было доступно для просмотра и участвовало в demo-логике roll-up состояния группы.
- Скоуп — **только Compose**. View-система (`sdds-core/uikit`) не затрагивается.

## Capabilities

### New Capabilities
- `checkbox-error-state`: value-состояние Error для Compose `CheckBox` — публичный API, отрисовка крестика, тайминг анимации/переходов, стилевой контракт.

### Modified Capabilities
*(нет — в `openspec/specs/` не существует ранее задокументированной capability для `CheckBox`/`CheckBoxGroup`, требования переносить неоткуда)*

## Impact

- **Публичный API**: `sdds-core/uikit-compose` — новый enum состояния + новые composable-перегрузки `CheckBox(...)` в `CheckBox.kt`. Существующие перегрузки, сигнатуры и поведение не меняются (additive-only).
- **Внутренняя отрисовка**: `BaseCheckBox.kt`, `CheckBoxControl.kt` — новая ветка геометрии/анимации крестика, консолидация текущих 4 разрозненных `when(state)` в единую таблицу состояние → рендер-рецепт.
- **Стили**: `CheckBoxStyle.kt` (`CheckBoxStates`, `CheckBoxColorValues`) — новое значение `Error` с fallback-цветом в ядре (`sdds-core/uikit-compose`). Генерируемые per-brand файлы `tokens/*/styles/checkbox/CheckBoxStyles.kt` (giga, finai, sbcom, serv, stards, homeds и др.) — **вне скоупа этого изменения**: они помечены `AUTO-GENERATED. DO NOT MODIFY` и генерируются themebuilder-пайплайном из токен-источников в отдельном репозитории `theme-converter` (`checkbox_config.json` по вертикалям). Донастройка per-brand цветов (включая новые цветовые схемы вроде `Positive` для `plasma_giga`) ведётся владельцем токенов отдельно, вне этого changes.
- **Кодогенерация**: `@ApiStateSet(components = ["CheckBox"])` участвует в api-info/themebuilder генерации — возможен ripple-эффект при появлении нового значения, требует проверки после реализации.
- **Sandbox/demo**: `integration-core/uikit-compose-fixtures` — `CheckBoxStory.kt`, `CheckBoxGroupStory.kt`. `CheckBoxGroup.kt` сам по себе не меняется (чистый layout-контейнер, не хранит state).
- **Тесты**: возможен запуск/актуализация screenshot-тестов (`*CheckBoxScreenshotTest.kt`) в затронутых brand-модулях после появления нового глифа.
