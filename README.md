# Kotlin-bootsfaces-cdi
Simple Kotlin project using CDI (OWB) on backend and BootsFaces on frontend.

## Eclipse setup

* Gradle plugin
* JBossTools

#### JVM params:

    -XXaltjvm=dcevm -javaagent:/home/lada/workspace/libraries/hotswap-agent.jar=autoHotswap=true
 
#### file .settings/org.eclipse.wst.common.component
 <?xml version="1.0" encoding="UTF-8"?><project-modules id="moduleCoreId" project-version="1.5.0">
    <wb-module deploy-name="kotlin-bootsfaces-cdi">
        <wb-resource deploy-path="/" source-path="/src/main/webapp" tag="defaultRootSource"/>
        <wb-resource deploy-path="/WEB-INF/classes" source-path="/src/main/resources"/>
        <wb-resource deploy-path="/WEB-INF/classes" source-path="/build/classes/main"/>
        <property name="context-root" value="kotlin-bootsfaces-cdi"/>
    </wb-module>
</project-modules>

### Known issues:
If dcevm is used together with HotswapAgent (autoHotswap=true), then eclipse breakpoints must be reinstaled after redefinition.
