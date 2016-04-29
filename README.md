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

##. License

           DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
                   Version 2, December 2004
 
Copyright (C) 2016 Norihito Ohshima

Everyone is permitted to copy and distribute verbatim or modified
copies of this license document, and changing it is allowed as long
as the name is changed.
 
           DO WHAT THE FUCK YOU WANT TO PUBLIC LICENSE
  TERMS AND CONDITIONS FOR COPYING, DISTRIBUTION AND MODIFICATION
 
 0. You just DO WHAT THE FUCK YOU WANT TO.
 
