# Attempt to reproduce MSITE-640

Up until now the [bug](https://jira.codehaus.org/browse/MSITE-640) can *not* be reproduced with this testcase and maven 3.1.1
on linux x64, but can be reproduced with a confidential more complex project.

## Preparation

### settings.xml
Add the following to your ~/.m2/settings.xml under your profiles node:

    <profile>
      <id>msite-640_file-repo</id>
      <repositories>
        <repository>
          <releases>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
            <checksumPolicy>warn</checksumPolicy>
          </releases>
          <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
            <checksumPolicy>warn</checksumPolicy>
          </snapshots>
          <id>project</id>
          <name>msite-640-project-local-file</name>
          <url>file:///SOME_BASE_PATH/mvn-site_MSITE-640/repository</url>
          <layout>default</layout>
        </repository>
      </repositories>
    </profile>
    <profile>
      <id>msite-640_url-repo</id>
      <repositories>
        <repository>
          <releases>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
            <checksumPolicy>warn</checksumPolicy>
          </releases>
          <snapshots>
            <enabled>true</enabled>
            <updatePolicy>always</updatePolicy>
            <checksumPolicy>warn</checksumPolicy>
          </snapshots>
          <id>project</id>
          <name>msite-640-project-local-url</name>
          <url>http://localhost:8000/</url>
          <layout>default</layout>
        </repository>
      </repositories>
    </profile>

* If you want to experiment with the file based repo change `SOME_BASE_PATH`.
* If you want to experiment with the url  based repo start a HTTP server from the repository sub directory
    `python -m SimpleHTTPServer`.

## site generation
Delete files from local repository between tries:
`rm -r "$HOME/.m2/repository/com/github/sfleiter/sandbox/mvn-site_MSITE-640_parent"`

Start a site generation (here with url based repo):
`mvn -Pmsite-640_url-repo  clean site`
