package extensions.docs

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

abstract class FixturesExtension @Inject constructor(objects: ObjectFactory) {
    val kotlinSnippetsDir: DirectoryProperty = objects.directoryProperty()
    val xmlSnippetsDir: DirectoryProperty = objects.directoryProperty()
    val metaFile: RegularFileProperty = objects.fileProperty()
}