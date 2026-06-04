## ADDED Requirements

### Requirement: TabBarStyle SHALL expose stateful visual values
`TabBarStyle` in `sdds-core/uikit-compose` SHALL define container visual properties as non-null `StatefulValue<T>` where the value can vary by motion or interaction state. Shape, shadow and dimensions SHALL be stateful. Color-like container properties SHALL support stateful brush values while keeping convenient builder overloads for existing static inputs. Existing public style properties SHALL remain available for source compatibility and SHALL NOT be removed by this change.

#### Scenario: TabBar resolves stateful container values
- **WHEN** `TabBar` renders with a `Motion<TabBarMotionStyle>`
- **THEN** it MUST resolve shape, shadow, dimensions and color-like values from `TabBarStyle` using the motion context state

#### Scenario: TabBar style builder accepts static values
- **WHEN** a caller configures `TabBarStyle` with existing static `Shape`, `ShadowAppearance`, `Dp`, `Color` or `Brush` inputs
- **THEN** the builder MUST convert those inputs to equivalent stateful values without requiring callers to manually create `StatefulValue`

#### Scenario: TabBar legacy style properties remain available
- **WHEN** existing source code reads old public properties from `TabBarStyle`, `TabBarColors` or `TabBarDimensions`
- **THEN** those properties MUST remain source-compatible and return values consistent with the corresponding stateful style values

#### Scenario: TabBar provides item style
- **WHEN** `TabBarItem` is placed inside `TabBar` without an explicit item style
- **THEN** it MUST use the `TabBarItemStyle` provided by `TabBarStyle`

### Requirement: TabBarItemStyle SHALL expose stateful visual values
`TabBarItemStyle` in `sdds-core/uikit-compose` SHALL define item visual properties as non-null `StatefulValue<T>` where the value can vary by selected, interaction or motion state. Shape, label text style, colors and dimensions SHALL be stateful. The style SHALL keep nested `CounterStyle`, `BadgeStyle` and `IndicatorStyle` for extra content. Existing public style properties SHALL remain available for source compatibility and SHALL NOT be removed by this change.

#### Scenario: TabBarItem resolves selected values
- **WHEN** `TabBarItem` renders with `isSelected` set to `true`
- **THEN** it MUST resolve item visual values from a state set that contains selected state

#### Scenario: TabBarItem resolves unselected values
- **WHEN** `TabBarItem` renders with `isSelected` set to `false`
- **THEN** it MUST resolve item visual values without selected state

#### Scenario: TabBarItem style builder accepts static values
- **WHEN** a caller configures `TabBarItemStyle` with existing static `Shape`, `TextStyle`, `Dp`, `Color` or brush-like color inputs
- **THEN** the builder MUST convert those inputs to equivalent stateful values without requiring callers to manually create `StatefulValue`

#### Scenario: TabBarItem legacy style properties remain available
- **WHEN** existing source code reads old public properties from `TabBarItemStyle`, `TabBarItemColors` or `TabBarItemDimensions`
- **THEN** those properties MUST remain source-compatible and return values consistent with the corresponding stateful style values

#### Scenario: TabBarItem provides nested extra styles
- **WHEN** `TabBarItem` renders extra content such as Badge, Counter or Indicator
- **THEN** it MUST provide the nested styles from `TabBarItemStyle` to that content

### Requirement: TabBarItemStyle SHALL control extra slot offset
`TabBarItemDimensions` SHALL expose `extraOffsetX: StatefulValue<Dp>` and `extraOffsetY: StatefulValue<Dp>` for controlling the offset of the `extra` slot rendered by `TabBarItem`. The dimensions builder SHALL accept both `StatefulValue<Dp>` and `Dp` inputs for these offsets.

#### Scenario: TabBarItem resolves extra offset from style
- **WHEN** `TabBarItem` renders non-null `extra` content
- **THEN** it MUST position the extra slot using `extraOffsetX` and `extraOffsetY` resolved from `TabBarItemStyle.dimensions`

#### Scenario: TabBarItem extra offset supports stateful values
- **WHEN** `extraOffsetX` or `extraOffsetY` varies by selected or interaction state
- **THEN** `TabBarItem` MUST resolve the offset using the same state and motion context as other item dimensions

#### Scenario: Default extra offset preserves current placement
- **WHEN** callers use default `TabBarItemStyle`
- **THEN** the extra slot MUST keep the same default visual placement as before this change

### Requirement: TabBar SHALL expose MotionStyle-based overload
`TabBar` SHALL provide a public overload where `motion: Motion<TabBarMotionStyle>` is an explicit required parameter. Existing `TabBar` overloads SHALL remain source-compatible and delegate rendering to the overload that accepts `motion`.

