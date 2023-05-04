# Kotlin + MyBatis サンプル

MyBatis を用いて、 Kotlin の data class に対して SQL で取得したデータをマッピングする挙動を確認するためのサンプルコード

[テストコード](src/test/kotlin/com/example/mybatisdemo/MybatisDemoApplicationTests.kt)として、普通の data class に対してマッピングが失敗する例や、 data class のプライマリコンストラクタの全ての引数にデフォルト値を設定した例、 No-arg plugin を利用した例を実装している