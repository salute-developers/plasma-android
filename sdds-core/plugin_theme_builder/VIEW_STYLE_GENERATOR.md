# Разработка View-компонентов с универсальным генератором стилей

Аналог Compose-механизма `@ApiInfo` для View-системы. Вместо аннотаций на
`StyleBuilder` API View-компонента описывается **разметкой `declare-styleable`**
в ресурсах `sdds-core/uikit` кастомным namespace `sdds`.

Плагин `convention.uikit-api-meta` (модуль `build-system/conventions`) парсит
размеченные `declare-styleable`, собирает `sdds/api/uikit-api-meta.json` и пакует
его в classes.jar внутри AAR. Theme Builder читает эти метаданные из classpath
(задача `readUikitApiMeta`, зеркало `readUikitComposeApiMeta`) — так же, как compose-мету.

XML-разметка — единственный источник знания о View-компоненте для генератора стилей:
покомпонентных генераторов больше нет, поэтому всё, что нужно для воспроизведения
вывода, должно быть выражено здесь.

Compose-компоненты описываются отдельно — аннотациями над `StyleBuilder`. См.
[руководство для Compose](COMPOSE_STYLE_GENERATOR.md).

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
    <declare-styleable name="Avatar" sdds:api_info="Avatar"
        sdds:api_def_style_attr="sd_avatarStyle"
        sdds:api_parent="Sdds.Components.Avatar">
        <attr name="sd_statusSize" format="dimension" />
        <attr name="sd_icon" format="reference" sdds:api_type="icon" />
    </declare-styleable>
</resources>
```

Правила по умолчанию (простой случай — разметка не нужна помимо `api_info` и идентичности):

- **`id` свойства** = имя атрибута без `resourcePrefix` (`sd_statusSize` → `statusSize`).
  `id` — это шов с ключом токен-конфига;
- **тип свойства** выводится из `format` атрибута (в т.ч. найденного кросс-файлово
  по глобальному индексу `attr → format`, т.к. в styleable атрибут часто ссылается
  без `format`), затем — keyword-эвристикой по имени;
- **суффикс имени генерируемого ресурса** = snake_case от имени атрибута
  (`android:minWidth` → `min_width`);
- **`android:*`-атрибуты** игнорируются, пока не размечены явно;
- **непомеченные** `declare-styleable` (без `sdds:api_info`) полностью игнорируются.

**Разметка добавляется по мере необходимости.** Если дефолтных правил достаточно —
дополнительные атрибуты не нужны. Полнота проверяется автоматически: тест
`MarkupCoverageTest` сверяет разметку с фикстурой `legacy-view-bindings.json`,
снятой с рукописных генераторов до их удаления, а задача `compareGeneratedTheme`
семантически сравнивает перегенерированную тему с эталоном.

## Атрибуты namespace

### Идентичность компонента — на `<declare-styleable>`

| Атрибут | Назначение |
|---|---|
| `sdds:api_info` | **Обязательный** маркер. **Логическое** имя компонента — join key с токен-конфигом темы, а не имя styleable (`CellLayout` → `Cell`). Список через запятую, если styleable общий (`"TextField,TextArea"`). |
| `sdds:api_def_style_attr` | Атрибут стиля по умолчанию (`sd_avatarStyle`, `android:buttonStyle`). Обязателен вместе с `api_parent`. |
| `sdds:api_parent` | Родительский стиль из uikit (`Sdds.Components.Avatar`). |
| `sdds:api_core_name` | Имя uikit-класса, если оно отличается от логического имени: сид имён `XxxColorState`, attrs-файла и styleable темы. По умолчанию = `api_info`. |
| `sdds:api_style_name` | Имя генерируемого стиля, если оно исторически отличается от вида компонента в конфиге (`Components.OverlayView`). |
| `sdds:api_color_state_scope` | Кому принадлежит палитра `ColorState`: `class` (по умолчанию) — классу uikit, `variety` — виду компонента. Подробнее ниже. |

Значение — либо голое (один компонент), либо список `Компонент=значение;…` для
мультикомпонентного styleable:

```xml
<declare-styleable name="Button" sdds:api_info="BasicButton,IconButton,LinkButton"
    sdds:api_core_name="BasicButton=Button;IconButton=IconButton;LinkButton=LinkButton"
    sdds:api_color_state_scope="IconButton=variety"
    sdds:api_def_style_attr="BasicButton=android:buttonStyle;IconButton=sd_iconButtonStyle;LinkButton=sd_linkButtonStyle"
    sdds:api_parent="BasicButton=Sdds.Components.Button;IconButton=Sdds.Components.IconButton;LinkButton=Sdds.Components.LinkButton">
