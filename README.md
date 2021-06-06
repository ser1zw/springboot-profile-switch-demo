# Spring Bootでプロファイルごとに実装を切り替えるサンプル

`@Profile` で実装クラスを切り替えるサンプルコード

[Spring Bootでプロファイルごとに実装を切り替える - ser1zw's blog](https://ser1zw.hatenablog.com/entry/2021/06/06/123537)


## 環境
- Spring Boot 2.5.0
- OpenJDK 16.0.1

## 実行

```cmd
$ mvn clean package
$ java -jar target/demo-0.0.1-SNAPSHOT.jar
$ curl localhost:8080/hello
```

起動時のオプションでプロファイルを切り替える場合は下記のようにする。

```cmd
$ java -jar target/demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=with-fixeddatetime
```

もしくは `application.properties` を編集する。

# 説明

インタフェース `DateTimeUtils` について、プロファイルごとに実装クラスを切り替える。

- プロファイルが `with-adjusteddatetime` の場合は、固定日時を返す `FixedDateTimeUtils` を使う
- プロファイルが `with-adjusteddatetime` の場合は、前日の日時を返す `AdjustedDateTimeUtils` を使う
- それ以外の場合は、本物のシステム日付を返す `SystemDateTimeUtils` を使う

各実装クラスに `@Profile` を指定することで切り替わるようにしている。
`@ConditionalOnExpression` で正規表現を使用することも可能。

# 参考
- [3. プロファイル | Spring Boot の機能 - リファレンスドキュメント](https://spring.pleiades.io/spring-boot/docs/current/reference/html/features.html#features.profiles)
- [4. Spring 式言語 (SpEL) | Spring Framework コアテクノロジー - リファレンス](https://spring.pleiades.io/spring-framework/docs/current/reference/html/core.html#expressions)
