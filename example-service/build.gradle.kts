plugins {

}

dependencies {
    //eureka
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.2")

    //db
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.postgresql:postgresql")

    //web
    implementation("org.springframework.boot:spring-boot-starter-web")
}