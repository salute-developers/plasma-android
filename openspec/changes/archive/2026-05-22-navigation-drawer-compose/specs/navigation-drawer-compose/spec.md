## ADDED Requirements

### Requirement: NavigationDrawer SHALL be a Compose layout container
`NavigationDrawer` in `sdds-core/uikit-compose` SHALL provide a slot-based layout container with optional header, body/content and footer areas. The component SHALL keep its public API in `com.sdds.compose.uikit` and implementation details in `com.sdds.compose.uikit.internal.navigationdrawer`.

#### Scenario: Drawer renders layout slots
- **WHEN** a caller provides header, content and footer slots to `NavigationDrawer`
- **THEN** the component MUST render header at the top, content/body between header and footer, and footer at the bottom

#### Scenario: Drawer content is caller controlled
- **WHEN** a caller places arbitrary composables inside the `NavigationDrawer` content slot
- **THEN** the component MUST render that content without requiring an item data list or adapter API

### Requirement: NavigationDrawer SHALL remain visible and interactive when collapsed
`NavigationDrawer` SHALL support `Expanded` and `Collapsed` states where `Collapsed` represents a visible interactive navigation rail, not a closed drawer or hidden panel.

#### Scenario: Collapsed drawer remains visible
- **WHEN** `NavigationDrawerState` is collapsed
- **THEN** the drawer MUST remain visible with collapsed dimensions

#### Scenario: Collapsed drawer remains interactive
- **WHEN** a user interacts with a visible item inside a collapsed `NavigationDrawer`
- **THEN** the item MUST receive interaction and click handling normally

### Requirement: NavigationDrawer SHALL use its own state object
`NavigationDrawer` SHALL expose `NavigationDrawerState`, `NavigationDrawerValue : ValueState`, and `rememberNavigationDrawerState(...)`. The state SHALL provide `currentValue`, `targetValue`, `progress`, `isExpanded`, `isCollapsed`, `isAnimationRunning`, `expand()`, `collapse()`, and `snapTo(...)`.

#### Scenario: State expands drawer
- **WHEN** a caller invokes `NavigationDrawerState.expand()`
- **THEN** the state's target value MUST become `NavigationDrawerValue.Expanded`

#### Scenario: State collapses drawer
- **WHEN** a caller invokes `NavigationDrawerState.collapse()`
- **THEN** the state's target value MUST become `NavigationDrawerValue.Collapsed`

#### Scenario: State snaps without animated transition
- **WHEN** a caller invokes `NavigationDrawerState.snapTo(NavigationDrawerValue.Collapsed)`
- **THEN** the current state MUST become collapsed without waiting for a visual transition

#### Scenario: State exposes expand progress
- **WHEN** `NavigationDrawer` visually transitions between collapsed and expanded widths
- **THEN** `NavigationDrawerState.progress` MUST expose a value from `0f` for collapsed to `1f` for expanded

#### Scenario: Drawer does not expose drag gestures
- **WHEN** `NavigationDrawer` is rendered
- **THEN** it MUST NOT provide drag or gesture resize behavior for expanded/collapsed transitions

### Requirement: NavigationDrawer SHALL expand on focus when enabled
`NavigationDrawer` SHALL provide an `expandOnFocus` parameter. When enabled, focus entering the drawer subtree SHALL expand the drawer and focus leaving the subtree SHALL collapse it.

#### Scenario: Focus enters drawer subtree
- **WHEN** `expandOnFocus` is enabled and a descendant inside `NavigationDrawer` receives focus
- **THEN** `NavigationDrawerState.expand()` MUST be requested

#### Scenario: Focus leaves drawer subtree
- **WHEN** `expandOnFocus` is enabled and focus leaves the `NavigationDrawer` subtree
- **THEN** `NavigationDrawerState.collapse()` MUST be requested

#### Scenario: Focus expansion can be disabled
- **WHEN** `expandOnFocus` is disabled and a descendant inside `NavigationDrawer` receives focus
- **THEN** the drawer MUST NOT change state because of focus

### Requirement: NavigationDrawer SHALL not compose public Drawer
`NavigationDrawer` SHALL not be implemented by composing public `Drawer`, `DrawerState`, `DrawerValue`, `DrawerLayout`, peek offset, overlay or close icon semantics. Existing `Drawer` code MAY be used only as a reference for state API shape, header/body/footer organization and focus behavior.

#### Scenario: Collapsed is not Drawer closed
- **WHEN** `NavigationDrawer` enters collapsed state
- **THEN** the implementation MUST size/layout the drawer as a collapsed rail rather than offsetting an expanded drawer behind the screen edge

