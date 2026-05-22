## Context

`sdds-core/uikit-compose` уже содержит обычный `Drawer`, `DrawerState`, `DrawerContent` и `DrawerLayout`, но их модель описывает выезжающую панель с состояниями opened/closed. Для `NavigationDrawer` collapsed-состояние должно оставаться видимым и интерактивным navigation rail, поэтому `Drawer` нельзя использовать как базовую реализацию.

В Android View UI Kit уже есть `NavigationDrawer`, но он построен вокруг `ViewGroup`, `RecyclerView`, imperative `Item.Builder` и drawable-state модели. Compose-реализация должна быть slot-based layout-контейнером и использовать существующие Compose-паттерны `Style`, `StatefulValue`, `Motion`, `CompositionLocal` и internal base-компоненты.

Ближайшие референсы в кодовой базе:
- `Drawer.kt` и `internal/drawer/*` для формы state API, header/body/footer layout и focus behavior.
- `Counter.kt` и `motion/components/counter/*` для пары `Style` + `MotionStyle`.
- `Cell.kt`, `CellStyle.kt` и `internal/cell/BaseCell.kt` для построения `NavigationDrawerItem`.
- `StatefulValue.kt` и `MotionContext.kt` для поддержки custom `ValueState`.

## Goals / Non-Goals

**Goals:**

- Добавить Compose `NavigationDrawer` как layout-контейнер с header, body/content и footer слотами.
- Добавить `NavigationDrawerItem` на основе `BaseCell`.
- Добавить state object с `Expanded`/`Collapsed`, suspend-командами и saveable factory.
- Поддержать `expandOnFocus`, раскрывающий drawer при фокусе внутри subtree.
- Ограничить раскрытие/схлопывание программным управлением и фокусом; drag/gesture resize не реализовывать.
- Поддержать анимированный переход expanded/collapsed через `MotionStyle`, без hardcoded animation spec в компоненте.
- Добавить container-level selector выбранного item-а по аналогии с `Tabs` indicator/selector подходом.
- Сделать все визуальные значения стилей non-null `StatefulValue<T>`.
- Хранить цвета как `StatefulValue<Brush>` и дать builder overloads для `StatefulValue<Brush>`, `InteractiveColor`, `Color`, `Brush`.
- Дать `NavigationDrawerStyle.itemStyle`, чтобы drawer централизованно задавал стиль item-ов.
- Предусмотреть в `NavigationDrawerItem` обязательный слот `icon` и опциональные слоты `titleContent`, `endContent` и `indicator`; `labelContent` и `subtitleContent` не поддерживать.
- Реализовать поддержку `NavigationDrawer` и `NavigationDrawerItem` в Theme Builder для генерации Compose styles из токенов.
- Сохранить публичное API в `com.sdds.compose.uikit`, а implementation details вынести в `internal/navigationdrawer`.

**Non-Goals:**

- Не реализовывать `NavigationDrawer` через публичный `Drawer`.
- Не переносить imperative XML API с `Item.Builder`, внутренним RecyclerView/list adapter и `setItems`.
- Не добавлять overlay, close icon, moveContent или peekOffset семантику обычного `Drawer`.
- Не добавлять drag/gesture механику раскрытия и схлопывания.
- Не менять существующий View `NavigationDrawer`.
- Не менять общую архитектуру Theme Builder за пределами поддержки нового компонента.

## Decisions

### Отдельная state model вместо DrawerState

Ввести `NavigationDrawerValue : ValueState` со значениями `Expanded` и `Collapsed`, публичный `NavigationDrawerState` и internal `NavigationDrawerStateImpl`.

Предлагаемый контракт:

```kotlin
enum class NavigationDrawerValue : ValueState {
    Expanded,
    Collapsed,
}

@Stable
interface NavigationDrawerState {
    val currentValue: NavigationDrawerValue
    val targetValue: NavigationDrawerValue
    val progress: Float
    val isExpanded: Boolean
    val isCollapsed: Boolean
    val isAnimationRunning: Boolean

    suspend fun expand()
    suspend fun collapse()
    suspend fun snapTo(targetValue: NavigationDrawerValue)
}
```

`NavigationDrawerState` отвечает за семантическое состояние, команды и read-only progress раскрытия, но не хранит spec анимации. Анимация визуальных значений должна задаваться через `NavigationDrawerMotionStyle` и `NavigationDrawerItemMotionStyle`.

Альтернатива: переиспользовать `DrawerState` и `DrawerValue.Opened/Closed`. Это отклонено, потому что `Closed` в `Drawer` означает смещенную панель с peek, а `Collapsed` в `NavigationDrawer` является полноценным интерактивным layout-состоянием.

### Layout container вместо item model

`NavigationDrawer` должен быть Compose layout-контейнером:

```kotlin
NavigationDrawer(
    state = rememberNavigationDrawerState(),
    header = { ... },
    footer = { ... },
) {
    NavigationDrawerItem(...)
}
```

