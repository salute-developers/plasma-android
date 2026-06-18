# Универсальный генератор стилей: краткий гайд

Краткий чек-лист разработки нового Compose-компонента. Подробное описание и
расширенные примеры находятся в
[`UNIVERSAL_STYLE_GENERATOR.md`](UNIVERSAL_STYLE_GENERATOR.md).

## Шаги

1. Реализуйте стиль компонента:
   - `ComponentStyle`;
   - companion factory `builder()` или аналог;
   - интерфейс `ComponentStyleBuilder : StyleBuilder<ComponentStyle>`.

2. Пометьте основной билдер аннотацией `@ApiInfo`:

```kotlin
@ApiInfo
interface ExampleStyleBuilder : StyleBuilder<ExampleStyle>
```

Имя компонента будет выведено автоматически: `ExampleStyleBuilder` -> `Example`.

3. Сопоставьте методы билдера с ключами `props` в JSON-конфиге. Если имена
   различаются, добавьте `@ApiName`:

```kotlin
@ApiName(name = "labelStyle")
fun textStyle(textStyle: TextStyle): ExampleStyleBuilder
```

Одинаковый `@ApiName` должен стоять на всех перегрузках одного свойства.

4. При необходимости настройте `@ApiInfo`:

```kotlin
// Один билдер используется несколькими компонентами
@ApiInfo(components = ["TextField", "TextArea"])

// Factory-функция называется не builder()
@ApiInfo(builderFunName = "basicButtonBuilder")

// Нужен нестандартный пакет сгенерированных стилей
@ApiInfo(packageName = "switcher")
```

Параметры можно комбинировать в одной аннотации.

5. Для кастомных состояний пометьте enum аннотацией `@ApiStateSet`:

```kotlin
@ApiStateSet(components = ["Avatar", "Indicator"])
enum class AvatarStatus : ValueState {
    None,
    Active,
    Inactive,
}
```

Для отличающегося имени состояния в конфиге используйте `@ApiName` на enum
entry.

6. Проверьте типы параметров методов билдера:

- формы: `Shape`;
- цвета: `Color`, `Brush`, `InteractiveColor`;
- типографика: `TextStyle`;
- размеры: `Dp`;
- стили других компонентов: `*Style` из `com.sdds.compose.uikit`;
- значения: `enum class`, `Boolean`, `Int`, `Float`;
- иконки: `Int` с `@DrawableRes`;
- stateful-значения: `StatefulValue<T>` над поддерживаемым типом.

Неизвестные типы генератор пропускает.

8. Для нового component key зарегистрируйте делегат в `ComponentDelegates.kt`.
   Отдельные `*Properties`, `*ConfigDelegate` и `*ComposeVariationGenerator` для
   Compose создавать не нужно.

   **Компонент только для Compose (нет View System аналога):**

   ```kotlin
   "example" to universal("Example")
   ```

   **Компонент существует и в View System:**

   ```kotlin
   "example" to universal("Example") { ExampleConfigDelegate() }
   ```

   Вторая форма создаёт `HybridComponentConfigDelegate`: Compose-генерацию берёт
   на себя универсальный механизм, View System — `ExampleConfigDelegate`.
   Если `@ApiInfo` на билдере отсутствует, используется только fallback с предупреждением.

   Если component key уже зарегистрирован, этот шаг пропустите.

9. Проверьте сборку и генератор:

```shell
./gradlew :sdds-core:uikit-compose:compileDebugKotlin
./gradlew :tokens:<lib>:generateComponents
```

После генерации проверьте `<Component>Styles.kt`, вариации,
вложенные блоки `colors`/`dimensions`, состояния и ссылки на стили других
компонентов.

## Частые ошибки

### Компонент не найден в метаданных

Проверьте:

- наличие `@ApiInfo` на основном `StyleBuilder`;
- имя компонента в `@ApiInfo(components = [...])`;
- наличие `sdds/api/uikit-api-meta.json` в UIKit-зависимости;
- регистрацию component key в `ComponentDelegates.kt`.

### Свойство отсутствует в сгенерированном стиле

Проверьте:

- совпадает ли имя метода с ключом в `props`;
- указан ли правильный `@ApiName`;
- поддерживается ли тип первого параметра;
- не помечен ли метод `@Deprecated`;
- присутствует ли свойство в текущей или родительской вариации.

### Иконка распознана как обычный `Int`

Поставьте `@DrawableRes` именно на параметр метода:

```kotlin
fun icon(@DrawableRes icon: Int): ExampleStyleBuilder
```

### Генератор вызывает отсутствующую `builder()`

Укажите фактическую factory-функцию:

```kotlin
@ApiInfo(builderFunName = "exampleBuilder")
```

### Стили попали в неверный пакет

Задайте пакет явно:

```kotlin
@ApiInfo(packageName = "example")
```

Это обязательно, если стандартное имя пакета совпадает с ключевым словом Java.

### Общий билдер генерирует метаданные только для одного компонента

Перечислите все компоненты явно:

```kotlin
@ApiInfo(components = ["ComponentA", "ComponentB"])
```

### Свойство имеет тип `unknown`

Замените тип API на поддерживаемый либо добавьте новый `PropertyMeta` и
`PropertyMapper` в `plugin_theme_builder/internal/universal`.

### View System не генерируется после перехода на universal

Используйте форму с fallback — `universal("Name") { LegacyDelegate() }`.
Простой `universal("Name")` без fallback генерирует только Compose.
