## Why

В `sdds-core/uikit-compose` отсутствует Compose-реализация `NavigationDrawer`, хотя компонент уже описан в Figma и существует в Android View UI Kit. Это мешает использовать единый navigation rail/drawer паттерн в Compose-приложениях SDDS и генерировать корректные styles для дизайн-систем.

## What Changes

- Добавить публичный Compose-компонент `NavigationDrawer` как layout-контейнер с областями header, content/body и footer.
- Добавить публичный Compose-компонент `NavigationDrawerItem`, предназначенный для использования внутри `NavigationDrawer`, но пригодный и для standalone-сценариев.
- Добавить `NavigationDrawerState` и `NavigationDrawerValue : ValueState` для управления состояниями `Expanded` и `Collapsed`.
- Добавить `rememberNavigationDrawerState(...)` с командами `expand()`, `collapse()` и `snapTo(...)`.
- Добавить `expandOnFocus`, чтобы drawer раскрывался при получении фокуса внутри subtree и схлопывался при потере фокуса.
- Поддержать только программное раскрытие/схлопывание и раскрытие по фокусу; drag/gesture механика не входит в поведение компонента.
- Добавить `NavigationDrawerStyle`, `NavigationDrawerItemStyle`, `NavigationDrawerMotionStyle` и `NavigationDrawerItemMotionStyle`.
- Добавить container-level selector выбранного item-а по аналогии с selector/indicator подходом в `Tabs`.
- Все визуальные свойства стилей должны храниться как non-null `StatefulValue<T>`, включая цвета, типографику, dimensions, shape и container shadow.
- Цветовые свойства должны храниться как `StatefulValue<Brush>`, а style builders должны иметь convenient overloads для `StatefulValue<Brush>`, `InteractiveColor`, `Color` и `Brush`.
- `NavigationDrawerStyle` должен задавать `itemStyle: NavigationDrawerItemStyle`, который используется item-ами по умолчанию через composition local.
- `NavigationDrawerItem` должен предусматривать обязательный слот `icon` и опциональные слоты `titleContent`, `endContent` и `indicator`. `labelContent` и `subtitleContent` не входят в API item-а.
- `NavigationDrawerItemStyle` должен быть самостоятельным `Style`, а не наследником `CellStyle`; runtime adapter к `CellStyle` допускается только как internal implementation detail.
- Добавить поддержку `NavigationDrawer` и `NavigationDrawerItem` в Theme Builder, чтобы Compose styles генерировались из токенов дизайн-систем.
- Реализация не должна строиться поверх публичного `Drawer`, потому что `Collapsed` является видимым интерактивным состоянием, а не закрытой панелью с peek offset. `Drawer` можно использовать только как архитектурный референс для state API, header/body/footer layout и focus behavior.

## Capabilities

### New Capabilities

- `navigation-drawer-compose`: Compose NavigationDrawer layout container, item component, state, styles, motion styles, focus expansion behavior, and style contracts.

### Modified Capabilities

- None.

## Impact

- Affected included build: `sdds-core`.
- Primary module: `sdds-core/uikit-compose`.
- Public API impact: new public Compose components, state objects, values, styles, motion styles, builders and composition locals.
- Internal implementation impact: new internal package under `sdds-core/uikit-compose/src/main/kotlin/com/sdds/compose/uikit/internal/navigationdrawer/`.
- Theme Builder impact: add or update generators in `sdds-core/plugin_theme_builder` for `NavigationDrawer` and `NavigationDrawerItem` Compose styles.
- Token impact: generated Compose style outputs in `tokens` must be able to include `NavigationDrawer` variations and references to `NavigationDrawerItemStyle`.
- Docs/testing impact: add or update Compose fixtures, samples and docs templates for expanded/collapsed, selected/unselected, indicator, header/footer and `expandOnFocus` behavior. Focused tests are not required by owner decision for this change.
- Gradle conventions: no expected changes.
