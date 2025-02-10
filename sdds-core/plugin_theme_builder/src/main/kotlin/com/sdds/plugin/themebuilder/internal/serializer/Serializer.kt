package com.sdds.plugin.themebuilder.internal.serializer

import com.sdds.plugin.themebuilder.internal.token.ColorToken
import com.sdds.plugin.themebuilder.internal.token.FontToken
import com.sdds.plugin.themebuilder.internal.token.GradientToken
import com.sdds.plugin.themebuilder.internal.token.ShadowToken
import com.sdds.plugin.themebuilder.internal.token.ShapeToken
import com.sdds.plugin.themebuilder.internal.token.SpacingToken
import com.sdds.plugin.themebuilder.internal.token.Token
import com.sdds.plugin.themebuilder.internal.token.TypographyToken
import com.sdds.plugin.themebuilder.internal.token.Unknown
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.polymorphic
import kotlinx.serialization.modules.subclass

/**
 * Объект сериализации
 * @author Малышев Александр on 07.03.2024
 */
object Serializer {

    /**
     * Экземпляр сериализатора json файла с мета информацией
     */
    val meta: Json = Json {
        ignoreUnknownKeys = true
        serializersModule = SerializersModule {
            polymorphic(Token::class) {
                subclass(ColorToken::class)
                subclass(GradientToken::class)
                subclass(ShadowToken::class)
                subclass(ShapeToken::class)
                subclass(TypographyToken::class)
                subclass(FontToken::class)
                subclass(SpacingToken::class)
                default { Unknown.serializer() }
            }
        }
    }

    /**
     * Экземпляр сериализации json файла со значениями токенов
     */
    val tokenValues: Json = Json {
        ignoreUnknownKeys = true
        classDiscriminator = "kind"
    }

    /**
     * Экземпляр сериализации json файла с конфигами компонентов
     */
    val componentConfig: Json = Json {
        ignoreUnknownKeys = true
    }
}
