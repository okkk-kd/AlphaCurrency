# Старт
Приложение принимает и обрабатывает запросы из API Exchange при помощи Feign
Сервис принимает на endpoint код валюты /currency/seeTheTruth/{code}, котрый сравнивает
по отношению к USD не поднялась ли цена по отношению к вчерашнему дню. Если поднялась
Возвращает gif rich если нет то break.

### Гайд по запуску
* Чтобы запустить сервис нужно запустить генерированный jar файл (Main-Class: ru.kritinidzin.alphacurrency.AlphaCurrencyApplication)

### HTTP Запросы на localhost
* http://localhost/currency/information - возвращает всю актульную информацию по валютам
* http://localhost/currency/getCode/{code} - возвращает цену валюты по её коду(актуальную цену)
* http://localhost/currency/getCodeHistorical/{code} - возвращает цену валюты днем ранее по её коду
* http://localhost/currency/seeTheTruth/{code} - сравнивает сегодняшнюю и прошлую цену и возвращает gif богатый, если стоимость больше чем вчера, в ином случае бедный

### application.yml конфиг
* Чтобы полноценно пользоваться приложением и не испытывать трудностей, рекомендуется изменить id на свой, потому что
* представленный может быть не активным.