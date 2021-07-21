# Install Redis Server
sudo apt-get -y update
sudo apt-get -y upgrade
sudo apt-get install -y $1
sudo apt-get -y update --fix-missing
sudo apt-get install -y $1

# Update and then close
sudo apt-get -y update
sudo apt-get -y upgrade

if netstat -tulpen | grep 6379
then
exit 0
fi
