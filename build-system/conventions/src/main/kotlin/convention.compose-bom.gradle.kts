import utils.withVersionCatalogs

withVersionCatalogs {
    dependencies {
        val composeBom = platform(base.androidX.compose.bom)
        add("implementation", composeBom)
        add("androidTestImplementation", composeBom)
    }
}
