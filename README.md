1 LoginPage
1.1 Авторизация с валидным логином и паролем.
1.2 Авторизация без логина но с паролем.
1.3 Авторизация без пароля но с логином.
1.4 Авторизация без ввода данных.
1.5 Авторизация под заблокированным пользователем.
1.6 Авторизация с невалиднымы данными

2 InventoryPage
2.1 Открытие меню сайта.
2.2 Кнопка AllItems в меню.
2.3 Кнопка Logout в меню.
2.4 Кнопка закрыть в меню.
2.5 Сортировка по названию товара.
2.6 Сортировка по цене товара.
2.7 Добавление товара в корзину.
2.8 Удаление товара из корзины
2.9 Добавление нескольких товаров в корзину.
2.10 Кнопка соц.сети Twitter
2.11 Кнопка соц.сети Facebook
2.12 Кнопка соц.сети LinkedIn
2.13 Кнопка корзины
2.14 Изменение индексации в корзине


3 CartPage
3.1 Удаление товара
3.2 Кнопка Продолжить покупки
3.3 Кнопка Chekout для оформления заказа.
3.4 Проверка соответствия названия товара в корзине 
3.5 Проверка соответствия стоимости товара в корзине
3.6 Изменение кол-ва товара в корзине
3.7 Кнопка меню на странице корзины

-------------------------------------------------------------

1 Запуск тестов используя mvn clean test команду и ее вывод:
mvn versions:use-latest-versions

[INFO] Updated org.testng:testng:jar:7.1.0 to version 7.4.0
[INFO] Updated org.seleniumhq.selenium:selenium-java:jar:3.141.59 to version 4.1.1
[INFO] Updated io.github.bonigarcia:webdrivermanager:jar:5.0.0 to version 5.0.3

2 Запуск тестов используя mvn clean test команду и ее вывод:
mvn clean test

[ERROR] Tests run: 10, Failures: 1, Errors: 0, Skipped: 0
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  58.834 s
[INFO] Finished at: 2021-12-24T00:11:37+03:00

3 Использовать параметры для запуска конкретных тестов и методов //TODO