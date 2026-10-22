plugins {
    id("org.javastro.build.module.quarkus-app")
}


dependencies() {
    implementation("io.quarkus:quarkus-hibernate-orm")
    implementation("io.quarkus:quarkus-jdbc-postgresql")
    implementation("org.javastro.ivoa.core.quarkus:quarkus-tap-lib:0.9.0")
    implementation("net.ivoa.dm:ExecutionDM:0.1-SNAPSHOT")
    implementation("org.javastro.ivoa.core:dal:0.1.0-SNAPSHOT")
}