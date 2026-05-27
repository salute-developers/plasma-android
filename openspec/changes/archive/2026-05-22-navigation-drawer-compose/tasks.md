## 1. sdds-core/uikit-compose Public API

- [x] 1.1 Добавить `NavigationDrawerValue : ValueState` со значениями `Expanded` и `Collapsed`.
- [x] 1.2 Добавить публичный `NavigationDrawerState` с `currentValue`, `targetValue`, `progress`, `isExpanded`, `isCollapsed`, `isAnimationRunning`, `expand()`, `collapse()` и `snapTo(...)`.
- [x] 1.3 Добавить internal `NavigationDrawerStateImpl` и `rememberNavigationDrawerState(...)` с `rememberSaveable`.
- [x] 1.4 Добавить публичный `NavigationDrawer(...)` как slot-based layout container с параметрами `state`, `style`, `motion`, `expandOnFocus`, `header`, `footer` и `content`.
- [x] 1.5 Добавить публичный `NavigationDrawerItem(...)` со slot API для обязательного `icon`, `titleContent`, `endContent` и `indicator`, а также `selected`, `enabled`, `onClick` и style/motion параметрами.
- [x] 1.6 Добавить KDoc для всех новых public API и проверить согласованность терминов `Expanded`, `Collapsed`, `expandOnFocus`.

## 2. sdds-core/uikit-compose Styles

- [x] 2.1 Добавить `LocalNavigationDrawerStyle`, `NavigationDrawerStyle`, `NavigationDrawerStyleBuilder`, `NavigationDrawerColors`, `NavigationDrawerDimensions` и default implementation.
- [x] 2.2 Добавить в `NavigationDrawerStyle` non-null `StatefulValue` свойства для shape, shadow, selector visual properties, всех visual dimensions и `itemStyle: NavigationDrawerItemStyle`.
- [x] 2.3 Добавить `LocalNavigationDrawerItemStyle`, самостоятельный `NavigationDrawerItemStyle`, builder и default implementation.
- [x] 2.4 Добавить в `NavigationDrawerItemStyle` drawer-specific non-null `StatefulValue` свойства для shape, background, title/icon colors, dimensions, paddings, icon sizing и indicator positioning.
- [x] 2.5 Для drawer colors добавить builder overloads для `StatefulValue<Brush>`, `InteractiveColor`, `Color` и `Brush`.
- [x] 2.6 Для item colors добавить builder overloads для `StatefulValue<Brush>`, `InteractiveColor`, `Color` и `Brush`.
- [x] 2.7 Обеспечить default styles без nullable visual fallbacks.

## 3. sdds-core/uikit-compose Motion

- [x] 3.1 Добавить `NavigationDrawerMotionStyle`, builder, `LocalNavigationDrawerMotionStyle` и `rememberNavigationDrawerMotion(...)`.
- [x] 3.2 Добавить `NavigationDrawerItemMotionStyle`, builder, `LocalNavigationDrawerItemMotionStyle` и `rememberNavigationDrawerItemMotion(...)`.
- [x] 3.3 Подключить `NavigationDrawerValue` в `MotionContext` как внешний `ValueState` для expanded/collapsed transitions.
- [x] 3.4 Реализовать получение animated/stateful значений через `StatefulValue<T>.get*AsState(...)` и соответствующие `MotionProperty<T>`.
- [x] 3.5 Не использовать hardcoded локальные animation specs для expanded/collapsed visual transitions вне `MotionStyle`.
- [x] 3.6 Для shape/shadow обеспечить stateful resolution; если полноценная интерполяция невозможна текущими helpers, использовать snap/noMotion поведение.
- [x] 3.7 Подключить motion для container-level selector movement и visual values.
- [x] 3.8 Добавить motion properties для dimens `NavigationDrawerItemStyle` и enter/exit specs для `AnimatedVisibility` slots.

## 4. sdds-core/uikit-compose Internal Layout

