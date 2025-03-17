FROM openjdk:17-jdk-slim

ENV DEBIAN_FRONTEND=noninteractive
ENV JAVA_HOME=/usr/local/openjdk-17
ENV PATH="$JAVA_HOME/bin:$PATH"

#  зависимости для Google Chrome и работы с .deb файлами
RUN apt-get update && apt-get install -y --no-install-recommends \
    wget \
    curl\
    gnupg \
    unzip \
    ca-certificates \
    fonts-liberation \
    libappindicator3-1 \
    libasound2 \
    libatk-bridge2.0-0 \
    libcups2 \
    libgbm1 \
    libgtk-3-0 \
    libnspr4 \
    libnss3 \
    lsb-release \
    xdg-utils \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

ENV MAVEN_HOME=/opt/apache-maven-${MAVEN_VERSION}
ENV PATH="${MAVEN_HOME}/bin:${PATH}"

ARG MAVEN_VERSION=3.9.5
RUN curl -fsSL https://downloads.apache.org/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz | tar -xz -C /opt && \
    ln -s /opt/apache-maven-${MAVEN_VERSION}/bin/mvn /usr/bin/mvn

# Google Chrome
RUN wget -q -O /tmp/google-chrome.deb https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb && \
    apt-get update && apt-get install -y ./tmp/google-chrome.deb && \
    rm /tmp/google-chrome.deb

WORKDIR /app

COPY . /app/

