# Используем официальный образ с Java 17
FROM eclipse-temurin:17-jdk

# Устанавливаем необходимые зависимости для Chrome и других инструментов
RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    curl \
    xvfb \
    chromium \
    chromium-driver \
    fonts-liberation \
    && rm -rf /var/lib/apt/lists/*

# Устанавливаем Maven для сборки и управления проектом
RUN apt-get update && apt-get install -y maven && rm -rf /var/lib/apt/lists/*

# Настраиваем рабочую директорию
WORKDIR /app

# Копируем файлы проекта в контейнер
COPY . /app

# Устанавливаем переменные окружения для headless-режима
ENV DISPLAY=:99

# Компилируем и запускаем тесты через Maven   !********************docker run --memory=2g
CMD ["mvn", "clean", "test"]
