## ADDED Requirements

### Requirement: ApiDeprecated marks a builder method as deprecated in API metadata
The `com.sdds.api.info.compose` package SHALL provide the `@ApiDeprecated(message: String = "")` annotation with target `FUNCTION` and `SOURCE` retention. A style builder method annotated with `@ApiDeprecated` SHALL be included in `uikit-compose-api-meta.json` with a `deprecated` object containing `message`. A method annotated only with `@kotlin.Deprecated` SHALL remain excluded from the metadata. An empty `message` SHALL be valid and SHALL NOT be an error.

#### Scenario: Annotated method is exported with deprecated
- **WHEN** a builder method is annotated with `@ApiDeprecated("Use iconSource")`
- **THEN** its metadata entry contains `"deprecated": { "message": "Use iconSource" }`

#### Scenario: Annotation without message
- **WHEN** a builder method is annotated with `@ApiDeprecated`
- **THEN** its metadata entry contains `deprecated` with an empty `message`

#### Scenario: Plain Kotlin Deprecated stays excluded
- **WHEN** a builder method has `@Deprecated` but no `@ApiDeprecated`
- **THEN** the method is absent from the metadata

#### Scenario: Non-deprecated parameters are unchanged
- **WHEN** a parameter has no `@ApiDeprecated`
- **THEN** the `deprecated` field is absent from its JSON entry

### Requirement: Deprecation applies to all overloads of a property
If at least one method with a given property `id` (`@ApiName` or method name) is annotated with `@ApiDeprecated`, the processor SHALL mark every metadata entry with that `id` as deprecated. The `message` SHALL be taken from the first annotated method in declaration order. Different messages among overloads SHALL NOT be an error.

#### Scenario: One annotated overload deprecates the property
- **WHEN** `color(Color)` is annotated with `@ApiDeprecated("Use InteractiveColor")` and `color(InteractiveColor)` is not
- **THEN** both metadata entries with `id == "color"` contain `deprecated.message == "Use InteractiveColor"`

#### Scenario: Different messages on overloads
- **WHEN** two overloads of one `id` are annotated with different messages
- **THEN** all entries of that `id` carry the message of the first annotated overload in declaration order

### Requirement: Universal Compose generator skips deprecated properties
The universal Compose generator SHALL ignore metadata entries with a non-null `deprecated` before grouping overloads by `id`, so deprecated properties produce no generated code.

#### Scenario: Deprecated property is not generated
- **WHEN** all overloads of an `id` are marked deprecated and the theme config contains a value for it
- **THEN** the generated style builder code does not reference that property and generation succeeds
