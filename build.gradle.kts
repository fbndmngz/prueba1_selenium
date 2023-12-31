plugins {
    id("java")
}

group = "com.consorcio.curso.selenium"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:3.141.59")
    testImplementation("junit:junit:4.13.1")

}

tasks.test {
    useJUnitPlatform()
}