ОБЩЕЕ ОПИСАНИЕ ИГРЫ "20 СПИЧЕК"

ПРАВИЛА ИГРЫ
В начале игры на столе лежит 20 спичек.
Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.
Проигравшим считается тот, кто возьмет со стола последнюю спичку.
Требования к программе
Программа должна позволять вам играть с компьютером.
Компьютер должен делать ход первым и всегда вас выигрывать (существует алгоритм выигрыша для игрока, делающего первый ход).
Кейсы, которые необходимо учесть:
•	Программа должна объявлять в консоли следующие события: 
o	Момент начала игры.
o	Оставшееся количество спичек после каждого хода.
o	Кто выполняет текущий ход.
o	Момент окончания игры и победителя.
•	При вводе в консоль недопустимого числа спичек для взятия со стола, должна выводиться ошибка и предложение повторного ввода.
Разработанный проект необходимо залить в отдельный репозиторий и предоставить ссылку на pull-request.
Рекомендации к проектированию программы
•	В ходе программы рекомендуется использовать стандартный поток вывода (консоль).
•	Считывать число можно методом nextInt() класса Scanner, передавая на вход поток System.in.
•	Учтите, что вам нужно хранить оставшееся количество спичек и игрока, который сейчас делает ход.
•	Правильно разбейте программу на классы и методы: 
o	Добавьте основной класс для логики контроля хода игры.
o	Добавьте класс для вывода сообщений в консоль.
o	Добавьте класс для логики компьютера.
Пример работы программы: https://java-online-course.github.io/course/materials/20_matches/img/out-example.png
