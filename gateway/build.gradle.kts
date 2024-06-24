plugins {

}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.1.4")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.1.2")
    //spring security
    implementation(project(":common"))
}
