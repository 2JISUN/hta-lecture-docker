FROM mysql

COPY ./init.sql /docker-entrypoint-initdb.d

ENV MYSQL_ROOT_PASSWORD=root1234
ENV MYSQL_DATABASE=sys2
ENV MYSQL_USER=jisun
ENV MYSQL_PASSWORD=1234
ENV MYSQL_HOST=%