```

Отсутствие идентичности целиком означает «компонент не обслуживается генератором»
и ошибкой не является. Частичная разметка — ошибка сборки.

### Свойство — на `<attr>`

| Атрибут | Назначение |
|---|---|
| `sdds:api_name` | Переопределяет `id` свойства (на `<attr>`) или `configName` значения (на `<enum>`), если авто-strip префикса не даёт ключ конфига. |
| `sdds:api_type` | Явный семантический тип (закрытый список ниже). Нужен, когда `format` неоднозначен или эвристика по имени не срабатывает. |
| `sdds:api_res_suffix` | Суффикс имени генерируемого ресурса (`@dimen`/`@color`/`@xml`), если snake_case от имени атрибута не подходит. |
| `sdds:api_res_prefix` | Префикс имени ресурса после имени вариации: `serv_card_solid_l_`**`content`**`_min_width`. Нужен вложенным семьям стилей. |
| `sdds:api_placement` | Куда эмитится `<item>`: `style` (по умолчанию), `overlay` (ThemeOverlay вариации), `theme` (ссылка на ThemeOverlay). |
| `sdds:api_shape_adjustment` | Владеет ли shape-свойство атрибутом `sd_shapeAppearanceAdjustment`. По умолчанию владелец — основной `sd_shapeAppearance`. |
| `sdds:api_default` | Имя `<enum>`, на которое проецируется значение конфига, не совпавшее ни с одним `configName`. Без него несовпадение — ошибка генерации. |
| `sdds:api_state_value` | Дополнительное значение свойства под состоянием (грамматика ниже). |
| `sdds:api_value` | Значение из разметки, а не из конфига: литерал либо `ratio(<ключ>,<ключ>)`. |
| `sdds:api_when` | Условие эмиссии: `<ключ конфига>=<значение>`. |
| `sdds:api_state` | Помечает атрибут как **привязку состояния**; значение — имя набора. |
| `sdds:api_state_kind` | Флейвор состояния: `android` / `shared` / `scoped` (по умолчанию `scoped`). |
| `sdds:api_state_negated` | `true`, если состояние выражается отрицанием (`state=false`). |

### Вложенная семья стилей — на `<declare-styleable>`

| Атрибут | Назначение |
|---|---|
| `sdds:api_sub_style` | Суффикс имени стиля вложенной семьи (`Content` → `Components.CardSolidContent.L`). |
| `sdds:api_sub_style_kind` | `style` (семья стилей плюс её ThemeOverlay, по умолчанию) либо `overlay` (только ThemeOverlay). |
| `sdds:api_style_ref` | Атрибут, которым владелец ссылается на вложенный стиль. |

Удалённые слова: `sdds:api_framework` (framework-атрибуты объявляются обычными
`<attr name="android:*">`) и `sdds:api_package` (во View все `XxxColorState`
генерируются в плоский пакет `<base>.colorstate`).

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
2. По `format` атрибута. `reference` — способ записи значения, а не тип, поэтому
   отбрасывается: `color|reference` → color. Несколько числовых форматов
   (`float|fraction`, `dimension|float`) описывают одну величину и разрешаются
   по приоритету `dimension > float > integer`.
3. Keyword-эвристика по имени, в порядке проверки: `shape` → shape;
   `color`/`tint`/`brush` → color; `shadow` → shadow;
   `textAppearance`/`appearance`/`typography`/`font` → typography;
   `style` → component_style; `padding`/`size`/`width`/`height`/`radius`/`offset`/`inset`/`thickness` → dimension;
   `icon`/`drawable` → icon.
   Порядок значим: `shapeAppearance` — форма, а не типографика; `shadowAppearance` —
   тень; `sd_iconButtonStyleOverlay` — ссылка на стиль, а не иконка; `sd_toggleIconWidth` — размер.
4. Иначе — `unknown`.

## Framework-атрибуты

`android:*` попадают в мету **тогда и только тогда**, когда несут явную разметку —
`sdds:api_name` либо разметку, задающую значение или место эмиссии
(`sdds:api_placement`, `sdds:api_value`). `format` в месте использования у них
отсутствует, поэтому тип задаётся `sdds:api_type`:

```xml
<attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color"
    sdds:api_res_suffix="text_color" />