Компонент не должен владеть списком items, selection model или adapter-логикой. Потребитель управляет item-ами через Compose content slot.

Альтернатива: создать data-driven API с `items: List<NavigationDrawerItemData>`. Это отклонено для первой версии, потому что слот API лучше соответствует Compose, позволяет произвольный контент и не навязывает selection/navigation модель.

### Programmatic and focus-only state changes

`NavigationDrawer` должен переходить между `Expanded` и `Collapsed` только через публичные команды `NavigationDrawerState`, внешний state control и `expandOnFocus`. Drag/gesture resize не нужен.

Альтернатива: использовать `AnchoredDraggableState` по аналогии с `Drawer`. Это отклонено, потому что текущий компонент не должен быть жестовым drawer-ом, а добавление drag anchors усложнит state/motion модель без актуального требования.

### Drawer только как референс

`Drawer` можно использовать как референс для:
- `remember...State(...)` + saveable state factory;
- header/body/footer measurement;
- `expandOnFocus` поведения на subtree;
- surface styling pattern.

Нельзя переиспользовать:
- `DrawerLayout` и anchored draggable offset-модель;
- `DrawerValue`, `DrawerState`, `peekOffset`, overlay, close/dismiss semantics;
- hardcoded animation spec из `DrawerStateImpl`.

### Stateful visual style contract

Все визуальные свойства в `NavigationDrawerStyle` и `NavigationDrawerItemStyle` должны быть non-null `StatefulValue<T>`. Container shadow относится только к `NavigationDrawerStyle`; `NavigationDrawerItemStyle` не содержит shadow.

Минимальная форма `NavigationDrawerStyle`:

```kotlin
interface NavigationDrawerStyle : Style {
    val shape: StatefulValue<Shape>
    val shadow: StatefulValue<ShadowAppearance>
    val colors: NavigationDrawerColors
    val dimensions: NavigationDrawerDimensions
    val itemStyle: NavigationDrawerItemStyle
}
```

`NavigationDrawerItemStyle` должен быть самостоятельным `Style`, а не наследником `CellStyle`. Он должен содержать только свойства, нужные конфигу `NavigationDrawerItem`: shape, background, title/icon colors, title/disclosure text styles, dimensions, paddings, icon size, indicator offsets, `badgeStyle` и `counterStyle`. Адаптация к `CellStyle` допускается только внутри реализации item-а.

Цветовые значения хранятся как `StatefulValue<Brush>`. Builders должны иметь overloads для `StatefulValue<Brush>`, `InteractiveColor`, `Color` и `Brush`, чтобы поддержать и generated styles, и ручную настройку.

Альтернатива: оставить container shape/shadow plain values, как в части существующих компонентов. Это отклонено, потому что требование drawer состоит в единообразной stateful-модели для visual values.

### MotionStyle owns expanded/collapsed animation

Ввести:
- `NavigationDrawerMotionStyle`
- `LocalNavigationDrawerMotionStyle`
- `rememberNavigationDrawerMotion(...)`
- `NavigationDrawerItemMotionStyle`
- `LocalNavigationDrawerItemMotionStyle`
- `rememberNavigationDrawerItemMotion(...)`

`NavigationDrawer` должен создавать `MotionContext`, который добавляет текущее и предыдущее `NavigationDrawerValue` как `ValueState`. Компонент получает animated values через `StatefulValue<T>.get*AsState(...)` и соответствующие `MotionProperty<T>`.

Переход width/background/stroke/container shape/container shadow/text/icon/indicator/dimensions values не должен использовать локальные hardcoded `animateDpAsState`, `animateColorAsState` и т.п. без `MotionStyle`.

`NavigationDrawerItemMotionStyle` также должен задавать `EnterTransition`/`ExitTransition` для `AnimatedVisibility` center content, end content и collapsed start-zone indicator.

### NavigationDrawerItem на основе BaseCell

`NavigationDrawerItem` должен использовать `BaseCell` для раскладки start/center/end контента. В публичном API предпочтительны composable slots:
- `icon`;
- основной `titleContent` slot;
- `endContent`;
- `indicator`;

В collapsed состоянии title/end content не отображаются, icon остается видимым, indicator размещается поверх icon/start зоны. В expanded состоянии title/end content отображаются, indicator размещается в end зоне после `endContent`.

`selected`, `enabled`, interaction states и `NavigationDrawerValue` должны участвовать в итоговом state set для `StatefulValue` и `Motion`, если соответствующие style values или motion properties зависят от этих состояний.

### Container-level selected selector

`NavigationDrawer` должен поддержать отдельный selector выбранного item-а на уровне container. Референс: `Tabs` использует `tabIndicator(...)`, который рисует indicator по измеренным размерам выбранного tab и умеет двигаться между позициями.