### Requirement: NavigationDrawer SHALL provide selected item selector
`NavigationDrawer` SHALL support a separate container-level selector for the selected item. The selector SHALL be independent from item selected background and MAY use the `Tabs` indicator approach as a reference for measuring selected item bounds and drawing a moving shape.

#### Scenario: Selector is drawn for selected item
- **WHEN** a `NavigationDrawerItem` is selected and selector is enabled
- **THEN** `NavigationDrawer` MUST draw a selector aligned to the selected item bounds

#### Scenario: Selector follows selected item
- **WHEN** selected item changes
- **THEN** the selector MUST move to the newly selected item

#### Scenario: Selector respects drawer state
- **WHEN** `NavigationDrawer` changes between expanded and collapsed
- **THEN** the selector MUST remain aligned with the selected item in the current layout state

#### Scenario: Initial selector does not animate
- **WHEN** `NavigationDrawer` first displays an already selected item
- **THEN** the selector MUST appear aligned to that item without playing movement animation

#### Scenario: User selection animates selector
- **WHEN** selected item changes after the initial display
- **THEN** the selector MUST move to the newly selected item using `NavigationDrawerMotionStyle`

#### Scenario: Selector does not participate in item layout
- **WHEN** `NavigationDrawer` draws the selector
- **THEN** the selector MUST be drawn by the container draw layer behind items without adding a separate layout node or reserving selector space in collapsed mode

#### Scenario: Selector caches static outline geometry
- **WHEN** selector position animates between selected item bounds
- **THEN** the implementation SHOULD cache selector outline geometry for stable height/shape/width/padding inputs and update only draw-time position during vertical movement

### Requirement: NavigationDrawerStyle SHALL use stateful visual values
`NavigationDrawerStyle` SHALL define all visual style properties as non-null `StatefulValue<T>`, including dimensions, shape, shadow and selector visual properties. Color-like properties SHALL be stored as `StatefulValue<Brush>`.

#### Scenario: Drawer style resolves expanded dimensions
- **WHEN** `NavigationDrawer` is expanded
- **THEN** drawer dimensions MUST be resolved from `StatefulValue` using a state set containing `NavigationDrawerValue.Expanded`

#### Scenario: Drawer style resolves collapsed dimensions
- **WHEN** `NavigationDrawer` is collapsed
- **THEN** drawer dimensions MUST be resolved from `StatefulValue` using a state set containing `NavigationDrawerValue.Collapsed`

#### Scenario: Drawer color builders accept convenient inputs
- **WHEN** a caller configures drawer colors through the style builder
- **THEN** the builder MUST accept `StatefulValue<Brush>`, `InteractiveColor`, `Color`, and `Brush` overloads for color-like properties

#### Scenario: Drawer layout spacing resolves from style
- **WHEN** `NavigationDrawer` renders header, content items and footer
- **THEN** item spacing, header spacing and footer spacing MUST be resolved from `NavigationDrawerStyle.dimensions`

### Requirement: NavigationDrawerStyle SHALL provide item style
`NavigationDrawerStyle` SHALL include `itemStyle: NavigationDrawerItemStyle`. `NavigationDrawer` SHALL provide this style to descendants as the default `NavigationDrawerItem` style.

#### Scenario: Drawer item uses drawer-provided style
- **WHEN** `NavigationDrawerItem` is placed inside `NavigationDrawer` without an explicit item style
- **THEN** it MUST use `NavigationDrawerStyle.itemStyle`

#### Scenario: Drawer item can override style
- **WHEN** `NavigationDrawerItem` receives an explicit style parameter
- **THEN** it MUST use the explicit style instead of the drawer-provided default

### Requirement: NavigationDrawerItem SHALL be based on BaseCell
`NavigationDrawerItem` SHALL use `BaseCell` internally for start, center and end content layout. Public API SHALL provide an icon slot, title/content slot, end content slot and indicator slot. Label and subtitle slots SHALL NOT be part of the NavigationDrawerItem API.

#### Scenario: Expanded item shows title slot
- **WHEN** `NavigationDrawerItem` is expanded and receives title/content
- **THEN** it MUST show the provided title/content through the `BaseCell` center content area

#### Scenario: Expanded item shows text and indicator at end
- **WHEN** `NavigationDrawerItem` is expanded and receives text/content and indicator slots
- **THEN** it MUST show the text/content slot and place the indicator in the end content area

