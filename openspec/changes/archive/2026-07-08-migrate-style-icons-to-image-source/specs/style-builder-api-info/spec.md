## ADDED Requirements

### Requirement: ImageSource builder parameters classify as icons
API info extraction for `StyleBuilder` methods SHALL classify parameters of type `com.sdds.compose.uikit.ImageSource` as `ParameterType.ICON` when those parameters represent icon configuration.

#### Scenario: Builder method accepts ImageSource icon
- **WHEN** an `@ApiInfo` style builder method has a parameter whose resolved type is `com.sdds.compose.uikit.ImageSource`
- **THEN** generated API metadata classifies that parameter as `ICON`

#### Scenario: Deprecated drawable overload remains compatible
- **WHEN** a style builder exposes both a deprecated `@DrawableRes Int` overload and an `ImageSource` overload for the same icon property
- **THEN** API metadata preserves icon classification for the non-deprecated `ImageSource` overload
