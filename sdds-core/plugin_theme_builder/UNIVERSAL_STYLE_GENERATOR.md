# Разработка Compose-компонентов с универсальным генератором стилей

Универсальный генератор строит стили компонента по API его `StyleBuilder`.
Описание свойств больше не нужно дублировать в `plugin_theme_builder`: KSP читает
аннотации и методы билдера, формирует `uikit-api-meta.json`, а Theme Builder
использует эти метаданные для разбора конфига и генерации Kotlin-кода.

Для нового Compose-компонента больше не требуются:

- отдельная модель `*Properties`;
- отдельный `*ConfigDelegate` для Compose;
- отдельный `*ComposeVariationGenerator`;
- ручной маппинг каждого свойства в вызов билдера.

## Минимальный пример

Билдер стиля должен:

1. быть помечен `@ApiInfo`;
2. содержать методы, имена которых совпадают с ключами в `props` конфига.

```kotlin
import androidx.annotation.DrawableRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import com.sdds.api.info.compose.ApiInfo
import com.sdds.compose.uikit.style.StyleBuilder

@ApiInfo
interface ExampleStyleBuilder : StyleBuilder<ExampleStyle> {
    fun shape(shape: Shape): ExampleStyleBuilder

    fun labelStyle(labelStyle: TextStyle): ExampleStyleBuilder

    fun enabled(enabled: Boolean): ExampleStyleBuilder

    fun maxLines(maxLines: Int): ExampleStyleBuilder

    fun disableAlpha(disableAlpha: Float): ExampleStyleBuilder

    fun actionStyle(actionStyle: ButtonStyle): ExampleStyleBuilder

    fun actionIcon(@DrawableRes actionIcon: Int): ExampleStyleBuilder

    @Composable
    fun colors(builder: @Composable ExampleColorsBuilder.() -> Unit): ExampleStyleBuilder

    @Composable
    fun dimensions(builder: @Composable ExampleDimensionsBuilder.() -> Unit): ExampleStyleBuilder
}

interface ExampleColorsBuilder {
    fun backgroundColor(backgroundColor: Color): ExampleColorsBuilder
    fun labelColor(labelColor: Color): ExampleColorsBuilder
}

interface ExampleDimensionsBuilder {
    fun height(height: Dp): ExampleDimensionsBuilder
    fun contentPadding(contentPadding: Dp): ExampleDimensionsBuilder
}
```

Для такого API конфиг может содержать:

```json
{
  "props": {
    "shape": { "value": "round.m" },
    "labelStyle": { "value": "body.m.normal" },
    "enabled": { "value": true },
    "maxLines": { "value": 2 },
    "disableAlpha": { "value": 0.4 },
    "actionStyle": { "value": "basic-button.default" },
    "actionIcon": { "value": "actions.close" },
    "backgroundColor": {
      "type": "color",
      "default": "surface.default.primary"
    },
    "labelColor": {
      "type": "color",
      "default": "text.default.primary"
    },
    "height": { "value": 48 },
    "contentPadding": { "value": 12 }
  }
}
```

Генератор сам сгруппирует свойства в вызовы верхнего билдера:

```kotlin
ExampleStyle.builder()
    .shape(...)
    .labelStyle(...)
    .enabled(true)
    .maxLines(2)
    .disableAlpha(0.4f)
    .actionStyle(...)
    .actionIcon(...)
    .colors {
        backgroundColor(...)
        labelColor(...)
    }
    .dimensions {
        height(...)
        contentPadding(...)
    }
```

## Как KSP читает билдер

KSP обрабатывает объявленные в интерфейсе методы, кроме:

- `style`, `build`, `equals`, `hashCode`, `toString`;
- методов с `@Deprecated`;
- методов без параметров.

Обычный метод становится свойством корневого билдера. Метод с extension-lambda
рекурсивно раскрывается как группа. Например:

```kotlin
fun colors(builder: ExampleColorsBuilder.() -> Unit): ExampleStyleBuilder
```

помещает свойства `ExampleColorsBuilder` в группу `colors`. Вложенные builder-lambda
также поддерживаются: путь группы будет иметь вид `group.nestedGroup`.

Если свойства нет в конкретной вариации конфига, вызов билдера не генерируется.
Значение будет взято из родительской вариации либо останется дефолтным значением
реализации билдера.

## Поддерживаемые типы

Тип свойства определяется по типу первого параметра метода.

