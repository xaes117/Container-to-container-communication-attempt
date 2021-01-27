# Container-to-container-communication-attempt

# Prerequisites

1. Start database container

- docker pull mysql
- docker run --name mysql-server -e MYSQL_ROOT_PASSWORD=mysql_root_password -e MYSQL_DATABASE=mysql_database -e MYSQL_USER=mysql_user -e MYSQL_PASSWORD=mysql_password mysql