#### Scenario: Caller supplies TabBar motion
- **WHEN** a caller invokes `TabBar` with an explicit `Motion<TabBarMotionStyle>`
- **THEN** the component MUST use that motion to animate stateful container visual values

#### Scenario: Legacy TabBar overload delegates
- **WHEN** a caller invokes the existing `TabBar` overload without a motion parameter
- **THEN** the component MUST create or remember default TabBar motion and delegate to the motion-based overload

#### Scenario: TabBar avoids hardcoded animation specs
- **WHEN** `TabBar` animates stateful visual values
- **THEN** it MUST use `TabBarMotionStyle` instead of hardcoded local animation specs

### Requirement: TabBarItem SHALL expose simplified icon MotionStyle-based overload
`TabBarItem` SHALL provide a public overload with exactly one required parameter, `icon`, an optional `labelContent` slot for label content, no public `interactionSource` parameter, and a final optional `motion: Motion<TabBarItemMotionStyle>` parameter. Existing `TabBarItem` overloads SHALL remain source-compatible and delegate rendering to the simplified motion-based overload. The simplified overload SHALL NOT provide a separate `selectedIcon` slot.

#### Scenario: Caller supplies TabBarItem motion
- **WHEN** a caller invokes `TabBarItem` with an explicit `Motion<TabBarItemMotionStyle>`
- **THEN** the component MUST use that motion to animate stateful item visual values

#### Scenario: Simplified TabBarItem requires only icon
- **WHEN** a caller uses the new `TabBarItem` overload
- **THEN** the only required argument MUST be the `icon` composable slot

#### Scenario: Simplified TabBarItem uses label content slot
- **WHEN** a caller needs to render label content with the new `TabBarItem` overload
- **THEN** the overload MUST expose an optional `labelContent` composable slot instead of only a string label parameter

#### Scenario: Simplified TabBarItem does not expose selected icon slot
- **WHEN** a caller needs different icon content for selected and unselected states in the new `TabBarItem` overload
- **THEN** the caller MUST provide that branching inside the `icon` slot using `isSelected` or caller-owned state

#### Scenario: Simplified TabBarItem hides interaction source
- **WHEN** a caller uses the new `TabBarItem` overload
- **THEN** the public function signature MUST NOT expose an `interactionSource` parameter

#### Scenario: Legacy composable icon TabBarItem delegates
- **WHEN** a caller invokes the existing `TabBarItem` overload with `defaultIcon` and `selectedIcon` composable slots
- **THEN** the component MUST adapt the selected icon choice inside the delegated `icon` slot and delegate to the simplified motion-based overload

#### Scenario: Legacy drawable TabBarItem delegates
- **WHEN** a caller invokes the existing `TabBarItem` overload with drawable resource icons
- **THEN** the component MUST adapt those resources to composable icon content and delegate to the simplified motion-based overload

### Requirement: TabBar and TabBarItem SHALL define component motion styles
`sdds-core/uikit-compose` SHALL provide `TabBarMotionStyle` and `TabBarItemMotionStyle` with composition locals, builders and default no-motion behavior consistent with existing motion component styles. The motion styles SHALL cover every visual value that the component resolves through motion.

#### Scenario: TabBar motion style is available
- **WHEN** a caller needs to customize TabBar animations
- **THEN** the API MUST provide `TabBarMotionStyle`, its builder, a composition local and a remember function for creating `Motion<TabBarMotionStyle>`

#### Scenario: TabBarItem motion style is available
- **WHEN** a caller needs to customize TabBarItem animations
- **THEN** the API MUST provide `TabBarItemMotionStyle`, its builder, a composition local and a remember function for creating `Motion<TabBarItemMotionStyle>`

#### Scenario: Default motion is stable
- **WHEN** a caller does not customize TabBar or TabBarItem motion
- **THEN** the default motion style MUST preserve current non-animated behavior unless a default transition is explicitly defined for a stateful visual value

### Requirement: TabBar motion change SHALL preserve existing behavior
The TabBar motion change SHALL preserve current rendering behavior for existing source-compatible calls unless callers opt into state-specific style values or custom motion styles.

#### Scenario: Existing TabBar call remains valid
- **WHEN** existing source code calls `TabBar` with the previous parameter set
- **THEN** the call MUST continue to compile and render through the new motion-based implementation path

#### Scenario: Existing TabBarItem call remains valid
- **WHEN** existing source code calls `TabBarItem` with the previous composable or drawable icon parameter set
- **THEN** the call MUST continue to compile and render through the new motion-based implementation path

#### Scenario: Existing visual defaults are preserved
- **WHEN** callers use default `TabBarStyle`, `TabBarItemStyle`, `TabBarMotionStyle` and `TabBarItemMotionStyle`
- **THEN** `TabBar` and `TabBarItem` MUST preserve the current default layout, colors, shapes, sizes and selected icon behavior
