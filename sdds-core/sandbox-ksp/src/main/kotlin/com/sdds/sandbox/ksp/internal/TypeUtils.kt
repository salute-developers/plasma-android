package com.sdds.sandbox.ksp.internal

import com.google.devtools.ksp.symbol.ClassKind
import com.google.devtools.ksp.symbol.KSClassDeclaration
import com.google.devtools.ksp.symbol.KSPropertyDeclaration
import com.google.devtools.ksp.symbol.KSType

internal fun KSType.isUnit(): Boolean =
    declaration.qualifiedName?.asString() == "kotlin.Unit"

internal fun KSPropertyDeclaration.isCompanionObjectProperty(): Boolean {
    // редкий кейс, но на всякий
    return parentDeclaration is KSClassDeclaration &&
            (parentDeclaration as KSClassDeclaration).isCompanionObject
}

internal fun KSPropertyDeclaration.isIgnoredProperty(): Boolean {
    val name = simpleName.asString()
    return name == "appearance" || name == "variant"
}

internal fun KSType.isObject(): Boolean {
    val decl = declaration as? KSClassDeclaration ?: return false
    return decl.classKind == ClassKind.OBJECT
}

internal fun KSType.isEnum(): Boolean {
    val decl = declaration as? KSClassDeclaration ?: return false
    return decl.classKind == ClassKind.ENUM_CLASS
}