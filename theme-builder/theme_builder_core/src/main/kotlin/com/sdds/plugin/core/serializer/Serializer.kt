package com.sdds.plugin.core.serializer

import com.sdds.plugin.core.token.ColorToken
import com.sdds.plugin.core.token.FontToken
import com.sdds.plugin.core.token.GradientToken
import com.sdds.plugin.core.token.ShadowToken
import com.sdds.plugin.core.token.ShapeToken
import com.sdds.plugin.core.token.Token
import com.sdds.plugin.core.token.TypographyToken
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
}