#### Scenario: Expanded item shows end content
- **WHEN** `NavigationDrawerItem` is expanded and receives an `endContent` slot
- **THEN** it MUST show `endContent` in the end content area

#### Scenario: Collapsed item hides text and overlays indicator
- **WHEN** `NavigationDrawerItem` is collapsed and receives text/content and indicator slots
- **THEN** it MUST hide title/content and end content slots and place the indicator over the icon/start content area

#### Scenario: Item selected state affects visual values
- **WHEN** `NavigationDrawerItem` is selected
- **THEN** its visual values MUST resolve from a state set containing selected state in addition to the drawer expanded/collapsed state

### Requirement: NavigationDrawerItemStyle SHALL be standalone
`NavigationDrawerItemStyle` SHALL be a standalone `Style` and SHALL NOT extend `CellStyle`. It SHALL define drawer item visual properties as non-null `StatefulValue<T>`, including item shape, background, dimensions, paddings, icon sizing and indicator positioning. Color-like item properties SHALL be stored as `StatefulValue<Brush>`.

#### Scenario: Item style adapts to BaseCell internally
- **WHEN** `NavigationDrawerItem` renders text/content through `BaseCell`
- **THEN** it MAY adapt `NavigationDrawerItemStyle` to `CellStyle` internally without exposing Cell-specific builder API

#### Scenario: Item style provides nested component styles
- **WHEN** `NavigationDrawerItem` renders Badge or Counter content
- **THEN** it MUST provide `badgeStyle` and `counterStyle` from `NavigationDrawerItemStyle`

#### Scenario: Item style provides paddings
- **WHEN** `NavigationDrawerItem` is rendered
- **THEN** its start, end, top and bottom padding MUST resolve from `NavigationDrawerItemStyle.dimensions`

#### Scenario: Item color builders accept convenient inputs
- **WHEN** a caller configures item colors through the style builder
- **THEN** the builder MUST accept `StatefulValue<Brush>`, `InteractiveColor`, `Color`, and `Brush` overloads for color-like properties

### Requirement: NavigationDrawer SHALL animate visual transitions through MotionStyle
`NavigationDrawer` and `NavigationDrawerItem` SHALL expose motion styles for expanded/collapsed transitions. Visual transitions SHALL be configured through `NavigationDrawerMotionStyle` and `NavigationDrawerItemMotionStyle`.

#### Scenario: Drawer width transition uses motion style
- **WHEN** `NavigationDrawerState` changes between expanded and collapsed
- **THEN** drawer width MUST transition according to `NavigationDrawerMotionStyle`

#### Scenario: Item visual transition uses motion style
- **WHEN** `NavigationDrawerItem` changes between expanded and collapsed
- **THEN** item visual values MUST transition according to `NavigationDrawerItemMotionStyle`

#### Scenario: Item slot visibility uses motion style
- **WHEN** `NavigationDrawerItem` shows or hides center content, end content or collapsed start indicator
- **THEN** the corresponding `AnimatedVisibility` transition MUST be configured by `NavigationDrawerItemMotionStyle`

#### Scenario: Component does not hardcode animation specs
- **WHEN** implementation animates expanded/collapsed visual values
- **THEN** it MUST use the relevant `MotionStyle` instead of hardcoded local animation specs

### Requirement: Theme Builder SHALL generate NavigationDrawer Compose styles
Theme Builder in `sdds-core/plugin_theme_builder` SHALL support generation of Compose styles for `NavigationDrawer` and `NavigationDrawerItem` using the runtime style builder contracts.

#### Scenario: Generator creates drawer style
- **WHEN** token configuration contains a `NavigationDrawer` style
- **THEN** Theme Builder MUST generate Compose code that builds `NavigationDrawerStyle`

#### Scenario: Generator creates drawer item style
- **WHEN** token configuration contains a `NavigationDrawerItem` style
- **THEN** Theme Builder MUST generate Compose code that builds `NavigationDrawerItemStyle`

#### Scenario: Generated drawer style references generated item style
- **WHEN** Theme Builder generates a `NavigationDrawerStyle`
- **THEN** the generated drawer style MUST configure `itemStyle` with the corresponding generated `NavigationDrawerItemStyle`

#### Scenario: Generated visual values are stateful
- **WHEN** Theme Builder generates Compose style values for `NavigationDrawer` or `NavigationDrawerItem`
- **THEN** generated visual values MUST use non-null `StatefulValue<T>` contracts and color-like values MUST use `StatefulValue<Brush>`