| Свойство | Типы в API билдера |
|---|---|
| Shape | тип, имя которого содержит `Shape` |
| Color/gradient | `Color`, `Brush`, `InteractiveColor`, `StatefulValue` над ними |
| Typography | `TextStyle` и типы с `Typography` или `Font` в имени |
| Dimension | `Dp` и типы с `Dimension`, `Padding`, `Size`, `Width`, `Height`, `Radius`, `Diameter` в имени |
| Shadow | типы с `Shadow` в имени |
| Component style | типы `*Style` из `com.sdds.compose.uikit` |
| Icon | `Int`, если параметр помечен `@DrawableRes` |
| Value | `enum class` |
| Primitive | `Boolean`, `Int`, `Float` |

Для color, shape, typography, dimension и shadow поддерживаются также списки.
`StatefulValue<T>` распознается по вложенному типу `T`.

Неизвестный тип попадает в метаданные как `unknown`, но генератор пропускает такое
свойство. Поэтому новый тип нужно либо выразить через поддерживаемый API, либо
сначала добавить для него `PropertyMeta` и `PropertyMapper` в
`plugin_theme_builder/internal/universal`.

## Перегрузки

Можно оставить несколько перегрузок одного свойства. KSP объединяет их по ключу
конфига, а генератор выбирает подходящую перегрузку по фактическому значению.

Пример из `AvatarColorsBuilder`:

```kotlin
@ApiName(name = "background")
fun backgroundColor(backgroundColor: Color): AvatarColorsBuilder = this

@ApiName(name = "background")
fun backgroundColor(backgroundColor: Brush): AvatarColorsBuilder = this

@ApiName(name = "background")
fun backgroundColor(backgroundColor: InteractiveColor): AvatarColorsBuilder = this

@ApiName(name = "background")
fun backgroundColor(backgroundColor: StatefulValue<Brush>): AvatarColorsBuilder = this
```

Все методы описывают один ключ `background`. Для stateful-значения приоритет имеет
перегрузка со `StatefulValue`, затем `InteractiveColor`, затем обычный тип.

## Аннотации

Аннотации находятся в
`sdds-core/api-info-compose/src/main/kotlin/com/sdds/api/info/compose/ApiInfo.kt`.

### `@ApiInfo`

В обычном случае достаточно аннотации без параметров:

```kotlin
@ApiInfo
interface CounterStyleBuilder : StyleBuilder<CounterStyle>
```

Имя компонента выводится удалением суффикса `StyleBuilder` или `Builder`:
`CounterStyleBuilder` превращается в `Counter`.

### Один билдер для нескольких компонентов

Перечислите все имена из component meta-конфига:

```kotlin
@ApiInfo(components = ["TextField", "TextArea"])
interface TextFieldStyleBuilder : StyleBuilder<TextFieldStyle>
```

Реальный пример находится в `TextFieldStyleBuilder.kt`.

### Нестандартный пакет сгенерированных стилей

`packageName` нужен, когда имя компонента нельзя использовать как имя пакета.
Например, `switch` является ключевым словом Java:

```kotlin
@ApiInfo(packageName = "switcher")
interface SwitchStyleBuilder : StyleBuilder<SwitchStyle>
```

### Нестандартная factory-функция билдера

По умолчанию генератор создает стиль через `Style.builder()`. Если функция
называется иначе, укажите `builderFunName`:

```kotlin
fun ButtonStyle.Companion.basicButtonBuilder(
    receiver: Any? = null,
): BasicButtonStyleBuilder = DefaultBasicButtonStyle.Builder(receiver)

@ApiInfo(builderFunName = "basicButtonBuilder")
interface BasicButtonStyleBuilder : StyleBuilder<ButtonStyle>
```

Так оформлены `BasicButton`, `IconButton`, `LinkButton`, `Badge` и `IconBadge`.

### `@ApiName`

По умолчанию ключ конфига равен имени метода. Если API и конфиг используют разные
имена, пометьте метод:

```kotlin
@ApiName(name = "labelStyle")
fun textStyle(textStyle: TextStyle): CounterStyleBuilder
```

Другие примеры из UIKit:

```kotlin
@ApiName(name = "paddingLeft")
fun paddingStart(paddingStart: Dp): CounterDimensionsBuilder

@ApiName(name = "closedIcon")
fun iconClosed(@DrawableRes iconClosed: Int?): AccordionItemStyleBuilder

@ApiName(name = "trackShape")
fun shape(shape: CornerBasedShape): SliderStyleBuilder
```

Если у свойства есть перегрузки, одинаковый `@ApiName` нужно поставить на
каждую участвующую перегрузку.

`@ApiName` также поддерживается для enum-значений:

```kotlin
enum class NavigationBarTextPlacement {
    @ApiName(name = "text-inlined")
    Inline,
    Bottom,
}
```

