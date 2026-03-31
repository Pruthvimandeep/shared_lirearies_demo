def gitStatus(branch){
  git branch: "${branch}", credentialsId: 'gitCred', url: 'https://github.com/Siddeshg672/hello_world_public_war.git'
  sh "mvn clean install"
  sh "cp -R webapp/target/webapp.war ."
}
def gitStatusLogin(branch,url){
  git branch: "${branch}", credentialsId: 'gitCred', url: "${url}"
  //sh "mvn clean install"
  //sh "cp -R webapp/target/webapp.war ."
}
def gitStatus1(branch,url){
  git branch: "${branch}", url: "${url}"
  sh "mvn clean install"
  sh "cp -R webapp/target/webapp.war ."
  sh "docker build -t appa:${BUILD_NUMBER} ."
  sh "docker images"
}
