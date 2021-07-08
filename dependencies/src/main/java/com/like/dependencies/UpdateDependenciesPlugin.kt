package com.like.dependencies

import org.gradle.api.Plugin
import org.gradle.api.Project
import kotlin.reflect.KClass

/**
 * 此插件的功能是添加所有的依赖。
 *
 * 然后就可以使用 id("name.remal.check-dependency-updates") version "1.4.0" 插件提供的任务：
 * app->Tasks->help->checkDependencyUpdates 来检查所有依赖的版本。
 */
class UpdateDependenciesPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        println("UpdateDependenciesPlugin apply start $project")
        addAllDependencies(project, AndroidX::class)
        addAllDependencies(project, Google::class)
        addAllDependencies(project, Kotlin::class)
        addAllDependencies(project, ThirdPart::class)
        addAllDependencies(project, Test::class)
        println("UpdateDependenciesPlugin apply end $project")
    }

    private fun addAllDependencies(project: Project, kClass: KClass<*>) {
        kClass.java.declaredFields.forEach {
            if (it.name != "version" && it.name != "INSTANCE") {
                it.isAccessible = true
                project.dependencies.add("implementation", it.get(null))
            }
        }
        kClass.nestedClasses.forEach {
            addAllDependencies(project, it)
        }
    }

}