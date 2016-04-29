# Grails3 REST API サンプル

##. Grails Install
 
https://grails.org/download.html から grails-3.1.6.zip をダウンロードして適当に展開、Path を通しておく。

##. 実行する

```
$ grails
grails> run-app
```

##. データを登録する

```
$ curl http://localhost:8080/greetings -X POST -d "message=Hello Grails3 World!"
```

##. データを取得する

###. XML で取得する

```
$ curl http://localhost:8080/greetings
```

###. JSON で取得する

```
$ curl http://localhost:8080/greetings.json
```


