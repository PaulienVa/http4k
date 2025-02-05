import kotlin.String

/**
 * Generated by
 *    $ ./gradlew buildSrcLibs
 * Re-run when you add a new dependency to the build
 *
 * Find which updates are available by running
 *     $ ./gradlew refreshVersions
 * And edit the file `versions.properties`
 *
 * See https://github.com/jmfayard/refreshVersions
 */
object Libs {
    const val fc_java_core: String = "com.aliyun.fc.runtime:fc-java-core:_"

    const val aws_lambda_java_core: String = "com.amazonaws:aws-lambda-java-core:_"

    const val aws_lambda_java_events: String = "com.amazonaws:aws-lambda-java-events:_"

    const val klaxon: String = "com.beust:klaxon:_"

    const val graphql_kotlin_schema_generator: String =
            "com.expediagroup:graphql-kotlin-schema-generator:_"

    const val jackson_databind: String = "com.fasterxml.jackson.core:jackson-databind:_"

    const val jackson_dataformat_xml: String =
            "com.fasterxml.jackson.dataformat:jackson-dataformat-xml:_"

    const val jackson_dataformat_yaml: String =
            "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:_"

    const val jackson_module_kotlin: String = "com.fasterxml.jackson.module:jackson-module-kotlin:_"

    const val underscore: String = "com.github.javadev:underscore:_"

    const val shadow: String = "com.github.jengelman.gradle.plugins:shadow:_"

    const val handlebars: String = "com.github.jknack:handlebars:_"

    const val functions_framework_api: String =
            "com.google.cloud.functions:functions-framework-api:_"

    const val gson: String = "com.google.code.gson:gson:_"

    const val graphql_java: String = "com.graphql-java:graphql-java:_"

    const val okhttp_eventsource: String = "com.launchdarkly:okhttp-eventsource:_"

    const val com_microsoft_azure_azurefunctions_gradle_plugin: String =
            "com.microsoft.azure.azurefunctions:com.microsoft.azure.azurefunctions.gradle.plugin:_"

    const val azure_functions_java_library: String =
            "com.microsoft.azure.functions:azure-functions-java-library:_"

    const val hamkrest: String = "com.natpryce:hamkrest:_"

    const val ktlint: String = "com.pinterest:ktlint:_"

    const val moshi: String = "com.squareup.moshi:moshi:_"

    const val moshi_kotlin: String = "com.squareup.moshi:moshi-kotlin:_"

    const val okhttp: String = "com.squareup.okhttp3:okhttp:_"

    const val scf_java_events: String = "com.tencentcloudapi:scf-java-events:_"

    const val de_fayard_buildsrclibs_gradle_plugin: String =
            "de.fayard.buildSrcLibs:de.fayard.buildSrcLibs.gradle.plugin:_"

    const val jade4j: String = "de.neuland-bfi:jade4j:_"

    const val bunting4k: String = "dev.forkhandles:bunting4k:_"

    const val result4k: String = "dev.forkhandles:result4k:_"

    const val values4k: String = "dev.forkhandles:values4k:_"

    const val cloudevents_core: String = "io.cloudevents:cloudevents-core:_"

    const val cloudevents_json_jackson: String = "io.cloudevents:cloudevents-json-jackson:_"

    const val io_codearte_nexus_staging_gradle_plugin: String =
            "io.codearte.nexus-staging:io.codearte.nexus-staging.gradle.plugin:_"

    const val resilience4j_bulkhead: String = "io.github.resilience4j:resilience4j-bulkhead:_"

    const val resilience4j_circuitbreaker: String =
            "io.github.resilience4j:resilience4j-circuitbreaker:_"

    const val resilience4j_ratelimiter: String = "io.github.resilience4j:resilience4j-ratelimiter:_"

    const val resilience4j_retry: String = "io.github.resilience4j:resilience4j-retry:_"

    const val kotest_assertions_core_jvm: String = "io.kotest:kotest-assertions-core-jvm:_"

    const val ktor_server_cio: String = "io.ktor:ktor-server-cio:_"

    const val ktor_server_netty: String = "io.ktor:ktor-server-netty:_"

    const val micrometer_core: String = "io.micrometer:micrometer-core:_"

