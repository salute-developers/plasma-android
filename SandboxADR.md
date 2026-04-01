# ADR: Sandbox. Библиотека для создания демо‑приложений

## Статус
Draft (частичная реализация уже есть в PR)

## Контекст и цель
Нужна единая библиотека и каркас демо‑приложений для дизайн‑системы, чтобы:
- унифицировать регистрацию историй (stories) и темы;
- иметь стабильный UX и UI для демо‑приложений в Compose и View‑системе;
- позволить дизайн‑системам подключаться через `include-build` и быстро получать песочницу.

## Обзор решения
Решение строится на библиотечных модулях `sandbox-*`, которые инкапсулируют:
- базовые сущности (stories, state, registry, theme);
- UI оболочку демо‑приложения для Compose и View‑системы;
- KSP‑процессор для генерации регистрации историй.

Каждая дизайн‑система (`/tokens/*`) содержит 2 служебных модуля:
- `integration`: подключает стили компонентов и связывает их с `sandbox-core`;
- `app`: демо‑приложение, наследуется от `SandboxActivity` и регистрирует темы/истории.

## Расположение модулей
Все `sandbox-*` модули располагаются в `plasma-android/integration-core/`:

```
integration-core/
  sandbox-core/
  sandbox-compose/
  sandbox-views/
  sandbox-ksp/
```

Модули дизайн‑систем располагаются в `/tokens/*`:

```
tokens/<design-system>/
  docs/
  integration/
  app/
```

## Модули sandbox

### sandbox-core
Назначение:
- базовые сущности для stories и темы;
- реестр историй `StoryRegistry`;
- базовые интерфейсы темы и компонентов (`Theme`, `ComponentProvider`, `ComponentKey`);
- модель `UiState` и система редактируемых свойств (properties).

Использование:
- stories описываются через `@Story` и `@StoryUiState`;
- `BaseStory` регистрируется в `StoryRegistry`;
- `ThemeManager` хранит текущую тему для песочницы.

### sandbox-compose
Назначение:
- UI оболочка демо‑приложения на Compose;
- `SandboxActivity` с базовым экраном, навигацией и редактором свойств;
- Compose‑инфраструктура тем (`ComposeTheme`, `ComposeStyleProvider`).

Использование:
- модуль `app` наследует `SandboxActivity`;
- тема приложения подготавливается как `SandboxTheme` внутри модуля и подключается в `SandboxActivity`;
- stories реализуются как наследники `ComposeBaseStory`.

### sandbox-views
Назначение:
- UI оболочка демо‑приложения для View‑системы;
- `SandboxActivity` для View‑подхода;
- View‑тема и реестр историй.

Источник UI:
- UI переносится из `playground.sandbox-compose` (пакет `core.view`);
- после переноса директория `playground` будет удалена.

Использование:
- модуль `app` наследует `SandboxActivity` из `sandbox-views`;
- подключает `SandboxTheme` и регистрирует истории через `registerStories()`.

### sandbox-ksp
Назначение:
- KSP‑процессор для генерации:
  - списка историй;
  - преобразования UiState в набор editable‑properties;
  - функции `registerStories()`.

Использование:
- включается в `integration`/`app` модуле;
- находит классы с `@Story` и `@StoryUiState`;
- генерирует `registerStories()` в пакете `com.sdds.sandbox` (или по опции `packageName`).

## Модули дизайн‑системы (/tokens/*)

### integration
Назначение:
- подключение стилей и компонентов;
- формирование `ComponentProvider` и `Theme`;
- зависит от `sandbox-core`.

Сборка:
- использует `convention.integration-view` и `convention.integration-compose`;
- подключает стили, сгенерированные через `sdds-core/plugin-theme-builder`.

### app
Назначение:
- демо‑приложение конкретной дизайн‑системы;
- зависит от:
  - `integration`;
  - `sandbox-core`;
  - `sandbox-compose` или `sandbox-views`.

Сборка:
- использует `convention.sandbox-app`.

### Activity в app
Activity в `tokens/<ds>/app`:
- наследуется от `SandboxActivity` (`sandbox-compose` или `sandbox-views`);
- вызывает:
  - `registerTheme()` — регистрация темы;
  - `registerCoreStories()` — базовые stories;
  - `registerStories()` — сгенерированные sandbox‑ksp.

## Истории (Stories)

### Общие
- Compose: общие stories находятся в `uikit-compose-fixtures`, подпакет `.stories`.
- View‑system: общие stories находятся в `uikit-fixtures`, подпакет `stories`.

