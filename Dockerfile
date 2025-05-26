# Java 17 ベースイメージを使用
FROM eclipse-temurin:17

# 作業ディレクトリを作成
WORKDIR /app

# 必要なファイルをコピー
COPY . .

# mvnw に実行権限を与える
RUN chmod +x mvnw

# ビルド
RUN ./mvnw clean package

# アプリ起動
CMD ["java", "-jar", "target/quiz-0.0.1-SNAPSHOT.jar"]