    const val netty_codec_http2: String = "io.netty:netty-codec-http2:_"

    const val opentelemetry_exporters_inmemory: String =
            "io.opentelemetry:opentelemetry-exporters-inmemory:_"

    const val opentelemetry_extension_aws: String = "io.opentelemetry:opentelemetry-extension-aws:_"

    const val opentelemetry_extension_trace_propagators: String =
            "io.opentelemetry:opentelemetry-extension-trace-propagators:_"

    const val opentelemetry_sdk: String = "io.opentelemetry:opentelemetry-sdk:_"

    const val opentelemetry_sdk_metrics: String = "io.opentelemetry:opentelemetry-sdk-metrics:_"

    const val pebble: String = "io.pebbletemplates:pebble:_"

    const val ratpack_core: String = "io.ratpack:ratpack-core:_"

    const val undertow_core: String = "io.undertow:undertow-core:_"

    const val undertow_servlet: String = "io.undertow:undertow-servlet:_"

    const val javax_servlet_api: String = "javax.servlet:javax.servlet-api:_"

    const val joda_time: String = "joda-time:joda-time:_"

    const val argo: String = "net.sourceforge.argo:argo:_"

    const val commons_pool2: String = "org.apache.commons:commons-pool2:_"

    const val httpclient5: String = "org.apache.httpcomponents.client5:httpclient5:_"

    const val httpcore5: String = "org.apache.httpcomponents.core5:httpcore5:_"

    const val httpasyncclient: String = "org.apache.httpcomponents:httpasyncclient:_"

    const val httpclient: String = "org.apache.httpcomponents:httpclient:_"

    const val httpcore: String = "org.apache.httpcomponents:httpcore:_"

    const val http2_server: String = "org.eclipse.jetty.http2:http2-server:_"

    const val websocket_core_server: String = "org.eclipse.jetty.websocket:websocket-core-server:_"

    const val jetty_alpn_conscrypt_server: String =
            "org.eclipse.jetty:jetty-alpn-conscrypt-server:_"

    const val jetty_client: String = "org.eclipse.jetty:jetty-client:_"

    const val jetty_server: String = "org.eclipse.jetty:jetty-server:_"

    const val jetty_servlet: String = "org.eclipse.jetty:jetty-servlet:_"

    const val freemarker: String = "org.freemarker:freemarker:_"

    const val java_websocket: String = "org.java-websocket:Java-WebSocket:_"

    const val kotlin_gradle_plugin: String = "org.jetbrains.kotlin:kotlin-gradle-plugin:_"

    const val kotlin_reflect: String = "org.jetbrains.kotlin:kotlin-reflect:_"

    const val kotlin_scripting_compiler_embeddable: String =
            "org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable:_"

    const val kotlin_serialization: String = "org.jetbrains.kotlin:kotlin-serialization:_"

    const val kotlin_serialization_unshaded: String =
            "org.jetbrains.kotlin:kotlin-serialization-unshaded:_"

    const val kotlin_stdlib_jdk8: String = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:_"

    const val kotlinx_serialization_json: String =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:_"

    const val ktlint_gradle: String = "org.jlleitschuh.gradle:ktlint-gradle:_"

    const val json: String = "org.json:json:_"

    const val jsoup: String = "org.jsoup:jsoup:_"

    const val junit_jupiter_api: String = "org.junit.jupiter:junit-jupiter-api:_"

    const val junit_jupiter_engine: String = "org.junit.jupiter:junit-jupiter-engine:_"

    const val alpn_boot: String = "org.mortbay.jetty.alpn:alpn-boot:_"

    const val openapi_generator_gradle_plugin: String =
            "org.openapitools:openapi-generator-gradle-plugin:_"

    const val selenium_api: String = "org.seleniumhq.selenium:selenium-api:_"

    const val slf4j_nop: String = "org.slf4j:slf4j-nop:_"

    const val thymeleaf: String = "org.thymeleaf:thymeleaf:_"

    const val swagger_ui: String = "org.webjars:swagger-ui:_"

    const val http_client_spi: String = "software.amazon.awssdk:http-client-spi:_"

    const val s3: String = "software.amazon.awssdk:s3:_"
}
