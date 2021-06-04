# vvic-framework-archetype

1、 mvn clean install 
2、在repository目录添加 archetype-catalog.xml
<?xml version="1.0" encoding="UTF-8"?>
<archetype-catalog xsi:schemaLocation="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0 http://maven.apache.org/xsd/archetype-catalog-1.0.0.xsd"
    xmlns="http://maven.apache.org/plugins/maven-archetype-plugin/archetype-catalog/1.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
  <archetypes>
    <archetype>
      <groupId>com.vvic.framework</groupId>
      <artifactId>vvic-framework-archetype</artifactId>
      <version>1.0.0-SNAPSHOT</version>
      <description>vvic-framework-archetype</description>
    </archetype>
  </archetypes>
</archetype-catalog>

4、在目录下执行cmd命令：  mvn archetype:generate -DgroupId=com.vvic.data -DartifactId=data-strategy-service -DprojectName=strategy -Dport=8083