### Специфичные для дизайн‑систем
- хранятся в модуле `app` конкретной дизайн‑системы.

### Пример Story и UiState (Compose)

```kotlin
@StoryUiState
data class ButtonUiState(
    override val variant: String = "",
    override val appearance: String = "",
    val label: String = "label",
    val value: String = "value",
    val spacing: ButtonSpacing = ButtonSpacing.SpaceBetween,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}

@Story
object BasicButtonStory : ComposeBaseStory<ButtonUiState, ButtonStyle>(
    ComponentKey.BasicButton,
    ButtonUiState(),
    ButtonUiStatePropertiesProducer,
    ButtonUiStateTransformer
) {
    @Composable
    override fun BoxScope.Content(style: ButtonStyle, state: ButtonUiState) {
        Button(
            style = style,
            label = state.label,
            value = state.value,
            onClick = {},
        )
    }
}
```

Пояснение к примеру:
- `@StoryUiState` помечает UI‑состояние, из которого KSP генерирует `PropertiesProducer` и `StateTransformer` (они управляют списком редактируемых свойств и обновлением состояния).
- `@Story` помечает story, которую KSP регистрирует в `registerStories()`.
- `ComposeBaseStory` связывает состояние, стиль и UI‑контент, чтобы песочница могла отобразить компонент и дать редактор свойств.

### Пример кастомных PropertyProducer и StateValueTransformer
Пример демонстрирует:
- кастомный `PropertyProducer` через `@StoryProperty(producedBy = ...)`;
- нормализацию значения через `@StoryProperty(transformedBy = ...)` и `StateValueTransformer`.

```kotlin
@StoryUiState
data class ButtonGroupUiState(
    override val variant: String = "",
    override val appearance: String = "",
    @StoryProperty("orient", producedBy = ButtonGroupOrientationProperty::class)
    val orientation: ButtonGroupOrientation = ButtonGroupOrientation.Horizontal,
    @StoryProperty(transformedBy = ButtonGroupAmountTransformer::class)
    val amount: Int = 3,
) : UiState {
    override fun updateVariant(appearance: String, variant: String): UiState {
        return copy(appearance = appearance, variant = variant)
    }
}


object ButtonGroupOrientationProperty : PropertyProducer<ButtonGroupUiState> {
    override fun produce(state: ButtonGroupUiState): Property<*> {
        return enumProperty(
            name = "orientation",
            value = state.orientation,
        )
    }
}

object ButtonGroupAmountTransformer : StateValueTransformer<Int, Int> {
    override fun transform(input: Int): Int {
        return input.coerceAtLeast(0)
    }
}
```

## Подключение tokens через include-build
`integration-core` подключается к `tokens/*` через `include-build`, чтобы дизайн‑системы могли использовать библиотечные модули `sandbox-*` без дублирования и сложной публикации.

## Поток исполнения (упрощенно)
1. `SandboxActivity` запускает основную UI оболочку демо.
2. `registerTheme()` устанавливает текущую тему в `ThemeManager`.
3. `registerCoreStories()` добавляет общие stories.
4. `registerStories()` (сгенерированный KSP) регистрирует stories из DS.
5. UI отображает список историй и предоставляет редактор свойств.

## План работ (оставшиеся задачи)
1. Создать директорию `integration-core/` и перенести туда `sandbox-core`, `sandbox-compose`, `sandbox-ksp`, `sandbox-views`.
2. Реализовать `sandbox-views`:
   - перенести UI из `playground.sandbox-compose` (пакет `core.view`);
   - адаптировать под новую структуру и зависимости;
   - после переноса удалить директорию `playground`.
3. Подключить `SandboxTheme` в `sandbox-compose` и `sandbox-views` через `sdds-core/plugin-theme-builder`.
4. В `/tokens/*` добавить модули `integration` и `app` рядом с `docs`.
5. В `integration`:
   - подключить `convention.integration-view` и `convention.integration-compose`;
   - добавить зависимость от `sandbox-core`;
   - зарегистрировать стили компонентов.
6. В `app`:
   - подключить `convention.sandbox-app`;
   - добавить Activity, наследующую `SandboxActivity`;
   - вызвать `registerTheme()`, `registerCoreStories()`, `registerStories()`.
7. В каждом DS добавить entities с аннотациями `@Story` и `@StoryUiState`.
8. Подключить `integration-core` к `tokens/*` через `include-build`.
9. Обновить документацию по запуску песочниц и шагам подключения новых DS.
10. Добавить механизм автообновления демо‑приложения, перенести/использовать реализацию из `playground:sandbox-compose`.
