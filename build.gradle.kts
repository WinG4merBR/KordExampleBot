plugins {
    id("org.jetbrains.kotlin.jvm") version "1.5.10"
}

group "com.wing4merbr.kordbot"
version "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
    implementation("dev.kord:kord-core:0.8.0-M10")
    implementation("org.slf4j:slf4j-api:1.6.1")
    implementation("org.slf4j:slf4j-simple:1.6.1")
    implementation("io.github.cdimascio:dotenv-kotlin:6.2.2")
}

tasks.withType<Jar> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest {
        attributes["Main-Class"] = "com.wing4merbr.kordbot.BotClient"
    }

    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
}