# Используем образ Selenium с Chrome
FROM selenium/standalone-chrome

# Переходим к пользователю root
USER root

# Устанавливаем рабочую директорию
WORKDIR /app

# Обновляем пакетный менеджер и устанавливаем необходимые пакеты
RUN apt-get update && \
    apt-get install -y maven xvfb wget unzip curl gnupg && \
    apt-get clean

# Копируем файлы проекта в контейнер
COPY pom.xml ./
# Сначала копируем pom.xml для кэширования зависимостей
COPY . .

# Устанавливаем права на выполнение для Maven Wrapper
RUN chmod +x mvnw

# Установка переменной окружной JAVA_HOME
ENV JAVA_HOME=/usr

# Собираем проект
RUN ./mvnw clean package

# Указываем команду по умолчанию
CMD ["tail", "-f", "/dev/null"]
