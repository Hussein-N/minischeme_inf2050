Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  config.vm.provision "shell", inline: <<-SHELL
    ## Installation de Java
    wget -qO - https://adoptopenjdk.jfrog.io/adoptopenjdk/api/gpg/key/public | sudo apt-key add -
    sudo add-apt-repository --yes https://adoptopenjdk.jfrog.io/adoptopenjdk/deb/
    apt-get -y install adoptopenjdk-11-hotspot
    echo 'export JAVA_HOME=/usr/lib/jvm/adoptopenjdk-11-hotspot-amd64' >> .bashrc
    ## Installation de Maven
    sudo wget -qP /opt http://mirror.its.dal.ca/apache/maven/maven-3/3.6.3/binaries/apache-maven-3.6.3-bin.tar.gz
    sudo tar xzf /opt/apache-maven-3.6.3-bin.tar.gz -C /opt
    echo 'export M2_HOME=/opt/apache-maven-3.6.3' >> .bashrc
    echo 'PATH=$PATH:$M2_HOME/bin' >> .bashrc
    SHELL
end