Для `NavigationDrawer` нужна вертикальная модель:
- drawer измеряет или получает bounds выбранного item-а;
- selector рисуется в draw layer контейнера за item-ами, без отдельного composable/layout node;
- selector имеет style properties для enabled, brush/color, shape, dimensions/paddings и motion;
- selector должен двигаться при изменении selected item-а и учитывать expanded/collapsed layout;
- первый initial selection не должен проигрывать selector animation; первый пользовательский переход и последующие переходы должны анимироваться;
- selected background самого item-а не заменяет container-level selector.

Selector drawing не должен влиять на layout item-ов и collapsed drawer dimensions. Для этого selected item bounds используются как источник top/height, но сам selector отрисовывается поверх root container drawing phase. `top` читается на draw-time, чтобы движение selector-а не пересоздавало geometry cache каждый frame. `height`, shape, width и paddings используются для построения cached outline через `drawWithCache`; outline должен пересоздаваться только при изменении geometry/shape inputs, а не при каждом frame вертикального movement.

Альтернатива: ограничиться selected background в `NavigationDrawerItem`. Это отклонено, потому что требуется отдельный selector, аналогичный navigation selector в View-компоненте и indicator/selector подходу в Tabs.

### Style propagation

`NavigationDrawerStyle` задает `itemStyle`. Внутри `NavigationDrawer` нужно предоставить `LocalNavigationDrawerItemStyle` значением `style.itemStyle`, чтобы `NavigationDrawerItem` по умолчанию использовал drawer-level item style.

Standalone usage остается возможным через явный `style` параметр у `NavigationDrawerItem`.

### Theme Builder generation

Theme Builder должен получить генератор Compose styles для `NavigationDrawer` и `NavigationDrawerItem`. Генератор должен использовать новые runtime builder contracts и создавать stateful visual values для цветов, типографики, dimensions, shape и container shadow.

Ожидаемая модель генерации:
- `NavigationDrawer` style генерирует container properties, включая shadow, и ссылку на generated `NavigationDrawerItemStyle`.
- `NavigationDrawerItem` style генерирует item-specific values без shadow и без наследования от `CellStyle`; вложенные `Badge` и `Counter` стилизуются через `badgeStyle` и `counterStyle`.
- Цветовые токены генерируются в `StatefulValue<Brush>`; удобные overloads runtime builders нужны для ручных стилей, но generated code может использовать наиболее прямой stateful brush API.
- Generated code не должен требовать nullable fallbacks для visual properties.

Альтернатива: реализовать runtime API сейчас, а генератор вынести в отдельный change. Это отклонено, потому что без Theme Builder компонент не будет полноценно подключаться к дизайн-системам из `tokens`.

## Risks / Trade-offs

- [Risk] Container `Shape` и `ShadowAppearance` как `StatefulValue` могут потребовать дополнительных motion/evaluator helpers, если текущий Motion API не умеет их анимировать. → Mitigation: для первой версии поддержать stateful выбор значения без интерполяции, а motion для container shape/shadow сделать snap/noMotion, если нет корректного evaluator.
- [Risk] `NavigationDrawerItem` использует `BaseCell`, но публичный стиль item-а не наследует `CellStyle`. → Mitigation: держать adapter к `CellStyle` внутри реализации и не раскрывать Cell-specific builder surface в API drawer item style.
- [Risk] Theme Builder поддержка расширяет scope за пределы `sdds-core/uikit-compose`. → Mitigation: ограничить изменения `sdds-core/plugin_theme_builder` генераторами нового компонента; новые тесты не добавлять по решению owner-а.
- [Risk] `expandOnFocus` может конфликтовать с ручным управлением state. → Mitigation: поведение должно быть opt-in/parameterized и использовать публичные `expand()`/`collapse()` команды state.
- [Risk] Collapsed/expanded width может быть ошибочно реализован через offset/clip, как в `Drawer`. → Mitigation: layout должен менять измеряемую ширину drawer и item-ов, а не смещать expanded surface за границу.
- [Risk] Container-level selector требует знать bounds выбранного item-а, а content slot не навязывает data model. → Mitigation: дать `NavigationDrawerItem` internal registration mechanism через composition local или scoped content API, чтобы container мог собрать selected item measurements без публичного adapter API.

## Migration Plan

Миграция существующего кода не требуется: это новая Compose capability и новые публичные API. Existing `Drawer`, View `NavigationDrawer` и существующие Compose компоненты должны остаться совместимыми.

Theme Builder rollout должен идти после стабилизации runtime builder contracts, чтобы generated styles ссылались на финальные API. Если обновляются token modules, изменения должны быть generated output и/или минимальные config updates, необходимые для появления `NavigationDrawer` variations.

Rollback: удалить новые Compose API и связанные fixtures/tests/docs, не затрагивая существующий `Drawer` и View `NavigationDrawer`.

## Open Questions

- Нужно отдельно оценить оптимизацию recomposition вокруг shared `InteractionSource` и `MotionContext`; это не блокирует контракт компонента, но может потребовать отдельного изменения Motion API.