- [x] 4.1 Создать internal package `internal/navigationdrawer`.
- [x] 4.2 Реализовать internal container layout для header, body/content и footer без переиспользования публичного `Drawer`.
- [x] 4.3 Реализовать collapsed/expanded width через измерение/layout drawer, а не через offset/peek clipping expanded панели.
- [x] 4.4 Реализовать `expandOnFocus`: focus inside subtree вызывает `state.expand()`, focus leaving subtree вызывает `state.collapse()`.
- [x] 4.5 Предоставлять `NavigationDrawerStyle.itemStyle` descendants через `LocalNavigationDrawerItemStyle`.
- [x] 4.6 Убедиться, что collapsed drawer остается видимым и item-ы остаются интерактивными.
- [x] 4.7 Не добавлять drag/gesture resize behavior для expanded/collapsed переходов.
- [x] 4.8 Реализовать internal selected item registration/measurement для container-level selector без публичного adapter API.
- [x] 4.9 Реализовать container-level selector по аналогии с `Tabs` indicator: draw behind items, align to selected item bounds, update on selected item/state changes, не анимировать initial selection.
- [x] 4.10 Отрисовывать container-level selector через draw layer контейнера без отдельного layout node; кешировать outline geometry через `drawWithCache`, не пересоздавая его на каждый frame движения selector-а.

## 5. sdds-core/uikit-compose NavigationDrawerItem

- [x] 5.1 Реализовать `NavigationDrawerItem` на основе `BaseCell`.
- [x] 5.2 В expanded состоянии показывать основной title/content, `endContent` и размещать indicator в end зоне.
- [x] 5.3 В collapsed состоянии скрывать основной title/content и `endContent`, размещать indicator overlay поверх icon/start зоны.
- [x] 5.4 Передавать selected/enabled/interaction states вместе с expanded/collapsed state в style и motion resolution.
- [x] 5.5 Обеспечить tint/brush propagation для icon/start content через существующие composition local patterns.
- [x] 5.6 Сохранить standalone usage item-а через явный `style` без обязательного parent `NavigationDrawer`.
- [x] 5.7 Определить и реализовать порядок отображения `endContent` и `indicator` в expanded состоянии, когда оба слота переданы.

## 6. sdds-core/plugin_theme_builder

- [x] 6.1 Исследовать существующие Compose style generators для близких компонентов (`Drawer`, `Cell`, `Counter`, `Tabs`) и определить точки расширения для `NavigationDrawer`.
- [x] 6.2 Добавить Theme Builder генератор Compose styles для `NavigationDrawerStyle`.
- [x] 6.3 Добавить Theme Builder генератор Compose styles для `NavigationDrawerItemStyle`.
- [x] 6.4 Обеспечить генерацию `itemStyle` внутри `NavigationDrawerStyle` со ссылкой на соответствующий generated `NavigationDrawerItemStyle`.
- [x] 6.5 Обеспечить генерацию non-null `StatefulValue<T>` для visual properties и `StatefulValue<Brush>` для color-like properties.
- [x] 6.6 Добавить или обновить generator tests и expected output fixtures для `NavigationDrawer` и `NavigationDrawerItem` (не требуется по решению владельца задачи).

## 7. Fixtures, Docs, and Samples

- [x] 7.1 Добавить Compose fixtures/samples для `NavigationDrawer` с header, footer и несколькими item-ами.
- [x] 7.2 Добавить samples для expanded/collapsed, selected/unselected, selector, indicator, `endContent` и `expandOnFocus`.
- [x] 7.3 Добавить или обновить docs template для Compose `NavigationDrawerUsage.md`.
- [x] 7.4 Добавить component registration в sandbox/integration metadata, если это требуется для отображения компонента в demo apps.
- [x] 7.5 Проверить generated Compose variations в token modules, если реализация обновляет token configuration или generated outputs.

## 8. Tests and Validation

- [x] 8.1 Focused unit/Compose tests для `NavigationDrawerState` и `rememberNavigationDrawerState` не добавлять по решению владельца задачи.
- [x] 8.2 Compose UI tests или fixtures assertions для expanded/collapsed layout behavior не добавлять по решению владельца задачи.
- [x] 8.3 Screenshot tests для expanded/collapsed, selected/unselected, selector, indicator, optional content slots, header/footer не добавлять по решению владельца задачи.
- [x] 8.4 Проверить, что существующий `Drawer` и View `NavigationDrawer` не изменены поведенчески.
- [x] 8.5 Проверить, что `NavigationDrawer` не реагирует на drag/gesture как на способ раскрытия/схлопывания.
- [x] 8.6 Запустить focused validation для `sdds-core/uikit-compose` из корня репозитория.
- [x] 8.7 Запустить focused validation для `sdds-core/plugin_theme_builder` generator tests из корня репозитория.
- [x] 8.8 При готовности к merge запустить `./gradlew detektAll` и релевантные тестовые задачи; при широких изменениях рассмотреть `./gradlew testAll`.