```

Один ключ конфига может быть привязан к нескольким атрибутам — тогда в мете
появятся две записи с общим `id` и разными `attrName`/`resSuffix`:

```xml
<attr name="android:minWidth" sdds:api_name="width" sdds:api_type="dimension" sdds:api_res_suffix="min_width" />
<attr name="android:maxWidth" sdds:api_name="width" sdds:api_type="dimension" sdds:api_res_suffix="max_width" />
```

## Переименования

```xml
<!-- id свойства -->
<attr name="sd_horizontalPadding" format="dimension" sdds:api_name="indicatorOffsetX" />

<!-- configName значения enum + фолбэк для незамапленных значений -->
<attr name="sd_requirementMode" format="enum" sdds:api_name="fieldType" sdds:api_default="optional">
    <enum name="optional" value="0" />
    <enum name="start" value="1" sdds:api_name="requiredStart" />
    <enum name="end" value="2" sdds:api_name="requiredEnd" />
</attr>
```

## Размещение: `sdds:api_placement`

- **`style`** (по умолчанию) — в стиль вариации;
- **`overlay`** — в ThemeOverlay вариации; для атрибутов, задающих стиль вложенных
  компонентов (они работают только будучи применёнными как тема);
- **`theme`** — в стиль вариации печатается ссылка на ThemeOverlay: собственный
  ThemeOverlay вариации (если атрибут объявлен в styleable компонента) либо
  ThemeOverlay вложенной семьи (если в её styleable). Ссылка публикуется, только
  если целевой ThemeOverlay несёт что-то помимо стандартной ссылки на стиль.

```xml
<attr name="android:checkboxStyle" sdds:api_name="checkBoxStyle"
    sdds:api_type="component_style" sdds:api_placement="overlay" />
<attr name="android:theme" sdds:api_placement="theme" />
```

## Владение adjustment формы: `sdds:api_shape_adjustment`

`sd_shapeAppearanceAdjustment` объявлен в styleable `SdShape` парно к `sd_shapeAppearance`
и в стиле встречается один раз — на все формы компонента. Поэтому владелец у него один:
свойство, которое печатает `<item>` с adjustment, когда конфиг задаёт ненулевое значение.

По умолчанию владелец — основной `sd_shapeAppearance`. Прочие формы (`sd_externalShapeAppearance`,
`sd_internalShapeAppearance`, `sd_itemShapeAppearance`, …) adjustment не печатают: иначе
`ButtonGroup` с внешней и внутренней формой выдал бы одинаковый `<item>` дважды, и тема
не прошла бы `lint` (`DuplicateDefinition`). Там, где adjustment принадлежит не основной
форме, владение задаётся явно:

```xml
<!-- у Wheel adjustment применяется к форме выделения элемента -->
<attr name="sd_itemSelectorShapeAppearance" format="reference"
    sdds:api_name="itemSelectorShape" sdds:api_shape_adjustment="true" />
```

Если конфиг темы задаёт ненулевой adjustment сразу двум владельцам в одном стиле,
генерация падает с ошибкой: конфликт разрешается разметкой, а не выводом.

## Значения под состоянием: `sdds:api_state_value`

Список записей через `;`, закрытая грамматика из двух форм:

- `<состояние>=<ключ конфига>` — значение берётся из другого ключа (алиас);
- `<состояние>=alpha(<ключ конфига>)` — базовое значение с альфой из указанного ключа.

```xml
<!-- readonly-цвета поля ввода -->
<attr name="sd_valueColor" format="reference|color" sdds:api_name="valueColor"
    sdds:api_state_value="readonly=valueColorReadOnly" />

