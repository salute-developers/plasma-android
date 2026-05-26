---
id: quick_start
title: Быстрый старт
sidebar_position: 1
slug: /
---

1. Добавить в build.gradle файл следующие зависимости
```kotlin
implementation("io.github.salute-developers:{{ docs-artifactId }}:{{ docs-artifactVersion }}")
implementation("io.github.salute-developers:sdds-uikit-compose:{{ docs-uikitComposeVersion }}")
```
Дополнительно, если Вам нужен набор иконок:
```kotlin
implementation("io.github.salute-developers:sdds-icons:{{ docs-iconsVersion }}")
```

2. Добавить в тему вашего приложения тему `{{ docs-theme-codeReference }}`, например:
```kotlin
private val DarkColors = dark{{ docs-theme-prefix }}Colors()
private val LightColors = light{{ docs-theme-prefix }}Colors()
private val DarkGradients = dark{{ docs-theme-prefix }}Gradients()
private val LightGradients = light{{ docs-theme-prefix }}Gradients()

/**
 * Тема приложения
 */
@Composable
fun YourAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        darkTheme -> DarkColors
        else -> LightColors
    }
    {{ docs-theme-codeReference }}(
        colors = colorScheme,
        gradients = if (darkTheme) DarkGradients else LightGradients,
        content = content,
    )
}
```

3. Готово

## Что прочитать дальше

Чтобы быстро разобраться, как работать с дизайн-системой в Compose, пройдите разделы в таком порядке.

### 1. Базовое подключение темы

Начните с этого раздела и убедитесь, что приложение обернуто в `{{ docs-theme-codeReference }}`. Без темы компоненты не получат корректные токены цветов, градиентов и типографики.

### 2. Токены темы

Прочитайте базовые разделы про токены:

- [Токены цвета и градиентов](theme/Colors.md) - как устроены `colors`, `gradients`, группы токенов и подтемы.
- [Токены типографики](theme/Typography.md) - какие текстовые стили доступны и как брать их из темы.
- [Токены скруглений](theme/Shapes.md) - как использовать shape-токены.

Эти разделы нужны, если вы пишете собственный layout рядом с готовыми компонентами или настраиваете отдельные визуальные элементы вручную.

### 3. Подтемы и инверсия

После базовых токенов прочитайте [Подтемы. Инверсия цветов](theme/SubThemes.md).

Подтемы нужны для блоков, которые находятся на локально светлом, темном или инвертированном фоне: карточки, баннеры, bottom sheet, модальные окна, промо-блоки. В таких местах лучше использовать `OnLight`, `OnDark` или `Inverse`, а не подбирать цвета вручную.

### 4. Стили компонентов

Дальше прочитайте [Стилизация компонентов](theme/Styles.md).

Этот раздел объясняет:

- как устроены `Style` и `StyleBuilder`;
- как компонент получает стиль через `CompositionLocal`;
- как переопределять стиль одного компонента или группы компонентов;
- как работают `StatefulValue` и `InteractiveColor`;
- почему слоты компонентов уже стилизованы через `CompositionLocalProvider`.

После этого будет понятнее, когда использовать готовый generated style, когда собирать свой style через builder и почему обычно не нужно вручную красить `Text`, `Icon`, `Counter`, `Badge` и другие вложенные компоненты внутри слотов.

### 5. Компоненты

Для конкретного UI открывайте страницу нужного компонента в разделе `components`.

Обычно на странице компонента есть:

- минимальный пример использования;
- screenshots;
- список сгенерированных стилей;
- пример создания собственного стиля через builder;
- дополнительные сценарии и состояния компонента.

Если вы только начинаете, удобно посмотреть базовые компоненты:

- [Text](components/TextUsage.md)
- [Icon](components/IconUsage.md)
- [Button](components/BasicButtonUsage.md)
- [TextField](components/TextFieldUsage.md)
- [Cell](components/CellUsage.md)
- [List](components/ListUsage.md)

### 6. Motion API

Если компонент должен менять визуальные значения при смене состояний, прочитайте [Анимация изменения состояний компонентов](graphics/MotionAPI.md).

Раздел нужен, когда вы:

- работаете со stateful-значениями и анимациями;
- настраиваете `MotionStyle`;
- хотите анимировать переходы между `pressed`, `focused`, `selected`, `expanded`, `collapsed` и другими состояниями;
- используете `InteractionSource` или `SemanticStateSource`.

Для обычного использования готовых компонентов Motion API знать не обязательно, но он важен для разработки новых компонентов и сложной кастомизации.

### Минимальный маршрут

Если времени мало, прочитайте:

1. этот быстрый старт;
2. [Токены цвета и градиентов](theme/Colors.md);
3. [Подтемы. Инверсия цветов](theme/SubThemes.md);
4. [Стилизация компонентов](theme/Styles.md);
5. страницу нужного компонента из `components`.
