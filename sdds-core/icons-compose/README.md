# sdds-icons-compose

Compose-иконки дизайн-системы SDDS в виде `androidx.compose.ui.graphics.vector.ImageVector`.

Модуль мультиплатформенный (собран через `convention.cmp-lib`, `addDefaultTargets()` — сейчас `jvm` + `android`) и не зависит от android-ресурсов, поэтому иконки доступны в `commonMain` Compose Multiplatform.

## Использование

```kotlin
import androidx.compose.material3.Icon
import com.sdds.icons.compose.SddsIcons
import com.sdds.icons.compose.Accessibility24

Icon(imageVector = SddsIcons.Accessibility24, contentDescription = null)
```

Каждая иконка — top-level extension-property на объекте `SddsIcons`. Имя = PascalCase от имени XML-ресурса с числовым суффиксом размера: `ic_accessibility_24.xml` → `SddsIcons.Accessibility24`. Доступны размеры 16 / 24 / 36 (не у каждой иконки есть все три).

## Откуда берутся иконки

Иконки **генерируются**, править их вручную не нужно. Источник — тот же набор `android-icons/*.xml`, что и у XML-модуля `sdds-core:icons` (общий источник правды из веб-репозитория `salute-developers/plasma`). Конвертацию XML → `ImageVector` делает [Valkyrie](https://github.com/ComposeGears/Valkyrie) (`svgxml2imagevector`, формат `lazy-property`).

Генерация встроена в единый workflow `.github/workflows/generate-icons.yml`: в одном прогоне обновляются оба модуля (xml + compose) и едут общим релизным PR. Локально генерацию можно воспроизвести тем же вызовом Valkyrie с предварительным отсевом коллизий (см. ниже).

## Отсутствующие иконки (case-insensitive коллизии)

**В Compose-набор НЕ входят 6 иконок**, присутствующих в XML-модуле. Причина — коллизия имён на case-insensitive файловых системах (macOS/Windows): при переводе имени файла в PascalCase Valkyrie убирает подчёркивания, и 6 пар «схлопываются» в имена, отличающиеся только регистром. XML-модуль от этого не страдает (там подчёркивания сохраняются), поэтому там оба варианта пары на месте.

Для Compose из каждой пары оставлен первый вариант (`ic_sb_boom_*` / `ic_sb_box_top_outline_*`), второй — отброшен:

| Остаётся в Compose | Отсутствует в Compose |
|---|---|
| `SbBoomCast` | ~~`ic_sbboom_cast`~~ |
| `SbBoomError` | ~~`ic_sbboom_error`~~ |
| `SbBoomMiniCastOutline` | ~~`ic_sbboom_mini_cast_outline`~~ |
| `SbBoomMiniErrorFill` | ~~`ic_sbboom_mini_error_fill`~~ |
| `SbBoomMiniErrorOutline` | ~~`ic_sbboom_mini_error_outline`~~ |
| `SbBoxTopOutline` | ~~`ic_sbbox_top_outline`~~ |

Отсев детерминирован (`.github/scripts/filter-compose-icon-collisions.sh`) и применяется только к входу Compose-генерации.

Это осознанный компромисс: отброшенные глифы — реально другие иконки, а не дубликаты. Корневой фикс — на стороне plasma (развести имена / поправить трансформацию `sber→Sb`); до него отсутствие этих 6 иконок в Compose-наборе ожидаемо. См. issue в plasma (TODO: ссылка).