<!-- цвет кнопки под загрузкой: тот же токен с альфой из loadingAlpha -->
<attr name="android:textColor" sdds:api_name="labelColor" sdds:api_type="color"
    sdds:api_state_value="loading=alpha(loadingAlpha)" />
```

Элементы под состоянием попадают в state-list **раньше** базовых: в Android
выигрывает первое совпадение. Имя цветового состояния при этом сохраняется — у
компонента с несколькими видами значение под состоянием своё в каждом виде.

## Вычисляемые и условные значения

```xml
<!-- соотношение сторон из размеров конфига -->
<attr name="sd_aspectRatio" format="float" sdds:api_value="ratio(width,height)" />

<!-- константа под условием по ключу конфига -->
<attr name="sd_fsDuplicateParentState" sdds:api_value="true" sdds:api_when="fsTarget=content" />
```

Условие проверяется в той же области, что и значение: у свойства со значением из
конфига ключ условия ищется по дереву вариаций, у литерала — только в props самой
вариации (иначе литерал размножился бы по всем вариациям).

## Вложенные семьи стилей

Компонент может генерировать не один стиль на вариацию, а пару: собственный стиль
и стиль вложенного вида. Такая семья объявляется отдельным `declare-styleable`,
повторяет дерево вариаций владельца и идентичности не имеет — это не самостоятельный
компонент.

```xml
<!-- контент карточки: Components.CardSolidContent.L + ссылки на него -->
<declare-styleable name="CardContent" sdds:api_info="Card"
    sdds:api_sub_style="Content"
    sdds:api_style_ref="sd_cardContentStyle"
    sdds:api_parent="Sdds.Components.CardContent">
    <attr name="sd_shapeAppearance" sdds:api_name="contentShape" sdds:api_res_prefix="content" />
    <attr name="android:theme" sdds:api_placement="theme" />
</declare-styleable>

<!-- группа чипов поля ввода: только ComponentOverlays.TextFieldXsChips -->
<declare-styleable name="TextFieldChips" sdds:api_info="TextArea,TextField"
    sdds:api_sub_style="Chips" sdds:api_sub_style_kind="overlay"
    sdds:api_style_ref="sd_chipGroupStyleOverlay">
    <attr name="sd_chipGroupStyle" />
</declare-styleable>
```

Ссылки на вложенную семью публикуются, только если у вариации есть собственные
значения её свойств: иначе тема ссылалась бы на пустой стиль.

## Кастомные состояния (ColorState)

Базовая единица — **привязка состояния**: ключ состояния в токен-конфиге
(`sdds:api_name`) → drawable-state атрибут (имя `<attr>`), флейвор и значение
(`true`, либо `false` при `sdds:api_state_negated="true"`). `sdds:api_state`
группирует привязки в именованный набор.

**Порядок привязок в наборе семантики не несёт** и рантайм-контрактом не является:
рантайм-порядок взаимоисключающих состояний задают значения `<enum>`
соответствующего темизируемого свойства (напр. `sd_status`).

```xml
<declare-styleable name="SdAvatarStatus" sdds:api_info="Avatar,Indicator">
    <attr name="sd_status_active" format="boolean"
        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="active" />
    <attr name="sd_status_inactive" format="boolean"
        sdds:api_state="AvatarStatus" sdds:api_state_kind="scoped" sdds:api_name="inactive" />
</declare-styleable>
```

Набор можно привязать к нескольким компонентам, если drawable-state достаётся им
обоим: аватар кладёт `sd_status_*` в drawable-state, который получает его
status-drawable, то есть индикатор.

Несколько привязок с одним `sdds:api_name` образуют **составное состояние**:

```xml
<!-- focused действует только при activated=false; сам state_focused ставит движок -->
<attr name="android:state_activated" sdds:api_state="TextFieldFocus" sdds:api_state_kind="android"
    sdds:api_name="focused" sdds:api_state_negated="true" />