### `@ApiStateSet`

Если значения свойств зависят от кастомного состояния компонента, пометьте enum:

```kotlin
@ApiStateSet(components = ["Avatar", "Indicator"])
enum class AvatarStatus : ValueState {
    None,
    Active,
    Inactive,
}
```

Если `components` не указан, имя компонента выводится из имени enum удалением
суффикса `StateSet`, `States` или `State`.

Для отличающихся имен state в конфиге используйте `@ApiName` на enum entry:

```kotlin
@ApiStateSet(components = ["Editable"])
enum class EditableState : ValueState {
    @ApiName(name = "readonly")
    ReadOnly,
}
```

## Полный порядок разработки

1. Реализуйте `ComponentStyle`, его companion factory и `StyleBuilder`.
2. Добавьте `@ApiInfo` на основной интерфейс `StyleBuilder`.
3. Проверьте соответствие имен методов ключам `props`; расхождения оформите через
   `@ApiName`.
4. Для специальной factory-функции задайте `builderFunName`.
5. Для общего билдера задайте `components`, для специального пакета —
   `packageName`.
6. Для кастомных состояний добавьте `@ApiStateSet`.
7. Убедитесь, что каждый параметр имеет поддерживаемый тип и что иконки помечены
   `@DrawableRes`.
8. Зарегистрируйте компонент в `ComponentDelegates.kt`. Это единственная запись,
   которую нужно добавить; отдельный делегат или генератор создавать не нужно.
   Для уже зарегистрированных компонентов этот шаг не нужен.

### Регистрация в ComponentDelegates.kt

Выберите один из двух вариантов в зависимости от наличия View System:

**Только Compose — нет View System аналога:**

```kotlin
"example" to universal("Example")
```

**Compose + View System — существует legacy-делегат:**

```kotlin
"example" to universal("Example") { ExampleConfigDelegate() }
```

В этом случае используется `HybridComponentConfigDelegate`:
- Compose-стили генерирует `UniversalComposeVariationGenerator` через мета из `@ApiInfo`;
- View System стили генерирует `ExampleConfigDelegate` (старый путь).

Если `@ApiInfo` на билдере отсутствует и мета не найдена, система выводит
предупреждение и использует только legacy fallback. Это позволяет регистрировать
компоненты до того, как Compose-билдер полностью реализован.

Примеры из реального кода:

```kotlin
// Только Compose (компонент есть только в Compose)
"loader" to universal("Loader"),

// Compose + View System
"avatar" to universal("Avatar") { AvatarConfigDelegate() },
"basic-button" to universal("BasicButton") { ButtonConfigDelegate(ButtonType.Basic) },
"drawer" to universal("Drawer") { DrawerConfigDelegate() },
```

После регистрации Compose-часть Theme Builder автоматически использует
`UniversalComponentConfigDelegate` и `UniversalComposeVariationGenerator`.

## Проверка

Сначала проверьте генерацию KSP-метаданных и компиляцию UIKit:

```shell
./gradlew :sdds-core:uikit-compose:compileDebugKotlin
```

В артефакте UIKit должен появиться ресурс:

```text
sdds/api/uikit-api-meta.json
```

Затем запустите генератор:

```shell
./gradlew :tokens:<lib>:generateComponents
```

После генерации целевой дизайн-системы проверьте:

- файл `<Component>Styles.kt` в пакете стилей компонента;
- наличие всех вариаций и наследования родительских `props`;
- корректные блоки `colors`, `dimensions` и другие вложенные группы;
- stateful-значения и импорты enum состояния;
- ссылки на стили других компонентов;
- отсутствие ошибок `unknown` для обязательных свойств.

## Частые ошибки

**Компонент не найден в метаданных.**
Проверьте `@ApiInfo`, имя в `components` и наличие
`uikit-api-meta.json` в UIKit-зависимости Theme Builder.

**Свойство отсутствует в сгенерированном стиле.**
Проверьте имя ключа, `@ApiName`, тип первого параметра и отсутствие
`@Deprecated` на методе.

**Иконка распознана как обычный `Int`.**
Аннотация `@DrawableRes` должна стоять на параметре метода билдера.

**Генератор вызывает `builder()`, которой нет.**
Укажите реальное имя функции в `@ApiInfo(builderFunName = "...")`.

**Стили генерируются в неверный пакет.**
Укажите `@ApiInfo(packageName = "...")`; это особенно важно для имен,
совпадающих с ключевыми словами Java.

**Один билдер используется несколькими компонентами, но генерируется только один.**
Явно перечислите все компоненты в `@ApiInfo(components = [...])`.
