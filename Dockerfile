## Используйте базовый образ Java
#FROM nocoolming/redhat-openjdk-18
#
## Установите рабочую директорию
#WORKDIR /app
#
## Скопируйте ваш JAR файл в образ
#COPY target/Popup3-1.0.jar app.jar
#
## Установите команду для запуска приложения
#CMD ["java", "-jar", "app.jar"]
# Используем образ с Java 18
# Используем образ с Java 18
# Используем образ с Java 18 на основе Debian
# Используем образ с Java 18 на основе Debian
FROM eclipse-temurin:18-jdk-jammy

# Устанавливаем обновления и необходимые пакеты
RUN apt-get update && \
    apt-get install -y wget gnupg2 unzip maven && \
    wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" > /etc/apt/sources.list.d/google-chrome.list && \
    apt-get update && \
    apt-get install -y google-chrome-stable

# Устанавливаем ChromeDriver


# Устанавливаем xvfb для запуска без дисплея
RUN apt-get install -y xvfb

# Устанавливаем директорию для приложения
WORKDIR /app

# Копируем файлы проекта
COPY . /app

# Устанавливаем зависимости и собираем проект
RUN #mvn clean package

# Команда для запуска тестов
ENTRYPOINT ["bash"]
#CMD ["xvfb-run", "-a", "java", "-jar", "target/Popup3.jar"]