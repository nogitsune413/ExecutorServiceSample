# ExecutorServiceSample
JavaのExecutorServiceを使って、最大スレッド数を制限するサンプル

## ExecutorServiceとは何か
ExecutorServiceはJava標準の平行処理ライブラリ「java.util.concurrent」パッケージに含まれるインターフェースで、生のままでは使いにくいJavaのスレッドをラップし、使いやすくしてくれる。

## ■ ExecutorService
- 標準API
- Java1.5以上
- java.util.concurrentパッケージ

詳しくは[Java8 API仕様 ExecutorService](https://docs.oracle.com/javase/jp/8/docs/api/java/util/concurrent/ExecutorService.html)を参照。

## サンプルの内容
1. 最大スレッド数3でスレッドプールを作成する。
2. スレッドを10本作成し、スレッドプールを使って実行。
3. 3つのスレッドが使い回されている事を確認する。
