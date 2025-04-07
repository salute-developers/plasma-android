## Быстрый старт
1. Добавить в build.gradle файл следующие зависимости
```kotlin
    implementation("io.github.salute-developers:plasma-sd-service:$plasmaServVersion")
    implementation("io.github.salute-developers:sdds-uikit:$uikitVersion")
```

Дополнительно, если Вам нужен набор иконок:
```kotlin
    implementation("io.github.salute-developers:sdds-icons:$iconsVersion")
```

2. Унаследовать тему вашего приложения от `Plasma.SdService.MaterialComponents.DayNight`, например:
```xml
 <style name="YourAppTheme" parent="Plasma.SdService.MaterialComponents.DayNight"> ... </style>
```
`MaterialComponents` в названии означает, что тема `Plasma.SdService` имеет совместимость с Material, что может быть полезно
при переходе на Plasma.SdService или при использовании компонентов из Material совместно с компонентами из `sdds-uikit`.

3. Done

## Как использовать токены цвета и градиента
Токены цвета делятся на несколько логических групп, согласно назначению элемента: `text`, `surface`, `background` и `outline`.

Эти группы в свою очередь делятся на подтемы:
- `Default` - По умолчанию, значения токенов меняются в зависимости от темы
- `OnDark` - Статические значения токенов из тёмной темы, не меняются при переключении темы,
- `OnLight` - Статические значения токенов из светлой темы, не меняются при переключении темы,
- `Inverse` Инвертированные значения токенов подтемы `Default`.

Токены цвета представляют из себя hex значения, токены градиента - XML ShapeDrawable файлы и стили, описывающие шейдеры градиентов.

### Структура именования токена цвета
```
область применения + подтема + название состояния
```

Например,
- Figma токену с названием `🌕 Surfaces Default/Accent/surfaceAccent` в коде будет соответствовать аттрибут `?plasma_surfaceDefaultAccent`.
- Figma токену c названием `🌕 Surfaces Default/Transparent/surfaceTransparentSecondary` в коде будет соответствовать аттрибут `?plasma_surfaceDefaultTransparentSecondary`

>Для поддержки возможности изменения тем приложения, а также использования механизм ThemeOverlay, рекомендуется использовать токены цвета через атрибуты темы.

## Как использовать токены скруглений
Большинство компонентов из `sdds-uikit` поддерживают установку аттрибута `sd_shapeAppearance`, который работает по аналогии с Material shapeAppearance.
Если кратко, то компоненту с аттрибутом `sd_shapeAppearance` устанавливается ShapeDrawable в качестве background. В отличие от Material, атрибуты `sd_shapeAppearance` и `android:background` могут быть использованы вместе только, если в `android:background` устанавливается экземпляр ShapeDrawable (например, токены градиентов). В этом случае sd_shapeAppearace переопределить скругления в установленном ShapeDrawable. Во всех остальных случаях `sd_shapeAppearance` нужно использовать в связке с `android:backgroundTint`.

Значение аттрибута `sd_shapeAppearance` - это ссылка на стили, у которых родительский стиль `Plasma.SdService.Shape`. Рекомендуется использовать стили НЕ напрямую, а через аттрибуты темы.

Токены скруглений разделяются на группы согласно размеру скругления: Xxs, Xs, S, M, L, Xl, Xxl и Rounded. Токен скругления в фигма имеет следующую структуру названия:
```
CornerRadius/cR<название размера>
```

Допускаются также вычисляемые значения:
```
CornerRadius/calc:[cR<название размера> - 2]
```

Т.е. Figma токену `CornerRadius/cRm` будет соответствовать в коде стиль `@style/Plasma.SdService.Shape.Round.M` и аттрибут `?plasma_shapeRoundM`.

А Figma токену `CornerRadius/calc:[cRl - 2]` будет соответствовать в коде стиль `@style/Plasma.SdService.Shape.Round.L` и аттрибут `?plasma_shapeRoundL`, но уже с дополнительно установленным параметром `sd_shapeAppearanceAdjustment = -2dp`.


## Как использовать токены начертаний:
В Figma токены типографики делятся на группы: `Display`, `Body`, `Header`, `Text`.
И на подгруппы: `Large Screens`, `Medium Screens`, `Small Screens`.

## Структура названия токена начертания
```
Группа + Подгруппа + Уникальное название токена
```

Figma токену с названием `Body/BodyL B` будет соответствовать в коде стили `@style/Plasma.SdService.Typography.BodyLBold`, `@style/Plasma.SdService.TextAppearance.BodyLBold` и аттрибут `plasma_typographyBodyLBold`.

>Важно отметить, что выбор подгруппы `Large Screens`, `Medium Screens`, `Small Screens` разруливается автоматически при помощи переопределенных ресурсов.


## Как использовать стилизованные компоненты
Библиотека `star_designsystem` предоставляет только токены и стили для компонентов, но не сами компоненты. Поэтому `star_designsystem` должна использоваться в связке с `sdds-uikit`. Т.е. важно понимать, что в своих layout нужно использовать компоненты из пакета com.sdds.uikit. Стоит отметить также, что некоторые андроид компоненты могут быть автоматически подменены на соответствующие компоненты из com.sdds.uikit при помощи StarLayoutInflater.

Стили компонентов начинаются с префикса `Plasma.SdService.Components`.
Например, figma компоненту `BasicButton M` с view = Accent будет в коде соответствовать стиль @style/Plasma.SdService.Components.BasicButton.M.Accent.

Перечень доступных компонентов и примеры их использования можно посмотреть в демо-приложении `:sandbox-compose`.

Исходный код компонентов доступен [здесь](https://github.com/salute-developers/plasma-android/tree/develop/sdds-core/uikit).
