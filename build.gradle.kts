plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("javax.mail:mail:1.5.0-b01")
    implementation("org.springframework.boot:spring-boot-starter-log4j2:3.2.3")
    implementation("org.apache.poi:poi-ooxml:5.2.5")







}


tasks.test {
    useJUnitPlatform()
}