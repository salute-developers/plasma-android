### Плагин AttributeBuilder

Плагин генерирует базовые атрибуты в uikit на основе списка токенов дефолтной темы.

## Установка
<details>
<summary>Добавить зависимость в gradle</summary>

```groovy
[plugins]
attributebuilder = { id = "io.github.salute-developers.attribute-builder-plugin" }
```
</details>

<details>

<summary>Подключить плагин в build.gradle модуля</summary>

```kotlin
plugins {
	id(libs.plugins.attributebuilder.get().pluginId)
}
```
</details>
<br>

Далее в `build.gradle` uikit библиотеки необходимо сконфигурировать плагин через экстеншн `AttributeBuilderExtension`. В нем указать:

- `themeUrl`, ссылка для скачивания дефолтной темы
- `target` -  `Compose()` или `View(attrPrefix)`. Если таргет View, то необходимо задать префикс для атрибутов.

<details>
<summary>Пример</summary>

```kotlin
plugins {
	...
	id(libs.plugins.attributebuilder.get().pluginId)
}

configure<AttributeBuilderExtension> {
    themeUrl.set("file://${projectDir.path}/meta/meta.zip")
    target.set(AttributeBuilderTarget.View(attrprefix = "sdds"))
}
```
</details>

## Использование
Запускаем `./gradlew :uikit:assemble`. 

Плагин скачает архив с темой по ссылке `themeUrl` и сгенерирует атрибуты под таргет, указанный в `target`. По пути `uikit/build/generated/` должна появиться папка:
 - `uikit/build/generated/attribute-builder` - тема для Compose
 - `uikit/build/generated/attribute-builder-res` - тема для ViewSystem