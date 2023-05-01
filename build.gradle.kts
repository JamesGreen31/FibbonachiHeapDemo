import org.gradle.internal.impldep.org.eclipse.jgit.lib.ObjectChecker.type

plugins {
    id("java")
}

group = "org.ckplace.FibbonachiHeapDemo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
tasks {
    withType<Javadoc> {
        source = sourceSets["main"].allJava
        classpath += files(sourceSets["main"].output.classesDirs,
                configurations["compileClasspath"])
    }
}