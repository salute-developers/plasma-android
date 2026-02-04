package extensions.docs

import org.gradle.api.file.DirectoryProperty
import org.gradle.api.file.RegularFileProperty
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

abstract class DocusaurusExtension @Inject constructor(objects: ObjectFactory) {
    val components: RegularFileProperty = objects.fileProperty()
    val snippetsDir: DirectoryProperty = objects.directoryProperty()
}