```

Флейвор (`sdds:api_state_kind`) описывает **происхождение drawable-state атрибута**:

- **`android`** — состояние фреймворка (focused/pressed/hovered/activated/checked);
- **`shared`** — общий drawable-state из `base_attrs`, используемый многими
  компонентами (`sd_state_loading`, `sd_state_error`, `sd_state_readonly`, …);
  такие состояния резолвятся по общему словарю модуля автоматически и разметки
  не требуют;
- **`scoped`** — атрибут, специфичный для одного компонента и объявленный в его
  собственных ресурсах (`sd_status_active` в `SdAvatarStatus`). Это существующие
  в core атрибуты — НЕ «сгенерированные»; порождаемые генератором
  `sd_<comp>_state_<name>` появляются лишь в пользовательских ДС после генерации
  стилей и разметке core не подлежат.

Имя состояния из конфига, которое не разрешается ни явной привязкой, ни общим
словарём, ни как framework-состояние, **прерывает генерацию**. Это намеренно:
молча потерянное состояние даёт элемент state-list без атрибутов, который
затирается базовым, и дефект всплывает только на скриншотах.

### Кому принадлежит палитра: `sdds:api_color_state_scope`

Из палитры (набора цветовых состояний вида компонента) генератор порождает enum
`XxxColorState`, boolean-атрибуты `<prefix>_xxx_state_<name>` и enum-атрибут
`<prefix>_xxxColors`. Область владения задаёт, чьё имя лежит в основе этих сущностей:

| Значение | Имя сущностей | Когда |
|---|---|---|
| `class` (по умолчанию) | от `api_core_name` | палитра одинакова у всех видов класса: `badge-clear`/`badge-solid`/`badge-transparent` делят `BadgeColorState` |
| `variety` | от вида компонента в конфиге | виды набирают **разные** палитры: `counter` — семь состояний, `segment-item-counter` — два. Общая сущность в этом случае описывала бы объединение, и вид ссылался бы на состояния, которых у него нет |

```xml
<declare-styleable name="Counter" sdds:api_info="Counter"
    sdds:api_def_style_attr="sd_counterStyle"
    sdds:api_color_state_scope="variety"
    sdds:api_parent="Sdds.Components.Counter">
```

`variety` — не косметика: без него вид со своей палитрой либо перезатирает
attrs-файл соседа, либо ссылается на чужие состояния.

## Пайплайн

```
declare-styleable (+ sdds:)  →  DeclareStyleableParser  →  uikit-api-meta.json
      (uikit ресурсы)          (convention.uikit-api-meta)   (classes.jar в AAR)
                                                                    │
                                            readUikitApiMeta (Theme Builder, classpath)
                                                                    │
                                              ComponentMeta (consumer-модель)
                                                                    │
                                              UniversalViewVariationGenerator
