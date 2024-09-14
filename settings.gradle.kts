pluginManagement {
    val quarkusPluginVersion: String by settings
    val quarkusPluginId: String by settings
    repositories {
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
    plugins {
        id(quarkusPluginId) version quarkusPluginVersion
    }
}
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

include("mysub")
include("mysubjandex")
rootProject.name="quarkus-otel-jib"
