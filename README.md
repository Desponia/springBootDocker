# SpringBoot & Docker

### JDK
* openjdk 1.8
```cfml
brew tab AdoptOpenJDK/openjdk

brew cask install adoptopenjdk8
```
* jenv add
```cfml
jenv add /Library/Java/JavaVirtualMachines/adoptopenjdk-8.jdk/Contents/Home/
```
* set jdk8 in project
```cfml
jenv local 1.8.0.252
```
* add Jib plugin - build.gradle 
(Java 애플리케이션 용 도커 및 OCI 이미지를 작성하기 위한 Gradle 플러그인)
```groovy
id 'com.google.cloud.tools.jib' version '1.0.0'
```
