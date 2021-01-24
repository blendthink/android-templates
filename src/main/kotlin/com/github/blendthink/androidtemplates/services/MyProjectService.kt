package com.github.blendthink.androidtemplates.services

import com.github.blendthink.androidtemplates.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
