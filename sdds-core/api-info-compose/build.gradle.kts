import utils.addDefaultTargets

plugins {
    id("convention.kmp-lib")
}

group = "sdds-core"

android {
    namespace = "com.sdds.api.info.compose"
}

kotlin {
    addDefaultTargets()
}
