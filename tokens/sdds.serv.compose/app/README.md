# SddsServ Compose Sandbox

Мультиплатформенная песочница компонентов SddsServ. Все лаунчеры используют общий
`SddsServSandboxApp` и два адаптивных layout: `Mobile` для узкого окна и `Large`
для окна, достигшего expanded breakpoint.

В `Large` Android использует focus-driven drawer с поддержкой жестов, а iPad,
JVM Desktop, нативный macOS и Web показывают постоянную панель компонентов без
drawer. Узкое окно на любой платформе, включая desktop и Web, использует общий
`Mobile` layout.

## Перед запуском

Все Gradle-команды ниже нужно выполнять из корня репозитория. Для Android нужен
запущенный эмулятор или подключённое устройство. Для iOS и нативного macOS нужен
macOS с Xcode.

## Android

Самый удобный вариант — открыть репозиторий в Android Studio, выбрать конфигурацию
модуля `tokens:sdds.serv.compose:app` и нажать Run.

Либо установить debug-сборку на уже доступное устройство:

```bash
./gradlew :tokens:sdds.serv.compose:app:installDebug
```

После установки приложение называется **Sdds Serv**.

## iOS

Откройте в Xcode проект хоста:

```text
tokens/sdds.serv.compose/app/iosApp/SddsServSandboxHost.xcodeproj
```

Выберите схему `SddsServSandboxHost`, симулятор или устройство и нажмите Run.
Скрипт сборки Xcode самостоятельно собирает и подключает Kotlin framework.

## JVM Desktop

Это desktop-приложение Compose, запущенное в JVM. На macOS оно не является
нативным `.app`:

```bash
./gradlew :tokens:sdds.serv.compose:app:run
```

## Нативный macOS

Нативный launcher Kotlin/Native доступен для Apple Silicon (`macosArm64`):

```bash
# Собрать и запустить нативное debug .app
./gradlew :tokens:sdds.serv.compose:app:runDebugExecutableMacosArm64

# Собрать установочный образ .dmg
./gradlew :tokens:sdds.serv.compose:app:packageDmgNativeDebugMacosArm64
```

Задача запуска сама соберёт executable при необходимости. Для Intel Mac нативный
launcher пока не собирается.

## Web: Wasm

Основной web-launcher. Запускает локальный dev-сервер; адрес, как правило,
`http://localhost:8080/`, будет напечатан в консоли:

```bash
./gradlew :tokens:sdds.serv.compose:app:wasmJsBrowserDevelopmentRun
```

### Проверка mobile layout

Отдельной web-сборки для мобильных устройств нет: тот же Wasm-бандл адаптирует
интерфейс к ширине viewport и переключается между общими `Mobile` и `Large`.
Откройте адрес dev-сервера в браузере, включите Device Toolbar в DevTools
(`⌘⇧M`), выберите устройство и перезагрузите страницу.

Production bundle:

```bash
./gradlew :tokens:sdds.serv.compose:app:wasmJsBrowserDistribution
```

Результат находится в `build/dist/wasmJs/productionExecutable`.

## Web: JavaScript

Compatibility launcher для браузеров без поддержки Kotlin/Wasm. Его нужно запускать
отдельно от Wasm, так как оба dev-сервера используют один порт:

```bash
./gradlew :tokens:sdds.serv.compose:app:jsBrowserDevelopmentRun
```

Production bundle:

```bash
./gradlew :tokens:sdds.serv.compose:app:jsBrowserDistribution
```

Результат находится в `build/dist/js/productionExecutable`.

## Smoke test адаптивного layout

Для JVM Desktop или любого Web-launcher-а:

1. Откройте приложение в окне шире expanded breakpoint и выберите любую story,
   кроме первой. Убедитесь, что панель компонентов и панель свойств постоянно
   видимы.
2. Не меняя выбранную story, уменьшите ширину окна ниже breakpoint. Должен
   появиться общий `Mobile` layout: route выбранной story сохраняется, а свойства
   компонента переходят в нижнюю панель.
3. Верните expanded-ширину. Та же story должна остаться открытой, постоянные
   панели компонентов и свойств должны появиться снова, без slide-анимации.
4. Снова уменьшите окно и перейдите на другую story через mobile-список.
   Переход должен использовать горизонтальную slide-анимацию; повторное
   расширение окна не должно сбрасывать выбранный route.

## Ограничения

Нативный macOS launcher пока не выпускает universal binary, не включает signing /
notarization и не предназначен для App Store. Wasm и JavaScript — два независимых
web-bundle-а; автоматического переключения между ними во время работы нет.
