import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeHotReload)
}

kotlin {
    jvm()

    sourceSets {
        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material3)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodelCompose)
            implementation(libs.androidx.lifecycle.runtimeCompose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
        jvmMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutinesSwing)
            implementation(libs.androidx.runtime.desktop)
        }
    }
}

compose.resources {
    publicResClass = true
    generateResClass = always
}

compose.desktop {
    application {
        mainClass = "org.ubu_improve.ui.MainKt"

        nativeDistributions {
            val iconsRoot = project.file("src/jvmMain/resources")
            println(iconsRoot)
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "ubu_improve"
            packageVersion = "1.0.0"
            linux {
                iconFile.set(File("src/jvmMain/resources/wurzelavatar.png"))
                println("ICON path ${project.file("appicon/appicon.icns")}")
            }
        }
    }
}
