package frege.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project

class FregeReleasePlugin implements Plugin<Project> {

    void apply(Project project) {
        // Workaround to build proper jars on Windows, see https://github.com/Frege/frege-gradle-plugin/issues/9
        System.setProperty("file.encoding", "UTF-8")

        project.apply(plugin: 'base')
        def e = (FregeReleasePluginExtension) project.extensions.create("fregeRelease", FregeReleasePluginExtension)


    }

}
