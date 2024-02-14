# ubuntu os 에서 다운로드 받기
FROM ubuntu

# ubuntu 위에서 다운로드 
# 웹서버 : apache vs nginx 
RUN apt-get update
RUN apt-get install -y nginx

WORKDIR /var/www/html
COPY ./webapp/index.html ./index.nginx-debian.html
ENTRYPOINT [ "nginx", "-g", "daemon off;" ]

