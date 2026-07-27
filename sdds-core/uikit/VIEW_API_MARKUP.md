# Разметка View-компонентов для универсального генератора стилей

Аналог compose-механизма `@ApiInfo` для View-систем. Вместо аннотаций на
`StyleBuilder` API View-компонента описывается **разметкой `declare-styleable`**
в ресурсах `sdds-core/uikit` кастомным namespace `sdds`.

Плагин `convention.uikit-api-meta` (модуль `build-system/conventions`) парсит
размеченные `declare-styleable`, собирает `sdds/api/uikit-api-meta.json` и пакует
его в classes.jar внутри AAR. Theme Builder читает эти метаданные из classpath
(задача `readUikitApiMeta`, зеркало `readUikitComposeApiMeta`) — так же, как compose-мету.

## Namespace

```xml
<resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
```

Namespace `sdds` **opt-in** и не влияет на сборку ресурсов: AAPT2 трактует его как
`tools:` — префиксные атрибуты вычищаются на этапе merge/link и не попадают
в `R.txt` / AAR-ресурсы (проверено на build-tools 35/36/37, `assembleRelease`).

## Минимальный пример

```xml
<resources xmlns:sdds="http://schemas.sdds.ru/android/sdds">
    <declare-styleable name="Button" sdds:api_info="Button">
        <attr name="sd_valuePadding" format="dimension" />
        <attr name="sd_icon" format="reference" sdds:api_type="icon" />
    </declare-styleable>
</resources>
```

Правила по умолчанию (простой случай — разметка не нужна помимо `api_info`):

- **`id` свойства** = имя атрибута без `resourcePrefix` (`sd_valuePadding` → `valuePadding`).
  `id` — это шов с ключом токен-конфига.
- **тип свойства** выводится из `format` атрибута (в т.ч. найденного кросс-файлово
  по глобальному индексу `attr → format`, т.к. в styleable атрибут часто ссылается
  без `format`), затем — keyword-эвристикой по имени.
- **`android:*`-атрибуты** игнорируются (не темизируются генератором).
- **непомеченные** `declare-styleable` (без `sdds:api_info`) полностью игнорируются.

## Атрибуты namespace

| Атрибут | Где | Назначение |
|---|---|---|
| `sdds:api_info` | `<declare-styleable>` | **Обязательный** маркер. Имя компонента; список через запятую — если styleable общий (`"TextField,TextArea"`). |
| `sdds:api_package` | `<declare-styleable>` | Пакет генерируемых стилей. Обход зарезервированных слов языка генерации (напр. `switch` → `switcher`). |
| `sdds:api_name` | `<attr>` / `<enum>` | Переопределяет `id` свойства / `configName` значения, если авто-strip префикса не даёт нужный ключ конфига. |
| `sdds:api_type` | `<attr>` | Явный семантический тип (см. закрытый список ниже). Нужен, когда `format` неоднозначен (`reference`, `reference\|color`) или эвристика по имени не срабатывает. |
| `sdds:api_state` | `<attr>` | Помечает атрибут как **кастомное состояние**; значение — имя набора (= имя генерируемого `XxxColorState`-enum). |
| `sdds:api_state_kind` | `<attr>` | Флейвор состояния: `android` / `shared` / `scoped` (по умолчанию `scoped`). |
| `sdds:api_state_negated` | `<attr>` | `true`, если состояние выражается отрицанием (`state=false`). |

## Закрытый список `sdds:api_type`

Выровнен с `@SerialName` в compose-`ComposePropertyMeta`, чтобы семантика типов совпадала
между стеками. Любое иное значение — ошибка сборки (`MarkupException`).

`color`, `dimension`, `typography`, `shape`, `shadow`, `icon`, `component_style`,
`boolean`, `integer`, `float`, `value`

`value` — enum-атрибут (`format="enum"`): значения `<enum>` собираются в `values`
с `name` / `value` / `configName`. `unknown` — внутренний fallback классификатора
для нетемизируемых свойств (напр. `string`); в разметке указывать **нельзя**.

### Классификация: приоритет

1. Явный `sdds:api_type` (валидируется по закрытому списку).
2. По `format` атрибута (`dimension`/`boolean`/`integer`/`float`/`color`/`enum`).
3. Keyword-эвристика по имени: `shape` → shape; `color`/`tint`/`brush` → color;
   `textAppearance`/`typography`/`font` → typography; `shadow` → shadow;
   `icon`/`drawable` → icon; `padding`/`size`/`width`/`height`/`radius`/`offset`/`inset` → dimension.
4. Иначе — `unknown`.

## Переименования

```xml
<!-- id атрибута -->
<attr name="sd_horizontalPadding" format="dimension" sdds:api_name="indicatorOffsetX" />

<!-- configName значения enum -->
<attr name="sd_spacing" format="enum">
    <enum name="packed" value="0" />
    <enum name="spaceBetween" value="1" sdds:api_name="space-between" />
</attr>
```

## Кастомные состояния (ColorState)

Состояния собираются в наборы по `sdds:api_state`; **порядок объявления задаёт
`ordinal`** — это рантайм-контракт `XxxColorStateProvider` (читает `getInt(...)` по
ordinal). Не переупорядочивайте состояния внутри набора.

Размечаются **реально существующие** в ресурсах компонента drawable-state
атрибуты (напр. `sd_status_active` в `SdAvatarStatus` у Avatar):

```xml
<declare-styleable name="SdAvatarStatus" sdds:api_info="Avatar">
    <attr name="sd_status_active" format="boolean"
        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="active" />
    <attr name="sd_status_inactive" format="boolean"
        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="inactive" />
</declare-styleable>
```

Флейвор (`sdds:api_state_kind`) описывает **происхождение drawable-state атрибута**,
а не то, что он кем-то генерируется:

- **`android`** — состояние фреймворка (focused/pressed/hovered/activated/checked),
  резолвится автоматически по совпадению имени.
- **`shared`** — общий drawable-state, объявленный в `base_attrs` и используемый
  многими компонентами (напр. `sd_state_loading`, `sd_state_error`).
- **`scoped`** — drawable-state атрибут, специфичный для одного компонента и
  объявленный в его собственных ресурсах (напр. `sd_status_active` в `SdAvatarStatus`).
  Это существующие в core атрибуты — НЕ «сгенерированные»; порождаемые генератором
  `sd_<comp>_state_<name>` появляются лишь в пользовательских ДС после генерации
  стилей и разметке core не подлежат.

## Пайплайн

```
declare-styleable (+ sdds:)  →  DeclareStyleableParser  →  uikit-api-meta.json
      (uikit ресурсы)          (convention.uikit-api-meta)   (classes.jar в AAR)
                                                                    │
                                            readUikitApiMeta (Theme Builder, classpath)
                                                                    │
                                              ComponentMeta (consumer-модель)
```

Producer-модель (`tasks.viewapi.ComponentMeta`) сериализуется через Gson
(модуль `conventions` без compiler-plugin serialization); consumer-модель
(`internal.universal.ComponentMeta`) помечена `@Serializable`. Модели
намеренно раздельны с compose (`ComposeComponentMeta`): view-мета XML-нативна — несёт
`attrName`, а не `methodName`.