```

Producer-модель (`tasks.viewapi.ApiMeta`) сериализуется через Gson
(модуль `conventions` без compiler-plugin serialization); consumer-модель
(`internal.universal.view.ApiMeta`) помечена `@Serializable`. Модели
намеренно раздельны с compose (`ComposeComponentMeta`): view-мета XML-нативна — несёт
`attrName`, а не `methodName`.

## Полный порядок разработки

1. Добавьте или обновите `declare-styleable` компонента в
   `sdds-core/uikit/src/main/res/values`.
2. Подключите namespace
   `xmlns:sdds="http://schemas.sdds.ru/android/sdds"`.
3. Поставьте на `declare-styleable` маркер `sdds:api_info` с логическим именем
   компонента из component-конфига.
4. Для самостоятельного компонента укажите `sdds:api_def_style_attr` и
   `sdds:api_parent`. При необходимости задайте `api_core_name`,
   `api_style_name` и `api_color_state_scope`.
5. Сопоставьте имена `<attr>` с ключами `props`. Используйте `api_name` только
   там, где автоматическое удаление resource prefix не даёт нужного ключа.
6. Проверьте тип каждого темизируемого свойства. Добавьте `api_type`, если тип
   нельзя однозначно вывести из `format` или имени.
7. Разметьте enum-значения, состояния, stateful-значения, ThemeOverlay и
   вложенные семьи стилей, если они есть у компонента.
8. Сгенерируйте View-метаданные UIKit и убедитесь, что компонент присутствует в
   JSON.
9. Запустите `generateComponents` на View-библиотеке дизайн-системы и проверьте
   получившиеся стили и ресурсы.

Регистрировать компонент в Theme Builder отдельно не нужно. Ключ component-конфига
(`basic-button`) автоматически приводится к имени из `api_info` (`BasicButton`).

## Проверка

Сначала соберите метаданные из XML:

```shell
./gradlew :sdds-core:uikit:generateUikitApiMeta
```

Результат появится по пути:

```text
sdds-core/uikit/build/generated/viewApiMeta/sdds/api/uikit-api-meta.json
```

Сборка UIKit дополнительно проверяет, что метаданные пакуются в AAR:

```shell
./gradlew :sdds-core:uikit:assemble
```

Затем запустите генерацию целевой View-библиотеки:

```shell
./gradlew -p tokens :<lib>:generateComponents
```

После генерации проверьте:

- стили вариаций и их `parent`;
- `<item>` для всех поддержанных `props`;
- ThemeOverlay и ссылки `android:theme`;
- ресурсы `dimen`, `color`, `drawable` и их имена;
- color state lists, порядок state-item и сгенерированные `ColorState`;
- вложенные стили и отсутствие ссылок на пустые семейства.

Для проверки неизменности уже существующей темы можно использовать
`compareGeneratedTheme` с заранее снятым baseline:

```shell
./gradlew -p tokens :<lib>:compareGeneratedTheme --baseline=<каталог>
```

## Примеры в UIKit

Полные рабочие примеры:

- [`button_attrs.xml`](../uikit/src/main/res/values/button_attrs.xml) —
  несколько логических компонентов в одном styleable, переименования,
  framework-атрибуты и `alpha(...)`;
- [`card_attrs.xml`](../uikit/src/main/res/values/card_attrs.xml) —
  `api_when`, литералы и вложенная семья стилей;
- [`image_view_attrs.xml`](../uikit/src/main/res/values/image_view_attrs.xml) —
  отличающиеся логическое имя, имя класса и имя стиля, а также `ratio(...)`;
- [`tabs_attrs.xml`](../uikit/src/main/res/values/tabs_attrs.xml) —
  мультикомпонентная идентичность и Android state binding;
- [`text_field_attrs.xml`](../uikit/src/main/res/values/text_field_attrs.xml) —
  составные состояния, stateful-значения и вложенный ThemeOverlay.

## Частые ошибки

**Компонент не генерируется.** Проверьте наличие `api_info` и соответствие его
логического имени component-конфигу. Имя `declare-styleable` join key не является.

**Ошибка о частичной идентичности.** Для самостоятельного компонента
`api_def_style_attr` и `api_parent` задаются вместе. У styleable, который содержит
только состояния, идентичность можно не указывать вовсе.

**Свойство отсутствует в результате.** Проверьте ключ `api_name`, тип свойства и
его наличие в `props`. Для `android:*` нужна явная разметка: одного имени
framework-атрибута недостаточно.

**Тип свойства равен `unknown`.** Укажите поддерживаемый `api_type` или добавьте
подходящий `format`. Значение `unknown` нельзя задавать явно.

**Значение enum не сопоставлено.** Добавьте `api_name` на нужный `<enum>` либо
задайте `api_default`. Значение `api_default` должно ссылаться на реальное имя
`<enum>`.

**Не разрешается состояние.** Проверьте `api_state`, `api_state_kind`,
`api_name` и наличие drawable-state атрибута. Неизвестные состояния намеренно
останавливают генерацию.

**Некорректное значение атрибута разметки.** `api_type`, `api_placement`,
`api_state_kind`, `api_sub_style_kind`, `api_state_value`, `api_shape_adjustment`
и `api_value` имеют закрытую грамматику; произвольные значения не игнорируются, а
завершают сборку с ошибкой.

**Стиль уже содержит `sd_shapeAppearanceAdjustment`.** У компонента больше одного
shape-свойства с ненулевым adjustment. Оставьте владельцем одно из них через
`sdds:api_shape_adjustment`.
