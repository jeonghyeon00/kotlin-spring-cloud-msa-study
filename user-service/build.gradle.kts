plugins {
    kotlin("plugin.jpa") version "1.9.24"
}

allOpen {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
    annotation("jakarta.persistence.MappedSuperclass")
}

noArg {
    annotation("jakarta.persistence.Entity")
    annotation("jakarta.persistence.Embeddable")
    annotation("jakarta.persistence.MappedSuperclass")
}

dependencies {
    //eureka
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.2")

    //db
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")

    //web
    implementation("org.springframework.boot:spring-boot-starter-web")

    //redis
    implementation("org.springframework.boot:spring-boot-starter-data-redis")

    implementation(project(":common"))
}